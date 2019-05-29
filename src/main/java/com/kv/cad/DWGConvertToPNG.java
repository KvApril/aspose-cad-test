package com.kv.cad;

import com.aspose.cad.Color;
import com.aspose.cad.Image;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PngOptions;

public class DWGConvertToPNG {
    public static void main(String[] args) {
        String srcFile = "2F.dwg";

        CadImage image = (CadImage) Image.load(srcFile);

        // Create an instance of CadRasterizationOptions and set its various properties
        CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
        rasterizationOptions.setNoScaling(true);
        rasterizationOptions.setBackgroundColor(Color.getWhite());
        rasterizationOptions.setPageWidth(1600);
        rasterizationOptions.setPageHeight(1600);
        rasterizationOptions.setPdfProductLocation("center");
        rasterizationOptions.setAutomaticLayoutsScaling(false);

        PngOptions pngOptions = new PngOptions();
        pngOptions.setVectorRasterizationOptions(rasterizationOptions);
        image.save("DWGConvertToPNG.png", pngOptions);
    }
}
