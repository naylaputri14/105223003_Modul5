package week05.enkapsulasi;

public class Main {
    public static void main(String[] args)  {
        Mahasiswa mhs1 = new Mahasiswa();

        System.out.println(mhs1.getNama());

        mhs1.setNama("Randi");
        System.out.println(mhs1.getNama());

        mhs1.setUmur(20);
        System.out.println(mhs1.getUmur());
        mhs1.setUmur(-20);
        // System.out.println(mhs1.getUmur());

        Car mycar1 = new Car();
        System.out.println(mycar1.pemilik);
        System.out.println(mycar1.jumlahBan);
    }
}
