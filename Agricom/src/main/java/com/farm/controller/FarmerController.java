package com.farm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.farm.dao.FarmerDAOImplement;
import com.farm.model.FarmFarmer;
import com.farm.model.FarmLogin;

@Controller
public class FarmerController {

	@Autowired
	FarmerDAOImplement fdao;
	
	@RequestMapping(value="/SignupFarmer",method=RequestMethod.POST)
	public ModelAndView register( ) 
	{
		
		return new ModelAndView("SignupFarmer");
		
	}
	@RequestMapping(value="/LoginFarmer",method=RequestMethod.POST)
	public ModelAndView loginFarmer( ) 
	{
		
		return new ModelAndView("LoginFarmer");
		
	}
	@RequestMapping(value="/SubmitLoginF",method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, @ModelAttribute FarmLogin lfarmer) 
	{
		
		FarmFarmer farmer = fdao.validate(lfarmer);
		String user=farmer.getfEmail();
	    if (null != farmer) {
	    	return new ModelAndView("FarmerWelcome","user",user);
	    
	    } else {
	    	return new ModelAndView("LoginFarmer","user",user);
	    }
		
	}
	@RequestMapping(value="/SubmitFarmer", method=RequestMethod.POST)
	public ModelAndView registerFarmer(HttpServletRequest request, HttpServletResponse response, @ModelAttribute FarmFarmer farmer ) 
	{
		
		//ModelAndView mv=new ModelAndView();
		//mv.addObject(farmer);
		System.out.println(farmer);
		int i=fdao.addFarmer(farmer);
		if(i>0)
		{
		
			return new ModelAndView("index");
		}
		return new ModelAndView("SignupFarmer");
		
	}
	
	@RequestMapping(value="/logout")
	public ModelAndView logoutFarmer( ) 
	{
		
		return new ModelAndView("Logout");
		
	}
	
}
