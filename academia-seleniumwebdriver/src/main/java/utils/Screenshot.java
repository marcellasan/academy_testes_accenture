package utils;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public Screenshot() {
    }

    public static void tirar(WebDriver navegador, String arquivo) {
        File screenshot = (File)((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshot, new File(arquivo));
        } catch (Exception var4) {
            System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + var4.getMessage());
        }

    }

}
