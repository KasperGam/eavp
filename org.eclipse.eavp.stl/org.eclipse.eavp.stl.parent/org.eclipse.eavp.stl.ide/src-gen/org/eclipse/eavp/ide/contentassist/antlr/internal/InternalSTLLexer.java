package org.eclipse.eavp.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSTLLexer extends Lexer {
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=5;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;

    // delegates
    // delegators

    public InternalSTLLexer() {;} 
    public InternalSTLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSTLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSTL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:11:7: ( 'solid' )
            // InternalSTL.g:11:9: 'solid'
            {
            match("solid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:12:7: ( 'endsolid' )
            // InternalSTL.g:12:9: 'endsolid'
            {
            match("endsolid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:13:7: ( 'facet' )
            // InternalSTL.g:13:9: 'facet'
            {
            match("facet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:14:7: ( 'endfacet' )
            // InternalSTL.g:14:9: 'endfacet'
            {
            match("endfacet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:15:7: ( 'normal' )
            // InternalSTL.g:15:9: 'normal'
            {
            match("normal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:16:7: ( 'outer' )
            // InternalSTL.g:16:9: 'outer'
            {
            match("outer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:17:7: ( 'loop' )
            // InternalSTL.g:17:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:18:7: ( 'endloop' )
            // InternalSTL.g:18:9: 'endloop'
            {
            match("endloop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:19:7: ( 'vertex' )
            // InternalSTL.g:19:9: 'vertex'
            {
            match("vertex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:1087:13: ( ( '-' )? ( '0' .. '9' )* ( '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '-' | '+' )? ( '0' .. '9' )* )? )? )
            // InternalSTL.g:1087:15: ( '-' )? ( '0' .. '9' )* ( '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '-' | '+' )? ( '0' .. '9' )* )? )?
            {
            // InternalSTL.g:1087:15: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSTL.g:1087:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalSTL.g:1087:20: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSTL.g:1087:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSTL.g:1087:32: ( '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '-' | '+' )? ( '0' .. '9' )* )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSTL.g:1087:33: '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '-' | '+' )? ( '0' .. '9' )* )?
                    {
                    match('.'); 
                    // InternalSTL.g:1087:37: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSTL.g:1087:38: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // InternalSTL.g:1087:49: ( ( 'e' | 'E' ) ( '-' | '+' )? ( '0' .. '9' )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalSTL.g:1087:50: ( 'e' | 'E' ) ( '-' | '+' )? ( '0' .. '9' )*
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalSTL.g:1087:60: ( '-' | '+' )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='+'||LA4_0=='-') ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // InternalSTL.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // InternalSTL.g:1087:71: ( '0' .. '9' )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalSTL.g:1087:72: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:1089:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSTL.g:1089:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSTL.g:1089:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSTL.g:1089:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSTL.g:1089:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSTL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:1091:10: ( ( '0' .. '9' )+ )
            // InternalSTL.g:1091:12: ( '0' .. '9' )+
            {
            // InternalSTL.g:1091:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSTL.g:1091:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:1093:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSTL.g:1093:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSTL.g:1093:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSTL.g:1093:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSTL.g:1093:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSTL.g:1093:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSTL.g:1093:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSTL.g:1093:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSTL.g:1093:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSTL.g:1093:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSTL.g:1093:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:1095:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSTL.g:1095:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSTL.g:1095:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSTL.g:1095:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:1097:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSTL.g:1097:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSTL.g:1097:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSTL.g:1097:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalSTL.g:1097:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSTL.g:1097:41: ( '\\r' )? '\\n'
                    {
                    // InternalSTL.g:1097:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSTL.g:1097:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:1099:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSTL.g:1099:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSTL.g:1099:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSTL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSTL.g:1101:16: ( . )
            // InternalSTL.g:1101:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSTL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=17;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalSTL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalSTL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalSTL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalSTL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalSTL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalSTL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalSTL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalSTL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalSTL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalSTL.g:1:64: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 11 :
                // InternalSTL.g:1:76: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // InternalSTL.g:1:84: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // InternalSTL.g:1:93: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // InternalSTL.g:1:105: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // InternalSTL.g:1:121: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // InternalSTL.g:1:137: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // InternalSTL.g:1:145: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\13\7\24\1\uffff\1\13\2\uffff\1\22\1\uffff\3\22\2\uffff\1\24\1\uffff\6\24\1\13\4\uffff\16\24\1\67\1\24\1\71\3\24\1\75\1\24\1\77\1\uffff\1\24\1\uffff\3\24\1\uffff\1\104\1\uffff\1\105\2\24\1\110\2\uffff\1\111\1\112\3\uffff";
    static final String DFA19_eofS =
        "\113\uffff";
    static final String DFA19_minS =
        "\1\0\1\157\1\156\1\141\1\157\1\165\1\157\1\145\1\uffff\1\60\2\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\154\1\uffff\1\144\1\143\1\162\1\164\1\157\1\162\1\60\4\uffff\1\151\1\146\1\145\1\155\1\145\1\160\1\164\1\144\1\157\1\141\1\157\1\164\1\141\1\162\1\60\1\145\1\60\1\154\1\143\1\157\1\60\1\154\1\60\1\uffff\1\170\1\uffff\1\151\1\145\1\160\1\uffff\1\60\1\uffff\1\60\1\144\1\164\1\60\2\uffff\2\60\3\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\157\1\156\1\141\1\157\1\165\1\157\1\145\1\uffff\1\71\2\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\154\1\uffff\1\144\1\143\1\162\1\164\1\157\1\162\1\71\4\uffff\1\151\1\163\1\145\1\155\1\145\1\160\1\164\1\144\1\157\1\141\1\157\1\164\1\141\1\162\1\172\1\145\1\172\1\154\1\143\1\157\1\172\1\154\1\172\1\uffff\1\170\1\uffff\1\151\1\145\1\160\1\uffff\1\172\1\uffff\1\172\1\144\1\164\1\172\2\uffff\2\172\3\uffff";
    static final String DFA19_acceptS =
        "\10\uffff\1\12\1\uffff\2\12\1\uffff\1\13\3\uffff\1\20\1\21\1\uffff\1\13\7\uffff\1\15\1\16\1\17\1\20\27\uffff\1\7\1\uffff\1\1\3\uffff\1\3\1\uffff\1\6\4\uffff\1\5\1\11\2\uffff\1\10\1\2\1\4";
    static final String DFA19_specialS =
        "\1\0\15\uffff\1\1\1\2\73\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\16\4\22\1\17\5\22\1\10\1\12\1\20\12\11\7\22\32\15\3\22\1\14\1\15\1\22\4\15\1\2\1\3\5\15\1\6\1\15\1\4\1\5\3\15\1\1\2\15\1\7\4\15\uff85\22",
            "\1\23",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "",
            "\12\33",
            "",
            "",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\0\34",
            "\0\34",
            "\1\35\4\uffff\1\36",
            "",
            "",
            "\1\40",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\12\33",
            "",
            "",
            "",
            "",
            "\1\47",
            "\1\51\5\uffff\1\52\6\uffff\1\50",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\70",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\76",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\100",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\106",
            "\1\107",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='s') ) {s = 1;}

                        else if ( (LA19_0=='e') ) {s = 2;}

                        else if ( (LA19_0=='f') ) {s = 3;}

                        else if ( (LA19_0=='n') ) {s = 4;}

                        else if ( (LA19_0=='o') ) {s = 5;}

                        else if ( (LA19_0=='l') ) {s = 6;}

                        else if ( (LA19_0=='v') ) {s = 7;}

                        else if ( (LA19_0=='-') ) {s = 8;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 9;}

                        else if ( (LA19_0=='.') ) {s = 10;}

                        else if ( (LA19_0=='^') ) {s = 12;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='d')||(LA19_0>='g' && LA19_0<='k')||LA19_0=='m'||(LA19_0>='p' && LA19_0<='r')||(LA19_0>='t' && LA19_0<='u')||(LA19_0>='w' && LA19_0<='z')) ) {s = 13;}

                        else if ( (LA19_0=='\"') ) {s = 14;}

                        else if ( (LA19_0=='\'') ) {s = 15;}

                        else if ( (LA19_0=='/') ) {s = 16;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 17;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||(LA19_0>='#' && LA19_0<='&')||(LA19_0>='(' && LA19_0<=',')||(LA19_0>=':' && LA19_0<='@')||(LA19_0>='[' && LA19_0<=']')||LA19_0=='`'||(LA19_0>='{' && LA19_0<='\uFFFF')) ) {s = 18;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_14 = input.LA(1);

                        s = -1;
                        if ( ((LA19_14>='\u0000' && LA19_14<='\uFFFF')) ) {s = 28;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_15 = input.LA(1);

                        s = -1;
                        if ( ((LA19_15>='\u0000' && LA19_15<='\uFFFF')) ) {s = 28;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}