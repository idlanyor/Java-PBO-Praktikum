class Buku {
    private String judul;
    private String pengarang;

    public Buku() {
        judul = "Tidak Diketahui";
        pengarang = "Tidak Diketahui";
    }

    public Buku(String judul, String pengarang) {
        System.out.println("Konstruktor Buku sedang dijalankan");
        this.judul = judul;
        this.pengarang = pengarang;
    }

    void cetakKeLayar() {
        if (judul == null && pengarang == null)
            return;
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
    }
}

public class Guided_Buku_P2 {
    public static void main(String[] args) {
        Buku a, b = new Buku();
        a = new Buku("Siaga Merah", "Alistair Maclean");
        b = new Buku();
        a.cetakKeLayar();
        b.cetakKeLayar();
    }
}
