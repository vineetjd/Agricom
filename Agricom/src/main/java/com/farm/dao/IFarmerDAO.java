package com.farm.dao;

import com.farm.model.FarmFarmer;
import com.farm.model.FarmLogin;

public interface IFarmerDAO {
	public int addFarmer(FarmFarmer f);
	public FarmFarmer validate(FarmLogin l);
}
