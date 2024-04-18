package com.tienda.service;

import com.tienda.domain.Empleado;
import java.util.List;

public interface EmpleadoService {

    public List<Empleado> getCategorias(boolean activo);

    // Se obtiene un Empleado, a partir del id de un categoria
    public Empleado getCategoria(Empleado categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Empleado categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Empleado categoria);
}
