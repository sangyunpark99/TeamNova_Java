package TeamNova_4주차과제;

public class 레벨업버그 {

    Character ch;

    레벨업버그(Character getCh){
        this.ch = getCh;
    }

    public void start(){
        ch.level = 10;
        ch.maxHp += (ch.level-1)*50;
        ch.maxMp += (ch.level-1)*50;
        ch.currentHp = ch.maxHp;
        ch.currentMp = ch.maxMp;
        ch.exp = 0;
        ch.전직 = true;
        ch.defense += (ch.level-1)*10;
        ch.attack += (ch.level-1)*10;

        ch.equipment.replace("상의",new Item("다크데모닉 상의",0,100,0,"상의",500,10));
        ch.equipment.replace("하의", new Item("다크데모닉 하의",0,100,0,"하의",500,10));
        ch.equipment.replace("신발", new Item("다크데모닉 신발",0,100,0,"신발",500,10));
        ch.equipment.replace("모자", new Item("다크데모닉 모자",0,100,0,"모자",500,10));
        ch.equipment.replace("목걸이", new Item("다크데모닉 목걸이",0,100,0,"목걸이",500,10));

        ch.defense += 500;

        if(ch.job == "Warrior"){ // 전사
            ch.equipment.replace("무기",new Item("다크데모닉 양손검",300,0,600,"무기",3000,10));

            for(Skill s : ((PowerWarrior)ch).powerSkills){
                s.skillAttack += 600;
            }

        }else if(ch.job == "Wizard"){ // 마법사
            ch.equipment.replace("무기",new Item("다크데모닉 완드",300,0,600,"무기",3000,10));

            for(Skill s : ((PowerWizard)ch).powerSkills){
                s.skillAttack += 600;
            }
        }else if(ch.job == "Archer"){ // 궁수
            ch.equipment.replace("무기",new Item("다크데모닉 활",300,0,600,"무기",3000,10));

            for(Skill s : ((PowerArcher)ch).powerSkills){
                s.skillAttack += 600;
            }
        }else{ // 도적
            ch.equipment.replace("무기",new Item("다크데모닉 아대",300,0,600,"무기",3000,10));

            for(Skill s : ((PowerBandit)ch).powerSkills){
                s.skillAttack += 600;
            }
        }
    }
}
