package com.assignment.speedrent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.speedrent.vo.Car;

@RestController
@RequestMapping("/api")
public class HelloController {

	@RequestMapping("/hello")
	public Car hello() {
		Car car = new Car("MYVI", "Perodua");
		return car;
	}

}
