package pobj.expr;

public class Mult extends BinOp implements Expression {

	public Mult(Expression e1, Expression e2) {
		left = e1;
		right = e2;
	}

	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(left.toString());
		sb.append(" * ");
		sb.append(right.toString());
		return sb.toString();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Expression) {
			Expression e2 = (Expression) obj;
			return e2.toString().equals(this.toString());
		}
		return obj.equals(obj);
		
	}


	@Override
	public int eval() {
		return left.eval() * right.eval();
	}
	
	@Override
	public <T> T accept(IVisitor<T> visitor) {
		return visitor.visit(this);
	}

	
}
