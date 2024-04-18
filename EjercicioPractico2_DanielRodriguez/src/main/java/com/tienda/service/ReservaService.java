package com.tienda.service;

import com.tienda.domain.Reserva;
import java.util.List;

public interface ReservaService {

    public List<Reserva> getCategorias(boolean activo);

    // Se obtiene un Reserva, a partir del id de un categoria
    public Reserva getCategoria(Reserva categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Reserva categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Reserva categoria);
}
