package com.example.util;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebCrawler {

    public void crawl(String startUrl, int maxPages) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(startUrl);
        visited.add(startUrl);

        while (!queue.isEmpty() && visited.size() < maxPages) {
            String url = queue.poll();
            System.out.println("Crawling: " + url);
            try {
                Document document = Jsoup.connect(url)
                        .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64)")
                        .timeout(10000)
                        .get();

                System.out.println("Title: " + document.title());

                Elements links = document.select("a[href]");
                for (Element link : links) {
                    String foundUrl = link.absUrl("href");
                    if (foundUrl.isEmpty() || visited.contains(foundUrl)) {
                        continue;
                    }
                    if (visited.size() >= maxPages) {
                        break;
                    }
                    visited.add(foundUrl);
                    queue.add(foundUrl);
                }

                System.out.println("Found " + links.size() + " links on this page.\n");
            } catch (IOException e) {
                System.err.println("Failed to crawl " + url + ": " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java com.example.util.WebCrawler <start-url> [max-pages]");
            System.exit(1);
        }

        String startUrl = args[0];
        int maxPages = args.length > 1 ? Integer.parseInt(args[1]) : 10;

        new WebCrawler().crawl(startUrl, maxPages);
    }
}
