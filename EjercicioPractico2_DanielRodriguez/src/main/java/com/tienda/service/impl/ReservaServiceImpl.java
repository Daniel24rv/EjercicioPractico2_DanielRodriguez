package com.tienda.service.impl;

import com.tienda.domain.Reserva;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tienda.service.ReservaService;
import com.tienda.dao.ReservaDao;

@Service
public class ReservaServiceImpl implements ReservaService {

     @Autowired
    private ReservaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Reserva> getCategorias(boolean activos) {
        var lista = categoriaDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Reserva getCategoria(Reserva categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Reserva categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Reserva categoria) {
        categoriaDao.delete(categoria);
    }
    
}
