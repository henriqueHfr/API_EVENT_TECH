package com.eventstech.api.repositories;

import com.eventstech.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdressRepository extends JpaRepository<Event, UUID> {
}
