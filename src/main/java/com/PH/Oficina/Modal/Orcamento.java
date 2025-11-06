package com.PH.Oficina.Modal;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class Orcamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Veiculo veiculo;

    private String descricaoServicos;
    private Double valorTotal;
    private boolean aprovado;

    private LocalDate dataInicio;
    private LocalDate dataFim;
}
