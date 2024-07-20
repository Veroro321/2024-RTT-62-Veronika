package com.example.springboot.form;
//form bean

import com.example.springboot.validation.EmployeeEmailUnique;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;// not empty comes from here
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@ToString

public class CreateEmployeeFormBean {

    // when the user exists in the database this value will be populated with the id of the database field
    // this field is only set when the user called the /employee/edit URL and gives a valid employee id
    // if this field is null, then it is a create
    private Integer employeeId;

    @Length(max = 100, message = "Email must be less than 100 characters")
    @NotEmpty(message="Email is required.")
    @Email(message = "This must be a valid email")
    @EmployeeEmailUnique(message = "This email is already in use")
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

    @Pattern(regexp = "[0-9]+", message = "Extension must have numbers only.")
    @Length(max = 10, message = "Extension must be less than 10 characters")
    private String extension;


    @NotEmpty(message = "Job title is required.")
    @Length(max = 50, message = "Job title must be less than 50 characters")
    private String jobTitle;

    @Length(max = 255, message = "Profile image URL must be less than 255 characters")
    private String profileImageUrl;

    @NotNull(message = "Vacation hours are required.")
    private Integer vacationHours;

}
