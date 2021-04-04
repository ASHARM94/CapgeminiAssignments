import java.util.*;  

class Person implements Comparable<Person>{
    int weight,height;
    String name;
    Person(int weight,int height,String name){
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public int compareTo(Person p) {  
        if(weight>p.weight){  
            return 1;  
        }else if(weight<p.weight){  
            return -1;  
        }else{ 
            if (height>p.height){
                return 1;
            }
            else if (height<p.height){
                return -1;
            }
            else{
                return 0;
            }
          
        }  
    }  
}


public class Collection1 {
    public static void main(String[] args) {
        Set<Person> set=new TreeSet<Person>();
        Person p1 = new Person(15,6,"Aman");
        Person p2 = new Person(10,5,"Shubham");
        Person p3 = new Person(10,4,"Pradhan");

        set.add(p1);
        set.add(p2);
        set.add(p3);

        for (Person p:set){
            System.out.println(p.name);
        }
    }
}