package baseball.game;

import baseball.computer.Computer;
import baseball.player.Player;

import java.util.List;

public class GameContext {

    private final Player player;
    private final Computer computer;
    private final BaseballBasket basket;
    private final int length;

    public GameContext(Player player, Computer computer, int length){
        this.computer = computer;
        this.player = player;
        this.length = length;
        this.basket = new BaseballBasket();
    }

    public void start(){
        printStartMessage();
        do{
            player.input();
        } while(!isCorrect());
    }

    private boolean isCorrect(){
        List<Integer> playerNumbers = player.getNumbers();
        List<Integer> computerNumbers = computer.getNumbers();
        basket.classify(playerNumbers, computerNumbers);
        System.out.println("ball : "+basket.getBall().size());
        System.out.println("strike : " + basket.getStrike().size());
        reset();
        return basket.getStrike().size()==length;
    }

    private boolean reset(){
        return this.player.reset() && this.basket.reset();
    }

    private void printStartMessage(){
        System.out.println("=========Game Start=========");
    }

    private void printEndMessage(){
        System.out.println("=========축하드립니다. 정답을 맞추셨습니다.=========");
    }

}
