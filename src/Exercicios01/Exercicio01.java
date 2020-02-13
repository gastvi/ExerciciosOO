package Exercicios01;

public class Exercicio01 {

    public static void main(String[] args) {
        Correr objcorrer1 = new Correr(10, 15, 100);
        Correr objcorrer2 = new Correr(40, 5, 80);
        Correr objcorrer3 = new Correr(70, 25, 10);


    objcorrer1.correr();
    objcorrer1.treinar();
    objcorrer2.correr();
    objcorrer2.treinar();
    objcorrer3.correr();
    objcorrer3.treinar();
    }
}
