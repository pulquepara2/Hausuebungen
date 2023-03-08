public class PingPong {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 101) {
            if (i % 6 == 0) {
                System.out.println("ping");
            } else if (i % 3 == 0) {
                System.out.println("pong");
            } else if (i % 2 == 0) {
                System.out.println("pingpong");
            } else {
                System.out.println("-");
            }
            i++;
        }
    }
}
