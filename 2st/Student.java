public class Student {
    public String id;
    public String name;
    public boolean sex;
    public String cellphone;
    public StudentCard cards = new StudentCard();

    public void show() {
        for(int i = 0; i < 10; i++) {
            System.out.println("count: " + (i + 1));
        }
    }

    public void show2(int MaxNum) {
        for(int i = MaxNum -1 ; i >= 0; i--) {
            System.out.println("count2:" + (i + 1));
        }
    }
}


// public class Book {
//     public String title;
//     public String author;
//     public String press;
//     public String ISBN;
//     public double price;
// }

// public class ZipTool {

// }
