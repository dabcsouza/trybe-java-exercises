package com.main;

import com.core.Caminhao;

public class Main {
  public static void main (String[] args) {
    Caminhao caminhao1 = new Caminhao("verde", "KDX2280", "Carlos");
    System.out.println(caminhao1.getMotorista());
  }
}
