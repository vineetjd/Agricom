package com.jwt.service;

import java.util.List;

import com.jwt.model.Farmer;

public interface FarmerService {
	
	public void addFarmer(Farmer farmer);

	public List<Farmer> getAllFarmer();

	public void deleteFarmer(Integer farmerId);

	public Farmer getFarmer(int farmerid);

	public Farmer updateFarmer(Farmer farmer);
}
