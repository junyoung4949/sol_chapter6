package ch_6;

public class Sol6_16 {
    public static void change(String str) {
        str += "456";
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change: " + str);
    }
}

/* 결과를 예측해서 적으시오.
    결과는 같은 값이 나왔고,
    이유는 무엇일까? change의 매개변수인 str이 참조변수가 아니라 복사된 복사된 문자열 자체를 받은것일까?
    그렇지 않고, 참조변수에 문자열 str의 주소값이 전달 되었지만,
    "456"을 더하는 과정에서 change메서드의 str에는 "ABC123456"의 주소가 따로 생성되어 저장되게 된다.
    그런 이유로 change가 호출스택을 지난이후에도 main의 str에는 "ABC123"의 주소가 그대로 남아있다.
*/