package produtos;

public class Produto {
	
	private String nome;
	private double valor;
	private int quantidade;
	private double valorDesconto;
	
	public Produto(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;		
		
	}
	
	public Produto() {
		
	}
	
	public Produto(String nome, double valor, int quantidade, double valorDesconto) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;		
		this.valorDesconto = valorDesconto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValorDesconto() {
		return valorDesconto;
	}
	
	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}	

}
