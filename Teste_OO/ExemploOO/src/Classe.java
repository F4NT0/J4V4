/**
 * Classe de Teste de Informação sobre toda a matéria vista até agora de Orientação a Objetos
 * Variável genérica: valor
 *
 */
public class Classe {
    private int numero; //iniciado as variaveis dessa classe
    private String nome; //iniciado as Variaveis dessa Classe
    private double valor; //iniciado as variaveis dessa classe

    //método Construtor:

    public Classe(int numero,String nome,double valor){
        this.numero = numero;
        this.nome = nome;
        this.valor = valor;
    }

    //Getters

    public int getNumero(){return numero;}
    public String getNome(){return nome;}
    public double getValor(){return valor;}

    //Setters

    public void setNumero(int numero){this.numero = numero;}
    public void setNome(String nome){this.nome = nome;}
    public void setValor(double valor){this.valor = valor;}




    //toString()

    @Override
    public String toString(){
        return getNumero() + " " + getNome() + " " + getValor();
    }


}
