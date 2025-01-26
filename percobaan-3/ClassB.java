public class ClassB extends ClassA {
  private int z;

  public void getJumlah() {
    // Pakai getter buat x dan y supaya keambil nilainya
    System.out.println("Jumlah: " + (super.getX() + super.getY() + z));
  }

  public void setZ(int z) {
    this.z = z;
  }
}