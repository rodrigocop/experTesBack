package com.test.test.service.interfaces;

import com.test.test.model.Proveedor;

import java.util.List;

public interface ProveedorService {

    Proveedor guardar(Proveedor proveedor);
    List<Proveedor> obtenerProveedores();
    Proveedor getProveedor(Long empleadoId);
    boolean validarExisteProveedor(String cuil, Long proveedorId);
    boolean borrarProveedor(Long proveedor);
    Proveedor atualizar(Proveedor proveedor);
}
