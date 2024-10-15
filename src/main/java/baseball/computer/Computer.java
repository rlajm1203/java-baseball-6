package baseball.computer;

import java.util.List;

public class Computer {

    private List<Integer> numbers;

    public Computer(int length){
        numbers = BaseballNumbersCreator.create(length);
    }

    public void recreate(int length){
        this.numbers = BaseballNumbersCreator.create(length);
    }

    public List<Integer> getNumbers(){
        return this.numbers;
    }

}
