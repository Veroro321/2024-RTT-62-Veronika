package com.example.springboot.controller;

import com.example.springboot.database.dao.EmployeeDAO;
import com.example.springboot.database.dao.ProductDAO;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Product;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;


@Slf4j
@Controller
public class IndexController {

    @Autowired
    private ProductDAO productDao; //this is so that we can actually use the productdao

    @Autowired
    private EmployeeDAO employeeDAO;


    // this function is for the home page of the website which is express as just a plain slash "/"
    @GetMapping("/")
    public ModelAndView index(@RequestParam(required = false) Integer id) { //the required param is where we put the url id
        // required is to that the id we put in url will be optional
        // by default, the @RequestParam is required, meaning if it is missing in the URL spring will send you to the error page
        // if the id parameter is not present on the URL then the incoming id will be null
        ModelAndView response = new ModelAndView("index");

        Product product = productDao.findById(id);//this is the query that will take in the id
        response.addObject("productKey", product);

        // by default the logging level is set to info so the debug message will not be printed in the terminal
        log.debug("Debug level");
        log.info("Info level");
        log.warn("Warn level");
        log.error("Error level");

        // NEVER EVER use System.out.println in a spring application
        //System.out.println("This is forbidden at all times");

        response.addObject("message", "Hello World!");

        return response;
    }

    @GetMapping("/index/{id}")
    public ModelAndView indexPathVar(@PathVariable(name = "id") Integer productId) {
        // by default, the @PathVariable is required, meaning if it is missing in the URL spring will send you to the error page
        // by using the name attribute in the @PathVariable annotation, you can change the name of the variable
        // so in this case it is mapping the id in the URL to the productId variable
        ModelAndView response = new ModelAndView("index");

        Product product = productDao.findById(productId);
        response.addObject("productKey", product);

        response.addObject("message", "Hello World!");

        return response;
    }


    @GetMapping("/page-url")
    public ModelAndView canBeAnyFunctionNameYouWant() {
        // this page is for another page of the website which is express as "/page-url"
        ModelAndView response = new ModelAndView("another-page");

        return response;
    }


    @GetMapping("/search")
    public ModelAndView search(@RequestParam(required = false) String search) {
        // this page is for another page of the website which is express as "/page-url"
        ModelAndView response = new ModelAndView("search");

        log.debug("The user searched for the term: " + search);

        // I am going to add the user input back to the model, so that
        // we can display the search term in the input field
        response.addObject("search", search);


        List<Product> products = productDao.findByNameOrCode(search);
        response.addObject("products", products);

        return response;
    }

    @GetMapping("/file-upload") //not post because it just shows the page
    public ModelAndView fileUpload(@RequestParam Integer employeeId) {
        //this page is for another page of the website which is expressed as "/page-url"
        ModelAndView response = new ModelAndView("file-upload");
        response.addObject("employeeId", employeeId);

        return response;
    }

    @PostMapping("/file-upload")
    public ModelAndView fileUploadSubmit(@RequestParam MultipartFile file, @RequestParam Integer employeeId) {
        // this page is for another page of the website which is express as "/page-url"
        ModelAndView modelAndView = new ModelAndView("redirect:/employee/detail?employeeId=" + employeeId);

        log.debug("The file name is: " + file.getOriginalFilename());
        log.debug("The file size is: " + file.getSize());
        log.debug("The file content type is: " + file.getContentType());

        //homework
        //use the original file name and get a substring of the last index
        // then restrict based on jpg or png
        // use the model to put an error message on the page

        //location on hard drve

        String saveFilename = "./src/main/webapp/pub/images/" + file.getOriginalFilename();

        // this files.copy is a utility that will read the stream one chunk at a time and write it to a file.
        // this would not compile, getinput stream gets pissed, Files.copy(file.getInputStream(), Paths.get(saveFilename)), StandardCopyOption.REPLACE_EXISTING);
//first argument is the input stream coming from the file, second is the file that we want to save it too, the third if the thing exists please replace it
        //first argument is the input stream to read from the uploaded file
        //2nd is the file name where we want to write the file
        //3rd says to overwrite if existing.

        try{
            Files.copy(file.getInputStream(), Paths.get(saveFilename), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e){
            log.error("unable to finish reading file", e);
        }

        // we can load the record from the database based on the incoming employeeId
        Employee employee = employeeDAO.findById(employeeId);

        // this is the URL to get the image
        String url = "/pub/images/" + file.getOriginalFilename();
        employee.setProfileImageUrl(url);

        employeeDAO.save(employee);

        return modelAndView;
    }




}