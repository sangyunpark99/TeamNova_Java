package TeamNova_4주차예제;

public class 캐릭터 extends 유닛 {
    캐릭터(String 이름값){
        this.이름 = 이름값;
        this.공격력 = 100;
        this.체력 = 300;
    } // 생성자를 통해서 이름을 만들어주기;

    void 공격하기(유닛 대상){
        super.공격하기(대상);
        System.out.println("캐릭터에서 확장해서 사용합니다~");
    }
}
