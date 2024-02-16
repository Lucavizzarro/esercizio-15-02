import java.util.Random;
import java.util.Scanner;
public class OperazioniConMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int [] array = new int [100];
        int scelta;
        Random random = new Random();
        int pos;
        int n = 0;
        do{
            System.out.println("inserisci 1 per inserire i numeri dell'array");
            System.out.println("inserisci 2 per inserire numeri random nell'array");
            System.out.println("inserisci 3 per stampare i numeri dell'array");
            System.out.println("inserisci 4 per inserire un numero nell'array");
            System.out.println("inserisci 5 per rimuovere un numero dall'array");
            System.out.println("inserisci 6 per uscire dal programma");
            scelta = in.nextInt();
            switch(scelta){
                case 1:
                    System.out.println("quanti numeri vuoi inserire?");
                    n = in.nextInt();
                    for(int i = 0; i < n; i++){
                        System.out.println("inserisci il " + (i+1) + "° numero");
                        array[i] = in.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("quanti numeri random vuoi inserire?");
                    n = in.nextInt();
                    for(int i = 0; i < n; i++){
                        array[i] = random.nextInt(51);
                    }
                    break;
                case 3:
                    for(int i = 0; i < n; i++){
                        System.out.println(array[i]);
                    }
                    break;
                case 4:
                    n++;
                    System.out.println("in che posizione vuoi inserire il numero?");
                    pos = in.nextInt();
                    for(int i = n-1; i>0;i--){
                        array[i] = array[i+1];
                    }
                    System.out.println("inserisci il numero");
                    int num = in.nextInt();
                    array[pos-1] = num;
                    break;
                case 5:
                    n--;
                    System.out.println("in che posizione vuoi rimuovere il numero?");
                    pos = in.nextInt();
                    array[pos-1] = 0;
                    break;
                case 6:
                    break;
                default:
                    System.out.println("numero non valido");
                    break;
            }
        }while(scelta!=6);
    }
}
