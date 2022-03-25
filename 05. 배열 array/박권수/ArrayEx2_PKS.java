public class ArrayEx2_PKS {

    public static void main(String[] args) {
        int[] number = new int[10];

        for (int i=0; i < number.length ; i++ ) {
              System.out.print(number[i] = i);       // 배열을 0부터 9의 숫자로 초기화한다.
        }
        System.out.println();

        for (int i=0; i < 100; i++ ) {
              int n = (int)(Math.random() * 10);       // 0~9중의 한 값을 임의로 얻는다.
              int temp = number[0]; // 배열의 첫 번째 값과 임의로 선택된 위치의 값과 바꾼다.
              number[0] = number[n];
              number[n] = temp;
        }
        for (int i=0; i < number.length ; i++ ) {
              System.out.print(number[i]);             // 배열의 내용을 출력한다.
        }
    }
    
}
