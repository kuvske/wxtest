package main;

import dogetpost.*;

public class getmuen {
  private static final String appid="wxbdd6cd5754a3a493";
  private static final String  scrpy="f5fd13bbde5a1d88273fb8bcdf56f115";
  private static final String url="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+scrpy;	
  public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      httpdogp hp = new httpdogp();
      //System.out.println(url);
      hp.doget(url);
	}

}
