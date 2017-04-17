package ale.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAleLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_REAL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_NULL=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalAleLexer() {;} 
    public InternalAleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAle.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:11:7: ( 'void' )
            // InternalAle.g:11:9: 'void'
            {
            match("void"); 


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
            // InternalAle.g:12:7: ( 'Boolean' )
            // InternalAle.g:12:9: 'Boolean'
            {
            match("Boolean"); 


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
            // InternalAle.g:13:7: ( 'Float' )
            // InternalAle.g:13:9: 'Float'
            {
            match("Float"); 


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
            // InternalAle.g:14:7: ( 'Integer' )
            // InternalAle.g:14:9: 'Integer'
            {
            match("Integer"); 


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
            // InternalAle.g:15:7: ( 'String' )
            // InternalAle.g:15:9: 'String'
            {
            match("String"); 


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
            // InternalAle.g:16:7: ( 'behavior' )
            // InternalAle.g:16:9: 'behavior'
            {
            match("behavior"); 


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
            // InternalAle.g:17:7: ( ';' )
            // InternalAle.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:18:7: ( 'import' )
            // InternalAle.g:18:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:19:7: ( 'as' )
            // InternalAle.g:19:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:20:7: ( '@' )
            // InternalAle.g:20:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:21:7: ( 'open' )
            // InternalAle.g:21:9: 'open'
            {
            match("open"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:22:7: ( 'class' )
            // InternalAle.g:22:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:23:7: ( 'extends' )
            // InternalAle.g:23:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:24:7: ( ',' )
            // InternalAle.g:24:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:25:7: ( '{' )
            // InternalAle.g:25:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:26:7: ( '}' )
            // InternalAle.g:26:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:27:7: ( 'ref' )
            // InternalAle.g:27:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:28:7: ( 'rev' )
            // InternalAle.g:28:9: 'rev'
            {
            match("rev"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:29:7: ( 'cont' )
            // InternalAle.g:29:9: 'cont'
            {
            match("cont"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:30:7: ( 'def' )
            // InternalAle.g:30:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:31:7: ( '(' )
            // InternalAle.g:31:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:32:7: ( ')' )
            // InternalAle.g:32:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:33:7: ( 'override' )
            // InternalAle.g:33:9: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:34:7: ( 'return' )
            // InternalAle.g:34:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:35:7: ( 'let' )
            // InternalAle.g:35:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:36:7: ( 'in' )
            // InternalAle.g:36:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:37:7: ( 'if' )
            // InternalAle.g:37:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:38:7: ( 'else' )
            // InternalAle.g:38:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:39:7: ( 'while' )
            // InternalAle.g:39:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:40:7: ( 'for' )
            // InternalAle.g:40:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:41:7: ( '=' )
            // InternalAle.g:41:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:42:7: ( 'implies' )
            // InternalAle.g:42:9: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:43:7: ( 'or' )
            // InternalAle.g:43:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:44:7: ( 'and' )
            // InternalAle.g:44:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:45:7: ( 'xor' )
            // InternalAle.g:45:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:46:7: ( '<=' )
            // InternalAle.g:46:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:47:7: ( '>=' )
            // InternalAle.g:47:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:48:7: ( '!=' )
            // InternalAle.g:48:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:49:7: ( '<' )
            // InternalAle.g:49:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:50:7: ( '>' )
            // InternalAle.g:50:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:51:7: ( 'instanceof' )
            // InternalAle.g:51:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:52:7: ( 'castto' )
            // InternalAle.g:52:9: 'castto'
            {
            match("castto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:53:7: ( '*' )
            // InternalAle.g:53:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:54:7: ( '/' )
            // InternalAle.g:54:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:55:7: ( '+' )
            // InternalAle.g:55:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:56:7: ( '-' )
            // InternalAle.g:56:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:57:7: ( '.' )
            // InternalAle.g:57:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:58:7: ( '->' )
            // InternalAle.g:58:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:59:7: ( 'not' )
            // InternalAle.g:59:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:60:7: ( 'newSequence' )
            // InternalAle.g:60:9: 'newSequence'
            {
            match("newSequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:61:7: ( 'new' )
            // InternalAle.g:61:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:62:7: ( '|' )
            // InternalAle.g:62:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:63:7: ( '$' )
            // InternalAle.g:63:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:64:7: ( '[' )
            // InternalAle.g:64:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:65:7: ( ']' )
            // InternalAle.g:65:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:66:7: ( 'self' )
            // InternalAle.g:66:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:67:7: ( 'super' )
            // InternalAle.g:67:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:68:7: ( 'Sequence' )
            // InternalAle.g:68:9: 'Sequence'
            {
            match("Sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:69:7: ( 'OrderedSet' )
            // InternalAle.g:69:9: 'OrderedSet'
            {
            match("OrderedSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:70:7: ( 'Real' )
            // InternalAle.g:70:9: 'Real'
            {
            match("Real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:71:7: ( 'Int' )
            // InternalAle.g:71:9: 'Int'
            {
            match("Int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:72:7: ( 'nulltype' )
            // InternalAle.g:72:9: 'nulltype'
            {
            match("nulltype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:73:7: ( '==' )
            // InternalAle.g:73:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:11559:11: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // InternalAle.g:11559:13: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // InternalAle.g:11559:13: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAle.g:11559:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('.'); 
            // InternalAle.g:11559:29: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAle.g:11559:30: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:11561:14: ( ( 'true' | 'false' ) )
            // InternalAle.g:11561:16: ( 'true' | 'false' )
            {
            // InternalAle.g:11561:16: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAle.g:11561:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalAle.g:11561:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:11563:11: ( 'null' )
            // InternalAle.g:11563:13: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:11565:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAle.g:11565:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAle.g:11565:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAle.g:11565:11: '^'
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

            // InternalAle.g:11565:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAle.g:
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
            	    break loop5;
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
            // InternalAle.g:11567:10: ( ( '0' .. '9' )+ )
            // InternalAle.g:11567:12: ( '0' .. '9' )+
            {
            // InternalAle.g:11567:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAle.g:11567:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // InternalAle.g:11569:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAle.g:11569:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAle.g:11569:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAle.g:11569:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAle.g:11569:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAle.g:11569:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAle.g:11569:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAle.g:11569:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAle.g:11569:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAle.g:11569:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAle.g:11569:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // InternalAle.g:11571:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAle.g:11571:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAle.g:11571:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAle.g:11571:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalAle.g:11573:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAle.g:11573:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAle.g:11573:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAle.g:11573:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalAle.g:11573:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAle.g:11573:41: ( '\\r' )? '\\n'
                    {
                    // InternalAle.g:11573:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalAle.g:11573:41: '\\r'
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
            // InternalAle.g:11575:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAle.g:11575:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAle.g:11575:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAle.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalAle.g:11577:16: ( . )
            // InternalAle.g:11577:18: .
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
        // InternalAle.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | RULE_REAL | RULE_BOOLEAN | RULE_NULL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=73;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalAle.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalAle.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalAle.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalAle.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalAle.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalAle.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalAle.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalAle.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalAle.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalAle.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalAle.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalAle.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalAle.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalAle.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalAle.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalAle.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalAle.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalAle.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalAle.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalAle.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalAle.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalAle.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalAle.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalAle.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalAle.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalAle.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalAle.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalAle.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalAle.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalAle.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalAle.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalAle.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalAle.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalAle.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalAle.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalAle.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalAle.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalAle.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalAle.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalAle.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalAle.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalAle.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalAle.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalAle.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalAle.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalAle.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalAle.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalAle.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalAle.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalAle.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalAle.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // InternalAle.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // InternalAle.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // InternalAle.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // InternalAle.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // InternalAle.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // InternalAle.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // InternalAle.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // InternalAle.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // InternalAle.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // InternalAle.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // InternalAle.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // InternalAle.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // InternalAle.g:1:388: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 65 :
                // InternalAle.g:1:398: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 66 :
                // InternalAle.g:1:411: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 67 :
                // InternalAle.g:1:421: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 68 :
                // InternalAle.g:1:429: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 69 :
                // InternalAle.g:1:438: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 70 :
                // InternalAle.g:1:450: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 71 :
                // InternalAle.g:1:466: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 72 :
                // InternalAle.g:1:482: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 73 :
                // InternalAle.g:1:490: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\6\63\1\uffff\2\63\1\uffff\3\63\3\uffff\2\63\2\uffff\3\63\1\125\1\63\1\130\1\132\1\61\1\uffff\1\137\1\uffff\1\142\1\uffff\1\63\4\uffff\3\63\1\157\1\63\1\61\1\uffff\2\61\2\uffff\1\63\1\uffff\6\63\1\uffff\1\63\1\176\1\177\1\u0080\1\63\1\uffff\2\63\1\u0084\5\63\3\uffff\2\63\2\uffff\4\63\2\uffff\1\63\15\uffff\3\63\4\uffff\4\63\1\uffff\1\157\1\uffff\1\63\2\uffff\3\63\1\u009f\5\63\3\uffff\1\u00a6\2\63\1\uffff\5\63\1\u00ae\1\u00af\1\63\1\u00b1\1\u00b2\1\63\1\u00b4\1\63\1\u00b6\1\u00b7\1\u00b9\6\63\1\u00c0\3\63\1\uffff\6\63\1\uffff\1\u00ca\2\63\1\u00cd\2\63\1\u00d0\2\uffff\1\63\2\uffff\1\63\1\uffff\1\63\2\uffff\1\63\1\uffff\1\u00d6\1\u00d7\2\63\1\u00da\1\u00db\1\uffff\1\63\1\u00dd\7\63\1\uffff\1\63\1\u00e6\1\uffff\2\63\1\uffff\1\63\1\u00ea\1\u00db\2\63\2\uffff\1\u00ed\1\63\2\uffff\1\63\1\uffff\1\63\1\u00f1\2\63\1\u00f4\3\63\1\uffff\1\u00f8\1\63\1\u00fa\1\uffff\2\63\1\uffff\1\63\1\u00fe\1\u00ff\1\uffff\2\63\1\uffff\1\u0102\2\63\1\uffff\1\u0105\1\uffff\3\63\2\uffff\1\u0109\1\u010a\1\uffff\1\63\1\u010c\1\uffff\1\63\1\u010e\1\63\2\uffff\1\63\1\uffff\1\63\1\uffff\1\63\1\u0113\1\63\1\u0115\1\uffff\1\u0116\2\uffff";
    static final String DFA15_eofS =
        "\u0117\uffff";
    static final String DFA15_minS =
        "\1\0\2\157\1\154\1\156\2\145\1\uffff\1\146\1\156\1\uffff\1\160\1\141\1\154\3\uffff\2\145\2\uffff\1\145\1\150\1\141\1\75\1\157\3\75\1\uffff\1\52\1\uffff\1\76\1\uffff\1\145\4\uffff\1\145\1\162\1\145\1\56\1\162\1\101\1\uffff\2\0\2\uffff\1\151\1\uffff\2\157\1\164\1\162\1\161\1\150\1\uffff\1\160\3\60\1\144\1\uffff\2\145\1\60\1\141\1\156\1\163\1\164\1\163\3\uffff\2\146\2\uffff\1\164\1\151\1\162\1\154\2\uffff\1\162\15\uffff\1\164\1\167\1\154\4\uffff\1\154\1\160\1\144\1\141\1\uffff\1\56\1\uffff\1\165\2\uffff\1\144\1\154\1\141\1\60\1\151\1\165\1\141\1\154\1\164\3\uffff\1\60\1\156\1\162\1\uffff\1\163\2\164\2\145\2\60\1\165\2\60\1\154\1\60\1\163\3\60\1\154\1\146\2\145\1\154\1\145\1\60\1\145\1\164\1\147\1\uffff\1\156\1\145\1\166\1\162\1\151\1\141\1\uffff\1\60\1\162\1\163\1\60\1\164\1\156\1\60\2\uffff\1\162\2\uffff\1\145\1\uffff\1\145\2\uffff\1\145\1\uffff\2\60\2\162\2\60\1\uffff\1\141\1\60\1\145\1\147\1\156\1\151\1\164\1\145\1\156\1\uffff\1\151\1\60\1\uffff\1\157\1\144\1\uffff\1\156\2\60\1\161\1\171\2\uffff\1\60\1\145\2\uffff\1\156\1\uffff\1\162\1\60\1\143\1\157\1\60\1\163\1\143\1\144\1\uffff\1\60\1\163\1\60\1\uffff\1\165\1\160\1\uffff\1\144\2\60\1\uffff\1\145\1\162\1\uffff\1\60\2\145\1\uffff\1\60\1\uffff\2\145\1\123\2\uffff\2\60\1\uffff\1\157\1\60\1\uffff\1\156\1\60\1\145\2\uffff\1\146\1\uffff\1\143\1\uffff\1\164\1\60\1\145\1\60\1\uffff\1\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\2\157\1\154\1\156\1\164\1\145\1\uffff\1\156\1\163\1\uffff\1\166\1\157\1\170\3\uffff\2\145\2\uffff\1\145\1\150\1\157\1\75\1\157\3\75\1\uffff\1\57\1\uffff\1\76\1\uffff\1\165\4\uffff\1\165\1\162\1\145\1\71\1\162\1\172\1\uffff\2\uffff\2\uffff\1\151\1\uffff\2\157\1\164\1\162\1\161\1\150\1\uffff\1\160\3\172\1\144\1\uffff\2\145\1\172\1\141\1\156\1\163\1\164\1\163\3\uffff\1\166\1\146\2\uffff\1\164\1\151\1\162\1\154\2\uffff\1\162\15\uffff\1\164\1\167\1\154\4\uffff\1\154\1\160\1\144\1\141\1\uffff\1\71\1\uffff\1\165\2\uffff\1\144\1\154\1\141\1\172\1\151\1\165\1\141\1\157\1\164\3\uffff\1\172\1\156\1\162\1\uffff\1\163\2\164\2\145\2\172\1\165\2\172\1\154\1\172\1\163\3\172\1\154\1\146\2\145\1\154\1\145\1\172\1\145\1\164\1\147\1\uffff\1\156\1\145\1\166\1\162\1\151\1\141\1\uffff\1\172\1\162\1\163\1\172\1\164\1\156\1\172\2\uffff\1\162\2\uffff\1\145\1\uffff\1\145\2\uffff\1\145\1\uffff\2\172\2\162\2\172\1\uffff\1\141\1\172\1\145\1\147\1\156\1\151\1\164\1\145\1\156\1\uffff\1\151\1\172\1\uffff\1\157\1\144\1\uffff\1\156\2\172\1\161\1\171\2\uffff\1\172\1\145\2\uffff\1\156\1\uffff\1\162\1\172\1\143\1\157\1\172\1\163\1\143\1\144\1\uffff\1\172\1\163\1\172\1\uffff\1\165\1\160\1\uffff\1\144\2\172\1\uffff\1\145\1\162\1\uffff\1\172\2\145\1\uffff\1\172\1\uffff\2\145\1\123\2\uffff\2\172\1\uffff\1\157\1\172\1\uffff\1\156\1\172\1\145\2\uffff\1\146\1\uffff\1\143\1\uffff\1\164\1\172\1\145\1\172\1\uffff\1\172\2\uffff";
    static final String DFA15_acceptS =
        "\7\uffff\1\7\2\uffff\1\12\3\uffff\1\16\1\17\1\20\2\uffff\1\25\1\26\10\uffff\1\53\1\uffff\1\55\1\uffff\1\57\1\uffff\1\64\1\65\1\66\1\67\6\uffff\1\103\2\uffff\1\110\1\111\1\uffff\1\103\6\uffff\1\7\5\uffff\1\12\10\uffff\1\16\1\17\1\20\2\uffff\1\25\1\26\4\uffff\1\77\1\37\1\uffff\1\44\1\47\1\45\1\50\1\46\1\53\1\106\1\107\1\54\1\55\1\60\1\56\1\57\3\uffff\1\64\1\65\1\66\1\67\4\uffff\1\104\1\uffff\1\100\1\uffff\1\105\1\110\11\uffff\1\32\1\33\1\11\3\uffff\1\41\32\uffff\1\75\6\uffff\1\42\7\uffff\1\21\1\22\1\uffff\1\24\1\31\1\uffff\1\36\1\uffff\1\43\1\61\1\uffff\1\63\6\uffff\1\1\11\uffff\1\13\2\uffff\1\23\2\uffff\1\34\5\uffff\1\102\1\70\2\uffff\1\74\1\101\1\uffff\1\3\10\uffff\1\14\3\uffff\1\35\2\uffff\1\71\3\uffff\1\5\2\uffff\1\10\3\uffff\1\52\1\uffff\1\30\3\uffff\1\2\1\4\2\uffff\1\40\2\uffff\1\15\3\uffff\1\72\1\6\1\uffff\1\27\1\uffff\1\76\4\uffff\1\51\1\uffff\1\73\1\62";
    static final String DFA15_specialS =
        "\1\0\55\uffff\1\1\1\2\u00e7\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\34\1\56\1\61\1\44\2\61\1\57\1\23\1\24\1\35\1\37\1\16\1\40\1\41\1\36\12\52\1\61\1\7\1\32\1\30\1\33\1\61\1\12\1\55\1\2\3\55\1\3\2\55\1\4\5\55\1\50\2\55\1\51\1\5\7\55\1\45\1\61\1\46\1\54\1\55\1\61\1\11\1\6\1\14\1\22\1\15\1\27\2\55\1\10\2\55\1\25\1\55\1\42\1\13\2\55\1\21\1\47\1\53\1\55\1\1\1\26\1\31\2\55\1\17\1\43\1\20\uff82\61",
            "\1\62",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\70\16\uffff\1\67",
            "\1\71",
            "",
            "\1\75\6\uffff\1\73\1\74",
            "\1\77\4\uffff\1\76",
            "",
            "\1\101\1\uffff\1\103\3\uffff\1\102",
            "\1\106\12\uffff\1\104\2\uffff\1\105",
            "\1\110\13\uffff\1\107",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\123\15\uffff\1\122",
            "\1\124",
            "\1\126",
            "\1\127",
            "\1\131",
            "\1\133",
            "",
            "\1\135\4\uffff\1\136",
            "",
            "\1\141",
            "",
            "\1\145\11\uffff\1\144\5\uffff\1\146",
            "",
            "",
            "",
            "",
            "\1\153\17\uffff\1\154",
            "\1\155",
            "\1\156",
            "\1\161\1\uffff\12\160",
            "\1\162",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\0\163",
            "\0\163",
            "",
            "",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\175\7\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "",
            "",
            "\1\u008a\15\uffff\1\u008c\1\uffff\1\u008b",
            "\1\u008d",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "",
            "\1\u0092",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\1\161\1\uffff\12\160",
            "",
            "\1\u009a",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u009e\25\63",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a4\2\uffff\1\u00a3",
            "\1\u00a5",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b5",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\22\63\1\u00b8\7\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00cb",
            "\1\u00cc",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ce",
            "\1\u00cf",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u00d1",
            "",
            "",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "",
            "",
            "\1\u00d4",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00d5\6\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d8",
            "\1\u00d9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00dc",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ee",
            "",
            "",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f2",
            "\1\u00f3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0100",
            "\1\u0101",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0103",
            "\1\u0104",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u010b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u010d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u010f",
            "",
            "",
            "\1\u0110",
            "",
            "\1\u0111",
            "",
            "\1\u0112",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0114",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | RULE_REAL | RULE_BOOLEAN | RULE_NULL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='v') ) {s = 1;}

                        else if ( (LA15_0=='B') ) {s = 2;}

                        else if ( (LA15_0=='F') ) {s = 3;}

                        else if ( (LA15_0=='I') ) {s = 4;}

                        else if ( (LA15_0=='S') ) {s = 5;}

                        else if ( (LA15_0=='b') ) {s = 6;}

                        else if ( (LA15_0==';') ) {s = 7;}

                        else if ( (LA15_0=='i') ) {s = 8;}

                        else if ( (LA15_0=='a') ) {s = 9;}

                        else if ( (LA15_0=='@') ) {s = 10;}

                        else if ( (LA15_0=='o') ) {s = 11;}

                        else if ( (LA15_0=='c') ) {s = 12;}

                        else if ( (LA15_0=='e') ) {s = 13;}

                        else if ( (LA15_0==',') ) {s = 14;}

                        else if ( (LA15_0=='{') ) {s = 15;}

                        else if ( (LA15_0=='}') ) {s = 16;}

                        else if ( (LA15_0=='r') ) {s = 17;}

                        else if ( (LA15_0=='d') ) {s = 18;}

                        else if ( (LA15_0=='(') ) {s = 19;}

                        else if ( (LA15_0==')') ) {s = 20;}

                        else if ( (LA15_0=='l') ) {s = 21;}

                        else if ( (LA15_0=='w') ) {s = 22;}

                        else if ( (LA15_0=='f') ) {s = 23;}

                        else if ( (LA15_0=='=') ) {s = 24;}

                        else if ( (LA15_0=='x') ) {s = 25;}

                        else if ( (LA15_0=='<') ) {s = 26;}

                        else if ( (LA15_0=='>') ) {s = 27;}

                        else if ( (LA15_0=='!') ) {s = 28;}

                        else if ( (LA15_0=='*') ) {s = 29;}

                        else if ( (LA15_0=='/') ) {s = 30;}

                        else if ( (LA15_0=='+') ) {s = 31;}

                        else if ( (LA15_0=='-') ) {s = 32;}

                        else if ( (LA15_0=='.') ) {s = 33;}

                        else if ( (LA15_0=='n') ) {s = 34;}

                        else if ( (LA15_0=='|') ) {s = 35;}

                        else if ( (LA15_0=='$') ) {s = 36;}

                        else if ( (LA15_0=='[') ) {s = 37;}

                        else if ( (LA15_0==']') ) {s = 38;}

                        else if ( (LA15_0=='s') ) {s = 39;}

                        else if ( (LA15_0=='O') ) {s = 40;}

                        else if ( (LA15_0=='R') ) {s = 41;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 42;}

                        else if ( (LA15_0=='t') ) {s = 43;}

                        else if ( (LA15_0=='^') ) {s = 44;}

                        else if ( (LA15_0=='A'||(LA15_0>='C' && LA15_0<='E')||(LA15_0>='G' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='N')||(LA15_0>='P' && LA15_0<='Q')||(LA15_0>='T' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||LA15_0=='m'||(LA15_0>='p' && LA15_0<='q')||LA15_0=='u'||(LA15_0>='y' && LA15_0<='z')) ) {s = 45;}

                        else if ( (LA15_0=='\"') ) {s = 46;}

                        else if ( (LA15_0=='\'') ) {s = 47;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 48;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='#'||(LA15_0>='%' && LA15_0<='&')||LA15_0==':'||LA15_0=='?'||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_46 = input.LA(1);

                        s = -1;
                        if ( ((LA15_46>='\u0000' && LA15_46<='\uFFFF')) ) {s = 115;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_47 = input.LA(1);

                        s = -1;
                        if ( ((LA15_47>='\u0000' && LA15_47<='\uFFFF')) ) {s = 115;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}