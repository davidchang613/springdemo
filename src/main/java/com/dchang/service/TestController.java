package com.dchang.service;

//import java.io.File;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dchang.model.Amphibian;
import com.dchang.model.Tadpole;

@RestController
public class TestController {

	
	@RequestMapping(value="/login2")
	public Map<String, Object> testClass()
	{
		testArrayList();
		
		int il = 1_234;
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		StringBuilder sb1 = new StringBuilder();
		sb1.append("hello");
		boolean sss = sb.equals(sb1);
		String name = "animals";
		String n2 = name.substring(3, 7);
		double x = 39.21;
		float y = 2.1f;
		int oct = 032;
		long t = (long)3013981;
		System.out.print(oct);
		Object[] objects = null; 
		objects[0] = new StringBuilder();
		List<Tadpole> tadpoles = new ArrayList<Tadpole>();
		for(Amphibian amphibian : tadpoles) {

			System.out.print(il);
		}
		return null;
	}
	
	@SuppressWarnings("deprecation")
	public void testArrayList() {
		ArrayList al = new ArrayList<>();
		al.add(1);
		al.add("hello");
		
		byte b = new Byte((byte) 1);
		b = Byte.valueOf((byte) 10);
		b = Byte.valueOf("2");
		
		List list = new ArrayList<>();
		list.add("pig");
		list.add("dog");
		String [] animal = (String[]) list.toArray(new String[5]);
		System.out.println(animal.length);
	}
}
