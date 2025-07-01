package aula09ExercicioPraticoPOO;

public class Livro implements Publicacao{

	//Atributos
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//Metodo Construtor
	
	public Livro(String ti, String au, int tp, Pessoa le) {
		setTitulo(ti);
		setAutor(au);
		setAberto(false);
		this.setTotPaginas(tp);
		this.setLeitor(le);
		
	}
	
	//metodo Especiais
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String t) {
		this.titulo = t;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String a) {
		this.autor = a;
	}
	
	public int getTotPaginas() {
		return this.totPaginas;
	}	
	
	public void setTotPaginas(int t) {
		this.totPaginas = t;
	}
	
	public int getPagAtual() {
		return this.pagAtual;
	}
	
	public void setPagAtual(int p) {
		this.pagAtual = p;
	}
	
	public boolean getAberto() {
		return this.aberto;
	}
	
	public void setAberto(boolean a) {
		this.aberto = a;
	}
	
	public Pessoa getLeitor() {
		return this.leitor;
	}
	
	public void setLeitor(Pessoa l) {
		this.leitor = l;
	}
	
	//Metodos Abstratos
	
	@Override
	
	public void abrir() {
		this.setAberto(true);
		System.out.println("Livro Esta Aberto.");
		//this.setPagAtual(1);
		
		
	}

	@Override
	
	public void fechar() {
		this.setAberto(false);
		System.out.println("Livro Esta Fechado.");
	}

	@Override
	public void folhear(int p) {
		
		if(this.getAberto()) {
		
		if(p > 0 && p <= getTotPaginas()) {
				setPagAtual(p);
				System.out.println("Livro Folheado, Esta na Pagina " + this.getPagAtual());
			}

		else if(p > this.getTotPaginas()){
			System.out.println("Impossivel Folhear, o Total de Paginas é: " + this.getTotPaginas());
			fechar();
		}
		
		else {
			System.out.println("Impossivel Folhear, Livro Esta Fechado...1");
			fechar();
		}
		
		}
		
		else {
			System.out.println("Impossivel Folhear, Livro Esta Fechado...2");
			fechar();
		}

	}

	@Override
	public void avancarPag() {
		if(this.getAberto()) {
			
			if(this.getPagAtual() >= 1 && this.getPagAtual() < this.getTotPaginas()) 
			{
			this.setPagAtual(getPagAtual() + 1 ); 
			System.out.println("Pagina Avançada, Pagina Atual " + this.getPagAtual());
		}
			else if(this.getPagAtual() == this.getTotPaginas()) {
				System.out.println("Chegou na Ultima Pagina! " + this.getPagAtual());
			}
			
			else if(this.getPagAtual() > this.getTotPaginas()) {
				System.out.println("Não Pode Avançar Pagina, Livro contem somente " + this.getTotPaginas() + " Paginas.");
			}
			
		}
		else {
			System.out.println("Impossivel Avançar Pagina, Livro Esta Fechado.");
		}
		
	}

	@Override
	public void voltarPag() {
		if(this.getAberto() && this.getPagAtual() > 1) {
			this.setPagAtual(this.getPagAtual() - 1);
			System.out.println("Volto a Pagina, Pagina Atual " + this.getPagAtual());
		}
		else {
			System.out.println("Ja estava na Primeira pagina, Livro Fechando..." );
			this.setAberto(false);
		}
		
	}

	//Metodos Publicos
	
	public void detalhes() {
		if(this.getAberto()) {
			System.out.println("    ");//Pular Linha no Console.
		System.out.println("=====DETALHES DO LIVRO=====");//Pular Linha no Console.
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de Paginas: " + this.getTotPaginas());
		
		if(this.getPagAtual() <= this.getTotPaginas()) {
		System.out.println("Livro Esta na Pagina: " + this.getPagAtual());
		}
		
		System.out.println("Livro esta aberto?: " + this.getAberto());
		System.out.println("Nome do Leitor: " + this.getLeitor().getNome());
		}
		else {
			System.out.println(" ");//Pular Linha no Console.
			System.out.println("=====DETALHES DO LIVRO=====");//Pular Linha no Console.
			System.out.println("Titulo: " + this.getTitulo());
			System.out.println("Autor: " + this.getAutor());
			System.out.println("Total de Paginas: " + this.getTotPaginas());
			System.out.println("Livro esta aberto?: " + this.getAberto());
		}
	}
	
	
	
	
}
