package com.api.park_control.repoitories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.park_control.models.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{
    public boolean existsByLicensePlateCar(String licensePlanteCar);
    public boolean existsByParkSpotNumber(String parkSpotNumber);
    public boolean existsByApartmentAndBlock(String apartament, String block);
}
