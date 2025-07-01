package aula09ExercicioPraticoPOO;

public class Pessoa {

	//Atributos
	
	private String nome;
	private int idade;
	private String sexo;
	
	//Metodo Contrutor
	
	public Pessoa(String no , int id, String se) {
		setNome(no);
		setIdade(id);
		setSexo(se);
		
	}
	
	//Metodos Especiais
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setSexo(String s) {
		this.sexo = s;
	}
	
	//Metodos Publicos
	
	public void fazerAnivesario() {
		setIdade(getIdade() + 1);
		System.out.println("Feliz Aniversario " + this.getNome());
	}
	
	public void detalhesPessoa() {
		System.out.println("    ");//Pular Linha no Console.
		System.out.println("=========DETALHES DA PESSOA======");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
	}
}
