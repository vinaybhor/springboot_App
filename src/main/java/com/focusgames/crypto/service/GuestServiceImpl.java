package com.focusgames.crypto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.focusgames.crypto.model.Guest;
import com.focusgames.crypto.repository.GuestRepository;

@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	private GuestRepository guestRepository;
	
	public GuestRepository getGuestRepository() {
		return guestRepository;
	}

	public void setGuestRepository(GuestRepository guestRepository) {
		this.guestRepository = guestRepository;
	}

	@Override
	public Guest saveGuest(Guest guest) {
		
		return guestRepository.save(guest);
	}

	@Override
	public void deleteGuest(Guest guest) {
		guestRepository.delete(guest);
	
	}

	@Override
	public Optional<Guest> getGuestById(Long id) {
		
		return guestRepository.findById(id);
	}
	
	



}
