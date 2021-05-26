import java.io.*;
import java.util.*;


public class Main
{
	static String f;
    static int m, n;
    
    static String nome, endereco;
	static int ano, mes, dia, codigo;
	
    static String codigoLivro, tituloLivro, categoria;
    static int quantidade, emprestados;
	
	public static void verificaInt(String s)   // metodo de verificacao de numero inteiro
	{
		
		boolean numeric = true;

		try {	// verifica se e' numero inteiro
		  Integer num = Integer.parseInt(s);
		} catch (NumberFormatException e) {
		  numeric = false;
		}

		if (!numeric)	// se nao e' numero imprime a linha abaixo e sai do programa
		{
		  	System.out.println("O argumento “"+ s +"” nao eh numero inteiro.");
		  	System.exit(0);
		}
		
	}	

	public static void verificaNumero(int n, int inferior, int superior)	// metodo de verificacao do numero de funcionarios (objetos)
	{
		
		if (n<inferior || n>superior)
	    	{
	        	System.out.println("Opcao invalida. Digite um numero de " + inferior + " ate " + superior + ".");
		    	System.exit(0);
	    	}
		
	}
	
	public static void verificaNumero2(int n)	// metodo de verificacao do numero de funcionarios (objetos)
	{
		
		if (n<1 || n>2)
	    	{
	        	System.out.println("Opcao invalida. Digite 1 ou 2.");
		    	System.exit(0);
	    	}
		
	}
	
	
	
	// modulo de manutencao - que cria, abre e salva os arquivos (dois) que contém, cada um, uma
    // Hashtable (livros e usuários);
	public static void criaArquivo(String s)   
	{
        try {
          File myObj = new File(s);
          if (myObj.createNewFile()) {
            System.out.println("Arquivo criado:" + myObj.getName());
          } else {
            System.out.println("Arquivo ja existe.");
          }
        } catch (IOException e) {
          System.out.println("Ocorreu um erro na criacao do arquivo.");
          e.printStackTrace();
        //Biblioteca.salvaArquivo
        //Biblioteca.salvaArquivoL
        }
	}
	
	public static void main(String[] args) throws Exception {
		
		if (args.length>=1) // se o numero de argumentos for igual ou maior a um
	    {
	        System.out.println("Numero de argumentos excessivo.");
		    System.exit(0);
	    }	
		
		Scanner input = new Scanner(System.in);
		
		// testes de entrada
		Usuario usu1 = new Usuario("Carlos", 1990, 8, 1, "Rua", 1546);
		usu1.addLivroHist(2012, 2, 3, 2012, 2, 5, "OSK");
		usu1.addLivroHist(2013, 1, 3, 2012, 2, 3, "OAD");
		
		Usuario usu2 = new Usuario("Felipe", 1991, 1, 21, "Avenida", 2696);
		usu2.addLivroHist(2011, 2, 3, 2011, 2, 5, "OGK");
		
		Usuario usu3 = new Usuario("Renata", 1998, 10, 10, "Estrada", 8552);
		usu3.addLivroHist(2014, 4, 4, 2014, 4, 7, "OLK");
		
		/*Emprestimo emp1 = new Emprestimo(2013, 1, 2, 2013, 2, 4, 177);
		System.out.println(emp1.toString());
		obj.add(obj2);
		
		System.out.println(obj.toString()); */
		
		Livro livro1 = new Livro("ABC", "Os Ventos", "Romance", 2, 1);
		livro1.addUsuarioHist(2010, 1, 10, 2011, 2, 7, 1162);
		livro1.addUsuarioHist(2018, 2, 12, 2020, 2, 7, 9424);
		
		Livro livro2 = new Livro("FGH", "As Nuvens", "Horror", 3, 3);
		
		//System.out.println(usu1.toString()); 
		//System.out.println(livro1.toString()); 
		
		
		
		Biblioteca bibli1 = new Biblioteca(usu1, livro1);
		
		bibli1.cadastraUsuario(usu2);
		bibli1.cadastraUsuario(usu3);
		bibli1.cadastraLivro(livro2);
		
		//Livro livro3 = bibli1.getLivro("AGH");
		
		//livro3.empresta();
		//livro3.devolve();
		
		//System.out.println(livro3.toString()); 
		
		//System.out.println(bibli1.imprimeLivros());
		//System.out.println(bibli1.imprimeUsuarios());
		//bibli1.imprimeUsuarios();
		//bibli1.imprimeLivros();
		
		//bibli1.emprestaLivro(usu1, livro2);
		//System.out.println(usu1.toString());
		
		//bibli1.salvaArquivoL(bibli1.cadastroLivros, "arquivo.txt");
		//bibli1.leArquivo("arquivo.txt");
        
        
        /*
        // selecao de modulo
        System.out.println( "Selecao de modulo:\n" +    
            "1.Manutencao\n" +
            "2.Cadastro\n" +
            "3.Emprestimo\n" +
            "4.Relatorio\n" +
            "Digite sua opcao:");
		*/
		/*
		// modulo manutencao - OK!
		
        System.out.println( "Menu:\n" +    
            "1.Cria arquivos\n" +
            "2.Abre arquivos\n" +
            "3.Salvar arquivos\n" +
            "Digite sua opcao:");
                    
        f = input.nextLine();                            
        verificaInt(f);
        m = Integer.parseInt(f);	// converte para tipo de dados int
        verificaNumero(m, 1, 3);
        
        switch(m) {
            case 1:
                criaArquivo("usuarios.txt");
                criaArquivo("livros.txt");
                break;
            case 2:
                bibli1.leArquivo("usuarios.txt");
                bibli1.leArquivo("livros.txt");
                break;
            case 3:
                bibli1.salvaArquivoU(bibli1.cadastroUsuarios, "usuarios.txt");
                bibli1.salvaArquivoL(bibli1.cadastroLivros, "livros.txt");
                break;
        }
        */
        /*
        // modulo cadastro - OK!
        System.out.println( "Menu:\n" +    
                    "1.Cadastrar usuarios\n" +
                    "2.Cadastrar livros\n" +
                    "3.Salvar em arquivo\n" +
                    "Digite sua opcao:");
                    
        f = input.nextLine();                            
        verificaInt(f);
        m = Integer.parseInt(f);	// converte para tipo de dados int
        verificaNumero(m, 1, 3);
        
        switch(m) {
            case 1:
                // pede campos de usuario
                System.out.println( "Nome:"); 
                nome = input.nextLine();
                
                System.out.println( "Ano de nascimento:");
                f = input.nextLine();                            
                verificaInt(f);
                ano = Integer.parseInt(f);	// converte para tipo de dados int
                verificaNumero(ano, 1990, 2021);
                
                System.out.println( "Mes de nascimento:");
                f = input.nextLine();                            
                verificaInt(f);
                mes = Integer.parseInt(f);	// converte para tipo de dados int
                verificaNumero(mes, 1, 12);
                
                System.out.println( "Dia de nascimento:");
                f = input.nextLine();                            
                verificaInt(f);
                dia = Integer.parseInt(f);	// converte para tipo de dados int
                verificaNumero(dia, 1, 31);                
                
                System.out.println( "Endereco:"); 
                endereco = input.nextLine();
                
                System.out.println( "Codigo:");
                f = input.nextLine();                            
                verificaInt(f);
                codigo = Integer.parseInt(f);	// converte para tipo de dados int
                
                
                Usuario usu4 = new Usuario(nome, ano, mes, dia, endereco, codigo);
                bibli1.cadastraUsuario(usu4);
                
                break;
            case 2:
                // pede campos de livro
                System.out.println( "Codigo:"); 
                codigoLivro = input.nextLine();
                
                System.out.println( "Titulo:"); 
                tituloLivro = input.nextLine();
                
                System.out.println( "Categoria:"); 
                categoria = input.nextLine();
                
                System.out.println( "Quantidade:");
                f = input.nextLine();                            
                verificaInt(f);
                quantidade = Integer.parseInt(f);	// converte para tipo de dados int
                //verificaNumero(quantidade);
                
                System.out.println( "Emprestados:");
                f = input.nextLine();                            
                verificaInt(f);
                emprestados = Integer.parseInt(f);	// converte para tipo de dados int
                //verificaNumero(emprestados);
                
                Livro livro3 = new Livro(codigoLivro, tituloLivro, categoria, quantidade, emprestados);
                bibli1.cadastraLivro(livro3);
                
                break;
            case 3:
                System.out.println( "Menu:\n" +    
                "1.Salvar cadastro de usuarios\n" +
                "2.Salvar cadastro de livros\n" +
                "Digite sua opcao:");
                
                f = input.nextLine();                            
                verificaInt(f);
                n = Integer.parseInt(f);	// converte para tipo de dados int
                verificaNumero(n, 1, 2);
                
                switch(n) {
                    case 1:
                        bibli1.salvaArquivoU(bibli1.cadastroUsuarios, "arquivo.txt");
                        System.out.println("Cadastro de usuarios salvo.");
                        break;
                    case 2:
                        bibli1.salvaArquivoL(bibli1.cadastroLivros, "arquivo.txt");
                        System.out.println("Cadastro de livros salvo.");
                        break;
                }
        }
        */
        
        
        //modulo Emprestimo -- OK!
        System.out.println( "Menu:\n" +    
            "1.Exibir cadastro de livros\n" +
            "2.Fazer emprestimo\n" +
            "3.Fazer devolucao\n" +
            "Digite sua opcao:");
            
        f = input.nextLine();                            
        verificaInt(f);
        m = Integer.parseInt(f);	// converte para tipo de dados int
        verificaNumero(m, 1, 3);
        
        switch(m) {
            case 1:
                System.out.println(bibli1.imprimeLivros());
                break;
            case 2:
                System.out.println( "Codigo do usuario:"); 
                f = input.nextLine();                            
                verificaInt(f);
                codigo = Integer.parseInt(f);	// converte para tipo de dados int
                Usuario usu5 = bibli1.getUsuario(codigo);
                
                System.out.println( "Codigo do livro:"); 
                codigoLivro = input.nextLine();
                Livro livro4 = bibli1.getLivro(codigoLivro);
                
                
                bibli1.emprestaLivro(usu5, livro4); // faz o emprestimo
                
                System.out.println(usu5.toString());
                System.out.println(livro4.toString());
                break;
            case 3:
                System.out.println( "Codigo do usuario:"); 
                f = input.nextLine();                            
                verificaInt(f);
                codigo = Integer.parseInt(f);	// converte para tipo de dados int
                Usuario usu6 = bibli1.getUsuario(codigo);
                
                System.out.println( "Codigo do livro:"); 
                codigoLivro = input.nextLine();
                Livro livro5 = bibli1.getLivro(codigoLivro);
                
                bibli1.devolveLivro(usu6, livro5);  // faz a devolucao
                
                //System.out.println(livro5.get(1).dataEmprestimo.get(Calendar.DATE));
                
                System.out.println(usu6.toString());
                System.out.println(livro5.toString());
        }
        
            
            // 1. bibli1.imprimeLivros();
            // 2. bibli1.emprestaLivro(u, l);
            // 3. bibli1.devolveLivro(u, l);
        
        
        
        /*
        // modulo Relatorio - OK!
        System.out.println( "Menu:\n" +    
            "1.Listar acervo de livros\n" +
            "2.Listar cadastro de usuarios\n" +
            "3.Detalhes de um livro\n" +
            "4.Detalhes de um usuario\n" +
            "Digite sua opcao:");
            
        f = input.nextLine();                            
        verificaInt(f);
        m = Integer.parseInt(f);	// converte para tipo de dados int
        verificaNumero(m, 1, 4);
            
        switch(m) {
            case 1:
                System.out.println(bibli1.imprimeLivros());
                break;
            case 2:
                System.out.println(bibli1.imprimeUsuarios());
                break;
            case 3:
                System.out.println( "Codigo do livro:"); 
                codigoLivro = input.nextLine();
                Livro livro4 = bibli1.getLivro(codigoLivro);
                System.out.println(livro4.toString());
            case 4:
                System.out.println( "Codigo do usuario:"); 
                f = input.nextLine();                            
                verificaInt(f);
                codigo = Integer.parseInt(f);	// converte para tipo de dados int
                Usuario usu5 = bibli1.getUsuario(codigo);
                System.out.println(usu5.toString());                
        }
        */    
	}
}
