
public class stringBuffer {

	public static void main(String[] args) {

		String str="Windows";
        StringBuilder str1=new StringBuilder(str);
        str1.append( "Mac OS");
        str1.replace(0,5, "windows");
        System.out.println(str1);

	}

}
