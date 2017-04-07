package check;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class check_begin {
  
	public static String  check_now(String token,String timestamp,String nonce){
		String[] st = new String[]{token,timestamp,nonce};
		Arrays.sort(st);
       StringBuffer sb= new StringBuffer();
       for(int i = 0;i<st.length;i++){
    	   sb.append(st[i]);
       }
		jiami jm = new jiami();
		System.out.println("ÅÅÐòºóÆ´½Ó×Ö·û"+sb.toString());
		return jm.SHA1(sb.toString());
		
	}
}
