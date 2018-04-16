public class switchCaseClasse implements Imprimir{ //implementado a classe interface imprimir
    private int valor1; //iniciado a variavel privada valor1
    private int valor2; //iniciado a variavel privada valor2

    public switchCaseClasse(int valor1,int valor2){
        this.valor1 = valor1; //iniciado a variavel dentro do contrutor
        this.valor2 = valor2; //iniciado a variavel dentro do construtor
    }

    //Métodos Getter e Setters das variaveis:

    /**
     * Método para retornar o valor1 para outras classes
     * @return valor1
     */
    public int getValor1(){return valor1;}

    /**
     * Método para retornar o valor2 para outras classes
     * @return valor2
     */
    public int getValor2(){return valor2;}

    /**
     * Método para alterar o valor1 para usar outro valor
     * @param valor1
     */
    public void setValor1(int valor1){this.valor1 = valor1;}

    /**
     * Método para alterar o valor2 para usar outro valor
     * @param valor2
     */
    public void setValor2(int valor2){this.valor2 = valor2;}

    //Método para utilizar o switch-case:

    public void switchCase(int valor1,int valor2){
        switch(valor1+valor2){
            case 10 : System.out.println("O resultado foi 10");
                      break;

            case 20 : System.out.println("O resultado foi 20");
                      break;

            case 30 : System.out.println("O resultado foi 30");
                break;

            case 40 : System.out.println("O resultado foi 40");
                break;

            case 50 : System.out.println("O resultado foi 50");
                break;

            case 60 : System.out.println("O resultado foi 60");
                break;

            case 70 : System.out.println("O resultado foi 70");
                break;

            case 80 : System.out.println("O resultado foi 80");
                break;

            case 90 : System.out.println("O resultado foi 90");
                break;

            case 100 : System.out.println("O resultado foi 100");
                break;

            default : System.out.println("Não deu um valor inteiro até 100");
        }
    }

    /**
     * Este método foi implementado através da classe Interface Imprimir
     * ele nesta classe só retorna o valor das variaveis que foram usados no método switchCase
     */
    public void imprimir(){
        System.out.println(getValor1() + " + " + getValor2() + " : ");
    }


}
