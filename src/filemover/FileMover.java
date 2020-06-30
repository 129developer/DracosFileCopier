/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemover;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;

/**
 *
 * @author Admin
 *
 * C:\Users\Admin\Documents\NetBeansProjects\FileMover\dist>
 *
 * java -jar FileMover.jar "D:\\PROJECTS\\bayatrade\\REDAWA\\trunk\\"
 * "D:\\PROJECTS\\bayatrade\\REDAWA_BASE\\purchase\\branches\\RD0296-20\\"
 * "web/WebContent/app/base/purchase/controller/trn/PricingConsole/PricingConsoleContoller.js"
 * "web/WebContent/app/base/purchase/model/trn/PricingConsole/PricingConsoleModel.js"
 * "web/WebContent/app/base/purchase/view/trn/PricingConsole/PricingConsoleView.js"
 * "web/WebContent/app/base/purchase/view/trn/PricingConsole/RateUpdateWin.js"
 * "web/WebContent/resources/js/Utils/UploadWindow.js"
 *
 *
 */
public class FileMover {

    public static void copyFile(String from, String to) throws IOException {
        System.out.print("**");
        Path src = Paths.get(from);
        System.out.print("**");
        Path dest = Paths.get(to);
        System.out.print("**");
        File parent = new File(to).getParentFile();
        if (parent.mkdirs()) {
            System.out.print("Folders Created :" + parent.getAbsolutePath());
        }
        Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);

    }

    public static void main(String[] args) {
//        String from = args[0];
//        String to = args[1];
//        String[] filesAry = new String[args.length - 2];
//        for (int i = 0; i < filesAry.length; i++) {
//            filesAry[i] = args[i + 2];
//        }
//        copyFiles(from, to, filesAry);
        String path = "D:\\PROJECTS\\bayatrade\\REDAWA_BASE\\purchase\\branches\\RD0296-20\\web\\WebContent\\resources\\js\\Utils\\UploadWindow.js";
        String path1 = "D:\\PROJECTS\\bayatrade\\REDAWA_BASE\\purchase\\branches\\RD0299-20\\web\\WebContent\\resources\\js\\Utils2\\UploadWindow.js";
        System.out.println(new File(path1).getParentFile().mkdirs());

    }

    public static void copyFiles(String from, String to, String[] filesAry) {
        System.out.println("FROM PATH : " + from);
        System.out.println("TO PATH   : " + to);
        for (String filesAry1 : filesAry) {
            try {
                File f = new File(from + filesAry1.replaceAll("/", Matcher.quoteReplacement("\\")));
                File f2 = new File(to + filesAry1.replaceAll("/", Matcher.quoteReplacement("\\")).replaceFirst(Matcher.quoteReplacement("\\") + "base", ""));
                System.out.println("Moving file from : " + f.getAbsolutePath());
                System.out.println("to   : " + f2.getAbsolutePath());
                System.out.print("**");
                copyFile(f.getAbsolutePath(), f2.getAbsolutePath());
                System.out.println("*****");
            } catch (Exception ex) {
                ex.printStackTrace();
                Logger.getLogger(FileMover.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main1(String[] args) {
        String from = "D:\\PROJECTS\\bayatrade\\REDAWA\\trunk\\";
        String to = "D:\\PROJECTS\\bayatrade\\REDAWA_BASE\\purchase\\branches\\RD0296-20\\";
        String[] filesAry = {
            "web/WebContent/app/base/purchase/controller/trn/PricingConsole/PricingConsoleContoller.js",
            "web/WebContent/app/base/purchase/model/trn/PricingConsole/PricingConsoleModel.js",
            "web/WebContent/app/base/purchase/view/trn/PricingConsole/PricingConsoleView.js",
            "web/WebContent/app/base/purchase/view/trn/PricingConsole/RateUpdateWin.js",
            "web/WebContent/resources/js/Utils/UploadWindow.js"
        };

        for (String filesAry1 : filesAry) {
            try {
                File f = new File(from + filesAry1.replaceAll("/", Matcher.quoteReplacement("\\")));
                File f2 = new File(to + filesAry1.replaceAll("/", Matcher.quoteReplacement("\\")).replaceFirst(Matcher.quoteReplacement("\\") + "base", ""));
                System.out.println("from : " + f.getAbsolutePath());
                System.out.println("to   : " + f2.getAbsolutePath());
                copyFile(f.getAbsolutePath(), f2.getAbsolutePath());
            } catch (Exception ex) {
                ex.printStackTrace();
                Logger.getLogger(FileMover.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
