//creating an array
//int marks[]=new int [50];
// int moreNumbers[]={4,5,6};
// String fruits []={"apple","mango"};
public class ArraysCC{
    public static void update (int marks []){
        for(int i =0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args []){
        int marks[]={97,99,98};
        update (marks);

        for(int i=0; i<marks.length; i++){
              System.out.println(marks[i]+" ");
        }
        System.out.println();

    }
}