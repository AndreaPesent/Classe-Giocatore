public class Giocatore
{
    private String Nome="";
    private boolean Capitano;
    private int Gol;
    public void InfoGiocatore(String nome, boolean capitano, int gol)
    {
        Nome=nome;
        Capitano=capitano;
        Gol=gol;
    }
    public String GetNome()
    {
        return Nome;
    }
    public boolean GetCapitano()
    {
        return Capitano;
    }
    public int GetGol()
    {
        return Gol;
    }
}