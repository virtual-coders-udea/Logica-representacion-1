public class Persona {
    public String nombre;
    public int edad;
    public char sexo;
    public Double estatura;
    
    public Persona(String nombre, int edad, char sexo, Double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }
}
