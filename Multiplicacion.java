public class Multiplicacion {
    // nombre de la clase
    private int a,b,r;
    // atributos, que son las variables de tipo entrero
    public int mostrarResultado(int a, int b){
        // metodo o comportamiento del programa que reconoce las variables
    r= this.a * this.b;
    // operacion, usando this, que hace referencia a la variable
    return r;
    // retorna la operacion de arriba para que imprima el resultado
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getR() {
        this.r =this.a * this.b;
        return r;
    }
    public void setR(int r) {
        this.r=r;
    }
    @Override
    public String toString() {
        return "Multiplicacion [a=" + a + ", b=" + b + ", r=" + r + "]";
    }
}
// llaves que cierran