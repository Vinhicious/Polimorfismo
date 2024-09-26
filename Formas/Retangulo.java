package Formas;

class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    void calcularArea() {
        double area = largura * altura;
        System.out.println("Área do retângulo: " + area);
    }
}
