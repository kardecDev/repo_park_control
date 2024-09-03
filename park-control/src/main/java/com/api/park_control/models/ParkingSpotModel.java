package com.api.park_control.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Table(name="TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length=10)
    private String parkSpotNumber;
    @Column(nullable = false, unique = true, length=7)
    private String licensePlateCar;
    @Column(nullable = false, length=70)
    private String brandCar;
    @Column(nullable = false, length=70)
    private String modelCar;
    @Column(nullable = false, length=70)
    private String colorCar;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false,  length=130)
    private String responsableName;
    @Column(nullable = false,  length=4)
    private String apartment;
    @Column(nullable = false,  length=2)
    private String block;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getParkSpotNumber() {
        return parkSpotNumber;
    }
    public void setParkSpotNumber(String parkSpotNumber) {
        this.parkSpotNumber = parkSpotNumber;
    }
    public String getLicensePlateCar() {
        return licensePlateCar;
    }
    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }
    public String getBrandCar() {
        return brandCar;
    }
    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }
    public String getModelCar() {
        return modelCar;
    }
    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }
    public String getColorCar() {
        return colorCar;
    }
    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }
    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }
    public String getResponsableName() {
        return responsableName;
    }
    public void setResponsableName(String responsableName) {
        this.responsableName = responsableName;
    }
    public String getApartment() {
        return apartment;
    }
    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
    public String getBlock() {
        return block;
    }
    public void setBlock(String block) {
        this.block = block;
    }
    
}
