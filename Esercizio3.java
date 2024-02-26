import java.util.Scanner;

public class Esercizio3 {
public static void main(String[] args) {

/*Scrivi un programma Java che restituisce il numero di giorni di un mese dato in input dall’utente.
Il mese è dato sotto forma di intero, ad esempio 3 corrisponde a marzo. Ignorare gli anni bisestili. */

    Scanner scanner = new Scanner(System.in);

        // Richiedi all'utente di inserire il numero del mese
        System.out.print("Inserisci il numero del mese (1-12): ");
        int numeroMese = scanner.nextInt();

        // Verifica se il numero del mese è valido (1-12)
        if (numeroMese < 1 || numeroMese > 12) {
            System.out.println("Numero del mese non valido.");
            return;
        }

        // Determina il numero di giorni del mese
        int numeroGiorni;
        switch (numeroMese) {
            case 2: // Febbraio
                numeroGiorni = 28;
                break;
            case 4: // Aprile
            case 6: // Giugno
            case 9: // Settembre
            case 11: // Novembre
                numeroGiorni = 30;
                break;
            default:
                numeroGiorni = 31; // Mesi con 31 giorni di default
                break;
        }

        // Visualizza il numero di giorni del mese
        System.out.println("Il mese " + numeroMese + " ha " + numeroGiorni + " giorni.");

}
}