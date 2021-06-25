package co.com.choucair.bancolombia.utest.practica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFillOutDevices {
    public static final Target CLICK_CLOSE_AUTODETECTED = Target.the("close list autocompleted").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/a[1]/i[1]"));
    public static final Target INPUT_LIST_COMPUTE = Target.the("list of your cumputer").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target SELECT_COMPUTER = Target.the("selected windows from the list").located(By.xpath("//div[contains(text(),'Windows')]"));
    public static final Target INPUT_LIST_VERSION = Target.the("list of your version").located(By.xpath("//span[contains(text(),'Select a Version')]"));
    public static final Target SELECT_VERSION= Target.the("selected 10 from the list").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[19]/span[1]/div[1]"));
    public static final Target INPUT_LIST_LANGUAGE = Target.the("list of your language").located(By.xpath("//span[contains(text(),'Select OS language')]"));
    public static final Target SELECT_LANGUAGE = Target.the("selected spanish from the list").located(By.xpath("//div[contains(text(),'Spanish')]"));
    public static final Target BUTTON_NEXT_LAST_SETUP= Target.the("button next last setup").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));
}
