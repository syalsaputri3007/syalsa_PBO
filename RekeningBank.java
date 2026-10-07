public class RekeningBank {
    // 01 - ATTRIBUTE (Enkapsulasi: private)
    private String noRekening;
    private String namaPemilik;
    private double saldo;

    // 02 - STATIC VARIABLE
    public static int totalRekening = 0;

    // 03 - CONSTRUCTOR + VALIDASI
    public RekeningBank(String noRekening, String namaPemilik, double saldoAwal) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;

        // Validasi saldo awal minimal Rp 50.000
        if (saldoAwal >= 50000) {
            this.saldo = saldoAwal;
        } else {
            System.out.println("Gagal membuat rekening untuk " + namaPemilik + ": Saldo awal minimal Rp 50.000!");
            this.saldo = 0;
        }

        // Increment counter rekening yang berhasil dibuat
        totalRekening++;
    }

    // 04 - METHOD
    // Getter
    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    // Method Transaksi
    public void setor(double nominal) {
        if (nominal > 0) {
            saldo += nominal;
            System.out.println("Setor Rp " + nominal + " ke " + namaPemilik + " berhasil. Saldo saat ini: Rp " + saldo);
        } else {
            System.out.println("Nominal setor harus lebih dari 0!");
        }
    }

    public void transfer(double nominal, RekeningBank tujuan) {
        if (nominal <= 0) {
            System.out.println("Nominal transfer tidak valid!");
        } else if (this.saldo >= nominal) {
            this.saldo -= nominal;
            tujuan.saldo += nominal;
            System.out.println("Transfer Rp " + nominal + " dari " + this.namaPemilik + " ke " + tujuan.getNamaPemilik() + " BERHASIL.");
        } else {
            System.out.println("Transfer GAGAL! Saldo " + this.namaPemilik + " tidak mencukupi. (Saldo saat ini: Rp " + this.saldo + ")");
        }
    }
}