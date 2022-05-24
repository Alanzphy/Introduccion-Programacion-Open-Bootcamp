package Privacidadencapsulacionabstraccion;

public class encapsulation {
  public static void main(String[] args) {

    Persona persona = new Persona();

    persona.setNombre("Juan");
    System.out.println("Me llamo " + persona.getNombre());

    persona.setEdad(20);
    System.out.println("Tengo " + persona.getEdad());

    persona.setTelefono(123456789);
    System.out.println("Puedes comunicarte conmigo al " + persona.getTelefono());
  }
}

  class Persona {
    private int edad;
    private String name;
    private int telefono;

    public int setEdad(int edad) {
      return this.edad = edad;
    }

    public int getEdad() {
      return this.edad;
    }

    public String setNombre(String name) {
      return this.name = name;
    }

    public String getNombre() {
      return this.name;
    }

    public int setTelefono(int telefono) {
      return this.telefono = telefono;
    }

    public int getTelefono() {
      return this.telefono;
    }
  }

