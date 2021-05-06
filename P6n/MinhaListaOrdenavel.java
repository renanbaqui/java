import java.util.*;

public class MinhaListaOrdenavel
{
    public ArrayList<PessoaIMC> lista;
    
    MinhaListaOrdenavel()
    {
        this.lista = new ArrayList<PessoaIMC>(10);
    }
    
    public void adi(PessoaIMC p)    // VERIFICAR add
    {
        this.lista.add(p);
    }
    
    
    public PessoaIMC geti(int i)    // VERIFICAR get
    {
        return this.lista.get(i);
    }
    
    class nomeC implements Comparator<PessoaIMC> 
    {
        public int compare(PessoaIMC p1, PessoaIMC p2) // recebe objetos PessoaIMC
        { 
	        String nome1 = p1.getNome().toUpperCase();
	        String nome2 = p2.getNome().toUpperCase();
            return nome1.compareTo(nome2);
        }
    }

    
    class pesoC implements Comparator<PessoaIMC> 
    {
        public int compare(PessoaIMC p1, PessoaIMC p2) // recebe objetos PessoaIMC
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
        public int compare(PessoaIMC p1, PessoaIMC p2) // recebe objetos PessoaIMC
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
        public int compare(PessoaIMC p1, PessoaIMC p2) // recebe objetos PessoaIMC
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
            case 1: // nome crescente
            Collections.sort(this.lista, new nomeC());      // e' passado o proprio ArrayList dentro de MinhaListaOrdenavel
            break;       
            case 2: // nome decrescente
            Collections.sort(this.lista, Collections.reverseOrder(new nomeC())); // a unica diferença e' a chamada a reverseOrder()
            break;
            case 3: // peso crescente
                Collections.sort(this.lista, Collections.reverseOrder(new pesoC())); 
            break;
            case 4: // peso decrescente
                Collections.sort(this.lista, new pesoC());      
            break;                                              
            case 5: // altura crescente
                Collections.sort(this.lista, Collections.reverseOrder(new alturaC())); 
            break;
            case 6: // altura decrescente
                Collections.sort(this.lista, new alturaC());      
            break;
            case 7: // imc crescente
                Collections.sort(this.lista, Collections.reverseOrder(new imcC())); 
            break;
            case 8: // imc decrescente
                Collections.sort(this.lista, new imcC());      
            break;
        }
        return this.lista;
    }
    
}