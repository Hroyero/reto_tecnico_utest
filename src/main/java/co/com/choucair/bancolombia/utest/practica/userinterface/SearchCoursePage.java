package co.com.choucair.bancolombia.utest.practica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_COURSE = Target.the("Button Academy search course").located(By.xpath("//body/ui-view[1]/nav-sidebar[1]/div[1]/nav[1]/div[3]/nav-sidebar-item[2]/div[1]/a[1]/div[2]"));
    public static final Target BUTTON_TAKE_COURSE = Target.the("Button for take course Introduction to Utest").located(By.xpath("//body[1]/ui-view[1]/div[1]/div[1]/div[1]/ui-view[1]/academy-home[1]/main[1]/div[1]/div[2]/div[1]/div[1]/course-track-card[1]/div[1]/div[4]/a[1]"));
    public static final Target NAME_COURSE = Target.the("Name course").located(By.xpath("//body[1]/ui-view[1]/div[1]/div[1]/div[1]/ui-view[1]/academy-course[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h1[1]"));
}

