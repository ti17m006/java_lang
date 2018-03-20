/**
 * ThinkChapter0806
 */

 /**
 * Static method(s) cannot invoke regular methods,
 * unless in static method isn't an instance of
 * regular method.
 */
class Box {
    public int length;
    public int width;
    public int height;

    public Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public static void status() {
        System.out.println("Calculating volume: ");
    }

    public int volume() {
        Box.status();
        return length * width * height;
    }

    public static void printVolume(Box a) {
        //ERROR
        //System.out.println("Box volume: " + volume());
        System.out.println("Box volume: " + a.volume());
    }

}

class ThinkChapter0806 {

    
}