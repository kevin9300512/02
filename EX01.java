
class CRectangle {
    int width;
    int height;

    public CRectangle(int w, int h) {
        width = w;
        height = h;
    }

    public CRectangle() {
        this(10, 8); // 使用this()来调用有参数的构造函数
    }

    public void show() {
        System.out.println("width=" + width);
        System.out.println("height=" + height + "\n");
    }
}

public class EX01 {
    public static void main(String args[]) {
        CRectangle aa = new CRectangle(5, 2);
        aa.show();
        CRectangle bb = new CRectangle();
        bb.show();
    }
}
