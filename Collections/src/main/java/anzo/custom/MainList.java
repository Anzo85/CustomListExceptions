package anzo.custom;

/**
 * Created by andreyz on 27.09.16.
 */
public class MainList {

    public static void main(String[] args) {

        try {

            CustomArrayList eList = new CustomArrayList(-1);

//        list.add(0.1, "RANDOM");
//        System.out.println(list);
//        list.add(0.1, "RANDOM-2");
//        System.out.println(list);
//        list.add(0.1, "RANDOM-3");
//        System.out.println(list);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

            try {
                CustomArrayList list = new CustomArrayList(10);
                list.add(0, "test");
                list.add(1, "test2");
                list.add(2, "test3");
                System.out.println(list);

                list.add(100, "exception");

                list.remove(1);
                System.out.println(list);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
