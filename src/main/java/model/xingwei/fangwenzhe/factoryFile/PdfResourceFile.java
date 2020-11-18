package model.xingwei.fangwenzhe.factoryFile;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/13 8:22 上午
 */
public class PdfResourceFile extends ResourceFile {
    public PdfResourceFile(String filePath) {
        super(filePath);
    }



    @Override
    public ResourceType getType() {
        return ResourceType.PDF;
    }
}
