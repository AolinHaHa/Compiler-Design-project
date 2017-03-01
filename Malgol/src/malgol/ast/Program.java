package malgol.ast;

public class Program extends ASTNode {
	private BlockStatement blockStatement;
	
	public Program(BlockStatement b) {
		super(null);
		blockStatement = b;
	}

	
	public BlockStatement getBlockStatement() {
		return blockStatement;
	}

	@Override
	public void accept(ASTVisitor v) {
		v.visit(this);
	}

}
