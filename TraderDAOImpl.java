package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.G3Trader;

@Repository
public class TraderDAOImpl implements TraderDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addTrader(G3Trader trader) {
		sessionFactory.getCurrentSession().saveOrUpdate(trader);

	}

	@SuppressWarnings("unchecked")
	public List<G3Trader> getAllTraders() {

		return sessionFactory.getCurrentSession().createQuery("from Farm_Trader")
				.list();
	}

	@Override
	public void deleteTrader(Integer T_id) {
		G3Trader trader = (G3Trader) sessionFactory.getCurrentSession().load(
				G3Trader.class, T_id);
		if (null != trader) {
			this.sessionFactory.getCurrentSession().delete(trader);
		}

	}

	public G3Trader getTrader(String T_email) {
		return (G3Trader) sessionFactory.getCurrentSession().get(
				G3Trader.class, T_email);
	}

	@Override
	public G3Trader updateTrader(G3Trader trader) {
		sessionFactory.getCurrentSession().update(trader);
		return trader;
	}

}