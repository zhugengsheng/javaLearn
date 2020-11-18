package model.xingwei.fangwenzhe.factoryFile;


import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/12 8:53 上午
 */
public class Application {
    public static void main(String[] args) {
        List<ResourceFile> resourceFiles = listAllResourceFiles("text");
        for (ResourceFile resourceFile:resourceFiles
             ) {
            Extractor extractor = ExtractorFactory.getExtractor(resourceFile.getType());
            extractor.extract2txt(resourceFile);
        }

    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirector){
        List<ResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PdfResourceFile("a.pdf"));
        resourceFiles.add(new PPTResourceFile("c.ppt"));
        return resourceFiles;
    }
}
