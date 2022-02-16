
interface WordElementVisitor{
	
	void visit(Epsilon epsilon);
	void visit(Character character);
	void visit(OrExpr orexpr);
	void visit(AndExpr andexpr);
	void visit(StarExpr starexpr);
}

interface WordElement{
	
	void accept();

	void accept(WordElementVisitor visitor);
	
}

class Epsilon implements WordElement{
	private String name;
	public Epsilon(String name) {this.name = name; }
	public Epsilon getName() {return this.name;}
	public void accept(WordElementVisitor visitor) {
		visitor.visit(this);
	}
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
	}
}
class Character implements WordElement{

	@Override
	public void accept(WordElementVisitor visitor) {
		
		
	}

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
	}
	
}

class OrExpr implements WordElement{

	@Override
	public void accept(WordElementVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
	}

}

class AndExpr implements WordElement{

	@Override
	public void accept(WordElementVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
	}
	
}

class StarExpr implements WordElement{

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(WordElementVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

}


public class SecondQuestion {

	public static void main(String[] args) {
		
		WordElement word = new Word();
		word.accpet(new WordElementStarVisior());
		word.accpet(new WordElementDoVisitor());
		
//		System.out.println( new StarExpr( new AndExpr ( new Character(“a”), new OrExpr( new Character(“a”),
//				new Character(“b” )))))

	}

}

//Object[] getChildren(ASTNode node) {
//List list= ((Object) node).structuralPropertiesForType();
//for (int i= 0; i < list.size(); i++) {
//	StructuralPropertyDescriptor curr= (StructuralPropertyDescriptor) list.get(i);
//	Object child= ((Object) node).getStructuralProperty(curr);
//	if (child instanceof List) {
//		
//		return ((List) child).toArray();
//	} else if (child instanceof ASTNode) {
//		return new Object[] { child };
//	}
//	return new Object[0];
