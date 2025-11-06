package com.PH.Oficina.controller;

import com.PH.Oficina.Modal.Veiculo;
import com.PH.Oficina.Repository.VeiculoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/veiculos")
@CrossOrigin("*")
public class VeiculoController {

    private final VeiculoRepository repository;

    public VeiculoController(VeiculoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Veiculo> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Veiculo criar(@RequestBody Veiculo veiculo) {
        return repository.save(veiculo);
    }
}
