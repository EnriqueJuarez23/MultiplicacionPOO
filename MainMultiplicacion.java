import java.util.Scanner;
// entrad de librreria
public class MainMultiplicacion {
    // nombre de la clase
    public static void main(String[]args){
        // metodo main
        Scanner opc = new Scanner(System.in);
        // estructura del metodo constructor
        System.out.println("Ingresa un numero");
        // impresion de mensaje
        int a= opc.nextInt();
        // lectura del tipo de variable
        System.out.println("Ingresa otro numero");
        // impresion de mensaje
        int b= opc.nextInt();
        // lectura del tipo de dato
        Multiplicacion mul= new Multiplicacion();
        mul.setA(a);
        mul.setB(b);
        mul.getR();
        System.out.println("El resultado de la multiplicacion:"+mul.toString());
     // impresion del mensaje concatenado al comportamiento
}
}
// llaves que cierran