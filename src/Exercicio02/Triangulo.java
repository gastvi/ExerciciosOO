package Exercicio02;

public class Triangulo {

    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        int area;
        area =this.altura*this.base;
        area = area / 2;
        System.out.println("valor da area: "+area);
    }



    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


}
