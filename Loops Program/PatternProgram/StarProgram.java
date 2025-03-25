package PatternProgram;

public class StarProgram {
    public static void main(String[] args) {
        int i ;
        for (int line = 1; line <=4; line++){
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
