package com.exemple.fretestrategy.sprint2atv1;

import java.util.ArrayList;
import java.util.List;

public class Entrega {
    private final List<Observer> observadores = new ArrayList<>();

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void concluirEntrega(String mensagem) {
        for (Observer observador : observadores) {
            observador.notificar(mensagem);
        }
    }
}
