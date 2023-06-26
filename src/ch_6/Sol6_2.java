package ch_6;

public class Sol6_2 {
    public static void main(String[] args) {
        Student_2 s = new Student_2("홍길동" , 1 , 1 ,100, 60 , 76);

        String str = s.info();
        System.out.println(str);
    }
}

class Student_2 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student_2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math;
    }
}