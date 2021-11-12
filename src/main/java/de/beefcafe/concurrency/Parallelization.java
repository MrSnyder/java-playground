package de.beefcafe.concurrency;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.IntStream;

public class Parallelization {

    private static final Map<String,String> urlToFilename = Collections.synchronizedMap(new HashMap<>());

    private static void fetchWebpage(String url) {
        System.out.println("Fetching page " + url);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fetched page " + url);
        urlToFilename.put(url, "/home/crawler/tmp/" + UUID.randomUUID().toString());
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            new Thread(new WebCrawlRunnable("http://www.mypage.de/" + i + ".html")).start();
//        }
//        IntStream.range(0, 10).mapToObj(i -> "http://www.mypage.de/" + i + ".html").forEach(url -> fetchWebpage(url));
        IntStream.range(0, 10).parallel().mapToObj(i -> "http://www.mypage.de/" + i + ".html").forEach(url -> fetchWebpage(url));
    };

    private static class WebCrawlRunnable implements Runnable {

        private final String url;

        private WebCrawlRunnable(String url) {
            this.url = url;
        }

        @Override
        public void run() {
            fetchWebpage(url);
        }
    }
}
