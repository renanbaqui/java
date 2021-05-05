import java.util.*;

public class MinhaListaOrdenavel
{
    public ArrayList<PessoaIMC> lista;
    
    MinhaListaOrdenavel()
    {
        this.lista = new ArrayList<PessoaIMC>(10);
    }
    
    public void adi(PessoaIMC p)
    {
        this.lista.add(p);
    }
    
    
    public PessoaIMC geti(int i)
    {
        return this.lista.get(i);
    }

    
    class pesoC implements Comparator<PessoaIMC> 
    {
        public int compare(PessoaIMC p1, PessoaIMC p2) // recebe objetos PessoaIMC como objeto
        { 
            double pf1, pf2;
            pf1 = p1.getPeso();
            pf2 = p2.getPeso();
            int resultado = (int)(pf2-pf1);
            return resultado;
        }
    }
    
    class alturaC implements Comparator<PessoaIMC> 
    {
        public int compare(PessoaIMC p1, PessoaIMC p2) // recebe objetos PessoaIMC como objeto
        { 
            double pf1, pf2;
            pf1 = p1.getAltura();
            pf2 = p2.getAltura();
            int resultado = (int)(100*(pf2-pf1));
            return resultado;
        }
    }
    
    class imcC implements Comparator<PessoaIMC> 
    {
        public int compare(PessoaIMC p1, PessoaIMC p2) // recebe objetos PessoaIMC como objeto
        { 
            double pf1, pf2;
            pf1 = p1.calculaIMC(p1.getAltura(), p1.getPeso());
            pf2 = p2.calculaIMC(p2.getAltura(), p2.getPeso());
            int resultado = (int)(100*(pf2-pf1));
            return resultado;
        }
    }
    
    
    public ArrayList<PessoaIMC> ordena(int criterio) 
    {
        switch (criterio){
            case 3: // peso crescente
                Collections.sort(this.lista, Collections.reverseOrder(new pesoC())); // observe que a única diferença é a chamada a reversed()
            break;
            case 4: // peso decrescente
                Collections.sort(this.lista, new pesoC());      // passamos o próprio ArrayList encapusado dentro de MinhaListaOrdenavel
            break;                                              // e o Comparator correspondente ao critério
            case 5: // altura crescente
                Collections.sort(this.lista, Collections.reverseOrder(new alturaC())); // observe que a única diferença é a chamada a reversed()
            break;
            case 6: // altura decrescente
                Collections.sort(this.lista, new alturaC());      // passamos o próprio ArrayList encapusado dentro de MinhaListaOrdenavel
            break;
            case 7: // imc crescente
                Collections.sort(this.lista, Collections.reverseOrder(new imcC())); // observe que a única diferença é a chamada a reversed()
            break;
            case 8: // imc decrescente
                Collections.sort(this.lista, new imcC());      // passamos o próprio ArrayList encapusado dentro de MinhaListaOrdenavel
            break;
        }
        return this.lista;
    }
    
}