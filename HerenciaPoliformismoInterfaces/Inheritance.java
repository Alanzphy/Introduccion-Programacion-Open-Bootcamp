package HerenciaPoliformismoInterfaces;

public class Inheritance {
    public static void main(String[] args) {
      Cliente cliente = new Cliente(22, "Juan", 123456789, 322);
      System.out.println(cliente);

      Trabajador trabajador = new Trabajador(40, "Francisco", 123456789, 1234);
      System.out.println(trabajador);
  }
}

class Persona {
  int edad;
  String name;
  int telefono;

}

class Cliente extends Persona {
  int credito;

  public Cliente(int edad, String name, int telefono, int credito) {
    this.edad = edad;
    this.name = name;
    this.telefono = telefono;
    this.credito = credito;
  }

  public String toString() {
    return
        "Cliente{" +
        "\nEdad: " + edad +
        "\nName: " + name +
        "\nTelefono: " + telefono +
        "\nCredito: " + credito +
        "\n}";
  }


}

class Trabajador extends Persona {
  int salario;

  public Trabajador(int edad, String name, int telefono, int salario) {
    this.edad = edad;
    this.name = name;
    this.telefono = telefono;
    this.salario = salario;
  }

  public String toString() {
    return
        "Cliente{" +
        "\nEdad: " + edad +
        "\nName: " + name +
        "\nTelefono: " + telefono +
        "\nSalario: " + salario +
        "\n}";

  }

}
