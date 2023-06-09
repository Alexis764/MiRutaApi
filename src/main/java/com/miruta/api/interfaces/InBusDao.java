package com.miruta.api.interfaces;

import com.miruta.api.entidades.Bus;
import com.miruta.api.entidades.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InBusDao extends JpaRepository<Bus, String> {

    Optional<Bus> findByConductor(Conductor conductor);

}
