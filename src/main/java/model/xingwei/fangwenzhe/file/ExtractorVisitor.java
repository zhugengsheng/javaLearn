package model.xingwei.fangwenzhe.file;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/12 8:51 上午
 */
public class ExtractorVisitor implements Visitor {
    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("pdf extractor");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("wordFile extractor");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("pptFile extractor");
    }
}
