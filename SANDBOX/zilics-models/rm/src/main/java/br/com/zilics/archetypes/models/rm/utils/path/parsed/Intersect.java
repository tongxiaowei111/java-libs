package br.com.zilics.archetypes.models.rm.utils.path.parsed;

import br.com.zilics.archetypes.models.rm.exception.PathEvaluationException;
import br.com.zilics.archetypes.models.rm.utils.path.context.PathEvaluationContext;
import br.com.zilics.archetypes.models.rm.utils.path.model.ListValue;

public final class Intersect extends BinaryOperator {


	private static final long serialVersionUID = -4679261690460367856L;

	public Intersect(TreeNode leftOperand, TreeNode rightOperand) {
		super(leftOperand, rightOperand);
	}

	@Override
	public ListValue evaluate(PathEvaluationContext context) throws PathEvaluationException {
		ListValue left = getLeftOperand().evaluate(context);
		ListValue right = getRightOperand().evaluate(context);
		return left.intersect(right);
	}

	@Override
	public String getOperatorName() {
		return "intersect";
	}
		
}

