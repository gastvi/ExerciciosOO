package Exercicio04;

public class Funcionario extends Pessoa {

    private int numeroDeMatricula;

    public Funcionario(String nome, int idade, String cidadeDeNascimento, int numeroDeMatricula) {
        super(nome, idade, cidadeDeNascimento);
        this.numeroDeMatricula = numeroDeMatricula;
    }


}
