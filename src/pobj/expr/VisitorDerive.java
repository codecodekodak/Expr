package pobj.expr;

public class VisitorDerive implements IVisitor<Expression> {

	public VisitorDerive(Var x) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Expression visit(Constant c) {
		return new Constant(0);
	}

	@Override
	public Expression visit(Add e) {
		return new Add(e.getLeft().accept(this), e.getRight().accept(this));
	}

	@Override
	public Expression visit(Mult e) {
		Expression left = new Mult(e.getLeft(), e.getRight().accept(this));
		Expression right = new Mult(e.getLeft().accept(this), e.getRight());
		return new Add(left, right);
	}

	@Override
	public Expression visit(Var v) {
		return v.getName() == "x" ? new Constant(1) : new Constant(0);
	}

}
