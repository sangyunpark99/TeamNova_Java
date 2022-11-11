package TeamNova_4주차과제;

public class Item {

    String name; // 아이템 이름
    int addAttack; // 아이템 공격 증가
    int addDefense; // 아이템 방어 증가
    int skillAttack; // 스킬 공격력

    int itemValue; // 아이템 가격

    String kind; // 아이템 종류

    int minLevel; // 아이템 최소 레벨

    Item(String name, int addAttack, int addDefense, int skillAttack, String kind, int itemValue, int minLevel){
        this.addAttack = addAttack;
        this.addDefense = addDefense;
        this.name = name;
        this.skillAttack = skillAttack;
        this.kind = kind;
        this.itemValue = itemValue;
        this.minLevel = minLevel;
    }
}
