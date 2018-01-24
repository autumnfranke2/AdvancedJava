package Zoo;
public class Hawk extends Bird {

	
	public Hawk() {
		super();
		this.legs = 2;
		this.eyes = 2;
	}
	public void move() {
		// TODO Auto-generated method stub
		this.pos[0] = this.pos[0] + 5;
		this.pos[1] = this.pos[1] + 5;
		
		
	}


}
