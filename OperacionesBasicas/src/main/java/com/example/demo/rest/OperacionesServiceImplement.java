package com.example.demo.rest;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class OperacionesServiceImplement implements OperacionesService {
	
	@HystrixCommand(fallbackMethod = "suma")
	public double suma(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 + n2;
	}

	@HystrixCommand(fallbackMethod = "resta")
	public double resta(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 - n2;
	}

	@HystrixCommand(fallbackMethod = "multi")
	public double multi(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 * n2;
	}

	@HystrixCommand(fallbackMethod = "div")
	public double div(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 / n2;
	}

	
	
}
