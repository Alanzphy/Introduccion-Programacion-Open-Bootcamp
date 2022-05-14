

  public class ClaseCoche {

    public static void main(String[] args) {
      Coche miCoche = new Coche();
      miCoche.AumentarPuertas();
      System.out.println("El total de puertas es de " + miCoche.puertas);
    }
  }


  class Coche {
    public int puertas = 4;
    public void AumentarPuertas(){
      puertas = puertas + 1;
    };
  }










  // public class ClaseCoche {

  // public static void main(String[] args) {

  //   Coche miCoche = new Coche();
  //   miCoche.AumentarPuertas();
  //   System.out.println("El coche tiene " + miCoche.puertas + " puertas");


  // }

  // public class Coche {

  //   public int puertas = 4;
  //   public void AumentarPuertas() {
  //     puertas = puertas + 1;
  //   };

  // }

// }
