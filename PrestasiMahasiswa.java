import java.util.Scanner;

public class PrestasiMahasiswa {
    static String[][] prestasi = new String[250][5]; 
    static int jumlahData = 0; 
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Tambah Prestasi");
            System.out.println("2. Tampilkan Prestasi");
            System.out.println("3. Analisis Prestasi");
            System.out.println("4. Keluar");
            System.out.println();
            System.out.print("Pilih menu : ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 
            
            if (pilihan == 1) {
                tambahPrestasi();
            }  else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
                break;
            }
        }
    }

    static void tambahPrestasi() {

        String nama, nim, jenisPrestasi, tingkatPrestasi, tahunPrestasi;

        System.out.print("Masukkan Nama Mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Jenis Prestasi: ");
        jenisPrestasi = sc.nextLine();
        
        while (true) {
            System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
            tingkatPrestasi = sc.nextLine();
            if (tingkatPrestasi.equalsIgnoreCase("Lokal") ||
                tingkatPrestasi.equalsIgnoreCase("Nasional") ||
                tingkatPrestasi.equalsIgnoreCase("Internasional")) {
                break;
            } else {
                System.out.println("Input Tingkat Prestasi tidak valid. Coba lagi!");
            }
        }
        while (true) {
            System.out.print("Masukkan Tahun Prestasi (2010 - 2024) : ");
            tahunPrestasi = sc.nextLine();

            int tahun = Integer.parseInt(tahunPrestasi);
            if (tahun >= 2010 && tahun <= 2024) {
                break;
            } else {
                System.out.println("Tahun tidak valid. Coba lagi!");
            }
        }

        prestasi[jumlahData][0] = nama;
        prestasi[jumlahData][1] = nim;
        prestasi[jumlahData][2] = jenisPrestasi;
        prestasi[jumlahData][3] = tingkatPrestasi;
        prestasi[jumlahData][4] = tahunPrestasi;
        jumlahData++;

        System.out.println("Prestasi berhasil ditambahkan.");
    }
}
