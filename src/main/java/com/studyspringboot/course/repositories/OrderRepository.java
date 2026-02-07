package com.studyspringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyspringboot.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
