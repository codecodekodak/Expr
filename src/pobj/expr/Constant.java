package pobj.expr;

public class Constant implements Expression {
	private int value;

	public Constant() {
		value = 0;
	}

	public Constant(int val) {
		value = val;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return String.valueOf(value);
	}

	public boolean equals(Object obj) {
		if (obj instanceof Constant) {
			Constant var2 = (Constant) obj;
			return var2.getValue() == (this.getValue());
		}
		return ((Integer) value).equals(obj);

	}

	@Override
	public int eval() {
		return value;
	}
	
	@Override
	public <T> T accept(IVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
