/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.eavp.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.eavp.parser.antlr.internal.InternalSTLParser;
import org.eclipse.eavp.services.STLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class STLParser extends AbstractAntlrParser {

	@Inject
	private STLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSTLParser createParser(XtextTokenStream stream) {
		return new InternalSTLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public STLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(STLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
