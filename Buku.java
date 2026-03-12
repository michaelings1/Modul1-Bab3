import java.io.*;
public class Buku {

    String judul;
    String kategori;
    Penulis penulis;

    public Buku(String judul, String kategori, Penulis penulis) {
        this.judul = judul;
        this.kategori = kategori;
        this.penulis = penulis;
    }

    public void tampilkan() {
        System.out.println("Judul Buku : " + judul);
        System.out.println("Kategori   : " + kategori);
        System.out.println("Penulis    : " + penulis.nama);
        System.out.println();
    }

    public void bacaFile(String pathFile) {
            try {
                BufferedReader baca = new BufferedReader(new FileReader(pathFile));
    
                judul = baca.readLine();
                kategori = baca.readLine();
                penulis = new Penulis(baca.readLine());
    
                baca.close();
            } catch (Exception e) {
                System.out.println("File tidak ditemukan");
            }
    }

    public void simpanFile(String namaFile) {
            try {
                PrintWriter tulis = new PrintWriter(new FileWriter(namaFile));

                tulis.println(judul);
                tulis.println(kategori);
                tulis.println(penulis.nama);

                tulis.close();
            } catch (Exception e) {
                System.out.println("Gagal menyimpan");
            }
    }

    public double hitungRoyalti(double hargaBuku) {
        return hargaBuku * 0.10;
    }

    public double hitungRoyalti(double hargaBuku, double persen) {
        return hargaBuku * (persen / 100);
    }
}