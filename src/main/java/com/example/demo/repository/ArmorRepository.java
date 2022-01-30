package com.example.demo.repository;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

import model.Armor;

@Repository
public interface ArmorRepository extends CrudRepository<Armor, Integer> {
	
}