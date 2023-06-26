package ch_6;

public class Sol6_3 {
    public static void main(String[] args) {
        Student_3 s = new Student_3();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름:" + s.name);
        System.out.println("총점:" + s.getTotal());
        System.out.println("평균:" + s.getAverage());
    }
}

class Student_3 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {
        return kor + eng + math;
    }

    double getAverage() {
        return Math.round(getTotal() / 0.3) / 10.0;
    }

}