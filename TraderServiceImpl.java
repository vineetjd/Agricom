package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.TraderDAO;
import com.jwt.model.G3Trader;

@Service
@Transactional
public class TraderServiceImpl implements TraderService {

	@Autowired
	private TraderDAO traderDAO;

	@Override
	@Transactional
	public void addTrader(G3Trader trader) {
		traderDAO.addTrader(trader);
	}

	@Override
	@Transactional
	public List<G3Trader> getAllTraders() {
		return traderDAO.getAllTraders();
	}

	@Override
	@Transactional
	public void deleteTrader(Integer T_id) {
		traderDAO.deleteTrader(T_id);
	}

	public G3Trader getTrader(String T_email) {
		return traderDAO.getTrader(T_id);
	}

	public G3Trader updateTrader(G3Trader trader) {
		// TODO Auto-generated method stub
		return traderDAO.updateTrader(trader);
	}

	public void setTraderDAO(TraderDAO traderDAO) {
		this.traderDAO = traderDAO;
	}

}
