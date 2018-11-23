import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jwt.model.Employee;
import com.jwt.service.EmployeeService;

public class AgricomController{
	
	@Autowired 
	private TraderService traderService;

	@RequestMapping("/submitTrader")
	public ModelAndView saveFarmer(@ModelAttribute G3Trader trader/*, @ModelAttribute G3FarmAddress addr, @ModelAttribute G3Farmland farm_land, @ModelAttribute G3FarmDocs docs*/){
			if (trader.getT_id()==0) {
				traderService.addTrader(trader);
			}
	}

}