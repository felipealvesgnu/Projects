package chapter_9;

class ClassExt {
	static int z = 10;
	int z2;
	
	static class ClassInt{
		static int a = z;
	}
	
	public static void main(String[] args) {
		System.out.println(ClassInt.a);
		System.out.println(ClassExt.z);
	}

}
