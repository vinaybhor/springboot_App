package com.focusgames.crypto.service;

import java.util.Optional;

import com.focusgames.crypto.model.Guest;

public interface GuestService {
	
	Guest saveGuest(Guest guest);
	void deleteGuest(Guest guest);
	Optional<Guest> getGuestById(Long id);

}
