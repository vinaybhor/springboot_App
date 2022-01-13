package com.focusgames.crypto.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.focusgames.crypto.model.Guest;
import com.focusgames.crypto.service.GuestServiceImpl;

@RestController
public class GestController {

	@Autowired
	GuestServiceImpl guestService;
	
	@PostMapping("api/signup")
	public ResponseEntity<Void> saveGuest(@RequestBody Guest newGuest) {
		guestService.saveGuest(newGuest);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.buildAndExpand(newGuest.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
}
