package librarysystem;

public class Perpustakaan {
    private Buku[] koleksiBuku;
    private int jumlahBuku;

    public Perpustakaan() {
        this.koleksiBuku = new Buku[100]; 
        this.jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < koleksiBuku.length) {
            koleksiBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku " + buku.getJudul() + " telah ditambahkan ke perpustakaan");
        } else {
            System.out.println("Perpustakaan sudah penuh, tidak bisa menambahkan buku lagi");
        }
    }

    public void tampilkanBuku() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (int i = 0; i < jumlahBuku; i++) {
            Buku buku = koleksiBuku[i];
            System.out.println("- " + buku.getJudul() + " oleh " + buku.getPenulis() + " (" + buku.getTahunTerbit() + ") - " + (buku.isStatusDipinjam() ? "Dipinjam" : "Tersedia"));
        }
    }
}