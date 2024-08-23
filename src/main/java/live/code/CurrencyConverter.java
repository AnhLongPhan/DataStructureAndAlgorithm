package live.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CurrencyConverter {
    private List<Map<String, String>> rates;

    public CurrencyConverter(List<Map<String, String>> rates) {
        this.rates = rates;
    }

    public List<String> findRate(String fromCurrency, String toCurrency) {
        List<String> result = new ArrayList<>();
        for (Map<String, String> rate : rates) {
            if (rate.get("From").equals(fromCurrency) && rate.get("To").equals(toCurrency)) {
                result.add(rate.get("Rate"));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Dữ liệu bảng tỉ giá
        List<Map<String, String>> rates = new ArrayList<>();
        
        rates.add(createRate("USD", "AUD", "1.38"));
        rates.add(createRate("VND", "JPY", "0.0045"));
        rates.add(createRate("USD", "JPY", "103.57"));
        rates.add(createRate("VND", "EUR", "0.000037"));
        rates.add(createRate("VND", "THB", "0.0013"));
        rates.add(createRate("JPY", "EUR", "0.0082"));
        rates.add(createRate("JPY", "CAD", "0.013"));
        rates.add(createRate("EUR", "USD", "1.18"));
        rates.add(createRate("USD", "VND", "23165"));

        // Tạo đối tượng CurrencyConverter
        CurrencyConverter converter = new CurrencyConverter(rates);

        // Tìm tỉ giá từ USD sang JPY
        String fromCurrency = "USD";
        String toCurrency = "JPY";
        List<String> possibleRates = converter.findRate(fromCurrency, toCurrency);
        
        System.out.println("Tỉ giá từ " + fromCurrency + " sang " + toCurrency + ": " + possibleRates);
    }

    private static Map<String, String> createRate(String from, String to, String rate) {
        Map<String, String> rateMap = new HashMap<>();
        rateMap.put("From", from);
        rateMap.put("To", to);
        rateMap.put("Rate", rate);
        return rateMap;
    }
}
