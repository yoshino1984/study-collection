package behavioral.state.pattern;

import behavioral.state.MarioStateMachine;
import behavioral.state.State;

/**
 * 马里奥状态接口，
 *
 * @author wangxin
 * 2020/4/4 15:55
 * @since
 **/
public interface IMario {
    State getName();

    default void obtainMushRoom(MarioStateMachine stateMachine) {}

    default void obtainCape(MarioStateMachine stateMachine) {}

    default void obtainFireFlower(MarioStateMachine stateMachine)  {}

    default void meetMonster(MarioStateMachine stateMachine) {}

}
