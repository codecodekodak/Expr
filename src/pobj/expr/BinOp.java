package pobj.expr;

public abstract class BinOp {
	protected Expression left;
	protected Expression right;

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}
}
