package behavioral.template.callback;

/**
 * @author wangxin
 * 2020/3/21 15:47
 * @since
 **/
public class AbsClass implements Cloneable{

    public void templateMethod1(Runnable method1Callback,
                                Runnable method2Callback){
        method1Callback.run();
        method2Callback.run();
    }

    public void templateMethod2(Runnable method3Callback, Runnable method4Callback) throws CloneNotSupportedException {
        method3Callback.run();
        method4Callback.run();

        AbsClass absClass = new AbsClass();
        absClass.clone();
    }
}
