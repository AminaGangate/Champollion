/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champollion;

import java.text.SimpleDateFormat;

/**
 *
 * @author AminaGangate
 */
public class Intervention {
    public int duree;
    SimpleDateFormat debut = new SimpleDateFormat("dd/MM/yyyy");
    public boolean annulee; 

    public Intervention(int duree, boolean annulee) {
        this.duree = duree;
        this.annulee = annulee;
    }
    
}
