package springwork.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import springwork.model.User;

@Controller
@RequestMapping("/")
@SessionAttributes("userkey")

	


public class IndexController {

//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		binder.setDisallowedFields(new String[] {"username"});
//	}
	
	@ModelAttribute("userkey")
	public User setUpUserForm() {
	return new User();

}
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping(value="/userInfo", method = RequestMethod.POST)
	public ModelAndView user_info(@ModelAttribute("userkey")@Valid User u,
			BindingResult errors) {
		
		System.out.println(u.getUsername()+ " " + u.getEmail()+ " " +u.getPassword());
		
		if(errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("index");
		return mav;
		}
		
		ModelAndView mav = new ModelAndView("userpage");
		

		return mav;
		
	}
	
	@RequestMapping(value="userInfo_confirm",method = RequestMethod.POST)
	public ModelAndView user_info_confirm(@ModelAttribute("userkey")User u) {
		ModelAndView mav = new ModelAndView("useraccountpage");
		
		return mav;
	}
	
	@RequestMapping(value="/modify",method = RequestMethod.GET)
	public ModelAndView user_info_confirm() {
		ModelAndView mav = new ModelAndView("useraccountmodify");
		
		return mav;
	}
	
	@RequestMapping(value="/submit_change",method = RequestMethod.POST)
	public String user_info_modify(@ModelAttribute User u,
			@SessionAttribute("userkey")User ukey) {
		
		if(u.getPassword().equals(ukey.getPassword()))
			return "redirect:modify";

		ukey.setPassword(u.getPassword());
		return "useraccountpage";
	}
	
	
}
