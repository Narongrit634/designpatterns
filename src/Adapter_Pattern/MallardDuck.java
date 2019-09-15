package Adapter_Pattern;

public class MallardDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
