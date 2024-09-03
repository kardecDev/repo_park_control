package com.api.park_control.services;

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

}
