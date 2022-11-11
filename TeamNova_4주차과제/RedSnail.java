package TeamNova_4주차과제;

public class RedSnail extends Snail {


    int skillAttack;
    RedSnail(){
        this.name = "빨간달팽이";
        this.attack += 10;
        this.defense += 15;
        this.maxHp += 40;
        this.currentHp = this.maxHp;
        this.exp += 20 + random.nextInt(5) + 1;
        this.dropItem = new Item("다크데모닉 신발",0,100,0,"신발",500,10);
        this.money += 20 + random.nextInt(5)+1;
        this.skillAttack = 70;
    }

    public void skill(Character ch){ // 스킬이 사용될 확률도 랜덤으로 부의

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println(this.name + " 빨간 껍질 던지기!");
        System.out.println(ch.name+"의 HP : " + ch.currentHp);
        System.out.println(this.name + "의 스킬 공격력 : " +this.skillAttack + " | " + ch.name + "의 방어력 : " + ch.defense );

        if(this.skillAttack > ch.defense){
            System.out.println(ch.name +"에게 가해진 공격 : " + (this.skillAttack - ch.defense));
            ch.currentHp -= (this.skillAttack - ch.defense);
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
