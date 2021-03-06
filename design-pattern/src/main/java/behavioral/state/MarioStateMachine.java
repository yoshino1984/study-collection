package behavioral.state;

import behavioral.state.pattern.IMario;
import behavioral.state.pattern.SmallMario;

/**
 * 马里奥状态机（管理状态，将具体事件触发的状态转移和动作执行委托给具体的状态对象执行）
 * @author wangxin
 * 2020/4/4 15:43
 * @since
 **/
public class MarioStateMachine {
    private int score;

    private IMario currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = SmallMario.getInstance();
    }

    public void obtainMushRoom() {
        this.currentState.obtainMushRoom(this);
    }

    public void obtainCape(MarioStateMachine stateMachine) {
        this.currentState.obtainCape(this);
    }

    public void obtainFireFlower(MarioStateMachine stateMachine)  {
        this.currentState.obtainFireFlower(this);
    }

    public void meetMonster(MarioStateMachine stateMachine) {
        this.currentState.meetMonster(this);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public IMario getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }
}

