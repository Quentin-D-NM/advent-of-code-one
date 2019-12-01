package dev.queuedye;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    double total = 0;
    double mass;
    BufferedReader reader;
    try {
      reader = new BufferedReader(new FileReader(
          "input2"));
      String line = reader.readLine();
      while (line != null) {
        mass =  Double.parseDouble(line);
        total += calcFuel(mass);
        line = reader.readLine();
      }
      reader.close();
      System.out.println(total);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  //1969
  public static int calcFuel(double mass) {
    int totalFuelForModuel = 0;
    int fuel = (int) Math.floor(mass / 3) - 2;
    totalFuelForModuel += totalFuelForModuel;
    while((Math.floor(fuel / 3) - 2) > 0) {
      fuel = (int) Math.floor(mass / 3) - 2;
      mass = fuel;
      totalFuelForModuel += fuel;
    }
    return totalFuelForModuel;
  }

}
