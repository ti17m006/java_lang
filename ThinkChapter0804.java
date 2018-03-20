/**
 * ThinkChapter0804 - Chapter 10
 * Static methods 
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

    public Complex add(Comlex a) {
        return new Complex(a.re + this.re, a.im + this.im);
    }

    public static Complex addStatic(Comlex a, Complex b) {
        return new Complex(a.re + b.re, a.im + b.im);
    }

    public show() {
        System.out.println();
    }
}

class ThinkChapter0804 {

    public static run() {
        Complex a = new Complex(3, 4);
        Complex b = new Complex(2, 6);
        Complex c = a.addNew(b);
        Complex d = Complex.addStatic(a, b);
    }

    public static void main(String[] args) {
        run();
    }
}