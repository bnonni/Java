public class NumberPyramid {
        public static void main(String[] args) {
            int lines = 5;
            for(int a = 1; a <= lines; ++a) {
                for(int b = 1; b <= a; ++b) {
                    System.out.print(b);
                }
                System.out.println();
            }
        }
    }