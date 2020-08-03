package pobj.expr;

public class Var implements Expression {
	private final String name;

	
	
	public Var(String nom ) {
		name=nom;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Var) {
			Var var2 = (Var) obj;
			return var2.getName().equals(this.getName());
		}
		return name.equals(obj);
	}

	@Override
	public int eval() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public <T> T accept(IVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
