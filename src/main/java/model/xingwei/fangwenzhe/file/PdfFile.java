package model.xingwei.fangwenzhe.file;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/12 8:49 上午
 */
public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
