package baseball.game;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseballBasket {

    private final Set<Integer> ball;
    private final Set<Integer> strike;

    public BaseballBasket(){
        this.ball = new HashSet<>();
        this.strike = new HashSet<>();
    }

    public void classify(List<Integer> inputs, List<Integer> target){
        for(int i=0; i<inputs.toArray().length; i++){
            if(inputs.get(i).equals(target.get(i))) strike.add(inputs.get(i)); // strike인 숫자 찾기
            else if(target.contains(inputs.get(i))) ball.add(inputs.get(i)); // ball인 숫자 찾기
            else continue;
        }
    }

    public boolean reset(){
        return this.ball.removeAll(this.ball) && this.strike.removeAll(this.strike);
    }

    public Set<Integer> getBall(){
        return this.ball;
    }

    public Set<Integer> getStrike(){
        return this.strike;
    }

}
