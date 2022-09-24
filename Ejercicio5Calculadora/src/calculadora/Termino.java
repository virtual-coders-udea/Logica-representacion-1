
package calculadora;

public class Termino 
{
    double numero;
    String operador;

    public Termino(double numero, String operador) {
        this.numero = numero;
        this.operador = operador;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    
}
