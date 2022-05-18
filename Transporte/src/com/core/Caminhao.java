package com.core;

public class Caminhao extends Veiculo {
  public Caminhao(String cor, String placa, String motorista) {
    super(cor, placa, motorista);
  }

  @Override
  public void implementar() {
    System.out.println("implementei o abstract");
  }
}
