/**
 * Esta classe foi criada para testar os tipos diferentes de if-else que podem ser implementados
 * A ideia é que ele retorne um boolean dependendo se os valores são iguais ou nao
 */
public class ifelseClasse implements Imprimir{//feita a implementação da classe interface Imprimir

    private int valor1; //iniciado uma variável privada para adicionar um valor
    private int valor2; //iniciado uma variável privada para adicionar um valor
    private boolean resposta;

    /**
     * Método construtor da classe, onde são iniciados as variaveis privadas
     * @param valor1
     * @param valor2
     */
    public ifelseClasse(int valor1,int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    //Métodos getters e setters para poder mexer com os valores das variáveis

    /**
     * Método que retorna o valor1 para outras classes e métodos fora dessa classe
     */
    public int  getValor1(){return valor1;}

    /**
     * Método que retorna o valor2 para outras classes e métodos fora dessa classe
     */
    public int  getValor2(){return valor2;}

    /**
     * Método para retornar a String  da resposta
     */
    public boolean getResposta(){return resposta;}

    /**
     * Método para alterar o valor de valor1 para poder fazer diferentes testes
     */
     public void  setValor1(int val1){valor1 = val1;}

    /**
     * Método para alterar o valor de valor2 para poder fazer diferentes testes
     */
     public void setValor2(int val2){valor2 = val2;}


     //Métodos de if-else diferentes para se entender as construções:


    /**
     * Método de if-else onde verifica se o valor1 é igual ou maior que o valor2, utilizando sua construcao comum
     * @param v1
     * @param v2
     *
     */
    public boolean  testeIfElseComum(int v1, int v2){
         if(v1 == v2) {resposta = true; return resposta;}
         else{resposta = false; return resposta;}

    }

    /**
     * Método para verificar se os valores são iguais ou não, usando um if-else sem chaves
     * @param v1
     * @param v2
     *
     */
    public boolean testeIfElseSemChaves(int v1,int v2){
        if(v1 == v2)
            resposta = true;
        else
           resposta = false;

        return resposta;

    }

    /**
     * Método para verificar se os valores são iguais ou não, usando um if-else com condição
     * @param v1
     * @param v2
     *
     */
    public boolean testeIfElseCondicao(int v1,int v2){
        resposta = (v1 == v2)?true:false;
        return resposta;
    }


    /**
     * Foi inicializado o método da classe interface Imprimir
     * neste caso ele só imprimi os numeros e a resposta em booleano para testes
     * @return
     */
    public void imprimir(){
        System.out.println(getValor1() + " " + getValor2());
    }


}
