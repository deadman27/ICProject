package fr.logic.git;

public class Operation {

	int nombre1;
	int nombre2;
	String operation;
	
	public Operation(){
		this.nombre1=0;
		this.nombre2=0;
		this.operation="";
	}
	
	public int addition(){
		return this.getNombre1() + this.getNombre2();
	}
	
	public int soustraction(){
		return this.nombre1 - this.nombre2;
	}
	
	public int multiplication(){
		return this.nombre1 * this.nombre2;
	}
	
	public int division(){
		return this.nombre1 / this.nombre2;
	}

	public int getNombre1() {
		return nombre1;
	}

	public void setNombre1(int nombre1) {
		this.nombre1 = nombre1;
	}

	public int getNombre2() {
		return nombre2;
	}

	public void setNombre2(int nombre2) {
		this.nombre2 = nombre2;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public int getResultat(){
		switch(this.getOperation()){
		case "+" :
			return this.addition();
		case "-" :
			return this.soustraction();
		case "*" :
			return this.multiplication();
		case "/" :
			return this.division();
		}
		return 9999;
	}
}
