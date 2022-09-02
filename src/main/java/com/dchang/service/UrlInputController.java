package com.dchang.service;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dchang.shared.UtilFunction;

@CrossOrigin
@RestController
public class UrlInputController {

	@GetMapping(value="/dchang/demos/{demoid}")
	public ResponseEntity<Map<String, Object>> getDemo(@PathVariable(value = "demoid") String demoId) {
		String sanitizedDemoId = UtilFunction.sanitizedString(demoId);
		
		Map<String, Object> map = new HashMap<>();
		map.put("demoId", demoId);
		map.put("name", "name of " + demoId);
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
	
	@PostMapping(value = "/dchang/demos/{demoid}")
	public ResponseEntity<Map<String, Object>> postDemo(@RequestBody String jsonData) {
		
		String sanitizedJsonData = UtilFunction.sanitizedString(jsonData);
		JSONObject jsonO = UtilFunction.stringToJSONObject(sanitizedJsonData);
		
		return new ResponseEntity<>(jsonO.toMap(), HttpStatus.OK);
	}
}
