/*
Name: Solomon Lee
Email: solomonlee@brandeis.edu
Assignment: PA02
Description: Interval class with equals, negate, add, subtract,
multiply, and divide instance methods
Bugs: In interval[a,b], a must be less than or equal to b. In the divide instance
method, in interval[c,d], c must be greater than 0 or d must be less than 0
*/

public class Interval {
  private double lo;
  private double hi;

  /**
  create an Interval by creating lower and upper bounds
  */
  public Interval(double lo, double hi) {
    this.lo = lo;
    this.hi = hi;
  }
  /**
  create an interval in which both lower and upper bounds are equal
  */
  public Interval(double lo)  {
    this.lo = lo;
    this.hi = lo;
  }
  /**
  returns lower bound of interval
  */
  public double getLo() {
    return this.lo;
  }
  /**
  returns upper bound of interval
  */
  public double getHi() {
    return this.hi;
  }
  /**
  returns boolean result to check if 2 intervals' lower and upper
  bounds are equal to each other
  */
  public boolean equals(Interval a){
		return (this.lo == a.lo) && (this.hi == a.hi);
	}
  /**
  returns an interval multiplied by -1
  */
  public Interval negate()  {
    Interval c = new Interval(this.lo * -1, this.hi * -1);
    return c;
  }
  /**
  adds two intervals together
  */
  public static Interval add(Interval a, Interval b)  {
    Interval c = new Interval(a.lo + b.lo, a.hi + b.hi);
    return c;
  }
  /**
  subtracts one interval from another
  */
  public static Interval subtract(Interval a, Interval b) {
    Interval c = new Interval(a.lo - b.hi, a.hi - b.lo);
    return c;
  }
  /**
  multiply an interval by another interval
  */
  public static Interval multiply(Interval a, Interval b) {
    double x = Math.min(Math.min(a.lo * b.lo, a.lo * b.hi), Math.min(a.hi * b.lo, a.hi * b.hi));
    double y = Math.max(Math.max(a.lo * b.lo, a.lo * b.hi), Math.max(a.hi * b.lo, a.hi * b.hi));
    Interval c = new Interval(x,y);
    return c;
  }
  /**
  divide an interval from another interval
  */
  public static Interval divide(Interval a, Interval b) {
    double x = Math.min(Math.min(a.lo / b.lo, a.lo / b.hi), Math.min(a.hi / b.lo, a.hi / b.hi));
    double y = Math.max(Math.max(a.lo / b.lo, a.lo / b.hi), Math.max(a.hi / b.lo, a.hi / b.hi));
    Interval c = new Interval(x,y);
    return c;
  }
  /**
  returns result as a string
  */
  public String toString()  {
    return "["+this.lo+","+this.hi+"]";
  }
}
