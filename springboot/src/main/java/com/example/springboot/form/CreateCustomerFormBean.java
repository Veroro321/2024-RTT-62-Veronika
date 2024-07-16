package com.example.springboot.form;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateCustomerFormBean {
    private String customerName;
    private String contactFirstname;
    private String contactLastname;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private Integer salesRepEmployeeId;
    private Double creditLimit;
}

