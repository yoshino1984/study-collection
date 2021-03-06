package behavioral.state.fsm;

import behavioral.state.MarioStateMachine;
import behavioral.state.pattern.IMario;

/**
 * @author wangxin
 * 2020/4/4 15:44
 * @since
 **/
public class ApplicationDemo {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        IMario marioState = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + marioState);
    }
}
