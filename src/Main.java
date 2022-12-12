public class Main {
    public static void main(String[] args) {
        
        Author king = new Author("S. King");
        Book sKing = new Book(2019, "The Institute");
        System.out.println("Автор - " + king.name);
        System.out.println("Год издания - " + sKing.getYear());
        System.out.println("Название - " + sKing.getTitle());
        sKing.setYear(2020);
        System.out.println("Год переиздания - " + sKing.getYear());

        Book sH = new Book( 2017, "A brief history of time");
        Author hw = new Author("S. Hawking");
        System.out.println("Автор - " + hw.getName());
        System.out.println("Год издания - " + sH.getYear());
        System.out.println("Название - " + sH.getTitle());
    }
}