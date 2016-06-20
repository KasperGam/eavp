package xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import xtext.services.STLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2016 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Initial API and implementation and/or initial documentation - 
 *   Kasper Gammeltoft
 *******************************************************************************/
@SuppressWarnings("all")
public class InternalSTLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'E'", "'e'", "'\\r'", "'\\n'", "'solid'", "'endsolid'", "'facet'", "'outer'", "'loop'", "'endloop'", "'endfacet'", "'normal'", "'vertex'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSTLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSTLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSTLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSTL.g"; }


    	private STLGrammarAccess grammarAccess;

    	public void setGrammarAccess(STLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGeometry"
    // InternalSTL.g:62:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalSTL.g:63:1: ( ruleGeometry EOF )
            // InternalSTL.g:64:1: ruleGeometry EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeometryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGeometry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeometryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalSTL.g:71:1: ruleGeometry : ( ( rule__Geometry__Group__0 ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:75:2: ( ( ( rule__Geometry__Group__0 ) ) )
            // InternalSTL.g:76:2: ( ( rule__Geometry__Group__0 ) )
            {
            // InternalSTL.g:76:2: ( ( rule__Geometry__Group__0 ) )
            // InternalSTL.g:77:3: ( rule__Geometry__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeometryAccess().getGroup()); 
            }
            // InternalSTL.g:78:3: ( rule__Geometry__Group__0 )
            // InternalSTL.g:78:4: rule__Geometry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeometryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleShape_Impl"
    // InternalSTL.g:87:1: entryRuleShape_Impl : ruleShape_Impl EOF ;
    public final void entryRuleShape_Impl() throws RecognitionException {
        try {
            // InternalSTL.g:88:1: ( ruleShape_Impl EOF )
            // InternalSTL.g:89:1: ruleShape_Impl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShape_ImplRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleShape_Impl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShape_ImplRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShape_Impl"


    // $ANTLR start "ruleShape_Impl"
    // InternalSTL.g:96:1: ruleShape_Impl : ( ( rule__Shape_Impl__Group__0 ) ) ;
    public final void ruleShape_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:100:2: ( ( ( rule__Shape_Impl__Group__0 ) ) )
            // InternalSTL.g:101:2: ( ( rule__Shape_Impl__Group__0 ) )
            {
            // InternalSTL.g:101:2: ( ( rule__Shape_Impl__Group__0 ) )
            // InternalSTL.g:102:3: ( rule__Shape_Impl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShape_ImplAccess().getGroup()); 
            }
            // InternalSTL.g:103:3: ( rule__Shape_Impl__Group__0 )
            // InternalSTL.g:103:4: rule__Shape_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Shape_Impl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShape_ImplAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShape_Impl"


    // $ANTLR start "entryRuleTriangle"
    // InternalSTL.g:112:1: entryRuleTriangle : ruleTriangle EOF ;
    public final void entryRuleTriangle() throws RecognitionException {
        try {
            // InternalSTL.g:113:1: ( ruleTriangle EOF )
            // InternalSTL.g:114:1: ruleTriangle EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTriangle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTriangle"


    // $ANTLR start "ruleTriangle"
    // InternalSTL.g:121:1: ruleTriangle : ( ( rule__Triangle__Group__0 ) ) ;
    public final void ruleTriangle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:125:2: ( ( ( rule__Triangle__Group__0 ) ) )
            // InternalSTL.g:126:2: ( ( rule__Triangle__Group__0 ) )
            {
            // InternalSTL.g:126:2: ( ( rule__Triangle__Group__0 ) )
            // InternalSTL.g:127:3: ( rule__Triangle__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleAccess().getGroup()); 
            }
            // InternalSTL.g:128:3: ( rule__Triangle__Group__0 )
            // InternalSTL.g:128:4: rule__Triangle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTriangle"


    // $ANTLR start "entryRuleVertex"
    // InternalSTL.g:137:1: entryRuleVertex : ruleVertex EOF ;
    public final void entryRuleVertex() throws RecognitionException {
        try {
            // InternalSTL.g:138:1: ( ruleVertex EOF )
            // InternalSTL.g:139:1: ruleVertex EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVertexRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVertex();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVertexRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVertex"


    // $ANTLR start "ruleVertex"
    // InternalSTL.g:146:1: ruleVertex : ( ( rule__Vertex__Group__0 ) ) ;
    public final void ruleVertex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:150:2: ( ( ( rule__Vertex__Group__0 ) ) )
            // InternalSTL.g:151:2: ( ( rule__Vertex__Group__0 ) )
            {
            // InternalSTL.g:151:2: ( ( rule__Vertex__Group__0 ) )
            // InternalSTL.g:152:3: ( rule__Vertex__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVertexAccess().getGroup()); 
            }
            // InternalSTL.g:153:3: ( rule__Vertex__Group__0 )
            // InternalSTL.g:153:4: rule__Vertex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vertex__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVertexAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVertex"


    // $ANTLR start "entryRuleEDouble"
    // InternalSTL.g:162:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalSTL.g:163:1: ( ruleEDouble EOF )
            // InternalSTL.g:164:1: ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalSTL.g:171:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:175:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalSTL.g:176:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalSTL.g:176:2: ( ( rule__EDouble__Group__0 ) )
            // InternalSTL.g:177:3: ( rule__EDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getGroup()); 
            }
            // InternalSTL.g:178:3: ( rule__EDouble__Group__0 )
            // InternalSTL.g:178:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleELine"
    // InternalSTL.g:187:1: entryRuleELine : ruleELine EOF ;
    public final void entryRuleELine() throws RecognitionException {
        try {
            // InternalSTL.g:188:1: ( ruleELine EOF )
            // InternalSTL.g:189:1: ruleELine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getELineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleELine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getELineRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleELine"


    // $ANTLR start "ruleELine"
    // InternalSTL.g:196:1: ruleELine : ( ( rule__ELine__Alternatives ) ) ;
    public final void ruleELine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:200:2: ( ( ( rule__ELine__Alternatives ) ) )
            // InternalSTL.g:201:2: ( ( rule__ELine__Alternatives ) )
            {
            // InternalSTL.g:201:2: ( ( rule__ELine__Alternatives ) )
            // InternalSTL.g:202:3: ( rule__ELine__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getELineAccess().getAlternatives()); 
            }
            // InternalSTL.g:203:3: ( rule__ELine__Alternatives )
            // InternalSTL.g:203:4: rule__ELine__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ELine__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getELineAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleELine"


    // $ANTLR start "rule__EDouble__Alternatives_0"
    // InternalSTL.g:211:1: rule__EDouble__Alternatives_0 : ( ( '-' ) | ( '+' ) );
    public final void rule__EDouble__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:215:1: ( ( '-' ) | ( '+' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSTL.g:216:2: ( '-' )
                    {
                    // InternalSTL.g:216:2: ( '-' )
                    // InternalSTL.g:217:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSTL.g:222:2: ( '+' )
                    {
                    // InternalSTL.g:222:2: ( '+' )
                    // InternalSTL.g:223:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getPlusSignKeyword_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getPlusSignKeyword_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_0"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalSTL.g:232:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:236:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSTL.g:237:2: ( 'E' )
                    {
                    // InternalSTL.g:237:2: ( 'E' )
                    // InternalSTL.g:238:3: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSTL.g:243:2: ( 'e' )
                    {
                    // InternalSTL.g:243:2: ( 'e' )
                    // InternalSTL.g:244:3: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EDouble__Alternatives_4_1"
    // InternalSTL.g:253:1: rule__EDouble__Alternatives_4_1 : ( ( '-' ) | ( '+' ) );
    public final void rule__EDouble__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:257:1: ( ( '-' ) | ( '+' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSTL.g:258:2: ( '-' )
                    {
                    // InternalSTL.g:258:2: ( '-' )
                    // InternalSTL.g:259:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSTL.g:264:2: ( '+' )
                    {
                    // InternalSTL.g:264:2: ( '+' )
                    // InternalSTL.g:265:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getPlusSignKeyword_4_1_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getPlusSignKeyword_4_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_1"


    // $ANTLR start "rule__ELine__Alternatives"
    // InternalSTL.g:274:1: rule__ELine__Alternatives : ( ( RULE_STRING ) | ( ( rule__ELine__Group_1__0 ) ) );
    public final void rule__ELine__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:278:1: ( ( RULE_STRING ) | ( ( rule__ELine__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSTL.g:279:2: ( RULE_STRING )
                    {
                    // InternalSTL.g:279:2: ( RULE_STRING )
                    // InternalSTL.g:280:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getELineAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getELineAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSTL.g:285:2: ( ( rule__ELine__Group_1__0 ) )
                    {
                    // InternalSTL.g:285:2: ( ( rule__ELine__Group_1__0 ) )
                    // InternalSTL.g:286:3: ( rule__ELine__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getELineAccess().getGroup_1()); 
                    }
                    // InternalSTL.g:287:3: ( rule__ELine__Group_1__0 )
                    // InternalSTL.g:287:4: rule__ELine__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ELine__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getELineAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELine__Alternatives"


    // $ANTLR start "rule__ELine__Alternatives_1_1_0"
    // InternalSTL.g:295:1: rule__ELine__Alternatives_1_1_0 : ( ( ( '\\r' )? ) | ( '\\n' ) );
    public final void rule__ELine__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:299:1: ( ( ( '\\r' )? ) | ( '\\n' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EOF||LA6_0==15||(LA6_0>=18 && LA6_0<=19)) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSTL.g:300:2: ( ( '\\r' )? )
                    {
                    // InternalSTL.g:300:2: ( ( '\\r' )? )
                    // InternalSTL.g:301:3: ( '\\r' )?
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getELineAccess().getControl000dKeyword_1_1_0_0()); 
                    }
                    // InternalSTL.g:302:3: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==15) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSTL.g:302:4: '\\r'
                            {
                            match(input,15,FOLLOW_2); if (state.failed) return ;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getELineAccess().getControl000dKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSTL.g:306:2: ( '\\n' )
                    {
                    // InternalSTL.g:306:2: ( '\\n' )
                    // InternalSTL.g:307:3: '\\n'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getELineAccess().getControl000aKeyword_1_1_0_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getELineAccess().getControl000aKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELine__Alternatives_1_1_0"


    // $ANTLR start "rule__Geometry__Group__0"
    // InternalSTL.g:316:1: rule__Geometry__Group__0 : rule__Geometry__Group__0__Impl rule__Geometry__Group__1 ;
    public final void rule__Geometry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:320:1: ( rule__Geometry__Group__0__Impl rule__Geometry__Group__1 )
            // InternalSTL.g:321:2: rule__Geometry__Group__0__Impl rule__Geometry__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Geometry__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Geometry__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__0"


    // $ANTLR start "rule__Geometry__Group__0__Impl"
    // InternalSTL.g:328:1: rule__Geometry__Group__0__Impl : ( () ) ;
    public final void rule__Geometry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:332:1: ( ( () ) )
            // InternalSTL.g:333:1: ( () )
            {
            // InternalSTL.g:333:1: ( () )
            // InternalSTL.g:334:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeometryAccess().getGeometryAction_0()); 
            }
            // InternalSTL.g:335:2: ()
            // InternalSTL.g:335:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeometryAccess().getGeometryAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__0__Impl"


    // $ANTLR start "rule__Geometry__Group__1"
    // InternalSTL.g:343:1: rule__Geometry__Group__1 : rule__Geometry__Group__1__Impl rule__Geometry__Group__2 ;
    public final void rule__Geometry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:347:1: ( rule__Geometry__Group__1__Impl rule__Geometry__Group__2 )
            // InternalSTL.g:348:2: rule__Geometry__Group__1__Impl rule__Geometry__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Geometry__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Geometry__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__1"


    // $ANTLR start "rule__Geometry__Group__1__Impl"
    // InternalSTL.g:355:1: rule__Geometry__Group__1__Impl : ( 'solid' ) ;
    public final void rule__Geometry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:359:1: ( ( 'solid' ) )
            // InternalSTL.g:360:1: ( 'solid' )
            {
            // InternalSTL.g:360:1: ( 'solid' )
            // InternalSTL.g:361:2: 'solid'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeometryAccess().getSolidKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeometryAccess().getSolidKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__1__Impl"


    // $ANTLR start "rule__Geometry__Group__2"
    // InternalSTL.g:370:1: rule__Geometry__Group__2 : rule__Geometry__Group__2__Impl rule__Geometry__Group__3 ;
    public final void rule__Geometry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:374:1: ( rule__Geometry__Group__2__Impl rule__Geometry__Group__3 )
            // InternalSTL.g:375:2: rule__Geometry__Group__2__Impl rule__Geometry__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Geometry__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Geometry__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__2"


    // $ANTLR start "rule__Geometry__Group__2__Impl"
    // InternalSTL.g:382:1: rule__Geometry__Group__2__Impl : ( ( rule__Geometry__NameAssignment_2 )? ) ;
    public final void rule__Geometry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:386:1: ( ( ( rule__Geometry__NameAssignment_2 )? ) )
            // InternalSTL.g:387:1: ( ( rule__Geometry__NameAssignment_2 )? )
            {
            // InternalSTL.g:387:1: ( ( rule__Geometry__NameAssignment_2 )? )
            // InternalSTL.g:388:2: ( rule__Geometry__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeometryAccess().getNameAssignment_2()); 
            }
            // InternalSTL.g:389:2: ( rule__Geometry__NameAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING||LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSTL.g:389:3: rule__Geometry__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Geometry__NameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeometryAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__2__Impl"


    // $ANTLR start "rule__Geometry__Group__3"
    // InternalSTL.g:397:1: rule__Geometry__Group__3 : rule__Geometry__Group__3__Impl rule__Geometry__Group__4 ;
    public final void rule__Geometry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:401:1: ( rule__Geometry__Group__3__Impl rule__Geometry__Group__4 )
            // InternalSTL.g:402:2: rule__Geometry__Group__3__Impl rule__Geometry__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Geometry__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Geometry__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__3"


    // $ANTLR start "rule__Geometry__Group__3__Impl"
    // InternalSTL.g:409:1: rule__Geometry__Group__3__Impl : ( ( rule__Geometry__NodesAssignment_3 ) ) ;
    public final void rule__Geometry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:413:1: ( ( ( rule__Geometry__NodesAssignment_3 ) ) )
            // InternalSTL.g:414:1: ( ( rule__Geometry__NodesAssignment_3 ) )
            {
            // InternalSTL.g:414:1: ( ( rule__Geometry__NodesAssignment_3 ) )
            // InternalSTL.g:415:2: ( rule__Geometry__NodesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeometryAccess().getNodesAssignment_3()); 
            }
            // InternalSTL.g:416:2: ( rule__Geometry__NodesAssignment_3 )
            // InternalSTL.g:416:3: rule__Geometry__NodesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__NodesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeometryAccess().getNodesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__3__Impl"


    // $ANTLR start "rule__Geometry__Group__4"
    // InternalSTL.g:424:1: rule__Geometry__Group__4 : rule__Geometry__Group__4__Impl ;
    public final void rule__Geometry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:428:1: ( rule__Geometry__Group__4__Impl )
            // InternalSTL.g:429:2: rule__Geometry__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__4"


    // $ANTLR start "rule__Geometry__Group__4__Impl"
    // InternalSTL.g:435:1: rule__Geometry__Group__4__Impl : ( 'endsolid' ) ;
    public final void rule__Geometry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:439:1: ( ( 'endsolid' ) )
            // InternalSTL.g:440:1: ( 'endsolid' )
            {
            // InternalSTL.g:440:1: ( 'endsolid' )
            // InternalSTL.g:441:2: 'endsolid'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeometryAccess().getEndsolidKeyword_4()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeometryAccess().getEndsolidKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__4__Impl"


    // $ANTLR start "rule__Shape_Impl__Group__0"
    // InternalSTL.g:451:1: rule__Shape_Impl__Group__0 : rule__Shape_Impl__Group__0__Impl rule__Shape_Impl__Group__1 ;
    public final void rule__Shape_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:455:1: ( rule__Shape_Impl__Group__0__Impl rule__Shape_Impl__Group__1 )
            // InternalSTL.g:456:2: rule__Shape_Impl__Group__0__Impl rule__Shape_Impl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Shape_Impl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Shape_Impl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape_Impl__Group__0"


    // $ANTLR start "rule__Shape_Impl__Group__0__Impl"
    // InternalSTL.g:463:1: rule__Shape_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Shape_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:467:1: ( ( () ) )
            // InternalSTL.g:468:1: ( () )
            {
            // InternalSTL.g:468:1: ( () )
            // InternalSTL.g:469:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShape_ImplAccess().getShapeAction_0()); 
            }
            // InternalSTL.g:470:2: ()
            // InternalSTL.g:470:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShape_ImplAccess().getShapeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape_Impl__Group__0__Impl"


    // $ANTLR start "rule__Shape_Impl__Group__1"
    // InternalSTL.g:478:1: rule__Shape_Impl__Group__1 : rule__Shape_Impl__Group__1__Impl ;
    public final void rule__Shape_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:482:1: ( rule__Shape_Impl__Group__1__Impl )
            // InternalSTL.g:483:2: rule__Shape_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shape_Impl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape_Impl__Group__1"


    // $ANTLR start "rule__Shape_Impl__Group__1__Impl"
    // InternalSTL.g:489:1: rule__Shape_Impl__Group__1__Impl : ( ( rule__Shape_Impl__TrianglesAssignment_1 )* ) ;
    public final void rule__Shape_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:493:1: ( ( ( rule__Shape_Impl__TrianglesAssignment_1 )* ) )
            // InternalSTL.g:494:1: ( ( rule__Shape_Impl__TrianglesAssignment_1 )* )
            {
            // InternalSTL.g:494:1: ( ( rule__Shape_Impl__TrianglesAssignment_1 )* )
            // InternalSTL.g:495:2: ( rule__Shape_Impl__TrianglesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShape_ImplAccess().getTrianglesAssignment_1()); 
            }
            // InternalSTL.g:496:2: ( rule__Shape_Impl__TrianglesAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSTL.g:496:3: rule__Shape_Impl__TrianglesAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Shape_Impl__TrianglesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShape_ImplAccess().getTrianglesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape_Impl__Group__1__Impl"


    // $ANTLR start "rule__Triangle__Group__0"
    // InternalSTL.g:505:1: rule__Triangle__Group__0 : rule__Triangle__Group__0__Impl rule__Triangle__Group__1 ;
    public final void rule__Triangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:509:1: ( rule__Triangle__Group__0__Impl rule__Triangle__Group__1 )
            // InternalSTL.g:510:2: rule__Triangle__Group__0__Impl rule__Triangle__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Triangle__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Triangle__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__0"


    // $ANTLR start "rule__Triangle__Group__0__Impl"
    // InternalSTL.g:517:1: rule__Triangle__Group__0__Impl : ( () ) ;
    public final void rule__Triangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:521:1: ( ( () ) )
            // InternalSTL.g:522:1: ( () )
            {
            // InternalSTL.g:522:1: ( () )
            // InternalSTL.g:523:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleAccess().getTriangleAction_0()); 
            }
            // InternalSTL.g:524:2: ()
            // InternalSTL.g:524:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleAccess().getTriangleAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__0__Impl"


    // $ANTLR start "rule__Triangle__Group__1"
    // InternalSTL.g:532:1: rule__Triangle__Group__1 : rule__Triangle__Group__1__Impl rule__Triangle__Group__2 ;
    public final void rule__Triangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:536:1: ( rule__Triangle__Group__1__Impl rule__Triangle__Group__2 )
            // InternalSTL.g:537:2: rule__Triangle__Group__1__Impl rule__Triangle__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Triangle__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Triangle__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__1"


    // $ANTLR start "rule__Triangle__Group__1__Impl"
    // InternalSTL.g:544:1: rule__Triangle__Group__1__Impl : ( 'facet' ) ;
    public final void rule__Triangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:548:1: ( ( 'facet' ) )
            // InternalSTL.g:549:1: ( 'facet' )
            {
            // InternalSTL.g:549:1: ( 'facet' )
            // InternalSTL.g:550:2: 'facet'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleAccess().getFacetKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleAccess().getFacetKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__1__Impl"


    // $ANTLR start "rule__Triangle__Group__2"
    // InternalSTL.g:559:1: rule__Triangle__Group__2 : rule__Triangle__Group__2__Impl rule__Triangle__Group__3 ;
    public final void rule__Triangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:563:1: ( rule__Triangle__Group__2__Impl rule__Triangle__Group__3 )
            // InternalSTL.g:564:2: rule__Triangle__Group__2__Impl rule__Triangle__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Triangle__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Triangle__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__2"


    // $ANTLR start "rule__Triangle__Group__2__Impl"
    // InternalSTL.g:571:1: rule__Triangle__Group__2__Impl : ( ( rule__Triangle__Group_2__0 ) ) ;
    public final void rule__Triangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:575:1: ( ( ( rule__Triangle__Group_2__0 ) ) )
            // InternalSTL.g:576:1: ( ( rule__Triangle__Group_2__0 ) )
            {
            // InternalSTL.g:576:1: ( ( rule__Triangle__Group_2__0 ) )
            // InternalSTL.g:577:2: ( rule__Triangle__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleAccess().getGroup_2()); 
            }
            // InternalSTL.g:578:2: ( rule__Triangle__Group_2__0 )
            // InternalSTL.g:578:3: rule__Triangle__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__2__Impl"


    // $ANTLR start "rule__Triangle__Group__3"
    // InternalSTL.g:586:1: rule__Triangle__Group__3 : rule__Triangle__Group__3__Impl rule__Triangle__Group__4 ;
    public final void rule__Triangle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:590:1: ( rule__Triangle__Group__3__Impl rule__Triangle__Group__4 )
            // InternalSTL.g:591:2: rule__Triangle__Group__3__Impl rule__Triangle__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Triangle__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Triangle__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__3"


    // $ANTLR start "rule__Triangle__Group__3__Impl"
    // InternalSTL.g:598:1: rule__Triangle__Group__3__Impl : ( 'outer' ) ;
    public final void rule__Triangle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:602:1: ( ( 'outer' ) )
            // InternalSTL.g:603:1: ( 'outer' )
            {
            // InternalSTL.g:603:1: ( 'outer' )
            // InternalSTL.g:604:2: 'outer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleAccess().getOuterKeyword_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleAccess().getOuterKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__3__Impl"


    // $ANTLR start "rule__Triangle__Group__4"
    // InternalSTL.g:613:1: rule__Triangle__Group__4 : rule__Triangle__Group__4__Impl rule__Triangle__Group__5 ;
    public final void rule__Triangle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:617:1: ( rule__Triangle__Group__4__Impl rule__Triangle__Group__5 )
            // InternalSTL.g:618:2: rule__Triangle__Group__4__Impl rule__Triangle__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Triangle__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Triangle__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__4"


    // $ANTLR start "rule__Triangle__Group__4__Impl"
    // InternalSTL.g:625:1: rule__Triangle__Group__4__Impl : ( 'loop' ) ;
    public final void rule__Triangle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:629:1: ( ( 'loop' ) )
            // InternalSTL.g:630:1: ( 'loop' )
            {
            // InternalSTL.g:630:1: ( 'loop' )
            // InternalSTL.g:631:2: 'loop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleAccess().getLoopKeyword_4()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleAccess().getLoopKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__4__Impl"


    // $ANTLR start "rule__Triangle__Group__5"
    // InternalSTL.g:640:1: rule__Triangle__Group__5 : rule__Triangle__Group__5__Impl rule__Triangle__Group__6 ;
    public final void rule__Triangle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:644:1: ( rule__Triangle__Group__5__Impl rule__Triangle__Group__6 )
            // InternalSTL.g:645:2: rule__Triangle__Group__5__Impl rule__Triangle__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Triangle__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Triangle__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__5"


    // $ANTLR start "rule__Triangle__Group__5__Impl"
    // InternalSTL.g:652:1: rule__Triangle__Group__5__Impl : ( ( rule__Triangle__VerticesAssignment_5 )* ) ;
    public final void rule__Triangle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:656:1: ( ( ( rule__Triangle__VerticesAssignment_5 )* ) )
            // InternalSTL.g:657:1: ( ( rule__Triangle__VerticesAssignment_5 )* )
            {
            // InternalSTL.g:657:1: ( ( rule__Triangle__VerticesAssignment_5 )* )
            // InternalSTL.g:658:2: ( rule__Triangle__VerticesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleAccess().getVerticesAssignment_5()); 
            }
            // InternalSTL.g:659:2: ( rule__Triangle__VerticesAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSTL.g:659:3: rule__Triangle__VerticesAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Triangle__VerticesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleAccess().getVerticesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__5__Impl"


    // $ANTLR start "rule__Triangle__Group__6"
    // InternalSTL.g:667:1: rule__Triangle__Group__6 : rule__Triangle__Group__6__Impl rule__Triangle__Group__7 ;
    public final void rule__Triangle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:671:1: ( rule__Triangle__Group__6__Impl rule__Triangle__Group__7 )
            // InternalSTL.g:672:2: rule__Triangle__Group__6__Impl rule__Triangle__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Triangle__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Triangle__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__6"


    // $ANTLR start "rule__Triangle__Group__6__Impl"
    // InternalSTL.g:679:1: rule__Triangle__Group__6__Impl : ( 'endloop' ) ;
    public final void rule__Triangle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:683:1: ( ( 'endloop' ) )
            // InternalSTL.g:684:1: ( 'endloop' )
            {
            // InternalSTL.g:684:1: ( 'endloop' )
            // InternalSTL.g:685:2: 'endloop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleAccess().getEndloopKeyword_6()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleAccess().getEndloopKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__6__Impl"


    // $ANTLR start "rule__Triangle__Group__7"
    // InternalSTL.g:694:1: rule__Triangle__Group__7 : rule__Triangle__Group__7__Impl ;
    public final void rule__Triangle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:698:1: ( rule__Triangle__Group__7__Impl )
            // InternalSTL.g:699:2: rule__Triangle__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__7"


    // $ANTLR start "rule__Triangle__Group__7__Impl"
    // InternalSTL.g:705:1: rule__Triangle__Group__7__Impl : ( 'endfacet' ) ;
    public final void rule__Triangle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:709:1: ( ( 'endfacet' ) )
            // InternalSTL.g:710:1: ( 'endfacet' )
            {
            // InternalSTL.g:710:1: ( 'endfacet' )
            // InternalSTL.g:711:2: 'endfacet'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleAccess().getEndfacetKeyword_7()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleAccess().getEndfacetKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__7__Impl"


    // $ANTLR start "rule__Triangle__Group_2__0"
    // InternalSTL.g:721:1: rule__Triangle__Group_2__0 : rule__Triangle__Group_2__0__Impl rule__Triangle__Group_2__1 ;
    public final void rule__Triangle__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:725:1: ( rule__Triangle__Group_2__0__Impl rule__Triangle__Group_2__1 )
            // InternalSTL.g:726:2: rule__Triangle__Group_2__0__Impl rule__Triangle__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Triangle__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Triangle__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_2__0"


    // $ANTLR start "rule__Triangle__Group_2__0__Impl"
    // InternalSTL.g:733:1: rule__Triangle__Group_2__0__Impl : ( 'normal' ) ;
    public final void rule__Triangle__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:737:1: ( ( 'normal' ) )
            // InternalSTL.g:738:1: ( 'normal' )
            {
            // InternalSTL.g:738:1: ( 'normal' )
            // InternalSTL.g:739:2: 'normal'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleAccess().getNormalKeyword_2_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleAccess().getNormalKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_2__0__Impl"


    // $ANTLR start "rule__Triangle__Group_2__1"
    // InternalSTL.g:748:1: rule__Triangle__Group_2__1 : rule__Triangle__Group_2__1__Impl ;
    public final void rule__Triangle__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:752:1: ( rule__Triangle__Group_2__1__Impl )
            // InternalSTL.g:753:2: rule__Triangle__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_2__1"


    // $ANTLR start "rule__Triangle__Group_2__1__Impl"
    // InternalSTL.g:759:1: rule__Triangle__Group_2__1__Impl : ( ( rule__Triangle__NormalAssignment_2_1 ) ) ;
    public final void rule__Triangle__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:763:1: ( ( ( rule__Triangle__NormalAssignment_2_1 ) ) )
            // InternalSTL.g:764:1: ( ( rule__Triangle__NormalAssignment_2_1 ) )
            {
            // InternalSTL.g:764:1: ( ( rule__Triangle__NormalAssignment_2_1 ) )
            // InternalSTL.g:765:2: ( rule__Triangle__NormalAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleAccess().getNormalAssignment_2_1()); 
            }
            // InternalSTL.g:766:2: ( rule__Triangle__NormalAssignment_2_1 )
            // InternalSTL.g:766:3: rule__Triangle__NormalAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__NormalAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleAccess().getNormalAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_2__1__Impl"


    // $ANTLR start "rule__Vertex__Group__0"
    // InternalSTL.g:775:1: rule__Vertex__Group__0 : rule__Vertex__Group__0__Impl rule__Vertex__Group__1 ;
    public final void rule__Vertex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:779:1: ( rule__Vertex__Group__0__Impl rule__Vertex__Group__1 )
            // InternalSTL.g:780:2: rule__Vertex__Group__0__Impl rule__Vertex__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Vertex__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Vertex__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertex__Group__0"


    // $ANTLR start "rule__Vertex__Group__0__Impl"
    // InternalSTL.g:787:1: rule__Vertex__Group__0__Impl : ( () ) ;
    public final void rule__Vertex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:791:1: ( ( () ) )
            // InternalSTL.g:792:1: ( () )
            {
            // InternalSTL.g:792:1: ( () )
            // InternalSTL.g:793:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVertexAccess().getVertexAction_0()); 
            }
            // InternalSTL.g:794:2: ()
            // InternalSTL.g:794:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVertexAccess().getVertexAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertex__Group__0__Impl"


    // $ANTLR start "rule__Vertex__Group__1"
    // InternalSTL.g:802:1: rule__Vertex__Group__1 : rule__Vertex__Group__1__Impl rule__Vertex__Group__2 ;
    public final void rule__Vertex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:806:1: ( rule__Vertex__Group__1__Impl rule__Vertex__Group__2 )
            // InternalSTL.g:807:2: rule__Vertex__Group__1__Impl rule__Vertex__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Vertex__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Vertex__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertex__Group__1"


    // $ANTLR start "rule__Vertex__Group__1__Impl"
    // InternalSTL.g:814:1: rule__Vertex__Group__1__Impl : ( 'vertex' ) ;
    public final void rule__Vertex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:818:1: ( ( 'vertex' ) )
            // InternalSTL.g:819:1: ( 'vertex' )
            {
            // InternalSTL.g:819:1: ( 'vertex' )
            // InternalSTL.g:820:2: 'vertex'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVertexAccess().getVertexKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVertexAccess().getVertexKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertex__Group__1__Impl"


    // $ANTLR start "rule__Vertex__Group__2"
    // InternalSTL.g:829:1: rule__Vertex__Group__2 : rule__Vertex__Group__2__Impl rule__Vertex__Group__3 ;
    public final void rule__Vertex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:833:1: ( rule__Vertex__Group__2__Impl rule__Vertex__Group__3 )
            // InternalSTL.g:834:2: rule__Vertex__Group__2__Impl rule__Vertex__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Vertex__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Vertex__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertex__Group__2"


    // $ANTLR start "rule__Vertex__Group__2__Impl"
    // InternalSTL.g:841:1: rule__Vertex__Group__2__Impl : ( ( rule__Vertex__XAssignment_2 ) ) ;
    public final void rule__Vertex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:845:1: ( ( ( rule__Vertex__XAssignment_2 ) ) )
            // InternalSTL.g:846:1: ( ( rule__Vertex__XAssignment_2 ) )
            {
            // InternalSTL.g:846:1: ( ( rule__Vertex__XAssignment_2 ) )
            // InternalSTL.g:847:2: ( rule__Vertex__XAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVertexAccess().getXAssignment_2()); 
            }
            // InternalSTL.g:848:2: ( rule__Vertex__XAssignment_2 )
            // InternalSTL.g:848:3: rule__Vertex__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Vertex__XAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVertexAccess().getXAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertex__Group__2__Impl"


    // $ANTLR start "rule__Vertex__Group__3"
    // InternalSTL.g:856:1: rule__Vertex__Group__3 : rule__Vertex__Group__3__Impl rule__Vertex__Group__4 ;
    public final void rule__Vertex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:860:1: ( rule__Vertex__Group__3__Impl rule__Vertex__Group__4 )
            // InternalSTL.g:861:2: rule__Vertex__Group__3__Impl rule__Vertex__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Vertex__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Vertex__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertex__Group__3"


    // $ANTLR start "rule__Vertex__Group__3__Impl"
    // InternalSTL.g:868:1: rule__Vertex__Group__3__Impl : ( ( rule__Vertex__YAssignment_3 ) ) ;
    public final void rule__Vertex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:872:1: ( ( ( rule__Vertex__YAssignment_3 ) ) )
            // InternalSTL.g:873:1: ( ( rule__Vertex__YAssignment_3 ) )
            {
            // InternalSTL.g:873:1: ( ( rule__Vertex__YAssignment_3 ) )
            // InternalSTL.g:874:2: ( rule__Vertex__YAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVertexAccess().getYAssignment_3()); 
            }
            // InternalSTL.g:875:2: ( rule__Vertex__YAssignment_3 )
            // InternalSTL.g:875:3: rule__Vertex__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Vertex__YAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVertexAccess().getYAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertex__Group__3__Impl"


    // $ANTLR start "rule__Vertex__Group__4"
    // InternalSTL.g:883:1: rule__Vertex__Group__4 : rule__Vertex__Group__4__Impl ;
    public final void rule__Vertex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:887:1: ( rule__Vertex__Group__4__Impl )
            // InternalSTL.g:888:2: rule__Vertex__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vertex__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertex__Group__4"


    // $ANTLR start "rule__Vertex__Group__4__Impl"
    // InternalSTL.g:894:1: rule__Vertex__Group__4__Impl : ( ( rule__Vertex__ZAssignment_4 ) ) ;
    public final void rule__Vertex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:898:1: ( ( ( rule__Vertex__ZAssignment_4 ) ) )
            // InternalSTL.g:899:1: ( ( rule__Vertex__ZAssignment_4 ) )
            {
            // InternalSTL.g:899:1: ( ( rule__Vertex__ZAssignment_4 ) )
            // InternalSTL.g:900:2: ( rule__Vertex__ZAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVertexAccess().getZAssignment_4()); 
            }
            // InternalSTL.g:901:2: ( rule__Vertex__ZAssignment_4 )
            // InternalSTL.g:901:3: rule__Vertex__ZAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Vertex__ZAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVertexAccess().getZAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertex__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalSTL.g:910:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:914:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalSTL.g:915:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EDouble__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalSTL.g:922:1: rule__EDouble__Group__0__Impl : ( ( rule__EDouble__Alternatives_0 )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:926:1: ( ( ( rule__EDouble__Alternatives_0 )? ) )
            // InternalSTL.g:927:1: ( ( rule__EDouble__Alternatives_0 )? )
            {
            // InternalSTL.g:927:1: ( ( rule__EDouble__Alternatives_0 )? )
            // InternalSTL.g:928:2: ( rule__EDouble__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives_0()); 
            }
            // InternalSTL.g:929:2: ( rule__EDouble__Alternatives_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=11 && LA10_0<=12)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSTL.g:929:3: rule__EDouble__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalSTL.g:937:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:941:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalSTL.g:942:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__EDouble__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalSTL.g:949:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:953:1: ( ( ( RULE_INT )? ) )
            // InternalSTL.g:954:1: ( ( RULE_INT )? )
            {
            // InternalSTL.g:954:1: ( ( RULE_INT )? )
            // InternalSTL.g:955:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            }
            // InternalSTL.g:956:2: ( RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSTL.g:956:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalSTL.g:964:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:968:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalSTL.g:969:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__EDouble__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalSTL.g:976:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:980:1: ( ( '.' ) )
            // InternalSTL.g:981:1: ( '.' )
            {
            // InternalSTL.g:981:1: ( '.' )
            // InternalSTL.g:982:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalSTL.g:991:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:995:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalSTL.g:996:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalSTL.g:1003:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1007:1: ( ( RULE_INT ) )
            // InternalSTL.g:1008:1: ( RULE_INT )
            {
            // InternalSTL.g:1008:1: ( RULE_INT )
            // InternalSTL.g:1009:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalSTL.g:1018:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1022:1: ( rule__EDouble__Group__4__Impl )
            // InternalSTL.g:1023:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalSTL.g:1029:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1033:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalSTL.g:1034:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalSTL.g:1034:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalSTL.g:1035:2: ( rule__EDouble__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            }
            // InternalSTL.g:1036:2: ( rule__EDouble__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=13 && LA12_0<=14)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSTL.g:1036:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalSTL.g:1045:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1049:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalSTL.g:1050:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalSTL.g:1057:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1061:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalSTL.g:1062:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalSTL.g:1062:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalSTL.g:1063:2: ( rule__EDouble__Alternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            }
            // InternalSTL.g:1064:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalSTL.g:1064:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalSTL.g:1072:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1076:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalSTL.g:1077:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_18);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalSTL.g:1084:1: rule__EDouble__Group_4__1__Impl : ( ( rule__EDouble__Alternatives_4_1 )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1088:1: ( ( ( rule__EDouble__Alternatives_4_1 )? ) )
            // InternalSTL.g:1089:1: ( ( rule__EDouble__Alternatives_4_1 )? )
            {
            // InternalSTL.g:1089:1: ( ( rule__EDouble__Alternatives_4_1 )? )
            // InternalSTL.g:1090:2: ( rule__EDouble__Alternatives_4_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives_4_1()); 
            }
            // InternalSTL.g:1091:2: ( rule__EDouble__Alternatives_4_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=11 && LA13_0<=12)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSTL.g:1091:3: rule__EDouble__Alternatives_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Alternatives_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getAlternatives_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalSTL.g:1099:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1103:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalSTL.g:1104:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalSTL.g:1110:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1114:1: ( ( RULE_INT ) )
            // InternalSTL.g:1115:1: ( RULE_INT )
            {
            // InternalSTL.g:1115:1: ( RULE_INT )
            // InternalSTL.g:1116:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__ELine__Group_1__0"
    // InternalSTL.g:1126:1: rule__ELine__Group_1__0 : rule__ELine__Group_1__0__Impl rule__ELine__Group_1__1 ;
    public final void rule__ELine__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1130:1: ( rule__ELine__Group_1__0__Impl rule__ELine__Group_1__1 )
            // InternalSTL.g:1131:2: rule__ELine__Group_1__0__Impl rule__ELine__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__ELine__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ELine__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELine__Group_1__0"


    // $ANTLR start "rule__ELine__Group_1__0__Impl"
    // InternalSTL.g:1138:1: rule__ELine__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__ELine__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1142:1: ( ( RULE_ID ) )
            // InternalSTL.g:1143:1: ( RULE_ID )
            {
            // InternalSTL.g:1143:1: ( RULE_ID )
            // InternalSTL.g:1144:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getELineAccess().getIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getELineAccess().getIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELine__Group_1__0__Impl"


    // $ANTLR start "rule__ELine__Group_1__1"
    // InternalSTL.g:1153:1: rule__ELine__Group_1__1 : rule__ELine__Group_1__1__Impl ;
    public final void rule__ELine__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1157:1: ( rule__ELine__Group_1__1__Impl )
            // InternalSTL.g:1158:2: rule__ELine__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ELine__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELine__Group_1__1"


    // $ANTLR start "rule__ELine__Group_1__1__Impl"
    // InternalSTL.g:1164:1: rule__ELine__Group_1__1__Impl : ( ( rule__ELine__Group_1_1__0 ) ) ;
    public final void rule__ELine__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1168:1: ( ( ( rule__ELine__Group_1_1__0 ) ) )
            // InternalSTL.g:1169:1: ( ( rule__ELine__Group_1_1__0 ) )
            {
            // InternalSTL.g:1169:1: ( ( rule__ELine__Group_1_1__0 ) )
            // InternalSTL.g:1170:2: ( rule__ELine__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getELineAccess().getGroup_1_1()); 
            }
            // InternalSTL.g:1171:2: ( rule__ELine__Group_1_1__0 )
            // InternalSTL.g:1171:3: rule__ELine__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ELine__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getELineAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELine__Group_1__1__Impl"


    // $ANTLR start "rule__ELine__Group_1_1__0"
    // InternalSTL.g:1180:1: rule__ELine__Group_1_1__0 : rule__ELine__Group_1_1__0__Impl ;
    public final void rule__ELine__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1184:1: ( rule__ELine__Group_1_1__0__Impl )
            // InternalSTL.g:1185:2: rule__ELine__Group_1_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ELine__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELine__Group_1_1__0"


    // $ANTLR start "rule__ELine__Group_1_1__0__Impl"
    // InternalSTL.g:1191:1: rule__ELine__Group_1_1__0__Impl : ( ( rule__ELine__Alternatives_1_1_0 ) ) ;
    public final void rule__ELine__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1195:1: ( ( ( rule__ELine__Alternatives_1_1_0 ) ) )
            // InternalSTL.g:1196:1: ( ( rule__ELine__Alternatives_1_1_0 ) )
            {
            // InternalSTL.g:1196:1: ( ( rule__ELine__Alternatives_1_1_0 ) )
            // InternalSTL.g:1197:2: ( rule__ELine__Alternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getELineAccess().getAlternatives_1_1_0()); 
            }
            // InternalSTL.g:1198:2: ( rule__ELine__Alternatives_1_1_0 )
            // InternalSTL.g:1198:3: rule__ELine__Alternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ELine__Alternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getELineAccess().getAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELine__Group_1_1__0__Impl"


    // $ANTLR start "rule__Geometry__NameAssignment_2"
    // InternalSTL.g:1207:1: rule__Geometry__NameAssignment_2 : ( ruleELine ) ;
    public final void rule__Geometry__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1211:1: ( ( ruleELine ) )
            // InternalSTL.g:1212:2: ( ruleELine )
            {
            // InternalSTL.g:1212:2: ( ruleELine )
            // InternalSTL.g:1213:3: ruleELine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeometryAccess().getNameELineParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleELine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeometryAccess().getNameELineParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__NameAssignment_2"


    // $ANTLR start "rule__Geometry__NodesAssignment_3"
    // InternalSTL.g:1222:1: rule__Geometry__NodesAssignment_3 : ( ruleShape_Impl ) ;
    public final void rule__Geometry__NodesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1226:1: ( ( ruleShape_Impl ) )
            // InternalSTL.g:1227:2: ( ruleShape_Impl )
            {
            // InternalSTL.g:1227:2: ( ruleShape_Impl )
            // InternalSTL.g:1228:3: ruleShape_Impl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeometryAccess().getNodesShape_ImplParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleShape_Impl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeometryAccess().getNodesShape_ImplParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__NodesAssignment_3"


    // $ANTLR start "rule__Shape_Impl__TrianglesAssignment_1"
    // InternalSTL.g:1237:1: rule__Shape_Impl__TrianglesAssignment_1 : ( ruleTriangle ) ;
    public final void rule__Shape_Impl__TrianglesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1241:1: ( ( ruleTriangle ) )
            // InternalSTL.g:1242:2: ( ruleTriangle )
            {
            // InternalSTL.g:1242:2: ( ruleTriangle )
            // InternalSTL.g:1243:3: ruleTriangle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShape_ImplAccess().getTrianglesTriangleParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTriangle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShape_ImplAccess().getTrianglesTriangleParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape_Impl__TrianglesAssignment_1"


    // $ANTLR start "rule__Triangle__NormalAssignment_2_1"
    // InternalSTL.g:1252:1: rule__Triangle__NormalAssignment_2_1 : ( ruleVertex ) ;
    public final void rule__Triangle__NormalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1256:1: ( ( ruleVertex ) )
            // InternalSTL.g:1257:2: ( ruleVertex )
            {
            // InternalSTL.g:1257:2: ( ruleVertex )
            // InternalSTL.g:1258:3: ruleVertex
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleAccess().getNormalVertexParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVertex();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleAccess().getNormalVertexParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__NormalAssignment_2_1"


    // $ANTLR start "rule__Triangle__VerticesAssignment_5"
    // InternalSTL.g:1267:1: rule__Triangle__VerticesAssignment_5 : ( ruleVertex ) ;
    public final void rule__Triangle__VerticesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1271:1: ( ( ruleVertex ) )
            // InternalSTL.g:1272:2: ( ruleVertex )
            {
            // InternalSTL.g:1272:2: ( ruleVertex )
            // InternalSTL.g:1273:3: ruleVertex
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriangleAccess().getVerticesVertexParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVertex();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriangleAccess().getVerticesVertexParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__VerticesAssignment_5"


    // $ANTLR start "rule__Vertex__XAssignment_2"
    // InternalSTL.g:1282:1: rule__Vertex__XAssignment_2 : ( ruleEDouble ) ;
    public final void rule__Vertex__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1286:1: ( ( ruleEDouble ) )
            // InternalSTL.g:1287:2: ( ruleEDouble )
            {
            // InternalSTL.g:1287:2: ( ruleEDouble )
            // InternalSTL.g:1288:3: ruleEDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVertexAccess().getXEDoubleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVertexAccess().getXEDoubleParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertex__XAssignment_2"


    // $ANTLR start "rule__Vertex__YAssignment_3"
    // InternalSTL.g:1297:1: rule__Vertex__YAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Vertex__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1301:1: ( ( ruleEDouble ) )
            // InternalSTL.g:1302:2: ( ruleEDouble )
            {
            // InternalSTL.g:1302:2: ( ruleEDouble )
            // InternalSTL.g:1303:3: ruleEDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVertexAccess().getYEDoubleParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVertexAccess().getYEDoubleParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertex__YAssignment_3"


    // $ANTLR start "rule__Vertex__ZAssignment_4"
    // InternalSTL.g:1312:1: rule__Vertex__ZAssignment_4 : ( ruleEDouble ) ;
    public final void rule__Vertex__ZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSTL.g:1316:1: ( ( ruleEDouble ) )
            // InternalSTL.g:1317:2: ( ruleEDouble )
            {
            // InternalSTL.g:1317:2: ( ruleEDouble )
            // InternalSTL.g:1318:3: ruleEDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVertexAccess().getZEDoubleParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVertexAccess().getZEDoubleParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vertex__ZAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004001820L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001820L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000018000L});

}