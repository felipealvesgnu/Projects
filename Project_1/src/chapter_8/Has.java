package chapter_8;

class Has {
	int z;
	
	Has(int a){
		z = a;
	}
	public boolean equals(Object o){
		if((o instanceof Has) && (((Has)o).z == this.z)){
			return true;
		}else{return false;}
	}
	public int hashCode(){
		return z*2;
	}
	
	public static void main(String[] args) {
		Has h = new Has(5);
		Has b = new Has(8);
		
		System.out.println(h.equals(b));
		System.out.println(h.hashCode());
		System.out.println(b.hashCode());
	}

}
