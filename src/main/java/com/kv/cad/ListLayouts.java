package com.kv.cad;

import com.aspose.cad.Image;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.CadLayoutDictionary;
import com.aspose.cad.fileformats.cad.cadobjects.CadLayout;

public class ListLayouts {
    public static void main(String[] args) {
        String srcFile = "2F.dwg";

        Image image = Image.load(srcFile);

        CadImage cadImage = (CadImage)image;

        CadLayoutDictionary layouts = cadImage.getLayouts();
        for (CadLayout layout : layouts.getValues()) {
            System.out.println("Layout " + layout.getLayoutName());
        }
    }
}
