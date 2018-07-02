/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import project.ParameterStringBuilder;

/**
 *
 * @author Alfa
 */
public class SetExpressCheckout {
    
    public SetExpressCheckout() throws IOException {
        
        URL url = new URL("https://api-3t.sandbox.paypal.com/nvp");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("application/x-www-form-urlencoded", "charset=utf-8");
        con.setConnectTimeout(10000);
        con.setReadTimeout(10000);
        
        Map<String,String> parameters = new HashMap<>();
        parameters.put("USER","vitorovalle_api1.gmail.com");
        parameters.put("PWD","5US83U9RYJ3Q5SBF");
        parameters.put("SIGNATURE","AqXEa4qVWnSZ.Ss4MDQQAppYR5VHAu5MmytaCt9UEnDM7gtebbXu53-o");
        
        parameters.put("METHOD","SetExpressCheckout");
        parameters.put("VERSION","114.0");
        
        parameters.put("PAYMENTREQUEST_0_PAYMENTACTION","SALE");
        parameters.put("PAYMENTREQUEST_0_AMT","22.00");
        parameters.put("PAYMENTREQUEST_0_CURRENCYCODE","BRL");
        parameters.put("PAYMENTREQUEST_0_ITEMAMT","22.00");
        parameters.put("PAYMENTREQUEST_0_INVNUM","1234");
        parameters.put("L_PAYMENTREQUEST_0_NAME0","Item A");
        parameters.put("L_PAYMENTREQUEST_0_DESC0","Produto A – 110V");
        parameters.put("L_PAYMENTREQUEST_0_AMT0","11.00");
        parameters.put("L_PAYMENTREQUEST_0_QTY0","1");
        parameters.put("L_PAYMENTREQUEST_0_ITEMAMT","11.00");
        parameters.put("L_PAYMENTREQUEST_0_NAME1","Item B");
        parameters.put("L_PAYMENTREQUEST_0_DESC1","Produto B – 220V");
        parameters.put("L_PAYMENTREQUEST_0_AMT1","11.00");
        parameters.put("L_PAYMENTREQUEST_0_QTY1","1");
        
        parameters.put("RETURNURL","https://www.paypal.com/br/home");
        parameters.put("CANCELURL","https://www.paypal.com/br/home");
        
        parameters.put("BUTTONSOURCE","BR_EC_EMPRESA");
        parameters.put("SUBJECT","vitorovalle@gmail.com");
        
        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
        out.flush();
        out.close();
        
        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(
        new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
           content.append(inputLine);
            }
        in.close();
        con.disconnect();
        
        System.out.print(inputLine);
}
}
