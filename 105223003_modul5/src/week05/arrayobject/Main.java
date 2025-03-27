package week05.arrayobject;

import week05.Mahasiswa;

public class Main {
    public static void main(String[] args) {

        Mahasiswa[] students = {
            new Mahasiswa("Budi"),
            new Mahasiswa("Budi"),
            new Mahasiswa("Budi"),
            new Mahasiswa("Budi"),
            new Mahasiswa("Budi"),
        };

        for (Mahasiswa mahasiswa : students) {
            System.out.println(mahasiswa.getNama());
        }

        Mahasiswa[] mhs = new Mahasiswa[3];
        mhs[0] = new Mahasiswa();
        mhs[0].setNama("Budi");
        mhs[1] = new Mahasiswa();
        mhs[1].setNama("Andi");
        mhs[2] = new Mahasiswa();
        mhs[2].setNama("rido");

        for (Mahasiswa m : mhs) {
            System.out.println(m.getNama());
        }
    }
}