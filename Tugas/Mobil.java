package Tugas10.Tugas;

public class Mobil extends Kendaraan {
    protected int kapasitasMesin;
    protected String bahanBakar;

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setBahanbakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }
}
