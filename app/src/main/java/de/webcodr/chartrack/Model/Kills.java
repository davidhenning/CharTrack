package de.webcodr.chartrack.Model;


import com.google.gson.annotations.Expose;


public class Kills {

    @Expose
    private Integer monsters;
    @Expose
    private Integer elites;
    @Expose
    private Integer hardcoreMonsters;

    public Integer getMonsters() {
        return monsters;
    }

    public void setMonsters(Integer monsters) {
        this.monsters = monsters;
    }

    public Integer getElites() {
        return elites;
    }

    public void setElites(Integer elites) {
        this.elites = elites;
    }

    public Integer getHardcoreMonsters() {
        return hardcoreMonsters;
    }

    public void setHardcoreMonsters(Integer hardcoreMonsters) {
        this.hardcoreMonsters = hardcoreMonsters;
    }

    @Override
    public String toString() {
        return String.valueOf(monsters + elites + hardcoreMonsters);
    }
}
