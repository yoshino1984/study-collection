package behavioral.state.pattern;

import behavioral.state.MarioStateMachine;
import behavioral.state.State;

/**
 * 小马里奥
 *
 * @author wangxin
 * 2020/4/4 15:58
 * @since
 **/
public class SuperMario implements IMario {
    private static final SuperMario SUPER_MARIO = new SuperMario();

    private SuperMario() {
    }

    public static SuperMario getInstance() {
        return SUPER_MARIO;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SuperMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 100);
    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(CapeMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(FireMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 300);
    }

    @Override
    public State getName() {
        return State.SUPER;
    }

}
