package model.xingwei.fangwenzhe.file;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/12 8:51 上午
 */
public class CompressorVisitor implements Visitor {
    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("pdf Compressor");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("wordFile Compressor");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("pptFile Compressor");
    }
}
