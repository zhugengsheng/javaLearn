package model.xingwei.fangwenzhe.file;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/12 8:47 上午
 */
public interface Visitor {
    void visit(PdfFile pdfFile);
    void visit(WordFile pdfFile);
    void visit(PPTFile pdfFile);
}
