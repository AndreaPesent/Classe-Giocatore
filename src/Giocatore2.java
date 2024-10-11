import java.util.Scanner;
public class Giocatore2
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner (System.in);
        int scelta=0;
        String Nome="";
        boolean ISCapitano;
        String Capitano="";
        int Gol=0;
        Giocatore [] giocatori=new Giocatore[10];
        do
            {
                System.out.println("SCEGLI UNA DELLE SEGUENTI OPZIONI");
                System.out.println("1- Aggiunta giocatore alla squadra");
                System.out.println("2- Visualizzazione giocatori della squadra");
                System.out.println("3- Modifica dati giocatore");
                System.out.println("4- Cancellazione di un giocatore");
                System.out.println("5- Visualizzazione giocatori con più di 5 gol");
                System.out.println("6- Visualizzazione nome capitano");
                System.out.println("7- Assegnazione ruolo capitano in maniera casuale");
                scelta=in.nextInt();
                switch (scelta)
                {
                    case 1:
                            System.out.println("Inserisci il nome del giocatore");
                            Nome=in.next();
                            System.out.println("Il giocatore è capitano? - true/false");
                            ISCapitano=in.nextBoolean();
                            System.out.println("Inserisci il numero di gol del giocatore");
                            Gol=in.nextInt();
                            break;

                    case 2:
                            System.out.println(Lettura(giocatori));
                            break;

                    case 3:

                            System.out.println("Inserisci la satistica che vuoi cambiare");

                }
            } while (scelta!=8);
    }
    public static void Aggiungi(String Nome, boolean ISCapitano, int Gol, Giocatore [] giocatori)
    {
        for (int i=0;i<5;i++)
        {
            giocatori[i].setNome(Nome);
            giocatori[i].setCapitano(ISCapitano);
            giocatori[i].setGol(Gol);
        }
    }
    public static String Lettura(Giocatore [] giocatori)
    {
        String Statistiche="";
        for (int i=0;i<5;i++)
        {
           Statistiche+=giocatori[i].getNome() + ", " + giocatori[i].getCapitano() + ", " + giocatori[i].getGol() +"\n";
        }
        return Statistiche;
    }
    public static void Modifica(String Nome, int Gol, Giocatore[]giocatori, boolean ISCapitano)
    {

    }
}