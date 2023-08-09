package desafio.demo.controllers;

import desafio.demo.entidades.Numero;
import desafio.demo.service.NumeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/numero")
@Controller
public class numeroController {

    @Autowired
    private NumeroService numeroService;


    @PostMapping("/adicionar")
    public ResponseEntity<String> adicionar(@RequestBody final Numero numero) {

        try {
            return ResponseEntity.ok(numeroService.calcular(numero));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro ao calcular");
        }

    }


}
