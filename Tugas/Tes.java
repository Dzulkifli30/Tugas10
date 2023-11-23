package Tugas10.Tugas;

public class Tes {
        public static void main(String[] args) {
                // membuat objek
                Truk truk1 = new Truk();
                Truk truk2 = new Truk();
                Taksi taksi1 = new Taksi();
                Taksi taksi2 = new Taksi();
                Sepeda sepeda1 = new Sepeda();
                Sepeda sepeda2 = new Sepeda();

                // mengisi nilai pada atribut objek truk 1
                truk1.setJmlRoda(4);
                truk1.setWarna("Kuning");
                truk1.setBahanbakar("Solar");
                truk1.setKapasitasMesin(1500);
                truk1.setMuatanMaks(1000);

                // mengisi nilai pada atribut objek truk 2
                truk2.setJmlRoda(6);
                truk2.setWarna("merah");
                truk2.setBahanbakar("Solar");
                truk2.setKapasitasMesin(2000);
                truk2.setMuatanMaks(5000);

                // mengisi nilai pada atribut objek taksi 1
                taksi1.setJmlRoda(4);
                taksi1.setWarna("Oranye");
                taksi1.setBahanbakar("Bensin");
                taksi1.setKapasitasMesin(1500);
                taksi1.setTarifAwal(10000);
                taksi1.setTarifPerKm(5000);

                // mengisi nilai pada atribut objek taksi 2
                taksi2.setJmlRoda(4);
                taksi2.setWarna("Biru");
                taksi2.setBahanbakar("Bensin");
                taksi2.setKapasitasMesin(1300);
                taksi2.setTarifAwal(7000);
                taksi2.setTarifPerKm(3500);

                // mengisi nilai pada atribut objek sepeda 1
                sepeda1.setJmlRoda(3);
                sepeda1.setWarna("Hitam");
                sepeda1.setJmlSadel("1");
                sepeda1.setJmlGir(2);

                // mengisi nilai pada atribut objek sepeda 2
                sepeda2.setJmlRoda(2);
                sepeda2.setWarna("Putih");
                sepeda2.setJmlSadel("2");
                sepeda2.setJmlGir(5);

                // Menampilkan atribut truk
                System.out.println("Objek | jmlRoda | Warna | bahan Bakar | Kapasitas Mesin | Muatan Maks |");
                System.out.println(
                                "truk1      " + truk1.getJmlRoda() + "      " + truk1.getWarna() + "      "
                                                + truk1.getBahanBakar()
                                                + "       "
                                                + truk1.getKapasitasMesin() + "             " + truk1.getMuatanMaks());
                System.out.println(
                                "truk2      " + truk2.getJmlRoda() + "      " + truk2.getWarna() + "       "
                                                + truk2.getBahanBakar()
                                                + "       "
                                                + truk2.getKapasitasMesin() + "             " + truk2.getMuatanMaks());

                // Menampilkan atribut taksi
                System.out.println(
                                "Objek | jmlRoda | Warna | bahan Bakar | Kapasitas Mesin | Tarif Awal | Tarif Perkm |");
                System.out.println(
                                "taksi1     " + taksi1.getJmlRoda() + "      " + taksi1.getWarna() + "     "
                                                + taksi1.getBahanBakar()
                                                + "       "
                                                + taksi1.getKapasitasMesin() + "             " + taksi1.getTarifAwal()
                                                + "         "
                                                + taksi1.getTarifPerKm());
                System.out.println(
                                "taksi2     " + taksi2.getJmlRoda() + "      " + taksi2.getWarna() + "       "
                                                + taksi2.getBahanBakar()
                                                + "       "
                                                + taksi2.getKapasitasMesin() + "             " + taksi2.getTarifAwal()
                                                + "          "
                                                + taksi2.getTarifPerKm());

                // Menampilkan atribut Sepeda
                System.out.println("Objek | jmlRoda | Warna | Jumlah Sadel | Jumlah Gir");
                System.out.println(
                                "Sepeda1     " + sepeda1.getJmlRoda() + "     " + sepeda1.getWarna() + "        "
                                                + sepeda1.getJmlSadel()
                                                + "             "
                                                + sepeda1.getJmlGir());
                System.out.println(
                                "Sepeda2     " + sepeda2.getJmlRoda() + "     " + sepeda2.getWarna() + "        "
                                                + sepeda2.getJmlSadel()
                                                + "             "
                                                + sepeda2.getJmlGir());

                System.out.println("halo saya sepeda warna: " + sepeda2.getWarna());
        }
}
