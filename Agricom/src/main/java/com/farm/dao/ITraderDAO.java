package com.farm.dao;

import com.farm.model.*;

public interface ITraderDAO {

	public int registerTrader(FarmTrader trader);
	public FarmTrader validateTrader(FarmLogin l);
	
}
