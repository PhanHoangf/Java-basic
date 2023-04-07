package exercise35;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber (double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal () {
        return real;
    }

    public double getImaginary () {
        return imaginary;
    }

    public void add (double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void subtract (double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void add (ComplexNumber num) {
        this.add( num.getReal(), num.getImaginary() );
    }

    public void subtract (ComplexNumber num) {
        this.subtract( num.getReal(), num.getImaginary() );
    }
}
