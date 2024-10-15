package baseball.player;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {

    private final List<Integer> numbers = new ArrayList<>();
    private final int length;

    public Player(int length){ this.length = length; }

    public void input(){
        try {
            System.out.print("숫자를 입력해주세요 : ");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String input = bufferedReader.readLine();
            if(input.chars().count()>length) throw new RuntimeException("숫자의 길이를 초과하였습니다.");
            process(input);
        } catch (IOException e){
            throw new RuntimeException("IOException 발생");
        }
    }

    public boolean reset(){
        return this.numbers.removeAll(this.numbers);
    }

    public List<Integer> getNumbers(){
        return this.numbers;
    }

    private void process(String input){
        Arrays.stream(input.split("")).forEach(in -> numbers.add(Integer.valueOf(in)));
    }
}
