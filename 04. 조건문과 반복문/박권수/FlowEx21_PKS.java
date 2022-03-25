public class FlowEx21_PKS {
    public static void main(String[] args) {
        //배열 모양 만들기
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i==j) {
                    System.out.printf("[%d,%d]", i,j);
                }else{
                    System.out.printf("%5c", ' ');
                }
            }
            System.out.println();
        }
    }
}
