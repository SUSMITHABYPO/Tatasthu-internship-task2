public class ArrList {
    public static void main (String [] args){
        ArrayList al = new ArrayList();
        al.add("First");
        al.add("second");
        al.add("Third");
        System.out.println("The elements in the arraylist are : "+al);
        //to remove an element we have remove method
        //al.remove(2);
        System.out.println("The removed element is : "+al.remove(2));
        System.out.println("updated list is : "+al);
    }
}