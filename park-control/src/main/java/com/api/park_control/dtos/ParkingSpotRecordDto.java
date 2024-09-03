package com.api.park_control.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ParkingSpotRecordDto(
    
    @NotBlank String parkSpotNumber,
    @NotBlank @Size(max=7) String licensePlateCar,
    @NotBlank String brandCar,
    @NotBlank String modelCar,
    @NotBlank String colorCar,
    @NotBlank String responsableName,
    @NotBlank @Size(max=4) String apartment,
    @NotBlank @Size(max=2) String block
    
) {


}
