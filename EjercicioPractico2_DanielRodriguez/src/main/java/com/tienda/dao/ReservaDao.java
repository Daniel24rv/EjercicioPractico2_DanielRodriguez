package com.tienda.dao;

import com.tienda.domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaDao extends JpaRepository <Reserva, Long> {
    
}
