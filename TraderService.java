package com.jwt.service;

import java.util.List;

import com.jwt.model.G3Trader;

public interface TraderService {
	
	public void addTrader(G3Trader trader);

	public List<G3Trader> getAllTraders();

	public void deleteTrader(Integer T_id);

	public G3Trader getTrader(String T_email);

	public G3Trader updateTrader(G3Trader trader);
}
