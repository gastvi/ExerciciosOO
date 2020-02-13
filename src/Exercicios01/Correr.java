package Exercicios01;

public class Correr {

   private int distancia;
   private int velocidade;
   private int energia;

    public Correr(int distancia, int velocidade, int energia) {
        this.distancia = distancia;
        this.velocidade = velocidade;
        this.energia = energia;
    }


    public void correr(){
    System.out.println("energia atual: "+ energia);
    distancia = energia / velocidade;
       energia -= 5;
        System.out.println("corrida terminada");
        System.out.println("energia atual: "+ energia);
        System.out.println("dstancia corrida: "+ distancia);
        System.out.println("---------------------------------------------");
    }

    public void treinar() {
        if (energia >= 20) {
            System.out.println("energia atual: " + energia);
            energia -= 20;
            System.out.println("treinamento concluido");
            System.out.println("energia atual: " + energia);
            System.out.println("---------------------------------------------");
        } else {
            System.out.println("sem energia pro treino.");
            System.out.println("---------------------------------------------");
        }
    }


    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
