package com.exemple.fretestrategy.sprint2atv1;

public class NotificadorEquipe implements Observer {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificação para a equipe: " + mensagem);
    }
}