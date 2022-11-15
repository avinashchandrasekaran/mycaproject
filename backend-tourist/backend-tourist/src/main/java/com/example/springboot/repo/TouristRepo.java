package com.example.springboot.repo;

import org.springframework.stereotype.Repository;

import com.example.springboot.model.Tourist;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TouristRepo extends JpaRepository<Tourist,Integer> {

}
