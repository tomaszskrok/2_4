import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Wybierz operacje: ");
    System.out.println("1 - pole prostokata");
    System.out.println("2 - pole trojkata prostokatnego");
    Scanner scanner = new Scanner(System.in);
    int choose = scanner.nextInt();

    System.out.println("Wprowadz 2 cyfry: ");
    float x = scanner.nextFloat();
    float y = scanner.nextFloat();
    

    if(choose == 1)
    {
      System.out.println("Wynik to: "+ Prostokat(x,y));
    }
    else if(choose == 2)
    {
      System.out.println("Wynik to: "+ Trojkat(x,y));
    }
  } 

public static float Prostokat(float x, float y)
      {
      return x*y;
      }

public static float Trojkat(float x, float y)
      {
      return (x*y)/2;
      }

}
