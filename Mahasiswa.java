public class Mahasiswa {
    // 1. Atribut
    String nim;
    String nama;
    int sks;
    double ipk;

    // 2. Constructor 
    public Mahasiswa(String nim, String nama, int  sks, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.sks = sks;
        this.ipk = ipk;
}

    // hitungIPKSemester()
 public void hitungIPKSemester(double nilaiAkhir) {
    this.ipk = (this.ipk + nilaiAkhir) / 2;
    }

    // 3. hitungIPKSemester()
    public void hitungIPKSemester(double nilaiAkhir, int bobotSks) {
        this.ipk = ((this.ipk * this.sks) + (nilaiAkhir * bobotSks))
             / (this.sks + bobotSks);

    this.sks = this.sks + bobotSks; // update nilai sks
  }

    // tampilkanData()
    public void tampilkanData() {
        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Total SKS : " + this.sks);
        System.out.println("IPK : " + this.ipk);
        System.out.println("-------");
 }

}