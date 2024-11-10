package geometrico;

public class Quadrado extends ObjetoGeometrico {
  private double lado;

  Quadrado(double l) {
    lado = l;
  }

  public double getArea() {
    area = lado * lado;
    return area;
  }

  public double getPerimetro() {
    return 4 * lado; // Calcula o perímetro diretamente
  }
}
