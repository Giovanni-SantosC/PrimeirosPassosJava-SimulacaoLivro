package aula09ExercicioPraticoPOO;

public class Aula09 {

	
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Sofia",20,"Feminino");
		Livro l = new Livro("Odeio Te Amar", "Ali Hazelwood" , 352, p );
		
		p.fazerAnivesario();
		p.detalhesPessoa();
		System.out.println("----------------------");//Pular Linha no Console.
		l.abrir();
		l.folhear(352);
		l.avancarPag();
		l.detalhes();
		
	}
	
}
