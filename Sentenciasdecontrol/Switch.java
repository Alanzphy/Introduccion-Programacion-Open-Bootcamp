package Sentenciasdecontrol;
public class Switch {
  public static void main(String[] args) {
    String estacion = "verano";

    switch (estacion) {
      case "invierno":
        System.out.println("Estamos en invierno");
        break;
      case "primavera":
        System.out.println("Estamos en primavera");
        break;
      case "verano":
        System.out.println("Estamos en verano");
        break;
      case "otoño":
        System.out.println("Estamos en otoño");
        break;
      default:
        System.out.println("No es ninguna estacion");
        break;
    }
  }

}
