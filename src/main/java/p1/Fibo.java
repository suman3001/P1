package p1;

public class Fibo {
    public static void main(String[] args) {
        int number=10;
        Fibo fibo= new Fibo();
        fibo.fiboNum(number);

    }
        public void fiboNum(int number){
        int first = 0;
        int second=1;
            System.out.print(first);
            System.out.print(" "+second);

        for(int i=2;i<number;i++){
            int third = first+second;
            System.out.print(" "+third);
            first=second;
            second=third;
        }

    }
}
