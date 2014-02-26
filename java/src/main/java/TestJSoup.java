import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class TestJSoup {
    public static void main(String[] args) throws IOException {
        Scanner fi = new Scanner(new File("d:\\sample.txt"));
//        Scanner fi = new Scanner(new File("d:\\standard.xml"));
//        Scanner fi = new Scanner(new File(args[0]));
        StringBuilder sb = new StringBuilder();
        while (fi.hasNextLine()) {
            sb.append(fi.nextLine()).append("\n");
        }
        String html = sb.toString();
        int iterations = 100;
//        int iterations = Integer.parseInt(args[1]);
        for (int i = 40; i > 1; i--) {
            double allTime = System.nanoTime();
            double timeSum = 0;
            double time = 0;

            for (int j = 0; j < iterations * i; j++) {
                time = System.nanoTime();
                Document document = Jsoup.parse(html);
//            System.out.println("WTF" + 1000f);
                timeSum += (System.nanoTime() - time) / 1000f;
                timeSum = (float)(System.nanoTime() - time) ;
            }
            System.out.println("time for i = " + i*iterations +"time is " + (System.nanoTime() - allTime) / 1000f + "     timesum : " + allTime + " and average : " + (float)(timeSum / (i)));

        }
        System.out.println("WTF!!!!!!!!!" + 1000f);
    }
}
