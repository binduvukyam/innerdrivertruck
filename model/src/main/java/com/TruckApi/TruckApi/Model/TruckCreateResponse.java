package com.TruckApi.TruckApi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sharedEntity.TruckData.TruckType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TruckCreateResponse {

	private String status;
	private String transporterId;
	private String truckId;

	private String truckNo;

	private Boolean truckApproved;
	private String imei;
	private long passingWeight;
	private String driverId;
	private Integer tyres;

	private Long truckLength;

	private TruckType truckType;

}
