package pobj.expr;

public class VisitorEval implements IVisitor<Integer> {

	public Integer visit(Constant c) {
		return c.eval();
	}

	public Integer visit(Var v) {
		return v.eval();
	}

	public Integer visit(Add a) {
		Integer s1 = a.getLeft().accept(this);
		Integer s2 = a.getRight().accept(this);
		return s1 + s2 ;
	}

	public Integer visit(Mult a) {
		Integer s1 = a.getLeft().accept(this);
		Integer s2 = a.getRight().accept(this);
		return s1 * s2;
	}
}
