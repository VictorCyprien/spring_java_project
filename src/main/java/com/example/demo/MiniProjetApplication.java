package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Weapon;

@SpringBootApplication
@Controller
@EntityScan("model") 
public class MiniProjetApplication {

	@RequestMapping(value = "/")
	public String accueil() {
		return "index";
	}
	
	
	
	@Controller
	class LoginController {
		@PostMapping("/login")
		public String aled() {
			return "login_success";
		}
		
		@GetMapping("/login")
		String login() {
			return "login";
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MiniProjetApplication.class, args);
	}

}
