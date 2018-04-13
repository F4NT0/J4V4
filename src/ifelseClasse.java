public class ifelseClasse {

    private int valor1; //iniciado uma variável privada para adicionar um valor
    private int valor2; //iniciado uma variável privada para adicionar um valor
    private String resposta;

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
    public String getResposta(){return resposta;}

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
     * Método de if-else onde verifica se o valor1 é igual que o valor2, utilizando sua construcao comum
     * @param valor1
     * @param valor2
     *
     */
    public void  testeIfElseComum(int valor1, int valor2){
         if(valor1 == valor2) {
             resposta = "Valor1 é igual o Valor2";

         }
         else{
             resposta =  "Valor1 não é igual o valor2";

         }
    }

    /**
     * Método para verificar se os valores são iguais ou não, usando um if-else sem chaves
     * @param valor1
     * @param valor2
     *
     */
    public void  testeIfElseSemChaves(int valor1,int valor2){
        if(valor1 == valor2)
            resposta = "Valor1 é igual o Valor2";
        else
           resposta = "Valor1 não é igual o Valor2";

    }

    /**
     * Método para verificar se os valores são iguais ou não, usando um if-else com condição
     * @param valor1
     * @param valor2
     *
     */
    public void testeIfElseCondicao(int valor1,int valor2){
        resposta = (valor1 == valor2)?"Valor1 é igual o Valor2":"Valor1 não é igual o Valor2";
    }

    @Override
    public String toString(){
        return getResposta() + " e o Valor1 vale " + getValor1() + " Valor2 vale " + getValor2();
    }



}
