public class IbuildMethode{
    public static void main(String args[]){
        String str="Hariom Kumar";
        System.out.println(str.concat(" Kumar "));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("Kumar"));
        System.out.println(str.substring(0,4));
        System.out.println(str.lastIndexOf('a'));

        String s1="hariom";
        String s2="hariom";
        String s3="Hariom";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

        String name="   hariom  ";
        System.out.println(name.length());
        System.out.println(name.trim().length());
        
    }
}