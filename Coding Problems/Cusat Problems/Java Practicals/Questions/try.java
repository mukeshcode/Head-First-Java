import java.util.ArrayList;

class Try{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(3);
        System.out.println(arr.hashCode());
        arr.add(4);
        System.out.println(arr.hashCode());
        arr.add(5);
        System.out.println(arr.hashCode());
        // arr.add(6);
        // System.out.println(arr.hashCode());

    }
}
