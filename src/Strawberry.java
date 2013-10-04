
public class Strawberry extends Object {
    private String color;

    public Strawberry(String color) {
	this.color = color;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color)
    {
	this.color = color;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	Strawberry strawberry2 = (Strawberry) obj;

	if (this.color.equals(strawberry2.color)) {
	    return true;
	} else {
	    return false;
	}
    }
}
