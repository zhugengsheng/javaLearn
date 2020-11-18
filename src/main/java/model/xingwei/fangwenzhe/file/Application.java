package model.xingwei.fangwenzhe.file;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/12 8:53 上午
 */
public class Application {
    public static void main(String[] args) {
        ExtractorVisitor extractorVisitor = new ExtractorVisitor();
        List<ResourceFile> resourceFiles = listAllResourceFiles("text");
        for (ResourceFile resourceFile:resourceFiles
             ) {
            resourceFile.accept(extractorVisitor);
        }

        CompressorVisitor compressorVisitor = new CompressorVisitor();
        for (ResourceFile resourceFile:resourceFiles
        ) {
            resourceFile.accept(compressorVisitor);
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirector){
        List<ResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new WordFile("b.word"));
        resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }
}
