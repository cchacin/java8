package com.github.cchacin;

import com.github.cchacin.util.StockInfo;
import com.github.cchacin.util.StockUtil;
import com.github.cchacin.util.Timeit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample7 {
  // Give me the greater Stock value less than 500$ from this list:

  public static final List<String> symbols = Arrays.asList("AMD", "HPQ", "IBM", "TXN", "VMW",
      "XRX", "AAPL", "ADBE", "AMZN", "CRAY", "CSCO", "DELL", "GOOG", "INTC", "INTU", "MSFT",
      "ORCL", "TIBX", "VRSN", "YHOO");
  private static StockInfo initial = new StockInfo("", 0.0);


  public static void findStockImperative(List<String> symbols) {

    List<StockInfo> stockPrices = new ArrayList<>();

    for (String ticker : symbols) {
      stockPrices.add(StockUtil.getPrice(ticker));
    }

    List<StockInfo> stocksLessThan500 = new ArrayList<>();
    for (StockInfo stockInfo : stockPrices) {
      if (StockUtil.isPriceLessThan(500).test(stockInfo))
        stocksLessThan500.add(stockInfo);
    }

    StockInfo highPriced = new StockInfo("", 0.0);
    for (StockInfo stockInfo : stocksLessThan500) {
      highPriced = StockUtil.pickHigh(highPriced, stockInfo);
    }

    System.out.println(highPriced);
  }

  public static void findStockFunctional(Stream<String> symbols) {
    System.out.println(symbols.map(StockUtil::getPrice).filter(StockUtil.isPriceLessThan(500))
        .reduce(initial, StockUtil::pickHigh));
  }

  public static void main(String[] args) {
    Timeit.code(() -> findStockImperative(symbols));
  }
}
