public class Array {
    public static void main(String[] args) {
        System.out.println("Arrays");

        int marks[] =new int[3];
        marks[0]=001;
        marks[1]=002;
        marks[2]=003;
        marks[1]=004;
        marks[2]=005;
        System.out.println(marks[1]);
        System.out.println("Print by loop");
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
