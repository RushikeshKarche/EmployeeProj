package com.te.Employee.Controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookies")
public class CookiesController {
	
	@GetMapping("/showcookiespage")
	public String getCookiesPage() {
		return "cookies";
	}
	
	@GetMapping("/createcookies")
	public String createCookies(ModelMap map,HttpServletResponse response) {
		Cookie cookie = new Cookie("JavaFullStack","SpringMVC");
		response.addCookie(cookie);//To bind the cookie to the response so that it can be sent to the client side.
		map.addAttribute("msg", "Cookies created sucessfully");//To bind the information to the page that is returned to the client side
		return "cookies";
	}
	@GetMapping("/readcookies")
	public String readCookies(@CookieValue(name="JSESSIONID",required = false) String value,ModelMap map) {
		
		if(value!=null) {
			map.addAttribute("msg",value);
		}else {
			map.addAttribute("msg", "Cookies not found");
			}
		return "cookies";
	}

}
