package main;
public class Estudiante {
 //Atributos
    private String nombre;
    private int edad;                 
    private String asignatura;
    private char sexo;

//Constructor

    public Estudiante(String nombre, int edad, String asignatura, char sexo) {          
        this.nombre = nombre;
        this.edad = edad;
        this.asignatura = asignatura;
        this.sexo = sexo;
    }

 //METODOS GET Y SET


    public String getNombre() {                
        return nombre;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int setEdad(int edad) {
        this.edad = edad;
        return edad;
    }

    public String getAsignatura() {
        return asignatura;
    }
    public String setAsignatura(String asignatura) {
        this.asignatura = asignatura;
        return asignatura;
    }
    public char getSexo() {
        return sexo;
    }
    public char setSexo(char sexo) {
        this.sexo = sexo;
        return sexo;
    }   

   public void presentarse(){
    System.out.println("Hola, mi nombre es " + nombre + ", tengo " + edad + " años, estudio la asignatura de " + asignatura + " y soy del sexo " + sexo);
   }

   public void despedirse(){
    System.out.println("Adiós, hasta luego");
   }


}