package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.EmployeeDAO;
import com.jwt.model.Farmer;

@Service
@Transactional
public class AgricomServiceImpl implements AgricomService {

	@Autowired
	private FarmerDAO farmerDAO;

	@Override
	@Transactional
	public void addFarmer(Farmer farmer) {
		FarmerDAO.addFarmer(farmer);
	}

	@Override
	@Transactional
	public List<Farmer> getAllFarmers() {
		return FarmerDAO.getAllFarmers();
	}

	@Override
	@Transactional
	public void deleteFarmer(Integer farmerId) {
		farmerDAO.deleteFarmer(farmerId);
	}

	public Farmer getFarmer(int empid) {
		return FarmerDAO.getFarmer(empid);
	}

	public Farmer updateFarmer(Farmer farmer) {
		// TODO Auto-generated method stub
		return FarmerDAO.updateFarmer(farmer);
	}

	public void setFarmerDAO(FarmerDAO farmerDAO) {
		this.FarmerDAO = FarmerDAO;
	}

}
