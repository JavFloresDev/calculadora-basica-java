import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, resultado;
        String operacion;
        System.out.println("***********Calculadora****************");
        System.out.println("Escribir -> (num1) (signo) (num2) \n_Escribir (0 : 0) para salir:: ");
        do {
            System.out.print("----> ");numero1=entrada.nextInt();operacion=entrada.next();numero2=entrada.nextInt();
            switch(operacion){
                case "+":
                    resultado=numero1+numero2;System.out.println(resultado);
                    break;
                case "-":
                    resultado=numero1-numero2;System.out.println(resultado);
                    break;
                case "*":
                    resultado=numero1*numero2;System.out.println(resultado);
                    break;
                case "/":
                    if (numero2==0){
                        System.out.println("Syntax error...");
                    }else{
                        resultado=numero1/numero2;System.out.println(resultado);
                    }
                    break;
                case ":":
                    break;
                default:
                    System.out.println("Error:");
                    break;
            }
        } while(!":".equals(operacion));
        System.out.println("Hasta luego...");
    }
}
