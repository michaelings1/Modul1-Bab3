public class Main {
    public static void main(String[] args) {

        Buku teknologi1 = new Buku("Pemrograman Java", "Teknologi", new Penulis("James Gosling"));
        Buku teknologi2 = new Buku("Artificial Intelligence", "Teknologi", new Penulis("Stuart Russell"));
        Buku teknologi3 = new Buku("Jaringan Komputer", "Teknologi", new Penulis("Andrew S. Tanenbaum"));
        Buku teknologi4 = new Buku("Basis Data", "Teknologi", new Penulis("Raghu Ramakrishnan"));
        Buku teknologi5 = new Buku("Machine Learning", "Teknologi", new Penulis("Tom M. Mitchell"));

        Buku filsafat1 = new Buku("Filsafat Hidup", "Filsafat", new Penulis("Socrates"));
        Buku filsafat2 = new Buku("Logika Berpikir", "Filsafat", new Penulis("Aristoteles"));
        Buku filsafat3 = new Buku("Etika Manusia", "Filsafat", new Penulis("Immanuel Kant"));
        Buku filsafat4 = new Buku("Filsafat Barat", "Filsafat", new Penulis("Friedrich Nietzsche"));
        Buku filsafat5 = new Buku("Filsafat Timur", "Filsafat", new Penulis("Confucius"));

        Buku sejarah1 = new Buku("Sejarah Dunia", "Sejarah", new Penulis("Yuval Noah Harari"));
        Buku sejarah2 = new Buku("Sejarah Indonesia", "Sejarah", new Penulis("Slamet Muljana"));
        Buku sejarah3 = new Buku("Peradaban Kuno", "Sejarah", new Penulis("Will Durant"));
        Buku sejarah4 = new Buku("Perang Dunia", "Sejarah", new Penulis("Antony Beevor"));
        Buku sejarah5 = new Buku("Sejarah Asia", "Sejarah", new Penulis("John Keay"));

        Buku agama1 = new Buku("Pengantar Ilmu Agama", "Agama", new Penulis("Karen Armstrong"));
        Buku agama2 = new Buku("Etika dalam Agama", "Agama", new Penulis("Seyyed Hossein Nasr"));
        Buku agama3 = new Buku("Sejarah Agama Dunia", "Agama", new Penulis("Huston Smith"));
        Buku agama4 = new Buku("Nilai Moral Agama", "Agama", new Penulis("Al-Ghazali"));
        Buku agama5 = new Buku("Agama dan Kehidupan", "Agama", new Penulis("Nurcholish Madjid"));

        Buku psikologi1 = new Buku("Psikologi Kepribadian", "Psikologi", new Penulis("Sigmund Freud"));
        Buku psikologi2 = new Buku("Psikologi Pendidikan", "Psikologi", new Penulis("Jean Piaget"));
        Buku psikologi3 = new Buku("Psikologi Sosial", "Psikologi", new Penulis("Philip Zimbardo"));
        Buku psikologi4 = new Buku("Psikologi Anak", "Psikologi", new Penulis("Lev Vygotsky"));
        Buku psikologi5 = new Buku("Psikologi Perkembangan", "Psikologi", new Penulis("Erik Erikson"));

        Buku politik1 = new Buku("Politik Modern", "Politik", new Penulis("Samuel P. Huntington"));
        Buku politik2 = new Buku("Sistem Politik", "Politik", new Penulis("Robert A. Dahl"));
        Buku politik3 = new Buku("Demokrasi Dunia", "Politik", new Penulis("Francis Fukuyama"));
        Buku politik4 = new Buku("Politik Indonesia", "Politik", new Penulis("Miriam Budiardjo"));
        Buku politik5 = new Buku("Teori Politik", "Politik", new Penulis("Niccolo Machiavelli"));

        Buku fiksi1 = new Buku("Petualangan Nusantara", "Fiksi", new Penulis("Andrea Hirata"));
        Buku fiksi2 = new Buku("Misteri Kota Tua", "Fiksi", new Penulis("Agatha Christie"));
        Buku fiksi3 = new Buku("Legenda Gunung", "Fiksi", new Penulis("Tere Liye"));
        Buku fiksi4 = new Buku("Rahasia Hutan", "Fiksi", new Penulis("J. K. Rowling"));
        Buku fiksi5 = new Buku("Dunia Imajinasi", "Fiksi", new Penulis("J. R. R. Tolkien"));

        Buku[] daftarBuku = {
            teknologi1, teknologi2, teknologi3, teknologi4, teknologi5,
            filsafat1, filsafat2, filsafat3, filsafat4, filsafat5,
            sejarah1, sejarah2, sejarah3, sejarah4, sejarah5,
            agama1, agama2, agama3, agama4, agama5,
            psikologi1, psikologi2, psikologi3, psikologi4, psikologi5,
            politik1, politik2, politik3, politik4, politik5,
            fiksi1, fiksi2, fiksi3, fiksi4, fiksi5
        };

        for (int i = 0; i < daftarBuku.length; i++) {
            daftarBuku[i].tampilkan();
        }

        System.out.println("==================================");

        daftarBuku[0].simpanFile("buku.txt");

        Buku bukuBaru = new Buku("", "", new Penulis(""));
        bukuBaru.bacaFile("buku.txt");

        bukuBaru.tampilkan();

        double royal1 = daftarBuku[0].hitungRoyalti(125000);
        System.out.println("Royalti 10% : " + (int)royal1);

        double royal2 = daftarBuku[0].hitungRoyalti(125000, 20);
        System.out.println("Royalti 15% : " + (int)royal2);
    }
}