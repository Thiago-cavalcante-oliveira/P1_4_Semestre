package desafio.demo.service;

import desafio.demo.entidades.Numero;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class NumeroService {

    public String calcular(final Numero numero) {
        int tamanho = numero.getNumeros().size();
        double soma = this.somar(numero);
        double media = this.media(numero);
        double mediana = this.mediana(numero);
        double desvioPadrao = this.desvioPadrao(numero);


        return toString().format("Soma: %d\nMédia: %.1f\nMediana: %.1f\nDesvio Padrão: %.2f \n tamnho: %d", soma, media, mediana, desvioPadrao, tamanho);
    }


    public Integer somar(Numero numero) {
        Integer soma = 0;
        for (int i = 0; i < numero.getNumeros().size(); i++) {
            soma += numero.getNumeros().get(i);
        }
        return soma;
    }

    public double media(Numero numero) {
        float media = 0;
        for (int i = 0; i < numero.getNumeros().size(); i++) {
            media += numero.getNumeros().get(i);
            media = media / numero.getNumeros().size();
        }
        return media;
    }

    public double desvioPadrao(Numero numero) {
        double desvioPadrao = 0, diferenca = 0, somaDiferencaQuadrada = 0;
        int tamanho = numero.getNumeros().size();
        for (int i = 0; i < numero.getNumeros().size(); i++) {
            diferenca = numero.getNumeros().get(i) - media(numero);
            somaDiferencaQuadrada += diferenca * diferenca;
            desvioPadrao = Math.sqrt(somaDiferencaQuadrada / tamanho);
        }
        return desvioPadrao;
    }


    public double mediana(Numero numero) {
        double mediana = 0;
        int tamanho = numero.getNumeros().size();
        double media = this.media(numero);


        Collections.sort(numero.getNumeros());
        if (tamanho % 2 == 0) {
            mediana = numero.getNumeros().get(tamanho / 2);
        } else {
            mediana = (numero.getNumeros().get(tamanho / 2) + numero.getNumeros().get(tamanho / 2 - 1)) / 2;
        }

        return mediana;
    }


}



