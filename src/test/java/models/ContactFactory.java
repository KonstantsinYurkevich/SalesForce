package models;

import com.github.javafaker.Faker;

public class ContactFactory {
    public static Contact get() {
        Faker faker = new Faker();
        return Contact.builder()
                .first_name(faker.name().firstName())
                .middle_name(faker.funnyName().name())
                .last_name(faker.name().lastName())
                .suffix(faker.name().suffix())
                .accountName("Test")
                .title(faker.harryPotter().spell())
                .email(faker.internet().emailAddress())
                .phone(faker.phoneNumber().phoneNumber())
                .mobile(faker.phoneNumber().cellPhone())
                .department(faker.lordOfTheRings().character())
                .fax(faker.number().digit())
                .mailing_city(faker.address().city())
                .mailing_state_province(faker.address().state())
                .mailing_street(faker.address().streetAddress())
                .mailing_country(faker.address().country())
                .mailing_zip_postal_code(faker.address().zipCode())
                .dropdown_salutation("Prof.")
                .build();
    }
}
