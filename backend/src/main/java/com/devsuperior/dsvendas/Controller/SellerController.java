package com.devsuperior.dsvendas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.DTO.SellerDTO;
import com.devsuperior.dsvendas.services.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {
	
    @Autowired
	public SellerService service;
	
	@GetMapping
	public ResponseEntity <List<SellerDTO>>findAll(){
	   return  ResponseEntity.ok(service.findAll());
	}

}
