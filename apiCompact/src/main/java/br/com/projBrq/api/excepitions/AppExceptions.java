package br.com.projBrq.api.excepitions;



public class AppExceptions extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public AppExceptions() {
		super();
	}
	
	public AppExceptions(String msg) {
		super(msg);
		
	}
	
	public AppExceptions(String msg, Throwable t) {
		super(msg,t);
		
	}
	
	

	
}
