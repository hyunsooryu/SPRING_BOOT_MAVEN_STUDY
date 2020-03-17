package com.example.demo.controller;
//import com.example.demo.model.SearchParam;
//import com.example.demo.model.entity.User;
//import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import sun.tools.java.Parser;
import java.util.Optional;

@RestController
@RequestMapping("/api")// localhost:8080/api 까지맵핑이 되었습니다.
public class GetController {
    /*
    @Autowired
    private UserRepository userRepository;
    */
    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getRequest(){
        return "HI, getMethod";
    }

}
