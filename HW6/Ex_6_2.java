package HW6;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Ex_6_2 {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Map <String, String> personMap = new TreeMap <String, String>();
		personMap.put("Ivanov", "Ivan");
		personMap.put("Petrov", "Petro");
		personMap.put("Sidorov", "Vasyl");
		personMap.put("Zaremba", "Uljana");
		personMap.put("Pelehata", "Ira");
		personMap.put("Vesela", "Maria");
		personMap.put("Sumna", "Ivan");
		personMap.put("Vozna", "Ivan");
		
		for (Iterator<Entry<String, String>> i = personMap.entrySet().iterator();  i.hasNext();){
			   Map.Entry entry =  i.next();
			   System.out.println(entry.getKey() + " " + entry.getValue());
			}
		
		System.out.println();
		String ivalue; int l=0;
		for (Iterator<Entry<String, String>> i = personMap.entrySet().iterator();  i.hasNext();)
		{
			   Map.Entry entry =  i.next();
			  
			   for (Iterator<Entry<String, String>> j = personMap.entrySet().iterator();  j.hasNext();)
				{
					   Map.Entry entry1 =  j.next();
					   if ((entry.getValue(). equals (entry1.getValue())))
					   {
						 l++;  			   
					   }
				}

			   if (l<=3)  {
				   System.out.println("There are "+l+" persons with the same firstName among these 10 people"); 
					 }
		}
		
		
		
		System.out.println();
		
		
		String n="Ira";
		String k;
		int j=0;
		for (Iterator<Entry<String, String>> i = personMap.entrySet().iterator();  i.hasNext();){
			Entry<String, String> entry2 =  i.next();
			   if ((entry2.getValue(). equals (n)&&(j==0)))
			   {
				   	j++;			   
				   k=(String) entry2.getKey();
				   
			   System.out.println("Remove - "+k+" "+entry2.getValue()); 
			  i.remove();
			 //  System.out.println(k + " " + i.next().getValue());
			}
		}
		System.out.println();
		for (Iterator<Entry<String, String>> i = personMap.entrySet().iterator();  i.hasNext();){
			   Entry<String, String> entry =  i.next();
			   System.out.println(entry.getKey() + " " + entry.getValue());
			}


	}
}
