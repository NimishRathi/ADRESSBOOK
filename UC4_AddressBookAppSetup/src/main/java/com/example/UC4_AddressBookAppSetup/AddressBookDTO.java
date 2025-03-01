package com.example.UC4_AddressBookAppSetup;

public class AddressBookDTO {
    private String name;
    private String phone;
    private String email;
    private String address;
    public AddressBookDTO(String name, String phone, String email,String address) {
        this.name=name;
        this.phone= phone;
        this.email= email;
        this.address= address;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
