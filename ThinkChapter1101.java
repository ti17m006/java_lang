/**
 * ThinkChapter1101
 * Arrays of objects
 */

/**
 * Box
 */
class Box {
    public int length;
    public int width;
    public int height;

    public Box() {
        length = 1;
        width = 1;
        height = 1;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int volume() {
        return length * width * height;
    }

    public String showBox() {
        StringBuilder sb = new StringBuilder(this.toString());
        sb.append(", ");
        sb.append("Length: ");
        sb.append(length);
        sb.append(", ");
        sb.append("Width: ");
        sb.append(width);
        sb.append(", ");
        sb.append("Height: ");
        sb.append(height);
        sb.append(".");
        return sb.toString();
    }
}

class ThinkChapter1101 {

    public static void run() {
        Box[] boxes = new Box[3];
        boxes[0] = new Box(1, 3, 5);
        boxes[1] = new Box(2, 4, 6);
        boxes[2] = new Box(7, 8, 9);

        for (Box box : boxes) {
            System.out.println(box.showBox());
        }
    }

    public static void main(String[] args) {
        run();
    }
}