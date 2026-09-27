public class MainAkademik {

    public static void main(String[] args) {

        // Membuat 2 objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa(
            "126780902",
            "Naufal iklil",
            24,
            3.65
        );

        Mahasiswa mhs2 = new Mahasiswa(
            "7363734198",
            "Syalsa putri",
            20,
            3.50
        );

        // Menampilkan data sebelum nilai ditambahkan
        System.out.println("=== DATA SEBELUM NILAI DITAMBAHKAN ===");
        
        System.out.println("\nMahasiswa 1");
        mhs1.tampilkanData();

        System.out.println("\nMahasiswa 2");
        mhs2.tampilkanData();

        // Memanggil overloading versi 1
        mhs1.hitungIPKSemester(3.75);

        // Memanggil overloading versi 2
        mhs2.hitungIPKSemester(3.75, 3);

        // Menampilkan data setelah nilai ditambahkan
        System.out.println("\n=== DATA SESUDAH NILAI DITAMBAHKAN ===");

        System.out.println("\nMahasiswa 1");
        mhs1.tampilkanData();

        System.out.println("\nMahasiswa 2");
        mhs2.tampilkanData();


    }
}
