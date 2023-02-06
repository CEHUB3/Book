import java.util.Arrays;

public class Book {

    String title;
    private boolean bound;
    private boolean isInteresting ;

    public Book(String title) {
        this(title, true);
    }

    public Book(String title, boolean bound) {
        this.title = title;
        this.bound = bound;
    }
    public boolean isInteresting(){
        String[] iw = new String[3];
        iw[0]="Java";iw[1]="Programmering";iw[2]="Programming";
        for (int i=0; i<iw.length; i++){
            int index = title.indexOf(iw[i]);
            if (index >= 0){
               isInteresting = true;
               break;
            }
        }return isInteresting;

    }
    public String getTitle() {
        return title;
    }

    public boolean isBound() {
        return bound;
    }

    @Override
    public String toString() {
        return title + " " + bound;
    }
    public boolean equals(Object obj) {
        boolean same = false;
        if (obj instanceof Book) {
            if ( ((Book)obj).getTitle().equals(title) && ((Book) obj).isBound()== bound){
                same = true;
            }
        } else {
            same = false;
        }return same;
    }
}
