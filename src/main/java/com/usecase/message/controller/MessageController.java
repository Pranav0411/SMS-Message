package com.usecase.message.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.usecase.message.payload.Datattransfer;
import com.usecase.message.service.Services;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "http://localhost:3000")
public class MessageController {
	
	@Autowired
	private Services services;
	
	@PostMapping("/create")
	public ResponseEntity<Datattransfer> createMessage(@RequestBody Datattransfer stdo)
	{
		Datattransfer dataTransfer =  this.services.createMessage(stdo);
		return new ResponseEntity<>(dataTransfer,HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Datattransfer>> getAllMessages()
	{
		return ResponseEntity.ok(this.services.getAllMessages());
	}

}
