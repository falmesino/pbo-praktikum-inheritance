// 231232028 - Falmesino Abdul Hamid
public class PengambilanUang extends Tabungan {
  private int proteksi;

  public PengambilanUang(int saldo) {
    super(saldo);
    proteksi = 0;
  }

  public PengambilanUang(int saldo, int proteksi) {
    super(saldo);
    this.proteksi = proteksi;
  }

  @Override
  public boolean ambilUang(int jumlah) {
    if (jumlah <= (getSaldo() - proteksi)) {
      setSaldo(getSaldo() - jumlah);
      return true;
    }

    return false;
  }
}