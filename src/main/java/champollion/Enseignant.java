package champollion;

import java.util.HashSet;

public class Enseignant extends Personne {

    public int heuresTotales = 0;
    public int heuresPrevues = 0;
    public int heuresPlanifiees = 0;
    public ServicePrevu Service = new ServicePrevu();
    public HashSet<Intervention> intervention;

    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    public void ajouteIntervention() {
        intervention.add(s, u, e, debut, duree );
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures
     * équivalent TD" Pour le calcul : 1 heure de cours magistral vaut 1,5 h
     * "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut
     * 0,75h "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet
     * enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
        
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE
     * spécifiée en "heures équivalent TD" Pour le calcul : 1 heure de cours
     * magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent
     * TD" 1 heure de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet
     * enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {

    }

    public int heuresPlanifiees() {

    }

    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        Service.setVolumeCM(Service.getVolumeCM());
        Service.setVolumeTD(Service.getVolumeTD());
        Service.setVolumeTP(Service.getVolumeTP());

    }

    public boolean enSousService() {
        if (heuresTotales > heuresPrevues) {
            return false;
        }
        return true;
    }

}
