package models;

import com.github.javafaker.Faker;

public class LeadFactory {
    public static Lead get() {
        Faker faker = new Faker();
        return Lead.builder()
                .first_name(faker.name().firstName())
                .middle_name(faker.funnyName().name())
                .last_name(faker.name().lastName())
                .suffix(faker.name().suffix())
                .title(faker.harryPotter().spell())
                .email(faker.internet().emailAddress())
                .phone(faker.phoneNumber().phoneNumber())
                .mobile(faker.phoneNumber().cellPhone())
                .website(faker.internet().domainName())
                .company(faker.company().name())
                .No_of_Employees(faker.random().nextInt(1, 100).toString())
                .city(faker.address().city())
                .state_province(faker.address().state())
                .street(faker.address().streetAddress())
                .country(faker.address().country())
                .zip_postal_code(faker.address().zipCode())
                .dropdown_industry("Agriculture")
                .dropdown_lead_source("Advertisement")
                .dropdown_rating("Hot")
                .dropdown_salutation("Mr.")
                .dropdown_lead_status("Unqualified")
                .build();
    }
}
