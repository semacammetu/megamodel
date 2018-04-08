package tr.edu.metu.ceng.megamodel.sedml.parser.antlr.internal;

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
import tr.edu.metu.ceng.megamodel.sedml.services.SedmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSedmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_RANGEVALUE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'listOfHypotheses'", "'{'", "'}'", "'hypotheses'", "'mechanistic'", "'evidence'", "'coherence'", "'model'", "'relational'", "'if'", "'is'", "'added'", "'removed'", "'in the range'", "'to'", "'then'", "'compare'", "'and'", "'at'", "'level'", "'where'", "'for'", "'('", "')'", "':'", "'activation'", "'weight'", "'+'", "'-'", "'*'", "'/'", "'%'", "' = '", "' == '", "'&&'", "'||'", "'<'", "'<='", "'>'", "'>='", "'!'", "'!='", "'['", "']'", "'listOfModels'", "'id'", "'language'", "'source'", "'name'", "'dataGenerator'", "'listOfDataVariables'", "'variable'", "'target'", "'taskReference'", "'symbol'", "'listOfTasks'", "'task'", "'modelReference'", "'simulationReference'", "'listOfDataGenerators'", "'math'", "'xlms'", "'listOfOutputs'", "'plot2D'", "'listOfCurves'", "'curve'", "'logX'", "'logY'", "'xDataReference'", "'yDataReference'", "'listOfSimulations'", "'uniformtimecourse'", "'initialTime'", "'outputStartTime'", "'outputEndTime'", "'numberOfPoints'", "'algorithm'", "'kisaoID'", "'MIN'", "'MAX'", "'EXP'", "'INVERSE'", "'SIN'", "'COS'", "'TAN'", "'FACTORIAL'", "'LOG'", "'HIGH'", "'MEDIUM'", "'LOW'", "'TRUE'", "'FALSE'", "'occurs'", "'in'", "'precedes'", "'between'", "'eventually'", "'always'", "'before'", "'after'", "'until'", "'never'", "'leads'", "'absent'", "'exists'", "'or'", "'not'", "'EXPLAIN'", "'ANALOGOUS'", "'DATA'", "'CONTRADICT'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__120=120;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_RANGEVALUE=6;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
    // InternalSedml.g:65:1: entryRulesedML returns [EObject current=null] : iv_rulesedML= rulesedML EOF ;
    public final EObject entryRulesedML() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesedML = null;


        try {
            // InternalSedml.g:65:46: (iv_rulesedML= rulesedML EOF )
            // InternalSedml.g:66:2: iv_rulesedML= rulesedML EOF
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
    // InternalSedml.g:72:1: rulesedML returns [EObject current=null] : ( ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfHypotheses_2_0= rulelistOfHypotheses ) ) ( (lv_listOfSimulations_3_0= rulelistOfSimulations ) ) ( (lv_listOfModels_4_0= rulelistOfModels ) ) ( (lv_listOfTasks_5_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_6_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_7_0= rulelistOfOutputs ) ) ) ;
    public final EObject rulesedML() throws RecognitionException {
        EObject current = null;

        Token lv_version_0_0=null;
        Token lv_level_1_0=null;
        EObject lv_listOfHypotheses_2_0 = null;

        EObject lv_listOfSimulations_3_0 = null;

        EObject lv_listOfModels_4_0 = null;

        EObject lv_listOfTasks_5_0 = null;

        EObject lv_listOfDataGenerators_6_0 = null;

        EObject lv_listOfOutputs_7_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:78:2: ( ( ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfHypotheses_2_0= rulelistOfHypotheses ) ) ( (lv_listOfSimulations_3_0= rulelistOfSimulations ) ) ( (lv_listOfModels_4_0= rulelistOfModels ) ) ( (lv_listOfTasks_5_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_6_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_7_0= rulelistOfOutputs ) ) ) )
            // InternalSedml.g:79:2: ( ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfHypotheses_2_0= rulelistOfHypotheses ) ) ( (lv_listOfSimulations_3_0= rulelistOfSimulations ) ) ( (lv_listOfModels_4_0= rulelistOfModels ) ) ( (lv_listOfTasks_5_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_6_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_7_0= rulelistOfOutputs ) ) )
            {
            // InternalSedml.g:79:2: ( ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfHypotheses_2_0= rulelistOfHypotheses ) ) ( (lv_listOfSimulations_3_0= rulelistOfSimulations ) ) ( (lv_listOfModels_4_0= rulelistOfModels ) ) ( (lv_listOfTasks_5_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_6_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_7_0= rulelistOfOutputs ) ) )
            // InternalSedml.g:80:3: ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfHypotheses_2_0= rulelistOfHypotheses ) ) ( (lv_listOfSimulations_3_0= rulelistOfSimulations ) ) ( (lv_listOfModels_4_0= rulelistOfModels ) ) ( (lv_listOfTasks_5_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_6_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_7_0= rulelistOfOutputs ) )
            {
            // InternalSedml.g:80:3: ( (lv_version_0_0= RULE_INT ) )
            // InternalSedml.g:81:4: (lv_version_0_0= RULE_INT )
            {
            // InternalSedml.g:81:4: (lv_version_0_0= RULE_INT )
            // InternalSedml.g:82:5: lv_version_0_0= RULE_INT
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

            // InternalSedml.g:98:3: ( (lv_level_1_0= RULE_INT ) )
            // InternalSedml.g:99:4: (lv_level_1_0= RULE_INT )
            {
            // InternalSedml.g:99:4: (lv_level_1_0= RULE_INT )
            // InternalSedml.g:100:5: lv_level_1_0= RULE_INT
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

            // InternalSedml.g:116:3: ( (lv_listOfHypotheses_2_0= rulelistOfHypotheses ) )
            // InternalSedml.g:117:4: (lv_listOfHypotheses_2_0= rulelistOfHypotheses )
            {
            // InternalSedml.g:117:4: (lv_listOfHypotheses_2_0= rulelistOfHypotheses )
            // InternalSedml.g:118:5: lv_listOfHypotheses_2_0= rulelistOfHypotheses
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfHypothesesListOfHypothesesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_listOfHypotheses_2_0=rulelistOfHypotheses();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfHypotheses",
            						lv_listOfHypotheses_2_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfHypotheses");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:135:3: ( (lv_listOfSimulations_3_0= rulelistOfSimulations ) )
            // InternalSedml.g:136:4: (lv_listOfSimulations_3_0= rulelistOfSimulations )
            {
            // InternalSedml.g:136:4: (lv_listOfSimulations_3_0= rulelistOfSimulations )
            // InternalSedml.g:137:5: lv_listOfSimulations_3_0= rulelistOfSimulations
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfSimulationsListOfSimulationsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_listOfSimulations_3_0=rulelistOfSimulations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfSimulations",
            						lv_listOfSimulations_3_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfSimulations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:154:3: ( (lv_listOfModels_4_0= rulelistOfModels ) )
            // InternalSedml.g:155:4: (lv_listOfModels_4_0= rulelistOfModels )
            {
            // InternalSedml.g:155:4: (lv_listOfModels_4_0= rulelistOfModels )
            // InternalSedml.g:156:5: lv_listOfModels_4_0= rulelistOfModels
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfModelsListOfModelsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_listOfModels_4_0=rulelistOfModels();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfModels",
            						lv_listOfModels_4_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfModels");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:173:3: ( (lv_listOfTasks_5_0= rulelistOfTasks ) )
            // InternalSedml.g:174:4: (lv_listOfTasks_5_0= rulelistOfTasks )
            {
            // InternalSedml.g:174:4: (lv_listOfTasks_5_0= rulelistOfTasks )
            // InternalSedml.g:175:5: lv_listOfTasks_5_0= rulelistOfTasks
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfTasksListOfTasksParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_listOfTasks_5_0=rulelistOfTasks();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfTasks",
            						lv_listOfTasks_5_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfTasks");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:192:3: ( (lv_listOfDataGenerators_6_0= rulelistOfDataGenerators ) )
            // InternalSedml.g:193:4: (lv_listOfDataGenerators_6_0= rulelistOfDataGenerators )
            {
            // InternalSedml.g:193:4: (lv_listOfDataGenerators_6_0= rulelistOfDataGenerators )
            // InternalSedml.g:194:5: lv_listOfDataGenerators_6_0= rulelistOfDataGenerators
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfDataGeneratorsListOfDataGeneratorsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_listOfDataGenerators_6_0=rulelistOfDataGenerators();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfDataGenerators",
            						lv_listOfDataGenerators_6_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfDataGenerators");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:211:3: ( (lv_listOfOutputs_7_0= rulelistOfOutputs ) )
            // InternalSedml.g:212:4: (lv_listOfOutputs_7_0= rulelistOfOutputs )
            {
            // InternalSedml.g:212:4: (lv_listOfOutputs_7_0= rulelistOfOutputs )
            // InternalSedml.g:213:5: lv_listOfOutputs_7_0= rulelistOfOutputs
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfOutputsListOfOutputsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_listOfOutputs_7_0=rulelistOfOutputs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfOutputs",
            						lv_listOfOutputs_7_0,
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


    // $ANTLR start "entryRulelistOfHypotheses"
    // InternalSedml.g:234:1: entryRulelistOfHypotheses returns [EObject current=null] : iv_rulelistOfHypotheses= rulelistOfHypotheses EOF ;
    public final EObject entryRulelistOfHypotheses() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfHypotheses = null;


        try {
            // InternalSedml.g:234:57: (iv_rulelistOfHypotheses= rulelistOfHypotheses EOF )
            // InternalSedml.g:235:2: iv_rulelistOfHypotheses= rulelistOfHypotheses EOF
            {
             newCompositeNode(grammarAccess.getListOfHypothesesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfHypotheses=rulelistOfHypotheses();

            state._fsp--;

             current =iv_rulelistOfHypotheses; 
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
    // $ANTLR end "entryRulelistOfHypotheses"


    // $ANTLR start "rulelistOfHypotheses"
    // InternalSedml.g:241:1: rulelistOfHypotheses returns [EObject current=null] : (otherlv_0= 'listOfHypotheses' otherlv_1= '{' ( (lv_hypothesis_2_0= rulehypothesis ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfHypotheses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_hypothesis_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:247:2: ( (otherlv_0= 'listOfHypotheses' otherlv_1= '{' ( (lv_hypothesis_2_0= rulehypothesis ) )* otherlv_3= '}' ) )
            // InternalSedml.g:248:2: (otherlv_0= 'listOfHypotheses' otherlv_1= '{' ( (lv_hypothesis_2_0= rulehypothesis ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:248:2: (otherlv_0= 'listOfHypotheses' otherlv_1= '{' ( (lv_hypothesis_2_0= rulehypothesis ) )* otherlv_3= '}' )
            // InternalSedml.g:249:3: otherlv_0= 'listOfHypotheses' otherlv_1= '{' ( (lv_hypothesis_2_0= rulehypothesis ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfHypothesesAccess().getListOfHypothesesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfHypothesesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:257:3: ( (lv_hypothesis_2_0= rulehypothesis ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSedml.g:258:4: (lv_hypothesis_2_0= rulehypothesis )
            	    {
            	    // InternalSedml.g:258:4: (lv_hypothesis_2_0= rulehypothesis )
            	    // InternalSedml.g:259:5: lv_hypothesis_2_0= rulehypothesis
            	    {

            	    					newCompositeNode(grammarAccess.getListOfHypothesesAccess().getHypothesisHypothesisParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_hypothesis_2_0=rulehypothesis();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfHypothesesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"hypothesis",
            	    						lv_hypothesis_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.hypothesis");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfHypothesesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfHypotheses"


    // $ANTLR start "entryRulehypothesis"
    // InternalSedml.g:284:1: entryRulehypothesis returns [EObject current=null] : iv_rulehypothesis= rulehypothesis EOF ;
    public final EObject entryRulehypothesis() throws RecognitionException {
        EObject current = null;

        EObject iv_rulehypothesis = null;


        try {
            // InternalSedml.g:284:51: (iv_rulehypothesis= rulehypothesis EOF )
            // InternalSedml.g:285:2: iv_rulehypothesis= rulehypothesis EOF
            {
             newCompositeNode(grammarAccess.getHypothesisRule()); 
            pushFollow(FOLLOW_1);
            iv_rulehypothesis=rulehypothesis();

            state._fsp--;

             current =iv_rulehypothesis; 
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
    // $ANTLR end "entryRulehypothesis"


    // $ANTLR start "rulehypothesis"
    // InternalSedml.g:291:1: rulehypothesis returns [EObject current=null] : (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject rulehypothesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_mechHypothesis_5_0 = null;

        EObject lv_evidences_9_0 = null;

        EObject lv_coherenceLinks_14_0 = null;

        EObject lv_relHypothesis_19_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:297:2: ( (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalSedml.g:298:2: (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalSedml.g:298:2: (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalSedml.g:299:3: otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getHypothesisAccess().getHypothesesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:307:3: (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSedml.g:308:4: otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getHypothesisAccess().getMechanisticKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getHypothesisAccess().getHypothesesKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_2_2());
                    			
                    // InternalSedml.g:320:4: ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSedml.g:321:5: (lv_mechHypothesis_5_0= ruleMechHypothesis )
                    	    {
                    	    // InternalSedml.g:321:5: (lv_mechHypothesis_5_0= ruleMechHypothesis )
                    	    // InternalSedml.g:322:6: lv_mechHypothesis_5_0= ruleMechHypothesis
                    	    {

                    	    						newCompositeNode(grammarAccess.getHypothesisAccess().getMechHypothesisMechHypothesisParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_mechHypothesis_5_0=ruleMechHypothesis();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getHypothesisRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"mechHypothesis",
                    	    							lv_mechHypothesis_5_0,
                    	    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.MechHypothesis");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalSedml.g:344:3: (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSedml.g:345:4: otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getHypothesisAccess().getEvidenceKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSedml.g:353:4: ( (lv_evidences_9_0= ruleEvidence ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSedml.g:354:5: (lv_evidences_9_0= ruleEvidence )
                    	    {
                    	    // InternalSedml.g:354:5: (lv_evidences_9_0= ruleEvidence )
                    	    // InternalSedml.g:355:6: lv_evidences_9_0= ruleEvidence
                    	    {

                    	    						newCompositeNode(grammarAccess.getHypothesisAccess().getEvidencesEvidenceParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_evidences_9_0=ruleEvidence();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getHypothesisRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"evidences",
                    	    							lv_evidences_9_0,
                    	    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.Evidence");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalSedml.g:377:3: (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSedml.g:378:4: otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getHypothesisAccess().getCoherenceKeyword_4_0());
                    			
                    otherlv_12=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getHypothesisAccess().getModelKeyword_4_1());
                    			
                    otherlv_13=(Token)match(input,13,FOLLOW_18); 

                    				newLeafNode(otherlv_13, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_4_2());
                    			
                    // InternalSedml.g:390:4: ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=119 && LA6_0<=122)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSedml.g:391:5: (lv_coherenceLinks_14_0= ruleCoherenceLink )
                    	    {
                    	    // InternalSedml.g:391:5: (lv_coherenceLinks_14_0= ruleCoherenceLink )
                    	    // InternalSedml.g:392:6: lv_coherenceLinks_14_0= ruleCoherenceLink
                    	    {

                    	    						newCompositeNode(grammarAccess.getHypothesisAccess().getCoherenceLinksCoherenceLinkParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_coherenceLinks_14_0=ruleCoherenceLink();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getHypothesisRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"coherenceLinks",
                    	    							lv_coherenceLinks_14_0,
                    	    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.CoherenceLink");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSedml.g:414:3: (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSedml.g:415:4: otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}'
                    {
                    otherlv_16=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getHypothesisAccess().getRelationalKeyword_5_0());
                    			
                    otherlv_17=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getHypothesisAccess().getHypothesesKeyword_5_1());
                    			
                    otherlv_18=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_18, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_5_2());
                    			
                    // InternalSedml.g:427:4: ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21||LA8_0==28) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSedml.g:428:5: (lv_relHypothesis_19_0= ruleRelationalQuery )
                    	    {
                    	    // InternalSedml.g:428:5: (lv_relHypothesis_19_0= ruleRelationalQuery )
                    	    // InternalSedml.g:429:6: lv_relHypothesis_19_0= ruleRelationalQuery
                    	    {

                    	    						newCompositeNode(grammarAccess.getHypothesisAccess().getRelHypothesisRelationalQueryParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_relHypothesis_19_0=ruleRelationalQuery();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getHypothesisRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"relHypothesis",
                    	    							lv_relHypothesis_19_0,
                    	    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.RelationalQuery");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,14,FOLLOW_21); 

                    				newLeafNode(otherlv_20, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulehypothesis"


    // $ANTLR start "entryRuleRelationalQuery"
    // InternalSedml.g:459:1: entryRuleRelationalQuery returns [EObject current=null] : iv_ruleRelationalQuery= ruleRelationalQuery EOF ;
    public final EObject entryRuleRelationalQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalQuery = null;


        try {
            // InternalSedml.g:459:56: (iv_ruleRelationalQuery= ruleRelationalQuery EOF )
            // InternalSedml.g:460:2: iv_ruleRelationalQuery= ruleRelationalQuery EOF
            {
             newCompositeNode(grammarAccess.getRelationalQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalQuery=ruleRelationalQuery();

            state._fsp--;

             current =iv_ruleRelationalQuery; 
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
    // $ANTLR end "entryRuleRelationalQuery"


    // $ANTLR start "ruleRelationalQuery"
    // InternalSedml.g:466:1: ruleRelationalQuery returns [EObject current=null] : (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 ) ;
    public final EObject ruleRelationalQuery() throws RecognitionException {
        EObject current = null;

        EObject this_Query1_0 = null;

        EObject this_Query2_1 = null;

        EObject this_Query3_2 = null;



        	enterRule();

        try {
            // InternalSedml.g:472:2: ( (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 ) )
            // InternalSedml.g:473:2: (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 )
            {
            // InternalSedml.g:473:2: (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalSedml.g:474:3: this_Query1_0= ruleQuery1
                    {

                    			newCompositeNode(grammarAccess.getRelationalQueryAccess().getQuery1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Query1_0=ruleQuery1();

                    state._fsp--;


                    			current = this_Query1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSedml.g:483:3: this_Query2_1= ruleQuery2
                    {

                    			newCompositeNode(grammarAccess.getRelationalQueryAccess().getQuery2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Query2_1=ruleQuery2();

                    state._fsp--;


                    			current = this_Query2_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSedml.g:492:3: this_Query3_2= ruleQuery3
                    {

                    			newCompositeNode(grammarAccess.getRelationalQueryAccess().getQuery3ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Query3_2=ruleQuery3();

                    state._fsp--;


                    			current = this_Query3_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleRelationalQuery"


    // $ANTLR start "entryRuleQuery1"
    // InternalSedml.g:504:1: entryRuleQuery1 returns [EObject current=null] : iv_ruleQuery1= ruleQuery1 EOF ;
    public final EObject entryRuleQuery1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery1 = null;


        try {
            // InternalSedml.g:504:47: (iv_ruleQuery1= ruleQuery1 EOF )
            // InternalSedml.g:505:2: iv_ruleQuery1= ruleQuery1 EOF
            {
             newCompositeNode(grammarAccess.getQuery1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery1=ruleQuery1();

            state._fsp--;

             current =iv_ruleQuery1; 
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
    // $ANTLR end "entryRuleQuery1"


    // $ANTLR start "ruleQuery1"
    // InternalSedml.g:511:1: ruleQuery1 returns [EObject current=null] : (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? ) ;
    public final EObject ruleQuery1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_factor_1_0=null;
        Token lv_control_2_0=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_start1_8_0=null;
        Token otherlv_9=null;
        Token lv_end1_10_0=null;
        Token otherlv_11=null;
        Token lv_response_12_0=null;
        Token otherlv_13=null;
        Token lv_y_14_0=null;
        Token otherlv_15=null;
        Token lv_start2_16_0=null;
        Token otherlv_17=null;
        Token lv_end2_18_0=null;


        	enterRule();

        try {
            // InternalSedml.g:517:2: ( (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? ) )
            // InternalSedml.g:518:2: (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? )
            {
            // InternalSedml.g:518:2: (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? )
            // InternalSedml.g:519:3: otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getQuery1Access().getIfKeyword_0());
            		
            // InternalSedml.g:523:3: ( (lv_factor_1_0= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSedml.g:524:4: (lv_factor_1_0= RULE_ID )
                    {
                    // InternalSedml.g:524:4: (lv_factor_1_0= RULE_ID )
                    // InternalSedml.g:525:5: lv_factor_1_0= RULE_ID
                    {
                    lv_factor_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    					newLeafNode(lv_factor_1_0, grammarAccess.getQuery1Access().getFactorIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuery1Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"factor",
                    						lv_factor_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:541:3: ( (lv_control_2_0= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSedml.g:542:4: (lv_control_2_0= RULE_ID )
                    {
                    // InternalSedml.g:542:4: (lv_control_2_0= RULE_ID )
                    // InternalSedml.g:543:5: lv_control_2_0= RULE_ID
                    {
                    lv_control_2_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    					newLeafNode(lv_control_2_0, grammarAccess.getQuery1Access().getControlIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuery1Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"control",
                    						lv_control_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getQuery1Access().getIsKeyword_3());
            		
            // InternalSedml.g:563:3: ( (lv_x_4_0= RULE_RANGEVALUE ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_RANGEVALUE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSedml.g:564:4: (lv_x_4_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:564:4: (lv_x_4_0= RULE_RANGEVALUE )
                    // InternalSedml.g:565:5: lv_x_4_0= RULE_RANGEVALUE
                    {
                    lv_x_4_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_25); 

                    					newLeafNode(lv_x_4_0, grammarAccess.getQuery1Access().getXRangeValueTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuery1Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"x",
                    						lv_x_4_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.rangeValue");
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:581:3: (otherlv_5= 'added' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSedml.g:582:4: otherlv_5= 'added'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuery1Access().getAddedKeyword_5());
                    			

                    }
                    break;

            }

            // InternalSedml.g:587:3: (otherlv_6= 'removed' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSedml.g:588:4: otherlv_6= 'removed'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getQuery1Access().getRemovedKeyword_6());
                    			

                    }
                    break;

            }

            // InternalSedml.g:593:3: (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSedml.g:594:4: otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_28); 

                    				newLeafNode(otherlv_7, grammarAccess.getQuery1Access().getInTheRangeKeyword_7_0());
                    			
                    // InternalSedml.g:598:4: ( (lv_start1_8_0= RULE_RANGEVALUE ) )
                    // InternalSedml.g:599:5: (lv_start1_8_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:599:5: (lv_start1_8_0= RULE_RANGEVALUE )
                    // InternalSedml.g:600:6: lv_start1_8_0= RULE_RANGEVALUE
                    {
                    lv_start1_8_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_29); 

                    						newLeafNode(lv_start1_8_0, grammarAccess.getQuery1Access().getStart1RangeValueTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuery1Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"start1",
                    							lv_start1_8_0,
                    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.rangeValue");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_9, grammarAccess.getQuery1Access().getToKeyword_7_2());
                    			
                    // InternalSedml.g:620:4: ( (lv_end1_10_0= RULE_RANGEVALUE ) )
                    // InternalSedml.g:621:5: (lv_end1_10_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:621:5: (lv_end1_10_0= RULE_RANGEVALUE )
                    // InternalSedml.g:622:6: lv_end1_10_0= RULE_RANGEVALUE
                    {
                    lv_end1_10_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_30); 

                    						newLeafNode(lv_end1_10_0, grammarAccess.getQuery1Access().getEnd1RangeValueTerminalRuleCall_7_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuery1Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"end1",
                    							lv_end1_10_0,
                    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.rangeValue");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,27,FOLLOW_31); 

            			newLeafNode(otherlv_11, grammarAccess.getQuery1Access().getThenKeyword_8());
            		
            // InternalSedml.g:643:3: ( (lv_response_12_0= RULE_ID ) )
            // InternalSedml.g:644:4: (lv_response_12_0= RULE_ID )
            {
            // InternalSedml.g:644:4: (lv_response_12_0= RULE_ID )
            // InternalSedml.g:645:5: lv_response_12_0= RULE_ID
            {
            lv_response_12_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_response_12_0, grammarAccess.getQuery1Access().getResponseIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuery1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"response",
            						lv_response_12_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_13=(Token)match(input,22,FOLLOW_32); 

            			newLeafNode(otherlv_13, grammarAccess.getQuery1Access().getIsKeyword_10());
            		
            // InternalSedml.g:665:3: ( (lv_y_14_0= RULE_RANGEVALUE ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_RANGEVALUE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSedml.g:666:4: (lv_y_14_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:666:4: (lv_y_14_0= RULE_RANGEVALUE )
                    // InternalSedml.g:667:5: lv_y_14_0= RULE_RANGEVALUE
                    {
                    lv_y_14_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_33); 

                    					newLeafNode(lv_y_14_0, grammarAccess.getQuery1Access().getYRangeValueTerminalRuleCall_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuery1Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"y",
                    						lv_y_14_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.rangeValue");
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:683:3: (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSedml.g:684:4: otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) )
                    {
                    otherlv_15=(Token)match(input,25,FOLLOW_28); 

                    				newLeafNode(otherlv_15, grammarAccess.getQuery1Access().getInTheRangeKeyword_12_0());
                    			
                    // InternalSedml.g:688:4: ( (lv_start2_16_0= RULE_RANGEVALUE ) )
                    // InternalSedml.g:689:5: (lv_start2_16_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:689:5: (lv_start2_16_0= RULE_RANGEVALUE )
                    // InternalSedml.g:690:6: lv_start2_16_0= RULE_RANGEVALUE
                    {
                    lv_start2_16_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_29); 

                    						newLeafNode(lv_start2_16_0, grammarAccess.getQuery1Access().getStart2RangeValueTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuery1Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"start2",
                    							lv_start2_16_0,
                    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.rangeValue");
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_17, grammarAccess.getQuery1Access().getToKeyword_12_2());
                    			
                    // InternalSedml.g:710:4: ( (lv_end2_18_0= RULE_RANGEVALUE ) )
                    // InternalSedml.g:711:5: (lv_end2_18_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:711:5: (lv_end2_18_0= RULE_RANGEVALUE )
                    // InternalSedml.g:712:6: lv_end2_18_0= RULE_RANGEVALUE
                    {
                    lv_end2_18_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_2); 

                    						newLeafNode(lv_end2_18_0, grammarAccess.getQuery1Access().getEnd2RangeValueTerminalRuleCall_12_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuery1Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"end2",
                    							lv_end2_18_0,
                    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.rangeValue");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleQuery1"


    // $ANTLR start "entryRuleQuery2"
    // InternalSedml.g:733:1: entryRuleQuery2 returns [EObject current=null] : iv_ruleQuery2= ruleQuery2 EOF ;
    public final EObject entryRuleQuery2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery2 = null;


        try {
            // InternalSedml.g:733:47: (iv_ruleQuery2= ruleQuery2 EOF )
            // InternalSedml.g:734:2: iv_ruleQuery2= ruleQuery2 EOF
            {
             newCompositeNode(grammarAccess.getQuery2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery2=ruleQuery2();

            state._fsp--;

             current =iv_ruleQuery2; 
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
    // $ANTLR end "entryRuleQuery2"


    // $ANTLR start "ruleQuery2"
    // InternalSedml.g:740:1: ruleQuery2 returns [EObject current=null] : (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? ) ;
    public final EObject ruleQuery2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_response1_2_0=null;
        Token lv_factor1_3_0=null;
        Token otherlv_4=null;
        Token lv_response2_6_0=null;
        Token lv_factor2_7_0=null;
        Enumerator lv_function1_1_0 = null;

        Enumerator lv_function2_5_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:746:2: ( (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? ) )
            // InternalSedml.g:747:2: (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? )
            {
            // InternalSedml.g:747:2: (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? )
            // InternalSedml.g:748:3: otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getQuery2Access().getCompareKeyword_0());
            		
            // InternalSedml.g:752:3: ( (lv_function1_1_0= ruleFunction ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=90 && LA19_0<=98)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSedml.g:753:4: (lv_function1_1_0= ruleFunction )
                    {
                    // InternalSedml.g:753:4: (lv_function1_1_0= ruleFunction )
                    // InternalSedml.g:754:5: lv_function1_1_0= ruleFunction
                    {

                    					newCompositeNode(grammarAccess.getQuery2Access().getFunction1FunctionEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_35);
                    lv_function1_1_0=ruleFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuery2Rule());
                    					}
                    					set(
                    						current,
                    						"function1",
                    						lv_function1_1_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.Function");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:771:3: ( (lv_response1_2_0= RULE_ID ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSedml.g:772:4: (lv_response1_2_0= RULE_ID )
                    {
                    // InternalSedml.g:772:4: (lv_response1_2_0= RULE_ID )
                    // InternalSedml.g:773:5: lv_response1_2_0= RULE_ID
                    {
                    lv_response1_2_0=(Token)match(input,RULE_ID,FOLLOW_35); 

                    					newLeafNode(lv_response1_2_0, grammarAccess.getQuery2Access().getResponse1IDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuery2Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"response1",
                    						lv_response1_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:789:3: ( (lv_factor1_3_0= RULE_ID ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSedml.g:790:4: (lv_factor1_3_0= RULE_ID )
                    {
                    // InternalSedml.g:790:4: (lv_factor1_3_0= RULE_ID )
                    // InternalSedml.g:791:5: lv_factor1_3_0= RULE_ID
                    {
                    lv_factor1_3_0=(Token)match(input,RULE_ID,FOLLOW_36); 

                    					newLeafNode(lv_factor1_3_0, grammarAccess.getQuery2Access().getFactor1IDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuery2Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"factor1",
                    						lv_factor1_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getQuery2Access().getAndKeyword_4());
            		
            // InternalSedml.g:811:3: ( (lv_function2_5_0= ruleFunction ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=90 && LA22_0<=98)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSedml.g:812:4: (lv_function2_5_0= ruleFunction )
                    {
                    // InternalSedml.g:812:4: (lv_function2_5_0= ruleFunction )
                    // InternalSedml.g:813:5: lv_function2_5_0= ruleFunction
                    {

                    					newCompositeNode(grammarAccess.getQuery2Access().getFunction2FunctionEnumRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_function2_5_0=ruleFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuery2Rule());
                    					}
                    					set(
                    						current,
                    						"function2",
                    						lv_function2_5_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.Function");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:830:3: ( (lv_response2_6_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSedml.g:831:4: (lv_response2_6_0= RULE_ID )
                    {
                    // InternalSedml.g:831:4: (lv_response2_6_0= RULE_ID )
                    // InternalSedml.g:832:5: lv_response2_6_0= RULE_ID
                    {
                    lv_response2_6_0=(Token)match(input,RULE_ID,FOLLOW_38); 

                    					newLeafNode(lv_response2_6_0, grammarAccess.getQuery2Access().getResponse2IDTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuery2Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"response2",
                    						lv_response2_6_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:848:3: ( (lv_factor2_7_0= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSedml.g:849:4: (lv_factor2_7_0= RULE_ID )
                    {
                    // InternalSedml.g:849:4: (lv_factor2_7_0= RULE_ID )
                    // InternalSedml.g:850:5: lv_factor2_7_0= RULE_ID
                    {
                    lv_factor2_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_factor2_7_0, grammarAccess.getQuery2Access().getFactor2IDTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuery2Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"factor2",
                    						lv_factor2_7_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleQuery2"


    // $ANTLR start "entryRuleQuery3"
    // InternalSedml.g:870:1: entryRuleQuery3 returns [EObject current=null] : iv_ruleQuery3= ruleQuery3 EOF ;
    public final EObject entryRuleQuery3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery3 = null;


        try {
            // InternalSedml.g:870:47: (iv_ruleQuery3= ruleQuery3 EOF )
            // InternalSedml.g:871:2: iv_ruleQuery3= ruleQuery3 EOF
            {
             newCompositeNode(grammarAccess.getQuery3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery3=ruleQuery3();

            state._fsp--;

             current =iv_ruleQuery3; 
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
    // $ANTLR end "entryRuleQuery3"


    // $ANTLR start "ruleQuery3"
    // InternalSedml.g:877:1: ruleQuery3 returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* ) ;
    public final EObject ruleQuery3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_factor1_1_0=null;
        Token lv_control1_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_x2_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_response1_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_x4_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_factor_20_0=null;
        Token lv_control_21_0=null;
        Token lv_response_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_start1_25_0=null;
        Token otherlv_26=null;
        Token lv_end1_27_0=null;
        Enumerator lv_Level2_6_0 = null;

        Enumerator lv_Level4_14_0 = null;

        Enumerator lv_level_18_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:883:2: ( (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* ) )
            // InternalSedml.g:884:2: (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* )
            {
            // InternalSedml.g:884:2: (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* )
            // InternalSedml.g:885:3: otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getQuery3Access().getIfKeyword_0());
            		
            // InternalSedml.g:889:3: ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==22) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSedml.g:890:4: ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )?
            	    {
            	    // InternalSedml.g:890:4: ( (lv_factor1_1_0= RULE_ID ) )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==RULE_ID) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalSedml.g:891:5: (lv_factor1_1_0= RULE_ID )
            	            {
            	            // InternalSedml.g:891:5: (lv_factor1_1_0= RULE_ID )
            	            // InternalSedml.g:892:6: lv_factor1_1_0= RULE_ID
            	            {
            	            lv_factor1_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            	            						newLeafNode(lv_factor1_1_0, grammarAccess.getQuery3Access().getFactor1IDTerminalRuleCall_1_0_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getQuery3Rule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"factor1",
            	            							lv_factor1_1_0,
            	            							"org.eclipse.xtext.common.Terminals.ID");
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalSedml.g:908:4: ( (lv_control1_2_0= RULE_ID ) )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==RULE_ID) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalSedml.g:909:5: (lv_control1_2_0= RULE_ID )
            	            {
            	            // InternalSedml.g:909:5: (lv_control1_2_0= RULE_ID )
            	            // InternalSedml.g:910:6: lv_control1_2_0= RULE_ID
            	            {
            	            lv_control1_2_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            	            						newLeafNode(lv_control1_2_0, grammarAccess.getQuery3Access().getControl1IDTerminalRuleCall_1_1_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getQuery3Rule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"control1",
            	            							lv_control1_2_0,
            	            							"org.eclipse.xtext.common.Terminals.ID");
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_3=(Token)match(input,22,FOLLOW_40); 

            	    				newLeafNode(otherlv_3, grammarAccess.getQuery3Access().getIsKeyword_1_2());
            	    			
            	    // InternalSedml.g:930:4: (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==30) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalSedml.g:931:5: otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) )
            	            {
            	            otherlv_4=(Token)match(input,30,FOLLOW_41); 

            	            					newLeafNode(otherlv_4, grammarAccess.getQuery3Access().getAtKeyword_1_3_0());
            	            				
            	            otherlv_5=(Token)match(input,31,FOLLOW_42); 

            	            					newLeafNode(otherlv_5, grammarAccess.getQuery3Access().getLevelKeyword_1_3_1());
            	            				
            	            // InternalSedml.g:939:5: ( (lv_Level2_6_0= ruleLevels ) )
            	            // InternalSedml.g:940:6: (lv_Level2_6_0= ruleLevels )
            	            {
            	            // InternalSedml.g:940:6: (lv_Level2_6_0= ruleLevels )
            	            // InternalSedml.g:941:7: lv_Level2_6_0= ruleLevels
            	            {

            	            							newCompositeNode(grammarAccess.getQuery3Access().getLevel2LevelsEnumRuleCall_1_3_2_0());
            	            						
            	            pushFollow(FOLLOW_43);
            	            lv_Level2_6_0=ruleLevels();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getQuery3Rule());
            	            							}
            	            							set(
            	            								current,
            	            								"Level2",
            	            								lv_Level2_6_0,
            	            								"tr.edu.metu.ceng.megamodel.sedml.Sedml.Levels");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalSedml.g:959:4: ( (lv_x2_7_0= RULE_RANGEVALUE ) )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==RULE_RANGEVALUE) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalSedml.g:960:5: (lv_x2_7_0= RULE_RANGEVALUE )
            	            {
            	            // InternalSedml.g:960:5: (lv_x2_7_0= RULE_RANGEVALUE )
            	            // InternalSedml.g:961:6: lv_x2_7_0= RULE_RANGEVALUE
            	            {
            	            lv_x2_7_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_44); 

            	            						newLeafNode(lv_x2_7_0, grammarAccess.getQuery3Access().getX2RangeValueTerminalRuleCall_1_4_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getQuery3Rule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"x2",
            	            							lv_x2_7_0,
            	            							"tr.edu.metu.ceng.megamodel.sedml.Sedml.rangeValue");
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalSedml.g:977:4: (otherlv_8= 'and' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==29) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalSedml.g:978:5: otherlv_8= 'and'
            	            {
            	            otherlv_8=(Token)match(input,29,FOLLOW_39); 

            	            					newLeafNode(otherlv_8, grammarAccess.getQuery3Access().getAndKeyword_1_5());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_9=(Token)match(input,27,FOLLOW_45); 

            			newLeafNode(otherlv_9, grammarAccess.getQuery3Access().getThenKeyword_2());
            		
            // InternalSedml.g:988:3: ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSedml.g:989:4: ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )?
            	    {
            	    // InternalSedml.g:989:4: ( (lv_response1_10_0= RULE_ID ) )
            	    // InternalSedml.g:990:5: (lv_response1_10_0= RULE_ID )
            	    {
            	    // InternalSedml.g:990:5: (lv_response1_10_0= RULE_ID )
            	    // InternalSedml.g:991:6: lv_response1_10_0= RULE_ID
            	    {
            	    lv_response1_10_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(lv_response1_10_0, grammarAccess.getQuery3Access().getResponse1IDTerminalRuleCall_3_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getQuery3Rule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"response1",
            	    							lv_response1_10_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,22,FOLLOW_46); 

            	    				newLeafNode(otherlv_11, grammarAccess.getQuery3Access().getIsKeyword_3_1());
            	    			
            	    // InternalSedml.g:1011:4: (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==30) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalSedml.g:1012:5: otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) )
            	            {
            	            otherlv_12=(Token)match(input,30,FOLLOW_41); 

            	            					newLeafNode(otherlv_12, grammarAccess.getQuery3Access().getAtKeyword_3_2_0());
            	            				
            	            otherlv_13=(Token)match(input,31,FOLLOW_42); 

            	            					newLeafNode(otherlv_13, grammarAccess.getQuery3Access().getLevelKeyword_3_2_1());
            	            				
            	            // InternalSedml.g:1020:5: ( (lv_Level4_14_0= ruleLevels ) )
            	            // InternalSedml.g:1021:6: (lv_Level4_14_0= ruleLevels )
            	            {
            	            // InternalSedml.g:1021:6: (lv_Level4_14_0= ruleLevels )
            	            // InternalSedml.g:1022:7: lv_Level4_14_0= ruleLevels
            	            {

            	            							newCompositeNode(grammarAccess.getQuery3Access().getLevel4LevelsEnumRuleCall_3_2_2_0());
            	            						
            	            pushFollow(FOLLOW_47);
            	            lv_Level4_14_0=ruleLevels();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getQuery3Rule());
            	            							}
            	            							set(
            	            								current,
            	            								"Level4",
            	            								lv_Level4_14_0,
            	            								"tr.edu.metu.ceng.megamodel.sedml.Sedml.Levels");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalSedml.g:1040:4: ( (lv_x4_15_0= RULE_RANGEVALUE ) )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==RULE_RANGEVALUE) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalSedml.g:1041:5: (lv_x4_15_0= RULE_RANGEVALUE )
            	            {
            	            // InternalSedml.g:1041:5: (lv_x4_15_0= RULE_RANGEVALUE )
            	            // InternalSedml.g:1042:6: lv_x4_15_0= RULE_RANGEVALUE
            	            {
            	            lv_x4_15_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_48); 

            	            						newLeafNode(lv_x4_15_0, grammarAccess.getQuery3Access().getX4RangeValueTerminalRuleCall_3_3_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getQuery3Rule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"x4",
            	            							lv_x4_15_0,
            	            							"tr.edu.metu.ceng.megamodel.sedml.Sedml.rangeValue");
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalSedml.g:1058:4: (otherlv_16= 'and' )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==29) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalSedml.g:1059:5: otherlv_16= 'and'
            	            {
            	            otherlv_16=(Token)match(input,29,FOLLOW_45); 

            	            					newLeafNode(otherlv_16, grammarAccess.getQuery3Access().getAndKeyword_3_4());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_17=(Token)match(input,32,FOLLOW_49); 

            			newLeafNode(otherlv_17, grammarAccess.getQuery3Access().getWhereKeyword_4());
            		
            // InternalSedml.g:1069:3: ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=99 && LA38_0<=101)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSedml.g:1070:4: ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) )
            	    {
            	    // InternalSedml.g:1070:4: ( (lv_level_18_0= ruleLevels ) )
            	    // InternalSedml.g:1071:5: (lv_level_18_0= ruleLevels )
            	    {
            	    // InternalSedml.g:1071:5: (lv_level_18_0= ruleLevels )
            	    // InternalSedml.g:1072:6: lv_level_18_0= ruleLevels
            	    {

            	    						newCompositeNode(grammarAccess.getQuery3Access().getLevelLevelsEnumRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_50);
            	    lv_level_18_0=ruleLevels();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQuery3Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"level",
            	    							lv_level_18_0,
            	    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.Levels");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_19=(Token)match(input,33,FOLLOW_22); 

            	    				newLeafNode(otherlv_19, grammarAccess.getQuery3Access().getForKeyword_5_1());
            	    			
            	    // InternalSedml.g:1093:4: ( (lv_factor_20_0= RULE_ID ) )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==RULE_ID) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalSedml.g:1094:5: (lv_factor_20_0= RULE_ID )
            	            {
            	            // InternalSedml.g:1094:5: (lv_factor_20_0= RULE_ID )
            	            // InternalSedml.g:1095:6: lv_factor_20_0= RULE_ID
            	            {
            	            lv_factor_20_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            	            						newLeafNode(lv_factor_20_0, grammarAccess.getQuery3Access().getFactorIDTerminalRuleCall_5_2_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getQuery3Rule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"factor",
            	            							lv_factor_20_0,
            	            							"org.eclipse.xtext.common.Terminals.ID");
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalSedml.g:1111:4: ( (lv_control_21_0= RULE_ID ) )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==RULE_ID) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalSedml.g:1112:5: (lv_control_21_0= RULE_ID )
            	            {
            	            // InternalSedml.g:1112:5: (lv_control_21_0= RULE_ID )
            	            // InternalSedml.g:1113:6: lv_control_21_0= RULE_ID
            	            {
            	            lv_control_21_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            	            						newLeafNode(lv_control_21_0, grammarAccess.getQuery3Access().getControlIDTerminalRuleCall_5_3_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getQuery3Rule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"control",
            	            							lv_control_21_0,
            	            							"org.eclipse.xtext.common.Terminals.ID");
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalSedml.g:1129:4: ( (lv_response_22_0= RULE_ID ) )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==RULE_ID) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalSedml.g:1130:5: (lv_response_22_0= RULE_ID )
            	            {
            	            // InternalSedml.g:1130:5: (lv_response_22_0= RULE_ID )
            	            // InternalSedml.g:1131:6: lv_response_22_0= RULE_ID
            	            {
            	            lv_response_22_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            	            						newLeafNode(lv_response_22_0, grammarAccess.getQuery3Access().getResponseIDTerminalRuleCall_5_4_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getQuery3Rule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"response",
            	            							lv_response_22_0,
            	            							"org.eclipse.xtext.common.Terminals.ID");
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_23=(Token)match(input,22,FOLLOW_51); 

            	    				newLeafNode(otherlv_23, grammarAccess.getQuery3Access().getIsKeyword_5_5());
            	    			
            	    otherlv_24=(Token)match(input,25,FOLLOW_28); 

            	    				newLeafNode(otherlv_24, grammarAccess.getQuery3Access().getInTheRangeKeyword_5_6());
            	    			
            	    // InternalSedml.g:1155:4: ( (lv_start1_25_0= RULE_RANGEVALUE ) )
            	    // InternalSedml.g:1156:5: (lv_start1_25_0= RULE_RANGEVALUE )
            	    {
            	    // InternalSedml.g:1156:5: (lv_start1_25_0= RULE_RANGEVALUE )
            	    // InternalSedml.g:1157:6: lv_start1_25_0= RULE_RANGEVALUE
            	    {
            	    lv_start1_25_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_29); 

            	    						newLeafNode(lv_start1_25_0, grammarAccess.getQuery3Access().getStart1RangeValueTerminalRuleCall_5_7_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getQuery3Rule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"start1",
            	    							lv_start1_25_0,
            	    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.rangeValue");
            	    					

            	    }


            	    }

            	    otherlv_26=(Token)match(input,26,FOLLOW_28); 

            	    				newLeafNode(otherlv_26, grammarAccess.getQuery3Access().getToKeyword_5_8());
            	    			
            	    // InternalSedml.g:1177:4: ( (lv_end1_27_0= RULE_RANGEVALUE ) )
            	    // InternalSedml.g:1178:5: (lv_end1_27_0= RULE_RANGEVALUE )
            	    {
            	    // InternalSedml.g:1178:5: (lv_end1_27_0= RULE_RANGEVALUE )
            	    // InternalSedml.g:1179:6: lv_end1_27_0= RULE_RANGEVALUE
            	    {
            	    lv_end1_27_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_49); 

            	    						newLeafNode(lv_end1_27_0, grammarAccess.getQuery3Access().getEnd1RangeValueTerminalRuleCall_5_9_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getQuery3Rule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"end1",
            	    							lv_end1_27_0,
            	    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.rangeValue");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // $ANTLR end "ruleQuery3"


    // $ANTLR start "entryRuleCoherenceLink"
    // InternalSedml.g:1200:1: entryRuleCoherenceLink returns [EObject current=null] : iv_ruleCoherenceLink= ruleCoherenceLink EOF ;
    public final EObject entryRuleCoherenceLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoherenceLink = null;


        try {
            // InternalSedml.g:1200:54: (iv_ruleCoherenceLink= ruleCoherenceLink EOF )
            // InternalSedml.g:1201:2: iv_ruleCoherenceLink= ruleCoherenceLink EOF
            {
             newCompositeNode(grammarAccess.getCoherenceLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoherenceLink=ruleCoherenceLink();

            state._fsp--;

             current =iv_ruleCoherenceLink; 
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
    // $ANTLR end "entryRuleCoherenceLink"


    // $ANTLR start "ruleCoherenceLink"
    // InternalSedml.g:1207:1: ruleCoherenceLink returns [EObject current=null] : ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' ) ;
    public final EObject ruleCoherenceLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hyp_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_evi_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_coherence_0_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1213:2: ( ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' ) )
            // InternalSedml.g:1214:2: ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' )
            {
            // InternalSedml.g:1214:2: ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' )
            // InternalSedml.g:1215:3: ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')'
            {
            // InternalSedml.g:1215:3: ( (lv_coherence_0_0= ruleCoherence ) )
            // InternalSedml.g:1216:4: (lv_coherence_0_0= ruleCoherence )
            {
            // InternalSedml.g:1216:4: (lv_coherence_0_0= ruleCoherence )
            // InternalSedml.g:1217:5: lv_coherence_0_0= ruleCoherence
            {

            					newCompositeNode(grammarAccess.getCoherenceLinkAccess().getCoherenceCoherenceEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_52);
            lv_coherence_0_0=ruleCoherence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoherenceLinkRule());
            					}
            					set(
            						current,
            						"coherence",
            						lv_coherence_0_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.Coherence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getCoherenceLinkAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSedml.g:1238:3: ( (lv_hyp_2_0= RULE_ID ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSedml.g:1239:4: (lv_hyp_2_0= RULE_ID )
            	    {
            	    // InternalSedml.g:1239:4: (lv_hyp_2_0= RULE_ID )
            	    // InternalSedml.g:1240:5: lv_hyp_2_0= RULE_ID
            	    {
            	    lv_hyp_2_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            	    					newLeafNode(lv_hyp_2_0, grammarAccess.getCoherenceLinkAccess().getHypIDTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCoherenceLinkRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"hyp",
            	    						lv_hyp_2_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_3=(Token)match(input,35,FOLLOW_52); 

            			newLeafNode(otherlv_3, grammarAccess.getCoherenceLinkAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_53); 

            			newLeafNode(otherlv_4, grammarAccess.getCoherenceLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalSedml.g:1264:3: ( (lv_evi_5_0= RULE_ID ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSedml.g:1265:4: (lv_evi_5_0= RULE_ID )
            	    {
            	    // InternalSedml.g:1265:4: (lv_evi_5_0= RULE_ID )
            	    // InternalSedml.g:1266:5: lv_evi_5_0= RULE_ID
            	    {
            	    lv_evi_5_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            	    					newLeafNode(lv_evi_5_0, grammarAccess.getCoherenceLinkAccess().getEviIDTerminalRuleCall_5_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCoherenceLinkRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"evi",
            	    						lv_evi_5_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_6=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCoherenceLinkAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleCoherenceLink"


    // $ANTLR start "entryRuleMechHypothesis"
    // InternalSedml.g:1290:1: entryRuleMechHypothesis returns [EObject current=null] : iv_ruleMechHypothesis= ruleMechHypothesis EOF ;
    public final EObject entryRuleMechHypothesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechHypothesis = null;


        try {
            // InternalSedml.g:1290:55: (iv_ruleMechHypothesis= ruleMechHypothesis EOF )
            // InternalSedml.g:1291:2: iv_ruleMechHypothesis= ruleMechHypothesis EOF
            {
             newCompositeNode(grammarAccess.getMechHypothesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMechHypothesis=ruleMechHypothesis();

            state._fsp--;

             current =iv_ruleMechHypothesis; 
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
    // $ANTLR end "entryRuleMechHypothesis"


    // $ANTLR start "ruleMechHypothesis"
    // InternalSedml.g:1297:1: ruleMechHypothesis returns [EObject current=null] : ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? ) ;
    public final EObject ruleMechHypothesis() throws RecognitionException {
        EObject current = null;

        Token lv_mName_0_0=null;
        Token otherlv_1=null;
        Token lv_mechanisticHypothesis_3_0=null;
        EObject lv_assoMech_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1303:2: ( ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? ) )
            // InternalSedml.g:1304:2: ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? )
            {
            // InternalSedml.g:1304:2: ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? )
            // InternalSedml.g:1305:3: ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )?
            {
            // InternalSedml.g:1305:3: ( (lv_mName_0_0= RULE_ID ) )
            // InternalSedml.g:1306:4: (lv_mName_0_0= RULE_ID )
            {
            // InternalSedml.g:1306:4: (lv_mName_0_0= RULE_ID )
            // InternalSedml.g:1307:5: lv_mName_0_0= RULE_ID
            {
            lv_mName_0_0=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(lv_mName_0_0, grammarAccess.getMechHypothesisAccess().getMNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMechHypothesisRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mName",
            						lv_mName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getMechHypothesisAccess().getColonKeyword_1());
            		
            // InternalSedml.g:1327:3: ( (lv_assoMech_2_0= ruleTemporalPattern ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==54) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSedml.g:1328:4: (lv_assoMech_2_0= ruleTemporalPattern )
            	    {
            	    // InternalSedml.g:1328:4: (lv_assoMech_2_0= ruleTemporalPattern )
            	    // InternalSedml.g:1329:5: lv_assoMech_2_0= ruleTemporalPattern
            	    {

            	    					newCompositeNode(grammarAccess.getMechHypothesisAccess().getAssoMechTemporalPatternParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_55);
            	    lv_assoMech_2_0=ruleTemporalPattern();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMechHypothesisRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assoMech",
            	    						lv_assoMech_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.TemporalPattern");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalSedml.g:1346:3: ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==EOF||LA42_1==RULE_ID||LA42_1==14) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalSedml.g:1347:4: (lv_mechanisticHypothesis_3_0= RULE_ID )
                    {
                    // InternalSedml.g:1347:4: (lv_mechanisticHypothesis_3_0= RULE_ID )
                    // InternalSedml.g:1348:5: lv_mechanisticHypothesis_3_0= RULE_ID
                    {
                    lv_mechanisticHypothesis_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_mechanisticHypothesis_3_0, grammarAccess.getMechHypothesisAccess().getMechanisticHypothesisIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMechHypothesisRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"mechanisticHypothesis",
                    						lv_mechanisticHypothesis_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleMechHypothesis"


    // $ANTLR start "entryRuleEvidence"
    // InternalSedml.g:1368:1: entryRuleEvidence returns [EObject current=null] : iv_ruleEvidence= ruleEvidence EOF ;
    public final EObject entryRuleEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidence = null;


        try {
            // InternalSedml.g:1368:49: (iv_ruleEvidence= ruleEvidence EOF )
            // InternalSedml.g:1369:2: iv_ruleEvidence= ruleEvidence EOF
            {
             newCompositeNode(grammarAccess.getEvidenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvidence=ruleEvidence();

            state._fsp--;

             current =iv_ruleEvidence; 
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
    // $ANTLR end "entryRuleEvidence"


    // $ANTLR start "ruleEvidence"
    // InternalSedml.g:1375:1: ruleEvidence returns [EObject current=null] : ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) ) ;
    public final EObject ruleEvidence() throws RecognitionException {
        EObject current = null;

        Token lv_eName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_objOfStudy_6_0=null;
        EObject lv_query_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1381:2: ( ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) ) )
            // InternalSedml.g:1382:2: ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) )
            {
            // InternalSedml.g:1382:2: ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) )
            // InternalSedml.g:1383:3: ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) )
            {
            // InternalSedml.g:1383:3: ( (lv_eName_0_0= RULE_ID ) )
            // InternalSedml.g:1384:4: (lv_eName_0_0= RULE_ID )
            {
            // InternalSedml.g:1384:4: (lv_eName_0_0= RULE_ID )
            // InternalSedml.g:1385:5: lv_eName_0_0= RULE_ID
            {
            lv_eName_0_0=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(lv_eName_0_0, grammarAccess.getEvidenceAccess().getENameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvidenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"eName",
            						lv_eName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getEvidenceAccess().getColonKeyword_1());
            		
            // InternalSedml.g:1405:3: ( (lv_query_2_0= ruleTemporalPattern ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==54) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSedml.g:1406:4: (lv_query_2_0= ruleTemporalPattern )
            	    {
            	    // InternalSedml.g:1406:4: (lv_query_2_0= ruleTemporalPattern )
            	    // InternalSedml.g:1407:5: lv_query_2_0= ruleTemporalPattern
            	    {

            	    					newCompositeNode(grammarAccess.getEvidenceAccess().getQueryTemporalPatternParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_56);
            	    lv_query_2_0=ruleTemporalPattern();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEvidenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"query",
            	    						lv_query_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.TemporalPattern");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_3=(Token)match(input,37,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getEvidenceAccess().getActivationKeyword_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_54); 

            			newLeafNode(otherlv_4, grammarAccess.getEvidenceAccess().getWeightKeyword_4());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_5, grammarAccess.getEvidenceAccess().getColonKeyword_5());
            		
            // InternalSedml.g:1436:3: ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) )
            // InternalSedml.g:1437:4: (lv_objOfStudy_6_0= RULE_RANGEVALUE )
            {
            // InternalSedml.g:1437:4: (lv_objOfStudy_6_0= RULE_RANGEVALUE )
            // InternalSedml.g:1438:5: lv_objOfStudy_6_0= RULE_RANGEVALUE
            {
            lv_objOfStudy_6_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_2); 

            					newLeafNode(lv_objOfStudy_6_0, grammarAccess.getEvidenceAccess().getObjOfStudyRangeValueTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvidenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objOfStudy",
            						lv_objOfStudy_6_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.rangeValue");
            				

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
    // $ANTLR end "ruleEvidence"


    // $ANTLR start "entryRuleTemporalPattern"
    // InternalSedml.g:1458:1: entryRuleTemporalPattern returns [EObject current=null] : iv_ruleTemporalPattern= ruleTemporalPattern EOF ;
    public final EObject entryRuleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPattern = null;


        try {
            // InternalSedml.g:1458:56: (iv_ruleTemporalPattern= ruleTemporalPattern EOF )
            // InternalSedml.g:1459:2: iv_ruleTemporalPattern= ruleTemporalPattern EOF
            {
             newCompositeNode(grammarAccess.getTemporalPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalPattern=ruleTemporalPattern();

            state._fsp--;

             current =iv_ruleTemporalPattern; 
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
    // $ANTLR end "entryRuleTemporalPattern"


    // $ANTLR start "ruleTemporalPattern"
    // InternalSedml.g:1465:1: ruleTemporalPattern returns [EObject current=null] : (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? ) ;
    public final EObject ruleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;

        Enumerator lv_l2_1_0 = null;

        Enumerator lv_exp_2_0 = null;

        Enumerator lv_op1_3_0 = null;

        Enumerator lv_op2_4_0 = null;

        Enumerator lv_l3_5_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1471:2: ( (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? ) )
            // InternalSedml.g:1472:2: (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? )
            {
            // InternalSedml.g:1472:2: (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? )
            // InternalSedml.g:1473:3: this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )?
            {

            			newCompositeNode(grammarAccess.getTemporalPatternAccess().getConditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_58);
            this_Condition_0=ruleCondition();

            state._fsp--;


            			current = this_Condition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSedml.g:1481:3: ( (lv_l2_1_0= ruleLinks ) )*
            loop44:
            do {
                int alt44=2;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    alt44=1;
                    }
                    break;
                case 104:
                    {
                    alt44=1;
                    }
                    break;
                case 26:
                    {
                    alt44=1;
                    }
                    break;
                case 105:
                    {
                    alt44=1;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // InternalSedml.g:1482:4: (lv_l2_1_0= ruleLinks )
            	    {
            	    // InternalSedml.g:1482:4: (lv_l2_1_0= ruleLinks )
            	    // InternalSedml.g:1483:5: lv_l2_1_0= ruleLinks
            	    {

            	    					newCompositeNode(grammarAccess.getTemporalPatternAccess().getL2LinksEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_58);
            	    lv_l2_1_0=ruleLinks();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"l2",
            	    						lv_l2_1_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.Links");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // InternalSedml.g:1500:3: ( (lv_exp_2_0= ruleExpression ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=102 && LA45_0<=103)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSedml.g:1501:4: (lv_exp_2_0= ruleExpression )
            	    {
            	    // InternalSedml.g:1501:4: (lv_exp_2_0= ruleExpression )
            	    // InternalSedml.g:1502:5: lv_exp_2_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getTemporalPatternAccess().getExpExpressionEnumRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_58);
            	    lv_exp_2_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"exp",
            	    						lv_exp_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalSedml.g:1519:3: ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )*
            loop46:
            do {
                int alt46=3;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=106 && LA46_0<=116)) ) {
                    alt46=1;
                }
                else if ( (LA46_0==29||(LA46_0>=117 && LA46_0<=118)) ) {
                    alt46=2;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSedml.g:1520:4: ( (lv_op1_3_0= ruleTemporal ) )
            	    {
            	    // InternalSedml.g:1520:4: ( (lv_op1_3_0= ruleTemporal ) )
            	    // InternalSedml.g:1521:5: (lv_op1_3_0= ruleTemporal )
            	    {
            	    // InternalSedml.g:1521:5: (lv_op1_3_0= ruleTemporal )
            	    // InternalSedml.g:1522:6: lv_op1_3_0= ruleTemporal
            	    {

            	    						newCompositeNode(grammarAccess.getTemporalPatternAccess().getOp1TemporalEnumRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_59);
            	    lv_op1_3_0=ruleTemporal();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op1",
            	    							lv_op1_3_0,
            	    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.Temporal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSedml.g:1540:4: ( (lv_op2_4_0= ruleLogical ) )
            	    {
            	    // InternalSedml.g:1540:4: ( (lv_op2_4_0= ruleLogical ) )
            	    // InternalSedml.g:1541:5: (lv_op2_4_0= ruleLogical )
            	    {
            	    // InternalSedml.g:1541:5: (lv_op2_4_0= ruleLogical )
            	    // InternalSedml.g:1542:6: lv_op2_4_0= ruleLogical
            	    {

            	    						newCompositeNode(grammarAccess.getTemporalPatternAccess().getOp2LogicalEnumRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_59);
            	    lv_op2_4_0=ruleLogical();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op2",
            	    							lv_op2_4_0,
            	    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.Logical");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalSedml.g:1560:3: ( (lv_l3_5_0= ruleLinks ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==22||LA47_0==26||(LA47_0>=104 && LA47_0<=105)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSedml.g:1561:4: (lv_l3_5_0= ruleLinks )
                    {
                    // InternalSedml.g:1561:4: (lv_l3_5_0= ruleLinks )
                    // InternalSedml.g:1562:5: lv_l3_5_0= ruleLinks
                    {

                    					newCompositeNode(grammarAccess.getTemporalPatternAccess().getL3LinksEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_l3_5_0=ruleLinks();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
                    					}
                    					set(
                    						current,
                    						"l3",
                    						lv_l3_5_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.Links");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleTemporalPattern"


    // $ANTLR start "entryRuleCondition"
    // InternalSedml.g:1583:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSedml.g:1583:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSedml.g:1584:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalSedml.g:1590:1: ruleCondition returns [EObject current=null] : ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_v_4_0=null;
        EObject lv_condition_0_0 = null;

        AntlrDatatypeRuleToken lv_lo_1_0 = null;

        EObject lv_e_2_0 = null;

        Enumerator lv_exp1_3_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1596:2: ( ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? ) )
            // InternalSedml.g:1597:2: ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? )
            {
            // InternalSedml.g:1597:2: ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? )
            // InternalSedml.g:1598:3: ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )?
            {
            // InternalSedml.g:1598:3: ( (lv_condition_0_0= ruleEvent ) )
            // InternalSedml.g:1599:4: (lv_condition_0_0= ruleEvent )
            {
            // InternalSedml.g:1599:4: (lv_condition_0_0= ruleEvent )
            // InternalSedml.g:1600:5: lv_condition_0_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getConditionEventParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_60);
            lv_condition_0_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:1617:3: ( (lv_lo_1_0= ruleLinkOperators ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=39 && LA48_0<=53)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSedml.g:1618:4: (lv_lo_1_0= ruleLinkOperators )
                    {
                    // InternalSedml.g:1618:4: (lv_lo_1_0= ruleLinkOperators )
                    // InternalSedml.g:1619:5: lv_lo_1_0= ruleLinkOperators
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getLoLinkOperatorsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_61);
                    lv_lo_1_0=ruleLinkOperators();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionRule());
                    					}
                    					set(
                    						current,
                    						"lo",
                    						lv_lo_1_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.LinkOperators");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:1636:3: ( (lv_e_2_0= ruleEvent ) )?
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalSedml.g:1637:4: (lv_e_2_0= ruleEvent )
                    {
                    // InternalSedml.g:1637:4: (lv_e_2_0= ruleEvent )
                    // InternalSedml.g:1638:5: lv_e_2_0= ruleEvent
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getEEventParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_62);
                    lv_e_2_0=ruleEvent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionRule());
                    					}
                    					set(
                    						current,
                    						"e",
                    						lv_e_2_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.Event");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:1655:3: ( (lv_exp1_3_0= ruleExpression ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==102) ) {
                alt50=1;
            }
            else if ( (LA50_0==103) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSedml.g:1656:4: (lv_exp1_3_0= ruleExpression )
                    {
                    // InternalSedml.g:1656:4: (lv_exp1_3_0= ruleExpression )
                    // InternalSedml.g:1657:5: lv_exp1_3_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getExp1ExpressionEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_63);
                    lv_exp1_3_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionRule());
                    					}
                    					set(
                    						current,
                    						"exp1",
                    						lv_exp1_3_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:1674:3: ( (lv_v_4_0= RULE_RANGEVALUE ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_RANGEVALUE) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSedml.g:1675:4: (lv_v_4_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:1675:4: (lv_v_4_0= RULE_RANGEVALUE )
                    // InternalSedml.g:1676:5: lv_v_4_0= RULE_RANGEVALUE
                    {
                    lv_v_4_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_2); 

                    					newLeafNode(lv_v_4_0, grammarAccess.getConditionAccess().getVRangeValueTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConditionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"v",
                    						lv_v_4_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.rangeValue");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleLinkOperators"
    // InternalSedml.g:1696:1: entryRuleLinkOperators returns [String current=null] : iv_ruleLinkOperators= ruleLinkOperators EOF ;
    public final String entryRuleLinkOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLinkOperators = null;


        try {
            // InternalSedml.g:1696:53: (iv_ruleLinkOperators= ruleLinkOperators EOF )
            // InternalSedml.g:1697:2: iv_ruleLinkOperators= ruleLinkOperators EOF
            {
             newCompositeNode(grammarAccess.getLinkOperatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkOperators=ruleLinkOperators();

            state._fsp--;

             current =iv_ruleLinkOperators.getText(); 
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
    // $ANTLR end "entryRuleLinkOperators"


    // $ANTLR start "ruleLinkOperators"
    // InternalSedml.g:1703:1: ruleLinkOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleLinkOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSedml.g:1709:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' ) )
            // InternalSedml.g:1710:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' )
            {
            // InternalSedml.g:1710:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' )
            int alt52=15;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt52=1;
                }
                break;
            case 40:
                {
                alt52=2;
                }
                break;
            case 41:
                {
                alt52=3;
                }
                break;
            case 42:
                {
                alt52=4;
                }
                break;
            case 43:
                {
                alt52=5;
                }
                break;
            case 44:
                {
                alt52=6;
                }
                break;
            case 45:
                {
                alt52=7;
                }
                break;
            case 46:
                {
                alt52=8;
                }
                break;
            case 47:
                {
                alt52=9;
                }
                break;
            case 48:
                {
                alt52=10;
                }
                break;
            case 49:
                {
                alt52=11;
                }
                break;
            case 50:
                {
                alt52=12;
                }
                break;
            case 51:
                {
                alt52=13;
                }
                break;
            case 52:
                {
                alt52=14;
                }
                break;
            case 53:
                {
                alt52=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalSedml.g:1711:3: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSedml.g:1717:3: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSedml.g:1723:3: kw= '*'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSedml.g:1729:3: kw= '/'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSedml.g:1735:3: kw= '%'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getPercentSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSedml.g:1741:3: kw= ' = '
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getSpaceEqualsSignSpaceKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSedml.g:1747:3: kw= ' == '
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getSpaceEqualsSignEqualsSignSpaceKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSedml.g:1753:3: kw= '&&'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getAmpersandAmpersandKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSedml.g:1759:3: kw= '||'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getVerticalLineVerticalLineKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalSedml.g:1765:3: kw= '<'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getLessThanSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalSedml.g:1771:3: kw= '<='
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getLessThanSignEqualsSignKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalSedml.g:1777:3: kw= '>'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getGreaterThanSignKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalSedml.g:1783:3: kw= '>='
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getGreaterThanSignEqualsSignKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalSedml.g:1789:3: kw= '!'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getExclamationMarkKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalSedml.g:1795:3: kw= '!='
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getExclamationMarkEqualsSignKeyword_14());
                    		

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
    // $ANTLR end "ruleLinkOperators"


    // $ANTLR start "entryRuleEvent"
    // InternalSedml.g:1804:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalSedml.g:1804:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalSedml.g:1805:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalSedml.g:1811:1: ruleEvent returns [EObject current=null] : (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_Dispersed_0 = null;

        EObject this_Simultaneous_1 = null;



        	enterRule();

        try {
            // InternalSedml.g:1817:2: ( (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous ) )
            // InternalSedml.g:1818:2: (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous )
            {
            // InternalSedml.g:1818:2: (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            else if ( (LA53_0==54) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalSedml.g:1819:3: this_Dispersed_0= ruleDispersed
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getDispersedParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dispersed_0=ruleDispersed();

                    state._fsp--;


                    			current = this_Dispersed_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSedml.g:1828:3: this_Simultaneous_1= ruleSimultaneous
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getSimultaneousParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Simultaneous_1=ruleSimultaneous();

                    state._fsp--;


                    			current = this_Simultaneous_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleSimultaneous"
    // InternalSedml.g:1840:1: entryRuleSimultaneous returns [EObject current=null] : iv_ruleSimultaneous= ruleSimultaneous EOF ;
    public final EObject entryRuleSimultaneous() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimultaneous = null;


        try {
            // InternalSedml.g:1840:53: (iv_ruleSimultaneous= ruleSimultaneous EOF )
            // InternalSedml.g:1841:2: iv_ruleSimultaneous= ruleSimultaneous EOF
            {
             newCompositeNode(grammarAccess.getSimultaneousRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimultaneous=ruleSimultaneous();

            state._fsp--;

             current =iv_ruleSimultaneous; 
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
    // $ANTLR end "entryRuleSimultaneous"


    // $ANTLR start "ruleSimultaneous"
    // InternalSedml.g:1847:1: ruleSimultaneous returns [EObject current=null] : (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSimultaneous() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_sim1_1_0 = null;

        Enumerator lv_log_2_0 = null;

        AntlrDatatypeRuleToken lv_sim2_3_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1853:2: ( (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' ) )
            // InternalSedml.g:1854:2: (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' )
            {
            // InternalSedml.g:1854:2: (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' )
            // InternalSedml.g:1855:3: otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getSimultaneousAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSedml.g:1859:3: ( (lv_sim1_1_0= ruleRe ) )
            // InternalSedml.g:1860:4: (lv_sim1_1_0= ruleRe )
            {
            // InternalSedml.g:1860:4: (lv_sim1_1_0= ruleRe )
            // InternalSedml.g:1861:5: lv_sim1_1_0= ruleRe
            {

            					newCompositeNode(grammarAccess.getSimultaneousAccess().getSim1ReParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_64);
            lv_sim1_1_0=ruleRe();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimultaneousRule());
            					}
            					set(
            						current,
            						"sim1",
            						lv_sim1_1_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.Re");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:1878:3: ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==29||(LA54_0>=117 && LA54_0<=118)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalSedml.g:1879:4: ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) )
            	    {
            	    // InternalSedml.g:1879:4: ( (lv_log_2_0= ruleLogical ) )
            	    // InternalSedml.g:1880:5: (lv_log_2_0= ruleLogical )
            	    {
            	    // InternalSedml.g:1880:5: (lv_log_2_0= ruleLogical )
            	    // InternalSedml.g:1881:6: lv_log_2_0= ruleLogical
            	    {

            	    						newCompositeNode(grammarAccess.getSimultaneousAccess().getLogLogicalEnumRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_log_2_0=ruleLogical();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimultaneousRule());
            	    						}
            	    						add(
            	    							current,
            	    							"log",
            	    							lv_log_2_0,
            	    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.Logical");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalSedml.g:1898:4: ( (lv_sim2_3_0= ruleRe ) )
            	    // InternalSedml.g:1899:5: (lv_sim2_3_0= ruleRe )
            	    {
            	    // InternalSedml.g:1899:5: (lv_sim2_3_0= ruleRe )
            	    // InternalSedml.g:1900:6: lv_sim2_3_0= ruleRe
            	    {

            	    						newCompositeNode(grammarAccess.getSimultaneousAccess().getSim2ReParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_64);
            	    lv_sim2_3_0=ruleRe();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimultaneousRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sim2",
            	    							lv_sim2_3_0,
            	    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.Re");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_4=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSimultaneousAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSimultaneous"


    // $ANTLR start "entryRuleDispersed"
    // InternalSedml.g:1926:1: entryRuleDispersed returns [EObject current=null] : iv_ruleDispersed= ruleDispersed EOF ;
    public final EObject entryRuleDispersed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDispersed = null;


        try {
            // InternalSedml.g:1926:50: (iv_ruleDispersed= ruleDispersed EOF )
            // InternalSedml.g:1927:2: iv_ruleDispersed= ruleDispersed EOF
            {
             newCompositeNode(grammarAccess.getDispersedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDispersed=ruleDispersed();

            state._fsp--;

             current =iv_ruleDispersed; 
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
    // $ANTLR end "entryRuleDispersed"


    // $ANTLR start "ruleDispersed"
    // InternalSedml.g:1933:1: ruleDispersed returns [EObject current=null] : ( (lv_disp_0_0= ruleRe ) )+ ;
    public final EObject ruleDispersed() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_disp_0_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1939:2: ( ( (lv_disp_0_0= ruleRe ) )+ )
            // InternalSedml.g:1940:2: ( (lv_disp_0_0= ruleRe ) )+
            {
            // InternalSedml.g:1940:2: ( (lv_disp_0_0= ruleRe ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalSedml.g:1941:3: (lv_disp_0_0= ruleRe )
            	    {
            	    // InternalSedml.g:1941:3: (lv_disp_0_0= ruleRe )
            	    // InternalSedml.g:1942:4: lv_disp_0_0= ruleRe
            	    {

            	    				newCompositeNode(grammarAccess.getDispersedAccess().getDispReParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_38);
            	    lv_disp_0_0=ruleRe();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDispersedRule());
            	    				}
            	    				add(
            	    					current,
            	    					"disp",
            	    					lv_disp_0_0,
            	    					"tr.edu.metu.ceng.megamodel.sedml.Sedml.Re");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);


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
    // $ANTLR end "ruleDispersed"


    // $ANTLR start "entryRuleRe"
    // InternalSedml.g:1962:1: entryRuleRe returns [String current=null] : iv_ruleRe= ruleRe EOF ;
    public final String entryRuleRe() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRe = null;


        try {
            // InternalSedml.g:1962:42: (iv_ruleRe= ruleRe EOF )
            // InternalSedml.g:1963:2: iv_ruleRe= ruleRe EOF
            {
             newCompositeNode(grammarAccess.getReRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRe=ruleRe();

            state._fsp--;

             current =iv_ruleRe.getText(); 
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
    // $ANTLR end "entryRuleRe"


    // $ANTLR start "ruleRe"
    // InternalSedml.g:1969:1: ruleRe returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleRe() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalSedml.g:1975:2: ( (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? ) )
            // InternalSedml.g:1976:2: (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? )
            {
            // InternalSedml.g:1976:2: (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? )
            // InternalSedml.g:1977:3: this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_65); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getReAccess().getIDTerminalRuleCall_0());
            		
            // InternalSedml.g:1984:3: (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==34) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSedml.g:1985:4: kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')'
                    {
                    kw=(Token)match(input,34,FOLLOW_53); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalSedml.g:1990:4: (this_ID_2= RULE_ID this_ID_3= RULE_ID )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_ID) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalSedml.g:1991:5: this_ID_2= RULE_ID this_ID_3= RULE_ID
                            {
                            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_31); 

                            					current.merge(this_ID_2);
                            				

                            					newLeafNode(this_ID_2, grammarAccess.getReAccess().getIDTerminalRuleCall_1_1_0());
                            				
                            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_66); 

                            					current.merge(this_ID_3);
                            				

                            					newLeafNode(this_ID_3, grammarAccess.getReAccess().getIDTerminalRuleCall_1_1_1());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,35,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleRe"


    // $ANTLR start "entryRulelistOfModels"
    // InternalSedml.g:2016:1: entryRulelistOfModels returns [EObject current=null] : iv_rulelistOfModels= rulelistOfModels EOF ;
    public final EObject entryRulelistOfModels() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfModels = null;


        try {
            // InternalSedml.g:2016:53: (iv_rulelistOfModels= rulelistOfModels EOF )
            // InternalSedml.g:2017:2: iv_rulelistOfModels= rulelistOfModels EOF
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
    // InternalSedml.g:2023:1: rulelistOfModels returns [EObject current=null] : (otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfModels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_model_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:2029:2: ( (otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}' ) )
            // InternalSedml.g:2030:2: (otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:2030:2: (otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}' )
            // InternalSedml.g:2031:3: otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfModelsAccess().getListOfModelsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_67); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfModelsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:2039:3: ( (lv_model_2_0= rulemodel ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==19) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalSedml.g:2040:4: (lv_model_2_0= rulemodel )
            	    {
            	    // InternalSedml.g:2040:4: (lv_model_2_0= rulemodel )
            	    // InternalSedml.g:2041:5: lv_model_2_0= rulemodel
            	    {

            	    					newCompositeNode(grammarAccess.getListOfModelsAccess().getModelModelParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_67);
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
            	    break loop58;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSedml.g:2066:1: entryRulemodel returns [EObject current=null] : iv_rulemodel= rulemodel EOF ;
    public final EObject entryRulemodel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemodel = null;


        try {
            // InternalSedml.g:2066:46: (iv_rulemodel= rulemodel EOF )
            // InternalSedml.g:2067:2: iv_rulemodel= rulemodel EOF
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
    // InternalSedml.g:2073:1: rulemodel returns [EObject current=null] : (otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' ) ;
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
            // InternalSedml.g:2079:2: ( (otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' ) )
            // InternalSedml.g:2080:2: (otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' )
            {
            // InternalSedml.g:2080:2: (otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' )
            // InternalSedml.g:2081:3: otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getColonKeyword_3());
            		
            // InternalSedml.g:2097:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:2098:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:2098:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:2099:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_69); 

            					newLeafNode(lv_id_4_0, grammarAccess.getModelAccess().getIdIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,58,FOLLOW_54); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLanguageKeyword_5());
            		
            otherlv_6=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getColonKeyword_6());
            		
            // InternalSedml.g:2123:3: ( (lv_language_7_0= RULE_STRING ) )
            // InternalSedml.g:2124:4: (lv_language_7_0= RULE_STRING )
            {
            // InternalSedml.g:2124:4: (lv_language_7_0= RULE_STRING )
            // InternalSedml.g:2125:5: lv_language_7_0= RULE_STRING
            {
            lv_language_7_0=(Token)match(input,RULE_STRING,FOLLOW_71); 

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

            otherlv_8=(Token)match(input,59,FOLLOW_54); 

            			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getSourceKeyword_8());
            		
            otherlv_9=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getColonKeyword_9());
            		
            // InternalSedml.g:2149:3: ( (lv_source_10_0= RULE_STRING ) )
            // InternalSedml.g:2150:4: (lv_source_10_0= RULE_STRING )
            {
            // InternalSedml.g:2150:4: (lv_source_10_0= RULE_STRING )
            // InternalSedml.g:2151:5: lv_source_10_0= RULE_STRING
            {
            lv_source_10_0=(Token)match(input,RULE_STRING,FOLLOW_72); 

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

            otherlv_11=(Token)match(input,60,FOLLOW_54); 

            			newLeafNode(otherlv_11, grammarAccess.getModelAccess().getNameKeyword_11());
            		
            otherlv_12=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_12, grammarAccess.getModelAccess().getColonKeyword_12());
            		
            // InternalSedml.g:2175:3: ( (lv_name_13_0= RULE_STRING ) )
            // InternalSedml.g:2176:4: (lv_name_13_0= RULE_STRING )
            {
            // InternalSedml.g:2176:4: (lv_name_13_0= RULE_STRING )
            // InternalSedml.g:2177:5: lv_name_13_0= RULE_STRING
            {
            lv_name_13_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuledataGenerator"
    // InternalSedml.g:2201:1: entryRuledataGenerator returns [EObject current=null] : iv_ruledataGenerator= ruledataGenerator EOF ;
    public final EObject entryRuledataGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledataGenerator = null;


        try {
            // InternalSedml.g:2201:54: (iv_ruledataGenerator= ruledataGenerator EOF )
            // InternalSedml.g:2202:2: iv_ruledataGenerator= ruledataGenerator EOF
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
    // InternalSedml.g:2208:1: ruledataGenerator returns [EObject current=null] : (otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfVariables_8_0= rulelistOfVariables ) )? ( (lv_math_9_0= rulemath ) )? otherlv_10= '}' ) ;
    public final EObject ruledataGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_10=null;
        EObject lv_listOfVariables_8_0 = null;

        EObject lv_math_9_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:2214:2: ( (otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfVariables_8_0= rulelistOfVariables ) )? ( (lv_math_9_0= rulemath ) )? otherlv_10= '}' ) )
            // InternalSedml.g:2215:2: (otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfVariables_8_0= rulelistOfVariables ) )? ( (lv_math_9_0= rulemath ) )? otherlv_10= '}' )
            {
            // InternalSedml.g:2215:2: (otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfVariables_8_0= rulelistOfVariables ) )? ( (lv_math_9_0= rulemath ) )? otherlv_10= '}' )
            // InternalSedml.g:2216:3: otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfVariables_8_0= rulelistOfVariables ) )? ( (lv_math_9_0= rulemath ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDataGeneratorAccess().getDataGeneratorKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getDataGeneratorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getDataGeneratorAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getDataGeneratorAccess().getColonKeyword_3());
            		
            // InternalSedml.g:2232:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:2233:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:2233:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:2234:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_72); 

            					newLeafNode(lv_id_4_0, grammarAccess.getDataGeneratorAccess().getIdIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataGeneratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,60,FOLLOW_54); 

            			newLeafNode(otherlv_5, grammarAccess.getDataGeneratorAccess().getNameKeyword_5());
            		
            otherlv_6=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_6, grammarAccess.getDataGeneratorAccess().getColonKeyword_6());
            		
            // InternalSedml.g:2258:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalSedml.g:2259:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalSedml.g:2259:4: (lv_name_7_0= RULE_STRING )
            // InternalSedml.g:2260:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_73); 

            					newLeafNode(lv_name_7_0, grammarAccess.getDataGeneratorAccess().getNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataGeneratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSedml.g:2276:3: ( (lv_listOfVariables_8_0= rulelistOfVariables ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==62) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSedml.g:2277:4: (lv_listOfVariables_8_0= rulelistOfVariables )
                    {
                    // InternalSedml.g:2277:4: (lv_listOfVariables_8_0= rulelistOfVariables )
                    // InternalSedml.g:2278:5: lv_listOfVariables_8_0= rulelistOfVariables
                    {

                    					newCompositeNode(grammarAccess.getDataGeneratorAccess().getListOfVariablesListOfVariablesParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_74);
                    lv_listOfVariables_8_0=rulelistOfVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataGeneratorRule());
                    					}
                    					set(
                    						current,
                    						"listOfVariables",
                    						lv_listOfVariables_8_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfVariables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:2295:3: ( (lv_math_9_0= rulemath ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==72) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSedml.g:2296:4: (lv_math_9_0= rulemath )
                    {
                    // InternalSedml.g:2296:4: (lv_math_9_0= rulemath )
                    // InternalSedml.g:2297:5: lv_math_9_0= rulemath
                    {

                    					newCompositeNode(grammarAccess.getDataGeneratorAccess().getMathMathParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_math_9_0=rulemath();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataGeneratorRule());
                    					}
                    					set(
                    						current,
                    						"math",
                    						lv_math_9_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.math");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSedml.g:2322:1: entryRulelistOfVariables returns [EObject current=null] : iv_rulelistOfVariables= rulelistOfVariables EOF ;
    public final EObject entryRulelistOfVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfVariables = null;


        try {
            // InternalSedml.g:2322:56: (iv_rulelistOfVariables= rulelistOfVariables EOF )
            // InternalSedml.g:2323:2: iv_rulelistOfVariables= rulelistOfVariables EOF
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
    // InternalSedml.g:2329:1: rulelistOfVariables returns [EObject current=null] : (otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:2335:2: ( (otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}' ) )
            // InternalSedml.g:2336:2: (otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:2336:2: (otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}' )
            // InternalSedml.g:2337:3: otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfVariablesAccess().getListOfDataVariablesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_75); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfVariablesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:2345:3: ( (lv_variable_2_0= rulevariable ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==63) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalSedml.g:2346:4: (lv_variable_2_0= rulevariable )
            	    {
            	    // InternalSedml.g:2346:4: (lv_variable_2_0= rulevariable )
            	    // InternalSedml.g:2347:5: lv_variable_2_0= rulevariable
            	    {

            	    					newCompositeNode(grammarAccess.getListOfVariablesAccess().getVariableVariableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_75);
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
            	    break loop61;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSedml.g:2372:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalSedml.g:2372:49: (iv_rulevariable= rulevariable EOF )
            // InternalSedml.g:2373:2: iv_rulevariable= rulevariable EOF
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
    // InternalSedml.g:2379:1: rulevariable returns [EObject current=null] : (otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'target' otherlv_6= ':' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= 'taskReference' otherlv_9= ':' ( (lv_taskReference_10_0= ruletask ) ) otherlv_11= 'symbol' otherlv_12= ':' ( (lv_symbol_13_0= RULE_STRING ) ) otherlv_14= '}' ) ;
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
            // InternalSedml.g:2385:2: ( (otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'target' otherlv_6= ':' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= 'taskReference' otherlv_9= ':' ( (lv_taskReference_10_0= ruletask ) ) otherlv_11= 'symbol' otherlv_12= ':' ( (lv_symbol_13_0= RULE_STRING ) ) otherlv_14= '}' ) )
            // InternalSedml.g:2386:2: (otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'target' otherlv_6= ':' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= 'taskReference' otherlv_9= ':' ( (lv_taskReference_10_0= ruletask ) ) otherlv_11= 'symbol' otherlv_12= ':' ( (lv_symbol_13_0= RULE_STRING ) ) otherlv_14= '}' )
            {
            // InternalSedml.g:2386:2: (otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'target' otherlv_6= ':' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= 'taskReference' otherlv_9= ':' ( (lv_taskReference_10_0= ruletask ) ) otherlv_11= 'symbol' otherlv_12= ':' ( (lv_symbol_13_0= RULE_STRING ) ) otherlv_14= '}' )
            // InternalSedml.g:2387:3: otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'target' otherlv_6= ':' ( (lv_target_7_0= RULE_STRING ) ) otherlv_8= 'taskReference' otherlv_9= ':' ( (lv_taskReference_10_0= ruletask ) ) otherlv_11= 'symbol' otherlv_12= ':' ( (lv_symbol_13_0= RULE_STRING ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getColonKeyword_3());
            		
            // InternalSedml.g:2403:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:2404:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:2404:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:2405:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_76); 

            					newLeafNode(lv_id_4_0, grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,64,FOLLOW_54); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getTargetKeyword_5());
            		
            otherlv_6=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getColonKeyword_6());
            		
            // InternalSedml.g:2429:3: ( (lv_target_7_0= RULE_STRING ) )
            // InternalSedml.g:2430:4: (lv_target_7_0= RULE_STRING )
            {
            // InternalSedml.g:2430:4: (lv_target_7_0= RULE_STRING )
            // InternalSedml.g:2431:5: lv_target_7_0= RULE_STRING
            {
            lv_target_7_0=(Token)match(input,RULE_STRING,FOLLOW_77); 

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

            otherlv_8=(Token)match(input,65,FOLLOW_54); 

            			newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getTaskReferenceKeyword_8());
            		
            otherlv_9=(Token)match(input,36,FOLLOW_78); 

            			newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getColonKeyword_9());
            		
            // InternalSedml.g:2455:3: ( (lv_taskReference_10_0= ruletask ) )
            // InternalSedml.g:2456:4: (lv_taskReference_10_0= ruletask )
            {
            // InternalSedml.g:2456:4: (lv_taskReference_10_0= ruletask )
            // InternalSedml.g:2457:5: lv_taskReference_10_0= ruletask
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTaskReferenceTaskParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_79);
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

            otherlv_11=(Token)match(input,66,FOLLOW_54); 

            			newLeafNode(otherlv_11, grammarAccess.getVariableAccess().getSymbolKeyword_11());
            		
            otherlv_12=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getColonKeyword_12());
            		
            // InternalSedml.g:2482:3: ( (lv_symbol_13_0= RULE_STRING ) )
            // InternalSedml.g:2483:4: (lv_symbol_13_0= RULE_STRING )
            {
            // InternalSedml.g:2483:4: (lv_symbol_13_0= RULE_STRING )
            // InternalSedml.g:2484:5: lv_symbol_13_0= RULE_STRING
            {
            lv_symbol_13_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRulelistOfTasks"
    // InternalSedml.g:2508:1: entryRulelistOfTasks returns [EObject current=null] : iv_rulelistOfTasks= rulelistOfTasks EOF ;
    public final EObject entryRulelistOfTasks() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfTasks = null;


        try {
            // InternalSedml.g:2508:52: (iv_rulelistOfTasks= rulelistOfTasks EOF )
            // InternalSedml.g:2509:2: iv_rulelistOfTasks= rulelistOfTasks EOF
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
    // InternalSedml.g:2515:1: rulelistOfTasks returns [EObject current=null] : (otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfTasks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_task_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:2521:2: ( (otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* otherlv_3= '}' ) )
            // InternalSedml.g:2522:2: (otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:2522:2: (otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* otherlv_3= '}' )
            // InternalSedml.g:2523:3: otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfTasksAccess().getListOfTasksKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_80); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfTasksAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:2531:3: ( (lv_task_2_0= ruletask ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==68) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalSedml.g:2532:4: (lv_task_2_0= ruletask )
            	    {
            	    // InternalSedml.g:2532:4: (lv_task_2_0= ruletask )
            	    // InternalSedml.g:2533:5: lv_task_2_0= ruletask
            	    {

            	    					newCompositeNode(grammarAccess.getListOfTasksAccess().getTaskTaskParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_80);
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
            	    break loop62;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSedml.g:2558:1: entryRuletask returns [EObject current=null] : iv_ruletask= ruletask EOF ;
    public final EObject entryRuletask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletask = null;


        try {
            // InternalSedml.g:2558:45: (iv_ruletask= ruletask EOF )
            // InternalSedml.g:2559:2: iv_ruletask= ruletask EOF
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
    // InternalSedml.g:2565:1: ruletask returns [EObject current=null] : (otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' ) ;
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
            // InternalSedml.g:2571:2: ( (otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' ) )
            // InternalSedml.g:2572:2: (otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' )
            {
            // InternalSedml.g:2572:2: (otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' )
            // InternalSedml.g:2573:3: otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getColonKeyword_3());
            		
            // InternalSedml.g:2589:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:2590:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:2590:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:2591:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_81); 

            					newLeafNode(lv_id_4_0, grammarAccess.getTaskAccess().getIdIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,69,FOLLOW_54); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getModelReferenceKeyword_5());
            		
            otherlv_6=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getColonKeyword_6());
            		
            // InternalSedml.g:2615:3: ( (lv_modelReference_7_0= rulemodel ) )
            // InternalSedml.g:2616:4: (lv_modelReference_7_0= rulemodel )
            {
            // InternalSedml.g:2616:4: (lv_modelReference_7_0= rulemodel )
            // InternalSedml.g:2617:5: lv_modelReference_7_0= rulemodel
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getModelReferenceModelParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_82);
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

            otherlv_8=(Token)match(input,70,FOLLOW_54); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getSimulationReferenceKeyword_8());
            		
            otherlv_9=(Token)match(input,36,FOLLOW_83); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getColonKeyword_9());
            		
            // InternalSedml.g:2642:3: ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) )
            // InternalSedml.g:2643:4: (lv_simulationReference_10_0= ruleuniformTimeCourse )
            {
            // InternalSedml.g:2643:4: (lv_simulationReference_10_0= ruleuniformTimeCourse )
            // InternalSedml.g:2644:5: lv_simulationReference_10_0= ruleuniformTimeCourse
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getSimulationReferenceUniformTimeCourseParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_72);
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

            otherlv_11=(Token)match(input,60,FOLLOW_54); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getNameKeyword_11());
            		
            otherlv_12=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getColonKeyword_12());
            		
            // InternalSedml.g:2669:3: ( (lv_name_13_0= RULE_STRING ) )
            // InternalSedml.g:2670:4: (lv_name_13_0= RULE_STRING )
            {
            // InternalSedml.g:2670:4: (lv_name_13_0= RULE_STRING )
            // InternalSedml.g:2671:5: lv_name_13_0= RULE_STRING
            {
            lv_name_13_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSedml.g:2695:1: entryRulelistOfDataGenerators returns [EObject current=null] : iv_rulelistOfDataGenerators= rulelistOfDataGenerators EOF ;
    public final EObject entryRulelistOfDataGenerators() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfDataGenerators = null;


        try {
            // InternalSedml.g:2695:61: (iv_rulelistOfDataGenerators= rulelistOfDataGenerators EOF )
            // InternalSedml.g:2696:2: iv_rulelistOfDataGenerators= rulelistOfDataGenerators EOF
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
    // InternalSedml.g:2702:1: rulelistOfDataGenerators returns [EObject current=null] : (otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfDataGenerators() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_datagenerator_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:2708:2: ( (otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}' ) )
            // InternalSedml.g:2709:2: (otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:2709:2: (otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}' )
            // InternalSedml.g:2710:3: otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfDataGeneratorsAccess().getListOfDataGeneratorsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_84); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfDataGeneratorsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:2718:3: ( (lv_datagenerator_2_0= ruledataGenerator ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==61) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalSedml.g:2719:4: (lv_datagenerator_2_0= ruledataGenerator )
            	    {
            	    // InternalSedml.g:2719:4: (lv_datagenerator_2_0= ruledataGenerator )
            	    // InternalSedml.g:2720:5: lv_datagenerator_2_0= ruledataGenerator
            	    {

            	    					newCompositeNode(grammarAccess.getListOfDataGeneratorsAccess().getDatageneratorDataGeneratorParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_84);
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
            	    break loop63;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRulemath"
    // InternalSedml.g:2745:1: entryRulemath returns [EObject current=null] : iv_rulemath= rulemath EOF ;
    public final EObject entryRulemath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemath = null;


        try {
            // InternalSedml.g:2745:45: (iv_rulemath= rulemath EOF )
            // InternalSedml.g:2746:2: iv_rulemath= rulemath EOF
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
    // InternalSedml.g:2752:1: rulemath returns [EObject current=null] : (otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
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
            // InternalSedml.g:2758:2: ( (otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalSedml.g:2759:2: (otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalSedml.g:2759:2: (otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalSedml.g:2760:3: otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMathAccess().getMathKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_85); 

            			newLeafNode(otherlv_1, grammarAccess.getMathAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,73,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getMathAccess().getXlmsKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getMathAccess().getColonKeyword_3());
            		
            // InternalSedml.g:2776:3: ( (lv_xlms_4_0= RULE_STRING ) )
            // InternalSedml.g:2777:4: (lv_xlms_4_0= RULE_STRING )
            {
            // InternalSedml.g:2777:4: (lv_xlms_4_0= RULE_STRING )
            // InternalSedml.g:2778:5: lv_xlms_4_0= RULE_STRING
            {
            lv_xlms_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSedml.g:2802:1: entryRulelistOfOutputs returns [EObject current=null] : iv_rulelistOfOutputs= rulelistOfOutputs EOF ;
    public final EObject entryRulelistOfOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfOutputs = null;


        try {
            // InternalSedml.g:2802:54: (iv_rulelistOfOutputs= rulelistOfOutputs EOF )
            // InternalSedml.g:2803:2: iv_rulelistOfOutputs= rulelistOfOutputs EOF
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
    // InternalSedml.g:2809:1: rulelistOfOutputs returns [EObject current=null] : (otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_plot2D_2_0= ruleplot2D ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfOutputs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_plot2D_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:2815:2: ( (otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_plot2D_2_0= ruleplot2D ) )* otherlv_3= '}' ) )
            // InternalSedml.g:2816:2: (otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_plot2D_2_0= ruleplot2D ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:2816:2: (otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_plot2D_2_0= ruleplot2D ) )* otherlv_3= '}' )
            // InternalSedml.g:2817:3: otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_plot2D_2_0= ruleplot2D ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfOutputsAccess().getListOfOutputsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_86); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfOutputsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:2825:3: ( (lv_plot2D_2_0= ruleplot2D ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==75) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalSedml.g:2826:4: (lv_plot2D_2_0= ruleplot2D )
            	    {
            	    // InternalSedml.g:2826:4: (lv_plot2D_2_0= ruleplot2D )
            	    // InternalSedml.g:2827:5: lv_plot2D_2_0= ruleplot2D
            	    {

            	    					newCompositeNode(grammarAccess.getListOfOutputsAccess().getPlot2DPlot2DParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_86);
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
            	    break loop64;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSedml.g:2852:1: entryRuleplot2D returns [EObject current=null] : iv_ruleplot2D= ruleplot2D EOF ;
    public final EObject entryRuleplot2D() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleplot2D = null;


        try {
            // InternalSedml.g:2852:47: (iv_ruleplot2D= ruleplot2D EOF )
            // InternalSedml.g:2853:2: iv_ruleplot2D= ruleplot2D EOF
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
    // InternalSedml.g:2859:1: ruleplot2D returns [EObject current=null] : (otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}' ) ;
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
            // InternalSedml.g:2865:2: ( (otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}' ) )
            // InternalSedml.g:2866:2: (otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}' )
            {
            // InternalSedml.g:2866:2: (otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}' )
            // InternalSedml.g:2867:3: otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPlot2DAccess().getPlot2DKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getPlot2DAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getPlot2DAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getPlot2DAccess().getColonKeyword_3());
            		
            // InternalSedml.g:2883:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:2884:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:2884:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:2885:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_72); 

            					newLeafNode(lv_id_4_0, grammarAccess.getPlot2DAccess().getIdIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlot2DRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,60,FOLLOW_54); 

            			newLeafNode(otherlv_5, grammarAccess.getPlot2DAccess().getNameKeyword_5());
            		
            otherlv_6=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_6, grammarAccess.getPlot2DAccess().getColonKeyword_6());
            		
            // InternalSedml.g:2909:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalSedml.g:2910:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalSedml.g:2910:4: (lv_name_7_0= RULE_STRING )
            // InternalSedml.g:2911:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_87); 

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

            // InternalSedml.g:2927:3: ( (lv_listOfCurves_8_0= rulelistOfCurves ) )
            // InternalSedml.g:2928:4: (lv_listOfCurves_8_0= rulelistOfCurves )
            {
            // InternalSedml.g:2928:4: (lv_listOfCurves_8_0= rulelistOfCurves )
            // InternalSedml.g:2929:5: lv_listOfCurves_8_0= rulelistOfCurves
            {

            					newCompositeNode(grammarAccess.getPlot2DAccess().getListOfCurvesListOfCurvesParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSedml.g:2954:1: entryRulelistOfCurves returns [EObject current=null] : iv_rulelistOfCurves= rulelistOfCurves EOF ;
    public final EObject entryRulelistOfCurves() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfCurves = null;


        try {
            // InternalSedml.g:2954:53: (iv_rulelistOfCurves= rulelistOfCurves EOF )
            // InternalSedml.g:2955:2: iv_rulelistOfCurves= rulelistOfCurves EOF
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
    // InternalSedml.g:2961:1: rulelistOfCurves returns [EObject current=null] : (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfCurves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_curve_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:2967:2: ( (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}' ) )
            // InternalSedml.g:2968:2: (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:2968:2: (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}' )
            // InternalSedml.g:2969:3: otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfCurvesAccess().getListOfCurvesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_88); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfCurvesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:2977:3: ( (lv_curve_2_0= rulecurve ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==77) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalSedml.g:2978:4: (lv_curve_2_0= rulecurve )
            	    {
            	    // InternalSedml.g:2978:4: (lv_curve_2_0= rulecurve )
            	    // InternalSedml.g:2979:5: lv_curve_2_0= rulecurve
            	    {

            	    					newCompositeNode(grammarAccess.getListOfCurvesAccess().getCurveCurveParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_88);
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
            	    break loop65;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSedml.g:3004:1: entryRulecurve returns [EObject current=null] : iv_rulecurve= rulecurve EOF ;
    public final EObject entryRulecurve() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecurve = null;


        try {
            // InternalSedml.g:3004:46: (iv_rulecurve= rulecurve EOF )
            // InternalSedml.g:3005:2: iv_rulecurve= rulecurve EOF
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
    // InternalSedml.g:3011:1: rulecurve returns [EObject current=null] : (otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}' ) ;
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
            // InternalSedml.g:3017:2: ( (otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}' ) )
            // InternalSedml.g:3018:2: (otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}' )
            {
            // InternalSedml.g:3018:2: (otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}' )
            // InternalSedml.g:3019:3: otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCurveAccess().getCurveKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getCurveAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getCurveAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getCurveAccess().getColonKeyword_3());
            		
            // InternalSedml.g:3035:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:3036:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:3036:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:3037:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_89); 

            					newLeafNode(lv_id_4_0, grammarAccess.getCurveAccess().getIdIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCurveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,78,FOLLOW_54); 

            			newLeafNode(otherlv_5, grammarAccess.getCurveAccess().getLogXKeyword_5());
            		
            otherlv_6=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_6, grammarAccess.getCurveAccess().getColonKeyword_6());
            		
            // InternalSedml.g:3061:3: ( (lv_logX_7_0= RULE_STRING ) )
            // InternalSedml.g:3062:4: (lv_logX_7_0= RULE_STRING )
            {
            // InternalSedml.g:3062:4: (lv_logX_7_0= RULE_STRING )
            // InternalSedml.g:3063:5: lv_logX_7_0= RULE_STRING
            {
            lv_logX_7_0=(Token)match(input,RULE_STRING,FOLLOW_90); 

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

            otherlv_8=(Token)match(input,79,FOLLOW_54); 

            			newLeafNode(otherlv_8, grammarAccess.getCurveAccess().getLogYKeyword_8());
            		
            otherlv_9=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_9, grammarAccess.getCurveAccess().getColonKeyword_9());
            		
            // InternalSedml.g:3087:3: ( (lv_logY_10_0= RULE_STRING ) )
            // InternalSedml.g:3088:4: (lv_logY_10_0= RULE_STRING )
            {
            // InternalSedml.g:3088:4: (lv_logY_10_0= RULE_STRING )
            // InternalSedml.g:3089:5: lv_logY_10_0= RULE_STRING
            {
            lv_logY_10_0=(Token)match(input,RULE_STRING,FOLLOW_91); 

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

            otherlv_11=(Token)match(input,80,FOLLOW_54); 

            			newLeafNode(otherlv_11, grammarAccess.getCurveAccess().getXDataReferenceKeyword_11());
            		
            otherlv_12=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_12, grammarAccess.getCurveAccess().getColonKeyword_12());
            		
            // InternalSedml.g:3113:3: ( (lv_xDataReference_13_0= RULE_STRING ) )
            // InternalSedml.g:3114:4: (lv_xDataReference_13_0= RULE_STRING )
            {
            // InternalSedml.g:3114:4: (lv_xDataReference_13_0= RULE_STRING )
            // InternalSedml.g:3115:5: lv_xDataReference_13_0= RULE_STRING
            {
            lv_xDataReference_13_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

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

            otherlv_14=(Token)match(input,81,FOLLOW_54); 

            			newLeafNode(otherlv_14, grammarAccess.getCurveAccess().getYDataReferenceKeyword_14());
            		
            otherlv_15=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_15, grammarAccess.getCurveAccess().getColonKeyword_15());
            		
            // InternalSedml.g:3139:3: ( (lv_yDataReference_16_0= RULE_STRING ) )
            // InternalSedml.g:3140:4: (lv_yDataReference_16_0= RULE_STRING )
            {
            // InternalSedml.g:3140:4: (lv_yDataReference_16_0= RULE_STRING )
            // InternalSedml.g:3141:5: lv_yDataReference_16_0= RULE_STRING
            {
            lv_yDataReference_16_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            otherlv_17=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSedml.g:3165:1: entryRulelistOfSimulations returns [EObject current=null] : iv_rulelistOfSimulations= rulelistOfSimulations EOF ;
    public final EObject entryRulelistOfSimulations() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfSimulations = null;


        try {
            // InternalSedml.g:3165:58: (iv_rulelistOfSimulations= rulelistOfSimulations EOF )
            // InternalSedml.g:3166:2: iv_rulelistOfSimulations= rulelistOfSimulations EOF
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
    // InternalSedml.g:3172:1: rulelistOfSimulations returns [EObject current=null] : (otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfSimulations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_uniformTimeCourse_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:3178:2: ( (otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse ) )* otherlv_3= '}' ) )
            // InternalSedml.g:3179:2: (otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:3179:2: (otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse ) )* otherlv_3= '}' )
            // InternalSedml.g:3180:3: otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfSimulationsAccess().getListOfSimulationsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_93); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfSimulationsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:3188:3: ( (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==83) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalSedml.g:3189:4: (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse )
            	    {
            	    // InternalSedml.g:3189:4: (lv_uniformTimeCourse_2_0= ruleuniformTimeCourse )
            	    // InternalSedml.g:3190:5: lv_uniformTimeCourse_2_0= ruleuniformTimeCourse
            	    {

            	    					newCompositeNode(grammarAccess.getListOfSimulationsAccess().getUniformTimeCourseUniformTimeCourseParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_93);
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
            	    break loop66;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSedml.g:3215:1: entryRuleuniformTimeCourse returns [EObject current=null] : iv_ruleuniformTimeCourse= ruleuniformTimeCourse EOF ;
    public final EObject entryRuleuniformTimeCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuniformTimeCourse = null;


        try {
            // InternalSedml.g:3215:58: (iv_ruleuniformTimeCourse= ruleuniformTimeCourse EOF )
            // InternalSedml.g:3216:2: iv_ruleuniformTimeCourse= ruleuniformTimeCourse EOF
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
    // InternalSedml.g:3222:1: ruleuniformTimeCourse returns [EObject current=null] : (otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}' ) ;
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
            // InternalSedml.g:3228:2: ( (otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}' ) )
            // InternalSedml.g:3229:2: (otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}' )
            {
            // InternalSedml.g:3229:2: (otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}' )
            // InternalSedml.g:3230:3: otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUniformTimeCourseAccess().getUniformtimecourseKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getUniformTimeCourseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getUniformTimeCourseAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_3());
            		
            // InternalSedml.g:3246:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:3247:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:3247:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:3248:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_94); 

            					newLeafNode(lv_id_4_0, grammarAccess.getUniformTimeCourseAccess().getIdIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniformTimeCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,84,FOLLOW_54); 

            			newLeafNode(otherlv_5, grammarAccess.getUniformTimeCourseAccess().getInitialTimeKeyword_5());
            		
            otherlv_6=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_6());
            		
            // InternalSedml.g:3272:3: ( (lv_initialTime_7_0= RULE_INT ) )
            // InternalSedml.g:3273:4: (lv_initialTime_7_0= RULE_INT )
            {
            // InternalSedml.g:3273:4: (lv_initialTime_7_0= RULE_INT )
            // InternalSedml.g:3274:5: lv_initialTime_7_0= RULE_INT
            {
            lv_initialTime_7_0=(Token)match(input,RULE_INT,FOLLOW_95); 

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

            otherlv_8=(Token)match(input,85,FOLLOW_54); 

            			newLeafNode(otherlv_8, grammarAccess.getUniformTimeCourseAccess().getOutputStartTimeKeyword_8());
            		
            otherlv_9=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_9());
            		
            // InternalSedml.g:3298:3: ( (lv_outputStartTime_10_0= RULE_INT ) )
            // InternalSedml.g:3299:4: (lv_outputStartTime_10_0= RULE_INT )
            {
            // InternalSedml.g:3299:4: (lv_outputStartTime_10_0= RULE_INT )
            // InternalSedml.g:3300:5: lv_outputStartTime_10_0= RULE_INT
            {
            lv_outputStartTime_10_0=(Token)match(input,RULE_INT,FOLLOW_96); 

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

            otherlv_11=(Token)match(input,86,FOLLOW_54); 

            			newLeafNode(otherlv_11, grammarAccess.getUniformTimeCourseAccess().getOutputEndTimeKeyword_11());
            		
            otherlv_12=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_12());
            		
            // InternalSedml.g:3324:3: ( (lv_outputEndTime_13_0= RULE_INT ) )
            // InternalSedml.g:3325:4: (lv_outputEndTime_13_0= RULE_INT )
            {
            // InternalSedml.g:3325:4: (lv_outputEndTime_13_0= RULE_INT )
            // InternalSedml.g:3326:5: lv_outputEndTime_13_0= RULE_INT
            {
            lv_outputEndTime_13_0=(Token)match(input,RULE_INT,FOLLOW_97); 

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

            otherlv_14=(Token)match(input,87,FOLLOW_54); 

            			newLeafNode(otherlv_14, grammarAccess.getUniformTimeCourseAccess().getNumberOfPointsKeyword_14());
            		
            otherlv_15=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_15());
            		
            // InternalSedml.g:3350:3: ( (lv_numberOfPoints_16_0= RULE_INT ) )
            // InternalSedml.g:3351:4: (lv_numberOfPoints_16_0= RULE_INT )
            {
            // InternalSedml.g:3351:4: (lv_numberOfPoints_16_0= RULE_INT )
            // InternalSedml.g:3352:5: lv_numberOfPoints_16_0= RULE_INT
            {
            lv_numberOfPoints_16_0=(Token)match(input,RULE_INT,FOLLOW_98); 

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

            // InternalSedml.g:3368:3: ( (lv_algorithm_17_0= rulealgorithm ) )
            // InternalSedml.g:3369:4: (lv_algorithm_17_0= rulealgorithm )
            {
            // InternalSedml.g:3369:4: (lv_algorithm_17_0= rulealgorithm )
            // InternalSedml.g:3370:5: lv_algorithm_17_0= rulealgorithm
            {

            					newCompositeNode(grammarAccess.getUniformTimeCourseAccess().getAlgorithmAlgorithmParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_18=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSedml.g:3395:1: entryRulealgorithm returns [EObject current=null] : iv_rulealgorithm= rulealgorithm EOF ;
    public final EObject entryRulealgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulealgorithm = null;


        try {
            // InternalSedml.g:3395:50: (iv_rulealgorithm= rulealgorithm EOF )
            // InternalSedml.g:3396:2: iv_rulealgorithm= rulealgorithm EOF
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
    // InternalSedml.g:3402:1: rulealgorithm returns [EObject current=null] : (otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
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
            // InternalSedml.g:3408:2: ( (otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalSedml.g:3409:2: (otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalSedml.g:3409:2: (otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalSedml.g:3410:3: otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmAccess().getAlgorithmKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_99); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgorithmAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,89,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getAlgorithmAccess().getKisaoIDKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getAlgorithmAccess().getColonKeyword_3());
            		
            // InternalSedml.g:3426:3: ( (lv_kisaoID_4_0= RULE_STRING ) )
            // InternalSedml.g:3427:4: (lv_kisaoID_4_0= RULE_STRING )
            {
            // InternalSedml.g:3427:4: (lv_kisaoID_4_0= RULE_STRING )
            // InternalSedml.g:3428:5: lv_kisaoID_4_0= RULE_STRING
            {
            lv_kisaoID_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "ruleFunction"
    // InternalSedml.g:3452:1: ruleFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) ) ;
    public final Enumerator ruleFunction() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalSedml.g:3458:2: ( ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) ) )
            // InternalSedml.g:3459:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) )
            {
            // InternalSedml.g:3459:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) )
            int alt67=9;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt67=1;
                }
                break;
            case 91:
                {
                alt67=2;
                }
                break;
            case 92:
                {
                alt67=3;
                }
                break;
            case 93:
                {
                alt67=4;
                }
                break;
            case 94:
                {
                alt67=5;
                }
                break;
            case 95:
                {
                alt67=6;
                }
                break;
            case 96:
                {
                alt67=7;
                }
                break;
            case 97:
                {
                alt67=8;
                }
                break;
            case 98:
                {
                alt67=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalSedml.g:3460:3: (enumLiteral_0= 'MIN' )
                    {
                    // InternalSedml.g:3460:3: (enumLiteral_0= 'MIN' )
                    // InternalSedml.g:3461:4: enumLiteral_0= 'MIN'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getMINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFunctionAccess().getMINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:3468:3: (enumLiteral_1= 'MAX' )
                    {
                    // InternalSedml.g:3468:3: (enumLiteral_1= 'MAX' )
                    // InternalSedml.g:3469:4: enumLiteral_1= 'MAX'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getMAXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFunctionAccess().getMAXEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSedml.g:3476:3: (enumLiteral_2= 'EXP' )
                    {
                    // InternalSedml.g:3476:3: (enumLiteral_2= 'EXP' )
                    // InternalSedml.g:3477:4: enumLiteral_2= 'EXP'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getEXPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFunctionAccess().getEXPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSedml.g:3484:3: (enumLiteral_3= 'INVERSE' )
                    {
                    // InternalSedml.g:3484:3: (enumLiteral_3= 'INVERSE' )
                    // InternalSedml.g:3485:4: enumLiteral_3= 'INVERSE'
                    {
                    enumLiteral_3=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getINVERSEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFunctionAccess().getINVERSEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSedml.g:3492:3: (enumLiteral_4= 'SIN' )
                    {
                    // InternalSedml.g:3492:3: (enumLiteral_4= 'SIN' )
                    // InternalSedml.g:3493:4: enumLiteral_4= 'SIN'
                    {
                    enumLiteral_4=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getSINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFunctionAccess().getSINEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSedml.g:3500:3: (enumLiteral_5= 'COS' )
                    {
                    // InternalSedml.g:3500:3: (enumLiteral_5= 'COS' )
                    // InternalSedml.g:3501:4: enumLiteral_5= 'COS'
                    {
                    enumLiteral_5=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getCOSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFunctionAccess().getCOSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSedml.g:3508:3: (enumLiteral_6= 'TAN' )
                    {
                    // InternalSedml.g:3508:3: (enumLiteral_6= 'TAN' )
                    // InternalSedml.g:3509:4: enumLiteral_6= 'TAN'
                    {
                    enumLiteral_6=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getTANEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFunctionAccess().getTANEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSedml.g:3516:3: (enumLiteral_7= 'FACTORIAL' )
                    {
                    // InternalSedml.g:3516:3: (enumLiteral_7= 'FACTORIAL' )
                    // InternalSedml.g:3517:4: enumLiteral_7= 'FACTORIAL'
                    {
                    enumLiteral_7=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getFACTORIALEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFunctionAccess().getFACTORIALEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSedml.g:3524:3: (enumLiteral_8= 'LOG' )
                    {
                    // InternalSedml.g:3524:3: (enumLiteral_8= 'LOG' )
                    // InternalSedml.g:3525:4: enumLiteral_8= 'LOG'
                    {
                    enumLiteral_8=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getLOGEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getFunctionAccess().getLOGEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "ruleLevels"
    // InternalSedml.g:3535:1: ruleLevels returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) ;
    public final Enumerator ruleLevels() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSedml.g:3541:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) )
            // InternalSedml.g:3542:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            {
            // InternalSedml.g:3542:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt68=1;
                }
                break;
            case 100:
                {
                alt68=2;
                }
                break;
            case 101:
                {
                alt68=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalSedml.g:3543:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalSedml.g:3543:3: (enumLiteral_0= 'HIGH' )
                    // InternalSedml.g:3544:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getLevelsAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLevelsAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:3551:3: (enumLiteral_1= 'MEDIUM' )
                    {
                    // InternalSedml.g:3551:3: (enumLiteral_1= 'MEDIUM' )
                    // InternalSedml.g:3552:4: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getLevelsAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLevelsAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSedml.g:3559:3: (enumLiteral_2= 'LOW' )
                    {
                    // InternalSedml.g:3559:3: (enumLiteral_2= 'LOW' )
                    // InternalSedml.g:3560:4: enumLiteral_2= 'LOW'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getLevelsAccess().getLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLevelsAccess().getLOWEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleLevels"


    // $ANTLR start "ruleExpression"
    // InternalSedml.g:3570:1: ruleExpression returns [Enumerator current=null] : ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) ;
    public final Enumerator ruleExpression() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSedml.g:3576:2: ( ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) )
            // InternalSedml.g:3577:2: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            {
            // InternalSedml.g:3577:2: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==102) ) {
                alt69=1;
            }
            else if ( (LA69_0==103) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalSedml.g:3578:3: (enumLiteral_0= 'TRUE' )
                    {
                    // InternalSedml.g:3578:3: (enumLiteral_0= 'TRUE' )
                    // InternalSedml.g:3579:4: enumLiteral_0= 'TRUE'
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getExpressionAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getExpressionAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:3586:3: (enumLiteral_1= 'FALSE' )
                    {
                    // InternalSedml.g:3586:3: (enumLiteral_1= 'FALSE' )
                    // InternalSedml.g:3587:4: enumLiteral_1= 'FALSE'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getExpressionAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getExpressionAccess().getFALSEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "ruleLinks"
    // InternalSedml.g:3597:1: ruleLinks returns [Enumerator current=null] : ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) ) ;
    public final Enumerator ruleLinks() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSedml.g:3603:2: ( ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) ) )
            // InternalSedml.g:3604:2: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) )
            {
            // InternalSedml.g:3604:2: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) )
            int alt70=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt70=1;
                }
                break;
            case 104:
                {
                alt70=2;
                }
                break;
            case 26:
                {
                alt70=3;
                }
                break;
            case 105:
                {
                alt70=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalSedml.g:3605:3: (enumLiteral_0= 'is' )
                    {
                    // InternalSedml.g:3605:3: (enumLiteral_0= 'is' )
                    // InternalSedml.g:3606:4: enumLiteral_0= 'is'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getLinksAccess().getIsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLinksAccess().getIsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:3613:3: (enumLiteral_1= 'occurs' )
                    {
                    // InternalSedml.g:3613:3: (enumLiteral_1= 'occurs' )
                    // InternalSedml.g:3614:4: enumLiteral_1= 'occurs'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getLinksAccess().getOccursEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLinksAccess().getOccursEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSedml.g:3621:3: (enumLiteral_2= 'to' )
                    {
                    // InternalSedml.g:3621:3: (enumLiteral_2= 'to' )
                    // InternalSedml.g:3622:4: enumLiteral_2= 'to'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getLinksAccess().getToEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLinksAccess().getToEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSedml.g:3629:3: (enumLiteral_3= 'in' )
                    {
                    // InternalSedml.g:3629:3: (enumLiteral_3= 'in' )
                    // InternalSedml.g:3630:4: enumLiteral_3= 'in'
                    {
                    enumLiteral_3=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getLinksAccess().getInEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLinksAccess().getInEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleLinks"


    // $ANTLR start "ruleTemporal"
    // InternalSedml.g:3640:1: ruleTemporal returns [Enumerator current=null] : ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) ) ;
    public final Enumerator ruleTemporal() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalSedml.g:3646:2: ( ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) ) )
            // InternalSedml.g:3647:2: ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) )
            {
            // InternalSedml.g:3647:2: ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) )
            int alt71=11;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt71=1;
                }
                break;
            case 107:
                {
                alt71=2;
                }
                break;
            case 108:
                {
                alt71=3;
                }
                break;
            case 109:
                {
                alt71=4;
                }
                break;
            case 110:
                {
                alt71=5;
                }
                break;
            case 111:
                {
                alt71=6;
                }
                break;
            case 112:
                {
                alt71=7;
                }
                break;
            case 113:
                {
                alt71=8;
                }
                break;
            case 114:
                {
                alt71=9;
                }
                break;
            case 115:
                {
                alt71=10;
                }
                break;
            case 116:
                {
                alt71=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalSedml.g:3648:3: (enumLiteral_0= 'precedes' )
                    {
                    // InternalSedml.g:3648:3: (enumLiteral_0= 'precedes' )
                    // InternalSedml.g:3649:4: enumLiteral_0= 'precedes'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getPrecedesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTemporalAccess().getPrecedesEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:3656:3: (enumLiteral_1= 'between' )
                    {
                    // InternalSedml.g:3656:3: (enumLiteral_1= 'between' )
                    // InternalSedml.g:3657:4: enumLiteral_1= 'between'
                    {
                    enumLiteral_1=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getBetweenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTemporalAccess().getBetweenEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSedml.g:3664:3: (enumLiteral_2= 'eventually' )
                    {
                    // InternalSedml.g:3664:3: (enumLiteral_2= 'eventually' )
                    // InternalSedml.g:3665:4: enumLiteral_2= 'eventually'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getEventuallyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTemporalAccess().getEventuallyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSedml.g:3672:3: (enumLiteral_3= 'always' )
                    {
                    // InternalSedml.g:3672:3: (enumLiteral_3= 'always' )
                    // InternalSedml.g:3673:4: enumLiteral_3= 'always'
                    {
                    enumLiteral_3=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getAlwaysEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTemporalAccess().getAlwaysEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSedml.g:3680:3: (enumLiteral_4= 'before' )
                    {
                    // InternalSedml.g:3680:3: (enumLiteral_4= 'before' )
                    // InternalSedml.g:3681:4: enumLiteral_4= 'before'
                    {
                    enumLiteral_4=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getBeforeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTemporalAccess().getBeforeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSedml.g:3688:3: (enumLiteral_5= 'after' )
                    {
                    // InternalSedml.g:3688:3: (enumLiteral_5= 'after' )
                    // InternalSedml.g:3689:4: enumLiteral_5= 'after'
                    {
                    enumLiteral_5=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getAfterEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTemporalAccess().getAfterEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSedml.g:3696:3: (enumLiteral_6= 'until' )
                    {
                    // InternalSedml.g:3696:3: (enumLiteral_6= 'until' )
                    // InternalSedml.g:3697:4: enumLiteral_6= 'until'
                    {
                    enumLiteral_6=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getUntilEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTemporalAccess().getUntilEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSedml.g:3704:3: (enumLiteral_7= 'never' )
                    {
                    // InternalSedml.g:3704:3: (enumLiteral_7= 'never' )
                    // InternalSedml.g:3705:4: enumLiteral_7= 'never'
                    {
                    enumLiteral_7=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getNeverEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTemporalAccess().getNeverEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSedml.g:3712:3: (enumLiteral_8= 'leads' )
                    {
                    // InternalSedml.g:3712:3: (enumLiteral_8= 'leads' )
                    // InternalSedml.g:3713:4: enumLiteral_8= 'leads'
                    {
                    enumLiteral_8=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getLeadsEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTemporalAccess().getLeadsEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSedml.g:3720:3: (enumLiteral_9= 'absent' )
                    {
                    // InternalSedml.g:3720:3: (enumLiteral_9= 'absent' )
                    // InternalSedml.g:3721:4: enumLiteral_9= 'absent'
                    {
                    enumLiteral_9=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getAbsentEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getTemporalAccess().getAbsentEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalSedml.g:3728:3: (enumLiteral_10= 'exists' )
                    {
                    // InternalSedml.g:3728:3: (enumLiteral_10= 'exists' )
                    // InternalSedml.g:3729:4: enumLiteral_10= 'exists'
                    {
                    enumLiteral_10=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getExistsEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getTemporalAccess().getExistsEnumLiteralDeclaration_10());
                    			

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
    // $ANTLR end "ruleTemporal"


    // $ANTLR start "ruleLogical"
    // InternalSedml.g:3739:1: ruleLogical returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) ) ;
    public final Enumerator ruleLogical() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSedml.g:3745:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) ) )
            // InternalSedml.g:3746:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) )
            {
            // InternalSedml.g:3746:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt72=1;
                }
                break;
            case 117:
                {
                alt72=2;
                }
                break;
            case 118:
                {
                alt72=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalSedml.g:3747:3: (enumLiteral_0= 'and' )
                    {
                    // InternalSedml.g:3747:3: (enumLiteral_0= 'and' )
                    // InternalSedml.g:3748:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getLogicalAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:3755:3: (enumLiteral_1= 'or' )
                    {
                    // InternalSedml.g:3755:3: (enumLiteral_1= 'or' )
                    // InternalSedml.g:3756:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getLogicalAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicalAccess().getOrEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSedml.g:3763:3: (enumLiteral_2= 'not' )
                    {
                    // InternalSedml.g:3763:3: (enumLiteral_2= 'not' )
                    // InternalSedml.g:3764:4: enumLiteral_2= 'not'
                    {
                    enumLiteral_2=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getLogicalAccess().getNotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogicalAccess().getNotEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleLogical"


    // $ANTLR start "ruleCoherence"
    // InternalSedml.g:3774:1: ruleCoherence returns [Enumerator current=null] : ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) ) ;
    public final Enumerator ruleCoherence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSedml.g:3780:2: ( ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) ) )
            // InternalSedml.g:3781:2: ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) )
            {
            // InternalSedml.g:3781:2: ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt73=1;
                }
                break;
            case 120:
                {
                alt73=2;
                }
                break;
            case 121:
                {
                alt73=3;
                }
                break;
            case 122:
                {
                alt73=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalSedml.g:3782:3: (enumLiteral_0= 'EXPLAIN' )
                    {
                    // InternalSedml.g:3782:3: (enumLiteral_0= 'EXPLAIN' )
                    // InternalSedml.g:3783:4: enumLiteral_0= 'EXPLAIN'
                    {
                    enumLiteral_0=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getCoherenceAccess().getEXPLAINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCoherenceAccess().getEXPLAINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:3790:3: (enumLiteral_1= 'ANALOGOUS' )
                    {
                    // InternalSedml.g:3790:3: (enumLiteral_1= 'ANALOGOUS' )
                    // InternalSedml.g:3791:4: enumLiteral_1= 'ANALOGOUS'
                    {
                    enumLiteral_1=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getCoherenceAccess().getANALOGOUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCoherenceAccess().getANALOGOUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSedml.g:3798:3: (enumLiteral_2= 'DATA' )
                    {
                    // InternalSedml.g:3798:3: (enumLiteral_2= 'DATA' )
                    // InternalSedml.g:3799:4: enumLiteral_2= 'DATA'
                    {
                    enumLiteral_2=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getCoherenceAccess().getDATAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCoherenceAccess().getDATAEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSedml.g:3806:3: (enumLiteral_3= 'CONTRADICT' )
                    {
                    // InternalSedml.g:3806:3: (enumLiteral_3= 'CONTRADICT' )
                    // InternalSedml.g:3807:4: enumLiteral_3= 'CONTRADICT'
                    {
                    enumLiteral_3=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getCoherenceAccess().getCONTRADICTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCoherenceAccess().getCONTRADICTEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleCoherence"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\13\uffff\2\11";
    static final String dfa_3s = "\1\25\1\5\1\uffff\2\5\1\uffff\1\26\2\5\1\uffff\1\26\2\5";
    static final String dfa_4s = "\1\34\1\33\1\uffff\1\26\1\36\1\uffff\1\26\1\35\1\40\1\uffff\1\26\2\40";
    static final String dfa_5s = "\2\uffff\1\2\2\uffff\1\3\3\uffff\1\1\3\uffff";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\6\uffff\1\2",
            "\1\3\20\uffff\1\4\4\uffff\1\5",
            "",
            "\1\6\20\uffff\1\4",
            "\1\5\1\7\17\uffff\1\5\3\11\1\uffff\1\10\1\uffff\2\5",
            "",
            "\1\4",
            "\1\5\20\uffff\1\5\3\11\1\uffff\1\10\1\uffff\1\5",
            "\1\12\32\uffff\1\5",
            "",
            "\1\13",
            "\1\5\1\14\7\uffff\1\11\6\uffff\1\11\3\uffff\1\11\2\uffff\1\11\2\5\1\uffff\1\5",
            "\1\5\10\uffff\1\11\6\uffff\1\11\3\uffff\1\11\2\uffff\1\11\1\5\2\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "473:2: (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 )";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\1\3\21\uffff";
    static final String dfa_10s = "\1\5\1\uffff\1\5\1\uffff\1\35\4\5\1\uffff\1\5\2\35\1\43\2\5\1\35\1\43";
    static final String dfa_11s = "\1\166\1\uffff\1\5\1\uffff\1\166\1\43\3\5\1\uffff\1\5\2\166\2\43\1\5\1\166\1\43";
    static final String dfa_12s = "\1\uffff\1\1\1\uffff\1\2\5\uffff\1\1\10\uffff";
    static final String dfa_13s = "\22\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\3\7\uffff\1\3\7\uffff\1\3\3\uffff\1\3\2\uffff\1\3\7\uffff\1\3\20\uffff\1\2\57\uffff\21\3",
            "",
            "\1\4",
            "",
            "\1\6\4\uffff\1\5\24\uffff\1\11\75\uffff\1\7\1\10",
            "\1\12\35\uffff\1\13",
            "\1\14",
            "\1\14",
            "\1\14",
            "",
            "\1\15",
            "\1\6\31\uffff\1\11\75\uffff\1\7\1\10",
            "\1\6\4\uffff\1\16\24\uffff\1\11\75\uffff\1\7\1\10",
            "\1\13",
            "\1\17\35\uffff\1\20",
            "\1\21",
            "\1\6\31\uffff\1\11\75\uffff\1\7\1\10",
            "\1\20"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1636:3: ( (lv_e_2_0= ruleEvent ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000174000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000164000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000144000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L,0x0780000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010204000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000B800040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000B800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000B000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000042L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000020L,0x00000007FC000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000022L,0x00000007FC000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000008400020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000068400060L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000028400060L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000028400020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000160000060L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000120000060L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000120000020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000003800000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000022L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040002000000020L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000024400002L,0x007FFFC000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000024400002L,0x007FFF0000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x007FFF8000000062L,0x000000C000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0040000000000062L,0x000000C000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000042L,0x000000C000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0080000020000000L,0x007FFC0000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000100L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000100L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x8000000000004000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000010L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x2000000000004000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000800L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000004000L,0x0000000000002000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000004000L,0x0000000000080000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});

}