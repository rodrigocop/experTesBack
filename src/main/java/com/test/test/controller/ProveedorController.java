package com.test.test.controller;

import com.test.test.model.Proveedor;
import com.test.test.service.interfaces.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/proveedor")
@CrossOrigin("*")
public class ProveedorController {

    @Autowired
    ProveedorService empleadoService;

    @PostMapping(value = "/guardar",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Proveedor guardarProveedor(@RequestBody Proveedor proveedor){
         return empleadoService.guardar(proveedor);
    }

    @PostMapping(value = "/actualizar",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Proveedor actualizarProveedor(@RequestBody Proveedor proveedor){
        return empleadoService.atualizar(proveedor);
    }

    @GetMapping(value = "/detalle")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Proveedor detalleProveedor(@RequestParam Long proveedor){
        return empleadoService.getProveedor(proveedor);
    }

    @GetMapping(value = "/listadoProveedores")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Proveedor> listadoProveedores(){
        return empleadoService.obtenerProveedores();
    }

    @GetMapping(value = "/validarExisteCuil")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public boolean existeCuil(@RequestParam String cuil, @RequestParam(required = false) Long proveedorId ) {
        return empleadoService.validarExisteProveedor(cuil, proveedorId);
    }

    @DeleteMapping(value = "/borrar")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public boolean borrarProveedor(@RequestParam Long proveedor) {
        return empleadoService.borrarProveedor(proveedor);
    }
}
