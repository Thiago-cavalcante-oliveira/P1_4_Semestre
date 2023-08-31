package Entidades;

import lombok.Getter;
import lombok.Setter;

public class Pessoa {
    @Getter
    @Id
    private Long id;
    private String nome;
}
