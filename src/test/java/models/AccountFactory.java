package models;

import com.github.javafaker.Faker;

public class AccountFactory {

    public static Account get() {
        Faker faker = new Faker();
        return Account.builder()
                .accountName(faker.name().name())
                .phone(faker.phoneNumber().phoneNumber())
                .website(faker.internet().domainName())
                .description(faker.howIMetYourMother().highFive())
                .employees(faker.random().nextInt(1, 100).toString())
                .billing_city(faker.address().city())
                .billing_street(faker.address().streetAddress())
                .billing_state_province(faker.address().state())
                .billing_zip_postal_code(faker.address().zipCode())
                .billing_country(faker.lordOfTheRings().location())
                .shipping_city(faker.address().city())
                .shipping_country(faker.lordOfTheRings().location())
                .shipping_state_province(faker.address().state())
                .shipping_street(faker.address().streetAddress())
                .shipping_zip_postal_code(faker.address().zipCode())
                .dropdown_industry("Banking")
                .dropdown_type("Customer")
                .build();
    }
}
