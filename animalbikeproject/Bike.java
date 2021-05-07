public  class Bike extends Vehicle{
		private int height;
		
		public Bike(String type,int height){
			super(type);
			this.height=height;
		}
		
		public void setHeight(int height){
			this.height=height;
		}
		
		public int getHeight(){
		return height;
		}
}