package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class RealizarOperacionesTest {

    @Test
    void filtrarJugadoresEdad() {
        RealizarOperaciones observador=new RealizarOperaciones();
        LlenarLista llenarLista=new LlenarLista();
        llenarLista.enlazarObservador(observador);
        llenarLista.enviarLista(CsvUtilFile.getPlayers());
        observador.filtrarJugadoresEdad();
    }

    @Test
    void filtrarJugadoresClub() {
        RealizarOperaciones observador=new RealizarOperaciones();
        LlenarLista llenarLista=new LlenarLista();
        llenarLista.enlazarObservador(observador);
        llenarLista.enviarLista(CsvUtilFile.getPlayers());
        observador.filtrarJugadoresClub();

    }

    @Test
    void filtrarJugadoresNacionalidad() {
        RealizarOperaciones observador=new RealizarOperaciones();
        LlenarLista llenarLista=new LlenarLista();
        llenarLista.enlazarObservador(observador);
        llenarLista.enviarLista(CsvUtilFile.getPlayers());
        observador.filtrarNacionalidades();
    }

    @Test
    void filtrarNacionalidades() {
        RealizarOperaciones observador=new RealizarOperaciones();
        LlenarLista llenarLista=new LlenarLista();
        llenarLista.enlazarObservador(observador);
        llenarLista.enviarLista(CsvUtilFile.getPlayers());
        observador.filtrarNacionalidades();
    }

    @Test
    void ordenarJugadores() {
        RealizarOperaciones observador=new RealizarOperaciones();
        LlenarLista llenarLista=new LlenarLista();
        llenarLista.enlazarObservador(observador);
        llenarLista.enviarLista(CsvUtilFile.getPlayers());
        observador.ordenarJugadores();
    }
/*
    @Test
    void filtrarNacionalidadesRanking() {
    }*/

}