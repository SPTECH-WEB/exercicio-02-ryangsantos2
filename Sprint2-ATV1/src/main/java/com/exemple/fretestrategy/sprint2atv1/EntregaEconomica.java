package com.exemple.fretestrategy.sprint2atv1;
public class EntregaEconomica implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 5.0; // Regra para entrega econômica
    }
}