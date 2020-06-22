package com.dchang.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping(value="/login")
	public Map<String, Object> getAppToken()
	{
		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("token", "sometoken");
		return hashMap;
	}
}
