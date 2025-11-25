public class TesteCalculadora {

    public static void main(String[] args) {


        /**
*  Exemplo de utilização da classe Calculadora.
*
*  Cria uma instância de {@code Calculadora} e realiza
*  diferentes operações matemáticas usando o método {@code calcular}.
*/
//Calculadora calc = new Calculadora();

// Imprime o resultado da soma: 2 + 3
//System.out.println(calc.calcular(2, 3, "+"));

// Imprime o resultado da subtração: 2 - 3
//System.out.println(calc.calcular(2, 3, "-"));

// Imprime o resultado da multiplicação: 2 * 3
//System.out.println(calc.calcular(2, 3, "*"));

// Imprime o resultado da divisão: 2 / 3
//System.out.println(calc.calcular(2, 3, "/"));


        Calculadora calc = new Calculadora();
        System.out.println(calc.calcular( 2, 3, "+"));
        System.out.println(calc.calcular( 2, 3, "-"));
        System.out.println(calc.calcular( 2, 3, "*"));
        System.out.println(calc.calcular( 2, 3, "/"));
        

/**
*  Executa operações matemáticas utilizando o método {@code calcular}
*  da classe {@code Calculadora} e exibe os resultados no console.
*
*  Cria uma instância de {@code Calculadora} chamada {@code calc}.
*
*  Em seguida, realiza quatro operações:
*
*  1. {@code calc.calcular(2, 3, "+")}  
*     - Executa a soma entre 2 e 3.
*     - O resultado é impresso no console.
*
*  2. {@code calc.calcular(2, 3, "-")}  
*     - Executa a subtração entre 2 e 3.
*     - O resultado é impresso no console.
*
*  3. {@code calc.calcular(2, 3, "*")}  
*     - Executa a multiplicação entre 2 e 3.
*     - O resultado é impresso no console.
*
*  4. {@code calc.calcular(2, 3, "/")}  
*     - Executa a divisão entre 2 e 3.
*     - O resultado é impresso no console.
*
*  Cada operação demonstra o uso do método {@code calcular}
*  com diferentes operadores: "+", "-", "*" e "/".
*/

        

        
        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());



            /**
*  Demonstra o tratamento de exceção ao tentar realizar uma operação inválida
*  usando o método {@code calcular} da classe {@code Calculadora}.
*
*  1. {@code calc.calcular(5, 5, "x")}  
*     - Tenta executar uma operação com o operador "x", que não é suportado.
*     - Isso gera uma {@code IllegalArgumentException}.
*
*  2. O bloco {@code try-catch} captura a exceção lançada.
*     - {@code catch (IllegalArgumentException e)} intercepta a exceção.
*     - {@code System.out.println(e.getMessage())} exibe a mensagem de erro
*       no console.
*
*  Esse exemplo mostra como lidar com operadores inválidos e evitar que
*  o programa seja interrompido por uma exceção não tratada.
*/

        }
        try {
            System.out.println(calc.calcular( 5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}