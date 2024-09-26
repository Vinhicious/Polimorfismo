package Formas;

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    void calcularArea() {
        double area = Math.PI * raio * raio;
        System.out.println("Área do círculo: " + area);
    }
}