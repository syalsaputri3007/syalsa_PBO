public class MainBank {
    public static void main(String[] args) {
        System.out.println("=== TEST SCENARIO REKENING BANK ===\n");

        // 1. Buat 2 objek RekeningBank
        RekeningBank rek1 = new RekeningBank("101", "ika", 150000);
        RekeningBank rek2 = new RekeningBank("102", "syalsa", 100000);

        System.out.println("Total Rekening Terdaftar: " + RekeningBank.totalRekening);
        System.out.println("----------------------------------------------");

        // Display Saldo Awal
        System.out.println("Saldo Awal " + rek1.getNamaPemilik() + ": Rp " + rek1.getSaldo());
        System.out.println("Saldo Awal " + rek2.getNamaPemilik() + ": Rp " + rek2.getSaldo());
        System.out.println("----------------------------------------------");

        // 2. Simulasi Transfer Berhasil (rek1 transfer ke rek2)
        System.out.println("\n--- SIMULASI TRANSFER SUCCESS ---");
        rek1.transfer(50000, rek2);
        System.out.println("Saldo " + rek1.getNamaPemilik() + " Sekarang: Rp " + rek1.getSaldo());
        System.out.println("Saldo " + rek2.getNamaPemilik() + " Sekarang: Rp " + rek2.getSaldo());

        // 3. Simulasi Transfer Gagal (saldo tidak mencukupi)
        System.out.println("\n--- SIMULASI TRANSFER GAGAL (OVERDRAW) ---");
        rek1.transfer(200000, rek2); // Saldo rek1 tinggal 100.000
        System.out.println("Saldo " + rek1.getNamaPemilik() + " Akhir: Rp " + rek1.getSaldo());

        // Display Total Akhir Rekening dari Class Variable
        System.out.println("\n----------------------------------------------");
        System.out.println("Jumlah Total Rekening Aktif (Static): " + RekeningBank.totalRekening);
    }
}