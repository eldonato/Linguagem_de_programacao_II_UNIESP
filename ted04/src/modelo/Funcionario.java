package modelo;

public class Funcionario {
	
	//Atributo
	private int id;
	private int idSetor;
	private int salario;
	private int rg;
	private boolean empregado;
	
	
	//Construtor
	public Funcionario() {}
	
	public Funcionario(int id, int idSetor, int salario, int rg, boolean empregado) {
		this.id = id;
		this.idSetor = idSetor;
		this.salario = salario;
		this.rg = rg;
		this.empregado = empregado;		
	}
	
	
	//Método
	public void bonificar(int aumento) {
		this.salario += aumento;
	}
	
	public void demite() {
		this.empregado = false;
	}
	
	
	//get e set

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdSetor() {
		return idSetor;
	}
	
	public void setIdSetor(int idSetor) {
		this.idSetor = idSetor;
	}
	
	
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public int getRg() {
		return rg;
	}
	
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public boolean getEmpregado() {
		return empregado;
	}
	
	public void setEmpregado(boolean empregado) {
		this.empregado = empregado;
	}	
}
