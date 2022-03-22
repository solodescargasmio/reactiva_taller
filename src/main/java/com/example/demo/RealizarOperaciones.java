package com.example.demo;


import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RealizarOperaciones implements Observador{
    private List<Player> players;

    public void filtrarJugadoresEdad(){
        Predicate<Player> predicate=new Predicate<Player>() {
            @Override
            public boolean test(Player player) {
                return player.getAge()>34;
            }
        };
        players.stream()
                .filter(predicate).map(player->player.getName()).forEach(System.out::println);

    }
    public void filtrarJugadoresClub(){
        Predicate<Player> predicate=new Predicate<Player>() {
            @Override
            public boolean test(Player player) {
                return player.getClub().equals("FC Barcelona");
            }
        };
        players.stream()
                .filter(predicate)
                .map(player->player.getName())
                .forEach(System.out::println);

    }
    public void filtrarJugadoresNacionalidad(){
        Predicate<Player> predicate=new Predicate<Player>() {
            @Override
            public boolean test(Player player) {
                return player.getNational().equals("Argentina");
            }
        };
        players.stream()
                .filter(predicate)
                .map(player->player.getName())
                .forEach(System.out::println);

    }
    public void filtrarNacionalidades(){
        List<String> lista = players.stream()
                .map(item->item.getNational())
                .distinct()
                .collect(Collectors.toList());

        for (String string: lista
        ) {
            System.out.println(string);

    }
 }

    public void ordenarJugadores(){
        List<String> lista = players.stream()
                .map(item->item.getName())
                .sorted()
                .collect(Collectors.toList());

        for (String string: lista
        ) {
            System.out.println(string);

        }
    }
    
    public void filtrarNacionalidadesRanking(){
  Map<Object, List<Player>> algo= players.stream().collect(Collectors.groupingBy(player -> new ImmutablePair<>(player.getGames(),player.getNational())));
    algo.forEach((o, players1) -> System.out.println(players1.get(0).toString()));
}


    @Override
    public void update(List<Player> players) {
        //accion a realizar
       this.players = players;
    }
}
