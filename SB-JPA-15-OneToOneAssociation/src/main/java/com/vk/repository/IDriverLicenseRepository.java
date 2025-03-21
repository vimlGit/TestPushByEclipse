package com.vk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vk.entity.DriverLicense;

public interface IDriverLicenseRepository extends JpaRepository<DriverLicense, Integer> {

}
