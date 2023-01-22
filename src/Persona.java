public class Persona {

    // CLSSE CRETA: ORA LAVORIAMO SULLA CLASSE PERSONA INSERENDO LE CARATTERISTICHE

    // Attributi= caratteristiche della classe
    String nome = "Emanuele";
    String cognome = "Belfiori";
    int eta = 42;
    String coloPreferito = "Viola";

    // ORA CREIAMO IL METODO: Che è la funzione delle classi
    /*Una funziona scritta in un altro contesto al di fuori di una classe è semplicemente una funzione, invece
      scritta dentro una classe è un metodo= un'azione che esegue quella classe in sostanza*/

    void saluta(){
        System.out.println("Ciao sono " + nome);
    }
    void cammina(){
        System.out.println(nome + " sta camminando");
    }

    /* Così com'è abbiamo solo definito la persona ma non ha modo di relazionarsi con la classe Main, o
       fare in autonomia alcuna cosa.
        Potremmo definire la classe Persona come una traccia per poi andare a definire più persone */

}
