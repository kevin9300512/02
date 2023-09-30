class Namecard {
    private String name;
    private String address;
    private Phone data;

    public Namecard(String name, String address, String company, String cell) {
        this.name = name;
        this.address = address;
        this.data = new Phone(company, cell);
    }

    public void show() {
        System.out.println("好友姓名: " + name);
        System.out.println("聯絡地址: " + address);
        System.out.println("公司電話: " + data.getCompany());
        System.out.println("手機號碼: " + data.getCell());
    }

    class Phone {
        private String company;
        private String cell;

        public Phone(String s1, String s2) {
            company = s1;
            cell = s2;
        }

        public String getCompany() {
            return company;
        }

        public String getCell() {
            return cell;
        }
    }
}

public class EX17 {
    public static void main(String[] args) {
        Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");
        first.show();
    }
}
