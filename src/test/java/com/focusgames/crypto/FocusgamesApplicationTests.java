package com.focusgames.crypto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.focusgames.crypto.model.Guest;
import com.focusgames.crypto.repository.GuestRepository;

@SpringBootTest
class FocusgamesApplicationTests {

	@Autowired
	GuestRepository guestrepo;
	
	
	@Test
	public void testCreateGuest() {
		Guest g = new Guest(null, null, null);
		g.setUsername("Vinay");
		g.setPassword("1234567");
		g.setEmail("vinay@gmail.com");
		guestrepo.save(g);
	}

}
