package com.te.Employee.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestDeligationController {

	
	//Redirecting request to external resource
	@GetMapping("/toLinkedin")
	public String redirectToLinkedIn() {
		return "redirect:https://www.linkedin.com/login";
	}
	
	//Redirecting request to internal resource
	@GetMapping("/knowMore")
	public String redirectToInternal() {
		return "redirect:login";
	}
	
	//Forwarding request to internal resource
	@GetMapping("/forward")
	public String forwardToInternal() {
		return "forward:login";
	}
}
