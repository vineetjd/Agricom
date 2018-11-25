package com.farm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.farm.dao.TraderDAO;
import com.farm.model.FarmAddress;
import com.farm.model.FarmBank;
import com.farm.model.FarmBidding;
import com.farm.model.FarmLogin;
import com.farm.model.FarmTrader;

@Controller
public class TraderController {
	
	@Autowired
	TraderDAO tdao;
	
	@RequestMapping("index")
	public ModelAndView viewIndex() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/submitTrader",method=RequestMethod.POST)
	public ModelAndView traderReg(HttpServletRequest request, HttpServletResponse response, @ModelAttribute FarmTrader trader, @ModelAttribute FarmAddress address, @ModelAttribute FarmBank bank ) {
		
		trader.settAddr(address);
		trader.settBank(bank);
		
		tdao.register(trader);
		
		return new ModelAndView("index");
		
	}
	
	@RequestMapping(value="/traderLog", method=RequestMethod.POST)
	public ModelAndView traderLog(HttpServletRequest request, HttpServletResponse response, @ModelAttribute FarmLogin l) {
		
		FarmTrader trader=tdao.validateTrader(l);
		
		if(null != trader)
			return new ModelAndView("index"/*,"trader",trader*/);
		else
			return new ModelAndView("loginTrader","message","Wrong username or password");
		
	}
	
	@RequestMapping(value="/loginTrader", method=RequestMethod.POST)
	public ModelAndView loginTrader() {
		return new ModelAndView("loginTrader");
	}
	
	@RequestMapping(value="/registerTrader", method=RequestMethod.POST)
	public ModelAndView registerTrader() {
		
		return new ModelAndView("signupTrader");
	}
	
	@RequestMapping("/getLatestBiddingDetails")
	public FarmBidding latestBiddingDetails() {
		FarmBidding bid=tdao.getLatestBiddingDetails();
		return bid;
	}
	
}
