package ex9no2;

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id ==((Person)obj).id;
		else
			return false;
		
	}
	
	Person(long id) {
		this.id = id;
	}
}


public class ex9no2 {  //  452p
	public static void main(String[] args) {
		Person p1 = new Person(801108111122L);
		Person p2 = new Person(801108111122L);
		
		if(p1 == p2) 
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		
		if(p1.equals(p2))
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
	}
}


