package behavior.interpreter.second;

public class Not extends Expression {

	private Expression exp;

	public Not(Expression exp) {
		this.exp = exp;
	}

	@Override
	public boolean interpret(Context ctx) {
		return !exp.interpret(ctx);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Not) {
			return this.exp.equals(((Not) obj).exp);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public String toString() {
		return "(Not " + exp.toString() + ")";
	}

}
