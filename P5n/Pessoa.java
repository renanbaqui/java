public class Pessoa
{
    
    private String nome, dataNascimento;
    //private GregorianCalendar dataNascimento; //data de nascimento
    
    Pessoa(String n, String d)
    {
        this.nome = n;
        this.dataNascimento = d;
    }
    
    public String toString()
    {
        return  "Nome: " + this.nome + "\n" +
                "Data de Nascimento: " + this.dataNascimento;
    }
    
}
