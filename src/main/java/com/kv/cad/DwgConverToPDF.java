package com.kv.cad;


import com.aspose.cad.Color;
import com.aspose.cad.fileformats.cad.CadDrawTypeMode;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.PdfOptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DwgConverToPDF {
    public static void main(String[] args) {
        String srcFile = "2F.dwg";

        com.aspose.cad.Image cadImage  = com.aspose.cad.Image.load(srcFile);
        CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
        rasterizationOptions.setLayouts(new String[] { "Model" });
        rasterizationOptions.setNoScaling(true);
        rasterizationOptions.setBackgroundColor(Color.getWhite());
        rasterizationOptions.setPageWidth(cadImage.getWidth());
        rasterizationOptions.setPageHeight(cadImage.getHeight());
        rasterizationOptions.setPdfProductLocation("center");
        rasterizationOptions.setAutomaticLayoutsScaling(true);
        rasterizationOptions.setDrawType(CadDrawTypeMode.UseObjectColor);

        // Create an instance of PdfOptions
        PdfOptions pdfOptions = new PdfOptions();
        // Set the VectorRasterizationOptions property
        pdfOptions.setVectorRasterizationOptions(rasterizationOptions);

        // Export the DWG to PDF
        OutputStream stream = null;
        try {
            stream = new FileOutputStream("DwgConverToPDF.pdf");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        cadImage.save( stream, pdfOptions);
        //ExEnd:ConvertDWGFileToPDF

    }
}
