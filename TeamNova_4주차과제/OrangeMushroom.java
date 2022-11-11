package TeamNova_4주차과제;

public class OrangeMushroom extends Mushroom{

    int skillAttack;

    OrangeMushroom() {

        this.name = "주황버섯";
        this.attack += 30;
        this.defense += 20;
        this.maxHp = 250;
        this.currentHp = this.maxHp;
        this.exp += 200 + random.nextInt(10)+1;
        this.dropItem = new Item("다크데모닉 목걸이",0,100,0,"목걸이",1500,10);
        this.skillAttack = 350;
        this.money += 200 + random.nextInt(10)+1;
    }

    public void skill(Character ch){ // 스킬이 사용될 확률도 랜덤으로 부의

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println(this.name + " 주황 포자 뿌리기!");
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
