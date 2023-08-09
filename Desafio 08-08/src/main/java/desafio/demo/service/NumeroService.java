package desafio.demo.service;

import desafio.demo.entidades.Numero;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class NumeroService {

public String calcular(final Numero numero) {
int soma = 0, tamanho = numero.getNumeros().size();
double diferenca = 0, somaDiferencaQuadrada = 0, desvioPadrao = 0, media = 0, mediana = 0.0;

        for (int i = 0; i < numero.getNumeros().size(); i++) {
             soma += numero.getNumeros().get(i);}
            for(int i = 0; i < numero.getNumeros().size(); i++) {
             media = (double) soma / numero.getNumeros().size();}
            for (int i = 0; i < numero.getNumeros().size(); i++) {
            diferenca = numero.getNumeros().get(i) - media;}
            for (int i = 0; i < numero.getNumeros().size(); i++) {
            somaDiferencaQuadrada += diferenca * diferenca;}
            for (int i = 0; i < numero.getNumeros().size(); i++) {
            desvioPadrao = Math.sqrt(somaDiferencaQuadrada / tamanho);}
    Collections.sort(numero.getNumeros());
            if(tamanho % 2 == 0){
                mediana = numero.getNumeros().get(tamanho/2);
            }
            else{
                mediana = (numero.getNumeros().get(tamanho/2) + numero.getNumeros().get(tamanho/2 - 1))/2;
            }
return toString().format("Soma: %d\nMédia: %.1f\nMediana: %.1f\nDesvio Padrão: %.2f \n tamnho: %d", soma, media, mediana, desvioPadrao, tamanho);
        }


}
