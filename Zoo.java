import java.util.ArrayList;

public class Zoo {
	
	ArrayList<Rabbit>rabbits = new ArrayList<Rabbit>();
	ArrayList<Bobcat>bobcat = new ArrayList<Bobcat>();
	
	public Zoo() {
		rabbits.add(new Rabbit());
		rabbits.add(new Rabbit());
		
		bobcat.add(new Bobcat());
		bobcat.add(new Bobcat());
	}
	
	public int advance() {

		int rabbitcount = rabbits.size();
		System.out.print("Rabbits: ");
		System.out.println(rabbitcount);
		
		for(int n = 0; n < rabbitcount; n++) {
			
			if(rabbitcount > 1) {
				
				if(rabbitcount < 500) {
				
					
				for(int rab = 0; rab < rabbits.get(n).offspring; rab++) {
					
					rabbits.add(new Rabbit());
					if (rabbitcount < 30) {
						rabbits.add(new Rabbit());
						rabbits.add(new Rabbit());
						rabbits.add(new Rabbit());
						rabbits.add(new Rabbit());
						rabbits.add(new Rabbit());
						rabbits.add(new Rabbit());
						rabbits.add(new Rabbit());
						rabbits.add(new Rabbit());
					}
					}
				}
			}
		}		
		int bobcatCount = bobcat.size();
		
		for (int n = 0; n < bobcatCount / 2; n++ ) {
			if(rabbits.size() > Math.sqrt(bobcat.size())) {
			}
			else {
				bobcat.remove(n);
			}
			rabbits = bobcat.get(n).eat(rabbits);
			
		}
		if(rabbits.size() > bobcat.size()) {
		for(int n = 0; n < bobcatCount / 2; n++) {
			bobcat.add(bobcat.get(n).Reproduce());
		}
		}
		System.out.print("Bobcats: ");
		System.out.println(bobcatCount);
		
		return 0;
	}
	
	
}

	

