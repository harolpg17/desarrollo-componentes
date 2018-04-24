package aspectos;

public aspect Logging {
	pointcut llamada() : call(double *.area()) || call(double *.perimetro());
	
	//advice
	before() : llamada(){
		System.out.println("Se llam� el m�todo �rea o per�metro.");
	}
}
