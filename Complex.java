/**
code
nlnlnl
*/
public class Complex{
	private double re;
	private double im;

	public Complex(double re, double im){
		this.re = re;
		this.im = im;
	}
	public Complex(double re){
		this.re = re;
		this.im = 0;
	}

	public double getReal(){
		return this.re;
	}
	public double getImag(){
		return this.im;
	}
	public double getR(){
		return Math.sqrt(this.re*this.re +this.im*this.im);
	}
	
	private void setReal(double re){
		this.re = re;
	}
	private void setImag(double im){
		this.im = im;
	}
	public boolean equals(Complex z){
		return (z.re == this.re) && (z.im ==this.im);
	}
	public static Complex add(Complex u, Complex v)	{
		Complex z = new Complex(u.re + v.re, u.im + v.im);
		return z;
	}
	public static Complex subtract(Complex u, Complex v)	{
		Complex z = new Complex(u.re - v.re, u.im - v.im);
		return z;
	}
	public static Complex multiply(Complex u, Complex v)	{
		double real, imag;
		Complex z = new Complex((u.re * v.re - u.im * v.im),  (u.re * v.im + u.im * v.re));
		return z;
	}
	public String toString()	{//instance- not static and uses this
		return this.re+ " + "+ this.im+"i";
	}
}
