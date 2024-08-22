public class CheckBreakNested{
    public static void main(String[] args) {
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.println("runing for iteration no "+i );
            for (int j = 0; j < 4; j++) {
                if(j==2){
                    break;
                }
                System.out.println("runing for "+i +" "+j);
            }
        }
    }
}