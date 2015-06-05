package com.github.cchacin;

import com.github.cchacin.util.Asset;

import java.util.Arrays;
import java.util.List;

public class Sample3 {

  // Strategy Pattern

  public static void totalAssets(List<Asset> assets) {
    int total = 0;
    for (Asset asset : assets) {
      total += asset.value;
    }
    System.out.println(total);
  }

  public static void main(String[] args) {

    List<Asset> assets =
        Arrays.asList(new Asset(Asset.AssetType.STOCK, 100), new Asset(Asset.AssetType.BOND, 200),
            new Asset(Asset.AssetType.STOCK, 300), new Asset(Asset.AssetType.BOND, 400));


    // Total of assets
    totalAssets(assets);

    // Total of STOCK

    // Total of BOND
  }
}
