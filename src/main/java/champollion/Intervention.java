/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champollion;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AminaGangate
 */
public class Intervention {

    public int duree;
    private final Date debut = new Date();
    public boolean annulee;

    public Intervention(String s, int c, int duree, Date debut) {
        this.duree = duree;
        this.annulee = annulee;

    }

    Intervention() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean annulee() {
        if(intervention == null) {
            return true;
        }
        return false;
    }
}
