package main.java.express;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    /**
     * 追加内容方法
     * @param fileName 文件目录
     * @param content 写入内容
     * @throws IOException 抛出异常
     */
    public void fileAppend(String fileName, String content) throws IOException {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(content);
        }
    }
}
