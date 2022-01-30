package com.example.demo.repository;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

import model.Weapon;

@Repository
public interface WeaponRepository extends CrudRepository<Weapon, Integer> {
	
}