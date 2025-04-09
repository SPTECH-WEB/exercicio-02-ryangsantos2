package com.exemple.fretestrategy.sprint2atv1;

public class NotificadorCliente implements Observer {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificação para o cliente: " + mensagem);
    }
}