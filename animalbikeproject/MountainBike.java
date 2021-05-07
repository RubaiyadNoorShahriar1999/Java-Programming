public class MountainBike extends Bike{
	private int suspension;
	
	public MountainBike(String type,int height,int suspension){
		super(type,height);
		this.suspension= suspension;
	}
	
	
	public void setSuspension(int suspension){
	this.suspension= suspension;}
	
	public int getSuspension(){
		return suspension;
	}
	}
	