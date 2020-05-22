import java.util.Base64;

public class EncodeDecode {

	public static String Encode(String str)
	{
	byte[] encoded = Base64.getEncoder().encode(str.getBytes());
    String newstr = new String(encoded);
	return newstr;
	}

	public static String Decode(String input) {
		byte[] decode = Base64.getDecoder().decode(input.getBytes());
		String newstr = new String(decode);
		return newstr;
	}

}
