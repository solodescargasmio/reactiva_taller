package com.example.demo;

import java.util.List;

public interface Observador {
    public void update(List<Player> players);//actualizar cuando lista este llena de player
}
