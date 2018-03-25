/**
 * ThinkChapter1102
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
        sb.append(", ");
        sb.append("Volume: ");
        sb.append(volume());
        sb.append(".");
        return sb.toString();
    }
}

/**
 * ArrayBox
 */
class ArrayBox {
    public Box[] array;

    public ArrayBox() {
        array = new Box[3];
        array[0] = new Box(1, 3, 5);
        array[1] = new Box(2, 4, 6);
        array[2] = new Box(7, 8, 9);
    }

    public void printBoxes() {
        for (Box el : array) {
            System.out.println(el.showBox());
        }
    }

}

class ThinkChapter1102 {

    public static void run() {
        ArrayBox ab = new ArrayBox();
        ab.printBoxes();
    }

    public static void main(String[] args) {
        run();
    }
}