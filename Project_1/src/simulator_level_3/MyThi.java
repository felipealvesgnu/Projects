package simulator_level_3;

class MyThi {
	private int x = 7;
	private int y = 10;
	class MyInt{
		public void setExt(){
			System.out.println(" External value: " + x);
			System.out.println(" internal class ref is: " + this);
			System.out.println(" External class ref is: " + MyThi.this.y);
		}
	}
	public static void main(String[] args) {
		
		MyThi.MyInt inn = new MyThi().new MyInt();
		inn.setExt();
	}

}
