public class Main {
    public static void main(String[] args) {
        System.out.println("Introduzione OOP");
        System.out.println();

        /*
        * INTRODUZIONE OOP:
        *
        * - Cos'è la programmazione ad oggetti?
        *
        * - Classi, Metodi e Attributi
        *
        * - Classe con file esterno
        *
        * - Cosa sono gli Oggetti e le Istanze di Classe?
        *
        * - Usare Attributi e Metodi
         */

/*------------------------------------------------------------------------------------------------------*/

        // CHE COS'É LA PROGRAMMAZIONE AD OGGETTI:

        /*
        Programmazione ad oggetti o (OOP= Object Oriented Programing) è una programmazione che si prefissa
        di suddividere un programma secondo diversi tipi di oggetti.
        Creiamo delle entità che esistono nella vita reale e le andiamo a trattare come degli
        oggetti in programmazione---> Esempio: sulla nostra scrivania possiamo avere:
        un mouse, schermi, tastiera, microfono ecc. ognuno di questo è un oggetto e ogni oggetto, ha delle
        caratteristiche specifiche e delle azioni che può eseguire.
        Ogni cosa che esiste nel nostro mondo reale, comprese persone e animali possiamo definirle oggetti
        in programmazione.
        Altro esempio: io oggetto (programmazione) persona fisica e avrò degli attributi:
        nome, cognome, età, genere, altezza, peso, capelli ecc.

        É potrò compiere anche delle azioni, gestite attraverso i metodi e funzioni da usare come
        oggetto persona :
        mangiare, giocare, guidare, dormire, respirare, pensare ecc.

        La sostanza della programmazione ad oggetti è:
        prendere cose che esistono nella vita reale e trasformarle in oggetti nella programmazione, questo ci
        aiuterà a gestire meglio determinate cose, azioni e situazioni
         */

/*--------------------------------------------------------------------------------------------------------*/

        // CREARE UNA CLASSE DOVE GESTIRE UNA NOSTRA ESIGENZA:

        /*
        Oggi andremo a creare una classe Persone dove al suo interno gestiremo appunto una o più persone.
        Come si crea una classe al di fuori del Main?
        Andiamo col cursore su Main o src evidenziamolo, poi tasto destro del mouse, new - Java Class, poi
        nominiamola a bisogno (la prima lettera della classe si consiglia sempre maiuscola, idem a seguire
        se inserissimo più di un nome) poi invio e classe è creata.
         */

/*--------------------------------------------------------------------------------------------------------*/

        // COSA SONO GLI OGGETTI E LE ISTANZE DI CLASSE:
        /*
        Un oggetto è di base un'istanza della classe e l'istanza della classe in sostanza a livello pratico,
        siamo noi che stampiamo su foglio bianco che in quel momento si è trasformato in un oggetto:
        foglio1= persona1 - di tipo Persona= classe---> abbiamo fatto questo dicendo new Persona()= siamo noi
        richiamiamo in toto quello che c'è all'interno della classe Persona creando un oggetto per la futura
        stampa (per come ora è strutturata la classe Persona naturalmente)
         */

/*----------------------------------------------------------------------------------------------------------*/

        // PER PRODURRE L'OGGETTO DOBBIAMO:

        // 1-) metteremo il tipo di classe= Persona, facendo quindi riferimento alla classe
        // 2-) inseriremo poi il nome= persona1
        // 3-) infine inseriremo dopo =new Persona () che è= nuova persona, richiamiamo in sostanza la
        //     classe Persona (creando una 1 persona e le sue relative caratteristiche)
        // 4-) in ultimo mandiamo in stampa= System.out.println(); e all'interno delle () scriveremo:
        //     Esempio 1: (persona1.colorePreferito) richiamando così il valore inserito nel metodo della
        //     classe Persona, potremmo anche voler richiamare tutte le caratteristiche facendo Esempio 2:
        //     (persona1.nome + " " + persona1.cognome + ecc).

        // 5-) Potremmo anche voler richiamare direttamente il metodo:
        //     Scriveremo persona1.cammina(); oppure .saluta(); e manderemo a video quello che abbiamo messo
        //     all'interno del metodo.

/*-------------------------------------------------------------------------------------------------------*/

        /*
        Entrambi gli oggetti che seguono sono delle istanze della classe persona, ma sono allo stesso modo
        anche se (in questo modo) il contenuto è il medesimo sono due oggetti diversi.
         */
        System.out.println("Oggetto 1:");
        Persona persona1 = new Persona(); // Oggetto 1
        System.out.println(persona1.coloPreferito);// Esempio 1: persona1

        System.out.println("Oggetto 2:");
        Persona persona2 = new Persona(); /* Oggetto 2: possiamo creare quanti oggetti di tipo persona che
                                             vogliamo, naturalmente tutte avranno le medesime
                                             caratteristiche */
        System.out.println(persona2.coloPreferito); // Esempio 1: persona2

        System.out.println(persona1.nome + " " + persona1.cognome + " " + persona1. eta + " "
                + persona1.coloPreferito);// Esempio 2: persona1

        System.out.println("La persona 1:");
        persona1.saluta();// 5-) Esempio richiama metodo persona1
        System.out.println("La persona 2:");
        persona2.cammina();// 5-) Esempio richiama metodo persona2


    }
}