public class EX05 {
    public static void main(String[] args) {
        // 创建Cbox类的对象box，长宽高都设置为1
        Cbox box = new Cbox(1, 1, 1);

        box.showall();
    }
}

class Cbox {
    int length;
    int width;
    int height;

    // 构造函数，用于初始化长宽高
    public Cbox(int length, int width,  int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // 计算盒子的体积
    public int volume() {
        return length * width * height;
    }

    // 计算盒子的表面积
    public int surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    // 显示盒子的长宽高
    public void showDate() {
        System.out.println("盒子的長為: " + length);
        System.out.println("盒子的寬為: " + width);
        System.out.println("盒子的高為: " + height);
    }

    // 显示盒子的所有信息（长宽高、体积和表面积）
    public void showall() {
        showDate();
        System.out.println("盒子的體積為: " + volume());
        System.out.println("盒子的表面積為: " + surfaceArea());
    }
}
