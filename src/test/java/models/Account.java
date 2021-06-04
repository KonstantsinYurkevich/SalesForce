package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    String accountName;
    String phone;
    String website;
    String description;
    String employees;
    String billing_city;
    String billing_street;
    String billing_state_province;
    String billing_zip_postal_code;
    String billing_country;
    String shipping_street;
    String shipping_city;
    String shipping_state_province;
    String shipping_zip_postal_code;
    String shipping_country;
    String dropdown_type;
    String dropdown_industry;
}
