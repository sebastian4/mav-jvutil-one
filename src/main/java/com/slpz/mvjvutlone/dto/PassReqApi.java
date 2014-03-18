package com.slpz.mvjvutlone.dto;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class PassReqApi {
	
	private final String USER_AGENT = "Mozilla/5.0";
	
	private class ReqRunnable implements Runnable {

	    private String pid;

	    public ReqRunnable(String pid) {
	        this.pid = pid;
	    }

	    public void run() {
	    	
	    	String response = "server not available";
			
			try {   
				response = sendPost(pid);
			} catch (Exception e) {
				//e.printStackTrace();
			}
			
			System.out.println(response);
			System.out.println("------");
	    }
	}
	
	public String sendingPost(String pid) {
		
		String result = "message with pid "+pid+" was sent";
		
		try {
			
			ReqRunnable myRunnable = new ReqRunnable(pid);
	        Thread t = new Thread(myRunnable);
	        t.start();

		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		return result;
	}
	
	// HTTP POST request
	private String sendPost(String pid) throws Exception {
 
		String url = "http://localhost:4567/person/"+pid;
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		Thread.sleep(3000);
		
		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		con.setRequestProperty("Content-Type", "application/json");
		String urlParameters = "{ \"fname\": \"marco\", \"lname\": \"polo\", \"zip\": \"23844\" }";
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();
 
		int responseCode = con.getResponseCode();
		System.out.println("Sending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);
		
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		return response.toString();
	}

}
