package ex_14_String;

public class Lab143_String_Functions {

    public static void main(String[] args) {

        String name = "Sonal";

        //1.  length() and charAt()
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));
        //System.out.println(name.charAt(10));

        // 2. concat()
        System.out.println(name.concat(" Pawar"));

        //3. contains()
        System.out.println(name.contains("om"));

        //4. equals()
        System.out.println(name.equals("Sonal"));

        //5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));

        //6. indexOf()
        System.out.println(name.indexOf('l'));

        String s1 = "madam";
        System.out.println(s1.indexOf('m'));
        System.out.println(s1.lastIndexOf('m'));

        //7.length()
        System.out.println(s1.length());

        //8. replace(,)
        System.out.println(name.replace('n','N'));

        //split()
        String name4 = "komal@live.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);

        //10.substring(,)
        System.out.println(name.substring(1,3));

        //11. toLowercase()
        System.out.println("KOMAL".toLowerCase());

        //12.toUppercase()
        System.out.println("pawar".toUpperCase());

        //13.startsWith()
        System.out.println(name.startsWith("S"));

        //14.endsWith()
        System.out.println(name.endsWith("l"));

        //Concatenation(+)
        String s111 = "Hello";
        String s222 = "World";
        String s333 = "ji";
        String result = s111 + s222 + s333;
        System.out.println(result);

        //lastIndexOf()
        String n = "PramoddUTTA";
        System.out.println(n.indexOf('d'));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));
        System.out.println(n.lastIndexOf("n"));

    }
}
