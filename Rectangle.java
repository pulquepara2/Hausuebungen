public class Rectangle {
    public static void main(String[] args) {
       int width;
       int length;
       int circumfence;
       int area;

//        circumfence = width + width + length + length;
//        area = width*length;

       width = 4;
       length = 8;
    calculateCircumfence (width,length);
    calculateArea(width,length);
    }
    public static int calculateCircumfence (int width, int length) {
        int circumfence = width + width + length + length;
        System.out.println("The circumfence is: " + circumfence);

        return circumfence;
    }
    public static int calculateArea (int width, int length) {
        int area = width*length;
        System.out.println("The area is: " + area);

        return area;
    }
}
