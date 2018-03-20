
/**
 * ThinkChapter0801 - Chapter 10
 * Simple class example with methods
 */

class Box {
    
    public int length;
    public int width;
    public int height;


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

class ThinkChapter0801 {

    public static void run() {
        Box a = new Box();
        a.show();
        a.length = 3;
        a.width = 4;
        a.height = 5;
        a.show();

        Box b = new Box();
        b.show();
        b.length = 3;
        b.width = 4;
        b.height = 5;
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