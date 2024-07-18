package com.example.springboot.form;
//form bean

import jakarta.validation.constraints.NotEmpty;// not empty comes from here
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@ToString

public class CreateEmployeeFormBean {

    @Length(max = 100, message = "Email must be less than 100 characters")
    @NotEmpty(message="Email is required.")
    private String email;

    @Pattern(regexp="[a-zA-Z]+", message = "Firstname must have characters only.")
    @Length(max = 50, message = "Firstname must be less than 50 characters")
    @NotEmpty(message = "Firstname is required.")
    private String firstName;

    @Length(max = 50, message = "Lastname must be less than 50 characters")
    @NotEmpty(message = "Lastname is required.")
    private String lastName;

    //we are going to make this data type an integer
    private Integer reportsTo;
    // this is for the officeId
    private Integer officeId;
    private String extension;
    private String jobTitle;
    private String profileImageUrl;
    private Integer vacationHours;

}
