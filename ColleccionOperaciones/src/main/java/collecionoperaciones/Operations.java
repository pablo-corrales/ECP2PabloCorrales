package collecionoperaciones;

public abstract class Operations {
	
	 	protected int operator1;
	    protected int operator2;
	    protected char operator;

	    public Operations(int operator1,char operator, int operator2) {
	        this.operator1 = operator1;
	        this.operator = operator;
	        this.operator2 = operator2;
	      
	    }

	   protected abstract int operar();

	    @Override
	    public String toString() {
	        return "[" + operator1 + operator + operator2 + "]";
	    }
}
