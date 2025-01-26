public class Child extends Parent {
  int x;

  public Child() {
    super(); // Dipindah paling atas, karena super() harus di paling atas
    x = 5;
  }
}