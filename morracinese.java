import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome del primo giocatore: ");
        String giocatore1 = scanner.nextLine();

        System.out.print("Inserisci il nome del secondo giocatore: ");
        String giocatore2 = scanner.nextLine();


        System.out.print(giocatore1 + ", inserisci la tua scelta (forbice, carta o sasso): ");
        String scelta1 = scanner.nextLine();


        System.out.print(giocatore2 + ", inserisci la tua scelta (forbice, carta o sasso): ");
        String scelta2 = scanner.nextLine();


        if (!scelta1.equals("forbice") && !scelta1.equals("carta") && !scelta1.equals("sasso") || !scelta2.equals("forbice") && !scelta2.equals("carta") && !scelta2.equals("sasso")) {
            System.out.println("Errore: scelta non valida!");

        } else if (scelta1.equals("forbice") && scelta2.equals("carta") || scelta1.equals("carta") && scelta2.equals("sasso") || scelta1.equals("sasso") && scelta2.equals("forbice")) {
                System.out.println("Il vincitore è: " + giocatore1);

        } else if (scelta2.equals("forbice") && scelta1.equals("carta") || scelta2.equals("carta") && scelta1.equals("sasso") || scelta2.equals("sasso") && scelta1.equals("forbice")) {
                System.out.println("Il vincitore è: " + giocatore2);

        } else {
                System.out.println("Pareggio!");
     } 
    }
  }
