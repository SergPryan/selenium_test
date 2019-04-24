package testCase.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class MainPage extends Page {

    private final By topSelect = By.className("workspace-top-select-text");

    private final By btnPrimary = By.className("btn-primary");

    private final By btnTopSelect = By.className("workspace-top-select-button");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void select() {
        driver.findElement(btnTopSelect).click();

        driver.findElements(By.className("workspace-top-select-item")).stream().filter(e->e.getText().equalsIgnoreCase("Поиск клиента")).findFirst().get().click();
        driver.findElements(By.className("btn-primary")).stream().filter(e->e.getText().equalsIgnoreCase("Создать клиента")).findFirst().get().click();

//        WebElement element = driver.findElement(topSelect);
//        if (element.getText().equalsIgnoreCase("Поиск клиента")) {
//            element.click();
//        }
//        List<WebElement> listBtnPrimary = driver.findElements(btnPrimary);
//        listBtnPrimary.forEach(e -> {
//            System.out.println(e.getText());
//            if (e.getText().equalsIgnoreCase("Создать клиента")) {
//                e.click();
//            }
//        });

    }

    public void selectModal() {
        closeModalErro();
        WebElement modal =  driver.findElements(By.className("modal-dialog")).get(0);
        modal.findElement(By.name("P_CLIENT.SEX.CODE")).sendKeys("М");
        closeModalErro();
        modal.findElement(By.name("P_CLIENT.INN")).sendKeys("111111111111");
        closeModalErro();
        modal.findElement(By.name("P_CLIENT.DATE_PERS")).sendKeys("01011988");
        closeModalErro();
        modal.findElement(By.name("P_CLIENT.CODE_BKI")).sendKeys("2222222");
        closeModalErro();
        modal.findElement(By.name("P_CLIENT.COUNTRY.VALUE")).sendKeys("РОССИЯ");
        closeModalErro();
        modal.findElement(By.name("P_CLIENT.MARIGE_STATUS.VALUE")).sendKeys("Холост");
        closeModalErro();
        modal.findElement(By.name("P_CLIENT.BORN.NAME")).sendKeys("Кемерово");
        closeModalErro();
        modal.findElement(By.name("P_CLIENT.BORN_STR")).sendKeys("Кемерово");

    }

    public void closeModalErro(){
        List<WebElement> listModal = driver.findElements(By.className("modal-dialog"));
        listModal.forEach(e -> {
            if (e.findElement(By.className("modal-title")).getText().equalsIgnoreCase("Ошибка валидации")){
                e.findElement(By.className("btn-primary")).click();
            }
        });
    }
}
