class DemoObjectOriented {
    public void helloWorld(int jmlh_looping) {
        System.out.println("\n-Display Hello World-\n");
        for (int i = 0; i < jmlh_looping; i++) {
            System.out.println(+(i + 1) + " Hello World ...");
        }
    }

    public int tambah(int bil1, int bil2) {
        return (bil1 + bil2);
    }

}

/**
 * Guided-1
 */
public class Guided_I {

    public static void main(String[] args) {
        int jumlah_looping = 5;
        int bil1 = 5;
        int bil2 = 2;
        DemoObjectOriented Demo = new DemoObjectOriented();
        Demo.helloWorld(jumlah_looping);
        System.out.println("\n-Pemanggilan Fungsi Tambah-\n");
        System.out.println("Hasil Operasi Tambah : " + Demo.tambah(bil1, bil2));
    }
}