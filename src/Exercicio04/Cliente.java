package Exercicio04;

public class Cliente extends Pessoa {

    private String cpf;


    public Cliente(String nome, int idade, String cidadeDeNascimento, String cpf) {
        super(nome, idade, cidadeDeNascimento);
        this.cpf = cpf;
    }


    public void exibirdados(String nome, int idade, String cidadeDeNascimento, String cpf) {
        super.exibirdados(nome, idade, cidadeDeNascimento);
        System.out.println("e meu cpf é "+ cpf);
    }
}
