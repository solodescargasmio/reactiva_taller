package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.objenesis.ObjenesisSerializer;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		RealizarOperaciones observador=new RealizarOperaciones();
		LlenarLista llenarLista=new LlenarLista();
		llenarLista.enlazarObservador(observador);
		llenarLista.enviarLista(CsvUtilFile.getPlayers());
		//observador.filtrarJugadoresEdad();
		//observador.filtrarJugadoresClub();
		//observador.filtrarJugadoresNacionalidad();
		//observador.filtrarNacionalidades();
		//observador.ordenarJugadores();
		//observador.filtrarNacionalidadesRanking();


		//System.out.println(play.getName());
		/*List<Player> players = CsvUtilFile.getPlayers();
		for (Player pl:players) {
			System.out.println(pl.getName()+"  "+pl.getClub());
		}*/
	}

}
