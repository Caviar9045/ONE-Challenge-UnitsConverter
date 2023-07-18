package com.alura.challenge.conversor.function;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyConvertFunction {
    private static final String API_BASE_URL = "https://v6.exchangerate-api.com/v6/d90ea659885afb25b1debd18/pair/%s/%s";
    
    public static double convertCurrency(String baseCurrency, String targetCurrency, double amount) throws Exception {
        String apiUrl = String.format(API_BASE_URL, baseCurrency, targetCurrency);
        
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String response = reader.readLine();
            reader.close();
            
            // Parse the JSON response
            // Assuming the response is in the format: {"base":"USD","rates":{"EUR":0.85}}
            String[] parts = response.split("\"conversion_rate\":");
            String ratesStr = parts[1].replace("}", "");
            
            // Get the exchange rate
            double exchangeRate = Double.parseDouble(ratesStr.substring(ratesStr.indexOf(":") + 1));
            
            // Convert the currency
            double convertedAmount = amount * exchangeRate;
            
            return convertedAmount;
        } else {
            throw new Exception("Failed to retrieve exchange rates. Response code: " + responseCode);
        }
    }
    
    public double Convert (double value, String currencyFrom, String currencyTo) {
        double result = 0.0;
        
        try {
            double amount = value; // Amount to convert
            String baseCurrency = currencyFrom; // Base currency
            String targetCurrency = currencyTo; // Target currency
            
            double convertedAmount = convertCurrency(baseCurrency, targetCurrency, amount);
            
            result = convertedAmount;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

