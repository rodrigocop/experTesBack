package com.test.test.service.impl;

import com.test.test.model.Proveedor;
import com.test.test.repository.ProveedorRepository;
import com.test.test.service.interfaces.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImp implements ProveedorService {

    @Autowired
    ProveedorRepository empleadoRepository;

    @Override
    public Proveedor guardar(Proveedor proveedor) {
        return empleadoRepository.save(proveedor);
    }

    @Override
    public List<Proveedor> obtenerProveedores() {
        return empleadoRepository.findAll();
    }

    @Override
    public Proveedor getProveedor(Long empleadoId) {
        return empleadoRepository.findById(empleadoId).get();
    }

    @Override
    public boolean validarExisteProveedor(String cuil, Long proveedorId) {
        return empleadoRepository.validarExisteEmpleado(cuil, proveedorId) != null;

    }

    @Override
    public boolean borrarProveedor(Long proveedorId) {
        Proveedor proveedor = empleadoRepository.findById(proveedorId).get();
       try {
           empleadoRepository.delete(proveedor);
           return true;
       } catch (Exception e){
           return false;
       }
    }

    @Override
    public Proveedor atualizar(Proveedor proveedor) {
        return empleadoRepository.save(proveedor);
    }
}
