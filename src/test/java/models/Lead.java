package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Lead {
    String first_name;
    String middle_name;
    String last_name;
    String suffix;
    String title;
    String email;
    String phone;
    String mobile;
    String website;
    String company;
    String No_of_Employees;
    String street;
    String city;
    String state_province;
    String zip_postal_code;
    String country;
    String dropdown_salutation;
    String dropdown_lead_status;
    String dropdown_rating;
    String dropdown_industry;
    String dropdown_lead_source;

}
