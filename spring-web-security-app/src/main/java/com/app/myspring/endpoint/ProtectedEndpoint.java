package com.app.myspring.endpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class ProtectedEndpoint {

    /*@GetMapping(value = "/ProtectedEndpoint")
    @ResponseBody
    public String accessProtectedPage(){
        return "Inside ProtectedEndpoint";
    }*/

    @GetMapping(value = "/ProtectedEndpoint")
    @ResponseBody
    public String accessProtectedPage(Principal principal){
        return "Hello,"+principal.getName()+"Inside ProtectedEndpoint";
    }
}
