package behavioral.visitor.visitor;

import behavioral.visitor.visitable.PdfFile;
import behavioral.visitor.visitable.TxtFile;
import behavioral.visitor.visitable.WordFile;

/**
 * @author wangxin
 * 2020/4/9 23:22
 * @since
 **/
public class Compressor implements IVisitor {
    @Override
    public void visit(PdfFile file) {
        System.out.println("Compressor pdf");
    }

    @Override
    public void visit(TxtFile file) {
        System.out.println("Compressor txt");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("Compressor word");
    }
}
