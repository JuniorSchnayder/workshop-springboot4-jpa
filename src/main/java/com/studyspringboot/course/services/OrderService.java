package com.studyspringboot.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studyspringboot.course.entities.Order;
import com.studyspringboot.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		List <Order> listOrder = repository.findAll();
		return listOrder;
	}
	
	public Order findById(Long id){
		Optional <Order> obj = repository.findById(id);
		return obj.get();
	}
}
