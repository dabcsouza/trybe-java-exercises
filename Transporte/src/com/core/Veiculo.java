package com.core;

abstract public class Veiculo {
  private String cor;
  private String placa;
  private String motorista;

  public Veiculo(String cor, String placa, String motorista) {
    this.cor = cor;
    this.placa = placa;
    this.motorista = motorista;
  }

  public abstract void implementar ();

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getMotorista() {
    return motorista;
  }

  public void setMotorista(String motorista) {
    this.motorista = motorista;
  }
}
