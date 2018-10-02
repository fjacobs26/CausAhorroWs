//package com.bancos.sample.CausAhorroWs;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.http.HttpResponse;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.message.BasicNameValuePair;
//public class BbvaTest {
//		public static void main(String[] args) throws Exception { 		
//			//API end point to make a call
//			String endpoint = "https://apis.bbva.com/cards-sbx/v2";
//			String path = new URI(null, null, "/me/cards/{cardId}/transactions", null).getRawPath();
//			String url = endpoint+path;
//			HttpClientBuilder hcBuilder = HttpClients.custom();
//			HttpClient client = hcBuilder.build() ;
//			HttpGet request = new HttpGet(url); 
//			//Setting header parameters
//			request.addHeader("Accept", "application/json");
//			request.addHeader("Authorization", "jwt eJxt1MeOq1gUBdBfKXm...KqshJctUTsUwwYBPNpHWBS7AxmBy");
//			//Executing the call
//			HttpResponse response = client.execute(request);
//			System.out.println("\nSending 'Get' to " + url);
//			System.out.println("HTTP Response: " +  response.getStatusLine().getStatusCode());
//			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//	 		//Reading the response
//			StringBuffer result = new StringBuffer();
//			String line = "";
//			while ((line = rd.readLine()) != null) {
//				result.append(line);
//			} 
//			System.out.println(result.toString()); 
//		}
//	}
//
//}
