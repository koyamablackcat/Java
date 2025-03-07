/*Bài tập 1: FizzBuzz
Viết một chương trình in các số từ 1 đến 50, nhưng:

Nếu số đó chia hết cho 3, in "Fizz".
Nếu số đó chia hết cho 5, in "Buzz".
Nếu số đó chia hết cho cả 3 và 5, in "FizzBuzz".
Ngược lại, in chính số đó.
*/


class FizzBuzz {
    public static void main(String args[]) {
        for (int i = 1 ; i <=50 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}