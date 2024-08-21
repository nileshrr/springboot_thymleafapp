package in.Ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mesagecontroller {
  //mapping get http request onto speific hander method 
	@GetMapping("/welcome")
	public String getwelcomedata(Model model) {
		
		model.addAttribute("msg", "Welcome to themleaf");
		return "index";
	}
	@GetMapping("/student")
	public String Getstudentdata(Model model) {
		
		model.addAttribute("msg1", "Welcome Ajay");
		model.addAttribute("msg2", "Welcome Atul");
		model.addAttribute("msg3", "Welcome Aradhya");
		model.addAttribute("msg4", "Welcome Alon");
		return "index";
		
	}
}
