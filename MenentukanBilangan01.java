import java.util.Scanner;

public class MenentukanBilangan01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dan validasi
        System.out.print("Masukkan angka pertama: ");
        if (!input.hasNextDouble()) {
            System.out.println("Input tidak valid. Harus berupa angka.");
            input.close();
            return;
        }
        double a = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        if (!input.hasNextDouble()) {
            System.out.println("Input tidak valid. Harus berupa angka.");
            input.close();
            return;
        }
        double b = input.nextDouble();

        System.out.print("Masukkan angka ketiga: ");
        if (!input.hasNextDouble()) {
            System.out.println("Input tidak valid. Harus berupa angka.");
            input.close();
            return;
        }
        double c = input.nextDouble();

        // Menentukan bilangan terkecil
        double min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        // Menentukan jumlah bilangan yang sama dengan min
        boolean aMin = a == min;
        boolean bMin = b == min;
        boolean cMin = c == min;

        int countMin = (aMin ? 1 : 0) + (bMin ? 1 : 0) + (cMin ? 1 : 0);

        // Output
        if (countMin == 1) {
            System.out.println("Bilangan terkecil adalah: " + min);
        } else {
            System.out.print("Terdapat " + countMin + " bilangan terkecil yang sama: ");
            if (aMin) System.out.print(a + " ");
            if (bMin) System.out.print(b + " ");
            if (cMin) System.out.print(c + " ");
            System.out.println();
        }

        input.close();
    }
}