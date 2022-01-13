package com.focusgames.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.focusgames.crypto.model.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {

}
