package com.tienda.service.impl;

import com.tienda.domain.Empleado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tienda.service.EmpleadoService;
import com.tienda.dao.EmpleadoDao;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

     @Autowired
    private EmpleadoDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> getCategorias(boolean activos) {
        var lista = categoriaDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado getCategoria(Empleado categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Empleado categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Empleado categoria) {
        categoriaDao.delete(categoria);
    }
    
}
