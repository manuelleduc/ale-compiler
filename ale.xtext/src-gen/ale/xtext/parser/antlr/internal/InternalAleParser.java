package ale.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ale.xtext.services.AleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_REAL", "RULE_BOOLEAN", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'behavior'", "';'", "'import'", "'as'", "'@'", "'open'", "'class'", "'extends'", "','", "'{'", "'}'", "'ref'", "'cont'", "'def'", "'void'", "'('", "')'", "'override'", "'return'", "'let'", "'in'", "'if'", "'else'", "'while'", "'for'", "'='", "'implies'", "'or'", "'and'", "'xor'", "'<='", "'>='", "'!='", "'<'", "'>'", "'=='", "'*'", "'/'", "'+'", "'-'", "'.'", "'->'", "'not'", "'new'", "'|'", "'$'", "'['", "']'", "'self'", "'super'", "'Sequence'", "'OrderedSet'", "'Boolean'", "'Real'", "'Int'", "'String'", "'nulltype'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
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
    public static final int RULE_REAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=5;
    public static final int RULE_NULL=9;
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

        public InternalAleParser(TokenStream input, AleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected AleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalAle.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalAle.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalAle.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalAle.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleAleClass ) )* ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_classes_4_0 = null;



        	enterRule();

        try {
            // InternalAle.g:77:2: ( (otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleAleClass ) )* ) )
            // InternalAle.g:78:2: (otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleAleClass ) )* )
            {
            // InternalAle.g:78:2: (otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleAleClass ) )* )
            // InternalAle.g:79:3: otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleAleClass ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getBehaviorKeyword_0());
              		
            }
            // InternalAle.g:83:3: ( (lv_name_1_0= ruleQualified ) )
            // InternalAle.g:84:4: (lv_name_1_0= ruleQualified )
            {
            // InternalAle.g:84:4: (lv_name_1_0= ruleQualified )
            // InternalAle.g:85:5: lv_name_1_0= ruleQualified
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRootAccess().getNameQualifiedParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRootRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"ale.xtext.Ale.Qualified");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRootAccess().getSemicolonKeyword_2());
              		
            }
            // InternalAle.g:106:3: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAle.g:107:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalAle.g:107:4: (lv_imports_3_0= ruleImport )
            	    // InternalAle.g:108:5: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRootAccess().getImportsImportParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_3_0,
            	      						"ale.xtext.Ale.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAle.g:125:3: ( (lv_classes_4_0= ruleAleClass ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAle.g:126:4: (lv_classes_4_0= ruleAleClass )
            	    {
            	    // InternalAle.g:126:4: (lv_classes_4_0= ruleAleClass )
            	    // InternalAle.g:127:5: lv_classes_4_0= ruleAleClass
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRootAccess().getClassesAleClassParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_classes_4_0=ruleAleClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"classes",
            	      						lv_classes_4_0,
            	      						"ale.xtext.Ale.AleClass");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleImport"
    // InternalAle.g:148:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAle.g:148:47: (iv_ruleImport= ruleImport EOF )
            // InternalAle.g:149:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalAle.g:155:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAle.g:161:2: ( (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalAle.g:162:2: (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalAle.g:162:2: (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // InternalAle.g:163:3: otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalAle.g:167:3: ( (otherlv_1= RULE_ID ) )
            // InternalAle.g:168:4: (otherlv_1= RULE_ID )
            {
            // InternalAle.g:168:4: (otherlv_1= RULE_ID )
            // InternalAle.g:169:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getImportAccess().getRefRootCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getAsKeyword_2());
              		
            }
            // InternalAle.g:184:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAle.g:185:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAle.g:185:4: (lv_name_3_0= RULE_ID )
            // InternalAle.g:186:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getImportAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAleClass"
    // InternalAle.g:210:1: entryRuleAleClass returns [EObject current=null] : iv_ruleAleClass= ruleAleClass EOF ;
    public final EObject entryRuleAleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAleClass = null;


        try {
            // InternalAle.g:210:49: (iv_ruleAleClass= ruleAleClass EOF )
            // InternalAle.g:211:2: iv_ruleAleClass= ruleAleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAleClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAleClass=ruleAleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAleClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAleClass"


    // $ANTLR start "ruleAleClass"
    // InternalAle.g:217:1: ruleAleClass returns [EObject current=null] : (this_OpenClass_0= ruleOpenClass | this_NewClass_1= ruleNewClass ) ;
    public final EObject ruleAleClass() throws RecognitionException {
        EObject current = null;

        EObject this_OpenClass_0 = null;

        EObject this_NewClass_1 = null;



        	enterRule();

        try {
            // InternalAle.g:223:2: ( (this_OpenClass_0= ruleOpenClass | this_NewClass_1= ruleNewClass ) )
            // InternalAle.g:224:2: (this_OpenClass_0= ruleOpenClass | this_NewClass_1= ruleNewClass )
            {
            // InternalAle.g:224:2: (this_OpenClass_0= ruleOpenClass | this_NewClass_1= ruleNewClass )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAle.g:225:3: this_OpenClass_0= ruleOpenClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAleClassAccess().getOpenClassParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OpenClass_0=ruleOpenClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OpenClass_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:234:3: this_NewClass_1= ruleNewClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAleClassAccess().getNewClassParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NewClass_1=ruleNewClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NewClass_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAleClass"


    // $ANTLR start "entryRuleTag"
    // InternalAle.g:246:1: entryRuleTag returns [String current=null] : iv_ruleTag= ruleTag EOF ;
    public final String entryRuleTag() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTag = null;


        try {
            // InternalAle.g:246:43: (iv_ruleTag= ruleTag EOF )
            // InternalAle.g:247:2: iv_ruleTag= ruleTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTag.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalAle.g:253:1: ruleTag returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleTag() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAle.g:259:2: ( (kw= '@' this_ID_1= RULE_ID ) )
            // InternalAle.g:260:2: (kw= '@' this_ID_1= RULE_ID )
            {
            // InternalAle.g:260:2: (kw= '@' this_ID_1= RULE_ID )
            // InternalAle.g:261:3: kw= '@' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTagAccess().getCommercialAtKeyword_0());
              		
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_1, grammarAccess.getTagAccess().getIDTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleOpenClass"
    // InternalAle.g:277:1: entryRuleOpenClass returns [EObject current=null] : iv_ruleOpenClass= ruleOpenClass EOF ;
    public final EObject entryRuleOpenClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenClass = null;


        try {
            // InternalAle.g:277:50: (iv_ruleOpenClass= ruleOpenClass EOF )
            // InternalAle.g:278:2: iv_ruleOpenClass= ruleOpenClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpenClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpenClass=ruleOpenClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpenClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpenClass"


    // $ANTLR start "ruleOpenClass"
    // InternalAle.g:284:1: ruleOpenClass returns [EObject current=null] : ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) ) ;
    public final EObject ruleOpenClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_superClass_5_0 = null;

        AntlrDatatypeRuleToken lv_superClass_7_0 = null;

        EObject lv_fields_9_0 = null;

        EObject lv_methods_10_0 = null;



        	enterRule();

        try {
            // InternalAle.g:290:2: ( ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) ) )
            // InternalAle.g:291:2: ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) )
            {
            // InternalAle.g:291:2: ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) )
            // InternalAle.g:292:3: () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' )
            {
            // InternalAle.g:292:3: ()
            // InternalAle.g:293:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getOpenClassAccess().getOpenClassAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOpenClassAccess().getOpenKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOpenClassAccess().getClassKeyword_2());
              		
            }
            // InternalAle.g:307:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAle.g:308:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAle.g:308:4: (lv_name_3_0= RULE_ID )
            // InternalAle.g:309:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getOpenClassAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOpenClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAle.g:325:3: (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAle.g:326:4: otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )*
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getOpenClassAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalAle.g:330:4: ( (lv_superClass_5_0= ruleQualified ) )
                    // InternalAle.g:331:5: (lv_superClass_5_0= ruleQualified )
                    {
                    // InternalAle.g:331:5: (lv_superClass_5_0= ruleQualified )
                    // InternalAle.g:332:6: lv_superClass_5_0= ruleQualified
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOpenClassAccess().getSuperClassQualifiedParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_superClass_5_0=ruleQualified();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOpenClassRule());
                      						}
                      						add(
                      							current,
                      							"superClass",
                      							lv_superClass_5_0,
                      							"ale.xtext.Ale.Qualified");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:349:4: (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==22) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAle.g:350:5: otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getOpenClassAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalAle.g:354:5: ( (lv_superClass_7_0= ruleQualified ) )
                    	    // InternalAle.g:355:6: (lv_superClass_7_0= ruleQualified )
                    	    {
                    	    // InternalAle.g:355:6: (lv_superClass_7_0= ruleQualified )
                    	    // InternalAle.g:356:7: lv_superClass_7_0= ruleQualified
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOpenClassAccess().getSuperClassQualifiedParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_superClass_7_0=ruleQualified();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOpenClassRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"superClass",
                    	      								lv_superClass_7_0,
                    	      								"ale.xtext.Ale.Qualified");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAle.g:375:3: (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' )
            // InternalAle.g:376:4: otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}'
            {
            otherlv_8=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getOpenClassAccess().getLeftCurlyBracketKeyword_5_0());
              			
            }
            // InternalAle.g:380:4: ( (lv_fields_9_0= ruleField ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=25 && LA6_0<=26)||(LA6_0>=64 && LA6_0<=69)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAle.g:381:5: (lv_fields_9_0= ruleField )
            	    {
            	    // InternalAle.g:381:5: (lv_fields_9_0= ruleField )
            	    // InternalAle.g:382:6: lv_fields_9_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOpenClassAccess().getFieldsFieldParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_fields_9_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOpenClassRule());
            	      						}
            	      						add(
            	      							current,
            	      							"fields",
            	      							lv_fields_9_0,
            	      							"ale.xtext.Ale.Field");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalAle.g:399:4: ( (lv_methods_10_0= ruleMethod ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18||LA7_0==27||LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAle.g:400:5: (lv_methods_10_0= ruleMethod )
            	    {
            	    // InternalAle.g:400:5: (lv_methods_10_0= ruleMethod )
            	    // InternalAle.g:401:6: lv_methods_10_0= ruleMethod
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOpenClassAccess().getMethodsMethodParserRuleCall_5_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_methods_10_0=ruleMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOpenClassRule());
            	      						}
            	      						add(
            	      							current,
            	      							"methods",
            	      							lv_methods_10_0,
            	      							"ale.xtext.Ale.Method");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_11=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_11, grammarAccess.getOpenClassAccess().getRightCurlyBracketKeyword_5_3());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpenClass"


    // $ANTLR start "entryRuleNewClass"
    // InternalAle.g:427:1: entryRuleNewClass returns [EObject current=null] : iv_ruleNewClass= ruleNewClass EOF ;
    public final EObject entryRuleNewClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewClass = null;


        try {
            // InternalAle.g:427:49: (iv_ruleNewClass= ruleNewClass EOF )
            // InternalAle.g:428:2: iv_ruleNewClass= ruleNewClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNewClass=ruleNewClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewClass"


    // $ANTLR start "ruleNewClass"
    // InternalAle.g:434:1: ruleNewClass returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ) ;
    public final EObject ruleNewClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_superClass_4_0 = null;

        AntlrDatatypeRuleToken lv_superClass_6_0 = null;

        EObject lv_fields_8_0 = null;

        EObject lv_methods_9_0 = null;



        	enterRule();

        try {
            // InternalAle.g:440:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ) )
            // InternalAle.g:441:2: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            {
            // InternalAle.g:441:2: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            // InternalAle.g:442:3: () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            {
            // InternalAle.g:442:3: ()
            // InternalAle.g:443:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNewClassAccess().getNewClassAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNewClassAccess().getClassKeyword_1());
              		
            }
            // InternalAle.g:453:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAle.g:454:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAle.g:454:4: (lv_name_2_0= RULE_ID )
            // InternalAle.g:455:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getNewClassAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNewClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAle.g:471:3: (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAle.g:472:4: otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )*
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNewClassAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalAle.g:476:4: ( (lv_superClass_4_0= ruleQualified ) )
                    // InternalAle.g:477:5: (lv_superClass_4_0= ruleQualified )
                    {
                    // InternalAle.g:477:5: (lv_superClass_4_0= ruleQualified )
                    // InternalAle.g:478:6: lv_superClass_4_0= ruleQualified
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNewClassAccess().getSuperClassQualifiedParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_superClass_4_0=ruleQualified();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNewClassRule());
                      						}
                      						add(
                      							current,
                      							"superClass",
                      							lv_superClass_4_0,
                      							"ale.xtext.Ale.Qualified");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:495:4: (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==22) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAle.g:496:5: otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getNewClassAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalAle.g:500:5: ( (lv_superClass_6_0= ruleQualified ) )
                    	    // InternalAle.g:501:6: (lv_superClass_6_0= ruleQualified )
                    	    {
                    	    // InternalAle.g:501:6: (lv_superClass_6_0= ruleQualified )
                    	    // InternalAle.g:502:7: lv_superClass_6_0= ruleQualified
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNewClassAccess().getSuperClassQualifiedParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_superClass_6_0=ruleQualified();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNewClassRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"superClass",
                    	      								lv_superClass_6_0,
                    	      								"ale.xtext.Ale.Qualified");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAle.g:521:3: (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            // InternalAle.g:522:4: otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}'
            {
            otherlv_7=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getNewClassAccess().getLeftCurlyBracketKeyword_4_0());
              			
            }
            // InternalAle.g:526:4: ( (lv_fields_8_0= ruleField ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=25 && LA10_0<=26)||(LA10_0>=64 && LA10_0<=69)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAle.g:527:5: (lv_fields_8_0= ruleField )
            	    {
            	    // InternalAle.g:527:5: (lv_fields_8_0= ruleField )
            	    // InternalAle.g:528:6: lv_fields_8_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNewClassAccess().getFieldsFieldParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_fields_8_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNewClassRule());
            	      						}
            	      						add(
            	      							current,
            	      							"fields",
            	      							lv_fields_8_0,
            	      							"ale.xtext.Ale.Field");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalAle.g:545:4: ( (lv_methods_9_0= ruleMethod ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18||LA11_0==27||LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAle.g:546:5: (lv_methods_9_0= ruleMethod )
            	    {
            	    // InternalAle.g:546:5: (lv_methods_9_0= ruleMethod )
            	    // InternalAle.g:547:6: lv_methods_9_0= ruleMethod
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNewClassAccess().getMethodsMethodParserRuleCall_4_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_methods_9_0=ruleMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNewClassRule());
            	      						}
            	      						add(
            	      							current,
            	      							"methods",
            	      							lv_methods_9_0,
            	      							"ale.xtext.Ale.Method");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_10=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_10, grammarAccess.getNewClassAccess().getRightCurlyBracketKeyword_4_3());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewClass"


    // $ANTLR start "entryRuleField"
    // InternalAle.g:573:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalAle.g:573:46: (iv_ruleField= ruleField EOF )
            // InternalAle.g:574:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalAle.g:580:1: ruleField returns [EObject current=null] : ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) | ( () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) | ( () otherlv_10= 'cont' ( (lv_type_11_0= ruleType ) ) ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        EObject lv_type_1_0 = null;

        EObject lv_type_6_0 = null;

        EObject lv_type_11_0 = null;



        	enterRule();

        try {
            // InternalAle.g:586:2: ( ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) | ( () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) | ( () otherlv_10= 'cont' ( (lv_type_11_0= ruleType ) ) ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' ) ) )
            // InternalAle.g:587:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) | ( () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) | ( () otherlv_10= 'cont' ( (lv_type_11_0= ruleType ) ) ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' ) )
            {
            // InternalAle.g:587:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) | ( () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) | ( () otherlv_10= 'cont' ( (lv_type_11_0= ruleType ) ) ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt12=1;
                }
                break;
            case 25:
                {
                alt12=2;
                }
                break;
            case 26:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAle.g:588:3: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
                    {
                    // InternalAle.g:588:3: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
                    // InternalAle.g:589:4: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
                    {
                    // InternalAle.g:589:4: ()
                    // InternalAle.g:590:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFieldAccess().getPrimitiveFieldAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:596:4: ( (lv_type_1_0= ruleType ) )
                    // InternalAle.g:597:5: (lv_type_1_0= ruleType )
                    {
                    // InternalAle.g:597:5: (lv_type_1_0= ruleType )
                    // InternalAle.g:598:6: lv_type_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_type_1_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFieldRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_1_0,
                      							"ale.xtext.Ale.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:615:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalAle.g:616:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalAle.g:616:5: (lv_name_2_0= RULE_ID )
                    // InternalAle.g:617:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getSemicolonKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:639:3: ( () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' )
                    {
                    // InternalAle.g:639:3: ( () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' )
                    // InternalAle.g:640:4: () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';'
                    {
                    // InternalAle.g:640:4: ()
                    // InternalAle.g:641:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFieldAccess().getRefFieldAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getRefKeyword_1_1());
                      			
                    }
                    // InternalAle.g:651:4: ( (lv_type_6_0= ruleType ) )
                    // InternalAle.g:652:5: (lv_type_6_0= ruleType )
                    {
                    // InternalAle.g:652:5: (lv_type_6_0= ruleType )
                    // InternalAle.g:653:6: lv_type_6_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_type_6_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFieldRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_6_0,
                      							"ale.xtext.Ale.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:670:4: ( (lv_name_7_0= RULE_ID ) )
                    // InternalAle.g:671:5: (lv_name_7_0= RULE_ID )
                    {
                    // InternalAle.g:671:5: (lv_name_7_0= RULE_ID )
                    // InternalAle.g:672:6: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_7_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_7_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getSemicolonKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:694:3: ( () otherlv_10= 'cont' ( (lv_type_11_0= ruleType ) ) ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' )
                    {
                    // InternalAle.g:694:3: ( () otherlv_10= 'cont' ( (lv_type_11_0= ruleType ) ) ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' )
                    // InternalAle.g:695:4: () otherlv_10= 'cont' ( (lv_type_11_0= ruleType ) ) ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';'
                    {
                    // InternalAle.g:695:4: ()
                    // InternalAle.g:696:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFieldAccess().getContainmentFieldAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_10=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getContKeyword_2_1());
                      			
                    }
                    // InternalAle.g:706:4: ( (lv_type_11_0= ruleType ) )
                    // InternalAle.g:707:5: (lv_type_11_0= ruleType )
                    {
                    // InternalAle.g:707:5: (lv_type_11_0= ruleType )
                    // InternalAle.g:708:6: lv_type_11_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_type_11_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFieldRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_11_0,
                      							"ale.xtext.Ale.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:725:4: ( (lv_name_12_0= RULE_ID ) )
                    // InternalAle.g:726:5: (lv_name_12_0= RULE_ID )
                    {
                    // InternalAle.g:726:5: (lv_name_12_0= RULE_ID )
                    // InternalAle.g:727:6: lv_name_12_0= RULE_ID
                    {
                    lv_name_12_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_12_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_12_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getFieldAccess().getSemicolonKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // InternalAle.g:752:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalAle.g:752:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalAle.g:753:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalAle.g:759:1: ruleMethod returns [EObject current=null] : (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        EObject this_DefMethod_0 = null;

        EObject this_OverrideMethod_1 = null;



        	enterRule();

        try {
            // InternalAle.g:765:2: ( (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod ) )
            // InternalAle.g:766:2: (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod )
            {
            // InternalAle.g:766:2: (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalAle.g:767:3: this_DefMethod_0= ruleDefMethod
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMethodAccess().getDefMethodParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DefMethod_0=ruleDefMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefMethod_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:776:3: this_OverrideMethod_1= ruleOverrideMethod
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMethodAccess().getOverrideMethodParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OverrideMethod_1=ruleOverrideMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OverrideMethod_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleDefMethod"
    // InternalAle.g:788:1: entryRuleDefMethod returns [EObject current=null] : iv_ruleDefMethod= ruleDefMethod EOF ;
    public final EObject entryRuleDefMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefMethod = null;


        try {
            // InternalAle.g:788:50: (iv_ruleDefMethod= ruleDefMethod EOF )
            // InternalAle.g:789:2: iv_ruleDefMethod= ruleDefMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefMethod=ruleDefMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefMethod"


    // $ANTLR start "ruleDefMethod"
    // InternalAle.g:795:1: ruleDefMethod returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) ) ) ;
    public final EObject ruleDefMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_tags_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_block_10_0 = null;



        	enterRule();

        try {
            // InternalAle.g:801:2: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) ) ) )
            // InternalAle.g:802:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) ) )
            {
            // InternalAle.g:802:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) ) )
            // InternalAle.g:803:3: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) )
            {
            // InternalAle.g:803:3: ( (lv_tags_0_0= ruleTag ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAle.g:804:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalAle.g:804:4: (lv_tags_0_0= ruleTag )
            	    // InternalAle.g:805:5: lv_tags_0_0= ruleTag
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDefMethodAccess().getTagsTagParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDefMethodRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tags",
            	      						lv_tags_0_0,
            	      						"ale.xtext.Ale.Tag");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_1=(Token)match(input,27,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefMethodAccess().getDefKeyword_1());
              		
            }
            // InternalAle.g:826:3: ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||(LA15_0>=64 && LA15_0<=69)) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAle.g:827:4: ( (lv_type_2_0= ruleType ) )
                    {
                    // InternalAle.g:827:4: ( (lv_type_2_0= ruleType ) )
                    // InternalAle.g:828:5: (lv_type_2_0= ruleType )
                    {
                    // InternalAle.g:828:5: (lv_type_2_0= ruleType )
                    // InternalAle.g:829:6: lv_type_2_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefMethodAccess().getTypeTypeParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_type_2_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefMethodRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_2_0,
                      							"ale.xtext.Ale.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:847:4: otherlv_3= 'void'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDefMethodAccess().getVoidKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAle.g:852:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalAle.g:853:4: (lv_name_4_0= RULE_ID )
            {
            // InternalAle.g:853:4: (lv_name_4_0= RULE_ID )
            // InternalAle.g:854:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getDefMethodAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefMethodRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAle.g:870:3: (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' )
            // InternalAle.g:871:4: otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')'
            {
            otherlv_5=(Token)match(input,29,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getDefMethodAccess().getLeftParenthesisKeyword_4_0());
              			
            }
            // InternalAle.g:875:4: ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||(LA17_0>=64 && LA17_0<=69)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAle.g:876:5: ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )*
                    {
                    // InternalAle.g:876:5: ( (lv_params_6_0= ruleParam ) )
                    // InternalAle.g:877:6: (lv_params_6_0= ruleParam )
                    {
                    // InternalAle.g:877:6: (lv_params_6_0= ruleParam )
                    // InternalAle.g:878:7: lv_params_6_0= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_4_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_18);
                    lv_params_6_0=ruleParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDefMethodRule());
                      							}
                      							add(
                      								current,
                      								"params",
                      								lv_params_6_0,
                      								"ale.xtext.Ale.Param");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAle.g:895:5: (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==22) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalAle.g:896:6: otherlv_7= ',' ( (lv_params_8_0= ruleParam ) )
                    	    {
                    	    otherlv_7=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_7, grammarAccess.getDefMethodAccess().getCommaKeyword_4_1_1_0());
                    	      					
                    	    }
                    	    // InternalAle.g:900:6: ( (lv_params_8_0= ruleParam ) )
                    	    // InternalAle.g:901:7: (lv_params_8_0= ruleParam )
                    	    {
                    	    // InternalAle.g:901:7: (lv_params_8_0= ruleParam )
                    	    // InternalAle.g:902:8: lv_params_8_0= ruleParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_4_1_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_params_8_0=ruleParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getDefMethodRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"params",
                    	      									lv_params_8_0,
                    	      									"ale.xtext.Ale.Param");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_9, grammarAccess.getDefMethodAccess().getRightParenthesisKeyword_4_2());
              			
            }

            }

            // InternalAle.g:926:3: ( (lv_block_10_0= ruleBlock ) )
            // InternalAle.g:927:4: (lv_block_10_0= ruleBlock )
            {
            // InternalAle.g:927:4: (lv_block_10_0= ruleBlock )
            // InternalAle.g:928:5: lv_block_10_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefMethodAccess().getBlockBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_10_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefMethodRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_10_0,
              						"ale.xtext.Ale.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefMethod"


    // $ANTLR start "entryRuleOverrideMethod"
    // InternalAle.g:949:1: entryRuleOverrideMethod returns [EObject current=null] : iv_ruleOverrideMethod= ruleOverrideMethod EOF ;
    public final EObject entryRuleOverrideMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverrideMethod = null;


        try {
            // InternalAle.g:949:55: (iv_ruleOverrideMethod= ruleOverrideMethod EOF )
            // InternalAle.g:950:2: iv_ruleOverrideMethod= ruleOverrideMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOverrideMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOverrideMethod=ruleOverrideMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOverrideMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOverrideMethod"


    // $ANTLR start "ruleOverrideMethod"
    // InternalAle.g:956:1: ruleOverrideMethod returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) ) ;
    public final EObject ruleOverrideMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_tags_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_block_9_0 = null;



        	enterRule();

        try {
            // InternalAle.g:962:2: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) ) )
            // InternalAle.g:963:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) )
            {
            // InternalAle.g:963:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) )
            // InternalAle.g:964:3: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) )
            {
            // InternalAle.g:964:3: ( (lv_tags_0_0= ruleTag ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==18) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAle.g:965:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalAle.g:965:4: (lv_tags_0_0= ruleTag )
            	    // InternalAle.g:966:5: lv_tags_0_0= ruleTag
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOverrideMethodAccess().getTagsTagParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getOverrideMethodRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tags",
            	      						lv_tags_0_0,
            	      						"ale.xtext.Ale.Tag");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_1=(Token)match(input,31,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOverrideMethodAccess().getOverrideKeyword_1());
              		
            }
            // InternalAle.g:987:3: ( (lv_type_2_0= ruleType ) )
            // InternalAle.g:988:4: (lv_type_2_0= ruleType )
            {
            // InternalAle.g:988:4: (lv_type_2_0= ruleType )
            // InternalAle.g:989:5: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOverrideMethodAccess().getTypeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOverrideMethodRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"ale.xtext.Ale.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:1006:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAle.g:1007:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAle.g:1007:4: (lv_name_3_0= RULE_ID )
            // InternalAle.g:1008:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getOverrideMethodAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOverrideMethodRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAle.g:1024:3: (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' )
            // InternalAle.g:1025:4: otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')'
            {
            otherlv_4=(Token)match(input,29,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getOverrideMethodAccess().getLeftParenthesisKeyword_4_0());
              			
            }
            // InternalAle.g:1029:4: ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||(LA20_0>=64 && LA20_0<=69)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAle.g:1030:5: ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )*
                    {
                    // InternalAle.g:1030:5: ( (lv_params_5_0= ruleParam ) )
                    // InternalAle.g:1031:6: (lv_params_5_0= ruleParam )
                    {
                    // InternalAle.g:1031:6: (lv_params_5_0= ruleParam )
                    // InternalAle.g:1032:7: lv_params_5_0= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_4_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_18);
                    lv_params_5_0=ruleParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getOverrideMethodRule());
                      							}
                      							add(
                      								current,
                      								"params",
                      								lv_params_5_0,
                      								"ale.xtext.Ale.Param");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAle.g:1049:5: (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==22) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalAle.g:1050:6: otherlv_6= ',' ( (lv_params_7_0= ruleParam ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_6, grammarAccess.getOverrideMethodAccess().getCommaKeyword_4_1_1_0());
                    	      					
                    	    }
                    	    // InternalAle.g:1054:6: ( (lv_params_7_0= ruleParam ) )
                    	    // InternalAle.g:1055:7: (lv_params_7_0= ruleParam )
                    	    {
                    	    // InternalAle.g:1055:7: (lv_params_7_0= ruleParam )
                    	    // InternalAle.g:1056:8: lv_params_7_0= ruleParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_4_1_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_params_7_0=ruleParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getOverrideMethodRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"params",
                    	      									lv_params_7_0,
                    	      									"ale.xtext.Ale.Param");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getOverrideMethodAccess().getRightParenthesisKeyword_4_2());
              			
            }

            }

            // InternalAle.g:1080:3: ( (lv_block_9_0= ruleBlock ) )
            // InternalAle.g:1081:4: (lv_block_9_0= ruleBlock )
            {
            // InternalAle.g:1081:4: (lv_block_9_0= ruleBlock )
            // InternalAle.g:1082:5: lv_block_9_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOverrideMethodAccess().getBlockBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_9_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOverrideMethodRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_9_0,
              						"ale.xtext.Ale.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOverrideMethod"


    // $ANTLR start "entryRuleStatement"
    // InternalAle.g:1103:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalAle.g:1103:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalAle.g:1104:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalAle.g:1110:1: ruleStatement returns [EObject current=null] : ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_VarAssign_0 = null;

        EObject this_ForLoop_2 = null;

        EObject this_IfStatement_3 = null;

        EObject this_WhileStatement_4 = null;

        EObject this_LetStatement_5 = null;

        EObject this_ReturnStatement_7 = null;

        EObject this_Expression_9 = null;



        	enterRule();

        try {
            // InternalAle.g:1116:2: ( ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) ) )
            // InternalAle.g:1117:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) )
            {
            // InternalAle.g:1117:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) )
            int alt21=7;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalAle.g:1118:3: (this_VarAssign_0= ruleVarAssign otherlv_1= ';' )
                    {
                    // InternalAle.g:1118:3: (this_VarAssign_0= ruleVarAssign otherlv_1= ';' )
                    // InternalAle.g:1119:4: this_VarAssign_0= ruleVarAssign otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getVarAssignParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_VarAssign_0=ruleVarAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_VarAssign_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_1=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1133:3: this_ForLoop_2= ruleForLoop
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForLoopParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForLoop_2=ruleForLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForLoop_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAle.g:1142:3: this_IfStatement_3= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStatement_3=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStatement_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAle.g:1151:3: this_WhileStatement_4= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_4=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileStatement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAle.g:1160:3: (this_LetStatement_5= ruleLetStatement otherlv_6= ';' )
                    {
                    // InternalAle.g:1160:3: (this_LetStatement_5= ruleLetStatement otherlv_6= ';' )
                    // InternalAle.g:1161:4: this_LetStatement_5= ruleLetStatement otherlv_6= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getLetStatementParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_LetStatement_5=ruleLetStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_LetStatement_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSemicolonKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:1175:3: (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' )
                    {
                    // InternalAle.g:1175:3: (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' )
                    // InternalAle.g:1176:4: this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_ReturnStatement_7=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ReturnStatement_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_8=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getSemicolonKeyword_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:1190:3: (this_Expression_9= ruleExpression otherlv_10= ';' )
                    {
                    // InternalAle.g:1190:3: (this_Expression_9= ruleExpression otherlv_10= ';' )
                    // InternalAle.g:1191:4: this_Expression_9= ruleExpression otherlv_10= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_6_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_Expression_9=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_9;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_10=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getSemicolonKeyword_6_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalAle.g:1208:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalAle.g:1208:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalAle.g:1209:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalAle.g:1215:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_returned_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1221:2: ( ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) ) )
            // InternalAle.g:1222:2: ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) )
            {
            // InternalAle.g:1222:2: ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) )
            // InternalAle.g:1223:3: () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) )
            {
            // InternalAle.g:1223:3: ()
            // InternalAle.g:1224:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
              		
            }
            // InternalAle.g:1234:3: ( (lv_returned_2_0= ruleExpression ) )
            // InternalAle.g:1235:4: (lv_returned_2_0= ruleExpression )
            {
            // InternalAle.g:1235:4: (lv_returned_2_0= ruleExpression )
            // InternalAle.g:1236:5: lv_returned_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnStatementAccess().getReturnedExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_returned_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReturnStatementRule());
              					}
              					set(
              						current,
              						"returned",
              						lv_returned_2_0,
              						"ale.xtext.Ale.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleLetStatement"
    // InternalAle.g:1257:1: entryRuleLetStatement returns [EObject current=null] : iv_ruleLetStatement= ruleLetStatement EOF ;
    public final EObject entryRuleLetStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetStatement = null;


        try {
            // InternalAle.g:1257:53: (iv_ruleLetStatement= ruleLetStatement EOF )
            // InternalAle.g:1258:2: iv_ruleLetStatement= ruleLetStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLetStatement=ruleLetStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetStatement"


    // $ANTLR start "ruleLetStatement"
    // InternalAle.g:1264:1: ruleLetStatement returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) ) ;
    public final EObject ruleLetStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_bindings_2_0 = null;

        EObject lv_bindings_4_0 = null;

        EObject lv_block_6_1 = null;

        EObject lv_block_6_2 = null;



        	enterRule();

        try {
            // InternalAle.g:1270:2: ( ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) ) )
            // InternalAle.g:1271:2: ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) )
            {
            // InternalAle.g:1271:2: ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) )
            // InternalAle.g:1272:3: () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) )
            {
            // InternalAle.g:1272:3: ()
            // InternalAle.g:1273:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLetStatementAccess().getLetStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLetStatementAccess().getLetKeyword_1());
              		
            }
            // InternalAle.g:1283:3: ( (lv_bindings_2_0= ruleVarAssign ) )
            // InternalAle.g:1284:4: (lv_bindings_2_0= ruleVarAssign )
            {
            // InternalAle.g:1284:4: (lv_bindings_2_0= ruleVarAssign )
            // InternalAle.g:1285:5: lv_bindings_2_0= ruleVarAssign
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_bindings_2_0=ruleVarAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetStatementRule());
              					}
              					add(
              						current,
              						"bindings",
              						lv_bindings_2_0,
              						"ale.xtext.Ale.VarAssign");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:1302:3: (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAle.g:1303:4: otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getLetStatementAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAle.g:1307:4: ( (lv_bindings_4_0= ruleVarAssign ) )
            	    // InternalAle.g:1308:5: (lv_bindings_4_0= ruleVarAssign )
            	    {
            	    // InternalAle.g:1308:5: (lv_bindings_4_0= ruleVarAssign )
            	    // InternalAle.g:1309:6: lv_bindings_4_0= ruleVarAssign
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_bindings_4_0=ruleVarAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLetStatementRule());
            	      						}
            	      						add(
            	      							current,
            	      							"bindings",
            	      							lv_bindings_4_0,
            	      							"ale.xtext.Ale.VarAssign");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_5=(Token)match(input,34,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getLetStatementAccess().getInKeyword_4());
              		
            }
            // InternalAle.g:1331:3: ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) )
            // InternalAle.g:1332:4: ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) )
            {
            // InternalAle.g:1332:4: ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) )
            // InternalAle.g:1333:5: (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement )
            {
            // InternalAle.g:1333:5: (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_NULL)||LA23_0==29||LA23_0==53||(LA23_0>=56 && LA23_0<=57)||(LA23_0>=59 && LA23_0<=60)||(LA23_0>=62 && LA23_0<=65)) ) {
                alt23=1;
            }
            else if ( (LA23_0==33) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalAle.g:1334:6: lv_block_6_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetStatementAccess().getBlockExpressionParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_6_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLetStatementRule());
                      						}
                      						set(
                      							current,
                      							"block",
                      							lv_block_6_1,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:1350:6: lv_block_6_2= ruleLetStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetStatementAccess().getBlockLetStatementParserRuleCall_5_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_6_2=ruleLetStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLetStatementRule());
                      						}
                      						set(
                      							current,
                      							"block",
                      							lv_block_6_2,
                      							"ale.xtext.Ale.LetStatement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalAle.g:1372:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalAle.g:1372:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalAle.g:1373:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalAle.g:1379:1: ruleIfStatement returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_3_0 = null;

        EObject lv_thenBranch_5_0 = null;

        EObject lv_elseBranch_7_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1385:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? ) )
            // InternalAle.g:1386:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? )
            {
            // InternalAle.g:1386:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? )
            // InternalAle.g:1387:3: () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )?
            {
            // InternalAle.g:1387:3: ()
            // InternalAle.g:1388:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIfStatementAccess().getIfStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getIfKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1402:3: ( (lv_condition_3_0= ruleExpression ) )
            // InternalAle.g:1403:4: (lv_condition_3_0= ruleExpression )
            {
            // InternalAle.g:1403:4: (lv_condition_3_0= ruleExpression )
            // InternalAle.g:1404:5: lv_condition_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_condition_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_3_0,
              						"ale.xtext.Ale.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalAle.g:1425:3: ( (lv_thenBranch_5_0= ruleBlock ) )
            // InternalAle.g:1426:4: (lv_thenBranch_5_0= ruleBlock )
            {
            // InternalAle.g:1426:4: (lv_thenBranch_5_0= ruleBlock )
            // InternalAle.g:1427:5: lv_thenBranch_5_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getThenBranchBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_thenBranch_5_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"thenBranch",
              						lv_thenBranch_5_0,
              						"ale.xtext.Ale.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:1444:3: (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAle.g:1445:4: otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getElseKeyword_6_0());
                      			
                    }
                    // InternalAle.g:1449:4: ( (lv_elseBranch_7_0= ruleBlock ) )
                    // InternalAle.g:1450:5: (lv_elseBranch_7_0= ruleBlock )
                    {
                    // InternalAle.g:1450:5: (lv_elseBranch_7_0= ruleBlock )
                    // InternalAle.g:1451:6: lv_elseBranch_7_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseBranchBlockParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseBranch_7_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      						}
                      						set(
                      							current,
                      							"elseBranch",
                      							lv_elseBranch_7_0,
                      							"ale.xtext.Ale.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalAle.g:1473:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalAle.g:1473:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalAle.g:1474:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalAle.g:1480:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;

        EObject lv_whileBlock_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1486:2: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) ) )
            // InternalAle.g:1487:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) )
            {
            // InternalAle.g:1487:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) )
            // InternalAle.g:1488:3: () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) )
            {
            // InternalAle.g:1488:3: ()
            // InternalAle.g:1489:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWhileStatementAccess().getWhileStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1503:3: ( (lv_condition_3_0= ruleExpression ) )
            // InternalAle.g:1504:4: (lv_condition_3_0= ruleExpression )
            {
            // InternalAle.g:1504:4: (lv_condition_3_0= ruleExpression )
            // InternalAle.g:1505:5: lv_condition_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_condition_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_3_0,
              						"ale.xtext.Ale.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalAle.g:1526:3: ( (lv_whileBlock_5_0= ruleBlock ) )
            // InternalAle.g:1527:4: (lv_whileBlock_5_0= ruleBlock )
            {
            // InternalAle.g:1527:4: (lv_whileBlock_5_0= ruleBlock )
            // InternalAle.g:1528:5: lv_whileBlock_5_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getWhileBlockBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_whileBlock_5_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"whileBlock",
              						lv_whileBlock_5_0,
              						"ale.xtext.Ale.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleForLoop"
    // InternalAle.g:1549:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalAle.g:1549:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalAle.g:1550:2: iv_ruleForLoop= ruleForLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForLoop=ruleForLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForLoop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalAle.g:1556:1: ruleForLoop returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_type_3_0 = null;

        EObject lv_collection_6_0 = null;

        EObject lv_block_8_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1562:2: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) )
            // InternalAle.g:1563:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            {
            // InternalAle.g:1563:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            // InternalAle.g:1564:3: () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) )
            {
            // InternalAle.g:1564:3: ()
            // InternalAle.g:1565:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForLoopAccess().getForLoopAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getForKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1579:3: ( (lv_type_3_0= ruleType ) )
            // InternalAle.g:1580:4: (lv_type_3_0= ruleType )
            {
            // InternalAle.g:1580:4: (lv_type_3_0= ruleType )
            // InternalAle.g:1581:5: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopAccess().getTypeTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForLoopRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"ale.xtext.Ale.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:1598:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalAle.g:1599:4: (lv_name_4_0= RULE_ID )
            {
            // InternalAle.g:1599:4: (lv_name_4_0= RULE_ID )
            // InternalAle.g:1600:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getForLoopAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForLoopRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForLoopAccess().getInKeyword_5());
              		
            }
            // InternalAle.g:1620:3: ( (lv_collection_6_0= ruleExpression ) )
            // InternalAle.g:1621:4: (lv_collection_6_0= ruleExpression )
            {
            // InternalAle.g:1621:4: (lv_collection_6_0= ruleExpression )
            // InternalAle.g:1622:5: lv_collection_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopAccess().getCollectionExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_collection_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForLoopRule());
              					}
              					set(
              						current,
              						"collection",
              						lv_collection_6_0,
              						"ale.xtext.Ale.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalAle.g:1643:3: ( (lv_block_8_0= ruleBlock ) )
            // InternalAle.g:1644:4: (lv_block_8_0= ruleBlock )
            {
            // InternalAle.g:1644:4: (lv_block_8_0= ruleBlock )
            // InternalAle.g:1645:5: lv_block_8_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_8_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForLoopRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_8_0,
              						"ale.xtext.Ale.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleBlock"
    // InternalAle.g:1666:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalAle.g:1666:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalAle.g:1667:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalAle.g:1673:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1679:2: ( ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalAle.g:1680:2: ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalAle.g:1680:2: ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalAle.g:1681:3: () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalAle.g:1681:3: ()
            // InternalAle.g:1682:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalAle.g:1692:3: ( (lv_body_2_0= ruleStatement ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_NULL)||LA25_0==29||(LA25_0>=32 && LA25_0<=33)||LA25_0==35||(LA25_0>=37 && LA25_0<=38)||LA25_0==53||(LA25_0>=56 && LA25_0<=57)||(LA25_0>=59 && LA25_0<=60)||(LA25_0>=62 && LA25_0<=69)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAle.g:1693:4: (lv_body_2_0= ruleStatement )
            	    {
            	    // InternalAle.g:1693:4: (lv_body_2_0= ruleStatement )
            	    // InternalAle.g:1694:5: lv_body_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getBodyStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_body_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"body",
            	      						lv_body_2_0,
            	      						"ale.xtext.Ale.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleVarAssign"
    // InternalAle.g:1719:1: entryRuleVarAssign returns [EObject current=null] : iv_ruleVarAssign= ruleVarAssign EOF ;
    public final EObject entryRuleVarAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarAssign = null;


        try {
            // InternalAle.g:1719:50: (iv_ruleVarAssign= ruleVarAssign EOF )
            // InternalAle.g:1720:2: iv_ruleVarAssign= ruleVarAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarAssign=ruleVarAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarAssign; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarAssign"


    // $ANTLR start "ruleVarAssign"
    // InternalAle.g:1726:1: ruleVarAssign returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) ;
    public final EObject ruleVarAssign() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1732:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) )
            // InternalAle.g:1733:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            {
            // InternalAle.g:1733:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            // InternalAle.g:1734:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) )
            {
            // InternalAle.g:1734:3: ()
            // InternalAle.g:1735:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVarAssignAccess().getVarAssignAction_0(),
              					current);
              			
            }

            }

            // InternalAle.g:1741:3: ( (lv_type_1_0= ruleType ) )
            // InternalAle.g:1742:4: (lv_type_1_0= ruleType )
            {
            // InternalAle.g:1742:4: (lv_type_1_0= ruleType )
            // InternalAle.g:1743:5: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarAssignAccess().getTypeTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarAssignRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"ale.xtext.Ale.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:1760:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAle.g:1761:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAle.g:1761:4: (lv_name_2_0= RULE_ID )
            // InternalAle.g:1762:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVarAssignAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarAssignRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVarAssignAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalAle.g:1782:3: ( (lv_value_4_0= ruleExpression ) )
            // InternalAle.g:1783:4: (lv_value_4_0= ruleExpression )
            {
            // InternalAle.g:1783:4: (lv_value_4_0= ruleExpression )
            // InternalAle.g:1784:5: lv_value_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarAssignAccess().getValueExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarAssignRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_4_0,
              						"ale.xtext.Ale.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarAssign"


    // $ANTLR start "entryRuleExpression"
    // InternalAle.g:1805:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAle.g:1805:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAle.g:1806:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAle.g:1812:1: ruleExpression returns [EObject current=null] : this_ImpliesOperation_0= ruleImpliesOperation ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesOperation_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1818:2: (this_ImpliesOperation_0= ruleImpliesOperation )
            // InternalAle.g:1819:2: this_ImpliesOperation_0= ruleImpliesOperation
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getImpliesOperationParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ImpliesOperation_0=ruleImpliesOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ImpliesOperation_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleImpliesOperation"
    // InternalAle.g:1830:1: entryRuleImpliesOperation returns [EObject current=null] : iv_ruleImpliesOperation= ruleImpliesOperation EOF ;
    public final EObject entryRuleImpliesOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesOperation = null;


        try {
            // InternalAle.g:1830:57: (iv_ruleImpliesOperation= ruleImpliesOperation EOF )
            // InternalAle.g:1831:2: iv_ruleImpliesOperation= ruleImpliesOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImpliesOperation=ruleImpliesOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImpliesOperation"


    // $ANTLR start "ruleImpliesOperation"
    // InternalAle.g:1837:1: ruleImpliesOperation returns [EObject current=null] : (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* ) ;
    public final EObject ruleImpliesOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BooleanOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1843:2: ( (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* ) )
            // InternalAle.g:1844:2: (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* )
            {
            // InternalAle.g:1844:2: (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* )
            // InternalAle.g:1845:3: this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImpliesOperationAccess().getBooleanOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_BooleanOperation_0=ruleBooleanOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BooleanOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:1853:3: ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==40) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred1_InternalAle()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalAle.g:1854:4: ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) )
            	    {
            	    // InternalAle.g:1867:4: ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) )
            	    // InternalAle.g:1868:5: ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) )
            	    {
            	    // InternalAle.g:1868:5: ( () otherlv_2= 'implies' )
            	    // InternalAle.g:1869:6: () otherlv_2= 'implies'
            	    {
            	    // InternalAle.g:1869:6: ()
            	    // InternalAle.g:1870:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getImpliesOperationAccess().getImpliesOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getImpliesOperationAccess().getImpliesKeyword_1_0_0_1());
            	      					
            	    }

            	    }

            	    // InternalAle.g:1881:5: ( (lv_right_3_0= ruleBooleanOperation ) )
            	    // InternalAle.g:1882:6: (lv_right_3_0= ruleBooleanOperation )
            	    {
            	    // InternalAle.g:1882:6: (lv_right_3_0= ruleBooleanOperation )
            	    // InternalAle.g:1883:7: lv_right_3_0= ruleBooleanOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getImpliesOperationAccess().getRightBooleanOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleBooleanOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getImpliesOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"ale.xtext.Ale.BooleanOperation");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImpliesOperation"


    // $ANTLR start "entryRuleBooleanOperation"
    // InternalAle.g:1906:1: entryRuleBooleanOperation returns [EObject current=null] : iv_ruleBooleanOperation= ruleBooleanOperation EOF ;
    public final EObject entryRuleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOperation = null;


        try {
            // InternalAle.g:1906:57: (iv_ruleBooleanOperation= ruleBooleanOperation EOF )
            // InternalAle.g:1907:2: iv_ruleBooleanOperation= ruleBooleanOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanOperation=ruleBooleanOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanOperation"


    // $ANTLR start "ruleBooleanOperation"
    // InternalAle.g:1913:1: ruleBooleanOperation returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* ) ;
    public final EObject ruleBooleanOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_CompareOperation_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1919:2: ( (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* ) )
            // InternalAle.g:1920:2: (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* )
            {
            // InternalAle.g:1920:2: (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* )
            // InternalAle.g:1921:3: this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBooleanOperationAccess().getCompareOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_30);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CompareOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:1929:3: ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )*
            loop28:
            do {
                int alt28=2;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA28_4 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt28=1;
                    }


                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // InternalAle.g:1930:4: ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) )
            	    {
            	    // InternalAle.g:1957:4: ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) )
            	    // InternalAle.g:1958:5: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) )
            	    {
            	    // InternalAle.g:1958:5: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // InternalAle.g:1959:6: ( () otherlv_2= 'or' )
            	            {
            	            // InternalAle.g:1959:6: ( () otherlv_2= 'or' )
            	            // InternalAle.g:1960:7: () otherlv_2= 'or'
            	            {
            	            // InternalAle.g:1960:7: ()
            	            // InternalAle.g:1961:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanOrOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,41,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getBooleanOperationAccess().getOrKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:1973:6: ( () otherlv_4= 'and' )
            	            {
            	            // InternalAle.g:1973:6: ( () otherlv_4= 'and' )
            	            // InternalAle.g:1974:7: () otherlv_4= 'and'
            	            {
            	            // InternalAle.g:1974:7: ()
            	            // InternalAle.g:1975:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanAndOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,42,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getBooleanOperationAccess().getAndKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalAle.g:1987:6: ( () otherlv_6= 'xor' )
            	            {
            	            // InternalAle.g:1987:6: ( () otherlv_6= 'xor' )
            	            // InternalAle.g:1988:7: () otherlv_6= 'xor'
            	            {
            	            // InternalAle.g:1988:7: ()
            	            // InternalAle.g:1989:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanXorOperationLeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,43,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getBooleanOperationAccess().getXorKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2001:5: ( (lv_right_7_0= ruleCompareOperation ) )
            	    // InternalAle.g:2002:6: (lv_right_7_0= ruleCompareOperation )
            	    {
            	    // InternalAle.g:2002:6: (lv_right_7_0= ruleCompareOperation )
            	    // InternalAle.g:2003:7: lv_right_7_0= ruleCompareOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getBooleanOperationAccess().getRightCompareOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_right_7_0=ruleCompareOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getBooleanOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_7_0,
            	      								"ale.xtext.Ale.CompareOperation");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanOperation"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalAle.g:2026:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalAle.g:2026:57: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalAle.g:2027:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalAle.g:2033:1: ruleCompareOperation returns [EObject current=null] : (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )* ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_EqualityOperation_0 = null;

        EObject lv_right_11_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2039:2: ( (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )* ) )
            // InternalAle.g:2040:2: (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )* )
            {
            // InternalAle.g:2040:2: (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )* )
            // InternalAle.g:2041:3: this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompareOperationAccess().getEqualityOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_EqualityOperation_0=ruleEqualityOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2049:3: ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )*
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA30_5 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA30_6 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt30=1;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // InternalAle.g:2050:4: ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) )
            	    {
            	    // InternalAle.g:2089:4: ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) )
            	    // InternalAle.g:2090:5: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) )
            	    {
            	    // InternalAle.g:2090:5: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) )
            	    int alt29=5;
            	    switch ( input.LA(1) ) {
            	    case 44:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt29=4;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt29=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // InternalAle.g:2091:6: ( () otherlv_2= '<=' )
            	            {
            	            // InternalAle.g:2091:6: ( () otherlv_2= '<=' )
            	            // InternalAle.g:2092:7: () otherlv_2= '<='
            	            {
            	            // InternalAle.g:2092:7: ()
            	            // InternalAle.g:2093:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareLEOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,44,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getCompareOperationAccess().getLessThanSignEqualsSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2105:6: ( () otherlv_4= '>=' )
            	            {
            	            // InternalAle.g:2105:6: ( () otherlv_4= '>=' )
            	            // InternalAle.g:2106:7: () otherlv_4= '>='
            	            {
            	            // InternalAle.g:2106:7: ()
            	            // InternalAle.g:2107:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareGEOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,45,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalAle.g:2119:6: ( () otherlv_6= '!=' )
            	            {
            	            // InternalAle.g:2119:6: ( () otherlv_6= '!=' )
            	            // InternalAle.g:2120:7: () otherlv_6= '!='
            	            {
            	            // InternalAle.g:2120:7: ()
            	            // InternalAle.g:2121:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareNEOperationLeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,46,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getCompareOperationAccess().getExclamationMarkEqualsSignKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalAle.g:2133:6: ( () otherlv_8= '<' )
            	            {
            	            // InternalAle.g:2133:6: ( () otherlv_8= '<' )
            	            // InternalAle.g:2134:7: () otherlv_8= '<'
            	            {
            	            // InternalAle.g:2134:7: ()
            	            // InternalAle.g:2135:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareLOperationLeftAction_1_0_0_3_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_8=(Token)match(input,47,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_8, grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1_0_0_3_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalAle.g:2147:6: ( () otherlv_10= '>' )
            	            {
            	            // InternalAle.g:2147:6: ( () otherlv_10= '>' )
            	            // InternalAle.g:2148:7: () otherlv_10= '>'
            	            {
            	            // InternalAle.g:2148:7: ()
            	            // InternalAle.g:2149:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareGOperationLeftAction_1_0_0_4_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_10=(Token)match(input,48,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_10, grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_1_0_0_4_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2161:5: ( (lv_right_11_0= ruleEqualityOperation ) )
            	    // InternalAle.g:2162:6: (lv_right_11_0= ruleEqualityOperation )
            	    {
            	    // InternalAle.g:2162:6: (lv_right_11_0= ruleEqualityOperation )
            	    // InternalAle.g:2163:7: lv_right_11_0= ruleEqualityOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getCompareOperationAccess().getRightEqualityOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_right_11_0=ruleEqualityOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getCompareOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_11_0,
            	      								"ale.xtext.Ale.EqualityOperation");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleEqualityOperation"
    // InternalAle.g:2186:1: entryRuleEqualityOperation returns [EObject current=null] : iv_ruleEqualityOperation= ruleEqualityOperation EOF ;
    public final EObject entryRuleEqualityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityOperation = null;


        try {
            // InternalAle.g:2186:58: (iv_ruleEqualityOperation= ruleEqualityOperation EOF )
            // InternalAle.g:2187:2: iv_ruleEqualityOperation= ruleEqualityOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityOperation=ruleEqualityOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityOperation"


    // $ANTLR start "ruleEqualityOperation"
    // InternalAle.g:2193:1: ruleEqualityOperation returns [EObject current=null] : (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* ) ;
    public final EObject ruleEqualityOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_MultOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2199:2: ( (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* ) )
            // InternalAle.g:2200:2: (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* )
            {
            // InternalAle.g:2200:2: (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* )
            // InternalAle.g:2201:3: this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityOperationAccess().getMultOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_MultOperation_0=ruleMultOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2209:3: ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==49) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred4_InternalAle()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalAle.g:2210:4: ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) )
            	    {
            	    // InternalAle.g:2225:4: ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) )
            	    // InternalAle.g:2226:5: () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) )
            	    {
            	    // InternalAle.g:2226:5: ()
            	    // InternalAle.g:2227:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getEqualityOperationAccess().getEqualityOperationLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalAle.g:2233:5: ( (lv_op_2_0= '==' ) )
            	    // InternalAle.g:2234:6: (lv_op_2_0= '==' )
            	    {
            	    // InternalAle.g:2234:6: (lv_op_2_0= '==' )
            	    // InternalAle.g:2235:7: lv_op_2_0= '=='
            	    {
            	    lv_op_2_0=(Token)match(input,49,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_op_2_0, grammarAccess.getEqualityOperationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getEqualityOperationRule());
            	      							}
            	      							setWithLastConsumed(current, "op", lv_op_2_0, "==");
            	      						
            	    }

            	    }


            	    }

            	    // InternalAle.g:2247:5: ( (lv_right_3_0= ruleMultOperation ) )
            	    // InternalAle.g:2248:6: (lv_right_3_0= ruleMultOperation )
            	    {
            	    // InternalAle.g:2248:6: (lv_right_3_0= ruleMultOperation )
            	    // InternalAle.g:2249:7: lv_right_3_0= ruleMultOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getEqualityOperationAccess().getRightMultOperationParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_right_3_0=ruleMultOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getEqualityOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"ale.xtext.Ale.MultOperation");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityOperation"


    // $ANTLR start "entryRuleMultOperation"
    // InternalAle.g:2272:1: entryRuleMultOperation returns [EObject current=null] : iv_ruleMultOperation= ruleMultOperation EOF ;
    public final EObject entryRuleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOperation = null;


        try {
            // InternalAle.g:2272:54: (iv_ruleMultOperation= ruleMultOperation EOF )
            // InternalAle.g:2273:2: iv_ruleMultOperation= ruleMultOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultOperation=ruleMultOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultOperation"


    // $ANTLR start "ruleMultOperation"
    // InternalAle.g:2279:1: ruleMultOperation returns [EObject current=null] : (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* ) ;
    public final EObject ruleMultOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AddOperation_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2285:2: ( (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* ) )
            // InternalAle.g:2286:2: (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* )
            {
            // InternalAle.g:2286:2: (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* )
            // InternalAle.g:2287:3: this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultOperationAccess().getAddOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_AddOperation_0=ruleAddOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2295:3: ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==50) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred5_InternalAle()) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==51) ) {
                    int LA33_3 = input.LA(2);

                    if ( (synpred5_InternalAle()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalAle.g:2296:4: ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) )
            	    {
            	    // InternalAle.g:2317:4: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) )
            	    // InternalAle.g:2318:5: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) )
            	    {
            	    // InternalAle.g:2318:5: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==50) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==51) ) {
            	        alt32=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalAle.g:2319:6: ( () otherlv_2= '*' )
            	            {
            	            // InternalAle.g:2319:6: ( () otherlv_2= '*' )
            	            // InternalAle.g:2320:7: () otherlv_2= '*'
            	            {
            	            // InternalAle.g:2320:7: ()
            	            // InternalAle.g:2321:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultOperationAccess().getMultOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,50,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getMultOperationAccess().getAsteriskKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2333:6: ( () otherlv_4= '/' )
            	            {
            	            // InternalAle.g:2333:6: ( () otherlv_4= '/' )
            	            // InternalAle.g:2334:7: () otherlv_4= '/'
            	            {
            	            // InternalAle.g:2334:7: ()
            	            // InternalAle.g:2335:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultOperationAccess().getDivOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,51,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getMultOperationAccess().getSolidusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2347:5: ( (lv_right_5_0= ruleAddOperation ) )
            	    // InternalAle.g:2348:6: (lv_right_5_0= ruleAddOperation )
            	    {
            	    // InternalAle.g:2348:6: (lv_right_5_0= ruleAddOperation )
            	    // InternalAle.g:2349:7: lv_right_5_0= ruleAddOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getMultOperationAccess().getRightAddOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_right_5_0=ruleAddOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getMultOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_5_0,
            	      								"ale.xtext.Ale.AddOperation");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultOperation"


    // $ANTLR start "entryRuleAddOperation"
    // InternalAle.g:2372:1: entryRuleAddOperation returns [EObject current=null] : iv_ruleAddOperation= ruleAddOperation EOF ;
    public final EObject entryRuleAddOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOperation = null;


        try {
            // InternalAle.g:2372:53: (iv_ruleAddOperation= ruleAddOperation EOF )
            // InternalAle.g:2373:2: iv_ruleAddOperation= ruleAddOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddOperation=ruleAddOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddOperation"


    // $ANTLR start "ruleAddOperation"
    // InternalAle.g:2379:1: ruleAddOperation returns [EObject current=null] : (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* ) ;
    public final EObject ruleAddOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ChaindedCall_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2385:2: ( (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* ) )
            // InternalAle.g:2386:2: (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* )
            {
            // InternalAle.g:2386:2: (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* )
            // InternalAle.g:2387:3: this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddOperationAccess().getChaindedCallParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_ChaindedCall_0=ruleChaindedCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ChaindedCall_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2395:3: ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==52) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred6_InternalAle()) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==53) ) {
                    int LA35_3 = input.LA(2);

                    if ( (synpred6_InternalAle()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // InternalAle.g:2396:4: ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) )
            	    {
            	    // InternalAle.g:2417:4: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) )
            	    // InternalAle.g:2418:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) )
            	    {
            	    // InternalAle.g:2418:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==52) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==53) ) {
            	        alt34=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalAle.g:2419:6: ( () otherlv_2= '+' )
            	            {
            	            // InternalAle.g:2419:6: ( () otherlv_2= '+' )
            	            // InternalAle.g:2420:7: () otherlv_2= '+'
            	            {
            	            // InternalAle.g:2420:7: ()
            	            // InternalAle.g:2421:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAddOperationAccess().getAddOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,52,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getAddOperationAccess().getPlusSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2433:6: ( () otherlv_4= '-' )
            	            {
            	            // InternalAle.g:2433:6: ( () otherlv_4= '-' )
            	            // InternalAle.g:2434:7: () otherlv_4= '-'
            	            {
            	            // InternalAle.g:2434:7: ()
            	            // InternalAle.g:2435:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAddOperationAccess().getSubOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,53,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getAddOperationAccess().getHyphenMinusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2447:5: ( (lv_right_5_0= ruleChaindedCall ) )
            	    // InternalAle.g:2448:6: (lv_right_5_0= ruleChaindedCall )
            	    {
            	    // InternalAle.g:2448:6: (lv_right_5_0= ruleChaindedCall )
            	    // InternalAle.g:2449:7: lv_right_5_0= ruleChaindedCall
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAddOperationAccess().getRightChaindedCallParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_right_5_0=ruleChaindedCall();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAddOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_5_0,
            	      								"ale.xtext.Ale.ChaindedCall");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddOperation"


    // $ANTLR start "entryRuleChaindedCall"
    // InternalAle.g:2472:1: entryRuleChaindedCall returns [EObject current=null] : iv_ruleChaindedCall= ruleChaindedCall EOF ;
    public final EObject entryRuleChaindedCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChaindedCall = null;


        try {
            // InternalAle.g:2472:53: (iv_ruleChaindedCall= ruleChaindedCall EOF )
            // InternalAle.g:2473:2: iv_ruleChaindedCall= ruleChaindedCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChaindedCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChaindedCall=ruleChaindedCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChaindedCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChaindedCall"


    // $ANTLR start "ruleChaindedCall"
    // InternalAle.g:2479:1: ruleChaindedCall returns [EObject current=null] : (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* ) ;
    public final EObject ruleChaindedCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_InfixOperation_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2485:2: ( (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* ) )
            // InternalAle.g:2486:2: (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* )
            {
            // InternalAle.g:2486:2: (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* )
            // InternalAle.g:2487:3: this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getChaindedCallAccess().getInfixOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_InfixOperation_0=ruleInfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_InfixOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2495:3: ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==54) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred7_InternalAle()) ) {
                        alt37=1;
                    }


                }
                else if ( (LA37_0==55) ) {
                    int LA37_3 = input.LA(2);

                    if ( (synpred7_InternalAle()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalAle.g:2496:4: ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) )
            	    {
            	    // InternalAle.g:2517:4: ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) )
            	    // InternalAle.g:2518:5: ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) )
            	    {
            	    // InternalAle.g:2518:5: ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==54) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==55) ) {
            	        alt36=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalAle.g:2519:6: ( () otherlv_2= '.' )
            	            {
            	            // InternalAle.g:2519:6: ( () otherlv_2= '.' )
            	            // InternalAle.g:2520:7: () otherlv_2= '.'
            	            {
            	            // InternalAle.g:2520:7: ()
            	            // InternalAle.g:2521:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getChaindedCallAccess().getChainedCallLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,54,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getChaindedCallAccess().getFullStopKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2533:6: ( () otherlv_4= '->' )
            	            {
            	            // InternalAle.g:2533:6: ( () otherlv_4= '->' )
            	            // InternalAle.g:2534:7: () otherlv_4= '->'
            	            {
            	            // InternalAle.g:2534:7: ()
            	            // InternalAle.g:2535:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getChaindedCallAccess().getChainedCallArrowLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,55,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getChaindedCallAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2547:5: ( (lv_right_5_0= ruleInfixOperation ) )
            	    // InternalAle.g:2548:6: (lv_right_5_0= ruleInfixOperation )
            	    {
            	    // InternalAle.g:2548:6: (lv_right_5_0= ruleInfixOperation )
            	    // InternalAle.g:2549:7: lv_right_5_0= ruleInfixOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getChaindedCallAccess().getRightInfixOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_right_5_0=ruleInfixOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getChaindedCallRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_5_0,
            	      								"ale.xtext.Ale.InfixOperation");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChaindedCall"


    // $ANTLR start "entryRuleInfixOperation"
    // InternalAle.g:2572:1: entryRuleInfixOperation returns [EObject current=null] : iv_ruleInfixOperation= ruleInfixOperation EOF ;
    public final EObject entryRuleInfixOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperation = null;


        try {
            // InternalAle.g:2572:55: (iv_ruleInfixOperation= ruleInfixOperation EOF )
            // InternalAle.g:2573:2: iv_ruleInfixOperation= ruleInfixOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInfixOperation=ruleInfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfixOperation"


    // $ANTLR start "ruleInfixOperation"
    // InternalAle.g:2579:1: ruleInfixOperation returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')' ) | ( () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' ) ) | this_AtomicLiteral_18= ruleAtomicLiteral ) ;
    public final EObject ruleInfixOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_parameters_14_0 = null;

        EObject lv_parameters_16_0 = null;

        EObject this_AtomicLiteral_18 = null;



        	enterRule();

        try {
            // InternalAle.g:2585:2: ( ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')' ) | ( () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' ) ) | this_AtomicLiteral_18= ruleAtomicLiteral ) )
            // InternalAle.g:2586:2: ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')' ) | ( () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' ) ) | this_AtomicLiteral_18= ruleAtomicLiteral )
            {
            // InternalAle.g:2586:2: ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')' ) | ( () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' ) ) | this_AtomicLiteral_18= ruleAtomicLiteral )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt40=1;
                }
                break;
            case 53:
                {
                alt40=2;
                }
                break;
            case 57:
                {
                alt40=3;
                }
                break;
            case RULE_ID:
                {
                int LA40_4 = input.LA(2);

                if ( (LA40_4==EOF||LA40_4==15||LA40_4==22||LA40_4==24||LA40_4==30||LA40_4==34||(LA40_4>=40 && LA40_4<=55)||LA40_4==61) ) {
                    alt40=5;
                }
                else if ( (LA40_4==29) ) {
                    alt40=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case RULE_BOOLEAN:
            case RULE_NULL:
            case 29:
            case 59:
            case 60:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt40=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalAle.g:2587:3: ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:2587:3: ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) )
                    // InternalAle.g:2588:4: () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // InternalAle.g:2588:4: ()
                    // InternalAle.g:2589:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getNotInfixOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,56,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getInfixOperationAccess().getNotKeyword_0_1());
                      			
                    }
                    // InternalAle.g:2599:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalAle.g:2600:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalAle.g:2600:5: (lv_expression_2_0= ruleExpression )
                    // InternalAle.g:2601:6: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInfixOperationAccess().getExpressionExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInfixOperationRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:2620:3: ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:2620:3: ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) )
                    // InternalAle.g:2621:4: () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) )
                    {
                    // InternalAle.g:2621:4: ()
                    // InternalAle.g:2622:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getNegInfixOperationAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,53,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getInfixOperationAccess().getHyphenMinusKeyword_1_1());
                      			
                    }
                    // InternalAle.g:2632:4: ( (lv_expression_5_0= ruleExpression ) )
                    // InternalAle.g:2633:5: (lv_expression_5_0= ruleExpression )
                    {
                    // InternalAle.g:2633:5: (lv_expression_5_0= ruleExpression )
                    // InternalAle.g:2634:6: lv_expression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInfixOperationAccess().getExpressionExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInfixOperationRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_5_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:2653:3: ( () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')' )
                    {
                    // InternalAle.g:2653:3: ( () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')' )
                    // InternalAle.g:2654:4: () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')'
                    {
                    // InternalAle.g:2654:4: ()
                    // InternalAle.g:2655:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getConstructorOperationAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,57,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getInfixOperationAccess().getNewKeyword_2_1());
                      			
                    }
                    // InternalAle.g:2665:4: ( (lv_name_8_0= RULE_ID ) )
                    // InternalAle.g:2666:5: (lv_name_8_0= RULE_ID )
                    {
                    // InternalAle.g:2666:5: (lv_name_8_0= RULE_ID )
                    // InternalAle.g:2667:6: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_8_0, grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInfixOperationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_8_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,29,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_2_3());
                      			
                    }
                    otherlv_10=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:2693:3: ( () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' ) )
                    {
                    // InternalAle.g:2693:3: ( () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' ) )
                    // InternalAle.g:2694:4: () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' )
                    {
                    // InternalAle.g:2694:4: ()
                    // InternalAle.g:2695:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getOperationCallOperationAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2701:4: ( (lv_name_12_0= RULE_ID ) )
                    // InternalAle.g:2702:5: (lv_name_12_0= RULE_ID )
                    {
                    // InternalAle.g:2702:5: (lv_name_12_0= RULE_ID )
                    // InternalAle.g:2703:6: lv_name_12_0= RULE_ID
                    {
                    lv_name_12_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_12_0, grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInfixOperationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_12_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalAle.g:2719:4: (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' )
                    // InternalAle.g:2720:5: otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')'
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_3_2_0());
                      				
                    }
                    // InternalAle.g:2724:5: ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_NULL)||LA39_0==29||LA39_0==53||(LA39_0>=56 && LA39_0<=57)||(LA39_0>=59 && LA39_0<=60)||(LA39_0>=62 && LA39_0<=65)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalAle.g:2725:6: ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )*
                            {
                            // InternalAle.g:2725:6: ( (lv_parameters_14_0= ruleParamCall ) )
                            // InternalAle.g:2726:7: (lv_parameters_14_0= ruleParamCall )
                            {
                            // InternalAle.g:2726:7: (lv_parameters_14_0= ruleParamCall )
                            // InternalAle.g:2727:8: lv_parameters_14_0= ruleParamCall
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_3_2_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_18);
                            lv_parameters_14_0=ruleParamCall();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getInfixOperationRule());
                              								}
                              								add(
                              									current,
                              									"parameters",
                              									lv_parameters_14_0,
                              									"ale.xtext.Ale.ParamCall");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalAle.g:2744:6: (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==22) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // InternalAle.g:2745:7: otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) )
                            	    {
                            	    otherlv_15=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_15, grammarAccess.getInfixOperationAccess().getCommaKeyword_3_2_1_1_0());
                            	      						
                            	    }
                            	    // InternalAle.g:2749:7: ( (lv_parameters_16_0= ruleParamCall ) )
                            	    // InternalAle.g:2750:8: (lv_parameters_16_0= ruleParamCall )
                            	    {
                            	    // InternalAle.g:2750:8: (lv_parameters_16_0= ruleParamCall )
                            	    // InternalAle.g:2751:9: lv_parameters_16_0= ruleParamCall
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_3_2_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_18);
                            	    lv_parameters_16_0=ruleParamCall();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getInfixOperationRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"parameters",
                            	      										lv_parameters_16_0,
                            	      										"ale.xtext.Ale.ParamCall");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_3_2_2());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:2777:3: this_AtomicLiteral_18= ruleAtomicLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInfixOperationAccess().getAtomicLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AtomicLiteral_18=ruleAtomicLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AtomicLiteral_18;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfixOperation"


    // $ANTLR start "entryRuleParamCall"
    // InternalAle.g:2789:1: entryRuleParamCall returns [EObject current=null] : iv_ruleParamCall= ruleParamCall EOF ;
    public final EObject entryRuleParamCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamCall = null;


        try {
            // InternalAle.g:2789:50: (iv_ruleParamCall= ruleParamCall EOF )
            // InternalAle.g:2790:2: iv_ruleParamCall= ruleParamCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParamCall=ruleParamCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamCall"


    // $ANTLR start "ruleParamCall"
    // InternalAle.g:2796:1: ruleParamCall returns [EObject current=null] : ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParamCall() throws RecognitionException {
        EObject current = null;

        Token lv_lambda_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2802:2: ( ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalAle.g:2803:2: ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalAle.g:2803:2: ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalAle.g:2804:3: ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalAle.g:2804:3: ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==58) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalAle.g:2805:4: ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|'
                    {
                    // InternalAle.g:2805:4: ( (lv_lambda_0_0= RULE_ID ) )
                    // InternalAle.g:2806:5: (lv_lambda_0_0= RULE_ID )
                    {
                    // InternalAle.g:2806:5: (lv_lambda_0_0= RULE_ID )
                    // InternalAle.g:2807:6: lv_lambda_0_0= RULE_ID
                    {
                    lv_lambda_0_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_lambda_0_0, grammarAccess.getParamCallAccess().getLambdaIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getParamCallRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"lambda",
                      							lv_lambda_0_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,58,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getParamCallAccess().getVerticalLineKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAle.g:2828:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalAle.g:2829:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalAle.g:2829:4: (lv_expression_2_0= ruleExpression )
            // InternalAle.g:2830:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParamCallAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParamCallRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"ale.xtext.Ale.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamCall"


    // $ANTLR start "entryRuleAtomicLiteral"
    // InternalAle.g:2851:1: entryRuleAtomicLiteral returns [EObject current=null] : iv_ruleAtomicLiteral= ruleAtomicLiteral EOF ;
    public final EObject entryRuleAtomicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicLiteral = null;


        try {
            // InternalAle.g:2851:54: (iv_ruleAtomicLiteral= ruleAtomicLiteral EOF )
            // InternalAle.g:2852:2: iv_ruleAtomicLiteral= ruleAtomicLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomicLiteral=ruleAtomicLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicLiteral"


    // $ANTLR start "ruleAtomicLiteral"
    // InternalAle.g:2858:1: ruleAtomicLiteral returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomicLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_value_13_0=null;
        Token lv_value_15_0=null;
        Token lv_value_17_0=null;
        Token lv_value_19_0=null;
        Token this_NULL_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token lv_value_44_0=null;
        EObject this_Expression_1 = null;

        EObject lv_exp_6_0 = null;

        EObject lv_start_24_0 = null;

        EObject lv_stop_27_0 = null;

        EObject lv_expressions_32_0 = null;

        EObject lv_expressions_34_0 = null;

        EObject lv_expressions_39_0 = null;

        EObject lv_expressions_41_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2864:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) ) )
            // InternalAle.g:2865:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) )
            {
            // InternalAle.g:2865:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) )
            int alt46=13;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt46=1;
                }
                break;
            case 59:
                {
                alt46=2;
                }
                break;
            case 62:
                {
                alt46=3;
                }
                break;
            case 63:
                {
                alt46=4;
                }
                break;
            case RULE_STRING:
                {
                alt46=5;
                }
                break;
            case RULE_INT:
                {
                alt46=6;
                }
                break;
            case RULE_REAL:
                {
                alt46=7;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt46=8;
                }
                break;
            case RULE_NULL:
                {
                alt46=9;
                }
                break;
            case 60:
                {
                alt46=10;
                }
                break;
            case 64:
                {
                alt46=11;
                }
                break;
            case 65:
                {
                alt46=12;
                }
                break;
            case RULE_ID:
                {
                alt46=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalAle.g:2866:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalAle.g:2866:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalAle.g:2867:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getAtomicLiteralAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_24);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAtomicLiteralAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:2885:3: ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' )
                    {
                    // InternalAle.g:2885:3: ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' )
                    // InternalAle.g:2886:4: () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']'
                    {
                    // InternalAle.g:2886:4: ()
                    // InternalAle.g:2887:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getOADenotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,59,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAtomicLiteralAccess().getDollarSignKeyword_1_1());
                      			
                    }
                    otherlv_5=(Token)match(input,60,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAtomicLiteralAccess().getLeftSquareBracketKeyword_1_2());
                      			
                    }
                    // InternalAle.g:2901:4: ( (lv_exp_6_0= ruleExpression ) )
                    // InternalAle.g:2902:5: (lv_exp_6_0= ruleExpression )
                    {
                    // InternalAle.g:2902:5: (lv_exp_6_0= ruleExpression )
                    // InternalAle.g:2903:6: lv_exp_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_exp_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_6_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAtomicLiteralAccess().getRightSquareBracketKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:2926:3: ( () otherlv_9= 'self' )
                    {
                    // InternalAle.g:2926:3: ( () otherlv_9= 'self' )
                    // InternalAle.g:2927:4: () otherlv_9= 'self'
                    {
                    // InternalAle.g:2927:4: ()
                    // InternalAle.g:2928:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getSelfRefAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getAtomicLiteralAccess().getSelfKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:2940:3: ( () otherlv_11= 'super' )
                    {
                    // InternalAle.g:2940:3: ( () otherlv_11= 'super' )
                    // InternalAle.g:2941:4: () otherlv_11= 'super'
                    {
                    // InternalAle.g:2941:4: ()
                    // InternalAle.g:2942:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getSuperRefAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getAtomicLiteralAccess().getSuperKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:2954:3: ( () ( (lv_value_13_0= RULE_STRING ) ) )
                    {
                    // InternalAle.g:2954:3: ( () ( (lv_value_13_0= RULE_STRING ) ) )
                    // InternalAle.g:2955:4: () ( (lv_value_13_0= RULE_STRING ) )
                    {
                    // InternalAle.g:2955:4: ()
                    // InternalAle.g:2956:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getStringLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2962:4: ( (lv_value_13_0= RULE_STRING ) )
                    // InternalAle.g:2963:5: (lv_value_13_0= RULE_STRING )
                    {
                    // InternalAle.g:2963:5: (lv_value_13_0= RULE_STRING )
                    // InternalAle.g:2964:6: lv_value_13_0= RULE_STRING
                    {
                    lv_value_13_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_13_0, grammarAccess.getAtomicLiteralAccess().getValueSTRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_13_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:2982:3: ( () ( (lv_value_15_0= RULE_INT ) ) )
                    {
                    // InternalAle.g:2982:3: ( () ( (lv_value_15_0= RULE_INT ) ) )
                    // InternalAle.g:2983:4: () ( (lv_value_15_0= RULE_INT ) )
                    {
                    // InternalAle.g:2983:4: ()
                    // InternalAle.g:2984:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getIntLiteralAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2990:4: ( (lv_value_15_0= RULE_INT ) )
                    // InternalAle.g:2991:5: (lv_value_15_0= RULE_INT )
                    {
                    // InternalAle.g:2991:5: (lv_value_15_0= RULE_INT )
                    // InternalAle.g:2992:6: lv_value_15_0= RULE_INT
                    {
                    lv_value_15_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_15_0, grammarAccess.getAtomicLiteralAccess().getValueINTTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_15_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:3010:3: ( () ( (lv_value_17_0= RULE_REAL ) ) )
                    {
                    // InternalAle.g:3010:3: ( () ( (lv_value_17_0= RULE_REAL ) ) )
                    // InternalAle.g:3011:4: () ( (lv_value_17_0= RULE_REAL ) )
                    {
                    // InternalAle.g:3011:4: ()
                    // InternalAle.g:3012:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getRealLiteralAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3018:4: ( (lv_value_17_0= RULE_REAL ) )
                    // InternalAle.g:3019:5: (lv_value_17_0= RULE_REAL )
                    {
                    // InternalAle.g:3019:5: (lv_value_17_0= RULE_REAL )
                    // InternalAle.g:3020:6: lv_value_17_0= RULE_REAL
                    {
                    lv_value_17_0=(Token)match(input,RULE_REAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_17_0, grammarAccess.getAtomicLiteralAccess().getValueREALTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_17_0,
                      							"ale.xtext.Ale.REAL");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalAle.g:3038:3: ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalAle.g:3038:3: ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) )
                    // InternalAle.g:3039:4: () ( (lv_value_19_0= RULE_BOOLEAN ) )
                    {
                    // InternalAle.g:3039:4: ()
                    // InternalAle.g:3040:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getBooleanLiteralAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3046:4: ( (lv_value_19_0= RULE_BOOLEAN ) )
                    // InternalAle.g:3047:5: (lv_value_19_0= RULE_BOOLEAN )
                    {
                    // InternalAle.g:3047:5: (lv_value_19_0= RULE_BOOLEAN )
                    // InternalAle.g:3048:6: lv_value_19_0= RULE_BOOLEAN
                    {
                    lv_value_19_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_19_0, grammarAccess.getAtomicLiteralAccess().getValueBOOLEANTerminalRuleCall_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_19_0,
                      							"ale.xtext.Ale.BOOLEAN");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalAle.g:3066:3: ( () this_NULL_21= RULE_NULL )
                    {
                    // InternalAle.g:3066:3: ( () this_NULL_21= RULE_NULL )
                    // InternalAle.g:3067:4: () this_NULL_21= RULE_NULL
                    {
                    // InternalAle.g:3067:4: ()
                    // InternalAle.g:3068:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getNullLiteralAction_8_0(),
                      						current);
                      				
                    }

                    }

                    this_NULL_21=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_NULL_21, grammarAccess.getAtomicLiteralAccess().getNULLTerminalRuleCall_8_1());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalAle.g:3080:3: ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' )
                    {
                    // InternalAle.g:3080:3: ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' )
                    // InternalAle.g:3081:4: () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']'
                    {
                    // InternalAle.g:3081:4: ()
                    // InternalAle.g:3082:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getIntRangeAction_9_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_23=(Token)match(input,60,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getAtomicLiteralAccess().getLeftSquareBracketKeyword_9_1());
                      			
                    }
                    // InternalAle.g:3092:4: ( (lv_start_24_0= ruleExpression ) )
                    // InternalAle.g:3093:5: (lv_start_24_0= ruleExpression )
                    {
                    // InternalAle.g:3093:5: (lv_start_24_0= ruleExpression )
                    // InternalAle.g:3094:6: lv_start_24_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicLiteralAccess().getStartExpressionParserRuleCall_9_2_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
                    lv_start_24_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                      						}
                      						set(
                      							current,
                      							"start",
                      							lv_start_24_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,54,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_9_3());
                      			
                    }
                    otherlv_26=(Token)match(input,54,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_9_4());
                      			
                    }
                    // InternalAle.g:3119:4: ( (lv_stop_27_0= ruleExpression ) )
                    // InternalAle.g:3120:5: (lv_stop_27_0= ruleExpression )
                    {
                    // InternalAle.g:3120:5: (lv_stop_27_0= ruleExpression )
                    // InternalAle.g:3121:6: lv_stop_27_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicLiteralAccess().getStopExpressionParserRuleCall_9_5_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_stop_27_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                      						}
                      						set(
                      							current,
                      							"stop",
                      							lv_stop_27_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_28=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_28, grammarAccess.getAtomicLiteralAccess().getRightSquareBracketKeyword_9_6());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalAle.g:3144:3: ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' )
                    {
                    // InternalAle.g:3144:3: ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' )
                    // InternalAle.g:3145:4: () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}'
                    {
                    // InternalAle.g:3145:4: ()
                    // InternalAle.g:3146:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getSequenceDeclAction_10_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_30=(Token)match(input,64,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getAtomicLiteralAccess().getSequenceKeyword_10_1());
                      			
                    }
                    otherlv_31=(Token)match(input,23,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_10_2());
                      			
                    }
                    // InternalAle.g:3160:4: ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_NULL)||LA43_0==29||LA43_0==53||(LA43_0>=56 && LA43_0<=57)||(LA43_0>=59 && LA43_0<=60)||(LA43_0>=62 && LA43_0<=65)) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalAle.g:3161:5: ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )*
                            {
                            // InternalAle.g:3161:5: ( (lv_expressions_32_0= ruleExpression ) )
                            // InternalAle.g:3162:6: (lv_expressions_32_0= ruleExpression )
                            {
                            // InternalAle.g:3162:6: (lv_expressions_32_0= ruleExpression )
                            // InternalAle.g:3163:7: lv_expressions_32_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_42);
                            lv_expressions_32_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                              							}
                              							add(
                              								current,
                              								"expressions",
                              								lv_expressions_32_0,
                              								"ale.xtext.Ale.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalAle.g:3180:5: (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==22) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // InternalAle.g:3181:6: otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) )
                            	    {
                            	    otherlv_33=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_33, grammarAccess.getAtomicLiteralAccess().getCommaKeyword_10_3_1_0());
                            	      					
                            	    }
                            	    // InternalAle.g:3185:6: ( (lv_expressions_34_0= ruleExpression ) )
                            	    // InternalAle.g:3186:7: (lv_expressions_34_0= ruleExpression )
                            	    {
                            	    // InternalAle.g:3186:7: (lv_expressions_34_0= ruleExpression )
                            	    // InternalAle.g:3187:8: lv_expressions_34_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_42);
                            	    lv_expressions_34_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"expressions",
                            	      									lv_expressions_34_0,
                            	      									"ale.xtext.Ale.Expression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_35=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_10_4());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalAle.g:3212:3: ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' )
                    {
                    // InternalAle.g:3212:3: ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' )
                    // InternalAle.g:3213:4: () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}'
                    {
                    // InternalAle.g:3213:4: ()
                    // InternalAle.g:3214:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getOrderedSetDeclAction_11_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_37=(Token)match(input,65,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getAtomicLiteralAccess().getOrderedSetKeyword_11_1());
                      			
                    }
                    otherlv_38=(Token)match(input,23,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_11_2());
                      			
                    }
                    // InternalAle.g:3228:4: ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_NULL)||LA45_0==29||LA45_0==53||(LA45_0>=56 && LA45_0<=57)||(LA45_0>=59 && LA45_0<=60)||(LA45_0>=62 && LA45_0<=65)) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalAle.g:3229:5: ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )*
                            {
                            // InternalAle.g:3229:5: ( (lv_expressions_39_0= ruleExpression ) )
                            // InternalAle.g:3230:6: (lv_expressions_39_0= ruleExpression )
                            {
                            // InternalAle.g:3230:6: (lv_expressions_39_0= ruleExpression )
                            // InternalAle.g:3231:7: lv_expressions_39_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_11_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_42);
                            lv_expressions_39_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                              							}
                              							add(
                              								current,
                              								"expressions",
                              								lv_expressions_39_0,
                              								"ale.xtext.Ale.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalAle.g:3248:5: (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==22) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // InternalAle.g:3249:6: otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) )
                            	    {
                            	    otherlv_40=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_40, grammarAccess.getAtomicLiteralAccess().getCommaKeyword_11_3_1_0());
                            	      					
                            	    }
                            	    // InternalAle.g:3253:6: ( (lv_expressions_41_0= ruleExpression ) )
                            	    // InternalAle.g:3254:7: (lv_expressions_41_0= ruleExpression )
                            	    {
                            	    // InternalAle.g:3254:7: (lv_expressions_41_0= ruleExpression )
                            	    // InternalAle.g:3255:8: lv_expressions_41_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_11_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_42);
                            	    lv_expressions_41_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"expressions",
                            	      									lv_expressions_41_0,
                            	      									"ale.xtext.Ale.Expression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_42=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_42, grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_11_4());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalAle.g:3280:3: ( () ( (lv_value_44_0= RULE_ID ) ) )
                    {
                    // InternalAle.g:3280:3: ( () ( (lv_value_44_0= RULE_ID ) ) )
                    // InternalAle.g:3281:4: () ( (lv_value_44_0= RULE_ID ) )
                    {
                    // InternalAle.g:3281:4: ()
                    // InternalAle.g:3282:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getVarRefAction_12_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3288:4: ( (lv_value_44_0= RULE_ID ) )
                    // InternalAle.g:3289:5: (lv_value_44_0= RULE_ID )
                    {
                    // InternalAle.g:3289:5: (lv_value_44_0= RULE_ID )
                    // InternalAle.g:3290:6: lv_value_44_0= RULE_ID
                    {
                    lv_value_44_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_44_0, grammarAccess.getAtomicLiteralAccess().getValueIDTerminalRuleCall_12_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_44_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicLiteral"


    // $ANTLR start "entryRuleParam"
    // InternalAle.g:3311:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalAle.g:3311:46: (iv_ruleParam= ruleParam EOF )
            // InternalAle.g:3312:2: iv_ruleParam= ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParam; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalAle.g:3318:1: ruleParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalAle.g:3324:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAle.g:3325:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAle.g:3325:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAle.g:3326:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAle.g:3326:3: ( (lv_type_0_0= ruleType ) )
            // InternalAle.g:3327:4: (lv_type_0_0= ruleType )
            {
            // InternalAle.g:3327:4: (lv_type_0_0= ruleType )
            // InternalAle.g:3328:5: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParamAccess().getTypeTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParamRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"ale.xtext.Ale.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:3345:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAle.g:3346:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAle.g:3346:4: (lv_name_1_0= RULE_ID )
            // InternalAle.g:3347:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParamRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleType"
    // InternalAle.g:3367:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAle.g:3367:45: (iv_ruleType= ruleType EOF )
            // InternalAle.g:3368:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalAle.g:3374:1: ruleType returns [EObject current=null] : (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_externalClass_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_LiteralType_0 = null;

        EObject lv_subType_6_0 = null;

        EObject lv_subType_11_0 = null;



        	enterRule();

        try {
            // InternalAle.g:3380:2: ( (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) ) )
            // InternalAle.g:3381:2: (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) )
            {
            // InternalAle.g:3381:2: (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt47=1;
                }
                break;
            case RULE_ID:
                {
                alt47=2;
                }
                break;
            case 64:
                {
                alt47=3;
                }
                break;
            case 65:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalAle.g:3382:3: this_LiteralType_0= ruleLiteralType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getLiteralTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralType_0=ruleLiteralType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:3391:3: ( () ( (lv_externalClass_2_0= RULE_ID ) ) )
                    {
                    // InternalAle.g:3391:3: ( () ( (lv_externalClass_2_0= RULE_ID ) ) )
                    // InternalAle.g:3392:4: () ( (lv_externalClass_2_0= RULE_ID ) )
                    {
                    // InternalAle.g:3392:4: ()
                    // InternalAle.g:3393:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getOutOfScopeTypeAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3399:4: ( (lv_externalClass_2_0= RULE_ID ) )
                    // InternalAle.g:3400:5: (lv_externalClass_2_0= RULE_ID )
                    {
                    // InternalAle.g:3400:5: (lv_externalClass_2_0= RULE_ID )
                    // InternalAle.g:3401:6: lv_externalClass_2_0= RULE_ID
                    {
                    lv_externalClass_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_externalClass_2_0, grammarAccess.getTypeAccess().getExternalClassIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"externalClass",
                      							lv_externalClass_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:3419:3: ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' )
                    {
                    // InternalAle.g:3419:3: ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' )
                    // InternalAle.g:3420:4: () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')'
                    {
                    // InternalAle.g:3420:4: ()
                    // InternalAle.g:3421:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getSequenceTypeAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,64,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getSequenceKeyword_2_1());
                      			
                    }
                    otherlv_5=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2());
                      			
                    }
                    // InternalAle.g:3435:4: ( (lv_subType_6_0= ruleType ) )
                    // InternalAle.g:3436:5: (lv_subType_6_0= ruleType )
                    {
                    // InternalAle.g:3436:5: (lv_subType_6_0= ruleType )
                    // InternalAle.g:3437:6: lv_subType_6_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_subType_6_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeRule());
                      						}
                      						set(
                      							current,
                      							"subType",
                      							lv_subType_6_0,
                      							"ale.xtext.Ale.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:3460:3: ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' )
                    {
                    // InternalAle.g:3460:3: ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' )
                    // InternalAle.g:3461:4: () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')'
                    {
                    // InternalAle.g:3461:4: ()
                    // InternalAle.g:3462:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getOrderedSetTypeAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,65,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getOrderedSetKeyword_3_1());
                      			
                    }
                    otherlv_10=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_3_2());
                      			
                    }
                    // InternalAle.g:3476:4: ( (lv_subType_11_0= ruleType ) )
                    // InternalAle.g:3477:5: (lv_subType_11_0= ruleType )
                    {
                    // InternalAle.g:3477:5: (lv_subType_11_0= ruleType )
                    // InternalAle.g:3478:6: lv_subType_11_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_subType_11_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeRule());
                      						}
                      						set(
                      							current,
                      							"subType",
                      							lv_subType_11_0,
                      							"ale.xtext.Ale.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getTypeAccess().getRightParenthesisKeyword_3_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLiteralType"
    // InternalAle.g:3504:1: entryRuleLiteralType returns [EObject current=null] : iv_ruleLiteralType= ruleLiteralType EOF ;
    public final EObject entryRuleLiteralType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralType = null;


        try {
            // InternalAle.g:3504:52: (iv_ruleLiteralType= ruleLiteralType EOF )
            // InternalAle.g:3505:2: iv_ruleLiteralType= ruleLiteralType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralType=ruleLiteralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralType"


    // $ANTLR start "ruleLiteralType"
    // InternalAle.g:3511:1: ruleLiteralType returns [EObject current=null] : ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' ) ) ) ;
    public final EObject ruleLiteralType() throws RecognitionException {
        EObject current = null;

        Token lv_lit_0_1=null;
        Token lv_lit_0_2=null;
        Token lv_lit_0_3=null;
        Token lv_lit_0_4=null;


        	enterRule();

        try {
            // InternalAle.g:3517:2: ( ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' ) ) ) )
            // InternalAle.g:3518:2: ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' ) ) )
            {
            // InternalAle.g:3518:2: ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' ) ) )
            // InternalAle.g:3519:3: ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' ) )
            {
            // InternalAle.g:3519:3: ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' ) )
            // InternalAle.g:3520:4: (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' )
            {
            // InternalAle.g:3520:4: (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt48=1;
                }
                break;
            case 67:
                {
                alt48=2;
                }
                break;
            case 68:
                {
                alt48=3;
                }
                break;
            case 69:
                {
                alt48=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalAle.g:3521:5: lv_lit_0_1= 'Boolean'
                    {
                    lv_lit_0_1=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_lit_0_1, grammarAccess.getLiteralTypeAccess().getLitBooleanKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLiteralTypeRule());
                      					}
                      					setWithLastConsumed(current, "lit", lv_lit_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:3532:5: lv_lit_0_2= 'Real'
                    {
                    lv_lit_0_2=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_lit_0_2, grammarAccess.getLiteralTypeAccess().getLitRealKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLiteralTypeRule());
                      					}
                      					setWithLastConsumed(current, "lit", lv_lit_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalAle.g:3543:5: lv_lit_0_3= 'Int'
                    {
                    lv_lit_0_3=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_lit_0_3, grammarAccess.getLiteralTypeAccess().getLitIntKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLiteralTypeRule());
                      					}
                      					setWithLastConsumed(current, "lit", lv_lit_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalAle.g:3554:5: lv_lit_0_4= 'String'
                    {
                    lv_lit_0_4=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_lit_0_4, grammarAccess.getLiteralTypeAccess().getLitStringKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLiteralTypeRule());
                      					}
                      					setWithLastConsumed(current, "lit", lv_lit_0_4, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralType"


    // $ANTLR start "entryRuleQualified"
    // InternalAle.g:3570:1: entryRuleQualified returns [String current=null] : iv_ruleQualified= ruleQualified EOF ;
    public final String entryRuleQualified() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualified = null;


        try {
            // InternalAle.g:3570:49: (iv_ruleQualified= ruleQualified EOF )
            // InternalAle.g:3571:2: iv_ruleQualified= ruleQualified EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualified=ruleQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualified.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualified"


    // $ANTLR start "ruleQualified"
    // InternalAle.g:3577:1: ruleQualified returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualified() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAle.g:3583:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAle.g:3584:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAle.g:3584:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAle.g:3585:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAle.g:3592:3: (kw= '.' this_ID_2= RULE_ID )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==54) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAle.g:3593:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualified"


    // $ANTLR start "entryRuleTypeSystem"
    // InternalAle.g:3610:1: entryRuleTypeSystem returns [EObject current=null] : iv_ruleTypeSystem= ruleTypeSystem EOF ;
    public final EObject entryRuleTypeSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSystem = null;


        try {
            // InternalAle.g:3610:51: (iv_ruleTypeSystem= ruleTypeSystem EOF )
            // InternalAle.g:3611:2: iv_ruleTypeSystem= ruleTypeSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeSystem=ruleTypeSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSystem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSystem"


    // $ANTLR start "ruleTypeSystem"
    // InternalAle.g:3617:1: ruleTypeSystem returns [EObject current=null] : ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Real' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) ) ;
    public final EObject ruleTypeSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_subType_12_0 = null;



        	enterRule();

        try {
            // InternalAle.g:3623:2: ( ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Real' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) ) )
            // InternalAle.g:3624:2: ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Real' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) )
            {
            // InternalAle.g:3624:2: ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Real' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) )
            int alt50=7;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt50=1;
                }
                break;
            case 67:
                {
                alt50=2;
                }
                break;
            case 68:
                {
                alt50=3;
                }
                break;
            case 69:
                {
                alt50=4;
                }
                break;
            case 70:
                {
                alt50=5;
                }
                break;
            case 64:
                {
                alt50=6;
                }
                break;
            case 20:
                {
                alt50=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalAle.g:3625:3: ( () otherlv_1= 'Boolean' )
                    {
                    // InternalAle.g:3625:3: ( () otherlv_1= 'Boolean' )
                    // InternalAle.g:3626:4: () otherlv_1= 'Boolean'
                    {
                    // InternalAle.g:3626:4: ()
                    // InternalAle.g:3627:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getBooleanTypeTAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeSystemAccess().getBooleanKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:3639:3: ( () otherlv_3= 'Real' )
                    {
                    // InternalAle.g:3639:3: ( () otherlv_3= 'Real' )
                    // InternalAle.g:3640:4: () otherlv_3= 'Real'
                    {
                    // InternalAle.g:3640:4: ()
                    // InternalAle.g:3641:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getRealTypeTAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypeSystemAccess().getRealKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:3653:3: ( () otherlv_5= 'Int' )
                    {
                    // InternalAle.g:3653:3: ( () otherlv_5= 'Int' )
                    // InternalAle.g:3654:4: () otherlv_5= 'Int'
                    {
                    // InternalAle.g:3654:4: ()
                    // InternalAle.g:3655:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getIntTypeTAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTypeSystemAccess().getIntKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:3667:3: ( () otherlv_7= 'String' )
                    {
                    // InternalAle.g:3667:3: ( () otherlv_7= 'String' )
                    // InternalAle.g:3668:4: () otherlv_7= 'String'
                    {
                    // InternalAle.g:3668:4: ()
                    // InternalAle.g:3669:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getStringTypeTAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTypeSystemAccess().getStringKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:3681:3: ( () otherlv_9= 'nulltype' )
                    {
                    // InternalAle.g:3681:3: ( () otherlv_9= 'nulltype' )
                    // InternalAle.g:3682:4: () otherlv_9= 'nulltype'
                    {
                    // InternalAle.g:3682:4: ()
                    // InternalAle.g:3683:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getNullTypeTAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTypeSystemAccess().getNulltypeKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:3695:3: ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) )
                    {
                    // InternalAle.g:3695:3: ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) )
                    // InternalAle.g:3696:4: () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) )
                    {
                    // InternalAle.g:3696:4: ()
                    // InternalAle.g:3697:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getSequenceTypeTAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,64,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTypeSystemAccess().getSequenceKeyword_5_1());
                      			
                    }
                    // InternalAle.g:3707:4: ( (lv_subType_12_0= ruleTypeSystem ) )
                    // InternalAle.g:3708:5: (lv_subType_12_0= ruleTypeSystem )
                    {
                    // InternalAle.g:3708:5: (lv_subType_12_0= ruleTypeSystem )
                    // InternalAle.g:3709:6: lv_subType_12_0= ruleTypeSystem
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeSystemAccess().getSubTypeTypeSystemParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_subType_12_0=ruleTypeSystem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeSystemRule());
                      						}
                      						set(
                      							current,
                      							"subType",
                      							lv_subType_12_0,
                      							"ale.xtext.Ale.TypeSystem");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:3728:3: ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) )
                    {
                    // InternalAle.g:3728:3: ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) )
                    // InternalAle.g:3729:4: () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) )
                    {
                    // InternalAle.g:3729:4: ()
                    // InternalAle.g:3730:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getClassTypeTAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_14=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTypeSystemAccess().getClassKeyword_6_1());
                      			
                    }
                    // InternalAle.g:3740:4: ( (otherlv_15= RULE_ID ) )
                    // InternalAle.g:3741:5: (otherlv_15= RULE_ID )
                    {
                    // InternalAle.g:3741:5: (otherlv_15= RULE_ID )
                    // InternalAle.g:3742:6: otherlv_15= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeSystemRule());
                      						}
                      					
                    }
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_15, grammarAccess.getTypeSystemAccess().getClazzAleClassCrossReference_6_2_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSystem"

    // $ANTLR start synpred1_InternalAle
    public final void synpred1_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:1854:4: ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )
        // InternalAle.g:1854:5: ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) )
        {
        // InternalAle.g:1854:5: ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) )
        // InternalAle.g:1855:5: ( () 'implies' ) ( ( ruleBooleanOperation ) )
        {
        // InternalAle.g:1855:5: ( () 'implies' )
        // InternalAle.g:1856:6: () 'implies'
        {
        // InternalAle.g:1856:6: ()
        // InternalAle.g:1857:6: 
        {
        }

        match(input,40,FOLLOW_21); if (state.failed) return ;

        }

        // InternalAle.g:1860:5: ( ( ruleBooleanOperation ) )
        // InternalAle.g:1861:6: ( ruleBooleanOperation )
        {
        // InternalAle.g:1861:6: ( ruleBooleanOperation )
        // InternalAle.g:1862:7: ruleBooleanOperation
        {
        pushFollow(FOLLOW_2);
        ruleBooleanOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalAle

    // $ANTLR start synpred2_InternalAle
    public final void synpred2_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:1930:4: ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )
        // InternalAle.g:1930:5: ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) )
        {
        // InternalAle.g:1930:5: ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) )
        // InternalAle.g:1931:5: ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) )
        {
        // InternalAle.g:1931:5: ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) )
        int alt51=3;
        switch ( input.LA(1) ) {
        case 41:
            {
            alt51=1;
            }
            break;
        case 42:
            {
            alt51=2;
            }
            break;
        case 43:
            {
            alt51=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 51, 0, input);

            throw nvae;
        }

        switch (alt51) {
            case 1 :
                // InternalAle.g:1932:6: ( () 'or' )
                {
                // InternalAle.g:1932:6: ( () 'or' )
                // InternalAle.g:1933:7: () 'or'
                {
                // InternalAle.g:1933:7: ()
                // InternalAle.g:1934:7: 
                {
                }

                match(input,41,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:1938:6: ( () 'and' )
                {
                // InternalAle.g:1938:6: ( () 'and' )
                // InternalAle.g:1939:7: () 'and'
                {
                // InternalAle.g:1939:7: ()
                // InternalAle.g:1940:7: 
                {
                }

                match(input,42,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalAle.g:1944:6: ( () 'xor' )
                {
                // InternalAle.g:1944:6: ( () 'xor' )
                // InternalAle.g:1945:7: () 'xor'
                {
                // InternalAle.g:1945:7: ()
                // InternalAle.g:1946:7: 
                {
                }

                match(input,43,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:1950:5: ( ( ruleCompareOperation ) )
        // InternalAle.g:1951:6: ( ruleCompareOperation )
        {
        // InternalAle.g:1951:6: ( ruleCompareOperation )
        // InternalAle.g:1952:7: ruleCompareOperation
        {
        pushFollow(FOLLOW_2);
        ruleCompareOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalAle

    // $ANTLR start synpred3_InternalAle
    public final void synpred3_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:2050:4: ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )
        // InternalAle.g:2050:5: ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) )
        {
        // InternalAle.g:2050:5: ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) )
        // InternalAle.g:2051:5: ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) )
        {
        // InternalAle.g:2051:5: ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) )
        int alt52=5;
        switch ( input.LA(1) ) {
        case 44:
            {
            alt52=1;
            }
            break;
        case 45:
            {
            alt52=2;
            }
            break;
        case 46:
            {
            alt52=3;
            }
            break;
        case 47:
            {
            alt52=4;
            }
            break;
        case 48:
            {
            alt52=5;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 52, 0, input);

            throw nvae;
        }

        switch (alt52) {
            case 1 :
                // InternalAle.g:2052:6: ( () '<=' )
                {
                // InternalAle.g:2052:6: ( () '<=' )
                // InternalAle.g:2053:7: () '<='
                {
                // InternalAle.g:2053:7: ()
                // InternalAle.g:2054:7: 
                {
                }

                match(input,44,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2058:6: ( () '>=' )
                {
                // InternalAle.g:2058:6: ( () '>=' )
                // InternalAle.g:2059:7: () '>='
                {
                // InternalAle.g:2059:7: ()
                // InternalAle.g:2060:7: 
                {
                }

                match(input,45,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalAle.g:2064:6: ( () '!=' )
                {
                // InternalAle.g:2064:6: ( () '!=' )
                // InternalAle.g:2065:7: () '!='
                {
                // InternalAle.g:2065:7: ()
                // InternalAle.g:2066:7: 
                {
                }

                match(input,46,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // InternalAle.g:2070:6: ( () '<' )
                {
                // InternalAle.g:2070:6: ( () '<' )
                // InternalAle.g:2071:7: () '<'
                {
                // InternalAle.g:2071:7: ()
                // InternalAle.g:2072:7: 
                {
                }

                match(input,47,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 5 :
                // InternalAle.g:2076:6: ( () '>' )
                {
                // InternalAle.g:2076:6: ( () '>' )
                // InternalAle.g:2077:7: () '>'
                {
                // InternalAle.g:2077:7: ()
                // InternalAle.g:2078:7: 
                {
                }

                match(input,48,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2082:5: ( ( ruleEqualityOperation ) )
        // InternalAle.g:2083:6: ( ruleEqualityOperation )
        {
        // InternalAle.g:2083:6: ( ruleEqualityOperation )
        // InternalAle.g:2084:7: ruleEqualityOperation
        {
        pushFollow(FOLLOW_2);
        ruleEqualityOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalAle

    // $ANTLR start synpred4_InternalAle
    public final void synpred4_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:2210:4: ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )
        // InternalAle.g:2210:5: ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) )
        {
        // InternalAle.g:2210:5: ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) )
        // InternalAle.g:2211:5: () ( ( '==' ) ) ( ( ruleMultOperation ) )
        {
        // InternalAle.g:2211:5: ()
        // InternalAle.g:2212:5: 
        {
        }

        // InternalAle.g:2213:5: ( ( '==' ) )
        // InternalAle.g:2214:6: ( '==' )
        {
        // InternalAle.g:2214:6: ( '==' )
        // InternalAle.g:2215:7: '=='
        {
        match(input,49,FOLLOW_21); if (state.failed) return ;

        }


        }

        // InternalAle.g:2218:5: ( ( ruleMultOperation ) )
        // InternalAle.g:2219:6: ( ruleMultOperation )
        {
        // InternalAle.g:2219:6: ( ruleMultOperation )
        // InternalAle.g:2220:7: ruleMultOperation
        {
        pushFollow(FOLLOW_2);
        ruleMultOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalAle

    // $ANTLR start synpred5_InternalAle
    public final void synpred5_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:2296:4: ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )
        // InternalAle.g:2296:5: ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) )
        {
        // InternalAle.g:2296:5: ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) )
        // InternalAle.g:2297:5: ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) )
        {
        // InternalAle.g:2297:5: ( ( () '*' ) | ( () '/' ) )
        int alt53=2;
        int LA53_0 = input.LA(1);

        if ( (LA53_0==50) ) {
            alt53=1;
        }
        else if ( (LA53_0==51) ) {
            alt53=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 53, 0, input);

            throw nvae;
        }
        switch (alt53) {
            case 1 :
                // InternalAle.g:2298:6: ( () '*' )
                {
                // InternalAle.g:2298:6: ( () '*' )
                // InternalAle.g:2299:7: () '*'
                {
                // InternalAle.g:2299:7: ()
                // InternalAle.g:2300:7: 
                {
                }

                match(input,50,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2304:6: ( () '/' )
                {
                // InternalAle.g:2304:6: ( () '/' )
                // InternalAle.g:2305:7: () '/'
                {
                // InternalAle.g:2305:7: ()
                // InternalAle.g:2306:7: 
                {
                }

                match(input,51,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2310:5: ( ( ruleAddOperation ) )
        // InternalAle.g:2311:6: ( ruleAddOperation )
        {
        // InternalAle.g:2311:6: ( ruleAddOperation )
        // InternalAle.g:2312:7: ruleAddOperation
        {
        pushFollow(FOLLOW_2);
        ruleAddOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalAle

    // $ANTLR start synpred6_InternalAle
    public final void synpred6_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:2396:4: ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )
        // InternalAle.g:2396:5: ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) )
        {
        // InternalAle.g:2396:5: ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) )
        // InternalAle.g:2397:5: ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) )
        {
        // InternalAle.g:2397:5: ( ( () '+' ) | ( () '-' ) )
        int alt54=2;
        int LA54_0 = input.LA(1);

        if ( (LA54_0==52) ) {
            alt54=1;
        }
        else if ( (LA54_0==53) ) {
            alt54=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 54, 0, input);

            throw nvae;
        }
        switch (alt54) {
            case 1 :
                // InternalAle.g:2398:6: ( () '+' )
                {
                // InternalAle.g:2398:6: ( () '+' )
                // InternalAle.g:2399:7: () '+'
                {
                // InternalAle.g:2399:7: ()
                // InternalAle.g:2400:7: 
                {
                }

                match(input,52,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2404:6: ( () '-' )
                {
                // InternalAle.g:2404:6: ( () '-' )
                // InternalAle.g:2405:7: () '-'
                {
                // InternalAle.g:2405:7: ()
                // InternalAle.g:2406:7: 
                {
                }

                match(input,53,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2410:5: ( ( ruleChaindedCall ) )
        // InternalAle.g:2411:6: ( ruleChaindedCall )
        {
        // InternalAle.g:2411:6: ( ruleChaindedCall )
        // InternalAle.g:2412:7: ruleChaindedCall
        {
        pushFollow(FOLLOW_2);
        ruleChaindedCall();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalAle

    // $ANTLR start synpred7_InternalAle
    public final void synpred7_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:2496:4: ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )
        // InternalAle.g:2496:5: ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) )
        {
        // InternalAle.g:2496:5: ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) )
        // InternalAle.g:2497:5: ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) )
        {
        // InternalAle.g:2497:5: ( ( () '.' ) | ( () '->' ) )
        int alt55=2;
        int LA55_0 = input.LA(1);

        if ( (LA55_0==54) ) {
            alt55=1;
        }
        else if ( (LA55_0==55) ) {
            alt55=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 55, 0, input);

            throw nvae;
        }
        switch (alt55) {
            case 1 :
                // InternalAle.g:2498:6: ( () '.' )
                {
                // InternalAle.g:2498:6: ( () '.' )
                // InternalAle.g:2499:7: () '.'
                {
                // InternalAle.g:2499:7: ()
                // InternalAle.g:2500:7: 
                {
                }

                match(input,54,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2504:6: ( () '->' )
                {
                // InternalAle.g:2504:6: ( () '->' )
                // InternalAle.g:2505:7: () '->'
                {
                // InternalAle.g:2505:7: ()
                // InternalAle.g:2506:7: 
                {
                }

                match(input,55,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2510:5: ( ( ruleInfixOperation ) )
        // InternalAle.g:2511:6: ( ruleInfixOperation )
        {
        // InternalAle.g:2511:6: ( ruleInfixOperation )
        // InternalAle.g:2512:7: ruleInfixOperation
        {
        pushFollow(FOLLOW_2);
        ruleInfixOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalAle

    // Delegated rules

    public final boolean synpred1_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\22\1\4\2\uffff\1\22";
    static final String dfa_3s = "\1\37\1\4\2\uffff\1\37";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\uffff";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\10\uffff\1\2\3\uffff\1\3",
            "\1\4",
            "",
            "",
            "\1\1\10\uffff\1\2\3\uffff\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "766:2: (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\4\2\27\6\uffff";
    static final String dfa_9s = "\1\105\1\uffff\1\67\2\35\6\uffff";
    static final String dfa_10s = "\1\uffff\1\1\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\5\12\23\uffff\1\12\2\uffff\1\11\1\10\1\uffff\1\6\1\uffff\1\7\1\5\16\uffff\1\12\2\uffff\2\12\1\uffff\2\12\1\uffff\2\12\1\3\1\4\4\1",
            "",
            "\1\1\12\uffff\1\12\15\uffff\1\12\12\uffff\20\12",
            "\1\12\5\uffff\1\1",
            "\1\12\5\uffff\1\1",
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

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1117:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000190002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000008F040010L,0x000000000000003FL});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000089040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xDB200000200003F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xDB200002200003F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xDB20006B210003F0L,0x000000000000003FL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001F00000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xDB200000600003F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xDB200000210003F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000100000L,0x000000000000007DL});

}