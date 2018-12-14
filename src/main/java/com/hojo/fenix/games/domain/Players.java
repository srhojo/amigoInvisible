package com.hojo.fenix.games.domain;

import com.hojo.fenix.games.domain.entity.PlayerEntity;

import java.util.ArrayList;
import java.util.List;

public class Players {

    private List<PlayerEntity> players;

    public Players() {
        this.players = new ArrayList<>();
    }

    public List<PlayerEntity> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerEntity> players) {
        this.players = players;
    }
}