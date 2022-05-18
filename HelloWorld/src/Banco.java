class ContaBancaria {
  public void depositar(int valor) {
    System.out.println(valor);
  }
}

public class Banco {
  public static void main (String[] args) {
    ContaBancaria obj = new ContaBancaria();
    obj.depositar(500);
  }
}