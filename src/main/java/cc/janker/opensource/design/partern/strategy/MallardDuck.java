package cc.janker.opensource.design.partern.strategy;

/**
 * Created by zhiyongliu3 on 2017/8/16.
 */
public class MallardDuck  extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();


    }
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
