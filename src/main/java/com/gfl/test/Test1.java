package com.gfl.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Test1 {

    /**
     * @param url 访问路径
     * @return
     */

    public Document getDocument(String url) {

        try {

            //5000是设置连接超时时间，单位ms

            return Jsoup.connect(url).timeout(5000).get();

        } catch (IOException e) {

            e.printStackTrace();

        }

        return null;

    }

    public static void main(String[] args) {

        Test1 t = new Test1();

        Document document = t.getDocument("https://voice.hupu.com/nba");
        Elements elements = document.select("div.news-list > ul > li > div.list-hd > h4 > a");
        for (Element element : elements) {
            //System.out.println(element);
            //获取详情页链接
            String d_url = element.attr("href");
            //获取标题
            String title = element.ownText();

            System.out.println("详情页链接：" + d_url + " ,详情页标题：" + title);

        }




       /* Document doc = t.getDocument("https://baike.baidu.com/item/jsoup/9012509?fr=aladdin");

        Elements elements1 = doc.select("[class=body-wrapper]");
        Elements select1 = elements1.select("[class=content]");
        Elements select2 = select1.select("[class=lemma-summary]");
        Elements select3 = select2.select("[class=para]");
        System.out.println(select3.text());*/

//        // 获取目标HTML代码
//
//        Elements elements1 = doc.select("[class=t clearfix]");
//
//        //今天
//
//        Elements elements2 = elements1.select("[class=sky skyid lv2 on]");
//
//        String today = elements2.get(0).text();
//
//        System.out.println("今日天气： "+today);
//
//
//
//        //几号
//
//        Elements elements3 = elements1.select("h1");
//
//        String number = elements3.get(0).text();
//
//        System.out.println("日期： "+number);
//
//
//        // 天气
//
//        Elements elements4 = elements1.select("[class=wea]");
//
//        String rain = elements4.get(0).text();
//
//        System.out.println("天气： " + rain);
//
//
//        // 最高温度
//
//        Elements elements5 = elements1.select("span");
//
//        String highTemperature = elements5.get(0).text() + "°C";
//
//        System.out.println("最高温：" + highTemperature);
//
//
//        // 最低温度
//
//        Elements elements6 = elements1.select(".tem i");
//
//        String lowTemperature = elements6.get(0).text();
//
//        System.out.println("最低温：" + lowTemperature);
//
//
//        // 风力
//
//        Elements elements7 = elements1.select(".win i");
//
//        String wind = elements7.get(2).text();
//
//        System.out.println("风力：" + wind);

    }

}
