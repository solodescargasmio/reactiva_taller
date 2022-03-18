package com.example.demo;

import java.util.List;

public class LlenarLista implements SujetoObservable{
    private List<Player> players;
    private Observador observador;

    public LlenarLista() {
    }

    public List<Player> getCvs() {
        return players;
    }

    public void enlazarObservador(Observador o){
        observador=o;
    }
    public void enviarLista(List<Player> players){
        this.players = players;
        notificar();
    }

    @Override
    public void notificar() {
        observador.update(players);
    }
}
