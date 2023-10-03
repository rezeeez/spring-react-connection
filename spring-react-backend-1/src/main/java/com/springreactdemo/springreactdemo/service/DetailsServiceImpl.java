package com.springreactdemo.springreactdemo.service;

import com.springreactdemo.springreactdemo.repository.DetailsRepository;
import com.springreactdemo.springreactdemo.model.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsServiceImpl implements DetailsService{
    //all the methods that will be used by StudentServiceImpl
    @Autowired
    private DetailsRepository detailsRepository; //injects dependency into studentRepo
    @Override
    public Details saveDetails(Details details){ //method from the StudentService
        return detailsRepository.save(details); //call the instance and save ito student table
    }
    @Override
    public List<Details> getAllDetails(){
        return detailsRepository.findAll();
    }


}
