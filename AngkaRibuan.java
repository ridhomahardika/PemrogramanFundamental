import java.util.Locale;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int harga = input.nextInt();
    Locale bahasa = new Locale ("id");
    System.out.printf(bahasa, "Rp%,d,-", harga);
  }
}