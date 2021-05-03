import java.util.*;

public class MinhaListaOrdenavel
{
    static ArrayList<Pessoa> lista;
    
    public static void add(PessoaIMC p)
    {
        lista.add(p);
    }
    
    public static void get(int i)
    {
        System.out.println(lista(i));
    }

    
    // exemplo
    public Comparator pesoC = new Comparator () {
        public int compare (Object p1, Object p2){ // recebe objetos PessoaIMC como Object
        double pf1, pf2;
        pf2 = (PessoaIMC) p2.getPeso();
        pf1 = (PessoaIMC) p1.getPeso();
        return (int)Math.round (pf2 – pf1);
        }
    }
    
    public ArrayList ordena (int critério) 
    {
        ...switch (critério) {
            case PESO:
                Collections.sort(this.[ArrayList encapsulado] , pesoC);
                // passamos o próprio ArrayList encapusado dentro de MinhaListaOrdenavel
                // e o Comparator correspondente ao critério
            case PESO_REVERSO:
                Collections.sort(this.[ArrayList encapsulado] , pesoC.reversed());
            // observe que a única diferença é a chamada a reversed()
    ...
        return this.[ArrayList encapsulado];
    }
    
}
