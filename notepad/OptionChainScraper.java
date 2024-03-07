package com.mahait.notepad;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class OptionChainScraper {
    public static void main(String[] args) {
        String nseUrl = "https://www.nseindia.com/option-chain";
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(nseUrl);
            request.addHeader("User-Agent", "Mozilla/5.0"); // Set a user agent to avoid blocking

            HttpResponse response = httpClient.execute(request);

            if (response.getStatusLine().getStatusCode() == 200) {
                // Parse the HTML content with Jsoup
                Document document = Jsoup.parse(response.getEntity().getContent(), "UTF-8", nseUrl);
                // You can now use Jsoup to extract option chain data from the HTML document
                // Example: Element optionTable = document.getElementById("optionChainTable");
                // Parse the table and extract data
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
