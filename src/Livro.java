
public class Livro implements Publicacao {

	  //Atributos
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;  // OBS:Agregação , Tem um object
	
	//Gettrs and Settrs
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getAutor() {
		return  this.autor;
	}
	
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	
	public int getTotPaginas() {
		return this.totPaginas;
	}
	
	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
		
	}
	
	public int getPaginaAtual() {
		return this.paginaAtual;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public boolean getisAberto() {
		return this.aberto;
	}
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	public Pessoa getLeitor() {
		return this.leitor;
	}
	
	  //Método Personalizados
	
	public void detalhes() {
		
	}
	
	
	 //Método Override
	
	@Override
	public void abrir() {
		
		
	}

	@Override
	public void fechar() {
		
		
	}

	@Override
	public void folhear() {
	
		
	}

	@Override
	public void avancarPag() {
		
		
	}

	@Override
	public void voltarPag() {
	
		
	}
	
	 
	
	
}
