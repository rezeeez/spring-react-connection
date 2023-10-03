package com.springreactdemo.springreactdemo.repository;

import com.springreactdemo.springreactdemo.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<Details, Integer> {
}
