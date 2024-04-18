package com.tienda.dao;

import com.tienda.domain.Reserva;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReservaDao extends JpaRepository<Reserva, Long> {
    //Ejemplo de método utilizando Métodos de Query

    public List<Reserva> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

//Ejemplo de método utilizando Consultas con JPQL
    @Query(value = "SELECT a FROM Producto a where a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
    public List<Reserva> metodoJPQL(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);

    //Ejemplo de método utilizando Consultas con SQL nativo
    @Query(nativeQuery = true,
            value = "SELECT * FROM producto where producto.precio BETWEEN :precioInf AND :precioSup ORDER BY producto.descripcion ASC")
    public List<Reserva> metodoNativo(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);

}
