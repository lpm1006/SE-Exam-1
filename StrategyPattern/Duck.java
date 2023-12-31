package StrategyPattern;

import StrategyPattern.FlyBehavior.FlyBehavior;
import StrategyPattern.FlyBehavior.FlyWithWings;
import StrategyPattern.QuackBehavior.Quack;
import StrategyPattern.QuackBehavior.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	Duck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuck() {
		quackBehavior.quack();
	}
}
