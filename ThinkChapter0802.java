/**
 * ThinkChapter0802 - Chapter 10
 * Simple class example with constructor, aliasing and null
 */

class Box {

    public int length;
    public int width;
    public int height;

    //public Box(int l, int w, int h) {
    //    length = l;
    //    width = w;
    //    height = h;
    //}

    public Box(int lenght, int width, int height) {
        this.length = lenght;
        this.width = width;
        this.height = height;
    }

    public int volume() {
        return length * width * height;
    }

    public void show() {
        System.out.println("Box: " + this.toString());
        System.out.println("length: " + length);
        System.out.println("width: " + width);
        System.out.println("height: " + height);
        System.out.println();
    }

}

class ThinkChapter0802 {

    public static void run() {
        Box a = new Box(3, 4, 5);
        a.show();

        Box b = new Box(1, 3, 5);
        b.show();

        // Aliasing
        Box c = a;
        c.show();
        a = null;
        //a.show();
    }

    public static void main(String[] args) {
        run();
    }
}