package com.okaara.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.okaara.shared.client.model.Authorized;
import com.okaara.shared.client.model.User;
import com.okaara.shared.client.types.Profile;

@Controller
@RequestMapping("/login")
public class LoginController {

	
	@ResponseBody
	@RequestMapping(value = "get/{id}", method = RequestMethod.GET)
	public Map<String, Object> get(@PathVariable("id") String id) {
		Map<String, Object> map = new HashMap<>();
		map.put("Achei ", id);
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "authenticate", method = RequestMethod.POST)
	public Authorized get(@RequestBody User user) {
		Authorized authorized = new Authorized();
		authorized.setEnterpriseId("99998");
		authorized.setEnterpriseName("PC Sistemas");
		authorized.setProfile(Profile.GOLD);
		authorized.setUserEmail(user.getEmail());
		authorized.setUserId("895");
		authorized.setUserName("Rosa");
		return authorized;
	}
}
