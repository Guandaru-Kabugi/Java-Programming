package restcontroller.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import restcontroller.model.Person;

import java.util.Arrays;

@RestController
public class RestApiController {

    //get requests
    //adding path variable
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        return "Hello, " + name + " first REST API";
    }
    @GetMapping("/status")
    public ResponseEntity<String> customResponse(){
        return new ResponseEntity<>("This is the response for status", HttpStatus.ACCEPTED);
    }
    @GetMapping("/person/{id}")
    public ResponseEntity<Person> personChosen(
            @PathVariable("id") Long id,
            @RequestParam(value = "includeEmail",defaultValue = "true") boolean includeEmail
    ){
        //include email if true, else null under email
        Person person = new Person("John Doe",
                28,
                includeEmail ? "john@gmail.com": null,true, Arrays.asList("Math","English","Kiswahili"));
        return new ResponseEntity<>(person, HttpStatus.ACCEPTED);
    }
    //request params
    @GetMapping("/meet")
    public String meet(@RequestParam(defaultValue = "Guest") String name){
        return "Hello, " + name + " I am happy to meet you. ";
    }
}
