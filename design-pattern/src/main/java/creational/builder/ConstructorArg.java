package creational.builder;

import java.io.*;
import java.net.Socket;

/**
 * 创建者模式主要是可以在创建对象时，定制化地创建和检查对象的条件
 * 1、对各个参数的条件进行检测（比如有些参数不能兼容，有些参数必须存在等）
 * 2、设置某些默认值
 * 减少构造参数的长度，否则代码的可读性和易用性上都会变差
 *
 * creational.builder
 * @author wangxin
 * 2020-02-17 21:30
 * @since
 **/
public class ConstructorArg {
    private boolean isRef;
    private Class type;
    private Object arg;

    private ConstructorArg(Builder builder) {
        this.isRef = builder.isRef;
        this.type = builder.type;
        this.arg = builder.arg;
    }

    public boolean isRef() {
        return isRef;
    }

    public Class getType() {
        return type;
    }

    public Object getArg() {
        return arg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder{
        private boolean isRef;
        private Class type;
        private Object arg;

        public Builder setRef(boolean ref) {
            isRef = ref;
            return this;
        }

        public Builder setType(Class type) {
            this.type = type;
            return this;
        }

        public Builder setArg(Object arg) {
            this.arg = arg;
            return this;
        }

        public ConstructorArg build() {
            if (isRef) {
                if (!(arg instanceof String)) {
                    throw new IllegalArgumentException("arg must must be a String instance when isRef is true.");
                }
            } else {
                if (type == null || arg == null){
                    throw new IllegalArgumentException("type and arg must be set when isRef is false");
                }
            }
            return new ConstructorArg(this);
        }
    }

    public static void main(String[] args) throws IOException {
        ConstructorArg.builder().setRef(true).setType(String.class).setArg(" ").build();
        System.out.println(new File(".").getAbsolutePath());
        System.out.println(new File("./target/classes/text").length());

        InputStream in = new FileInputStream(new File("./target/classes/text"));
        BufferedInputStream bin = new BufferedInputStream(in);
        DataInputStream dIn = new DataInputStream(bin);
        int len;
        byte[] data = new byte[1022];
        while ((len = dIn.read(data)) != -1) {
            System.out.println(data.length);
        }

        try (Socket socket = new Socket()) {
            InputStreamReader ir = new InputStreamReader(socket.getInputStream());
        }
        InputStreamReader fr = new FileReader("./target/classes/text");
        BufferedReader br = new BufferedReader(fr);
        char[] chars = new char[1024];
        while (br.read(chars) != -1) {
            System.out.println(String.valueOf(chars));
        }

    }
}
