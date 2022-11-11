package TeamNova_4주차과제;

public class Skill {
    int skillAttack; // 스킬 공격력
    int useMp; // 마나 사용

    int defaultSkillAttack;

    String name; // 스킬 이름

    int skillLastTime = 0;

    Skill(String name, int skillAttack, int useMp){
        this.skillAttack = skillAttack;
        this.defaultSkillAttack = skillAttack;
        this.useMp = useMp;
        this.name = name;

    }
}