package com.parkingcontrol.parkingjavaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parkingcontrol.parkingjavaspring.model.Parking;

@Repository
public interface ParkingRepo extends JpaRepository<Parking, String> {
}
