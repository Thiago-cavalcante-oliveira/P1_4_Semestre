package desafio.demo;

import desafio.demo.entidades.Numero;
import desafio.demo.service.NumeroService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TesteCalculadora {

    Numero numero = new Numero();

@Autowired
    private NumeroService numeroService;

    @Test
    public void testarSoma() {
        Numero numero = new Numero();
        List<Integer> valores = new ArrayList<>();
        for (int i = 1; i < 3; i++) {
            valores.add(i);
        }
        numero.setNumeros(valores);
        Integer resultado = this.numeroService.somar(numero);
        Assert.assertEquals(3, resultado, 0);
    }

    @Test
    public void testarMedia() {
        Numero numero = new Numero();
        List<Integer> valores = new ArrayList<>();
        for (int i = 1; i < 3; i++) {
            valores.add(i);
        }
        numero.setNumeros(valores);
        double resultado = this.numeroService.media(numero);
        Assert.assertEquals(1.25, resultado, 0);
    }

    @Test
    public void testarMediana() {
        Numero numero = new Numero();
        List<Integer> valores = new ArrayList<>();
        for (int i = 1; i < 3; i++) {
            valores.add(i);
        }
        numero.setNumeros(valores);
        double resultado = this.numeroService.mediana(numero);
        Assert.assertEquals(2, resultado, 0);
    }

    @Test
    public void testarDesvioPadrao() {
        Numero numero = new Numero();
        List<Integer> valores = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            valores.add(i);
        }
        numero.setNumeros(valores);
        double resultado = this.numeroService.desvioPadrao(numero);
        Assert.assertEquals(4.66, resultado, 0.01);
    }

}
