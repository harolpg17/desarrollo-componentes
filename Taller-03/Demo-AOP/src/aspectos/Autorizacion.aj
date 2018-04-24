package aspectos;

public aspect Autorizacion {
	String mensajeAutorizacion = "Simulando una autorizaci�n antes de cada m�todo.";
	
	pointcut metodo() : execution(double *.*());
	
	//advice
	before() : metodo(){
		System.out.println(mensajeAutorizacion);
	}
}
