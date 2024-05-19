public class Array {
    public static void main(String[] args) {
        System.out.println("Arrays");

        int marks[] =new int[3];
        marks[0]=100;
        marks[1]=200;
        marks[2]=300;
        System.out.println(marks[1]);
        System.out.println("Print by loop");
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
