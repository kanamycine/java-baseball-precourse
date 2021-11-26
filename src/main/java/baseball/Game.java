package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class Game {
    public static void play(){
        ArrayList<Integer> computerNumbers = new ArrayList<Integer>();
        ArrayList<Integer> userNumbers = new ArrayList<Integer>();
        int strikeCount = 0;
        int retryOrExitFlag = 3;

        computerNumbers = Computer.numberGenerator();

        while (true) {
            if (retryOrExitFlag == 2)
                return;
            if (retryOrExitFlag == 1) {
                computerNumbers = Computer.numberGenerator();
                retryOrExitFlag = 3;
            }

            userNumbers = User.numberGenerator();
            strikeCount = Judgement.Judgement(computerNumbers, userNumbers);
            if (strikeCount == 3){
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                retryOrExitFlag = Integer.parseInt(Console.readLine());
            }
        }
    }
}
