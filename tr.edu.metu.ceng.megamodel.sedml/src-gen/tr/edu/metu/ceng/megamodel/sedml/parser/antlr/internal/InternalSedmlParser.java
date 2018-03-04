package tr.edu.metu.ceng.megamodel.sedml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tr.edu.metu.ceng.megamodel.sedml.services.SedmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSedmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'listOfModels'", "'{'", "'}'", "'model'", "'id'", "':'", "'language'", "'source'", "'name'", "'listOfTasks'", "'task'", "'modelReference'", "'simulationReference'", "'listOfDataGenerators'", "'dataGenerator'", "'listOfDataVariables'", "'variable'", "'target'", "'taskReference'", "'symbol'", "'math'", "'xlms'", "'listOfOutputs'", "'plot2D'", "'listOfCurves'", "'curve'", "'logX'", "'logY'", "'xDataReference'", "'yDataReference'", "'listOfSimulations'", "'uniformtimecourse'", "'initialTime'", "'outputStartTime'", "'outputEndTime'", "'numberOfPoints'", "'algorithm'", "'kisaoID'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
    public static final int T__48=48;
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


        public InternalSedmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSedmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSedmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSedml.g"; }



     	private SedmlGrammarAccess grammarAccess;

        public InternalSedmlParser(TokenStream input, SedmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "sedML";
       	}

       	@Override
       	protected SedmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulesedML"
    // InternalSedml.g:64:1: entryRulesedML returns [EObject current=null] : iv_rulesedML= rulesedML EOF ;
    public final EObject entryRulesedML() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesedML = null;


        try {
            // InternalSedml.g:64:46: (iv_rulesedML= rulesedML EOF )
            // InternalSedml.g:65:2: iv_rulesedML= rulesedML EOF
            {
             newCompositeNode(grammarAccess.getSedMLRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesedML=rulesedML();

            state._fsp--;

             current =iv_rulesedML; 
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
    // $ANTLR end "entryRulesedML"


    // $ANTLR start "rulesedML"
    // InternalSedml.g:71:1: rulesedML returns [EObject current=null] : ( ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfSimulations_2_0= rulelistOfSimulations ) ) ( (lv_listOfModels_3_0= rulelistOfModels ) ) ( (lv_listOfTasks_4_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_5_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_6_0= rulelistOfOutputs ) ) ) ;
    public final EObject rulesedML() throws RecognitionException {
        EObject current = null;

        Token lv_version_0_0=null;
        Token lv_level_1_0=null;
        EObject lv_listOfSimulations_2_0 = null;

        EObject lv_listOfModels_3_0 = null;

        EObject lv_listOfTasks_4_0 = null;

        EObject lv_listOfDataGenerators_5_0 = null;

        EObject lv_listOfOutputs_6_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:77:2: ( ( ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfSimulations_2_0= rulelistOfSimulations ) ) ( (lv_listOfModels_3_0= rulelistOfModels ) ) ( (lv_listOfTasks_4_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_5_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_6_0= rulelistOfOutputs ) ) ) )
            // InternalSedml.g:78:2: ( ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfSimulations_2_0= rulelistOfSimulations ) ) ( (lv_listOfModels_3_0= rulelistOfModels ) ) ( (lv_listOfTasks_4_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_5_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_6_0= rulelistOfOutputs ) ) )
            {
            // InternalSedml.g:78:2: ( ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfSimulations_2_0= rulelistOfSimulations ) ) ( (lv_listOfModels_3_0= rulelistOfModels ) ) ( (lv_listOfTasks_4_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_5_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_6_0= rulelistOfOutputs ) ) )
            // InternalSedml.g:79:3: ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfSimulations_2_0= rulelistOfSimulations ) ) ( (lv_listOfModels_3_0= rulelistOfModels ) ) ( (lv_listOfTasks_4_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_5_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_6_0= rulelistOfOutputs ) )
            {
            // InternalSedml.g:79:3: ( (lv_version_0_0= RULE_INT ) )
            // InternalSedml.g:80:4: (lv_version_0_0= RULE_INT )
            {
            // InternalSedml.g:80:4: (lv_version_0_0= RULE_INT )
            // InternalSedml.g:81:5: lv_version_0_0= RULE_INT
            {
            lv_version_0_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_version_0_0, grammarAccess.getSedMLAccess().getVersionINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSedMLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSedml.g:97:3: ( (lv_level_1_0= RULE_INT ) )
            // InternalSedml.g:98:4: (lv_level_1_0= RULE_INT )
            {
            // InternalSedml.g:98:4: (lv_level_1_0= RULE_INT )
            // InternalSedml.g:99:5: lv_level_1_0= RULE_INT
            {
            lv_level_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_level_1_0, grammarAccess.getSedMLAccess().getLevelINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSedMLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"level",
            						lv_level_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSedml.g:115:3: ( (lv_listOfSimulations_2_0= rulelistOfSimulations ) )
            // InternalSedml.g:116:4: (lv_listOfSimulations_2_0= rulelistOfSimulations )
            {
            // InternalSedml.g:116:4: (lv_listOfSimulations_2_0= rulelistOfSimulations )
            // InternalSedml.g:117:5: lv_listOfSimulations_2_0= rulelistOfSimulations
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfSimulationsListOfSimulationsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_listOfSimulations_2_0=rulelistOfSimulations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfSimulations",
            						lv_listOfSimulations_2_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfSimulations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:134:3: ( (lv_listOfModels_3_0= rulelistOfModels ) )
            // InternalSedml.g:135:4: (lv_listOfModels_3_0= rulelistOfModels )
            {
            // InternalSedml.g:135:4: (lv_listOfModels_3_0= rulelistOfModels )
            // InternalSedml.g:136:5: lv_listOfModels_3_0= rulelistOfModels
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfModelsListOfModelsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_listOfModels_3_0=rulelistOfModels();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfModels",
            						lv_listOfModels_3_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfModels");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:153:3: ( (lv_listOfTasks_4_0= rulelistOfTasks ) )
            // InternalSedml.g:154:4: (lv_listOfTasks_4_0= rulelistOfTasks )
            {
            // InternalSedml.g:154:4: (lv_listOfTasks_4_0= rulelistOfTasks )
            // InternalSedml.g:155:5: lv_listOfTasks_4_0= rulelistOfTasks
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfTasksListOfTasksParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_listOfTasks_4_0=rulelistOfTasks();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfTasks",
            						lv_listOfTasks_4_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfTasks");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:172:3: ( (lv_listOfDataGenerators_5_0= rulelistOfDataGenerators ) )
            // InternalSedml.g:173:4: (lv_listOfDataGenerators_5_0= rulelistOfDataGenerators )
            {
            // InternalSedml.g:173:4: (lv_listOfDataGenerators_5_0= rulelistOfDataGenerators )
            // InternalSedml.g:174:5: lv_listOfDataGenerators_5_0= rulelistOfDataGenerators
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfDataGeneratorsListOfDataGeneratorsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_listOfDataGenerators_5_0=rulelistOfDataGenerators();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfDataGenerators",
            						lv_listOfDataGenerators_5_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfDataGenerators");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:191:3: ( (lv_listOfOutputs_6_0= rulelistOfOutputs ) )
            // InternalSedml.g:192:4: (lv_listOfOutputs_6_0= rulelistOfOutputs )
            {
            // InternalSedml.g:192:4: (lv_listOfOutputs_6_0= rulelistOfOutputs )
            // InternalSedml.g:193:5: lv_listOfOutputs_6_0= rulelistOfOutputs
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfOutputsListOfOutputsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_listOfOutputs_6_0=rulelistOfOutputs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfOutputs",
            						lv_listOfOutputs_6_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfOutputs");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "rulesedML"


    // $ANTLR start "entryRulelistOfModels"
    // InternalSedml.g:214:1: entryRulelistOfModels returns [EObject current=null] : iv_rulelistOfModels= rulelistOfModels EOF ;
    public final EObject entryRulelistOfModels() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfModels = null;


        try {
            // InternalSedml.g:214:53: (iv_rulelistOfModels= rulelistOfModels EOF )
            // InternalSedml.g:215:2: iv_rulelistOfModels= rulelistOfModels EOF
            {
             newCompositeNode(grammarAccess.getListOfModelsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfModels=rulelistOfModels();

            state._fsp--;

             current =iv_rulelistOfModels; 
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
    // $ANTLR end "entryRulelistOfModels"


    // $ANTLR start "rulelistOfModels"
    // InternalSedml.g:221:1: rulelistOfModels returns [EObject current=null] : (otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfModels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_model_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:227:2: ( (otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}' ) )
            // InternalSedml.g:228:2: (otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:228:2: (otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}' )
            // InternalSedml.g:229:3: otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfModelsAccess().getListOfModelsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfModelsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:237:3: ( (lv_model_2_0= rulemodel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSedml.g:238:4: (lv_model_2_0= rulemodel )
            	    {
            	    // InternalSedml.g:238:4: (lv_model_2_0= rulemodel )
            	    // InternalSedml.g:239:5: lv_model_2_0= rulemodel
            	    {

            	    					newCompositeNode(grammarAccess.getListOfModelsAccess().getModelModelParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_model_2_0=rulemodel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfModelsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"model",
            	    						lv_model_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.model");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfModelsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfModels"


    // $ANTLR start "entryRulemodel"
    // InternalSedml.g:264:1: entryRulemodel returns [EObject current=null] : iv_rulemodel= rulemodel EOF ;
    public final EObject entryRulemodel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemodel = null;


        try {
            // InternalSedml.g:264:46: (iv_rulemodel= rulemodel EOF )
            // InternalSedml.g:265:2: iv_rulemodel= rulemodel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemodel=rulemodel();

            state._fsp--;

             current =iv_rulemodel; 
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
    // $ANTLR end "entryRulemodel"


    // $ANTLR start "rulemodel"
    // InternalSedml.g:271:1: rulemodel returns [EObject current=null] : (otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' ) ;
    public final EObject rulemodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_language_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_source_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_name_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalSedml.g:277:2: ( (otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' ) )
            // InternalSedml.g:278:2: (otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' )
            {
            // InternalSedml.g:278:2: (otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' )
            // InternalSedml.g:279:3: otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getColonKeyword_3());
            		
            // InternalSedml.g:295:3: ( (lv_id_4_0= RULE_STRING ) )
            // InternalSedml.g:296:4: (lv_id_4_0= RULE_STRING )
            {
            // InternalSedml.g:296:4: (lv_id_4_0= RULE_STRING )
            // InternalSedml.g:297:5: lv_id_4_0= RULE_STRING
            {
            lv_id_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_id_4_0, grammarAccess.getModelAccess().getIdSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLanguageKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getColonKeyword_6());
            		
            // InternalSedml.g:321:3: ( (lv_language_7_0= RULE_STRING ) )
            // InternalSedml.g:322:4: (lv_language_7_0= RULE_STRING )
            {
            // InternalSedml.g:322:4: (lv_language_7_0= RULE_STRING )
            // InternalSedml.g:323:5: lv_language_7_0= RULE_STRING
            {
            lv_language_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_language_7_0, grammarAccess.getModelAccess().getLanguageSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getSourceKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getColonKeyword_9());
            		
            // InternalSedml.g:347:3: ( (lv_source_10_0= RULE_STRING ) )
            // InternalSedml.g:348:4: (lv_source_10_0= RULE_STRING )
            {
            // InternalSedml.g:348:4: (lv_source_10_0= RULE_STRING )
            // InternalSedml.g:349:5: lv_source_10_0= RULE_STRING
            {
            lv_source_10_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_source_10_0, grammarAccess.getModelAccess().getSourceSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getModelAccess().getNameKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getModelAccess().getColonKeyword_12());
            		
            // InternalSedml.g:373:3: ( (lv_name_13_0= RULE_STRING ) )
            // InternalSedml.g:374:4: (lv_name_13_0= RULE_STRING )
            {
            // InternalSedml.g:374:4: (lv_name_13_0= RULE_STRING )
            // InternalSedml.g:375:5: lv_name_13_0= RULE_STRING
            {
            lv_name_13_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_name_13_0, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "rulemodel"


    // $ANTLR start "entryRulelistOfTasks"
    // InternalSedml.g:399:1: entryRulelistOfTasks returns [EObject current=null] : iv_rulelistOfTasks= rulelistOfTasks EOF ;
    public final EObject entryRulelistOfTasks() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfTasks = null;


        try {
            // InternalSedml.g:399:52: (iv_rulelistOfTasks= rulelistOfTasks EOF )
            // InternalSedml.g:400:2: iv_rulelistOfTasks= rulelistOfTasks EOF
            {
             newCompositeNode(grammarAccess.getListOfTasksRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfTasks=rulelistOfTasks();

            state._fsp--;

             current =iv_rulelistOfTasks; 
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
    // $ANTLR end "entryRulelistOfTasks"


    // $ANTLR start "rulelistOfTasks"
    // InternalSedml.g:406:1: rulelistOfTasks returns [EObject current=null] : (otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfTasks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_task_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:412:2: ( (otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* otherlv_3= '}' ) )
            // InternalSedml.g:413:2: (otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:413:2: (otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* otherlv_3= '}' )
            // InternalSedml.g:414:3: otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfTasksAccess().getListOfTasksKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfTasksAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:422:3: ( (lv_task_2_0= ruletask ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSedml.g:423:4: (lv_task_2_0= ruletask )
            	    {
            	    // InternalSedml.g:423:4: (lv_task_2_0= ruletask )
            	    // InternalSedml.g:424:5: lv_task_2_0= ruletask
            	    {

            	    					newCompositeNode(grammarAccess.getListOfTasksAccess().getTaskTaskParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_task_2_0=ruletask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfTasksRule());
            	    					}
            	    					add(
            	    						current,
            	    						"task",
            	    						lv_task_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfTasksAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfTasks"


    // $ANTLR start "entryRuletask"
    // InternalSedml.g:449:1: entryRuletask returns [EObject current=null] : iv_ruletask= ruletask EOF ;
    public final EObject entryRuletask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletask = null;


        try {
            // InternalSedml.g:449:45: (iv_ruletask= ruletask EOF )
            // InternalSedml.g:450:2: iv_ruletask= ruletask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletask=ruletask();

            state._fsp--;

             current =iv_ruletask; 
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
    // $ANTLR end "entryRuletask"


    // $ANTLR start "ruletask"
    // InternalSedml.g:456:1: ruletask returns [EObject current=null] : (otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' ) ;
    public final EObject ruletask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_name_13_0=null;
        Token otherlv_14=null;
        EObject lv_modelReference_7_0 = null;

        EObject lv_simulationReference_10_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:462:2: ( (otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' ) )
            // InternalSedml.g:463:2: (otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' )
            {
            // InternalSedml.g:463:2: (otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' )
            // InternalSedml.g:464:3: otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getColonKeyword_3());
            		
            // InternalSedml.g:480:3: ( (lv_id_4_0= RULE_STRING ) )
            // InternalSedml.g:481:4: (lv_id_4_0= RULE_STRING )
            {
            // InternalSedml.g:481:4: (lv_id_4_0= RULE_STRING )
            // InternalSedml.g:482:5: lv_id_4_0= RULE_STRING
            {
            lv_id_4_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_id_4_0, grammarAccess.getTaskAccess().getIdSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getModelReferenceKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getColonKeyword_6());
            		
            // InternalSedml.g:506:3: ( (lv_modelReference_7_0= rulemodel ) )
            // InternalSedml.g:507:4: (lv_modelReference_7_0= rulemodel )
            {
            // InternalSedml.g:507:4: (lv_modelReference_7_0= rulemodel )
            // InternalSedml.g:508:5: lv_modelReference_7_0= rulemodel
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getModelReferenceModelParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
            lv_modelReference_7_0=rulemodel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"modelReference",
            						lv_modelReference_7_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.model");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getSimulationReferenceKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getColonKeyword_9());
            		
            // InternalSedml.g:533:3: ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) )
            // InternalSedml.g:534:4: (lv_simulationReference_10_0= ruleuniformTimeCourse )
            {
            // InternalSedml.g:534:4: (lv_simulationReference_10_0= ruleuniformTimeCourse )
            // InternalSedml.g:535:5: lv_simulationReference_10_0= ruleuniformTimeCourse
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getSimulationReferenceUniformTimeCourseParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_16);
            lv_simulationReference_10_0=ruleuniformTimeCourse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"simulationReference",
            						lv_simulationReference_10_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.uniformTimeCourse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getNameKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getColonKeyword_12());
            		
            // InternalSedml.g:560:3: ( (lv_name_13_0= RULE_STRING ) )
            // InternalSedml.g:561:4: (lv_name_13_0= RULE_STRING )
            {
            // InternalSedml.g:561:4: (lv_name_13_0= RULE_STRING )
            // InternalSedml.g:562:5: lv_name_13_0= RULE_STRING
            {
            lv_name_13_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_name_13_0, grammarAccess.getTaskAccess().getNameSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruletask"


    // $ANTLR start "entryRulelistOfDataGenerators"
    // InternalSedml.g:586:1: entryRulelistOfDataGenerators returns [EObject current=null] : iv_rulelistOfDataGenerators= rulelistOfDataGenerators EOF ;
    public final EObject entryRulelistOfDataGenerators() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfDataGenerators = null;


        try {
            // InternalSedml.g:586:61: (iv_rulelistOfDataGenerators= rulelistOfDataGenerators EOF )
            // InternalSedml.g:587:2: iv_rulelistOfDataGenerators= rulelistOfDataGenerators EOF
            {
             newCompositeNode(grammarAccess.getListOfDataGeneratorsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfDataGenerators=rulelistOfDataGenerators();

            state._fsp--;

             current =iv_rulelistOfDataGenerators; 
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
    // $ANTLR end "entryRulelistOfDataGenerators"


    // $ANTLR start "rulelistOfDataGenerators"
    // InternalSedml.g:593:1: rulelistOfDataGenerators returns [EObject current=null] : (otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfDataGenerators() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_datagenerator_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:599:2: ( (otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}' ) )
            // InternalSedml.g:600:2: (otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:600:2: (otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}' )
            // InternalSedml.g:601:3: otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfDataGeneratorsAccess().getListOfDataGeneratorsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfDataGeneratorsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:609:3: ( (lv_datagenerator_2_0= ruledataGenerator ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSedml.g:610:4: (lv_datagenerator_2_0= ruledataGenerator )
            	    {
            	    // InternalSedml.g:610:4: (lv_datagenerator_2_0= ruledataGenerator )
            	    // InternalSedml.g:611:5: lv_datagenerator_2_0= ruledataGenerator
            	    {

            	    					newCompositeNode(grammarAccess.getListOfDataGeneratorsAccess().getDatageneratorDataGeneratorParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_datagenerator_2_0=ruledataGenerator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfDataGeneratorsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"datagenerator",
            	    						lv_datagenerator_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.dataGenerator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfDataGeneratorsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfDataGenerators"


    // $ANTLR start "entryRuledataGenerator"
    // InternalSedml.g:636:1: entryRuledataGenerator returns [EObject current=null] : iv_ruledataGenerator= ruledataGenerator EOF ;
    public final EObject entryRuledataGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledataGenerator = null;


        try {
            // InternalSedml.g:636:54: (iv_ruledataGenerator= ruledataGenerator EOF )
            // InternalSedml.g:637:2: iv_ruledataGenerator= ruledataGenerator EOF
            {
             newCompositeNode(grammarAccess.getDataGeneratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledataGenerator=ruledataGenerator();

            state._fsp--;

             current =iv_ruledataGenerator; 
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
    // $ANTLR end "entryRuledataGenerator"


    // $ANTLR start "ruledataGenerator"
    // InternalSedml.g:643:1: ruledataGenerator returns [EObject current=null] : (otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) ) ( (lv_math_6_0= rulemath ) ) otherlv_7= 'name' otherlv_8= ':' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= '}' ) ;
    public final EObject ruledataGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        EObject lv_listOfVariables_5_0 = null;

        EObject lv_math_6_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:649:2: ( (otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) ) ( (lv_math_6_0= rulemath ) ) otherlv_7= 'name' otherlv_8= ':' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= '}' ) )
            // InternalSedml.g:650:2: (otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) ) ( (lv_math_6_0= rulemath ) ) otherlv_7= 'name' otherlv_8= ':' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= '}' )
            {
            // InternalSedml.g:650:2: (otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) ) ( (lv_math_6_0= rulemath ) ) otherlv_7= 'name' otherlv_8= ':' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= '}' )
            // InternalSedml.g:651:3: otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) ) ( (lv_math_6_0= rulemath ) ) otherlv_7= 'name' otherlv_8= ':' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDataGeneratorAccess().getDataGeneratorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDataGeneratorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDataGeneratorAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getDataGeneratorAccess().getColonKeyword_3());
            		
            // InternalSedml.g:667:3: ( (lv_id_4_0= RULE_STRING ) )
            // InternalSedml.g:668:4: (lv_id_4_0= RULE_STRING )
            {
            // InternalSedml.g:668:4: (lv_id_4_0= RULE_STRING )
            // InternalSedml.g:669:5: lv_id_4_0= RULE_STRING
            {
            lv_id_4_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_id_4_0, grammarAccess.getDataGeneratorAccess().getIdSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataGeneratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSedml.g:685:3: ( (lv_listOfVariables_5_0= rulelistOfVariables ) )
            // InternalSedml.g:686:4: (lv_listOfVariables_5_0= rulelistOfVariables )
            {
            // InternalSedml.g:686:4: (lv_listOfVariables_5_0= rulelistOfVariables )
            // InternalSedml.g:687:5: lv_listOfVariables_5_0= rulelistOfVariables
            {

            					newCompositeNode(grammarAccess.getDataGeneratorAccess().getListOfVariablesListOfVariablesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_listOfVariables_5_0=rulelistOfVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataGeneratorRule());
            					}
            					set(
            						current,
            						"listOfVariables",
            						lv_listOfVariables_5_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfVariables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:704:3: ( (lv_math_6_0= rulemath ) )
            // InternalSedml.g:705:4: (lv_math_6_0= rulemath )
            {
            // InternalSedml.g:705:4: (lv_math_6_0= rulemath )
            // InternalSedml.g:706:5: lv_math_6_0= rulemath
            {

            					newCompositeNode(grammarAccess.getDataGeneratorAccess().getMathMathParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_math_6_0=rulemath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataGeneratorRule());
            					}
            					set(
            						current,
            						"math",
            						lv_math_6_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.math");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getDataGeneratorAccess().getNameKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getDataGeneratorAccess().getColonKeyword_8());
            		
            // InternalSedml.g:731:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalSedml.g:732:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalSedml.g:732:4: (lv_name_9_0= RULE_STRING )
            // InternalSedml.g:733:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_name_9_0, grammarAccess.getDataGeneratorAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataGeneratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDataGeneratorAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruledataGenerator"


    // $ANTLR start "entryRulelistOfVariables"
    // InternalSedml.g:757:1: entryRulelistOfVariables returns [EObject current=null] : iv_rulelistOfVariables= rulelistOfVariables EOF ;
    public final EObject entryRulelistOfVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfVariables = null;


        try {
            // InternalSedml.g:757:56: (iv_rulelistOfVariables= rulelistOfVariables EOF )
            // InternalSedml.g:758:2: iv_rulelistOfVariables= rulelistOfVariables EOF
            {
             newCompositeNode(grammarAccess.getListOfVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfVariables=rulelistOfVariables();

            state._fsp--;

             current =iv_rulelistOfVariables; 
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
    // $ANTLR end "entryRulelistOfVariables"


    // $ANTLR start "rulelistOfVariables"
    // InternalSedml.g:764:1: rulelistOfVariables returns [EObject current=null] : (otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:770:2: ( (otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}' ) )
            // InternalSedml.g:771:2: (otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:771:2: (otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}' )
            // InternalSedml.g:772:3: otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfVariablesAccess().getListOfDataVariablesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfVariablesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:780:3: ( (lv_variable_2_0= rulevariable ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSedml.g:781:4: (lv_variable_2_0= rulevariable )
            	    {
            	    // InternalSedml.g:781:4: (lv_variable_2_0= rulevariable )
            	    // InternalSedml.g:782:5: lv_variable_2_0= rulevariable
            	    {

            	    					newCompositeNode(grammarAccess.getListOfVariablesAccess().getVariableVariableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_variable_2_0=rulevariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfVariablesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variable",
            	    						lv_variable_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfVariablesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfVariables"


    // $ANTLR start "entryRulevariable"
    // InternalSedml.g:807:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalSedml.g:807:49: (iv_rulevariable= rulevariable EOF )
            // InternalSedml.g:808:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable; 
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
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalSedml.g:814:1: rulevariable returns [EObject current=null] : (otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'target' otherlv_6= ':' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= 'taskReference' otherlv_9= ':' ( (lv_taskReference_10_0= ruletask ) ) otherlv_11= 'symbol' otherlv_12= ':' ( (lv_symbol_13_0= RULE_STRING ) ) otherlv_14= '}' ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_target_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_symbol_13_0=null;
        Token otherlv_14=null;
        EObject lv_taskReference_10_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:820:2: ( (otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'target' otherlv_6= ':' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= 'taskReference' otherlv_9= ':' ( (lv_taskReference_10_0= ruletask ) ) otherlv_11= 'symbol' otherlv_12= ':' ( (lv_symbol_13_0= RULE_STRING ) ) otherlv_14= '}' ) )
            // InternalSedml.g:821:2: (otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'target' otherlv_6= ':' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= 'taskReference' otherlv_9= ':' ( (lv_taskReference_10_0= ruletask ) ) otherlv_11= 'symbol' otherlv_12= ':' ( (lv_symbol_13_0= RULE_STRING ) ) otherlv_14= '}' )
            {
            // InternalSedml.g:821:2: (otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'target' otherlv_6= ':' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= 'taskReference' otherlv_9= ':' ( (lv_taskReference_10_0= ruletask ) ) otherlv_11= 'symbol' otherlv_12= ':' ( (lv_symbol_13_0= RULE_STRING ) ) otherlv_14= '}' )
            // InternalSedml.g:822:3: otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'target' otherlv_6= ':' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= 'taskReference' otherlv_9= ':' ( (lv_taskReference_10_0= ruletask ) ) otherlv_11= 'symbol' otherlv_12= ':' ( (lv_symbol_13_0= RULE_STRING ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getColonKeyword_3());
            		
            // InternalSedml.g:838:3: ( (lv_id_4_0= RULE_STRING ) )
            // InternalSedml.g:839:4: (lv_id_4_0= RULE_STRING )
            {
            // InternalSedml.g:839:4: (lv_id_4_0= RULE_STRING )
            // InternalSedml.g:840:5: lv_id_4_0= RULE_STRING
            {
            lv_id_4_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_id_4_0, grammarAccess.getVariableAccess().getIdSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getTargetKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getColonKeyword_6());
            		
            // InternalSedml.g:864:3: ( (lv_target_7_0= RULE_STRING ) )
            // InternalSedml.g:865:4: (lv_target_7_0= RULE_STRING )
            {
            // InternalSedml.g:865:4: (lv_target_7_0= RULE_STRING )
            // InternalSedml.g:866:5: lv_target_7_0= RULE_STRING
            {
            lv_target_7_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_target_7_0, grammarAccess.getVariableAccess().getTargetSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getTaskReferenceKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getColonKeyword_9());
            		
            // InternalSedml.g:890:3: ( (lv_taskReference_10_0= ruletask ) )
            // InternalSedml.g:891:4: (lv_taskReference_10_0= ruletask )
            {
            // InternalSedml.g:891:4: (lv_taskReference_10_0= ruletask )
            // InternalSedml.g:892:5: lv_taskReference_10_0= ruletask
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTaskReferenceTaskParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_30);
            lv_taskReference_10_0=ruletask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"taskReference",
            						lv_taskReference_10_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.task");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getVariableAccess().getSymbolKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getColonKeyword_12());
            		
            // InternalSedml.g:917:3: ( (lv_symbol_13_0= RULE_STRING ) )
            // InternalSedml.g:918:4: (lv_symbol_13_0= RULE_STRING )
            {
            // InternalSedml.g:918:4: (lv_symbol_13_0= RULE_STRING )
            // InternalSedml.g:919:5: lv_symbol_13_0= RULE_STRING
            {
            lv_symbol_13_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_symbol_13_0, grammarAccess.getVariableAccess().getSymbolSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"symbol",
            						lv_symbol_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRulemath"
    // InternalSedml.g:943:1: entryRulemath returns [EObject current=null] : iv_rulemath= rulemath EOF ;
    public final EObject entryRulemath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemath = null;


        try {
            // InternalSedml.g:943:45: (iv_rulemath= rulemath EOF )
            // InternalSedml.g:944:2: iv_rulemath= rulemath EOF
            {
             newCompositeNode(grammarAccess.getMathRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemath=rulemath();

            state._fsp--;

             current =iv_rulemath; 
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
    // $ANTLR end "entryRulemath"


    // $ANTLR start "rulemath"
    // InternalSedml.g:950:1: rulemath returns [EObject current=null] : (otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject rulemath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_xlms_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSedml.g:956:2: ( (otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalSedml.g:957:2: (otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalSedml.g:957:2: (otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalSedml.g:958:3: otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMathAccess().getMathKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getMathAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getMathAccess().getXlmsKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getMathAccess().getColonKeyword_3());
            		
            // InternalSedml.g:974:3: ( (lv_xlms_4_0= RULE_STRING ) )
            // InternalSedml.g:975:4: (lv_xlms_4_0= RULE_STRING )
            {
            // InternalSedml.g:975:4: (lv_xlms_4_0= RULE_STRING )
            // InternalSedml.g:976:5: lv_xlms_4_0= RULE_STRING
            {
            lv_xlms_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_xlms_4_0, grammarAccess.getMathAccess().getXlmsSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathRule());
            					}
            					setWithLastConsumed(
            						current,
            						"xlms",
            						lv_xlms_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMathAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulemath"


    // $ANTLR start "entryRulelistOfOutputs"
    // InternalSedml.g:1000:1: entryRulelistOfOutputs returns [EObject current=null] : iv_rulelistOfOutputs= rulelistOfOutputs EOF ;
    public final EObject entryRulelistOfOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfOutputs = null;


        try {
            // InternalSedml.g:1000:54: (iv_rulelistOfOutputs= rulelistOfOutputs EOF )
            // InternalSedml.g:1001:2: iv_rulelistOfOutputs= rulelistOfOutputs EOF
            {
             newCompositeNode(grammarAccess.getListOfOutputsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfOutputs=rulelistOfOutputs();

            state._fsp--;

             current =iv_rulelistOfOutputs; 
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
    // $ANTLR end "entryRulelistOfOutputs"


    // $ANTLR start "rulelistOfOutputs"
    // InternalSedml.g:1007:1: rulelistOfOutputs returns [EObject current=null] : (otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_plot2D_2_0= ruleplot2D ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfOutputs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_plot2D_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1013:2: ( (otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_plot2D_2_0= ruleplot2D ) )* otherlv_3= '}' ) )
            // InternalSedml.g:1014:2: (otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_plot2D_2_0= ruleplot2D ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:1014:2: (otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_plot2D_2_0= ruleplot2D ) )* otherlv_3= '}' )
            // InternalSedml.g:1015:3: otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_plot2D_2_0= ruleplot2D ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfOutputsAccess().getListOfOutputsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfOutputsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:1023:3: ( (lv_plot2D_2_0= ruleplot2D ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSedml.g:1024:4: (lv_plot2D_2_0= ruleplot2D )
            	    {
            	    // InternalSedml.g:1024:4: (lv_plot2D_2_0= ruleplot2D )
            	    // InternalSedml.g:1025:5: lv_plot2D_2_0= ruleplot2D
            	    {

            	    					newCompositeNode(grammarAccess.getListOfOutputsAccess().getPlot2DPlot2DParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_plot2D_2_0=ruleplot2D();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfOutputsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"plot2D",
            	    						lv_plot2D_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.plot2D");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfOutputsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfOutputs"


    // $ANTLR start "entryRuleplot2D"
    // InternalSedml.g:1050:1: entryRuleplot2D returns [EObject current=null] : iv_ruleplot2D= ruleplot2D EOF ;
    public final EObject entryRuleplot2D() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleplot2D = null;


        try {
            // InternalSedml.g:1050:47: (iv_ruleplot2D= ruleplot2D EOF )
            // InternalSedml.g:1051:2: iv_ruleplot2D= ruleplot2D EOF
            {
             newCompositeNode(grammarAccess.getPlot2DRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleplot2D=ruleplot2D();

            state._fsp--;

             current =iv_ruleplot2D; 
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
    // $ANTLR end "entryRuleplot2D"


    // $ANTLR start "ruleplot2D"
    // InternalSedml.g:1057:1: ruleplot2D returns [EObject current=null] : (otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}' ) ;
    public final EObject ruleplot2D() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_9=null;
        EObject lv_listOfCurves_8_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1063:2: ( (otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}' ) )
            // InternalSedml.g:1064:2: (otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}' )
            {
            // InternalSedml.g:1064:2: (otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}' )
            // InternalSedml.g:1065:3: otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPlot2DAccess().getPlot2DKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPlot2DAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPlot2DAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getPlot2DAccess().getColonKeyword_3());
            		
            // InternalSedml.g:1081:3: ( (lv_id_4_0= RULE_STRING ) )
            // InternalSedml.g:1082:4: (lv_id_4_0= RULE_STRING )
            {
            // InternalSedml.g:1082:4: (lv_id_4_0= RULE_STRING )
            // InternalSedml.g:1083:5: lv_id_4_0= RULE_STRING
            {
            lv_id_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_id_4_0, grammarAccess.getPlot2DAccess().getIdSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlot2DRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getPlot2DAccess().getNameKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getPlot2DAccess().getColonKeyword_6());
            		
            // InternalSedml.g:1107:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalSedml.g:1108:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalSedml.g:1108:4: (lv_name_7_0= RULE_STRING )
            // InternalSedml.g:1109:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_name_7_0, grammarAccess.getPlot2DAccess().getNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlot2DRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSedml.g:1125:3: ( (lv_listOfCurves_8_0= rulelistOfCurves ) )
            // InternalSedml.g:1126:4: (lv_listOfCurves_8_0= rulelistOfCurves )
            {
            // InternalSedml.g:1126:4: (lv_listOfCurves_8_0= rulelistOfCurves )
            // InternalSedml.g:1127:5: lv_listOfCurves_8_0= rulelistOfCurves
            {

            					newCompositeNode(grammarAccess.getPlot2DAccess().getListOfCurvesListOfCurvesParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_listOfCurves_8_0=rulelistOfCurves();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlot2DRule());
            					}
            					set(
            						current,
            						"listOfCurves",
            						lv_listOfCurves_8_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfCurves");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPlot2DAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleplot2D"


    // $ANTLR start "entryRulelistOfCurves"
    // InternalSedml.g:1152:1: entryRulelistOfCurves returns [EObject current=null] : iv_rulelistOfCurves= rulelistOfCurves EOF ;
    public final EObject entryRulelistOfCurves() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfCurves = null;


        try {
            // InternalSedml.g:1152:53: (iv_rulelistOfCurves= rulelistOfCurves EOF )
            // InternalSedml.g:1153:2: iv_rulelistOfCurves= rulelistOfCurves EOF
            {
             newCompositeNode(grammarAccess.getListOfCurvesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfCurves=rulelistOfCurves();

            state._fsp--;

             current =iv_rulelistOfCurves; 
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
    // $ANTLR end "entryRulelistOfCurves"


    // $ANTLR start "rulelistOfCurves"
    // InternalSedml.g:1159:1: rulelistOfCurves returns [EObject current=null] : (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfCurves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_curve_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1165:2: ( (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}' ) )
            // InternalSedml.g:1166:2: (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:1166:2: (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}' )
            // InternalSedml.g:1167:3: otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfCurvesAccess().getListOfCurvesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfCurvesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:1175:3: ( (lv_curve_2_0= rulecurve ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==36) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSedml.g:1176:4: (lv_curve_2_0= rulecurve )
            	    {
            	    // InternalSedml.g:1176:4: (lv_curve_2_0= rulecurve )
            	    // InternalSedml.g:1177:5: lv_curve_2_0= rulecurve
            	    {

            	    					newCompositeNode(grammarAccess.getListOfCurvesAccess().getCurveCurveParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_curve_2_0=rulecurve();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfCurvesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"curve",
            	    						lv_curve_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.curve");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfCurvesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfCurves"


    // $ANTLR start "entryRulecurve"
    // InternalSedml.g:1202:1: entryRulecurve returns [EObject current=null] : iv_rulecurve= rulecurve EOF ;
    public final EObject entryRulecurve() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecurve = null;


        try {
            // InternalSedml.g:1202:46: (iv_rulecurve= rulecurve EOF )
            // InternalSedml.g:1203:2: iv_rulecurve= rulecurve EOF
            {
             newCompositeNode(grammarAccess.getCurveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecurve=rulecurve();

            state._fsp--;

             current =iv_rulecurve; 
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
    // $ANTLR end "entryRulecurve"


    // $ANTLR start "rulecurve"
    // InternalSedml.g:1209:1: rulecurve returns [EObject current=null] : (otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}' ) ;
    public final EObject rulecurve() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_logX_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_logY_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_xDataReference_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_yDataReference_16_0=null;
        Token otherlv_17=null;


        	enterRule();

        try {
            // InternalSedml.g:1215:2: ( (otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}' ) )
            // InternalSedml.g:1216:2: (otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}' )
            {
            // InternalSedml.g:1216:2: (otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}' )
            // InternalSedml.g:1217:3: otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCurveAccess().getCurveKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCurveAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCurveAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCurveAccess().getColonKeyword_3());
            		
            // InternalSedml.g:1233:3: ( (lv_id_4_0= RULE_STRING ) )
            // InternalSedml.g:1234:4: (lv_id_4_0= RULE_STRING )
            {
            // InternalSedml.g:1234:4: (lv_id_4_0= RULE_STRING )
            // InternalSedml.g:1235:5: lv_id_4_0= RULE_STRING
            {
            lv_id_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_id_4_0, grammarAccess.getCurveAccess().getIdSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCurveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getCurveAccess().getLogXKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getCurveAccess().getColonKeyword_6());
            		
            // InternalSedml.g:1259:3: ( (lv_logX_7_0= RULE_STRING ) )
            // InternalSedml.g:1260:4: (lv_logX_7_0= RULE_STRING )
            {
            // InternalSedml.g:1260:4: (lv_logX_7_0= RULE_STRING )
            // InternalSedml.g:1261:5: lv_logX_7_0= RULE_STRING
            {
            lv_logX_7_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_logX_7_0, grammarAccess.getCurveAccess().getLogXSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCurveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"logX",
            						lv_logX_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getCurveAccess().getLogYKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getCurveAccess().getColonKeyword_9());
            		
            // InternalSedml.g:1285:3: ( (lv_logY_10_0= RULE_STRING ) )
            // InternalSedml.g:1286:4: (lv_logY_10_0= RULE_STRING )
            {
            // InternalSedml.g:1286:4: (lv_logY_10_0= RULE_STRING )
            // InternalSedml.g:1287:5: lv_logY_10_0= RULE_STRING
            {
            lv_logY_10_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					newLeafNode(lv_logY_10_0, grammarAccess.getCurveAccess().getLogYSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCurveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"logY",
            						lv_logY_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getCurveAccess().getXDataReferenceKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getCurveAccess().getColonKeyword_12());
            		
            // InternalSedml.g:1311:3: ( (lv_xDataReference_13_0= RULE_STRING ) )
            // InternalSedml.g:1312:4: (lv_xDataReference_13_0= RULE_STRING )
            {
            // InternalSedml.g:1312:4: (lv_xDataReference_13_0= RULE_STRING )
            // InternalSedml.g:1313:5: lv_xDataReference_13_0= RULE_STRING
            {
            lv_xDataReference_13_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            					newLeafNode(lv_xDataReference_13_0, grammarAccess.getCurveAccess().getXDataReferenceSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCurveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"xDataReference",
            						lv_xDataReference_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getCurveAccess().getYDataReferenceKeyword_14());
            		
            otherlv_15=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_15, grammarAccess.getCurveAccess().getColonKeyword_15());
            		
            // InternalSedml.g:1337:3: ( (lv_yDataReference_16_0= RULE_STRING ) )
            // InternalSedml.g:1338:4: (lv_yDataReference_16_0= RULE_STRING )
            {
            // InternalSedml.g:1338:4: (lv_yDataReference_16_0= RULE_STRING )
            // InternalSedml.g:1339:5: lv_yDataReference_16_0= RULE_STRING
            {
            lv_yDataReference_16_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_yDataReference_16_0, grammarAccess.getCurveAccess().getYDataReferenceSTRINGTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCurveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"yDataReference",
            						lv_yDataReference_16_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_17=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getCurveAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "rulecurve"


    // $ANTLR start "entryRulelistOfSimulations"
    // InternalSedml.g:1363:1: entryRulelistOfSimulations returns [EObject current=null] : iv_rulelistOfSimulations= rulelistOfSimulations EOF ;
    public final EObject entryRulelistOfSimulations() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfSimulations = null;


        try {
            // InternalSedml.g:1363:58: (iv_rulelistOfSimulations= rulelistOfSimulations EOF )
            // InternalSedml.g:1364:2: iv_rulelistOfSimulations= rulelistOfSimulations EOF
            {
             newCompositeNode(grammarAccess.getListOfSimulationsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfSimulations=rulelistOfSimulations();

            state._fsp--;

             current =iv_rulelistOfSimulations; 
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
    // $ANTLR end "entryRulelistOfSimulations"


    // $ANTLR start "rulelistOfSimulations"
    // InternalSedml.g:1370:1: rulelistOfSimulations returns [EObject current=null] : (otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfSimulations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_uniformTimeCourse_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1376:2: ( (otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse ) )* otherlv_3= '}' ) )
            // InternalSedml.g:1377:2: (otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:1377:2: (otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse ) )* otherlv_3= '}' )
            // InternalSedml.g:1378:3: otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfSimulationsAccess().getListOfSimulationsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfSimulationsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:1386:3: ( (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==42) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSedml.g:1387:4: (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse )
            	    {
            	    // InternalSedml.g:1387:4: (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse )
            	    // InternalSedml.g:1388:5: lv_uniformTimeCourse_2_0= ruleuniformTimeCourse
            	    {

            	    					newCompositeNode(grammarAccess.getListOfSimulationsAccess().getUniformTimeCourseUniformTimeCourseParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_uniformTimeCourse_2_0=ruleuniformTimeCourse();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfSimulationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"uniformTimeCourse",
            	    						lv_uniformTimeCourse_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.uniformTimeCourse");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfSimulationsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfSimulations"


    // $ANTLR start "entryRuleuniformTimeCourse"
    // InternalSedml.g:1413:1: entryRuleuniformTimeCourse returns [EObject current=null] : iv_ruleuniformTimeCourse= ruleuniformTimeCourse EOF ;
    public final EObject entryRuleuniformTimeCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuniformTimeCourse = null;


        try {
            // InternalSedml.g:1413:58: (iv_ruleuniformTimeCourse= ruleuniformTimeCourse EOF )
            // InternalSedml.g:1414:2: iv_ruleuniformTimeCourse= ruleuniformTimeCourse EOF
            {
             newCompositeNode(grammarAccess.getUniformTimeCourseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuniformTimeCourse=ruleuniformTimeCourse();

            state._fsp--;

             current =iv_ruleuniformTimeCourse; 
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
    // $ANTLR end "entryRuleuniformTimeCourse"


    // $ANTLR start "ruleuniformTimeCourse"
    // InternalSedml.g:1420:1: ruleuniformTimeCourse returns [EObject current=null] : (otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}' ) ;
    public final EObject ruleuniformTimeCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_initialTime_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_outputStartTime_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_outputEndTime_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_numberOfPoints_16_0=null;
        Token otherlv_18=null;
        EObject lv_algorithm_17_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1426:2: ( (otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}' ) )
            // InternalSedml.g:1427:2: (otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}' )
            {
            // InternalSedml.g:1427:2: (otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}' )
            // InternalSedml.g:1428:3: otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getUniformTimeCourseAccess().getUniformtimecourseKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getUniformTimeCourseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getUniformTimeCourseAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_3());
            		
            // InternalSedml.g:1444:3: ( (lv_id_4_0= RULE_STRING ) )
            // InternalSedml.g:1445:4: (lv_id_4_0= RULE_STRING )
            {
            // InternalSedml.g:1445:4: (lv_id_4_0= RULE_STRING )
            // InternalSedml.g:1446:5: lv_id_4_0= RULE_STRING
            {
            lv_id_4_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_id_4_0, grammarAccess.getUniformTimeCourseAccess().getIdSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniformTimeCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,43,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getUniformTimeCourseAccess().getInitialTimeKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_6());
            		
            // InternalSedml.g:1470:3: ( (lv_initialTime_7_0= RULE_INT ) )
            // InternalSedml.g:1471:4: (lv_initialTime_7_0= RULE_INT )
            {
            // InternalSedml.g:1471:4: (lv_initialTime_7_0= RULE_INT )
            // InternalSedml.g:1472:5: lv_initialTime_7_0= RULE_INT
            {
            lv_initialTime_7_0=(Token)match(input,RULE_INT,FOLLOW_41); 

            					newLeafNode(lv_initialTime_7_0, grammarAccess.getUniformTimeCourseAccess().getInitialTimeINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniformTimeCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"initialTime",
            						lv_initialTime_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,44,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getUniformTimeCourseAccess().getOutputStartTimeKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_9());
            		
            // InternalSedml.g:1496:3: ( (lv_outputStartTime_10_0= RULE_INT ) )
            // InternalSedml.g:1497:4: (lv_outputStartTime_10_0= RULE_INT )
            {
            // InternalSedml.g:1497:4: (lv_outputStartTime_10_0= RULE_INT )
            // InternalSedml.g:1498:5: lv_outputStartTime_10_0= RULE_INT
            {
            lv_outputStartTime_10_0=(Token)match(input,RULE_INT,FOLLOW_42); 

            					newLeafNode(lv_outputStartTime_10_0, grammarAccess.getUniformTimeCourseAccess().getOutputStartTimeINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniformTimeCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"outputStartTime",
            						lv_outputStartTime_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,45,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getUniformTimeCourseAccess().getOutputEndTimeKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_12());
            		
            // InternalSedml.g:1522:3: ( (lv_outputEndTime_13_0= RULE_INT ) )
            // InternalSedml.g:1523:4: (lv_outputEndTime_13_0= RULE_INT )
            {
            // InternalSedml.g:1523:4: (lv_outputEndTime_13_0= RULE_INT )
            // InternalSedml.g:1524:5: lv_outputEndTime_13_0= RULE_INT
            {
            lv_outputEndTime_13_0=(Token)match(input,RULE_INT,FOLLOW_43); 

            					newLeafNode(lv_outputEndTime_13_0, grammarAccess.getUniformTimeCourseAccess().getOutputEndTimeINTTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniformTimeCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"outputEndTime",
            						lv_outputEndTime_13_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_14=(Token)match(input,46,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getUniformTimeCourseAccess().getNumberOfPointsKeyword_14());
            		
            otherlv_15=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_15());
            		
            // InternalSedml.g:1548:3: ( (lv_numberOfPoints_16_0= RULE_INT ) )
            // InternalSedml.g:1549:4: (lv_numberOfPoints_16_0= RULE_INT )
            {
            // InternalSedml.g:1549:4: (lv_numberOfPoints_16_0= RULE_INT )
            // InternalSedml.g:1550:5: lv_numberOfPoints_16_0= RULE_INT
            {
            lv_numberOfPoints_16_0=(Token)match(input,RULE_INT,FOLLOW_44); 

            					newLeafNode(lv_numberOfPoints_16_0, grammarAccess.getUniformTimeCourseAccess().getNumberOfPointsINTTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniformTimeCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numberOfPoints",
            						lv_numberOfPoints_16_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSedml.g:1566:3: ( (lv_algorithm_17_0= rulealgorithm ) )
            // InternalSedml.g:1567:4: (lv_algorithm_17_0= rulealgorithm )
            {
            // InternalSedml.g:1567:4: (lv_algorithm_17_0= rulealgorithm )
            // InternalSedml.g:1568:5: lv_algorithm_17_0= rulealgorithm
            {

            					newCompositeNode(grammarAccess.getUniformTimeCourseAccess().getAlgorithmAlgorithmParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_17);
            lv_algorithm_17_0=rulealgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniformTimeCourseRule());
            					}
            					set(
            						current,
            						"algorithm",
            						lv_algorithm_17_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.algorithm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getUniformTimeCourseAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleuniformTimeCourse"


    // $ANTLR start "entryRulealgorithm"
    // InternalSedml.g:1593:1: entryRulealgorithm returns [EObject current=null] : iv_rulealgorithm= rulealgorithm EOF ;
    public final EObject entryRulealgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulealgorithm = null;


        try {
            // InternalSedml.g:1593:50: (iv_rulealgorithm= rulealgorithm EOF )
            // InternalSedml.g:1594:2: iv_rulealgorithm= rulealgorithm EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_rulealgorithm=rulealgorithm();

            state._fsp--;

             current =iv_rulealgorithm; 
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
    // $ANTLR end "entryRulealgorithm"


    // $ANTLR start "rulealgorithm"
    // InternalSedml.g:1600:1: rulealgorithm returns [EObject current=null] : (otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject rulealgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_kisaoID_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSedml.g:1606:2: ( (otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalSedml.g:1607:2: (otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalSedml.g:1607:2: (otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalSedml.g:1608:3: otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmAccess().getAlgorithmKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgorithmAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAlgorithmAccess().getKisaoIDKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAlgorithmAccess().getColonKeyword_3());
            		
            // InternalSedml.g:1624:3: ( (lv_kisaoID_4_0= RULE_STRING ) )
            // InternalSedml.g:1625:4: (lv_kisaoID_4_0= RULE_STRING )
            {
            // InternalSedml.g:1625:4: (lv_kisaoID_4_0= RULE_STRING )
            // InternalSedml.g:1626:5: lv_kisaoID_4_0= RULE_STRING
            {
            lv_kisaoID_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_kisaoID_4_0, grammarAccess.getAlgorithmAccess().getKisaoIDSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgorithmRule());
            					}
            					setWithLastConsumed(
            						current,
            						"kisaoID",
            						lv_kisaoID_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAlgorithmAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulealgorithm"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});

}