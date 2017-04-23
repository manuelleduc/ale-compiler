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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_REAL", "RULE_BOOLEAN", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'behavior'", "'extends'", "','", "';'", "'import'", "'as'", "'@'", "'open'", "'class'", "'{'", "'}'", "'ref'", "'rev'", "'cont'", "'def'", "'void'", "'('", "')'", "'override'", "'debug'", "'return'", "'let'", "'in'", "'if'", "'else'", "'while'", "'for'", "'='", "'implies'", "'or'", "'and'", "'xor'", "'<='", "'>='", "'!='", "'<'", "'>'", "'instanceof'", "'castto'", "'=='", "'*'", "'/'", "'+'", "'-'", "'.'", "'->'", "'not'", "'newSequence'", "'new'", "'|'", "'$'", "'['", "']'", "'self'", "'super'", "'Sequence'", "'OrderedSet'", "'Boolean'", "'Float'", "'Integer'", "'String'", "'Int'", "'nulltype'"
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
    public static final int T__71=71;
    public static final int T__72=72;
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
    // InternalAle.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) (otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )* )? otherlv_6= ';' ( (lv_imports_7_0= ruleImport ) )* ( (lv_classes_8_0= ruleAleClass ) )* ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_superAle_3_0 = null;

        AntlrDatatypeRuleToken lv_superAle_5_0 = null;

        EObject lv_imports_7_0 = null;

        EObject lv_classes_8_0 = null;



        	enterRule();

        try {
            // InternalAle.g:77:2: ( (otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) (otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )* )? otherlv_6= ';' ( (lv_imports_7_0= ruleImport ) )* ( (lv_classes_8_0= ruleAleClass ) )* ) )
            // InternalAle.g:78:2: (otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) (otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )* )? otherlv_6= ';' ( (lv_imports_7_0= ruleImport ) )* ( (lv_classes_8_0= ruleAleClass ) )* )
            {
            // InternalAle.g:78:2: (otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) (otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )* )? otherlv_6= ';' ( (lv_imports_7_0= ruleImport ) )* ( (lv_classes_8_0= ruleAleClass ) )* )
            // InternalAle.g:79:3: otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) (otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )* )? otherlv_6= ';' ( (lv_imports_7_0= ruleImport ) )* ( (lv_classes_8_0= ruleAleClass ) )*
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

            // InternalAle.g:102:3: (otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAle.g:103:4: otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )*
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRootAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalAle.g:107:4: ( (lv_superAle_3_0= ruleQualified ) )
                    // InternalAle.g:108:5: (lv_superAle_3_0= ruleQualified )
                    {
                    // InternalAle.g:108:5: (lv_superAle_3_0= ruleQualified )
                    // InternalAle.g:109:6: lv_superAle_3_0= ruleQualified
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRootAccess().getSuperAleQualifiedParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_superAle_3_0=ruleQualified();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRootRule());
                      						}
                      						add(
                      							current,
                      							"superAle",
                      							lv_superAle_3_0,
                      							"ale.xtext.Ale.Qualified");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:126:4: (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalAle.g:127:5: otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getRootAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalAle.g:131:5: ( (lv_superAle_5_0= ruleQualified ) )
                    	    // InternalAle.g:132:6: (lv_superAle_5_0= ruleQualified )
                    	    {
                    	    // InternalAle.g:132:6: (lv_superAle_5_0= ruleQualified )
                    	    // InternalAle.g:133:7: lv_superAle_5_0= ruleQualified
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRootAccess().getSuperAleQualifiedParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_5);
                    	    lv_superAle_5_0=ruleQualified();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRootRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"superAle",
                    	      								lv_superAle_5_0,
                    	      								"ale.xtext.Ale.Qualified");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getRootAccess().getSemicolonKeyword_3());
              		
            }
            // InternalAle.g:156:3: ( (lv_imports_7_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAle.g:157:4: (lv_imports_7_0= ruleImport )
            	    {
            	    // InternalAle.g:157:4: (lv_imports_7_0= ruleImport )
            	    // InternalAle.g:158:5: lv_imports_7_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRootAccess().getImportsImportParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_imports_7_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_7_0,
            	      						"ale.xtext.Ale.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalAle.g:175:3: ( (lv_classes_8_0= ruleAleClass ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=22)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAle.g:176:4: (lv_classes_8_0= ruleAleClass )
            	    {
            	    // InternalAle.g:176:4: (lv_classes_8_0= ruleAleClass )
            	    // InternalAle.g:177:5: lv_classes_8_0= ruleAleClass
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRootAccess().getClassesAleClassParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_classes_8_0=ruleAleClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"classes",
            	      						lv_classes_8_0,
            	      						"ale.xtext.Ale.AleClass");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalAle.g:198:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAle.g:198:47: (iv_ruleImport= ruleImport EOF )
            // InternalAle.g:199:2: iv_ruleImport= ruleImport EOF
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
    // InternalAle.g:205:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAle.g:211:2: ( (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalAle.g:212:2: (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalAle.g:212:2: (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // InternalAle.g:213:3: otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalAle.g:217:3: ( (otherlv_1= RULE_ID ) )
            // InternalAle.g:218:4: (otherlv_1= RULE_ID )
            {
            // InternalAle.g:218:4: (otherlv_1= RULE_ID )
            // InternalAle.g:219:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getImportAccess().getRefRootCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getAsKeyword_2());
              		
            }
            // InternalAle.g:234:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAle.g:235:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAle.g:235:4: (lv_name_3_0= RULE_ID )
            // InternalAle.g:236:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalAle.g:260:1: entryRuleAleClass returns [EObject current=null] : iv_ruleAleClass= ruleAleClass EOF ;
    public final EObject entryRuleAleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAleClass = null;


        try {
            // InternalAle.g:260:49: (iv_ruleAleClass= ruleAleClass EOF )
            // InternalAle.g:261:2: iv_ruleAleClass= ruleAleClass EOF
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
    // InternalAle.g:267:1: ruleAleClass returns [EObject current=null] : (this_OpenClass_0= ruleOpenClass | this_NewClass_1= ruleNewClass ) ;
    public final EObject ruleAleClass() throws RecognitionException {
        EObject current = null;

        EObject this_OpenClass_0 = null;

        EObject this_NewClass_1 = null;



        	enterRule();

        try {
            // InternalAle.g:273:2: ( (this_OpenClass_0= ruleOpenClass | this_NewClass_1= ruleNewClass ) )
            // InternalAle.g:274:2: (this_OpenClass_0= ruleOpenClass | this_NewClass_1= ruleNewClass )
            {
            // InternalAle.g:274:2: (this_OpenClass_0= ruleOpenClass | this_NewClass_1= ruleNewClass )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAle.g:275:3: this_OpenClass_0= ruleOpenClass
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
                    // InternalAle.g:284:3: this_NewClass_1= ruleNewClass
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
    // InternalAle.g:296:1: entryRuleTag returns [String current=null] : iv_ruleTag= ruleTag EOF ;
    public final String entryRuleTag() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTag = null;


        try {
            // InternalAle.g:296:43: (iv_ruleTag= ruleTag EOF )
            // InternalAle.g:297:2: iv_ruleTag= ruleTag EOF
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
    // InternalAle.g:303:1: ruleTag returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleTag() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAle.g:309:2: ( (kw= '@' this_ID_1= RULE_ID ) )
            // InternalAle.g:310:2: (kw= '@' this_ID_1= RULE_ID )
            {
            // InternalAle.g:310:2: (kw= '@' this_ID_1= RULE_ID )
            // InternalAle.g:311:3: kw= '@' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
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
    // InternalAle.g:327:1: entryRuleOpenClass returns [EObject current=null] : iv_ruleOpenClass= ruleOpenClass EOF ;
    public final EObject entryRuleOpenClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenClass = null;


        try {
            // InternalAle.g:327:50: (iv_ruleOpenClass= ruleOpenClass EOF )
            // InternalAle.g:328:2: iv_ruleOpenClass= ruleOpenClass EOF
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
    // InternalAle.g:334:1: ruleOpenClass returns [EObject current=null] : ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) ) ;
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
            // InternalAle.g:340:2: ( ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) ) )
            // InternalAle.g:341:2: ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) )
            {
            // InternalAle.g:341:2: ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' ) )
            // InternalAle.g:342:3: () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' )
            {
            // InternalAle.g:342:3: ()
            // InternalAle.g:343:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getOpenClassAccess().getOpenClassAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOpenClassAccess().getOpenKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOpenClassAccess().getClassKeyword_2());
              		
            }
            // InternalAle.g:357:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAle.g:358:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAle.g:358:4: (lv_name_3_0= RULE_ID )
            // InternalAle.g:359:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
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

            // InternalAle.g:375:3: (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAle.g:376:4: otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )*
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getOpenClassAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalAle.g:380:4: ( (lv_superClass_5_0= ruleQualified ) )
                    // InternalAle.g:381:5: (lv_superClass_5_0= ruleQualified )
                    {
                    // InternalAle.g:381:5: (lv_superClass_5_0= ruleQualified )
                    // InternalAle.g:382:6: lv_superClass_5_0= ruleQualified
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOpenClassAccess().getSuperClassQualifiedParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
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

                    // InternalAle.g:399:4: (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAle.g:400:5: otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getOpenClassAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalAle.g:404:5: ( (lv_superClass_7_0= ruleQualified ) )
                    	    // InternalAle.g:405:6: (lv_superClass_7_0= ruleQualified )
                    	    {
                    	    // InternalAle.g:405:6: (lv_superClass_7_0= ruleQualified )
                    	    // InternalAle.g:406:7: lv_superClass_7_0= ruleQualified
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOpenClassAccess().getSuperClassQualifiedParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
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
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAle.g:425:3: (otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}' )
            // InternalAle.g:426:4: otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* ( (lv_methods_10_0= ruleMethod ) )* otherlv_11= '}'
            {
            otherlv_8=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getOpenClassAccess().getLeftCurlyBracketKeyword_5_0());
              			
            }
            // InternalAle.g:430:4: ( (lv_fields_9_0= ruleField ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==25||LA8_0==27||(LA8_0>=69 && LA8_0<=74)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAle.g:431:5: (lv_fields_9_0= ruleField )
            	    {
            	    // InternalAle.g:431:5: (lv_fields_9_0= ruleField )
            	    // InternalAle.g:432:6: lv_fields_9_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOpenClassAccess().getFieldsFieldParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
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
            	    break loop8;
                }
            } while (true);

            // InternalAle.g:449:4: ( (lv_methods_10_0= ruleMethod ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20||LA9_0==28||LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAle.g:450:5: (lv_methods_10_0= ruleMethod )
            	    {
            	    // InternalAle.g:450:5: (lv_methods_10_0= ruleMethod )
            	    // InternalAle.g:451:6: lv_methods_10_0= ruleMethod
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOpenClassAccess().getMethodsMethodParserRuleCall_5_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
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
            	    break loop9;
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
    // InternalAle.g:477:1: entryRuleNewClass returns [EObject current=null] : iv_ruleNewClass= ruleNewClass EOF ;
    public final EObject entryRuleNewClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewClass = null;


        try {
            // InternalAle.g:477:49: (iv_ruleNewClass= ruleNewClass EOF )
            // InternalAle.g:478:2: iv_ruleNewClass= ruleNewClass EOF
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
    // InternalAle.g:484:1: ruleNewClass returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ) ;
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
            // InternalAle.g:490:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ) )
            // InternalAle.g:491:2: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            {
            // InternalAle.g:491:2: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            // InternalAle.g:492:3: () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            {
            // InternalAle.g:492:3: ()
            // InternalAle.g:493:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNewClassAccess().getNewClassAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNewClassAccess().getClassKeyword_1());
              		
            }
            // InternalAle.g:503:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAle.g:504:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAle.g:504:4: (lv_name_2_0= RULE_ID )
            // InternalAle.g:505:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
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

            // InternalAle.g:521:3: (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAle.g:522:4: otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )*
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNewClassAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalAle.g:526:4: ( (lv_superClass_4_0= ruleQualified ) )
                    // InternalAle.g:527:5: (lv_superClass_4_0= ruleQualified )
                    {
                    // InternalAle.g:527:5: (lv_superClass_4_0= ruleQualified )
                    // InternalAle.g:528:6: lv_superClass_4_0= ruleQualified
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNewClassAccess().getSuperClassQualifiedParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
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

                    // InternalAle.g:545:4: (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAle.g:546:5: otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getNewClassAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalAle.g:550:5: ( (lv_superClass_6_0= ruleQualified ) )
                    	    // InternalAle.g:551:6: (lv_superClass_6_0= ruleQualified )
                    	    {
                    	    // InternalAle.g:551:6: (lv_superClass_6_0= ruleQualified )
                    	    // InternalAle.g:552:7: lv_superClass_6_0= ruleQualified
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNewClassAccess().getSuperClassQualifiedParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAle.g:571:3: (otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            // InternalAle.g:572:4: otherlv_7= '{' ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}'
            {
            otherlv_7=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getNewClassAccess().getLeftCurlyBracketKeyword_4_0());
              			
            }
            // InternalAle.g:576:4: ( (lv_fields_8_0= ruleField ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==25||LA12_0==27||(LA12_0>=69 && LA12_0<=74)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAle.g:577:5: (lv_fields_8_0= ruleField )
            	    {
            	    // InternalAle.g:577:5: (lv_fields_8_0= ruleField )
            	    // InternalAle.g:578:6: lv_fields_8_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNewClassAccess().getFieldsFieldParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
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
            	    break loop12;
                }
            } while (true);

            // InternalAle.g:595:4: ( (lv_methods_9_0= ruleMethod ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20||LA13_0==28||LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAle.g:596:5: (lv_methods_9_0= ruleMethod )
            	    {
            	    // InternalAle.g:596:5: (lv_methods_9_0= ruleMethod )
            	    // InternalAle.g:597:6: lv_methods_9_0= ruleMethod
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNewClassAccess().getMethodsMethodParserRuleCall_4_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
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
            	    break loop13;
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
    // InternalAle.g:623:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalAle.g:623:46: (iv_ruleField= ruleField EOF )
            // InternalAle.g:624:2: iv_ruleField= ruleField EOF
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
    // InternalAle.g:630:1: ruleField returns [EObject current=null] : ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) | ( () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'rev' ( (lv_reverse_9_0= RULE_ID ) ) )? otherlv_10= ';' ) | ( () otherlv_12= 'cont' ( (lv_type_13_0= ruleType ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token lv_reverse_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        EObject lv_type_1_0 = null;

        EObject lv_type_6_0 = null;

        EObject lv_type_13_0 = null;



        	enterRule();

        try {
            // InternalAle.g:636:2: ( ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) | ( () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'rev' ( (lv_reverse_9_0= RULE_ID ) ) )? otherlv_10= ';' ) | ( () otherlv_12= 'cont' ( (lv_type_13_0= ruleType ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
            // InternalAle.g:637:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) | ( () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'rev' ( (lv_reverse_9_0= RULE_ID ) ) )? otherlv_10= ';' ) | ( () otherlv_12= 'cont' ( (lv_type_13_0= ruleType ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            {
            // InternalAle.g:637:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) | ( () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'rev' ( (lv_reverse_9_0= RULE_ID ) ) )? otherlv_10= ';' ) | ( () otherlv_12= 'cont' ( (lv_type_13_0= ruleType ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalAle.g:638:3: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
                    {
                    // InternalAle.g:638:3: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
                    // InternalAle.g:639:4: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
                    {
                    // InternalAle.g:639:4: ()
                    // InternalAle.g:640:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFieldAccess().getPrimitiveFieldAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:646:4: ( (lv_type_1_0= ruleType ) )
                    // InternalAle.g:647:5: (lv_type_1_0= ruleType )
                    {
                    // InternalAle.g:647:5: (lv_type_1_0= ruleType )
                    // InternalAle.g:648:6: lv_type_1_0= ruleType
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

                    // InternalAle.g:665:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalAle.g:666:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalAle.g:666:5: (lv_name_2_0= RULE_ID )
                    // InternalAle.g:667:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getSemicolonKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:689:3: ( () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'rev' ( (lv_reverse_9_0= RULE_ID ) ) )? otherlv_10= ';' )
                    {
                    // InternalAle.g:689:3: ( () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'rev' ( (lv_reverse_9_0= RULE_ID ) ) )? otherlv_10= ';' )
                    // InternalAle.g:690:4: () otherlv_5= 'ref' ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'rev' ( (lv_reverse_9_0= RULE_ID ) ) )? otherlv_10= ';'
                    {
                    // InternalAle.g:690:4: ()
                    // InternalAle.g:691:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFieldAccess().getRefFieldAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getRefKeyword_1_1());
                      			
                    }
                    // InternalAle.g:701:4: ( (lv_type_6_0= ruleType ) )
                    // InternalAle.g:702:5: (lv_type_6_0= ruleType )
                    {
                    // InternalAle.g:702:5: (lv_type_6_0= ruleType )
                    // InternalAle.g:703:6: lv_type_6_0= ruleType
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

                    // InternalAle.g:720:4: ( (lv_name_7_0= RULE_ID ) )
                    // InternalAle.g:721:5: (lv_name_7_0= RULE_ID )
                    {
                    // InternalAle.g:721:5: (lv_name_7_0= RULE_ID )
                    // InternalAle.g:722:6: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
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

                    // InternalAle.g:738:4: (otherlv_8= 'rev' ( (lv_reverse_9_0= RULE_ID ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==26) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAle.g:739:5: otherlv_8= 'rev' ( (lv_reverse_9_0= RULE_ID ) )
                            {
                            otherlv_8=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getRevKeyword_1_4_0());
                              				
                            }
                            // InternalAle.g:743:5: ( (lv_reverse_9_0= RULE_ID ) )
                            // InternalAle.g:744:6: (lv_reverse_9_0= RULE_ID )
                            {
                            // InternalAle.g:744:6: (lv_reverse_9_0= RULE_ID )
                            // InternalAle.g:745:7: lv_reverse_9_0= RULE_ID
                            {
                            lv_reverse_9_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_reverse_9_0, grammarAccess.getFieldAccess().getReverseIDTerminalRuleCall_1_4_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getFieldRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"reverse",
                              								lv_reverse_9_0,
                              								"org.eclipse.xtext.common.Terminals.ID");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getSemicolonKeyword_1_5());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:768:3: ( () otherlv_12= 'cont' ( (lv_type_13_0= ruleType ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' )
                    {
                    // InternalAle.g:768:3: ( () otherlv_12= 'cont' ( (lv_type_13_0= ruleType ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' )
                    // InternalAle.g:769:4: () otherlv_12= 'cont' ( (lv_type_13_0= ruleType ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';'
                    {
                    // InternalAle.g:769:4: ()
                    // InternalAle.g:770:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFieldAccess().getContainmentFieldAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_12=(Token)match(input,27,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getFieldAccess().getContKeyword_2_1());
                      			
                    }
                    // InternalAle.g:780:4: ( (lv_type_13_0= ruleType ) )
                    // InternalAle.g:781:5: (lv_type_13_0= ruleType )
                    {
                    // InternalAle.g:781:5: (lv_type_13_0= ruleType )
                    // InternalAle.g:782:6: lv_type_13_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_type_13_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFieldRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_13_0,
                      							"ale.xtext.Ale.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:799:4: ( (lv_name_14_0= RULE_ID ) )
                    // InternalAle.g:800:5: (lv_name_14_0= RULE_ID )
                    {
                    // InternalAle.g:800:5: (lv_name_14_0= RULE_ID )
                    // InternalAle.g:801:6: lv_name_14_0= RULE_ID
                    {
                    lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_14_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_14_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getFieldAccess().getSemicolonKeyword_2_4());
                      			
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
    // InternalAle.g:826:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalAle.g:826:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalAle.g:827:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalAle.g:833:1: ruleMethod returns [EObject current=null] : (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        EObject this_DefMethod_0 = null;

        EObject this_OverrideMethod_1 = null;



        	enterRule();

        try {
            // InternalAle.g:839:2: ( (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod ) )
            // InternalAle.g:840:2: (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod )
            {
            // InternalAle.g:840:2: (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalAle.g:841:3: this_DefMethod_0= ruleDefMethod
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
                    // InternalAle.g:850:3: this_OverrideMethod_1= ruleOverrideMethod
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
    // InternalAle.g:862:1: entryRuleDefMethod returns [EObject current=null] : iv_ruleDefMethod= ruleDefMethod EOF ;
    public final EObject entryRuleDefMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefMethod = null;


        try {
            // InternalAle.g:862:50: (iv_ruleDefMethod= ruleDefMethod EOF )
            // InternalAle.g:863:2: iv_ruleDefMethod= ruleDefMethod EOF
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
    // InternalAle.g:869:1: ruleDefMethod returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) ) ) ;
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
            // InternalAle.g:875:2: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) ) ) )
            // InternalAle.g:876:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) ) )
            {
            // InternalAle.g:876:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) ) )
            // InternalAle.g:877:3: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'def' ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' ) ( (lv_block_10_0= ruleBlock ) )
            {
            // InternalAle.g:877:3: ( (lv_tags_0_0= ruleTag ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAle.g:878:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalAle.g:878:4: (lv_tags_0_0= ruleTag )
            	    // InternalAle.g:879:5: lv_tags_0_0= ruleTag
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDefMethodAccess().getTagsTagParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
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
            	    break loop17;
                }
            } while (true);

            otherlv_1=(Token)match(input,28,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefMethodAccess().getDefKeyword_1());
              		
            }
            // InternalAle.g:900:3: ( ( (lv_type_2_0= ruleType ) ) | otherlv_3= 'void' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=69 && LA18_0<=74)) ) {
                alt18=1;
            }
            else if ( (LA18_0==29) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAle.g:901:4: ( (lv_type_2_0= ruleType ) )
                    {
                    // InternalAle.g:901:4: ( (lv_type_2_0= ruleType ) )
                    // InternalAle.g:902:5: (lv_type_2_0= ruleType )
                    {
                    // InternalAle.g:902:5: (lv_type_2_0= ruleType )
                    // InternalAle.g:903:6: lv_type_2_0= ruleType
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
                    // InternalAle.g:921:4: otherlv_3= 'void'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDefMethodAccess().getVoidKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAle.g:926:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalAle.g:927:4: (lv_name_4_0= RULE_ID )
            {
            // InternalAle.g:927:4: (lv_name_4_0= RULE_ID )
            // InternalAle.g:928:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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

            // InternalAle.g:944:3: (otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')' )
            // InternalAle.g:945:4: otherlv_5= '(' ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )? otherlv_9= ')'
            {
            otherlv_5=(Token)match(input,30,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getDefMethodAccess().getLeftParenthesisKeyword_4_0());
              			
            }
            // InternalAle.g:949:4: ( ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||(LA20_0>=69 && LA20_0<=74)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAle.g:950:5: ( (lv_params_6_0= ruleParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )*
                    {
                    // InternalAle.g:950:5: ( (lv_params_6_0= ruleParam ) )
                    // InternalAle.g:951:6: (lv_params_6_0= ruleParam )
                    {
                    // InternalAle.g:951:6: (lv_params_6_0= ruleParam )
                    // InternalAle.g:952:7: lv_params_6_0= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_4_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
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

                    // InternalAle.g:969:5: (otherlv_7= ',' ( (lv_params_8_0= ruleParam ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalAle.g:970:6: otherlv_7= ',' ( (lv_params_8_0= ruleParam ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_7, grammarAccess.getDefMethodAccess().getCommaKeyword_4_1_1_0());
                    	      					
                    	    }
                    	    // InternalAle.g:974:6: ( (lv_params_8_0= ruleParam ) )
                    	    // InternalAle.g:975:7: (lv_params_8_0= ruleParam )
                    	    {
                    	    // InternalAle.g:975:7: (lv_params_8_0= ruleParam )
                    	    // InternalAle.g:976:8: lv_params_8_0= ruleParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_4_1_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_9, grammarAccess.getDefMethodAccess().getRightParenthesisKeyword_4_2());
              			
            }

            }

            // InternalAle.g:1000:3: ( (lv_block_10_0= ruleBlock ) )
            // InternalAle.g:1001:4: (lv_block_10_0= ruleBlock )
            {
            // InternalAle.g:1001:4: (lv_block_10_0= ruleBlock )
            // InternalAle.g:1002:5: lv_block_10_0= ruleBlock
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
    // InternalAle.g:1023:1: entryRuleOverrideMethod returns [EObject current=null] : iv_ruleOverrideMethod= ruleOverrideMethod EOF ;
    public final EObject entryRuleOverrideMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverrideMethod = null;


        try {
            // InternalAle.g:1023:55: (iv_ruleOverrideMethod= ruleOverrideMethod EOF )
            // InternalAle.g:1024:2: iv_ruleOverrideMethod= ruleOverrideMethod EOF
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
    // InternalAle.g:1030:1: ruleOverrideMethod returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) ) ;
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
            // InternalAle.g:1036:2: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) ) )
            // InternalAle.g:1037:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) )
            {
            // InternalAle.g:1037:2: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) )
            // InternalAle.g:1038:3: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'override' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) )
            {
            // InternalAle.g:1038:3: ( (lv_tags_0_0= ruleTag ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==20) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAle.g:1039:4: (lv_tags_0_0= ruleTag )
            	    {
            	    // InternalAle.g:1039:4: (lv_tags_0_0= ruleTag )
            	    // InternalAle.g:1040:5: lv_tags_0_0= ruleTag
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOverrideMethodAccess().getTagsTagParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
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
            	    break loop21;
                }
            } while (true);

            otherlv_1=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOverrideMethodAccess().getOverrideKeyword_1());
              		
            }
            // InternalAle.g:1061:3: ( (lv_type_2_0= ruleType ) )
            // InternalAle.g:1062:4: (lv_type_2_0= ruleType )
            {
            // InternalAle.g:1062:4: (lv_type_2_0= ruleType )
            // InternalAle.g:1063:5: lv_type_2_0= ruleType
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

            // InternalAle.g:1080:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAle.g:1081:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAle.g:1081:4: (lv_name_3_0= RULE_ID )
            // InternalAle.g:1082:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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

            // InternalAle.g:1098:3: (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' )
            // InternalAle.g:1099:4: otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')'
            {
            otherlv_4=(Token)match(input,30,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getOverrideMethodAccess().getLeftParenthesisKeyword_4_0());
              			
            }
            // InternalAle.g:1103:4: ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=69 && LA23_0<=74)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAle.g:1104:5: ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )*
                    {
                    // InternalAle.g:1104:5: ( (lv_params_5_0= ruleParam ) )
                    // InternalAle.g:1105:6: (lv_params_5_0= ruleParam )
                    {
                    // InternalAle.g:1105:6: (lv_params_5_0= ruleParam )
                    // InternalAle.g:1106:7: lv_params_5_0= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_4_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
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

                    // InternalAle.g:1123:5: (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalAle.g:1124:6: otherlv_6= ',' ( (lv_params_7_0= ruleParam ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_6, grammarAccess.getOverrideMethodAccess().getCommaKeyword_4_1_1_0());
                    	      					
                    	    }
                    	    // InternalAle.g:1128:6: ( (lv_params_7_0= ruleParam ) )
                    	    // InternalAle.g:1129:7: (lv_params_7_0= ruleParam )
                    	    {
                    	    // InternalAle.g:1129:7: (lv_params_7_0= ruleParam )
                    	    // InternalAle.g:1130:8: lv_params_7_0= ruleParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_4_1_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getOverrideMethodAccess().getRightParenthesisKeyword_4_2());
              			
            }

            }

            // InternalAle.g:1154:3: ( (lv_block_9_0= ruleBlock ) )
            // InternalAle.g:1155:4: (lv_block_9_0= ruleBlock )
            {
            // InternalAle.g:1155:4: (lv_block_9_0= ruleBlock )
            // InternalAle.g:1156:5: lv_block_9_0= ruleBlock
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
    // InternalAle.g:1177:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalAle.g:1177:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalAle.g:1178:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalAle.g:1184:1: ruleStatement returns [EObject current=null] : ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_VarAssign_0 = null;

        EObject this_ForLoop_2 = null;

        EObject this_IfStatement_3 = null;

        EObject this_WhileStatement_4 = null;

        EObject this_LetStatement_5 = null;

        EObject this_ReturnStatement_7 = null;

        EObject this_Expression_9 = null;

        EObject this_DebugStatement_11 = null;



        	enterRule();

        try {
            // InternalAle.g:1190:2: ( ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) ) )
            // InternalAle.g:1191:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) )
            {
            // InternalAle.g:1191:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) )
            int alt24=8;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalAle.g:1192:3: (this_VarAssign_0= ruleVarAssign otherlv_1= ';' )
                    {
                    // InternalAle.g:1192:3: (this_VarAssign_0= ruleVarAssign otherlv_1= ';' )
                    // InternalAle.g:1193:4: this_VarAssign_0= ruleVarAssign otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getVarAssignParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_VarAssign_0=ruleVarAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_VarAssign_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_1=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1207:3: this_ForLoop_2= ruleForLoop
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
                    // InternalAle.g:1216:3: this_IfStatement_3= ruleIfStatement
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
                    // InternalAle.g:1225:3: this_WhileStatement_4= ruleWhileStatement
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
                    // InternalAle.g:1234:3: (this_LetStatement_5= ruleLetStatement otherlv_6= ';' )
                    {
                    // InternalAle.g:1234:3: (this_LetStatement_5= ruleLetStatement otherlv_6= ';' )
                    // InternalAle.g:1235:4: this_LetStatement_5= ruleLetStatement otherlv_6= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getLetStatementParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_LetStatement_5=ruleLetStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_LetStatement_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSemicolonKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:1249:3: (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' )
                    {
                    // InternalAle.g:1249:3: (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' )
                    // InternalAle.g:1250:4: this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_ReturnStatement_7=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ReturnStatement_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getSemicolonKeyword_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:1264:3: (this_Expression_9= ruleExpression otherlv_10= ';' )
                    {
                    // InternalAle.g:1264:3: (this_Expression_9= ruleExpression otherlv_10= ';' )
                    // InternalAle.g:1265:4: this_Expression_9= ruleExpression otherlv_10= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_6_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_Expression_9=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_9;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_10=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getSemicolonKeyword_6_1());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalAle.g:1279:3: (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' )
                    {
                    // InternalAle.g:1279:3: (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' )
                    // InternalAle.g:1280:4: this_DebugStatement_11= ruleDebugStatement otherlv_12= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getDebugStatementParserRuleCall_7_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_DebugStatement_11=ruleDebugStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_DebugStatement_11;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_12=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getSemicolonKeyword_7_1());
                      			
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


    // $ANTLR start "entryRuleDebugStatement"
    // InternalAle.g:1297:1: entryRuleDebugStatement returns [EObject current=null] : iv_ruleDebugStatement= ruleDebugStatement EOF ;
    public final EObject entryRuleDebugStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDebugStatement = null;


        try {
            // InternalAle.g:1297:55: (iv_ruleDebugStatement= ruleDebugStatement EOF )
            // InternalAle.g:1298:2: iv_ruleDebugStatement= ruleDebugStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDebugStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDebugStatement=ruleDebugStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDebugStatement; 
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
    // $ANTLR end "entryRuleDebugStatement"


    // $ANTLR start "ruleDebugStatement"
    // InternalAle.g:1304:1: ruleDebugStatement returns [EObject current=null] : ( () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDebugStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1310:2: ( ( () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalAle.g:1311:2: ( () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalAle.g:1311:2: ( () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalAle.g:1312:3: () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // InternalAle.g:1312:3: ()
            // InternalAle.g:1313:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDebugStatementAccess().getDebugStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDebugStatementAccess().getDebugKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDebugStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1327:3: ( (lv_expr_3_0= ruleExpression ) )
            // InternalAle.g:1328:4: (lv_expr_3_0= ruleExpression )
            {
            // InternalAle.g:1328:4: (lv_expr_3_0= ruleExpression )
            // InternalAle.g:1329:5: lv_expr_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDebugStatementAccess().getExprExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_expr_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDebugStatementRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_3_0,
              						"ale.xtext.Ale.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDebugStatementAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleDebugStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalAle.g:1354:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalAle.g:1354:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalAle.g:1355:2: iv_ruleReturnStatement= ruleReturnStatement EOF
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
    // InternalAle.g:1361:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_returned_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1367:2: ( ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) ) )
            // InternalAle.g:1368:2: ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) )
            {
            // InternalAle.g:1368:2: ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) )
            // InternalAle.g:1369:3: () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) )
            {
            // InternalAle.g:1369:3: ()
            // InternalAle.g:1370:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
              		
            }
            // InternalAle.g:1380:3: ( (lv_returned_2_0= ruleExpression ) )
            // InternalAle.g:1381:4: (lv_returned_2_0= ruleExpression )
            {
            // InternalAle.g:1381:4: (lv_returned_2_0= ruleExpression )
            // InternalAle.g:1382:5: lv_returned_2_0= ruleExpression
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
    // InternalAle.g:1403:1: entryRuleLetStatement returns [EObject current=null] : iv_ruleLetStatement= ruleLetStatement EOF ;
    public final EObject entryRuleLetStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetStatement = null;


        try {
            // InternalAle.g:1403:53: (iv_ruleLetStatement= ruleLetStatement EOF )
            // InternalAle.g:1404:2: iv_ruleLetStatement= ruleLetStatement EOF
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
    // InternalAle.g:1410:1: ruleLetStatement returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) ) ;
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
            // InternalAle.g:1416:2: ( ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) ) )
            // InternalAle.g:1417:2: ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) )
            {
            // InternalAle.g:1417:2: ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) )
            // InternalAle.g:1418:3: () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) )
            {
            // InternalAle.g:1418:3: ()
            // InternalAle.g:1419:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLetStatementAccess().getLetStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLetStatementAccess().getLetKeyword_1());
              		
            }
            // InternalAle.g:1429:3: ( (lv_bindings_2_0= ruleVarAssign ) )
            // InternalAle.g:1430:4: (lv_bindings_2_0= ruleVarAssign )
            {
            // InternalAle.g:1430:4: (lv_bindings_2_0= ruleVarAssign )
            // InternalAle.g:1431:5: lv_bindings_2_0= ruleVarAssign
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
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

            // InternalAle.g:1448:3: (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAle.g:1449:4: otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getLetStatementAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAle.g:1453:4: ( (lv_bindings_4_0= ruleVarAssign ) )
            	    // InternalAle.g:1454:5: (lv_bindings_4_0= ruleVarAssign )
            	    {
            	    // InternalAle.g:1454:5: (lv_bindings_4_0= ruleVarAssign )
            	    // InternalAle.g:1455:6: lv_bindings_4_0= ruleVarAssign
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    break loop25;
                }
            } while (true);

            otherlv_5=(Token)match(input,36,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getLetStatementAccess().getInKeyword_4());
              		
            }
            // InternalAle.g:1477:3: ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) )
            // InternalAle.g:1478:4: ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) )
            {
            // InternalAle.g:1478:4: ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) )
            // InternalAle.g:1479:5: (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement )
            {
            // InternalAle.g:1479:5: (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_NULL)||LA26_0==30||LA26_0==57||(LA26_0>=60 && LA26_0<=62)||(LA26_0>=64 && LA26_0<=65)||(LA26_0>=67 && LA26_0<=70)) ) {
                alt26=1;
            }
            else if ( (LA26_0==35) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalAle.g:1480:6: lv_block_6_1= ruleExpression
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
                    // InternalAle.g:1496:6: lv_block_6_2= ruleLetStatement
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
    // InternalAle.g:1518:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalAle.g:1518:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalAle.g:1519:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalAle.g:1525:1: ruleIfStatement returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? ) ;
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
            // InternalAle.g:1531:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? ) )
            // InternalAle.g:1532:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? )
            {
            // InternalAle.g:1532:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? )
            // InternalAle.g:1533:3: () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )?
            {
            // InternalAle.g:1533:3: ()
            // InternalAle.g:1534:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIfStatementAccess().getIfStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getIfKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1548:3: ( (lv_condition_3_0= ruleExpression ) )
            // InternalAle.g:1549:4: (lv_condition_3_0= ruleExpression )
            {
            // InternalAle.g:1549:4: (lv_condition_3_0= ruleExpression )
            // InternalAle.g:1550:5: lv_condition_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            otherlv_4=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalAle.g:1571:3: ( (lv_thenBranch_5_0= ruleBlock ) )
            // InternalAle.g:1572:4: (lv_thenBranch_5_0= ruleBlock )
            {
            // InternalAle.g:1572:4: (lv_thenBranch_5_0= ruleBlock )
            // InternalAle.g:1573:5: lv_thenBranch_5_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getThenBranchBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalAle.g:1590:3: (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAle.g:1591:4: otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getElseKeyword_6_0());
                      			
                    }
                    // InternalAle.g:1595:4: ( (lv_elseBranch_7_0= ruleBlock ) )
                    // InternalAle.g:1596:5: (lv_elseBranch_7_0= ruleBlock )
                    {
                    // InternalAle.g:1596:5: (lv_elseBranch_7_0= ruleBlock )
                    // InternalAle.g:1597:6: lv_elseBranch_7_0= ruleBlock
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
    // InternalAle.g:1619:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalAle.g:1619:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalAle.g:1620:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalAle.g:1626:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;

        EObject lv_whileBlock_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1632:2: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) ) )
            // InternalAle.g:1633:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) )
            {
            // InternalAle.g:1633:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) )
            // InternalAle.g:1634:3: () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) )
            {
            // InternalAle.g:1634:3: ()
            // InternalAle.g:1635:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWhileStatementAccess().getWhileStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1649:3: ( (lv_condition_3_0= ruleExpression ) )
            // InternalAle.g:1650:4: (lv_condition_3_0= ruleExpression )
            {
            // InternalAle.g:1650:4: (lv_condition_3_0= ruleExpression )
            // InternalAle.g:1651:5: lv_condition_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            otherlv_4=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalAle.g:1672:3: ( (lv_whileBlock_5_0= ruleBlock ) )
            // InternalAle.g:1673:4: (lv_whileBlock_5_0= ruleBlock )
            {
            // InternalAle.g:1673:4: (lv_whileBlock_5_0= ruleBlock )
            // InternalAle.g:1674:5: lv_whileBlock_5_0= ruleBlock
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
    // InternalAle.g:1695:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalAle.g:1695:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalAle.g:1696:2: iv_ruleForLoop= ruleForLoop EOF
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
    // InternalAle.g:1702:1: ruleForLoop returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) ;
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
            // InternalAle.g:1708:2: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) )
            // InternalAle.g:1709:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            {
            // InternalAle.g:1709:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            // InternalAle.g:1710:3: () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) )
            {
            // InternalAle.g:1710:3: ()
            // InternalAle.g:1711:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForLoopAccess().getForLoopAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getForKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1725:3: ( (lv_type_3_0= ruleType ) )
            // InternalAle.g:1726:4: (lv_type_3_0= ruleType )
            {
            // InternalAle.g:1726:4: (lv_type_3_0= ruleType )
            // InternalAle.g:1727:5: lv_type_3_0= ruleType
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

            // InternalAle.g:1744:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalAle.g:1745:4: (lv_name_4_0= RULE_ID )
            {
            // InternalAle.g:1745:4: (lv_name_4_0= RULE_ID )
            // InternalAle.g:1746:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,36,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForLoopAccess().getInKeyword_5());
              		
            }
            // InternalAle.g:1766:3: ( (lv_collection_6_0= ruleExpression ) )
            // InternalAle.g:1767:4: (lv_collection_6_0= ruleExpression )
            {
            // InternalAle.g:1767:4: (lv_collection_6_0= ruleExpression )
            // InternalAle.g:1768:5: lv_collection_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopAccess().getCollectionExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            otherlv_7=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalAle.g:1789:3: ( (lv_block_8_0= ruleBlock ) )
            // InternalAle.g:1790:4: (lv_block_8_0= ruleBlock )
            {
            // InternalAle.g:1790:4: (lv_block_8_0= ruleBlock )
            // InternalAle.g:1791:5: lv_block_8_0= ruleBlock
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
    // InternalAle.g:1812:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalAle.g:1812:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalAle.g:1813:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalAle.g:1819:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1825:2: ( ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalAle.g:1826:2: ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalAle.g:1826:2: ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalAle.g:1827:3: () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalAle.g:1827:3: ()
            // InternalAle.g:1828:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalAle.g:1838:3: ( (lv_body_2_0= ruleStatement ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_NULL)||LA28_0==30||(LA28_0>=33 && LA28_0<=35)||LA28_0==37||(LA28_0>=39 && LA28_0<=40)||LA28_0==57||(LA28_0>=60 && LA28_0<=62)||(LA28_0>=64 && LA28_0<=65)||(LA28_0>=67 && LA28_0<=74)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAle.g:1839:4: (lv_body_2_0= ruleStatement )
            	    {
            	    // InternalAle.g:1839:4: (lv_body_2_0= ruleStatement )
            	    // InternalAle.g:1840:5: lv_body_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getBodyStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_30);
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
            	    break loop28;
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
    // InternalAle.g:1865:1: entryRuleVarAssign returns [EObject current=null] : iv_ruleVarAssign= ruleVarAssign EOF ;
    public final EObject entryRuleVarAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarAssign = null;


        try {
            // InternalAle.g:1865:50: (iv_ruleVarAssign= ruleVarAssign EOF )
            // InternalAle.g:1866:2: iv_ruleVarAssign= ruleVarAssign EOF
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
    // InternalAle.g:1872:1: ruleVarAssign returns [EObject current=null] : ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) ) ) ;
    public final EObject ruleVarAssign() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1878:2: ( ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) ) ) )
            // InternalAle.g:1879:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) ) )
            {
            // InternalAle.g:1879:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=69 && LA29_0<=74)) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==RULE_ID) ) {
                    alt29=1;
                }
                else if ( (LA29_2==41) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalAle.g:1880:3: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:1880:3: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
                    // InternalAle.g:1881:4: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) )
                    {
                    // InternalAle.g:1881:4: ()
                    // InternalAle.g:1882:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getVarAssignAccess().getVarDeclarationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:1888:4: ( (lv_type_1_0= ruleType ) )
                    // InternalAle.g:1889:5: (lv_type_1_0= ruleType )
                    {
                    // InternalAle.g:1889:5: (lv_type_1_0= ruleType )
                    // InternalAle.g:1890:6: lv_type_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarAssignAccess().getTypeTypeParserRuleCall_0_1_0());
                      					
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

                    // InternalAle.g:1907:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalAle.g:1908:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalAle.g:1908:5: (lv_name_2_0= RULE_ID )
                    // InternalAle.g:1909:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getVarAssignAccess().getNameIDTerminalRuleCall_0_2_0());
                      					
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

                    otherlv_3=(Token)match(input,41,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVarAssignAccess().getEqualsSignKeyword_0_3());
                      			
                    }
                    // InternalAle.g:1929:4: ( (lv_value_4_0= ruleExpression ) )
                    // InternalAle.g:1930:5: (lv_value_4_0= ruleExpression )
                    {
                    // InternalAle.g:1930:5: (lv_value_4_0= ruleExpression )
                    // InternalAle.g:1931:6: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarAssignAccess().getValueExpressionParserRuleCall_0_4_0());
                      					
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
                    break;
                case 2 :
                    // InternalAle.g:1950:3: ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:1950:3: ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) )
                    // InternalAle.g:1951:4: () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) )
                    {
                    // InternalAle.g:1951:4: ()
                    // InternalAle.g:1952:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getVarAssignAccess().getVarAssignAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:1958:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalAle.g:1959:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalAle.g:1959:5: (lv_name_6_0= RULE_ID )
                    // InternalAle.g:1960:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_6_0, grammarAccess.getVarAssignAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVarAssignRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_6_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,41,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getVarAssignAccess().getEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalAle.g:1980:4: ( (lv_value_8_0= ruleExpression ) )
                    // InternalAle.g:1981:5: (lv_value_8_0= ruleExpression )
                    {
                    // InternalAle.g:1981:5: (lv_value_8_0= ruleExpression )
                    // InternalAle.g:1982:6: lv_value_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarAssignAccess().getValueExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarAssignRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_8_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
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
    // $ANTLR end "ruleVarAssign"


    // $ANTLR start "entryRuleExpression"
    // InternalAle.g:2004:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAle.g:2004:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAle.g:2005:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAle.g:2011:1: ruleExpression returns [EObject current=null] : this_ImpliesOperation_0= ruleImpliesOperation ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesOperation_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2017:2: (this_ImpliesOperation_0= ruleImpliesOperation )
            // InternalAle.g:2018:2: this_ImpliesOperation_0= ruleImpliesOperation
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
    // InternalAle.g:2029:1: entryRuleImpliesOperation returns [EObject current=null] : iv_ruleImpliesOperation= ruleImpliesOperation EOF ;
    public final EObject entryRuleImpliesOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesOperation = null;


        try {
            // InternalAle.g:2029:57: (iv_ruleImpliesOperation= ruleImpliesOperation EOF )
            // InternalAle.g:2030:2: iv_ruleImpliesOperation= ruleImpliesOperation EOF
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
    // InternalAle.g:2036:1: ruleImpliesOperation returns [EObject current=null] : (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* ) ;
    public final EObject ruleImpliesOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BooleanOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2042:2: ( (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* ) )
            // InternalAle.g:2043:2: (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* )
            {
            // InternalAle.g:2043:2: (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* )
            // InternalAle.g:2044:3: this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImpliesOperationAccess().getBooleanOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_BooleanOperation_0=ruleBooleanOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BooleanOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2052:3: ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==42) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred1_InternalAle()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalAle.g:2053:4: ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) )
            	    {
            	    // InternalAle.g:2066:4: ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) )
            	    // InternalAle.g:2067:5: ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) )
            	    {
            	    // InternalAle.g:2067:5: ( () otherlv_2= 'implies' )
            	    // InternalAle.g:2068:6: () otherlv_2= 'implies'
            	    {
            	    // InternalAle.g:2068:6: ()
            	    // InternalAle.g:2069:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getImpliesOperationAccess().getImpliesOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getImpliesOperationAccess().getImpliesKeyword_1_0_0_1());
            	      					
            	    }

            	    }

            	    // InternalAle.g:2080:5: ( (lv_right_3_0= ruleBooleanOperation ) )
            	    // InternalAle.g:2081:6: (lv_right_3_0= ruleBooleanOperation )
            	    {
            	    // InternalAle.g:2081:6: (lv_right_3_0= ruleBooleanOperation )
            	    // InternalAle.g:2082:7: lv_right_3_0= ruleBooleanOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getImpliesOperationAccess().getRightBooleanOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_32);
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
    // $ANTLR end "ruleImpliesOperation"


    // $ANTLR start "entryRuleBooleanOperation"
    // InternalAle.g:2105:1: entryRuleBooleanOperation returns [EObject current=null] : iv_ruleBooleanOperation= ruleBooleanOperation EOF ;
    public final EObject entryRuleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOperation = null;


        try {
            // InternalAle.g:2105:57: (iv_ruleBooleanOperation= ruleBooleanOperation EOF )
            // InternalAle.g:2106:2: iv_ruleBooleanOperation= ruleBooleanOperation EOF
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
    // InternalAle.g:2112:1: ruleBooleanOperation returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* ) ;
    public final EObject ruleBooleanOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_CompareOperation_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2118:2: ( (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* ) )
            // InternalAle.g:2119:2: (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* )
            {
            // InternalAle.g:2119:2: (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* )
            // InternalAle.g:2120:3: this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBooleanOperationAccess().getCompareOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CompareOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2128:3: ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )*
            loop32:
            do {
                int alt32=2;
                switch ( input.LA(1) ) {
                case 43:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt32=1;
                    }


                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // InternalAle.g:2129:4: ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) )
            	    {
            	    // InternalAle.g:2156:4: ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) )
            	    // InternalAle.g:2157:5: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) )
            	    {
            	    // InternalAle.g:2157:5: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) )
            	    int alt31=3;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // InternalAle.g:2158:6: ( () otherlv_2= 'or' )
            	            {
            	            // InternalAle.g:2158:6: ( () otherlv_2= 'or' )
            	            // InternalAle.g:2159:7: () otherlv_2= 'or'
            	            {
            	            // InternalAle.g:2159:7: ()
            	            // InternalAle.g:2160:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanOrOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,43,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getBooleanOperationAccess().getOrKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2172:6: ( () otherlv_4= 'and' )
            	            {
            	            // InternalAle.g:2172:6: ( () otherlv_4= 'and' )
            	            // InternalAle.g:2173:7: () otherlv_4= 'and'
            	            {
            	            // InternalAle.g:2173:7: ()
            	            // InternalAle.g:2174:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanAndOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,44,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getBooleanOperationAccess().getAndKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalAle.g:2186:6: ( () otherlv_6= 'xor' )
            	            {
            	            // InternalAle.g:2186:6: ( () otherlv_6= 'xor' )
            	            // InternalAle.g:2187:7: () otherlv_6= 'xor'
            	            {
            	            // InternalAle.g:2187:7: ()
            	            // InternalAle.g:2188:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanXorOperationLeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,45,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getBooleanOperationAccess().getXorKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2200:5: ( (lv_right_7_0= ruleCompareOperation ) )
            	    // InternalAle.g:2201:6: (lv_right_7_0= ruleCompareOperation )
            	    {
            	    // InternalAle.g:2201:6: (lv_right_7_0= ruleCompareOperation )
            	    // InternalAle.g:2202:7: lv_right_7_0= ruleCompareOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getBooleanOperationAccess().getRightCompareOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_33);
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
    // $ANTLR end "ruleBooleanOperation"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalAle.g:2225:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalAle.g:2225:57: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalAle.g:2226:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
    // InternalAle.g:2232:1: ruleCompareOperation returns [EObject current=null] : (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )* ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject this_EqualityOperation_0 = null;

        EObject lv_right_15_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2238:2: ( (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )* ) )
            // InternalAle.g:2239:2: (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )* )
            {
            // InternalAle.g:2239:2: (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )* )
            // InternalAle.g:2240:3: this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompareOperationAccess().getEqualityOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_EqualityOperation_0=ruleEqualityOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2248:3: ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // InternalAle.g:2249:4: ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) )
            	    {
            	    // InternalAle.g:2300:4: ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) )
            	    // InternalAle.g:2301:5: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) )
            	    {
            	    // InternalAle.g:2301:5: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) )
            	    int alt33=7;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt33=4;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt33=5;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt33=6;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt33=7;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt33) {
            	        case 1 :
            	            // InternalAle.g:2302:6: ( () otherlv_2= '<=' )
            	            {
            	            // InternalAle.g:2302:6: ( () otherlv_2= '<=' )
            	            // InternalAle.g:2303:7: () otherlv_2= '<='
            	            {
            	            // InternalAle.g:2303:7: ()
            	            // InternalAle.g:2304:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareLEOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,46,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getCompareOperationAccess().getLessThanSignEqualsSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2316:6: ( () otherlv_4= '>=' )
            	            {
            	            // InternalAle.g:2316:6: ( () otherlv_4= '>=' )
            	            // InternalAle.g:2317:7: () otherlv_4= '>='
            	            {
            	            // InternalAle.g:2317:7: ()
            	            // InternalAle.g:2318:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareGEOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,47,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalAle.g:2330:6: ( () otherlv_6= '!=' )
            	            {
            	            // InternalAle.g:2330:6: ( () otherlv_6= '!=' )
            	            // InternalAle.g:2331:7: () otherlv_6= '!='
            	            {
            	            // InternalAle.g:2331:7: ()
            	            // InternalAle.g:2332:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareNEOperationLeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,48,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getCompareOperationAccess().getExclamationMarkEqualsSignKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalAle.g:2344:6: ( () otherlv_8= '<' )
            	            {
            	            // InternalAle.g:2344:6: ( () otherlv_8= '<' )
            	            // InternalAle.g:2345:7: () otherlv_8= '<'
            	            {
            	            // InternalAle.g:2345:7: ()
            	            // InternalAle.g:2346:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareLOperationLeftAction_1_0_0_3_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_8=(Token)match(input,49,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_8, grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1_0_0_3_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalAle.g:2358:6: ( () otherlv_10= '>' )
            	            {
            	            // InternalAle.g:2358:6: ( () otherlv_10= '>' )
            	            // InternalAle.g:2359:7: () otherlv_10= '>'
            	            {
            	            // InternalAle.g:2359:7: ()
            	            // InternalAle.g:2360:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareGOperationLeftAction_1_0_0_4_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_10=(Token)match(input,50,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_10, grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_1_0_0_4_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalAle.g:2372:6: ( () otherlv_12= 'instanceof' )
            	            {
            	            // InternalAle.g:2372:6: ( () otherlv_12= 'instanceof' )
            	            // InternalAle.g:2373:7: () otherlv_12= 'instanceof'
            	            {
            	            // InternalAle.g:2373:7: ()
            	            // InternalAle.g:2374:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getInstanceofOperationLeftAction_1_0_0_5_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_12=(Token)match(input,51,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_12, grammarAccess.getCompareOperationAccess().getInstanceofKeyword_1_0_0_5_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 7 :
            	            // InternalAle.g:2386:6: ( () otherlv_14= 'castto' )
            	            {
            	            // InternalAle.g:2386:6: ( () otherlv_14= 'castto' )
            	            // InternalAle.g:2387:7: () otherlv_14= 'castto'
            	            {
            	            // InternalAle.g:2387:7: ()
            	            // InternalAle.g:2388:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCasttoOperationLeftAction_1_0_0_6_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_14=(Token)match(input,52,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_14, grammarAccess.getCompareOperationAccess().getCasttoKeyword_1_0_0_6_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2400:5: ( (lv_right_15_0= ruleEqualityOperation ) )
            	    // InternalAle.g:2401:6: (lv_right_15_0= ruleEqualityOperation )
            	    {
            	    // InternalAle.g:2401:6: (lv_right_15_0= ruleEqualityOperation )
            	    // InternalAle.g:2402:7: lv_right_15_0= ruleEqualityOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getCompareOperationAccess().getRightEqualityOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_right_15_0=ruleEqualityOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getCompareOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_15_0,
            	      								"ale.xtext.Ale.EqualityOperation");
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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleEqualityOperation"
    // InternalAle.g:2425:1: entryRuleEqualityOperation returns [EObject current=null] : iv_ruleEqualityOperation= ruleEqualityOperation EOF ;
    public final EObject entryRuleEqualityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityOperation = null;


        try {
            // InternalAle.g:2425:58: (iv_ruleEqualityOperation= ruleEqualityOperation EOF )
            // InternalAle.g:2426:2: iv_ruleEqualityOperation= ruleEqualityOperation EOF
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
    // InternalAle.g:2432:1: ruleEqualityOperation returns [EObject current=null] : (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* ) ;
    public final EObject ruleEqualityOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_MultOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2438:2: ( (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* ) )
            // InternalAle.g:2439:2: (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* )
            {
            // InternalAle.g:2439:2: (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* )
            // InternalAle.g:2440:3: this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityOperationAccess().getMultOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_MultOperation_0=ruleMultOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2448:3: ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==53) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred4_InternalAle()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // InternalAle.g:2449:4: ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) )
            	    {
            	    // InternalAle.g:2464:4: ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) )
            	    // InternalAle.g:2465:5: () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) )
            	    {
            	    // InternalAle.g:2465:5: ()
            	    // InternalAle.g:2466:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getEqualityOperationAccess().getEqualityOperationLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalAle.g:2472:5: ( (lv_op_2_0= '==' ) )
            	    // InternalAle.g:2473:6: (lv_op_2_0= '==' )
            	    {
            	    // InternalAle.g:2473:6: (lv_op_2_0= '==' )
            	    // InternalAle.g:2474:7: lv_op_2_0= '=='
            	    {
            	    lv_op_2_0=(Token)match(input,53,FOLLOW_24); if (state.failed) return current;
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

            	    // InternalAle.g:2486:5: ( (lv_right_3_0= ruleMultOperation ) )
            	    // InternalAle.g:2487:6: (lv_right_3_0= ruleMultOperation )
            	    {
            	    // InternalAle.g:2487:6: (lv_right_3_0= ruleMultOperation )
            	    // InternalAle.g:2488:7: lv_right_3_0= ruleMultOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getEqualityOperationAccess().getRightMultOperationParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleEqualityOperation"


    // $ANTLR start "entryRuleMultOperation"
    // InternalAle.g:2511:1: entryRuleMultOperation returns [EObject current=null] : iv_ruleMultOperation= ruleMultOperation EOF ;
    public final EObject entryRuleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOperation = null;


        try {
            // InternalAle.g:2511:54: (iv_ruleMultOperation= ruleMultOperation EOF )
            // InternalAle.g:2512:2: iv_ruleMultOperation= ruleMultOperation EOF
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
    // InternalAle.g:2518:1: ruleMultOperation returns [EObject current=null] : (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* ) ;
    public final EObject ruleMultOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AddOperation_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2524:2: ( (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* ) )
            // InternalAle.g:2525:2: (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* )
            {
            // InternalAle.g:2525:2: (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* )
            // InternalAle.g:2526:3: this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultOperationAccess().getAddOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_AddOperation_0=ruleAddOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2534:3: ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==54) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred5_InternalAle()) ) {
                        alt37=1;
                    }


                }
                else if ( (LA37_0==55) ) {
                    int LA37_3 = input.LA(2);

                    if ( (synpred5_InternalAle()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalAle.g:2535:4: ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) )
            	    {
            	    // InternalAle.g:2556:4: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) )
            	    // InternalAle.g:2557:5: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) )
            	    {
            	    // InternalAle.g:2557:5: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
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
            	            // InternalAle.g:2558:6: ( () otherlv_2= '*' )
            	            {
            	            // InternalAle.g:2558:6: ( () otherlv_2= '*' )
            	            // InternalAle.g:2559:7: () otherlv_2= '*'
            	            {
            	            // InternalAle.g:2559:7: ()
            	            // InternalAle.g:2560:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultOperationAccess().getMultOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,54,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getMultOperationAccess().getAsteriskKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2572:6: ( () otherlv_4= '/' )
            	            {
            	            // InternalAle.g:2572:6: ( () otherlv_4= '/' )
            	            // InternalAle.g:2573:7: () otherlv_4= '/'
            	            {
            	            // InternalAle.g:2573:7: ()
            	            // InternalAle.g:2574:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultOperationAccess().getDivOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,55,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getMultOperationAccess().getSolidusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2586:5: ( (lv_right_5_0= ruleAddOperation ) )
            	    // InternalAle.g:2587:6: (lv_right_5_0= ruleAddOperation )
            	    {
            	    // InternalAle.g:2587:6: (lv_right_5_0= ruleAddOperation )
            	    // InternalAle.g:2588:7: lv_right_5_0= ruleAddOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getMultOperationAccess().getRightAddOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_36);
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
    // $ANTLR end "ruleMultOperation"


    // $ANTLR start "entryRuleAddOperation"
    // InternalAle.g:2611:1: entryRuleAddOperation returns [EObject current=null] : iv_ruleAddOperation= ruleAddOperation EOF ;
    public final EObject entryRuleAddOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOperation = null;


        try {
            // InternalAle.g:2611:53: (iv_ruleAddOperation= ruleAddOperation EOF )
            // InternalAle.g:2612:2: iv_ruleAddOperation= ruleAddOperation EOF
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
    // InternalAle.g:2618:1: ruleAddOperation returns [EObject current=null] : (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* ) ;
    public final EObject ruleAddOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ChaindedCall_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2624:2: ( (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* ) )
            // InternalAle.g:2625:2: (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* )
            {
            // InternalAle.g:2625:2: (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* )
            // InternalAle.g:2626:3: this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddOperationAccess().getChaindedCallParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_ChaindedCall_0=ruleChaindedCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ChaindedCall_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2634:3: ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==56) ) {
                    int LA39_2 = input.LA(2);

                    if ( (synpred6_InternalAle()) ) {
                        alt39=1;
                    }


                }
                else if ( (LA39_0==57) ) {
                    int LA39_3 = input.LA(2);

                    if ( (synpred6_InternalAle()) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalAle.g:2635:4: ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) )
            	    {
            	    // InternalAle.g:2656:4: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) )
            	    // InternalAle.g:2657:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) )
            	    {
            	    // InternalAle.g:2657:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==56) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==57) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalAle.g:2658:6: ( () otherlv_2= '+' )
            	            {
            	            // InternalAle.g:2658:6: ( () otherlv_2= '+' )
            	            // InternalAle.g:2659:7: () otherlv_2= '+'
            	            {
            	            // InternalAle.g:2659:7: ()
            	            // InternalAle.g:2660:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAddOperationAccess().getAddOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,56,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getAddOperationAccess().getPlusSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2672:6: ( () otherlv_4= '-' )
            	            {
            	            // InternalAle.g:2672:6: ( () otherlv_4= '-' )
            	            // InternalAle.g:2673:7: () otherlv_4= '-'
            	            {
            	            // InternalAle.g:2673:7: ()
            	            // InternalAle.g:2674:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAddOperationAccess().getSubOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,57,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getAddOperationAccess().getHyphenMinusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2686:5: ( (lv_right_5_0= ruleChaindedCall ) )
            	    // InternalAle.g:2687:6: (lv_right_5_0= ruleChaindedCall )
            	    {
            	    // InternalAle.g:2687:6: (lv_right_5_0= ruleChaindedCall )
            	    // InternalAle.g:2688:7: lv_right_5_0= ruleChaindedCall
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAddOperationAccess().getRightChaindedCallParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_37);
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
            	    break loop39;
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
    // InternalAle.g:2711:1: entryRuleChaindedCall returns [EObject current=null] : iv_ruleChaindedCall= ruleChaindedCall EOF ;
    public final EObject entryRuleChaindedCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChaindedCall = null;


        try {
            // InternalAle.g:2711:53: (iv_ruleChaindedCall= ruleChaindedCall EOF )
            // InternalAle.g:2712:2: iv_ruleChaindedCall= ruleChaindedCall EOF
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
    // InternalAle.g:2718:1: ruleChaindedCall returns [EObject current=null] : (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* ) ;
    public final EObject ruleChaindedCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_InfixOperation_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2724:2: ( (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* ) )
            // InternalAle.g:2725:2: (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* )
            {
            // InternalAle.g:2725:2: (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* )
            // InternalAle.g:2726:3: this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getChaindedCallAccess().getInfixOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_InfixOperation_0=ruleInfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_InfixOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2734:3: ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==58) ) {
                    int LA41_2 = input.LA(2);

                    if ( (synpred7_InternalAle()) ) {
                        alt41=1;
                    }


                }
                else if ( (LA41_0==59) ) {
                    int LA41_3 = input.LA(2);

                    if ( (synpred7_InternalAle()) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // InternalAle.g:2735:4: ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) )
            	    {
            	    // InternalAle.g:2756:4: ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) )
            	    // InternalAle.g:2757:5: ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) )
            	    {
            	    // InternalAle.g:2757:5: ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==58) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==59) ) {
            	        alt40=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalAle.g:2758:6: ( () otherlv_2= '.' )
            	            {
            	            // InternalAle.g:2758:6: ( () otherlv_2= '.' )
            	            // InternalAle.g:2759:7: () otherlv_2= '.'
            	            {
            	            // InternalAle.g:2759:7: ()
            	            // InternalAle.g:2760:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getChaindedCallAccess().getChainedCallLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,58,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getChaindedCallAccess().getFullStopKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2772:6: ( () otherlv_4= '->' )
            	            {
            	            // InternalAle.g:2772:6: ( () otherlv_4= '->' )
            	            // InternalAle.g:2773:7: () otherlv_4= '->'
            	            {
            	            // InternalAle.g:2773:7: ()
            	            // InternalAle.g:2774:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getChaindedCallAccess().getChainedCallArrowLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,59,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getChaindedCallAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2786:5: ( (lv_right_5_0= ruleInfixOperation ) )
            	    // InternalAle.g:2787:6: (lv_right_5_0= ruleInfixOperation )
            	    {
            	    // InternalAle.g:2787:6: (lv_right_5_0= ruleInfixOperation )
            	    // InternalAle.g:2788:7: lv_right_5_0= ruleInfixOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getChaindedCallAccess().getRightInfixOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_38);
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
            	    break loop41;
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
    // InternalAle.g:2811:1: entryRuleInfixOperation returns [EObject current=null] : iv_ruleInfixOperation= ruleInfixOperation EOF ;
    public final EObject entryRuleInfixOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperation = null;


        try {
            // InternalAle.g:2811:55: (iv_ruleInfixOperation= ruleInfixOperation EOF )
            // InternalAle.g:2812:2: iv_ruleInfixOperation= ruleInfixOperation EOF
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
    // InternalAle.g:2818:1: ruleInfixOperation returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' ) | ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' ) | ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) ) | this_AtomicLiteral_23= ruleAtomicLiteral ) ;
    public final EObject ruleInfixOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_name_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_type_9_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject this_AtomicLiteral_23 = null;



        	enterRule();

        try {
            // InternalAle.g:2824:2: ( ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' ) | ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' ) | ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) ) | this_AtomicLiteral_23= ruleAtomicLiteral ) )
            // InternalAle.g:2825:2: ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' ) | ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' ) | ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) ) | this_AtomicLiteral_23= ruleAtomicLiteral )
            {
            // InternalAle.g:2825:2: ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' ) | ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' ) | ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) ) | this_AtomicLiteral_23= ruleAtomicLiteral )
            int alt44=6;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt44=1;
                }
                break;
            case 57:
                {
                alt44=2;
                }
                break;
            case 61:
                {
                alt44=3;
                }
                break;
            case 62:
                {
                alt44=4;
                }
                break;
            case RULE_ID:
                {
                int LA44_5 = input.LA(2);

                if ( (LA44_5==30) ) {
                    alt44=5;
                }
                else if ( (LA44_5==EOF||(LA44_5>=16 && LA44_5<=17)||LA44_5==24||LA44_5==31||LA44_5==36||(LA44_5>=42 && LA44_5<=59)||LA44_5==66) ) {
                    alt44=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case RULE_BOOLEAN:
            case RULE_NULL:
            case 30:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
                {
                alt44=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalAle.g:2826:3: ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:2826:3: ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) )
                    // InternalAle.g:2827:4: () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // InternalAle.g:2827:4: ()
                    // InternalAle.g:2828:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getNotInfixOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,60,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getInfixOperationAccess().getNotKeyword_0_1());
                      			
                    }
                    // InternalAle.g:2838:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalAle.g:2839:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalAle.g:2839:5: (lv_expression_2_0= ruleExpression )
                    // InternalAle.g:2840:6: lv_expression_2_0= ruleExpression
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
                    // InternalAle.g:2859:3: ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:2859:3: ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) )
                    // InternalAle.g:2860:4: () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) )
                    {
                    // InternalAle.g:2860:4: ()
                    // InternalAle.g:2861:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getNegInfixOperationAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,57,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getInfixOperationAccess().getHyphenMinusKeyword_1_1());
                      			
                    }
                    // InternalAle.g:2871:4: ( (lv_expression_5_0= ruleExpression ) )
                    // InternalAle.g:2872:5: (lv_expression_5_0= ruleExpression )
                    {
                    // InternalAle.g:2872:5: (lv_expression_5_0= ruleExpression )
                    // InternalAle.g:2873:6: lv_expression_5_0= ruleExpression
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
                    // InternalAle.g:2892:3: ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' )
                    {
                    // InternalAle.g:2892:3: ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' )
                    // InternalAle.g:2893:4: () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')'
                    {
                    // InternalAle.g:2893:4: ()
                    // InternalAle.g:2894:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getNewSequenceAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,61,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getInfixOperationAccess().getNewSequenceKeyword_2_1());
                      			
                    }
                    otherlv_8=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_2_2());
                      			
                    }
                    // InternalAle.g:2908:4: ( (lv_type_9_0= ruleType ) )
                    // InternalAle.g:2909:5: (lv_type_9_0= ruleType )
                    {
                    // InternalAle.g:2909:5: (lv_type_9_0= ruleType )
                    // InternalAle.g:2910:6: lv_type_9_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInfixOperationAccess().getTypeTypeParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_type_9_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInfixOperationRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_9_0,
                      							"ale.xtext.Ale.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:2933:3: ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' )
                    {
                    // InternalAle.g:2933:3: ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' )
                    // InternalAle.g:2934:4: () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')'
                    {
                    // InternalAle.g:2934:4: ()
                    // InternalAle.g:2935:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getConstructorOperationAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_12=(Token)match(input,62,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getInfixOperationAccess().getNewKeyword_3_1());
                      			
                    }
                    // InternalAle.g:2945:4: ( (lv_name_13_0= RULE_ID ) )
                    // InternalAle.g:2946:5: (lv_name_13_0= RULE_ID )
                    {
                    // InternalAle.g:2946:5: (lv_name_13_0= RULE_ID )
                    // InternalAle.g:2947:6: lv_name_13_0= RULE_ID
                    {
                    lv_name_13_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_13_0, grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_3_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInfixOperationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_13_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,30,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_3_3());
                      			
                    }
                    otherlv_15=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_3_4());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:2973:3: ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) )
                    {
                    // InternalAle.g:2973:3: ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) )
                    // InternalAle.g:2974:4: () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' )
                    {
                    // InternalAle.g:2974:4: ()
                    // InternalAle.g:2975:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getOperationCallOperationAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2981:4: ( (lv_name_17_0= RULE_ID ) )
                    // InternalAle.g:2982:5: (lv_name_17_0= RULE_ID )
                    {
                    // InternalAle.g:2982:5: (lv_name_17_0= RULE_ID )
                    // InternalAle.g:2983:6: lv_name_17_0= RULE_ID
                    {
                    lv_name_17_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_17_0, grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInfixOperationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_17_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalAle.g:2999:4: (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' )
                    // InternalAle.g:3000:5: otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_18, grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_4_2_0());
                      				
                    }
                    // InternalAle.g:3004:5: ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_NULL)||LA43_0==30||LA43_0==57||(LA43_0>=60 && LA43_0<=62)||(LA43_0>=64 && LA43_0<=65)||(LA43_0>=67 && LA43_0<=70)) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalAle.g:3005:6: ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )*
                            {
                            // InternalAle.g:3005:6: ( (lv_parameters_19_0= ruleParamCall ) )
                            // InternalAle.g:3006:7: (lv_parameters_19_0= ruleParamCall )
                            {
                            // InternalAle.g:3006:7: (lv_parameters_19_0= ruleParamCall )
                            // InternalAle.g:3007:8: lv_parameters_19_0= ruleParamCall
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_4_2_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_21);
                            lv_parameters_19_0=ruleParamCall();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getInfixOperationRule());
                              								}
                              								add(
                              									current,
                              									"parameters",
                              									lv_parameters_19_0,
                              									"ale.xtext.Ale.ParamCall");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalAle.g:3024:6: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==16) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // InternalAle.g:3025:7: otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) )
                            	    {
                            	    otherlv_20=(Token)match(input,16,FOLLOW_24); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_20, grammarAccess.getInfixOperationAccess().getCommaKeyword_4_2_1_1_0());
                            	      						
                            	    }
                            	    // InternalAle.g:3029:7: ( (lv_parameters_21_0= ruleParamCall ) )
                            	    // InternalAle.g:3030:8: (lv_parameters_21_0= ruleParamCall )
                            	    {
                            	    // InternalAle.g:3030:8: (lv_parameters_21_0= ruleParamCall )
                            	    // InternalAle.g:3031:9: lv_parameters_21_0= ruleParamCall
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_4_2_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_21);
                            	    lv_parameters_21_0=ruleParamCall();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getInfixOperationRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"parameters",
                            	      										lv_parameters_21_0,
                            	      										"ale.xtext.Ale.ParamCall");
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

                    otherlv_22=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_22, grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_4_2_2());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:3057:3: this_AtomicLiteral_23= ruleAtomicLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInfixOperationAccess().getAtomicLiteralParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AtomicLiteral_23=ruleAtomicLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AtomicLiteral_23;
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
    // InternalAle.g:3069:1: entryRuleParamCall returns [EObject current=null] : iv_ruleParamCall= ruleParamCall EOF ;
    public final EObject entryRuleParamCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamCall = null;


        try {
            // InternalAle.g:3069:50: (iv_ruleParamCall= ruleParamCall EOF )
            // InternalAle.g:3070:2: iv_ruleParamCall= ruleParamCall EOF
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
    // InternalAle.g:3076:1: ruleParamCall returns [EObject current=null] : ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParamCall() throws RecognitionException {
        EObject current = null;

        Token lv_lambda_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:3082:2: ( ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalAle.g:3083:2: ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalAle.g:3083:2: ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalAle.g:3084:3: ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalAle.g:3084:3: ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==63) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalAle.g:3085:4: ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|'
                    {
                    // InternalAle.g:3085:4: ( (lv_lambda_0_0= RULE_ID ) )
                    // InternalAle.g:3086:5: (lv_lambda_0_0= RULE_ID )
                    {
                    // InternalAle.g:3086:5: (lv_lambda_0_0= RULE_ID )
                    // InternalAle.g:3087:6: lv_lambda_0_0= RULE_ID
                    {
                    lv_lambda_0_0=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,63,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getParamCallAccess().getVerticalLineKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAle.g:3108:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalAle.g:3109:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalAle.g:3109:4: (lv_expression_2_0= ruleExpression )
            // InternalAle.g:3110:5: lv_expression_2_0= ruleExpression
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
    // InternalAle.g:3131:1: entryRuleAtomicLiteral returns [EObject current=null] : iv_ruleAtomicLiteral= ruleAtomicLiteral EOF ;
    public final EObject entryRuleAtomicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicLiteral = null;


        try {
            // InternalAle.g:3131:54: (iv_ruleAtomicLiteral= ruleAtomicLiteral EOF )
            // InternalAle.g:3132:2: iv_ruleAtomicLiteral= ruleAtomicLiteral EOF
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
    // InternalAle.g:3138:1: ruleAtomicLiteral returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) ) ;
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
            // InternalAle.g:3144:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) ) )
            // InternalAle.g:3145:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) )
            {
            // InternalAle.g:3145:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) )
            int alt50=13;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt50=1;
                }
                break;
            case 64:
                {
                alt50=2;
                }
                break;
            case 67:
                {
                alt50=3;
                }
                break;
            case 68:
                {
                alt50=4;
                }
                break;
            case RULE_STRING:
                {
                alt50=5;
                }
                break;
            case RULE_INT:
                {
                alt50=6;
                }
                break;
            case RULE_REAL:
                {
                alt50=7;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt50=8;
                }
                break;
            case RULE_NULL:
                {
                alt50=9;
                }
                break;
            case 65:
                {
                alt50=10;
                }
                break;
            case 69:
                {
                alt50=11;
                }
                break;
            case 70:
                {
                alt50=12;
                }
                break;
            case RULE_ID:
                {
                alt50=13;
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
                    // InternalAle.g:3146:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalAle.g:3146:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalAle.g:3147:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getAtomicLiteralAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_25);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAtomicLiteralAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:3165:3: ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' )
                    {
                    // InternalAle.g:3165:3: ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' )
                    // InternalAle.g:3166:4: () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']'
                    {
                    // InternalAle.g:3166:4: ()
                    // InternalAle.g:3167:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getOADenotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,64,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAtomicLiteralAccess().getDollarSignKeyword_1_1());
                      			
                    }
                    otherlv_5=(Token)match(input,65,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAtomicLiteralAccess().getLeftSquareBracketKeyword_1_2());
                      			
                    }
                    // InternalAle.g:3181:4: ( (lv_exp_6_0= ruleExpression ) )
                    // InternalAle.g:3182:5: (lv_exp_6_0= ruleExpression )
                    {
                    // InternalAle.g:3182:5: (lv_exp_6_0= ruleExpression )
                    // InternalAle.g:3183:6: lv_exp_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
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

                    otherlv_7=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAtomicLiteralAccess().getRightSquareBracketKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:3206:3: ( () otherlv_9= 'self' )
                    {
                    // InternalAle.g:3206:3: ( () otherlv_9= 'self' )
                    // InternalAle.g:3207:4: () otherlv_9= 'self'
                    {
                    // InternalAle.g:3207:4: ()
                    // InternalAle.g:3208:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getSelfRefAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getAtomicLiteralAccess().getSelfKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:3220:3: ( () otherlv_11= 'super' )
                    {
                    // InternalAle.g:3220:3: ( () otherlv_11= 'super' )
                    // InternalAle.g:3221:4: () otherlv_11= 'super'
                    {
                    // InternalAle.g:3221:4: ()
                    // InternalAle.g:3222:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getSuperRefAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getAtomicLiteralAccess().getSuperKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:3234:3: ( () ( (lv_value_13_0= RULE_STRING ) ) )
                    {
                    // InternalAle.g:3234:3: ( () ( (lv_value_13_0= RULE_STRING ) ) )
                    // InternalAle.g:3235:4: () ( (lv_value_13_0= RULE_STRING ) )
                    {
                    // InternalAle.g:3235:4: ()
                    // InternalAle.g:3236:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getStringLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3242:4: ( (lv_value_13_0= RULE_STRING ) )
                    // InternalAle.g:3243:5: (lv_value_13_0= RULE_STRING )
                    {
                    // InternalAle.g:3243:5: (lv_value_13_0= RULE_STRING )
                    // InternalAle.g:3244:6: lv_value_13_0= RULE_STRING
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
                    // InternalAle.g:3262:3: ( () ( (lv_value_15_0= RULE_INT ) ) )
                    {
                    // InternalAle.g:3262:3: ( () ( (lv_value_15_0= RULE_INT ) ) )
                    // InternalAle.g:3263:4: () ( (lv_value_15_0= RULE_INT ) )
                    {
                    // InternalAle.g:3263:4: ()
                    // InternalAle.g:3264:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getIntLiteralAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3270:4: ( (lv_value_15_0= RULE_INT ) )
                    // InternalAle.g:3271:5: (lv_value_15_0= RULE_INT )
                    {
                    // InternalAle.g:3271:5: (lv_value_15_0= RULE_INT )
                    // InternalAle.g:3272:6: lv_value_15_0= RULE_INT
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
                    // InternalAle.g:3290:3: ( () ( (lv_value_17_0= RULE_REAL ) ) )
                    {
                    // InternalAle.g:3290:3: ( () ( (lv_value_17_0= RULE_REAL ) ) )
                    // InternalAle.g:3291:4: () ( (lv_value_17_0= RULE_REAL ) )
                    {
                    // InternalAle.g:3291:4: ()
                    // InternalAle.g:3292:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getRealLiteralAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3298:4: ( (lv_value_17_0= RULE_REAL ) )
                    // InternalAle.g:3299:5: (lv_value_17_0= RULE_REAL )
                    {
                    // InternalAle.g:3299:5: (lv_value_17_0= RULE_REAL )
                    // InternalAle.g:3300:6: lv_value_17_0= RULE_REAL
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
                    // InternalAle.g:3318:3: ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalAle.g:3318:3: ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) )
                    // InternalAle.g:3319:4: () ( (lv_value_19_0= RULE_BOOLEAN ) )
                    {
                    // InternalAle.g:3319:4: ()
                    // InternalAle.g:3320:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getBooleanLiteralAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3326:4: ( (lv_value_19_0= RULE_BOOLEAN ) )
                    // InternalAle.g:3327:5: (lv_value_19_0= RULE_BOOLEAN )
                    {
                    // InternalAle.g:3327:5: (lv_value_19_0= RULE_BOOLEAN )
                    // InternalAle.g:3328:6: lv_value_19_0= RULE_BOOLEAN
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
                    // InternalAle.g:3346:3: ( () this_NULL_21= RULE_NULL )
                    {
                    // InternalAle.g:3346:3: ( () this_NULL_21= RULE_NULL )
                    // InternalAle.g:3347:4: () this_NULL_21= RULE_NULL
                    {
                    // InternalAle.g:3347:4: ()
                    // InternalAle.g:3348:5: 
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
                    // InternalAle.g:3360:3: ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' )
                    {
                    // InternalAle.g:3360:3: ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' )
                    // InternalAle.g:3361:4: () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']'
                    {
                    // InternalAle.g:3361:4: ()
                    // InternalAle.g:3362:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getIntRangeAction_9_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_23=(Token)match(input,65,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getAtomicLiteralAccess().getLeftSquareBracketKeyword_9_1());
                      			
                    }
                    // InternalAle.g:3372:4: ( (lv_start_24_0= ruleExpression ) )
                    // InternalAle.g:3373:5: (lv_start_24_0= ruleExpression )
                    {
                    // InternalAle.g:3373:5: (lv_start_24_0= ruleExpression )
                    // InternalAle.g:3374:6: lv_start_24_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicLiteralAccess().getStartExpressionParserRuleCall_9_2_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
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

                    otherlv_25=(Token)match(input,58,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_9_3());
                      			
                    }
                    otherlv_26=(Token)match(input,58,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_9_4());
                      			
                    }
                    // InternalAle.g:3399:4: ( (lv_stop_27_0= ruleExpression ) )
                    // InternalAle.g:3400:5: (lv_stop_27_0= ruleExpression )
                    {
                    // InternalAle.g:3400:5: (lv_stop_27_0= ruleExpression )
                    // InternalAle.g:3401:6: lv_stop_27_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicLiteralAccess().getStopExpressionParserRuleCall_9_5_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
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

                    otherlv_28=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_28, grammarAccess.getAtomicLiteralAccess().getRightSquareBracketKeyword_9_6());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalAle.g:3424:3: ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' )
                    {
                    // InternalAle.g:3424:3: ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' )
                    // InternalAle.g:3425:4: () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}'
                    {
                    // InternalAle.g:3425:4: ()
                    // InternalAle.g:3426:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getSequenceDeclAction_10_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_30=(Token)match(input,69,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getAtomicLiteralAccess().getSequenceKeyword_10_1());
                      			
                    }
                    otherlv_31=(Token)match(input,23,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_10_2());
                      			
                    }
                    // InternalAle.g:3440:4: ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_NULL)||LA47_0==30||LA47_0==57||(LA47_0>=60 && LA47_0<=62)||(LA47_0>=64 && LA47_0<=65)||(LA47_0>=67 && LA47_0<=70)) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalAle.g:3441:5: ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )*
                            {
                            // InternalAle.g:3441:5: ( (lv_expressions_32_0= ruleExpression ) )
                            // InternalAle.g:3442:6: (lv_expressions_32_0= ruleExpression )
                            {
                            // InternalAle.g:3442:6: (lv_expressions_32_0= ruleExpression )
                            // InternalAle.g:3443:7: lv_expressions_32_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_45);
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

                            // InternalAle.g:3460:5: (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==16) ) {
                                    alt46=1;
                                }


                                switch (alt46) {
                            	case 1 :
                            	    // InternalAle.g:3461:6: otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) )
                            	    {
                            	    otherlv_33=(Token)match(input,16,FOLLOW_24); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_33, grammarAccess.getAtomicLiteralAccess().getCommaKeyword_10_3_1_0());
                            	      					
                            	    }
                            	    // InternalAle.g:3465:6: ( (lv_expressions_34_0= ruleExpression ) )
                            	    // InternalAle.g:3466:7: (lv_expressions_34_0= ruleExpression )
                            	    {
                            	    // InternalAle.g:3466:7: (lv_expressions_34_0= ruleExpression )
                            	    // InternalAle.g:3467:8: lv_expressions_34_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_45);
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
                            	    break loop46;
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
                    // InternalAle.g:3492:3: ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' )
                    {
                    // InternalAle.g:3492:3: ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' )
                    // InternalAle.g:3493:4: () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}'
                    {
                    // InternalAle.g:3493:4: ()
                    // InternalAle.g:3494:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getOrderedSetDeclAction_11_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_37=(Token)match(input,70,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getAtomicLiteralAccess().getOrderedSetKeyword_11_1());
                      			
                    }
                    otherlv_38=(Token)match(input,23,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_11_2());
                      			
                    }
                    // InternalAle.g:3508:4: ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_NULL)||LA49_0==30||LA49_0==57||(LA49_0>=60 && LA49_0<=62)||(LA49_0>=64 && LA49_0<=65)||(LA49_0>=67 && LA49_0<=70)) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalAle.g:3509:5: ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )*
                            {
                            // InternalAle.g:3509:5: ( (lv_expressions_39_0= ruleExpression ) )
                            // InternalAle.g:3510:6: (lv_expressions_39_0= ruleExpression )
                            {
                            // InternalAle.g:3510:6: (lv_expressions_39_0= ruleExpression )
                            // InternalAle.g:3511:7: lv_expressions_39_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_11_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_45);
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

                            // InternalAle.g:3528:5: (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==16) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // InternalAle.g:3529:6: otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) )
                            	    {
                            	    otherlv_40=(Token)match(input,16,FOLLOW_24); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_40, grammarAccess.getAtomicLiteralAccess().getCommaKeyword_11_3_1_0());
                            	      					
                            	    }
                            	    // InternalAle.g:3533:6: ( (lv_expressions_41_0= ruleExpression ) )
                            	    // InternalAle.g:3534:7: (lv_expressions_41_0= ruleExpression )
                            	    {
                            	    // InternalAle.g:3534:7: (lv_expressions_41_0= ruleExpression )
                            	    // InternalAle.g:3535:8: lv_expressions_41_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_11_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_45);
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
                            	    break loop48;
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
                    // InternalAle.g:3560:3: ( () ( (lv_value_44_0= RULE_ID ) ) )
                    {
                    // InternalAle.g:3560:3: ( () ( (lv_value_44_0= RULE_ID ) ) )
                    // InternalAle.g:3561:4: () ( (lv_value_44_0= RULE_ID ) )
                    {
                    // InternalAle.g:3561:4: ()
                    // InternalAle.g:3562:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getVarRefAction_12_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3568:4: ( (lv_value_44_0= RULE_ID ) )
                    // InternalAle.g:3569:5: (lv_value_44_0= RULE_ID )
                    {
                    // InternalAle.g:3569:5: (lv_value_44_0= RULE_ID )
                    // InternalAle.g:3570:6: lv_value_44_0= RULE_ID
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
    // InternalAle.g:3591:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalAle.g:3591:46: (iv_ruleParam= ruleParam EOF )
            // InternalAle.g:3592:2: iv_ruleParam= ruleParam EOF
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
    // InternalAle.g:3598:1: ruleParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalAle.g:3604:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAle.g:3605:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAle.g:3605:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAle.g:3606:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAle.g:3606:3: ( (lv_type_0_0= ruleType ) )
            // InternalAle.g:3607:4: (lv_type_0_0= ruleType )
            {
            // InternalAle.g:3607:4: (lv_type_0_0= ruleType )
            // InternalAle.g:3608:5: lv_type_0_0= ruleType
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

            // InternalAle.g:3625:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAle.g:3626:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAle.g:3626:4: (lv_name_1_0= RULE_ID )
            // InternalAle.g:3627:5: lv_name_1_0= RULE_ID
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
    // InternalAle.g:3647:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAle.g:3647:45: (iv_ruleType= ruleType EOF )
            // InternalAle.g:3648:2: iv_ruleType= ruleType EOF
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
    // InternalAle.g:3654:1: ruleType returns [EObject current=null] : (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) ) ;
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
            // InternalAle.g:3660:2: ( (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) ) )
            // InternalAle.g:3661:2: (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) )
            {
            // InternalAle.g:3661:2: (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt51=1;
                }
                break;
            case RULE_ID:
                {
                alt51=2;
                }
                break;
            case 69:
                {
                alt51=3;
                }
                break;
            case 70:
                {
                alt51=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalAle.g:3662:3: this_LiteralType_0= ruleLiteralType
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
                    // InternalAle.g:3671:3: ( () ( (lv_externalClass_2_0= RULE_ID ) ) )
                    {
                    // InternalAle.g:3671:3: ( () ( (lv_externalClass_2_0= RULE_ID ) ) )
                    // InternalAle.g:3672:4: () ( (lv_externalClass_2_0= RULE_ID ) )
                    {
                    // InternalAle.g:3672:4: ()
                    // InternalAle.g:3673:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getOutOfScopeTypeAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3679:4: ( (lv_externalClass_2_0= RULE_ID ) )
                    // InternalAle.g:3680:5: (lv_externalClass_2_0= RULE_ID )
                    {
                    // InternalAle.g:3680:5: (lv_externalClass_2_0= RULE_ID )
                    // InternalAle.g:3681:6: lv_externalClass_2_0= RULE_ID
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
                    // InternalAle.g:3699:3: ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' )
                    {
                    // InternalAle.g:3699:3: ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' )
                    // InternalAle.g:3700:4: () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')'
                    {
                    // InternalAle.g:3700:4: ()
                    // InternalAle.g:3701:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getSequenceTypeAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,69,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getSequenceKeyword_2_1());
                      			
                    }
                    otherlv_5=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2());
                      			
                    }
                    // InternalAle.g:3715:4: ( (lv_subType_6_0= ruleType ) )
                    // InternalAle.g:3716:5: (lv_subType_6_0= ruleType )
                    {
                    // InternalAle.g:3716:5: (lv_subType_6_0= ruleType )
                    // InternalAle.g:3717:6: lv_subType_6_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
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

                    otherlv_7=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:3740:3: ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' )
                    {
                    // InternalAle.g:3740:3: ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' )
                    // InternalAle.g:3741:4: () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')'
                    {
                    // InternalAle.g:3741:4: ()
                    // InternalAle.g:3742:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getOrderedSetTypeAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,70,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getOrderedSetKeyword_3_1());
                      			
                    }
                    otherlv_10=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_3_2());
                      			
                    }
                    // InternalAle.g:3756:4: ( (lv_subType_11_0= ruleType ) )
                    // InternalAle.g:3757:5: (lv_subType_11_0= ruleType )
                    {
                    // InternalAle.g:3757:5: (lv_subType_11_0= ruleType )
                    // InternalAle.g:3758:6: lv_subType_11_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
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

                    otherlv_12=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
    // InternalAle.g:3784:1: entryRuleLiteralType returns [EObject current=null] : iv_ruleLiteralType= ruleLiteralType EOF ;
    public final EObject entryRuleLiteralType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralType = null;


        try {
            // InternalAle.g:3784:52: (iv_ruleLiteralType= ruleLiteralType EOF )
            // InternalAle.g:3785:2: iv_ruleLiteralType= ruleLiteralType EOF
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
    // InternalAle.g:3791:1: ruleLiteralType returns [EObject current=null] : ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) ) ) ;
    public final EObject ruleLiteralType() throws RecognitionException {
        EObject current = null;

        Token lv_lit_0_1=null;
        Token lv_lit_0_2=null;
        Token lv_lit_0_3=null;
        Token lv_lit_0_4=null;


        	enterRule();

        try {
            // InternalAle.g:3797:2: ( ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) ) ) )
            // InternalAle.g:3798:2: ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) ) )
            {
            // InternalAle.g:3798:2: ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) ) )
            // InternalAle.g:3799:3: ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) )
            {
            // InternalAle.g:3799:3: ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) )
            // InternalAle.g:3800:4: (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' )
            {
            // InternalAle.g:3800:4: (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt52=1;
                }
                break;
            case 72:
                {
                alt52=2;
                }
                break;
            case 73:
                {
                alt52=3;
                }
                break;
            case 74:
                {
                alt52=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalAle.g:3801:5: lv_lit_0_1= 'Boolean'
                    {
                    lv_lit_0_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
                    // InternalAle.g:3812:5: lv_lit_0_2= 'Float'
                    {
                    lv_lit_0_2=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_lit_0_2, grammarAccess.getLiteralTypeAccess().getLitFloatKeyword_0_1());
                      				
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
                    // InternalAle.g:3823:5: lv_lit_0_3= 'Integer'
                    {
                    lv_lit_0_3=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_lit_0_3, grammarAccess.getLiteralTypeAccess().getLitIntegerKeyword_0_2());
                      				
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
                    // InternalAle.g:3834:5: lv_lit_0_4= 'String'
                    {
                    lv_lit_0_4=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
    // InternalAle.g:3850:1: entryRuleQualified returns [String current=null] : iv_ruleQualified= ruleQualified EOF ;
    public final String entryRuleQualified() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualified = null;


        try {
            // InternalAle.g:3850:49: (iv_ruleQualified= ruleQualified EOF )
            // InternalAle.g:3851:2: iv_ruleQualified= ruleQualified EOF
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
    // InternalAle.g:3857:1: ruleQualified returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualified() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAle.g:3863:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAle.g:3864:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAle.g:3864:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAle.g:3865:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAle.g:3872:3: (kw= '.' this_ID_2= RULE_ID )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==58) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalAle.g:3873:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,58,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalAle.g:3890:1: entryRuleTypeSystem returns [EObject current=null] : iv_ruleTypeSystem= ruleTypeSystem EOF ;
    public final EObject entryRuleTypeSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSystem = null;


        try {
            // InternalAle.g:3890:51: (iv_ruleTypeSystem= ruleTypeSystem EOF )
            // InternalAle.g:3891:2: iv_ruleTypeSystem= ruleTypeSystem EOF
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
    // InternalAle.g:3897:1: ruleTypeSystem returns [EObject current=null] : ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Float' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) ) ;
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
            // InternalAle.g:3903:2: ( ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Float' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) ) )
            // InternalAle.g:3904:2: ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Float' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) )
            {
            // InternalAle.g:3904:2: ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Float' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) )
            int alt54=7;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt54=1;
                }
                break;
            case 72:
                {
                alt54=2;
                }
                break;
            case 75:
                {
                alt54=3;
                }
                break;
            case 74:
                {
                alt54=4;
                }
                break;
            case 76:
                {
                alt54=5;
                }
                break;
            case 69:
                {
                alt54=6;
                }
                break;
            case 22:
                {
                alt54=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalAle.g:3905:3: ( () otherlv_1= 'Boolean' )
                    {
                    // InternalAle.g:3905:3: ( () otherlv_1= 'Boolean' )
                    // InternalAle.g:3906:4: () otherlv_1= 'Boolean'
                    {
                    // InternalAle.g:3906:4: ()
                    // InternalAle.g:3907:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getBooleanTypeTAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeSystemAccess().getBooleanKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:3919:3: ( () otherlv_3= 'Float' )
                    {
                    // InternalAle.g:3919:3: ( () otherlv_3= 'Float' )
                    // InternalAle.g:3920:4: () otherlv_3= 'Float'
                    {
                    // InternalAle.g:3920:4: ()
                    // InternalAle.g:3921:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getFLoatTypeTAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypeSystemAccess().getFloatKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:3933:3: ( () otherlv_5= 'Int' )
                    {
                    // InternalAle.g:3933:3: ( () otherlv_5= 'Int' )
                    // InternalAle.g:3934:4: () otherlv_5= 'Int'
                    {
                    // InternalAle.g:3934:4: ()
                    // InternalAle.g:3935:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getIntTypeTAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTypeSystemAccess().getIntKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:3947:3: ( () otherlv_7= 'String' )
                    {
                    // InternalAle.g:3947:3: ( () otherlv_7= 'String' )
                    // InternalAle.g:3948:4: () otherlv_7= 'String'
                    {
                    // InternalAle.g:3948:4: ()
                    // InternalAle.g:3949:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getStringTypeTAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTypeSystemAccess().getStringKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:3961:3: ( () otherlv_9= 'nulltype' )
                    {
                    // InternalAle.g:3961:3: ( () otherlv_9= 'nulltype' )
                    // InternalAle.g:3962:4: () otherlv_9= 'nulltype'
                    {
                    // InternalAle.g:3962:4: ()
                    // InternalAle.g:3963:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getNullTypeTAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTypeSystemAccess().getNulltypeKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:3975:3: ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) )
                    {
                    // InternalAle.g:3975:3: ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) )
                    // InternalAle.g:3976:4: () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) )
                    {
                    // InternalAle.g:3976:4: ()
                    // InternalAle.g:3977:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getSequenceTypeTAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,69,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTypeSystemAccess().getSequenceKeyword_5_1());
                      			
                    }
                    // InternalAle.g:3987:4: ( (lv_subType_12_0= ruleTypeSystem ) )
                    // InternalAle.g:3988:5: (lv_subType_12_0= ruleTypeSystem )
                    {
                    // InternalAle.g:3988:5: (lv_subType_12_0= ruleTypeSystem )
                    // InternalAle.g:3989:6: lv_subType_12_0= ruleTypeSystem
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
                    // InternalAle.g:4008:3: ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) )
                    {
                    // InternalAle.g:4008:3: ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) )
                    // InternalAle.g:4009:4: () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) )
                    {
                    // InternalAle.g:4009:4: ()
                    // InternalAle.g:4010:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getClassTypeTAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_14=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTypeSystemAccess().getClassKeyword_6_1());
                      			
                    }
                    // InternalAle.g:4020:4: ( (otherlv_15= RULE_ID ) )
                    // InternalAle.g:4021:5: (otherlv_15= RULE_ID )
                    {
                    // InternalAle.g:4021:5: (otherlv_15= RULE_ID )
                    // InternalAle.g:4022:6: otherlv_15= RULE_ID
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
        // InternalAle.g:2053:4: ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )
        // InternalAle.g:2053:5: ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) )
        {
        // InternalAle.g:2053:5: ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) )
        // InternalAle.g:2054:5: ( () 'implies' ) ( ( ruleBooleanOperation ) )
        {
        // InternalAle.g:2054:5: ( () 'implies' )
        // InternalAle.g:2055:6: () 'implies'
        {
        // InternalAle.g:2055:6: ()
        // InternalAle.g:2056:6: 
        {
        }

        match(input,42,FOLLOW_24); if (state.failed) return ;

        }

        // InternalAle.g:2059:5: ( ( ruleBooleanOperation ) )
        // InternalAle.g:2060:6: ( ruleBooleanOperation )
        {
        // InternalAle.g:2060:6: ( ruleBooleanOperation )
        // InternalAle.g:2061:7: ruleBooleanOperation
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
        // InternalAle.g:2129:4: ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )
        // InternalAle.g:2129:5: ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) )
        {
        // InternalAle.g:2129:5: ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) )
        // InternalAle.g:2130:5: ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) )
        {
        // InternalAle.g:2130:5: ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) )
        int alt55=3;
        switch ( input.LA(1) ) {
        case 43:
            {
            alt55=1;
            }
            break;
        case 44:
            {
            alt55=2;
            }
            break;
        case 45:
            {
            alt55=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 55, 0, input);

            throw nvae;
        }

        switch (alt55) {
            case 1 :
                // InternalAle.g:2131:6: ( () 'or' )
                {
                // InternalAle.g:2131:6: ( () 'or' )
                // InternalAle.g:2132:7: () 'or'
                {
                // InternalAle.g:2132:7: ()
                // InternalAle.g:2133:7: 
                {
                }

                match(input,43,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2137:6: ( () 'and' )
                {
                // InternalAle.g:2137:6: ( () 'and' )
                // InternalAle.g:2138:7: () 'and'
                {
                // InternalAle.g:2138:7: ()
                // InternalAle.g:2139:7: 
                {
                }

                match(input,44,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalAle.g:2143:6: ( () 'xor' )
                {
                // InternalAle.g:2143:6: ( () 'xor' )
                // InternalAle.g:2144:7: () 'xor'
                {
                // InternalAle.g:2144:7: ()
                // InternalAle.g:2145:7: 
                {
                }

                match(input,45,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2149:5: ( ( ruleCompareOperation ) )
        // InternalAle.g:2150:6: ( ruleCompareOperation )
        {
        // InternalAle.g:2150:6: ( ruleCompareOperation )
        // InternalAle.g:2151:7: ruleCompareOperation
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
        // InternalAle.g:2249:4: ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )
        // InternalAle.g:2249:5: ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) )
        {
        // InternalAle.g:2249:5: ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) )
        // InternalAle.g:2250:5: ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) )
        {
        // InternalAle.g:2250:5: ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) )
        int alt56=7;
        switch ( input.LA(1) ) {
        case 46:
            {
            alt56=1;
            }
            break;
        case 47:
            {
            alt56=2;
            }
            break;
        case 48:
            {
            alt56=3;
            }
            break;
        case 49:
            {
            alt56=4;
            }
            break;
        case 50:
            {
            alt56=5;
            }
            break;
        case 51:
            {
            alt56=6;
            }
            break;
        case 52:
            {
            alt56=7;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 56, 0, input);

            throw nvae;
        }

        switch (alt56) {
            case 1 :
                // InternalAle.g:2251:6: ( () '<=' )
                {
                // InternalAle.g:2251:6: ( () '<=' )
                // InternalAle.g:2252:7: () '<='
                {
                // InternalAle.g:2252:7: ()
                // InternalAle.g:2253:7: 
                {
                }

                match(input,46,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2257:6: ( () '>=' )
                {
                // InternalAle.g:2257:6: ( () '>=' )
                // InternalAle.g:2258:7: () '>='
                {
                // InternalAle.g:2258:7: ()
                // InternalAle.g:2259:7: 
                {
                }

                match(input,47,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalAle.g:2263:6: ( () '!=' )
                {
                // InternalAle.g:2263:6: ( () '!=' )
                // InternalAle.g:2264:7: () '!='
                {
                // InternalAle.g:2264:7: ()
                // InternalAle.g:2265:7: 
                {
                }

                match(input,48,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // InternalAle.g:2269:6: ( () '<' )
                {
                // InternalAle.g:2269:6: ( () '<' )
                // InternalAle.g:2270:7: () '<'
                {
                // InternalAle.g:2270:7: ()
                // InternalAle.g:2271:7: 
                {
                }

                match(input,49,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;
            case 5 :
                // InternalAle.g:2275:6: ( () '>' )
                {
                // InternalAle.g:2275:6: ( () '>' )
                // InternalAle.g:2276:7: () '>'
                {
                // InternalAle.g:2276:7: ()
                // InternalAle.g:2277:7: 
                {
                }

                match(input,50,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;
            case 6 :
                // InternalAle.g:2281:6: ( () 'instanceof' )
                {
                // InternalAle.g:2281:6: ( () 'instanceof' )
                // InternalAle.g:2282:7: () 'instanceof'
                {
                // InternalAle.g:2282:7: ()
                // InternalAle.g:2283:7: 
                {
                }

                match(input,51,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;
            case 7 :
                // InternalAle.g:2287:6: ( () 'castto' )
                {
                // InternalAle.g:2287:6: ( () 'castto' )
                // InternalAle.g:2288:7: () 'castto'
                {
                // InternalAle.g:2288:7: ()
                // InternalAle.g:2289:7: 
                {
                }

                match(input,52,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2293:5: ( ( ruleEqualityOperation ) )
        // InternalAle.g:2294:6: ( ruleEqualityOperation )
        {
        // InternalAle.g:2294:6: ( ruleEqualityOperation )
        // InternalAle.g:2295:7: ruleEqualityOperation
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
        // InternalAle.g:2449:4: ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )
        // InternalAle.g:2449:5: ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) )
        {
        // InternalAle.g:2449:5: ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) )
        // InternalAle.g:2450:5: () ( ( '==' ) ) ( ( ruleMultOperation ) )
        {
        // InternalAle.g:2450:5: ()
        // InternalAle.g:2451:5: 
        {
        }

        // InternalAle.g:2452:5: ( ( '==' ) )
        // InternalAle.g:2453:6: ( '==' )
        {
        // InternalAle.g:2453:6: ( '==' )
        // InternalAle.g:2454:7: '=='
        {
        match(input,53,FOLLOW_24); if (state.failed) return ;

        }


        }

        // InternalAle.g:2457:5: ( ( ruleMultOperation ) )
        // InternalAle.g:2458:6: ( ruleMultOperation )
        {
        // InternalAle.g:2458:6: ( ruleMultOperation )
        // InternalAle.g:2459:7: ruleMultOperation
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
        // InternalAle.g:2535:4: ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )
        // InternalAle.g:2535:5: ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) )
        {
        // InternalAle.g:2535:5: ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) )
        // InternalAle.g:2536:5: ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) )
        {
        // InternalAle.g:2536:5: ( ( () '*' ) | ( () '/' ) )
        int alt57=2;
        int LA57_0 = input.LA(1);

        if ( (LA57_0==54) ) {
            alt57=1;
        }
        else if ( (LA57_0==55) ) {
            alt57=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 57, 0, input);

            throw nvae;
        }
        switch (alt57) {
            case 1 :
                // InternalAle.g:2537:6: ( () '*' )
                {
                // InternalAle.g:2537:6: ( () '*' )
                // InternalAle.g:2538:7: () '*'
                {
                // InternalAle.g:2538:7: ()
                // InternalAle.g:2539:7: 
                {
                }

                match(input,54,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2543:6: ( () '/' )
                {
                // InternalAle.g:2543:6: ( () '/' )
                // InternalAle.g:2544:7: () '/'
                {
                // InternalAle.g:2544:7: ()
                // InternalAle.g:2545:7: 
                {
                }

                match(input,55,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2549:5: ( ( ruleAddOperation ) )
        // InternalAle.g:2550:6: ( ruleAddOperation )
        {
        // InternalAle.g:2550:6: ( ruleAddOperation )
        // InternalAle.g:2551:7: ruleAddOperation
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
        // InternalAle.g:2635:4: ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )
        // InternalAle.g:2635:5: ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) )
        {
        // InternalAle.g:2635:5: ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) )
        // InternalAle.g:2636:5: ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) )
        {
        // InternalAle.g:2636:5: ( ( () '+' ) | ( () '-' ) )
        int alt58=2;
        int LA58_0 = input.LA(1);

        if ( (LA58_0==56) ) {
            alt58=1;
        }
        else if ( (LA58_0==57) ) {
            alt58=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 58, 0, input);

            throw nvae;
        }
        switch (alt58) {
            case 1 :
                // InternalAle.g:2637:6: ( () '+' )
                {
                // InternalAle.g:2637:6: ( () '+' )
                // InternalAle.g:2638:7: () '+'
                {
                // InternalAle.g:2638:7: ()
                // InternalAle.g:2639:7: 
                {
                }

                match(input,56,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2643:6: ( () '-' )
                {
                // InternalAle.g:2643:6: ( () '-' )
                // InternalAle.g:2644:7: () '-'
                {
                // InternalAle.g:2644:7: ()
                // InternalAle.g:2645:7: 
                {
                }

                match(input,57,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2649:5: ( ( ruleChaindedCall ) )
        // InternalAle.g:2650:6: ( ruleChaindedCall )
        {
        // InternalAle.g:2650:6: ( ruleChaindedCall )
        // InternalAle.g:2651:7: ruleChaindedCall
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
        // InternalAle.g:2735:4: ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )
        // InternalAle.g:2735:5: ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) )
        {
        // InternalAle.g:2735:5: ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) )
        // InternalAle.g:2736:5: ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) )
        {
        // InternalAle.g:2736:5: ( ( () '.' ) | ( () '->' ) )
        int alt59=2;
        int LA59_0 = input.LA(1);

        if ( (LA59_0==58) ) {
            alt59=1;
        }
        else if ( (LA59_0==59) ) {
            alt59=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 59, 0, input);

            throw nvae;
        }
        switch (alt59) {
            case 1 :
                // InternalAle.g:2737:6: ( () '.' )
                {
                // InternalAle.g:2737:6: ( () '.' )
                // InternalAle.g:2738:7: () '.'
                {
                // InternalAle.g:2738:7: ()
                // InternalAle.g:2739:7: 
                {
                }

                match(input,58,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2743:6: ( () '->' )
                {
                // InternalAle.g:2743:6: ( () '->' )
                // InternalAle.g:2744:7: () '->'
                {
                // InternalAle.g:2744:7: ()
                // InternalAle.g:2745:7: 
                {
                }

                match(input,59,FOLLOW_24); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2749:5: ( ( ruleInfixOperation ) )
        // InternalAle.g:2750:6: ( ruleInfixOperation )
        {
        // InternalAle.g:2750:6: ( ruleInfixOperation )
        // InternalAle.g:2751:7: ruleInfixOperation
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


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\24\1\4\2\uffff\1\24";
    static final String dfa_3s = "\1\40\1\4\2\uffff\1\40";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\uffff";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\7\uffff\1\2\3\uffff\1\3",
            "\1\4",
            "",
            "",
            "\1\1\7\uffff\1\2\3\uffff\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "840:2: (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\4\2\27\7\uffff";
    static final String dfa_9s = "\1\112\1\uffff\1\73\2\36\7\uffff";
    static final String dfa_10s = "\1\uffff\1\1\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_11s = "\14\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\5\12\24\uffff\1\12\2\uffff\1\13\1\11\1\10\1\uffff\1\6\1\uffff\1\7\1\5\20\uffff\1\12\2\uffff\3\12\1\uffff\2\12\1\uffff\2\12\1\3\1\4\4\1",
            "",
            "\1\1\14\uffff\1\12\14\uffff\1\12\12\uffff\1\1\22\12",
            "\1\12\6\uffff\1\1",
            "\1\12\6\uffff\1\1",
            "",
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

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1191:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) )";
        }
    }
    static final String dfa_13s = "\12\uffff";
    static final String dfa_14s = "\1\1\11\uffff";
    static final String dfa_15s = "\1\20\1\uffff\7\0\1\uffff";
    static final String dfa_16s = "\1\102\1\uffff\7\0\1\uffff";
    static final String dfa_17s = "\1\uffff\1\2\7\uffff\1\1";
    static final String dfa_18s = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_19s = {
            "\2\1\6\uffff\1\1\6\uffff\1\1\4\uffff\1\1\5\uffff\4\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\1\6\uffff\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 2248:3: ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_8 = input.LA(1);

                         
                        int index34_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000640002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000011B100010L,0x00000000000007E0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000111100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L,0x00000000000007E0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000010L,0x00000000000007E0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000010L,0x00000000000007E0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x72000000400003F0L,0x000000000000007BL});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x72000008400003F0L,0x000000000000007BL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x720001AE410003F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x001FC00000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x72000000C00003F0L,0x000000000000007BL});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x72000000410003F0L,0x000000000000007BL});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000400000L,0x0000000000001DA0L});

}