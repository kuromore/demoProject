package com.example.demo;

import javax.validation.constraints.NotBlank;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Hello Spring Boot!";
	}

	@RequestMapping("/parameter/param1/{param1}")
	public String ValidatedTest(
			@PathVariable(required = true)
			@NotBlank
			String param1,

			@RequestParam
			@NotBlank
			String param2
			) {

		return "param1:" + param1 + " param2:" + param2;
	}

}
