package com.api.park_control.services;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.api.park_control.models.ParkingSpotModel;
import com.api.park_control.repoitories.ParkingSpotRepository;
import jakarta.transaction.Transactional;

@Service
public class ParkingSpotService {
    final ParkingSpotRepository parkingSpotRepository;
    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
    public boolean existsByLicensePlateCar(String licensePlateCar){
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }
    public boolean existsByParkSpotNumber(String parkSpotNumber){
        return parkingSpotRepository.existsByParkSpotNumber(parkSpotNumber);
    }
    public boolean existsByApartmentAndBlock(String apartament, String block){
        return parkingSpotRepository.existsByApartmentAndBlock(apartament, block);
    }
    public List<ParkingSpotModel> findAll() {
        return parkingSpotRepository.findAll();
    }
    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSpotRepository.findById(id);
    }
    @Transactional
    public void deleted(ParkingSpotModel parkingSpotModel) {
        parkingSpotRepository.delete(parkingSpotModel);
    }
}
