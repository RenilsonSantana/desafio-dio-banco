import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		super();
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void excluirConta(Conta conta) {
		if(contas.contains(conta)) {
			contas.remove(conta);
		}
	}
	
	public void listarTodasContas() {
		contas.forEach(System.out::println);
	}
	
	public List<Conta> consultarContaPorCliente(String titular) {
		return contas.stream().filter(c -> c.cliente.getNome().equals(titular)).toList();
	}
}
