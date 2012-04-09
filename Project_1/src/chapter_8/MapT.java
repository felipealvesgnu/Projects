package chapter_8;

import java.util.HashMap;
import java.util.Map;

class Galo{
	public String name;
	public Galo(String n){name = n;}
	
	public boolean equals(Object o){
		if((o instanceof Galo) && ((Galo)o).name == name ){
			return true;
		}else{return false;}
	}
	public int hashCode(){
		return name.length();
	}
}

class Pinto{ }

enum Pet{DOG, CAT, HORSE}

class MapT {
	public static void main(String[] args) {
		Map<Object, Object> m = new HashMap<Object, Object>(); 
		
		m.put("k1", new Galo("aiko"));
		m.put("k2", Pet.CAT);
		m.put(Pet.DOG, "Dog");
		Galo g = new Galo("Felipe");
		
		m.put(g, "key"); // reference with the above reference g
		g.name = "Fuga"; // change the g's reference 		
		
		
		System.out.println(m.get("k1"));
		System.out.println(m.get(Pet.DOG));
		System.out.println(m.get("k2"));
		System.out.println(m.get(g)); //null, because the reference searched is the new reference of g 
	}

}
