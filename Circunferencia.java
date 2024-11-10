package geometrico;

public class Circunferencia extends ObjetoGeometrico {
  private double pi = 3.141618;
  private double raio;

  Circunferencia(double r) {
    raio = r;
  }

  public double getArea() {
    area = pi * (raio * raio);
    return area;
  }

  public double getPerimetro() {
    return 2 * pi * raio; // Calcula o perímetro diretamente
  }
}
