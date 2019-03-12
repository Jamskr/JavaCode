class jv_2st {
    public static void main(String[] args) {
        Student Jam = new Student();
        Jam.id = "20190207";
        Jam.name = "zhili";
        Jam.sex = true;
        Jam.cellphone = "xxxxxxxxxxx";
        Jam.cards.SchoolCardNum = "12489495783425606";
        Jam.cards.BankCardNum = "4590382907056380546";

        System.out.println("name: " + Jam.name);
        System.out.println("id: " + Jam.id);
        System.out.println("sex: " + Jam.sex);
        System.out.println("cellphone: " + Jam.cellphone);
        System.out.println("SchoolCard: " + Jam.cards.SchoolCardNum);
        System.out.println("BankCard: " + Jam.cards.BankCardNum);

        Student stu = new Student();
        stu.show();
        stu.show2(20);

        int[] arr = {20, 16, 73, 40};
        MyMath m = new MyMath();
        m.getMax(arr);
        int Max = m.getMax2(arr);
        System.out.println("===>>> Max：" + Max);
        boolean ret = m.check(arr);
        System.out.println("ret: " + ret);
        int[] ret1 = m.find8(arr);
        System.out.println("len: " + ret1.length);
        for (int i = 0; i < ret1.length; i++) {
            System.out.println(ret1[i]);
        }
        Student stu1 = m.CreateNew("3425046856-2345", "sfa");
        System.out.println(stu1.id);
        System.out.println(stu1.name);

        OverLoad ovr = new OverLoad();
        ovr.test();
        ovr.test(10, 20);
        ovr.test(30, "lizhi");
    }
}