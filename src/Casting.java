
public class Casting {

    public static void main(String[] args) {
	Strawberry strawberry1 = new Strawberry("red");
	strawberry1.setColor("brown");

	// strawberry1.color = "brown";

	Strawberry strawberry2 = new Strawberry("blue");

	if (strawberry1.getColor().equals(strawberry2.getColor())) {
	    System.out.println("Strawberry 1 equals straberry2");
	}


    }

}
