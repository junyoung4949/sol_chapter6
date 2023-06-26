package ch_6;

public class Sol6_11 {
}
/*
    [6-11] 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
    long add(int a, int b) { return a+b;}

    1. long add(int x, int y) { return x+y;}
    2. long add(long a, long b) { return a+b;}          (o)
    3. int add(byte a, byte b) { return a+b;}           (o)
    4. int add(long a, int b) { return (int)(a+b);}     (o)

    1번의 경우 매개변수의 이름만 다르고, 다른게 없다.
    2,3,4의 경우 매개변수의 타입을 다르게 했는데, 이경우에 함수호출했을때
    애매하지 않기 때문에 오버로딩이 인정된다.
*/