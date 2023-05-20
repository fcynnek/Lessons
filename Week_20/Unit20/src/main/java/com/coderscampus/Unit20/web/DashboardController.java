package com.coderscampus.Unit20.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.coderscampus.Unit20.domain.User;
import com.coderscampus.Unit20.service.AdminService;

@Controller
public class DashboardController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/dashboard")
	public String getDashboard (@AuthenticationPrincipal User user, ModelMap model) {
		System.out.println(user);
		model.put("user", user);
		List<User> allUserAccounts = adminService.getAllUserAccounts();
		return "dashboard";
	}
}
