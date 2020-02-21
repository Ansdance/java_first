package by.it.yurtsevich.videoCourse.homework.homework19;

public class Test1 {
    public static void abc (String [] ... s){
        String abc = null;
        String [] array = new String[]{"hello world"};
        for (String s1: array){
            abc+=s;
            System.out.println(abc + array);
        }

    }

    public static void main(String[] args) {
        abc( null);
    }
}
