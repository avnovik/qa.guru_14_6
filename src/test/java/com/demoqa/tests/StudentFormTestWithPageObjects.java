package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StudentFormTestWithPageObjects {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1200x800";
    }

    @Test
    void fillFormTest() {
        registrationFormPage
                .openPage()
                .setFirstName("James")
                .setLastName("Bond")
                .setEmailInput("jb@007.gb")
                .setGender()
                .setMobileNumber("0123456789")
                .setBirthDay("21", "July", "2008")
                .setSubjects("A")
                .setSubjects("ar")
                .setHobbies("Music")
                .uploadPicture()
                .setAddress("Wellington Square, 25")
                .setState("ha")
                .setCity("k")
                .submitForm()
                .checkResultsTableVisible()
                .checkResultsTable("Address", "Wellington Square, 25")
                .checkResultsTableIsClose();
    }
}
