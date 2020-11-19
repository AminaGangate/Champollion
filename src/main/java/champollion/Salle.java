package champollion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AminaGangate
 */
public class Salle {
     private String myIntitule;
    private int capacite;

    public Salle(String intituleSalle, int capacite) {
        myIntitule = intituleSalle;
        this.capacite = capacite;

    }

    public String getMyIntitule() {
        return myIntitule;
    }

    public int getCapacite() {
        return capacite;
    }
}
