package com.TruckApi.TruckApi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sharedEntity.TruckData.TruckType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TruckUpdateRequest {

	private Boolean truckApproved;

	private String imei;
	private long passingWeight;
	private String driverId;
	private Integer tyres;
	private Long truckLength;

	private TruckType truckType;
}
