/**
 * ThinkChapter1001
 * Strings and Things
 * 
 * Strings are immutable
 */

 class ThinkChapter1001 {

    public static void run() {
        String apple = "apple";
        String banana = new String("banana");

        System.out.println(apple);
        System.out.println(banana);

        for (int i = 0; i < apple.length(); i = i + 1) {
            System.out.println(apple.charAt(i));
        }

        String upperApple = apple.toUpperCase();
        System.out.println(upperApple);
    }

    public static void main(String[] args) {
        
        run();
    }
}