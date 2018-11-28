package com.farm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.farm.dao.TraderDAOImplement;
import com.farm.model.FarmAddress;
import com.farm.model.FarmBank;
import com.farm.model.FarmBidding;
import com.farm.model.FarmLogin;
import com.farm.model.FarmTrader;
import com.farm.model.FarmCrop;

@Controller
public class TraderController {
	
	@Autowired
	TraderDAOImplement tdao;
	
	@RequestMapping(value="/registerTrader",method=RequestMethod.POST)
	public ModelAndView register( ) 
	{
		
		return new ModelAndView("signupTrader");
		
	}
	@RequestMapping(value="/loginTrader",method=RequestMethod.POST)
	public ModelAndView loginFarmer( ) 
	{
		
		return new ModelAndView("loginTrader");
		
	}
	@RequestMapping(value="/submitTrader", method=RequestMethod.POST)
	public ModelAndView registerFarmer(HttpServletRequest request, HttpServletResponse response, @ModelAttribute FarmTrader trader ) 
	{
		
		//ModelAndView mv=new ModelAndView();
		//mv.addObject(farmer);
		System.out.println(trader);
		int i=tdao.registerTrader(trader);
		if(i>0)
		{
			String str="Registered Successfully";
			return new ModelAndView("index","message",str);
		}
		return new ModelAndView("signupTrader");
		
	}
	@RequestMapping(value="/traderLog",method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, @ModelAttribute FarmLogin ltrader) 
	{
		
		FarmTrader trader = tdao.validateTrader(ltrader);
		String user=trader.gettEmail();
	    if (null != trader) {
	    	HttpSession session=request.getSession(true);
	    	session.setAttribute("user", user);
	    	return new ModelAndView("traderWelcome");
	    
	    } 
	    else {
	    	return new ModelAndView("loginTrader","user",user);
	    }
		
	}
	
	@RequestMapping("/getLatestBiddingDetails")
	public FarmBidding latestBiddingDetails() {
		FarmBidding bid=tdao.getLatestBiddingDetails();
		return bid;
	}
	
	@RequestMapping("/submitBid")
	public ModelAndView updateBid(HttpServletRequest request, HttpServletResponse response) {
		int bidAmount=Integer.parseInt(request.getParameter("bidAmount"));
		String cName=request.getParameter("cName");
		tdao.insertBid(bidAmount, cName);
		return new ModelAndView("redirect:/placeBid");
	}
	
	@RequestMapping("/viewBidSchedule")
	public ModelAndView bidSchedule() {
		return new ModelAndView("bidSchedule");
	}
	
	
	@RequestMapping("/placeBid")
	public ModelAndView placeBid() {
		FarmCrop crop=tdao.getCrop();
		//HttpSession session=request.getSession(true);
		return new ModelAndView("currentBid","crop",crop);
	}
	
	@RequestMapping("bidResult")
	public ModelAndView bidResult(){
		FarmCrop crop=tdao.getCrop();
		System.out.println(crop.getcID());
		tdao.setStatus(crop.getcID());
		return new ModelAndView("bidResult","crop",crop);
	}

	/*@RequestMapping("index")
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
			return new ModelAndView("index","trader",trader);
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
	
	@RequestMapping("/submitBid/{bidAmount}")
	public ModelAndView updateBid(@PathVariable int bidAmount) {
		tdao.insertBid(bidAmount);
		return new ModelAndView("currentBid");
	}
	
	@RequestMapping("/viewBidSchedule")
	public ModelAndView bidSchedule() {
		return new ModelAndView("bidSchedule");
	}
	
	@RequestMapping("/placeBid")
	public ModelAndView placeBid() {
		tdao.getCrop();
		return new ModelAndView("currentBid");
	}*/
	
}
