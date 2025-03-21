package com.vk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vk.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

}
