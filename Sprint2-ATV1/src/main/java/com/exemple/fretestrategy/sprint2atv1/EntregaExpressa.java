package com.exemple.fretestrategy.sprint2atv1;

public class EntregaExpressa implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 10.0; // Regra para entrega expressa
    }
}