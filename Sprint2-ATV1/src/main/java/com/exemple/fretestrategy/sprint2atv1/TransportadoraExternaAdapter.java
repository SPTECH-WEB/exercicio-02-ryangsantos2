package com.exemple.fretestrategy.sprint2atv1;

import com.exemple.fretestrategy.sprint2atv1.FreteStrategy;

public class TransportadoraExternaAdapter implements FreteStrategy {
    private final TransportadoraExternaAPI transportadoraExternaAPI;

    public TransportadoraExternaAdapter() {
        this.transportadoraExternaAPI = new TransportadoraExternaAPI();
    }

    @Override
    public double calcularFrete(double peso) {
        return transportadoraExternaAPI.calcularCusto(peso);
    }
}