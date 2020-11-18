package model.xingwei.fangwenzhe.factoryFile;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/13 8:21 上午
 */
public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    public abstract ResourceType getType();
}
