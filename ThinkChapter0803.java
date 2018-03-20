/**
 * ThinkChapter0803 - Chapter 10
 * Object as parameter(s)
 * Object as return type
 * 
 */

/**
 * Complex
 */
class Complex {

    public int re;
    public int im;

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public Complex add(Comlex a, Complex b) {
        //Complex c;
        //c = new Complex(a.re + b.re, a.im + b.im);
        //return c;
        return new Complex(a.re + b.re, a.im + b.im);
    }

    public Complex addNew(Comlex a) {
        return new Complex(a.re + this.re, a.im + this.im);
    }

    public show() {
        System.out.println();
    }
}

class ThinkChapter0803 {

    public static run() {
        Complex a = new Complex(3, 4);
        Complex b = new Complex(2, 6);
        //Complex c; 
        //c = c.add(a, b);
        Complex c = a.addNew(b);
    }

    public static void main(String[] args) {
        run();
    }
}