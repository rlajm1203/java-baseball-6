package baseball.computer;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class BaseballNumbersCreator {

    public static List<Integer> create(int length){
        List<Integer> numbers = new ArrayList<>();
        while(numbers.size()<length){
            int number = Randoms.pickNumberInRange(1,9);
            if(!numbers.contains(number)) numbers.add(number);
        }
        return numbers;
    }

}
