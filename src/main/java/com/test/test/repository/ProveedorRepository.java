package com.test.test.repository;

import com.test.test.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

    @Query("Select e From Proveedor e where e.cuil = :cuil and (:id is null or e.proveedorId <> :id)")
    Proveedor validarExisteEmpleado(@Param("cuil") String cuil, @Param("id") Long proveedorId);
}
