package behavioral.visitor.visitable;

import behavioral.visitor.visitor.IVisitor;

/**
 * @author wangxin
 * 2020/4/9 23:18
 * @since
 **/
public class WordFile implements IResource {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
