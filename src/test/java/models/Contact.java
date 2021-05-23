package models;

public class Contact {
    String first_name;
    String middle_name;
    String last_name;
    String suffix;
    //String accountName;
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


    public Contact(String first_name, String middle_name, String last_name, String suffix/*String accountName*/,
                   String title, String email, String phone, String mobile,
                   String department, String fax, String mailing_street,
                   String mailing_city, String mailing_state_province, String mailing_zip_postal_code,
                   String mailing_country, String dropdown_salutation) {

        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.suffix = suffix;
        //this.accountName = accountName;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.department = department;
        this.fax = fax;
        this.mailing_street = mailing_street;
        this.mailing_city = mailing_city;
        this.mailing_state_province = mailing_state_province;
        this.mailing_zip_postal_code = mailing_zip_postal_code;
        this.mailing_country = mailing_country;
        this.dropdown_salutation = dropdown_salutation;
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

    /* public String getAccountName() {
         return accountName;
     }

     public void setAccountName(String accountName) {
         this.accountName = accountName;
     }
 */
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMailing_street() {
        return mailing_street;
    }

    public void setMailing_street(String mailing_street) {
        this.mailing_street = mailing_street;
    }

    public String getMailing_city() {
        return mailing_city;
    }

    public void setMailing_city(String mailing_city) {
        this.mailing_city = mailing_city;
    }

    public String getMailing_state_province() {
        return mailing_state_province;
    }

    public void setMailing_state_province(String mailing_state_province) {
        this.mailing_state_province = mailing_state_province;
    }

    public String getMailing_zip_postal_code() {
        return mailing_zip_postal_code;
    }

    public void setMailing_zip_postal_code(String mailing_zip_postal_code) {
        this.mailing_zip_postal_code = mailing_zip_postal_code;
    }

    public String getMailing_country() {
        return mailing_country;
    }

    public void setMailing_country(String mailing_country) {
        this.mailing_country = mailing_country;
    }

    public String getDropdown_salutation() {
        return dropdown_salutation;
    }

    public void setDropdown_salutation(String dropdown_salutation) {
        this.dropdown_salutation = dropdown_salutation;
    }
}
