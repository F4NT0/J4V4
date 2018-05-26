/**
 * Classe com as informações que desejamos guardar no arquivo
 */
public class ClasseInfo {
    private String nome;
    private int idade;

    public ClasseInfo(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade(){return idade;}

    public String getNome(){return nome;}
}

