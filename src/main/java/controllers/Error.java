package controllers;

public enum Error {
	
	NOT_VALIDATE("Debe ingresar un codigo valido");
	
	
	private String message;
	
	private Error(String message){
		this.message = message;
	}
	
	@Override
	public String toString(){
		return message;
	}

}
