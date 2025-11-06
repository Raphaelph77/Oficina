package com.PH.Oficina.Repository;
import com.PH.Oficina.Modal.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
