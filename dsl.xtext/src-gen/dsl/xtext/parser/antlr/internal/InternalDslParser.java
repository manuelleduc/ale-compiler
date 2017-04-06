package dsl.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dsl.xtext.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'syntax'", "'='", "','", "'behavior'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DSL";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDSL"
    // InternalDsl.g:64:1: entryRuleDSL returns [EObject current=null] : iv_ruleDSL= ruleDSL EOF ;
    public final EObject entryRuleDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL = null;


        try {
            // InternalDsl.g:64:44: (iv_ruleDSL= ruleDSL EOF )
            // InternalDsl.g:65:2: iv_ruleDSL= ruleDSL EOF
            {
             newCompositeNode(grammarAccess.getDSLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSL=ruleDSL();

            state._fsp--;

             current =iv_ruleDSL; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDSL"


    // $ANTLR start "ruleDSL"
    // InternalDsl.g:71:1: ruleDSL returns [EObject current=null] : (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_syntaxes_2_0= ruleSyntax ) ) (otherlv_3= ',' ( (lv_syntaxes_4_0= ruleSyntax ) ) )* otherlv_5= 'behavior' otherlv_6= '=' ( (lv_behaviours_7_0= ruleBehavior ) ) (otherlv_8= ',' ( (lv_behaviours_9_0= ruleBehavior ) ) )* ) ;
    public final EObject ruleDSL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_syntaxes_2_0 = null;

        EObject lv_syntaxes_4_0 = null;

        EObject lv_behaviours_7_0 = null;

        EObject lv_behaviours_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_syntaxes_2_0= ruleSyntax ) ) (otherlv_3= ',' ( (lv_syntaxes_4_0= ruleSyntax ) ) )* otherlv_5= 'behavior' otherlv_6= '=' ( (lv_behaviours_7_0= ruleBehavior ) ) (otherlv_8= ',' ( (lv_behaviours_9_0= ruleBehavior ) ) )* ) )
            // InternalDsl.g:78:2: (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_syntaxes_2_0= ruleSyntax ) ) (otherlv_3= ',' ( (lv_syntaxes_4_0= ruleSyntax ) ) )* otherlv_5= 'behavior' otherlv_6= '=' ( (lv_behaviours_7_0= ruleBehavior ) ) (otherlv_8= ',' ( (lv_behaviours_9_0= ruleBehavior ) ) )* )
            {
            // InternalDsl.g:78:2: (otherlv_0= 'syntax' otherlv_1= '=' ( (lv_syntaxes_2_0= ruleSyntax ) ) (otherlv_3= ',' ( (lv_syntaxes_4_0= ruleSyntax ) ) )* otherlv_5= 'behavior' otherlv_6= '=' ( (lv_behaviours_7_0= ruleBehavior ) ) (otherlv_8= ',' ( (lv_behaviours_9_0= ruleBehavior ) ) )* )
            // InternalDsl.g:79:3: otherlv_0= 'syntax' otherlv_1= '=' ( (lv_syntaxes_2_0= ruleSyntax ) ) (otherlv_3= ',' ( (lv_syntaxes_4_0= ruleSyntax ) ) )* otherlv_5= 'behavior' otherlv_6= '=' ( (lv_behaviours_7_0= ruleBehavior ) ) (otherlv_8= ',' ( (lv_behaviours_9_0= ruleBehavior ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAccess().getSyntaxKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDSLAccess().getEqualsSignKeyword_1());
            		
            // InternalDsl.g:87:3: ( (lv_syntaxes_2_0= ruleSyntax ) )
            // InternalDsl.g:88:4: (lv_syntaxes_2_0= ruleSyntax )
            {
            // InternalDsl.g:88:4: (lv_syntaxes_2_0= ruleSyntax )
            // InternalDsl.g:89:5: lv_syntaxes_2_0= ruleSyntax
            {

            					newCompositeNode(grammarAccess.getDSLAccess().getSyntaxesSyntaxParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_syntaxes_2_0=ruleSyntax();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDSLRule());
            					}
            					add(
            						current,
            						"syntaxes",
            						lv_syntaxes_2_0,
            						"dsl.xtext.Dsl.Syntax");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:106:3: (otherlv_3= ',' ( (lv_syntaxes_4_0= ruleSyntax ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:107:4: otherlv_3= ',' ( (lv_syntaxes_4_0= ruleSyntax ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDSLAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:111:4: ( (lv_syntaxes_4_0= ruleSyntax ) )
            	    // InternalDsl.g:112:5: (lv_syntaxes_4_0= ruleSyntax )
            	    {
            	    // InternalDsl.g:112:5: (lv_syntaxes_4_0= ruleSyntax )
            	    // InternalDsl.g:113:6: lv_syntaxes_4_0= ruleSyntax
            	    {

            	    						newCompositeNode(grammarAccess.getDSLAccess().getSyntaxesSyntaxParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_syntaxes_4_0=ruleSyntax();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDSLRule());
            	    						}
            	    						add(
            	    							current,
            	    							"syntaxes",
            	    							lv_syntaxes_4_0,
            	    							"dsl.xtext.Dsl.Syntax");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDSLAccess().getBehaviorKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLAccess().getEqualsSignKeyword_5());
            		
            // InternalDsl.g:139:3: ( (lv_behaviours_7_0= ruleBehavior ) )
            // InternalDsl.g:140:4: (lv_behaviours_7_0= ruleBehavior )
            {
            // InternalDsl.g:140:4: (lv_behaviours_7_0= ruleBehavior )
            // InternalDsl.g:141:5: lv_behaviours_7_0= ruleBehavior
            {

            					newCompositeNode(grammarAccess.getDSLAccess().getBehavioursBehaviorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_behaviours_7_0=ruleBehavior();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDSLRule());
            					}
            					add(
            						current,
            						"behaviours",
            						lv_behaviours_7_0,
            						"dsl.xtext.Dsl.Behavior");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:158:3: (otherlv_8= ',' ( (lv_behaviours_9_0= ruleBehavior ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:159:4: otherlv_8= ',' ( (lv_behaviours_9_0= ruleBehavior ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_8, grammarAccess.getDSLAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalDsl.g:163:4: ( (lv_behaviours_9_0= ruleBehavior ) )
            	    // InternalDsl.g:164:5: (lv_behaviours_9_0= ruleBehavior )
            	    {
            	    // InternalDsl.g:164:5: (lv_behaviours_9_0= ruleBehavior )
            	    // InternalDsl.g:165:6: lv_behaviours_9_0= ruleBehavior
            	    {

            	    						newCompositeNode(grammarAccess.getDSLAccess().getBehavioursBehaviorParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_behaviours_9_0=ruleBehavior();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDSLRule());
            	    						}
            	    						add(
            	    							current,
            	    							"behaviours",
            	    							lv_behaviours_9_0,
            	    							"dsl.xtext.Dsl.Behavior");
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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL"


    // $ANTLR start "entryRuleSyntax"
    // InternalDsl.g:187:1: entryRuleSyntax returns [EObject current=null] : iv_ruleSyntax= ruleSyntax EOF ;
    public final EObject entryRuleSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyntax = null;


        try {
            // InternalDsl.g:187:47: (iv_ruleSyntax= ruleSyntax EOF )
            // InternalDsl.g:188:2: iv_ruleSyntax= ruleSyntax EOF
            {
             newCompositeNode(grammarAccess.getSyntaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSyntax=ruleSyntax();

            state._fsp--;

             current =iv_ruleSyntax; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSyntax"


    // $ANTLR start "ruleSyntax"
    // InternalDsl.g:194:1: ruleSyntax returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleSyntax() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:200:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalDsl.g:201:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalDsl.g:201:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalDsl.g:202:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalDsl.g:202:3: (lv_value_0_0= RULE_STRING )
            // InternalDsl.g:203:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getSyntaxAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSyntaxRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSyntax"


    // $ANTLR start "entryRuleBehavior"
    // InternalDsl.g:222:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // InternalDsl.g:222:49: (iv_ruleBehavior= ruleBehavior EOF )
            // InternalDsl.g:223:2: iv_ruleBehavior= ruleBehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;

             current =iv_ruleBehavior; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // InternalDsl.g:229:1: ruleBehavior returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:235:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalDsl.g:236:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalDsl.g:236:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalDsl.g:237:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalDsl.g:237:3: (lv_value_0_0= RULE_STRING )
            // InternalDsl.g:238:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getBehaviorAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBehaviorRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehavior"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});

}