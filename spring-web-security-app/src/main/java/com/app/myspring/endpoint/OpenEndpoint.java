package com.app.myspring.endpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class OpenEndpoint {

    @GetMapping(value = "/OpenEndpoint")
    @ResponseBody
    public String accessProtectedPage(){
        return "Inside OpenEndpoint";
    }

    /*@GetMapping(value = "/OpenEndpoint")
    @ResponseBody
    public String accessProtectedPage(Principal principal){
        return "Inside OpenEndpoint"+principal.getName();
    }
    */

}
