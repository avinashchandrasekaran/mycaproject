package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springboot.model.Tourist;
import com.example.springboot.repo.TouristRepo;

@Service
public class TouristService {
	@Autowired
	private TouristRepo repo;
	
	public Tourist saveTourist(Tourist tourist) {
		return repo.save(tourist);
	}
	
	public List<Tourist>getall(){
		return repo.findAll(Sort.by(Sort.Direction.DESC,"firstName"));
	}

}
