package behavioral.visitor;

import behavioral.visitor.visitable.IResource;
import behavioral.visitor.visitable.PdfFile;
import behavioral.visitor.visitable.TxtFile;
import behavioral.visitor.visitor.Compressor;
import behavioral.visitor.visitor.Extractor;
import behavioral.visitor.visitor.IVisitor;

/**
 * @author wangxin
 * 2020/4/9 23:21
 * @since
 **/
public class ToolApplication {
    public static void main(String[] args) {
        IVisitor compressor = new Compressor();
        IVisitor extractor = new Extractor();
        IResource pdf = new PdfFile();
        IResource txt = new TxtFile();
        pdf.accept(compressor);
        txt.accept(extractor);
    }
}
