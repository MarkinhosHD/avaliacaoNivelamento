package produtos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto = new Produto("Caneta",1.50,3);
		
		Produto produto2 = new Produto("SmartTV Samsung",1500,2,275.56);
		
		System.out.println("Produto: " + produto.getNome()
		+ "\n" + "Valor: " + produto.getValor());
		System.out.println("Produto: " + produto2.getNome()
		+ "\n" + "Valor: " + produto2.getValor());	
		
	}

}
