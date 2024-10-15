package baseball;

import baseball.computer.Computer;
import baseball.game.GameContext;
import baseball.player.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    private static int length;

    public static void main(String[] args) {

        setLength();

        Player player = new Player(length);
        Computer computer = new Computer(length);
        GameContext game = new GameContext(player, computer, length);

        game.start();
    }

    public static void setLength(){
        try {
            System.out.print("숫자의 길이를 설정해주세요 : ");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            length = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e){
            throw new RuntimeException();
        }
    }
}
