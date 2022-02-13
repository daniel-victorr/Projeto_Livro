
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa []p = new Pessoa[4];
		Livro []l = new Livro[4];
		
		p[0] = new Pessoa( "Daniel Victor",20,"Masculino");		
		p[1] = new Pessoa( "Ana Paula",37,"Feminino");
		
		l[0] = new Livro(" O prícipe"," Daniel Frannk",200,p[0]);
		
	   
	    l[0].fechar();
	    l[0].getTotPaginas();
	    l[0].folhear(201);
	    
	    l[0].setPaginaAtual(150);
	    l[0].avancarPag();
	    l[0].voltarPag();
	   l[0].abrir();
	    System.out.println(l[0].detalhes()); 
	   
	    
	  
	}

}
