package TeamNova_4주차예제;

public class 유닛 {
    int 공격력;
    int 체력;
    String 이름;

    void 공격하기(유닛 대상){
        대상.체력 -= this.공격력;
        System.out.println(this.이름 + 대상.이름 + "을 공격함("+대상.이름+"의 체력 : " + 대상.체력 + ")" );
    }
}
