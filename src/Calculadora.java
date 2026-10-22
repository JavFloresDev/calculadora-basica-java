import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2;
        String operacion;
        boolean salida=false;
        System.out.println("***********Calculadora****************");
        System.out.println("Escribir -> (num1) (signo) (num2)");
        System.out.println("Escribir 'salir' para salir.");
        while(!salida){
            System.out.print("---> ");
            try{
                numero1=entrada.nextFloat();
                operacion=entrada.next();
                numero2=entrada.nextFloat();
                switch (operacion) {
                    case "+":
                        System.out.println(numero1+numero2);
                        break;
                    case "-":
                        System.out.println(numero1-numero2);
                        break;
                    case "*":
                        System.out.println(numero1*numero2);
                        break;
                    case "/":
                        if (numero2==0) {
                            System.out.println("No se puede dividir entre 0...");
                        }else{
                            System.out.println(numero1/numero2);
                        }
                        break;
                    default:
                        System.out.println("Vuelve a intentar...");
                        break;
                }
            }catch(InputMismatchException e){
                String linea=entrada.next().toLowerCase();
                if(linea.equals("salir")){
                    salida=true;
                }else{
                    System.out.println("vuelve a intentar...");
                }
                entrada.nextLine();
            }
        }
        System.out.println("Adios...");
        entrada.close();
        }
    }
//InputMismatchException