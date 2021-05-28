package models;

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

    public Lead(String first_name, String middle_name, String last_name, String suffix, String title, String email,
                String phone, String mobile, String website, String company, String no_of_Employees, String street,
                String city, String state_province, String zip_postal_code, String country, String dropdown_salutation,
                String dropdown_lead_status, String dropdown_rating, String dropdown_industry, String dropdown_lead_source) {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.suffix = suffix;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.website = website;
        this.company = company;
        this.No_of_Employees = no_of_Employees;
        this.street = street;
        this.city = city;
        this.state_province = state_province;
        this.zip_postal_code = zip_postal_code;
        this.country = country;
        this.dropdown_salutation = dropdown_salutation;
        this.dropdown_lead_status = dropdown_lead_status;
        this.dropdown_rating = dropdown_rating;
        this.dropdown_industry = dropdown_industry;
        this.dropdown_lead_source = dropdown_lead_source;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNo_of_Employees() {
        return No_of_Employees;
    }

    public void setNo_of_Employees(String no_of_Employees) {
        No_of_Employees = no_of_Employees;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public String getZip_postal_code() {
        return zip_postal_code;
    }

    public void setZip_postal_code(String zip_postal_code) {
        this.zip_postal_code = zip_postal_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDropdown_salutation() {
        return dropdown_salutation;
    }

    public void setDropdown_salutation(String dropdown_salutation) {
        this.dropdown_salutation = dropdown_salutation;
    }

    public String getDropdown_lead_status() {
        return dropdown_lead_status;
    }

    public void setDropdown_status(String dropdown_status) {
        this.dropdown_lead_status = dropdown_lead_status;
    }

    public String getDropdown_rating() {
        return dropdown_rating;
    }

    public void setDropdown_rating(String dropdown_rating) {
        this.dropdown_rating = dropdown_rating;
    }

    public String getDropdown_industry() {
        return dropdown_industry;
    }

    public void setDropdown_industry(String dropdown_industry) {
        this.dropdown_industry = dropdown_industry;
    }

    public String getDropdown_lead_source() {
        return dropdown_lead_source;
    }

    public void setDropdown_lead_source(String dropdown_lead_source) {
        this.dropdown_lead_source = dropdown_lead_source;
    }
}
