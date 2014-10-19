package collecionoperaciones;

public class Multiplication extends Operations {

    public Multiplication(final int operator1, final int operator2) {
     super(operator1, '*', operator2);
 }

 @Override
 protected final int operar() {
     return this.operator1 * this.operator2;
 }
}