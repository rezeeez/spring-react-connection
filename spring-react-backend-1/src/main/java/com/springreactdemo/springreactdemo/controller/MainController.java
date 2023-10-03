package com.springreactdemo.springreactdemo.controller;

import com.springreactdemo.springreactdemo.model.Details;
import com.springreactdemo.springreactdemo.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/details")
@CrossOrigin(origins = "*") //to Connect into React JS
public class MainController {

    @Autowired
    private DetailsService detailsService;

    @PostMapping("/add")
    public String add(@RequestBody Details details){
        detailsService.saveDetails(details);

        return "New Details Added";
    }
    @GetMapping("/getAll") //names for function call
    public List<Details> getAllDetails(){
        return detailsService.getAllDetails();
    }

//    @GetMapping("")
//    public String page(){
//        return "Hello World";
//    }
}
