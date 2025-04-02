import librarysystem.Buku;
import librarysystem.Perpustakaan;
import librarysystem.User;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        Buku buku1 = new Buku("To All the Boys I've Loved Before", "Jenny Han", 2014);
        Buku buku2 = new Buku("P.S. I Still Love You", "Jenny Han", 2015);
        Buku buku3 = new Buku("Always And Forever, Lara Jean", "Jenny Han", 2017);
        Buku buku4 = new Buku("The Summer I Turned Pretty", "Jenny Han", 2009);
        Buku buku5 = new Buku("It's Not Summer Without You", "Jenny Han", 2010);
        Buku buku6 = new Buku("We'll Always Have Summer", "Jenny Han", 2011);
        
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        perpustakaan.tambahBuku(buku4);
        perpustakaan.tambahBuku(buku5);
        perpustakaan.tambahBuku(buku6);
        
        perpustakaan.tampilkanBuku();
        
        User user1 = new User("Lara", "US0012");
        User user2 = new User("Belly", "US0002");
        
        user1.pinjamBuku(buku5);
        user2.pinjamBuku(buku2);
        
        perpustakaan.tampilkanBuku();
        
        user1.kembalikanBuku(buku5);
        user2.kembalikanBuku(buku2);
        
        perpustakaan.tampilkanBuku();
    }
}