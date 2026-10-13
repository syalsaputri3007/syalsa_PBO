import java.util.HashMap;

public class MainInventaris {
    public static void main(String[] args) {
        // 3. Gunakan HashMap<String, Produk> sebagai storage utama
        HashMap<String, Produk> mapInventaris = new HashMap<>();

        // 4. Tambahkan minimal 5 produk ke dalam HashMap
        mapInventaris.put("P001", new Produk("P001", "Mouse", 50));
        mapInventaris.put("P002", new Produk("P002", "Keyboard", 100));
        mapInventaris.put("P003", new Produk("P003", "Monitor", 30));
        mapInventaris.put("P004", new Produk("P004", "Laptop", 45));
        mapInventaris.put("P005", new Produk("P005", "Charger", 25));

        // 6. Simulasi Alur: Cetak Awal
        System.out.println("=== DAFTAR INVENTARIS AWAL ===");
        cetakInventaris(mapInventaris);

        // 6. Simulasi Alur: Ubah stok via .get(kode).setStok()
        // Contoh: Mengubah stok Buku Tulis (P001) dari 50 menjadi 75
        System.out.println("\n-> Mengubah stok P001 (Buku Tulis) menjadi 75...");
        if (mapInventaris.containsKey("P001")) {
            mapInventaris.get("P001").setStok(75);
        }

        // 6. Simulasi Alur: Hapus satu produk via .remove(kode)
        // Contoh: Menghapus Penghapus Karet (P003)
        System.out.println("-> Menghapus P003 (Penghapus Karet) dari inventaris...\n");
        mapInventaris.remove("P003");

        // 6. Simulasi Alur: Cetak Akhir
        System.out.println("=== DAFTAR INVENTARIS AKHIR ===");
        cetakInventaris(mapInventaris);
    }

    // Method pembantu untuk melakukan iterasi & menghitung total stok
    public static void cetakInventaris(HashMap<String, Produk> mapInventaris) {
        int totalStok = 0;

        // 5. Iterasi dengan For-Each menggunakan for (String key : mapInventaris.keySet())
        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);
            System.out.println(p.getKodeProduk() + " - " + p.getNama() + " - stok: " + p.getStok());
            
            // Menghitung total stok dengan variabel akumulator di dalam loop
            totalStok += p.getStok();
        }

        System.out.println("----------------------------------------");
        System.out.println("Total Keseluruhan Stok: " + totalStok);
        System.out.println();
    }
}