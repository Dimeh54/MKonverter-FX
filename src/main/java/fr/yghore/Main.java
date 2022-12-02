package fr.yghore;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import fr.yghore.Components.Bold;
import fr.yghore.Components.CodeBlock;
import fr.yghore.Components.Component;
import fr.yghore.Components.Italic;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.xwpf.usermodel.*;

public class Main {
    public static void readDocxFile(String fileName) {
        try {
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            XWPFDocument document = new XWPFDocument(fis);
            List<XWPFParagraph> paragraphs = document.getParagraphs();
            StringBuilder stringBuilder = new StringBuilder("");
            for (XWPFParagraph paragraph : paragraphs) {
                for (XWPFRun run : paragraph.getRuns()) {
                    String text = run.text();
                    Component component = new Component(text);
                    if (run.isBold()) {
                        component = new Bold(component);
                    }
                    if (run.isItalic()) {
                        component = new Italic(component);
                    }
                    if (run.isEmbossed()) {
                        component = new CodeBlock(component);
                    }

                    stringBuilder.append(component.toMarkDown());
                }
                stringBuilder.append("\n");
            }
            System.out.println(stringBuilder);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readDocxFile("");
    }
}