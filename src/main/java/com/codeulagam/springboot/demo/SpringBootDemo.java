package com.codeulagam.springboot.demo;

    import java.util.HashMap;
	import java.util.Map;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class SpringBootDemo {
		
		
	@RequestMapping("/hello")
		public Map<String,String>hello()
			{
				Map map=new HashMap<String,String>();
				map.put("message","Hello");
				return map;
			}
	@RequestMapping("/hello1")
	public String SayHi()
	{
		return "hello";
	}
	
	@GetMapping("/sample")
		public ResponseEntity<Object>sample()
		{
			return ResponseEntity.ok("this is my first example");
	
		}
	
	@GetMapping("/Student")
	public ResponseEntity<Object>getStudent()
		{
		Student student=new Student();
		student.setName("A");
		student.setAddress("mullaitivu");
		student.setAge("40");
		student.setCode(ResponseStatus.SUCCESS.getCode());
		student.setStatus(ResponseStatus.SUCCESS.getStatus());
	    return ResponseEntity.ok(student);
		
		}
	
	}
	
				

	

