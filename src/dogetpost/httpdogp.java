package dogetpost;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class httpdogp {

	public static void doget(String url){
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet hg = new HttpGet(url);
		try {
			HttpResponse rp = httpclient.execute(hg);
			HttpEntity hentity=rp.getEntity();
			//String st = hentity.toString();
			String st = EntityUtils.toString(hentity);
			System.out.println(st);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
