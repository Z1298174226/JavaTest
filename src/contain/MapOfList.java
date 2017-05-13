package contain;
import typeinfo.pets.*;
import java.util.*;
public class MapOfList {
public static Map<Person,List< ?extends Pet>> peoplePet=
new HashMap<Person,List< ?extends Pet>>();
static{
	peoplePet.put(new Person("zhao"), Arrays.asList(new Cat("Tom"),new Cat("Mike"),
			new Dog("Peter")));
	peoplePet.put(new Person("qian"), Arrays.asList(new Cymric("Lucy"),new Mutt("Jenny")));
}
public static void main(String[] args){
	System.out.println("Person:"+peoplePet.keySet());
	System.out.println("Pets:"+peoplePet.values());
	for(Person per:peoplePet.keySet()){
		System.out.print(per+" has: ");
		for(Pet pet:peoplePet.get(per)){
			System.out.print(" "+pet);
		}
		System.out.println();
	}
}
}
