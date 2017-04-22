package dogetpost;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

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
	
	public static void dopost(String url,String ourstr){
		DefaultHttpClient httpclient = new DefaultHttpClient();
		HttpPost hp = new HttpPost(url);
		StringEntity ste= new StringEntity(ourstr,"utf-8");
		hp.setEntity(ste);
		
		try {
			HttpResponse response = httpclient.execute(hp);
			HttpEntity he = response.getEntity();
			String st = EntityUtils.toString(he);
			
			JSONObject js = new JSONObject(st);
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
