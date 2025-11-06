package com.PH.Oficina.controller;

import com.PH.Oficina.Modal.Orcamento;
import com.PH.Oficina.Repository.OrcamentoRepository;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/orcamentos")
@CrossOrigin("*")
public class OrcamentoController {

    private final OrcamentoRepository repository;

    public OrcamentoController(OrcamentoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Orcamento> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Orcamento criar(@RequestBody Orcamento orcamento) {
        return repository.save(orcamento);
    }

    @PutMapping("/{id}/aprovar")
    public Orcamento aprovar(@PathVariable Long id) {
        Orcamento o = repository.findById(id).orElseThrow();
        o.setAprovado(true);
        o.setDataInicio(LocalDate.now());
        return repository.save(o);
    }

    @PutMapping("/{id}/finalizar")
    public Orcamento finalizar(@PathVariable Long id) {
        Orcamento o = repository.findById(id).orElseThrow();
        o.setDataFim(LocalDate.now());
        return repository.save(o);
    }
}
