package Zoo;

public abstract class Animal {
	
	int legs;
	int eyes;
	String food; // plant or meat
	boolean isFemale;
	double age;
	double lifespan;
	int pos[] = {0,0};
	int offspring = 1;
	
	Animal(){
		
	}
	
	public void Move() {
		this.pos[0] = this.pos[0]+5;
		
	}
	
	public abstract void growOlder();
	
	public void eat() {
		
	}
}
