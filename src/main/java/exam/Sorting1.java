package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting1 {


    static class Rabbit   implements Comparable{
        Integer id;
        String name;
        public Rabbit(Integer id,String name){
            this.id=id;
            this.name=name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Object o) {
            return this.id.compareTo(((Rabbit)o).id);
        }

        @Override
        public String toString() {
            return "Rabbit{" +
                    "id=" + id +
                    '}';
        }
    }
    public static void main(String[] args) {
        Rabbit r1= new Rabbit(1,"A");
        Rabbit r2=new Rabbit(2,"C");
        Rabbit r3= new Rabbit(3,"B");
        List<Rabbit> rabbitList= new ArrayList<>();

        rabbitList.add(r1);
        rabbitList.add(r3);
        rabbitList.add(r2);


        System.out.println(rabbitList);
        Collections.sort(rabbitList);
        System.out.println(rabbitList);

        //Collections.sort(rabbitList,(e,f)->e.name.compareTo(f.name));
        Collections.sort(rabbitList, Comparator.comparing(Rabbit::getName));
        System.out.println(rabbitList);
        Rabbit newRabbit=new Rabbit(2,"A");
        int result = Collections.binarySearch(rabbitList, newRabbit, (e, f) -> e.getId().compareTo(f.getId()));
        System.out.println(result);




    }
}
