package model.xingwei.fangwenzhe.factoryFile;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/13 8:22 上午
 */
public class PPTResourceFile extends ResourceFile {
    public PPTResourceFile(String filePath) {
        super(filePath);
    }



    @Override
    public ResourceType getType() {
        return ResourceType.PPT;
    }
}
