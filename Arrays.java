public class Arrays {
    public static void main(String[] args) {

        printArray(new int[] {27, 82, 4, 12, 13});
        containsNumber(new int[] {27, 82, 4, 12, 13}, 4);
    }
    public static void printArray(int[]numbers){
        for (int i = 0; i < numbers.length; i++ ){
            if (i == numbers.length -1){
                System.out.println(numbers [i]);
            } else {
                System.out.print(numbers [i] + ",");
            }
        }
    }
    public static boolean containsNumber(int[] numbers, int n){
        boolean numberFound = false;
        for (int item : numbers){
            if (item == n){
                System.out.println(numberFound = true);
            } else {
                System.out.println("not found");
            }

        } return numberFound;
    }
}
