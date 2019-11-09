class FinallayDemo{
	static void procA(){
	try{
	System.out.println("inside");
	throw new RuntimeException("Demo");
	}
	finally{
	System.out.println("finally");
	}
}
	static void procB(){
	try{
	System.out.println("b");
	return;
	}
	finally{
	System.out.println("procB's finally");
	}
}
static void procC() {
	try {
	System.out.println("inside procC");
	} 
	finally {
	System.out.println("procC's finally");
	}
	}
public static void main(String args[]) {
	try {
	procA();
	} 
	catch (Exception e) {
	System.out.println("Exception caught");
	}
	procB();
	procC();
	}
}
