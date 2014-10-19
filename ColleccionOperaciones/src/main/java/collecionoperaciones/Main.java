package collecionoperaciones;

public class Main {

    public static void main(String[] args) {
    	
    	OperationsHandler operationsHandler = new OperationsHandler();
    	
        operationsHandler.add(new Addition(3, 4));

        System.out.println("Total1:" + operationsHandler.total());

        operationsHandler.add(new Subtraction(1, 1));
        operationsHandler.add(new Addition(3, 5));
        operationsHandler.add(new Subtraction(4, 1));
        operationsHandler.add(new Addition(3, 6));
        operationsHandler.add(new Subtraction(3, 2));
        
        System.out.println("Total2:" + operationsHandler.total());
        
                
    }

}
