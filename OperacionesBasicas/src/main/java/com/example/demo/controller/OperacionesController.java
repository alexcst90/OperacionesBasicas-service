package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rest.OperacionesService;


@RestController
@RequestMapping("/operaciones")
public class OperacionesController {

	
	
	@Autowired
	OperacionesService operacionesService;
	
	//@RequestMapping(value="/operaciones/", method = RequestMethod.GET)
	@GetMapping("/suma/")
	public Double getSuma(@RequestParam("n1") double n1, @RequestParam("n2") double n2){	
		return operacionesService.suma(n1, n2);
	}
	
	@GetMapping("/resta/")
	public Double getResta(@RequestParam("n1") double n1, @RequestParam("n2") double n2) {
		return operacionesService.resta(n1, n2);
	}
	
	@GetMapping("/multi/")
	public Double getMulti(@RequestParam("n1") double n1, @RequestParam("n2") double n2) {
		return operacionesService.multi(n1, n2);
	}
	
	@GetMapping("/div/")
	public String getDiv(@RequestParam("n1") double n1, @RequestParam("n2") double n2) {
		double resp = 0;
		if(n2 == 0)
			return "ERROR";
		else {
			resp = operacionesService.div(n1, n2);
			return Double.toString(resp);
		}
			
	}
	
}
