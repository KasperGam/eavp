/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.eavp.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class STLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.eavp.STL.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSolidKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cTrianglesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTrianglesTriangleParserRuleCall_3_0 = (RuleCall)cTrianglesAssignment_3.eContents().get(0);
		private final Keyword cEndsolidKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cIDTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Model:
		//	{Model} 'solid' name=ID? triangles+=Triangle* 'endsolid' ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Model} 'solid' name=ID? triangles+=Triangle* 'endsolid' ID?
		public Group getGroup() { return cGroup; }
		
		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }
		
		//'solid'
		public Keyword getSolidKeyword_1() { return cSolidKeyword_1; }
		
		//name=ID?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//triangles+=Triangle*
		public Assignment getTrianglesAssignment_3() { return cTrianglesAssignment_3; }
		
		//Triangle
		public RuleCall getTrianglesTriangleParserRuleCall_3_0() { return cTrianglesTriangleParserRuleCall_3_0; }
		
		//'endsolid'
		public Keyword getEndsolidKeyword_4() { return cEndsolidKeyword_4; }
		
		//ID?
		public RuleCall getIDTerminalRuleCall_5() { return cIDTerminalRuleCall_5; }
	}
	public class TriangleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.eavp.STL.Triangle");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFacetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNormalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNormalNormalParserRuleCall_1_0 = (RuleCall)cNormalAssignment_1.eContents().get(0);
		private final Assignment cVerticiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVerticiesVerticiesParserRuleCall_2_0 = (RuleCall)cVerticiesAssignment_2.eContents().get(0);
		private final Keyword cEndfacetKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Triangle:
		//	'facet' normal=Normal verticies=Verticies 'endfacet';
		@Override public ParserRule getRule() { return rule; }
		
		//'facet' normal=Normal verticies=Verticies 'endfacet'
		public Group getGroup() { return cGroup; }
		
		//'facet'
		public Keyword getFacetKeyword_0() { return cFacetKeyword_0; }
		
		//normal=Normal
		public Assignment getNormalAssignment_1() { return cNormalAssignment_1; }
		
		//Normal
		public RuleCall getNormalNormalParserRuleCall_1_0() { return cNormalNormalParserRuleCall_1_0; }
		
		//verticies=Verticies
		public Assignment getVerticiesAssignment_2() { return cVerticiesAssignment_2; }
		
		//Verticies
		public RuleCall getVerticiesVerticiesParserRuleCall_2_0() { return cVerticiesVerticiesParserRuleCall_2_0; }
		
		//'endfacet'
		public Keyword getEndfacetKeyword_3() { return cEndfacetKeyword_3; }
	}
	public class NormalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.eavp.STL.Normal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNormalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVectorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVectorVectorParserRuleCall_1_0 = (RuleCall)cVectorAssignment_1.eContents().get(0);
		
		//Normal:
		//	'normal' vector=Vector;
		@Override public ParserRule getRule() { return rule; }
		
		//'normal' vector=Vector
		public Group getGroup() { return cGroup; }
		
		//'normal'
		public Keyword getNormalKeyword_0() { return cNormalKeyword_0; }
		
		//vector=Vector
		public Assignment getVectorAssignment_1() { return cVectorAssignment_1; }
		
		//Vector
		public RuleCall getVectorVectorParserRuleCall_1_0() { return cVectorVectorParserRuleCall_1_0; }
	}
	public class VectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.eavp.STL.Vector");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cXAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cXDOUBLETerminalRuleCall_0_0 = (RuleCall)cXAssignment_0.eContents().get(0);
		private final Assignment cYAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cYDOUBLETerminalRuleCall_1_0 = (RuleCall)cYAssignment_1.eContents().get(0);
		private final Assignment cZAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cZDOUBLETerminalRuleCall_2_0 = (RuleCall)cZAssignment_2.eContents().get(0);
		
		//Vector:
		//	x=DOUBLE y=DOUBLE z=DOUBLE;
		@Override public ParserRule getRule() { return rule; }
		
		//x=DOUBLE y=DOUBLE z=DOUBLE
		public Group getGroup() { return cGroup; }
		
		//x=DOUBLE
		public Assignment getXAssignment_0() { return cXAssignment_0; }
		
		//DOUBLE
		public RuleCall getXDOUBLETerminalRuleCall_0_0() { return cXDOUBLETerminalRuleCall_0_0; }
		
		//y=DOUBLE
		public Assignment getYAssignment_1() { return cYAssignment_1; }
		
		//DOUBLE
		public RuleCall getYDOUBLETerminalRuleCall_1_0() { return cYDOUBLETerminalRuleCall_1_0; }
		
		//z=DOUBLE
		public Assignment getZAssignment_2() { return cZAssignment_2; }
		
		//DOUBLE
		public RuleCall getZDOUBLETerminalRuleCall_2_0() { return cZDOUBLETerminalRuleCall_2_0; }
	}
	public class VerticiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.eavp.STL.Verticies");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOuterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLoopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cV1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cV1VertexParserRuleCall_2_0 = (RuleCall)cV1Assignment_2.eContents().get(0);
		private final Assignment cV2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cV2VertexParserRuleCall_3_0 = (RuleCall)cV2Assignment_3.eContents().get(0);
		private final Assignment cV3Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cV3VertexParserRuleCall_4_0 = (RuleCall)cV3Assignment_4.eContents().get(0);
		private final Keyword cEndloopKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Verticies:
		//	'outer' 'loop' v1=Vertex v2=Vertex v3=Vertex 'endloop';
		@Override public ParserRule getRule() { return rule; }
		
		//'outer' 'loop' v1=Vertex v2=Vertex v3=Vertex 'endloop'
		public Group getGroup() { return cGroup; }
		
		//'outer'
		public Keyword getOuterKeyword_0() { return cOuterKeyword_0; }
		
		//'loop'
		public Keyword getLoopKeyword_1() { return cLoopKeyword_1; }
		
		//v1=Vertex
		public Assignment getV1Assignment_2() { return cV1Assignment_2; }
		
		//Vertex
		public RuleCall getV1VertexParserRuleCall_2_0() { return cV1VertexParserRuleCall_2_0; }
		
		//v2=Vertex
		public Assignment getV2Assignment_3() { return cV2Assignment_3; }
		
		//Vertex
		public RuleCall getV2VertexParserRuleCall_3_0() { return cV2VertexParserRuleCall_3_0; }
		
		//v3=Vertex
		public Assignment getV3Assignment_4() { return cV3Assignment_4; }
		
		//Vertex
		public RuleCall getV3VertexParserRuleCall_4_0() { return cV3VertexParserRuleCall_4_0; }
		
		//'endloop'
		public Keyword getEndloopKeyword_5() { return cEndloopKeyword_5; }
	}
	public class VertexElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.eavp.STL.Vertex");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVertexKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cXAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cXDOUBLETerminalRuleCall_1_0 = (RuleCall)cXAssignment_1.eContents().get(0);
		private final Assignment cYAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cYDOUBLETerminalRuleCall_2_0 = (RuleCall)cYAssignment_2.eContents().get(0);
		private final Assignment cZAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cZDOUBLETerminalRuleCall_3_0 = (RuleCall)cZAssignment_3.eContents().get(0);
		
		//Vertex:
		//	'vertex' x=DOUBLE y=DOUBLE z=DOUBLE;
		@Override public ParserRule getRule() { return rule; }
		
		//'vertex' x=DOUBLE y=DOUBLE z=DOUBLE
		public Group getGroup() { return cGroup; }
		
		//'vertex'
		public Keyword getVertexKeyword_0() { return cVertexKeyword_0; }
		
		//x=DOUBLE
		public Assignment getXAssignment_1() { return cXAssignment_1; }
		
		//DOUBLE
		public RuleCall getXDOUBLETerminalRuleCall_1_0() { return cXDOUBLETerminalRuleCall_1_0; }
		
		//y=DOUBLE
		public Assignment getYAssignment_2() { return cYAssignment_2; }
		
		//DOUBLE
		public RuleCall getYDOUBLETerminalRuleCall_2_0() { return cYDOUBLETerminalRuleCall_2_0; }
		
		//z=DOUBLE
		public Assignment getZAssignment_3() { return cZAssignment_3; }
		
		//DOUBLE
		public RuleCall getZDOUBLETerminalRuleCall_3_0() { return cZDOUBLETerminalRuleCall_3_0; }
	}
	
	
	private final ModelElements pModel;
	private final TriangleElements pTriangle;
	private final NormalElements pNormal;
	private final VectorElements pVector;
	private final VerticiesElements pVerticies;
	private final VertexElements pVertex;
	private final TerminalRule tDOUBLE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public STLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pTriangle = new TriangleElements();
		this.pNormal = new NormalElements();
		this.pVector = new VectorElements();
		this.pVerticies = new VerticiesElements();
		this.pVertex = new VertexElements();
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.eavp.STL.DOUBLE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.eavp.STL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	{Model} 'solid' name=ID? triangles+=Triangle* 'endsolid' ID?;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Triangle:
	//	'facet' normal=Normal verticies=Verticies 'endfacet';
	public TriangleElements getTriangleAccess() {
		return pTriangle;
	}
	
	public ParserRule getTriangleRule() {
		return getTriangleAccess().getRule();
	}
	
	//Normal:
	//	'normal' vector=Vector;
	public NormalElements getNormalAccess() {
		return pNormal;
	}
	
	public ParserRule getNormalRule() {
		return getNormalAccess().getRule();
	}
	
	//Vector:
	//	x=DOUBLE y=DOUBLE z=DOUBLE;
	public VectorElements getVectorAccess() {
		return pVector;
	}
	
	public ParserRule getVectorRule() {
		return getVectorAccess().getRule();
	}
	
	//Verticies:
	//	'outer' 'loop' v1=Vertex v2=Vertex v3=Vertex 'endloop';
	public VerticiesElements getVerticiesAccess() {
		return pVerticies;
	}
	
	public ParserRule getVerticiesRule() {
		return getVerticiesAccess().getRule();
	}
	
	//Vertex:
	//	'vertex' x=DOUBLE y=DOUBLE z=DOUBLE;
	public VertexElements getVertexAccess() {
		return pVertex;
	}
	
	public ParserRule getVertexRule() {
		return getVertexAccess().getRule();
	}
	
	//terminal DOUBLE returns ecore::EDouble:
	//	'-'? '0'..'9'* ('.' '0'..'9'* (('e' | 'E') ('-' | '+')? '0'..'9'*)?)?;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
