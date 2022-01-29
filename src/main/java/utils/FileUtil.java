package utils;

import java.io.File;

public class FileUtil {
  public String getAbsoluteFilePath (String fileName) {
    File file = new File(fileName);
    return file.getAbsolutePath();
  }
}
