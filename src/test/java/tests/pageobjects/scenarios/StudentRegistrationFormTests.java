package tests.pageobjects.scenarios;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StudentRegistrationFormTests {
    StudentRegistrationPage studentRegistrationPage = new StudentRegistrationPage(); //объявление и инициализация

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void successfulFillFormTest() {
        studentRegistrationPage.openPage(); //arrange
        studentRegistrationPage.fillForm(); //acts
        studentRegistrationPage.checkData(); //assert
    }
}
