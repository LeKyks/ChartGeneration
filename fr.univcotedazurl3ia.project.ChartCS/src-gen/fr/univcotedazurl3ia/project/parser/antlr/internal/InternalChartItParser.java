package fr.univcotedazurl3ia.project.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.univcotedazurl3ia.project.services.ChartItGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChartItParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'P'", "':'", "'{'", "'loadData'", "','", "'}'", "'col'", "'chart'", "'('", "')'", "'data'", "'='", "'type'", "'backgroundColor'", "'label'", "'color'", "'Blue'", "'Red'", "'Green'", "'Orange'", "'Yellow'", "'Purple'", "'Black'", "'Brown'", "'Pink'", "'Darkgrey'", "'LightGrey'", "'White'", "'Pie'", "'Bar'", "'Area'", "'Bubble'", "'Line'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalChartItParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalChartItParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalChartItParser.tokenNames; }
    public String getGrammarFileName() { return "InternalChartIt.g"; }



     	private ChartItGrammarAccess grammarAccess;

        public InternalChartItParser(TokenStream input, ChartItGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected ChartItGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalChartIt.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalChartIt.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalChartIt.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalChartIt.g:72:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'P' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= 'loadData' otherlv_6= '{' ( (lv_loadData_7_0= ruleData ) )+ (otherlv_8= ',' ( (lv_loadData_9_0= ruleData ) ) )* otherlv_10= '}' otherlv_11= 'col' otherlv_12= '{' ( (lv_col_13_0= ruleCol ) )+ (otherlv_14= ',' ( (lv_col_15_0= ruleCol ) ) )* otherlv_16= '}' otherlv_17= 'chart' otherlv_18= '{' ( (lv_chart_19_0= ruleChart ) )+ (otherlv_20= ',' ( (lv_chart_21_0= ruleChart ) ) )* otherlv_22= '}' otherlv_23= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        EObject lv_loadData_7_0 = null;

        EObject lv_loadData_9_0 = null;

        EObject lv_col_13_0 = null;

        EObject lv_col_15_0 = null;

        EObject lv_chart_19_0 = null;

        EObject lv_chart_21_0 = null;



        	enterRule();

        try {
            // InternalChartIt.g:78:2: ( ( () otherlv_1= 'P' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= 'loadData' otherlv_6= '{' ( (lv_loadData_7_0= ruleData ) )+ (otherlv_8= ',' ( (lv_loadData_9_0= ruleData ) ) )* otherlv_10= '}' otherlv_11= 'col' otherlv_12= '{' ( (lv_col_13_0= ruleCol ) )+ (otherlv_14= ',' ( (lv_col_15_0= ruleCol ) ) )* otherlv_16= '}' otherlv_17= 'chart' otherlv_18= '{' ( (lv_chart_19_0= ruleChart ) )+ (otherlv_20= ',' ( (lv_chart_21_0= ruleChart ) ) )* otherlv_22= '}' otherlv_23= '}' ) )
            // InternalChartIt.g:79:2: ( () otherlv_1= 'P' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= 'loadData' otherlv_6= '{' ( (lv_loadData_7_0= ruleData ) )+ (otherlv_8= ',' ( (lv_loadData_9_0= ruleData ) ) )* otherlv_10= '}' otherlv_11= 'col' otherlv_12= '{' ( (lv_col_13_0= ruleCol ) )+ (otherlv_14= ',' ( (lv_col_15_0= ruleCol ) ) )* otherlv_16= '}' otherlv_17= 'chart' otherlv_18= '{' ( (lv_chart_19_0= ruleChart ) )+ (otherlv_20= ',' ( (lv_chart_21_0= ruleChart ) ) )* otherlv_22= '}' otherlv_23= '}' )
            {
            // InternalChartIt.g:79:2: ( () otherlv_1= 'P' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= 'loadData' otherlv_6= '{' ( (lv_loadData_7_0= ruleData ) )+ (otherlv_8= ',' ( (lv_loadData_9_0= ruleData ) ) )* otherlv_10= '}' otherlv_11= 'col' otherlv_12= '{' ( (lv_col_13_0= ruleCol ) )+ (otherlv_14= ',' ( (lv_col_15_0= ruleCol ) ) )* otherlv_16= '}' otherlv_17= 'chart' otherlv_18= '{' ( (lv_chart_19_0= ruleChart ) )+ (otherlv_20= ',' ( (lv_chart_21_0= ruleChart ) ) )* otherlv_22= '}' otherlv_23= '}' )
            // InternalChartIt.g:80:3: () otherlv_1= 'P' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '{' otherlv_5= 'loadData' otherlv_6= '{' ( (lv_loadData_7_0= ruleData ) )+ (otherlv_8= ',' ( (lv_loadData_9_0= ruleData ) ) )* otherlv_10= '}' otherlv_11= 'col' otherlv_12= '{' ( (lv_col_13_0= ruleCol ) )+ (otherlv_14= ',' ( (lv_col_15_0= ruleCol ) ) )* otherlv_16= '}' otherlv_17= 'chart' otherlv_18= '{' ( (lv_chart_19_0= ruleChart ) )+ (otherlv_20= ',' ( (lv_chart_21_0= ruleChart ) ) )* otherlv_22= '}' otherlv_23= '}'
            {
            // InternalChartIt.g:80:3: ()
            // InternalChartIt.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getPKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getColonKeyword_2());
            		
            // InternalChartIt.g:95:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalChartIt.g:96:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalChartIt.g:96:4: (lv_name_3_0= RULE_STRING )
            // InternalChartIt.g:97:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getProgramAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getLoadDataKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalChartIt.g:125:3: ( (lv_loadData_7_0= ruleData ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalChartIt.g:126:4: (lv_loadData_7_0= ruleData )
            	    {
            	    // InternalChartIt.g:126:4: (lv_loadData_7_0= ruleData )
            	    // InternalChartIt.g:127:5: lv_loadData_7_0= ruleData
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getLoadDataDataParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_loadData_7_0=ruleData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loadData",
            	    						lv_loadData_7_0,
            	    						"fr.univcotedazurl3ia.project.ChartIt.Data");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            // InternalChartIt.g:144:3: (otherlv_8= ',' ( (lv_loadData_9_0= ruleData ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalChartIt.g:145:4: otherlv_8= ',' ( (lv_loadData_9_0= ruleData ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_8, grammarAccess.getProgramAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalChartIt.g:149:4: ( (lv_loadData_9_0= ruleData ) )
            	    // InternalChartIt.g:150:5: (lv_loadData_9_0= ruleData )
            	    {
            	    // InternalChartIt.g:150:5: (lv_loadData_9_0= ruleData )
            	    // InternalChartIt.g:151:6: lv_loadData_9_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getLoadDataDataParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_loadData_9_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"loadData",
            	    							lv_loadData_9_0,
            	    							"fr.univcotedazurl3ia.project.ChartIt.Data");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getProgramAccess().getColKeyword_10());
            		
            otherlv_12=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalChartIt.g:181:3: ( (lv_col_13_0= ruleCol ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalChartIt.g:182:4: (lv_col_13_0= ruleCol )
            	    {
            	    // InternalChartIt.g:182:4: (lv_col_13_0= ruleCol )
            	    // InternalChartIt.g:183:5: lv_col_13_0= ruleCol
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getColColParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_col_13_0=ruleCol();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"col",
            	    						lv_col_13_0,
            	    						"fr.univcotedazurl3ia.project.ChartIt.Col");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalChartIt.g:200:3: (otherlv_14= ',' ( (lv_col_15_0= ruleCol ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalChartIt.g:201:4: otherlv_14= ',' ( (lv_col_15_0= ruleCol ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_14, grammarAccess.getProgramAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalChartIt.g:205:4: ( (lv_col_15_0= ruleCol ) )
            	    // InternalChartIt.g:206:5: (lv_col_15_0= ruleCol )
            	    {
            	    // InternalChartIt.g:206:5: (lv_col_15_0= ruleCol )
            	    // InternalChartIt.g:207:6: lv_col_15_0= ruleCol
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getColColParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_col_15_0=ruleCol();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"col",
            	    							lv_col_15_0,
            	    							"fr.univcotedazurl3ia.project.ChartIt.Col");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_16, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_17=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_17, grammarAccess.getProgramAccess().getChartKeyword_15());
            		
            otherlv_18=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalChartIt.g:237:3: ( (lv_chart_19_0= ruleChart ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalChartIt.g:238:4: (lv_chart_19_0= ruleChart )
            	    {
            	    // InternalChartIt.g:238:4: (lv_chart_19_0= ruleChart )
            	    // InternalChartIt.g:239:5: lv_chart_19_0= ruleChart
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getChartChartParserRuleCall_17_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_chart_19_0=ruleChart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chart",
            	    						lv_chart_19_0,
            	    						"fr.univcotedazurl3ia.project.ChartIt.Chart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalChartIt.g:256:3: (otherlv_20= ',' ( (lv_chart_21_0= ruleChart ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalChartIt.g:257:4: otherlv_20= ',' ( (lv_chart_21_0= ruleChart ) )
            	    {
            	    otherlv_20=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_20, grammarAccess.getProgramAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalChartIt.g:261:4: ( (lv_chart_21_0= ruleChart ) )
            	    // InternalChartIt.g:262:5: (lv_chart_21_0= ruleChart )
            	    {
            	    // InternalChartIt.g:262:5: (lv_chart_21_0= ruleChart )
            	    // InternalChartIt.g:263:6: lv_chart_21_0= ruleChart
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getChartChartParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_chart_21_0=ruleChart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"chart",
            	    							lv_chart_21_0,
            	    							"fr.univcotedazurl3ia.project.ChartIt.Chart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_22=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_22, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_19());
            		
            otherlv_23=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_20());
            		

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleData"
    // InternalChartIt.g:293:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalChartIt.g:293:45: (iv_ruleData= ruleData EOF )
            // InternalChartIt.g:294:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalChartIt.g:300:1: ruleData returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalChartIt.g:306:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalChartIt.g:307:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalChartIt.g:307:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalChartIt.g:308:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            // InternalChartIt.g:308:3: ()
            // InternalChartIt.g:309:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataAccess().getDataAction_0(),
            					current);
            			

            }

            // InternalChartIt.g:315:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalChartIt.g:316:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalChartIt.g:316:4: (lv_name_1_0= RULE_STRING )
            // InternalChartIt.g:317:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDataAccess().getLeftParenthesisKeyword_2());
            		
            // InternalChartIt.g:337:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalChartIt.g:338:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalChartIt.g:338:4: (lv_path_3_0= RULE_STRING )
            // InternalChartIt.g:339:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_path_3_0, grammarAccess.getDataAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDataAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleChart"
    // InternalChartIt.g:363:1: entryRuleChart returns [EObject current=null] : iv_ruleChart= ruleChart EOF ;
    public final EObject entryRuleChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChart = null;


        try {
            // InternalChartIt.g:363:46: (iv_ruleChart= ruleChart EOF )
            // InternalChartIt.g:364:2: iv_ruleChart= ruleChart EOF
            {
             newCompositeNode(grammarAccess.getChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChart=ruleChart();

            state._fsp--;

             current =iv_ruleChart; 
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
    // $ANTLR end "entryRuleChart"


    // $ANTLR start "ruleChart"
    // InternalChartIt.g:370:1: ruleChart returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'data' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'type' otherlv_8= '=' ( (lv_type_9_0= ruleChartType ) ) otherlv_10= ',' otherlv_11= 'col' otherlv_12= '=' ( (otherlv_13= RULE_STRING ) ) (otherlv_14= ',' ( (otherlv_15= RULE_STRING ) ) )* otherlv_16= ',' otherlv_17= 'backgroundColor' otherlv_18= '=' ( (lv_backgroundColor_19_0= ruleColor ) ) otherlv_20= ')' ) ;
    public final EObject ruleChart() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Enumerator lv_type_9_0 = null;

        Enumerator lv_backgroundColor_19_0 = null;



        	enterRule();

        try {
            // InternalChartIt.g:376:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'data' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'type' otherlv_8= '=' ( (lv_type_9_0= ruleChartType ) ) otherlv_10= ',' otherlv_11= 'col' otherlv_12= '=' ( (otherlv_13= RULE_STRING ) ) (otherlv_14= ',' ( (otherlv_15= RULE_STRING ) ) )* otherlv_16= ',' otherlv_17= 'backgroundColor' otherlv_18= '=' ( (lv_backgroundColor_19_0= ruleColor ) ) otherlv_20= ')' ) )
            // InternalChartIt.g:377:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'data' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'type' otherlv_8= '=' ( (lv_type_9_0= ruleChartType ) ) otherlv_10= ',' otherlv_11= 'col' otherlv_12= '=' ( (otherlv_13= RULE_STRING ) ) (otherlv_14= ',' ( (otherlv_15= RULE_STRING ) ) )* otherlv_16= ',' otherlv_17= 'backgroundColor' otherlv_18= '=' ( (lv_backgroundColor_19_0= ruleColor ) ) otherlv_20= ')' )
            {
            // InternalChartIt.g:377:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'data' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'type' otherlv_8= '=' ( (lv_type_9_0= ruleChartType ) ) otherlv_10= ',' otherlv_11= 'col' otherlv_12= '=' ( (otherlv_13= RULE_STRING ) ) (otherlv_14= ',' ( (otherlv_15= RULE_STRING ) ) )* otherlv_16= ',' otherlv_17= 'backgroundColor' otherlv_18= '=' ( (lv_backgroundColor_19_0= ruleColor ) ) otherlv_20= ')' )
            // InternalChartIt.g:378:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'data' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'type' otherlv_8= '=' ( (lv_type_9_0= ruleChartType ) ) otherlv_10= ',' otherlv_11= 'col' otherlv_12= '=' ( (otherlv_13= RULE_STRING ) ) (otherlv_14= ',' ( (otherlv_15= RULE_STRING ) ) )* otherlv_16= ',' otherlv_17= 'backgroundColor' otherlv_18= '=' ( (lv_backgroundColor_19_0= ruleColor ) ) otherlv_20= ')'
            {
            // InternalChartIt.g:378:3: ()
            // InternalChartIt.g:379:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChartAccess().getChartAction_0(),
            					current);
            			

            }

            // InternalChartIt.g:385:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalChartIt.g:386:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalChartIt.g:386:4: (lv_name_1_0= RULE_STRING )
            // InternalChartIt.g:387:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChartAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getChartAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getChartAccess().getDataKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getChartAccess().getEqualsSignKeyword_4());
            		
            // InternalChartIt.g:415:3: ( (otherlv_5= RULE_STRING ) )
            // InternalChartIt.g:416:4: (otherlv_5= RULE_STRING )
            {
            // InternalChartIt.g:416:4: (otherlv_5= RULE_STRING )
            // InternalChartIt.g:417:5: otherlv_5= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChartRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(otherlv_5, grammarAccess.getChartAccess().getDataDataCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getChartAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getChartAccess().getTypeKeyword_7());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getChartAccess().getEqualsSignKeyword_8());
            		
            // InternalChartIt.g:440:3: ( (lv_type_9_0= ruleChartType ) )
            // InternalChartIt.g:441:4: (lv_type_9_0= ruleChartType )
            {
            // InternalChartIt.g:441:4: (lv_type_9_0= ruleChartType )
            // InternalChartIt.g:442:5: lv_type_9_0= ruleChartType
            {

            					newCompositeNode(grammarAccess.getChartAccess().getTypeChartTypeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_16);
            lv_type_9_0=ruleChartType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChartRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_9_0,
            						"fr.univcotedazurl3ia.project.ChartIt.ChartType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getChartAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_11, grammarAccess.getChartAccess().getColKeyword_11());
            		
            otherlv_12=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getChartAccess().getEqualsSignKeyword_12());
            		
            // InternalChartIt.g:471:3: ( (otherlv_13= RULE_STRING ) )
            // InternalChartIt.g:472:4: (otherlv_13= RULE_STRING )
            {
            // InternalChartIt.g:472:4: (otherlv_13= RULE_STRING )
            // InternalChartIt.g:473:5: otherlv_13= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChartRule());
            					}
            				
            otherlv_13=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(otherlv_13, grammarAccess.getChartAccess().getColColCrossReference_13_0());
            				

            }


            }

            // InternalChartIt.g:484:3: (otherlv_14= ',' ( (otherlv_15= RULE_STRING ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==RULE_STRING) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalChartIt.g:485:4: otherlv_14= ',' ( (otherlv_15= RULE_STRING ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_14, grammarAccess.getChartAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalChartIt.g:489:4: ( (otherlv_15= RULE_STRING ) )
            	    // InternalChartIt.g:490:5: (otherlv_15= RULE_STRING )
            	    {
            	    // InternalChartIt.g:490:5: (otherlv_15= RULE_STRING )
            	    // InternalChartIt.g:491:6: otherlv_15= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getChartRule());
            	    						}
            	    					
            	    otherlv_15=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    						newLeafNode(otherlv_15, grammarAccess.getChartAccess().getColColCrossReference_14_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_16=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_16, grammarAccess.getChartAccess().getCommaKeyword_15());
            		
            otherlv_17=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_17, grammarAccess.getChartAccess().getBackgroundColorKeyword_16());
            		
            otherlv_18=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_18, grammarAccess.getChartAccess().getEqualsSignKeyword_17());
            		
            // InternalChartIt.g:515:3: ( (lv_backgroundColor_19_0= ruleColor ) )
            // InternalChartIt.g:516:4: (lv_backgroundColor_19_0= ruleColor )
            {
            // InternalChartIt.g:516:4: (lv_backgroundColor_19_0= ruleColor )
            // InternalChartIt.g:517:5: lv_backgroundColor_19_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getChartAccess().getBackgroundColorColorEnumRuleCall_18_0());
            				
            pushFollow(FOLLOW_13);
            lv_backgroundColor_19_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChartRule());
            					}
            					set(
            						current,
            						"backgroundColor",
            						lv_backgroundColor_19_0,
            						"fr.univcotedazurl3ia.project.ChartIt.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_20=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getChartAccess().getRightParenthesisKeyword_19());
            		

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
    // $ANTLR end "ruleChart"


    // $ANTLR start "entryRuleCol"
    // InternalChartIt.g:542:1: entryRuleCol returns [EObject current=null] : iv_ruleCol= ruleCol EOF ;
    public final EObject entryRuleCol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCol = null;


        try {
            // InternalChartIt.g:542:44: (iv_ruleCol= ruleCol EOF )
            // InternalChartIt.g:543:2: iv_ruleCol= ruleCol EOF
            {
             newCompositeNode(grammarAccess.getColRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCol=ruleCol();

            state._fsp--;

             current =iv_ruleCol; 
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
    // $ANTLR end "entryRuleCol"


    // $ANTLR start "ruleCol"
    // InternalChartIt.g:549:1: ruleCol returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'label' otherlv_4= '=' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'color' otherlv_8= '=' ( (lv_color_9_0= ruleColor ) ) otherlv_10= ')' ) ;
    public final EObject ruleCol() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_label_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_color_9_0 = null;



        	enterRule();

        try {
            // InternalChartIt.g:555:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'label' otherlv_4= '=' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'color' otherlv_8= '=' ( (lv_color_9_0= ruleColor ) ) otherlv_10= ')' ) )
            // InternalChartIt.g:556:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'label' otherlv_4= '=' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'color' otherlv_8= '=' ( (lv_color_9_0= ruleColor ) ) otherlv_10= ')' )
            {
            // InternalChartIt.g:556:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'label' otherlv_4= '=' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'color' otherlv_8= '=' ( (lv_color_9_0= ruleColor ) ) otherlv_10= ')' )
            // InternalChartIt.g:557:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' otherlv_3= 'label' otherlv_4= '=' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'color' otherlv_8= '=' ( (lv_color_9_0= ruleColor ) ) otherlv_10= ')'
            {
            // InternalChartIt.g:557:3: ()
            // InternalChartIt.g:558:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColAccess().getColAction_0(),
            					current);
            			

            }

            // InternalChartIt.g:564:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalChartIt.g:565:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalChartIt.g:565:4: (lv_name_1_0= RULE_STRING )
            // InternalChartIt.g:566:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getColAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getColAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getColAccess().getLabelKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getColAccess().getEqualsSignKeyword_4());
            		
            // InternalChartIt.g:594:3: ( (lv_label_5_0= RULE_STRING ) )
            // InternalChartIt.g:595:4: (lv_label_5_0= RULE_STRING )
            {
            // InternalChartIt.g:595:4: (lv_label_5_0= RULE_STRING )
            // InternalChartIt.g:596:5: lv_label_5_0= RULE_STRING
            {
            lv_label_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_label_5_0, grammarAccess.getColAccess().getLabelSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getColAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getColAccess().getColorKeyword_7());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getColAccess().getEqualsSignKeyword_8());
            		
            // InternalChartIt.g:624:3: ( (lv_color_9_0= ruleColor ) )
            // InternalChartIt.g:625:4: (lv_color_9_0= ruleColor )
            {
            // InternalChartIt.g:625:4: (lv_color_9_0= ruleColor )
            // InternalChartIt.g:626:5: lv_color_9_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getColAccess().getColorColorEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_13);
            lv_color_9_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_9_0,
            						"fr.univcotedazurl3ia.project.ChartIt.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getColAccess().getRightParenthesisKeyword_10());
            		

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
    // $ANTLR end "ruleCol"


    // $ANTLR start "ruleColor"
    // InternalChartIt.g:651:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'Blue' ) | (enumLiteral_1= 'Red' ) | (enumLiteral_2= 'Green' ) | (enumLiteral_3= 'Orange' ) | (enumLiteral_4= 'Yellow' ) | (enumLiteral_5= 'Purple' ) | (enumLiteral_6= 'Black' ) | (enumLiteral_7= 'Brown' ) | (enumLiteral_8= 'Pink' ) | (enumLiteral_9= 'Darkgrey' ) | (enumLiteral_10= 'LightGrey' ) | (enumLiteral_11= 'White' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalChartIt.g:657:2: ( ( (enumLiteral_0= 'Blue' ) | (enumLiteral_1= 'Red' ) | (enumLiteral_2= 'Green' ) | (enumLiteral_3= 'Orange' ) | (enumLiteral_4= 'Yellow' ) | (enumLiteral_5= 'Purple' ) | (enumLiteral_6= 'Black' ) | (enumLiteral_7= 'Brown' ) | (enumLiteral_8= 'Pink' ) | (enumLiteral_9= 'Darkgrey' ) | (enumLiteral_10= 'LightGrey' ) | (enumLiteral_11= 'White' ) ) )
            // InternalChartIt.g:658:2: ( (enumLiteral_0= 'Blue' ) | (enumLiteral_1= 'Red' ) | (enumLiteral_2= 'Green' ) | (enumLiteral_3= 'Orange' ) | (enumLiteral_4= 'Yellow' ) | (enumLiteral_5= 'Purple' ) | (enumLiteral_6= 'Black' ) | (enumLiteral_7= 'Brown' ) | (enumLiteral_8= 'Pink' ) | (enumLiteral_9= 'Darkgrey' ) | (enumLiteral_10= 'LightGrey' ) | (enumLiteral_11= 'White' ) )
            {
            // InternalChartIt.g:658:2: ( (enumLiteral_0= 'Blue' ) | (enumLiteral_1= 'Red' ) | (enumLiteral_2= 'Green' ) | (enumLiteral_3= 'Orange' ) | (enumLiteral_4= 'Yellow' ) | (enumLiteral_5= 'Purple' ) | (enumLiteral_6= 'Black' ) | (enumLiteral_7= 'Brown' ) | (enumLiteral_8= 'Pink' ) | (enumLiteral_9= 'Darkgrey' ) | (enumLiteral_10= 'LightGrey' ) | (enumLiteral_11= 'White' ) )
            int alt8=12;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                alt8=3;
                }
                break;
            case 30:
                {
                alt8=4;
                }
                break;
            case 31:
                {
                alt8=5;
                }
                break;
            case 32:
                {
                alt8=6;
                }
                break;
            case 33:
                {
                alt8=7;
                }
                break;
            case 34:
                {
                alt8=8;
                }
                break;
            case 35:
                {
                alt8=9;
                }
                break;
            case 36:
                {
                alt8=10;
                }
                break;
            case 37:
                {
                alt8=11;
                }
                break;
            case 38:
                {
                alt8=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalChartIt.g:659:3: (enumLiteral_0= 'Blue' )
                    {
                    // InternalChartIt.g:659:3: (enumLiteral_0= 'Blue' )
                    // InternalChartIt.g:660:4: enumLiteral_0= 'Blue'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChartIt.g:667:3: (enumLiteral_1= 'Red' )
                    {
                    // InternalChartIt.g:667:3: (enumLiteral_1= 'Red' )
                    // InternalChartIt.g:668:4: enumLiteral_1= 'Red'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalChartIt.g:675:3: (enumLiteral_2= 'Green' )
                    {
                    // InternalChartIt.g:675:3: (enumLiteral_2= 'Green' )
                    // InternalChartIt.g:676:4: enumLiteral_2= 'Green'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalChartIt.g:683:3: (enumLiteral_3= 'Orange' )
                    {
                    // InternalChartIt.g:683:3: (enumLiteral_3= 'Orange' )
                    // InternalChartIt.g:684:4: enumLiteral_3= 'Orange'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getOrangeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getOrangeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalChartIt.g:691:3: (enumLiteral_4= 'Yellow' )
                    {
                    // InternalChartIt.g:691:3: (enumLiteral_4= 'Yellow' )
                    // InternalChartIt.g:692:4: enumLiteral_4= 'Yellow'
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalChartIt.g:699:3: (enumLiteral_5= 'Purple' )
                    {
                    // InternalChartIt.g:699:3: (enumLiteral_5= 'Purple' )
                    // InternalChartIt.g:700:4: enumLiteral_5= 'Purple'
                    {
                    enumLiteral_5=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalChartIt.g:707:3: (enumLiteral_6= 'Black' )
                    {
                    // InternalChartIt.g:707:3: (enumLiteral_6= 'Black' )
                    // InternalChartIt.g:708:4: enumLiteral_6= 'Black'
                    {
                    enumLiteral_6=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalChartIt.g:715:3: (enumLiteral_7= 'Brown' )
                    {
                    // InternalChartIt.g:715:3: (enumLiteral_7= 'Brown' )
                    // InternalChartIt.g:716:4: enumLiteral_7= 'Brown'
                    {
                    enumLiteral_7=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBrownEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getColorAccess().getBrownEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalChartIt.g:723:3: (enumLiteral_8= 'Pink' )
                    {
                    // InternalChartIt.g:723:3: (enumLiteral_8= 'Pink' )
                    // InternalChartIt.g:724:4: enumLiteral_8= 'Pink'
                    {
                    enumLiteral_8=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getPinkEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getColorAccess().getPinkEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalChartIt.g:731:3: (enumLiteral_9= 'Darkgrey' )
                    {
                    // InternalChartIt.g:731:3: (enumLiteral_9= 'Darkgrey' )
                    // InternalChartIt.g:732:4: enumLiteral_9= 'Darkgrey'
                    {
                    enumLiteral_9=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getDarkGreyEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getColorAccess().getDarkGreyEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalChartIt.g:739:3: (enumLiteral_10= 'LightGrey' )
                    {
                    // InternalChartIt.g:739:3: (enumLiteral_10= 'LightGrey' )
                    // InternalChartIt.g:740:4: enumLiteral_10= 'LightGrey'
                    {
                    enumLiteral_10=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getLightGreyEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getColorAccess().getLightGreyEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalChartIt.g:747:3: (enumLiteral_11= 'White' )
                    {
                    // InternalChartIt.g:747:3: (enumLiteral_11= 'White' )
                    // InternalChartIt.g:748:4: enumLiteral_11= 'White'
                    {
                    enumLiteral_11=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleChartType"
    // InternalChartIt.g:758:1: ruleChartType returns [Enumerator current=null] : ( (enumLiteral_0= 'Pie' ) | (enumLiteral_1= 'Bar' ) | (enumLiteral_2= 'Area' ) | (enumLiteral_3= 'Bubble' ) | (enumLiteral_4= 'Line' ) ) ;
    public final Enumerator ruleChartType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalChartIt.g:764:2: ( ( (enumLiteral_0= 'Pie' ) | (enumLiteral_1= 'Bar' ) | (enumLiteral_2= 'Area' ) | (enumLiteral_3= 'Bubble' ) | (enumLiteral_4= 'Line' ) ) )
            // InternalChartIt.g:765:2: ( (enumLiteral_0= 'Pie' ) | (enumLiteral_1= 'Bar' ) | (enumLiteral_2= 'Area' ) | (enumLiteral_3= 'Bubble' ) | (enumLiteral_4= 'Line' ) )
            {
            // InternalChartIt.g:765:2: ( (enumLiteral_0= 'Pie' ) | (enumLiteral_1= 'Bar' ) | (enumLiteral_2= 'Area' ) | (enumLiteral_3= 'Bubble' ) | (enumLiteral_4= 'Line' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 40:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            case 42:
                {
                alt9=4;
                }
                break;
            case 43:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalChartIt.g:766:3: (enumLiteral_0= 'Pie' )
                    {
                    // InternalChartIt.g:766:3: (enumLiteral_0= 'Pie' )
                    // InternalChartIt.g:767:4: enumLiteral_0= 'Pie'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getPieEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getChartTypeAccess().getPieEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChartIt.g:774:3: (enumLiteral_1= 'Bar' )
                    {
                    // InternalChartIt.g:774:3: (enumLiteral_1= 'Bar' )
                    // InternalChartIt.g:775:4: enumLiteral_1= 'Bar'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getBarEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getChartTypeAccess().getBarEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalChartIt.g:782:3: (enumLiteral_2= 'Area' )
                    {
                    // InternalChartIt.g:782:3: (enumLiteral_2= 'Area' )
                    // InternalChartIt.g:783:4: enumLiteral_2= 'Area'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getAreaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getChartTypeAccess().getAreaEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalChartIt.g:790:3: (enumLiteral_3= 'Bubble' )
                    {
                    // InternalChartIt.g:790:3: (enumLiteral_3= 'Bubble' )
                    // InternalChartIt.g:791:4: enumLiteral_3= 'Bubble'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getBubbleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getChartTypeAccess().getBubbleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalChartIt.g:798:3: (enumLiteral_4= 'Line' )
                    {
                    // InternalChartIt.g:798:3: (enumLiteral_4= 'Line' )
                    // InternalChartIt.g:799:4: enumLiteral_4= 'Line'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getChartTypeAccess().getLineEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getChartTypeAccess().getLineEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleChartType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000F8000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000007FF8000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});

}