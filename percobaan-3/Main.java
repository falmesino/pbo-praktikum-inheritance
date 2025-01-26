public class Main {
  public static void main(String[] args) {
    ClassA ortu = new ClassA();
    ClassB anak = new ClassB();

    System.out.println("superclass");

    ortu.setX(10);
    ortu.setY(20);
    ortu.getNilai();

    System.out.println("sub class");

    anak.setX(5);
    anak.setY(4);
    anak.getNilai();
    anak.setZ(50);
    anak.getJumlah();
  }
}