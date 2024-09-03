package com.api.park_control.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ParkinSpotRecordDto(
    
    @NotBlank String parkSpotNumber,
    @NotBlank @Size(max=7) String licensePlateCar,
    @NotBlank String brandCar,
    @NotBlank String modelCar,
    @NotBlank String colorCar,
    @NotBlank String responsableName
    
) {

}
