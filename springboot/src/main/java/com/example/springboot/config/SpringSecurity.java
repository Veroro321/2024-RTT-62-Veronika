package com.example.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurity {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // boiler plate code to protect a common hack
        http.csrf(csrf -> csrf.disable());

        // this section says allow all pages EXCEPT the ones that are in the AntPathRequestMatcher
        // anything in AntPathRequestMatcher will require the user to be authenticated
        //people that are not logged in and can see any public page resource
        // users that are logged but do not have any user roles to grant access to a resources
        //users that are logged in and have a user role that grans access to a resource
        http.authorizeRequests()
                .requestMatchers(
                        new AntPathRequestMatcher("/admin/**"),
                        new AntPathRequestMatcher("/employee/**")).authenticated()
                .anyRequest().permitAll(); //all url are permited except the ones listed here


        // the loginPage parameter is the actual URL of the login page
        // the loginProcessingUrl is the URL that the form will submit to
        http.formLogin(formLogin -> formLogin
                // this a controller method URL for displaying the login page
                //we built this controller method, however this is just he URL in the browser for the login page
                .loginPage("/account/loginPageUrl")

                // this URL is part of spring security and we do not need to implement it in our controller
                // we just need to make the form action submit to this URL

                //this does not exist in our controller methods
                // 3 things need to be done on the login.jsp
                // 1) action needs to be set to /account/loginProcessingURL
                // 2) input field for username needs to be named "username"
                // 3) input field for password needs to be named "password"
                .loginProcessingUrl("/account/loginProcessingURL")); //where its going to submit too
        // this is the URL that will log a user out
        http.logout(formLogout -> formLogout
                //this is the url that will log a user out
                .invalidateHttpSession(true) //destroy session, after person logs out
                .logoutUrl("/login/logout") //browser to log the browers out, can be anything,
                .logoutSuccessUrl("/")); //where it's going to send the user too, goodbye, thank you page, or home page

        return http.build();
    }

    @Bean(name = "passwordEncoder") //in our user service, enable to autowordder, encode before saving into the database
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

}
