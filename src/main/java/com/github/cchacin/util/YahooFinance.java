package com.github.cchacin.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class YahooFinance {
  public static double getPrice(final String ticker) {
    try {
      final URL url = new URL("http://ichart.finance.yahoo.com/table.csv?s=" + ticker);
      Thread.sleep(1000);
      final BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
      final String data = reader.lines().skip(1).findFirst().get();
      final String[] dataItems = data.split(",");
      return Double.parseDouble(dataItems[dataItems.length - 1]);
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }
}
