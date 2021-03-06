package behavioral.visitor.visitor;

import behavioral.visitor.visitable.PdfFile;
import behavioral.visitor.visitable.TxtFile;
import behavioral.visitor.visitable.WordFile;

/**
 * @author wangxin
 * 2020/4/9 23:22
 * @since
 **/
public class Extractor implements IVisitor {
    @Override
    public void visit(PdfFile file) {
        System.out.println("Extractor pdf");
    }

    @Override
    public void visit(TxtFile file) {
        System.out.println("Extractor txt");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("Extractor word");
    }
}
