
import java.util.LinkedList;

public class Relation
{
	
	LinkedList<Attribute> attributes;
	LinkedList<Tuple> tuples;
	String name;

	public Relation ( String name, LinkedList<Attribute> attributes ) 
	{
		
		this.name = name;
		this.attributes = attributes;

	}
}
