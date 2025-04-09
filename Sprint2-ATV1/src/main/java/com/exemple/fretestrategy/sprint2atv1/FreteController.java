package com.exemple.fretestrategy.sprint2atv1;

import com.exemple.fretestrategy.sprint2atv1.*;
import com.exemple.fretestrategy.sprint2atv1.TransportadoraExternaAdapter;
import com.exemple.fretestrategy.sprint2atv1.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/frete")
public class FreteController {

    @PostMapping("/calcular")
    public String calcularFrete(@RequestBody FreteRequest request) {
        FreteStrategy estrategia;
        switch (request.getModalidade().toLowerCase()) {
            case "economica":
                estrategia = new EntregaEconomica();
                break;
            case "expressa":
                estrategia = new EntregaExpressa();
                break;
            case "terceirizada":
                estrategia = new TransportadoraExternaAdapter();
                break;
            default:
                return "Modalidade inválida!";
        }

        double custo = estrategia.calcularFrete(request.getPeso());

        // Notificação
        Entrega entrega = new Entrega();
        entrega.adicionarObservador(new NotificadorCliente());
        entrega.adicionarObservador(new NotificadorEquipe());
        entrega.concluirEntrega("Entrega concluída com custo: " + custo);

        return "Custo do frete: " + custo;
    }
}