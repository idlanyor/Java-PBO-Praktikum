import java.util.Scanner;

class Mahasiswa {
    private String Nama[] = new String[3];
    private String NIM[] = new String[3];
    private int i;

    public void inputData() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("-Input Data Mahasiswa-");
            for (i = 0; i < 3; i++) {
                System.out.println("Masukkan Nama : ");
                Nama[i] = input.nextLine();
                System.out.println("Masukkan NIM : ");
                NIM[i] = input.nextLine();
            }
            input.close();
        } catch (Exception E) {
            System.out.println("Error : " + E.getMessage());
        }
    }

    public void display() {
        System.out.println("\n-Display Data Mahasiswa-");
        for (i = 0; i < 3; i++) {
            System.out.println("Nama : " + Nama[i]);
            System.out.println("NIM : " + NIM[i]);
            System.out.println("");
        }
    }
}

public class Guided_II_Mahasiswa {
    public static void main(String[] args) {
        Mahasiswa M = new Mahasiswa();
        M.inputData();
        M.display();
    }
}
