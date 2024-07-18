package com.example.springboot.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@ToString
public class CreateCustomerFormBean {

    @NotEmpty(message = "Customer Name is required.")
    @Length(max = 100, message = "Customer Name must be less than 100 characters.")
    private String customerName;

    @NotEmpty(message = "Contact Firstname is required.")
    @Length(max = 50, message = "Contact Firstname must be less than 50 characters.")
    private String contactFirstname;

    @NotEmpty(message = "Contact Lastname is required.")
    @Length(max = 50, message = "Contact Lastname must be less than 50 characters.")
    private String contactLastname;

    @NotEmpty(message = "Phone number is required.")
    @Pattern(regexp = "\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})", message = "Invalid phone number format.")
    private String phone;

    @NotEmpty(message = "Address Line 1 is required.")
    @Length(max = 100, message = "Address Line 1 must be less than 100 characters.")
    private String addressLine1;

    @Length(max = 100, message = "Address Line 2 must be less than 100 characters.")
    private String addressLine2;

    @NotEmpty(message = "City is required.")
    @Length(max = 50, message = "City must be less than 50 characters.")
    private String city;

    @NotEmpty(message = "State is required.")
    @Length(max = 50, message = "State must be less than 50 characters.")
    private String state;

    @NotEmpty(message = "Postal Code is required.")
    @Length(max = 20, message = "Postal Code must be less than 20 characters.")
    private String postalCode;

    @NotEmpty(message = "Country is required.")
    @Length(max = 50, message = "Country must be less than 50 characters.")
    private String country;

    @NotNull(message = "Sales Rep is required.")
    private Integer salesRepEmployeeId;

    @NotNull(message = "Credit Limit is required.")
    private Double creditLimit;
}
