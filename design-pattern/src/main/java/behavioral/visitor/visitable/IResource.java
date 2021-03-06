package behavioral.visitor.visitable;

import behavioral.visitor.visitor.IVisitor;

/**
 * 资源接口
 *
 * @author wangxin
 * 2020/4/9 23:18
 * @since
 **/
public interface IResource {

    void accept(IVisitor visitor);
}
