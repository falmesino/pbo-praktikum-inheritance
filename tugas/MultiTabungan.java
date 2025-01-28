/**
 * 231232028 - Falmesino Abdul Hamid
 * https://spada.swadharma.ac.id/mod/assign/view.php?id=21711
 * 
 * Kembangkan kelas Tabungan diatas sehingga memungkinkan pengguna untuk memilih satuan
 * mata uang yang berbeda (USD, AUD, IDR) ketika mengambil atau menyimpan uang.
 * Saldo tabungan disimpan dalam satuan IDR oleh sistem. Beri nama kelas anda dengan
 * nama MultiTabungan.java. Diasumsikan bahwa:
 * 1 AUD = 10.000 IDR
 * 1 USD = 9.000 IDR
 * Buat kelas baru untuk mengetes kelas MultiTabungan yang anda buat!
 */

public class MultiTabungan {
  private int saldo;

  public MultiTabungan(int saldo) {
    this.saldo = saldo;
  }

  public int getSaldo() {
    return this.saldo;
  }

  private int konversiRupiah(int jumlah, String mataUang) {
    switch (mataUang) {
      case "IDR":
        return jumlah;
      case "AUD":
        return jumlah * 10000; // 1 AUD = 10,000 IDR
      case "USD":
        return jumlah * 9000; // 1 USD = 9,000 IDR
      default:
        System.out.println("Mata uang " + mataUang + " tidak didukung!");
        return -1;
    }
  }

  public void simpanUang(int jumlah, String mataUang) {
    int jumlahRupiah = konversiRupiah(jumlah, mataUang);
    if (jumlahRupiah == -1) return;

    this.saldo += jumlahRupiah;
    System.out.println("Uang berhasil disimpan! Saldo saat ini: IDR" + this.saldo);
  }

  public boolean ambilUang(int jumlah, String mataUang) {
    int jumlahRupiah = konversiRupiah(jumlah, mataUang);
    if (jumlahRupiah == -1) return false;

    if (jumlahRupiah <= this.saldo) {
      this.saldo -= jumlahRupiah;
      System.out.println("Penarikan berhasil! Saldo saat ini: IDR" + this.saldo);
      return true;
    }

    System.out.println("Saldo tidak mencukupi!");
    return false;
  }
}