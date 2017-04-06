package ale.xtext.ide.contentassist.antlr.internal;

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
import ale.xtext.services.AleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NULL", "RULE_STRING", "RULE_INT", "RULE_REAL", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'void'", "'Boolean'", "'Byte'", "'Char'", "'Double'", "'Float'", "'Int'", "'Long'", "'Short'", "'String'", "'behavior'", "';'", "'import'", "'as'", "'@'", "'open'", "'class'", "'extends'", "','", "'{'", "'}'", "'def'", "'('", "')'", "'override'", "'return'", "'let'", "'in'", "'if'", "'else'", "'while'", "'for'", "'='", "'implies'", "'or'", "'and'", "'xor'", "'<='", "'>='", "'!='", "'<'", "'>'", "'*'", "'/'", "'+'", "'-'", "'not'", "'new'", "'.'", "'->'", "'|'", "'self'", "'super'", "'['", "']'", "'Sequence'", "'OrderedSet'", "'=='"
    };
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
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


        public InternalAleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAle.g"; }


    	private AleGrammarAccess grammarAccess;

    	public void setGrammarAccess(AleGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRoot"
    // InternalAle.g:54:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalAle.g:55:1: ( ruleRoot EOF )
            // InternalAle.g:56:1: ruleRoot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootRule()); 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalAle.g:63:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:67:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalAle.g:68:2: ( ( rule__Root__Group__0 ) )
            {
            // InternalAle.g:68:2: ( ( rule__Root__Group__0 ) )
            // InternalAle.g:69:3: ( rule__Root__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getGroup()); 
            }
            // InternalAle.g:70:3: ( rule__Root__Group__0 )
            // InternalAle.g:70:4: rule__Root__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getGroup()); 
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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleImport"
    // InternalAle.g:79:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalAle.g:80:1: ( ruleImport EOF )
            // InternalAle.g:81:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalAle.g:88:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:92:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalAle.g:93:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalAle.g:93:2: ( ( rule__Import__Group__0 ) )
            // InternalAle.g:94:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalAle.g:95:3: ( rule__Import__Group__0 )
            // InternalAle.g:95:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleClass"
    // InternalAle.g:104:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalAle.g:105:1: ( ruleClass EOF )
            // InternalAle.g:106:1: ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRule()); 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalAle.g:113:1: ruleClass : ( ( rule__Class__Alternatives ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:117:2: ( ( ( rule__Class__Alternatives ) ) )
            // InternalAle.g:118:2: ( ( rule__Class__Alternatives ) )
            {
            // InternalAle.g:118:2: ( ( rule__Class__Alternatives ) )
            // InternalAle.g:119:3: ( rule__Class__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAlternatives()); 
            }
            // InternalAle.g:120:3: ( rule__Class__Alternatives )
            // InternalAle.g:120:4: rule__Class__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Class__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAlternatives()); 
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleTag"
    // InternalAle.g:129:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalAle.g:130:1: ( ruleTag EOF )
            // InternalAle.g:131:1: ruleTag EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagRule()); 
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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalAle.g:138:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:142:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalAle.g:143:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalAle.g:143:2: ( ( rule__Tag__Group__0 ) )
            // InternalAle.g:144:3: ( rule__Tag__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getGroup()); 
            }
            // InternalAle.g:145:3: ( rule__Tag__Group__0 )
            // InternalAle.g:145:4: rule__Tag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getGroup()); 
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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleOpenClass"
    // InternalAle.g:154:1: entryRuleOpenClass : ruleOpenClass EOF ;
    public final void entryRuleOpenClass() throws RecognitionException {
        try {
            // InternalAle.g:155:1: ( ruleOpenClass EOF )
            // InternalAle.g:156:1: ruleOpenClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOpenClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassRule()); 
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
    // $ANTLR end "entryRuleOpenClass"


    // $ANTLR start "ruleOpenClass"
    // InternalAle.g:163:1: ruleOpenClass : ( ( rule__OpenClass__Group__0 ) ) ;
    public final void ruleOpenClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:167:2: ( ( ( rule__OpenClass__Group__0 ) ) )
            // InternalAle.g:168:2: ( ( rule__OpenClass__Group__0 ) )
            {
            // InternalAle.g:168:2: ( ( rule__OpenClass__Group__0 ) )
            // InternalAle.g:169:3: ( rule__OpenClass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getGroup()); 
            }
            // InternalAle.g:170:3: ( rule__OpenClass__Group__0 )
            // InternalAle.g:170:4: rule__OpenClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getGroup()); 
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
    // $ANTLR end "ruleOpenClass"


    // $ANTLR start "entryRuleNewClass"
    // InternalAle.g:179:1: entryRuleNewClass : ruleNewClass EOF ;
    public final void entryRuleNewClass() throws RecognitionException {
        try {
            // InternalAle.g:180:1: ( ruleNewClass EOF )
            // InternalAle.g:181:1: ruleNewClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNewClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassRule()); 
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
    // $ANTLR end "entryRuleNewClass"


    // $ANTLR start "ruleNewClass"
    // InternalAle.g:188:1: ruleNewClass : ( ( rule__NewClass__Group__0 ) ) ;
    public final void ruleNewClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:192:2: ( ( ( rule__NewClass__Group__0 ) ) )
            // InternalAle.g:193:2: ( ( rule__NewClass__Group__0 ) )
            {
            // InternalAle.g:193:2: ( ( rule__NewClass__Group__0 ) )
            // InternalAle.g:194:3: ( rule__NewClass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getGroup()); 
            }
            // InternalAle.g:195:3: ( rule__NewClass__Group__0 )
            // InternalAle.g:195:4: rule__NewClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NewClass__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getGroup()); 
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
    // $ANTLR end "ruleNewClass"


    // $ANTLR start "entryRuleField"
    // InternalAle.g:204:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalAle.g:205:1: ( ruleField EOF )
            // InternalAle.g:206:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalAle.g:213:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:217:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalAle.g:218:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalAle.g:218:2: ( ( rule__Field__Group__0 ) )
            // InternalAle.g:219:3: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // InternalAle.g:220:3: ( rule__Field__Group__0 )
            // InternalAle.g:220:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup()); 
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // InternalAle.g:229:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalAle.g:230:1: ( ruleMethod EOF )
            // InternalAle.g:231:1: ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodRule()); 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalAle.g:238:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:242:2: ( ( ( rule__Method__Alternatives ) ) )
            // InternalAle.g:243:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalAle.g:243:2: ( ( rule__Method__Alternatives ) )
            // InternalAle.g:244:3: ( rule__Method__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAlternatives()); 
            }
            // InternalAle.g:245:3: ( rule__Method__Alternatives )
            // InternalAle.g:245:4: rule__Method__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Method__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleDefMethod"
    // InternalAle.g:254:1: entryRuleDefMethod : ruleDefMethod EOF ;
    public final void entryRuleDefMethod() throws RecognitionException {
        try {
            // InternalAle.g:255:1: ( ruleDefMethod EOF )
            // InternalAle.g:256:1: ruleDefMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDefMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodRule()); 
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
    // $ANTLR end "entryRuleDefMethod"


    // $ANTLR start "ruleDefMethod"
    // InternalAle.g:263:1: ruleDefMethod : ( ( rule__DefMethod__Group__0 ) ) ;
    public final void ruleDefMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:267:2: ( ( ( rule__DefMethod__Group__0 ) ) )
            // InternalAle.g:268:2: ( ( rule__DefMethod__Group__0 ) )
            {
            // InternalAle.g:268:2: ( ( rule__DefMethod__Group__0 ) )
            // InternalAle.g:269:3: ( rule__DefMethod__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getGroup()); 
            }
            // InternalAle.g:270:3: ( rule__DefMethod__Group__0 )
            // InternalAle.g:270:4: rule__DefMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getGroup()); 
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
    // $ANTLR end "ruleDefMethod"


    // $ANTLR start "entryRuleOverrideMethod"
    // InternalAle.g:279:1: entryRuleOverrideMethod : ruleOverrideMethod EOF ;
    public final void entryRuleOverrideMethod() throws RecognitionException {
        try {
            // InternalAle.g:280:1: ( ruleOverrideMethod EOF )
            // InternalAle.g:281:1: ruleOverrideMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOverrideMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodRule()); 
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
    // $ANTLR end "entryRuleOverrideMethod"


    // $ANTLR start "ruleOverrideMethod"
    // InternalAle.g:288:1: ruleOverrideMethod : ( ( rule__OverrideMethod__Group__0 ) ) ;
    public final void ruleOverrideMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:292:2: ( ( ( rule__OverrideMethod__Group__0 ) ) )
            // InternalAle.g:293:2: ( ( rule__OverrideMethod__Group__0 ) )
            {
            // InternalAle.g:293:2: ( ( rule__OverrideMethod__Group__0 ) )
            // InternalAle.g:294:3: ( rule__OverrideMethod__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getGroup()); 
            }
            // InternalAle.g:295:3: ( rule__OverrideMethod__Group__0 )
            // InternalAle.g:295:4: rule__OverrideMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getGroup()); 
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
    // $ANTLR end "ruleOverrideMethod"


    // $ANTLR start "entryRuleStatement"
    // InternalAle.g:304:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalAle.g:305:1: ( ruleStatement EOF )
            // InternalAle.g:306:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalAle.g:313:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:317:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalAle.g:318:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalAle.g:318:2: ( ( rule__Statement__Alternatives ) )
            // InternalAle.g:319:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalAle.g:320:3: ( rule__Statement__Alternatives )
            // InternalAle.g:320:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalAle.g:329:1: entryRuleReturnStatement : ruleReturnStatement EOF ;
    public final void entryRuleReturnStatement() throws RecognitionException {
        try {
            // InternalAle.g:330:1: ( ruleReturnStatement EOF )
            // InternalAle.g:331:1: ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReturnStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementRule()); 
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
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalAle.g:338:1: ruleReturnStatement : ( ( rule__ReturnStatement__Group__0 ) ) ;
    public final void ruleReturnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:342:2: ( ( ( rule__ReturnStatement__Group__0 ) ) )
            // InternalAle.g:343:2: ( ( rule__ReturnStatement__Group__0 ) )
            {
            // InternalAle.g:343:2: ( ( rule__ReturnStatement__Group__0 ) )
            // InternalAle.g:344:3: ( rule__ReturnStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getGroup()); 
            }
            // InternalAle.g:345:3: ( rule__ReturnStatement__Group__0 )
            // InternalAle.g:345:4: rule__ReturnStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getGroup()); 
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
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleLetStatement"
    // InternalAle.g:354:1: entryRuleLetStatement : ruleLetStatement EOF ;
    public final void entryRuleLetStatement() throws RecognitionException {
        try {
            // InternalAle.g:355:1: ( ruleLetStatement EOF )
            // InternalAle.g:356:1: ruleLetStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLetStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementRule()); 
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
    // $ANTLR end "entryRuleLetStatement"


    // $ANTLR start "ruleLetStatement"
    // InternalAle.g:363:1: ruleLetStatement : ( ( rule__LetStatement__Group__0 ) ) ;
    public final void ruleLetStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:367:2: ( ( ( rule__LetStatement__Group__0 ) ) )
            // InternalAle.g:368:2: ( ( rule__LetStatement__Group__0 ) )
            {
            // InternalAle.g:368:2: ( ( rule__LetStatement__Group__0 ) )
            // InternalAle.g:369:3: ( rule__LetStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getGroup()); 
            }
            // InternalAle.g:370:3: ( rule__LetStatement__Group__0 )
            // InternalAle.g:370:4: rule__LetStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getGroup()); 
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
    // $ANTLR end "ruleLetStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalAle.g:379:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalAle.g:380:1: ( ruleIfStatement EOF )
            // InternalAle.g:381:1: ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementRule()); 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalAle.g:388:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:392:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalAle.g:393:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalAle.g:393:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalAle.g:394:3: ( rule__IfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup()); 
            }
            // InternalAle.g:395:3: ( rule__IfStatement__Group__0 )
            // InternalAle.g:395:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup()); 
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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalAle.g:404:1: entryRuleWhileStatement : ruleWhileStatement EOF ;
    public final void entryRuleWhileStatement() throws RecognitionException {
        try {
            // InternalAle.g:405:1: ( ruleWhileStatement EOF )
            // InternalAle.g:406:1: ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWhileStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementRule()); 
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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalAle.g:413:1: ruleWhileStatement : ( ( rule__WhileStatement__Group__0 ) ) ;
    public final void ruleWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:417:2: ( ( ( rule__WhileStatement__Group__0 ) ) )
            // InternalAle.g:418:2: ( ( rule__WhileStatement__Group__0 ) )
            {
            // InternalAle.g:418:2: ( ( rule__WhileStatement__Group__0 ) )
            // InternalAle.g:419:3: ( rule__WhileStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getGroup()); 
            }
            // InternalAle.g:420:3: ( rule__WhileStatement__Group__0 )
            // InternalAle.g:420:4: rule__WhileStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getGroup()); 
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
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleForLoop"
    // InternalAle.g:429:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalAle.g:430:1: ( ruleForLoop EOF )
            // InternalAle.g:431:1: ruleForLoop EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForLoop();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopRule()); 
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
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalAle.g:438:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:442:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalAle.g:443:2: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalAle.g:443:2: ( ( rule__ForLoop__Group__0 ) )
            // InternalAle.g:444:3: ( rule__ForLoop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getGroup()); 
            }
            // InternalAle.g:445:3: ( rule__ForLoop__Group__0 )
            // InternalAle.g:445:4: rule__ForLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getGroup()); 
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
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleBlock"
    // InternalAle.g:454:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalAle.g:455:1: ( ruleBlock EOF )
            // InternalAle.g:456:1: ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalAle.g:463:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:467:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalAle.g:468:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalAle.g:468:2: ( ( rule__Block__Group__0 ) )
            // InternalAle.g:469:3: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // InternalAle.g:470:3: ( rule__Block__Group__0 )
            // InternalAle.g:470:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup()); 
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleVarAssign"
    // InternalAle.g:479:1: entryRuleVarAssign : ruleVarAssign EOF ;
    public final void entryRuleVarAssign() throws RecognitionException {
        try {
            // InternalAle.g:480:1: ( ruleVarAssign EOF )
            // InternalAle.g:481:1: ruleVarAssign EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVarAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignRule()); 
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
    // $ANTLR end "entryRuleVarAssign"


    // $ANTLR start "ruleVarAssign"
    // InternalAle.g:488:1: ruleVarAssign : ( ( rule__VarAssign__Group__0 ) ) ;
    public final void ruleVarAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:492:2: ( ( ( rule__VarAssign__Group__0 ) ) )
            // InternalAle.g:493:2: ( ( rule__VarAssign__Group__0 ) )
            {
            // InternalAle.g:493:2: ( ( rule__VarAssign__Group__0 ) )
            // InternalAle.g:494:3: ( rule__VarAssign__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getGroup()); 
            }
            // InternalAle.g:495:3: ( rule__VarAssign__Group__0 )
            // InternalAle.g:495:4: rule__VarAssign__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getGroup()); 
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
    // $ANTLR end "ruleVarAssign"


    // $ANTLR start "entryRuleExpression"
    // InternalAle.g:504:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAle.g:505:1: ( ruleExpression EOF )
            // InternalAle.g:506:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAle.g:513:1: ruleExpression : ( ruleImpliesOperation ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:517:2: ( ( ruleImpliesOperation ) )
            // InternalAle.g:518:2: ( ruleImpliesOperation )
            {
            // InternalAle.g:518:2: ( ruleImpliesOperation )
            // InternalAle.g:519:3: ruleImpliesOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getImpliesOperationParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleImpliesOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getImpliesOperationParserRuleCall()); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleImpliesOperation"
    // InternalAle.g:529:1: entryRuleImpliesOperation : ruleImpliesOperation EOF ;
    public final void entryRuleImpliesOperation() throws RecognitionException {
        try {
            // InternalAle.g:530:1: ( ruleImpliesOperation EOF )
            // InternalAle.g:531:1: ruleImpliesOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImpliesOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationRule()); 
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
    // $ANTLR end "entryRuleImpliesOperation"


    // $ANTLR start "ruleImpliesOperation"
    // InternalAle.g:538:1: ruleImpliesOperation : ( ( rule__ImpliesOperation__Group__0 ) ) ;
    public final void ruleImpliesOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:542:2: ( ( ( rule__ImpliesOperation__Group__0 ) ) )
            // InternalAle.g:543:2: ( ( rule__ImpliesOperation__Group__0 ) )
            {
            // InternalAle.g:543:2: ( ( rule__ImpliesOperation__Group__0 ) )
            // InternalAle.g:544:3: ( rule__ImpliesOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getGroup()); 
            }
            // InternalAle.g:545:3: ( rule__ImpliesOperation__Group__0 )
            // InternalAle.g:545:4: rule__ImpliesOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleImpliesOperation"


    // $ANTLR start "entryRuleBooleanOperation"
    // InternalAle.g:554:1: entryRuleBooleanOperation : ruleBooleanOperation EOF ;
    public final void entryRuleBooleanOperation() throws RecognitionException {
        try {
            // InternalAle.g:555:1: ( ruleBooleanOperation EOF )
            // InternalAle.g:556:1: ruleBooleanOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationRule()); 
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
    // $ANTLR end "entryRuleBooleanOperation"


    // $ANTLR start "ruleBooleanOperation"
    // InternalAle.g:563:1: ruleBooleanOperation : ( ( rule__BooleanOperation__Group__0 ) ) ;
    public final void ruleBooleanOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:567:2: ( ( ( rule__BooleanOperation__Group__0 ) ) )
            // InternalAle.g:568:2: ( ( rule__BooleanOperation__Group__0 ) )
            {
            // InternalAle.g:568:2: ( ( rule__BooleanOperation__Group__0 ) )
            // InternalAle.g:569:3: ( rule__BooleanOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getGroup()); 
            }
            // InternalAle.g:570:3: ( rule__BooleanOperation__Group__0 )
            // InternalAle.g:570:4: rule__BooleanOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleBooleanOperation"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalAle.g:579:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // InternalAle.g:580:1: ( ruleCompareOperation EOF )
            // InternalAle.g:581:1: ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
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
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalAle.g:588:1: ruleCompareOperation : ( ( rule__CompareOperation__Group__0 ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:592:2: ( ( ( rule__CompareOperation__Group__0 ) ) )
            // InternalAle.g:593:2: ( ( rule__CompareOperation__Group__0 ) )
            {
            // InternalAle.g:593:2: ( ( rule__CompareOperation__Group__0 ) )
            // InternalAle.g:594:3: ( rule__CompareOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup()); 
            }
            // InternalAle.g:595:3: ( rule__CompareOperation__Group__0 )
            // InternalAle.g:595:4: rule__CompareOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleEqualityOperation"
    // InternalAle.g:604:1: entryRuleEqualityOperation : ruleEqualityOperation EOF ;
    public final void entryRuleEqualityOperation() throws RecognitionException {
        try {
            // InternalAle.g:605:1: ( ruleEqualityOperation EOF )
            // InternalAle.g:606:1: ruleEqualityOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEqualityOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationRule()); 
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
    // $ANTLR end "entryRuleEqualityOperation"


    // $ANTLR start "ruleEqualityOperation"
    // InternalAle.g:613:1: ruleEqualityOperation : ( ( rule__EqualityOperation__Group__0 ) ) ;
    public final void ruleEqualityOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:617:2: ( ( ( rule__EqualityOperation__Group__0 ) ) )
            // InternalAle.g:618:2: ( ( rule__EqualityOperation__Group__0 ) )
            {
            // InternalAle.g:618:2: ( ( rule__EqualityOperation__Group__0 ) )
            // InternalAle.g:619:3: ( rule__EqualityOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getGroup()); 
            }
            // InternalAle.g:620:3: ( rule__EqualityOperation__Group__0 )
            // InternalAle.g:620:4: rule__EqualityOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleEqualityOperation"


    // $ANTLR start "entryRuleMultOperation"
    // InternalAle.g:629:1: entryRuleMultOperation : ruleMultOperation EOF ;
    public final void entryRuleMultOperation() throws RecognitionException {
        try {
            // InternalAle.g:630:1: ( ruleMultOperation EOF )
            // InternalAle.g:631:1: ruleMultOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationRule()); 
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
    // $ANTLR end "entryRuleMultOperation"


    // $ANTLR start "ruleMultOperation"
    // InternalAle.g:638:1: ruleMultOperation : ( ( rule__MultOperation__Group__0 ) ) ;
    public final void ruleMultOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:642:2: ( ( ( rule__MultOperation__Group__0 ) ) )
            // InternalAle.g:643:2: ( ( rule__MultOperation__Group__0 ) )
            {
            // InternalAle.g:643:2: ( ( rule__MultOperation__Group__0 ) )
            // InternalAle.g:644:3: ( rule__MultOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup()); 
            }
            // InternalAle.g:645:3: ( rule__MultOperation__Group__0 )
            // InternalAle.g:645:4: rule__MultOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleMultOperation"


    // $ANTLR start "entryRuleAddOperation"
    // InternalAle.g:654:1: entryRuleAddOperation : ruleAddOperation EOF ;
    public final void entryRuleAddOperation() throws RecognitionException {
        try {
            // InternalAle.g:655:1: ( ruleAddOperation EOF )
            // InternalAle.g:656:1: ruleAddOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationRule()); 
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
    // $ANTLR end "entryRuleAddOperation"


    // $ANTLR start "ruleAddOperation"
    // InternalAle.g:663:1: ruleAddOperation : ( ( rule__AddOperation__Group__0 ) ) ;
    public final void ruleAddOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:667:2: ( ( ( rule__AddOperation__Group__0 ) ) )
            // InternalAle.g:668:2: ( ( rule__AddOperation__Group__0 ) )
            {
            // InternalAle.g:668:2: ( ( rule__AddOperation__Group__0 ) )
            // InternalAle.g:669:3: ( rule__AddOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getGroup()); 
            }
            // InternalAle.g:670:3: ( rule__AddOperation__Group__0 )
            // InternalAle.g:670:4: rule__AddOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getGroup()); 
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
    // $ANTLR end "ruleAddOperation"


    // $ANTLR start "entryRuleInfixOperation"
    // InternalAle.g:679:1: entryRuleInfixOperation : ruleInfixOperation EOF ;
    public final void entryRuleInfixOperation() throws RecognitionException {
        try {
            // InternalAle.g:680:1: ( ruleInfixOperation EOF )
            // InternalAle.g:681:1: ruleInfixOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInfixOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationRule()); 
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
    // $ANTLR end "entryRuleInfixOperation"


    // $ANTLR start "ruleInfixOperation"
    // InternalAle.g:688:1: ruleInfixOperation : ( ( rule__InfixOperation__Alternatives ) ) ;
    public final void ruleInfixOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:692:2: ( ( ( rule__InfixOperation__Alternatives ) ) )
            // InternalAle.g:693:2: ( ( rule__InfixOperation__Alternatives ) )
            {
            // InternalAle.g:693:2: ( ( rule__InfixOperation__Alternatives ) )
            // InternalAle.g:694:3: ( rule__InfixOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getAlternatives()); 
            }
            // InternalAle.g:695:3: ( rule__InfixOperation__Alternatives )
            // InternalAle.g:695:4: rule__InfixOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleInfixOperation"


    // $ANTLR start "entryRuleParamCall"
    // InternalAle.g:704:1: entryRuleParamCall : ruleParamCall EOF ;
    public final void entryRuleParamCall() throws RecognitionException {
        try {
            // InternalAle.g:705:1: ( ruleParamCall EOF )
            // InternalAle.g:706:1: ruleParamCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParamCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallRule()); 
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
    // $ANTLR end "entryRuleParamCall"


    // $ANTLR start "ruleParamCall"
    // InternalAle.g:713:1: ruleParamCall : ( ( rule__ParamCall__Group__0 ) ) ;
    public final void ruleParamCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:717:2: ( ( ( rule__ParamCall__Group__0 ) ) )
            // InternalAle.g:718:2: ( ( rule__ParamCall__Group__0 ) )
            {
            // InternalAle.g:718:2: ( ( rule__ParamCall__Group__0 ) )
            // InternalAle.g:719:3: ( rule__ParamCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getGroup()); 
            }
            // InternalAle.g:720:3: ( rule__ParamCall__Group__0 )
            // InternalAle.g:720:4: rule__ParamCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getGroup()); 
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
    // $ANTLR end "ruleParamCall"


    // $ANTLR start "entryRuleAtomicLiteral"
    // InternalAle.g:729:1: entryRuleAtomicLiteral : ruleAtomicLiteral EOF ;
    public final void entryRuleAtomicLiteral() throws RecognitionException {
        try {
            // InternalAle.g:730:1: ( ruleAtomicLiteral EOF )
            // InternalAle.g:731:1: ruleAtomicLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAtomicLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralRule()); 
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
    // $ANTLR end "entryRuleAtomicLiteral"


    // $ANTLR start "ruleAtomicLiteral"
    // InternalAle.g:738:1: ruleAtomicLiteral : ( ( rule__AtomicLiteral__Alternatives ) ) ;
    public final void ruleAtomicLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:742:2: ( ( ( rule__AtomicLiteral__Alternatives ) ) )
            // InternalAle.g:743:2: ( ( rule__AtomicLiteral__Alternatives ) )
            {
            // InternalAle.g:743:2: ( ( rule__AtomicLiteral__Alternatives ) )
            // InternalAle.g:744:3: ( rule__AtomicLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getAlternatives()); 
            }
            // InternalAle.g:745:3: ( rule__AtomicLiteral__Alternatives )
            // InternalAle.g:745:4: rule__AtomicLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAtomicLiteral"


    // $ANTLR start "entryRuleParam"
    // InternalAle.g:754:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalAle.g:755:1: ( ruleParam EOF )
            // InternalAle.g:756:1: ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamRule()); 
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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalAle.g:763:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:767:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalAle.g:768:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalAle.g:768:2: ( ( rule__Param__Group__0 ) )
            // InternalAle.g:769:3: ( rule__Param__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getGroup()); 
            }
            // InternalAle.g:770:3: ( rule__Param__Group__0 )
            // InternalAle.g:770:4: rule__Param__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getGroup()); 
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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleType"
    // InternalAle.g:779:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalAle.g:780:1: ( ruleType EOF )
            // InternalAle.g:781:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalAle.g:788:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:792:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalAle.g:793:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalAle.g:793:2: ( ( rule__Type__Alternatives ) )
            // InternalAle.g:794:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalAle.g:795:3: ( rule__Type__Alternatives )
            // InternalAle.g:795:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLiteralType"
    // InternalAle.g:804:1: entryRuleLiteralType : ruleLiteralType EOF ;
    public final void entryRuleLiteralType() throws RecognitionException {
        try {
            // InternalAle.g:805:1: ( ruleLiteralType EOF )
            // InternalAle.g:806:1: ruleLiteralType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteralType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralTypeRule()); 
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
    // $ANTLR end "entryRuleLiteralType"


    // $ANTLR start "ruleLiteralType"
    // InternalAle.g:813:1: ruleLiteralType : ( ( rule__LiteralType__LitAssignment ) ) ;
    public final void ruleLiteralType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:817:2: ( ( ( rule__LiteralType__LitAssignment ) ) )
            // InternalAle.g:818:2: ( ( rule__LiteralType__LitAssignment ) )
            {
            // InternalAle.g:818:2: ( ( rule__LiteralType__LitAssignment ) )
            // InternalAle.g:819:3: ( rule__LiteralType__LitAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralTypeAccess().getLitAssignment()); 
            }
            // InternalAle.g:820:3: ( rule__LiteralType__LitAssignment )
            // InternalAle.g:820:4: rule__LiteralType__LitAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralType__LitAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralTypeAccess().getLitAssignment()); 
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
    // $ANTLR end "ruleLiteralType"


    // $ANTLR start "entryRuleQualified"
    // InternalAle.g:829:1: entryRuleQualified : ruleQualified EOF ;
    public final void entryRuleQualified() throws RecognitionException {
        try {
            // InternalAle.g:830:1: ( ruleQualified EOF )
            // InternalAle.g:831:1: ruleQualified EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedRule()); 
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
    // $ANTLR end "entryRuleQualified"


    // $ANTLR start "ruleQualified"
    // InternalAle.g:838:1: ruleQualified : ( ( rule__Qualified__Group__0 ) ) ;
    public final void ruleQualified() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:842:2: ( ( ( rule__Qualified__Group__0 ) ) )
            // InternalAle.g:843:2: ( ( rule__Qualified__Group__0 ) )
            {
            // InternalAle.g:843:2: ( ( rule__Qualified__Group__0 ) )
            // InternalAle.g:844:3: ( rule__Qualified__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getGroup()); 
            }
            // InternalAle.g:845:3: ( rule__Qualified__Group__0 )
            // InternalAle.g:845:4: rule__Qualified__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qualified__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getGroup()); 
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
    // $ANTLR end "ruleQualified"


    // $ANTLR start "rule__Class__Alternatives"
    // InternalAle.g:853:1: rule__Class__Alternatives : ( ( ruleOpenClass ) | ( ruleNewClass ) );
    public final void rule__Class__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:857:1: ( ( ruleOpenClass ) | ( ruleNewClass ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
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
                    // InternalAle.g:858:2: ( ruleOpenClass )
                    {
                    // InternalAle.g:858:2: ( ruleOpenClass )
                    // InternalAle.g:859:3: ruleOpenClass
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassAccess().getOpenClassParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOpenClass();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassAccess().getOpenClassParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:864:2: ( ruleNewClass )
                    {
                    // InternalAle.g:864:2: ( ruleNewClass )
                    // InternalAle.g:865:3: ruleNewClass
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassAccess().getNewClassParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNewClass();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassAccess().getNewClassParserRuleCall_1()); 
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
    // $ANTLR end "rule__Class__Alternatives"


    // $ANTLR start "rule__Method__Alternatives"
    // InternalAle.g:874:1: rule__Method__Alternatives : ( ( ruleDefMethod ) | ( ruleOverrideMethod ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:878:1: ( ( ruleDefMethod ) | ( ruleOverrideMethod ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAle.g:879:2: ( ruleDefMethod )
                    {
                    // InternalAle.g:879:2: ( ruleDefMethod )
                    // InternalAle.g:880:3: ruleDefMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getDefMethodParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDefMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getDefMethodParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:885:2: ( ruleOverrideMethod )
                    {
                    // InternalAle.g:885:2: ( ruleOverrideMethod )
                    // InternalAle.g:886:3: ruleOverrideMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getOverrideMethodParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOverrideMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getOverrideMethodParserRuleCall_1()); 
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
    // $ANTLR end "rule__Method__Alternatives"


    // $ANTLR start "rule__DefMethod__Alternatives_2"
    // InternalAle.g:895:1: rule__DefMethod__Alternatives_2 : ( ( ( rule__DefMethod__TypeAssignment_2_0 ) ) | ( 'void' ) );
    public final void rule__DefMethod__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:899:1: ( ( ( rule__DefMethod__TypeAssignment_2_0 ) ) | ( 'void' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=15 && LA3_0<=23)||(LA3_0>=69 && LA3_0<=70)) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
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
                    // InternalAle.g:900:2: ( ( rule__DefMethod__TypeAssignment_2_0 ) )
                    {
                    // InternalAle.g:900:2: ( ( rule__DefMethod__TypeAssignment_2_0 ) )
                    // InternalAle.g:901:3: ( rule__DefMethod__TypeAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefMethodAccess().getTypeAssignment_2_0()); 
                    }
                    // InternalAle.g:902:3: ( rule__DefMethod__TypeAssignment_2_0 )
                    // InternalAle.g:902:4: rule__DefMethod__TypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefMethod__TypeAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefMethodAccess().getTypeAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:906:2: ( 'void' )
                    {
                    // InternalAle.g:906:2: ( 'void' )
                    // InternalAle.g:907:3: 'void'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefMethodAccess().getVoidKeyword_2_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefMethodAccess().getVoidKeyword_2_1()); 
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
    // $ANTLR end "rule__DefMethod__Alternatives_2"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalAle.g:916:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ruleForLoop ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:920:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ruleForLoop ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalAle.g:921:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalAle.g:921:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalAle.g:922:3: ( rule__Statement__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_0()); 
                    }
                    // InternalAle.g:923:3: ( rule__Statement__Group_0__0 )
                    // InternalAle.g:923:4: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:927:2: ( ruleForLoop )
                    {
                    // InternalAle.g:927:2: ( ruleForLoop )
                    // InternalAle.g:928:3: ruleForLoop
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getForLoopParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForLoop();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getForLoopParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:933:2: ( ruleIfStatement )
                    {
                    // InternalAle.g:933:2: ( ruleIfStatement )
                    // InternalAle.g:934:3: ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:939:2: ( ruleWhileStatement )
                    {
                    // InternalAle.g:939:2: ( ruleWhileStatement )
                    // InternalAle.g:940:3: ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:945:2: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // InternalAle.g:945:2: ( ( rule__Statement__Group_4__0 ) )
                    // InternalAle.g:946:3: ( rule__Statement__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_4()); 
                    }
                    // InternalAle.g:947:3: ( rule__Statement__Group_4__0 )
                    // InternalAle.g:947:4: rule__Statement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:951:2: ( ( rule__Statement__Group_5__0 ) )
                    {
                    // InternalAle.g:951:2: ( ( rule__Statement__Group_5__0 ) )
                    // InternalAle.g:952:3: ( rule__Statement__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_5()); 
                    }
                    // InternalAle.g:953:3: ( rule__Statement__Group_5__0 )
                    // InternalAle.g:953:4: rule__Statement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:957:2: ( ( rule__Statement__Group_6__0 ) )
                    {
                    // InternalAle.g:957:2: ( ( rule__Statement__Group_6__0 ) )
                    // InternalAle.g:958:3: ( rule__Statement__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_6()); 
                    }
                    // InternalAle.g:959:3: ( rule__Statement__Group_6__0 )
                    // InternalAle.g:959:4: rule__Statement__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_6()); 
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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__LetStatement__BlockAlternatives_5_0"
    // InternalAle.g:967:1: rule__LetStatement__BlockAlternatives_5_0 : ( ( ruleExpression ) | ( ruleLetStatement ) );
    public final void rule__LetStatement__BlockAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:971:1: ( ( ruleExpression ) | ( ruleLetStatement ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_BOOLEAN)||LA5_0==36||(LA5_0>=59 && LA5_0<=61)||(LA5_0>=65 && LA5_0<=67)||(LA5_0>=69 && LA5_0<=70)) ) {
                alt5=1;
            }
            else if ( (LA5_0==40) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAle.g:972:2: ( ruleExpression )
                    {
                    // InternalAle.g:972:2: ( ruleExpression )
                    // InternalAle.g:973:3: ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLetStatementAccess().getBlockExpressionParserRuleCall_5_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLetStatementAccess().getBlockExpressionParserRuleCall_5_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:978:2: ( ruleLetStatement )
                    {
                    // InternalAle.g:978:2: ( ruleLetStatement )
                    // InternalAle.g:979:3: ruleLetStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLetStatementAccess().getBlockLetStatementParserRuleCall_5_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLetStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLetStatementAccess().getBlockLetStatementParserRuleCall_5_0_1()); 
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
    // $ANTLR end "rule__LetStatement__BlockAlternatives_5_0"


    // $ANTLR start "rule__BooleanOperation__Alternatives_1_0_0"
    // InternalAle.g:988:1: rule__BooleanOperation__Alternatives_1_0_0 : ( ( ( rule__BooleanOperation__Group_1_0_0_0__0 ) ) | ( ( rule__BooleanOperation__Group_1_0_0_1__0 ) ) | ( ( rule__BooleanOperation__Group_1_0_0_2__0 ) ) );
    public final void rule__BooleanOperation__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:992:1: ( ( ( rule__BooleanOperation__Group_1_0_0_0__0 ) ) | ( ( rule__BooleanOperation__Group_1_0_0_1__0 ) ) | ( ( rule__BooleanOperation__Group_1_0_0_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt6=1;
                }
                break;
            case 49:
                {
                alt6=2;
                }
                break;
            case 50:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAle.g:993:2: ( ( rule__BooleanOperation__Group_1_0_0_0__0 ) )
                    {
                    // InternalAle.g:993:2: ( ( rule__BooleanOperation__Group_1_0_0_0__0 ) )
                    // InternalAle.g:994:3: ( rule__BooleanOperation__Group_1_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_0()); 
                    }
                    // InternalAle.g:995:3: ( rule__BooleanOperation__Group_1_0_0_0__0 )
                    // InternalAle.g:995:4: rule__BooleanOperation__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanOperation__Group_1_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:999:2: ( ( rule__BooleanOperation__Group_1_0_0_1__0 ) )
                    {
                    // InternalAle.g:999:2: ( ( rule__BooleanOperation__Group_1_0_0_1__0 ) )
                    // InternalAle.g:1000:3: ( rule__BooleanOperation__Group_1_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_1()); 
                    }
                    // InternalAle.g:1001:3: ( rule__BooleanOperation__Group_1_0_0_1__0 )
                    // InternalAle.g:1001:4: rule__BooleanOperation__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanOperation__Group_1_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:1005:2: ( ( rule__BooleanOperation__Group_1_0_0_2__0 ) )
                    {
                    // InternalAle.g:1005:2: ( ( rule__BooleanOperation__Group_1_0_0_2__0 ) )
                    // InternalAle.g:1006:3: ( rule__BooleanOperation__Group_1_0_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_2()); 
                    }
                    // InternalAle.g:1007:3: ( rule__BooleanOperation__Group_1_0_0_2__0 )
                    // InternalAle.g:1007:4: rule__BooleanOperation__Group_1_0_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanOperation__Group_1_0_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_2()); 
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
    // $ANTLR end "rule__BooleanOperation__Alternatives_1_0_0"


    // $ANTLR start "rule__CompareOperation__Alternatives_1_0_0"
    // InternalAle.g:1015:1: rule__CompareOperation__Alternatives_1_0_0 : ( ( ( rule__CompareOperation__Group_1_0_0_0__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_1__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_2__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_3__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_4__0 ) ) );
    public final void rule__CompareOperation__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1019:1: ( ( ( rule__CompareOperation__Group_1_0_0_0__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_1__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_2__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_3__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_4__0 ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt7=1;
                }
                break;
            case 52:
                {
                alt7=2;
                }
                break;
            case 53:
                {
                alt7=3;
                }
                break;
            case 54:
                {
                alt7=4;
                }
                break;
            case 55:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAle.g:1020:2: ( ( rule__CompareOperation__Group_1_0_0_0__0 ) )
                    {
                    // InternalAle.g:1020:2: ( ( rule__CompareOperation__Group_1_0_0_0__0 ) )
                    // InternalAle.g:1021:3: ( rule__CompareOperation__Group_1_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_0()); 
                    }
                    // InternalAle.g:1022:3: ( rule__CompareOperation__Group_1_0_0_0__0 )
                    // InternalAle.g:1022:4: rule__CompareOperation__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareOperation__Group_1_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1026:2: ( ( rule__CompareOperation__Group_1_0_0_1__0 ) )
                    {
                    // InternalAle.g:1026:2: ( ( rule__CompareOperation__Group_1_0_0_1__0 ) )
                    // InternalAle.g:1027:3: ( rule__CompareOperation__Group_1_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_1()); 
                    }
                    // InternalAle.g:1028:3: ( rule__CompareOperation__Group_1_0_0_1__0 )
                    // InternalAle.g:1028:4: rule__CompareOperation__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareOperation__Group_1_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:1032:2: ( ( rule__CompareOperation__Group_1_0_0_2__0 ) )
                    {
                    // InternalAle.g:1032:2: ( ( rule__CompareOperation__Group_1_0_0_2__0 ) )
                    // InternalAle.g:1033:3: ( rule__CompareOperation__Group_1_0_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_2()); 
                    }
                    // InternalAle.g:1034:3: ( rule__CompareOperation__Group_1_0_0_2__0 )
                    // InternalAle.g:1034:4: rule__CompareOperation__Group_1_0_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareOperation__Group_1_0_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:1038:2: ( ( rule__CompareOperation__Group_1_0_0_3__0 ) )
                    {
                    // InternalAle.g:1038:2: ( ( rule__CompareOperation__Group_1_0_0_3__0 ) )
                    // InternalAle.g:1039:3: ( rule__CompareOperation__Group_1_0_0_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_3()); 
                    }
                    // InternalAle.g:1040:3: ( rule__CompareOperation__Group_1_0_0_3__0 )
                    // InternalAle.g:1040:4: rule__CompareOperation__Group_1_0_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareOperation__Group_1_0_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:1044:2: ( ( rule__CompareOperation__Group_1_0_0_4__0 ) )
                    {
                    // InternalAle.g:1044:2: ( ( rule__CompareOperation__Group_1_0_0_4__0 ) )
                    // InternalAle.g:1045:3: ( rule__CompareOperation__Group_1_0_0_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_4()); 
                    }
                    // InternalAle.g:1046:3: ( rule__CompareOperation__Group_1_0_0_4__0 )
                    // InternalAle.g:1046:4: rule__CompareOperation__Group_1_0_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareOperation__Group_1_0_0_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_4()); 
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
    // $ANTLR end "rule__CompareOperation__Alternatives_1_0_0"


    // $ANTLR start "rule__MultOperation__Alternatives_1_0_0"
    // InternalAle.g:1054:1: rule__MultOperation__Alternatives_1_0_0 : ( ( ( rule__MultOperation__Group_1_0_0_0__0 ) ) | ( ( rule__MultOperation__Group_1_0_0_1__0 ) ) );
    public final void rule__MultOperation__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1058:1: ( ( ( rule__MultOperation__Group_1_0_0_0__0 ) ) | ( ( rule__MultOperation__Group_1_0_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==56) ) {
                alt8=1;
            }
            else if ( (LA8_0==57) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAle.g:1059:2: ( ( rule__MultOperation__Group_1_0_0_0__0 ) )
                    {
                    // InternalAle.g:1059:2: ( ( rule__MultOperation__Group_1_0_0_0__0 ) )
                    // InternalAle.g:1060:3: ( rule__MultOperation__Group_1_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultOperationAccess().getGroup_1_0_0_0()); 
                    }
                    // InternalAle.g:1061:3: ( rule__MultOperation__Group_1_0_0_0__0 )
                    // InternalAle.g:1061:4: rule__MultOperation__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultOperation__Group_1_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultOperationAccess().getGroup_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1065:2: ( ( rule__MultOperation__Group_1_0_0_1__0 ) )
                    {
                    // InternalAle.g:1065:2: ( ( rule__MultOperation__Group_1_0_0_1__0 ) )
                    // InternalAle.g:1066:3: ( rule__MultOperation__Group_1_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultOperationAccess().getGroup_1_0_0_1()); 
                    }
                    // InternalAle.g:1067:3: ( rule__MultOperation__Group_1_0_0_1__0 )
                    // InternalAle.g:1067:4: rule__MultOperation__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultOperation__Group_1_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultOperationAccess().getGroup_1_0_0_1()); 
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
    // $ANTLR end "rule__MultOperation__Alternatives_1_0_0"


    // $ANTLR start "rule__AddOperation__Alternatives_1_0_0"
    // InternalAle.g:1075:1: rule__AddOperation__Alternatives_1_0_0 : ( ( ( rule__AddOperation__Group_1_0_0_0__0 ) ) | ( ( rule__AddOperation__Group_1_0_0_1__0 ) ) );
    public final void rule__AddOperation__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1079:1: ( ( ( rule__AddOperation__Group_1_0_0_0__0 ) ) | ( ( rule__AddOperation__Group_1_0_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==58) ) {
                alt9=1;
            }
            else if ( (LA9_0==59) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAle.g:1080:2: ( ( rule__AddOperation__Group_1_0_0_0__0 ) )
                    {
                    // InternalAle.g:1080:2: ( ( rule__AddOperation__Group_1_0_0_0__0 ) )
                    // InternalAle.g:1081:3: ( rule__AddOperation__Group_1_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddOperationAccess().getGroup_1_0_0_0()); 
                    }
                    // InternalAle.g:1082:3: ( rule__AddOperation__Group_1_0_0_0__0 )
                    // InternalAle.g:1082:4: rule__AddOperation__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddOperation__Group_1_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddOperationAccess().getGroup_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1086:2: ( ( rule__AddOperation__Group_1_0_0_1__0 ) )
                    {
                    // InternalAle.g:1086:2: ( ( rule__AddOperation__Group_1_0_0_1__0 ) )
                    // InternalAle.g:1087:3: ( rule__AddOperation__Group_1_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddOperationAccess().getGroup_1_0_0_1()); 
                    }
                    // InternalAle.g:1088:3: ( rule__AddOperation__Group_1_0_0_1__0 )
                    // InternalAle.g:1088:4: rule__AddOperation__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddOperation__Group_1_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddOperationAccess().getGroup_1_0_0_1()); 
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
    // $ANTLR end "rule__AddOperation__Alternatives_1_0_0"


    // $ANTLR start "rule__InfixOperation__Alternatives"
    // InternalAle.g:1096:1: rule__InfixOperation__Alternatives : ( ( ( rule__InfixOperation__Group_0__0 ) ) | ( ( rule__InfixOperation__Group_1__0 ) ) | ( ( rule__InfixOperation__Group_2__0 ) ) | ( ( rule__InfixOperation__Group_3__0 ) ) | ( ( rule__InfixOperation__Group_4__0 ) ) );
    public final void rule__InfixOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1100:1: ( ( ( rule__InfixOperation__Group_0__0 ) ) | ( ( rule__InfixOperation__Group_1__0 ) ) | ( ( rule__InfixOperation__Group_2__0 ) ) | ( ( rule__InfixOperation__Group_3__0 ) ) | ( ( rule__InfixOperation__Group_4__0 ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt10=1;
                }
                break;
            case 59:
                {
                alt10=2;
                }
                break;
            case 61:
                {
                alt10=3;
                }
                break;
            case RULE_ID:
                {
                int LA10_4 = input.LA(2);

                if ( (LA10_4==36) ) {
                    alt10=4;
                }
                else if ( (LA10_4==EOF||LA10_4==25||LA10_4==32||LA10_4==34||LA10_4==37||LA10_4==41||(LA10_4>=47 && LA10_4<=59)||(LA10_4>=62 && LA10_4<=63)||LA10_4==68||LA10_4==71) ) {
                    alt10=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NULL:
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case RULE_BOOLEAN:
            case 36:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAle.g:1101:2: ( ( rule__InfixOperation__Group_0__0 ) )
                    {
                    // InternalAle.g:1101:2: ( ( rule__InfixOperation__Group_0__0 ) )
                    // InternalAle.g:1102:3: ( rule__InfixOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixOperationAccess().getGroup_0()); 
                    }
                    // InternalAle.g:1103:3: ( rule__InfixOperation__Group_0__0 )
                    // InternalAle.g:1103:4: rule__InfixOperation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixOperationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1107:2: ( ( rule__InfixOperation__Group_1__0 ) )
                    {
                    // InternalAle.g:1107:2: ( ( rule__InfixOperation__Group_1__0 ) )
                    // InternalAle.g:1108:3: ( rule__InfixOperation__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixOperationAccess().getGroup_1()); 
                    }
                    // InternalAle.g:1109:3: ( rule__InfixOperation__Group_1__0 )
                    // InternalAle.g:1109:4: rule__InfixOperation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixOperationAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:1113:2: ( ( rule__InfixOperation__Group_2__0 ) )
                    {
                    // InternalAle.g:1113:2: ( ( rule__InfixOperation__Group_2__0 ) )
                    // InternalAle.g:1114:3: ( rule__InfixOperation__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixOperationAccess().getGroup_2()); 
                    }
                    // InternalAle.g:1115:3: ( rule__InfixOperation__Group_2__0 )
                    // InternalAle.g:1115:4: rule__InfixOperation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixOperationAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:1119:2: ( ( rule__InfixOperation__Group_3__0 ) )
                    {
                    // InternalAle.g:1119:2: ( ( rule__InfixOperation__Group_3__0 ) )
                    // InternalAle.g:1120:3: ( rule__InfixOperation__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixOperationAccess().getGroup_3()); 
                    }
                    // InternalAle.g:1121:3: ( rule__InfixOperation__Group_3__0 )
                    // InternalAle.g:1121:4: rule__InfixOperation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixOperationAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:1125:2: ( ( rule__InfixOperation__Group_4__0 ) )
                    {
                    // InternalAle.g:1125:2: ( ( rule__InfixOperation__Group_4__0 ) )
                    // InternalAle.g:1126:3: ( rule__InfixOperation__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixOperationAccess().getGroup_4()); 
                    }
                    // InternalAle.g:1127:3: ( rule__InfixOperation__Group_4__0 )
                    // InternalAle.g:1127:4: rule__InfixOperation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixOperationAccess().getGroup_4()); 
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
    // $ANTLR end "rule__InfixOperation__Alternatives"


    // $ANTLR start "rule__InfixOperation__Alternatives_4_1"
    // InternalAle.g:1135:1: rule__InfixOperation__Alternatives_4_1 : ( ( ( rule__InfixOperation__Group_4_1_0__0 ) ) | ( ( rule__InfixOperation__Group_4_1_1__0 ) ) );
    public final void rule__InfixOperation__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1139:1: ( ( ( rule__InfixOperation__Group_4_1_0__0 ) ) | ( ( rule__InfixOperation__Group_4_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==62) ) {
                alt11=1;
            }
            else if ( (LA11_0==63) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAle.g:1140:2: ( ( rule__InfixOperation__Group_4_1_0__0 ) )
                    {
                    // InternalAle.g:1140:2: ( ( rule__InfixOperation__Group_4_1_0__0 ) )
                    // InternalAle.g:1141:3: ( rule__InfixOperation__Group_4_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixOperationAccess().getGroup_4_1_0()); 
                    }
                    // InternalAle.g:1142:3: ( rule__InfixOperation__Group_4_1_0__0 )
                    // InternalAle.g:1142:4: rule__InfixOperation__Group_4_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_4_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixOperationAccess().getGroup_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1146:2: ( ( rule__InfixOperation__Group_4_1_1__0 ) )
                    {
                    // InternalAle.g:1146:2: ( ( rule__InfixOperation__Group_4_1_1__0 ) )
                    // InternalAle.g:1147:3: ( rule__InfixOperation__Group_4_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixOperationAccess().getGroup_4_1_1()); 
                    }
                    // InternalAle.g:1148:3: ( rule__InfixOperation__Group_4_1_1__0 )
                    // InternalAle.g:1148:4: rule__InfixOperation__Group_4_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_4_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixOperationAccess().getGroup_4_1_1()); 
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
    // $ANTLR end "rule__InfixOperation__Alternatives_4_1"


    // $ANTLR start "rule__AtomicLiteral__Alternatives"
    // InternalAle.g:1156:1: rule__AtomicLiteral__Alternatives : ( ( ( rule__AtomicLiteral__Group_0__0 ) ) | ( ( rule__AtomicLiteral__Group_1__0 ) ) | ( ( rule__AtomicLiteral__Group_2__0 ) ) | ( ( rule__AtomicLiteral__Group_3__0 ) ) | ( ( rule__AtomicLiteral__Group_4__0 ) ) | ( ( rule__AtomicLiteral__Group_5__0 ) ) | ( ( rule__AtomicLiteral__Group_6__0 ) ) | ( ( rule__AtomicLiteral__Group_7__0 ) ) | ( ( rule__AtomicLiteral__Group_8__0 ) ) | ( ( rule__AtomicLiteral__Group_9__0 ) ) | ( ( rule__AtomicLiteral__Group_10__0 ) ) | ( ( rule__AtomicLiteral__Group_11__0 ) ) );
    public final void rule__AtomicLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1160:1: ( ( ( rule__AtomicLiteral__Group_0__0 ) ) | ( ( rule__AtomicLiteral__Group_1__0 ) ) | ( ( rule__AtomicLiteral__Group_2__0 ) ) | ( ( rule__AtomicLiteral__Group_3__0 ) ) | ( ( rule__AtomicLiteral__Group_4__0 ) ) | ( ( rule__AtomicLiteral__Group_5__0 ) ) | ( ( rule__AtomicLiteral__Group_6__0 ) ) | ( ( rule__AtomicLiteral__Group_7__0 ) ) | ( ( rule__AtomicLiteral__Group_8__0 ) ) | ( ( rule__AtomicLiteral__Group_9__0 ) ) | ( ( rule__AtomicLiteral__Group_10__0 ) ) | ( ( rule__AtomicLiteral__Group_11__0 ) ) )
            int alt12=12;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt12=1;
                }
                break;
            case 65:
                {
                alt12=2;
                }
                break;
            case 66:
                {
                alt12=3;
                }
                break;
            case RULE_STRING:
                {
                alt12=4;
                }
                break;
            case RULE_INT:
                {
                alt12=5;
                }
                break;
            case RULE_REAL:
                {
                alt12=6;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt12=7;
                }
                break;
            case RULE_NULL:
                {
                alt12=8;
                }
                break;
            case 67:
                {
                alt12=9;
                }
                break;
            case 69:
                {
                alt12=10;
                }
                break;
            case 70:
                {
                alt12=11;
                }
                break;
            case RULE_ID:
                {
                alt12=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAle.g:1161:2: ( ( rule__AtomicLiteral__Group_0__0 ) )
                    {
                    // InternalAle.g:1161:2: ( ( rule__AtomicLiteral__Group_0__0 ) )
                    // InternalAle.g:1162:3: ( rule__AtomicLiteral__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_0()); 
                    }
                    // InternalAle.g:1163:3: ( rule__AtomicLiteral__Group_0__0 )
                    // InternalAle.g:1163:4: rule__AtomicLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1167:2: ( ( rule__AtomicLiteral__Group_1__0 ) )
                    {
                    // InternalAle.g:1167:2: ( ( rule__AtomicLiteral__Group_1__0 ) )
                    // InternalAle.g:1168:3: ( rule__AtomicLiteral__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_1()); 
                    }
                    // InternalAle.g:1169:3: ( rule__AtomicLiteral__Group_1__0 )
                    // InternalAle.g:1169:4: rule__AtomicLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:1173:2: ( ( rule__AtomicLiteral__Group_2__0 ) )
                    {
                    // InternalAle.g:1173:2: ( ( rule__AtomicLiteral__Group_2__0 ) )
                    // InternalAle.g:1174:3: ( rule__AtomicLiteral__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_2()); 
                    }
                    // InternalAle.g:1175:3: ( rule__AtomicLiteral__Group_2__0 )
                    // InternalAle.g:1175:4: rule__AtomicLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:1179:2: ( ( rule__AtomicLiteral__Group_3__0 ) )
                    {
                    // InternalAle.g:1179:2: ( ( rule__AtomicLiteral__Group_3__0 ) )
                    // InternalAle.g:1180:3: ( rule__AtomicLiteral__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_3()); 
                    }
                    // InternalAle.g:1181:3: ( rule__AtomicLiteral__Group_3__0 )
                    // InternalAle.g:1181:4: rule__AtomicLiteral__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:1185:2: ( ( rule__AtomicLiteral__Group_4__0 ) )
                    {
                    // InternalAle.g:1185:2: ( ( rule__AtomicLiteral__Group_4__0 ) )
                    // InternalAle.g:1186:3: ( rule__AtomicLiteral__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_4()); 
                    }
                    // InternalAle.g:1187:3: ( rule__AtomicLiteral__Group_4__0 )
                    // InternalAle.g:1187:4: rule__AtomicLiteral__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:1191:2: ( ( rule__AtomicLiteral__Group_5__0 ) )
                    {
                    // InternalAle.g:1191:2: ( ( rule__AtomicLiteral__Group_5__0 ) )
                    // InternalAle.g:1192:3: ( rule__AtomicLiteral__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_5()); 
                    }
                    // InternalAle.g:1193:3: ( rule__AtomicLiteral__Group_5__0 )
                    // InternalAle.g:1193:4: rule__AtomicLiteral__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:1197:2: ( ( rule__AtomicLiteral__Group_6__0 ) )
                    {
                    // InternalAle.g:1197:2: ( ( rule__AtomicLiteral__Group_6__0 ) )
                    // InternalAle.g:1198:3: ( rule__AtomicLiteral__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_6()); 
                    }
                    // InternalAle.g:1199:3: ( rule__AtomicLiteral__Group_6__0 )
                    // InternalAle.g:1199:4: rule__AtomicLiteral__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalAle.g:1203:2: ( ( rule__AtomicLiteral__Group_7__0 ) )
                    {
                    // InternalAle.g:1203:2: ( ( rule__AtomicLiteral__Group_7__0 ) )
                    // InternalAle.g:1204:3: ( rule__AtomicLiteral__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_7()); 
                    }
                    // InternalAle.g:1205:3: ( rule__AtomicLiteral__Group_7__0 )
                    // InternalAle.g:1205:4: rule__AtomicLiteral__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalAle.g:1209:2: ( ( rule__AtomicLiteral__Group_8__0 ) )
                    {
                    // InternalAle.g:1209:2: ( ( rule__AtomicLiteral__Group_8__0 ) )
                    // InternalAle.g:1210:3: ( rule__AtomicLiteral__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_8()); 
                    }
                    // InternalAle.g:1211:3: ( rule__AtomicLiteral__Group_8__0 )
                    // InternalAle.g:1211:4: rule__AtomicLiteral__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalAle.g:1215:2: ( ( rule__AtomicLiteral__Group_9__0 ) )
                    {
                    // InternalAle.g:1215:2: ( ( rule__AtomicLiteral__Group_9__0 ) )
                    // InternalAle.g:1216:3: ( rule__AtomicLiteral__Group_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_9()); 
                    }
                    // InternalAle.g:1217:3: ( rule__AtomicLiteral__Group_9__0 )
                    // InternalAle.g:1217:4: rule__AtomicLiteral__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalAle.g:1221:2: ( ( rule__AtomicLiteral__Group_10__0 ) )
                    {
                    // InternalAle.g:1221:2: ( ( rule__AtomicLiteral__Group_10__0 ) )
                    // InternalAle.g:1222:3: ( rule__AtomicLiteral__Group_10__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_10()); 
                    }
                    // InternalAle.g:1223:3: ( rule__AtomicLiteral__Group_10__0 )
                    // InternalAle.g:1223:4: rule__AtomicLiteral__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalAle.g:1227:2: ( ( rule__AtomicLiteral__Group_11__0 ) )
                    {
                    // InternalAle.g:1227:2: ( ( rule__AtomicLiteral__Group_11__0 ) )
                    // InternalAle.g:1228:3: ( rule__AtomicLiteral__Group_11__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_11()); 
                    }
                    // InternalAle.g:1229:3: ( rule__AtomicLiteral__Group_11__0 )
                    // InternalAle.g:1229:4: rule__AtomicLiteral__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_11()); 
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
    // $ANTLR end "rule__AtomicLiteral__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalAle.g:1237:1: rule__Type__Alternatives : ( ( ruleLiteralType ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1241:1: ( ( ruleLiteralType ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 69:
                {
                alt13=3;
                }
                break;
            case 70:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAle.g:1242:2: ( ruleLiteralType )
                    {
                    // InternalAle.g:1242:2: ( ruleLiteralType )
                    // InternalAle.g:1243:3: ruleLiteralType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getLiteralTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteralType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getLiteralTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1248:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalAle.g:1248:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalAle.g:1249:3: ( rule__Type__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_1()); 
                    }
                    // InternalAle.g:1250:3: ( rule__Type__Group_1__0 )
                    // InternalAle.g:1250:4: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:1254:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalAle.g:1254:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalAle.g:1255:3: ( rule__Type__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_2()); 
                    }
                    // InternalAle.g:1256:3: ( rule__Type__Group_2__0 )
                    // InternalAle.g:1256:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:1260:2: ( ( rule__Type__Group_3__0 ) )
                    {
                    // InternalAle.g:1260:2: ( ( rule__Type__Group_3__0 ) )
                    // InternalAle.g:1261:3: ( rule__Type__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_3()); 
                    }
                    // InternalAle.g:1262:3: ( rule__Type__Group_3__0 )
                    // InternalAle.g:1262:4: rule__Type__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__LiteralType__LitAlternatives_0"
    // InternalAle.g:1270:1: rule__LiteralType__LitAlternatives_0 : ( ( 'Boolean' ) | ( 'Byte' ) | ( 'Char' ) | ( 'Double' ) | ( 'Float' ) | ( 'Int' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) );
    public final void rule__LiteralType__LitAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1274:1: ( ( 'Boolean' ) | ( 'Byte' ) | ( 'Char' ) | ( 'Double' ) | ( 'Float' ) | ( 'Int' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) )
            int alt14=9;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt14=1;
                }
                break;
            case 16:
                {
                alt14=2;
                }
                break;
            case 17:
                {
                alt14=3;
                }
                break;
            case 18:
                {
                alt14=4;
                }
                break;
            case 19:
                {
                alt14=5;
                }
                break;
            case 20:
                {
                alt14=6;
                }
                break;
            case 21:
                {
                alt14=7;
                }
                break;
            case 22:
                {
                alt14=8;
                }
                break;
            case 23:
                {
                alt14=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAle.g:1275:2: ( 'Boolean' )
                    {
                    // InternalAle.g:1275:2: ( 'Boolean' )
                    // InternalAle.g:1276:3: 'Boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralTypeAccess().getLitBooleanKeyword_0_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralTypeAccess().getLitBooleanKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1281:2: ( 'Byte' )
                    {
                    // InternalAle.g:1281:2: ( 'Byte' )
                    // InternalAle.g:1282:3: 'Byte'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralTypeAccess().getLitByteKeyword_0_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralTypeAccess().getLitByteKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:1287:2: ( 'Char' )
                    {
                    // InternalAle.g:1287:2: ( 'Char' )
                    // InternalAle.g:1288:3: 'Char'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralTypeAccess().getLitCharKeyword_0_2()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralTypeAccess().getLitCharKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:1293:2: ( 'Double' )
                    {
                    // InternalAle.g:1293:2: ( 'Double' )
                    // InternalAle.g:1294:3: 'Double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralTypeAccess().getLitDoubleKeyword_0_3()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralTypeAccess().getLitDoubleKeyword_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:1299:2: ( 'Float' )
                    {
                    // InternalAle.g:1299:2: ( 'Float' )
                    // InternalAle.g:1300:3: 'Float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralTypeAccess().getLitFloatKeyword_0_4()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralTypeAccess().getLitFloatKeyword_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:1305:2: ( 'Int' )
                    {
                    // InternalAle.g:1305:2: ( 'Int' )
                    // InternalAle.g:1306:3: 'Int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralTypeAccess().getLitIntKeyword_0_5()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralTypeAccess().getLitIntKeyword_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:1311:2: ( 'Long' )
                    {
                    // InternalAle.g:1311:2: ( 'Long' )
                    // InternalAle.g:1312:3: 'Long'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralTypeAccess().getLitLongKeyword_0_6()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralTypeAccess().getLitLongKeyword_0_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalAle.g:1317:2: ( 'Short' )
                    {
                    // InternalAle.g:1317:2: ( 'Short' )
                    // InternalAle.g:1318:3: 'Short'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralTypeAccess().getLitShortKeyword_0_7()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralTypeAccess().getLitShortKeyword_0_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalAle.g:1323:2: ( 'String' )
                    {
                    // InternalAle.g:1323:2: ( 'String' )
                    // InternalAle.g:1324:3: 'String'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralTypeAccess().getLitStringKeyword_0_8()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralTypeAccess().getLitStringKeyword_0_8()); 
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
    // $ANTLR end "rule__LiteralType__LitAlternatives_0"


    // $ANTLR start "rule__Root__Group__0"
    // InternalAle.g:1333:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1337:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalAle.g:1338:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Root__Group__1();

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
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalAle.g:1345:1: rule__Root__Group__0__Impl : ( 'behavior' ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1349:1: ( ( 'behavior' ) )
            // InternalAle.g:1350:1: ( 'behavior' )
            {
            // InternalAle.g:1350:1: ( 'behavior' )
            // InternalAle.g:1351:2: 'behavior'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getBehaviorKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getBehaviorKeyword_0()); 
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
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalAle.g:1360:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1364:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalAle.g:1365:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Root__Group__2();

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
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalAle.g:1372:1: rule__Root__Group__1__Impl : ( ( rule__Root__NameAssignment_1 ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1376:1: ( ( ( rule__Root__NameAssignment_1 ) ) )
            // InternalAle.g:1377:1: ( ( rule__Root__NameAssignment_1 ) )
            {
            // InternalAle.g:1377:1: ( ( rule__Root__NameAssignment_1 ) )
            // InternalAle.g:1378:2: ( rule__Root__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getNameAssignment_1()); 
            }
            // InternalAle.g:1379:2: ( rule__Root__NameAssignment_1 )
            // InternalAle.g:1379:3: rule__Root__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Root__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // InternalAle.g:1387:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1391:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // InternalAle.g:1392:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Root__Group__3();

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
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // InternalAle.g:1399:1: rule__Root__Group__2__Impl : ( ';' ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1403:1: ( ( ';' ) )
            // InternalAle.g:1404:1: ( ';' )
            {
            // InternalAle.g:1404:1: ( ';' )
            // InternalAle.g:1405:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getSemicolonKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Root__Group__3"
    // InternalAle.g:1414:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1418:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // InternalAle.g:1419:2: rule__Root__Group__3__Impl rule__Root__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Root__Group__4();

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
    // $ANTLR end "rule__Root__Group__3"


    // $ANTLR start "rule__Root__Group__3__Impl"
    // InternalAle.g:1426:1: rule__Root__Group__3__Impl : ( ( rule__Root__ImportsAssignment_3 )* ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1430:1: ( ( ( rule__Root__ImportsAssignment_3 )* ) )
            // InternalAle.g:1431:1: ( ( rule__Root__ImportsAssignment_3 )* )
            {
            // InternalAle.g:1431:1: ( ( rule__Root__ImportsAssignment_3 )* )
            // InternalAle.g:1432:2: ( rule__Root__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getImportsAssignment_3()); 
            }
            // InternalAle.g:1433:2: ( rule__Root__ImportsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAle.g:1433:3: rule__Root__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Root__ImportsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getImportsAssignment_3()); 
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
    // $ANTLR end "rule__Root__Group__3__Impl"


    // $ANTLR start "rule__Root__Group__4"
    // InternalAle.g:1441:1: rule__Root__Group__4 : rule__Root__Group__4__Impl ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1445:1: ( rule__Root__Group__4__Impl )
            // InternalAle.g:1446:2: rule__Root__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__4__Impl();

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
    // $ANTLR end "rule__Root__Group__4"


    // $ANTLR start "rule__Root__Group__4__Impl"
    // InternalAle.g:1452:1: rule__Root__Group__4__Impl : ( ( rule__Root__ClassesAssignment_4 )* ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1456:1: ( ( ( rule__Root__ClassesAssignment_4 )* ) )
            // InternalAle.g:1457:1: ( ( rule__Root__ClassesAssignment_4 )* )
            {
            // InternalAle.g:1457:1: ( ( rule__Root__ClassesAssignment_4 )* )
            // InternalAle.g:1458:2: ( rule__Root__ClassesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getClassesAssignment_4()); 
            }
            // InternalAle.g:1459:2: ( rule__Root__ClassesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=29 && LA16_0<=30)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAle.g:1459:3: rule__Root__ClassesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Root__ClassesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getClassesAssignment_4()); 
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
    // $ANTLR end "rule__Root__Group__4__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalAle.g:1468:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1472:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAle.g:1473:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalAle.g:1480:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1484:1: ( ( 'import' ) )
            // InternalAle.g:1485:1: ( 'import' )
            {
            // InternalAle.g:1485:1: ( 'import' )
            // InternalAle.g:1486:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalAle.g:1495:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1499:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalAle.g:1500:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalAle.g:1507:1: rule__Import__Group__1__Impl : ( ( rule__Import__RefAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1511:1: ( ( ( rule__Import__RefAssignment_1 ) ) )
            // InternalAle.g:1512:1: ( ( rule__Import__RefAssignment_1 ) )
            {
            // InternalAle.g:1512:1: ( ( rule__Import__RefAssignment_1 ) )
            // InternalAle.g:1513:2: ( rule__Import__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getRefAssignment_1()); 
            }
            // InternalAle.g:1514:2: ( rule__Import__RefAssignment_1 )
            // InternalAle.g:1514:3: rule__Import__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__RefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getRefAssignment_1()); 
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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalAle.g:1522:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1526:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalAle.g:1527:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__3();

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
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalAle.g:1534:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1538:1: ( ( 'as' ) )
            // InternalAle.g:1539:1: ( 'as' )
            {
            // InternalAle.g:1539:1: ( 'as' )
            // InternalAle.g:1540:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAsKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getAsKeyword_2()); 
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
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__3"
    // InternalAle.g:1549:1: rule__Import__Group__3 : rule__Import__Group__3__Impl rule__Import__Group__4 ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1553:1: ( rule__Import__Group__3__Impl rule__Import__Group__4 )
            // InternalAle.g:1554:2: rule__Import__Group__3__Impl rule__Import__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__4();

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
    // $ANTLR end "rule__Import__Group__3"


    // $ANTLR start "rule__Import__Group__3__Impl"
    // InternalAle.g:1561:1: rule__Import__Group__3__Impl : ( ( rule__Import__NameAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1565:1: ( ( ( rule__Import__NameAssignment_3 ) ) )
            // InternalAle.g:1566:1: ( ( rule__Import__NameAssignment_3 ) )
            {
            // InternalAle.g:1566:1: ( ( rule__Import__NameAssignment_3 ) )
            // InternalAle.g:1567:2: ( rule__Import__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getNameAssignment_3()); 
            }
            // InternalAle.g:1568:2: ( rule__Import__NameAssignment_3 )
            // InternalAle.g:1568:3: rule__Import__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Import__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__Import__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__4"
    // InternalAle.g:1576:1: rule__Import__Group__4 : rule__Import__Group__4__Impl ;
    public final void rule__Import__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1580:1: ( rule__Import__Group__4__Impl )
            // InternalAle.g:1581:2: rule__Import__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__4__Impl();

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
    // $ANTLR end "rule__Import__Group__4"


    // $ANTLR start "rule__Import__Group__4__Impl"
    // InternalAle.g:1587:1: rule__Import__Group__4__Impl : ( ';' ) ;
    public final void rule__Import__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1591:1: ( ( ';' ) )
            // InternalAle.g:1592:1: ( ';' )
            {
            // InternalAle.g:1592:1: ( ';' )
            // InternalAle.g:1593:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getSemicolonKeyword_4()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__Import__Group__4__Impl"


    // $ANTLR start "rule__Tag__Group__0"
    // InternalAle.g:1603:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1607:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalAle.g:1608:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Tag__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tag__Group__1();

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
    // $ANTLR end "rule__Tag__Group__0"


    // $ANTLR start "rule__Tag__Group__0__Impl"
    // InternalAle.g:1615:1: rule__Tag__Group__0__Impl : ( '@' ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1619:1: ( ( '@' ) )
            // InternalAle.g:1620:1: ( '@' )
            {
            // InternalAle.g:1620:1: ( '@' )
            // InternalAle.g:1621:2: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getCommercialAtKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getCommercialAtKeyword_0()); 
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
    // $ANTLR end "rule__Tag__Group__0__Impl"


    // $ANTLR start "rule__Tag__Group__1"
    // InternalAle.g:1630:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1634:1: ( rule__Tag__Group__1__Impl )
            // InternalAle.g:1635:2: rule__Tag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__1__Impl();

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
    // $ANTLR end "rule__Tag__Group__1"


    // $ANTLR start "rule__Tag__Group__1__Impl"
    // InternalAle.g:1641:1: rule__Tag__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1645:1: ( ( RULE_ID ) )
            // InternalAle.g:1646:1: ( RULE_ID )
            {
            // InternalAle.g:1646:1: ( RULE_ID )
            // InternalAle.g:1647:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getIDTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Tag__Group__1__Impl"


    // $ANTLR start "rule__OpenClass__Group__0"
    // InternalAle.g:1657:1: rule__OpenClass__Group__0 : rule__OpenClass__Group__0__Impl rule__OpenClass__Group__1 ;
    public final void rule__OpenClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1661:1: ( rule__OpenClass__Group__0__Impl rule__OpenClass__Group__1 )
            // InternalAle.g:1662:2: rule__OpenClass__Group__0__Impl rule__OpenClass__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OpenClass__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group__1();

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
    // $ANTLR end "rule__OpenClass__Group__0"


    // $ANTLR start "rule__OpenClass__Group__0__Impl"
    // InternalAle.g:1669:1: rule__OpenClass__Group__0__Impl : ( () ) ;
    public final void rule__OpenClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1673:1: ( ( () ) )
            // InternalAle.g:1674:1: ( () )
            {
            // InternalAle.g:1674:1: ( () )
            // InternalAle.g:1675:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getOpenClassAction_0()); 
            }
            // InternalAle.g:1676:2: ()
            // InternalAle.g:1676:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getOpenClassAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenClass__Group__0__Impl"


    // $ANTLR start "rule__OpenClass__Group__1"
    // InternalAle.g:1684:1: rule__OpenClass__Group__1 : rule__OpenClass__Group__1__Impl rule__OpenClass__Group__2 ;
    public final void rule__OpenClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1688:1: ( rule__OpenClass__Group__1__Impl rule__OpenClass__Group__2 )
            // InternalAle.g:1689:2: rule__OpenClass__Group__1__Impl rule__OpenClass__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__OpenClass__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group__2();

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
    // $ANTLR end "rule__OpenClass__Group__1"


    // $ANTLR start "rule__OpenClass__Group__1__Impl"
    // InternalAle.g:1696:1: rule__OpenClass__Group__1__Impl : ( 'open' ) ;
    public final void rule__OpenClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1700:1: ( ( 'open' ) )
            // InternalAle.g:1701:1: ( 'open' )
            {
            // InternalAle.g:1701:1: ( 'open' )
            // InternalAle.g:1702:2: 'open'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getOpenKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getOpenKeyword_1()); 
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
    // $ANTLR end "rule__OpenClass__Group__1__Impl"


    // $ANTLR start "rule__OpenClass__Group__2"
    // InternalAle.g:1711:1: rule__OpenClass__Group__2 : rule__OpenClass__Group__2__Impl rule__OpenClass__Group__3 ;
    public final void rule__OpenClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1715:1: ( rule__OpenClass__Group__2__Impl rule__OpenClass__Group__3 )
            // InternalAle.g:1716:2: rule__OpenClass__Group__2__Impl rule__OpenClass__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__OpenClass__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group__3();

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
    // $ANTLR end "rule__OpenClass__Group__2"


    // $ANTLR start "rule__OpenClass__Group__2__Impl"
    // InternalAle.g:1723:1: rule__OpenClass__Group__2__Impl : ( 'class' ) ;
    public final void rule__OpenClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1727:1: ( ( 'class' ) )
            // InternalAle.g:1728:1: ( 'class' )
            {
            // InternalAle.g:1728:1: ( 'class' )
            // InternalAle.g:1729:2: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getClassKeyword_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getClassKeyword_2()); 
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
    // $ANTLR end "rule__OpenClass__Group__2__Impl"


    // $ANTLR start "rule__OpenClass__Group__3"
    // InternalAle.g:1738:1: rule__OpenClass__Group__3 : rule__OpenClass__Group__3__Impl rule__OpenClass__Group__4 ;
    public final void rule__OpenClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1742:1: ( rule__OpenClass__Group__3__Impl rule__OpenClass__Group__4 )
            // InternalAle.g:1743:2: rule__OpenClass__Group__3__Impl rule__OpenClass__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__OpenClass__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group__4();

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
    // $ANTLR end "rule__OpenClass__Group__3"


    // $ANTLR start "rule__OpenClass__Group__3__Impl"
    // InternalAle.g:1750:1: rule__OpenClass__Group__3__Impl : ( ( rule__OpenClass__NameAssignment_3 ) ) ;
    public final void rule__OpenClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1754:1: ( ( ( rule__OpenClass__NameAssignment_3 ) ) )
            // InternalAle.g:1755:1: ( ( rule__OpenClass__NameAssignment_3 ) )
            {
            // InternalAle.g:1755:1: ( ( rule__OpenClass__NameAssignment_3 ) )
            // InternalAle.g:1756:2: ( rule__OpenClass__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getNameAssignment_3()); 
            }
            // InternalAle.g:1757:2: ( rule__OpenClass__NameAssignment_3 )
            // InternalAle.g:1757:3: rule__OpenClass__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OpenClass__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__OpenClass__Group__3__Impl"


    // $ANTLR start "rule__OpenClass__Group__4"
    // InternalAle.g:1765:1: rule__OpenClass__Group__4 : rule__OpenClass__Group__4__Impl rule__OpenClass__Group__5 ;
    public final void rule__OpenClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1769:1: ( rule__OpenClass__Group__4__Impl rule__OpenClass__Group__5 )
            // InternalAle.g:1770:2: rule__OpenClass__Group__4__Impl rule__OpenClass__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__OpenClass__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group__5();

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
    // $ANTLR end "rule__OpenClass__Group__4"


    // $ANTLR start "rule__OpenClass__Group__4__Impl"
    // InternalAle.g:1777:1: rule__OpenClass__Group__4__Impl : ( ( rule__OpenClass__Group_4__0 )? ) ;
    public final void rule__OpenClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1781:1: ( ( ( rule__OpenClass__Group_4__0 )? ) )
            // InternalAle.g:1782:1: ( ( rule__OpenClass__Group_4__0 )? )
            {
            // InternalAle.g:1782:1: ( ( rule__OpenClass__Group_4__0 )? )
            // InternalAle.g:1783:2: ( rule__OpenClass__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getGroup_4()); 
            }
            // InternalAle.g:1784:2: ( rule__OpenClass__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAle.g:1784:3: rule__OpenClass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpenClass__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getGroup_4()); 
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
    // $ANTLR end "rule__OpenClass__Group__4__Impl"


    // $ANTLR start "rule__OpenClass__Group__5"
    // InternalAle.g:1792:1: rule__OpenClass__Group__5 : rule__OpenClass__Group__5__Impl ;
    public final void rule__OpenClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1796:1: ( rule__OpenClass__Group__5__Impl )
            // InternalAle.g:1797:2: rule__OpenClass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group__5__Impl();

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
    // $ANTLR end "rule__OpenClass__Group__5"


    // $ANTLR start "rule__OpenClass__Group__5__Impl"
    // InternalAle.g:1803:1: rule__OpenClass__Group__5__Impl : ( ( rule__OpenClass__Group_5__0 ) ) ;
    public final void rule__OpenClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1807:1: ( ( ( rule__OpenClass__Group_5__0 ) ) )
            // InternalAle.g:1808:1: ( ( rule__OpenClass__Group_5__0 ) )
            {
            // InternalAle.g:1808:1: ( ( rule__OpenClass__Group_5__0 ) )
            // InternalAle.g:1809:2: ( rule__OpenClass__Group_5__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getGroup_5()); 
            }
            // InternalAle.g:1810:2: ( rule__OpenClass__Group_5__0 )
            // InternalAle.g:1810:3: rule__OpenClass__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group_5__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getGroup_5()); 
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
    // $ANTLR end "rule__OpenClass__Group__5__Impl"


    // $ANTLR start "rule__OpenClass__Group_4__0"
    // InternalAle.g:1819:1: rule__OpenClass__Group_4__0 : rule__OpenClass__Group_4__0__Impl rule__OpenClass__Group_4__1 ;
    public final void rule__OpenClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1823:1: ( rule__OpenClass__Group_4__0__Impl rule__OpenClass__Group_4__1 )
            // InternalAle.g:1824:2: rule__OpenClass__Group_4__0__Impl rule__OpenClass__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__OpenClass__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group_4__1();

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
    // $ANTLR end "rule__OpenClass__Group_4__0"


    // $ANTLR start "rule__OpenClass__Group_4__0__Impl"
    // InternalAle.g:1831:1: rule__OpenClass__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__OpenClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1835:1: ( ( 'extends' ) )
            // InternalAle.g:1836:1: ( 'extends' )
            {
            // InternalAle.g:1836:1: ( 'extends' )
            // InternalAle.g:1837:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getExtendsKeyword_4_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getExtendsKeyword_4_0()); 
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
    // $ANTLR end "rule__OpenClass__Group_4__0__Impl"


    // $ANTLR start "rule__OpenClass__Group_4__1"
    // InternalAle.g:1846:1: rule__OpenClass__Group_4__1 : rule__OpenClass__Group_4__1__Impl rule__OpenClass__Group_4__2 ;
    public final void rule__OpenClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1850:1: ( rule__OpenClass__Group_4__1__Impl rule__OpenClass__Group_4__2 )
            // InternalAle.g:1851:2: rule__OpenClass__Group_4__1__Impl rule__OpenClass__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__OpenClass__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group_4__2();

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
    // $ANTLR end "rule__OpenClass__Group_4__1"


    // $ANTLR start "rule__OpenClass__Group_4__1__Impl"
    // InternalAle.g:1858:1: rule__OpenClass__Group_4__1__Impl : ( ( rule__OpenClass__SuperClassAssignment_4_1 ) ) ;
    public final void rule__OpenClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1862:1: ( ( ( rule__OpenClass__SuperClassAssignment_4_1 ) ) )
            // InternalAle.g:1863:1: ( ( rule__OpenClass__SuperClassAssignment_4_1 ) )
            {
            // InternalAle.g:1863:1: ( ( rule__OpenClass__SuperClassAssignment_4_1 ) )
            // InternalAle.g:1864:2: ( rule__OpenClass__SuperClassAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getSuperClassAssignment_4_1()); 
            }
            // InternalAle.g:1865:2: ( rule__OpenClass__SuperClassAssignment_4_1 )
            // InternalAle.g:1865:3: rule__OpenClass__SuperClassAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__OpenClass__SuperClassAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getSuperClassAssignment_4_1()); 
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
    // $ANTLR end "rule__OpenClass__Group_4__1__Impl"


    // $ANTLR start "rule__OpenClass__Group_4__2"
    // InternalAle.g:1873:1: rule__OpenClass__Group_4__2 : rule__OpenClass__Group_4__2__Impl ;
    public final void rule__OpenClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1877:1: ( rule__OpenClass__Group_4__2__Impl )
            // InternalAle.g:1878:2: rule__OpenClass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group_4__2__Impl();

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
    // $ANTLR end "rule__OpenClass__Group_4__2"


    // $ANTLR start "rule__OpenClass__Group_4__2__Impl"
    // InternalAle.g:1884:1: rule__OpenClass__Group_4__2__Impl : ( ( rule__OpenClass__Group_4_2__0 )* ) ;
    public final void rule__OpenClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1888:1: ( ( ( rule__OpenClass__Group_4_2__0 )* ) )
            // InternalAle.g:1889:1: ( ( rule__OpenClass__Group_4_2__0 )* )
            {
            // InternalAle.g:1889:1: ( ( rule__OpenClass__Group_4_2__0 )* )
            // InternalAle.g:1890:2: ( rule__OpenClass__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getGroup_4_2()); 
            }
            // InternalAle.g:1891:2: ( rule__OpenClass__Group_4_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAle.g:1891:3: rule__OpenClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OpenClass__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getGroup_4_2()); 
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
    // $ANTLR end "rule__OpenClass__Group_4__2__Impl"


    // $ANTLR start "rule__OpenClass__Group_4_2__0"
    // InternalAle.g:1900:1: rule__OpenClass__Group_4_2__0 : rule__OpenClass__Group_4_2__0__Impl rule__OpenClass__Group_4_2__1 ;
    public final void rule__OpenClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1904:1: ( rule__OpenClass__Group_4_2__0__Impl rule__OpenClass__Group_4_2__1 )
            // InternalAle.g:1905:2: rule__OpenClass__Group_4_2__0__Impl rule__OpenClass__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__OpenClass__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group_4_2__1();

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
    // $ANTLR end "rule__OpenClass__Group_4_2__0"


    // $ANTLR start "rule__OpenClass__Group_4_2__0__Impl"
    // InternalAle.g:1912:1: rule__OpenClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__OpenClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1916:1: ( ( ',' ) )
            // InternalAle.g:1917:1: ( ',' )
            {
            // InternalAle.g:1917:1: ( ',' )
            // InternalAle.g:1918:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getCommaKeyword_4_2_0()); 
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
    // $ANTLR end "rule__OpenClass__Group_4_2__0__Impl"


    // $ANTLR start "rule__OpenClass__Group_4_2__1"
    // InternalAle.g:1927:1: rule__OpenClass__Group_4_2__1 : rule__OpenClass__Group_4_2__1__Impl ;
    public final void rule__OpenClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1931:1: ( rule__OpenClass__Group_4_2__1__Impl )
            // InternalAle.g:1932:2: rule__OpenClass__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__OpenClass__Group_4_2__1"


    // $ANTLR start "rule__OpenClass__Group_4_2__1__Impl"
    // InternalAle.g:1938:1: rule__OpenClass__Group_4_2__1__Impl : ( ( rule__OpenClass__SuperClassAssignment_4_2_1 ) ) ;
    public final void rule__OpenClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1942:1: ( ( ( rule__OpenClass__SuperClassAssignment_4_2_1 ) ) )
            // InternalAle.g:1943:1: ( ( rule__OpenClass__SuperClassAssignment_4_2_1 ) )
            {
            // InternalAle.g:1943:1: ( ( rule__OpenClass__SuperClassAssignment_4_2_1 ) )
            // InternalAle.g:1944:2: ( rule__OpenClass__SuperClassAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getSuperClassAssignment_4_2_1()); 
            }
            // InternalAle.g:1945:2: ( rule__OpenClass__SuperClassAssignment_4_2_1 )
            // InternalAle.g:1945:3: rule__OpenClass__SuperClassAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OpenClass__SuperClassAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getSuperClassAssignment_4_2_1()); 
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
    // $ANTLR end "rule__OpenClass__Group_4_2__1__Impl"


    // $ANTLR start "rule__OpenClass__Group_5__0"
    // InternalAle.g:1954:1: rule__OpenClass__Group_5__0 : rule__OpenClass__Group_5__0__Impl rule__OpenClass__Group_5__1 ;
    public final void rule__OpenClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1958:1: ( rule__OpenClass__Group_5__0__Impl rule__OpenClass__Group_5__1 )
            // InternalAle.g:1959:2: rule__OpenClass__Group_5__0__Impl rule__OpenClass__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__OpenClass__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group_5__1();

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
    // $ANTLR end "rule__OpenClass__Group_5__0"


    // $ANTLR start "rule__OpenClass__Group_5__0__Impl"
    // InternalAle.g:1966:1: rule__OpenClass__Group_5__0__Impl : ( '{' ) ;
    public final void rule__OpenClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1970:1: ( ( '{' ) )
            // InternalAle.g:1971:1: ( '{' )
            {
            // InternalAle.g:1971:1: ( '{' )
            // InternalAle.g:1972:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getLeftCurlyBracketKeyword_5_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getLeftCurlyBracketKeyword_5_0()); 
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
    // $ANTLR end "rule__OpenClass__Group_5__0__Impl"


    // $ANTLR start "rule__OpenClass__Group_5__1"
    // InternalAle.g:1981:1: rule__OpenClass__Group_5__1 : rule__OpenClass__Group_5__1__Impl rule__OpenClass__Group_5__2 ;
    public final void rule__OpenClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1985:1: ( rule__OpenClass__Group_5__1__Impl rule__OpenClass__Group_5__2 )
            // InternalAle.g:1986:2: rule__OpenClass__Group_5__1__Impl rule__OpenClass__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__OpenClass__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group_5__2();

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
    // $ANTLR end "rule__OpenClass__Group_5__1"


    // $ANTLR start "rule__OpenClass__Group_5__1__Impl"
    // InternalAle.g:1993:1: rule__OpenClass__Group_5__1__Impl : ( ( rule__OpenClass__FieldsAssignment_5_1 )* ) ;
    public final void rule__OpenClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1997:1: ( ( ( rule__OpenClass__FieldsAssignment_5_1 )* ) )
            // InternalAle.g:1998:1: ( ( rule__OpenClass__FieldsAssignment_5_1 )* )
            {
            // InternalAle.g:1998:1: ( ( rule__OpenClass__FieldsAssignment_5_1 )* )
            // InternalAle.g:1999:2: ( rule__OpenClass__FieldsAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getFieldsAssignment_5_1()); 
            }
            // InternalAle.g:2000:2: ( rule__OpenClass__FieldsAssignment_5_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=15 && LA19_0<=23)||(LA19_0>=69 && LA19_0<=70)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAle.g:2000:3: rule__OpenClass__FieldsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__OpenClass__FieldsAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getFieldsAssignment_5_1()); 
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
    // $ANTLR end "rule__OpenClass__Group_5__1__Impl"


    // $ANTLR start "rule__OpenClass__Group_5__2"
    // InternalAle.g:2008:1: rule__OpenClass__Group_5__2 : rule__OpenClass__Group_5__2__Impl rule__OpenClass__Group_5__3 ;
    public final void rule__OpenClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2012:1: ( rule__OpenClass__Group_5__2__Impl rule__OpenClass__Group_5__3 )
            // InternalAle.g:2013:2: rule__OpenClass__Group_5__2__Impl rule__OpenClass__Group_5__3
            {
            pushFollow(FOLLOW_14);
            rule__OpenClass__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group_5__3();

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
    // $ANTLR end "rule__OpenClass__Group_5__2"


    // $ANTLR start "rule__OpenClass__Group_5__2__Impl"
    // InternalAle.g:2020:1: rule__OpenClass__Group_5__2__Impl : ( ( rule__OpenClass__MethodsAssignment_5_2 )* ) ;
    public final void rule__OpenClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2024:1: ( ( ( rule__OpenClass__MethodsAssignment_5_2 )* ) )
            // InternalAle.g:2025:1: ( ( rule__OpenClass__MethodsAssignment_5_2 )* )
            {
            // InternalAle.g:2025:1: ( ( rule__OpenClass__MethodsAssignment_5_2 )* )
            // InternalAle.g:2026:2: ( rule__OpenClass__MethodsAssignment_5_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getMethodsAssignment_5_2()); 
            }
            // InternalAle.g:2027:2: ( rule__OpenClass__MethodsAssignment_5_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28||LA20_0==35||LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAle.g:2027:3: rule__OpenClass__MethodsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__OpenClass__MethodsAssignment_5_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getMethodsAssignment_5_2()); 
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
    // $ANTLR end "rule__OpenClass__Group_5__2__Impl"


    // $ANTLR start "rule__OpenClass__Group_5__3"
    // InternalAle.g:2035:1: rule__OpenClass__Group_5__3 : rule__OpenClass__Group_5__3__Impl ;
    public final void rule__OpenClass__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2039:1: ( rule__OpenClass__Group_5__3__Impl )
            // InternalAle.g:2040:2: rule__OpenClass__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpenClass__Group_5__3__Impl();

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
    // $ANTLR end "rule__OpenClass__Group_5__3"


    // $ANTLR start "rule__OpenClass__Group_5__3__Impl"
    // InternalAle.g:2046:1: rule__OpenClass__Group_5__3__Impl : ( '}' ) ;
    public final void rule__OpenClass__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2050:1: ( ( '}' ) )
            // InternalAle.g:2051:1: ( '}' )
            {
            // InternalAle.g:2051:1: ( '}' )
            // InternalAle.g:2052:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getRightCurlyBracketKeyword_5_3()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getRightCurlyBracketKeyword_5_3()); 
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
    // $ANTLR end "rule__OpenClass__Group_5__3__Impl"


    // $ANTLR start "rule__NewClass__Group__0"
    // InternalAle.g:2062:1: rule__NewClass__Group__0 : rule__NewClass__Group__0__Impl rule__NewClass__Group__1 ;
    public final void rule__NewClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2066:1: ( rule__NewClass__Group__0__Impl rule__NewClass__Group__1 )
            // InternalAle.g:2067:2: rule__NewClass__Group__0__Impl rule__NewClass__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__NewClass__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NewClass__Group__1();

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
    // $ANTLR end "rule__NewClass__Group__0"


    // $ANTLR start "rule__NewClass__Group__0__Impl"
    // InternalAle.g:2074:1: rule__NewClass__Group__0__Impl : ( () ) ;
    public final void rule__NewClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2078:1: ( ( () ) )
            // InternalAle.g:2079:1: ( () )
            {
            // InternalAle.g:2079:1: ( () )
            // InternalAle.g:2080:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getNewClassAction_0()); 
            }
            // InternalAle.g:2081:2: ()
            // InternalAle.g:2081:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getNewClassAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewClass__Group__0__Impl"


    // $ANTLR start "rule__NewClass__Group__1"
    // InternalAle.g:2089:1: rule__NewClass__Group__1 : rule__NewClass__Group__1__Impl rule__NewClass__Group__2 ;
    public final void rule__NewClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2093:1: ( rule__NewClass__Group__1__Impl rule__NewClass__Group__2 )
            // InternalAle.g:2094:2: rule__NewClass__Group__1__Impl rule__NewClass__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__NewClass__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NewClass__Group__2();

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
    // $ANTLR end "rule__NewClass__Group__1"


    // $ANTLR start "rule__NewClass__Group__1__Impl"
    // InternalAle.g:2101:1: rule__NewClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__NewClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2105:1: ( ( 'class' ) )
            // InternalAle.g:2106:1: ( 'class' )
            {
            // InternalAle.g:2106:1: ( 'class' )
            // InternalAle.g:2107:2: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getClassKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getClassKeyword_1()); 
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
    // $ANTLR end "rule__NewClass__Group__1__Impl"


    // $ANTLR start "rule__NewClass__Group__2"
    // InternalAle.g:2116:1: rule__NewClass__Group__2 : rule__NewClass__Group__2__Impl rule__NewClass__Group__3 ;
    public final void rule__NewClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2120:1: ( rule__NewClass__Group__2__Impl rule__NewClass__Group__3 )
            // InternalAle.g:2121:2: rule__NewClass__Group__2__Impl rule__NewClass__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__NewClass__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NewClass__Group__3();

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
    // $ANTLR end "rule__NewClass__Group__2"


    // $ANTLR start "rule__NewClass__Group__2__Impl"
    // InternalAle.g:2128:1: rule__NewClass__Group__2__Impl : ( ( rule__NewClass__NameAssignment_2 ) ) ;
    public final void rule__NewClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2132:1: ( ( ( rule__NewClass__NameAssignment_2 ) ) )
            // InternalAle.g:2133:1: ( ( rule__NewClass__NameAssignment_2 ) )
            {
            // InternalAle.g:2133:1: ( ( rule__NewClass__NameAssignment_2 ) )
            // InternalAle.g:2134:2: ( rule__NewClass__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getNameAssignment_2()); 
            }
            // InternalAle.g:2135:2: ( rule__NewClass__NameAssignment_2 )
            // InternalAle.g:2135:3: rule__NewClass__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NewClass__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__NewClass__Group__2__Impl"


    // $ANTLR start "rule__NewClass__Group__3"
    // InternalAle.g:2143:1: rule__NewClass__Group__3 : rule__NewClass__Group__3__Impl rule__NewClass__Group__4 ;
    public final void rule__NewClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2147:1: ( rule__NewClass__Group__3__Impl rule__NewClass__Group__4 )
            // InternalAle.g:2148:2: rule__NewClass__Group__3__Impl rule__NewClass__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__NewClass__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NewClass__Group__4();

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
    // $ANTLR end "rule__NewClass__Group__3"


    // $ANTLR start "rule__NewClass__Group__3__Impl"
    // InternalAle.g:2155:1: rule__NewClass__Group__3__Impl : ( ( rule__NewClass__Group_3__0 )? ) ;
    public final void rule__NewClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2159:1: ( ( ( rule__NewClass__Group_3__0 )? ) )
            // InternalAle.g:2160:1: ( ( rule__NewClass__Group_3__0 )? )
            {
            // InternalAle.g:2160:1: ( ( rule__NewClass__Group_3__0 )? )
            // InternalAle.g:2161:2: ( rule__NewClass__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getGroup_3()); 
            }
            // InternalAle.g:2162:2: ( rule__NewClass__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAle.g:2162:3: rule__NewClass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewClass__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getGroup_3()); 
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
    // $ANTLR end "rule__NewClass__Group__3__Impl"


    // $ANTLR start "rule__NewClass__Group__4"
    // InternalAle.g:2170:1: rule__NewClass__Group__4 : rule__NewClass__Group__4__Impl ;
    public final void rule__NewClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2174:1: ( rule__NewClass__Group__4__Impl )
            // InternalAle.g:2175:2: rule__NewClass__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewClass__Group__4__Impl();

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
    // $ANTLR end "rule__NewClass__Group__4"


    // $ANTLR start "rule__NewClass__Group__4__Impl"
    // InternalAle.g:2181:1: rule__NewClass__Group__4__Impl : ( ( rule__NewClass__Group_4__0 ) ) ;
    public final void rule__NewClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2185:1: ( ( ( rule__NewClass__Group_4__0 ) ) )
            // InternalAle.g:2186:1: ( ( rule__NewClass__Group_4__0 ) )
            {
            // InternalAle.g:2186:1: ( ( rule__NewClass__Group_4__0 ) )
            // InternalAle.g:2187:2: ( rule__NewClass__Group_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getGroup_4()); 
            }
            // InternalAle.g:2188:2: ( rule__NewClass__Group_4__0 )
            // InternalAle.g:2188:3: rule__NewClass__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__NewClass__Group_4__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getGroup_4()); 
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
    // $ANTLR end "rule__NewClass__Group__4__Impl"


    // $ANTLR start "rule__NewClass__Group_3__0"
    // InternalAle.g:2197:1: rule__NewClass__Group_3__0 : rule__NewClass__Group_3__0__Impl rule__NewClass__Group_3__1 ;
    public final void rule__NewClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2201:1: ( rule__NewClass__Group_3__0__Impl rule__NewClass__Group_3__1 )
            // InternalAle.g:2202:2: rule__NewClass__Group_3__0__Impl rule__NewClass__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__NewClass__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NewClass__Group_3__1();

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
    // $ANTLR end "rule__NewClass__Group_3__0"


    // $ANTLR start "rule__NewClass__Group_3__0__Impl"
    // InternalAle.g:2209:1: rule__NewClass__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__NewClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2213:1: ( ( 'extends' ) )
            // InternalAle.g:2214:1: ( 'extends' )
            {
            // InternalAle.g:2214:1: ( 'extends' )
            // InternalAle.g:2215:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getExtendsKeyword_3_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getExtendsKeyword_3_0()); 
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
    // $ANTLR end "rule__NewClass__Group_3__0__Impl"


    // $ANTLR start "rule__NewClass__Group_3__1"
    // InternalAle.g:2224:1: rule__NewClass__Group_3__1 : rule__NewClass__Group_3__1__Impl rule__NewClass__Group_3__2 ;
    public final void rule__NewClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2228:1: ( rule__NewClass__Group_3__1__Impl rule__NewClass__Group_3__2 )
            // InternalAle.g:2229:2: rule__NewClass__Group_3__1__Impl rule__NewClass__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__NewClass__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NewClass__Group_3__2();

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
    // $ANTLR end "rule__NewClass__Group_3__1"


    // $ANTLR start "rule__NewClass__Group_3__1__Impl"
    // InternalAle.g:2236:1: rule__NewClass__Group_3__1__Impl : ( ( rule__NewClass__SuperClassAssignment_3_1 ) ) ;
    public final void rule__NewClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2240:1: ( ( ( rule__NewClass__SuperClassAssignment_3_1 ) ) )
            // InternalAle.g:2241:1: ( ( rule__NewClass__SuperClassAssignment_3_1 ) )
            {
            // InternalAle.g:2241:1: ( ( rule__NewClass__SuperClassAssignment_3_1 ) )
            // InternalAle.g:2242:2: ( rule__NewClass__SuperClassAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getSuperClassAssignment_3_1()); 
            }
            // InternalAle.g:2243:2: ( rule__NewClass__SuperClassAssignment_3_1 )
            // InternalAle.g:2243:3: rule__NewClass__SuperClassAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NewClass__SuperClassAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getSuperClassAssignment_3_1()); 
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
    // $ANTLR end "rule__NewClass__Group_3__1__Impl"


    // $ANTLR start "rule__NewClass__Group_3__2"
    // InternalAle.g:2251:1: rule__NewClass__Group_3__2 : rule__NewClass__Group_3__2__Impl ;
    public final void rule__NewClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2255:1: ( rule__NewClass__Group_3__2__Impl )
            // InternalAle.g:2256:2: rule__NewClass__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewClass__Group_3__2__Impl();

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
    // $ANTLR end "rule__NewClass__Group_3__2"


    // $ANTLR start "rule__NewClass__Group_3__2__Impl"
    // InternalAle.g:2262:1: rule__NewClass__Group_3__2__Impl : ( ( rule__NewClass__Group_3_2__0 )* ) ;
    public final void rule__NewClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2266:1: ( ( ( rule__NewClass__Group_3_2__0 )* ) )
            // InternalAle.g:2267:1: ( ( rule__NewClass__Group_3_2__0 )* )
            {
            // InternalAle.g:2267:1: ( ( rule__NewClass__Group_3_2__0 )* )
            // InternalAle.g:2268:2: ( rule__NewClass__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getGroup_3_2()); 
            }
            // InternalAle.g:2269:2: ( rule__NewClass__Group_3_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAle.g:2269:3: rule__NewClass__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__NewClass__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getGroup_3_2()); 
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
    // $ANTLR end "rule__NewClass__Group_3__2__Impl"


    // $ANTLR start "rule__NewClass__Group_3_2__0"
    // InternalAle.g:2278:1: rule__NewClass__Group_3_2__0 : rule__NewClass__Group_3_2__0__Impl rule__NewClass__Group_3_2__1 ;
    public final void rule__NewClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2282:1: ( rule__NewClass__Group_3_2__0__Impl rule__NewClass__Group_3_2__1 )
            // InternalAle.g:2283:2: rule__NewClass__Group_3_2__0__Impl rule__NewClass__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__NewClass__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NewClass__Group_3_2__1();

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
    // $ANTLR end "rule__NewClass__Group_3_2__0"


    // $ANTLR start "rule__NewClass__Group_3_2__0__Impl"
    // InternalAle.g:2290:1: rule__NewClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__NewClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2294:1: ( ( ',' ) )
            // InternalAle.g:2295:1: ( ',' )
            {
            // InternalAle.g:2295:1: ( ',' )
            // InternalAle.g:2296:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getCommaKeyword_3_2_0()); 
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
    // $ANTLR end "rule__NewClass__Group_3_2__0__Impl"


    // $ANTLR start "rule__NewClass__Group_3_2__1"
    // InternalAle.g:2305:1: rule__NewClass__Group_3_2__1 : rule__NewClass__Group_3_2__1__Impl ;
    public final void rule__NewClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2309:1: ( rule__NewClass__Group_3_2__1__Impl )
            // InternalAle.g:2310:2: rule__NewClass__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewClass__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__NewClass__Group_3_2__1"


    // $ANTLR start "rule__NewClass__Group_3_2__1__Impl"
    // InternalAle.g:2316:1: rule__NewClass__Group_3_2__1__Impl : ( ( rule__NewClass__SuperClassAssignment_3_2_1 ) ) ;
    public final void rule__NewClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2320:1: ( ( ( rule__NewClass__SuperClassAssignment_3_2_1 ) ) )
            // InternalAle.g:2321:1: ( ( rule__NewClass__SuperClassAssignment_3_2_1 ) )
            {
            // InternalAle.g:2321:1: ( ( rule__NewClass__SuperClassAssignment_3_2_1 ) )
            // InternalAle.g:2322:2: ( rule__NewClass__SuperClassAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getSuperClassAssignment_3_2_1()); 
            }
            // InternalAle.g:2323:2: ( rule__NewClass__SuperClassAssignment_3_2_1 )
            // InternalAle.g:2323:3: rule__NewClass__SuperClassAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NewClass__SuperClassAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getSuperClassAssignment_3_2_1()); 
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
    // $ANTLR end "rule__NewClass__Group_3_2__1__Impl"


    // $ANTLR start "rule__NewClass__Group_4__0"
    // InternalAle.g:2332:1: rule__NewClass__Group_4__0 : rule__NewClass__Group_4__0__Impl rule__NewClass__Group_4__1 ;
    public final void rule__NewClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2336:1: ( rule__NewClass__Group_4__0__Impl rule__NewClass__Group_4__1 )
            // InternalAle.g:2337:2: rule__NewClass__Group_4__0__Impl rule__NewClass__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__NewClass__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NewClass__Group_4__1();

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
    // $ANTLR end "rule__NewClass__Group_4__0"


    // $ANTLR start "rule__NewClass__Group_4__0__Impl"
    // InternalAle.g:2344:1: rule__NewClass__Group_4__0__Impl : ( '{' ) ;
    public final void rule__NewClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2348:1: ( ( '{' ) )
            // InternalAle.g:2349:1: ( '{' )
            {
            // InternalAle.g:2349:1: ( '{' )
            // InternalAle.g:2350:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getLeftCurlyBracketKeyword_4_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getLeftCurlyBracketKeyword_4_0()); 
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
    // $ANTLR end "rule__NewClass__Group_4__0__Impl"


    // $ANTLR start "rule__NewClass__Group_4__1"
    // InternalAle.g:2359:1: rule__NewClass__Group_4__1 : rule__NewClass__Group_4__1__Impl rule__NewClass__Group_4__2 ;
    public final void rule__NewClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2363:1: ( rule__NewClass__Group_4__1__Impl rule__NewClass__Group_4__2 )
            // InternalAle.g:2364:2: rule__NewClass__Group_4__1__Impl rule__NewClass__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__NewClass__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NewClass__Group_4__2();

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
    // $ANTLR end "rule__NewClass__Group_4__1"


    // $ANTLR start "rule__NewClass__Group_4__1__Impl"
    // InternalAle.g:2371:1: rule__NewClass__Group_4__1__Impl : ( ( rule__NewClass__FieldsAssignment_4_1 )* ) ;
    public final void rule__NewClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2375:1: ( ( ( rule__NewClass__FieldsAssignment_4_1 )* ) )
            // InternalAle.g:2376:1: ( ( rule__NewClass__FieldsAssignment_4_1 )* )
            {
            // InternalAle.g:2376:1: ( ( rule__NewClass__FieldsAssignment_4_1 )* )
            // InternalAle.g:2377:2: ( rule__NewClass__FieldsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getFieldsAssignment_4_1()); 
            }
            // InternalAle.g:2378:2: ( rule__NewClass__FieldsAssignment_4_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=15 && LA23_0<=23)||(LA23_0>=69 && LA23_0<=70)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAle.g:2378:3: rule__NewClass__FieldsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__NewClass__FieldsAssignment_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getFieldsAssignment_4_1()); 
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
    // $ANTLR end "rule__NewClass__Group_4__1__Impl"


    // $ANTLR start "rule__NewClass__Group_4__2"
    // InternalAle.g:2386:1: rule__NewClass__Group_4__2 : rule__NewClass__Group_4__2__Impl rule__NewClass__Group_4__3 ;
    public final void rule__NewClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2390:1: ( rule__NewClass__Group_4__2__Impl rule__NewClass__Group_4__3 )
            // InternalAle.g:2391:2: rule__NewClass__Group_4__2__Impl rule__NewClass__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__NewClass__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NewClass__Group_4__3();

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
    // $ANTLR end "rule__NewClass__Group_4__2"


    // $ANTLR start "rule__NewClass__Group_4__2__Impl"
    // InternalAle.g:2398:1: rule__NewClass__Group_4__2__Impl : ( ( rule__NewClass__MethodsAssignment_4_2 )* ) ;
    public final void rule__NewClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2402:1: ( ( ( rule__NewClass__MethodsAssignment_4_2 )* ) )
            // InternalAle.g:2403:1: ( ( rule__NewClass__MethodsAssignment_4_2 )* )
            {
            // InternalAle.g:2403:1: ( ( rule__NewClass__MethodsAssignment_4_2 )* )
            // InternalAle.g:2404:2: ( rule__NewClass__MethodsAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getMethodsAssignment_4_2()); 
            }
            // InternalAle.g:2405:2: ( rule__NewClass__MethodsAssignment_4_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==28||LA24_0==35||LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAle.g:2405:3: rule__NewClass__MethodsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__NewClass__MethodsAssignment_4_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getMethodsAssignment_4_2()); 
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
    // $ANTLR end "rule__NewClass__Group_4__2__Impl"


    // $ANTLR start "rule__NewClass__Group_4__3"
    // InternalAle.g:2413:1: rule__NewClass__Group_4__3 : rule__NewClass__Group_4__3__Impl ;
    public final void rule__NewClass__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2417:1: ( rule__NewClass__Group_4__3__Impl )
            // InternalAle.g:2418:2: rule__NewClass__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewClass__Group_4__3__Impl();

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
    // $ANTLR end "rule__NewClass__Group_4__3"


    // $ANTLR start "rule__NewClass__Group_4__3__Impl"
    // InternalAle.g:2424:1: rule__NewClass__Group_4__3__Impl : ( '}' ) ;
    public final void rule__NewClass__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2428:1: ( ( '}' ) )
            // InternalAle.g:2429:1: ( '}' )
            {
            // InternalAle.g:2429:1: ( '}' )
            // InternalAle.g:2430:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getRightCurlyBracketKeyword_4_3()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getRightCurlyBracketKeyword_4_3()); 
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
    // $ANTLR end "rule__NewClass__Group_4__3__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalAle.g:2440:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2444:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalAle.g:2445:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalAle.g:2452:1: rule__Field__Group__0__Impl : ( ( rule__Field__TypeAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2456:1: ( ( ( rule__Field__TypeAssignment_0 ) ) )
            // InternalAle.g:2457:1: ( ( rule__Field__TypeAssignment_0 ) )
            {
            // InternalAle.g:2457:1: ( ( rule__Field__TypeAssignment_0 ) )
            // InternalAle.g:2458:2: ( rule__Field__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_0()); 
            }
            // InternalAle.g:2459:2: ( rule__Field__TypeAssignment_0 )
            // InternalAle.g:2459:3: rule__Field__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalAle.g:2467:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2471:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalAle.g:2472:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalAle.g:2479:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2483:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // InternalAle.g:2484:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // InternalAle.g:2484:1: ( ( rule__Field__NameAssignment_1 ) )
            // InternalAle.g:2485:2: ( rule__Field__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            }
            // InternalAle.g:2486:2: ( rule__Field__NameAssignment_1 )
            // InternalAle.g:2486:3: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalAle.g:2494:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2498:1: ( rule__Field__Group__2__Impl )
            // InternalAle.g:2499:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__2__Impl();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalAle.g:2505:1: rule__Field__Group__2__Impl : ( ';' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2509:1: ( ( ';' ) )
            // InternalAle.g:2510:1: ( ';' )
            {
            // InternalAle.g:2510:1: ( ';' )
            // InternalAle.g:2511:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getSemicolonKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__DefMethod__Group__0"
    // InternalAle.g:2521:1: rule__DefMethod__Group__0 : rule__DefMethod__Group__0__Impl rule__DefMethod__Group__1 ;
    public final void rule__DefMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2525:1: ( rule__DefMethod__Group__0__Impl rule__DefMethod__Group__1 )
            // InternalAle.g:2526:2: rule__DefMethod__Group__0__Impl rule__DefMethod__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__DefMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group__1();

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
    // $ANTLR end "rule__DefMethod__Group__0"


    // $ANTLR start "rule__DefMethod__Group__0__Impl"
    // InternalAle.g:2533:1: rule__DefMethod__Group__0__Impl : ( ( rule__DefMethod__TagsAssignment_0 )* ) ;
    public final void rule__DefMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2537:1: ( ( ( rule__DefMethod__TagsAssignment_0 )* ) )
            // InternalAle.g:2538:1: ( ( rule__DefMethod__TagsAssignment_0 )* )
            {
            // InternalAle.g:2538:1: ( ( rule__DefMethod__TagsAssignment_0 )* )
            // InternalAle.g:2539:2: ( rule__DefMethod__TagsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getTagsAssignment_0()); 
            }
            // InternalAle.g:2540:2: ( rule__DefMethod__TagsAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAle.g:2540:3: rule__DefMethod__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__DefMethod__TagsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getTagsAssignment_0()); 
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
    // $ANTLR end "rule__DefMethod__Group__0__Impl"


    // $ANTLR start "rule__DefMethod__Group__1"
    // InternalAle.g:2548:1: rule__DefMethod__Group__1 : rule__DefMethod__Group__1__Impl rule__DefMethod__Group__2 ;
    public final void rule__DefMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2552:1: ( rule__DefMethod__Group__1__Impl rule__DefMethod__Group__2 )
            // InternalAle.g:2553:2: rule__DefMethod__Group__1__Impl rule__DefMethod__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__DefMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group__2();

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
    // $ANTLR end "rule__DefMethod__Group__1"


    // $ANTLR start "rule__DefMethod__Group__1__Impl"
    // InternalAle.g:2560:1: rule__DefMethod__Group__1__Impl : ( 'def' ) ;
    public final void rule__DefMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2564:1: ( ( 'def' ) )
            // InternalAle.g:2565:1: ( 'def' )
            {
            // InternalAle.g:2565:1: ( 'def' )
            // InternalAle.g:2566:2: 'def'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getDefKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getDefKeyword_1()); 
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
    // $ANTLR end "rule__DefMethod__Group__1__Impl"


    // $ANTLR start "rule__DefMethod__Group__2"
    // InternalAle.g:2575:1: rule__DefMethod__Group__2 : rule__DefMethod__Group__2__Impl rule__DefMethod__Group__3 ;
    public final void rule__DefMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2579:1: ( rule__DefMethod__Group__2__Impl rule__DefMethod__Group__3 )
            // InternalAle.g:2580:2: rule__DefMethod__Group__2__Impl rule__DefMethod__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__DefMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group__3();

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
    // $ANTLR end "rule__DefMethod__Group__2"


    // $ANTLR start "rule__DefMethod__Group__2__Impl"
    // InternalAle.g:2587:1: rule__DefMethod__Group__2__Impl : ( ( rule__DefMethod__Alternatives_2 ) ) ;
    public final void rule__DefMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2591:1: ( ( ( rule__DefMethod__Alternatives_2 ) ) )
            // InternalAle.g:2592:1: ( ( rule__DefMethod__Alternatives_2 ) )
            {
            // InternalAle.g:2592:1: ( ( rule__DefMethod__Alternatives_2 ) )
            // InternalAle.g:2593:2: ( rule__DefMethod__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getAlternatives_2()); 
            }
            // InternalAle.g:2594:2: ( rule__DefMethod__Alternatives_2 )
            // InternalAle.g:2594:3: rule__DefMethod__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__DefMethod__Group__2__Impl"


    // $ANTLR start "rule__DefMethod__Group__3"
    // InternalAle.g:2602:1: rule__DefMethod__Group__3 : rule__DefMethod__Group__3__Impl rule__DefMethod__Group__4 ;
    public final void rule__DefMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2606:1: ( rule__DefMethod__Group__3__Impl rule__DefMethod__Group__4 )
            // InternalAle.g:2607:2: rule__DefMethod__Group__3__Impl rule__DefMethod__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__DefMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group__4();

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
    // $ANTLR end "rule__DefMethod__Group__3"


    // $ANTLR start "rule__DefMethod__Group__3__Impl"
    // InternalAle.g:2614:1: rule__DefMethod__Group__3__Impl : ( ( rule__DefMethod__NameAssignment_3 ) ) ;
    public final void rule__DefMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2618:1: ( ( ( rule__DefMethod__NameAssignment_3 ) ) )
            // InternalAle.g:2619:1: ( ( rule__DefMethod__NameAssignment_3 ) )
            {
            // InternalAle.g:2619:1: ( ( rule__DefMethod__NameAssignment_3 ) )
            // InternalAle.g:2620:2: ( rule__DefMethod__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getNameAssignment_3()); 
            }
            // InternalAle.g:2621:2: ( rule__DefMethod__NameAssignment_3 )
            // InternalAle.g:2621:3: rule__DefMethod__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__DefMethod__Group__3__Impl"


    // $ANTLR start "rule__DefMethod__Group__4"
    // InternalAle.g:2629:1: rule__DefMethod__Group__4 : rule__DefMethod__Group__4__Impl rule__DefMethod__Group__5 ;
    public final void rule__DefMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2633:1: ( rule__DefMethod__Group__4__Impl rule__DefMethod__Group__5 )
            // InternalAle.g:2634:2: rule__DefMethod__Group__4__Impl rule__DefMethod__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__DefMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group__5();

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
    // $ANTLR end "rule__DefMethod__Group__4"


    // $ANTLR start "rule__DefMethod__Group__4__Impl"
    // InternalAle.g:2641:1: rule__DefMethod__Group__4__Impl : ( ( rule__DefMethod__Group_4__0 ) ) ;
    public final void rule__DefMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2645:1: ( ( ( rule__DefMethod__Group_4__0 ) ) )
            // InternalAle.g:2646:1: ( ( rule__DefMethod__Group_4__0 ) )
            {
            // InternalAle.g:2646:1: ( ( rule__DefMethod__Group_4__0 ) )
            // InternalAle.g:2647:2: ( rule__DefMethod__Group_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getGroup_4()); 
            }
            // InternalAle.g:2648:2: ( rule__DefMethod__Group_4__0 )
            // InternalAle.g:2648:3: rule__DefMethod__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_4__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getGroup_4()); 
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
    // $ANTLR end "rule__DefMethod__Group__4__Impl"


    // $ANTLR start "rule__DefMethod__Group__5"
    // InternalAle.g:2656:1: rule__DefMethod__Group__5 : rule__DefMethod__Group__5__Impl ;
    public final void rule__DefMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2660:1: ( rule__DefMethod__Group__5__Impl )
            // InternalAle.g:2661:2: rule__DefMethod__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group__5__Impl();

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
    // $ANTLR end "rule__DefMethod__Group__5"


    // $ANTLR start "rule__DefMethod__Group__5__Impl"
    // InternalAle.g:2667:1: rule__DefMethod__Group__5__Impl : ( ( rule__DefMethod__BlockAssignment_5 ) ) ;
    public final void rule__DefMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2671:1: ( ( ( rule__DefMethod__BlockAssignment_5 ) ) )
            // InternalAle.g:2672:1: ( ( rule__DefMethod__BlockAssignment_5 ) )
            {
            // InternalAle.g:2672:1: ( ( rule__DefMethod__BlockAssignment_5 ) )
            // InternalAle.g:2673:2: ( rule__DefMethod__BlockAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getBlockAssignment_5()); 
            }
            // InternalAle.g:2674:2: ( rule__DefMethod__BlockAssignment_5 )
            // InternalAle.g:2674:3: rule__DefMethod__BlockAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__BlockAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getBlockAssignment_5()); 
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
    // $ANTLR end "rule__DefMethod__Group__5__Impl"


    // $ANTLR start "rule__DefMethod__Group_4__0"
    // InternalAle.g:2683:1: rule__DefMethod__Group_4__0 : rule__DefMethod__Group_4__0__Impl rule__DefMethod__Group_4__1 ;
    public final void rule__DefMethod__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2687:1: ( rule__DefMethod__Group_4__0__Impl rule__DefMethod__Group_4__1 )
            // InternalAle.g:2688:2: rule__DefMethod__Group_4__0__Impl rule__DefMethod__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__DefMethod__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_4__1();

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
    // $ANTLR end "rule__DefMethod__Group_4__0"


    // $ANTLR start "rule__DefMethod__Group_4__0__Impl"
    // InternalAle.g:2695:1: rule__DefMethod__Group_4__0__Impl : ( '(' ) ;
    public final void rule__DefMethod__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2699:1: ( ( '(' ) )
            // InternalAle.g:2700:1: ( '(' )
            {
            // InternalAle.g:2700:1: ( '(' )
            // InternalAle.g:2701:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getLeftParenthesisKeyword_4_0()); 
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
    // $ANTLR end "rule__DefMethod__Group_4__0__Impl"


    // $ANTLR start "rule__DefMethod__Group_4__1"
    // InternalAle.g:2710:1: rule__DefMethod__Group_4__1 : rule__DefMethod__Group_4__1__Impl rule__DefMethod__Group_4__2 ;
    public final void rule__DefMethod__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2714:1: ( rule__DefMethod__Group_4__1__Impl rule__DefMethod__Group_4__2 )
            // InternalAle.g:2715:2: rule__DefMethod__Group_4__1__Impl rule__DefMethod__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__DefMethod__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_4__2();

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
    // $ANTLR end "rule__DefMethod__Group_4__1"


    // $ANTLR start "rule__DefMethod__Group_4__1__Impl"
    // InternalAle.g:2722:1: rule__DefMethod__Group_4__1__Impl : ( ( rule__DefMethod__Group_4_1__0 )? ) ;
    public final void rule__DefMethod__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2726:1: ( ( ( rule__DefMethod__Group_4_1__0 )? ) )
            // InternalAle.g:2727:1: ( ( rule__DefMethod__Group_4_1__0 )? )
            {
            // InternalAle.g:2727:1: ( ( rule__DefMethod__Group_4_1__0 )? )
            // InternalAle.g:2728:2: ( rule__DefMethod__Group_4_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getGroup_4_1()); 
            }
            // InternalAle.g:2729:2: ( rule__DefMethod__Group_4_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||(LA26_0>=15 && LA26_0<=23)||(LA26_0>=69 && LA26_0<=70)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAle.g:2729:3: rule__DefMethod__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefMethod__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getGroup_4_1()); 
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
    // $ANTLR end "rule__DefMethod__Group_4__1__Impl"


    // $ANTLR start "rule__DefMethod__Group_4__2"
    // InternalAle.g:2737:1: rule__DefMethod__Group_4__2 : rule__DefMethod__Group_4__2__Impl ;
    public final void rule__DefMethod__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2741:1: ( rule__DefMethod__Group_4__2__Impl )
            // InternalAle.g:2742:2: rule__DefMethod__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_4__2__Impl();

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
    // $ANTLR end "rule__DefMethod__Group_4__2"


    // $ANTLR start "rule__DefMethod__Group_4__2__Impl"
    // InternalAle.g:2748:1: rule__DefMethod__Group_4__2__Impl : ( ')' ) ;
    public final void rule__DefMethod__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2752:1: ( ( ')' ) )
            // InternalAle.g:2753:1: ( ')' )
            {
            // InternalAle.g:2753:1: ( ')' )
            // InternalAle.g:2754:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getRightParenthesisKeyword_4_2()); 
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
    // $ANTLR end "rule__DefMethod__Group_4__2__Impl"


    // $ANTLR start "rule__DefMethod__Group_4_1__0"
    // InternalAle.g:2764:1: rule__DefMethod__Group_4_1__0 : rule__DefMethod__Group_4_1__0__Impl rule__DefMethod__Group_4_1__1 ;
    public final void rule__DefMethod__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2768:1: ( rule__DefMethod__Group_4_1__0__Impl rule__DefMethod__Group_4_1__1 )
            // InternalAle.g:2769:2: rule__DefMethod__Group_4_1__0__Impl rule__DefMethod__Group_4_1__1
            {
            pushFollow(FOLLOW_12);
            rule__DefMethod__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_4_1__1();

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
    // $ANTLR end "rule__DefMethod__Group_4_1__0"


    // $ANTLR start "rule__DefMethod__Group_4_1__0__Impl"
    // InternalAle.g:2776:1: rule__DefMethod__Group_4_1__0__Impl : ( ( rule__DefMethod__ParamsAssignment_4_1_0 ) ) ;
    public final void rule__DefMethod__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2780:1: ( ( ( rule__DefMethod__ParamsAssignment_4_1_0 ) ) )
            // InternalAle.g:2781:1: ( ( rule__DefMethod__ParamsAssignment_4_1_0 ) )
            {
            // InternalAle.g:2781:1: ( ( rule__DefMethod__ParamsAssignment_4_1_0 ) )
            // InternalAle.g:2782:2: ( rule__DefMethod__ParamsAssignment_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getParamsAssignment_4_1_0()); 
            }
            // InternalAle.g:2783:2: ( rule__DefMethod__ParamsAssignment_4_1_0 )
            // InternalAle.g:2783:3: rule__DefMethod__ParamsAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__ParamsAssignment_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getParamsAssignment_4_1_0()); 
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
    // $ANTLR end "rule__DefMethod__Group_4_1__0__Impl"


    // $ANTLR start "rule__DefMethod__Group_4_1__1"
    // InternalAle.g:2791:1: rule__DefMethod__Group_4_1__1 : rule__DefMethod__Group_4_1__1__Impl ;
    public final void rule__DefMethod__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2795:1: ( rule__DefMethod__Group_4_1__1__Impl )
            // InternalAle.g:2796:2: rule__DefMethod__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__DefMethod__Group_4_1__1"


    // $ANTLR start "rule__DefMethod__Group_4_1__1__Impl"
    // InternalAle.g:2802:1: rule__DefMethod__Group_4_1__1__Impl : ( ( rule__DefMethod__Group_4_1_1__0 )* ) ;
    public final void rule__DefMethod__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2806:1: ( ( ( rule__DefMethod__Group_4_1_1__0 )* ) )
            // InternalAle.g:2807:1: ( ( rule__DefMethod__Group_4_1_1__0 )* )
            {
            // InternalAle.g:2807:1: ( ( rule__DefMethod__Group_4_1_1__0 )* )
            // InternalAle.g:2808:2: ( rule__DefMethod__Group_4_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getGroup_4_1_1()); 
            }
            // InternalAle.g:2809:2: ( rule__DefMethod__Group_4_1_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==32) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAle.g:2809:3: rule__DefMethod__Group_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DefMethod__Group_4_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getGroup_4_1_1()); 
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
    // $ANTLR end "rule__DefMethod__Group_4_1__1__Impl"


    // $ANTLR start "rule__DefMethod__Group_4_1_1__0"
    // InternalAle.g:2818:1: rule__DefMethod__Group_4_1_1__0 : rule__DefMethod__Group_4_1_1__0__Impl rule__DefMethod__Group_4_1_1__1 ;
    public final void rule__DefMethod__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2822:1: ( rule__DefMethod__Group_4_1_1__0__Impl rule__DefMethod__Group_4_1_1__1 )
            // InternalAle.g:2823:2: rule__DefMethod__Group_4_1_1__0__Impl rule__DefMethod__Group_4_1_1__1
            {
            pushFollow(FOLLOW_24);
            rule__DefMethod__Group_4_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_4_1_1__1();

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
    // $ANTLR end "rule__DefMethod__Group_4_1_1__0"


    // $ANTLR start "rule__DefMethod__Group_4_1_1__0__Impl"
    // InternalAle.g:2830:1: rule__DefMethod__Group_4_1_1__0__Impl : ( ',' ) ;
    public final void rule__DefMethod__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2834:1: ( ( ',' ) )
            // InternalAle.g:2835:1: ( ',' )
            {
            // InternalAle.g:2835:1: ( ',' )
            // InternalAle.g:2836:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getCommaKeyword_4_1_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getCommaKeyword_4_1_1_0()); 
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
    // $ANTLR end "rule__DefMethod__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__DefMethod__Group_4_1_1__1"
    // InternalAle.g:2845:1: rule__DefMethod__Group_4_1_1__1 : rule__DefMethod__Group_4_1_1__1__Impl ;
    public final void rule__DefMethod__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2849:1: ( rule__DefMethod__Group_4_1_1__1__Impl )
            // InternalAle.g:2850:2: rule__DefMethod__Group_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_4_1_1__1__Impl();

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
    // $ANTLR end "rule__DefMethod__Group_4_1_1__1"


    // $ANTLR start "rule__DefMethod__Group_4_1_1__1__Impl"
    // InternalAle.g:2856:1: rule__DefMethod__Group_4_1_1__1__Impl : ( ( rule__DefMethod__ParamsAssignment_4_1_1_1 ) ) ;
    public final void rule__DefMethod__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2860:1: ( ( ( rule__DefMethod__ParamsAssignment_4_1_1_1 ) ) )
            // InternalAle.g:2861:1: ( ( rule__DefMethod__ParamsAssignment_4_1_1_1 ) )
            {
            // InternalAle.g:2861:1: ( ( rule__DefMethod__ParamsAssignment_4_1_1_1 ) )
            // InternalAle.g:2862:2: ( rule__DefMethod__ParamsAssignment_4_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getParamsAssignment_4_1_1_1()); 
            }
            // InternalAle.g:2863:2: ( rule__DefMethod__ParamsAssignment_4_1_1_1 )
            // InternalAle.g:2863:3: rule__DefMethod__ParamsAssignment_4_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__ParamsAssignment_4_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getParamsAssignment_4_1_1_1()); 
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
    // $ANTLR end "rule__DefMethod__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__OverrideMethod__Group__0"
    // InternalAle.g:2872:1: rule__OverrideMethod__Group__0 : rule__OverrideMethod__Group__0__Impl rule__OverrideMethod__Group__1 ;
    public final void rule__OverrideMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2876:1: ( rule__OverrideMethod__Group__0__Impl rule__OverrideMethod__Group__1 )
            // InternalAle.g:2877:2: rule__OverrideMethod__Group__0__Impl rule__OverrideMethod__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__OverrideMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group__1();

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
    // $ANTLR end "rule__OverrideMethod__Group__0"


    // $ANTLR start "rule__OverrideMethod__Group__0__Impl"
    // InternalAle.g:2884:1: rule__OverrideMethod__Group__0__Impl : ( ( rule__OverrideMethod__TagsAssignment_0 )* ) ;
    public final void rule__OverrideMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2888:1: ( ( ( rule__OverrideMethod__TagsAssignment_0 )* ) )
            // InternalAle.g:2889:1: ( ( rule__OverrideMethod__TagsAssignment_0 )* )
            {
            // InternalAle.g:2889:1: ( ( rule__OverrideMethod__TagsAssignment_0 )* )
            // InternalAle.g:2890:2: ( rule__OverrideMethod__TagsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getTagsAssignment_0()); 
            }
            // InternalAle.g:2891:2: ( rule__OverrideMethod__TagsAssignment_0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==28) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAle.g:2891:3: rule__OverrideMethod__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__OverrideMethod__TagsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getTagsAssignment_0()); 
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
    // $ANTLR end "rule__OverrideMethod__Group__0__Impl"


    // $ANTLR start "rule__OverrideMethod__Group__1"
    // InternalAle.g:2899:1: rule__OverrideMethod__Group__1 : rule__OverrideMethod__Group__1__Impl rule__OverrideMethod__Group__2 ;
    public final void rule__OverrideMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2903:1: ( rule__OverrideMethod__Group__1__Impl rule__OverrideMethod__Group__2 )
            // InternalAle.g:2904:2: rule__OverrideMethod__Group__1__Impl rule__OverrideMethod__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__OverrideMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group__2();

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
    // $ANTLR end "rule__OverrideMethod__Group__1"


    // $ANTLR start "rule__OverrideMethod__Group__1__Impl"
    // InternalAle.g:2911:1: rule__OverrideMethod__Group__1__Impl : ( 'override' ) ;
    public final void rule__OverrideMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2915:1: ( ( 'override' ) )
            // InternalAle.g:2916:1: ( 'override' )
            {
            // InternalAle.g:2916:1: ( 'override' )
            // InternalAle.g:2917:2: 'override'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getOverrideKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getOverrideKeyword_1()); 
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
    // $ANTLR end "rule__OverrideMethod__Group__1__Impl"


    // $ANTLR start "rule__OverrideMethod__Group__2"
    // InternalAle.g:2926:1: rule__OverrideMethod__Group__2 : rule__OverrideMethod__Group__2__Impl rule__OverrideMethod__Group__3 ;
    public final void rule__OverrideMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2930:1: ( rule__OverrideMethod__Group__2__Impl rule__OverrideMethod__Group__3 )
            // InternalAle.g:2931:2: rule__OverrideMethod__Group__2__Impl rule__OverrideMethod__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__OverrideMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group__3();

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
    // $ANTLR end "rule__OverrideMethod__Group__2"


    // $ANTLR start "rule__OverrideMethod__Group__2__Impl"
    // InternalAle.g:2938:1: rule__OverrideMethod__Group__2__Impl : ( ( rule__OverrideMethod__TypeAssignment_2 ) ) ;
    public final void rule__OverrideMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2942:1: ( ( ( rule__OverrideMethod__TypeAssignment_2 ) ) )
            // InternalAle.g:2943:1: ( ( rule__OverrideMethod__TypeAssignment_2 ) )
            {
            // InternalAle.g:2943:1: ( ( rule__OverrideMethod__TypeAssignment_2 ) )
            // InternalAle.g:2944:2: ( rule__OverrideMethod__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getTypeAssignment_2()); 
            }
            // InternalAle.g:2945:2: ( rule__OverrideMethod__TypeAssignment_2 )
            // InternalAle.g:2945:3: rule__OverrideMethod__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getTypeAssignment_2()); 
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
    // $ANTLR end "rule__OverrideMethod__Group__2__Impl"


    // $ANTLR start "rule__OverrideMethod__Group__3"
    // InternalAle.g:2953:1: rule__OverrideMethod__Group__3 : rule__OverrideMethod__Group__3__Impl rule__OverrideMethod__Group__4 ;
    public final void rule__OverrideMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2957:1: ( rule__OverrideMethod__Group__3__Impl rule__OverrideMethod__Group__4 )
            // InternalAle.g:2958:2: rule__OverrideMethod__Group__3__Impl rule__OverrideMethod__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__OverrideMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group__4();

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
    // $ANTLR end "rule__OverrideMethod__Group__3"


    // $ANTLR start "rule__OverrideMethod__Group__3__Impl"
    // InternalAle.g:2965:1: rule__OverrideMethod__Group__3__Impl : ( ( rule__OverrideMethod__NameAssignment_3 ) ) ;
    public final void rule__OverrideMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2969:1: ( ( ( rule__OverrideMethod__NameAssignment_3 ) ) )
            // InternalAle.g:2970:1: ( ( rule__OverrideMethod__NameAssignment_3 ) )
            {
            // InternalAle.g:2970:1: ( ( rule__OverrideMethod__NameAssignment_3 ) )
            // InternalAle.g:2971:2: ( rule__OverrideMethod__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getNameAssignment_3()); 
            }
            // InternalAle.g:2972:2: ( rule__OverrideMethod__NameAssignment_3 )
            // InternalAle.g:2972:3: rule__OverrideMethod__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__OverrideMethod__Group__3__Impl"


    // $ANTLR start "rule__OverrideMethod__Group__4"
    // InternalAle.g:2980:1: rule__OverrideMethod__Group__4 : rule__OverrideMethod__Group__4__Impl rule__OverrideMethod__Group__5 ;
    public final void rule__OverrideMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2984:1: ( rule__OverrideMethod__Group__4__Impl rule__OverrideMethod__Group__5 )
            // InternalAle.g:2985:2: rule__OverrideMethod__Group__4__Impl rule__OverrideMethod__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__OverrideMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group__5();

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
    // $ANTLR end "rule__OverrideMethod__Group__4"


    // $ANTLR start "rule__OverrideMethod__Group__4__Impl"
    // InternalAle.g:2992:1: rule__OverrideMethod__Group__4__Impl : ( ( rule__OverrideMethod__Group_4__0 ) ) ;
    public final void rule__OverrideMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2996:1: ( ( ( rule__OverrideMethod__Group_4__0 ) ) )
            // InternalAle.g:2997:1: ( ( rule__OverrideMethod__Group_4__0 ) )
            {
            // InternalAle.g:2997:1: ( ( rule__OverrideMethod__Group_4__0 ) )
            // InternalAle.g:2998:2: ( rule__OverrideMethod__Group_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getGroup_4()); 
            }
            // InternalAle.g:2999:2: ( rule__OverrideMethod__Group_4__0 )
            // InternalAle.g:2999:3: rule__OverrideMethod__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_4__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getGroup_4()); 
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
    // $ANTLR end "rule__OverrideMethod__Group__4__Impl"


    // $ANTLR start "rule__OverrideMethod__Group__5"
    // InternalAle.g:3007:1: rule__OverrideMethod__Group__5 : rule__OverrideMethod__Group__5__Impl ;
    public final void rule__OverrideMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3011:1: ( rule__OverrideMethod__Group__5__Impl )
            // InternalAle.g:3012:2: rule__OverrideMethod__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group__5__Impl();

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
    // $ANTLR end "rule__OverrideMethod__Group__5"


    // $ANTLR start "rule__OverrideMethod__Group__5__Impl"
    // InternalAle.g:3018:1: rule__OverrideMethod__Group__5__Impl : ( ( rule__OverrideMethod__BlockAssignment_5 ) ) ;
    public final void rule__OverrideMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3022:1: ( ( ( rule__OverrideMethod__BlockAssignment_5 ) ) )
            // InternalAle.g:3023:1: ( ( rule__OverrideMethod__BlockAssignment_5 ) )
            {
            // InternalAle.g:3023:1: ( ( rule__OverrideMethod__BlockAssignment_5 ) )
            // InternalAle.g:3024:2: ( rule__OverrideMethod__BlockAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getBlockAssignment_5()); 
            }
            // InternalAle.g:3025:2: ( rule__OverrideMethod__BlockAssignment_5 )
            // InternalAle.g:3025:3: rule__OverrideMethod__BlockAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__BlockAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getBlockAssignment_5()); 
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
    // $ANTLR end "rule__OverrideMethod__Group__5__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_4__0"
    // InternalAle.g:3034:1: rule__OverrideMethod__Group_4__0 : rule__OverrideMethod__Group_4__0__Impl rule__OverrideMethod__Group_4__1 ;
    public final void rule__OverrideMethod__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3038:1: ( rule__OverrideMethod__Group_4__0__Impl rule__OverrideMethod__Group_4__1 )
            // InternalAle.g:3039:2: rule__OverrideMethod__Group_4__0__Impl rule__OverrideMethod__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__OverrideMethod__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_4__1();

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
    // $ANTLR end "rule__OverrideMethod__Group_4__0"


    // $ANTLR start "rule__OverrideMethod__Group_4__0__Impl"
    // InternalAle.g:3046:1: rule__OverrideMethod__Group_4__0__Impl : ( '(' ) ;
    public final void rule__OverrideMethod__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3050:1: ( ( '(' ) )
            // InternalAle.g:3051:1: ( '(' )
            {
            // InternalAle.g:3051:1: ( '(' )
            // InternalAle.g:3052:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getLeftParenthesisKeyword_4_0()); 
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
    // $ANTLR end "rule__OverrideMethod__Group_4__0__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_4__1"
    // InternalAle.g:3061:1: rule__OverrideMethod__Group_4__1 : rule__OverrideMethod__Group_4__1__Impl rule__OverrideMethod__Group_4__2 ;
    public final void rule__OverrideMethod__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3065:1: ( rule__OverrideMethod__Group_4__1__Impl rule__OverrideMethod__Group_4__2 )
            // InternalAle.g:3066:2: rule__OverrideMethod__Group_4__1__Impl rule__OverrideMethod__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__OverrideMethod__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_4__2();

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
    // $ANTLR end "rule__OverrideMethod__Group_4__1"


    // $ANTLR start "rule__OverrideMethod__Group_4__1__Impl"
    // InternalAle.g:3073:1: rule__OverrideMethod__Group_4__1__Impl : ( ( rule__OverrideMethod__Group_4_1__0 )? ) ;
    public final void rule__OverrideMethod__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3077:1: ( ( ( rule__OverrideMethod__Group_4_1__0 )? ) )
            // InternalAle.g:3078:1: ( ( rule__OverrideMethod__Group_4_1__0 )? )
            {
            // InternalAle.g:3078:1: ( ( rule__OverrideMethod__Group_4_1__0 )? )
            // InternalAle.g:3079:2: ( rule__OverrideMethod__Group_4_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getGroup_4_1()); 
            }
            // InternalAle.g:3080:2: ( rule__OverrideMethod__Group_4_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||(LA29_0>=15 && LA29_0<=23)||(LA29_0>=69 && LA29_0<=70)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAle.g:3080:3: rule__OverrideMethod__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OverrideMethod__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getGroup_4_1()); 
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
    // $ANTLR end "rule__OverrideMethod__Group_4__1__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_4__2"
    // InternalAle.g:3088:1: rule__OverrideMethod__Group_4__2 : rule__OverrideMethod__Group_4__2__Impl ;
    public final void rule__OverrideMethod__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3092:1: ( rule__OverrideMethod__Group_4__2__Impl )
            // InternalAle.g:3093:2: rule__OverrideMethod__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_4__2__Impl();

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
    // $ANTLR end "rule__OverrideMethod__Group_4__2"


    // $ANTLR start "rule__OverrideMethod__Group_4__2__Impl"
    // InternalAle.g:3099:1: rule__OverrideMethod__Group_4__2__Impl : ( ')' ) ;
    public final void rule__OverrideMethod__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3103:1: ( ( ')' ) )
            // InternalAle.g:3104:1: ( ')' )
            {
            // InternalAle.g:3104:1: ( ')' )
            // InternalAle.g:3105:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getRightParenthesisKeyword_4_2()); 
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
    // $ANTLR end "rule__OverrideMethod__Group_4__2__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_4_1__0"
    // InternalAle.g:3115:1: rule__OverrideMethod__Group_4_1__0 : rule__OverrideMethod__Group_4_1__0__Impl rule__OverrideMethod__Group_4_1__1 ;
    public final void rule__OverrideMethod__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3119:1: ( rule__OverrideMethod__Group_4_1__0__Impl rule__OverrideMethod__Group_4_1__1 )
            // InternalAle.g:3120:2: rule__OverrideMethod__Group_4_1__0__Impl rule__OverrideMethod__Group_4_1__1
            {
            pushFollow(FOLLOW_12);
            rule__OverrideMethod__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_4_1__1();

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
    // $ANTLR end "rule__OverrideMethod__Group_4_1__0"


    // $ANTLR start "rule__OverrideMethod__Group_4_1__0__Impl"
    // InternalAle.g:3127:1: rule__OverrideMethod__Group_4_1__0__Impl : ( ( rule__OverrideMethod__ParamsAssignment_4_1_0 ) ) ;
    public final void rule__OverrideMethod__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3131:1: ( ( ( rule__OverrideMethod__ParamsAssignment_4_1_0 ) ) )
            // InternalAle.g:3132:1: ( ( rule__OverrideMethod__ParamsAssignment_4_1_0 ) )
            {
            // InternalAle.g:3132:1: ( ( rule__OverrideMethod__ParamsAssignment_4_1_0 ) )
            // InternalAle.g:3133:2: ( rule__OverrideMethod__ParamsAssignment_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getParamsAssignment_4_1_0()); 
            }
            // InternalAle.g:3134:2: ( rule__OverrideMethod__ParamsAssignment_4_1_0 )
            // InternalAle.g:3134:3: rule__OverrideMethod__ParamsAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__ParamsAssignment_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getParamsAssignment_4_1_0()); 
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
    // $ANTLR end "rule__OverrideMethod__Group_4_1__0__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_4_1__1"
    // InternalAle.g:3142:1: rule__OverrideMethod__Group_4_1__1 : rule__OverrideMethod__Group_4_1__1__Impl ;
    public final void rule__OverrideMethod__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3146:1: ( rule__OverrideMethod__Group_4_1__1__Impl )
            // InternalAle.g:3147:2: rule__OverrideMethod__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__OverrideMethod__Group_4_1__1"


    // $ANTLR start "rule__OverrideMethod__Group_4_1__1__Impl"
    // InternalAle.g:3153:1: rule__OverrideMethod__Group_4_1__1__Impl : ( ( rule__OverrideMethod__Group_4_1_1__0 )* ) ;
    public final void rule__OverrideMethod__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3157:1: ( ( ( rule__OverrideMethod__Group_4_1_1__0 )* ) )
            // InternalAle.g:3158:1: ( ( rule__OverrideMethod__Group_4_1_1__0 )* )
            {
            // InternalAle.g:3158:1: ( ( rule__OverrideMethod__Group_4_1_1__0 )* )
            // InternalAle.g:3159:2: ( rule__OverrideMethod__Group_4_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getGroup_4_1_1()); 
            }
            // InternalAle.g:3160:2: ( rule__OverrideMethod__Group_4_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAle.g:3160:3: rule__OverrideMethod__Group_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OverrideMethod__Group_4_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getGroup_4_1_1()); 
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
    // $ANTLR end "rule__OverrideMethod__Group_4_1__1__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_4_1_1__0"
    // InternalAle.g:3169:1: rule__OverrideMethod__Group_4_1_1__0 : rule__OverrideMethod__Group_4_1_1__0__Impl rule__OverrideMethod__Group_4_1_1__1 ;
    public final void rule__OverrideMethod__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3173:1: ( rule__OverrideMethod__Group_4_1_1__0__Impl rule__OverrideMethod__Group_4_1_1__1 )
            // InternalAle.g:3174:2: rule__OverrideMethod__Group_4_1_1__0__Impl rule__OverrideMethod__Group_4_1_1__1
            {
            pushFollow(FOLLOW_24);
            rule__OverrideMethod__Group_4_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_4_1_1__1();

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
    // $ANTLR end "rule__OverrideMethod__Group_4_1_1__0"


    // $ANTLR start "rule__OverrideMethod__Group_4_1_1__0__Impl"
    // InternalAle.g:3181:1: rule__OverrideMethod__Group_4_1_1__0__Impl : ( ',' ) ;
    public final void rule__OverrideMethod__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3185:1: ( ( ',' ) )
            // InternalAle.g:3186:1: ( ',' )
            {
            // InternalAle.g:3186:1: ( ',' )
            // InternalAle.g:3187:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getCommaKeyword_4_1_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getCommaKeyword_4_1_1_0()); 
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
    // $ANTLR end "rule__OverrideMethod__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_4_1_1__1"
    // InternalAle.g:3196:1: rule__OverrideMethod__Group_4_1_1__1 : rule__OverrideMethod__Group_4_1_1__1__Impl ;
    public final void rule__OverrideMethod__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3200:1: ( rule__OverrideMethod__Group_4_1_1__1__Impl )
            // InternalAle.g:3201:2: rule__OverrideMethod__Group_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_4_1_1__1__Impl();

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
    // $ANTLR end "rule__OverrideMethod__Group_4_1_1__1"


    // $ANTLR start "rule__OverrideMethod__Group_4_1_1__1__Impl"
    // InternalAle.g:3207:1: rule__OverrideMethod__Group_4_1_1__1__Impl : ( ( rule__OverrideMethod__ParamsAssignment_4_1_1_1 ) ) ;
    public final void rule__OverrideMethod__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3211:1: ( ( ( rule__OverrideMethod__ParamsAssignment_4_1_1_1 ) ) )
            // InternalAle.g:3212:1: ( ( rule__OverrideMethod__ParamsAssignment_4_1_1_1 ) )
            {
            // InternalAle.g:3212:1: ( ( rule__OverrideMethod__ParamsAssignment_4_1_1_1 ) )
            // InternalAle.g:3213:2: ( rule__OverrideMethod__ParamsAssignment_4_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getParamsAssignment_4_1_1_1()); 
            }
            // InternalAle.g:3214:2: ( rule__OverrideMethod__ParamsAssignment_4_1_1_1 )
            // InternalAle.g:3214:3: rule__OverrideMethod__ParamsAssignment_4_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__ParamsAssignment_4_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getParamsAssignment_4_1_1_1()); 
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
    // $ANTLR end "rule__OverrideMethod__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalAle.g:3223:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3227:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalAle.g:3228:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

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
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalAle.g:3235:1: rule__Statement__Group_0__0__Impl : ( ruleVarAssign ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3239:1: ( ( ruleVarAssign ) )
            // InternalAle.g:3240:1: ( ruleVarAssign )
            {
            // InternalAle.g:3240:1: ( ruleVarAssign )
            // InternalAle.g:3241:2: ruleVarAssign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getVarAssignParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getVarAssignParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalAle.g:3250:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3254:1: ( rule__Statement__Group_0__1__Impl )
            // InternalAle.g:3255:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalAle.g:3261:1: rule__Statement__Group_0__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3265:1: ( ( ';' ) )
            // InternalAle.g:3266:1: ( ';' )
            {
            // InternalAle.g:3266:1: ( ';' )
            // InternalAle.g:3267:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_0_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_0_1()); 
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
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_4__0"
    // InternalAle.g:3277:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3281:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // InternalAle.g:3282:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__1();

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
    // $ANTLR end "rule__Statement__Group_4__0"


    // $ANTLR start "rule__Statement__Group_4__0__Impl"
    // InternalAle.g:3289:1: rule__Statement__Group_4__0__Impl : ( ruleLetStatement ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3293:1: ( ( ruleLetStatement ) )
            // InternalAle.g:3294:1: ( ruleLetStatement )
            {
            // InternalAle.g:3294:1: ( ruleLetStatement )
            // InternalAle.g:3295:2: ruleLetStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getLetStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLetStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getLetStatementParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Statement__Group_4__0__Impl"


    // $ANTLR start "rule__Statement__Group_4__1"
    // InternalAle.g:3304:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3308:1: ( rule__Statement__Group_4__1__Impl )
            // InternalAle.g:3309:2: rule__Statement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_4__1"


    // $ANTLR start "rule__Statement__Group_4__1__Impl"
    // InternalAle.g:3315:1: rule__Statement__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3319:1: ( ( ';' ) )
            // InternalAle.g:3320:1: ( ';' )
            {
            // InternalAle.g:3320:1: ( ';' )
            // InternalAle.g:3321:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_4_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_4_1()); 
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
    // $ANTLR end "rule__Statement__Group_4__1__Impl"


    // $ANTLR start "rule__Statement__Group_5__0"
    // InternalAle.g:3331:1: rule__Statement__Group_5__0 : rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 ;
    public final void rule__Statement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3335:1: ( rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 )
            // InternalAle.g:3336:2: rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__1();

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
    // $ANTLR end "rule__Statement__Group_5__0"


    // $ANTLR start "rule__Statement__Group_5__0__Impl"
    // InternalAle.g:3343:1: rule__Statement__Group_5__0__Impl : ( ruleReturnStatement ) ;
    public final void rule__Statement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3347:1: ( ( ruleReturnStatement ) )
            // InternalAle.g:3348:1: ( ruleReturnStatement )
            {
            // InternalAle.g:3348:1: ( ruleReturnStatement )
            // InternalAle.g:3349:2: ruleReturnStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReturnStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Statement__Group_5__0__Impl"


    // $ANTLR start "rule__Statement__Group_5__1"
    // InternalAle.g:3358:1: rule__Statement__Group_5__1 : rule__Statement__Group_5__1__Impl ;
    public final void rule__Statement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3362:1: ( rule__Statement__Group_5__1__Impl )
            // InternalAle.g:3363:2: rule__Statement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_5__1"


    // $ANTLR start "rule__Statement__Group_5__1__Impl"
    // InternalAle.g:3369:1: rule__Statement__Group_5__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3373:1: ( ( ';' ) )
            // InternalAle.g:3374:1: ( ';' )
            {
            // InternalAle.g:3374:1: ( ';' )
            // InternalAle.g:3375:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_5_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_5_1()); 
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
    // $ANTLR end "rule__Statement__Group_5__1__Impl"


    // $ANTLR start "rule__Statement__Group_6__0"
    // InternalAle.g:3385:1: rule__Statement__Group_6__0 : rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1 ;
    public final void rule__Statement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3389:1: ( rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1 )
            // InternalAle.g:3390:2: rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_6__1();

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
    // $ANTLR end "rule__Statement__Group_6__0"


    // $ANTLR start "rule__Statement__Group_6__0__Impl"
    // InternalAle.g:3397:1: rule__Statement__Group_6__0__Impl : ( ruleExpression ) ;
    public final void rule__Statement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3401:1: ( ( ruleExpression ) )
            // InternalAle.g:3402:1: ( ruleExpression )
            {
            // InternalAle.g:3402:1: ( ruleExpression )
            // InternalAle.g:3403:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExpressionParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Statement__Group_6__0__Impl"


    // $ANTLR start "rule__Statement__Group_6__1"
    // InternalAle.g:3412:1: rule__Statement__Group_6__1 : rule__Statement__Group_6__1__Impl ;
    public final void rule__Statement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3416:1: ( rule__Statement__Group_6__1__Impl )
            // InternalAle.g:3417:2: rule__Statement__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_6__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_6__1"


    // $ANTLR start "rule__Statement__Group_6__1__Impl"
    // InternalAle.g:3423:1: rule__Statement__Group_6__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3427:1: ( ( ';' ) )
            // InternalAle.g:3428:1: ( ';' )
            {
            // InternalAle.g:3428:1: ( ';' )
            // InternalAle.g:3429:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_6_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_6_1()); 
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
    // $ANTLR end "rule__Statement__Group_6__1__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__0"
    // InternalAle.g:3439:1: rule__ReturnStatement__Group__0 : rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 ;
    public final void rule__ReturnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3443:1: ( rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 )
            // InternalAle.g:3444:2: rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ReturnStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__1();

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
    // $ANTLR end "rule__ReturnStatement__Group__0"


    // $ANTLR start "rule__ReturnStatement__Group__0__Impl"
    // InternalAle.g:3451:1: rule__ReturnStatement__Group__0__Impl : ( () ) ;
    public final void rule__ReturnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3455:1: ( ( () ) )
            // InternalAle.g:3456:1: ( () )
            {
            // InternalAle.g:3456:1: ( () )
            // InternalAle.g:3457:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getReturnStatementAction_0()); 
            }
            // InternalAle.g:3458:2: ()
            // InternalAle.g:3458:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getReturnStatementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__0__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__1"
    // InternalAle.g:3466:1: rule__ReturnStatement__Group__1 : rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 ;
    public final void rule__ReturnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3470:1: ( rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 )
            // InternalAle.g:3471:2: rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ReturnStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__2();

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
    // $ANTLR end "rule__ReturnStatement__Group__1"


    // $ANTLR start "rule__ReturnStatement__Group__1__Impl"
    // InternalAle.g:3478:1: rule__ReturnStatement__Group__1__Impl : ( 'return' ) ;
    public final void rule__ReturnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3482:1: ( ( 'return' ) )
            // InternalAle.g:3483:1: ( 'return' )
            {
            // InternalAle.g:3483:1: ( 'return' )
            // InternalAle.g:3484:2: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getReturnKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getReturnKeyword_1()); 
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
    // $ANTLR end "rule__ReturnStatement__Group__1__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__2"
    // InternalAle.g:3493:1: rule__ReturnStatement__Group__2 : rule__ReturnStatement__Group__2__Impl ;
    public final void rule__ReturnStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3497:1: ( rule__ReturnStatement__Group__2__Impl )
            // InternalAle.g:3498:2: rule__ReturnStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__2__Impl();

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
    // $ANTLR end "rule__ReturnStatement__Group__2"


    // $ANTLR start "rule__ReturnStatement__Group__2__Impl"
    // InternalAle.g:3504:1: rule__ReturnStatement__Group__2__Impl : ( ( rule__ReturnStatement__ReturnedAssignment_2 ) ) ;
    public final void rule__ReturnStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3508:1: ( ( ( rule__ReturnStatement__ReturnedAssignment_2 ) ) )
            // InternalAle.g:3509:1: ( ( rule__ReturnStatement__ReturnedAssignment_2 ) )
            {
            // InternalAle.g:3509:1: ( ( rule__ReturnStatement__ReturnedAssignment_2 ) )
            // InternalAle.g:3510:2: ( rule__ReturnStatement__ReturnedAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getReturnedAssignment_2()); 
            }
            // InternalAle.g:3511:2: ( rule__ReturnStatement__ReturnedAssignment_2 )
            // InternalAle.g:3511:3: rule__ReturnStatement__ReturnedAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__ReturnedAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getReturnedAssignment_2()); 
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
    // $ANTLR end "rule__ReturnStatement__Group__2__Impl"


    // $ANTLR start "rule__LetStatement__Group__0"
    // InternalAle.g:3520:1: rule__LetStatement__Group__0 : rule__LetStatement__Group__0__Impl rule__LetStatement__Group__1 ;
    public final void rule__LetStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3524:1: ( rule__LetStatement__Group__0__Impl rule__LetStatement__Group__1 )
            // InternalAle.g:3525:2: rule__LetStatement__Group__0__Impl rule__LetStatement__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__LetStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__1();

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
    // $ANTLR end "rule__LetStatement__Group__0"


    // $ANTLR start "rule__LetStatement__Group__0__Impl"
    // InternalAle.g:3532:1: rule__LetStatement__Group__0__Impl : ( () ) ;
    public final void rule__LetStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3536:1: ( ( () ) )
            // InternalAle.g:3537:1: ( () )
            {
            // InternalAle.g:3537:1: ( () )
            // InternalAle.g:3538:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getLetStatementAction_0()); 
            }
            // InternalAle.g:3539:2: ()
            // InternalAle.g:3539:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getLetStatementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__0__Impl"


    // $ANTLR start "rule__LetStatement__Group__1"
    // InternalAle.g:3547:1: rule__LetStatement__Group__1 : rule__LetStatement__Group__1__Impl rule__LetStatement__Group__2 ;
    public final void rule__LetStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3551:1: ( rule__LetStatement__Group__1__Impl rule__LetStatement__Group__2 )
            // InternalAle.g:3552:2: rule__LetStatement__Group__1__Impl rule__LetStatement__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__LetStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__2();

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
    // $ANTLR end "rule__LetStatement__Group__1"


    // $ANTLR start "rule__LetStatement__Group__1__Impl"
    // InternalAle.g:3559:1: rule__LetStatement__Group__1__Impl : ( 'let' ) ;
    public final void rule__LetStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3563:1: ( ( 'let' ) )
            // InternalAle.g:3564:1: ( 'let' )
            {
            // InternalAle.g:3564:1: ( 'let' )
            // InternalAle.g:3565:2: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getLetKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getLetKeyword_1()); 
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
    // $ANTLR end "rule__LetStatement__Group__1__Impl"


    // $ANTLR start "rule__LetStatement__Group__2"
    // InternalAle.g:3574:1: rule__LetStatement__Group__2 : rule__LetStatement__Group__2__Impl rule__LetStatement__Group__3 ;
    public final void rule__LetStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3578:1: ( rule__LetStatement__Group__2__Impl rule__LetStatement__Group__3 )
            // InternalAle.g:3579:2: rule__LetStatement__Group__2__Impl rule__LetStatement__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__LetStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__3();

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
    // $ANTLR end "rule__LetStatement__Group__2"


    // $ANTLR start "rule__LetStatement__Group__2__Impl"
    // InternalAle.g:3586:1: rule__LetStatement__Group__2__Impl : ( ( rule__LetStatement__BindingsAssignment_2 ) ) ;
    public final void rule__LetStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3590:1: ( ( ( rule__LetStatement__BindingsAssignment_2 ) ) )
            // InternalAle.g:3591:1: ( ( rule__LetStatement__BindingsAssignment_2 ) )
            {
            // InternalAle.g:3591:1: ( ( rule__LetStatement__BindingsAssignment_2 ) )
            // InternalAle.g:3592:2: ( rule__LetStatement__BindingsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getBindingsAssignment_2()); 
            }
            // InternalAle.g:3593:2: ( rule__LetStatement__BindingsAssignment_2 )
            // InternalAle.g:3593:3: rule__LetStatement__BindingsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__BindingsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getBindingsAssignment_2()); 
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
    // $ANTLR end "rule__LetStatement__Group__2__Impl"


    // $ANTLR start "rule__LetStatement__Group__3"
    // InternalAle.g:3601:1: rule__LetStatement__Group__3 : rule__LetStatement__Group__3__Impl rule__LetStatement__Group__4 ;
    public final void rule__LetStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3605:1: ( rule__LetStatement__Group__3__Impl rule__LetStatement__Group__4 )
            // InternalAle.g:3606:2: rule__LetStatement__Group__3__Impl rule__LetStatement__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__LetStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__4();

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
    // $ANTLR end "rule__LetStatement__Group__3"


    // $ANTLR start "rule__LetStatement__Group__3__Impl"
    // InternalAle.g:3613:1: rule__LetStatement__Group__3__Impl : ( ( rule__LetStatement__Group_3__0 )* ) ;
    public final void rule__LetStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3617:1: ( ( ( rule__LetStatement__Group_3__0 )* ) )
            // InternalAle.g:3618:1: ( ( rule__LetStatement__Group_3__0 )* )
            {
            // InternalAle.g:3618:1: ( ( rule__LetStatement__Group_3__0 )* )
            // InternalAle.g:3619:2: ( rule__LetStatement__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getGroup_3()); 
            }
            // InternalAle.g:3620:2: ( rule__LetStatement__Group_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==32) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAle.g:3620:3: rule__LetStatement__Group_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__LetStatement__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getGroup_3()); 
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
    // $ANTLR end "rule__LetStatement__Group__3__Impl"


    // $ANTLR start "rule__LetStatement__Group__4"
    // InternalAle.g:3628:1: rule__LetStatement__Group__4 : rule__LetStatement__Group__4__Impl rule__LetStatement__Group__5 ;
    public final void rule__LetStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3632:1: ( rule__LetStatement__Group__4__Impl rule__LetStatement__Group__5 )
            // InternalAle.g:3633:2: rule__LetStatement__Group__4__Impl rule__LetStatement__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__LetStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__5();

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
    // $ANTLR end "rule__LetStatement__Group__4"


    // $ANTLR start "rule__LetStatement__Group__4__Impl"
    // InternalAle.g:3640:1: rule__LetStatement__Group__4__Impl : ( 'in' ) ;
    public final void rule__LetStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3644:1: ( ( 'in' ) )
            // InternalAle.g:3645:1: ( 'in' )
            {
            // InternalAle.g:3645:1: ( 'in' )
            // InternalAle.g:3646:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getInKeyword_4()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getInKeyword_4()); 
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
    // $ANTLR end "rule__LetStatement__Group__4__Impl"


    // $ANTLR start "rule__LetStatement__Group__5"
    // InternalAle.g:3655:1: rule__LetStatement__Group__5 : rule__LetStatement__Group__5__Impl ;
    public final void rule__LetStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3659:1: ( rule__LetStatement__Group__5__Impl )
            // InternalAle.g:3660:2: rule__LetStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__5__Impl();

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
    // $ANTLR end "rule__LetStatement__Group__5"


    // $ANTLR start "rule__LetStatement__Group__5__Impl"
    // InternalAle.g:3666:1: rule__LetStatement__Group__5__Impl : ( ( rule__LetStatement__BlockAssignment_5 ) ) ;
    public final void rule__LetStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3670:1: ( ( ( rule__LetStatement__BlockAssignment_5 ) ) )
            // InternalAle.g:3671:1: ( ( rule__LetStatement__BlockAssignment_5 ) )
            {
            // InternalAle.g:3671:1: ( ( rule__LetStatement__BlockAssignment_5 ) )
            // InternalAle.g:3672:2: ( rule__LetStatement__BlockAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getBlockAssignment_5()); 
            }
            // InternalAle.g:3673:2: ( rule__LetStatement__BlockAssignment_5 )
            // InternalAle.g:3673:3: rule__LetStatement__BlockAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__BlockAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getBlockAssignment_5()); 
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
    // $ANTLR end "rule__LetStatement__Group__5__Impl"


    // $ANTLR start "rule__LetStatement__Group_3__0"
    // InternalAle.g:3682:1: rule__LetStatement__Group_3__0 : rule__LetStatement__Group_3__0__Impl rule__LetStatement__Group_3__1 ;
    public final void rule__LetStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3686:1: ( rule__LetStatement__Group_3__0__Impl rule__LetStatement__Group_3__1 )
            // InternalAle.g:3687:2: rule__LetStatement__Group_3__0__Impl rule__LetStatement__Group_3__1
            {
            pushFollow(FOLLOW_24);
            rule__LetStatement__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group_3__1();

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
    // $ANTLR end "rule__LetStatement__Group_3__0"


    // $ANTLR start "rule__LetStatement__Group_3__0__Impl"
    // InternalAle.g:3694:1: rule__LetStatement__Group_3__0__Impl : ( ',' ) ;
    public final void rule__LetStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3698:1: ( ( ',' ) )
            // InternalAle.g:3699:1: ( ',' )
            {
            // InternalAle.g:3699:1: ( ',' )
            // InternalAle.g:3700:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getCommaKeyword_3_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getCommaKeyword_3_0()); 
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
    // $ANTLR end "rule__LetStatement__Group_3__0__Impl"


    // $ANTLR start "rule__LetStatement__Group_3__1"
    // InternalAle.g:3709:1: rule__LetStatement__Group_3__1 : rule__LetStatement__Group_3__1__Impl ;
    public final void rule__LetStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3713:1: ( rule__LetStatement__Group_3__1__Impl )
            // InternalAle.g:3714:2: rule__LetStatement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group_3__1__Impl();

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
    // $ANTLR end "rule__LetStatement__Group_3__1"


    // $ANTLR start "rule__LetStatement__Group_3__1__Impl"
    // InternalAle.g:3720:1: rule__LetStatement__Group_3__1__Impl : ( ( rule__LetStatement__BindingsAssignment_3_1 ) ) ;
    public final void rule__LetStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3724:1: ( ( ( rule__LetStatement__BindingsAssignment_3_1 ) ) )
            // InternalAle.g:3725:1: ( ( rule__LetStatement__BindingsAssignment_3_1 ) )
            {
            // InternalAle.g:3725:1: ( ( rule__LetStatement__BindingsAssignment_3_1 ) )
            // InternalAle.g:3726:2: ( rule__LetStatement__BindingsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getBindingsAssignment_3_1()); 
            }
            // InternalAle.g:3727:2: ( rule__LetStatement__BindingsAssignment_3_1 )
            // InternalAle.g:3727:3: rule__LetStatement__BindingsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__BindingsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getBindingsAssignment_3_1()); 
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
    // $ANTLR end "rule__LetStatement__Group_3__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalAle.g:3736:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3740:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalAle.g:3741:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

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
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalAle.g:3748:1: rule__IfStatement__Group__0__Impl : ( () ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3752:1: ( ( () ) )
            // InternalAle.g:3753:1: ( () )
            {
            // InternalAle.g:3753:1: ( () )
            // InternalAle.g:3754:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getIfStatementAction_0()); 
            }
            // InternalAle.g:3755:2: ()
            // InternalAle.g:3755:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getIfStatementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalAle.g:3763:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3767:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalAle.g:3768:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

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
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalAle.g:3775:1: rule__IfStatement__Group__1__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3779:1: ( ( 'if' ) )
            // InternalAle.g:3780:1: ( 'if' )
            {
            // InternalAle.g:3780:1: ( 'if' )
            // InternalAle.g:3781:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getIfKeyword_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getIfKeyword_1()); 
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
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalAle.g:3790:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3794:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalAle.g:3795:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

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
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalAle.g:3802:1: rule__IfStatement__Group__2__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3806:1: ( ( '(' ) )
            // InternalAle.g:3807:1: ( '(' )
            {
            // InternalAle.g:3807:1: ( '(' )
            // InternalAle.g:3808:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalAle.g:3817:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3821:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalAle.g:3822:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

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
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalAle.g:3829:1: rule__IfStatement__Group__3__Impl : ( ( rule__IfStatement__ConditionAssignment_3 ) ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3833:1: ( ( ( rule__IfStatement__ConditionAssignment_3 ) ) )
            // InternalAle.g:3834:1: ( ( rule__IfStatement__ConditionAssignment_3 ) )
            {
            // InternalAle.g:3834:1: ( ( rule__IfStatement__ConditionAssignment_3 ) )
            // InternalAle.g:3835:2: ( rule__IfStatement__ConditionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getConditionAssignment_3()); 
            }
            // InternalAle.g:3836:2: ( rule__IfStatement__ConditionAssignment_3 )
            // InternalAle.g:3836:3: rule__IfStatement__ConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ConditionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getConditionAssignment_3()); 
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
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalAle.g:3844:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3848:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalAle.g:3849:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

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
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalAle.g:3856:1: rule__IfStatement__Group__4__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3860:1: ( ( ')' ) )
            // InternalAle.g:3861:1: ( ')' )
            {
            // InternalAle.g:3861:1: ( ')' )
            // InternalAle.g:3862:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalAle.g:3871:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3875:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // InternalAle.g:3876:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__6();

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
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalAle.g:3883:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__ThenBranchAssignment_5 ) ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3887:1: ( ( ( rule__IfStatement__ThenBranchAssignment_5 ) ) )
            // InternalAle.g:3888:1: ( ( rule__IfStatement__ThenBranchAssignment_5 ) )
            {
            // InternalAle.g:3888:1: ( ( rule__IfStatement__ThenBranchAssignment_5 ) )
            // InternalAle.g:3889:2: ( rule__IfStatement__ThenBranchAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getThenBranchAssignment_5()); 
            }
            // InternalAle.g:3890:2: ( rule__IfStatement__ThenBranchAssignment_5 )
            // InternalAle.g:3890:3: rule__IfStatement__ThenBranchAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ThenBranchAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getThenBranchAssignment_5()); 
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
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group__6"
    // InternalAle.g:3898:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3902:1: ( rule__IfStatement__Group__6__Impl )
            // InternalAle.g:3903:2: rule__IfStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__6__Impl();

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
    // $ANTLR end "rule__IfStatement__Group__6"


    // $ANTLR start "rule__IfStatement__Group__6__Impl"
    // InternalAle.g:3909:1: rule__IfStatement__Group__6__Impl : ( ( rule__IfStatement__Group_6__0 )? ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3913:1: ( ( ( rule__IfStatement__Group_6__0 )? ) )
            // InternalAle.g:3914:1: ( ( rule__IfStatement__Group_6__0 )? )
            {
            // InternalAle.g:3914:1: ( ( rule__IfStatement__Group_6__0 )? )
            // InternalAle.g:3915:2: ( rule__IfStatement__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup_6()); 
            }
            // InternalAle.g:3916:2: ( rule__IfStatement__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAle.g:3916:3: rule__IfStatement__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStatement__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup_6()); 
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
    // $ANTLR end "rule__IfStatement__Group__6__Impl"


    // $ANTLR start "rule__IfStatement__Group_6__0"
    // InternalAle.g:3925:1: rule__IfStatement__Group_6__0 : rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 ;
    public final void rule__IfStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3929:1: ( rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 )
            // InternalAle.g:3930:2: rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__IfStatement__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_6__1();

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
    // $ANTLR end "rule__IfStatement__Group_6__0"


    // $ANTLR start "rule__IfStatement__Group_6__0__Impl"
    // InternalAle.g:3937:1: rule__IfStatement__Group_6__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3941:1: ( ( 'else' ) )
            // InternalAle.g:3942:1: ( 'else' )
            {
            // InternalAle.g:3942:1: ( 'else' )
            // InternalAle.g:3943:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseKeyword_6_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseKeyword_6_0()); 
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
    // $ANTLR end "rule__IfStatement__Group_6__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_6__1"
    // InternalAle.g:3952:1: rule__IfStatement__Group_6__1 : rule__IfStatement__Group_6__1__Impl ;
    public final void rule__IfStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3956:1: ( rule__IfStatement__Group_6__1__Impl )
            // InternalAle.g:3957:2: rule__IfStatement__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_6__1__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_6__1"


    // $ANTLR start "rule__IfStatement__Group_6__1__Impl"
    // InternalAle.g:3963:1: rule__IfStatement__Group_6__1__Impl : ( ( rule__IfStatement__ElseBranchAssignment_6_1 ) ) ;
    public final void rule__IfStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3967:1: ( ( ( rule__IfStatement__ElseBranchAssignment_6_1 ) ) )
            // InternalAle.g:3968:1: ( ( rule__IfStatement__ElseBranchAssignment_6_1 ) )
            {
            // InternalAle.g:3968:1: ( ( rule__IfStatement__ElseBranchAssignment_6_1 ) )
            // InternalAle.g:3969:2: ( rule__IfStatement__ElseBranchAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseBranchAssignment_6_1()); 
            }
            // InternalAle.g:3970:2: ( rule__IfStatement__ElseBranchAssignment_6_1 )
            // InternalAle.g:3970:3: rule__IfStatement__ElseBranchAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ElseBranchAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseBranchAssignment_6_1()); 
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
    // $ANTLR end "rule__IfStatement__Group_6__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__0"
    // InternalAle.g:3979:1: rule__WhileStatement__Group__0 : rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 ;
    public final void rule__WhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3983:1: ( rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 )
            // InternalAle.g:3984:2: rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__WhileStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__1();

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
    // $ANTLR end "rule__WhileStatement__Group__0"


    // $ANTLR start "rule__WhileStatement__Group__0__Impl"
    // InternalAle.g:3991:1: rule__WhileStatement__Group__0__Impl : ( () ) ;
    public final void rule__WhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3995:1: ( ( () ) )
            // InternalAle.g:3996:1: ( () )
            {
            // InternalAle.g:3996:1: ( () )
            // InternalAle.g:3997:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileStatementAction_0()); 
            }
            // InternalAle.g:3998:2: ()
            // InternalAle.g:3998:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getWhileStatementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__0__Impl"


    // $ANTLR start "rule__WhileStatement__Group__1"
    // InternalAle.g:4006:1: rule__WhileStatement__Group__1 : rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 ;
    public final void rule__WhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4010:1: ( rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 )
            // InternalAle.g:4011:2: rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__WhileStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__2();

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
    // $ANTLR end "rule__WhileStatement__Group__1"


    // $ANTLR start "rule__WhileStatement__Group__1__Impl"
    // InternalAle.g:4018:1: rule__WhileStatement__Group__1__Impl : ( 'while' ) ;
    public final void rule__WhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4022:1: ( ( 'while' ) )
            // InternalAle.g:4023:1: ( 'while' )
            {
            // InternalAle.g:4023:1: ( 'while' )
            // InternalAle.g:4024:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileKeyword_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getWhileKeyword_1()); 
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
    // $ANTLR end "rule__WhileStatement__Group__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__2"
    // InternalAle.g:4033:1: rule__WhileStatement__Group__2 : rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 ;
    public final void rule__WhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4037:1: ( rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 )
            // InternalAle.g:4038:2: rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__WhileStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__3();

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
    // $ANTLR end "rule__WhileStatement__Group__2"


    // $ANTLR start "rule__WhileStatement__Group__2__Impl"
    // InternalAle.g:4045:1: rule__WhileStatement__Group__2__Impl : ( '(' ) ;
    public final void rule__WhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4049:1: ( ( '(' ) )
            // InternalAle.g:4050:1: ( '(' )
            {
            // InternalAle.g:4050:1: ( '(' )
            // InternalAle.g:4051:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__WhileStatement__Group__2__Impl"


    // $ANTLR start "rule__WhileStatement__Group__3"
    // InternalAle.g:4060:1: rule__WhileStatement__Group__3 : rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 ;
    public final void rule__WhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4064:1: ( rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 )
            // InternalAle.g:4065:2: rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__WhileStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__4();

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
    // $ANTLR end "rule__WhileStatement__Group__3"


    // $ANTLR start "rule__WhileStatement__Group__3__Impl"
    // InternalAle.g:4072:1: rule__WhileStatement__Group__3__Impl : ( ( rule__WhileStatement__ConditionAssignment_3 ) ) ;
    public final void rule__WhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4076:1: ( ( ( rule__WhileStatement__ConditionAssignment_3 ) ) )
            // InternalAle.g:4077:1: ( ( rule__WhileStatement__ConditionAssignment_3 ) )
            {
            // InternalAle.g:4077:1: ( ( rule__WhileStatement__ConditionAssignment_3 ) )
            // InternalAle.g:4078:2: ( rule__WhileStatement__ConditionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getConditionAssignment_3()); 
            }
            // InternalAle.g:4079:2: ( rule__WhileStatement__ConditionAssignment_3 )
            // InternalAle.g:4079:3: rule__WhileStatement__ConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__ConditionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getConditionAssignment_3()); 
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
    // $ANTLR end "rule__WhileStatement__Group__3__Impl"


    // $ANTLR start "rule__WhileStatement__Group__4"
    // InternalAle.g:4087:1: rule__WhileStatement__Group__4 : rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5 ;
    public final void rule__WhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4091:1: ( rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5 )
            // InternalAle.g:4092:2: rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__WhileStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__5();

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
    // $ANTLR end "rule__WhileStatement__Group__4"


    // $ANTLR start "rule__WhileStatement__Group__4__Impl"
    // InternalAle.g:4099:1: rule__WhileStatement__Group__4__Impl : ( ')' ) ;
    public final void rule__WhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4103:1: ( ( ')' ) )
            // InternalAle.g:4104:1: ( ')' )
            {
            // InternalAle.g:4104:1: ( ')' )
            // InternalAle.g:4105:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__WhileStatement__Group__4__Impl"


    // $ANTLR start "rule__WhileStatement__Group__5"
    // InternalAle.g:4114:1: rule__WhileStatement__Group__5 : rule__WhileStatement__Group__5__Impl ;
    public final void rule__WhileStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4118:1: ( rule__WhileStatement__Group__5__Impl )
            // InternalAle.g:4119:2: rule__WhileStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__5__Impl();

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
    // $ANTLR end "rule__WhileStatement__Group__5"


    // $ANTLR start "rule__WhileStatement__Group__5__Impl"
    // InternalAle.g:4125:1: rule__WhileStatement__Group__5__Impl : ( ( rule__WhileStatement__WhileBlockAssignment_5 ) ) ;
    public final void rule__WhileStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4129:1: ( ( ( rule__WhileStatement__WhileBlockAssignment_5 ) ) )
            // InternalAle.g:4130:1: ( ( rule__WhileStatement__WhileBlockAssignment_5 ) )
            {
            // InternalAle.g:4130:1: ( ( rule__WhileStatement__WhileBlockAssignment_5 ) )
            // InternalAle.g:4131:2: ( rule__WhileStatement__WhileBlockAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileBlockAssignment_5()); 
            }
            // InternalAle.g:4132:2: ( rule__WhileStatement__WhileBlockAssignment_5 )
            // InternalAle.g:4132:3: rule__WhileStatement__WhileBlockAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__WhileBlockAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getWhileBlockAssignment_5()); 
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
    // $ANTLR end "rule__WhileStatement__Group__5__Impl"


    // $ANTLR start "rule__ForLoop__Group__0"
    // InternalAle.g:4141:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4145:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalAle.g:4146:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ForLoop__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__1();

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
    // $ANTLR end "rule__ForLoop__Group__0"


    // $ANTLR start "rule__ForLoop__Group__0__Impl"
    // InternalAle.g:4153:1: rule__ForLoop__Group__0__Impl : ( () ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4157:1: ( ( () ) )
            // InternalAle.g:4158:1: ( () )
            {
            // InternalAle.g:4158:1: ( () )
            // InternalAle.g:4159:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getForLoopAction_0()); 
            }
            // InternalAle.g:4160:2: ()
            // InternalAle.g:4160:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getForLoopAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0__Impl"


    // $ANTLR start "rule__ForLoop__Group__1"
    // InternalAle.g:4168:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4172:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalAle.g:4173:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ForLoop__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__2();

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
    // $ANTLR end "rule__ForLoop__Group__1"


    // $ANTLR start "rule__ForLoop__Group__1__Impl"
    // InternalAle.g:4180:1: rule__ForLoop__Group__1__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4184:1: ( ( 'for' ) )
            // InternalAle.g:4185:1: ( 'for' )
            {
            // InternalAle.g:4185:1: ( 'for' )
            // InternalAle.g:4186:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getForKeyword_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getForKeyword_1()); 
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
    // $ANTLR end "rule__ForLoop__Group__1__Impl"


    // $ANTLR start "rule__ForLoop__Group__2"
    // InternalAle.g:4195:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4199:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalAle.g:4200:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ForLoop__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__3();

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
    // $ANTLR end "rule__ForLoop__Group__2"


    // $ANTLR start "rule__ForLoop__Group__2__Impl"
    // InternalAle.g:4207:1: rule__ForLoop__Group__2__Impl : ( '(' ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4211:1: ( ( '(' ) )
            // InternalAle.g:4212:1: ( '(' )
            {
            // InternalAle.g:4212:1: ( '(' )
            // InternalAle.g:4213:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ForLoop__Group__2__Impl"


    // $ANTLR start "rule__ForLoop__Group__3"
    // InternalAle.g:4222:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4226:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalAle.g:4227:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ForLoop__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__4();

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
    // $ANTLR end "rule__ForLoop__Group__3"


    // $ANTLR start "rule__ForLoop__Group__3__Impl"
    // InternalAle.g:4234:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__TypeAssignment_3 ) ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4238:1: ( ( ( rule__ForLoop__TypeAssignment_3 ) ) )
            // InternalAle.g:4239:1: ( ( rule__ForLoop__TypeAssignment_3 ) )
            {
            // InternalAle.g:4239:1: ( ( rule__ForLoop__TypeAssignment_3 ) )
            // InternalAle.g:4240:2: ( rule__ForLoop__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getTypeAssignment_3()); 
            }
            // InternalAle.g:4241:2: ( rule__ForLoop__TypeAssignment_3 )
            // InternalAle.g:4241:3: rule__ForLoop__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__ForLoop__Group__3__Impl"


    // $ANTLR start "rule__ForLoop__Group__4"
    // InternalAle.g:4249:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4253:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // InternalAle.g:4254:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__ForLoop__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__5();

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
    // $ANTLR end "rule__ForLoop__Group__4"


    // $ANTLR start "rule__ForLoop__Group__4__Impl"
    // InternalAle.g:4261:1: rule__ForLoop__Group__4__Impl : ( ( rule__ForLoop__NameAssignment_4 ) ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4265:1: ( ( ( rule__ForLoop__NameAssignment_4 ) ) )
            // InternalAle.g:4266:1: ( ( rule__ForLoop__NameAssignment_4 ) )
            {
            // InternalAle.g:4266:1: ( ( rule__ForLoop__NameAssignment_4 ) )
            // InternalAle.g:4267:2: ( rule__ForLoop__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getNameAssignment_4()); 
            }
            // InternalAle.g:4268:2: ( rule__ForLoop__NameAssignment_4 )
            // InternalAle.g:4268:3: rule__ForLoop__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getNameAssignment_4()); 
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
    // $ANTLR end "rule__ForLoop__Group__4__Impl"


    // $ANTLR start "rule__ForLoop__Group__5"
    // InternalAle.g:4276:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4280:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // InternalAle.g:4281:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__ForLoop__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__6();

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
    // $ANTLR end "rule__ForLoop__Group__5"


    // $ANTLR start "rule__ForLoop__Group__5__Impl"
    // InternalAle.g:4288:1: rule__ForLoop__Group__5__Impl : ( 'in' ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4292:1: ( ( 'in' ) )
            // InternalAle.g:4293:1: ( 'in' )
            {
            // InternalAle.g:4293:1: ( 'in' )
            // InternalAle.g:4294:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getInKeyword_5()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getInKeyword_5()); 
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
    // $ANTLR end "rule__ForLoop__Group__5__Impl"


    // $ANTLR start "rule__ForLoop__Group__6"
    // InternalAle.g:4303:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4307:1: ( rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 )
            // InternalAle.g:4308:2: rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__ForLoop__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__7();

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
    // $ANTLR end "rule__ForLoop__Group__6"


    // $ANTLR start "rule__ForLoop__Group__6__Impl"
    // InternalAle.g:4315:1: rule__ForLoop__Group__6__Impl : ( ( rule__ForLoop__CollectionAssignment_6 ) ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4319:1: ( ( ( rule__ForLoop__CollectionAssignment_6 ) ) )
            // InternalAle.g:4320:1: ( ( rule__ForLoop__CollectionAssignment_6 ) )
            {
            // InternalAle.g:4320:1: ( ( rule__ForLoop__CollectionAssignment_6 ) )
            // InternalAle.g:4321:2: ( rule__ForLoop__CollectionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getCollectionAssignment_6()); 
            }
            // InternalAle.g:4322:2: ( rule__ForLoop__CollectionAssignment_6 )
            // InternalAle.g:4322:3: rule__ForLoop__CollectionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__CollectionAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getCollectionAssignment_6()); 
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
    // $ANTLR end "rule__ForLoop__Group__6__Impl"


    // $ANTLR start "rule__ForLoop__Group__7"
    // InternalAle.g:4330:1: rule__ForLoop__Group__7 : rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8 ;
    public final void rule__ForLoop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4334:1: ( rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8 )
            // InternalAle.g:4335:2: rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__ForLoop__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__8();

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
    // $ANTLR end "rule__ForLoop__Group__7"


    // $ANTLR start "rule__ForLoop__Group__7__Impl"
    // InternalAle.g:4342:1: rule__ForLoop__Group__7__Impl : ( ')' ) ;
    public final void rule__ForLoop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4346:1: ( ( ')' ) )
            // InternalAle.g:4347:1: ( ')' )
            {
            // InternalAle.g:4347:1: ( ')' )
            // InternalAle.g:4348:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7()); 
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
    // $ANTLR end "rule__ForLoop__Group__7__Impl"


    // $ANTLR start "rule__ForLoop__Group__8"
    // InternalAle.g:4357:1: rule__ForLoop__Group__8 : rule__ForLoop__Group__8__Impl ;
    public final void rule__ForLoop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4361:1: ( rule__ForLoop__Group__8__Impl )
            // InternalAle.g:4362:2: rule__ForLoop__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__8__Impl();

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
    // $ANTLR end "rule__ForLoop__Group__8"


    // $ANTLR start "rule__ForLoop__Group__8__Impl"
    // InternalAle.g:4368:1: rule__ForLoop__Group__8__Impl : ( ( rule__ForLoop__BlockAssignment_8 ) ) ;
    public final void rule__ForLoop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4372:1: ( ( ( rule__ForLoop__BlockAssignment_8 ) ) )
            // InternalAle.g:4373:1: ( ( rule__ForLoop__BlockAssignment_8 ) )
            {
            // InternalAle.g:4373:1: ( ( rule__ForLoop__BlockAssignment_8 ) )
            // InternalAle.g:4374:2: ( rule__ForLoop__BlockAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getBlockAssignment_8()); 
            }
            // InternalAle.g:4375:2: ( rule__ForLoop__BlockAssignment_8 )
            // InternalAle.g:4375:3: rule__ForLoop__BlockAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__BlockAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getBlockAssignment_8()); 
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
    // $ANTLR end "rule__ForLoop__Group__8__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalAle.g:4384:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4388:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalAle.g:4389:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

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
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalAle.g:4396:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4400:1: ( ( () ) )
            // InternalAle.g:4401:1: ( () )
            {
            // InternalAle.g:4401:1: ( () )
            // InternalAle.g:4402:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // InternalAle.g:4403:2: ()
            // InternalAle.g:4403:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalAle.g:4411:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4415:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalAle.g:4416:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

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
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalAle.g:4423:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4427:1: ( ( '{' ) )
            // InternalAle.g:4428:1: ( '{' )
            {
            // InternalAle.g:4428:1: ( '{' )
            // InternalAle.g:4429:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalAle.g:4438:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4442:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalAle.g:4443:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

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
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalAle.g:4450:1: rule__Block__Group__2__Impl : ( ( rule__Block__BodyAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4454:1: ( ( ( rule__Block__BodyAssignment_2 )* ) )
            // InternalAle.g:4455:1: ( ( rule__Block__BodyAssignment_2 )* )
            {
            // InternalAle.g:4455:1: ( ( rule__Block__BodyAssignment_2 )* )
            // InternalAle.g:4456:2: ( rule__Block__BodyAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBodyAssignment_2()); 
            }
            // InternalAle.g:4457:2: ( rule__Block__BodyAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_BOOLEAN)||(LA33_0>=15 && LA33_0<=23)||LA33_0==36||(LA33_0>=39 && LA33_0<=40)||LA33_0==42||(LA33_0>=44 && LA33_0<=45)||(LA33_0>=59 && LA33_0<=61)||(LA33_0>=65 && LA33_0<=67)||(LA33_0>=69 && LA33_0<=70)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAle.g:4457:3: rule__Block__BodyAssignment_2
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Block__BodyAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBodyAssignment_2()); 
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
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalAle.g:4465:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4469:1: ( rule__Block__Group__3__Impl )
            // InternalAle.g:4470:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__3__Impl();

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
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalAle.g:4476:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4480:1: ( ( '}' ) )
            // InternalAle.g:4481:1: ( '}' )
            {
            // InternalAle.g:4481:1: ( '}' )
            // InternalAle.g:4482:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__VarAssign__Group__0"
    // InternalAle.g:4492:1: rule__VarAssign__Group__0 : rule__VarAssign__Group__0__Impl rule__VarAssign__Group__1 ;
    public final void rule__VarAssign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4496:1: ( rule__VarAssign__Group__0__Impl rule__VarAssign__Group__1 )
            // InternalAle.g:4497:2: rule__VarAssign__Group__0__Impl rule__VarAssign__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__VarAssign__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group__1();

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
    // $ANTLR end "rule__VarAssign__Group__0"


    // $ANTLR start "rule__VarAssign__Group__0__Impl"
    // InternalAle.g:4504:1: rule__VarAssign__Group__0__Impl : ( () ) ;
    public final void rule__VarAssign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4508:1: ( ( () ) )
            // InternalAle.g:4509:1: ( () )
            {
            // InternalAle.g:4509:1: ( () )
            // InternalAle.g:4510:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getVarAssignAction_0()); 
            }
            // InternalAle.g:4511:2: ()
            // InternalAle.g:4511:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getVarAssignAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group__0__Impl"


    // $ANTLR start "rule__VarAssign__Group__1"
    // InternalAle.g:4519:1: rule__VarAssign__Group__1 : rule__VarAssign__Group__1__Impl rule__VarAssign__Group__2 ;
    public final void rule__VarAssign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4523:1: ( rule__VarAssign__Group__1__Impl rule__VarAssign__Group__2 )
            // InternalAle.g:4524:2: rule__VarAssign__Group__1__Impl rule__VarAssign__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__VarAssign__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group__2();

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
    // $ANTLR end "rule__VarAssign__Group__1"


    // $ANTLR start "rule__VarAssign__Group__1__Impl"
    // InternalAle.g:4531:1: rule__VarAssign__Group__1__Impl : ( ( rule__VarAssign__TypeAssignment_1 ) ) ;
    public final void rule__VarAssign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4535:1: ( ( ( rule__VarAssign__TypeAssignment_1 ) ) )
            // InternalAle.g:4536:1: ( ( rule__VarAssign__TypeAssignment_1 ) )
            {
            // InternalAle.g:4536:1: ( ( rule__VarAssign__TypeAssignment_1 ) )
            // InternalAle.g:4537:2: ( rule__VarAssign__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getTypeAssignment_1()); 
            }
            // InternalAle.g:4538:2: ( rule__VarAssign__TypeAssignment_1 )
            // InternalAle.g:4538:3: rule__VarAssign__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__VarAssign__Group__1__Impl"


    // $ANTLR start "rule__VarAssign__Group__2"
    // InternalAle.g:4546:1: rule__VarAssign__Group__2 : rule__VarAssign__Group__2__Impl rule__VarAssign__Group__3 ;
    public final void rule__VarAssign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4550:1: ( rule__VarAssign__Group__2__Impl rule__VarAssign__Group__3 )
            // InternalAle.g:4551:2: rule__VarAssign__Group__2__Impl rule__VarAssign__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__VarAssign__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group__3();

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
    // $ANTLR end "rule__VarAssign__Group__2"


    // $ANTLR start "rule__VarAssign__Group__2__Impl"
    // InternalAle.g:4558:1: rule__VarAssign__Group__2__Impl : ( ( rule__VarAssign__NameAssignment_2 ) ) ;
    public final void rule__VarAssign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4562:1: ( ( ( rule__VarAssign__NameAssignment_2 ) ) )
            // InternalAle.g:4563:1: ( ( rule__VarAssign__NameAssignment_2 ) )
            {
            // InternalAle.g:4563:1: ( ( rule__VarAssign__NameAssignment_2 ) )
            // InternalAle.g:4564:2: ( rule__VarAssign__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getNameAssignment_2()); 
            }
            // InternalAle.g:4565:2: ( rule__VarAssign__NameAssignment_2 )
            // InternalAle.g:4565:3: rule__VarAssign__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__VarAssign__Group__2__Impl"


    // $ANTLR start "rule__VarAssign__Group__3"
    // InternalAle.g:4573:1: rule__VarAssign__Group__3 : rule__VarAssign__Group__3__Impl rule__VarAssign__Group__4 ;
    public final void rule__VarAssign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4577:1: ( rule__VarAssign__Group__3__Impl rule__VarAssign__Group__4 )
            // InternalAle.g:4578:2: rule__VarAssign__Group__3__Impl rule__VarAssign__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__VarAssign__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group__4();

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
    // $ANTLR end "rule__VarAssign__Group__3"


    // $ANTLR start "rule__VarAssign__Group__3__Impl"
    // InternalAle.g:4585:1: rule__VarAssign__Group__3__Impl : ( '=' ) ;
    public final void rule__VarAssign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4589:1: ( ( '=' ) )
            // InternalAle.g:4590:1: ( '=' )
            {
            // InternalAle.g:4590:1: ( '=' )
            // InternalAle.g:4591:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getEqualsSignKeyword_3()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__VarAssign__Group__3__Impl"


    // $ANTLR start "rule__VarAssign__Group__4"
    // InternalAle.g:4600:1: rule__VarAssign__Group__4 : rule__VarAssign__Group__4__Impl ;
    public final void rule__VarAssign__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4604:1: ( rule__VarAssign__Group__4__Impl )
            // InternalAle.g:4605:2: rule__VarAssign__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group__4__Impl();

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
    // $ANTLR end "rule__VarAssign__Group__4"


    // $ANTLR start "rule__VarAssign__Group__4__Impl"
    // InternalAle.g:4611:1: rule__VarAssign__Group__4__Impl : ( ( rule__VarAssign__ValueAssignment_4 ) ) ;
    public final void rule__VarAssign__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4615:1: ( ( ( rule__VarAssign__ValueAssignment_4 ) ) )
            // InternalAle.g:4616:1: ( ( rule__VarAssign__ValueAssignment_4 ) )
            {
            // InternalAle.g:4616:1: ( ( rule__VarAssign__ValueAssignment_4 ) )
            // InternalAle.g:4617:2: ( rule__VarAssign__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getValueAssignment_4()); 
            }
            // InternalAle.g:4618:2: ( rule__VarAssign__ValueAssignment_4 )
            // InternalAle.g:4618:3: rule__VarAssign__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__ValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getValueAssignment_4()); 
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
    // $ANTLR end "rule__VarAssign__Group__4__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group__0"
    // InternalAle.g:4627:1: rule__ImpliesOperation__Group__0 : rule__ImpliesOperation__Group__0__Impl rule__ImpliesOperation__Group__1 ;
    public final void rule__ImpliesOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4631:1: ( rule__ImpliesOperation__Group__0__Impl rule__ImpliesOperation__Group__1 )
            // InternalAle.g:4632:2: rule__ImpliesOperation__Group__0__Impl rule__ImpliesOperation__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__ImpliesOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group__1();

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
    // $ANTLR end "rule__ImpliesOperation__Group__0"


    // $ANTLR start "rule__ImpliesOperation__Group__0__Impl"
    // InternalAle.g:4639:1: rule__ImpliesOperation__Group__0__Impl : ( ruleBooleanOperation ) ;
    public final void rule__ImpliesOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4643:1: ( ( ruleBooleanOperation ) )
            // InternalAle.g:4644:1: ( ruleBooleanOperation )
            {
            // InternalAle.g:4644:1: ( ruleBooleanOperation )
            // InternalAle.g:4645:2: ruleBooleanOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getBooleanOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getBooleanOperationParserRuleCall_0()); 
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
    // $ANTLR end "rule__ImpliesOperation__Group__0__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group__1"
    // InternalAle.g:4654:1: rule__ImpliesOperation__Group__1 : rule__ImpliesOperation__Group__1__Impl ;
    public final void rule__ImpliesOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4658:1: ( rule__ImpliesOperation__Group__1__Impl )
            // InternalAle.g:4659:2: rule__ImpliesOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group__1__Impl();

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
    // $ANTLR end "rule__ImpliesOperation__Group__1"


    // $ANTLR start "rule__ImpliesOperation__Group__1__Impl"
    // InternalAle.g:4665:1: rule__ImpliesOperation__Group__1__Impl : ( ( rule__ImpliesOperation__Group_1__0 )* ) ;
    public final void rule__ImpliesOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4669:1: ( ( ( rule__ImpliesOperation__Group_1__0 )* ) )
            // InternalAle.g:4670:1: ( ( rule__ImpliesOperation__Group_1__0 )* )
            {
            // InternalAle.g:4670:1: ( ( rule__ImpliesOperation__Group_1__0 )* )
            // InternalAle.g:4671:2: ( rule__ImpliesOperation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getGroup_1()); 
            }
            // InternalAle.g:4672:2: ( rule__ImpliesOperation__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==47) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred65_InternalAle()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalAle.g:4672:3: rule__ImpliesOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__ImpliesOperation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ImpliesOperation__Group__1__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group_1__0"
    // InternalAle.g:4681:1: rule__ImpliesOperation__Group_1__0 : rule__ImpliesOperation__Group_1__0__Impl ;
    public final void rule__ImpliesOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4685:1: ( rule__ImpliesOperation__Group_1__0__Impl )
            // InternalAle.g:4686:2: rule__ImpliesOperation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1__0__Impl();

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
    // $ANTLR end "rule__ImpliesOperation__Group_1__0"


    // $ANTLR start "rule__ImpliesOperation__Group_1__0__Impl"
    // InternalAle.g:4692:1: rule__ImpliesOperation__Group_1__0__Impl : ( ( rule__ImpliesOperation__Group_1_0__0 ) ) ;
    public final void rule__ImpliesOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4696:1: ( ( ( rule__ImpliesOperation__Group_1_0__0 ) ) )
            // InternalAle.g:4697:1: ( ( rule__ImpliesOperation__Group_1_0__0 ) )
            {
            // InternalAle.g:4697:1: ( ( rule__ImpliesOperation__Group_1_0__0 ) )
            // InternalAle.g:4698:2: ( rule__ImpliesOperation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getGroup_1_0()); 
            }
            // InternalAle.g:4699:2: ( rule__ImpliesOperation__Group_1_0__0 )
            // InternalAle.g:4699:3: rule__ImpliesOperation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__ImpliesOperation__Group_1__0__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0__0"
    // InternalAle.g:4708:1: rule__ImpliesOperation__Group_1_0__0 : rule__ImpliesOperation__Group_1_0__0__Impl rule__ImpliesOperation__Group_1_0__1 ;
    public final void rule__ImpliesOperation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4712:1: ( rule__ImpliesOperation__Group_1_0__0__Impl rule__ImpliesOperation__Group_1_0__1 )
            // InternalAle.g:4713:2: rule__ImpliesOperation__Group_1_0__0__Impl rule__ImpliesOperation__Group_1_0__1
            {
            pushFollow(FOLLOW_27);
            rule__ImpliesOperation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1_0__1();

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
    // $ANTLR end "rule__ImpliesOperation__Group_1_0__0"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0__0__Impl"
    // InternalAle.g:4720:1: rule__ImpliesOperation__Group_1_0__0__Impl : ( ( rule__ImpliesOperation__Group_1_0_0__0 ) ) ;
    public final void rule__ImpliesOperation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4724:1: ( ( ( rule__ImpliesOperation__Group_1_0_0__0 ) ) )
            // InternalAle.g:4725:1: ( ( rule__ImpliesOperation__Group_1_0_0__0 ) )
            {
            // InternalAle.g:4725:1: ( ( rule__ImpliesOperation__Group_1_0_0__0 ) )
            // InternalAle.g:4726:2: ( rule__ImpliesOperation__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getGroup_1_0_0()); 
            }
            // InternalAle.g:4727:2: ( rule__ImpliesOperation__Group_1_0_0__0 )
            // InternalAle.g:4727:3: rule__ImpliesOperation__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__ImpliesOperation__Group_1_0__0__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0__1"
    // InternalAle.g:4735:1: rule__ImpliesOperation__Group_1_0__1 : rule__ImpliesOperation__Group_1_0__1__Impl ;
    public final void rule__ImpliesOperation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4739:1: ( rule__ImpliesOperation__Group_1_0__1__Impl )
            // InternalAle.g:4740:2: rule__ImpliesOperation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__ImpliesOperation__Group_1_0__1"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0__1__Impl"
    // InternalAle.g:4746:1: rule__ImpliesOperation__Group_1_0__1__Impl : ( ( rule__ImpliesOperation__RightAssignment_1_0_1 ) ) ;
    public final void rule__ImpliesOperation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4750:1: ( ( ( rule__ImpliesOperation__RightAssignment_1_0_1 ) ) )
            // InternalAle.g:4751:1: ( ( rule__ImpliesOperation__RightAssignment_1_0_1 ) )
            {
            // InternalAle.g:4751:1: ( ( rule__ImpliesOperation__RightAssignment_1_0_1 ) )
            // InternalAle.g:4752:2: ( rule__ImpliesOperation__RightAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getRightAssignment_1_0_1()); 
            }
            // InternalAle.g:4753:2: ( rule__ImpliesOperation__RightAssignment_1_0_1 )
            // InternalAle.g:4753:3: rule__ImpliesOperation__RightAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__RightAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getRightAssignment_1_0_1()); 
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
    // $ANTLR end "rule__ImpliesOperation__Group_1_0__1__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0_0__0"
    // InternalAle.g:4762:1: rule__ImpliesOperation__Group_1_0_0__0 : rule__ImpliesOperation__Group_1_0_0__0__Impl rule__ImpliesOperation__Group_1_0_0__1 ;
    public final void rule__ImpliesOperation__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4766:1: ( rule__ImpliesOperation__Group_1_0_0__0__Impl rule__ImpliesOperation__Group_1_0_0__1 )
            // InternalAle.g:4767:2: rule__ImpliesOperation__Group_1_0_0__0__Impl rule__ImpliesOperation__Group_1_0_0__1
            {
            pushFollow(FOLLOW_40);
            rule__ImpliesOperation__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1_0_0__1();

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
    // $ANTLR end "rule__ImpliesOperation__Group_1_0_0__0"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0_0__0__Impl"
    // InternalAle.g:4774:1: rule__ImpliesOperation__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ImpliesOperation__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4778:1: ( ( () ) )
            // InternalAle.g:4779:1: ( () )
            {
            // InternalAle.g:4779:1: ( () )
            // InternalAle.g:4780:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getImpliesOperationLeftAction_1_0_0_0()); 
            }
            // InternalAle.g:4781:2: ()
            // InternalAle.g:4781:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getImpliesOperationLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0_0__1"
    // InternalAle.g:4789:1: rule__ImpliesOperation__Group_1_0_0__1 : rule__ImpliesOperation__Group_1_0_0__1__Impl ;
    public final void rule__ImpliesOperation__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4793:1: ( rule__ImpliesOperation__Group_1_0_0__1__Impl )
            // InternalAle.g:4794:2: rule__ImpliesOperation__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__ImpliesOperation__Group_1_0_0__1"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0_0__1__Impl"
    // InternalAle.g:4800:1: rule__ImpliesOperation__Group_1_0_0__1__Impl : ( 'implies' ) ;
    public final void rule__ImpliesOperation__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4804:1: ( ( 'implies' ) )
            // InternalAle.g:4805:1: ( 'implies' )
            {
            // InternalAle.g:4805:1: ( 'implies' )
            // InternalAle.g:4806:2: 'implies'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getImpliesKeyword_1_0_0_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getImpliesKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__ImpliesOperation__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__BooleanOperation__Group__0"
    // InternalAle.g:4816:1: rule__BooleanOperation__Group__0 : rule__BooleanOperation__Group__0__Impl rule__BooleanOperation__Group__1 ;
    public final void rule__BooleanOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4820:1: ( rule__BooleanOperation__Group__0__Impl rule__BooleanOperation__Group__1 )
            // InternalAle.g:4821:2: rule__BooleanOperation__Group__0__Impl rule__BooleanOperation__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__BooleanOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group__1();

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
    // $ANTLR end "rule__BooleanOperation__Group__0"


    // $ANTLR start "rule__BooleanOperation__Group__0__Impl"
    // InternalAle.g:4828:1: rule__BooleanOperation__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__BooleanOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4832:1: ( ( ruleCompareOperation ) )
            // InternalAle.g:4833:1: ( ruleCompareOperation )
            {
            // InternalAle.g:4833:1: ( ruleCompareOperation )
            // InternalAle.g:4834:2: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getCompareOperationParserRuleCall_0()); 
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
    // $ANTLR end "rule__BooleanOperation__Group__0__Impl"


    // $ANTLR start "rule__BooleanOperation__Group__1"
    // InternalAle.g:4843:1: rule__BooleanOperation__Group__1 : rule__BooleanOperation__Group__1__Impl ;
    public final void rule__BooleanOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4847:1: ( rule__BooleanOperation__Group__1__Impl )
            // InternalAle.g:4848:2: rule__BooleanOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanOperation__Group__1"


    // $ANTLR start "rule__BooleanOperation__Group__1__Impl"
    // InternalAle.g:4854:1: rule__BooleanOperation__Group__1__Impl : ( ( rule__BooleanOperation__Group_1__0 )* ) ;
    public final void rule__BooleanOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4858:1: ( ( ( rule__BooleanOperation__Group_1__0 )* ) )
            // InternalAle.g:4859:1: ( ( rule__BooleanOperation__Group_1__0 )* )
            {
            // InternalAle.g:4859:1: ( ( rule__BooleanOperation__Group_1__0 )* )
            // InternalAle.g:4860:2: ( rule__BooleanOperation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getGroup_1()); 
            }
            // InternalAle.g:4861:2: ( rule__BooleanOperation__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred66_InternalAle()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred66_InternalAle()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred66_InternalAle()) ) {
                        alt35=1;
                    }


                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // InternalAle.g:4861:3: rule__BooleanOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__BooleanOperation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getGroup_1()); 
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
    // $ANTLR end "rule__BooleanOperation__Group__1__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1__0"
    // InternalAle.g:4870:1: rule__BooleanOperation__Group_1__0 : rule__BooleanOperation__Group_1__0__Impl ;
    public final void rule__BooleanOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4874:1: ( rule__BooleanOperation__Group_1__0__Impl )
            // InternalAle.g:4875:2: rule__BooleanOperation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1__0__Impl();

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
    // $ANTLR end "rule__BooleanOperation__Group_1__0"


    // $ANTLR start "rule__BooleanOperation__Group_1__0__Impl"
    // InternalAle.g:4881:1: rule__BooleanOperation__Group_1__0__Impl : ( ( rule__BooleanOperation__Group_1_0__0 ) ) ;
    public final void rule__BooleanOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4885:1: ( ( ( rule__BooleanOperation__Group_1_0__0 ) ) )
            // InternalAle.g:4886:1: ( ( rule__BooleanOperation__Group_1_0__0 ) )
            {
            // InternalAle.g:4886:1: ( ( rule__BooleanOperation__Group_1_0__0 ) )
            // InternalAle.g:4887:2: ( rule__BooleanOperation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getGroup_1_0()); 
            }
            // InternalAle.g:4888:2: ( rule__BooleanOperation__Group_1_0__0 )
            // InternalAle.g:4888:3: rule__BooleanOperation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__BooleanOperation__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0__0"
    // InternalAle.g:4897:1: rule__BooleanOperation__Group_1_0__0 : rule__BooleanOperation__Group_1_0__0__Impl rule__BooleanOperation__Group_1_0__1 ;
    public final void rule__BooleanOperation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4901:1: ( rule__BooleanOperation__Group_1_0__0__Impl rule__BooleanOperation__Group_1_0__1 )
            // InternalAle.g:4902:2: rule__BooleanOperation__Group_1_0__0__Impl rule__BooleanOperation__Group_1_0__1
            {
            pushFollow(FOLLOW_27);
            rule__BooleanOperation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0__1();

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
    // $ANTLR end "rule__BooleanOperation__Group_1_0__0"


    // $ANTLR start "rule__BooleanOperation__Group_1_0__0__Impl"
    // InternalAle.g:4909:1: rule__BooleanOperation__Group_1_0__0__Impl : ( ( rule__BooleanOperation__Alternatives_1_0_0 ) ) ;
    public final void rule__BooleanOperation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4913:1: ( ( ( rule__BooleanOperation__Alternatives_1_0_0 ) ) )
            // InternalAle.g:4914:1: ( ( rule__BooleanOperation__Alternatives_1_0_0 ) )
            {
            // InternalAle.g:4914:1: ( ( rule__BooleanOperation__Alternatives_1_0_0 ) )
            // InternalAle.g:4915:2: ( rule__BooleanOperation__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getAlternatives_1_0_0()); 
            }
            // InternalAle.g:4916:2: ( rule__BooleanOperation__Alternatives_1_0_0 )
            // InternalAle.g:4916:3: rule__BooleanOperation__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getAlternatives_1_0_0()); 
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
    // $ANTLR end "rule__BooleanOperation__Group_1_0__0__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0__1"
    // InternalAle.g:4924:1: rule__BooleanOperation__Group_1_0__1 : rule__BooleanOperation__Group_1_0__1__Impl ;
    public final void rule__BooleanOperation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4928:1: ( rule__BooleanOperation__Group_1_0__1__Impl )
            // InternalAle.g:4929:2: rule__BooleanOperation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__BooleanOperation__Group_1_0__1"


    // $ANTLR start "rule__BooleanOperation__Group_1_0__1__Impl"
    // InternalAle.g:4935:1: rule__BooleanOperation__Group_1_0__1__Impl : ( ( rule__BooleanOperation__RightAssignment_1_0_1 ) ) ;
    public final void rule__BooleanOperation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4939:1: ( ( ( rule__BooleanOperation__RightAssignment_1_0_1 ) ) )
            // InternalAle.g:4940:1: ( ( rule__BooleanOperation__RightAssignment_1_0_1 ) )
            {
            // InternalAle.g:4940:1: ( ( rule__BooleanOperation__RightAssignment_1_0_1 ) )
            // InternalAle.g:4941:2: ( rule__BooleanOperation__RightAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getRightAssignment_1_0_1()); 
            }
            // InternalAle.g:4942:2: ( rule__BooleanOperation__RightAssignment_1_0_1 )
            // InternalAle.g:4942:3: rule__BooleanOperation__RightAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__RightAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getRightAssignment_1_0_1()); 
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
    // $ANTLR end "rule__BooleanOperation__Group_1_0__1__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_0__0"
    // InternalAle.g:4951:1: rule__BooleanOperation__Group_1_0_0_0__0 : rule__BooleanOperation__Group_1_0_0_0__0__Impl rule__BooleanOperation__Group_1_0_0_0__1 ;
    public final void rule__BooleanOperation__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4955:1: ( rule__BooleanOperation__Group_1_0_0_0__0__Impl rule__BooleanOperation__Group_1_0_0_0__1 )
            // InternalAle.g:4956:2: rule__BooleanOperation__Group_1_0_0_0__0__Impl rule__BooleanOperation__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_44);
            rule__BooleanOperation__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0_0_0__1();

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
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_0__0"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_0__0__Impl"
    // InternalAle.g:4963:1: rule__BooleanOperation__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__BooleanOperation__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4967:1: ( ( () ) )
            // InternalAle.g:4968:1: ( () )
            {
            // InternalAle.g:4968:1: ( () )
            // InternalAle.g:4969:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getBooleanOrOperationLeftAction_1_0_0_0_0()); 
            }
            // InternalAle.g:4970:2: ()
            // InternalAle.g:4970:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getBooleanOrOperationLeftAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_0__1"
    // InternalAle.g:4978:1: rule__BooleanOperation__Group_1_0_0_0__1 : rule__BooleanOperation__Group_1_0_0_0__1__Impl ;
    public final void rule__BooleanOperation__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4982:1: ( rule__BooleanOperation__Group_1_0_0_0__1__Impl )
            // InternalAle.g:4983:2: rule__BooleanOperation__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0_0_0__1__Impl();

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
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_0__1"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_0__1__Impl"
    // InternalAle.g:4989:1: rule__BooleanOperation__Group_1_0_0_0__1__Impl : ( 'or' ) ;
    public final void rule__BooleanOperation__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4993:1: ( ( 'or' ) )
            // InternalAle.g:4994:1: ( 'or' )
            {
            // InternalAle.g:4994:1: ( 'or' )
            // InternalAle.g:4995:2: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getOrKeyword_1_0_0_0_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getOrKeyword_1_0_0_0_1()); 
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
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_1__0"
    // InternalAle.g:5005:1: rule__BooleanOperation__Group_1_0_0_1__0 : rule__BooleanOperation__Group_1_0_0_1__0__Impl rule__BooleanOperation__Group_1_0_0_1__1 ;
    public final void rule__BooleanOperation__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5009:1: ( rule__BooleanOperation__Group_1_0_0_1__0__Impl rule__BooleanOperation__Group_1_0_0_1__1 )
            // InternalAle.g:5010:2: rule__BooleanOperation__Group_1_0_0_1__0__Impl rule__BooleanOperation__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_45);
            rule__BooleanOperation__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0_0_1__1();

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
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_1__0"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_1__0__Impl"
    // InternalAle.g:5017:1: rule__BooleanOperation__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__BooleanOperation__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5021:1: ( ( () ) )
            // InternalAle.g:5022:1: ( () )
            {
            // InternalAle.g:5022:1: ( () )
            // InternalAle.g:5023:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getBooleanAndOperationLeftAction_1_0_0_1_0()); 
            }
            // InternalAle.g:5024:2: ()
            // InternalAle.g:5024:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getBooleanAndOperationLeftAction_1_0_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_1__1"
    // InternalAle.g:5032:1: rule__BooleanOperation__Group_1_0_0_1__1 : rule__BooleanOperation__Group_1_0_0_1__1__Impl ;
    public final void rule__BooleanOperation__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5036:1: ( rule__BooleanOperation__Group_1_0_0_1__1__Impl )
            // InternalAle.g:5037:2: rule__BooleanOperation__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0_0_1__1__Impl();

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
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_1__1"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_1__1__Impl"
    // InternalAle.g:5043:1: rule__BooleanOperation__Group_1_0_0_1__1__Impl : ( 'and' ) ;
    public final void rule__BooleanOperation__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5047:1: ( ( 'and' ) )
            // InternalAle.g:5048:1: ( 'and' )
            {
            // InternalAle.g:5048:1: ( 'and' )
            // InternalAle.g:5049:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getAndKeyword_1_0_0_1_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getAndKeyword_1_0_0_1_1()); 
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
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_2__0"
    // InternalAle.g:5059:1: rule__BooleanOperation__Group_1_0_0_2__0 : rule__BooleanOperation__Group_1_0_0_2__0__Impl rule__BooleanOperation__Group_1_0_0_2__1 ;
    public final void rule__BooleanOperation__Group_1_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5063:1: ( rule__BooleanOperation__Group_1_0_0_2__0__Impl rule__BooleanOperation__Group_1_0_0_2__1 )
            // InternalAle.g:5064:2: rule__BooleanOperation__Group_1_0_0_2__0__Impl rule__BooleanOperation__Group_1_0_0_2__1
            {
            pushFollow(FOLLOW_42);
            rule__BooleanOperation__Group_1_0_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0_0_2__1();

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
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_2__0"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_2__0__Impl"
    // InternalAle.g:5071:1: rule__BooleanOperation__Group_1_0_0_2__0__Impl : ( () ) ;
    public final void rule__BooleanOperation__Group_1_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5075:1: ( ( () ) )
            // InternalAle.g:5076:1: ( () )
            {
            // InternalAle.g:5076:1: ( () )
            // InternalAle.g:5077:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getBooleanXorOperationLeftAction_1_0_0_2_0()); 
            }
            // InternalAle.g:5078:2: ()
            // InternalAle.g:5078:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getBooleanXorOperationLeftAction_1_0_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_2__0__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_2__1"
    // InternalAle.g:5086:1: rule__BooleanOperation__Group_1_0_0_2__1 : rule__BooleanOperation__Group_1_0_0_2__1__Impl ;
    public final void rule__BooleanOperation__Group_1_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5090:1: ( rule__BooleanOperation__Group_1_0_0_2__1__Impl )
            // InternalAle.g:5091:2: rule__BooleanOperation__Group_1_0_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0_0_2__1__Impl();

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
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_2__1"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_2__1__Impl"
    // InternalAle.g:5097:1: rule__BooleanOperation__Group_1_0_0_2__1__Impl : ( 'xor' ) ;
    public final void rule__BooleanOperation__Group_1_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5101:1: ( ( 'xor' ) )
            // InternalAle.g:5102:1: ( 'xor' )
            {
            // InternalAle.g:5102:1: ( 'xor' )
            // InternalAle.g:5103:2: 'xor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getXorKeyword_1_0_0_2_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getXorKeyword_1_0_0_2_1()); 
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
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_2__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group__0"
    // InternalAle.g:5113:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5117:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // InternalAle.g:5118:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__CompareOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group__1();

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
    // $ANTLR end "rule__CompareOperation__Group__0"


    // $ANTLR start "rule__CompareOperation__Group__0__Impl"
    // InternalAle.g:5125:1: rule__CompareOperation__Group__0__Impl : ( ruleEqualityOperation ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5129:1: ( ( ruleEqualityOperation ) )
            // InternalAle.g:5130:1: ( ruleEqualityOperation )
            {
            // InternalAle.g:5130:1: ( ruleEqualityOperation )
            // InternalAle.g:5131:2: ruleEqualityOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getEqualityOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualityOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getEqualityOperationParserRuleCall_0()); 
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
    // $ANTLR end "rule__CompareOperation__Group__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group__1"
    // InternalAle.g:5140:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5144:1: ( rule__CompareOperation__Group__1__Impl )
            // InternalAle.g:5145:2: rule__CompareOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group__1__Impl();

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
    // $ANTLR end "rule__CompareOperation__Group__1"


    // $ANTLR start "rule__CompareOperation__Group__1__Impl"
    // InternalAle.g:5151:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 )* ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5155:1: ( ( ( rule__CompareOperation__Group_1__0 )* ) )
            // InternalAle.g:5156:1: ( ( rule__CompareOperation__Group_1__0 )* )
            {
            // InternalAle.g:5156:1: ( ( rule__CompareOperation__Group_1__0 )* )
            // InternalAle.g:5157:2: ( rule__CompareOperation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // InternalAle.g:5158:2: ( rule__CompareOperation__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                switch ( input.LA(1) ) {
                case 51:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred67_InternalAle()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 52:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred67_InternalAle()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 53:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred67_InternalAle()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 54:
                    {
                    int LA36_5 = input.LA(2);

                    if ( (synpred67_InternalAle()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 55:
                    {
                    int LA36_6 = input.LA(2);

                    if ( (synpred67_InternalAle()) ) {
                        alt36=1;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // InternalAle.g:5158:3: rule__CompareOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__CompareOperation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CompareOperation__Group__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1__0"
    // InternalAle.g:5167:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5171:1: ( rule__CompareOperation__Group_1__0__Impl )
            // InternalAle.g:5172:2: rule__CompareOperation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1__0__Impl();

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
    // $ANTLR end "rule__CompareOperation__Group_1__0"


    // $ANTLR start "rule__CompareOperation__Group_1__0__Impl"
    // InternalAle.g:5178:1: rule__CompareOperation__Group_1__0__Impl : ( ( rule__CompareOperation__Group_1_0__0 ) ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5182:1: ( ( ( rule__CompareOperation__Group_1_0__0 ) ) )
            // InternalAle.g:5183:1: ( ( rule__CompareOperation__Group_1_0__0 ) )
            {
            // InternalAle.g:5183:1: ( ( rule__CompareOperation__Group_1_0__0 ) )
            // InternalAle.g:5184:2: ( rule__CompareOperation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1_0()); 
            }
            // InternalAle.g:5185:2: ( rule__CompareOperation__Group_1_0__0 )
            // InternalAle.g:5185:3: rule__CompareOperation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__CompareOperation__Group_1__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0__0"
    // InternalAle.g:5194:1: rule__CompareOperation__Group_1_0__0 : rule__CompareOperation__Group_1_0__0__Impl rule__CompareOperation__Group_1_0__1 ;
    public final void rule__CompareOperation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5198:1: ( rule__CompareOperation__Group_1_0__0__Impl rule__CompareOperation__Group_1_0__1 )
            // InternalAle.g:5199:2: rule__CompareOperation__Group_1_0__0__Impl rule__CompareOperation__Group_1_0__1
            {
            pushFollow(FOLLOW_27);
            rule__CompareOperation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0__1();

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
    // $ANTLR end "rule__CompareOperation__Group_1_0__0"


    // $ANTLR start "rule__CompareOperation__Group_1_0__0__Impl"
    // InternalAle.g:5206:1: rule__CompareOperation__Group_1_0__0__Impl : ( ( rule__CompareOperation__Alternatives_1_0_0 ) ) ;
    public final void rule__CompareOperation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5210:1: ( ( ( rule__CompareOperation__Alternatives_1_0_0 ) ) )
            // InternalAle.g:5211:1: ( ( rule__CompareOperation__Alternatives_1_0_0 ) )
            {
            // InternalAle.g:5211:1: ( ( rule__CompareOperation__Alternatives_1_0_0 ) )
            // InternalAle.g:5212:2: ( rule__CompareOperation__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getAlternatives_1_0_0()); 
            }
            // InternalAle.g:5213:2: ( rule__CompareOperation__Alternatives_1_0_0 )
            // InternalAle.g:5213:3: rule__CompareOperation__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getAlternatives_1_0_0()); 
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
    // $ANTLR end "rule__CompareOperation__Group_1_0__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0__1"
    // InternalAle.g:5221:1: rule__CompareOperation__Group_1_0__1 : rule__CompareOperation__Group_1_0__1__Impl ;
    public final void rule__CompareOperation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5225:1: ( rule__CompareOperation__Group_1_0__1__Impl )
            // InternalAle.g:5226:2: rule__CompareOperation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__CompareOperation__Group_1_0__1"


    // $ANTLR start "rule__CompareOperation__Group_1_0__1__Impl"
    // InternalAle.g:5232:1: rule__CompareOperation__Group_1_0__1__Impl : ( ( rule__CompareOperation__RightAssignment_1_0_1 ) ) ;
    public final void rule__CompareOperation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5236:1: ( ( ( rule__CompareOperation__RightAssignment_1_0_1 ) ) )
            // InternalAle.g:5237:1: ( ( rule__CompareOperation__RightAssignment_1_0_1 ) )
            {
            // InternalAle.g:5237:1: ( ( rule__CompareOperation__RightAssignment_1_0_1 ) )
            // InternalAle.g:5238:2: ( rule__CompareOperation__RightAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getRightAssignment_1_0_1()); 
            }
            // InternalAle.g:5239:2: ( rule__CompareOperation__RightAssignment_1_0_1 )
            // InternalAle.g:5239:3: rule__CompareOperation__RightAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__RightAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getRightAssignment_1_0_1()); 
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
    // $ANTLR end "rule__CompareOperation__Group_1_0__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_0__0"
    // InternalAle.g:5248:1: rule__CompareOperation__Group_1_0_0_0__0 : rule__CompareOperation__Group_1_0_0_0__0__Impl rule__CompareOperation__Group_1_0_0_0__1 ;
    public final void rule__CompareOperation__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5252:1: ( rule__CompareOperation__Group_1_0_0_0__0__Impl rule__CompareOperation__Group_1_0_0_0__1 )
            // InternalAle.g:5253:2: rule__CompareOperation__Group_1_0_0_0__0__Impl rule__CompareOperation__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_48);
            rule__CompareOperation__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_0__1();

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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_0__0"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_0__0__Impl"
    // InternalAle.g:5260:1: rule__CompareOperation__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5264:1: ( ( () ) )
            // InternalAle.g:5265:1: ( () )
            {
            // InternalAle.g:5265:1: ( () )
            // InternalAle.g:5266:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getCompareLEOperationLeftAction_1_0_0_0_0()); 
            }
            // InternalAle.g:5267:2: ()
            // InternalAle.g:5267:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getCompareLEOperationLeftAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_0__1"
    // InternalAle.g:5275:1: rule__CompareOperation__Group_1_0_0_0__1 : rule__CompareOperation__Group_1_0_0_0__1__Impl ;
    public final void rule__CompareOperation__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5279:1: ( rule__CompareOperation__Group_1_0_0_0__1__Impl )
            // InternalAle.g:5280:2: rule__CompareOperation__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_0__1__Impl();

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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_0__1"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_0__1__Impl"
    // InternalAle.g:5286:1: rule__CompareOperation__Group_1_0_0_0__1__Impl : ( '<=' ) ;
    public final void rule__CompareOperation__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5290:1: ( ( '<=' ) )
            // InternalAle.g:5291:1: ( '<=' )
            {
            // InternalAle.g:5291:1: ( '<=' )
            // InternalAle.g:5292:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getLessThanSignEqualsSignKeyword_1_0_0_0_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getLessThanSignEqualsSignKeyword_1_0_0_0_1()); 
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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_1__0"
    // InternalAle.g:5302:1: rule__CompareOperation__Group_1_0_0_1__0 : rule__CompareOperation__Group_1_0_0_1__0__Impl rule__CompareOperation__Group_1_0_0_1__1 ;
    public final void rule__CompareOperation__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5306:1: ( rule__CompareOperation__Group_1_0_0_1__0__Impl rule__CompareOperation__Group_1_0_0_1__1 )
            // InternalAle.g:5307:2: rule__CompareOperation__Group_1_0_0_1__0__Impl rule__CompareOperation__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_49);
            rule__CompareOperation__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_1__1();

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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_1__0"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_1__0__Impl"
    // InternalAle.g:5314:1: rule__CompareOperation__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5318:1: ( ( () ) )
            // InternalAle.g:5319:1: ( () )
            {
            // InternalAle.g:5319:1: ( () )
            // InternalAle.g:5320:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getCompareGEOperationLeftAction_1_0_0_1_0()); 
            }
            // InternalAle.g:5321:2: ()
            // InternalAle.g:5321:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getCompareGEOperationLeftAction_1_0_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_1__1"
    // InternalAle.g:5329:1: rule__CompareOperation__Group_1_0_0_1__1 : rule__CompareOperation__Group_1_0_0_1__1__Impl ;
    public final void rule__CompareOperation__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5333:1: ( rule__CompareOperation__Group_1_0_0_1__1__Impl )
            // InternalAle.g:5334:2: rule__CompareOperation__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_1__1__Impl();

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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_1__1"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_1__1__Impl"
    // InternalAle.g:5340:1: rule__CompareOperation__Group_1_0_0_1__1__Impl : ( '>=' ) ;
    public final void rule__CompareOperation__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5344:1: ( ( '>=' ) )
            // InternalAle.g:5345:1: ( '>=' )
            {
            // InternalAle.g:5345:1: ( '>=' )
            // InternalAle.g:5346:2: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1_1()); 
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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_2__0"
    // InternalAle.g:5356:1: rule__CompareOperation__Group_1_0_0_2__0 : rule__CompareOperation__Group_1_0_0_2__0__Impl rule__CompareOperation__Group_1_0_0_2__1 ;
    public final void rule__CompareOperation__Group_1_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5360:1: ( rule__CompareOperation__Group_1_0_0_2__0__Impl rule__CompareOperation__Group_1_0_0_2__1 )
            // InternalAle.g:5361:2: rule__CompareOperation__Group_1_0_0_2__0__Impl rule__CompareOperation__Group_1_0_0_2__1
            {
            pushFollow(FOLLOW_50);
            rule__CompareOperation__Group_1_0_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_2__1();

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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_2__0"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_2__0__Impl"
    // InternalAle.g:5368:1: rule__CompareOperation__Group_1_0_0_2__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5372:1: ( ( () ) )
            // InternalAle.g:5373:1: ( () )
            {
            // InternalAle.g:5373:1: ( () )
            // InternalAle.g:5374:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getCompareNEOperationLeftAction_1_0_0_2_0()); 
            }
            // InternalAle.g:5375:2: ()
            // InternalAle.g:5375:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getCompareNEOperationLeftAction_1_0_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_2__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_2__1"
    // InternalAle.g:5383:1: rule__CompareOperation__Group_1_0_0_2__1 : rule__CompareOperation__Group_1_0_0_2__1__Impl ;
    public final void rule__CompareOperation__Group_1_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5387:1: ( rule__CompareOperation__Group_1_0_0_2__1__Impl )
            // InternalAle.g:5388:2: rule__CompareOperation__Group_1_0_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_2__1__Impl();

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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_2__1"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_2__1__Impl"
    // InternalAle.g:5394:1: rule__CompareOperation__Group_1_0_0_2__1__Impl : ( '!=' ) ;
    public final void rule__CompareOperation__Group_1_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5398:1: ( ( '!=' ) )
            // InternalAle.g:5399:1: ( '!=' )
            {
            // InternalAle.g:5399:1: ( '!=' )
            // InternalAle.g:5400:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getExclamationMarkEqualsSignKeyword_1_0_0_2_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getExclamationMarkEqualsSignKeyword_1_0_0_2_1()); 
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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_2__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_3__0"
    // InternalAle.g:5410:1: rule__CompareOperation__Group_1_0_0_3__0 : rule__CompareOperation__Group_1_0_0_3__0__Impl rule__CompareOperation__Group_1_0_0_3__1 ;
    public final void rule__CompareOperation__Group_1_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5414:1: ( rule__CompareOperation__Group_1_0_0_3__0__Impl rule__CompareOperation__Group_1_0_0_3__1 )
            // InternalAle.g:5415:2: rule__CompareOperation__Group_1_0_0_3__0__Impl rule__CompareOperation__Group_1_0_0_3__1
            {
            pushFollow(FOLLOW_51);
            rule__CompareOperation__Group_1_0_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_3__1();

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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_3__0"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_3__0__Impl"
    // InternalAle.g:5422:1: rule__CompareOperation__Group_1_0_0_3__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5426:1: ( ( () ) )
            // InternalAle.g:5427:1: ( () )
            {
            // InternalAle.g:5427:1: ( () )
            // InternalAle.g:5428:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getCompareLOperationLeftAction_1_0_0_3_0()); 
            }
            // InternalAle.g:5429:2: ()
            // InternalAle.g:5429:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getCompareLOperationLeftAction_1_0_0_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_3__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_3__1"
    // InternalAle.g:5437:1: rule__CompareOperation__Group_1_0_0_3__1 : rule__CompareOperation__Group_1_0_0_3__1__Impl ;
    public final void rule__CompareOperation__Group_1_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5441:1: ( rule__CompareOperation__Group_1_0_0_3__1__Impl )
            // InternalAle.g:5442:2: rule__CompareOperation__Group_1_0_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_3__1__Impl();

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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_3__1"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_3__1__Impl"
    // InternalAle.g:5448:1: rule__CompareOperation__Group_1_0_0_3__1__Impl : ( '<' ) ;
    public final void rule__CompareOperation__Group_1_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5452:1: ( ( '<' ) )
            // InternalAle.g:5453:1: ( '<' )
            {
            // InternalAle.g:5453:1: ( '<' )
            // InternalAle.g:5454:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1_0_0_3_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1_0_0_3_1()); 
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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_3__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_4__0"
    // InternalAle.g:5464:1: rule__CompareOperation__Group_1_0_0_4__0 : rule__CompareOperation__Group_1_0_0_4__0__Impl rule__CompareOperation__Group_1_0_0_4__1 ;
    public final void rule__CompareOperation__Group_1_0_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5468:1: ( rule__CompareOperation__Group_1_0_0_4__0__Impl rule__CompareOperation__Group_1_0_0_4__1 )
            // InternalAle.g:5469:2: rule__CompareOperation__Group_1_0_0_4__0__Impl rule__CompareOperation__Group_1_0_0_4__1
            {
            pushFollow(FOLLOW_46);
            rule__CompareOperation__Group_1_0_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_4__1();

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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_4__0"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_4__0__Impl"
    // InternalAle.g:5476:1: rule__CompareOperation__Group_1_0_0_4__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1_0_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5480:1: ( ( () ) )
            // InternalAle.g:5481:1: ( () )
            {
            // InternalAle.g:5481:1: ( () )
            // InternalAle.g:5482:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getCompareGOperationLeftAction_1_0_0_4_0()); 
            }
            // InternalAle.g:5483:2: ()
            // InternalAle.g:5483:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getCompareGOperationLeftAction_1_0_0_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_4__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_4__1"
    // InternalAle.g:5491:1: rule__CompareOperation__Group_1_0_0_4__1 : rule__CompareOperation__Group_1_0_0_4__1__Impl ;
    public final void rule__CompareOperation__Group_1_0_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5495:1: ( rule__CompareOperation__Group_1_0_0_4__1__Impl )
            // InternalAle.g:5496:2: rule__CompareOperation__Group_1_0_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_4__1__Impl();

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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_4__1"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_4__1__Impl"
    // InternalAle.g:5502:1: rule__CompareOperation__Group_1_0_0_4__1__Impl : ( '>' ) ;
    public final void rule__CompareOperation__Group_1_0_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5506:1: ( ( '>' ) )
            // InternalAle.g:5507:1: ( '>' )
            {
            // InternalAle.g:5507:1: ( '>' )
            // InternalAle.g:5508:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_1_0_0_4_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_1_0_0_4_1()); 
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
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_4__1__Impl"


    // $ANTLR start "rule__EqualityOperation__Group__0"
    // InternalAle.g:5518:1: rule__EqualityOperation__Group__0 : rule__EqualityOperation__Group__0__Impl rule__EqualityOperation__Group__1 ;
    public final void rule__EqualityOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5522:1: ( rule__EqualityOperation__Group__0__Impl rule__EqualityOperation__Group__1 )
            // InternalAle.g:5523:2: rule__EqualityOperation__Group__0__Impl rule__EqualityOperation__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__EqualityOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group__1();

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
    // $ANTLR end "rule__EqualityOperation__Group__0"


    // $ANTLR start "rule__EqualityOperation__Group__0__Impl"
    // InternalAle.g:5530:1: rule__EqualityOperation__Group__0__Impl : ( ruleMultOperation ) ;
    public final void rule__EqualityOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5534:1: ( ( ruleMultOperation ) )
            // InternalAle.g:5535:1: ( ruleMultOperation )
            {
            // InternalAle.g:5535:1: ( ruleMultOperation )
            // InternalAle.g:5536:2: ruleMultOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getMultOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getMultOperationParserRuleCall_0()); 
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
    // $ANTLR end "rule__EqualityOperation__Group__0__Impl"


    // $ANTLR start "rule__EqualityOperation__Group__1"
    // InternalAle.g:5545:1: rule__EqualityOperation__Group__1 : rule__EqualityOperation__Group__1__Impl ;
    public final void rule__EqualityOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5549:1: ( rule__EqualityOperation__Group__1__Impl )
            // InternalAle.g:5550:2: rule__EqualityOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group__1__Impl();

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
    // $ANTLR end "rule__EqualityOperation__Group__1"


    // $ANTLR start "rule__EqualityOperation__Group__1__Impl"
    // InternalAle.g:5556:1: rule__EqualityOperation__Group__1__Impl : ( ( rule__EqualityOperation__Group_1__0 )* ) ;
    public final void rule__EqualityOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5560:1: ( ( ( rule__EqualityOperation__Group_1__0 )* ) )
            // InternalAle.g:5561:1: ( ( rule__EqualityOperation__Group_1__0 )* )
            {
            // InternalAle.g:5561:1: ( ( rule__EqualityOperation__Group_1__0 )* )
            // InternalAle.g:5562:2: ( rule__EqualityOperation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getGroup_1()); 
            }
            // InternalAle.g:5563:2: ( rule__EqualityOperation__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==71) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred68_InternalAle()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalAle.g:5563:3: rule__EqualityOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__EqualityOperation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getGroup_1()); 
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
    // $ANTLR end "rule__EqualityOperation__Group__1__Impl"


    // $ANTLR start "rule__EqualityOperation__Group_1__0"
    // InternalAle.g:5572:1: rule__EqualityOperation__Group_1__0 : rule__EqualityOperation__Group_1__0__Impl ;
    public final void rule__EqualityOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5576:1: ( rule__EqualityOperation__Group_1__0__Impl )
            // InternalAle.g:5577:2: rule__EqualityOperation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group_1__0__Impl();

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
    // $ANTLR end "rule__EqualityOperation__Group_1__0"


    // $ANTLR start "rule__EqualityOperation__Group_1__0__Impl"
    // InternalAle.g:5583:1: rule__EqualityOperation__Group_1__0__Impl : ( ( rule__EqualityOperation__Group_1_0__0 ) ) ;
    public final void rule__EqualityOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5587:1: ( ( ( rule__EqualityOperation__Group_1_0__0 ) ) )
            // InternalAle.g:5588:1: ( ( rule__EqualityOperation__Group_1_0__0 ) )
            {
            // InternalAle.g:5588:1: ( ( rule__EqualityOperation__Group_1_0__0 ) )
            // InternalAle.g:5589:2: ( rule__EqualityOperation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getGroup_1_0()); 
            }
            // InternalAle.g:5590:2: ( rule__EqualityOperation__Group_1_0__0 )
            // InternalAle.g:5590:3: rule__EqualityOperation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__EqualityOperation__Group_1__0__Impl"


    // $ANTLR start "rule__EqualityOperation__Group_1_0__0"
    // InternalAle.g:5599:1: rule__EqualityOperation__Group_1_0__0 : rule__EqualityOperation__Group_1_0__0__Impl rule__EqualityOperation__Group_1_0__1 ;
    public final void rule__EqualityOperation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5603:1: ( rule__EqualityOperation__Group_1_0__0__Impl rule__EqualityOperation__Group_1_0__1 )
            // InternalAle.g:5604:2: rule__EqualityOperation__Group_1_0__0__Impl rule__EqualityOperation__Group_1_0__1
            {
            pushFollow(FOLLOW_52);
            rule__EqualityOperation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group_1_0__1();

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
    // $ANTLR end "rule__EqualityOperation__Group_1_0__0"


    // $ANTLR start "rule__EqualityOperation__Group_1_0__0__Impl"
    // InternalAle.g:5611:1: rule__EqualityOperation__Group_1_0__0__Impl : ( () ) ;
    public final void rule__EqualityOperation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5615:1: ( ( () ) )
            // InternalAle.g:5616:1: ( () )
            {
            // InternalAle.g:5616:1: ( () )
            // InternalAle.g:5617:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getEqualityOperationLeftAction_1_0_0()); 
            }
            // InternalAle.g:5618:2: ()
            // InternalAle.g:5618:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getEqualityOperationLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__Group_1_0__0__Impl"


    // $ANTLR start "rule__EqualityOperation__Group_1_0__1"
    // InternalAle.g:5626:1: rule__EqualityOperation__Group_1_0__1 : rule__EqualityOperation__Group_1_0__1__Impl rule__EqualityOperation__Group_1_0__2 ;
    public final void rule__EqualityOperation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5630:1: ( rule__EqualityOperation__Group_1_0__1__Impl rule__EqualityOperation__Group_1_0__2 )
            // InternalAle.g:5631:2: rule__EqualityOperation__Group_1_0__1__Impl rule__EqualityOperation__Group_1_0__2
            {
            pushFollow(FOLLOW_27);
            rule__EqualityOperation__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group_1_0__2();

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
    // $ANTLR end "rule__EqualityOperation__Group_1_0__1"


    // $ANTLR start "rule__EqualityOperation__Group_1_0__1__Impl"
    // InternalAle.g:5638:1: rule__EqualityOperation__Group_1_0__1__Impl : ( ( rule__EqualityOperation__OpAssignment_1_0_1 ) ) ;
    public final void rule__EqualityOperation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5642:1: ( ( ( rule__EqualityOperation__OpAssignment_1_0_1 ) ) )
            // InternalAle.g:5643:1: ( ( rule__EqualityOperation__OpAssignment_1_0_1 ) )
            {
            // InternalAle.g:5643:1: ( ( rule__EqualityOperation__OpAssignment_1_0_1 ) )
            // InternalAle.g:5644:2: ( rule__EqualityOperation__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getOpAssignment_1_0_1()); 
            }
            // InternalAle.g:5645:2: ( rule__EqualityOperation__OpAssignment_1_0_1 )
            // InternalAle.g:5645:3: rule__EqualityOperation__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getOpAssignment_1_0_1()); 
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
    // $ANTLR end "rule__EqualityOperation__Group_1_0__1__Impl"


    // $ANTLR start "rule__EqualityOperation__Group_1_0__2"
    // InternalAle.g:5653:1: rule__EqualityOperation__Group_1_0__2 : rule__EqualityOperation__Group_1_0__2__Impl ;
    public final void rule__EqualityOperation__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5657:1: ( rule__EqualityOperation__Group_1_0__2__Impl )
            // InternalAle.g:5658:2: rule__EqualityOperation__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__EqualityOperation__Group_1_0__2"


    // $ANTLR start "rule__EqualityOperation__Group_1_0__2__Impl"
    // InternalAle.g:5664:1: rule__EqualityOperation__Group_1_0__2__Impl : ( ( rule__EqualityOperation__RightAssignment_1_0_2 ) ) ;
    public final void rule__EqualityOperation__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5668:1: ( ( ( rule__EqualityOperation__RightAssignment_1_0_2 ) ) )
            // InternalAle.g:5669:1: ( ( rule__EqualityOperation__RightAssignment_1_0_2 ) )
            {
            // InternalAle.g:5669:1: ( ( rule__EqualityOperation__RightAssignment_1_0_2 ) )
            // InternalAle.g:5670:2: ( rule__EqualityOperation__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getRightAssignment_1_0_2()); 
            }
            // InternalAle.g:5671:2: ( rule__EqualityOperation__RightAssignment_1_0_2 )
            // InternalAle.g:5671:3: rule__EqualityOperation__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getRightAssignment_1_0_2()); 
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
    // $ANTLR end "rule__EqualityOperation__Group_1_0__2__Impl"


    // $ANTLR start "rule__MultOperation__Group__0"
    // InternalAle.g:5680:1: rule__MultOperation__Group__0 : rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1 ;
    public final void rule__MultOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5684:1: ( rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1 )
            // InternalAle.g:5685:2: rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__MultOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group__1();

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
    // $ANTLR end "rule__MultOperation__Group__0"


    // $ANTLR start "rule__MultOperation__Group__0__Impl"
    // InternalAle.g:5692:1: rule__MultOperation__Group__0__Impl : ( ruleAddOperation ) ;
    public final void rule__MultOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5696:1: ( ( ruleAddOperation ) )
            // InternalAle.g:5697:1: ( ruleAddOperation )
            {
            // InternalAle.g:5697:1: ( ruleAddOperation )
            // InternalAle.g:5698:2: ruleAddOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getAddOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getAddOperationParserRuleCall_0()); 
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
    // $ANTLR end "rule__MultOperation__Group__0__Impl"


    // $ANTLR start "rule__MultOperation__Group__1"
    // InternalAle.g:5707:1: rule__MultOperation__Group__1 : rule__MultOperation__Group__1__Impl ;
    public final void rule__MultOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5711:1: ( rule__MultOperation__Group__1__Impl )
            // InternalAle.g:5712:2: rule__MultOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group__1__Impl();

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
    // $ANTLR end "rule__MultOperation__Group__1"


    // $ANTLR start "rule__MultOperation__Group__1__Impl"
    // InternalAle.g:5718:1: rule__MultOperation__Group__1__Impl : ( ( rule__MultOperation__Group_1__0 )* ) ;
    public final void rule__MultOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5722:1: ( ( ( rule__MultOperation__Group_1__0 )* ) )
            // InternalAle.g:5723:1: ( ( rule__MultOperation__Group_1__0 )* )
            {
            // InternalAle.g:5723:1: ( ( rule__MultOperation__Group_1__0 )* )
            // InternalAle.g:5724:2: ( rule__MultOperation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup_1()); 
            }
            // InternalAle.g:5725:2: ( rule__MultOperation__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==56) ) {
                    int LA38_2 = input.LA(2);

                    if ( (synpred69_InternalAle()) ) {
                        alt38=1;
                    }


                }
                else if ( (LA38_0==57) ) {
                    int LA38_3 = input.LA(2);

                    if ( (synpred69_InternalAle()) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalAle.g:5725:3: rule__MultOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_55);
            	    rule__MultOperation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getGroup_1()); 
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
    // $ANTLR end "rule__MultOperation__Group__1__Impl"


    // $ANTLR start "rule__MultOperation__Group_1__0"
    // InternalAle.g:5734:1: rule__MultOperation__Group_1__0 : rule__MultOperation__Group_1__0__Impl ;
    public final void rule__MultOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5738:1: ( rule__MultOperation__Group_1__0__Impl )
            // InternalAle.g:5739:2: rule__MultOperation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1__0__Impl();

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
    // $ANTLR end "rule__MultOperation__Group_1__0"


    // $ANTLR start "rule__MultOperation__Group_1__0__Impl"
    // InternalAle.g:5745:1: rule__MultOperation__Group_1__0__Impl : ( ( rule__MultOperation__Group_1_0__0 ) ) ;
    public final void rule__MultOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5749:1: ( ( ( rule__MultOperation__Group_1_0__0 ) ) )
            // InternalAle.g:5750:1: ( ( rule__MultOperation__Group_1_0__0 ) )
            {
            // InternalAle.g:5750:1: ( ( rule__MultOperation__Group_1_0__0 ) )
            // InternalAle.g:5751:2: ( rule__MultOperation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup_1_0()); 
            }
            // InternalAle.g:5752:2: ( rule__MultOperation__Group_1_0__0 )
            // InternalAle.g:5752:3: rule__MultOperation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__MultOperation__Group_1__0__Impl"


    // $ANTLR start "rule__MultOperation__Group_1_0__0"
    // InternalAle.g:5761:1: rule__MultOperation__Group_1_0__0 : rule__MultOperation__Group_1_0__0__Impl rule__MultOperation__Group_1_0__1 ;
    public final void rule__MultOperation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5765:1: ( rule__MultOperation__Group_1_0__0__Impl rule__MultOperation__Group_1_0__1 )
            // InternalAle.g:5766:2: rule__MultOperation__Group_1_0__0__Impl rule__MultOperation__Group_1_0__1
            {
            pushFollow(FOLLOW_27);
            rule__MultOperation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0__1();

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
    // $ANTLR end "rule__MultOperation__Group_1_0__0"


    // $ANTLR start "rule__MultOperation__Group_1_0__0__Impl"
    // InternalAle.g:5773:1: rule__MultOperation__Group_1_0__0__Impl : ( ( rule__MultOperation__Alternatives_1_0_0 ) ) ;
    public final void rule__MultOperation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5777:1: ( ( ( rule__MultOperation__Alternatives_1_0_0 ) ) )
            // InternalAle.g:5778:1: ( ( rule__MultOperation__Alternatives_1_0_0 ) )
            {
            // InternalAle.g:5778:1: ( ( rule__MultOperation__Alternatives_1_0_0 ) )
            // InternalAle.g:5779:2: ( rule__MultOperation__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getAlternatives_1_0_0()); 
            }
            // InternalAle.g:5780:2: ( rule__MultOperation__Alternatives_1_0_0 )
            // InternalAle.g:5780:3: rule__MultOperation__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getAlternatives_1_0_0()); 
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
    // $ANTLR end "rule__MultOperation__Group_1_0__0__Impl"


    // $ANTLR start "rule__MultOperation__Group_1_0__1"
    // InternalAle.g:5788:1: rule__MultOperation__Group_1_0__1 : rule__MultOperation__Group_1_0__1__Impl ;
    public final void rule__MultOperation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5792:1: ( rule__MultOperation__Group_1_0__1__Impl )
            // InternalAle.g:5793:2: rule__MultOperation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__MultOperation__Group_1_0__1"


    // $ANTLR start "rule__MultOperation__Group_1_0__1__Impl"
    // InternalAle.g:5799:1: rule__MultOperation__Group_1_0__1__Impl : ( ( rule__MultOperation__RightAssignment_1_0_1 ) ) ;
    public final void rule__MultOperation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5803:1: ( ( ( rule__MultOperation__RightAssignment_1_0_1 ) ) )
            // InternalAle.g:5804:1: ( ( rule__MultOperation__RightAssignment_1_0_1 ) )
            {
            // InternalAle.g:5804:1: ( ( rule__MultOperation__RightAssignment_1_0_1 ) )
            // InternalAle.g:5805:2: ( rule__MultOperation__RightAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getRightAssignment_1_0_1()); 
            }
            // InternalAle.g:5806:2: ( rule__MultOperation__RightAssignment_1_0_1 )
            // InternalAle.g:5806:3: rule__MultOperation__RightAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__RightAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getRightAssignment_1_0_1()); 
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
    // $ANTLR end "rule__MultOperation__Group_1_0__1__Impl"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_0__0"
    // InternalAle.g:5815:1: rule__MultOperation__Group_1_0_0_0__0 : rule__MultOperation__Group_1_0_0_0__0__Impl rule__MultOperation__Group_1_0_0_0__1 ;
    public final void rule__MultOperation__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5819:1: ( rule__MultOperation__Group_1_0_0_0__0__Impl rule__MultOperation__Group_1_0_0_0__1 )
            // InternalAle.g:5820:2: rule__MultOperation__Group_1_0_0_0__0__Impl rule__MultOperation__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_56);
            rule__MultOperation__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0_0_0__1();

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
    // $ANTLR end "rule__MultOperation__Group_1_0_0_0__0"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_0__0__Impl"
    // InternalAle.g:5827:1: rule__MultOperation__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__MultOperation__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5831:1: ( ( () ) )
            // InternalAle.g:5832:1: ( () )
            {
            // InternalAle.g:5832:1: ( () )
            // InternalAle.g:5833:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getMultOperationLeftAction_1_0_0_0_0()); 
            }
            // InternalAle.g:5834:2: ()
            // InternalAle.g:5834:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getMultOperationLeftAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_0__1"
    // InternalAle.g:5842:1: rule__MultOperation__Group_1_0_0_0__1 : rule__MultOperation__Group_1_0_0_0__1__Impl ;
    public final void rule__MultOperation__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5846:1: ( rule__MultOperation__Group_1_0_0_0__1__Impl )
            // InternalAle.g:5847:2: rule__MultOperation__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0_0_0__1__Impl();

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
    // $ANTLR end "rule__MultOperation__Group_1_0_0_0__1"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_0__1__Impl"
    // InternalAle.g:5853:1: rule__MultOperation__Group_1_0_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultOperation__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5857:1: ( ( '*' ) )
            // InternalAle.g:5858:1: ( '*' )
            {
            // InternalAle.g:5858:1: ( '*' )
            // InternalAle.g:5859:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getAsteriskKeyword_1_0_0_0_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getAsteriskKeyword_1_0_0_0_1()); 
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
    // $ANTLR end "rule__MultOperation__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_1__0"
    // InternalAle.g:5869:1: rule__MultOperation__Group_1_0_0_1__0 : rule__MultOperation__Group_1_0_0_1__0__Impl rule__MultOperation__Group_1_0_0_1__1 ;
    public final void rule__MultOperation__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5873:1: ( rule__MultOperation__Group_1_0_0_1__0__Impl rule__MultOperation__Group_1_0_0_1__1 )
            // InternalAle.g:5874:2: rule__MultOperation__Group_1_0_0_1__0__Impl rule__MultOperation__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_54);
            rule__MultOperation__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0_0_1__1();

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
    // $ANTLR end "rule__MultOperation__Group_1_0_0_1__0"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_1__0__Impl"
    // InternalAle.g:5881:1: rule__MultOperation__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__MultOperation__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5885:1: ( ( () ) )
            // InternalAle.g:5886:1: ( () )
            {
            // InternalAle.g:5886:1: ( () )
            // InternalAle.g:5887:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getDivOperationLeftAction_1_0_0_1_0()); 
            }
            // InternalAle.g:5888:2: ()
            // InternalAle.g:5888:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getDivOperationLeftAction_1_0_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_1__1"
    // InternalAle.g:5896:1: rule__MultOperation__Group_1_0_0_1__1 : rule__MultOperation__Group_1_0_0_1__1__Impl ;
    public final void rule__MultOperation__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5900:1: ( rule__MultOperation__Group_1_0_0_1__1__Impl )
            // InternalAle.g:5901:2: rule__MultOperation__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0_0_1__1__Impl();

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
    // $ANTLR end "rule__MultOperation__Group_1_0_0_1__1"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_1__1__Impl"
    // InternalAle.g:5907:1: rule__MultOperation__Group_1_0_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultOperation__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5911:1: ( ( '/' ) )
            // InternalAle.g:5912:1: ( '/' )
            {
            // InternalAle.g:5912:1: ( '/' )
            // InternalAle.g:5913:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSolidusKeyword_1_0_0_1_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getSolidusKeyword_1_0_0_1_1()); 
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
    // $ANTLR end "rule__MultOperation__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__AddOperation__Group__0"
    // InternalAle.g:5923:1: rule__AddOperation__Group__0 : rule__AddOperation__Group__0__Impl rule__AddOperation__Group__1 ;
    public final void rule__AddOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5927:1: ( rule__AddOperation__Group__0__Impl rule__AddOperation__Group__1 )
            // InternalAle.g:5928:2: rule__AddOperation__Group__0__Impl rule__AddOperation__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__AddOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group__1();

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
    // $ANTLR end "rule__AddOperation__Group__0"


    // $ANTLR start "rule__AddOperation__Group__0__Impl"
    // InternalAle.g:5935:1: rule__AddOperation__Group__0__Impl : ( ruleInfixOperation ) ;
    public final void rule__AddOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5939:1: ( ( ruleInfixOperation ) )
            // InternalAle.g:5940:1: ( ruleInfixOperation )
            {
            // InternalAle.g:5940:1: ( ruleInfixOperation )
            // InternalAle.g:5941:2: ruleInfixOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getInfixOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInfixOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getInfixOperationParserRuleCall_0()); 
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
    // $ANTLR end "rule__AddOperation__Group__0__Impl"


    // $ANTLR start "rule__AddOperation__Group__1"
    // InternalAle.g:5950:1: rule__AddOperation__Group__1 : rule__AddOperation__Group__1__Impl ;
    public final void rule__AddOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5954:1: ( rule__AddOperation__Group__1__Impl )
            // InternalAle.g:5955:2: rule__AddOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group__1__Impl();

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
    // $ANTLR end "rule__AddOperation__Group__1"


    // $ANTLR start "rule__AddOperation__Group__1__Impl"
    // InternalAle.g:5961:1: rule__AddOperation__Group__1__Impl : ( ( rule__AddOperation__Group_1__0 )* ) ;
    public final void rule__AddOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5965:1: ( ( ( rule__AddOperation__Group_1__0 )* ) )
            // InternalAle.g:5966:1: ( ( rule__AddOperation__Group_1__0 )* )
            {
            // InternalAle.g:5966:1: ( ( rule__AddOperation__Group_1__0 )* )
            // InternalAle.g:5967:2: ( rule__AddOperation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getGroup_1()); 
            }
            // InternalAle.g:5968:2: ( rule__AddOperation__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==58) ) {
                    int LA39_2 = input.LA(2);

                    if ( (synpred70_InternalAle()) ) {
                        alt39=1;
                    }


                }
                else if ( (LA39_0==59) ) {
                    int LA39_3 = input.LA(2);

                    if ( (synpred70_InternalAle()) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalAle.g:5968:3: rule__AddOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_58);
            	    rule__AddOperation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getGroup_1()); 
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
    // $ANTLR end "rule__AddOperation__Group__1__Impl"


    // $ANTLR start "rule__AddOperation__Group_1__0"
    // InternalAle.g:5977:1: rule__AddOperation__Group_1__0 : rule__AddOperation__Group_1__0__Impl ;
    public final void rule__AddOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5981:1: ( rule__AddOperation__Group_1__0__Impl )
            // InternalAle.g:5982:2: rule__AddOperation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1__0__Impl();

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
    // $ANTLR end "rule__AddOperation__Group_1__0"


    // $ANTLR start "rule__AddOperation__Group_1__0__Impl"
    // InternalAle.g:5988:1: rule__AddOperation__Group_1__0__Impl : ( ( rule__AddOperation__Group_1_0__0 ) ) ;
    public final void rule__AddOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5992:1: ( ( ( rule__AddOperation__Group_1_0__0 ) ) )
            // InternalAle.g:5993:1: ( ( rule__AddOperation__Group_1_0__0 ) )
            {
            // InternalAle.g:5993:1: ( ( rule__AddOperation__Group_1_0__0 ) )
            // InternalAle.g:5994:2: ( rule__AddOperation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getGroup_1_0()); 
            }
            // InternalAle.g:5995:2: ( rule__AddOperation__Group_1_0__0 )
            // InternalAle.g:5995:3: rule__AddOperation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__AddOperation__Group_1__0__Impl"


    // $ANTLR start "rule__AddOperation__Group_1_0__0"
    // InternalAle.g:6004:1: rule__AddOperation__Group_1_0__0 : rule__AddOperation__Group_1_0__0__Impl rule__AddOperation__Group_1_0__1 ;
    public final void rule__AddOperation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6008:1: ( rule__AddOperation__Group_1_0__0__Impl rule__AddOperation__Group_1_0__1 )
            // InternalAle.g:6009:2: rule__AddOperation__Group_1_0__0__Impl rule__AddOperation__Group_1_0__1
            {
            pushFollow(FOLLOW_27);
            rule__AddOperation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0__1();

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
    // $ANTLR end "rule__AddOperation__Group_1_0__0"


    // $ANTLR start "rule__AddOperation__Group_1_0__0__Impl"
    // InternalAle.g:6016:1: rule__AddOperation__Group_1_0__0__Impl : ( ( rule__AddOperation__Alternatives_1_0_0 ) ) ;
    public final void rule__AddOperation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6020:1: ( ( ( rule__AddOperation__Alternatives_1_0_0 ) ) )
            // InternalAle.g:6021:1: ( ( rule__AddOperation__Alternatives_1_0_0 ) )
            {
            // InternalAle.g:6021:1: ( ( rule__AddOperation__Alternatives_1_0_0 ) )
            // InternalAle.g:6022:2: ( rule__AddOperation__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getAlternatives_1_0_0()); 
            }
            // InternalAle.g:6023:2: ( rule__AddOperation__Alternatives_1_0_0 )
            // InternalAle.g:6023:3: rule__AddOperation__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getAlternatives_1_0_0()); 
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
    // $ANTLR end "rule__AddOperation__Group_1_0__0__Impl"


    // $ANTLR start "rule__AddOperation__Group_1_0__1"
    // InternalAle.g:6031:1: rule__AddOperation__Group_1_0__1 : rule__AddOperation__Group_1_0__1__Impl ;
    public final void rule__AddOperation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6035:1: ( rule__AddOperation__Group_1_0__1__Impl )
            // InternalAle.g:6036:2: rule__AddOperation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__AddOperation__Group_1_0__1"


    // $ANTLR start "rule__AddOperation__Group_1_0__1__Impl"
    // InternalAle.g:6042:1: rule__AddOperation__Group_1_0__1__Impl : ( ( rule__AddOperation__RightAssignment_1_0_1 ) ) ;
    public final void rule__AddOperation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6046:1: ( ( ( rule__AddOperation__RightAssignment_1_0_1 ) ) )
            // InternalAle.g:6047:1: ( ( rule__AddOperation__RightAssignment_1_0_1 ) )
            {
            // InternalAle.g:6047:1: ( ( rule__AddOperation__RightAssignment_1_0_1 ) )
            // InternalAle.g:6048:2: ( rule__AddOperation__RightAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getRightAssignment_1_0_1()); 
            }
            // InternalAle.g:6049:2: ( rule__AddOperation__RightAssignment_1_0_1 )
            // InternalAle.g:6049:3: rule__AddOperation__RightAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__RightAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getRightAssignment_1_0_1()); 
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
    // $ANTLR end "rule__AddOperation__Group_1_0__1__Impl"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_0__0"
    // InternalAle.g:6058:1: rule__AddOperation__Group_1_0_0_0__0 : rule__AddOperation__Group_1_0_0_0__0__Impl rule__AddOperation__Group_1_0_0_0__1 ;
    public final void rule__AddOperation__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6062:1: ( rule__AddOperation__Group_1_0_0_0__0__Impl rule__AddOperation__Group_1_0_0_0__1 )
            // InternalAle.g:6063:2: rule__AddOperation__Group_1_0_0_0__0__Impl rule__AddOperation__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_59);
            rule__AddOperation__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0_0_0__1();

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
    // $ANTLR end "rule__AddOperation__Group_1_0_0_0__0"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_0__0__Impl"
    // InternalAle.g:6070:1: rule__AddOperation__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__AddOperation__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6074:1: ( ( () ) )
            // InternalAle.g:6075:1: ( () )
            {
            // InternalAle.g:6075:1: ( () )
            // InternalAle.g:6076:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getAddOperationLeftAction_1_0_0_0_0()); 
            }
            // InternalAle.g:6077:2: ()
            // InternalAle.g:6077:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getAddOperationLeftAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_0__1"
    // InternalAle.g:6085:1: rule__AddOperation__Group_1_0_0_0__1 : rule__AddOperation__Group_1_0_0_0__1__Impl ;
    public final void rule__AddOperation__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6089:1: ( rule__AddOperation__Group_1_0_0_0__1__Impl )
            // InternalAle.g:6090:2: rule__AddOperation__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0_0_0__1__Impl();

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
    // $ANTLR end "rule__AddOperation__Group_1_0_0_0__1"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_0__1__Impl"
    // InternalAle.g:6096:1: rule__AddOperation__Group_1_0_0_0__1__Impl : ( '+' ) ;
    public final void rule__AddOperation__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6100:1: ( ( '+' ) )
            // InternalAle.g:6101:1: ( '+' )
            {
            // InternalAle.g:6101:1: ( '+' )
            // InternalAle.g:6102:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getPlusSignKeyword_1_0_0_0_1()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getPlusSignKeyword_1_0_0_0_1()); 
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
    // $ANTLR end "rule__AddOperation__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_1__0"
    // InternalAle.g:6112:1: rule__AddOperation__Group_1_0_0_1__0 : rule__AddOperation__Group_1_0_0_1__0__Impl rule__AddOperation__Group_1_0_0_1__1 ;
    public final void rule__AddOperation__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6116:1: ( rule__AddOperation__Group_1_0_0_1__0__Impl rule__AddOperation__Group_1_0_0_1__1 )
            // InternalAle.g:6117:2: rule__AddOperation__Group_1_0_0_1__0__Impl rule__AddOperation__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_57);
            rule__AddOperation__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0_0_1__1();

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
    // $ANTLR end "rule__AddOperation__Group_1_0_0_1__0"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_1__0__Impl"
    // InternalAle.g:6124:1: rule__AddOperation__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__AddOperation__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6128:1: ( ( () ) )
            // InternalAle.g:6129:1: ( () )
            {
            // InternalAle.g:6129:1: ( () )
            // InternalAle.g:6130:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getSubOperationLeftAction_1_0_0_1_0()); 
            }
            // InternalAle.g:6131:2: ()
            // InternalAle.g:6131:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getSubOperationLeftAction_1_0_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_1__1"
    // InternalAle.g:6139:1: rule__AddOperation__Group_1_0_0_1__1 : rule__AddOperation__Group_1_0_0_1__1__Impl ;
    public final void rule__AddOperation__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6143:1: ( rule__AddOperation__Group_1_0_0_1__1__Impl )
            // InternalAle.g:6144:2: rule__AddOperation__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0_0_1__1__Impl();

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
    // $ANTLR end "rule__AddOperation__Group_1_0_0_1__1"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_1__1__Impl"
    // InternalAle.g:6150:1: rule__AddOperation__Group_1_0_0_1__1__Impl : ( '-' ) ;
    public final void rule__AddOperation__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6154:1: ( ( '-' ) )
            // InternalAle.g:6155:1: ( '-' )
            {
            // InternalAle.g:6155:1: ( '-' )
            // InternalAle.g:6156:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getHyphenMinusKeyword_1_0_0_1_1()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getHyphenMinusKeyword_1_0_0_1_1()); 
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
    // $ANTLR end "rule__AddOperation__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_0__0"
    // InternalAle.g:6166:1: rule__InfixOperation__Group_0__0 : rule__InfixOperation__Group_0__0__Impl rule__InfixOperation__Group_0__1 ;
    public final void rule__InfixOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6170:1: ( rule__InfixOperation__Group_0__0__Impl rule__InfixOperation__Group_0__1 )
            // InternalAle.g:6171:2: rule__InfixOperation__Group_0__0__Impl rule__InfixOperation__Group_0__1
            {
            pushFollow(FOLLOW_60);
            rule__InfixOperation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_0__1();

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
    // $ANTLR end "rule__InfixOperation__Group_0__0"


    // $ANTLR start "rule__InfixOperation__Group_0__0__Impl"
    // InternalAle.g:6178:1: rule__InfixOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__InfixOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6182:1: ( ( () ) )
            // InternalAle.g:6183:1: ( () )
            {
            // InternalAle.g:6183:1: ( () )
            // InternalAle.g:6184:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNotInfixOperationAction_0_0()); 
            }
            // InternalAle.g:6185:2: ()
            // InternalAle.g:6185:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNotInfixOperationAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_0__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_0__1"
    // InternalAle.g:6193:1: rule__InfixOperation__Group_0__1 : rule__InfixOperation__Group_0__1__Impl rule__InfixOperation__Group_0__2 ;
    public final void rule__InfixOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6197:1: ( rule__InfixOperation__Group_0__1__Impl rule__InfixOperation__Group_0__2 )
            // InternalAle.g:6198:2: rule__InfixOperation__Group_0__1__Impl rule__InfixOperation__Group_0__2
            {
            pushFollow(FOLLOW_27);
            rule__InfixOperation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_0__2();

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
    // $ANTLR end "rule__InfixOperation__Group_0__1"


    // $ANTLR start "rule__InfixOperation__Group_0__1__Impl"
    // InternalAle.g:6205:1: rule__InfixOperation__Group_0__1__Impl : ( 'not' ) ;
    public final void rule__InfixOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6209:1: ( ( 'not' ) )
            // InternalAle.g:6210:1: ( 'not' )
            {
            // InternalAle.g:6210:1: ( 'not' )
            // InternalAle.g:6211:2: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNotKeyword_0_1()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNotKeyword_0_1()); 
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
    // $ANTLR end "rule__InfixOperation__Group_0__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_0__2"
    // InternalAle.g:6220:1: rule__InfixOperation__Group_0__2 : rule__InfixOperation__Group_0__2__Impl ;
    public final void rule__InfixOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6224:1: ( rule__InfixOperation__Group_0__2__Impl )
            // InternalAle.g:6225:2: rule__InfixOperation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_0__2__Impl();

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
    // $ANTLR end "rule__InfixOperation__Group_0__2"


    // $ANTLR start "rule__InfixOperation__Group_0__2__Impl"
    // InternalAle.g:6231:1: rule__InfixOperation__Group_0__2__Impl : ( ( rule__InfixOperation__ExpressionAssignment_0_2 ) ) ;
    public final void rule__InfixOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6235:1: ( ( ( rule__InfixOperation__ExpressionAssignment_0_2 ) ) )
            // InternalAle.g:6236:1: ( ( rule__InfixOperation__ExpressionAssignment_0_2 ) )
            {
            // InternalAle.g:6236:1: ( ( rule__InfixOperation__ExpressionAssignment_0_2 ) )
            // InternalAle.g:6237:2: ( rule__InfixOperation__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getExpressionAssignment_0_2()); 
            }
            // InternalAle.g:6238:2: ( rule__InfixOperation__ExpressionAssignment_0_2 )
            // InternalAle.g:6238:3: rule__InfixOperation__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__ExpressionAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getExpressionAssignment_0_2()); 
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
    // $ANTLR end "rule__InfixOperation__Group_0__2__Impl"


    // $ANTLR start "rule__InfixOperation__Group_1__0"
    // InternalAle.g:6247:1: rule__InfixOperation__Group_1__0 : rule__InfixOperation__Group_1__0__Impl rule__InfixOperation__Group_1__1 ;
    public final void rule__InfixOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6251:1: ( rule__InfixOperation__Group_1__0__Impl rule__InfixOperation__Group_1__1 )
            // InternalAle.g:6252:2: rule__InfixOperation__Group_1__0__Impl rule__InfixOperation__Group_1__1
            {
            pushFollow(FOLLOW_61);
            rule__InfixOperation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_1__1();

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
    // $ANTLR end "rule__InfixOperation__Group_1__0"


    // $ANTLR start "rule__InfixOperation__Group_1__0__Impl"
    // InternalAle.g:6259:1: rule__InfixOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__InfixOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6263:1: ( ( () ) )
            // InternalAle.g:6264:1: ( () )
            {
            // InternalAle.g:6264:1: ( () )
            // InternalAle.g:6265:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNegInfixOperationAction_1_0()); 
            }
            // InternalAle.g:6266:2: ()
            // InternalAle.g:6266:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNegInfixOperationAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_1__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_1__1"
    // InternalAle.g:6274:1: rule__InfixOperation__Group_1__1 : rule__InfixOperation__Group_1__1__Impl rule__InfixOperation__Group_1__2 ;
    public final void rule__InfixOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6278:1: ( rule__InfixOperation__Group_1__1__Impl rule__InfixOperation__Group_1__2 )
            // InternalAle.g:6279:2: rule__InfixOperation__Group_1__1__Impl rule__InfixOperation__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__InfixOperation__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_1__2();

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
    // $ANTLR end "rule__InfixOperation__Group_1__1"


    // $ANTLR start "rule__InfixOperation__Group_1__1__Impl"
    // InternalAle.g:6286:1: rule__InfixOperation__Group_1__1__Impl : ( '-' ) ;
    public final void rule__InfixOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6290:1: ( ( '-' ) )
            // InternalAle.g:6291:1: ( '-' )
            {
            // InternalAle.g:6291:1: ( '-' )
            // InternalAle.g:6292:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getHyphenMinusKeyword_1_1()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getHyphenMinusKeyword_1_1()); 
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
    // $ANTLR end "rule__InfixOperation__Group_1__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_1__2"
    // InternalAle.g:6301:1: rule__InfixOperation__Group_1__2 : rule__InfixOperation__Group_1__2__Impl ;
    public final void rule__InfixOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6305:1: ( rule__InfixOperation__Group_1__2__Impl )
            // InternalAle.g:6306:2: rule__InfixOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_1__2__Impl();

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
    // $ANTLR end "rule__InfixOperation__Group_1__2"


    // $ANTLR start "rule__InfixOperation__Group_1__2__Impl"
    // InternalAle.g:6312:1: rule__InfixOperation__Group_1__2__Impl : ( ( rule__InfixOperation__ExpressionAssignment_1_2 ) ) ;
    public final void rule__InfixOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6316:1: ( ( ( rule__InfixOperation__ExpressionAssignment_1_2 ) ) )
            // InternalAle.g:6317:1: ( ( rule__InfixOperation__ExpressionAssignment_1_2 ) )
            {
            // InternalAle.g:6317:1: ( ( rule__InfixOperation__ExpressionAssignment_1_2 ) )
            // InternalAle.g:6318:2: ( rule__InfixOperation__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getExpressionAssignment_1_2()); 
            }
            // InternalAle.g:6319:2: ( rule__InfixOperation__ExpressionAssignment_1_2 )
            // InternalAle.g:6319:3: rule__InfixOperation__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__ExpressionAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getExpressionAssignment_1_2()); 
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
    // $ANTLR end "rule__InfixOperation__Group_1__2__Impl"


    // $ANTLR start "rule__InfixOperation__Group_2__0"
    // InternalAle.g:6328:1: rule__InfixOperation__Group_2__0 : rule__InfixOperation__Group_2__0__Impl rule__InfixOperation__Group_2__1 ;
    public final void rule__InfixOperation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6332:1: ( rule__InfixOperation__Group_2__0__Impl rule__InfixOperation__Group_2__1 )
            // InternalAle.g:6333:2: rule__InfixOperation__Group_2__0__Impl rule__InfixOperation__Group_2__1
            {
            pushFollow(FOLLOW_62);
            rule__InfixOperation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_2__1();

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
    // $ANTLR end "rule__InfixOperation__Group_2__0"


    // $ANTLR start "rule__InfixOperation__Group_2__0__Impl"
    // InternalAle.g:6340:1: rule__InfixOperation__Group_2__0__Impl : ( () ) ;
    public final void rule__InfixOperation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6344:1: ( ( () ) )
            // InternalAle.g:6345:1: ( () )
            {
            // InternalAle.g:6345:1: ( () )
            // InternalAle.g:6346:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getConstructorOperationAction_2_0()); 
            }
            // InternalAle.g:6347:2: ()
            // InternalAle.g:6347:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getConstructorOperationAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_2__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_2__1"
    // InternalAle.g:6355:1: rule__InfixOperation__Group_2__1 : rule__InfixOperation__Group_2__1__Impl rule__InfixOperation__Group_2__2 ;
    public final void rule__InfixOperation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6359:1: ( rule__InfixOperation__Group_2__1__Impl rule__InfixOperation__Group_2__2 )
            // InternalAle.g:6360:2: rule__InfixOperation__Group_2__1__Impl rule__InfixOperation__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__InfixOperation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_2__2();

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
    // $ANTLR end "rule__InfixOperation__Group_2__1"


    // $ANTLR start "rule__InfixOperation__Group_2__1__Impl"
    // InternalAle.g:6367:1: rule__InfixOperation__Group_2__1__Impl : ( 'new' ) ;
    public final void rule__InfixOperation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6371:1: ( ( 'new' ) )
            // InternalAle.g:6372:1: ( 'new' )
            {
            // InternalAle.g:6372:1: ( 'new' )
            // InternalAle.g:6373:2: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNewKeyword_2_1()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNewKeyword_2_1()); 
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
    // $ANTLR end "rule__InfixOperation__Group_2__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_2__2"
    // InternalAle.g:6382:1: rule__InfixOperation__Group_2__2 : rule__InfixOperation__Group_2__2__Impl rule__InfixOperation__Group_2__3 ;
    public final void rule__InfixOperation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6386:1: ( rule__InfixOperation__Group_2__2__Impl rule__InfixOperation__Group_2__3 )
            // InternalAle.g:6387:2: rule__InfixOperation__Group_2__2__Impl rule__InfixOperation__Group_2__3
            {
            pushFollow(FOLLOW_21);
            rule__InfixOperation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_2__3();

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
    // $ANTLR end "rule__InfixOperation__Group_2__2"


    // $ANTLR start "rule__InfixOperation__Group_2__2__Impl"
    // InternalAle.g:6394:1: rule__InfixOperation__Group_2__2__Impl : ( ( rule__InfixOperation__NameAssignment_2_2 ) ) ;
    public final void rule__InfixOperation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6398:1: ( ( ( rule__InfixOperation__NameAssignment_2_2 ) ) )
            // InternalAle.g:6399:1: ( ( rule__InfixOperation__NameAssignment_2_2 ) )
            {
            // InternalAle.g:6399:1: ( ( rule__InfixOperation__NameAssignment_2_2 ) )
            // InternalAle.g:6400:2: ( rule__InfixOperation__NameAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNameAssignment_2_2()); 
            }
            // InternalAle.g:6401:2: ( rule__InfixOperation__NameAssignment_2_2 )
            // InternalAle.g:6401:3: rule__InfixOperation__NameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__NameAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNameAssignment_2_2()); 
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
    // $ANTLR end "rule__InfixOperation__Group_2__2__Impl"


    // $ANTLR start "rule__InfixOperation__Group_2__3"
    // InternalAle.g:6409:1: rule__InfixOperation__Group_2__3 : rule__InfixOperation__Group_2__3__Impl rule__InfixOperation__Group_2__4 ;
    public final void rule__InfixOperation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6413:1: ( rule__InfixOperation__Group_2__3__Impl rule__InfixOperation__Group_2__4 )
            // InternalAle.g:6414:2: rule__InfixOperation__Group_2__3__Impl rule__InfixOperation__Group_2__4
            {
            pushFollow(FOLLOW_32);
            rule__InfixOperation__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_2__4();

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
    // $ANTLR end "rule__InfixOperation__Group_2__3"


    // $ANTLR start "rule__InfixOperation__Group_2__3__Impl"
    // InternalAle.g:6421:1: rule__InfixOperation__Group_2__3__Impl : ( '(' ) ;
    public final void rule__InfixOperation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6425:1: ( ( '(' ) )
            // InternalAle.g:6426:1: ( '(' )
            {
            // InternalAle.g:6426:1: ( '(' )
            // InternalAle.g:6427:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_2_3()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_2_3()); 
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
    // $ANTLR end "rule__InfixOperation__Group_2__3__Impl"


    // $ANTLR start "rule__InfixOperation__Group_2__4"
    // InternalAle.g:6436:1: rule__InfixOperation__Group_2__4 : rule__InfixOperation__Group_2__4__Impl ;
    public final void rule__InfixOperation__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6440:1: ( rule__InfixOperation__Group_2__4__Impl )
            // InternalAle.g:6441:2: rule__InfixOperation__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_2__4__Impl();

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
    // $ANTLR end "rule__InfixOperation__Group_2__4"


    // $ANTLR start "rule__InfixOperation__Group_2__4__Impl"
    // InternalAle.g:6447:1: rule__InfixOperation__Group_2__4__Impl : ( ')' ) ;
    public final void rule__InfixOperation__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6451:1: ( ( ')' ) )
            // InternalAle.g:6452:1: ( ')' )
            {
            // InternalAle.g:6452:1: ( ')' )
            // InternalAle.g:6453:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_2_4()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_2_4()); 
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
    // $ANTLR end "rule__InfixOperation__Group_2__4__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3__0"
    // InternalAle.g:6463:1: rule__InfixOperation__Group_3__0 : rule__InfixOperation__Group_3__0__Impl rule__InfixOperation__Group_3__1 ;
    public final void rule__InfixOperation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6467:1: ( rule__InfixOperation__Group_3__0__Impl rule__InfixOperation__Group_3__1 )
            // InternalAle.g:6468:2: rule__InfixOperation__Group_3__0__Impl rule__InfixOperation__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__InfixOperation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3__1();

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
    // $ANTLR end "rule__InfixOperation__Group_3__0"


    // $ANTLR start "rule__InfixOperation__Group_3__0__Impl"
    // InternalAle.g:6475:1: rule__InfixOperation__Group_3__0__Impl : ( () ) ;
    public final void rule__InfixOperation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6479:1: ( ( () ) )
            // InternalAle.g:6480:1: ( () )
            {
            // InternalAle.g:6480:1: ( () )
            // InternalAle.g:6481:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getOperationCallOperationAction_3_0()); 
            }
            // InternalAle.g:6482:2: ()
            // InternalAle.g:6482:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getOperationCallOperationAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_3__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3__1"
    // InternalAle.g:6490:1: rule__InfixOperation__Group_3__1 : rule__InfixOperation__Group_3__1__Impl rule__InfixOperation__Group_3__2 ;
    public final void rule__InfixOperation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6494:1: ( rule__InfixOperation__Group_3__1__Impl rule__InfixOperation__Group_3__2 )
            // InternalAle.g:6495:2: rule__InfixOperation__Group_3__1__Impl rule__InfixOperation__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__InfixOperation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3__2();

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
    // $ANTLR end "rule__InfixOperation__Group_3__1"


    // $ANTLR start "rule__InfixOperation__Group_3__1__Impl"
    // InternalAle.g:6502:1: rule__InfixOperation__Group_3__1__Impl : ( ( rule__InfixOperation__NameAssignment_3_1 ) ) ;
    public final void rule__InfixOperation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6506:1: ( ( ( rule__InfixOperation__NameAssignment_3_1 ) ) )
            // InternalAle.g:6507:1: ( ( rule__InfixOperation__NameAssignment_3_1 ) )
            {
            // InternalAle.g:6507:1: ( ( rule__InfixOperation__NameAssignment_3_1 ) )
            // InternalAle.g:6508:2: ( rule__InfixOperation__NameAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNameAssignment_3_1()); 
            }
            // InternalAle.g:6509:2: ( rule__InfixOperation__NameAssignment_3_1 )
            // InternalAle.g:6509:3: rule__InfixOperation__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__NameAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNameAssignment_3_1()); 
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
    // $ANTLR end "rule__InfixOperation__Group_3__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3__2"
    // InternalAle.g:6517:1: rule__InfixOperation__Group_3__2 : rule__InfixOperation__Group_3__2__Impl ;
    public final void rule__InfixOperation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6521:1: ( rule__InfixOperation__Group_3__2__Impl )
            // InternalAle.g:6522:2: rule__InfixOperation__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3__2__Impl();

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
    // $ANTLR end "rule__InfixOperation__Group_3__2"


    // $ANTLR start "rule__InfixOperation__Group_3__2__Impl"
    // InternalAle.g:6528:1: rule__InfixOperation__Group_3__2__Impl : ( ( rule__InfixOperation__Group_3_2__0 ) ) ;
    public final void rule__InfixOperation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6532:1: ( ( ( rule__InfixOperation__Group_3_2__0 ) ) )
            // InternalAle.g:6533:1: ( ( rule__InfixOperation__Group_3_2__0 ) )
            {
            // InternalAle.g:6533:1: ( ( rule__InfixOperation__Group_3_2__0 ) )
            // InternalAle.g:6534:2: ( rule__InfixOperation__Group_3_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getGroup_3_2()); 
            }
            // InternalAle.g:6535:2: ( rule__InfixOperation__Group_3_2__0 )
            // InternalAle.g:6535:3: rule__InfixOperation__Group_3_2__0
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getGroup_3_2()); 
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
    // $ANTLR end "rule__InfixOperation__Group_3__2__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3_2__0"
    // InternalAle.g:6544:1: rule__InfixOperation__Group_3_2__0 : rule__InfixOperation__Group_3_2__0__Impl rule__InfixOperation__Group_3_2__1 ;
    public final void rule__InfixOperation__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6548:1: ( rule__InfixOperation__Group_3_2__0__Impl rule__InfixOperation__Group_3_2__1 )
            // InternalAle.g:6549:2: rule__InfixOperation__Group_3_2__0__Impl rule__InfixOperation__Group_3_2__1
            {
            pushFollow(FOLLOW_63);
            rule__InfixOperation__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3_2__1();

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
    // $ANTLR end "rule__InfixOperation__Group_3_2__0"


    // $ANTLR start "rule__InfixOperation__Group_3_2__0__Impl"
    // InternalAle.g:6556:1: rule__InfixOperation__Group_3_2__0__Impl : ( '(' ) ;
    public final void rule__InfixOperation__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6560:1: ( ( '(' ) )
            // InternalAle.g:6561:1: ( '(' )
            {
            // InternalAle.g:6561:1: ( '(' )
            // InternalAle.g:6562:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_3_2_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_3_2_0()); 
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
    // $ANTLR end "rule__InfixOperation__Group_3_2__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3_2__1"
    // InternalAle.g:6571:1: rule__InfixOperation__Group_3_2__1 : rule__InfixOperation__Group_3_2__1__Impl rule__InfixOperation__Group_3_2__2 ;
    public final void rule__InfixOperation__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6575:1: ( rule__InfixOperation__Group_3_2__1__Impl rule__InfixOperation__Group_3_2__2 )
            // InternalAle.g:6576:2: rule__InfixOperation__Group_3_2__1__Impl rule__InfixOperation__Group_3_2__2
            {
            pushFollow(FOLLOW_63);
            rule__InfixOperation__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3_2__2();

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
    // $ANTLR end "rule__InfixOperation__Group_3_2__1"


    // $ANTLR start "rule__InfixOperation__Group_3_2__1__Impl"
    // InternalAle.g:6583:1: rule__InfixOperation__Group_3_2__1__Impl : ( ( rule__InfixOperation__Group_3_2_1__0 )? ) ;
    public final void rule__InfixOperation__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6587:1: ( ( ( rule__InfixOperation__Group_3_2_1__0 )? ) )
            // InternalAle.g:6588:1: ( ( rule__InfixOperation__Group_3_2_1__0 )? )
            {
            // InternalAle.g:6588:1: ( ( rule__InfixOperation__Group_3_2_1__0 )? )
            // InternalAle.g:6589:2: ( rule__InfixOperation__Group_3_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getGroup_3_2_1()); 
            }
            // InternalAle.g:6590:2: ( rule__InfixOperation__Group_3_2_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_BOOLEAN)||LA40_0==36||(LA40_0>=59 && LA40_0<=61)||(LA40_0>=65 && LA40_0<=67)||(LA40_0>=69 && LA40_0<=70)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAle.g:6590:3: rule__InfixOperation__Group_3_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_3_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getGroup_3_2_1()); 
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
    // $ANTLR end "rule__InfixOperation__Group_3_2__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3_2__2"
    // InternalAle.g:6598:1: rule__InfixOperation__Group_3_2__2 : rule__InfixOperation__Group_3_2__2__Impl ;
    public final void rule__InfixOperation__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6602:1: ( rule__InfixOperation__Group_3_2__2__Impl )
            // InternalAle.g:6603:2: rule__InfixOperation__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3_2__2__Impl();

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
    // $ANTLR end "rule__InfixOperation__Group_3_2__2"


    // $ANTLR start "rule__InfixOperation__Group_3_2__2__Impl"
    // InternalAle.g:6609:1: rule__InfixOperation__Group_3_2__2__Impl : ( ')' ) ;
    public final void rule__InfixOperation__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6613:1: ( ( ')' ) )
            // InternalAle.g:6614:1: ( ')' )
            {
            // InternalAle.g:6614:1: ( ')' )
            // InternalAle.g:6615:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_3_2_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_3_2_2()); 
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
    // $ANTLR end "rule__InfixOperation__Group_3_2__2__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3_2_1__0"
    // InternalAle.g:6625:1: rule__InfixOperation__Group_3_2_1__0 : rule__InfixOperation__Group_3_2_1__0__Impl rule__InfixOperation__Group_3_2_1__1 ;
    public final void rule__InfixOperation__Group_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6629:1: ( rule__InfixOperation__Group_3_2_1__0__Impl rule__InfixOperation__Group_3_2_1__1 )
            // InternalAle.g:6630:2: rule__InfixOperation__Group_3_2_1__0__Impl rule__InfixOperation__Group_3_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__InfixOperation__Group_3_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3_2_1__1();

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
    // $ANTLR end "rule__InfixOperation__Group_3_2_1__0"


    // $ANTLR start "rule__InfixOperation__Group_3_2_1__0__Impl"
    // InternalAle.g:6637:1: rule__InfixOperation__Group_3_2_1__0__Impl : ( ( rule__InfixOperation__ParametersAssignment_3_2_1_0 ) ) ;
    public final void rule__InfixOperation__Group_3_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6641:1: ( ( ( rule__InfixOperation__ParametersAssignment_3_2_1_0 ) ) )
            // InternalAle.g:6642:1: ( ( rule__InfixOperation__ParametersAssignment_3_2_1_0 ) )
            {
            // InternalAle.g:6642:1: ( ( rule__InfixOperation__ParametersAssignment_3_2_1_0 ) )
            // InternalAle.g:6643:2: ( rule__InfixOperation__ParametersAssignment_3_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getParametersAssignment_3_2_1_0()); 
            }
            // InternalAle.g:6644:2: ( rule__InfixOperation__ParametersAssignment_3_2_1_0 )
            // InternalAle.g:6644:3: rule__InfixOperation__ParametersAssignment_3_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__ParametersAssignment_3_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getParametersAssignment_3_2_1_0()); 
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
    // $ANTLR end "rule__InfixOperation__Group_3_2_1__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3_2_1__1"
    // InternalAle.g:6652:1: rule__InfixOperation__Group_3_2_1__1 : rule__InfixOperation__Group_3_2_1__1__Impl ;
    public final void rule__InfixOperation__Group_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6656:1: ( rule__InfixOperation__Group_3_2_1__1__Impl )
            // InternalAle.g:6657:2: rule__InfixOperation__Group_3_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3_2_1__1__Impl();

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
    // $ANTLR end "rule__InfixOperation__Group_3_2_1__1"


    // $ANTLR start "rule__InfixOperation__Group_3_2_1__1__Impl"
    // InternalAle.g:6663:1: rule__InfixOperation__Group_3_2_1__1__Impl : ( ( rule__InfixOperation__Group_3_2_1_1__0 )* ) ;
    public final void rule__InfixOperation__Group_3_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6667:1: ( ( ( rule__InfixOperation__Group_3_2_1_1__0 )* ) )
            // InternalAle.g:6668:1: ( ( rule__InfixOperation__Group_3_2_1_1__0 )* )
            {
            // InternalAle.g:6668:1: ( ( rule__InfixOperation__Group_3_2_1_1__0 )* )
            // InternalAle.g:6669:2: ( rule__InfixOperation__Group_3_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getGroup_3_2_1_1()); 
            }
            // InternalAle.g:6670:2: ( rule__InfixOperation__Group_3_2_1_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==32) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAle.g:6670:3: rule__InfixOperation__Group_3_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InfixOperation__Group_3_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getGroup_3_2_1_1()); 
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
    // $ANTLR end "rule__InfixOperation__Group_3_2_1__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3_2_1_1__0"
    // InternalAle.g:6679:1: rule__InfixOperation__Group_3_2_1_1__0 : rule__InfixOperation__Group_3_2_1_1__0__Impl rule__InfixOperation__Group_3_2_1_1__1 ;
    public final void rule__InfixOperation__Group_3_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6683:1: ( rule__InfixOperation__Group_3_2_1_1__0__Impl rule__InfixOperation__Group_3_2_1_1__1 )
            // InternalAle.g:6684:2: rule__InfixOperation__Group_3_2_1_1__0__Impl rule__InfixOperation__Group_3_2_1_1__1
            {
            pushFollow(FOLLOW_27);
            rule__InfixOperation__Group_3_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3_2_1_1__1();

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
    // $ANTLR end "rule__InfixOperation__Group_3_2_1_1__0"


    // $ANTLR start "rule__InfixOperation__Group_3_2_1_1__0__Impl"
    // InternalAle.g:6691:1: rule__InfixOperation__Group_3_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__InfixOperation__Group_3_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6695:1: ( ( ',' ) )
            // InternalAle.g:6696:1: ( ',' )
            {
            // InternalAle.g:6696:1: ( ',' )
            // InternalAle.g:6697:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getCommaKeyword_3_2_1_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getCommaKeyword_3_2_1_1_0()); 
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
    // $ANTLR end "rule__InfixOperation__Group_3_2_1_1__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3_2_1_1__1"
    // InternalAle.g:6706:1: rule__InfixOperation__Group_3_2_1_1__1 : rule__InfixOperation__Group_3_2_1_1__1__Impl ;
    public final void rule__InfixOperation__Group_3_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6710:1: ( rule__InfixOperation__Group_3_2_1_1__1__Impl )
            // InternalAle.g:6711:2: rule__InfixOperation__Group_3_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3_2_1_1__1__Impl();

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
    // $ANTLR end "rule__InfixOperation__Group_3_2_1_1__1"


    // $ANTLR start "rule__InfixOperation__Group_3_2_1_1__1__Impl"
    // InternalAle.g:6717:1: rule__InfixOperation__Group_3_2_1_1__1__Impl : ( ( rule__InfixOperation__ParametersAssignment_3_2_1_1_1 ) ) ;
    public final void rule__InfixOperation__Group_3_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6721:1: ( ( ( rule__InfixOperation__ParametersAssignment_3_2_1_1_1 ) ) )
            // InternalAle.g:6722:1: ( ( rule__InfixOperation__ParametersAssignment_3_2_1_1_1 ) )
            {
            // InternalAle.g:6722:1: ( ( rule__InfixOperation__ParametersAssignment_3_2_1_1_1 ) )
            // InternalAle.g:6723:2: ( rule__InfixOperation__ParametersAssignment_3_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getParametersAssignment_3_2_1_1_1()); 
            }
            // InternalAle.g:6724:2: ( rule__InfixOperation__ParametersAssignment_3_2_1_1_1 )
            // InternalAle.g:6724:3: rule__InfixOperation__ParametersAssignment_3_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__ParametersAssignment_3_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getParametersAssignment_3_2_1_1_1()); 
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
    // $ANTLR end "rule__InfixOperation__Group_3_2_1_1__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4__0"
    // InternalAle.g:6733:1: rule__InfixOperation__Group_4__0 : rule__InfixOperation__Group_4__0__Impl rule__InfixOperation__Group_4__1 ;
    public final void rule__InfixOperation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6737:1: ( rule__InfixOperation__Group_4__0__Impl rule__InfixOperation__Group_4__1 )
            // InternalAle.g:6738:2: rule__InfixOperation__Group_4__0__Impl rule__InfixOperation__Group_4__1
            {
            pushFollow(FOLLOW_64);
            rule__InfixOperation__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4__1();

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
    // $ANTLR end "rule__InfixOperation__Group_4__0"


    // $ANTLR start "rule__InfixOperation__Group_4__0__Impl"
    // InternalAle.g:6745:1: rule__InfixOperation__Group_4__0__Impl : ( ruleAtomicLiteral ) ;
    public final void rule__InfixOperation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6749:1: ( ( ruleAtomicLiteral ) )
            // InternalAle.g:6750:1: ( ruleAtomicLiteral )
            {
            // InternalAle.g:6750:1: ( ruleAtomicLiteral )
            // InternalAle.g:6751:2: ruleAtomicLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getAtomicLiteralParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAtomicLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getAtomicLiteralParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__InfixOperation__Group_4__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4__1"
    // InternalAle.g:6760:1: rule__InfixOperation__Group_4__1 : rule__InfixOperation__Group_4__1__Impl ;
    public final void rule__InfixOperation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6764:1: ( rule__InfixOperation__Group_4__1__Impl )
            // InternalAle.g:6765:2: rule__InfixOperation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4__1__Impl();

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
    // $ANTLR end "rule__InfixOperation__Group_4__1"


    // $ANTLR start "rule__InfixOperation__Group_4__1__Impl"
    // InternalAle.g:6771:1: rule__InfixOperation__Group_4__1__Impl : ( ( rule__InfixOperation__Alternatives_4_1 )? ) ;
    public final void rule__InfixOperation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6775:1: ( ( ( rule__InfixOperation__Alternatives_4_1 )? ) )
            // InternalAle.g:6776:1: ( ( rule__InfixOperation__Alternatives_4_1 )? )
            {
            // InternalAle.g:6776:1: ( ( rule__InfixOperation__Alternatives_4_1 )? )
            // InternalAle.g:6777:2: ( rule__InfixOperation__Alternatives_4_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getAlternatives_4_1()); 
            }
            // InternalAle.g:6778:2: ( rule__InfixOperation__Alternatives_4_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==62) ) {
                int LA42_1 = input.LA(2);

                if ( ((LA42_1>=RULE_ID && LA42_1<=RULE_BOOLEAN)||LA42_1==36||(LA42_1>=59 && LA42_1<=61)||(LA42_1>=65 && LA42_1<=67)||(LA42_1>=69 && LA42_1<=70)) ) {
                    alt42=1;
                }
            }
            else if ( (LA42_0==63) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAle.g:6778:3: rule__InfixOperation__Alternatives_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Alternatives_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getAlternatives_4_1()); 
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
    // $ANTLR end "rule__InfixOperation__Group_4__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4_1_0__0"
    // InternalAle.g:6787:1: rule__InfixOperation__Group_4_1_0__0 : rule__InfixOperation__Group_4_1_0__0__Impl rule__InfixOperation__Group_4_1_0__1 ;
    public final void rule__InfixOperation__Group_4_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6791:1: ( rule__InfixOperation__Group_4_1_0__0__Impl rule__InfixOperation__Group_4_1_0__1 )
            // InternalAle.g:6792:2: rule__InfixOperation__Group_4_1_0__0__Impl rule__InfixOperation__Group_4_1_0__1
            {
            pushFollow(FOLLOW_65);
            rule__InfixOperation__Group_4_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_1_0__1();

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
    // $ANTLR end "rule__InfixOperation__Group_4_1_0__0"


    // $ANTLR start "rule__InfixOperation__Group_4_1_0__0__Impl"
    // InternalAle.g:6799:1: rule__InfixOperation__Group_4_1_0__0__Impl : ( () ) ;
    public final void rule__InfixOperation__Group_4_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6803:1: ( ( () ) )
            // InternalAle.g:6804:1: ( () )
            {
            // InternalAle.g:6804:1: ( () )
            // InternalAle.g:6805:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getChainedCallLeftAction_4_1_0_0()); 
            }
            // InternalAle.g:6806:2: ()
            // InternalAle.g:6806:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getChainedCallLeftAction_4_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_1_0__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4_1_0__1"
    // InternalAle.g:6814:1: rule__InfixOperation__Group_4_1_0__1 : rule__InfixOperation__Group_4_1_0__1__Impl rule__InfixOperation__Group_4_1_0__2 ;
    public final void rule__InfixOperation__Group_4_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6818:1: ( rule__InfixOperation__Group_4_1_0__1__Impl rule__InfixOperation__Group_4_1_0__2 )
            // InternalAle.g:6819:2: rule__InfixOperation__Group_4_1_0__1__Impl rule__InfixOperation__Group_4_1_0__2
            {
            pushFollow(FOLLOW_27);
            rule__InfixOperation__Group_4_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_1_0__2();

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
    // $ANTLR end "rule__InfixOperation__Group_4_1_0__1"


    // $ANTLR start "rule__InfixOperation__Group_4_1_0__1__Impl"
    // InternalAle.g:6826:1: rule__InfixOperation__Group_4_1_0__1__Impl : ( '.' ) ;
    public final void rule__InfixOperation__Group_4_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6830:1: ( ( '.' ) )
            // InternalAle.g:6831:1: ( '.' )
            {
            // InternalAle.g:6831:1: ( '.' )
            // InternalAle.g:6832:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getFullStopKeyword_4_1_0_1()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getFullStopKeyword_4_1_0_1()); 
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
    // $ANTLR end "rule__InfixOperation__Group_4_1_0__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4_1_0__2"
    // InternalAle.g:6841:1: rule__InfixOperation__Group_4_1_0__2 : rule__InfixOperation__Group_4_1_0__2__Impl ;
    public final void rule__InfixOperation__Group_4_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6845:1: ( rule__InfixOperation__Group_4_1_0__2__Impl )
            // InternalAle.g:6846:2: rule__InfixOperation__Group_4_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_1_0__2__Impl();

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
    // $ANTLR end "rule__InfixOperation__Group_4_1_0__2"


    // $ANTLR start "rule__InfixOperation__Group_4_1_0__2__Impl"
    // InternalAle.g:6852:1: rule__InfixOperation__Group_4_1_0__2__Impl : ( ( rule__InfixOperation__RightAssignment_4_1_0_2 ) ) ;
    public final void rule__InfixOperation__Group_4_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6856:1: ( ( ( rule__InfixOperation__RightAssignment_4_1_0_2 ) ) )
            // InternalAle.g:6857:1: ( ( rule__InfixOperation__RightAssignment_4_1_0_2 ) )
            {
            // InternalAle.g:6857:1: ( ( rule__InfixOperation__RightAssignment_4_1_0_2 ) )
            // InternalAle.g:6858:2: ( rule__InfixOperation__RightAssignment_4_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getRightAssignment_4_1_0_2()); 
            }
            // InternalAle.g:6859:2: ( rule__InfixOperation__RightAssignment_4_1_0_2 )
            // InternalAle.g:6859:3: rule__InfixOperation__RightAssignment_4_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__RightAssignment_4_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getRightAssignment_4_1_0_2()); 
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
    // $ANTLR end "rule__InfixOperation__Group_4_1_0__2__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4_1_1__0"
    // InternalAle.g:6868:1: rule__InfixOperation__Group_4_1_1__0 : rule__InfixOperation__Group_4_1_1__0__Impl rule__InfixOperation__Group_4_1_1__1 ;
    public final void rule__InfixOperation__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6872:1: ( rule__InfixOperation__Group_4_1_1__0__Impl rule__InfixOperation__Group_4_1_1__1 )
            // InternalAle.g:6873:2: rule__InfixOperation__Group_4_1_1__0__Impl rule__InfixOperation__Group_4_1_1__1
            {
            pushFollow(FOLLOW_64);
            rule__InfixOperation__Group_4_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_1_1__1();

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
    // $ANTLR end "rule__InfixOperation__Group_4_1_1__0"


    // $ANTLR start "rule__InfixOperation__Group_4_1_1__0__Impl"
    // InternalAle.g:6880:1: rule__InfixOperation__Group_4_1_1__0__Impl : ( () ) ;
    public final void rule__InfixOperation__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6884:1: ( ( () ) )
            // InternalAle.g:6885:1: ( () )
            {
            // InternalAle.g:6885:1: ( () )
            // InternalAle.g:6886:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getChainedCallArrowLeftAction_4_1_1_0()); 
            }
            // InternalAle.g:6887:2: ()
            // InternalAle.g:6887:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getChainedCallArrowLeftAction_4_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4_1_1__1"
    // InternalAle.g:6895:1: rule__InfixOperation__Group_4_1_1__1 : rule__InfixOperation__Group_4_1_1__1__Impl rule__InfixOperation__Group_4_1_1__2 ;
    public final void rule__InfixOperation__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6899:1: ( rule__InfixOperation__Group_4_1_1__1__Impl rule__InfixOperation__Group_4_1_1__2 )
            // InternalAle.g:6900:2: rule__InfixOperation__Group_4_1_1__1__Impl rule__InfixOperation__Group_4_1_1__2
            {
            pushFollow(FOLLOW_27);
            rule__InfixOperation__Group_4_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_1_1__2();

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
    // $ANTLR end "rule__InfixOperation__Group_4_1_1__1"


    // $ANTLR start "rule__InfixOperation__Group_4_1_1__1__Impl"
    // InternalAle.g:6907:1: rule__InfixOperation__Group_4_1_1__1__Impl : ( '->' ) ;
    public final void rule__InfixOperation__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6911:1: ( ( '->' ) )
            // InternalAle.g:6912:1: ( '->' )
            {
            // InternalAle.g:6912:1: ( '->' )
            // InternalAle.g:6913:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getHyphenMinusGreaterThanSignKeyword_4_1_1_1()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getHyphenMinusGreaterThanSignKeyword_4_1_1_1()); 
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
    // $ANTLR end "rule__InfixOperation__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4_1_1__2"
    // InternalAle.g:6922:1: rule__InfixOperation__Group_4_1_1__2 : rule__InfixOperation__Group_4_1_1__2__Impl ;
    public final void rule__InfixOperation__Group_4_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6926:1: ( rule__InfixOperation__Group_4_1_1__2__Impl )
            // InternalAle.g:6927:2: rule__InfixOperation__Group_4_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_1_1__2__Impl();

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
    // $ANTLR end "rule__InfixOperation__Group_4_1_1__2"


    // $ANTLR start "rule__InfixOperation__Group_4_1_1__2__Impl"
    // InternalAle.g:6933:1: rule__InfixOperation__Group_4_1_1__2__Impl : ( ( rule__InfixOperation__RightAssignment_4_1_1_2 ) ) ;
    public final void rule__InfixOperation__Group_4_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6937:1: ( ( ( rule__InfixOperation__RightAssignment_4_1_1_2 ) ) )
            // InternalAle.g:6938:1: ( ( rule__InfixOperation__RightAssignment_4_1_1_2 ) )
            {
            // InternalAle.g:6938:1: ( ( rule__InfixOperation__RightAssignment_4_1_1_2 ) )
            // InternalAle.g:6939:2: ( rule__InfixOperation__RightAssignment_4_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getRightAssignment_4_1_1_2()); 
            }
            // InternalAle.g:6940:2: ( rule__InfixOperation__RightAssignment_4_1_1_2 )
            // InternalAle.g:6940:3: rule__InfixOperation__RightAssignment_4_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__RightAssignment_4_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getRightAssignment_4_1_1_2()); 
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
    // $ANTLR end "rule__InfixOperation__Group_4_1_1__2__Impl"


    // $ANTLR start "rule__ParamCall__Group__0"
    // InternalAle.g:6949:1: rule__ParamCall__Group__0 : rule__ParamCall__Group__0__Impl rule__ParamCall__Group__1 ;
    public final void rule__ParamCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6953:1: ( rule__ParamCall__Group__0__Impl rule__ParamCall__Group__1 )
            // InternalAle.g:6954:2: rule__ParamCall__Group__0__Impl rule__ParamCall__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ParamCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParamCall__Group__1();

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
    // $ANTLR end "rule__ParamCall__Group__0"


    // $ANTLR start "rule__ParamCall__Group__0__Impl"
    // InternalAle.g:6961:1: rule__ParamCall__Group__0__Impl : ( ( rule__ParamCall__Group_0__0 )? ) ;
    public final void rule__ParamCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6965:1: ( ( ( rule__ParamCall__Group_0__0 )? ) )
            // InternalAle.g:6966:1: ( ( rule__ParamCall__Group_0__0 )? )
            {
            // InternalAle.g:6966:1: ( ( rule__ParamCall__Group_0__0 )? )
            // InternalAle.g:6967:2: ( rule__ParamCall__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getGroup_0()); 
            }
            // InternalAle.g:6968:2: ( rule__ParamCall__Group_0__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==64) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalAle.g:6968:3: rule__ParamCall__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParamCall__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getGroup_0()); 
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
    // $ANTLR end "rule__ParamCall__Group__0__Impl"


    // $ANTLR start "rule__ParamCall__Group__1"
    // InternalAle.g:6976:1: rule__ParamCall__Group__1 : rule__ParamCall__Group__1__Impl ;
    public final void rule__ParamCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6980:1: ( rule__ParamCall__Group__1__Impl )
            // InternalAle.g:6981:2: rule__ParamCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamCall__Group__1__Impl();

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
    // $ANTLR end "rule__ParamCall__Group__1"


    // $ANTLR start "rule__ParamCall__Group__1__Impl"
    // InternalAle.g:6987:1: rule__ParamCall__Group__1__Impl : ( ( rule__ParamCall__ExpressionAssignment_1 ) ) ;
    public final void rule__ParamCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6991:1: ( ( ( rule__ParamCall__ExpressionAssignment_1 ) ) )
            // InternalAle.g:6992:1: ( ( rule__ParamCall__ExpressionAssignment_1 ) )
            {
            // InternalAle.g:6992:1: ( ( rule__ParamCall__ExpressionAssignment_1 ) )
            // InternalAle.g:6993:2: ( rule__ParamCall__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getExpressionAssignment_1()); 
            }
            // InternalAle.g:6994:2: ( rule__ParamCall__ExpressionAssignment_1 )
            // InternalAle.g:6994:3: rule__ParamCall__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParamCall__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getExpressionAssignment_1()); 
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
    // $ANTLR end "rule__ParamCall__Group__1__Impl"


    // $ANTLR start "rule__ParamCall__Group_0__0"
    // InternalAle.g:7003:1: rule__ParamCall__Group_0__0 : rule__ParamCall__Group_0__0__Impl rule__ParamCall__Group_0__1 ;
    public final void rule__ParamCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7007:1: ( rule__ParamCall__Group_0__0__Impl rule__ParamCall__Group_0__1 )
            // InternalAle.g:7008:2: rule__ParamCall__Group_0__0__Impl rule__ParamCall__Group_0__1
            {
            pushFollow(FOLLOW_66);
            rule__ParamCall__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParamCall__Group_0__1();

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
    // $ANTLR end "rule__ParamCall__Group_0__0"


    // $ANTLR start "rule__ParamCall__Group_0__0__Impl"
    // InternalAle.g:7015:1: rule__ParamCall__Group_0__0__Impl : ( ( rule__ParamCall__LambdaAssignment_0_0 ) ) ;
    public final void rule__ParamCall__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7019:1: ( ( ( rule__ParamCall__LambdaAssignment_0_0 ) ) )
            // InternalAle.g:7020:1: ( ( rule__ParamCall__LambdaAssignment_0_0 ) )
            {
            // InternalAle.g:7020:1: ( ( rule__ParamCall__LambdaAssignment_0_0 ) )
            // InternalAle.g:7021:2: ( rule__ParamCall__LambdaAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getLambdaAssignment_0_0()); 
            }
            // InternalAle.g:7022:2: ( rule__ParamCall__LambdaAssignment_0_0 )
            // InternalAle.g:7022:3: rule__ParamCall__LambdaAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ParamCall__LambdaAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getLambdaAssignment_0_0()); 
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
    // $ANTLR end "rule__ParamCall__Group_0__0__Impl"


    // $ANTLR start "rule__ParamCall__Group_0__1"
    // InternalAle.g:7030:1: rule__ParamCall__Group_0__1 : rule__ParamCall__Group_0__1__Impl ;
    public final void rule__ParamCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7034:1: ( rule__ParamCall__Group_0__1__Impl )
            // InternalAle.g:7035:2: rule__ParamCall__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamCall__Group_0__1__Impl();

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
    // $ANTLR end "rule__ParamCall__Group_0__1"


    // $ANTLR start "rule__ParamCall__Group_0__1__Impl"
    // InternalAle.g:7041:1: rule__ParamCall__Group_0__1__Impl : ( '|' ) ;
    public final void rule__ParamCall__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7045:1: ( ( '|' ) )
            // InternalAle.g:7046:1: ( '|' )
            {
            // InternalAle.g:7046:1: ( '|' )
            // InternalAle.g:7047:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getVerticalLineKeyword_0_1()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getVerticalLineKeyword_0_1()); 
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
    // $ANTLR end "rule__ParamCall__Group_0__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_0__0"
    // InternalAle.g:7057:1: rule__AtomicLiteral__Group_0__0 : rule__AtomicLiteral__Group_0__0__Impl rule__AtomicLiteral__Group_0__1 ;
    public final void rule__AtomicLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7061:1: ( rule__AtomicLiteral__Group_0__0__Impl rule__AtomicLiteral__Group_0__1 )
            // InternalAle.g:7062:2: rule__AtomicLiteral__Group_0__0__Impl rule__AtomicLiteral__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__AtomicLiteral__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_0__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_0__0"


    // $ANTLR start "rule__AtomicLiteral__Group_0__0__Impl"
    // InternalAle.g:7069:1: rule__AtomicLiteral__Group_0__0__Impl : ( '(' ) ;
    public final void rule__AtomicLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7073:1: ( ( '(' ) )
            // InternalAle.g:7074:1: ( '(' )
            {
            // InternalAle.g:7074:1: ( '(' )
            // InternalAle.g:7075:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getLeftParenthesisKeyword_0_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_0__1"
    // InternalAle.g:7084:1: rule__AtomicLiteral__Group_0__1 : rule__AtomicLiteral__Group_0__1__Impl rule__AtomicLiteral__Group_0__2 ;
    public final void rule__AtomicLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7088:1: ( rule__AtomicLiteral__Group_0__1__Impl rule__AtomicLiteral__Group_0__2 )
            // InternalAle.g:7089:2: rule__AtomicLiteral__Group_0__1__Impl rule__AtomicLiteral__Group_0__2
            {
            pushFollow(FOLLOW_32);
            rule__AtomicLiteral__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_0__2();

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
    // $ANTLR end "rule__AtomicLiteral__Group_0__1"


    // $ANTLR start "rule__AtomicLiteral__Group_0__1__Impl"
    // InternalAle.g:7096:1: rule__AtomicLiteral__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7100:1: ( ( ruleExpression ) )
            // InternalAle.g:7101:1: ( ruleExpression )
            {
            // InternalAle.g:7101:1: ( ruleExpression )
            // InternalAle.g:7102:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_0__2"
    // InternalAle.g:7111:1: rule__AtomicLiteral__Group_0__2 : rule__AtomicLiteral__Group_0__2__Impl ;
    public final void rule__AtomicLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7115:1: ( rule__AtomicLiteral__Group_0__2__Impl )
            // InternalAle.g:7116:2: rule__AtomicLiteral__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_0__2__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_0__2"


    // $ANTLR start "rule__AtomicLiteral__Group_0__2__Impl"
    // InternalAle.g:7122:1: rule__AtomicLiteral__Group_0__2__Impl : ( ')' ) ;
    public final void rule__AtomicLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7126:1: ( ( ')' ) )
            // InternalAle.g:7127:1: ( ')' )
            {
            // InternalAle.g:7127:1: ( ')' )
            // InternalAle.g:7128:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getRightParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_0__2__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_1__0"
    // InternalAle.g:7138:1: rule__AtomicLiteral__Group_1__0 : rule__AtomicLiteral__Group_1__0__Impl rule__AtomicLiteral__Group_1__1 ;
    public final void rule__AtomicLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7142:1: ( rule__AtomicLiteral__Group_1__0__Impl rule__AtomicLiteral__Group_1__1 )
            // InternalAle.g:7143:2: rule__AtomicLiteral__Group_1__0__Impl rule__AtomicLiteral__Group_1__1
            {
            pushFollow(FOLLOW_67);
            rule__AtomicLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_1__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_1__0"


    // $ANTLR start "rule__AtomicLiteral__Group_1__0__Impl"
    // InternalAle.g:7150:1: rule__AtomicLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7154:1: ( ( () ) )
            // InternalAle.g:7155:1: ( () )
            {
            // InternalAle.g:7155:1: ( () )
            // InternalAle.g:7156:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getSelfRefAction_1_0()); 
            }
            // InternalAle.g:7157:2: ()
            // InternalAle.g:7157:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getSelfRefAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_1__1"
    // InternalAle.g:7165:1: rule__AtomicLiteral__Group_1__1 : rule__AtomicLiteral__Group_1__1__Impl ;
    public final void rule__AtomicLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7169:1: ( rule__AtomicLiteral__Group_1__1__Impl )
            // InternalAle.g:7170:2: rule__AtomicLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_1__1__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_1__1"


    // $ANTLR start "rule__AtomicLiteral__Group_1__1__Impl"
    // InternalAle.g:7176:1: rule__AtomicLiteral__Group_1__1__Impl : ( 'self' ) ;
    public final void rule__AtomicLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7180:1: ( ( 'self' ) )
            // InternalAle.g:7181:1: ( 'self' )
            {
            // InternalAle.g:7181:1: ( 'self' )
            // InternalAle.g:7182:2: 'self'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getSelfKeyword_1_1()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getSelfKeyword_1_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_2__0"
    // InternalAle.g:7192:1: rule__AtomicLiteral__Group_2__0 : rule__AtomicLiteral__Group_2__0__Impl rule__AtomicLiteral__Group_2__1 ;
    public final void rule__AtomicLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7196:1: ( rule__AtomicLiteral__Group_2__0__Impl rule__AtomicLiteral__Group_2__1 )
            // InternalAle.g:7197:2: rule__AtomicLiteral__Group_2__0__Impl rule__AtomicLiteral__Group_2__1
            {
            pushFollow(FOLLOW_68);
            rule__AtomicLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_2__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_2__0"


    // $ANTLR start "rule__AtomicLiteral__Group_2__0__Impl"
    // InternalAle.g:7204:1: rule__AtomicLiteral__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7208:1: ( ( () ) )
            // InternalAle.g:7209:1: ( () )
            {
            // InternalAle.g:7209:1: ( () )
            // InternalAle.g:7210:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getSuperRefAction_2_0()); 
            }
            // InternalAle.g:7211:2: ()
            // InternalAle.g:7211:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getSuperRefAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_2__1"
    // InternalAle.g:7219:1: rule__AtomicLiteral__Group_2__1 : rule__AtomicLiteral__Group_2__1__Impl ;
    public final void rule__AtomicLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7223:1: ( rule__AtomicLiteral__Group_2__1__Impl )
            // InternalAle.g:7224:2: rule__AtomicLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_2__1__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_2__1"


    // $ANTLR start "rule__AtomicLiteral__Group_2__1__Impl"
    // InternalAle.g:7230:1: rule__AtomicLiteral__Group_2__1__Impl : ( 'super' ) ;
    public final void rule__AtomicLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7234:1: ( ( 'super' ) )
            // InternalAle.g:7235:1: ( 'super' )
            {
            // InternalAle.g:7235:1: ( 'super' )
            // InternalAle.g:7236:2: 'super'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getSuperKeyword_2_1()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getSuperKeyword_2_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_3__0"
    // InternalAle.g:7246:1: rule__AtomicLiteral__Group_3__0 : rule__AtomicLiteral__Group_3__0__Impl rule__AtomicLiteral__Group_3__1 ;
    public final void rule__AtomicLiteral__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7250:1: ( rule__AtomicLiteral__Group_3__0__Impl rule__AtomicLiteral__Group_3__1 )
            // InternalAle.g:7251:2: rule__AtomicLiteral__Group_3__0__Impl rule__AtomicLiteral__Group_3__1
            {
            pushFollow(FOLLOW_69);
            rule__AtomicLiteral__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_3__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_3__0"


    // $ANTLR start "rule__AtomicLiteral__Group_3__0__Impl"
    // InternalAle.g:7258:1: rule__AtomicLiteral__Group_3__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7262:1: ( ( () ) )
            // InternalAle.g:7263:1: ( () )
            {
            // InternalAle.g:7263:1: ( () )
            // InternalAle.g:7264:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getStringLiteralAction_3_0()); 
            }
            // InternalAle.g:7265:2: ()
            // InternalAle.g:7265:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getStringLiteralAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_3__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_3__1"
    // InternalAle.g:7273:1: rule__AtomicLiteral__Group_3__1 : rule__AtomicLiteral__Group_3__1__Impl ;
    public final void rule__AtomicLiteral__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7277:1: ( rule__AtomicLiteral__Group_3__1__Impl )
            // InternalAle.g:7278:2: rule__AtomicLiteral__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_3__1__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_3__1"


    // $ANTLR start "rule__AtomicLiteral__Group_3__1__Impl"
    // InternalAle.g:7284:1: rule__AtomicLiteral__Group_3__1__Impl : ( ( rule__AtomicLiteral__ValueAssignment_3_1 ) ) ;
    public final void rule__AtomicLiteral__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7288:1: ( ( ( rule__AtomicLiteral__ValueAssignment_3_1 ) ) )
            // InternalAle.g:7289:1: ( ( rule__AtomicLiteral__ValueAssignment_3_1 ) )
            {
            // InternalAle.g:7289:1: ( ( rule__AtomicLiteral__ValueAssignment_3_1 ) )
            // InternalAle.g:7290:2: ( rule__AtomicLiteral__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueAssignment_3_1()); 
            }
            // InternalAle.g:7291:2: ( rule__AtomicLiteral__ValueAssignment_3_1 )
            // InternalAle.g:7291:3: rule__AtomicLiteral__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueAssignment_3_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_3__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_4__0"
    // InternalAle.g:7300:1: rule__AtomicLiteral__Group_4__0 : rule__AtomicLiteral__Group_4__0__Impl rule__AtomicLiteral__Group_4__1 ;
    public final void rule__AtomicLiteral__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7304:1: ( rule__AtomicLiteral__Group_4__0__Impl rule__AtomicLiteral__Group_4__1 )
            // InternalAle.g:7305:2: rule__AtomicLiteral__Group_4__0__Impl rule__AtomicLiteral__Group_4__1
            {
            pushFollow(FOLLOW_70);
            rule__AtomicLiteral__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_4__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_4__0"


    // $ANTLR start "rule__AtomicLiteral__Group_4__0__Impl"
    // InternalAle.g:7312:1: rule__AtomicLiteral__Group_4__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7316:1: ( ( () ) )
            // InternalAle.g:7317:1: ( () )
            {
            // InternalAle.g:7317:1: ( () )
            // InternalAle.g:7318:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getIntLiteralAction_4_0()); 
            }
            // InternalAle.g:7319:2: ()
            // InternalAle.g:7319:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getIntLiteralAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_4__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_4__1"
    // InternalAle.g:7327:1: rule__AtomicLiteral__Group_4__1 : rule__AtomicLiteral__Group_4__1__Impl ;
    public final void rule__AtomicLiteral__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7331:1: ( rule__AtomicLiteral__Group_4__1__Impl )
            // InternalAle.g:7332:2: rule__AtomicLiteral__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_4__1__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_4__1"


    // $ANTLR start "rule__AtomicLiteral__Group_4__1__Impl"
    // InternalAle.g:7338:1: rule__AtomicLiteral__Group_4__1__Impl : ( ( rule__AtomicLiteral__ValueAssignment_4_1 ) ) ;
    public final void rule__AtomicLiteral__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7342:1: ( ( ( rule__AtomicLiteral__ValueAssignment_4_1 ) ) )
            // InternalAle.g:7343:1: ( ( rule__AtomicLiteral__ValueAssignment_4_1 ) )
            {
            // InternalAle.g:7343:1: ( ( rule__AtomicLiteral__ValueAssignment_4_1 ) )
            // InternalAle.g:7344:2: ( rule__AtomicLiteral__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueAssignment_4_1()); 
            }
            // InternalAle.g:7345:2: ( rule__AtomicLiteral__ValueAssignment_4_1 )
            // InternalAle.g:7345:3: rule__AtomicLiteral__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueAssignment_4_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_4__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_5__0"
    // InternalAle.g:7354:1: rule__AtomicLiteral__Group_5__0 : rule__AtomicLiteral__Group_5__0__Impl rule__AtomicLiteral__Group_5__1 ;
    public final void rule__AtomicLiteral__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7358:1: ( rule__AtomicLiteral__Group_5__0__Impl rule__AtomicLiteral__Group_5__1 )
            // InternalAle.g:7359:2: rule__AtomicLiteral__Group_5__0__Impl rule__AtomicLiteral__Group_5__1
            {
            pushFollow(FOLLOW_71);
            rule__AtomicLiteral__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_5__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_5__0"


    // $ANTLR start "rule__AtomicLiteral__Group_5__0__Impl"
    // InternalAle.g:7366:1: rule__AtomicLiteral__Group_5__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7370:1: ( ( () ) )
            // InternalAle.g:7371:1: ( () )
            {
            // InternalAle.g:7371:1: ( () )
            // InternalAle.g:7372:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getRealLiteralAction_5_0()); 
            }
            // InternalAle.g:7373:2: ()
            // InternalAle.g:7373:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getRealLiteralAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_5__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_5__1"
    // InternalAle.g:7381:1: rule__AtomicLiteral__Group_5__1 : rule__AtomicLiteral__Group_5__1__Impl ;
    public final void rule__AtomicLiteral__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7385:1: ( rule__AtomicLiteral__Group_5__1__Impl )
            // InternalAle.g:7386:2: rule__AtomicLiteral__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_5__1__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_5__1"


    // $ANTLR start "rule__AtomicLiteral__Group_5__1__Impl"
    // InternalAle.g:7392:1: rule__AtomicLiteral__Group_5__1__Impl : ( ( rule__AtomicLiteral__ValueAssignment_5_1 ) ) ;
    public final void rule__AtomicLiteral__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7396:1: ( ( ( rule__AtomicLiteral__ValueAssignment_5_1 ) ) )
            // InternalAle.g:7397:1: ( ( rule__AtomicLiteral__ValueAssignment_5_1 ) )
            {
            // InternalAle.g:7397:1: ( ( rule__AtomicLiteral__ValueAssignment_5_1 ) )
            // InternalAle.g:7398:2: ( rule__AtomicLiteral__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueAssignment_5_1()); 
            }
            // InternalAle.g:7399:2: ( rule__AtomicLiteral__ValueAssignment_5_1 )
            // InternalAle.g:7399:3: rule__AtomicLiteral__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ValueAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueAssignment_5_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_5__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_6__0"
    // InternalAle.g:7408:1: rule__AtomicLiteral__Group_6__0 : rule__AtomicLiteral__Group_6__0__Impl rule__AtomicLiteral__Group_6__1 ;
    public final void rule__AtomicLiteral__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7412:1: ( rule__AtomicLiteral__Group_6__0__Impl rule__AtomicLiteral__Group_6__1 )
            // InternalAle.g:7413:2: rule__AtomicLiteral__Group_6__0__Impl rule__AtomicLiteral__Group_6__1
            {
            pushFollow(FOLLOW_72);
            rule__AtomicLiteral__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_6__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_6__0"


    // $ANTLR start "rule__AtomicLiteral__Group_6__0__Impl"
    // InternalAle.g:7420:1: rule__AtomicLiteral__Group_6__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7424:1: ( ( () ) )
            // InternalAle.g:7425:1: ( () )
            {
            // InternalAle.g:7425:1: ( () )
            // InternalAle.g:7426:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getBooleanLiteralAction_6_0()); 
            }
            // InternalAle.g:7427:2: ()
            // InternalAle.g:7427:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getBooleanLiteralAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_6__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_6__1"
    // InternalAle.g:7435:1: rule__AtomicLiteral__Group_6__1 : rule__AtomicLiteral__Group_6__1__Impl ;
    public final void rule__AtomicLiteral__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7439:1: ( rule__AtomicLiteral__Group_6__1__Impl )
            // InternalAle.g:7440:2: rule__AtomicLiteral__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_6__1__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_6__1"


    // $ANTLR start "rule__AtomicLiteral__Group_6__1__Impl"
    // InternalAle.g:7446:1: rule__AtomicLiteral__Group_6__1__Impl : ( ( rule__AtomicLiteral__ValueAssignment_6_1 ) ) ;
    public final void rule__AtomicLiteral__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7450:1: ( ( ( rule__AtomicLiteral__ValueAssignment_6_1 ) ) )
            // InternalAle.g:7451:1: ( ( rule__AtomicLiteral__ValueAssignment_6_1 ) )
            {
            // InternalAle.g:7451:1: ( ( rule__AtomicLiteral__ValueAssignment_6_1 ) )
            // InternalAle.g:7452:2: ( rule__AtomicLiteral__ValueAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueAssignment_6_1()); 
            }
            // InternalAle.g:7453:2: ( rule__AtomicLiteral__ValueAssignment_6_1 )
            // InternalAle.g:7453:3: rule__AtomicLiteral__ValueAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ValueAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueAssignment_6_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_6__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_7__0"
    // InternalAle.g:7462:1: rule__AtomicLiteral__Group_7__0 : rule__AtomicLiteral__Group_7__0__Impl rule__AtomicLiteral__Group_7__1 ;
    public final void rule__AtomicLiteral__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7466:1: ( rule__AtomicLiteral__Group_7__0__Impl rule__AtomicLiteral__Group_7__1 )
            // InternalAle.g:7467:2: rule__AtomicLiteral__Group_7__0__Impl rule__AtomicLiteral__Group_7__1
            {
            pushFollow(FOLLOW_73);
            rule__AtomicLiteral__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_7__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_7__0"


    // $ANTLR start "rule__AtomicLiteral__Group_7__0__Impl"
    // InternalAle.g:7474:1: rule__AtomicLiteral__Group_7__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7478:1: ( ( () ) )
            // InternalAle.g:7479:1: ( () )
            {
            // InternalAle.g:7479:1: ( () )
            // InternalAle.g:7480:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getNullLiteralAction_7_0()); 
            }
            // InternalAle.g:7481:2: ()
            // InternalAle.g:7481:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getNullLiteralAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_7__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_7__1"
    // InternalAle.g:7489:1: rule__AtomicLiteral__Group_7__1 : rule__AtomicLiteral__Group_7__1__Impl ;
    public final void rule__AtomicLiteral__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7493:1: ( rule__AtomicLiteral__Group_7__1__Impl )
            // InternalAle.g:7494:2: rule__AtomicLiteral__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_7__1__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_7__1"


    // $ANTLR start "rule__AtomicLiteral__Group_7__1__Impl"
    // InternalAle.g:7500:1: rule__AtomicLiteral__Group_7__1__Impl : ( RULE_NULL ) ;
    public final void rule__AtomicLiteral__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7504:1: ( ( RULE_NULL ) )
            // InternalAle.g:7505:1: ( RULE_NULL )
            {
            // InternalAle.g:7505:1: ( RULE_NULL )
            // InternalAle.g:7506:2: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getNULLTerminalRuleCall_7_1()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getNULLTerminalRuleCall_7_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_7__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_8__0"
    // InternalAle.g:7516:1: rule__AtomicLiteral__Group_8__0 : rule__AtomicLiteral__Group_8__0__Impl rule__AtomicLiteral__Group_8__1 ;
    public final void rule__AtomicLiteral__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7520:1: ( rule__AtomicLiteral__Group_8__0__Impl rule__AtomicLiteral__Group_8__1 )
            // InternalAle.g:7521:2: rule__AtomicLiteral__Group_8__0__Impl rule__AtomicLiteral__Group_8__1
            {
            pushFollow(FOLLOW_74);
            rule__AtomicLiteral__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_8__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_8__0"


    // $ANTLR start "rule__AtomicLiteral__Group_8__0__Impl"
    // InternalAle.g:7528:1: rule__AtomicLiteral__Group_8__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7532:1: ( ( () ) )
            // InternalAle.g:7533:1: ( () )
            {
            // InternalAle.g:7533:1: ( () )
            // InternalAle.g:7534:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getIntRangeAction_8_0()); 
            }
            // InternalAle.g:7535:2: ()
            // InternalAle.g:7535:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getIntRangeAction_8_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_8__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_8__1"
    // InternalAle.g:7543:1: rule__AtomicLiteral__Group_8__1 : rule__AtomicLiteral__Group_8__1__Impl rule__AtomicLiteral__Group_8__2 ;
    public final void rule__AtomicLiteral__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7547:1: ( rule__AtomicLiteral__Group_8__1__Impl rule__AtomicLiteral__Group_8__2 )
            // InternalAle.g:7548:2: rule__AtomicLiteral__Group_8__1__Impl rule__AtomicLiteral__Group_8__2
            {
            pushFollow(FOLLOW_27);
            rule__AtomicLiteral__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_8__2();

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
    // $ANTLR end "rule__AtomicLiteral__Group_8__1"


    // $ANTLR start "rule__AtomicLiteral__Group_8__1__Impl"
    // InternalAle.g:7555:1: rule__AtomicLiteral__Group_8__1__Impl : ( '[' ) ;
    public final void rule__AtomicLiteral__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7559:1: ( ( '[' ) )
            // InternalAle.g:7560:1: ( '[' )
            {
            // InternalAle.g:7560:1: ( '[' )
            // InternalAle.g:7561:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getLeftSquareBracketKeyword_8_1()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getLeftSquareBracketKeyword_8_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_8__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_8__2"
    // InternalAle.g:7570:1: rule__AtomicLiteral__Group_8__2 : rule__AtomicLiteral__Group_8__2__Impl rule__AtomicLiteral__Group_8__3 ;
    public final void rule__AtomicLiteral__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7574:1: ( rule__AtomicLiteral__Group_8__2__Impl rule__AtomicLiteral__Group_8__3 )
            // InternalAle.g:7575:2: rule__AtomicLiteral__Group_8__2__Impl rule__AtomicLiteral__Group_8__3
            {
            pushFollow(FOLLOW_65);
            rule__AtomicLiteral__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_8__3();

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
    // $ANTLR end "rule__AtomicLiteral__Group_8__2"


    // $ANTLR start "rule__AtomicLiteral__Group_8__2__Impl"
    // InternalAle.g:7582:1: rule__AtomicLiteral__Group_8__2__Impl : ( ( rule__AtomicLiteral__StartAssignment_8_2 ) ) ;
    public final void rule__AtomicLiteral__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7586:1: ( ( ( rule__AtomicLiteral__StartAssignment_8_2 ) ) )
            // InternalAle.g:7587:1: ( ( rule__AtomicLiteral__StartAssignment_8_2 ) )
            {
            // InternalAle.g:7587:1: ( ( rule__AtomicLiteral__StartAssignment_8_2 ) )
            // InternalAle.g:7588:2: ( rule__AtomicLiteral__StartAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getStartAssignment_8_2()); 
            }
            // InternalAle.g:7589:2: ( rule__AtomicLiteral__StartAssignment_8_2 )
            // InternalAle.g:7589:3: rule__AtomicLiteral__StartAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__StartAssignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getStartAssignment_8_2()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_8__2__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_8__3"
    // InternalAle.g:7597:1: rule__AtomicLiteral__Group_8__3 : rule__AtomicLiteral__Group_8__3__Impl rule__AtomicLiteral__Group_8__4 ;
    public final void rule__AtomicLiteral__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7601:1: ( rule__AtomicLiteral__Group_8__3__Impl rule__AtomicLiteral__Group_8__4 )
            // InternalAle.g:7602:2: rule__AtomicLiteral__Group_8__3__Impl rule__AtomicLiteral__Group_8__4
            {
            pushFollow(FOLLOW_65);
            rule__AtomicLiteral__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_8__4();

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
    // $ANTLR end "rule__AtomicLiteral__Group_8__3"


    // $ANTLR start "rule__AtomicLiteral__Group_8__3__Impl"
    // InternalAle.g:7609:1: rule__AtomicLiteral__Group_8__3__Impl : ( '.' ) ;
    public final void rule__AtomicLiteral__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7613:1: ( ( '.' ) )
            // InternalAle.g:7614:1: ( '.' )
            {
            // InternalAle.g:7614:1: ( '.' )
            // InternalAle.g:7615:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_8_3()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_8_3()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_8__3__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_8__4"
    // InternalAle.g:7624:1: rule__AtomicLiteral__Group_8__4 : rule__AtomicLiteral__Group_8__4__Impl rule__AtomicLiteral__Group_8__5 ;
    public final void rule__AtomicLiteral__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7628:1: ( rule__AtomicLiteral__Group_8__4__Impl rule__AtomicLiteral__Group_8__5 )
            // InternalAle.g:7629:2: rule__AtomicLiteral__Group_8__4__Impl rule__AtomicLiteral__Group_8__5
            {
            pushFollow(FOLLOW_27);
            rule__AtomicLiteral__Group_8__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_8__5();

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
    // $ANTLR end "rule__AtomicLiteral__Group_8__4"


    // $ANTLR start "rule__AtomicLiteral__Group_8__4__Impl"
    // InternalAle.g:7636:1: rule__AtomicLiteral__Group_8__4__Impl : ( '.' ) ;
    public final void rule__AtomicLiteral__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7640:1: ( ( '.' ) )
            // InternalAle.g:7641:1: ( '.' )
            {
            // InternalAle.g:7641:1: ( '.' )
            // InternalAle.g:7642:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_8_4()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_8_4()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_8__4__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_8__5"
    // InternalAle.g:7651:1: rule__AtomicLiteral__Group_8__5 : rule__AtomicLiteral__Group_8__5__Impl rule__AtomicLiteral__Group_8__6 ;
    public final void rule__AtomicLiteral__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7655:1: ( rule__AtomicLiteral__Group_8__5__Impl rule__AtomicLiteral__Group_8__6 )
            // InternalAle.g:7656:2: rule__AtomicLiteral__Group_8__5__Impl rule__AtomicLiteral__Group_8__6
            {
            pushFollow(FOLLOW_75);
            rule__AtomicLiteral__Group_8__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_8__6();

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
    // $ANTLR end "rule__AtomicLiteral__Group_8__5"


    // $ANTLR start "rule__AtomicLiteral__Group_8__5__Impl"
    // InternalAle.g:7663:1: rule__AtomicLiteral__Group_8__5__Impl : ( ( rule__AtomicLiteral__StopAssignment_8_5 ) ) ;
    public final void rule__AtomicLiteral__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7667:1: ( ( ( rule__AtomicLiteral__StopAssignment_8_5 ) ) )
            // InternalAle.g:7668:1: ( ( rule__AtomicLiteral__StopAssignment_8_5 ) )
            {
            // InternalAle.g:7668:1: ( ( rule__AtomicLiteral__StopAssignment_8_5 ) )
            // InternalAle.g:7669:2: ( rule__AtomicLiteral__StopAssignment_8_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getStopAssignment_8_5()); 
            }
            // InternalAle.g:7670:2: ( rule__AtomicLiteral__StopAssignment_8_5 )
            // InternalAle.g:7670:3: rule__AtomicLiteral__StopAssignment_8_5
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__StopAssignment_8_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getStopAssignment_8_5()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_8__5__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_8__6"
    // InternalAle.g:7678:1: rule__AtomicLiteral__Group_8__6 : rule__AtomicLiteral__Group_8__6__Impl ;
    public final void rule__AtomicLiteral__Group_8__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7682:1: ( rule__AtomicLiteral__Group_8__6__Impl )
            // InternalAle.g:7683:2: rule__AtomicLiteral__Group_8__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_8__6__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_8__6"


    // $ANTLR start "rule__AtomicLiteral__Group_8__6__Impl"
    // InternalAle.g:7689:1: rule__AtomicLiteral__Group_8__6__Impl : ( ']' ) ;
    public final void rule__AtomicLiteral__Group_8__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7693:1: ( ( ']' ) )
            // InternalAle.g:7694:1: ( ']' )
            {
            // InternalAle.g:7694:1: ( ']' )
            // InternalAle.g:7695:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getRightSquareBracketKeyword_8_6()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getRightSquareBracketKeyword_8_6()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_8__6__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9__0"
    // InternalAle.g:7705:1: rule__AtomicLiteral__Group_9__0 : rule__AtomicLiteral__Group_9__0__Impl rule__AtomicLiteral__Group_9__1 ;
    public final void rule__AtomicLiteral__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7709:1: ( rule__AtomicLiteral__Group_9__0__Impl rule__AtomicLiteral__Group_9__1 )
            // InternalAle.g:7710:2: rule__AtomicLiteral__Group_9__0__Impl rule__AtomicLiteral__Group_9__1
            {
            pushFollow(FOLLOW_76);
            rule__AtomicLiteral__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_9__0"


    // $ANTLR start "rule__AtomicLiteral__Group_9__0__Impl"
    // InternalAle.g:7717:1: rule__AtomicLiteral__Group_9__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7721:1: ( ( () ) )
            // InternalAle.g:7722:1: ( () )
            {
            // InternalAle.g:7722:1: ( () )
            // InternalAle.g:7723:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getSequenceDeclAction_9_0()); 
            }
            // InternalAle.g:7724:2: ()
            // InternalAle.g:7724:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getSequenceDeclAction_9_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9__1"
    // InternalAle.g:7732:1: rule__AtomicLiteral__Group_9__1 : rule__AtomicLiteral__Group_9__1__Impl rule__AtomicLiteral__Group_9__2 ;
    public final void rule__AtomicLiteral__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7736:1: ( rule__AtomicLiteral__Group_9__1__Impl rule__AtomicLiteral__Group_9__2 )
            // InternalAle.g:7737:2: rule__AtomicLiteral__Group_9__1__Impl rule__AtomicLiteral__Group_9__2
            {
            pushFollow(FOLLOW_22);
            rule__AtomicLiteral__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9__2();

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
    // $ANTLR end "rule__AtomicLiteral__Group_9__1"


    // $ANTLR start "rule__AtomicLiteral__Group_9__1__Impl"
    // InternalAle.g:7744:1: rule__AtomicLiteral__Group_9__1__Impl : ( 'Sequence' ) ;
    public final void rule__AtomicLiteral__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7748:1: ( ( 'Sequence' ) )
            // InternalAle.g:7749:1: ( 'Sequence' )
            {
            // InternalAle.g:7749:1: ( 'Sequence' )
            // InternalAle.g:7750:2: 'Sequence'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getSequenceKeyword_9_1()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getSequenceKeyword_9_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_9__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9__2"
    // InternalAle.g:7759:1: rule__AtomicLiteral__Group_9__2 : rule__AtomicLiteral__Group_9__2__Impl rule__AtomicLiteral__Group_9__3 ;
    public final void rule__AtomicLiteral__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7763:1: ( rule__AtomicLiteral__Group_9__2__Impl rule__AtomicLiteral__Group_9__3 )
            // InternalAle.g:7764:2: rule__AtomicLiteral__Group_9__2__Impl rule__AtomicLiteral__Group_9__3
            {
            pushFollow(FOLLOW_77);
            rule__AtomicLiteral__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9__3();

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
    // $ANTLR end "rule__AtomicLiteral__Group_9__2"


    // $ANTLR start "rule__AtomicLiteral__Group_9__2__Impl"
    // InternalAle.g:7771:1: rule__AtomicLiteral__Group_9__2__Impl : ( '{' ) ;
    public final void rule__AtomicLiteral__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7775:1: ( ( '{' ) )
            // InternalAle.g:7776:1: ( '{' )
            {
            // InternalAle.g:7776:1: ( '{' )
            // InternalAle.g:7777:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_9_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_9_2()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_9__2__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9__3"
    // InternalAle.g:7786:1: rule__AtomicLiteral__Group_9__3 : rule__AtomicLiteral__Group_9__3__Impl rule__AtomicLiteral__Group_9__4 ;
    public final void rule__AtomicLiteral__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7790:1: ( rule__AtomicLiteral__Group_9__3__Impl rule__AtomicLiteral__Group_9__4 )
            // InternalAle.g:7791:2: rule__AtomicLiteral__Group_9__3__Impl rule__AtomicLiteral__Group_9__4
            {
            pushFollow(FOLLOW_77);
            rule__AtomicLiteral__Group_9__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9__4();

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
    // $ANTLR end "rule__AtomicLiteral__Group_9__3"


    // $ANTLR start "rule__AtomicLiteral__Group_9__3__Impl"
    // InternalAle.g:7798:1: rule__AtomicLiteral__Group_9__3__Impl : ( ( rule__AtomicLiteral__Group_9_3__0 )? ) ;
    public final void rule__AtomicLiteral__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7802:1: ( ( ( rule__AtomicLiteral__Group_9_3__0 )? ) )
            // InternalAle.g:7803:1: ( ( rule__AtomicLiteral__Group_9_3__0 )? )
            {
            // InternalAle.g:7803:1: ( ( rule__AtomicLiteral__Group_9_3__0 )? )
            // InternalAle.g:7804:2: ( rule__AtomicLiteral__Group_9_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getGroup_9_3()); 
            }
            // InternalAle.g:7805:2: ( rule__AtomicLiteral__Group_9_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_BOOLEAN)||LA44_0==36||(LA44_0>=59 && LA44_0<=61)||(LA44_0>=65 && LA44_0<=67)||(LA44_0>=69 && LA44_0<=70)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAle.g:7805:3: rule__AtomicLiteral__Group_9_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_9_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getGroup_9_3()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_9__3__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9__4"
    // InternalAle.g:7813:1: rule__AtomicLiteral__Group_9__4 : rule__AtomicLiteral__Group_9__4__Impl ;
    public final void rule__AtomicLiteral__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7817:1: ( rule__AtomicLiteral__Group_9__4__Impl )
            // InternalAle.g:7818:2: rule__AtomicLiteral__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9__4__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_9__4"


    // $ANTLR start "rule__AtomicLiteral__Group_9__4__Impl"
    // InternalAle.g:7824:1: rule__AtomicLiteral__Group_9__4__Impl : ( '}' ) ;
    public final void rule__AtomicLiteral__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7828:1: ( ( '}' ) )
            // InternalAle.g:7829:1: ( '}' )
            {
            // InternalAle.g:7829:1: ( '}' )
            // InternalAle.g:7830:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_9_4()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_9_4()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_9__4__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9_3__0"
    // InternalAle.g:7840:1: rule__AtomicLiteral__Group_9_3__0 : rule__AtomicLiteral__Group_9_3__0__Impl rule__AtomicLiteral__Group_9_3__1 ;
    public final void rule__AtomicLiteral__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7844:1: ( rule__AtomicLiteral__Group_9_3__0__Impl rule__AtomicLiteral__Group_9_3__1 )
            // InternalAle.g:7845:2: rule__AtomicLiteral__Group_9_3__0__Impl rule__AtomicLiteral__Group_9_3__1
            {
            pushFollow(FOLLOW_12);
            rule__AtomicLiteral__Group_9_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9_3__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_9_3__0"


    // $ANTLR start "rule__AtomicLiteral__Group_9_3__0__Impl"
    // InternalAle.g:7852:1: rule__AtomicLiteral__Group_9_3__0__Impl : ( ( rule__AtomicLiteral__ExpressionsAssignment_9_3_0 ) ) ;
    public final void rule__AtomicLiteral__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7856:1: ( ( ( rule__AtomicLiteral__ExpressionsAssignment_9_3_0 ) ) )
            // InternalAle.g:7857:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_9_3_0 ) )
            {
            // InternalAle.g:7857:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_9_3_0 ) )
            // InternalAle.g:7858:2: ( rule__AtomicLiteral__ExpressionsAssignment_9_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_9_3_0()); 
            }
            // InternalAle.g:7859:2: ( rule__AtomicLiteral__ExpressionsAssignment_9_3_0 )
            // InternalAle.g:7859:3: rule__AtomicLiteral__ExpressionsAssignment_9_3_0
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ExpressionsAssignment_9_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_9_3_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_9_3__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9_3__1"
    // InternalAle.g:7867:1: rule__AtomicLiteral__Group_9_3__1 : rule__AtomicLiteral__Group_9_3__1__Impl ;
    public final void rule__AtomicLiteral__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7871:1: ( rule__AtomicLiteral__Group_9_3__1__Impl )
            // InternalAle.g:7872:2: rule__AtomicLiteral__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_9_3__1"


    // $ANTLR start "rule__AtomicLiteral__Group_9_3__1__Impl"
    // InternalAle.g:7878:1: rule__AtomicLiteral__Group_9_3__1__Impl : ( ( rule__AtomicLiteral__Group_9_3_1__0 )* ) ;
    public final void rule__AtomicLiteral__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7882:1: ( ( ( rule__AtomicLiteral__Group_9_3_1__0 )* ) )
            // InternalAle.g:7883:1: ( ( rule__AtomicLiteral__Group_9_3_1__0 )* )
            {
            // InternalAle.g:7883:1: ( ( rule__AtomicLiteral__Group_9_3_1__0 )* )
            // InternalAle.g:7884:2: ( rule__AtomicLiteral__Group_9_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getGroup_9_3_1()); 
            }
            // InternalAle.g:7885:2: ( rule__AtomicLiteral__Group_9_3_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==32) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAle.g:7885:3: rule__AtomicLiteral__Group_9_3_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AtomicLiteral__Group_9_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getGroup_9_3_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_9_3__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9_3_1__0"
    // InternalAle.g:7894:1: rule__AtomicLiteral__Group_9_3_1__0 : rule__AtomicLiteral__Group_9_3_1__0__Impl rule__AtomicLiteral__Group_9_3_1__1 ;
    public final void rule__AtomicLiteral__Group_9_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7898:1: ( rule__AtomicLiteral__Group_9_3_1__0__Impl rule__AtomicLiteral__Group_9_3_1__1 )
            // InternalAle.g:7899:2: rule__AtomicLiteral__Group_9_3_1__0__Impl rule__AtomicLiteral__Group_9_3_1__1
            {
            pushFollow(FOLLOW_27);
            rule__AtomicLiteral__Group_9_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9_3_1__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_9_3_1__0"


    // $ANTLR start "rule__AtomicLiteral__Group_9_3_1__0__Impl"
    // InternalAle.g:7906:1: rule__AtomicLiteral__Group_9_3_1__0__Impl : ( ',' ) ;
    public final void rule__AtomicLiteral__Group_9_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7910:1: ( ( ',' ) )
            // InternalAle.g:7911:1: ( ',' )
            {
            // InternalAle.g:7911:1: ( ',' )
            // InternalAle.g:7912:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getCommaKeyword_9_3_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getCommaKeyword_9_3_1_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_9_3_1__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9_3_1__1"
    // InternalAle.g:7921:1: rule__AtomicLiteral__Group_9_3_1__1 : rule__AtomicLiteral__Group_9_3_1__1__Impl ;
    public final void rule__AtomicLiteral__Group_9_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7925:1: ( rule__AtomicLiteral__Group_9_3_1__1__Impl )
            // InternalAle.g:7926:2: rule__AtomicLiteral__Group_9_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9_3_1__1__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_9_3_1__1"


    // $ANTLR start "rule__AtomicLiteral__Group_9_3_1__1__Impl"
    // InternalAle.g:7932:1: rule__AtomicLiteral__Group_9_3_1__1__Impl : ( ( rule__AtomicLiteral__ExpressionsAssignment_9_3_1_1 ) ) ;
    public final void rule__AtomicLiteral__Group_9_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7936:1: ( ( ( rule__AtomicLiteral__ExpressionsAssignment_9_3_1_1 ) ) )
            // InternalAle.g:7937:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_9_3_1_1 ) )
            {
            // InternalAle.g:7937:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_9_3_1_1 ) )
            // InternalAle.g:7938:2: ( rule__AtomicLiteral__ExpressionsAssignment_9_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_9_3_1_1()); 
            }
            // InternalAle.g:7939:2: ( rule__AtomicLiteral__ExpressionsAssignment_9_3_1_1 )
            // InternalAle.g:7939:3: rule__AtomicLiteral__ExpressionsAssignment_9_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ExpressionsAssignment_9_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_9_3_1_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_9_3_1__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10__0"
    // InternalAle.g:7948:1: rule__AtomicLiteral__Group_10__0 : rule__AtomicLiteral__Group_10__0__Impl rule__AtomicLiteral__Group_10__1 ;
    public final void rule__AtomicLiteral__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7952:1: ( rule__AtomicLiteral__Group_10__0__Impl rule__AtomicLiteral__Group_10__1 )
            // InternalAle.g:7953:2: rule__AtomicLiteral__Group_10__0__Impl rule__AtomicLiteral__Group_10__1
            {
            pushFollow(FOLLOW_78);
            rule__AtomicLiteral__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_10__0"


    // $ANTLR start "rule__AtomicLiteral__Group_10__0__Impl"
    // InternalAle.g:7960:1: rule__AtomicLiteral__Group_10__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7964:1: ( ( () ) )
            // InternalAle.g:7965:1: ( () )
            {
            // InternalAle.g:7965:1: ( () )
            // InternalAle.g:7966:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getOrderedSetDeclAction_10_0()); 
            }
            // InternalAle.g:7967:2: ()
            // InternalAle.g:7967:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getOrderedSetDeclAction_10_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10__1"
    // InternalAle.g:7975:1: rule__AtomicLiteral__Group_10__1 : rule__AtomicLiteral__Group_10__1__Impl rule__AtomicLiteral__Group_10__2 ;
    public final void rule__AtomicLiteral__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7979:1: ( rule__AtomicLiteral__Group_10__1__Impl rule__AtomicLiteral__Group_10__2 )
            // InternalAle.g:7980:2: rule__AtomicLiteral__Group_10__1__Impl rule__AtomicLiteral__Group_10__2
            {
            pushFollow(FOLLOW_22);
            rule__AtomicLiteral__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10__2();

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
    // $ANTLR end "rule__AtomicLiteral__Group_10__1"


    // $ANTLR start "rule__AtomicLiteral__Group_10__1__Impl"
    // InternalAle.g:7987:1: rule__AtomicLiteral__Group_10__1__Impl : ( 'OrderedSet' ) ;
    public final void rule__AtomicLiteral__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7991:1: ( ( 'OrderedSet' ) )
            // InternalAle.g:7992:1: ( 'OrderedSet' )
            {
            // InternalAle.g:7992:1: ( 'OrderedSet' )
            // InternalAle.g:7993:2: 'OrderedSet'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getOrderedSetKeyword_10_1()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getOrderedSetKeyword_10_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_10__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10__2"
    // InternalAle.g:8002:1: rule__AtomicLiteral__Group_10__2 : rule__AtomicLiteral__Group_10__2__Impl rule__AtomicLiteral__Group_10__3 ;
    public final void rule__AtomicLiteral__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8006:1: ( rule__AtomicLiteral__Group_10__2__Impl rule__AtomicLiteral__Group_10__3 )
            // InternalAle.g:8007:2: rule__AtomicLiteral__Group_10__2__Impl rule__AtomicLiteral__Group_10__3
            {
            pushFollow(FOLLOW_77);
            rule__AtomicLiteral__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10__3();

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
    // $ANTLR end "rule__AtomicLiteral__Group_10__2"


    // $ANTLR start "rule__AtomicLiteral__Group_10__2__Impl"
    // InternalAle.g:8014:1: rule__AtomicLiteral__Group_10__2__Impl : ( '{' ) ;
    public final void rule__AtomicLiteral__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8018:1: ( ( '{' ) )
            // InternalAle.g:8019:1: ( '{' )
            {
            // InternalAle.g:8019:1: ( '{' )
            // InternalAle.g:8020:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_10_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_10_2()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_10__2__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10__3"
    // InternalAle.g:8029:1: rule__AtomicLiteral__Group_10__3 : rule__AtomicLiteral__Group_10__3__Impl rule__AtomicLiteral__Group_10__4 ;
    public final void rule__AtomicLiteral__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8033:1: ( rule__AtomicLiteral__Group_10__3__Impl rule__AtomicLiteral__Group_10__4 )
            // InternalAle.g:8034:2: rule__AtomicLiteral__Group_10__3__Impl rule__AtomicLiteral__Group_10__4
            {
            pushFollow(FOLLOW_77);
            rule__AtomicLiteral__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10__4();

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
    // $ANTLR end "rule__AtomicLiteral__Group_10__3"


    // $ANTLR start "rule__AtomicLiteral__Group_10__3__Impl"
    // InternalAle.g:8041:1: rule__AtomicLiteral__Group_10__3__Impl : ( ( rule__AtomicLiteral__Group_10_3__0 )? ) ;
    public final void rule__AtomicLiteral__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8045:1: ( ( ( rule__AtomicLiteral__Group_10_3__0 )? ) )
            // InternalAle.g:8046:1: ( ( rule__AtomicLiteral__Group_10_3__0 )? )
            {
            // InternalAle.g:8046:1: ( ( rule__AtomicLiteral__Group_10_3__0 )? )
            // InternalAle.g:8047:2: ( rule__AtomicLiteral__Group_10_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getGroup_10_3()); 
            }
            // InternalAle.g:8048:2: ( rule__AtomicLiteral__Group_10_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_BOOLEAN)||LA46_0==36||(LA46_0>=59 && LA46_0<=61)||(LA46_0>=65 && LA46_0<=67)||(LA46_0>=69 && LA46_0<=70)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAle.g:8048:3: rule__AtomicLiteral__Group_10_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_10_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getGroup_10_3()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_10__3__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10__4"
    // InternalAle.g:8056:1: rule__AtomicLiteral__Group_10__4 : rule__AtomicLiteral__Group_10__4__Impl ;
    public final void rule__AtomicLiteral__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8060:1: ( rule__AtomicLiteral__Group_10__4__Impl )
            // InternalAle.g:8061:2: rule__AtomicLiteral__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10__4__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_10__4"


    // $ANTLR start "rule__AtomicLiteral__Group_10__4__Impl"
    // InternalAle.g:8067:1: rule__AtomicLiteral__Group_10__4__Impl : ( '}' ) ;
    public final void rule__AtomicLiteral__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8071:1: ( ( '}' ) )
            // InternalAle.g:8072:1: ( '}' )
            {
            // InternalAle.g:8072:1: ( '}' )
            // InternalAle.g:8073:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_10_4()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_10_4()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_10__4__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3__0"
    // InternalAle.g:8083:1: rule__AtomicLiteral__Group_10_3__0 : rule__AtomicLiteral__Group_10_3__0__Impl rule__AtomicLiteral__Group_10_3__1 ;
    public final void rule__AtomicLiteral__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8087:1: ( rule__AtomicLiteral__Group_10_3__0__Impl rule__AtomicLiteral__Group_10_3__1 )
            // InternalAle.g:8088:2: rule__AtomicLiteral__Group_10_3__0__Impl rule__AtomicLiteral__Group_10_3__1
            {
            pushFollow(FOLLOW_12);
            rule__AtomicLiteral__Group_10_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10_3__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_10_3__0"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3__0__Impl"
    // InternalAle.g:8095:1: rule__AtomicLiteral__Group_10_3__0__Impl : ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_0 ) ) ;
    public final void rule__AtomicLiteral__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8099:1: ( ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_0 ) ) )
            // InternalAle.g:8100:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_0 ) )
            {
            // InternalAle.g:8100:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_0 ) )
            // InternalAle.g:8101:2: ( rule__AtomicLiteral__ExpressionsAssignment_10_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_10_3_0()); 
            }
            // InternalAle.g:8102:2: ( rule__AtomicLiteral__ExpressionsAssignment_10_3_0 )
            // InternalAle.g:8102:3: rule__AtomicLiteral__ExpressionsAssignment_10_3_0
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ExpressionsAssignment_10_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_10_3_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_10_3__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3__1"
    // InternalAle.g:8110:1: rule__AtomicLiteral__Group_10_3__1 : rule__AtomicLiteral__Group_10_3__1__Impl ;
    public final void rule__AtomicLiteral__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8114:1: ( rule__AtomicLiteral__Group_10_3__1__Impl )
            // InternalAle.g:8115:2: rule__AtomicLiteral__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_10_3__1"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3__1__Impl"
    // InternalAle.g:8121:1: rule__AtomicLiteral__Group_10_3__1__Impl : ( ( rule__AtomicLiteral__Group_10_3_1__0 )* ) ;
    public final void rule__AtomicLiteral__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8125:1: ( ( ( rule__AtomicLiteral__Group_10_3_1__0 )* ) )
            // InternalAle.g:8126:1: ( ( rule__AtomicLiteral__Group_10_3_1__0 )* )
            {
            // InternalAle.g:8126:1: ( ( rule__AtomicLiteral__Group_10_3_1__0 )* )
            // InternalAle.g:8127:2: ( rule__AtomicLiteral__Group_10_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getGroup_10_3_1()); 
            }
            // InternalAle.g:8128:2: ( rule__AtomicLiteral__Group_10_3_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==32) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalAle.g:8128:3: rule__AtomicLiteral__Group_10_3_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AtomicLiteral__Group_10_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getGroup_10_3_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_10_3__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3_1__0"
    // InternalAle.g:8137:1: rule__AtomicLiteral__Group_10_3_1__0 : rule__AtomicLiteral__Group_10_3_1__0__Impl rule__AtomicLiteral__Group_10_3_1__1 ;
    public final void rule__AtomicLiteral__Group_10_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8141:1: ( rule__AtomicLiteral__Group_10_3_1__0__Impl rule__AtomicLiteral__Group_10_3_1__1 )
            // InternalAle.g:8142:2: rule__AtomicLiteral__Group_10_3_1__0__Impl rule__AtomicLiteral__Group_10_3_1__1
            {
            pushFollow(FOLLOW_27);
            rule__AtomicLiteral__Group_10_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10_3_1__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_10_3_1__0"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3_1__0__Impl"
    // InternalAle.g:8149:1: rule__AtomicLiteral__Group_10_3_1__0__Impl : ( ',' ) ;
    public final void rule__AtomicLiteral__Group_10_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8153:1: ( ( ',' ) )
            // InternalAle.g:8154:1: ( ',' )
            {
            // InternalAle.g:8154:1: ( ',' )
            // InternalAle.g:8155:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getCommaKeyword_10_3_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getCommaKeyword_10_3_1_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_10_3_1__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3_1__1"
    // InternalAle.g:8164:1: rule__AtomicLiteral__Group_10_3_1__1 : rule__AtomicLiteral__Group_10_3_1__1__Impl ;
    public final void rule__AtomicLiteral__Group_10_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8168:1: ( rule__AtomicLiteral__Group_10_3_1__1__Impl )
            // InternalAle.g:8169:2: rule__AtomicLiteral__Group_10_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10_3_1__1__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_10_3_1__1"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3_1__1__Impl"
    // InternalAle.g:8175:1: rule__AtomicLiteral__Group_10_3_1__1__Impl : ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 ) ) ;
    public final void rule__AtomicLiteral__Group_10_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8179:1: ( ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 ) ) )
            // InternalAle.g:8180:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 ) )
            {
            // InternalAle.g:8180:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 ) )
            // InternalAle.g:8181:2: ( rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_10_3_1_1()); 
            }
            // InternalAle.g:8182:2: ( rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 )
            // InternalAle.g:8182:3: rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_10_3_1_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_10_3_1__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_11__0"
    // InternalAle.g:8191:1: rule__AtomicLiteral__Group_11__0 : rule__AtomicLiteral__Group_11__0__Impl rule__AtomicLiteral__Group_11__1 ;
    public final void rule__AtomicLiteral__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8195:1: ( rule__AtomicLiteral__Group_11__0__Impl rule__AtomicLiteral__Group_11__1 )
            // InternalAle.g:8196:2: rule__AtomicLiteral__Group_11__0__Impl rule__AtomicLiteral__Group_11__1
            {
            pushFollow(FOLLOW_27);
            rule__AtomicLiteral__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_11__1();

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
    // $ANTLR end "rule__AtomicLiteral__Group_11__0"


    // $ANTLR start "rule__AtomicLiteral__Group_11__0__Impl"
    // InternalAle.g:8203:1: rule__AtomicLiteral__Group_11__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8207:1: ( ( () ) )
            // InternalAle.g:8208:1: ( () )
            {
            // InternalAle.g:8208:1: ( () )
            // InternalAle.g:8209:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getVarRefAction_11_0()); 
            }
            // InternalAle.g:8210:2: ()
            // InternalAle.g:8210:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getVarRefAction_11_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_11__1"
    // InternalAle.g:8218:1: rule__AtomicLiteral__Group_11__1 : rule__AtomicLiteral__Group_11__1__Impl ;
    public final void rule__AtomicLiteral__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8222:1: ( rule__AtomicLiteral__Group_11__1__Impl )
            // InternalAle.g:8223:2: rule__AtomicLiteral__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_11__1__Impl();

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
    // $ANTLR end "rule__AtomicLiteral__Group_11__1"


    // $ANTLR start "rule__AtomicLiteral__Group_11__1__Impl"
    // InternalAle.g:8229:1: rule__AtomicLiteral__Group_11__1__Impl : ( ( rule__AtomicLiteral__ValueAssignment_11_1 ) ) ;
    public final void rule__AtomicLiteral__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8233:1: ( ( ( rule__AtomicLiteral__ValueAssignment_11_1 ) ) )
            // InternalAle.g:8234:1: ( ( rule__AtomicLiteral__ValueAssignment_11_1 ) )
            {
            // InternalAle.g:8234:1: ( ( rule__AtomicLiteral__ValueAssignment_11_1 ) )
            // InternalAle.g:8235:2: ( rule__AtomicLiteral__ValueAssignment_11_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueAssignment_11_1()); 
            }
            // InternalAle.g:8236:2: ( rule__AtomicLiteral__ValueAssignment_11_1 )
            // InternalAle.g:8236:3: rule__AtomicLiteral__ValueAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ValueAssignment_11_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueAssignment_11_1()); 
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
    // $ANTLR end "rule__AtomicLiteral__Group_11__1__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // InternalAle.g:8245:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8249:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalAle.g:8250:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Param__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Param__Group__1();

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
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // InternalAle.g:8257:1: rule__Param__Group__0__Impl : ( ( rule__Param__TypeAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8261:1: ( ( ( rule__Param__TypeAssignment_0 ) ) )
            // InternalAle.g:8262:1: ( ( rule__Param__TypeAssignment_0 ) )
            {
            // InternalAle.g:8262:1: ( ( rule__Param__TypeAssignment_0 ) )
            // InternalAle.g:8263:2: ( rule__Param__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getTypeAssignment_0()); 
            }
            // InternalAle.g:8264:2: ( rule__Param__TypeAssignment_0 )
            // InternalAle.g:8264:3: rule__Param__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Param__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // InternalAle.g:8272:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8276:1: ( rule__Param__Group__1__Impl )
            // InternalAle.g:8277:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__1__Impl();

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
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // InternalAle.g:8283:1: rule__Param__Group__1__Impl : ( ( rule__Param__NameAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8287:1: ( ( ( rule__Param__NameAssignment_1 ) ) )
            // InternalAle.g:8288:1: ( ( rule__Param__NameAssignment_1 ) )
            {
            // InternalAle.g:8288:1: ( ( rule__Param__NameAssignment_1 ) )
            // InternalAle.g:8289:2: ( rule__Param__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameAssignment_1()); 
            }
            // InternalAle.g:8290:2: ( rule__Param__NameAssignment_1 )
            // InternalAle.g:8290:3: rule__Param__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Param__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalAle.g:8299:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8303:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalAle.g:8304:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

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
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalAle.g:8311:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8315:1: ( ( () ) )
            // InternalAle.g:8316:1: ( () )
            {
            // InternalAle.g:8316:1: ( () )
            // InternalAle.g:8317:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getOutOfScopeTypeAction_1_0()); 
            }
            // InternalAle.g:8318:2: ()
            // InternalAle.g:8318:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getOutOfScopeTypeAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalAle.g:8326:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8330:1: ( rule__Type__Group_1__1__Impl )
            // InternalAle.g:8331:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

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
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalAle.g:8337:1: rule__Type__Group_1__1__Impl : ( ( rule__Type__ExternalClassAssignment_1_1 ) ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8341:1: ( ( ( rule__Type__ExternalClassAssignment_1_1 ) ) )
            // InternalAle.g:8342:1: ( ( rule__Type__ExternalClassAssignment_1_1 ) )
            {
            // InternalAle.g:8342:1: ( ( rule__Type__ExternalClassAssignment_1_1 ) )
            // InternalAle.g:8343:2: ( rule__Type__ExternalClassAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getExternalClassAssignment_1_1()); 
            }
            // InternalAle.g:8344:2: ( rule__Type__ExternalClassAssignment_1_1 )
            // InternalAle.g:8344:3: rule__Type__ExternalClassAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__ExternalClassAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getExternalClassAssignment_1_1()); 
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
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalAle.g:8353:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8357:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalAle.g:8358:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_76);
            rule__Type__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

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
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalAle.g:8365:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8369:1: ( ( () ) )
            // InternalAle.g:8370:1: ( () )
            {
            // InternalAle.g:8370:1: ( () )
            // InternalAle.g:8371:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSequenceTypeAction_2_0()); 
            }
            // InternalAle.g:8372:2: ()
            // InternalAle.g:8372:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSequenceTypeAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalAle.g:8380:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8384:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalAle.g:8385:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
            {
            pushFollow(FOLLOW_21);
            rule__Type__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2();

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
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalAle.g:8392:1: rule__Type__Group_2__1__Impl : ( 'Sequence' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8396:1: ( ( 'Sequence' ) )
            // InternalAle.g:8397:1: ( 'Sequence' )
            {
            // InternalAle.g:8397:1: ( 'Sequence' )
            // InternalAle.g:8398:2: 'Sequence'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSequenceKeyword_2_1()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSequenceKeyword_2_1()); 
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
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_2__2"
    // InternalAle.g:8407:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl rule__Type__Group_2__3 ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8411:1: ( rule__Type__Group_2__2__Impl rule__Type__Group_2__3 )
            // InternalAle.g:8412:2: rule__Type__Group_2__2__Impl rule__Type__Group_2__3
            {
            pushFollow(FOLLOW_24);
            rule__Type__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__3();

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
    // $ANTLR end "rule__Type__Group_2__2"


    // $ANTLR start "rule__Type__Group_2__2__Impl"
    // InternalAle.g:8419:1: rule__Type__Group_2__2__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8423:1: ( ( '(' ) )
            // InternalAle.g:8424:1: ( '(' )
            {
            // InternalAle.g:8424:1: ( '(' )
            // InternalAle.g:8425:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2()); 
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
    // $ANTLR end "rule__Type__Group_2__2__Impl"


    // $ANTLR start "rule__Type__Group_2__3"
    // InternalAle.g:8434:1: rule__Type__Group_2__3 : rule__Type__Group_2__3__Impl rule__Type__Group_2__4 ;
    public final void rule__Type__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8438:1: ( rule__Type__Group_2__3__Impl rule__Type__Group_2__4 )
            // InternalAle.g:8439:2: rule__Type__Group_2__3__Impl rule__Type__Group_2__4
            {
            pushFollow(FOLLOW_32);
            rule__Type__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__4();

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
    // $ANTLR end "rule__Type__Group_2__3"


    // $ANTLR start "rule__Type__Group_2__3__Impl"
    // InternalAle.g:8446:1: rule__Type__Group_2__3__Impl : ( ( rule__Type__SubTypeAssignment_2_3 ) ) ;
    public final void rule__Type__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8450:1: ( ( ( rule__Type__SubTypeAssignment_2_3 ) ) )
            // InternalAle.g:8451:1: ( ( rule__Type__SubTypeAssignment_2_3 ) )
            {
            // InternalAle.g:8451:1: ( ( rule__Type__SubTypeAssignment_2_3 ) )
            // InternalAle.g:8452:2: ( rule__Type__SubTypeAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubTypeAssignment_2_3()); 
            }
            // InternalAle.g:8453:2: ( rule__Type__SubTypeAssignment_2_3 )
            // InternalAle.g:8453:3: rule__Type__SubTypeAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__SubTypeAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSubTypeAssignment_2_3()); 
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
    // $ANTLR end "rule__Type__Group_2__3__Impl"


    // $ANTLR start "rule__Type__Group_2__4"
    // InternalAle.g:8461:1: rule__Type__Group_2__4 : rule__Type__Group_2__4__Impl ;
    public final void rule__Type__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8465:1: ( rule__Type__Group_2__4__Impl )
            // InternalAle.g:8466:2: rule__Type__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__4__Impl();

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
    // $ANTLR end "rule__Type__Group_2__4"


    // $ANTLR start "rule__Type__Group_2__4__Impl"
    // InternalAle.g:8472:1: rule__Type__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8476:1: ( ( ')' ) )
            // InternalAle.g:8477:1: ( ')' )
            {
            // InternalAle.g:8477:1: ( ')' )
            // InternalAle.g:8478:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_4()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_4()); 
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
    // $ANTLR end "rule__Type__Group_2__4__Impl"


    // $ANTLR start "rule__Type__Group_3__0"
    // InternalAle.g:8488:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8492:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // InternalAle.g:8493:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Type__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__1();

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
    // $ANTLR end "rule__Type__Group_3__0"


    // $ANTLR start "rule__Type__Group_3__0__Impl"
    // InternalAle.g:8500:1: rule__Type__Group_3__0__Impl : ( () ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8504:1: ( ( () ) )
            // InternalAle.g:8505:1: ( () )
            {
            // InternalAle.g:8505:1: ( () )
            // InternalAle.g:8506:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getOrderedSetTypeAction_3_0()); 
            }
            // InternalAle.g:8507:2: ()
            // InternalAle.g:8507:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getOrderedSetTypeAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0__Impl"


    // $ANTLR start "rule__Type__Group_3__1"
    // InternalAle.g:8515:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl rule__Type__Group_3__2 ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8519:1: ( rule__Type__Group_3__1__Impl rule__Type__Group_3__2 )
            // InternalAle.g:8520:2: rule__Type__Group_3__1__Impl rule__Type__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__Type__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__2();

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
    // $ANTLR end "rule__Type__Group_3__1"


    // $ANTLR start "rule__Type__Group_3__1__Impl"
    // InternalAle.g:8527:1: rule__Type__Group_3__1__Impl : ( 'OrderedSet' ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8531:1: ( ( 'OrderedSet' ) )
            // InternalAle.g:8532:1: ( 'OrderedSet' )
            {
            // InternalAle.g:8532:1: ( 'OrderedSet' )
            // InternalAle.g:8533:2: 'OrderedSet'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getOrderedSetKeyword_3_1()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getOrderedSetKeyword_3_1()); 
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
    // $ANTLR end "rule__Type__Group_3__1__Impl"


    // $ANTLR start "rule__Type__Group_3__2"
    // InternalAle.g:8542:1: rule__Type__Group_3__2 : rule__Type__Group_3__2__Impl rule__Type__Group_3__3 ;
    public final void rule__Type__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8546:1: ( rule__Type__Group_3__2__Impl rule__Type__Group_3__3 )
            // InternalAle.g:8547:2: rule__Type__Group_3__2__Impl rule__Type__Group_3__3
            {
            pushFollow(FOLLOW_24);
            rule__Type__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__3();

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
    // $ANTLR end "rule__Type__Group_3__2"


    // $ANTLR start "rule__Type__Group_3__2__Impl"
    // InternalAle.g:8554:1: rule__Type__Group_3__2__Impl : ( '(' ) ;
    public final void rule__Type__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8558:1: ( ( '(' ) )
            // InternalAle.g:8559:1: ( '(' )
            {
            // InternalAle.g:8559:1: ( '(' )
            // InternalAle.g:8560:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_3_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_3_2()); 
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
    // $ANTLR end "rule__Type__Group_3__2__Impl"


    // $ANTLR start "rule__Type__Group_3__3"
    // InternalAle.g:8569:1: rule__Type__Group_3__3 : rule__Type__Group_3__3__Impl rule__Type__Group_3__4 ;
    public final void rule__Type__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8573:1: ( rule__Type__Group_3__3__Impl rule__Type__Group_3__4 )
            // InternalAle.g:8574:2: rule__Type__Group_3__3__Impl rule__Type__Group_3__4
            {
            pushFollow(FOLLOW_32);
            rule__Type__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__4();

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
    // $ANTLR end "rule__Type__Group_3__3"


    // $ANTLR start "rule__Type__Group_3__3__Impl"
    // InternalAle.g:8581:1: rule__Type__Group_3__3__Impl : ( ( rule__Type__SubTypeAssignment_3_3 ) ) ;
    public final void rule__Type__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8585:1: ( ( ( rule__Type__SubTypeAssignment_3_3 ) ) )
            // InternalAle.g:8586:1: ( ( rule__Type__SubTypeAssignment_3_3 ) )
            {
            // InternalAle.g:8586:1: ( ( rule__Type__SubTypeAssignment_3_3 ) )
            // InternalAle.g:8587:2: ( rule__Type__SubTypeAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubTypeAssignment_3_3()); 
            }
            // InternalAle.g:8588:2: ( rule__Type__SubTypeAssignment_3_3 )
            // InternalAle.g:8588:3: rule__Type__SubTypeAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__SubTypeAssignment_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSubTypeAssignment_3_3()); 
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
    // $ANTLR end "rule__Type__Group_3__3__Impl"


    // $ANTLR start "rule__Type__Group_3__4"
    // InternalAle.g:8596:1: rule__Type__Group_3__4 : rule__Type__Group_3__4__Impl ;
    public final void rule__Type__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8600:1: ( rule__Type__Group_3__4__Impl )
            // InternalAle.g:8601:2: rule__Type__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__4__Impl();

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
    // $ANTLR end "rule__Type__Group_3__4"


    // $ANTLR start "rule__Type__Group_3__4__Impl"
    // InternalAle.g:8607:1: rule__Type__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Type__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8611:1: ( ( ')' ) )
            // InternalAle.g:8612:1: ( ')' )
            {
            // InternalAle.g:8612:1: ( ')' )
            // InternalAle.g:8613:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_3_4()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_3_4()); 
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
    // $ANTLR end "rule__Type__Group_3__4__Impl"


    // $ANTLR start "rule__Qualified__Group__0"
    // InternalAle.g:8623:1: rule__Qualified__Group__0 : rule__Qualified__Group__0__Impl rule__Qualified__Group__1 ;
    public final void rule__Qualified__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8627:1: ( rule__Qualified__Group__0__Impl rule__Qualified__Group__1 )
            // InternalAle.g:8628:2: rule__Qualified__Group__0__Impl rule__Qualified__Group__1
            {
            pushFollow(FOLLOW_65);
            rule__Qualified__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qualified__Group__1();

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
    // $ANTLR end "rule__Qualified__Group__0"


    // $ANTLR start "rule__Qualified__Group__0__Impl"
    // InternalAle.g:8635:1: rule__Qualified__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Qualified__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8639:1: ( ( RULE_ID ) )
            // InternalAle.g:8640:1: ( RULE_ID )
            {
            // InternalAle.g:8640:1: ( RULE_ID )
            // InternalAle.g:8641:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Qualified__Group__0__Impl"


    // $ANTLR start "rule__Qualified__Group__1"
    // InternalAle.g:8650:1: rule__Qualified__Group__1 : rule__Qualified__Group__1__Impl ;
    public final void rule__Qualified__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8654:1: ( rule__Qualified__Group__1__Impl )
            // InternalAle.g:8655:2: rule__Qualified__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualified__Group__1__Impl();

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
    // $ANTLR end "rule__Qualified__Group__1"


    // $ANTLR start "rule__Qualified__Group__1__Impl"
    // InternalAle.g:8661:1: rule__Qualified__Group__1__Impl : ( ( rule__Qualified__Group_1__0 )* ) ;
    public final void rule__Qualified__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8665:1: ( ( ( rule__Qualified__Group_1__0 )* ) )
            // InternalAle.g:8666:1: ( ( rule__Qualified__Group_1__0 )* )
            {
            // InternalAle.g:8666:1: ( ( rule__Qualified__Group_1__0 )* )
            // InternalAle.g:8667:2: ( rule__Qualified__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getGroup_1()); 
            }
            // InternalAle.g:8668:2: ( rule__Qualified__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==62) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAle.g:8668:3: rule__Qualified__Group_1__0
            	    {
            	    pushFollow(FOLLOW_79);
            	    rule__Qualified__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Qualified__Group__1__Impl"


    // $ANTLR start "rule__Qualified__Group_1__0"
    // InternalAle.g:8677:1: rule__Qualified__Group_1__0 : rule__Qualified__Group_1__0__Impl rule__Qualified__Group_1__1 ;
    public final void rule__Qualified__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8681:1: ( rule__Qualified__Group_1__0__Impl rule__Qualified__Group_1__1 )
            // InternalAle.g:8682:2: rule__Qualified__Group_1__0__Impl rule__Qualified__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Qualified__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qualified__Group_1__1();

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
    // $ANTLR end "rule__Qualified__Group_1__0"


    // $ANTLR start "rule__Qualified__Group_1__0__Impl"
    // InternalAle.g:8689:1: rule__Qualified__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Qualified__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8693:1: ( ( '.' ) )
            // InternalAle.g:8694:1: ( '.' )
            {
            // InternalAle.g:8694:1: ( '.' )
            // InternalAle.g:8695:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getFullStopKeyword_1_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__Qualified__Group_1__0__Impl"


    // $ANTLR start "rule__Qualified__Group_1__1"
    // InternalAle.g:8704:1: rule__Qualified__Group_1__1 : rule__Qualified__Group_1__1__Impl ;
    public final void rule__Qualified__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8708:1: ( rule__Qualified__Group_1__1__Impl )
            // InternalAle.g:8709:2: rule__Qualified__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualified__Group_1__1__Impl();

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
    // $ANTLR end "rule__Qualified__Group_1__1"


    // $ANTLR start "rule__Qualified__Group_1__1__Impl"
    // InternalAle.g:8715:1: rule__Qualified__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Qualified__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8719:1: ( ( RULE_ID ) )
            // InternalAle.g:8720:1: ( RULE_ID )
            {
            // InternalAle.g:8720:1: ( RULE_ID )
            // InternalAle.g:8721:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__Qualified__Group_1__1__Impl"


    // $ANTLR start "rule__Root__NameAssignment_1"
    // InternalAle.g:8731:1: rule__Root__NameAssignment_1 : ( ruleQualified ) ;
    public final void rule__Root__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8735:1: ( ( ruleQualified ) )
            // InternalAle.g:8736:2: ( ruleQualified )
            {
            // InternalAle.g:8736:2: ( ruleQualified )
            // InternalAle.g:8737:3: ruleQualified
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getNameQualifiedParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getNameQualifiedParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Root__NameAssignment_1"


    // $ANTLR start "rule__Root__ImportsAssignment_3"
    // InternalAle.g:8746:1: rule__Root__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Root__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8750:1: ( ( ruleImport ) )
            // InternalAle.g:8751:2: ( ruleImport )
            {
            // InternalAle.g:8751:2: ( ruleImport )
            // InternalAle.g:8752:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getImportsImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getImportsImportParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Root__ImportsAssignment_3"


    // $ANTLR start "rule__Root__ClassesAssignment_4"
    // InternalAle.g:8761:1: rule__Root__ClassesAssignment_4 : ( ruleClass ) ;
    public final void rule__Root__ClassesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8765:1: ( ( ruleClass ) )
            // InternalAle.g:8766:2: ( ruleClass )
            {
            // InternalAle.g:8766:2: ( ruleClass )
            // InternalAle.g:8767:3: ruleClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getClassesClassParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getClassesClassParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Root__ClassesAssignment_4"


    // $ANTLR start "rule__Import__RefAssignment_1"
    // InternalAle.g:8776:1: rule__Import__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Import__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8780:1: ( ( ( RULE_ID ) ) )
            // InternalAle.g:8781:2: ( ( RULE_ID ) )
            {
            // InternalAle.g:8781:2: ( ( RULE_ID ) )
            // InternalAle.g:8782:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getRefRootCrossReference_1_0()); 
            }
            // InternalAle.g:8783:3: ( RULE_ID )
            // InternalAle.g:8784:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getRefRootIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getRefRootIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getRefRootCrossReference_1_0()); 
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
    // $ANTLR end "rule__Import__RefAssignment_1"


    // $ANTLR start "rule__Import__NameAssignment_3"
    // InternalAle.g:8795:1: rule__Import__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8799:1: ( ( RULE_ID ) )
            // InternalAle.g:8800:2: ( RULE_ID )
            {
            // InternalAle.g:8800:2: ( RULE_ID )
            // InternalAle.g:8801:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Import__NameAssignment_3"


    // $ANTLR start "rule__OpenClass__NameAssignment_3"
    // InternalAle.g:8810:1: rule__OpenClass__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__OpenClass__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8814:1: ( ( RULE_ID ) )
            // InternalAle.g:8815:2: ( RULE_ID )
            {
            // InternalAle.g:8815:2: ( RULE_ID )
            // InternalAle.g:8816:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getNameIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__OpenClass__NameAssignment_3"


    // $ANTLR start "rule__OpenClass__SuperClassAssignment_4_1"
    // InternalAle.g:8825:1: rule__OpenClass__SuperClassAssignment_4_1 : ( ( ruleQualified ) ) ;
    public final void rule__OpenClass__SuperClassAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8829:1: ( ( ( ruleQualified ) ) )
            // InternalAle.g:8830:2: ( ( ruleQualified ) )
            {
            // InternalAle.g:8830:2: ( ( ruleQualified ) )
            // InternalAle.g:8831:3: ( ruleQualified )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getSuperClassClassCrossReference_4_1_0()); 
            }
            // InternalAle.g:8832:3: ( ruleQualified )
            // InternalAle.g:8833:4: ruleQualified
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getSuperClassClassQualifiedParserRuleCall_4_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getSuperClassClassQualifiedParserRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getSuperClassClassCrossReference_4_1_0()); 
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
    // $ANTLR end "rule__OpenClass__SuperClassAssignment_4_1"


    // $ANTLR start "rule__OpenClass__SuperClassAssignment_4_2_1"
    // InternalAle.g:8844:1: rule__OpenClass__SuperClassAssignment_4_2_1 : ( ( ruleQualified ) ) ;
    public final void rule__OpenClass__SuperClassAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8848:1: ( ( ( ruleQualified ) ) )
            // InternalAle.g:8849:2: ( ( ruleQualified ) )
            {
            // InternalAle.g:8849:2: ( ( ruleQualified ) )
            // InternalAle.g:8850:3: ( ruleQualified )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getSuperClassClassCrossReference_4_2_1_0()); 
            }
            // InternalAle.g:8851:3: ( ruleQualified )
            // InternalAle.g:8852:4: ruleQualified
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getSuperClassClassQualifiedParserRuleCall_4_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getSuperClassClassQualifiedParserRuleCall_4_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getSuperClassClassCrossReference_4_2_1_0()); 
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
    // $ANTLR end "rule__OpenClass__SuperClassAssignment_4_2_1"


    // $ANTLR start "rule__OpenClass__FieldsAssignment_5_1"
    // InternalAle.g:8863:1: rule__OpenClass__FieldsAssignment_5_1 : ( ruleField ) ;
    public final void rule__OpenClass__FieldsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8867:1: ( ( ruleField ) )
            // InternalAle.g:8868:2: ( ruleField )
            {
            // InternalAle.g:8868:2: ( ruleField )
            // InternalAle.g:8869:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getFieldsFieldParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getFieldsFieldParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__OpenClass__FieldsAssignment_5_1"


    // $ANTLR start "rule__OpenClass__MethodsAssignment_5_2"
    // InternalAle.g:8878:1: rule__OpenClass__MethodsAssignment_5_2 : ( ruleMethod ) ;
    public final void rule__OpenClass__MethodsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8882:1: ( ( ruleMethod ) )
            // InternalAle.g:8883:2: ( ruleMethod )
            {
            // InternalAle.g:8883:2: ( ruleMethod )
            // InternalAle.g:8884:3: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenClassAccess().getMethodsMethodParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenClassAccess().getMethodsMethodParserRuleCall_5_2_0()); 
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
    // $ANTLR end "rule__OpenClass__MethodsAssignment_5_2"


    // $ANTLR start "rule__NewClass__NameAssignment_2"
    // InternalAle.g:8893:1: rule__NewClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__NewClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8897:1: ( ( RULE_ID ) )
            // InternalAle.g:8898:2: ( RULE_ID )
            {
            // InternalAle.g:8898:2: ( RULE_ID )
            // InternalAle.g:8899:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__NewClass__NameAssignment_2"


    // $ANTLR start "rule__NewClass__SuperClassAssignment_3_1"
    // InternalAle.g:8908:1: rule__NewClass__SuperClassAssignment_3_1 : ( ( ruleQualified ) ) ;
    public final void rule__NewClass__SuperClassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8912:1: ( ( ( ruleQualified ) ) )
            // InternalAle.g:8913:2: ( ( ruleQualified ) )
            {
            // InternalAle.g:8913:2: ( ( ruleQualified ) )
            // InternalAle.g:8914:3: ( ruleQualified )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getSuperClassClassCrossReference_3_1_0()); 
            }
            // InternalAle.g:8915:3: ( ruleQualified )
            // InternalAle.g:8916:4: ruleQualified
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getSuperClassClassQualifiedParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getSuperClassClassQualifiedParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getSuperClassClassCrossReference_3_1_0()); 
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
    // $ANTLR end "rule__NewClass__SuperClassAssignment_3_1"


    // $ANTLR start "rule__NewClass__SuperClassAssignment_3_2_1"
    // InternalAle.g:8927:1: rule__NewClass__SuperClassAssignment_3_2_1 : ( ( ruleQualified ) ) ;
    public final void rule__NewClass__SuperClassAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8931:1: ( ( ( ruleQualified ) ) )
            // InternalAle.g:8932:2: ( ( ruleQualified ) )
            {
            // InternalAle.g:8932:2: ( ( ruleQualified ) )
            // InternalAle.g:8933:3: ( ruleQualified )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getSuperClassClassCrossReference_3_2_1_0()); 
            }
            // InternalAle.g:8934:3: ( ruleQualified )
            // InternalAle.g:8935:4: ruleQualified
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getSuperClassClassQualifiedParserRuleCall_3_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getSuperClassClassQualifiedParserRuleCall_3_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getSuperClassClassCrossReference_3_2_1_0()); 
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
    // $ANTLR end "rule__NewClass__SuperClassAssignment_3_2_1"


    // $ANTLR start "rule__NewClass__FieldsAssignment_4_1"
    // InternalAle.g:8946:1: rule__NewClass__FieldsAssignment_4_1 : ( ruleField ) ;
    public final void rule__NewClass__FieldsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8950:1: ( ( ruleField ) )
            // InternalAle.g:8951:2: ( ruleField )
            {
            // InternalAle.g:8951:2: ( ruleField )
            // InternalAle.g:8952:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getFieldsFieldParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getFieldsFieldParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__NewClass__FieldsAssignment_4_1"


    // $ANTLR start "rule__NewClass__MethodsAssignment_4_2"
    // InternalAle.g:8961:1: rule__NewClass__MethodsAssignment_4_2 : ( ruleMethod ) ;
    public final void rule__NewClass__MethodsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8965:1: ( ( ruleMethod ) )
            // InternalAle.g:8966:2: ( ruleMethod )
            {
            // InternalAle.g:8966:2: ( ruleMethod )
            // InternalAle.g:8967:3: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewClassAccess().getMethodsMethodParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewClassAccess().getMethodsMethodParserRuleCall_4_2_0()); 
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
    // $ANTLR end "rule__NewClass__MethodsAssignment_4_2"


    // $ANTLR start "rule__Field__TypeAssignment_0"
    // InternalAle.g:8976:1: rule__Field__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Field__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8980:1: ( ( ruleType ) )
            // InternalAle.g:8981:2: ( ruleType )
            {
            // InternalAle.g:8981:2: ( ruleType )
            // InternalAle.g:8982:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Field__TypeAssignment_0"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // InternalAle.g:8991:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8995:1: ( ( RULE_ID ) )
            // InternalAle.g:8996:2: ( RULE_ID )
            {
            // InternalAle.g:8996:2: ( RULE_ID )
            // InternalAle.g:8997:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__DefMethod__TagsAssignment_0"
    // InternalAle.g:9006:1: rule__DefMethod__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__DefMethod__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9010:1: ( ( ruleTag ) )
            // InternalAle.g:9011:2: ( ruleTag )
            {
            // InternalAle.g:9011:2: ( ruleTag )
            // InternalAle.g:9012:3: ruleTag
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getTagsTagParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getTagsTagParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__DefMethod__TagsAssignment_0"


    // $ANTLR start "rule__DefMethod__TypeAssignment_2_0"
    // InternalAle.g:9021:1: rule__DefMethod__TypeAssignment_2_0 : ( ruleType ) ;
    public final void rule__DefMethod__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9025:1: ( ( ruleType ) )
            // InternalAle.g:9026:2: ( ruleType )
            {
            // InternalAle.g:9026:2: ( ruleType )
            // InternalAle.g:9027:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getTypeTypeParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getTypeTypeParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__DefMethod__TypeAssignment_2_0"


    // $ANTLR start "rule__DefMethod__NameAssignment_3"
    // InternalAle.g:9036:1: rule__DefMethod__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__DefMethod__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9040:1: ( ( RULE_ID ) )
            // InternalAle.g:9041:2: ( RULE_ID )
            {
            // InternalAle.g:9041:2: ( RULE_ID )
            // InternalAle.g:9042:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getNameIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__DefMethod__NameAssignment_3"


    // $ANTLR start "rule__DefMethod__ParamsAssignment_4_1_0"
    // InternalAle.g:9051:1: rule__DefMethod__ParamsAssignment_4_1_0 : ( ruleParam ) ;
    public final void rule__DefMethod__ParamsAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9055:1: ( ( ruleParam ) )
            // InternalAle.g:9056:2: ( ruleParam )
            {
            // InternalAle.g:9056:2: ( ruleParam )
            // InternalAle.g:9057:3: ruleParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_4_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_4_1_0_0()); 
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
    // $ANTLR end "rule__DefMethod__ParamsAssignment_4_1_0"


    // $ANTLR start "rule__DefMethod__ParamsAssignment_4_1_1_1"
    // InternalAle.g:9066:1: rule__DefMethod__ParamsAssignment_4_1_1_1 : ( ruleParam ) ;
    public final void rule__DefMethod__ParamsAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9070:1: ( ( ruleParam ) )
            // InternalAle.g:9071:2: ( ruleParam )
            {
            // InternalAle.g:9071:2: ( ruleParam )
            // InternalAle.g:9072:3: ruleParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_4_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_4_1_1_1_0()); 
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
    // $ANTLR end "rule__DefMethod__ParamsAssignment_4_1_1_1"


    // $ANTLR start "rule__DefMethod__BlockAssignment_5"
    // InternalAle.g:9081:1: rule__DefMethod__BlockAssignment_5 : ( ruleBlock ) ;
    public final void rule__DefMethod__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9085:1: ( ( ruleBlock ) )
            // InternalAle.g:9086:2: ( ruleBlock )
            {
            // InternalAle.g:9086:2: ( ruleBlock )
            // InternalAle.g:9087:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getBlockBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getBlockBlockParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__DefMethod__BlockAssignment_5"


    // $ANTLR start "rule__OverrideMethod__TagsAssignment_0"
    // InternalAle.g:9096:1: rule__OverrideMethod__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__OverrideMethod__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9100:1: ( ( ruleTag ) )
            // InternalAle.g:9101:2: ( ruleTag )
            {
            // InternalAle.g:9101:2: ( ruleTag )
            // InternalAle.g:9102:3: ruleTag
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getTagsTagParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getTagsTagParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__OverrideMethod__TagsAssignment_0"


    // $ANTLR start "rule__OverrideMethod__TypeAssignment_2"
    // InternalAle.g:9111:1: rule__OverrideMethod__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__OverrideMethod__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9115:1: ( ( ruleType ) )
            // InternalAle.g:9116:2: ( ruleType )
            {
            // InternalAle.g:9116:2: ( ruleType )
            // InternalAle.g:9117:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getTypeTypeParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__OverrideMethod__TypeAssignment_2"


    // $ANTLR start "rule__OverrideMethod__NameAssignment_3"
    // InternalAle.g:9126:1: rule__OverrideMethod__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__OverrideMethod__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9130:1: ( ( RULE_ID ) )
            // InternalAle.g:9131:2: ( RULE_ID )
            {
            // InternalAle.g:9131:2: ( RULE_ID )
            // InternalAle.g:9132:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getNameIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__OverrideMethod__NameAssignment_3"


    // $ANTLR start "rule__OverrideMethod__ParamsAssignment_4_1_0"
    // InternalAle.g:9141:1: rule__OverrideMethod__ParamsAssignment_4_1_0 : ( ruleParam ) ;
    public final void rule__OverrideMethod__ParamsAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9145:1: ( ( ruleParam ) )
            // InternalAle.g:9146:2: ( ruleParam )
            {
            // InternalAle.g:9146:2: ( ruleParam )
            // InternalAle.g:9147:3: ruleParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_4_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_4_1_0_0()); 
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
    // $ANTLR end "rule__OverrideMethod__ParamsAssignment_4_1_0"


    // $ANTLR start "rule__OverrideMethod__ParamsAssignment_4_1_1_1"
    // InternalAle.g:9156:1: rule__OverrideMethod__ParamsAssignment_4_1_1_1 : ( ruleParam ) ;
    public final void rule__OverrideMethod__ParamsAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9160:1: ( ( ruleParam ) )
            // InternalAle.g:9161:2: ( ruleParam )
            {
            // InternalAle.g:9161:2: ( ruleParam )
            // InternalAle.g:9162:3: ruleParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_4_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_4_1_1_1_0()); 
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
    // $ANTLR end "rule__OverrideMethod__ParamsAssignment_4_1_1_1"


    // $ANTLR start "rule__OverrideMethod__BlockAssignment_5"
    // InternalAle.g:9171:1: rule__OverrideMethod__BlockAssignment_5 : ( ruleBlock ) ;
    public final void rule__OverrideMethod__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9175:1: ( ( ruleBlock ) )
            // InternalAle.g:9176:2: ( ruleBlock )
            {
            // InternalAle.g:9176:2: ( ruleBlock )
            // InternalAle.g:9177:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getBlockBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getBlockBlockParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__OverrideMethod__BlockAssignment_5"


    // $ANTLR start "rule__ReturnStatement__ReturnedAssignment_2"
    // InternalAle.g:9186:1: rule__ReturnStatement__ReturnedAssignment_2 : ( ruleExpression ) ;
    public final void rule__ReturnStatement__ReturnedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9190:1: ( ( ruleExpression ) )
            // InternalAle.g:9191:2: ( ruleExpression )
            {
            // InternalAle.g:9191:2: ( ruleExpression )
            // InternalAle.g:9192:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getReturnedExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getReturnedExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ReturnStatement__ReturnedAssignment_2"


    // $ANTLR start "rule__LetStatement__BindingsAssignment_2"
    // InternalAle.g:9201:1: rule__LetStatement__BindingsAssignment_2 : ( ruleVarAssign ) ;
    public final void rule__LetStatement__BindingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9205:1: ( ( ruleVarAssign ) )
            // InternalAle.g:9206:2: ( ruleVarAssign )
            {
            // InternalAle.g:9206:2: ( ruleVarAssign )
            // InternalAle.g:9207:3: ruleVarAssign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__LetStatement__BindingsAssignment_2"


    // $ANTLR start "rule__LetStatement__BindingsAssignment_3_1"
    // InternalAle.g:9216:1: rule__LetStatement__BindingsAssignment_3_1 : ( ruleVarAssign ) ;
    public final void rule__LetStatement__BindingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9220:1: ( ( ruleVarAssign ) )
            // InternalAle.g:9221:2: ( ruleVarAssign )
            {
            // InternalAle.g:9221:2: ( ruleVarAssign )
            // InternalAle.g:9222:3: ruleVarAssign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__LetStatement__BindingsAssignment_3_1"


    // $ANTLR start "rule__LetStatement__BlockAssignment_5"
    // InternalAle.g:9231:1: rule__LetStatement__BlockAssignment_5 : ( ( rule__LetStatement__BlockAlternatives_5_0 ) ) ;
    public final void rule__LetStatement__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9235:1: ( ( ( rule__LetStatement__BlockAlternatives_5_0 ) ) )
            // InternalAle.g:9236:2: ( ( rule__LetStatement__BlockAlternatives_5_0 ) )
            {
            // InternalAle.g:9236:2: ( ( rule__LetStatement__BlockAlternatives_5_0 ) )
            // InternalAle.g:9237:3: ( rule__LetStatement__BlockAlternatives_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getBlockAlternatives_5_0()); 
            }
            // InternalAle.g:9238:3: ( rule__LetStatement__BlockAlternatives_5_0 )
            // InternalAle.g:9238:4: rule__LetStatement__BlockAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__BlockAlternatives_5_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getBlockAlternatives_5_0()); 
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
    // $ANTLR end "rule__LetStatement__BlockAssignment_5"


    // $ANTLR start "rule__IfStatement__ConditionAssignment_3"
    // InternalAle.g:9246:1: rule__IfStatement__ConditionAssignment_3 : ( ruleExpression ) ;
    public final void rule__IfStatement__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9250:1: ( ( ruleExpression ) )
            // InternalAle.g:9251:2: ( ruleExpression )
            {
            // InternalAle.g:9251:2: ( ruleExpression )
            // InternalAle.g:9252:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__IfStatement__ConditionAssignment_3"


    // $ANTLR start "rule__IfStatement__ThenBranchAssignment_5"
    // InternalAle.g:9261:1: rule__IfStatement__ThenBranchAssignment_5 : ( ruleBlock ) ;
    public final void rule__IfStatement__ThenBranchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9265:1: ( ( ruleBlock ) )
            // InternalAle.g:9266:2: ( ruleBlock )
            {
            // InternalAle.g:9266:2: ( ruleBlock )
            // InternalAle.g:9267:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getThenBranchBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getThenBranchBlockParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__IfStatement__ThenBranchAssignment_5"


    // $ANTLR start "rule__IfStatement__ElseBranchAssignment_6_1"
    // InternalAle.g:9276:1: rule__IfStatement__ElseBranchAssignment_6_1 : ( ruleBlock ) ;
    public final void rule__IfStatement__ElseBranchAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9280:1: ( ( ruleBlock ) )
            // InternalAle.g:9281:2: ( ruleBlock )
            {
            // InternalAle.g:9281:2: ( ruleBlock )
            // InternalAle.g:9282:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseBranchBlockParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseBranchBlockParserRuleCall_6_1_0()); 
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
    // $ANTLR end "rule__IfStatement__ElseBranchAssignment_6_1"


    // $ANTLR start "rule__WhileStatement__ConditionAssignment_3"
    // InternalAle.g:9291:1: rule__WhileStatement__ConditionAssignment_3 : ( ruleExpression ) ;
    public final void rule__WhileStatement__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9295:1: ( ( ruleExpression ) )
            // InternalAle.g:9296:2: ( ruleExpression )
            {
            // InternalAle.g:9296:2: ( ruleExpression )
            // InternalAle.g:9297:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__WhileStatement__ConditionAssignment_3"


    // $ANTLR start "rule__WhileStatement__WhileBlockAssignment_5"
    // InternalAle.g:9306:1: rule__WhileStatement__WhileBlockAssignment_5 : ( ruleBlock ) ;
    public final void rule__WhileStatement__WhileBlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9310:1: ( ( ruleBlock ) )
            // InternalAle.g:9311:2: ( ruleBlock )
            {
            // InternalAle.g:9311:2: ( ruleBlock )
            // InternalAle.g:9312:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileBlockBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getWhileBlockBlockParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__WhileStatement__WhileBlockAssignment_5"


    // $ANTLR start "rule__ForLoop__TypeAssignment_3"
    // InternalAle.g:9321:1: rule__ForLoop__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__ForLoop__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9325:1: ( ( ruleType ) )
            // InternalAle.g:9326:2: ( ruleType )
            {
            // InternalAle.g:9326:2: ( ruleType )
            // InternalAle.g:9327:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getTypeTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getTypeTypeParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ForLoop__TypeAssignment_3"


    // $ANTLR start "rule__ForLoop__NameAssignment_4"
    // InternalAle.g:9336:1: rule__ForLoop__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ForLoop__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9340:1: ( ( RULE_ID ) )
            // InternalAle.g:9341:2: ( RULE_ID )
            {
            // InternalAle.g:9341:2: ( RULE_ID )
            // InternalAle.g:9342:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getNameIDTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__ForLoop__NameAssignment_4"


    // $ANTLR start "rule__ForLoop__CollectionAssignment_6"
    // InternalAle.g:9351:1: rule__ForLoop__CollectionAssignment_6 : ( ruleExpression ) ;
    public final void rule__ForLoop__CollectionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9355:1: ( ( ruleExpression ) )
            // InternalAle.g:9356:2: ( ruleExpression )
            {
            // InternalAle.g:9356:2: ( ruleExpression )
            // InternalAle.g:9357:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getCollectionExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getCollectionExpressionParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__ForLoop__CollectionAssignment_6"


    // $ANTLR start "rule__ForLoop__BlockAssignment_8"
    // InternalAle.g:9366:1: rule__ForLoop__BlockAssignment_8 : ( ruleBlock ) ;
    public final void rule__ForLoop__BlockAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9370:1: ( ( ruleBlock ) )
            // InternalAle.g:9371:2: ( ruleBlock )
            {
            // InternalAle.g:9371:2: ( ruleBlock )
            // InternalAle.g:9372:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_8_0()); 
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
    // $ANTLR end "rule__ForLoop__BlockAssignment_8"


    // $ANTLR start "rule__Block__BodyAssignment_2"
    // InternalAle.g:9381:1: rule__Block__BodyAssignment_2 : ( ruleStatement ) ;
    public final void rule__Block__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9385:1: ( ( ruleStatement ) )
            // InternalAle.g:9386:2: ( ruleStatement )
            {
            // InternalAle.g:9386:2: ( ruleStatement )
            // InternalAle.g:9387:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBodyStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBodyStatementParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Block__BodyAssignment_2"


    // $ANTLR start "rule__VarAssign__TypeAssignment_1"
    // InternalAle.g:9396:1: rule__VarAssign__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__VarAssign__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9400:1: ( ( ruleType ) )
            // InternalAle.g:9401:2: ( ruleType )
            {
            // InternalAle.g:9401:2: ( ruleType )
            // InternalAle.g:9402:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getTypeTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__VarAssign__TypeAssignment_1"


    // $ANTLR start "rule__VarAssign__NameAssignment_2"
    // InternalAle.g:9411:1: rule__VarAssign__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VarAssign__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9415:1: ( ( RULE_ID ) )
            // InternalAle.g:9416:2: ( RULE_ID )
            {
            // InternalAle.g:9416:2: ( RULE_ID )
            // InternalAle.g:9417:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__VarAssign__NameAssignment_2"


    // $ANTLR start "rule__VarAssign__ValueAssignment_4"
    // InternalAle.g:9426:1: rule__VarAssign__ValueAssignment_4 : ( ruleExpression ) ;
    public final void rule__VarAssign__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9430:1: ( ( ruleExpression ) )
            // InternalAle.g:9431:2: ( ruleExpression )
            {
            // InternalAle.g:9431:2: ( ruleExpression )
            // InternalAle.g:9432:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getValueExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getValueExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__VarAssign__ValueAssignment_4"


    // $ANTLR start "rule__ImpliesOperation__RightAssignment_1_0_1"
    // InternalAle.g:9441:1: rule__ImpliesOperation__RightAssignment_1_0_1 : ( ruleBooleanOperation ) ;
    public final void rule__ImpliesOperation__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9445:1: ( ( ruleBooleanOperation ) )
            // InternalAle.g:9446:2: ( ruleBooleanOperation )
            {
            // InternalAle.g:9446:2: ( ruleBooleanOperation )
            // InternalAle.g:9447:3: ruleBooleanOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getRightBooleanOperationParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getRightBooleanOperationParserRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__ImpliesOperation__RightAssignment_1_0_1"


    // $ANTLR start "rule__BooleanOperation__RightAssignment_1_0_1"
    // InternalAle.g:9456:1: rule__BooleanOperation__RightAssignment_1_0_1 : ( ruleCompareOperation ) ;
    public final void rule__BooleanOperation__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9460:1: ( ( ruleCompareOperation ) )
            // InternalAle.g:9461:2: ( ruleCompareOperation )
            {
            // InternalAle.g:9461:2: ( ruleCompareOperation )
            // InternalAle.g:9462:3: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getRightCompareOperationParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getRightCompareOperationParserRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__BooleanOperation__RightAssignment_1_0_1"


    // $ANTLR start "rule__CompareOperation__RightAssignment_1_0_1"
    // InternalAle.g:9471:1: rule__CompareOperation__RightAssignment_1_0_1 : ( ruleEqualityOperation ) ;
    public final void rule__CompareOperation__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9475:1: ( ( ruleEqualityOperation ) )
            // InternalAle.g:9476:2: ( ruleEqualityOperation )
            {
            // InternalAle.g:9476:2: ( ruleEqualityOperation )
            // InternalAle.g:9477:3: ruleEqualityOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getRightEqualityOperationParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualityOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getRightEqualityOperationParserRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__CompareOperation__RightAssignment_1_0_1"


    // $ANTLR start "rule__EqualityOperation__OpAssignment_1_0_1"
    // InternalAle.g:9486:1: rule__EqualityOperation__OpAssignment_1_0_1 : ( ( '==' ) ) ;
    public final void rule__EqualityOperation__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9490:1: ( ( ( '==' ) ) )
            // InternalAle.g:9491:2: ( ( '==' ) )
            {
            // InternalAle.g:9491:2: ( ( '==' ) )
            // InternalAle.g:9492:3: ( '==' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0()); 
            }
            // InternalAle.g:9493:3: ( '==' )
            // InternalAle.g:9494:4: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0()); 
            }
            match(input,71,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0()); 
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
    // $ANTLR end "rule__EqualityOperation__OpAssignment_1_0_1"


    // $ANTLR start "rule__EqualityOperation__RightAssignment_1_0_2"
    // InternalAle.g:9505:1: rule__EqualityOperation__RightAssignment_1_0_2 : ( ruleMultOperation ) ;
    public final void rule__EqualityOperation__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9509:1: ( ( ruleMultOperation ) )
            // InternalAle.g:9510:2: ( ruleMultOperation )
            {
            // InternalAle.g:9510:2: ( ruleMultOperation )
            // InternalAle.g:9511:3: ruleMultOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getRightMultOperationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getRightMultOperationParserRuleCall_1_0_2_0()); 
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
    // $ANTLR end "rule__EqualityOperation__RightAssignment_1_0_2"


    // $ANTLR start "rule__MultOperation__RightAssignment_1_0_1"
    // InternalAle.g:9520:1: rule__MultOperation__RightAssignment_1_0_1 : ( ruleAddOperation ) ;
    public final void rule__MultOperation__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9524:1: ( ( ruleAddOperation ) )
            // InternalAle.g:9525:2: ( ruleAddOperation )
            {
            // InternalAle.g:9525:2: ( ruleAddOperation )
            // InternalAle.g:9526:3: ruleAddOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getRightAddOperationParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getRightAddOperationParserRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__MultOperation__RightAssignment_1_0_1"


    // $ANTLR start "rule__AddOperation__RightAssignment_1_0_1"
    // InternalAle.g:9535:1: rule__AddOperation__RightAssignment_1_0_1 : ( ruleInfixOperation ) ;
    public final void rule__AddOperation__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9539:1: ( ( ruleInfixOperation ) )
            // InternalAle.g:9540:2: ( ruleInfixOperation )
            {
            // InternalAle.g:9540:2: ( ruleInfixOperation )
            // InternalAle.g:9541:3: ruleInfixOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getRightInfixOperationParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInfixOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getRightInfixOperationParserRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__AddOperation__RightAssignment_1_0_1"


    // $ANTLR start "rule__InfixOperation__ExpressionAssignment_0_2"
    // InternalAle.g:9550:1: rule__InfixOperation__ExpressionAssignment_0_2 : ( ruleExpression ) ;
    public final void rule__InfixOperation__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9554:1: ( ( ruleExpression ) )
            // InternalAle.g:9555:2: ( ruleExpression )
            {
            // InternalAle.g:9555:2: ( ruleExpression )
            // InternalAle.g:9556:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getExpressionExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getExpressionExpressionParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__InfixOperation__ExpressionAssignment_0_2"


    // $ANTLR start "rule__InfixOperation__ExpressionAssignment_1_2"
    // InternalAle.g:9565:1: rule__InfixOperation__ExpressionAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__InfixOperation__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9569:1: ( ( ruleExpression ) )
            // InternalAle.g:9570:2: ( ruleExpression )
            {
            // InternalAle.g:9570:2: ( ruleExpression )
            // InternalAle.g:9571:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getExpressionExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getExpressionExpressionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__InfixOperation__ExpressionAssignment_1_2"


    // $ANTLR start "rule__InfixOperation__NameAssignment_2_2"
    // InternalAle.g:9580:1: rule__InfixOperation__NameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__InfixOperation__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9584:1: ( ( RULE_ID ) )
            // InternalAle.g:9585:2: ( RULE_ID )
            {
            // InternalAle.g:9585:2: ( RULE_ID )
            // InternalAle.g:9586:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__InfixOperation__NameAssignment_2_2"


    // $ANTLR start "rule__InfixOperation__NameAssignment_3_1"
    // InternalAle.g:9595:1: rule__InfixOperation__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__InfixOperation__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9599:1: ( ( RULE_ID ) )
            // InternalAle.g:9600:2: ( RULE_ID )
            {
            // InternalAle.g:9600:2: ( RULE_ID )
            // InternalAle.g:9601:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__InfixOperation__NameAssignment_3_1"


    // $ANTLR start "rule__InfixOperation__ParametersAssignment_3_2_1_0"
    // InternalAle.g:9610:1: rule__InfixOperation__ParametersAssignment_3_2_1_0 : ( ruleParamCall ) ;
    public final void rule__InfixOperation__ParametersAssignment_3_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9614:1: ( ( ruleParamCall ) )
            // InternalAle.g:9615:2: ( ruleParamCall )
            {
            // InternalAle.g:9615:2: ( ruleParamCall )
            // InternalAle.g:9616:3: ruleParamCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_3_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParamCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_3_2_1_0_0()); 
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
    // $ANTLR end "rule__InfixOperation__ParametersAssignment_3_2_1_0"


    // $ANTLR start "rule__InfixOperation__ParametersAssignment_3_2_1_1_1"
    // InternalAle.g:9625:1: rule__InfixOperation__ParametersAssignment_3_2_1_1_1 : ( ruleParamCall ) ;
    public final void rule__InfixOperation__ParametersAssignment_3_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9629:1: ( ( ruleParamCall ) )
            // InternalAle.g:9630:2: ( ruleParamCall )
            {
            // InternalAle.g:9630:2: ( ruleParamCall )
            // InternalAle.g:9631:3: ruleParamCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_3_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParamCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_3_2_1_1_1_0()); 
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
    // $ANTLR end "rule__InfixOperation__ParametersAssignment_3_2_1_1_1"


    // $ANTLR start "rule__InfixOperation__RightAssignment_4_1_0_2"
    // InternalAle.g:9640:1: rule__InfixOperation__RightAssignment_4_1_0_2 : ( ruleExpression ) ;
    public final void rule__InfixOperation__RightAssignment_4_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9644:1: ( ( ruleExpression ) )
            // InternalAle.g:9645:2: ( ruleExpression )
            {
            // InternalAle.g:9645:2: ( ruleExpression )
            // InternalAle.g:9646:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getRightExpressionParserRuleCall_4_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getRightExpressionParserRuleCall_4_1_0_2_0()); 
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
    // $ANTLR end "rule__InfixOperation__RightAssignment_4_1_0_2"


    // $ANTLR start "rule__InfixOperation__RightAssignment_4_1_1_2"
    // InternalAle.g:9655:1: rule__InfixOperation__RightAssignment_4_1_1_2 : ( ruleExpression ) ;
    public final void rule__InfixOperation__RightAssignment_4_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9659:1: ( ( ruleExpression ) )
            // InternalAle.g:9660:2: ( ruleExpression )
            {
            // InternalAle.g:9660:2: ( ruleExpression )
            // InternalAle.g:9661:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getRightExpressionParserRuleCall_4_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getRightExpressionParserRuleCall_4_1_1_2_0()); 
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
    // $ANTLR end "rule__InfixOperation__RightAssignment_4_1_1_2"


    // $ANTLR start "rule__ParamCall__LambdaAssignment_0_0"
    // InternalAle.g:9670:1: rule__ParamCall__LambdaAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ParamCall__LambdaAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9674:1: ( ( RULE_ID ) )
            // InternalAle.g:9675:2: ( RULE_ID )
            {
            // InternalAle.g:9675:2: ( RULE_ID )
            // InternalAle.g:9676:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getLambdaIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getLambdaIDTerminalRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__ParamCall__LambdaAssignment_0_0"


    // $ANTLR start "rule__ParamCall__ExpressionAssignment_1"
    // InternalAle.g:9685:1: rule__ParamCall__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ParamCall__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9689:1: ( ( ruleExpression ) )
            // InternalAle.g:9690:2: ( ruleExpression )
            {
            // InternalAle.g:9690:2: ( ruleExpression )
            // InternalAle.g:9691:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getExpressionExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ParamCall__ExpressionAssignment_1"


    // $ANTLR start "rule__AtomicLiteral__ValueAssignment_3_1"
    // InternalAle.g:9700:1: rule__AtomicLiteral__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__AtomicLiteral__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9704:1: ( ( RULE_STRING ) )
            // InternalAle.g:9705:2: ( RULE_STRING )
            {
            // InternalAle.g:9705:2: ( RULE_STRING )
            // InternalAle.g:9706:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__ValueAssignment_3_1"


    // $ANTLR start "rule__AtomicLiteral__ValueAssignment_4_1"
    // InternalAle.g:9715:1: rule__AtomicLiteral__ValueAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__AtomicLiteral__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9719:1: ( ( RULE_INT ) )
            // InternalAle.g:9720:2: ( RULE_INT )
            {
            // InternalAle.g:9720:2: ( RULE_INT )
            // InternalAle.g:9721:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueINTTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueINTTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__ValueAssignment_4_1"


    // $ANTLR start "rule__AtomicLiteral__ValueAssignment_5_1"
    // InternalAle.g:9730:1: rule__AtomicLiteral__ValueAssignment_5_1 : ( RULE_REAL ) ;
    public final void rule__AtomicLiteral__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9734:1: ( ( RULE_REAL ) )
            // InternalAle.g:9735:2: ( RULE_REAL )
            {
            // InternalAle.g:9735:2: ( RULE_REAL )
            // InternalAle.g:9736:3: RULE_REAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueREALTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_REAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueREALTerminalRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__ValueAssignment_5_1"


    // $ANTLR start "rule__AtomicLiteral__ValueAssignment_6_1"
    // InternalAle.g:9745:1: rule__AtomicLiteral__ValueAssignment_6_1 : ( RULE_BOOLEAN ) ;
    public final void rule__AtomicLiteral__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9749:1: ( ( RULE_BOOLEAN ) )
            // InternalAle.g:9750:2: ( RULE_BOOLEAN )
            {
            // InternalAle.g:9750:2: ( RULE_BOOLEAN )
            // InternalAle.g:9751:3: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueBOOLEANTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueBOOLEANTerminalRuleCall_6_1_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__ValueAssignment_6_1"


    // $ANTLR start "rule__AtomicLiteral__StartAssignment_8_2"
    // InternalAle.g:9760:1: rule__AtomicLiteral__StartAssignment_8_2 : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__StartAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9764:1: ( ( ruleExpression ) )
            // InternalAle.g:9765:2: ( ruleExpression )
            {
            // InternalAle.g:9765:2: ( ruleExpression )
            // InternalAle.g:9766:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getStartExpressionParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getStartExpressionParserRuleCall_8_2_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__StartAssignment_8_2"


    // $ANTLR start "rule__AtomicLiteral__StopAssignment_8_5"
    // InternalAle.g:9775:1: rule__AtomicLiteral__StopAssignment_8_5 : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__StopAssignment_8_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9779:1: ( ( ruleExpression ) )
            // InternalAle.g:9780:2: ( ruleExpression )
            {
            // InternalAle.g:9780:2: ( ruleExpression )
            // InternalAle.g:9781:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getStopExpressionParserRuleCall_8_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getStopExpressionParserRuleCall_8_5_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__StopAssignment_8_5"


    // $ANTLR start "rule__AtomicLiteral__ExpressionsAssignment_9_3_0"
    // InternalAle.g:9790:1: rule__AtomicLiteral__ExpressionsAssignment_9_3_0 : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__ExpressionsAssignment_9_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9794:1: ( ( ruleExpression ) )
            // InternalAle.g:9795:2: ( ruleExpression )
            {
            // InternalAle.g:9795:2: ( ruleExpression )
            // InternalAle.g:9796:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_9_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_9_3_0_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__ExpressionsAssignment_9_3_0"


    // $ANTLR start "rule__AtomicLiteral__ExpressionsAssignment_9_3_1_1"
    // InternalAle.g:9805:1: rule__AtomicLiteral__ExpressionsAssignment_9_3_1_1 : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__ExpressionsAssignment_9_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9809:1: ( ( ruleExpression ) )
            // InternalAle.g:9810:2: ( ruleExpression )
            {
            // InternalAle.g:9810:2: ( ruleExpression )
            // InternalAle.g:9811:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_9_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_9_3_1_1_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__ExpressionsAssignment_9_3_1_1"


    // $ANTLR start "rule__AtomicLiteral__ExpressionsAssignment_10_3_0"
    // InternalAle.g:9820:1: rule__AtomicLiteral__ExpressionsAssignment_10_3_0 : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__ExpressionsAssignment_10_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9824:1: ( ( ruleExpression ) )
            // InternalAle.g:9825:2: ( ruleExpression )
            {
            // InternalAle.g:9825:2: ( ruleExpression )
            // InternalAle.g:9826:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_0_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__ExpressionsAssignment_10_3_0"


    // $ANTLR start "rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1"
    // InternalAle.g:9835:1: rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9839:1: ( ( ruleExpression ) )
            // InternalAle.g:9840:2: ( ruleExpression )
            {
            // InternalAle.g:9840:2: ( ruleExpression )
            // InternalAle.g:9841:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_1_1_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1"


    // $ANTLR start "rule__AtomicLiteral__ValueAssignment_11_1"
    // InternalAle.g:9850:1: rule__AtomicLiteral__ValueAssignment_11_1 : ( RULE_ID ) ;
    public final void rule__AtomicLiteral__ValueAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9854:1: ( ( RULE_ID ) )
            // InternalAle.g:9855:2: ( RULE_ID )
            {
            // InternalAle.g:9855:2: ( RULE_ID )
            // InternalAle.g:9856:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueIDTerminalRuleCall_11_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueIDTerminalRuleCall_11_1_0()); 
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
    // $ANTLR end "rule__AtomicLiteral__ValueAssignment_11_1"


    // $ANTLR start "rule__Param__TypeAssignment_0"
    // InternalAle.g:9865:1: rule__Param__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Param__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9869:1: ( ( ruleType ) )
            // InternalAle.g:9870:2: ( ruleType )
            {
            // InternalAle.g:9870:2: ( ruleType )
            // InternalAle.g:9871:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getTypeTypeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Param__TypeAssignment_0"


    // $ANTLR start "rule__Param__NameAssignment_1"
    // InternalAle.g:9880:1: rule__Param__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9884:1: ( ( RULE_ID ) )
            // InternalAle.g:9885:2: ( RULE_ID )
            {
            // InternalAle.g:9885:2: ( RULE_ID )
            // InternalAle.g:9886:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Param__NameAssignment_1"


    // $ANTLR start "rule__Type__ExternalClassAssignment_1_1"
    // InternalAle.g:9895:1: rule__Type__ExternalClassAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Type__ExternalClassAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9899:1: ( ( RULE_ID ) )
            // InternalAle.g:9900:2: ( RULE_ID )
            {
            // InternalAle.g:9900:2: ( RULE_ID )
            // InternalAle.g:9901:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getExternalClassIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getExternalClassIDTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Type__ExternalClassAssignment_1_1"


    // $ANTLR start "rule__Type__SubTypeAssignment_2_3"
    // InternalAle.g:9910:1: rule__Type__SubTypeAssignment_2_3 : ( ruleType ) ;
    public final void rule__Type__SubTypeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9914:1: ( ( ruleType ) )
            // InternalAle.g:9915:2: ( ruleType )
            {
            // InternalAle.g:9915:2: ( ruleType )
            // InternalAle.g:9916:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_2_3_0()); 
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
    // $ANTLR end "rule__Type__SubTypeAssignment_2_3"


    // $ANTLR start "rule__Type__SubTypeAssignment_3_3"
    // InternalAle.g:9925:1: rule__Type__SubTypeAssignment_3_3 : ( ruleType ) ;
    public final void rule__Type__SubTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9929:1: ( ( ruleType ) )
            // InternalAle.g:9930:2: ( ruleType )
            {
            // InternalAle.g:9930:2: ( ruleType )
            // InternalAle.g:9931:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_3_3_0()); 
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
    // $ANTLR end "rule__Type__SubTypeAssignment_3_3"


    // $ANTLR start "rule__LiteralType__LitAssignment"
    // InternalAle.g:9940:1: rule__LiteralType__LitAssignment : ( ( rule__LiteralType__LitAlternatives_0 ) ) ;
    public final void rule__LiteralType__LitAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9944:1: ( ( ( rule__LiteralType__LitAlternatives_0 ) ) )
            // InternalAle.g:9945:2: ( ( rule__LiteralType__LitAlternatives_0 ) )
            {
            // InternalAle.g:9945:2: ( ( rule__LiteralType__LitAlternatives_0 ) )
            // InternalAle.g:9946:3: ( rule__LiteralType__LitAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralTypeAccess().getLitAlternatives_0()); 
            }
            // InternalAle.g:9947:3: ( rule__LiteralType__LitAlternatives_0 )
            // InternalAle.g:9947:4: rule__LiteralType__LitAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__LiteralType__LitAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralTypeAccess().getLitAlternatives_0()); 
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
    // $ANTLR end "rule__LiteralType__LitAssignment"

    // $ANTLR start synpred65_InternalAle
    public final void synpred65_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:4672:3: ( rule__ImpliesOperation__Group_1__0 )
        // InternalAle.g:4672:3: rule__ImpliesOperation__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__ImpliesOperation__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalAle

    // $ANTLR start synpred66_InternalAle
    public final void synpred66_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:4861:3: ( rule__BooleanOperation__Group_1__0 )
        // InternalAle.g:4861:3: rule__BooleanOperation__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__BooleanOperation__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalAle

    // $ANTLR start synpred67_InternalAle
    public final void synpred67_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:5158:3: ( rule__CompareOperation__Group_1__0 )
        // InternalAle.g:5158:3: rule__CompareOperation__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__CompareOperation__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalAle

    // $ANTLR start synpred68_InternalAle
    public final void synpred68_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:5563:3: ( rule__EqualityOperation__Group_1__0 )
        // InternalAle.g:5563:3: rule__EqualityOperation__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__EqualityOperation__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalAle

    // $ANTLR start synpred69_InternalAle
    public final void synpred69_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:5725:3: ( rule__MultOperation__Group_1__0 )
        // InternalAle.g:5725:3: rule__MultOperation__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__MultOperation__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_InternalAle

    // $ANTLR start synpred70_InternalAle
    public final void synpred70_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:5968:3: ( rule__AddOperation__Group_1__0 )
        // InternalAle.g:5968:3: rule__AddOperation__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__AddOperation__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_InternalAle

    // Delegated rules

    public final boolean synpred69_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\34\1\4\2\uffff\1\34";
    static final String dfa_3s = "\1\46\1\4\2\uffff\1\46";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\uffff";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\6\uffff\1\2\2\uffff\1\3",
            "\1\4",
            "",
            "",
            "\1\1\6\uffff\1\2\2\uffff\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "874:1: rule__Method__Alternatives : ( ( ruleDefMethod ) | ( ruleOverrideMethod ) );";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\4\2\41\6\uffff";
    static final String dfa_9s = "\1\106\1\uffff\1\107\2\44\6\uffff";
    static final String dfa_10s = "\1\uffff\1\1\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\5\12\5\uffff\11\1\14\uffff\1\12\2\uffff\1\11\1\10\1\uffff\1\6\1\uffff\1\7\1\5\15\uffff\3\12\3\uffff\3\12\1\uffff\1\3\1\4",
            "",
            "\1\1\24\uffff\1\12\12\uffff\1\12\12\uffff\15\12\2\uffff\2\12\7\uffff\1\12",
            "\1\12\2\uffff\1\1",
            "\1\12\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "916:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ruleForLoop ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000064000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004C10FF8010L,0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000FF8012L,0x0000000000000060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004810000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000FFC010L,0x0000000000000060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000FF8010L,0x0000000000000060L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000FF8010L,0x0000000000000060L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004810000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x38000010000003F0L,0x000000000000006EL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x38000110000003F0L,0x000000000000006EL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x3800359400FF83F0L,0x000000000000006EL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x3800359000FF83F2L,0x000000000000006EL});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00F8000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00F8000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x38000030000003F0L,0x000000000000006EL});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x38000014000003F0L,0x000000000000006EL});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x4000000000000002L});

}