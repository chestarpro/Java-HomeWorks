package com.company.A;

import com.company.A.fruits.Fruit;
import com.company.A.interfaces.CarryOnTheBack;
import com.company.A.interfaces.EatEdibleFruit;

public class Monkey extends ClimbAnimal implements EatEdibleFruit, CarryOnTheBack {

    public Monkey() {}

    public Monkey(String KindOfAnimal, double weight) {
        super(KindOfAnimal, weight);
    }

    @Override
    public void eatEdibleFruit(Fruit fruit) {
        if(!fruit.isPoisonous()) System.out.println(getKindOfAnimal() + " кушает " + fruit.getNameFruit());
        else System.out.println(getKindOfAnimal() + " не будет кушать это! " + fruit.getNameFruit() + " не съедобный фрукт! " );
    }

    @Override
    public void carryOnTheBack(ClimbAnimal climbableAnimal) {
        if(getId() == climbableAnimal.getId()) System.out.println(getKindOfAnimal() + " сама себя не может нести LOL");
        else {
            if(climbableAnimal.getWeight() <= getWeight() / 2) // проверака на вес другово зверя.
                System.out.println(getKindOfAnimal() + " несет на спине другово зверя(" + climbableAnimal.getKindOfAnimal() + ")");
            else System.out.println("Вес зверя(" + climbableAnimal.getKindOfAnimal() + ") слишком большой");
            // обезьяна не может нести на спине другово зверя, если вес зверя больше половины веса обезьяны.
        }
    }

    @Override
    public String toString() {
        return String.format("%s | вес: %s кг", getKindOfAnimal(), getWeight());
    }
}
