
public class Livro implements Publicacao {

	  //Atributos
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int paginaAtual;
	private boolean aberto;
	private boolean fechado;
	private Pessoa leitor;  // OBS:Agregação , "have an object"
	

	      //Constructor
	   
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.aberto = false;
		this.paginaAtual = 0;
		this.totPaginas = totPaginas;
		this.leitor = leitor;
		
	}

	

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
	
	public void setFechado(boolean fechado) {
		this.fechado = fechado;
	}
	
	public boolean isFechado() {
		return fechado;
	}
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	public Pessoa getLeitor() {
		return this.leitor;
	}
	
	  //Método Personalizados
	
	public String detalhes() {
     return " Livro[titulo= " + titulo + "\n autor=" + autor + "\n totPaginas=" + totPaginas + "\n paginaAtual="
	  + paginaAtual + "\n aberto=" + aberto+"\n leitor=" + leitor.getNome() +"\n Idade:"+leitor.getIdade()
	  +"\n Sexo:"+leitor.getSexo()+"]";
	}

	
	
	 //Método Override
	
	@Override
	public void abrir() {
		this.setAberto(true);
		if(this.getisAberto()) {
			this.setAberto(true);
		}else {
			this.fechar();
		}
	}

	@Override
	public void fechar() {
		
		this.setAberto(false);
	}

	@Override
	public void folhear(int p) {
		this.setPaginaAtual(p);
		if(this.getTotPaginas()<p) {
			this.paginaAtual=0;
		}else {
			this.paginaAtual=p;
		}
	}

	@Override
	public void avancarPag() {
		this.setPaginaAtual(this.getPaginaAtual()+1);
		
	}

	@Override
	public void voltarPag() {
	   
		this.setPaginaAtual(this.getPaginaAtual()-1);
		
	}

	

	
	 
	
	
}
