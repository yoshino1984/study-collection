package structural.flyweight;

/**
 * 享元类
 * 棋子单元
 *
 * @author wangxin
 * 2020/4/5 21:26
 * @since
 **/

// 享元类
public class ChessPieceUnit {
    private int id;
    private String text;
    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
        RED, BLACK
    }

    // ...省略其他属性和getter方法...
}

