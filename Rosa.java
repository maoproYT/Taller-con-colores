/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dibujos;

/**
 *
 * @author B11
 */
import java.util.Scanner;

public class Equipo {

    private final String name;
    private String trainer;
    private int[] playersNumbers;
    private int champions = 0;
    private int europeLeagues = 0;

    public Equipo(String n, String e, int[] np) {
        this.name = n;
        this.trainer = e;
        this.playersNumbers = np;
    }

    public Equipo(String n, String e, int[] np, int ch, int el) {
        this.name = n;
        this.trainer = e;
        this.playersNumbers = np;
        this.champions = ch;
        this.europeLeagues = el;
    }

    // Getters
    public String getName() { return name; }
    public String getTrainer() { return trainer; }
    public int[] getPlayersNumbers() { return playersNumbers; }
    public int getChampions() { return champions; }
    public int getEuropeLeagues() { return europeLeagues; }

    // Setters
    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public void setPlayersNumbers(int[] pn) {
        this.playersNumbers = pn;
    }

    public void addChampions(int cup) {
        if (cup > 0) {
            champions += cup;
        } else {
            System.out.println("Numero invalido");
        }
    }

    public void addEuropeLeagues(int cup) {
        if (cup > 0) {
            europeLeagues += cup;
        } else {
            System.out.println("Numero invalido");
        }
    }

    // Método más limpio
    public void playMatch(int goals) {
        if (goals > 0) {
            System.out.println("El equipo ganó el partido");
        } else {
            System.out.println("El equipo perdió el partido");
        }
    }

    public void mostrarInfo() {
        System.out.println("Equipo: " + name);
        System.out.println("Entrenador: " + trainer);
        System.out.println("Champions: " + champions);
        System.out.println("Europa Leagues: " + europeLeagues);
    }
}