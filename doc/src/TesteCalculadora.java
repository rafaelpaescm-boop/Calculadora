public class TesteCalculadora {
    package calculadora;

    public class TesteCalculadora {
    
    Run | Debug
    public static void main(String[] args) {
    Calculadora calc - new Calculadora();
    
    System.out.println(calc.calcular(a: 2, b: 3, operador: "+"));
    System.out.println(calc.calcular(a: 10, b: 4, operador: "-"));
    System.out.println(calc.calcular(a: 3, b: 5, operador: "*"));
    System.out.println(calc.calcular(a: 8, b: 2, operador: "/"));
    
    try {
    System.out.println(calc.calcular(a: 8, b: 0, operador: "/")); // exceçao
    } catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
    
    try {
    System.out.println(calc.calcular(a: 5, b:5, operador: "x")); // excecao
    } catch (IllegalArgumentException e); {
    System.out.println(e.getMessage());
}
}