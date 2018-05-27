/**
 * Esta Classe serve para testar os laços while e do-while
 */
public class WhileDoWhile implements Imprimir{
    private int valor1;
    private int valor2;
    private boolean teste;

    public WhileDoWhile(int valor1,int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    //métodos Getters e Setters das variáveis:

    /**
     * Método para retornar o valor de valor1 em outras classes ou métodos
     * @return valor1
     */
    public int getValor1(){return valor1;}

    /**
     * Método para retornar o valor de valor2 em outras classes ou métodos
     * @return valor2
     */
    public int getValor2(){return valor2;}

    /**
     * Método para retornar o valor booleano de teste da classe
     * @return
     */
    public boolean getTeste(){return teste;}

    /**
     * Método para alterar o valor da variavel valor1
     * @param valor1
     */
    public void setValor1(int valor1){this.valor1 = valor1;}

    /**
     * Método para alterar o valor da variavel valor2
     * @param valor2
     */
    public void setValor2(int valor2){this.valor2 = valor2;}

    /**
     * Método para alterar o valor booleano de teste para se usar em outras classes ou métodos
     * @param teste
     */
    public void setTeste(boolean teste){this.teste = teste;}

    //métodos que fazem o while e do-while:

    /**
     * Neste método queremos que o while fique somando dois valores enquanto teste for verdadeiro
     * para que teste fique falso, o valor entrado no método deve ser menor que a soma
     * no final deve ser entregue o número de vezes que foi iniciado o while por um contador
     * @param valor
     * @return
     */
    public int testeWhile(int valor,WhileDoWhile a){
        int cont = 0;
        int valor1 = a.getValor1();
        int valor2 = a.getValor2();
        boolean teste = a.getTeste();
        while(teste){
            int soma = 0;
            if(soma < valor){
                valor1++;
                valor2++;
                soma = valor1 + valor2;
                return soma;
            }else{teste = false;}
            cont++;
        }
        return cont;
    }

    public void imprimir(){
        System.out.println("Valor1: " + getValor1() + " Valor2: " + getValor2() + " Teste: " + getTeste());
    }


}
