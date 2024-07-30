package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Money {

    public static String getRate(String fromT, String toT, List<Map<String, String>> moneys) {
        String rate = "";
        for (Map<String, String> money : moneys) {
            if (money.get("From").equals(fromT) && money.get("To").equals(toT)) {
                rate = money.get("Rate");
            }
        }
        return rate;
    }


    public static Map<String, String> rateMoney(String fromT, String toT, String rate) {
        Map<String, String> rateMoney = new HashMap<>();
        rateMoney.put("From",  fromT);
        rateMoney.put("To",  toT);
        rateMoney.put("Rate",  rate);
        return rateMoney;
    }

    public static void main(String[] args) {
        List<Map<String, String>> moneys = new ArrayList<>();
        moneys.add(rateMoney("USA","VND","1.25"));
        moneys.add(rateMoney("JPP","VND","1.01"));
        System.out.println("Hello word!!");
        System.out.println(getRate("USA", "VND", moneys));
        
        
    }

}
