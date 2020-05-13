import java.util.*;

import java.util.Collections;

public class Predator extends Animal{
	
	public boolean graze;
	
	
	public Predator(){
		super();
	}
	
	public Predator(int x, int y){
		super(x, y);
	}
	
	public void eat(){
		int count = 0;
		if (count == 1){
			ArrayList<Prey> targets;
			targets = eco.getAdjacentPrey(x, y);
			
			
			if ( targets.isEmpty() ){
				energy += 0;
			} else {
				Collections.shuffle(targets);
				Prey p = targets.get(0);
				p.die();
				energy += 2;
				System.out.println(energy);
			}
			count = 0;
		}
		if (count < 1) count ++;
		
	}
	
	public void checkReproduce(){
		if (energy > energyRepThresh)
			reproduce();
	}
	
	public void reproduce(){
		energy -= energyRepThresh;
		Predator a = new Predator(x, y);
		a.eco = this.eco;
		a.energy = 5;
		eco.birthList.add(a);
		System.out.println(energy);


	}
	
	
	public void checkDeath(){
		if(energy <= 0)
			die();
	}
	
	public void die(){
		eco.deathList.add(this);
		System.out.println(energy);
	}
	
	
	public void act(){
		int count = 0;
		eat();
		
	
		int dx =  (int) ( Math.random()*(1+1+1) ) -1;
		int dy =  (int) ( Math.random()*(1+1+1) ) -1;
		
		move(dx, dy);
		
		
		if (!(dx ==0 && dy ==0)){
			if (count < 2){
				count ++;
			}
			if (count == 2){
				energy -- ;
				count = 0;
			}
		}
			
		checkDeath();
		checkReproduce();
	}

}



