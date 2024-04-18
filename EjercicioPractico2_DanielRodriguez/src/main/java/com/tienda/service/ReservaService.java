package com.tienda.service;

import com.tienda.domain.Reserva;
import java.util.List;

public interface ReservaService {

    public List<Reserva> getProductos(boolean activo);

    // Se obtiene un Reserva, a partir del id de un producto
    public Reserva getProducto(Reserva producto);

    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Reserva producto);

    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Reserva producto);

    public List<Reserva> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con JPQL    
    public List<Reserva> metodoJPQL(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con SQL Nativo
    public List<Reserva> metodoNativo(double precioInf, double precioSup);

}
