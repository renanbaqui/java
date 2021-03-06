package lp2g48.biblioteca;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.time.*;


class LivroNaoCadastradoEx 
  extends RuntimeException {
    public LivroNaoCadastradoEx(String errorMessage) {
        super(errorMessage);
    }
}

class UsuarioNaoCadastradoEx 
  extends RuntimeException {
    public UsuarioNaoCadastradoEx(String errorMessage) {
        super(errorMessage);
    }
}


public class Biblioteca
{
    // campo para o cadastro de usuários contendo um objeto da classe java.util.Hashtable
    public Hashtable<Integer, Usuario> cadastroUsuarios = new Hashtable();
    // um campo para o cadastro de livros contendo um objeto da classe java.util.Hashtable.
    public Hashtable<String, Livro> cadastroLivros = new Hashtable();
    
    Calendar cal = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();
    
    
    // construtor que inicialize todos os campos - OK!
    public Biblioteca(Usuario u, Livro l)
    {
        this.cadastroUsuarios.put(u.getCodigoUsuario(), u);
        this.cadastroLivros.put(l.getCodigoLivro(), l);
    }
    
    public Hashtable<Integer, Usuario> getCadastroUsuarios(){ return this.cadastroUsuarios; }
    public Hashtable<String, Livro> getCadastroLivros(){ return this.cadastroLivros; }
    
    //um construtor que carregue o cadastro de usuários e o cadastro de livros salvos em dois arquivos distintos
    public Biblioteca()
    {
        try {
          File myObj = new File("usuarios.txt");
          if (myObj.createNewFile()) {
            System.out.println("Arquivo criado:" + myObj.getName());
          } else {
            System.out.println("Arquivo ja existe.");
          }
        } catch (IOException e) {
          System.out.println("Ocorreu um erro na criacao do arquivo.");
          e.printStackTrace();
        }
        
        try {
          File myObj = new File("livros.txt");
          if (myObj.createNewFile()) {
            System.out.println("Arquivo criado:" + myObj.getName());
          } else {
            System.out.println("Arquivo ja existe.");
          }
        } catch (IOException e) {
          System.out.println("Ocorreu um erro na criacao do arquivo.");
          e.printStackTrace();
        }
    }
    
    // cadastraUsuário: de retorno void, que recebe como parâmetro um objeto da classe Usuário e o armazena 
    // no objeto Hashtable correspondente. O código do usuário deve ser utilizado como chave - OK!
    public void cadastraUsuario(Usuario u)
    {
        this.cadastroUsuarios.put(u.getCodigoUsuario(), u);
    }
    
    // cadastraLivro: de retorno void, recebe como parâmetro um objeto da classe Livro e
    // o armazena no objeto Hashtable correspondente; O código do Livro deve ser usado como chave - OK!
    public void cadastraLivro(Livro l)
    {
        this.cadastroLivros.put(l.getCodigoLivro(), l);
    }
    // salvaArquivo: de retorno void, recebe como parâmetros um objeto da classe Hashtable 
    // (que pode ser o cadastro de usuários ou o acervo de livros) e um objeto da classe 
    // String contendo o nome do arquivo onde o outro parâmetro será salvo
    public void salvaArquivoU(Hashtable<Integer, Usuario> c, String n) // salvaArquivo dos Usuarios // - OK!
    {
        try {
            FileWriter myWriter = new FileWriter(n);
            myWriter.write(c.toString());
            myWriter.close();
            System.out.println("Escreveu no arquivo " + n + " com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro na escrita do arquivo.");
            e.printStackTrace();
        }
    }
    
    public void salvaArquivoL(Hashtable<String, Livro> c, String n) // salvaArquivo dos Livros  // PARCIALMENTE OK! 
    {                                                                                           // deveria ser mesmo nome salvaArquivo
        try {
            FileWriter myWriter = new FileWriter(n);
            
            myWriter.write(c.toString());
            myWriter.close();
            System.out.println("Escreveu no arquivo " + n + " com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro na escrita do arquivo.");
            e.printStackTrace();
        }
    }
    
    // lêArquivo: de retorno void, recebe como parâmetros um objeto da classe String contendo o 
    // nome do arquivo a ser lido (como o construtor, mas que pode ser chamado a qualquer hora, 
    // e lê somente o acervo de livros ou o cadastro de usuários); - PARCIALMENTE OK - Lê o arquivo todo, não somente o acervo ou cadastro
    public void leArquivo(String n)
    {
        try {
            File myObj = new File(n);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();  // cria string 'data' e salva o conteudo do arquivo nele
            System.out.println(data);           // imprime o conteudo do string 
          }
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("Ocorreu um erro na leitura do arquivo.");
          e.printStackTrace();
        }
    }
    // emprestaLivro: recebe como parâmetros a referência a um objeto Usuário e a referência a um 
    // objeto da classe Livro. (as referências já devem ter sido validadas – obtidas através dos métodos 
    // getLivro e getUsuário – veja observação abaixo). Chama o método empresta no objeto Livro e atualiza 
    // o histórico no objeto Usuário chamando addLivroHist. A data do empréstimo é obtida consultando o 
    // relógio/calendário do sistema no momento da operação; - OK!
    public void emprestaLivro(Usuario u, Livro l) throws Exception
    {
        
        FileReader reader = new FileReader("parametros.properties");
        Properties p = new Properties();
        p.load(reader); // carrega o parametro
        int dias = Integer.parseInt(p.getProperty("dias")); // converte o parametro para int
        
        l.empresta();
        ++l.emprestados;    // adiciona a quantidade de um livro emprestado

        cal2.add(Calendar.DATE, dias); // adiciona os dias que o livro pode ser emprestado
        
        l.addUsuarioHist(cal.get(Calendar.YEAR), (cal.get(Calendar.MONTH)+1), cal.get(Calendar.DAY_OF_MONTH), cal2.get(Calendar.YEAR), (cal2.get(Calendar.MONTH)+1), cal2.get(Calendar.DAY_OF_MONTH), u.codigoUsuario);
        u.addLivroHist(cal.get(Calendar.YEAR), (cal.get(Calendar.MONTH)+1), cal.get(Calendar.DAY_OF_MONTH), cal2.get(Calendar.YEAR), (cal2.get(Calendar.MONTH)+1), cal2.get(Calendar.DAY_OF_MONTH), l.codigoLivro);
        
        //System.out.println(cal.get(Calendar.YEAR)+" " +(cal.get(Calendar.MONTH)+1)+" "+cal.get(Calendar.DAY_OF_MONTH));
    }
    
    
    // devolveLivro: o mesmo definido para o método anterior, só que chama o método devolve no 
    // objeto Livro. Aqui, no entanto, se você implementou a personalização direito, pode ser 
    // verificado se o usuário está devolvendo o livro com atraso e avisar de uma multa;
    public void devolveLivro(Usuario u, Livro l) // - OK!
    {
        l.devolve();
        --l.emprestados;    // retira um livro emprestado
        
        //l.get.dataDevolucao.get(Calendar.DATE)
        
        /*if(!l.get(l.getHistorico().size()-1).dataEmprestimo.get(Calendar.DATE).after(cal.get(Calendar.DATE))) {
            System.out.println("Multa!"); 
        }*/
        
        if(!l.get(l.getHistorico().size()-1).dataDevolucao.after(cal)) {    // compara a data de devolucao cadastrada com o dia de hoje e imprime aviso de multa
            System.out.println("Devolucao com atraso. Aviso de multa."); 
        }
        else{
            System.out.println("Devolucao sem atraso. Sem multa.");
        }
        
        //System.out.println(l.getHistorico().size()); // tamanho da ArrayList historico do objeto Livro
        
        // usar EmprestadoPara get
        l.addUsuarioHist(l.get(l.getHistorico().size()-1).dataEmprestimo.get(Calendar.YEAR), (l.get(l.getHistorico().size()-1).dataEmprestimo.get(Calendar.MONTH)+1), l.get(l.getHistorico().size()-1).dataEmprestimo.get(Calendar.DAY_OF_MONTH), 
                        cal.get(Calendar.YEAR), (cal.get(Calendar.MONTH)+1), cal.get(Calendar.DAY_OF_MONTH), u.codigoUsuario);
        u.addLivroHist(l.get(l.getHistorico().size()-1).dataEmprestimo.get(Calendar.YEAR), (l.get(l.getHistorico().size()-1).dataEmprestimo.get(Calendar.MONTH)+1), l.get(l.getHistorico().size()-1).dataEmprestimo.get(Calendar.DAY_OF_MONTH), 
                        cal.get(Calendar.YEAR), (cal.get(Calendar.MONTH)+1), cal.get(Calendar.DAY_OF_MONTH), l.codigoLivro);
       
       
       //u.addLivroHist(cal.get(Calendar.YEAR), (cal.get(Calendar.MONTH)+1), cal.get(Calendar.DAY_OF_MONTH));
    }
    
    // String imprimeLivros(): Devolve uma string com a lista de livros cadastrados, ordenados pelo título; - OK!
    public String imprimeLivros()
    {
        ArrayList<String> lista = new ArrayList<String>();
        
        String ordenado = "";
        
        this.cadastroLivros.forEach((k, v) -> {
  
            lista.add(v.tituloLivro);
        });
        
        Collections.sort(lista);
        
        for (int i = 0; i < lista.size(); i++) 
            ordenado = ordenado + lista.get(i) + "\n";
        
        return ordenado;
    }

    // String imprimeUsuários(): Devolve uma string com a lista de usuários cadastrados, ordenados pelo nome; - OK!
    //public String imprimeUsuarios()
    public String imprimeUsuarios()
    {
        ArrayList<String> lista = new ArrayList<String>();
        
        String ordenado = "";
        
        this.cadastroUsuarios.forEach((k, v) -> {
  
            lista.add(v.nome);
        });
        
        Collections.sort(lista);
        
        for (int i = 0; i < lista.size(); i++) 
            ordenado = ordenado + lista.get(i) + "\n";
        
        return ordenado;
    }
    // Livro getLivro (String cód): Recebe o código do livro e obtém o objeto Livro da Hashtable correspondente. 
    // Se o livro não estiver cadastrado, deve gerar a exceção LivroNaoCadastradoEx; - OK!
    public Livro getLivro(String cod)
    {
        if (cadastroLivros.containsKey(cod)) 
        {
            Livro l = cadastroLivros.get(cod);
            return l;
        }
        else
        {
            throw new LivroNaoCadastradoEx("Livro nao cadastrado.");
        }    
    }
    // Usuário getUsuário (int cód): Recebe o código do usuário e obtém o objeto Usuário da Hashtable correspondente. 
    // Se o usuário não existir na Hashtable, deve gerar a exceção UsuárioNaoCadastradoEx. - OK!
    public Usuario getUsuario(int cod)
    {
        if (cadastroUsuarios.containsKey(cod)) 
        {
            Usuario u = cadastroUsuarios.get(cod);
            return u;
        }
        else
        {
            throw new UsuarioNaoCadastradoEx("Usuario nao cadastrado.");
        }    
    }
}