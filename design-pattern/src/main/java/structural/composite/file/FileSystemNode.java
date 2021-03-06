package structural.composite.file;

/**
 * @author wangxin
 * 2020-03-07 19:43
 * @since
 **/
public abstract class FileSystemNode {
    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();

    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }
}
