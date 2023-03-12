public class HouseArray {
    public static void main(String[] args) {
    int[][] hausi = new int[][] {
            {0, 0, 0, 8, 0, 0, 0},
            {0, 0, 8, 0, 8, 0, 0},
            {0, 8, 8, 8, 8, 8, 0},
            {8, 8, 8, 8, 8, 8, 8},
            {8, 0, 8, 8, 8, 0, 8},
            {8, 8, 8, 0, 8, 8, 8},
            {8, 8, 8, 0, 8, 8, 8},
        };
    for (int[] row : hausi){
        for (int i : row){
            if(i == 0){
                System.out.print(" ");
            }else {
                System.out.print(i);
            }
        }
        System.out.println();    }

    }
}
