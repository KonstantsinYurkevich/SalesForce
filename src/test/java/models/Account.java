package models;

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
    String dropDownType;
    String dropDownIndustry;


    public Account(String accountName, String phone, String website, String description, String employees,
                   String billing_city, String billing_street, String billing_state_province,
                   String billing_zip_postal_code, String billing_country, String shipping_street, String shipping_city,
                   String shipping_state_province, String shipping_zip_postal_code, String shipping_country) {

        this.accountName = accountName;
        this.phone = phone;
        this.website = website;
        this.description = description;
        this.employees = employees;
        this.billing_city = billing_city;
        this.billing_street = billing_street;
        this.billing_state_province = billing_state_province;
        this.billing_zip_postal_code = billing_zip_postal_code;
        this.billing_country = billing_country;
        this.shipping_street = shipping_street;
        this.shipping_city = shipping_city;
        this.shipping_state_province = shipping_state_province;
        this.shipping_zip_postal_code = shipping_zip_postal_code;
        this.shipping_country = shipping_country;
    }

    public String getBilling_Street() {
        return billing_street;
    }

    public void setBilling_Street(String billing_street) {
        this.billing_street = billing_street;
    }

    public String getShipping_street() {
        return shipping_street;
    }

    public void setShipping_street(String shipping_street) {
        this.shipping_street = shipping_street;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getBilling_city() {
        return billing_city;
    }

    public void setBilling_city(String billing_city) {
        this.billing_city = billing_city;
    }

    public String getBilling_state_province() {
        return billing_state_province;
    }

    public void setBilling_state_province(String billing_state_province) {
        this.billing_state_province = billing_state_province;
    }

    public String getBilling_zip_postal_code() {
        return billing_zip_postal_code;
    }

    public void setBilling_zip_postal_code(String billing_zip_postal_code) {
        this.billing_zip_postal_code = billing_zip_postal_code;
    }

    public String getBilling_country() {
        return billing_country;
    }

    public void setBilling_country(String billing_country) {
        this.billing_country = billing_country;
    }

    public String getShipping_city() {
        return shipping_city;
    }

    public void setShipping_city(String shipping_city) {
        this.shipping_city = shipping_city;
    }

    public String getShipping_state_province() {
        return shipping_state_province;
    }

    public void setShipping_state_province(String shipping_state_province) {
        this.shipping_state_province = shipping_state_province;
    }

    public String getShipping_zip_postal_code() {
        return shipping_zip_postal_code;
    }

    public void setShipping_zip_postal_code(String shipping_zip_postal_code) {
        this.shipping_zip_postal_code = shipping_zip_postal_code;
    }

    public String getShipping_country() {
        return shipping_country;
    }

    public void setShipping_country(String shipping_country) {
        this.shipping_country = shipping_country;
    }
}
