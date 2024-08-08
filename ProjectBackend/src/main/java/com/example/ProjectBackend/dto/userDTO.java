package com.example.ProjectBackend.dto;


public class userDTO {

    private int userId;
    private String firstName;
    private String lastName;
    private long NIC;
    private String email;
    private String address;
    private String contactNo;
    private String password;
    private String gender;

    public userDTO(int userId, String firstName, String lastName, long NIC, String email, String address, String contactNo, String password, String gender) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.NIC = NIC;
        this.email = email;
        this.address = address;
        this.contactNo = contactNo;
        this.password = password;
        this.gender = gender;
    }

    public userDTO() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getNIC() {
        return NIC;
    }

    public void setNIC(long NIC) {
        this.NIC = NIC;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "userDTO{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", NIC='" + NIC + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


}
