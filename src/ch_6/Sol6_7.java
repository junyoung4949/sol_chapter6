package ch_6;

class Marine {
    int x = 0, y = 0;
    int hp = 60;
    static int weapon = 6;
    static int armor = 0;

    static void weaponUp() {
        weapon++;
    }

    static void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

/*
    static을 붙여야하는 것들은 어떤것들이 있는가?
    weapon , armor , weaponUp() , armorUp() 이라고 생각함.
    이유는 모든 객체가 공통적으로 같은값을 가지는 요소들이기 떄문
*/

public class Sol6_7 {
}