package com.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@RestController
@RequestMapping("/mmm")   //request the server to locate here on controller
public class MobileController {
	
	@Autowired
	MobileService service;
	
	@PostMapping("/addMobile")        // http://localhost:2001/mmm/addMobile
	public Mobile addMobile(@RequestBody Mobile m) {     // @RequestBody requests for all entities
		return service.addMobile(m);
	}

	@PutMapping("/updateMobile")          // http://localhost:2001/mmm/updateMobile
	public Mobile updateMobile(@RequestBody Mobile m) {
		return service.updateMobile(m);
	}
	
	@GetMapping("/getMobile/{mid}")          // http://localhost:2001/mmm/getMobile/mid
	public Mobile getMobile(@PathVariable int mid) {     //@PathVariable requests for particular entity
		return service.getMobile(mid);
	}
	
	@GetMapping("/getAllMobile")          // http://localhost:2001/mmm/getAllMobile
	public List<Mobile> getAllMobile() {
		return service.getAllMobile();
	}
	
	@DeleteMapping("/deleteMobile/{mid}")       // http://localhost:2001/mmm/deleteMobile/mid
	public String deleteMobile(@PathVariable int mid) {
		return service.deleteMobile(mid);
	}
	
	

}
