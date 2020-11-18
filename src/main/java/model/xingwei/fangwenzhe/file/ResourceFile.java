package model.xingwei.fangwenzhe.file;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/12 8:47 上午
 */
public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    public abstract void accept(Visitor visitor);
}
