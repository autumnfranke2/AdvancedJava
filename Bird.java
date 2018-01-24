
public abstract class Bird extends Animal{

	@Override
	public void growOlder() {
		// TODO Auto-generated method stub
		this.age++;
		
	}
	
	boolean doesfly;
	
	public abstract void move();

}
