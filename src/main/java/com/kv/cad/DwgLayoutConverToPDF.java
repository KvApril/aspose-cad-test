package com.kv.cad;

import com.aspose.cad.Color;
import com.aspose.cad.Image;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;

public class DwgLayoutConverToPDF {
    public static void main(String[] args) {
        String srcFile = "2F.dwg";

        CadImage image = (CadImage) Image.load(srcFile);

        // Create an instance of CadRasterizationOptions and set its various properties
        CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
        rasterizationOptions.setNoScaling(true);
        rasterizationOptions.setBackgroundColor(Color.getWhite());
        rasterizationOptions.setPageWidth(image.getWidth());
        rasterizationOptions.setPageHeight(image.getHeight());
        rasterizationOptions.setPdfProductLocation("center");
        rasterizationOptions.setAutomaticLayoutsScaling(false);

        // Specify desired layout name
        rasterizationOptions.setLayouts(new String [] {"布局1"});
        // Create an instance of PdfOptions
        PdfOptions pdfOptions = new PdfOptions();
        // Set the VectorRasterizationOptions property
        pdfOptions.setVectorRasterizationOptions(rasterizationOptions);
//
////         Export the DWG to PDF
        image.save("DwgLayoutConverToPDF.pdf", pdfOptions);
//        ExEnd:ExportSpecificDWGLayoutToPDF
    }
}
