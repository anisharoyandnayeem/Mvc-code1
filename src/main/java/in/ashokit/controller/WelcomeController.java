package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	
	@GetMapping("/welcome")
	public ModelAndView displayWelcomeMsg() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","welcome to ashok it");
		mav.setViewName("index");
		
		return mav;
		
	}

}
