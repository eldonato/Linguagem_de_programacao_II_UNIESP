package modelo;

public class Moldura {

	//Atributos
	private float base;
	private float altura;
	private float espessura;
	private float alturaCortada;
	private float baseCortada;


	//Construtor
	public Moldura(float b, float a, float e) {
		this.base = b;
		this.altura = a;
		this.espessura = e;
	}


	//Métodos
	public float calcularArea(){ //dividiu a moldura em sessões
		this.alturaCortada = ((this.altura-this.espessura) * this.espessura)*2f;
		this.baseCortada = ((this.base-this.espessura) * this.espessura)*2f;
		return this.alturaCortada+this.baseCortada;
	}

}
