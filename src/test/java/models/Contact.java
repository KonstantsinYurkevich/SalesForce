package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contact {
    String first_name;
    String middle_name;
    String last_name;
    String suffix;
    String title;
    String email;
    String phone;
    String mobile;
    String department;
    String fax;
    String mailing_street;
    String mailing_city;
    String mailing_state_province;
    String mailing_zip_postal_code;
    String mailing_country;
    String dropdown_salutation;
}
