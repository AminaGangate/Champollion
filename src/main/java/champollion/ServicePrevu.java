package champollion;

public class ServicePrevu {

    public int volumeCM = 0;
    public int VolumeTD = 0;
    public int VolumeTP = 0;

    public ServicePrevu(int volumeCM, int VolumeTD, int VolumeTP) {
        this.volumeCM = volumeCM;
        this.VolumeTD = VolumeTD;
        this.VolumeTP = VolumeTP;
    }

    ServicePrevu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getVolumeCM() {
        return volumeCM;
    }

    public int getVolumeTD() {
        return VolumeTD;
    }

    public int getVolumeTP() {
        return VolumeTP;
    }

    public void setVolumeCM(int volumeCM) {
        this.volumeCM = volumeCM;
    }

    public void setVolumeTD(int VolumeTD) {
        this.VolumeTD = VolumeTD;
    }

    public void setVolumeTP(int VolumeTP) {
        this.VolumeTP = VolumeTP;
    }

}
