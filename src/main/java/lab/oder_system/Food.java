package lab.oder_system;

public class Food {

    private int no;
    private String name;
    private char size;
    private int price;
    

    public Food(int no,String name, char size, int price ) {
        if(name.length()==3){
        name =name.concat("  ");
        }
        this.name = name;
        this.size = size;
        this.price = price;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Food{" + "no=" + no + ", name=" + name + ", size=" + size + ", price=" + price + '}';
    }

}
