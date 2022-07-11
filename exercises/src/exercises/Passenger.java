package exercises;

public class Passenger {

	private String dado; 
	private Passenger prox;
	 //Propriedades da classe 
	public Passenger getProx() { 
	return this.prox;
	 }
	 public void setProx(Passenger prox) { 
	this.prox = prox;
	 }
	 public String getDado() { 
	return this.dado;
	 }
	 //Construtor da classe No 
	 public Passenger(String dadonovo) { 
	dado = dadonovo; 
	prox = null;
	 }
	 public Passenger(String dadonovo, Passenger ligacao) { 
	dado = dadonovo; 
	prox = ligacao;
	 }
}
