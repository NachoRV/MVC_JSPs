package model;

public class Rectangulo {
	
	int base;
	int altura;
	
	
	public Rectangulo() {};
	public Rectangulo(int base, int altura) {
		this.altura = altura;
		this.base = base;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	};
	
	public int getArea() {
		return this.altura * this.base;
	
	}
	

}
