package testCase.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends Page {

    private final By topSelect =By.className("workspace-top-select-text");

    private final By btnPrimary = By.className("btn-primary");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void select(){
        WebElement element = driver.findElement(topSelect);
        if( element.getText().equalsIgnoreCase("Поиск клиента")){
            element.click();
        }
        List<WebElement> listBtnPrimary = driver.findElements(btnPrimary);
        listBtnPrimary.forEach(e->{
            if(e.getText().equalsIgnoreCase("Создать клиента")){
                e.click();
            }
        });
        List<WebElement> listModal = driver.findElements(By.className("modal-content"));
        listModal.forEach(e->{
            System.out.println(e.getText());
        });
    }
}
