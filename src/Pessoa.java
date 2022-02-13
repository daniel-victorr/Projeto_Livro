
public class Pessoa {

	  //Atributos
	
	private String nome;
	private int idade;
	private String sexo;
	
	
	      //Constructor
	
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.setNome(nome); 
		this.idade = idade;
		this.sexo = sexo;
	}
	
	
	// Gettrs and Settrs 

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	   //Método Personalizado
	
	public void fazerAniversario() {
		this.idade++;
	}
	
	public void status() {
		System.out.println("-------------------");
		System.out.println("Nome:"+this.getNome());
		System.out.println("Idade:"+this.getIdade());
	    System.out.println("Sexo:"+this.getSexo());
	}
	
	
	
}

