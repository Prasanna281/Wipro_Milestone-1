/*Ravi and Kumar are working on an assignment. Ravi takes 6 hours to type 32 pages on a
computer, while Kumar takes 5 hours to type 40 pages. Design an algorithm to calculate how
much time they will take, working together on two different computers to type an assignment
of 110 pages.*/

public class Activity11 {

	public static void main(String[] args) {
	    int rh=6;
	    int rw=32;
	    int kh=5;
	    int kw=40;
	    float onehour_work=(rw/rh)+(kw/kh);
	    float work=110/(onehour_work);
	    System.out.print("Time taken by both to complete 110 pages : "+work+"hrs");

	}

}
