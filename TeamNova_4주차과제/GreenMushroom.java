package TeamNova_4주차과제;

public class GreenMushroom extends Mushroom{

    int skillAttack;

    GreenMushroom(String job) {

        this.name = "초록버섯";
        this.attack += 20;
        this.defense += 10;
        this.maxHp += 50;
        this.exp += 100 + random.nextInt(10)+1;
        this.currentHp = this.maxHp;
        this.skillAttack = 300;
        this.money += 100 + random.nextInt(10)+1;

        if(job == "Warrior"){
            this.dropItem = new Item("다크데모닉 양손검",300,0,600,"무기",3000,10);
        }else if(job == "Wizard"){
            this.dropItem = new Item("다크데모닉 완드",300,0,600,"무기",3000,10);
        }else if(job == "Archer"){
            this.dropItem = new Item("다크데모닉 활",300,0,600,"무기",3000,10);
        }else {
            this.dropItem = new Item("다크데모닉 아대",300,0,600,"무기",3000,10);
        }
    }

    public void skill(Character ch){ // 스킬이 사용될 확률도 랜덤으로 부의

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println(this.name + " 초록 포자 뿌리기!");
        System.out.println(ch.name+"의 HP : " + ch.currentHp);
        System.out.println(this.name + "의 스킬 공격력 : " +this.skillAttack + " | " + ch.name + "의 방어력 : " + ch.defense );

        if(skillAttack > ch.defense){
            System.out.println(ch.name +"에게 가해진 공격 : " + (this.skillAttack - ch.defense));
            ch.currentHp -= (skillAttack - ch.defense);
        }else{
            System.out.printf("%s에게 공격이 통하지 않습니다.",ch.name);
            System.out.println();
            System.out.println();
        }

        if(ch.currentHp > 0){ // 주인공이 죽은 경우에 피를 보여줄 필요는 없다.
            System.out.println(ch.name + "의 HP : " + ch.currentHp);
        }
        System.out.println("----------------------------------");
    }
}
