package chapter_7;

import java.util.HashMap;
import java.util.Map;

class Dog{	
	public Dog(String n){
		name = n;
	}
	public String name;
	
	@Override
	public int hashCode() {
		return name.length();
	}
	
	@Override
	public boolean equals(Object o) {
		if((o instanceof Dog) && 
				(((Dog) o).name == name)){
			return true;
		}else{
			return false;
		}
	}	
}

class Cat{}

enum Pets {DOG, CAT, HORSE}

public class MapTest {

	public static void main(String[] args) {
		
		Map<Object, Object> m =new HashMap<Object, Object>();
		
		m.put("k1", new Dog("aiko")); 
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT key");
		Dog d1 = new Dog("clover"); 
		m.put(d1, "Dog key");
		m.put(new Cat(), "Cat key");
		
		System.out.println(m.get("k1"));
		String k2 = "k2";
		System.out.println(m.get(k2));
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(d1));
		System.out.println(new Cat());
		System.out.println(m.size());
	}

}
