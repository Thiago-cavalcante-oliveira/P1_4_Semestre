package desafio.demo.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Calculo {
    @Getter @Setter
    private List <Integer> numeros = new ArrayList<>();

    private double media;
    private double mediana;
    private double desvioPadrao;
    private int qtdeNumeros;

    public Calculo() {
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMediana() {
        return mediana;
    }

    public void setMediana(double mediana) {
        this.mediana = mediana;
    }

    public double getDesvioPadrao() {
        return desvioPadrao;
    }

    public void setDesvioPadrao(double desvioPadrao) {
        this.desvioPadrao = desvioPadrao;
    }

    public int getQtdeNumeros() {
        return qtdeNumeros;
    }

    public void setQtdeNumeros(int qtdeNumeros) {
        this.qtdeNumeros = qtdeNumeros;
    }
}
