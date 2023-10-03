package com.springreactdemo.springreactdemo.service;

import com.springreactdemo.springreactdemo.model.Details;

import java.util.List;

public interface DetailsService  {
    Details saveDetails(Details details);

    List<Details> getAllDetails(); //get all details
}
