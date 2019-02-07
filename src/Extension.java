import java.util.*;

/**
 * Created by user on 27.01.2019.
 *
 * In this class I am training to work with Object class
 */
public class Extension {



    public static void main(String[] args) {
        /*A a = new A(1, 3);
        A b = new A(1, 3);
        Object o  = new Object();
        System.out.println(o.hashCode());

        System.out.println(o.toString());



        System.out.println(a.hashCode());

        System.out.println(a.toString());
        System.out.println(b.toString());
        o = a;
        System.out.println(o.getClass());
        System.out.println(o.hashCode());*/

       List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i = 9; i >= 0; i--) {
            String arg = "" + i;
            list.add(arg);
            if(i%2==0)
                list2.add(arg);
        }

        System.out.println(list.hashCode());
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list.indexOf("3"));

        list.sort(Comparator.<String>naturalOrder());

        Iterator<String> it = list.iterator();

        while (it.hasNext())
            System.out.print(it.next());

        System.out.println();
        printS(list);

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext())
            System.out.println(listIterator.next() + " : " + listIterator.nextIndex());
        while (listIterator.hasPrevious())
            System.out.println(listIterator.previous()  + " : " +  listIterator.previousIndex());


        list.sort(Comparator.reverseOrder());
        it= list.iterator();
        while (it.hasNext())
            System.out.print(it.next());

        System.out.println();
        System.out.println(list.contains("5"));
        list2.add("33");
        System.out.println(list.containsAll(list2));

        Set <Integer> set  = new HashSet<>();
        set.add(4);
        set.add(4);
        set.add(44);
        set.add(444);

        for (Integer aSet : set) {
            System.out.println(aSet);

        }
        print(set);

        System.out.println("set.size() = " + set.size());

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 30; i++) {
            treeSet.add(i%6);

        }
        System.out.println("treeSet = " + treeSet);

        treeSet.remove(3);
        System.out.println("treeSet = " + treeSet);
        System.out.println(treeSet.ceiling(3));
        System.out.println(treeSet.lower(3));
        print(treeSet);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Ace", 11);
        hashMap.put("Ace", 99);
        hashMap.put("Ace1", 12);
        hashMap.put("Ace2", 13);
        hashMap.put("Ace3", 14);
        System.out.println(hashMap.get("Ace"));
        System.out.println(hashMap.get("Ace1"));
        System.out.println(hashMap.get("Ace2"));
        System.out.println(hashMap.get("Ace3"));
        System.out.println(hashMap.containsValue(11));

        Set<Map.Entry<String, Integer>> setOfMaps = hashMap.entrySet();

        for(Map.Entry<String, Integer> me:setOfMaps)
            System.out.println(me.getKey()+ " - " + me.getValue());

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Z", 11);
        treeMap.put("X", 99);
        treeMap.put("C", 12);
        treeMap.put("V", 13);
        treeMap.put("B", 14);
        treeMap.put("B", 14);
        treeMap.put("B", 14);

        Set<Map.Entry<String, Integer>> setOfTreeMaps = treeMap.entrySet();

        for(Map.Entry<String, Integer> me:setOfTreeMaps)
            System.out.println(me.getKey()+ " - " + me.getValue());

        int [] intArr = new int[10];
        Arrays.fill(intArr, 100);

        for (int anIntArr : intArr) {
            System.out.println(anIntArr);

        }





    }

    public static void print(Collection<Integer> collection) {
        System.out.println(collection.getClass().toString().substring(16)+" " + collection);
    }

    public static void printS(Collection<String> collection) {
        System.out.println(collection.getClass().toString().substring(16)+" " + collection);
    }

}
