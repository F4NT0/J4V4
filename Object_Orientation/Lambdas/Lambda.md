# Lambdas

* Conceito adicionado no Java8

* A grande vantagem de funções lambda é diminuir a quantidade de código necessária para escrever alguma função

* Uma função lambda é uma função sem declaração(não é necessário um nome, tipo de retorno e o modificador de acesso)

*  A idéia é que o método seja declarado no mesmo lugar em que será usado

* As funções lambdas em Java tem a sintaxe definica como:
    * (argumento) -> (corpo) 
    
* Exemplo de Expressão Lambda Simples:

```java
 (int a,int b) -> {return a + b;}
 
 () -> System.out.println("Hello World");

 
(String s) -> {System.out.println(s);}

```

* Uma função Lambda pode ter nenhum ou vários parâmetros
* A função lambda pode ter nenhum ou vários comandos
* Se tiver somente um comando, as chaves não são obrigatórias
* Se nada for retornado a função retorna um void

# Threads

* Threads são utilizadas para simplificar o código
* Cada processo possui diversas threads(linhas de instruções)
* Podemos dividir partes do nosso processo(Programa Java) para trabalhar paralelamente
* Se voçê deseja que o programa não "trave o usuário" naquele determinado procedimento que pode demorar, Use threads

* Como se usa:
   * Primeiro é criada uma implementação do método run da interface Runnable
   * Segundo é criada a Thread com essa implementação.
   * Com a expressão lambda, o código necessário para a implementação é bastante simples e menor
   * Ex:
   
```java
Runnable r = () -> System.out.println("Thread com função Lambda!");
new Thread(r).start();
```
   * Essa expressão não passa nenhum parâmetro, pois ela será passada para a função run
   * Pode-se fazer também é passar a função diretamente como parâmetro para o construtor da classe Thread
   * Funções lambdas podem ser definidas e passadas como parâmetros diretamente para outros métodos
   
   ````java
 new Thread(() -> System.out.println("Hello World")).start();
````

# Funções lambdas com Collections

* Lambdas podem ser bastantes utilizadas com as classes de Coleções Java
* Pode-se percorrer a coleção, fazer uma ação, filtrar elementos, etc...
* Exemplo de como percorrer uma lista e imprimir os valores
* Foi usado um ForEach para percorrer a lista
````java
List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7);
for(Integer n : lista){
    System.out.println(n);
}
````
* Com as funções lambdas é possivel implementar a mesma funcionalidade com menos código
* Basta chamar o método forEach de uma lista, que é um método que espera uma função lambda como parâmetro
* Exemplo de uma impressão de elementos de uma lista com Lambda
````java
List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7);
lista.forEach(n -> System.out.println(n));
````

* Dentro de uma expressão Lambda qualquer coisa pode ser usada
* Pode-se extender uma expressão lambda com {}
* Exemplo de imprimir valores pares de uma lista:
````java
List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
lista.forEach(n -> {
    if(n % 2 == 0){
     System.out.println(n);
    }
});
````
   
# Usando Lambdas com Objetos

* Funções Lambdas podem ser utilizadas também para a ordenação de listas com a interface comparator
* Podemos usar Lambdas com Objetos também
* Exemplo de uma classe pessoa, onde coloca o nome e idade:
````java
public class Pessoas{
    private String nome;
    private int idade;
    
    public Pessoas(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){return nome;}
    public int getIdade(){return idade;}
}
````
* Se quisermos ordenar em ordem alfabética os nomes:
````java
List<Pessoas> listaPessoas = Arrays.asList(new Pessoas("Gabriel",22),new Pessoas("Alexandre",30),new Pessoas("Douglas",22));
Collections.sort(listaPessoas,(Pessoas pessoa1,Pessoas pessoa2) -> {
    pessoa1.getNome().compareTo(pessoa2.getNome())
});
listaPessoas.forEach(p -> System.out.println(p.getNome()));
````
* Se quisermos ordenar em ordem de idade:
````java
List<Pessoas> listaPessoas = Arrays.asList(new Pessoas("Gabriel",22),new Pessoas("Alexandre",30),new Pessoas("Douglas",22));
Collections.sort(listaPessoas,(Pessoas pessoa1,Pessoas pessoa2) -> {
    pessoa1.getIdade().compareTo(pessoa2.getIdade())
});
listaPessoas.forEach(p -> System.out.println(p.getNome()))
````