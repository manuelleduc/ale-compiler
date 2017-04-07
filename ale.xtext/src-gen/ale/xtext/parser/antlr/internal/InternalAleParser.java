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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_REAL", "RULE_BOOLEAN", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'behavior'", "';'", "'import'", "'as'", "'@'", "'open'", "'class'", "'extends'", "','", "'{'", "'}'", "'def'", "'void'", "'('", "')'", "'override'", "'return'", "'let'", "'in'", "'if'", "'else'", "'while'", "'for'", "'='", "'implies'", "'or'", "'and'", "'xor'", "'<='", "'>='", "'!='", "'<'", "'>'", "'=='", "'*'", "'/'", "'+'", "'-'", "'.'", "'->'", "'not'", "'new'", "'|'", "'self'", "'super'", "'['", "']'", "'Sequence'", "'OrderedSet'", "'Boolean'", "'Real'", "'Int'", "'String'", "'nulltype'"
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
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    // InternalAle.g:284:1: ruleOpenClass returns [EObject current=null] : ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) ) ;
    public final EObject ruleOpenClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_fields_9_0 = null;

        EObject lv_methods_10_0 = null;



        	enterRule();

        try {
            // InternalAle.g:290:2: ( ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) ) )
            // InternalAle.g:291:2: ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) )
            {
            // InternalAle.g:291:2: ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) )
            // InternalAle.g:292:3: () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' )
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

            // InternalAle.g:325:3: (otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAle.g:326:4: otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )*
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getOpenClassAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalAle.g:330:4: ( ( ruleQualified ) )
                    // InternalAle.g:331:5: ( ruleQualified )
                    {
                    // InternalAle.g:331:5: ( ruleQualified )
                    // InternalAle.g:332:6: ruleQualified
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOpenClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOpenClassAccess().getSuperClassAleClassCrossReference_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    ruleQualified();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:346:4: (otherlv_6= ',' ( ( ruleQualified ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==22) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAle.g:347:5: otherlv_6= ',' ( ( ruleQualified ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getOpenClassAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalAle.g:351:5: ( ( ruleQualified ) )
                    	    // InternalAle.g:352:6: ( ruleQualified )
                    	    {
                    	    // InternalAle.g:352:6: ( ruleQualified )
                    	    // InternalAle.g:353:7: ruleQualified
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOpenClassRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOpenClassAccess().getSuperClassAleClassCrossReference_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    ruleQualified();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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

            // InternalAle.g:369:3: (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' )
            // InternalAle.g:370:4: otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}'
            {
            otherlv_8=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getOpenClassAccess().getLeftCurlyBracketKeyword_5_0());
              			
            }
            // InternalAle.g:374:4: ( (lv_fields_9_0= ruleField ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=61 && LA6_0<=66)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAle.g:375:5: (lv_fields_9_0= ruleField )
            	    {
            	    // InternalAle.g:375:5: (lv_fields_9_0= ruleField )
            	    // InternalAle.g:376:6: lv_fields_9_0= ruleField
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

            // InternalAle.g:393:4: ( (lv_methods_10_0= ruleMethod ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18||LA7_0==25||LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAle.g:394:5: (lv_methods_10_0= ruleMethod )
            	    {
            	    // InternalAle.g:394:5: (lv_methods_10_0= ruleMethod )
            	    // InternalAle.g:395:6: lv_methods_10_0= ruleMethod
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
    // InternalAle.g:421:1: entryRuleNewClass returns [EObject current=null] : iv_ruleNewClass= ruleNewClass EOF ;
    public final EObject entryRuleNewClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewClass = null;


        try {
            // InternalAle.g:421:49: (iv_ruleNewClass= ruleNewClass EOF )
            // InternalAle.g:422:2: iv_ruleNewClass= ruleNewClass EOF
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
    // InternalAle.g:428:1: ruleNewClass returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualified ) ) (otherlv_5= ',' ( ( ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ) ;
    public final EObject ruleNewClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_fields_8_0 = null;

        EObject lv_methods_9_0 = null;



        	enterRule();

        try {
            // InternalAle.g:434:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualified ) ) (otherlv_5= ',' ( ( ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ) )
            // InternalAle.g:435:2: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualified ) ) (otherlv_5= ',' ( ( ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            {
            // InternalAle.g:435:2: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualified ) ) (otherlv_5= ',' ( ( ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            // InternalAle.g:436:3: () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualified ) ) (otherlv_5= ',' ( ( ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            {
            // InternalAle.g:436:3: ()
            // InternalAle.g:437:4: 
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
            // InternalAle.g:447:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAle.g:448:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAle.g:448:4: (lv_name_2_0= RULE_ID )
            // InternalAle.g:449:5: lv_name_2_0= RULE_ID
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

            // InternalAle.g:465:3: (otherlv_3= 'extends' ( ( ruleQualified ) ) (otherlv_5= ',' ( ( ruleQualified ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAle.g:466:4: otherlv_3= 'extends' ( ( ruleQualified ) ) (otherlv_5= ',' ( ( ruleQualified ) ) )*
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNewClassAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalAle.g:470:4: ( ( ruleQualified ) )
                    // InternalAle.g:471:5: ( ruleQualified )
                    {
                    // InternalAle.g:471:5: ( ruleQualified )
                    // InternalAle.g:472:6: ruleQualified
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNewClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNewClassAccess().getSuperClassAleClassCrossReference_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    ruleQualified();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:486:4: (otherlv_5= ',' ( ( ruleQualified ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==22) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAle.g:487:5: otherlv_5= ',' ( ( ruleQualified ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getNewClassAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalAle.g:491:5: ( ( ruleQualified ) )
                    	    // InternalAle.g:492:6: ( ruleQualified )
                    	    {
                    	    // InternalAle.g:492:6: ( ruleQualified )
                    	    // InternalAle.g:493:7: ruleQualified
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getNewClassRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNewClassAccess().getSuperClassAleClassCrossReference_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    ruleQualified();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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

            // InternalAle.g:509:3: (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            // InternalAle.g:510:4: otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}'
            {
            otherlv_7=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getNewClassAccess().getLeftCurlyBracketKeyword_4_0());
              			
            }
            // InternalAle.g:514:4: ( (lv_fields_8_0= ruleField ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=61 && LA10_0<=66)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAle.g:515:5: (lv_fields_8_0= ruleField )
            	    {
            	    // InternalAle.g:515:5: (lv_fields_8_0= ruleField )
            	    // InternalAle.g:516:6: lv_fields_8_0= ruleField
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

            // InternalAle.g:533:4: ( (lv_methods_9_0= ruleMethod ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18||LA11_0==25||LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAle.g:534:5: (lv_methods_9_0= ruleMethod )
            	    {
            	    // InternalAle.g:534:5: (lv_methods_9_0= ruleMethod )
            	    // InternalAle.g:535:6: lv_methods_9_0= ruleMethod
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
    // InternalAle.g:561:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalAle.g:561:46: (iv_ruleField= ruleField EOF )
            // InternalAle.g:562:2: iv_ruleField= ruleField EOF
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
    // InternalAle.g:568:1: ruleField returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalAle.g:574:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalAle.g:575:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalAle.g:575:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalAle.g:576:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalAle.g:576:3: ( (lv_type_0_0= ruleType ) )
            // InternalAle.g:577:4: (lv_type_0_0= ruleType )
            {
            // InternalAle.g:577:4: (lv_type_0_0= ruleType )
            // InternalAle.g:578:5: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFieldRule());
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

            // InternalAle.g:595:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAle.g:596:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAle.g:596:4: (lv_name_1_0= RULE_ID )
            // InternalAle.g:597:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getSemicolonKeyword_2());
              		
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // InternalAle.g:621:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalAle.g:621:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalAle.g:622:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalAle.g:628:1: ruleMethod returns [EObject current=null] : (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        EObject this_DefMethod_0 = null;

        EObject this_OverrideMethod_1 = null;



        	enterRule();

        try {
            // InternalAle.g:634:2: ( (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod ) )
            // InternalAle.g:635:2: (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod )
            {
            // InternalAle.g:635:2: (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAle.g:636:3: this_DefMethod_0= ruleDefMethod
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
                    // InternalAle.g:645:3: this_OverrideMethod_1= ruleOverrideMethod
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
    // InternalAle.g:657:1: entryRuleDefMethod returns [EObject current=null] : iv_ruleDefMethod= ruleDefMethod EOF ;
    public final EObject entryRuleDefMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefMethod = null;


        try {
            // InternalAle.g:657:50: (iv_ruleDefMethod= ruleDefMethod EOF )
            // InternalAle.g:658:2: iv_ruleDefMethod= ruleDefMethod EOF
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
    // InternalAle.g:664:1: ruleDefMethod returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) ) ) ;
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
            // InternalAle.g:670:2: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) ) ) )
            // InternalAle.g:671:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) ) )
            {
            // InternalAle.g:671:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) ) )
            // InternalAle.g:672:3: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) )
            {
            // InternalAle.g:672:3: ( (lv_tags_0_0= ruleTag ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAle.g:673:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalAle.g:673:4: (lv_tags_0_0= ruleTag )
            	    // InternalAle.g:674:5: lv_tags_0_0= ruleTag
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDefMethodAccess().getTagsTagParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
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
            	    break loop13;
                }
            } while (true);

            otherlv_1=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefMethodAccess().getDefKeyword_1());
              		
            }
            // InternalAle.g:695:3: ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||(LA14_0>=61 && LA14_0<=66)) ) {
                alt14=1;
            }
            else if ( (LA14_0==26) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAle.g:696:4: ( (lv_type_2_0= ruleType ) )
                    {
                    // InternalAle.g:696:4: ( (lv_type_2_0= ruleType ) )
                    // InternalAle.g:697:5: (lv_type_2_0= ruleType )
                    {
                    // InternalAle.g:697:5: (lv_type_2_0= ruleType )
                    // InternalAle.g:698:6: lv_type_2_0= ruleType
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
                    // InternalAle.g:716:4: otherlv_3= 'void'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDefMethodAccess().getVoidKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAle.g:721:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalAle.g:722:4: (lv_name_4_0= RULE_ID )
            {
            // InternalAle.g:722:4: (lv_name_4_0= RULE_ID )
            // InternalAle.g:723:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

            // InternalAle.g:739:3: (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' )
            // InternalAle.g:740:4: otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')'
            {
            otherlv_5=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getDefMethodAccess().getLeftParenthesisKeyword_4_0());
              			
            }
            // InternalAle.g:744:4: ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=61 && LA16_0<=66)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAle.g:745:5: ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )*
                    {
                    // InternalAle.g:745:5: ( (lv_params_6_0= ruleParam ) )
                    // InternalAle.g:746:6: (lv_params_6_0= ruleParam )
                    {
                    // InternalAle.g:746:6: (lv_params_6_0= ruleParam )
                    // InternalAle.g:747:7: lv_params_6_0= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_4_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_17);
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

                    // InternalAle.g:764:5: (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==22) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalAle.g:765:6: otherlv_7= ',' ( (lv_params_8_0= ruleParam ) )
                    	    {
                    	    otherlv_7=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_7, grammarAccess.getDefMethodAccess().getCommaKeyword_4_1_1_0());
                    	      					
                    	    }
                    	    // InternalAle.g:769:6: ( (lv_params_8_0= ruleParam ) )
                    	    // InternalAle.g:770:7: (lv_params_8_0= ruleParam )
                    	    {
                    	    // InternalAle.g:770:7: (lv_params_8_0= ruleParam )
                    	    // InternalAle.g:771:8: lv_params_8_0= ruleParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_4_1_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_17);
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
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_9, grammarAccess.getDefMethodAccess().getRightParenthesisKeyword_4_2());
              			
            }

            }

            // InternalAle.g:795:3: ( (lv_block_10_0= ruleBlock ) )
            // InternalAle.g:796:4: (lv_block_10_0= ruleBlock )
            {
            // InternalAle.g:796:4: (lv_block_10_0= ruleBlock )
            // InternalAle.g:797:5: lv_block_10_0= ruleBlock
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
    // InternalAle.g:818:1: entryRuleOverrideMethod returns [EObject current=null] : iv_ruleOverrideMethod= ruleOverrideMethod EOF ;
    public final EObject entryRuleOverrideMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverrideMethod = null;


        try {
            // InternalAle.g:818:55: (iv_ruleOverrideMethod= ruleOverrideMethod EOF )
            // InternalAle.g:819:2: iv_ruleOverrideMethod= ruleOverrideMethod EOF
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
    // InternalAle.g:825:1: ruleOverrideMethod returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) ) ;
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
            // InternalAle.g:831:2: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) ) )
            // InternalAle.g:832:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) )
            {
            // InternalAle.g:832:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) )
            // InternalAle.g:833:3: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) )
            {
            // InternalAle.g:833:3: ( (lv_tags_0_0= ruleTag ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAle.g:834:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalAle.g:834:4: (lv_tags_0_0= ruleTag )
            	    // InternalAle.g:835:5: lv_tags_0_0= ruleTag
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
            	    break loop17;
                }
            } while (true);

            otherlv_1=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOverrideMethodAccess().getOverrideKeyword_1());
              		
            }
            // InternalAle.g:856:3: ( (lv_type_2_0= ruleType ) )
            // InternalAle.g:857:4: (lv_type_2_0= ruleType )
            {
            // InternalAle.g:857:4: (lv_type_2_0= ruleType )
            // InternalAle.g:858:5: lv_type_2_0= ruleType
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

            // InternalAle.g:875:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAle.g:876:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAle.g:876:4: (lv_name_3_0= RULE_ID )
            // InternalAle.g:877:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

            // InternalAle.g:893:3: (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' )
            // InternalAle.g:894:4: otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')'
            {
            otherlv_4=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getOverrideMethodAccess().getLeftParenthesisKeyword_4_0());
              			
            }
            // InternalAle.g:898:4: ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||(LA19_0>=61 && LA19_0<=66)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAle.g:899:5: ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )*
                    {
                    // InternalAle.g:899:5: ( (lv_params_5_0= ruleParam ) )
                    // InternalAle.g:900:6: (lv_params_5_0= ruleParam )
                    {
                    // InternalAle.g:900:6: (lv_params_5_0= ruleParam )
                    // InternalAle.g:901:7: lv_params_5_0= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_4_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_17);
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

                    // InternalAle.g:918:5: (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==22) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalAle.g:919:6: otherlv_6= ',' ( (lv_params_7_0= ruleParam ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_6, grammarAccess.getOverrideMethodAccess().getCommaKeyword_4_1_1_0());
                    	      					
                    	    }
                    	    // InternalAle.g:923:6: ( (lv_params_7_0= ruleParam ) )
                    	    // InternalAle.g:924:7: (lv_params_7_0= ruleParam )
                    	    {
                    	    // InternalAle.g:924:7: (lv_params_7_0= ruleParam )
                    	    // InternalAle.g:925:8: lv_params_7_0= ruleParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_4_1_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_17);
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
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getOverrideMethodAccess().getRightParenthesisKeyword_4_2());
              			
            }

            }

            // InternalAle.g:949:3: ( (lv_block_9_0= ruleBlock ) )
            // InternalAle.g:950:4: (lv_block_9_0= ruleBlock )
            {
            // InternalAle.g:950:4: (lv_block_9_0= ruleBlock )
            // InternalAle.g:951:5: lv_block_9_0= ruleBlock
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
    // InternalAle.g:972:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalAle.g:972:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalAle.g:973:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalAle.g:979:1: ruleStatement returns [EObject current=null] : ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) ) ;
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
            // InternalAle.g:985:2: ( ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) ) )
            // InternalAle.g:986:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) )
            {
            // InternalAle.g:986:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) )
            int alt20=7;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalAle.g:987:3: (this_VarAssign_0= ruleVarAssign otherlv_1= ';' )
                    {
                    // InternalAle.g:987:3: (this_VarAssign_0= ruleVarAssign otherlv_1= ';' )
                    // InternalAle.g:988:4: this_VarAssign_0= ruleVarAssign otherlv_1= ';'
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
                    // InternalAle.g:1002:3: this_ForLoop_2= ruleForLoop
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
                    // InternalAle.g:1011:3: this_IfStatement_3= ruleIfStatement
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
                    // InternalAle.g:1020:3: this_WhileStatement_4= ruleWhileStatement
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
                    // InternalAle.g:1029:3: (this_LetStatement_5= ruleLetStatement otherlv_6= ';' )
                    {
                    // InternalAle.g:1029:3: (this_LetStatement_5= ruleLetStatement otherlv_6= ';' )
                    // InternalAle.g:1030:4: this_LetStatement_5= ruleLetStatement otherlv_6= ';'
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
                    // InternalAle.g:1044:3: (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' )
                    {
                    // InternalAle.g:1044:3: (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' )
                    // InternalAle.g:1045:4: this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';'
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
                    // InternalAle.g:1059:3: (this_Expression_9= ruleExpression otherlv_10= ';' )
                    {
                    // InternalAle.g:1059:3: (this_Expression_9= ruleExpression otherlv_10= ';' )
                    // InternalAle.g:1060:4: this_Expression_9= ruleExpression otherlv_10= ';'
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
    // InternalAle.g:1077:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalAle.g:1077:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalAle.g:1078:2: iv_ruleReturnStatement= ruleReturnStatement EOF
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
    // InternalAle.g:1084:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_returned_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1090:2: ( ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) ) )
            // InternalAle.g:1091:2: ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) )
            {
            // InternalAle.g:1091:2: ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) )
            // InternalAle.g:1092:3: () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) )
            {
            // InternalAle.g:1092:3: ()
            // InternalAle.g:1093:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
              		
            }
            // InternalAle.g:1103:3: ( (lv_returned_2_0= ruleExpression ) )
            // InternalAle.g:1104:4: (lv_returned_2_0= ruleExpression )
            {
            // InternalAle.g:1104:4: (lv_returned_2_0= ruleExpression )
            // InternalAle.g:1105:5: lv_returned_2_0= ruleExpression
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
    // InternalAle.g:1126:1: entryRuleLetStatement returns [EObject current=null] : iv_ruleLetStatement= ruleLetStatement EOF ;
    public final EObject entryRuleLetStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetStatement = null;


        try {
            // InternalAle.g:1126:53: (iv_ruleLetStatement= ruleLetStatement EOF )
            // InternalAle.g:1127:2: iv_ruleLetStatement= ruleLetStatement EOF
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
    // InternalAle.g:1133:1: ruleLetStatement returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) ) ;
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
            // InternalAle.g:1139:2: ( ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) ) )
            // InternalAle.g:1140:2: ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) )
            {
            // InternalAle.g:1140:2: ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) )
            // InternalAle.g:1141:3: () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) )
            {
            // InternalAle.g:1141:3: ()
            // InternalAle.g:1142:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLetStatementAccess().getLetStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLetStatementAccess().getLetKeyword_1());
              		
            }
            // InternalAle.g:1152:3: ( (lv_bindings_2_0= ruleVarAssign ) )
            // InternalAle.g:1153:4: (lv_bindings_2_0= ruleVarAssign )
            {
            // InternalAle.g:1153:4: (lv_bindings_2_0= ruleVarAssign )
            // InternalAle.g:1154:5: lv_bindings_2_0= ruleVarAssign
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

            // InternalAle.g:1171:3: (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAle.g:1172:4: otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getLetStatementAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAle.g:1176:4: ( (lv_bindings_4_0= ruleVarAssign ) )
            	    // InternalAle.g:1177:5: (lv_bindings_4_0= ruleVarAssign )
            	    {
            	    // InternalAle.g:1177:5: (lv_bindings_4_0= ruleVarAssign )
            	    // InternalAle.g:1178:6: lv_bindings_4_0= ruleVarAssign
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
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getLetStatementAccess().getInKeyword_4());
              		
            }
            // InternalAle.g:1200:3: ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) )
            // InternalAle.g:1201:4: ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) )
            {
            // InternalAle.g:1201:4: ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) )
            // InternalAle.g:1202:5: (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement )
            {
            // InternalAle.g:1202:5: (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_NULL)||LA22_0==27||LA22_0==51||(LA22_0>=54 && LA22_0<=55)||(LA22_0>=57 && LA22_0<=59)||(LA22_0>=61 && LA22_0<=62)) ) {
                alt22=1;
            }
            else if ( (LA22_0==31) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalAle.g:1203:6: lv_block_6_1= ruleExpression
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
                    // InternalAle.g:1219:6: lv_block_6_2= ruleLetStatement
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
    // InternalAle.g:1241:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalAle.g:1241:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalAle.g:1242:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalAle.g:1248:1: ruleIfStatement returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? ) ;
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
            // InternalAle.g:1254:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? ) )
            // InternalAle.g:1255:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? )
            {
            // InternalAle.g:1255:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? )
            // InternalAle.g:1256:3: () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )?
            {
            // InternalAle.g:1256:3: ()
            // InternalAle.g:1257:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIfStatementAccess().getIfStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getIfKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1271:3: ( (lv_condition_3_0= ruleExpression ) )
            // InternalAle.g:1272:4: (lv_condition_3_0= ruleExpression )
            {
            // InternalAle.g:1272:4: (lv_condition_3_0= ruleExpression )
            // InternalAle.g:1273:5: lv_condition_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalAle.g:1294:3: ( (lv_thenBranch_5_0= ruleBlock ) )
            // InternalAle.g:1295:4: (lv_thenBranch_5_0= ruleBlock )
            {
            // InternalAle.g:1295:4: (lv_thenBranch_5_0= ruleBlock )
            // InternalAle.g:1296:5: lv_thenBranch_5_0= ruleBlock
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

            // InternalAle.g:1313:3: (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAle.g:1314:4: otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getElseKeyword_6_0());
                      			
                    }
                    // InternalAle.g:1318:4: ( (lv_elseBranch_7_0= ruleBlock ) )
                    // InternalAle.g:1319:5: (lv_elseBranch_7_0= ruleBlock )
                    {
                    // InternalAle.g:1319:5: (lv_elseBranch_7_0= ruleBlock )
                    // InternalAle.g:1320:6: lv_elseBranch_7_0= ruleBlock
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
    // InternalAle.g:1342:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalAle.g:1342:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalAle.g:1343:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalAle.g:1349:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;

        EObject lv_whileBlock_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1355:2: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) ) )
            // InternalAle.g:1356:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) )
            {
            // InternalAle.g:1356:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) )
            // InternalAle.g:1357:3: () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) )
            {
            // InternalAle.g:1357:3: ()
            // InternalAle.g:1358:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWhileStatementAccess().getWhileStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1372:3: ( (lv_condition_3_0= ruleExpression ) )
            // InternalAle.g:1373:4: (lv_condition_3_0= ruleExpression )
            {
            // InternalAle.g:1373:4: (lv_condition_3_0= ruleExpression )
            // InternalAle.g:1374:5: lv_condition_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalAle.g:1395:3: ( (lv_whileBlock_5_0= ruleBlock ) )
            // InternalAle.g:1396:4: (lv_whileBlock_5_0= ruleBlock )
            {
            // InternalAle.g:1396:4: (lv_whileBlock_5_0= ruleBlock )
            // InternalAle.g:1397:5: lv_whileBlock_5_0= ruleBlock
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
    // InternalAle.g:1418:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalAle.g:1418:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalAle.g:1419:2: iv_ruleForLoop= ruleForLoop EOF
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
    // InternalAle.g:1425:1: ruleForLoop returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) ;
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
            // InternalAle.g:1431:2: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) )
            // InternalAle.g:1432:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            {
            // InternalAle.g:1432:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            // InternalAle.g:1433:3: () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) )
            {
            // InternalAle.g:1433:3: ()
            // InternalAle.g:1434:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForLoopAccess().getForLoopAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getForKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1448:3: ( (lv_type_3_0= ruleType ) )
            // InternalAle.g:1449:4: (lv_type_3_0= ruleType )
            {
            // InternalAle.g:1449:4: (lv_type_3_0= ruleType )
            // InternalAle.g:1450:5: lv_type_3_0= ruleType
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

            // InternalAle.g:1467:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalAle.g:1468:4: (lv_name_4_0= RULE_ID )
            {
            // InternalAle.g:1468:4: (lv_name_4_0= RULE_ID )
            // InternalAle.g:1469:5: lv_name_4_0= RULE_ID
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

            otherlv_5=(Token)match(input,32,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForLoopAccess().getInKeyword_5());
              		
            }
            // InternalAle.g:1489:3: ( (lv_collection_6_0= ruleExpression ) )
            // InternalAle.g:1490:4: (lv_collection_6_0= ruleExpression )
            {
            // InternalAle.g:1490:4: (lv_collection_6_0= ruleExpression )
            // InternalAle.g:1491:5: lv_collection_6_0= ruleExpression
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

            otherlv_7=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalAle.g:1512:3: ( (lv_block_8_0= ruleBlock ) )
            // InternalAle.g:1513:4: (lv_block_8_0= ruleBlock )
            {
            // InternalAle.g:1513:4: (lv_block_8_0= ruleBlock )
            // InternalAle.g:1514:5: lv_block_8_0= ruleBlock
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
    // InternalAle.g:1535:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalAle.g:1535:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalAle.g:1536:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalAle.g:1542:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1548:2: ( ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalAle.g:1549:2: ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalAle.g:1549:2: ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalAle.g:1550:3: () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalAle.g:1550:3: ()
            // InternalAle.g:1551:4: 
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
            // InternalAle.g:1561:3: ( (lv_body_2_0= ruleStatement ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_NULL)||LA24_0==27||(LA24_0>=30 && LA24_0<=31)||LA24_0==33||(LA24_0>=35 && LA24_0<=36)||LA24_0==51||(LA24_0>=54 && LA24_0<=55)||(LA24_0>=57 && LA24_0<=59)||(LA24_0>=61 && LA24_0<=66)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAle.g:1562:4: (lv_body_2_0= ruleStatement )
            	    {
            	    // InternalAle.g:1562:4: (lv_body_2_0= ruleStatement )
            	    // InternalAle.g:1563:5: lv_body_2_0= ruleStatement
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
            	    break loop24;
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
    // InternalAle.g:1588:1: entryRuleVarAssign returns [EObject current=null] : iv_ruleVarAssign= ruleVarAssign EOF ;
    public final EObject entryRuleVarAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarAssign = null;


        try {
            // InternalAle.g:1588:50: (iv_ruleVarAssign= ruleVarAssign EOF )
            // InternalAle.g:1589:2: iv_ruleVarAssign= ruleVarAssign EOF
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
    // InternalAle.g:1595:1: ruleVarAssign returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) ;
    public final EObject ruleVarAssign() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1601:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) )
            // InternalAle.g:1602:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            {
            // InternalAle.g:1602:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            // InternalAle.g:1603:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) )
            {
            // InternalAle.g:1603:3: ()
            // InternalAle.g:1604:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVarAssignAccess().getVarAssignAction_0(),
              					current);
              			
            }

            }

            // InternalAle.g:1610:3: ( (lv_type_1_0= ruleType ) )
            // InternalAle.g:1611:4: (lv_type_1_0= ruleType )
            {
            // InternalAle.g:1611:4: (lv_type_1_0= ruleType )
            // InternalAle.g:1612:5: lv_type_1_0= ruleType
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

            // InternalAle.g:1629:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAle.g:1630:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAle.g:1630:4: (lv_name_2_0= RULE_ID )
            // InternalAle.g:1631:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,37,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVarAssignAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalAle.g:1651:3: ( (lv_value_4_0= ruleExpression ) )
            // InternalAle.g:1652:4: (lv_value_4_0= ruleExpression )
            {
            // InternalAle.g:1652:4: (lv_value_4_0= ruleExpression )
            // InternalAle.g:1653:5: lv_value_4_0= ruleExpression
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
    // InternalAle.g:1674:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAle.g:1674:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAle.g:1675:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAle.g:1681:1: ruleExpression returns [EObject current=null] : this_ImpliesOperation_0= ruleImpliesOperation ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesOperation_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1687:2: (this_ImpliesOperation_0= ruleImpliesOperation )
            // InternalAle.g:1688:2: this_ImpliesOperation_0= ruleImpliesOperation
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
    // InternalAle.g:1699:1: entryRuleImpliesOperation returns [EObject current=null] : iv_ruleImpliesOperation= ruleImpliesOperation EOF ;
    public final EObject entryRuleImpliesOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesOperation = null;


        try {
            // InternalAle.g:1699:57: (iv_ruleImpliesOperation= ruleImpliesOperation EOF )
            // InternalAle.g:1700:2: iv_ruleImpliesOperation= ruleImpliesOperation EOF
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
    // InternalAle.g:1706:1: ruleImpliesOperation returns [EObject current=null] : (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* ) ;
    public final EObject ruleImpliesOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BooleanOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1712:2: ( (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* ) )
            // InternalAle.g:1713:2: (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* )
            {
            // InternalAle.g:1713:2: (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* )
            // InternalAle.g:1714:3: this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )*
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
            // InternalAle.g:1722:3: ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    int LA25_2 = input.LA(2);

                    if ( (synpred1_InternalAle()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalAle.g:1723:4: ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) )
            	    {
            	    // InternalAle.g:1736:4: ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) )
            	    // InternalAle.g:1737:5: ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) )
            	    {
            	    // InternalAle.g:1737:5: ( () otherlv_2= 'implies' )
            	    // InternalAle.g:1738:6: () otherlv_2= 'implies'
            	    {
            	    // InternalAle.g:1738:6: ()
            	    // InternalAle.g:1739:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getImpliesOperationAccess().getImpliesOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getImpliesOperationAccess().getImpliesKeyword_1_0_0_1());
            	      					
            	    }

            	    }

            	    // InternalAle.g:1750:5: ( (lv_right_3_0= ruleBooleanOperation ) )
            	    // InternalAle.g:1751:6: (lv_right_3_0= ruleBooleanOperation )
            	    {
            	    // InternalAle.g:1751:6: (lv_right_3_0= ruleBooleanOperation )
            	    // InternalAle.g:1752:7: lv_right_3_0= ruleBooleanOperation
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
            	    break loop25;
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
    // InternalAle.g:1775:1: entryRuleBooleanOperation returns [EObject current=null] : iv_ruleBooleanOperation= ruleBooleanOperation EOF ;
    public final EObject entryRuleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOperation = null;


        try {
            // InternalAle.g:1775:57: (iv_ruleBooleanOperation= ruleBooleanOperation EOF )
            // InternalAle.g:1776:2: iv_ruleBooleanOperation= ruleBooleanOperation EOF
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
    // InternalAle.g:1782:1: ruleBooleanOperation returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* ) ;
    public final EObject ruleBooleanOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_CompareOperation_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1788:2: ( (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* ) )
            // InternalAle.g:1789:2: (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* )
            {
            // InternalAle.g:1789:2: (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* )
            // InternalAle.g:1790:3: this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )*
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
            // InternalAle.g:1798:3: ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )*
            loop27:
            do {
                int alt27=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA27_2 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt27=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA27_3 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt27=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA27_4 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt27=1;
                    }


                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // InternalAle.g:1799:4: ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) )
            	    {
            	    // InternalAle.g:1826:4: ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) )
            	    // InternalAle.g:1827:5: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) )
            	    {
            	    // InternalAle.g:1827:5: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // InternalAle.g:1828:6: ( () otherlv_2= 'or' )
            	            {
            	            // InternalAle.g:1828:6: ( () otherlv_2= 'or' )
            	            // InternalAle.g:1829:7: () otherlv_2= 'or'
            	            {
            	            // InternalAle.g:1829:7: ()
            	            // InternalAle.g:1830:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanOrOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,39,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getBooleanOperationAccess().getOrKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:1842:6: ( () otherlv_4= 'and' )
            	            {
            	            // InternalAle.g:1842:6: ( () otherlv_4= 'and' )
            	            // InternalAle.g:1843:7: () otherlv_4= 'and'
            	            {
            	            // InternalAle.g:1843:7: ()
            	            // InternalAle.g:1844:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanAndOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,40,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getBooleanOperationAccess().getAndKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalAle.g:1856:6: ( () otherlv_6= 'xor' )
            	            {
            	            // InternalAle.g:1856:6: ( () otherlv_6= 'xor' )
            	            // InternalAle.g:1857:7: () otherlv_6= 'xor'
            	            {
            	            // InternalAle.g:1857:7: ()
            	            // InternalAle.g:1858:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanXorOperationLeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,41,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getBooleanOperationAccess().getXorKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:1870:5: ( (lv_right_7_0= ruleCompareOperation ) )
            	    // InternalAle.g:1871:6: (lv_right_7_0= ruleCompareOperation )
            	    {
            	    // InternalAle.g:1871:6: (lv_right_7_0= ruleCompareOperation )
            	    // InternalAle.g:1872:7: lv_right_7_0= ruleCompareOperation
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
            	    break loop27;
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
    // InternalAle.g:1895:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalAle.g:1895:57: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalAle.g:1896:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
    // InternalAle.g:1902:1: ruleCompareOperation returns [EObject current=null] : (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )* ) ;
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
            // InternalAle.g:1908:2: ( (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )* ) )
            // InternalAle.g:1909:2: (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )* )
            {
            // InternalAle.g:1909:2: (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )* )
            // InternalAle.g:1910:3: this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )*
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
            // InternalAle.g:1918:3: ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )*
            loop29:
            do {
                int alt29=2;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA29_5 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA29_6 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt29=1;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // InternalAle.g:1919:4: ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) )
            	    {
            	    // InternalAle.g:1958:4: ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) )
            	    // InternalAle.g:1959:5: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) )
            	    {
            	    // InternalAle.g:1959:5: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) )
            	    int alt28=5;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt28=4;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt28=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // InternalAle.g:1960:6: ( () otherlv_2= '<=' )
            	            {
            	            // InternalAle.g:1960:6: ( () otherlv_2= '<=' )
            	            // InternalAle.g:1961:7: () otherlv_2= '<='
            	            {
            	            // InternalAle.g:1961:7: ()
            	            // InternalAle.g:1962:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareLEOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,42,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getCompareOperationAccess().getLessThanSignEqualsSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:1974:6: ( () otherlv_4= '>=' )
            	            {
            	            // InternalAle.g:1974:6: ( () otherlv_4= '>=' )
            	            // InternalAle.g:1975:7: () otherlv_4= '>='
            	            {
            	            // InternalAle.g:1975:7: ()
            	            // InternalAle.g:1976:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareGEOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,43,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalAle.g:1988:6: ( () otherlv_6= '!=' )
            	            {
            	            // InternalAle.g:1988:6: ( () otherlv_6= '!=' )
            	            // InternalAle.g:1989:7: () otherlv_6= '!='
            	            {
            	            // InternalAle.g:1989:7: ()
            	            // InternalAle.g:1990:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareNEOperationLeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,44,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getCompareOperationAccess().getExclamationMarkEqualsSignKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalAle.g:2002:6: ( () otherlv_8= '<' )
            	            {
            	            // InternalAle.g:2002:6: ( () otherlv_8= '<' )
            	            // InternalAle.g:2003:7: () otherlv_8= '<'
            	            {
            	            // InternalAle.g:2003:7: ()
            	            // InternalAle.g:2004:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareLOperationLeftAction_1_0_0_3_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_8=(Token)match(input,45,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_8, grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1_0_0_3_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalAle.g:2016:6: ( () otherlv_10= '>' )
            	            {
            	            // InternalAle.g:2016:6: ( () otherlv_10= '>' )
            	            // InternalAle.g:2017:7: () otherlv_10= '>'
            	            {
            	            // InternalAle.g:2017:7: ()
            	            // InternalAle.g:2018:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareGOperationLeftAction_1_0_0_4_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_10=(Token)match(input,46,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_10, grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_1_0_0_4_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2030:5: ( (lv_right_11_0= ruleEqualityOperation ) )
            	    // InternalAle.g:2031:6: (lv_right_11_0= ruleEqualityOperation )
            	    {
            	    // InternalAle.g:2031:6: (lv_right_11_0= ruleEqualityOperation )
            	    // InternalAle.g:2032:7: lv_right_11_0= ruleEqualityOperation
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
            	    break loop29;
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
    // InternalAle.g:2055:1: entryRuleEqualityOperation returns [EObject current=null] : iv_ruleEqualityOperation= ruleEqualityOperation EOF ;
    public final EObject entryRuleEqualityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityOperation = null;


        try {
            // InternalAle.g:2055:58: (iv_ruleEqualityOperation= ruleEqualityOperation EOF )
            // InternalAle.g:2056:2: iv_ruleEqualityOperation= ruleEqualityOperation EOF
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
    // InternalAle.g:2062:1: ruleEqualityOperation returns [EObject current=null] : (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* ) ;
    public final EObject ruleEqualityOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_MultOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2068:2: ( (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* ) )
            // InternalAle.g:2069:2: (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* )
            {
            // InternalAle.g:2069:2: (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* )
            // InternalAle.g:2070:3: this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )*
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
            // InternalAle.g:2078:3: ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred4_InternalAle()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalAle.g:2079:4: ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) )
            	    {
            	    // InternalAle.g:2094:4: ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) )
            	    // InternalAle.g:2095:5: () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) )
            	    {
            	    // InternalAle.g:2095:5: ()
            	    // InternalAle.g:2096:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getEqualityOperationAccess().getEqualityOperationLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalAle.g:2102:5: ( (lv_op_2_0= '==' ) )
            	    // InternalAle.g:2103:6: (lv_op_2_0= '==' )
            	    {
            	    // InternalAle.g:2103:6: (lv_op_2_0= '==' )
            	    // InternalAle.g:2104:7: lv_op_2_0= '=='
            	    {
            	    lv_op_2_0=(Token)match(input,47,FOLLOW_21); if (state.failed) return current;
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

            	    // InternalAle.g:2116:5: ( (lv_right_3_0= ruleMultOperation ) )
            	    // InternalAle.g:2117:6: (lv_right_3_0= ruleMultOperation )
            	    {
            	    // InternalAle.g:2117:6: (lv_right_3_0= ruleMultOperation )
            	    // InternalAle.g:2118:7: lv_right_3_0= ruleMultOperation
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
    // $ANTLR end "ruleEqualityOperation"


    // $ANTLR start "entryRuleMultOperation"
    // InternalAle.g:2141:1: entryRuleMultOperation returns [EObject current=null] : iv_ruleMultOperation= ruleMultOperation EOF ;
    public final EObject entryRuleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOperation = null;


        try {
            // InternalAle.g:2141:54: (iv_ruleMultOperation= ruleMultOperation EOF )
            // InternalAle.g:2142:2: iv_ruleMultOperation= ruleMultOperation EOF
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
    // InternalAle.g:2148:1: ruleMultOperation returns [EObject current=null] : (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* ) ;
    public final EObject ruleMultOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AddOperation_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2154:2: ( (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* ) )
            // InternalAle.g:2155:2: (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* )
            {
            // InternalAle.g:2155:2: (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* )
            // InternalAle.g:2156:3: this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )*
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
            // InternalAle.g:2164:3: ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==48) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred5_InternalAle()) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==49) ) {
                    int LA32_3 = input.LA(2);

                    if ( (synpred5_InternalAle()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalAle.g:2165:4: ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) )
            	    {
            	    // InternalAle.g:2186:4: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) )
            	    // InternalAle.g:2187:5: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) )
            	    {
            	    // InternalAle.g:2187:5: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==48) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==49) ) {
            	        alt31=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalAle.g:2188:6: ( () otherlv_2= '*' )
            	            {
            	            // InternalAle.g:2188:6: ( () otherlv_2= '*' )
            	            // InternalAle.g:2189:7: () otherlv_2= '*'
            	            {
            	            // InternalAle.g:2189:7: ()
            	            // InternalAle.g:2190:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultOperationAccess().getMultOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,48,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getMultOperationAccess().getAsteriskKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2202:6: ( () otherlv_4= '/' )
            	            {
            	            // InternalAle.g:2202:6: ( () otherlv_4= '/' )
            	            // InternalAle.g:2203:7: () otherlv_4= '/'
            	            {
            	            // InternalAle.g:2203:7: ()
            	            // InternalAle.g:2204:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultOperationAccess().getDivOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,49,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getMultOperationAccess().getSolidusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2216:5: ( (lv_right_5_0= ruleAddOperation ) )
            	    // InternalAle.g:2217:6: (lv_right_5_0= ruleAddOperation )
            	    {
            	    // InternalAle.g:2217:6: (lv_right_5_0= ruleAddOperation )
            	    // InternalAle.g:2218:7: lv_right_5_0= ruleAddOperation
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
            	    break loop32;
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
    // InternalAle.g:2241:1: entryRuleAddOperation returns [EObject current=null] : iv_ruleAddOperation= ruleAddOperation EOF ;
    public final EObject entryRuleAddOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOperation = null;


        try {
            // InternalAle.g:2241:53: (iv_ruleAddOperation= ruleAddOperation EOF )
            // InternalAle.g:2242:2: iv_ruleAddOperation= ruleAddOperation EOF
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
    // InternalAle.g:2248:1: ruleAddOperation returns [EObject current=null] : (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* ) ;
    public final EObject ruleAddOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ChaindedCall_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2254:2: ( (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* ) )
            // InternalAle.g:2255:2: (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* )
            {
            // InternalAle.g:2255:2: (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* )
            // InternalAle.g:2256:3: this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )*
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
            // InternalAle.g:2264:3: ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==50) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred6_InternalAle()) ) {
                        alt34=1;
                    }


                }
                else if ( (LA34_0==51) ) {
                    int LA34_3 = input.LA(2);

                    if ( (synpred6_InternalAle()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalAle.g:2265:4: ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) )
            	    {
            	    // InternalAle.g:2286:4: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) )
            	    // InternalAle.g:2287:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) )
            	    {
            	    // InternalAle.g:2287:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==50) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==51) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalAle.g:2288:6: ( () otherlv_2= '+' )
            	            {
            	            // InternalAle.g:2288:6: ( () otherlv_2= '+' )
            	            // InternalAle.g:2289:7: () otherlv_2= '+'
            	            {
            	            // InternalAle.g:2289:7: ()
            	            // InternalAle.g:2290:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAddOperationAccess().getAddOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,50,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getAddOperationAccess().getPlusSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2302:6: ( () otherlv_4= '-' )
            	            {
            	            // InternalAle.g:2302:6: ( () otherlv_4= '-' )
            	            // InternalAle.g:2303:7: () otherlv_4= '-'
            	            {
            	            // InternalAle.g:2303:7: ()
            	            // InternalAle.g:2304:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAddOperationAccess().getSubOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,51,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getAddOperationAccess().getHyphenMinusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2316:5: ( (lv_right_5_0= ruleChaindedCall ) )
            	    // InternalAle.g:2317:6: (lv_right_5_0= ruleChaindedCall )
            	    {
            	    // InternalAle.g:2317:6: (lv_right_5_0= ruleChaindedCall )
            	    // InternalAle.g:2318:7: lv_right_5_0= ruleChaindedCall
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
            	    break loop34;
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
    // InternalAle.g:2341:1: entryRuleChaindedCall returns [EObject current=null] : iv_ruleChaindedCall= ruleChaindedCall EOF ;
    public final EObject entryRuleChaindedCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChaindedCall = null;


        try {
            // InternalAle.g:2341:53: (iv_ruleChaindedCall= ruleChaindedCall EOF )
            // InternalAle.g:2342:2: iv_ruleChaindedCall= ruleChaindedCall EOF
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
    // InternalAle.g:2348:1: ruleChaindedCall returns [EObject current=null] : (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* ) ;
    public final EObject ruleChaindedCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_InfixOperation_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2354:2: ( (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* ) )
            // InternalAle.g:2355:2: (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* )
            {
            // InternalAle.g:2355:2: (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* )
            // InternalAle.g:2356:3: this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )*
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
            // InternalAle.g:2364:3: ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==52) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred7_InternalAle()) ) {
                        alt36=1;
                    }


                }
                else if ( (LA36_0==53) ) {
                    int LA36_3 = input.LA(2);

                    if ( (synpred7_InternalAle()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalAle.g:2365:4: ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) )
            	    {
            	    // InternalAle.g:2386:4: ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) )
            	    // InternalAle.g:2387:5: ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) )
            	    {
            	    // InternalAle.g:2387:5: ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==52) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==53) ) {
            	        alt35=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalAle.g:2388:6: ( () otherlv_2= '.' )
            	            {
            	            // InternalAle.g:2388:6: ( () otherlv_2= '.' )
            	            // InternalAle.g:2389:7: () otherlv_2= '.'
            	            {
            	            // InternalAle.g:2389:7: ()
            	            // InternalAle.g:2390:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getChaindedCallAccess().getChainedCallLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,52,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getChaindedCallAccess().getFullStopKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2402:6: ( () otherlv_4= '->' )
            	            {
            	            // InternalAle.g:2402:6: ( () otherlv_4= '->' )
            	            // InternalAle.g:2403:7: () otherlv_4= '->'
            	            {
            	            // InternalAle.g:2403:7: ()
            	            // InternalAle.g:2404:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getChaindedCallAccess().getChainedCallArrowLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,53,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getChaindedCallAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2416:5: ( (lv_right_5_0= ruleInfixOperation ) )
            	    // InternalAle.g:2417:6: (lv_right_5_0= ruleInfixOperation )
            	    {
            	    // InternalAle.g:2417:6: (lv_right_5_0= ruleInfixOperation )
            	    // InternalAle.g:2418:7: lv_right_5_0= ruleInfixOperation
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
            	    break loop36;
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
    // InternalAle.g:2441:1: entryRuleInfixOperation returns [EObject current=null] : iv_ruleInfixOperation= ruleInfixOperation EOF ;
    public final EObject entryRuleInfixOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperation = null;


        try {
            // InternalAle.g:2441:55: (iv_ruleInfixOperation= ruleInfixOperation EOF )
            // InternalAle.g:2442:2: iv_ruleInfixOperation= ruleInfixOperation EOF
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
    // InternalAle.g:2448:1: ruleInfixOperation returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')' ) | ( () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' ) ) | this_AtomicLiteral_18= ruleAtomicLiteral ) ;
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
            // InternalAle.g:2454:2: ( ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')' ) | ( () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' ) ) | this_AtomicLiteral_18= ruleAtomicLiteral ) )
            // InternalAle.g:2455:2: ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')' ) | ( () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' ) ) | this_AtomicLiteral_18= ruleAtomicLiteral )
            {
            // InternalAle.g:2455:2: ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')' ) | ( () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' ) ) | this_AtomicLiteral_18= ruleAtomicLiteral )
            int alt39=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt39=1;
                }
                break;
            case 51:
                {
                alt39=2;
                }
                break;
            case 55:
                {
                alt39=3;
                }
                break;
            case RULE_ID:
                {
                int LA39_4 = input.LA(2);

                if ( (LA39_4==27) ) {
                    alt39=4;
                }
                else if ( (LA39_4==EOF||LA39_4==15||LA39_4==22||LA39_4==24||LA39_4==28||LA39_4==32||(LA39_4>=38 && LA39_4<=53)||LA39_4==60) ) {
                    alt39=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case RULE_BOOLEAN:
            case RULE_NULL:
            case 27:
            case 57:
            case 58:
            case 59:
            case 61:
            case 62:
                {
                alt39=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalAle.g:2456:3: ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:2456:3: ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) )
                    // InternalAle.g:2457:4: () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // InternalAle.g:2457:4: ()
                    // InternalAle.g:2458:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getNotInfixOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,54,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getInfixOperationAccess().getNotKeyword_0_1());
                      			
                    }
                    // InternalAle.g:2468:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalAle.g:2469:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalAle.g:2469:5: (lv_expression_2_0= ruleExpression )
                    // InternalAle.g:2470:6: lv_expression_2_0= ruleExpression
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
                    // InternalAle.g:2489:3: ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:2489:3: ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) )
                    // InternalAle.g:2490:4: () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) )
                    {
                    // InternalAle.g:2490:4: ()
                    // InternalAle.g:2491:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getNegInfixOperationAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,51,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getInfixOperationAccess().getHyphenMinusKeyword_1_1());
                      			
                    }
                    // InternalAle.g:2501:4: ( (lv_expression_5_0= ruleExpression ) )
                    // InternalAle.g:2502:5: (lv_expression_5_0= ruleExpression )
                    {
                    // InternalAle.g:2502:5: (lv_expression_5_0= ruleExpression )
                    // InternalAle.g:2503:6: lv_expression_5_0= ruleExpression
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
                    // InternalAle.g:2522:3: ( () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')' )
                    {
                    // InternalAle.g:2522:3: ( () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')' )
                    // InternalAle.g:2523:4: () otherlv_7= 'new' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' otherlv_10= ')'
                    {
                    // InternalAle.g:2523:4: ()
                    // InternalAle.g:2524:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getConstructorOperationAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,55,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getInfixOperationAccess().getNewKeyword_2_1());
                      			
                    }
                    // InternalAle.g:2534:4: ( (lv_name_8_0= RULE_ID ) )
                    // InternalAle.g:2535:5: (lv_name_8_0= RULE_ID )
                    {
                    // InternalAle.g:2535:5: (lv_name_8_0= RULE_ID )
                    // InternalAle.g:2536:6: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

                    otherlv_9=(Token)match(input,27,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_2_3());
                      			
                    }
                    otherlv_10=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:2562:3: ( () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' ) )
                    {
                    // InternalAle.g:2562:3: ( () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' ) )
                    // InternalAle.g:2563:4: () ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' )
                    {
                    // InternalAle.g:2563:4: ()
                    // InternalAle.g:2564:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getOperationCallOperationAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2570:4: ( (lv_name_12_0= RULE_ID ) )
                    // InternalAle.g:2571:5: (lv_name_12_0= RULE_ID )
                    {
                    // InternalAle.g:2571:5: (lv_name_12_0= RULE_ID )
                    // InternalAle.g:2572:6: lv_name_12_0= RULE_ID
                    {
                    lv_name_12_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

                    // InternalAle.g:2588:4: (otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')' )
                    // InternalAle.g:2589:5: otherlv_13= '(' ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )? otherlv_17= ')'
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_3_2_0());
                      				
                    }
                    // InternalAle.g:2593:5: ( ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_NULL)||LA38_0==27||LA38_0==51||(LA38_0>=54 && LA38_0<=55)||(LA38_0>=57 && LA38_0<=59)||(LA38_0>=61 && LA38_0<=62)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalAle.g:2594:6: ( (lv_parameters_14_0= ruleParamCall ) ) (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )*
                            {
                            // InternalAle.g:2594:6: ( (lv_parameters_14_0= ruleParamCall ) )
                            // InternalAle.g:2595:7: (lv_parameters_14_0= ruleParamCall )
                            {
                            // InternalAle.g:2595:7: (lv_parameters_14_0= ruleParamCall )
                            // InternalAle.g:2596:8: lv_parameters_14_0= ruleParamCall
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_3_2_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_17);
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

                            // InternalAle.g:2613:6: (otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==22) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // InternalAle.g:2614:7: otherlv_15= ',' ( (lv_parameters_16_0= ruleParamCall ) )
                            	    {
                            	    otherlv_15=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_15, grammarAccess.getInfixOperationAccess().getCommaKeyword_3_2_1_1_0());
                            	      						
                            	    }
                            	    // InternalAle.g:2618:7: ( (lv_parameters_16_0= ruleParamCall ) )
                            	    // InternalAle.g:2619:8: (lv_parameters_16_0= ruleParamCall )
                            	    {
                            	    // InternalAle.g:2619:8: (lv_parameters_16_0= ruleParamCall )
                            	    // InternalAle.g:2620:9: lv_parameters_16_0= ruleParamCall
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_3_2_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_17);
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
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_3_2_2());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:2646:3: this_AtomicLiteral_18= ruleAtomicLiteral
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
    // InternalAle.g:2658:1: entryRuleParamCall returns [EObject current=null] : iv_ruleParamCall= ruleParamCall EOF ;
    public final EObject entryRuleParamCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamCall = null;


        try {
            // InternalAle.g:2658:50: (iv_ruleParamCall= ruleParamCall EOF )
            // InternalAle.g:2659:2: iv_ruleParamCall= ruleParamCall EOF
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
    // InternalAle.g:2665:1: ruleParamCall returns [EObject current=null] : ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParamCall() throws RecognitionException {
        EObject current = null;

        Token lv_lambda_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2671:2: ( ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalAle.g:2672:2: ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalAle.g:2672:2: ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalAle.g:2673:3: ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalAle.g:2673:3: ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==56) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalAle.g:2674:4: ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|'
                    {
                    // InternalAle.g:2674:4: ( (lv_lambda_0_0= RULE_ID ) )
                    // InternalAle.g:2675:5: (lv_lambda_0_0= RULE_ID )
                    {
                    // InternalAle.g:2675:5: (lv_lambda_0_0= RULE_ID )
                    // InternalAle.g:2676:6: lv_lambda_0_0= RULE_ID
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

                    otherlv_1=(Token)match(input,56,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getParamCallAccess().getVerticalLineKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAle.g:2697:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalAle.g:2698:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalAle.g:2698:4: (lv_expression_2_0= ruleExpression )
            // InternalAle.g:2699:5: lv_expression_2_0= ruleExpression
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
    // InternalAle.g:2720:1: entryRuleAtomicLiteral returns [EObject current=null] : iv_ruleAtomicLiteral= ruleAtomicLiteral EOF ;
    public final EObject entryRuleAtomicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicLiteral = null;


        try {
            // InternalAle.g:2720:54: (iv_ruleAtomicLiteral= ruleAtomicLiteral EOF )
            // InternalAle.g:2721:2: iv_ruleAtomicLiteral= ruleAtomicLiteral EOF
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
    // InternalAle.g:2727:1: ruleAtomicLiteral returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'self' ) | ( () otherlv_6= 'super' ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= RULE_INT ) ) ) | ( () ( (lv_value_12_0= RULE_REAL ) ) ) | ( () ( (lv_value_14_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_16= RULE_NULL ) | ( () otherlv_18= '[' ( (lv_start_19_0= ruleExpression ) ) otherlv_20= '.' otherlv_21= '.' ( (lv_stop_22_0= ruleExpression ) ) otherlv_23= ']' ) | ( () otherlv_25= 'Sequence' otherlv_26= '{' ( ( (lv_expressions_27_0= ruleExpression ) ) (otherlv_28= ',' ( (lv_expressions_29_0= ruleExpression ) ) )* )? otherlv_30= '}' ) | ( () otherlv_32= 'OrderedSet' otherlv_33= '{' ( ( (lv_expressions_34_0= ruleExpression ) ) (otherlv_35= ',' ( (lv_expressions_36_0= ruleExpression ) ) )* )? otherlv_37= '}' ) | ( () ( (lv_value_39_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomicLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_value_8_0=null;
        Token lv_value_10_0=null;
        Token lv_value_12_0=null;
        Token lv_value_14_0=null;
        Token this_NULL_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token lv_value_39_0=null;
        EObject this_Expression_1 = null;

        EObject lv_start_19_0 = null;

        EObject lv_stop_22_0 = null;

        EObject lv_expressions_27_0 = null;

        EObject lv_expressions_29_0 = null;

        EObject lv_expressions_34_0 = null;

        EObject lv_expressions_36_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2733:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'self' ) | ( () otherlv_6= 'super' ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= RULE_INT ) ) ) | ( () ( (lv_value_12_0= RULE_REAL ) ) ) | ( () ( (lv_value_14_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_16= RULE_NULL ) | ( () otherlv_18= '[' ( (lv_start_19_0= ruleExpression ) ) otherlv_20= '.' otherlv_21= '.' ( (lv_stop_22_0= ruleExpression ) ) otherlv_23= ']' ) | ( () otherlv_25= 'Sequence' otherlv_26= '{' ( ( (lv_expressions_27_0= ruleExpression ) ) (otherlv_28= ',' ( (lv_expressions_29_0= ruleExpression ) ) )* )? otherlv_30= '}' ) | ( () otherlv_32= 'OrderedSet' otherlv_33= '{' ( ( (lv_expressions_34_0= ruleExpression ) ) (otherlv_35= ',' ( (lv_expressions_36_0= ruleExpression ) ) )* )? otherlv_37= '}' ) | ( () ( (lv_value_39_0= RULE_ID ) ) ) ) )
            // InternalAle.g:2734:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'self' ) | ( () otherlv_6= 'super' ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= RULE_INT ) ) ) | ( () ( (lv_value_12_0= RULE_REAL ) ) ) | ( () ( (lv_value_14_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_16= RULE_NULL ) | ( () otherlv_18= '[' ( (lv_start_19_0= ruleExpression ) ) otherlv_20= '.' otherlv_21= '.' ( (lv_stop_22_0= ruleExpression ) ) otherlv_23= ']' ) | ( () otherlv_25= 'Sequence' otherlv_26= '{' ( ( (lv_expressions_27_0= ruleExpression ) ) (otherlv_28= ',' ( (lv_expressions_29_0= ruleExpression ) ) )* )? otherlv_30= '}' ) | ( () otherlv_32= 'OrderedSet' otherlv_33= '{' ( ( (lv_expressions_34_0= ruleExpression ) ) (otherlv_35= ',' ( (lv_expressions_36_0= ruleExpression ) ) )* )? otherlv_37= '}' ) | ( () ( (lv_value_39_0= RULE_ID ) ) ) )
            {
            // InternalAle.g:2734:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'self' ) | ( () otherlv_6= 'super' ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= RULE_INT ) ) ) | ( () ( (lv_value_12_0= RULE_REAL ) ) ) | ( () ( (lv_value_14_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_16= RULE_NULL ) | ( () otherlv_18= '[' ( (lv_start_19_0= ruleExpression ) ) otherlv_20= '.' otherlv_21= '.' ( (lv_stop_22_0= ruleExpression ) ) otherlv_23= ']' ) | ( () otherlv_25= 'Sequence' otherlv_26= '{' ( ( (lv_expressions_27_0= ruleExpression ) ) (otherlv_28= ',' ( (lv_expressions_29_0= ruleExpression ) ) )* )? otherlv_30= '}' ) | ( () otherlv_32= 'OrderedSet' otherlv_33= '{' ( ( (lv_expressions_34_0= ruleExpression ) ) (otherlv_35= ',' ( (lv_expressions_36_0= ruleExpression ) ) )* )? otherlv_37= '}' ) | ( () ( (lv_value_39_0= RULE_ID ) ) ) )
            int alt45=12;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt45=1;
                }
                break;
            case 57:
                {
                alt45=2;
                }
                break;
            case 58:
                {
                alt45=3;
                }
                break;
            case RULE_STRING:
                {
                alt45=4;
                }
                break;
            case RULE_INT:
                {
                alt45=5;
                }
                break;
            case RULE_REAL:
                {
                alt45=6;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt45=7;
                }
                break;
            case RULE_NULL:
                {
                alt45=8;
                }
                break;
            case 59:
                {
                alt45=9;
                }
                break;
            case 61:
                {
                alt45=10;
                }
                break;
            case 62:
                {
                alt45=11;
                }
                break;
            case RULE_ID:
                {
                alt45=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalAle.g:2735:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalAle.g:2735:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalAle.g:2736:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
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
                    otherlv_2=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAtomicLiteralAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:2754:3: ( () otherlv_4= 'self' )
                    {
                    // InternalAle.g:2754:3: ( () otherlv_4= 'self' )
                    // InternalAle.g:2755:4: () otherlv_4= 'self'
                    {
                    // InternalAle.g:2755:4: ()
                    // InternalAle.g:2756:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getSelfRefAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAtomicLiteralAccess().getSelfKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:2768:3: ( () otherlv_6= 'super' )
                    {
                    // InternalAle.g:2768:3: ( () otherlv_6= 'super' )
                    // InternalAle.g:2769:4: () otherlv_6= 'super'
                    {
                    // InternalAle.g:2769:4: ()
                    // InternalAle.g:2770:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getSuperRefAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_6=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getAtomicLiteralAccess().getSuperKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:2782:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    {
                    // InternalAle.g:2782:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    // InternalAle.g:2783:4: () ( (lv_value_8_0= RULE_STRING ) )
                    {
                    // InternalAle.g:2783:4: ()
                    // InternalAle.g:2784:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getStringLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2790:4: ( (lv_value_8_0= RULE_STRING ) )
                    // InternalAle.g:2791:5: (lv_value_8_0= RULE_STRING )
                    {
                    // InternalAle.g:2791:5: (lv_value_8_0= RULE_STRING )
                    // InternalAle.g:2792:6: lv_value_8_0= RULE_STRING
                    {
                    lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_8_0, grammarAccess.getAtomicLiteralAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_8_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:2810:3: ( () ( (lv_value_10_0= RULE_INT ) ) )
                    {
                    // InternalAle.g:2810:3: ( () ( (lv_value_10_0= RULE_INT ) ) )
                    // InternalAle.g:2811:4: () ( (lv_value_10_0= RULE_INT ) )
                    {
                    // InternalAle.g:2811:4: ()
                    // InternalAle.g:2812:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getIntLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2818:4: ( (lv_value_10_0= RULE_INT ) )
                    // InternalAle.g:2819:5: (lv_value_10_0= RULE_INT )
                    {
                    // InternalAle.g:2819:5: (lv_value_10_0= RULE_INT )
                    // InternalAle.g:2820:6: lv_value_10_0= RULE_INT
                    {
                    lv_value_10_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_10_0, grammarAccess.getAtomicLiteralAccess().getValueINTTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_10_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:2838:3: ( () ( (lv_value_12_0= RULE_REAL ) ) )
                    {
                    // InternalAle.g:2838:3: ( () ( (lv_value_12_0= RULE_REAL ) ) )
                    // InternalAle.g:2839:4: () ( (lv_value_12_0= RULE_REAL ) )
                    {
                    // InternalAle.g:2839:4: ()
                    // InternalAle.g:2840:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getRealLiteralAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2846:4: ( (lv_value_12_0= RULE_REAL ) )
                    // InternalAle.g:2847:5: (lv_value_12_0= RULE_REAL )
                    {
                    // InternalAle.g:2847:5: (lv_value_12_0= RULE_REAL )
                    // InternalAle.g:2848:6: lv_value_12_0= RULE_REAL
                    {
                    lv_value_12_0=(Token)match(input,RULE_REAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_12_0, grammarAccess.getAtomicLiteralAccess().getValueREALTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_12_0,
                      							"ale.xtext.Ale.REAL");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:2866:3: ( () ( (lv_value_14_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalAle.g:2866:3: ( () ( (lv_value_14_0= RULE_BOOLEAN ) ) )
                    // InternalAle.g:2867:4: () ( (lv_value_14_0= RULE_BOOLEAN ) )
                    {
                    // InternalAle.g:2867:4: ()
                    // InternalAle.g:2868:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getBooleanLiteralAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2874:4: ( (lv_value_14_0= RULE_BOOLEAN ) )
                    // InternalAle.g:2875:5: (lv_value_14_0= RULE_BOOLEAN )
                    {
                    // InternalAle.g:2875:5: (lv_value_14_0= RULE_BOOLEAN )
                    // InternalAle.g:2876:6: lv_value_14_0= RULE_BOOLEAN
                    {
                    lv_value_14_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_14_0, grammarAccess.getAtomicLiteralAccess().getValueBOOLEANTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_14_0,
                      							"ale.xtext.Ale.BOOLEAN");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalAle.g:2894:3: ( () this_NULL_16= RULE_NULL )
                    {
                    // InternalAle.g:2894:3: ( () this_NULL_16= RULE_NULL )
                    // InternalAle.g:2895:4: () this_NULL_16= RULE_NULL
                    {
                    // InternalAle.g:2895:4: ()
                    // InternalAle.g:2896:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getNullLiteralAction_7_0(),
                      						current);
                      				
                    }

                    }

                    this_NULL_16=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_NULL_16, grammarAccess.getAtomicLiteralAccess().getNULLTerminalRuleCall_7_1());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalAle.g:2908:3: ( () otherlv_18= '[' ( (lv_start_19_0= ruleExpression ) ) otherlv_20= '.' otherlv_21= '.' ( (lv_stop_22_0= ruleExpression ) ) otherlv_23= ']' )
                    {
                    // InternalAle.g:2908:3: ( () otherlv_18= '[' ( (lv_start_19_0= ruleExpression ) ) otherlv_20= '.' otherlv_21= '.' ( (lv_stop_22_0= ruleExpression ) ) otherlv_23= ']' )
                    // InternalAle.g:2909:4: () otherlv_18= '[' ( (lv_start_19_0= ruleExpression ) ) otherlv_20= '.' otherlv_21= '.' ( (lv_stop_22_0= ruleExpression ) ) otherlv_23= ']'
                    {
                    // InternalAle.g:2909:4: ()
                    // InternalAle.g:2910:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getIntRangeAction_8_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_18=(Token)match(input,59,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getAtomicLiteralAccess().getLeftSquareBracketKeyword_8_1());
                      			
                    }
                    // InternalAle.g:2920:4: ( (lv_start_19_0= ruleExpression ) )
                    // InternalAle.g:2921:5: (lv_start_19_0= ruleExpression )
                    {
                    // InternalAle.g:2921:5: (lv_start_19_0= ruleExpression )
                    // InternalAle.g:2922:6: lv_start_19_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicLiteralAccess().getStartExpressionParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_start_19_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                      						}
                      						set(
                      							current,
                      							"start",
                      							lv_start_19_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,52,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_8_3());
                      			
                    }
                    otherlv_21=(Token)match(input,52,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_8_4());
                      			
                    }
                    // InternalAle.g:2947:4: ( (lv_stop_22_0= ruleExpression ) )
                    // InternalAle.g:2948:5: (lv_stop_22_0= ruleExpression )
                    {
                    // InternalAle.g:2948:5: (lv_stop_22_0= ruleExpression )
                    // InternalAle.g:2949:6: lv_stop_22_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicLiteralAccess().getStopExpressionParserRuleCall_8_5_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_stop_22_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                      						}
                      						set(
                      							current,
                      							"stop",
                      							lv_stop_22_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_23=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getAtomicLiteralAccess().getRightSquareBracketKeyword_8_6());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalAle.g:2972:3: ( () otherlv_25= 'Sequence' otherlv_26= '{' ( ( (lv_expressions_27_0= ruleExpression ) ) (otherlv_28= ',' ( (lv_expressions_29_0= ruleExpression ) ) )* )? otherlv_30= '}' )
                    {
                    // InternalAle.g:2972:3: ( () otherlv_25= 'Sequence' otherlv_26= '{' ( ( (lv_expressions_27_0= ruleExpression ) ) (otherlv_28= ',' ( (lv_expressions_29_0= ruleExpression ) ) )* )? otherlv_30= '}' )
                    // InternalAle.g:2973:4: () otherlv_25= 'Sequence' otherlv_26= '{' ( ( (lv_expressions_27_0= ruleExpression ) ) (otherlv_28= ',' ( (lv_expressions_29_0= ruleExpression ) ) )* )? otherlv_30= '}'
                    {
                    // InternalAle.g:2973:4: ()
                    // InternalAle.g:2974:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getSequenceDeclAction_9_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_25=(Token)match(input,61,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getAtomicLiteralAccess().getSequenceKeyword_9_1());
                      			
                    }
                    otherlv_26=(Token)match(input,23,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_9_2());
                      			
                    }
                    // InternalAle.g:2988:4: ( ( (lv_expressions_27_0= ruleExpression ) ) (otherlv_28= ',' ( (lv_expressions_29_0= ruleExpression ) ) )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_NULL)||LA42_0==27||LA42_0==51||(LA42_0>=54 && LA42_0<=55)||(LA42_0>=57 && LA42_0<=59)||(LA42_0>=61 && LA42_0<=62)) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalAle.g:2989:5: ( (lv_expressions_27_0= ruleExpression ) ) (otherlv_28= ',' ( (lv_expressions_29_0= ruleExpression ) ) )*
                            {
                            // InternalAle.g:2989:5: ( (lv_expressions_27_0= ruleExpression ) )
                            // InternalAle.g:2990:6: (lv_expressions_27_0= ruleExpression )
                            {
                            // InternalAle.g:2990:6: (lv_expressions_27_0= ruleExpression )
                            // InternalAle.g:2991:7: lv_expressions_27_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_9_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_41);
                            lv_expressions_27_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                              							}
                              							add(
                              								current,
                              								"expressions",
                              								lv_expressions_27_0,
                              								"ale.xtext.Ale.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalAle.g:3008:5: (otherlv_28= ',' ( (lv_expressions_29_0= ruleExpression ) ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==22) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // InternalAle.g:3009:6: otherlv_28= ',' ( (lv_expressions_29_0= ruleExpression ) )
                            	    {
                            	    otherlv_28=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_28, grammarAccess.getAtomicLiteralAccess().getCommaKeyword_9_3_1_0());
                            	      					
                            	    }
                            	    // InternalAle.g:3013:6: ( (lv_expressions_29_0= ruleExpression ) )
                            	    // InternalAle.g:3014:7: (lv_expressions_29_0= ruleExpression )
                            	    {
                            	    // InternalAle.g:3014:7: (lv_expressions_29_0= ruleExpression )
                            	    // InternalAle.g:3015:8: lv_expressions_29_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_9_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_41);
                            	    lv_expressions_29_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"expressions",
                            	      									lv_expressions_29_0,
                            	      									"ale.xtext.Ale.Expression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_30=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_9_4());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalAle.g:3040:3: ( () otherlv_32= 'OrderedSet' otherlv_33= '{' ( ( (lv_expressions_34_0= ruleExpression ) ) (otherlv_35= ',' ( (lv_expressions_36_0= ruleExpression ) ) )* )? otherlv_37= '}' )
                    {
                    // InternalAle.g:3040:3: ( () otherlv_32= 'OrderedSet' otherlv_33= '{' ( ( (lv_expressions_34_0= ruleExpression ) ) (otherlv_35= ',' ( (lv_expressions_36_0= ruleExpression ) ) )* )? otherlv_37= '}' )
                    // InternalAle.g:3041:4: () otherlv_32= 'OrderedSet' otherlv_33= '{' ( ( (lv_expressions_34_0= ruleExpression ) ) (otherlv_35= ',' ( (lv_expressions_36_0= ruleExpression ) ) )* )? otherlv_37= '}'
                    {
                    // InternalAle.g:3041:4: ()
                    // InternalAle.g:3042:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getOrderedSetDeclAction_10_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_32=(Token)match(input,62,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_32, grammarAccess.getAtomicLiteralAccess().getOrderedSetKeyword_10_1());
                      			
                    }
                    otherlv_33=(Token)match(input,23,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_10_2());
                      			
                    }
                    // InternalAle.g:3056:4: ( ( (lv_expressions_34_0= ruleExpression ) ) (otherlv_35= ',' ( (lv_expressions_36_0= ruleExpression ) ) )* )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_NULL)||LA44_0==27||LA44_0==51||(LA44_0>=54 && LA44_0<=55)||(LA44_0>=57 && LA44_0<=59)||(LA44_0>=61 && LA44_0<=62)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalAle.g:3057:5: ( (lv_expressions_34_0= ruleExpression ) ) (otherlv_35= ',' ( (lv_expressions_36_0= ruleExpression ) ) )*
                            {
                            // InternalAle.g:3057:5: ( (lv_expressions_34_0= ruleExpression ) )
                            // InternalAle.g:3058:6: (lv_expressions_34_0= ruleExpression )
                            {
                            // InternalAle.g:3058:6: (lv_expressions_34_0= ruleExpression )
                            // InternalAle.g:3059:7: lv_expressions_34_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_41);
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

                            // InternalAle.g:3076:5: (otherlv_35= ',' ( (lv_expressions_36_0= ruleExpression ) ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==22) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // InternalAle.g:3077:6: otherlv_35= ',' ( (lv_expressions_36_0= ruleExpression ) )
                            	    {
                            	    otherlv_35=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_35, grammarAccess.getAtomicLiteralAccess().getCommaKeyword_10_3_1_0());
                            	      					
                            	    }
                            	    // InternalAle.g:3081:6: ( (lv_expressions_36_0= ruleExpression ) )
                            	    // InternalAle.g:3082:7: (lv_expressions_36_0= ruleExpression )
                            	    {
                            	    // InternalAle.g:3082:7: (lv_expressions_36_0= ruleExpression )
                            	    // InternalAle.g:3083:8: lv_expressions_36_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_41);
                            	    lv_expressions_36_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"expressions",
                            	      									lv_expressions_36_0,
                            	      									"ale.xtext.Ale.Expression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop43;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_37=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_10_4());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalAle.g:3108:3: ( () ( (lv_value_39_0= RULE_ID ) ) )
                    {
                    // InternalAle.g:3108:3: ( () ( (lv_value_39_0= RULE_ID ) ) )
                    // InternalAle.g:3109:4: () ( (lv_value_39_0= RULE_ID ) )
                    {
                    // InternalAle.g:3109:4: ()
                    // InternalAle.g:3110:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getVarRefAction_11_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3116:4: ( (lv_value_39_0= RULE_ID ) )
                    // InternalAle.g:3117:5: (lv_value_39_0= RULE_ID )
                    {
                    // InternalAle.g:3117:5: (lv_value_39_0= RULE_ID )
                    // InternalAle.g:3118:6: lv_value_39_0= RULE_ID
                    {
                    lv_value_39_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_39_0, grammarAccess.getAtomicLiteralAccess().getValueIDTerminalRuleCall_11_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_39_0,
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
    // InternalAle.g:3139:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalAle.g:3139:46: (iv_ruleParam= ruleParam EOF )
            // InternalAle.g:3140:2: iv_ruleParam= ruleParam EOF
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
    // InternalAle.g:3146:1: ruleParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalAle.g:3152:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAle.g:3153:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAle.g:3153:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAle.g:3154:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAle.g:3154:3: ( (lv_type_0_0= ruleType ) )
            // InternalAle.g:3155:4: (lv_type_0_0= ruleType )
            {
            // InternalAle.g:3155:4: (lv_type_0_0= ruleType )
            // InternalAle.g:3156:5: lv_type_0_0= ruleType
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

            // InternalAle.g:3173:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAle.g:3174:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAle.g:3174:4: (lv_name_1_0= RULE_ID )
            // InternalAle.g:3175:5: lv_name_1_0= RULE_ID
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
    // InternalAle.g:3195:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAle.g:3195:45: (iv_ruleType= ruleType EOF )
            // InternalAle.g:3196:2: iv_ruleType= ruleType EOF
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
    // InternalAle.g:3202:1: ruleType returns [EObject current=null] : (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) ) ;
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
            // InternalAle.g:3208:2: ( (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) ) )
            // InternalAle.g:3209:2: (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) )
            {
            // InternalAle.g:3209:2: (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt46=1;
                }
                break;
            case RULE_ID:
                {
                alt46=2;
                }
                break;
            case 61:
                {
                alt46=3;
                }
                break;
            case 62:
                {
                alt46=4;
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
                    // InternalAle.g:3210:3: this_LiteralType_0= ruleLiteralType
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
                    // InternalAle.g:3219:3: ( () ( (lv_externalClass_2_0= RULE_ID ) ) )
                    {
                    // InternalAle.g:3219:3: ( () ( (lv_externalClass_2_0= RULE_ID ) ) )
                    // InternalAle.g:3220:4: () ( (lv_externalClass_2_0= RULE_ID ) )
                    {
                    // InternalAle.g:3220:4: ()
                    // InternalAle.g:3221:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getOutOfScopeTypeAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3227:4: ( (lv_externalClass_2_0= RULE_ID ) )
                    // InternalAle.g:3228:5: (lv_externalClass_2_0= RULE_ID )
                    {
                    // InternalAle.g:3228:5: (lv_externalClass_2_0= RULE_ID )
                    // InternalAle.g:3229:6: lv_externalClass_2_0= RULE_ID
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
                    // InternalAle.g:3247:3: ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' )
                    {
                    // InternalAle.g:3247:3: ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' )
                    // InternalAle.g:3248:4: () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')'
                    {
                    // InternalAle.g:3248:4: ()
                    // InternalAle.g:3249:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getSequenceTypeAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,61,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getSequenceKeyword_2_1());
                      			
                    }
                    otherlv_5=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2());
                      			
                    }
                    // InternalAle.g:3263:4: ( (lv_subType_6_0= ruleType ) )
                    // InternalAle.g:3264:5: (lv_subType_6_0= ruleType )
                    {
                    // InternalAle.g:3264:5: (lv_subType_6_0= ruleType )
                    // InternalAle.g:3265:6: lv_subType_6_0= ruleType
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

                    otherlv_7=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:3288:3: ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' )
                    {
                    // InternalAle.g:3288:3: ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' )
                    // InternalAle.g:3289:4: () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')'
                    {
                    // InternalAle.g:3289:4: ()
                    // InternalAle.g:3290:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getOrderedSetTypeAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,62,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getOrderedSetKeyword_3_1());
                      			
                    }
                    otherlv_10=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_3_2());
                      			
                    }
                    // InternalAle.g:3304:4: ( (lv_subType_11_0= ruleType ) )
                    // InternalAle.g:3305:5: (lv_subType_11_0= ruleType )
                    {
                    // InternalAle.g:3305:5: (lv_subType_11_0= ruleType )
                    // InternalAle.g:3306:6: lv_subType_11_0= ruleType
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

                    otherlv_12=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalAle.g:3332:1: entryRuleLiteralType returns [EObject current=null] : iv_ruleLiteralType= ruleLiteralType EOF ;
    public final EObject entryRuleLiteralType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralType = null;


        try {
            // InternalAle.g:3332:52: (iv_ruleLiteralType= ruleLiteralType EOF )
            // InternalAle.g:3333:2: iv_ruleLiteralType= ruleLiteralType EOF
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
    // InternalAle.g:3339:1: ruleLiteralType returns [EObject current=null] : ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' ) ) ) ;
    public final EObject ruleLiteralType() throws RecognitionException {
        EObject current = null;

        Token lv_lit_0_1=null;
        Token lv_lit_0_2=null;
        Token lv_lit_0_3=null;
        Token lv_lit_0_4=null;


        	enterRule();

        try {
            // InternalAle.g:3345:2: ( ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' ) ) ) )
            // InternalAle.g:3346:2: ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' ) ) )
            {
            // InternalAle.g:3346:2: ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' ) ) )
            // InternalAle.g:3347:3: ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' ) )
            {
            // InternalAle.g:3347:3: ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' ) )
            // InternalAle.g:3348:4: (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' )
            {
            // InternalAle.g:3348:4: (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Real' | lv_lit_0_3= 'Int' | lv_lit_0_4= 'String' )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt47=1;
                }
                break;
            case 64:
                {
                alt47=2;
                }
                break;
            case 65:
                {
                alt47=3;
                }
                break;
            case 66:
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
                    // InternalAle.g:3349:5: lv_lit_0_1= 'Boolean'
                    {
                    lv_lit_0_1=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
                    // InternalAle.g:3360:5: lv_lit_0_2= 'Real'
                    {
                    lv_lit_0_2=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
                    // InternalAle.g:3371:5: lv_lit_0_3= 'Int'
                    {
                    lv_lit_0_3=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
                    // InternalAle.g:3382:5: lv_lit_0_4= 'String'
                    {
                    lv_lit_0_4=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalAle.g:3398:1: entryRuleQualified returns [String current=null] : iv_ruleQualified= ruleQualified EOF ;
    public final String entryRuleQualified() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualified = null;


        try {
            // InternalAle.g:3398:49: (iv_ruleQualified= ruleQualified EOF )
            // InternalAle.g:3399:2: iv_ruleQualified= ruleQualified EOF
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
    // InternalAle.g:3405:1: ruleQualified returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualified() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAle.g:3411:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAle.g:3412:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAle.g:3412:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAle.g:3413:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAle.g:3420:3: (kw= '.' this_ID_2= RULE_ID )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==52) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAle.g:3421:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,52,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalAle.g:3438:1: entryRuleTypeSystem returns [EObject current=null] : iv_ruleTypeSystem= ruleTypeSystem EOF ;
    public final EObject entryRuleTypeSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSystem = null;


        try {
            // InternalAle.g:3438:51: (iv_ruleTypeSystem= ruleTypeSystem EOF )
            // InternalAle.g:3439:2: iv_ruleTypeSystem= ruleTypeSystem EOF
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
    // InternalAle.g:3445:1: ruleTypeSystem returns [EObject current=null] : ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Real' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) ) ;
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
            // InternalAle.g:3451:2: ( ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Real' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) ) )
            // InternalAle.g:3452:2: ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Real' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) )
            {
            // InternalAle.g:3452:2: ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Real' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) )
            int alt49=7;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt49=1;
                }
                break;
            case 64:
                {
                alt49=2;
                }
                break;
            case 65:
                {
                alt49=3;
                }
                break;
            case 66:
                {
                alt49=4;
                }
                break;
            case 67:
                {
                alt49=5;
                }
                break;
            case 61:
                {
                alt49=6;
                }
                break;
            case 20:
                {
                alt49=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalAle.g:3453:3: ( () otherlv_1= 'Boolean' )
                    {
                    // InternalAle.g:3453:3: ( () otherlv_1= 'Boolean' )
                    // InternalAle.g:3454:4: () otherlv_1= 'Boolean'
                    {
                    // InternalAle.g:3454:4: ()
                    // InternalAle.g:3455:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getBooleanTypeTAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeSystemAccess().getBooleanKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:3467:3: ( () otherlv_3= 'Real' )
                    {
                    // InternalAle.g:3467:3: ( () otherlv_3= 'Real' )
                    // InternalAle.g:3468:4: () otherlv_3= 'Real'
                    {
                    // InternalAle.g:3468:4: ()
                    // InternalAle.g:3469:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getRealTypeTAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypeSystemAccess().getRealKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:3481:3: ( () otherlv_5= 'Int' )
                    {
                    // InternalAle.g:3481:3: ( () otherlv_5= 'Int' )
                    // InternalAle.g:3482:4: () otherlv_5= 'Int'
                    {
                    // InternalAle.g:3482:4: ()
                    // InternalAle.g:3483:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getIntTypeTAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTypeSystemAccess().getIntKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:3495:3: ( () otherlv_7= 'String' )
                    {
                    // InternalAle.g:3495:3: ( () otherlv_7= 'String' )
                    // InternalAle.g:3496:4: () otherlv_7= 'String'
                    {
                    // InternalAle.g:3496:4: ()
                    // InternalAle.g:3497:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getStringTypeTAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTypeSystemAccess().getStringKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:3509:3: ( () otherlv_9= 'nulltype' )
                    {
                    // InternalAle.g:3509:3: ( () otherlv_9= 'nulltype' )
                    // InternalAle.g:3510:4: () otherlv_9= 'nulltype'
                    {
                    // InternalAle.g:3510:4: ()
                    // InternalAle.g:3511:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getNullTypeTAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTypeSystemAccess().getNulltypeKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:3523:3: ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) )
                    {
                    // InternalAle.g:3523:3: ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) )
                    // InternalAle.g:3524:4: () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) )
                    {
                    // InternalAle.g:3524:4: ()
                    // InternalAle.g:3525:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getSequenceTypeTAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,61,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTypeSystemAccess().getSequenceKeyword_5_1());
                      			
                    }
                    // InternalAle.g:3535:4: ( (lv_subType_12_0= ruleTypeSystem ) )
                    // InternalAle.g:3536:5: (lv_subType_12_0= ruleTypeSystem )
                    {
                    // InternalAle.g:3536:5: (lv_subType_12_0= ruleTypeSystem )
                    // InternalAle.g:3537:6: lv_subType_12_0= ruleTypeSystem
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
                    // InternalAle.g:3556:3: ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) )
                    {
                    // InternalAle.g:3556:3: ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) )
                    // InternalAle.g:3557:4: () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) )
                    {
                    // InternalAle.g:3557:4: ()
                    // InternalAle.g:3558:5: 
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
                    // InternalAle.g:3568:4: ( (otherlv_15= RULE_ID ) )
                    // InternalAle.g:3569:5: (otherlv_15= RULE_ID )
                    {
                    // InternalAle.g:3569:5: (otherlv_15= RULE_ID )
                    // InternalAle.g:3570:6: otherlv_15= RULE_ID
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
        // InternalAle.g:1723:4: ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )
        // InternalAle.g:1723:5: ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) )
        {
        // InternalAle.g:1723:5: ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) )
        // InternalAle.g:1724:5: ( () 'implies' ) ( ( ruleBooleanOperation ) )
        {
        // InternalAle.g:1724:5: ( () 'implies' )
        // InternalAle.g:1725:6: () 'implies'
        {
        // InternalAle.g:1725:6: ()
        // InternalAle.g:1726:6: 
        {
        }

        match(input,38,FOLLOW_21); if (state.failed) return ;

        }

        // InternalAle.g:1729:5: ( ( ruleBooleanOperation ) )
        // InternalAle.g:1730:6: ( ruleBooleanOperation )
        {
        // InternalAle.g:1730:6: ( ruleBooleanOperation )
        // InternalAle.g:1731:7: ruleBooleanOperation
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
        // InternalAle.g:1799:4: ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )
        // InternalAle.g:1799:5: ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) )
        {
        // InternalAle.g:1799:5: ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) )
        // InternalAle.g:1800:5: ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) )
        {
        // InternalAle.g:1800:5: ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) )
        int alt50=3;
        switch ( input.LA(1) ) {
        case 39:
            {
            alt50=1;
            }
            break;
        case 40:
            {
            alt50=2;
            }
            break;
        case 41:
            {
            alt50=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 50, 0, input);

            throw nvae;
        }

        switch (alt50) {
            case 1 :
                // InternalAle.g:1801:6: ( () 'or' )
                {
                // InternalAle.g:1801:6: ( () 'or' )
                // InternalAle.g:1802:7: () 'or'
                {
                // InternalAle.g:1802:7: ()
                // InternalAle.g:1803:7: 
                {
                }

                match(input,39,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:1807:6: ( () 'and' )
                {
                // InternalAle.g:1807:6: ( () 'and' )
                // InternalAle.g:1808:7: () 'and'
                {
                // InternalAle.g:1808:7: ()
                // InternalAle.g:1809:7: 
                {
                }

                match(input,40,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalAle.g:1813:6: ( () 'xor' )
                {
                // InternalAle.g:1813:6: ( () 'xor' )
                // InternalAle.g:1814:7: () 'xor'
                {
                // InternalAle.g:1814:7: ()
                // InternalAle.g:1815:7: 
                {
                }

                match(input,41,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:1819:5: ( ( ruleCompareOperation ) )
        // InternalAle.g:1820:6: ( ruleCompareOperation )
        {
        // InternalAle.g:1820:6: ( ruleCompareOperation )
        // InternalAle.g:1821:7: ruleCompareOperation
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
        // InternalAle.g:1919:4: ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )
        // InternalAle.g:1919:5: ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) )
        {
        // InternalAle.g:1919:5: ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) )
        // InternalAle.g:1920:5: ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) )
        {
        // InternalAle.g:1920:5: ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) )
        int alt51=5;
        switch ( input.LA(1) ) {
        case 42:
            {
            alt51=1;
            }
            break;
        case 43:
            {
            alt51=2;
            }
            break;
        case 44:
            {
            alt51=3;
            }
            break;
        case 45:
            {
            alt51=4;
            }
            break;
        case 46:
            {
            alt51=5;
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
                // InternalAle.g:1921:6: ( () '<=' )
                {
                // InternalAle.g:1921:6: ( () '<=' )
                // InternalAle.g:1922:7: () '<='
                {
                // InternalAle.g:1922:7: ()
                // InternalAle.g:1923:7: 
                {
                }

                match(input,42,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:1927:6: ( () '>=' )
                {
                // InternalAle.g:1927:6: ( () '>=' )
                // InternalAle.g:1928:7: () '>='
                {
                // InternalAle.g:1928:7: ()
                // InternalAle.g:1929:7: 
                {
                }

                match(input,43,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalAle.g:1933:6: ( () '!=' )
                {
                // InternalAle.g:1933:6: ( () '!=' )
                // InternalAle.g:1934:7: () '!='
                {
                // InternalAle.g:1934:7: ()
                // InternalAle.g:1935:7: 
                {
                }

                match(input,44,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // InternalAle.g:1939:6: ( () '<' )
                {
                // InternalAle.g:1939:6: ( () '<' )
                // InternalAle.g:1940:7: () '<'
                {
                // InternalAle.g:1940:7: ()
                // InternalAle.g:1941:7: 
                {
                }

                match(input,45,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 5 :
                // InternalAle.g:1945:6: ( () '>' )
                {
                // InternalAle.g:1945:6: ( () '>' )
                // InternalAle.g:1946:7: () '>'
                {
                // InternalAle.g:1946:7: ()
                // InternalAle.g:1947:7: 
                {
                }

                match(input,46,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:1951:5: ( ( ruleEqualityOperation ) )
        // InternalAle.g:1952:6: ( ruleEqualityOperation )
        {
        // InternalAle.g:1952:6: ( ruleEqualityOperation )
        // InternalAle.g:1953:7: ruleEqualityOperation
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
        // InternalAle.g:2079:4: ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )
        // InternalAle.g:2079:5: ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) )
        {
        // InternalAle.g:2079:5: ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) )
        // InternalAle.g:2080:5: () ( ( '==' ) ) ( ( ruleMultOperation ) )
        {
        // InternalAle.g:2080:5: ()
        // InternalAle.g:2081:5: 
        {
        }

        // InternalAle.g:2082:5: ( ( '==' ) )
        // InternalAle.g:2083:6: ( '==' )
        {
        // InternalAle.g:2083:6: ( '==' )
        // InternalAle.g:2084:7: '=='
        {
        match(input,47,FOLLOW_21); if (state.failed) return ;

        }


        }

        // InternalAle.g:2087:5: ( ( ruleMultOperation ) )
        // InternalAle.g:2088:6: ( ruleMultOperation )
        {
        // InternalAle.g:2088:6: ( ruleMultOperation )
        // InternalAle.g:2089:7: ruleMultOperation
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
        // InternalAle.g:2165:4: ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )
        // InternalAle.g:2165:5: ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) )
        {
        // InternalAle.g:2165:5: ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) )
        // InternalAle.g:2166:5: ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) )
        {
        // InternalAle.g:2166:5: ( ( () '*' ) | ( () '/' ) )
        int alt52=2;
        int LA52_0 = input.LA(1);

        if ( (LA52_0==48) ) {
            alt52=1;
        }
        else if ( (LA52_0==49) ) {
            alt52=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 52, 0, input);

            throw nvae;
        }
        switch (alt52) {
            case 1 :
                // InternalAle.g:2167:6: ( () '*' )
                {
                // InternalAle.g:2167:6: ( () '*' )
                // InternalAle.g:2168:7: () '*'
                {
                // InternalAle.g:2168:7: ()
                // InternalAle.g:2169:7: 
                {
                }

                match(input,48,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2173:6: ( () '/' )
                {
                // InternalAle.g:2173:6: ( () '/' )
                // InternalAle.g:2174:7: () '/'
                {
                // InternalAle.g:2174:7: ()
                // InternalAle.g:2175:7: 
                {
                }

                match(input,49,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2179:5: ( ( ruleAddOperation ) )
        // InternalAle.g:2180:6: ( ruleAddOperation )
        {
        // InternalAle.g:2180:6: ( ruleAddOperation )
        // InternalAle.g:2181:7: ruleAddOperation
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
        // InternalAle.g:2265:4: ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )
        // InternalAle.g:2265:5: ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) )
        {
        // InternalAle.g:2265:5: ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) )
        // InternalAle.g:2266:5: ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) )
        {
        // InternalAle.g:2266:5: ( ( () '+' ) | ( () '-' ) )
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
                // InternalAle.g:2267:6: ( () '+' )
                {
                // InternalAle.g:2267:6: ( () '+' )
                // InternalAle.g:2268:7: () '+'
                {
                // InternalAle.g:2268:7: ()
                // InternalAle.g:2269:7: 
                {
                }

                match(input,50,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2273:6: ( () '-' )
                {
                // InternalAle.g:2273:6: ( () '-' )
                // InternalAle.g:2274:7: () '-'
                {
                // InternalAle.g:2274:7: ()
                // InternalAle.g:2275:7: 
                {
                }

                match(input,51,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2279:5: ( ( ruleChaindedCall ) )
        // InternalAle.g:2280:6: ( ruleChaindedCall )
        {
        // InternalAle.g:2280:6: ( ruleChaindedCall )
        // InternalAle.g:2281:7: ruleChaindedCall
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
        // InternalAle.g:2365:4: ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )
        // InternalAle.g:2365:5: ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) )
        {
        // InternalAle.g:2365:5: ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) )
        // InternalAle.g:2366:5: ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) )
        {
        // InternalAle.g:2366:5: ( ( () '.' ) | ( () '->' ) )
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
                // InternalAle.g:2367:6: ( () '.' )
                {
                // InternalAle.g:2367:6: ( () '.' )
                // InternalAle.g:2368:7: () '.'
                {
                // InternalAle.g:2368:7: ()
                // InternalAle.g:2369:7: 
                {
                }

                match(input,52,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2373:6: ( () '->' )
                {
                // InternalAle.g:2373:6: ( () '->' )
                // InternalAle.g:2374:7: () '->'
                {
                // InternalAle.g:2374:7: ()
                // InternalAle.g:2375:7: 
                {
                }

                match(input,53,FOLLOW_21); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2379:5: ( ( ruleInfixOperation ) )
        // InternalAle.g:2380:6: ( ruleInfixOperation )
        {
        // InternalAle.g:2380:6: ( ruleInfixOperation )
        // InternalAle.g:2381:7: ruleInfixOperation
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


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\22\1\4\2\uffff\1\22";
    static final String dfa_3s = "\1\35\1\4\2\uffff\1\35";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\uffff";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\6\uffff\1\2\3\uffff\1\3",
            "\1\4",
            "",
            "",
            "\1\1\6\uffff\1\2\3\uffff\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "635:2: (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\4\2\27\6\uffff";
    static final String dfa_9s = "\1\102\1\uffff\1\65\2\33\6\uffff";
    static final String dfa_10s = "\1\uffff\1\1\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\5\12\21\uffff\1\12\2\uffff\1\11\1\10\1\uffff\1\6\1\uffff\1\7\1\5\16\uffff\1\12\2\uffff\2\12\1\uffff\3\12\1\uffff\1\3\1\4\4\1",
            "",
            "\1\1\12\uffff\1\12\13\uffff\1\12\12\uffff\20\12",
            "\1\12\3\uffff\1\1",
            "\1\12\3\uffff\1\1",
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

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "986:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) )";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xE000000023040010L,0x0000000000000007L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000023040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xE000000004000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xE000000010000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xE000000000000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x6EC80000080003F0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x6EC80000880003F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xEEC8001AC90003F0L,0x0000000000000007L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00007C0000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x6EC80000180003F0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x6EC80000090003F0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xA000000000100000L,0x000000000000000FL});

}