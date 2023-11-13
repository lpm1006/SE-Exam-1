package StrategyPattern;

import StrategyPattern.FlyBehavior.FlyBehavior;
import StrategyPattern.FlyBehavior.FlyNoWay;
import StrategyPattern.QuackBehavior.QuackBehavior;
import StrategyPattern.QuackBehavior.Squeak;

public class RubberDuck extends Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuck() {
		quackBehavior.quack();
	}
}
