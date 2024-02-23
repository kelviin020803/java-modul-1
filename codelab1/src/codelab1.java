import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class codelab1 {
    public static void main(String[] kevin) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        String jenis_kelamin_input = scanner.nextLine();
        String jenis_kelamin;
        if (jenis_kelamin_input.equalsIgnoreCase("L")) {
            jenis_kelamin = "Laki laki";
        } else if (jenis_kelamin_input.equalsIgnoreCase("P")) {
            jenis_kelamin = "Perempuan";
        } else {
            System.out.println("Jenis kelamin tidak valid.");
            return;
        }
        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggal_lahir_input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tanggal_lahir;
        try {
            tanggal_lahir = LocalDate.parse(tanggal_lahir_input, formatter);
        } catch (Exception e) {
            System.out.println("Tanggal lahir tidak valid.");
            return;
        }
        Period period = Period.between(tanggal_lahir, LocalDate.now());
        int umur_tahun = period.getYears();
        int umur_bulan = period.getMonths();

        System.out.println("\nNama: " + nama);
        System.out.println("Jenis Kelamin: " + jenis_kelamin);
        System.out.println("Umur Anda: " + umur_tahun + " tahun " + umur_bulan + " bulan");
    }
}