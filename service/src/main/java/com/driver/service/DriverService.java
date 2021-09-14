package com.driver.service;

import java.util.List;

import com.driver.model.DriverRequest;
import com.driver.model.DriverResponse;

import sharedEntity.Driver;


public interface DriverService {

	public Driver getDriverById(String driverId);
	public DriverResponse addDriver(DriverRequest driverRequest);
	public DriverResponse updateDriver(String driverId,DriverRequest driverRequest);
	public DriverResponse deleteDriver(String driverId);
	public List<Driver> getAllDrivers(String transporterId, String phoneNum, String truckId,Integer pageNo);
}
