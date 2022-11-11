package TeamNova_4주차과제;

public class BlueSnail extends Snail {

    int skillAttack;

    BlueSnail(){
        this.name = "파란달팽이";
        this.attack += 15;
        this.defense += 10;
        this.maxHp += 20;
        this.currentHp = this.maxHp;
        this.exp += 10 + random.nextInt(5) + 1;
        this.dropItem = new Item("다크데모닉 하의",0,100,0,"하의",500,10);
        this.money += 10 + random.nextInt(5)+1;
        this.skillAttack = 65;
    }

    public void skill(Character ch){ // 스킬이 사용될 확률도 랜덤으로 부의

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println(this.name + " 파랑 껍질 던지기!");
        System.out.println(ch.name+"의 HP : " + ch.currentHp);
        System.out.println(this.name + "의 스킬 공격력 : " +this.skillAttack + " | " + ch.name + "의 방어력 : " + ch.defense );

        if(skillAttack >= ch.defense){
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
