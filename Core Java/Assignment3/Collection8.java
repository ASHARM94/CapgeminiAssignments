import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
  
class Collection8 {
    public static void main(String args[])
    {
        CopyOnWriteArrayList<Integer> list
            = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Integer no = (Integer)itr.next();
            System.out.println(no);
            if (no == 5)
  
                list.add(14);
        }
    }
}
© 2021 GitHub, Inc.