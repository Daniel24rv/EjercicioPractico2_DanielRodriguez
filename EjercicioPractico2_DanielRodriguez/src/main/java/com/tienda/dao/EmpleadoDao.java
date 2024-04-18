package com.tienda.dao;

import com.tienda.domain.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoDao extends JpaRepository <Empleado, Long> {
    
}
