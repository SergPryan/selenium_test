Получаем ид клиента и дату последнего анализа по ИНН - SELECT 'id', 'Date_endanaliz' FROM `client_magazin_jurnal` WHERE `inn` = '7727081781' ORDER BY 'Date_endanaliz' DESC LIMIT 1
получаем список критериев - SELECT * FROM `client_magazin_kritery` WHERE `idklient` = ид клиента
SELECT `namepunkt` FROM `slovars` WHERE `idpunkt` =107(постоянный) AND `kodslovar` = код критерия

Итоговые значения - список
Дата из первого запроса, описание критерия из словаря - третьего запроса