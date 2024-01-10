public class strings {

    public String scroll(String s){
        String a=s.substring(1);
        String b=s.substring(0,1);
        String c=b+a;
        return c;
    }

    public static void main(String [] args){
        strings a= new strings();
        a.scroll("Hello World");
}
}