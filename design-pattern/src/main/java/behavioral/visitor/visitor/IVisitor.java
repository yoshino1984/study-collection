package behavioral.visitor.visitor;

import behavioral.visitor.visitable.PdfFile;
import behavioral.visitor.visitable.TxtFile;
import behavioral.visitor.visitable.WordFile;

/**
 * 访问者接口
 *
 * @author wangxin
 * 2020/4/9 23:18
 * @since
 **/
public interface IVisitor {

    void visit(PdfFile file);

    void visit(TxtFile file);

    void visit(WordFile wordFile);
}
