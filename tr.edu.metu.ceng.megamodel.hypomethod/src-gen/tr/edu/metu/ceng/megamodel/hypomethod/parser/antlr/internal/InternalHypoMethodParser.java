package tr.edu.metu.ceng.megamodel.hypomethod.parser.antlr.internal;

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
import tr.edu.metu.ceng.megamodel.hypomethod.services.HypoMethodGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHypoMethodParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_RANGEVALUE", "RULE_FACTORLEVELVALUE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'mechanism'", "' = '", "' -> '", "' + '", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'%'", "' == '", "'&&'", "'||'", "'<'", "'<='", "'>'", "'>='", "'!'", "'!='", "'event'", "'parameter'", "'with'", "'values'", "'properties'", "':'", "','", "'goal'", "'object'", "'of'", "'study'", "'purpose'", "'focus'", "'view point'", "'context'", "'hypotheses'", "'mechanistic'", "'evidence'", "'coherence'", "'relational'", "'('", "')'", "'activation'", "'weight'", "'if'", "'is'", "'added'", "'removed'", "'in the range'", "'to'", "'then'", "'compare'", "'and'", "'at'", "'level'", "'where'", "'for'", "'experiment'", "'design'", "'performance measure'", "'designType'", "'constraints'", "'variables'", "'independent'", "'control'", "'type'", "'dependent'", "'are'", "'levels'", "'number'", "'iterations'", "'='", "' +-'", "'QUALITATIVE'", "'QUANTITATIVE'", "'CONTINOUS'", "'DISCRETE'", "'BINARY'", "'NONBINARY'", "'TRUE'", "'FALSE'", "'occurs'", "'in'", "'precedes'", "'between'", "'eventually'", "'always'", "'before'", "'after'", "'until'", "'never'", "'leads'", "'absent'", "'exists'", "'or'", "'not'", "'EXPLAIN'", "'ANALOGOUS'", "'DATA'", "'CONTRADICT'", "'MIN'", "'MAX'", "'EXP'", "'INVERSE'", "'SIN'", "'COS'", "'TAN'", "'FACTORIAL'", "'LOG'", "'HIGH'", "'MEDIUM'", "'LOW'", "'FULLFACTORIAL'", "'FRACTIONALFACTORIAL'", "'OTHERS'", "'SIMPLE'", "'COMPOSITE'"
    };
    public static final int RULE_FACTORLEVELVALUE=7;
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
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
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
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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


        public InternalHypoMethodParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHypoMethodParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHypoMethodParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHypoMethod.g"; }



     	private HypoMethodGrammarAccess grammarAccess;

        public InternalHypoMethodParser(TokenStream input, HypoMethodGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected HypoMethodGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalHypoMethod.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalHypoMethod.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalHypoMethod.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalHypoMethod.g:72:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleExperimentOntology ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:78:2: ( ( (lv_elements_0_0= ruleExperimentOntology ) )* )
            // InternalHypoMethod.g:79:2: ( (lv_elements_0_0= ruleExperimentOntology ) )*
            {
            // InternalHypoMethod.g:79:2: ( (lv_elements_0_0= ruleExperimentOntology ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==43||LA1_0==51||LA1_0==73) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHypoMethod.g:80:3: (lv_elements_0_0= ruleExperimentOntology )
            	    {
            	    // InternalHypoMethod.g:80:3: (lv_elements_0_0= ruleExperimentOntology )
            	    // InternalHypoMethod.g:81:4: lv_elements_0_0= ruleExperimentOntology
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsExperimentOntologyParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleExperimentOntology();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.ExperimentOntology");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExperimentOntology"
    // InternalHypoMethod.g:101:1: entryRuleExperimentOntology returns [EObject current=null] : iv_ruleExperimentOntology= ruleExperimentOntology EOF ;
    public final EObject entryRuleExperimentOntology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentOntology = null;


        try {
            // InternalHypoMethod.g:101:59: (iv_ruleExperimentOntology= ruleExperimentOntology EOF )
            // InternalHypoMethod.g:102:2: iv_ruleExperimentOntology= ruleExperimentOntology EOF
            {
             newCompositeNode(grammarAccess.getExperimentOntologyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperimentOntology=ruleExperimentOntology();

            state._fsp--;

             current =iv_ruleExperimentOntology; 
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
    // $ANTLR end "entryRuleExperimentOntology"


    // $ANTLR start "ruleExperimentOntology"
    // InternalHypoMethod.g:108:1: ruleExperimentOntology returns [EObject current=null] : (this_ModelSection_0= ruleModelSection | this_Goals_1= ruleGoals | this_Hypothesis_2= ruleHypothesis | this_Experiment_3= ruleExperiment ) ;
    public final EObject ruleExperimentOntology() throws RecognitionException {
        EObject current = null;

        EObject this_ModelSection_0 = null;

        EObject this_Goals_1 = null;

        EObject this_Hypothesis_2 = null;

        EObject this_Experiment_3 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:114:2: ( (this_ModelSection_0= ruleModelSection | this_Goals_1= ruleGoals | this_Hypothesis_2= ruleHypothesis | this_Experiment_3= ruleExperiment ) )
            // InternalHypoMethod.g:115:2: (this_ModelSection_0= ruleModelSection | this_Goals_1= ruleGoals | this_Hypothesis_2= ruleHypothesis | this_Experiment_3= ruleExperiment )
            {
            // InternalHypoMethod.g:115:2: (this_ModelSection_0= ruleModelSection | this_Goals_1= ruleGoals | this_Hypothesis_2= ruleHypothesis | this_Experiment_3= ruleExperiment )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 43:
                {
                alt2=2;
                }
                break;
            case 51:
                {
                alt2=3;
                }
                break;
            case 73:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalHypoMethod.g:116:3: this_ModelSection_0= ruleModelSection
                    {

                    			newCompositeNode(grammarAccess.getExperimentOntologyAccess().getModelSectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelSection_0=ruleModelSection();

                    state._fsp--;


                    			current = this_ModelSection_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:125:3: this_Goals_1= ruleGoals
                    {

                    			newCompositeNode(grammarAccess.getExperimentOntologyAccess().getGoalsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Goals_1=ruleGoals();

                    state._fsp--;


                    			current = this_Goals_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:134:3: this_Hypothesis_2= ruleHypothesis
                    {

                    			newCompositeNode(grammarAccess.getExperimentOntologyAccess().getHypothesisParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hypothesis_2=ruleHypothesis();

                    state._fsp--;


                    			current = this_Hypothesis_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:143:3: this_Experiment_3= ruleExperiment
                    {

                    			newCompositeNode(grammarAccess.getExperimentOntologyAccess().getExperimentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Experiment_3=ruleExperiment();

                    state._fsp--;


                    			current = this_Experiment_3;
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
    // $ANTLR end "ruleExperimentOntology"


    // $ANTLR start "entryRuleModelSection"
    // InternalHypoMethod.g:155:1: entryRuleModelSection returns [EObject current=null] : iv_ruleModelSection= ruleModelSection EOF ;
    public final EObject entryRuleModelSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelSection = null;


        try {
            // InternalHypoMethod.g:155:53: (iv_ruleModelSection= ruleModelSection EOF )
            // InternalHypoMethod.g:156:2: iv_ruleModelSection= ruleModelSection EOF
            {
             newCompositeNode(grammarAccess.getModelSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelSection=ruleModelSection();

            state._fsp--;

             current =iv_ruleModelSection; 
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
    // $ANTLR end "entryRuleModelSection"


    // $ANTLR start "ruleModelSection"
    // InternalHypoMethod.g:162:1: ruleModelSection returns [EObject current=null] : (otherlv_0= 'model' ( (lv_modName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mechanisms_3_0= ruleMechanism ) )* ( (lv_events_4_0= ruleEventDescriptor ) )* ( (lv_parameters_5_0= ruleFactor ) )* otherlv_6= '}' ) ;
    public final EObject ruleModelSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_modName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_mechanisms_3_0 = null;

        EObject lv_events_4_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:168:2: ( (otherlv_0= 'model' ( (lv_modName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mechanisms_3_0= ruleMechanism ) )* ( (lv_events_4_0= ruleEventDescriptor ) )* ( (lv_parameters_5_0= ruleFactor ) )* otherlv_6= '}' ) )
            // InternalHypoMethod.g:169:2: (otherlv_0= 'model' ( (lv_modName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mechanisms_3_0= ruleMechanism ) )* ( (lv_events_4_0= ruleEventDescriptor ) )* ( (lv_parameters_5_0= ruleFactor ) )* otherlv_6= '}' )
            {
            // InternalHypoMethod.g:169:2: (otherlv_0= 'model' ( (lv_modName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mechanisms_3_0= ruleMechanism ) )* ( (lv_events_4_0= ruleEventDescriptor ) )* ( (lv_parameters_5_0= ruleFactor ) )* otherlv_6= '}' )
            // InternalHypoMethod.g:170:3: otherlv_0= 'model' ( (lv_modName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mechanisms_3_0= ruleMechanism ) )* ( (lv_events_4_0= ruleEventDescriptor ) )* ( (lv_parameters_5_0= ruleFactor ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModelSectionAccess().getModelKeyword_0());
            		
            // InternalHypoMethod.g:174:3: ( (lv_modName_1_0= RULE_ID ) )
            // InternalHypoMethod.g:175:4: (lv_modName_1_0= RULE_ID )
            {
            // InternalHypoMethod.g:175:4: (lv_modName_1_0= RULE_ID )
            // InternalHypoMethod.g:176:5: lv_modName_1_0= RULE_ID
            {
            lv_modName_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_modName_1_0, grammarAccess.getModelSectionAccess().getModNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"modName",
            						lv_modName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getModelSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHypoMethod.g:196:3: ( (lv_mechanisms_3_0= ruleMechanism ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalHypoMethod.g:197:4: (lv_mechanisms_3_0= ruleMechanism )
            	    {
            	    // InternalHypoMethod.g:197:4: (lv_mechanisms_3_0= ruleMechanism )
            	    // InternalHypoMethod.g:198:5: lv_mechanisms_3_0= ruleMechanism
            	    {

            	    					newCompositeNode(grammarAccess.getModelSectionAccess().getMechanismsMechanismParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_mechanisms_3_0=ruleMechanism();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mechanisms",
            	    						lv_mechanisms_3_0,
            	    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Mechanism");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalHypoMethod.g:215:3: ( (lv_events_4_0= ruleEventDescriptor ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==36) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHypoMethod.g:216:4: (lv_events_4_0= ruleEventDescriptor )
            	    {
            	    // InternalHypoMethod.g:216:4: (lv_events_4_0= ruleEventDescriptor )
            	    // InternalHypoMethod.g:217:5: lv_events_4_0= ruleEventDescriptor
            	    {

            	    					newCompositeNode(grammarAccess.getModelSectionAccess().getEventsEventDescriptorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_events_4_0=ruleEventDescriptor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_4_0,
            	    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.EventDescriptor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalHypoMethod.g:234:3: ( (lv_parameters_5_0= ruleFactor ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==37) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHypoMethod.g:235:4: (lv_parameters_5_0= ruleFactor )
            	    {
            	    // InternalHypoMethod.g:235:4: (lv_parameters_5_0= ruleFactor )
            	    // InternalHypoMethod.g:236:5: lv_parameters_5_0= ruleFactor
            	    {

            	    					newCompositeNode(grammarAccess.getModelSectionAccess().getParametersFactorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_parameters_5_0=ruleFactor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_5_0,
            	    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Factor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getModelSectionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleModelSection"


    // $ANTLR start "entryRuleMechanism"
    // InternalHypoMethod.g:261:1: entryRuleMechanism returns [EObject current=null] : iv_ruleMechanism= ruleMechanism EOF ;
    public final EObject entryRuleMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanism = null;


        try {
            // InternalHypoMethod.g:261:50: (iv_ruleMechanism= ruleMechanism EOF )
            // InternalHypoMethod.g:262:2: iv_ruleMechanism= ruleMechanism EOF
            {
             newCompositeNode(grammarAccess.getMechanismRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMechanism=ruleMechanism();

            state._fsp--;

             current =iv_ruleMechanism; 
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
    // $ANTLR end "entryRuleMechanism"


    // $ANTLR start "ruleMechanism"
    // InternalHypoMethod.g:268:1: ruleMechanism returns [EObject current=null] : (otherlv_0= 'mechanism' ( (lv_mechanismName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_LHS_3_0= ruleReaction ) ) ( (lv_condition_4_0= ruleGuardCondition ) )? otherlv_5= ' -> ' ( (lv_RHS_6_0= ruleReaction ) ) ) ;
    public final EObject ruleMechanism() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mechanismName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_LHS_3_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_RHS_6_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:274:2: ( (otherlv_0= 'mechanism' ( (lv_mechanismName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_LHS_3_0= ruleReaction ) ) ( (lv_condition_4_0= ruleGuardCondition ) )? otherlv_5= ' -> ' ( (lv_RHS_6_0= ruleReaction ) ) ) )
            // InternalHypoMethod.g:275:2: (otherlv_0= 'mechanism' ( (lv_mechanismName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_LHS_3_0= ruleReaction ) ) ( (lv_condition_4_0= ruleGuardCondition ) )? otherlv_5= ' -> ' ( (lv_RHS_6_0= ruleReaction ) ) )
            {
            // InternalHypoMethod.g:275:2: (otherlv_0= 'mechanism' ( (lv_mechanismName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_LHS_3_0= ruleReaction ) ) ( (lv_condition_4_0= ruleGuardCondition ) )? otherlv_5= ' -> ' ( (lv_RHS_6_0= ruleReaction ) ) )
            // InternalHypoMethod.g:276:3: otherlv_0= 'mechanism' ( (lv_mechanismName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_LHS_3_0= ruleReaction ) ) ( (lv_condition_4_0= ruleGuardCondition ) )? otherlv_5= ' -> ' ( (lv_RHS_6_0= ruleReaction ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMechanismAccess().getMechanismKeyword_0());
            		
            // InternalHypoMethod.g:280:3: ( (lv_mechanismName_1_0= RULE_ID ) )
            // InternalHypoMethod.g:281:4: (lv_mechanismName_1_0= RULE_ID )
            {
            // InternalHypoMethod.g:281:4: (lv_mechanismName_1_0= RULE_ID )
            // InternalHypoMethod.g:282:5: lv_mechanismName_1_0= RULE_ID
            {
            lv_mechanismName_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_mechanismName_1_0, grammarAccess.getMechanismAccess().getMechanismNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMechanismRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mechanismName",
            						lv_mechanismName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMechanismAccess().getSpaceEqualsSignSpaceKeyword_2());
            		
            // InternalHypoMethod.g:302:3: ( (lv_LHS_3_0= ruleReaction ) )
            // InternalHypoMethod.g:303:4: (lv_LHS_3_0= ruleReaction )
            {
            // InternalHypoMethod.g:303:4: (lv_LHS_3_0= ruleReaction )
            // InternalHypoMethod.g:304:5: lv_LHS_3_0= ruleReaction
            {

            					newCompositeNode(grammarAccess.getMechanismAccess().getLHSReactionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_LHS_3_0=ruleReaction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMechanismRule());
            					}
            					set(
            						current,
            						"LHS",
            						lv_LHS_3_0,
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Reaction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHypoMethod.g:321:3: ( (lv_condition_4_0= ruleGuardCondition ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHypoMethod.g:322:4: (lv_condition_4_0= ruleGuardCondition )
                    {
                    // InternalHypoMethod.g:322:4: (lv_condition_4_0= ruleGuardCondition )
                    // InternalHypoMethod.g:323:5: lv_condition_4_0= ruleGuardCondition
                    {

                    					newCompositeNode(grammarAccess.getMechanismAccess().getConditionGuardConditionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_condition_4_0=ruleGuardCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMechanismRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_4_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.GuardCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getMechanismAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_5());
            		
            // InternalHypoMethod.g:344:3: ( (lv_RHS_6_0= ruleReaction ) )
            // InternalHypoMethod.g:345:4: (lv_RHS_6_0= ruleReaction )
            {
            // InternalHypoMethod.g:345:4: (lv_RHS_6_0= ruleReaction )
            // InternalHypoMethod.g:346:5: lv_RHS_6_0= ruleReaction
            {

            					newCompositeNode(grammarAccess.getMechanismAccess().getRHSReactionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_RHS_6_0=ruleReaction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMechanismRule());
            					}
            					set(
            						current,
            						"RHS",
            						lv_RHS_6_0,
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Reaction");
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
    // $ANTLR end "ruleMechanism"


    // $ANTLR start "entryRuleReaction"
    // InternalHypoMethod.g:367:1: entryRuleReaction returns [EObject current=null] : iv_ruleReaction= ruleReaction EOF ;
    public final EObject entryRuleReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaction = null;


        try {
            // InternalHypoMethod.g:367:49: (iv_ruleReaction= ruleReaction EOF )
            // InternalHypoMethod.g:368:2: iv_ruleReaction= ruleReaction EOF
            {
             newCompositeNode(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReaction=ruleReaction();

            state._fsp--;

             current =iv_ruleReaction; 
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
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // InternalHypoMethod.g:374:1: ruleReaction returns [EObject current=null] : ( ( (lv_agent1_0_0= RULE_ID ) ) (otherlv_1= ' + ' )? ( (lv_agent_2_0= RULE_ID ) )? ) ;
    public final EObject ruleReaction() throws RecognitionException {
        EObject current = null;

        Token lv_agent1_0_0=null;
        Token otherlv_1=null;
        Token lv_agent_2_0=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:380:2: ( ( ( (lv_agent1_0_0= RULE_ID ) ) (otherlv_1= ' + ' )? ( (lv_agent_2_0= RULE_ID ) )? ) )
            // InternalHypoMethod.g:381:2: ( ( (lv_agent1_0_0= RULE_ID ) ) (otherlv_1= ' + ' )? ( (lv_agent_2_0= RULE_ID ) )? )
            {
            // InternalHypoMethod.g:381:2: ( ( (lv_agent1_0_0= RULE_ID ) ) (otherlv_1= ' + ' )? ( (lv_agent_2_0= RULE_ID ) )? )
            // InternalHypoMethod.g:382:3: ( (lv_agent1_0_0= RULE_ID ) ) (otherlv_1= ' + ' )? ( (lv_agent_2_0= RULE_ID ) )?
            {
            // InternalHypoMethod.g:382:3: ( (lv_agent1_0_0= RULE_ID ) )
            // InternalHypoMethod.g:383:4: (lv_agent1_0_0= RULE_ID )
            {
            // InternalHypoMethod.g:383:4: (lv_agent1_0_0= RULE_ID )
            // InternalHypoMethod.g:384:5: lv_agent1_0_0= RULE_ID
            {
            lv_agent1_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_agent1_0_0, grammarAccess.getReactionAccess().getAgent1IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"agent1",
            						lv_agent1_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalHypoMethod.g:400:3: (otherlv_1= ' + ' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalHypoMethod.g:401:4: otherlv_1= ' + '
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getReactionAccess().getSpacePlusSignSpaceKeyword_1());
                    			

                    }
                    break;

            }

            // InternalHypoMethod.g:406:3: ( (lv_agent_2_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHypoMethod.g:407:4: (lv_agent_2_0= RULE_ID )
                    {
                    // InternalHypoMethod.g:407:4: (lv_agent_2_0= RULE_ID )
                    // InternalHypoMethod.g:408:5: lv_agent_2_0= RULE_ID
                    {
                    lv_agent_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_agent_2_0, grammarAccess.getReactionAccess().getAgentIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReactionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"agent",
                    						lv_agent_2_0,
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
    // $ANTLR end "ruleReaction"


    // $ANTLR start "entryRuleGuardCondition"
    // InternalHypoMethod.g:428:1: entryRuleGuardCondition returns [EObject current=null] : iv_ruleGuardCondition= ruleGuardCondition EOF ;
    public final EObject entryRuleGuardCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardCondition = null;


        try {
            // InternalHypoMethod.g:428:55: (iv_ruleGuardCondition= ruleGuardCondition EOF )
            // InternalHypoMethod.g:429:2: iv_ruleGuardCondition= ruleGuardCondition EOF
            {
             newCompositeNode(grammarAccess.getGuardConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuardCondition=ruleGuardCondition();

            state._fsp--;

             current =iv_ruleGuardCondition; 
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
    // $ANTLR end "entryRuleGuardCondition"


    // $ANTLR start "ruleGuardCondition"
    // InternalHypoMethod.g:435:1: ruleGuardCondition returns [EObject current=null] : ( ( (lv_gd_0_0= '[' ) ) ( (lv_condition1_1_0= RULE_ID ) )? ( (lv_link_2_0= ruleLinkOperators ) )? ( (lv_condition2_3_0= RULE_ID ) )? otherlv_4= ']' ) ;
    public final EObject ruleGuardCondition() throws RecognitionException {
        EObject current = null;

        Token lv_gd_0_0=null;
        Token lv_condition1_1_0=null;
        Token lv_condition2_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_link_2_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:441:2: ( ( ( (lv_gd_0_0= '[' ) ) ( (lv_condition1_1_0= RULE_ID ) )? ( (lv_link_2_0= ruleLinkOperators ) )? ( (lv_condition2_3_0= RULE_ID ) )? otherlv_4= ']' ) )
            // InternalHypoMethod.g:442:2: ( ( (lv_gd_0_0= '[' ) ) ( (lv_condition1_1_0= RULE_ID ) )? ( (lv_link_2_0= ruleLinkOperators ) )? ( (lv_condition2_3_0= RULE_ID ) )? otherlv_4= ']' )
            {
            // InternalHypoMethod.g:442:2: ( ( (lv_gd_0_0= '[' ) ) ( (lv_condition1_1_0= RULE_ID ) )? ( (lv_link_2_0= ruleLinkOperators ) )? ( (lv_condition2_3_0= RULE_ID ) )? otherlv_4= ']' )
            // InternalHypoMethod.g:443:3: ( (lv_gd_0_0= '[' ) ) ( (lv_condition1_1_0= RULE_ID ) )? ( (lv_link_2_0= ruleLinkOperators ) )? ( (lv_condition2_3_0= RULE_ID ) )? otherlv_4= ']'
            {
            // InternalHypoMethod.g:443:3: ( (lv_gd_0_0= '[' ) )
            // InternalHypoMethod.g:444:4: (lv_gd_0_0= '[' )
            {
            // InternalHypoMethod.g:444:4: (lv_gd_0_0= '[' )
            // InternalHypoMethod.g:445:5: lv_gd_0_0= '['
            {
            lv_gd_0_0=(Token)match(input,20,FOLLOW_14); 

            					newLeafNode(lv_gd_0_0, grammarAccess.getGuardConditionAccess().getGdLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuardConditionRule());
            					}
            					setWithLastConsumed(current, "gd", lv_gd_0_0, "[");
            				

            }


            }

            // InternalHypoMethod.g:457:3: ( (lv_condition1_1_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalHypoMethod.g:458:4: (lv_condition1_1_0= RULE_ID )
                    {
                    // InternalHypoMethod.g:458:4: (lv_condition1_1_0= RULE_ID )
                    // InternalHypoMethod.g:459:5: lv_condition1_1_0= RULE_ID
                    {
                    lv_condition1_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    					newLeafNode(lv_condition1_1_0, grammarAccess.getGuardConditionAccess().getCondition1IDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGuardConditionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"condition1",
                    						lv_condition1_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:475:3: ( (lv_link_2_0= ruleLinkOperators ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17||(LA10_0>=22 && LA10_0<=35)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalHypoMethod.g:476:4: (lv_link_2_0= ruleLinkOperators )
                    {
                    // InternalHypoMethod.g:476:4: (lv_link_2_0= ruleLinkOperators )
                    // InternalHypoMethod.g:477:5: lv_link_2_0= ruleLinkOperators
                    {

                    					newCompositeNode(grammarAccess.getGuardConditionAccess().getLinkLinkOperatorsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_link_2_0=ruleLinkOperators();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGuardConditionRule());
                    					}
                    					set(
                    						current,
                    						"link",
                    						lv_link_2_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.LinkOperators");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:494:3: ( (lv_condition2_3_0= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalHypoMethod.g:495:4: (lv_condition2_3_0= RULE_ID )
                    {
                    // InternalHypoMethod.g:495:4: (lv_condition2_3_0= RULE_ID )
                    // InternalHypoMethod.g:496:5: lv_condition2_3_0= RULE_ID
                    {
                    lv_condition2_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    					newLeafNode(lv_condition2_3_0, grammarAccess.getGuardConditionAccess().getCondition2IDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGuardConditionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"condition2",
                    						lv_condition2_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGuardConditionAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGuardCondition"


    // $ANTLR start "entryRuleLinkOperators"
    // InternalHypoMethod.g:520:1: entryRuleLinkOperators returns [String current=null] : iv_ruleLinkOperators= ruleLinkOperators EOF ;
    public final String entryRuleLinkOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLinkOperators = null;


        try {
            // InternalHypoMethod.g:520:53: (iv_ruleLinkOperators= ruleLinkOperators EOF )
            // InternalHypoMethod.g:521:2: iv_ruleLinkOperators= ruleLinkOperators EOF
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
    // InternalHypoMethod.g:527:1: ruleLinkOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleLinkOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:533:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' ) )
            // InternalHypoMethod.g:534:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' )
            {
            // InternalHypoMethod.g:534:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' )
            int alt12=15;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 25:
                {
                alt12=4;
                }
                break;
            case 26:
                {
                alt12=5;
                }
                break;
            case 17:
                {
                alt12=6;
                }
                break;
            case 27:
                {
                alt12=7;
                }
                break;
            case 28:
                {
                alt12=8;
                }
                break;
            case 29:
                {
                alt12=9;
                }
                break;
            case 30:
                {
                alt12=10;
                }
                break;
            case 31:
                {
                alt12=11;
                }
                break;
            case 32:
                {
                alt12=12;
                }
                break;
            case 33:
                {
                alt12=13;
                }
                break;
            case 34:
                {
                alt12=14;
                }
                break;
            case 35:
                {
                alt12=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalHypoMethod.g:535:3: kw= '+'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:541:3: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:547:3: kw= '*'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:553:3: kw= '/'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalHypoMethod.g:559:3: kw= '%'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getPercentSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalHypoMethod.g:565:3: kw= ' = '
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getSpaceEqualsSignSpaceKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalHypoMethod.g:571:3: kw= ' == '
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getSpaceEqualsSignEqualsSignSpaceKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalHypoMethod.g:577:3: kw= '&&'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getAmpersandAmpersandKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalHypoMethod.g:583:3: kw= '||'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getVerticalLineVerticalLineKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalHypoMethod.g:589:3: kw= '<'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getLessThanSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalHypoMethod.g:595:3: kw= '<='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getLessThanSignEqualsSignKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalHypoMethod.g:601:3: kw= '>'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getGreaterThanSignKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalHypoMethod.g:607:3: kw= '>='
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getGreaterThanSignEqualsSignKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalHypoMethod.g:613:3: kw= '!'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getExclamationMarkKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalHypoMethod.g:619:3: kw= '!='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEventDescriptor"
    // InternalHypoMethod.g:628:1: entryRuleEventDescriptor returns [EObject current=null] : iv_ruleEventDescriptor= ruleEventDescriptor EOF ;
    public final EObject entryRuleEventDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDescriptor = null;


        try {
            // InternalHypoMethod.g:628:56: (iv_ruleEventDescriptor= ruleEventDescriptor EOF )
            // InternalHypoMethod.g:629:2: iv_ruleEventDescriptor= ruleEventDescriptor EOF
            {
             newCompositeNode(grammarAccess.getEventDescriptorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventDescriptor=ruleEventDescriptor();

            state._fsp--;

             current =iv_ruleEventDescriptor; 
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
    // $ANTLR end "entryRuleEventDescriptor"


    // $ANTLR start "ruleEventDescriptor"
    // InternalHypoMethod.g:635:1: ruleEventDescriptor returns [EObject current=null] : (otherlv_0= 'event' ( (lv_eventName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_event_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleEventDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_eventName_1_0=null;
        Token otherlv_2=null;
        Token lv_event_3_0=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:641:2: ( (otherlv_0= 'event' ( (lv_eventName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_event_3_0= RULE_STRING ) ) ) )
            // InternalHypoMethod.g:642:2: (otherlv_0= 'event' ( (lv_eventName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_event_3_0= RULE_STRING ) ) )
            {
            // InternalHypoMethod.g:642:2: (otherlv_0= 'event' ( (lv_eventName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_event_3_0= RULE_STRING ) ) )
            // InternalHypoMethod.g:643:3: otherlv_0= 'event' ( (lv_eventName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_event_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEventDescriptorAccess().getEventKeyword_0());
            		
            // InternalHypoMethod.g:647:3: ( (lv_eventName_1_0= RULE_ID ) )
            // InternalHypoMethod.g:648:4: (lv_eventName_1_0= RULE_ID )
            {
            // InternalHypoMethod.g:648:4: (lv_eventName_1_0= RULE_ID )
            // InternalHypoMethod.g:649:5: lv_eventName_1_0= RULE_ID
            {
            lv_eventName_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_eventName_1_0, grammarAccess.getEventDescriptorAccess().getEventNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventDescriptorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"eventName",
            						lv_eventName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getEventDescriptorAccess().getSpaceEqualsSignSpaceKeyword_2());
            		
            // InternalHypoMethod.g:669:3: ( (lv_event_3_0= RULE_STRING ) )
            // InternalHypoMethod.g:670:4: (lv_event_3_0= RULE_STRING )
            {
            // InternalHypoMethod.g:670:4: (lv_event_3_0= RULE_STRING )
            // InternalHypoMethod.g:671:5: lv_event_3_0= RULE_STRING
            {
            lv_event_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_event_3_0, grammarAccess.getEventDescriptorAccess().getEventSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventDescriptorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"event",
            						lv_event_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleEventDescriptor"


    // $ANTLR start "entryRuleFactor"
    // InternalHypoMethod.g:691:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalHypoMethod.g:691:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalHypoMethod.g:692:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalHypoMethod.g:698:1: ruleFactor returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_factorName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_factorType_3_0= ruleVariableType ) )? ( (lv_factorType1_4_0= RULE_ID ) )? otherlv_5= 'with' (otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_factorName_1_0=null;
        Token otherlv_2=null;
        Token lv_factorType1_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_factorType_3_0 = null;

        EObject lv_factorValue_8_0 = null;

        EObject lv_factorProperties_12_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:704:2: ( (otherlv_0= 'parameter' ( (lv_factorName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_factorType_3_0= ruleVariableType ) )? ( (lv_factorType1_4_0= RULE_ID ) )? otherlv_5= 'with' (otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}' )? ) )
            // InternalHypoMethod.g:705:2: (otherlv_0= 'parameter' ( (lv_factorName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_factorType_3_0= ruleVariableType ) )? ( (lv_factorType1_4_0= RULE_ID ) )? otherlv_5= 'with' (otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}' )? )
            {
            // InternalHypoMethod.g:705:2: (otherlv_0= 'parameter' ( (lv_factorName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_factorType_3_0= ruleVariableType ) )? ( (lv_factorType1_4_0= RULE_ID ) )? otherlv_5= 'with' (otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}' )? )
            // InternalHypoMethod.g:706:3: otherlv_0= 'parameter' ( (lv_factorName_1_0= RULE_ID ) ) otherlv_2= ' = ' ( (lv_factorType_3_0= ruleVariableType ) )? ( (lv_factorType1_4_0= RULE_ID ) )? otherlv_5= 'with' (otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}' )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getParameterKeyword_0());
            		
            // InternalHypoMethod.g:710:3: ( (lv_factorName_1_0= RULE_ID ) )
            // InternalHypoMethod.g:711:4: (lv_factorName_1_0= RULE_ID )
            {
            // InternalHypoMethod.g:711:4: (lv_factorName_1_0= RULE_ID )
            // InternalHypoMethod.g:712:5: lv_factorName_1_0= RULE_ID
            {
            lv_factorName_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_factorName_1_0, grammarAccess.getFactorAccess().getFactorNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFactorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"factorName",
            						lv_factorName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getSpaceEqualsSignSpaceKeyword_2());
            		
            // InternalHypoMethod.g:732:3: ( (lv_factorType_3_0= ruleVariableType ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=89 && LA13_0<=94)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalHypoMethod.g:733:4: (lv_factorType_3_0= ruleVariableType )
                    {
                    // InternalHypoMethod.g:733:4: (lv_factorType_3_0= ruleVariableType )
                    // InternalHypoMethod.g:734:5: lv_factorType_3_0= ruleVariableType
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getFactorTypeVariableTypeEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_factorType_3_0=ruleVariableType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"factorType",
                    						lv_factorType_3_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.VariableType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:751:3: ( (lv_factorType1_4_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalHypoMethod.g:752:4: (lv_factorType1_4_0= RULE_ID )
                    {
                    // InternalHypoMethod.g:752:4: (lv_factorType1_4_0= RULE_ID )
                    // InternalHypoMethod.g:753:5: lv_factorType1_4_0= RULE_ID
                    {
                    lv_factorType1_4_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    					newLeafNode(lv_factorType1_4_0, grammarAccess.getFactorAccess().getFactorType1IDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"factorType1",
                    						lv_factorType1_4_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getFactorAccess().getWithKeyword_5());
            		
            // InternalHypoMethod.g:773:3: (otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalHypoMethod.g:774:4: otherlv_6= 'values' otherlv_7= '{' ( (lv_factorValue_8_0= ruleValues ) ) otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getFactorAccess().getValuesKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalHypoMethod.g:782:4: ( (lv_factorValue_8_0= ruleValues ) )
                    // InternalHypoMethod.g:783:5: (lv_factorValue_8_0= ruleValues )
                    {
                    // InternalHypoMethod.g:783:5: (lv_factorValue_8_0= ruleValues )
                    // InternalHypoMethod.g:784:6: lv_factorValue_8_0= ruleValues
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getFactorValueValuesParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_factorValue_8_0=ruleValues();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"factorValue",
                    							lv_factorValue_8_0,
                    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Values");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalHypoMethod.g:806:3: (otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalHypoMethod.g:807:4: otherlv_10= 'properties' otherlv_11= '{' ( (lv_factorProperties_12_0= ruleproperties ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getFactorAccess().getPropertiesKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalHypoMethod.g:815:4: ( (lv_factorProperties_12_0= ruleproperties ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalHypoMethod.g:816:5: (lv_factorProperties_12_0= ruleproperties )
                    	    {
                    	    // InternalHypoMethod.g:816:5: (lv_factorProperties_12_0= ruleproperties )
                    	    // InternalHypoMethod.g:817:6: lv_factorProperties_12_0= ruleproperties
                    	    {

                    	    						newCompositeNode(grammarAccess.getFactorAccess().getFactorPropertiesPropertiesParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_factorProperties_12_0=ruleproperties();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"factorProperties",
                    	    							lv_factorProperties_12_0,
                    	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.properties");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleproperties"
    // InternalHypoMethod.g:843:1: entryRuleproperties returns [EObject current=null] : iv_ruleproperties= ruleproperties EOF ;
    public final EObject entryRuleproperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleproperties = null;


        try {
            // InternalHypoMethod.g:843:51: (iv_ruleproperties= ruleproperties EOF )
            // InternalHypoMethod.g:844:2: iv_ruleproperties= ruleproperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleproperties=ruleproperties();

            state._fsp--;

             current =iv_ruleproperties; 
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
    // $ANTLR end "entryRuleproperties"


    // $ANTLR start "ruleproperties"
    // InternalHypoMethod.g:850:1: ruleproperties returns [EObject current=null] : ( ( (lv_pName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_pVal_2_0= ruleValues ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleproperties() throws RecognitionException {
        EObject current = null;

        Token lv_pName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_pVal_2_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:856:2: ( ( ( (lv_pName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_pVal_2_0= ruleValues ) ) (otherlv_3= ',' )? ) )
            // InternalHypoMethod.g:857:2: ( ( (lv_pName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_pVal_2_0= ruleValues ) ) (otherlv_3= ',' )? )
            {
            // InternalHypoMethod.g:857:2: ( ( (lv_pName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_pVal_2_0= ruleValues ) ) (otherlv_3= ',' )? )
            // InternalHypoMethod.g:858:3: ( (lv_pName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_pVal_2_0= ruleValues ) ) (otherlv_3= ',' )?
            {
            // InternalHypoMethod.g:858:3: ( (lv_pName_0_0= RULE_ID ) )
            // InternalHypoMethod.g:859:4: (lv_pName_0_0= RULE_ID )
            {
            // InternalHypoMethod.g:859:4: (lv_pName_0_0= RULE_ID )
            // InternalHypoMethod.g:860:5: lv_pName_0_0= RULE_ID
            {
            lv_pName_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_pName_0_0, grammarAccess.getPropertiesAccess().getPNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pName",
            						lv_pName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertiesAccess().getColonKeyword_1());
            		
            // InternalHypoMethod.g:880:3: ( (lv_pVal_2_0= ruleValues ) )
            // InternalHypoMethod.g:881:4: (lv_pVal_2_0= ruleValues )
            {
            // InternalHypoMethod.g:881:4: (lv_pVal_2_0= ruleValues )
            // InternalHypoMethod.g:882:5: lv_pVal_2_0= ruleValues
            {

            					newCompositeNode(grammarAccess.getPropertiesAccess().getPValValuesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_pVal_2_0=ruleValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertiesRule());
            					}
            					set(
            						current,
            						"pVal",
            						lv_pVal_2_0,
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Values");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHypoMethod.g:899:3: (otherlv_3= ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHypoMethod.g:900:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPropertiesAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleproperties"


    // $ANTLR start "entryRuleValues"
    // InternalHypoMethod.g:909:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // InternalHypoMethod.g:909:47: (iv_ruleValues= ruleValues EOF )
            // InternalHypoMethod.g:910:2: iv_ruleValues= ruleValues EOF
            {
             newCompositeNode(grammarAccess.getValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValues=ruleValues();

            state._fsp--;

             current =iv_ruleValues; 
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
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // InternalHypoMethod.g:916:1: ruleValues returns [EObject current=null] : ( ( (lv_fVal_0_0= RULE_ID ) )? ( (lv_function_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_RANGEVALUE ) )? ( (lv_fvalue_3_0= RULE_FACTORLEVELVALUE ) )? ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token lv_fVal_0_0=null;
        Token lv_function_1_0=null;
        Token lv_value_2_0=null;
        Token lv_fvalue_3_0=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:922:2: ( ( ( (lv_fVal_0_0= RULE_ID ) )? ( (lv_function_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_RANGEVALUE ) )? ( (lv_fvalue_3_0= RULE_FACTORLEVELVALUE ) )? ) )
            // InternalHypoMethod.g:923:2: ( ( (lv_fVal_0_0= RULE_ID ) )? ( (lv_function_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_RANGEVALUE ) )? ( (lv_fvalue_3_0= RULE_FACTORLEVELVALUE ) )? )
            {
            // InternalHypoMethod.g:923:2: ( ( (lv_fVal_0_0= RULE_ID ) )? ( (lv_function_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_RANGEVALUE ) )? ( (lv_fvalue_3_0= RULE_FACTORLEVELVALUE ) )? )
            // InternalHypoMethod.g:924:3: ( (lv_fVal_0_0= RULE_ID ) )? ( (lv_function_1_0= RULE_STRING ) )? ( (lv_value_2_0= RULE_RANGEVALUE ) )? ( (lv_fvalue_3_0= RULE_FACTORLEVELVALUE ) )?
            {
            // InternalHypoMethod.g:924:3: ( (lv_fVal_0_0= RULE_ID ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||(LA19_1>=RULE_ID && LA19_1<=RULE_FACTORLEVELVALUE)||LA19_1==15||LA19_1==42) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalHypoMethod.g:925:4: (lv_fVal_0_0= RULE_ID )
                    {
                    // InternalHypoMethod.g:925:4: (lv_fVal_0_0= RULE_ID )
                    // InternalHypoMethod.g:926:5: lv_fVal_0_0= RULE_ID
                    {
                    lv_fVal_0_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    					newLeafNode(lv_fVal_0_0, grammarAccess.getValuesAccess().getFValIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValuesRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"fVal",
                    						lv_fVal_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:942:3: ( (lv_function_1_0= RULE_STRING ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalHypoMethod.g:943:4: (lv_function_1_0= RULE_STRING )
                    {
                    // InternalHypoMethod.g:943:4: (lv_function_1_0= RULE_STRING )
                    // InternalHypoMethod.g:944:5: lv_function_1_0= RULE_STRING
                    {
                    lv_function_1_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    					newLeafNode(lv_function_1_0, grammarAccess.getValuesAccess().getFunctionSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValuesRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"function",
                    						lv_function_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:960:3: ( (lv_value_2_0= RULE_RANGEVALUE ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_RANGEVALUE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalHypoMethod.g:961:4: (lv_value_2_0= RULE_RANGEVALUE )
                    {
                    // InternalHypoMethod.g:961:4: (lv_value_2_0= RULE_RANGEVALUE )
                    // InternalHypoMethod.g:962:5: lv_value_2_0= RULE_RANGEVALUE
                    {
                    lv_value_2_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_31); 

                    					newLeafNode(lv_value_2_0, grammarAccess.getValuesAccess().getValueRangeValueTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValuesRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:978:3: ( (lv_fvalue_3_0= RULE_FACTORLEVELVALUE ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_FACTORLEVELVALUE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalHypoMethod.g:979:4: (lv_fvalue_3_0= RULE_FACTORLEVELVALUE )
                    {
                    // InternalHypoMethod.g:979:4: (lv_fvalue_3_0= RULE_FACTORLEVELVALUE )
                    // InternalHypoMethod.g:980:5: lv_fvalue_3_0= RULE_FACTORLEVELVALUE
                    {
                    lv_fvalue_3_0=(Token)match(input,RULE_FACTORLEVELVALUE,FOLLOW_2); 

                    					newLeafNode(lv_fvalue_3_0, grammarAccess.getValuesAccess().getFvalueFactorLevelValueTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValuesRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"fvalue",
                    						lv_fvalue_3_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.factorLevelValue");
                    				

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
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleGoals"
    // InternalHypoMethod.g:1000:1: entryRuleGoals returns [EObject current=null] : iv_ruleGoals= ruleGoals EOF ;
    public final EObject entryRuleGoals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoals = null;


        try {
            // InternalHypoMethod.g:1000:46: (iv_ruleGoals= ruleGoals EOF )
            // InternalHypoMethod.g:1001:2: iv_ruleGoals= ruleGoals EOF
            {
             newCompositeNode(grammarAccess.getGoalsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoals=ruleGoals();

            state._fsp--;

             current =iv_ruleGoals; 
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
    // $ANTLR end "entryRuleGoals"


    // $ANTLR start "ruleGoals"
    // InternalHypoMethod.g:1007:1: ruleGoals returns [EObject current=null] : (otherlv_0= 'goal' otherlv_1= '{' otherlv_2= 'object' otherlv_3= 'of' otherlv_4= 'study' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_STRING ) ) otherlv_7= 'purpose' otherlv_8= ':' ( (lv_purpose_9_0= RULE_STRING ) ) otherlv_10= 'focus' otherlv_11= ':' ( (lv_focus_12_0= RULE_STRING ) ) otherlv_13= 'view point' otherlv_14= ':' ( (lv_viewPoint_15_0= RULE_STRING ) ) otherlv_16= 'context' otherlv_17= ':' ( (lv_context_18_0= RULE_STRING ) ) otherlv_19= '}' ) ;
    public final EObject ruleGoals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_objOfStudy_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_purpose_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_focus_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_viewPoint_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_context_18_0=null;
        Token otherlv_19=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:1013:2: ( (otherlv_0= 'goal' otherlv_1= '{' otherlv_2= 'object' otherlv_3= 'of' otherlv_4= 'study' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_STRING ) ) otherlv_7= 'purpose' otherlv_8= ':' ( (lv_purpose_9_0= RULE_STRING ) ) otherlv_10= 'focus' otherlv_11= ':' ( (lv_focus_12_0= RULE_STRING ) ) otherlv_13= 'view point' otherlv_14= ':' ( (lv_viewPoint_15_0= RULE_STRING ) ) otherlv_16= 'context' otherlv_17= ':' ( (lv_context_18_0= RULE_STRING ) ) otherlv_19= '}' ) )
            // InternalHypoMethod.g:1014:2: (otherlv_0= 'goal' otherlv_1= '{' otherlv_2= 'object' otherlv_3= 'of' otherlv_4= 'study' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_STRING ) ) otherlv_7= 'purpose' otherlv_8= ':' ( (lv_purpose_9_0= RULE_STRING ) ) otherlv_10= 'focus' otherlv_11= ':' ( (lv_focus_12_0= RULE_STRING ) ) otherlv_13= 'view point' otherlv_14= ':' ( (lv_viewPoint_15_0= RULE_STRING ) ) otherlv_16= 'context' otherlv_17= ':' ( (lv_context_18_0= RULE_STRING ) ) otherlv_19= '}' )
            {
            // InternalHypoMethod.g:1014:2: (otherlv_0= 'goal' otherlv_1= '{' otherlv_2= 'object' otherlv_3= 'of' otherlv_4= 'study' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_STRING ) ) otherlv_7= 'purpose' otherlv_8= ':' ( (lv_purpose_9_0= RULE_STRING ) ) otherlv_10= 'focus' otherlv_11= ':' ( (lv_focus_12_0= RULE_STRING ) ) otherlv_13= 'view point' otherlv_14= ':' ( (lv_viewPoint_15_0= RULE_STRING ) ) otherlv_16= 'context' otherlv_17= ':' ( (lv_context_18_0= RULE_STRING ) ) otherlv_19= '}' )
            // InternalHypoMethod.g:1015:3: otherlv_0= 'goal' otherlv_1= '{' otherlv_2= 'object' otherlv_3= 'of' otherlv_4= 'study' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_STRING ) ) otherlv_7= 'purpose' otherlv_8= ':' ( (lv_purpose_9_0= RULE_STRING ) ) otherlv_10= 'focus' otherlv_11= ':' ( (lv_focus_12_0= RULE_STRING ) ) otherlv_13= 'view point' otherlv_14= ':' ( (lv_viewPoint_15_0= RULE_STRING ) ) otherlv_16= 'context' otherlv_17= ':' ( (lv_context_18_0= RULE_STRING ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGoalsAccess().getGoalKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getGoalsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getGoalsAccess().getObjectKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getGoalsAccess().getOfKeyword_3());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getGoalsAccess().getStudyKeyword_4());
            		
            otherlv_5=(Token)match(input,41,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getGoalsAccess().getColonKeyword_5());
            		
            // InternalHypoMethod.g:1039:3: ( (lv_objOfStudy_6_0= RULE_STRING ) )
            // InternalHypoMethod.g:1040:4: (lv_objOfStudy_6_0= RULE_STRING )
            {
            // InternalHypoMethod.g:1040:4: (lv_objOfStudy_6_0= RULE_STRING )
            // InternalHypoMethod.g:1041:5: lv_objOfStudy_6_0= RULE_STRING
            {
            lv_objOfStudy_6_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_objOfStudy_6_0, grammarAccess.getGoalsAccess().getObjOfStudySTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoalsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objOfStudy",
            						lv_objOfStudy_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,47,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getGoalsAccess().getPurposeKeyword_7());
            		
            otherlv_8=(Token)match(input,41,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getGoalsAccess().getColonKeyword_8());
            		
            // InternalHypoMethod.g:1065:3: ( (lv_purpose_9_0= RULE_STRING ) )
            // InternalHypoMethod.g:1066:4: (lv_purpose_9_0= RULE_STRING )
            {
            // InternalHypoMethod.g:1066:4: (lv_purpose_9_0= RULE_STRING )
            // InternalHypoMethod.g:1067:5: lv_purpose_9_0= RULE_STRING
            {
            lv_purpose_9_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_purpose_9_0, grammarAccess.getGoalsAccess().getPurposeSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoalsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"purpose",
            						lv_purpose_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,48,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getGoalsAccess().getFocusKeyword_10());
            		
            otherlv_11=(Token)match(input,41,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getGoalsAccess().getColonKeyword_11());
            		
            // InternalHypoMethod.g:1091:3: ( (lv_focus_12_0= RULE_STRING ) )
            // InternalHypoMethod.g:1092:4: (lv_focus_12_0= RULE_STRING )
            {
            // InternalHypoMethod.g:1092:4: (lv_focus_12_0= RULE_STRING )
            // InternalHypoMethod.g:1093:5: lv_focus_12_0= RULE_STRING
            {
            lv_focus_12_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					newLeafNode(lv_focus_12_0, grammarAccess.getGoalsAccess().getFocusSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoalsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"focus",
            						lv_focus_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,49,FOLLOW_26); 

            			newLeafNode(otherlv_13, grammarAccess.getGoalsAccess().getViewPointKeyword_13());
            		
            otherlv_14=(Token)match(input,41,FOLLOW_17); 

            			newLeafNode(otherlv_14, grammarAccess.getGoalsAccess().getColonKeyword_14());
            		
            // InternalHypoMethod.g:1117:3: ( (lv_viewPoint_15_0= RULE_STRING ) )
            // InternalHypoMethod.g:1118:4: (lv_viewPoint_15_0= RULE_STRING )
            {
            // InternalHypoMethod.g:1118:4: (lv_viewPoint_15_0= RULE_STRING )
            // InternalHypoMethod.g:1119:5: lv_viewPoint_15_0= RULE_STRING
            {
            lv_viewPoint_15_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            					newLeafNode(lv_viewPoint_15_0, grammarAccess.getGoalsAccess().getViewPointSTRINGTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoalsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"viewPoint",
            						lv_viewPoint_15_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_16=(Token)match(input,50,FOLLOW_26); 

            			newLeafNode(otherlv_16, grammarAccess.getGoalsAccess().getContextKeyword_16());
            		
            otherlv_17=(Token)match(input,41,FOLLOW_17); 

            			newLeafNode(otherlv_17, grammarAccess.getGoalsAccess().getColonKeyword_17());
            		
            // InternalHypoMethod.g:1143:3: ( (lv_context_18_0= RULE_STRING ) )
            // InternalHypoMethod.g:1144:4: (lv_context_18_0= RULE_STRING )
            {
            // InternalHypoMethod.g:1144:4: (lv_context_18_0= RULE_STRING )
            // InternalHypoMethod.g:1145:5: lv_context_18_0= RULE_STRING
            {
            lv_context_18_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_context_18_0, grammarAccess.getGoalsAccess().getContextSTRINGTerminalRuleCall_18_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoalsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"context",
            						lv_context_18_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_19=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getGoalsAccess().getRightCurlyBracketKeyword_19());
            		

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
    // $ANTLR end "ruleGoals"


    // $ANTLR start "entryRuleHypothesis"
    // InternalHypoMethod.g:1169:1: entryRuleHypothesis returns [EObject current=null] : iv_ruleHypothesis= ruleHypothesis EOF ;
    public final EObject entryRuleHypothesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHypothesis = null;


        try {
            // InternalHypoMethod.g:1169:51: (iv_ruleHypothesis= ruleHypothesis EOF )
            // InternalHypoMethod.g:1170:2: iv_ruleHypothesis= ruleHypothesis EOF
            {
             newCompositeNode(grammarAccess.getHypothesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHypothesis=ruleHypothesis();

            state._fsp--;

             current =iv_ruleHypothesis; 
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
    // $ANTLR end "entryRuleHypothesis"


    // $ANTLR start "ruleHypothesis"
    // InternalHypoMethod.g:1176:1: ruleHypothesis returns [EObject current=null] : (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleHypothesis() throws RecognitionException {
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
            // InternalHypoMethod.g:1182:2: ( (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalHypoMethod.g:1183:2: (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalHypoMethod.g:1183:2: (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalHypoMethod.g:1184:3: otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getHypothesisAccess().getHypothesesKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalHypoMethod.g:1192:3: (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalHypoMethod.g:1193:4: otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getHypothesisAccess().getMechanisticKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,51,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getHypothesisAccess().getHypothesesKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_2_2());
                    			
                    // InternalHypoMethod.g:1205:4: ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalHypoMethod.g:1206:5: (lv_mechHypothesis_5_0= ruleMechHypothesis )
                    	    {
                    	    // InternalHypoMethod.g:1206:5: (lv_mechHypothesis_5_0= ruleMechHypothesis )
                    	    // InternalHypoMethod.g:1207:6: lv_mechHypothesis_5_0= ruleMechHypothesis
                    	    {

                    	    						newCompositeNode(grammarAccess.getHypothesisAccess().getMechHypothesisMechHypothesisParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_mechHypothesis_5_0=ruleMechHypothesis();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getHypothesisRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"mechHypothesis",
                    	    							lv_mechHypothesis_5_0,
                    	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.MechHypothesis");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_41); 

                    				newLeafNode(otherlv_6, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalHypoMethod.g:1229:3: (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==53) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalHypoMethod.g:1230:4: otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getHypothesisAccess().getEvidenceKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,14,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalHypoMethod.g:1238:4: ( (lv_evidences_9_0= ruleEvidence ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalHypoMethod.g:1239:5: (lv_evidences_9_0= ruleEvidence )
                    	    {
                    	    // InternalHypoMethod.g:1239:5: (lv_evidences_9_0= ruleEvidence )
                    	    // InternalHypoMethod.g:1240:6: lv_evidences_9_0= ruleEvidence
                    	    {

                    	    						newCompositeNode(grammarAccess.getHypothesisAccess().getEvidencesEvidenceParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_evidences_9_0=ruleEvidence();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getHypothesisRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"evidences",
                    	    							lv_evidences_9_0,
                    	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Evidence");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_42); 

                    				newLeafNode(otherlv_10, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalHypoMethod.g:1262:3: (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalHypoMethod.g:1263:4: otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,54,FOLLOW_43); 

                    				newLeafNode(otherlv_11, grammarAccess.getHypothesisAccess().getCoherenceKeyword_4_0());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getHypothesisAccess().getModelKeyword_4_1());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_44); 

                    				newLeafNode(otherlv_13, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_4_2());
                    			
                    // InternalHypoMethod.g:1275:4: ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=112 && LA27_0<=115)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalHypoMethod.g:1276:5: (lv_coherenceLinks_14_0= ruleCoherenceLink )
                    	    {
                    	    // InternalHypoMethod.g:1276:5: (lv_coherenceLinks_14_0= ruleCoherenceLink )
                    	    // InternalHypoMethod.g:1277:6: lv_coherenceLinks_14_0= ruleCoherenceLink
                    	    {

                    	    						newCompositeNode(grammarAccess.getHypothesisAccess().getCoherenceLinksCoherenceLinkParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_44);
                    	    lv_coherenceLinks_14_0=ruleCoherenceLink();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getHypothesisRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"coherenceLinks",
                    	    							lv_coherenceLinks_14_0,
                    	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.CoherenceLink");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_45); 

                    				newLeafNode(otherlv_15, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalHypoMethod.g:1299:3: (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalHypoMethod.g:1300:4: otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}'
                    {
                    otherlv_16=(Token)match(input,55,FOLLOW_40); 

                    				newLeafNode(otherlv_16, grammarAccess.getHypothesisAccess().getRelationalKeyword_5_0());
                    			
                    otherlv_17=(Token)match(input,51,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getHypothesisAccess().getHypothesesKeyword_5_1());
                    			
                    otherlv_18=(Token)match(input,14,FOLLOW_46); 

                    				newLeafNode(otherlv_18, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_5_2());
                    			
                    // InternalHypoMethod.g:1312:4: ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==60||LA29_0==67) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalHypoMethod.g:1313:5: (lv_relHypothesis_19_0= ruleRelationalQuery )
                    	    {
                    	    // InternalHypoMethod.g:1313:5: (lv_relHypothesis_19_0= ruleRelationalQuery )
                    	    // InternalHypoMethod.g:1314:6: lv_relHypothesis_19_0= ruleRelationalQuery
                    	    {

                    	    						newCompositeNode(grammarAccess.getHypothesisAccess().getRelHypothesisRelationalQueryParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_46);
                    	    lv_relHypothesis_19_0=ruleRelationalQuery();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getHypothesisRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"relHypothesis",
                    	    							lv_relHypothesis_19_0,
                    	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.RelationalQuery");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_20, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

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
    // $ANTLR end "ruleHypothesis"


    // $ANTLR start "entryRuleCoherenceLink"
    // InternalHypoMethod.g:1344:1: entryRuleCoherenceLink returns [EObject current=null] : iv_ruleCoherenceLink= ruleCoherenceLink EOF ;
    public final EObject entryRuleCoherenceLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoherenceLink = null;


        try {
            // InternalHypoMethod.g:1344:54: (iv_ruleCoherenceLink= ruleCoherenceLink EOF )
            // InternalHypoMethod.g:1345:2: iv_ruleCoherenceLink= ruleCoherenceLink EOF
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
    // InternalHypoMethod.g:1351:1: ruleCoherenceLink returns [EObject current=null] : ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' ) ;
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
            // InternalHypoMethod.g:1357:2: ( ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' ) )
            // InternalHypoMethod.g:1358:2: ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' )
            {
            // InternalHypoMethod.g:1358:2: ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' )
            // InternalHypoMethod.g:1359:3: ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')'
            {
            // InternalHypoMethod.g:1359:3: ( (lv_coherence_0_0= ruleCoherence ) )
            // InternalHypoMethod.g:1360:4: (lv_coherence_0_0= ruleCoherence )
            {
            // InternalHypoMethod.g:1360:4: (lv_coherence_0_0= ruleCoherence )
            // InternalHypoMethod.g:1361:5: lv_coherence_0_0= ruleCoherence
            {

            					newCompositeNode(grammarAccess.getCoherenceLinkAccess().getCoherenceCoherenceEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_47);
            lv_coherence_0_0=ruleCoherence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoherenceLinkRule());
            					}
            					set(
            						current,
            						"coherence",
            						lv_coherence_0_0,
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Coherence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,56,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getCoherenceLinkAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHypoMethod.g:1382:3: ( (lv_hyp_2_0= RULE_ID ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalHypoMethod.g:1383:4: (lv_hyp_2_0= RULE_ID )
            	    {
            	    // InternalHypoMethod.g:1383:4: (lv_hyp_2_0= RULE_ID )
            	    // InternalHypoMethod.g:1384:5: lv_hyp_2_0= RULE_ID
            	    {
            	    lv_hyp_2_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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
            	    break loop31;
                }
            } while (true);

            otherlv_3=(Token)match(input,57,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getCoherenceLinkAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,56,FOLLOW_48); 

            			newLeafNode(otherlv_4, grammarAccess.getCoherenceLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalHypoMethod.g:1408:3: ( (lv_evi_5_0= RULE_ID ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalHypoMethod.g:1409:4: (lv_evi_5_0= RULE_ID )
            	    {
            	    // InternalHypoMethod.g:1409:4: (lv_evi_5_0= RULE_ID )
            	    // InternalHypoMethod.g:1410:5: lv_evi_5_0= RULE_ID
            	    {
            	    lv_evi_5_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,57,FOLLOW_2); 

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
    // InternalHypoMethod.g:1434:1: entryRuleMechHypothesis returns [EObject current=null] : iv_ruleMechHypothesis= ruleMechHypothesis EOF ;
    public final EObject entryRuleMechHypothesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechHypothesis = null;


        try {
            // InternalHypoMethod.g:1434:55: (iv_ruleMechHypothesis= ruleMechHypothesis EOF )
            // InternalHypoMethod.g:1435:2: iv_ruleMechHypothesis= ruleMechHypothesis EOF
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
    // InternalHypoMethod.g:1441:1: ruleMechHypothesis returns [EObject current=null] : ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? ) ;
    public final EObject ruleMechHypothesis() throws RecognitionException {
        EObject current = null;

        Token lv_mName_0_0=null;
        Token otherlv_1=null;
        Token lv_mechanisticHypothesis_3_0=null;
        EObject lv_assoMech_2_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:1447:2: ( ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? ) )
            // InternalHypoMethod.g:1448:2: ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? )
            {
            // InternalHypoMethod.g:1448:2: ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? )
            // InternalHypoMethod.g:1449:3: ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )?
            {
            // InternalHypoMethod.g:1449:3: ( (lv_mName_0_0= RULE_ID ) )
            // InternalHypoMethod.g:1450:4: (lv_mName_0_0= RULE_ID )
            {
            // InternalHypoMethod.g:1450:4: (lv_mName_0_0= RULE_ID )
            // InternalHypoMethod.g:1451:5: lv_mName_0_0= RULE_ID
            {
            lv_mName_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_1=(Token)match(input,41,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getMechHypothesisAccess().getColonKeyword_1());
            		
            // InternalHypoMethod.g:1471:3: ( (lv_assoMech_2_0= ruleTemporalPattern ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==20) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalHypoMethod.g:1472:4: (lv_assoMech_2_0= ruleTemporalPattern )
            	    {
            	    // InternalHypoMethod.g:1472:4: (lv_assoMech_2_0= ruleTemporalPattern )
            	    // InternalHypoMethod.g:1473:5: lv_assoMech_2_0= ruleTemporalPattern
            	    {

            	    					newCompositeNode(grammarAccess.getMechHypothesisAccess().getAssoMechTemporalPatternParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_49);
            	    lv_assoMech_2_0=ruleTemporalPattern();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMechHypothesisRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assoMech",
            	    						lv_assoMech_2_0,
            	    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.TemporalPattern");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalHypoMethod.g:1490:3: ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==EOF||LA34_1==RULE_ID||LA34_1==15) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalHypoMethod.g:1491:4: (lv_mechanisticHypothesis_3_0= RULE_ID )
                    {
                    // InternalHypoMethod.g:1491:4: (lv_mechanisticHypothesis_3_0= RULE_ID )
                    // InternalHypoMethod.g:1492:5: lv_mechanisticHypothesis_3_0= RULE_ID
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
    // InternalHypoMethod.g:1512:1: entryRuleEvidence returns [EObject current=null] : iv_ruleEvidence= ruleEvidence EOF ;
    public final EObject entryRuleEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidence = null;


        try {
            // InternalHypoMethod.g:1512:49: (iv_ruleEvidence= ruleEvidence EOF )
            // InternalHypoMethod.g:1513:2: iv_ruleEvidence= ruleEvidence EOF
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
    // InternalHypoMethod.g:1519:1: ruleEvidence returns [EObject current=null] : ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) ) ;
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
            // InternalHypoMethod.g:1525:2: ( ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) ) )
            // InternalHypoMethod.g:1526:2: ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) )
            {
            // InternalHypoMethod.g:1526:2: ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) )
            // InternalHypoMethod.g:1527:3: ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) )
            {
            // InternalHypoMethod.g:1527:3: ( (lv_eName_0_0= RULE_ID ) )
            // InternalHypoMethod.g:1528:4: (lv_eName_0_0= RULE_ID )
            {
            // InternalHypoMethod.g:1528:4: (lv_eName_0_0= RULE_ID )
            // InternalHypoMethod.g:1529:5: lv_eName_0_0= RULE_ID
            {
            lv_eName_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_1=(Token)match(input,41,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getEvidenceAccess().getColonKeyword_1());
            		
            // InternalHypoMethod.g:1549:3: ( (lv_query_2_0= ruleTemporalPattern ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||LA35_0==20) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalHypoMethod.g:1550:4: (lv_query_2_0= ruleTemporalPattern )
            	    {
            	    // InternalHypoMethod.g:1550:4: (lv_query_2_0= ruleTemporalPattern )
            	    // InternalHypoMethod.g:1551:5: lv_query_2_0= ruleTemporalPattern
            	    {

            	    					newCompositeNode(grammarAccess.getEvidenceAccess().getQueryTemporalPatternParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_50);
            	    lv_query_2_0=ruleTemporalPattern();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEvidenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"query",
            	    						lv_query_2_0,
            	    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.TemporalPattern");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_3=(Token)match(input,58,FOLLOW_51); 

            			newLeafNode(otherlv_3, grammarAccess.getEvidenceAccess().getActivationKeyword_3());
            		
            otherlv_4=(Token)match(input,59,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getEvidenceAccess().getWeightKeyword_4());
            		
            otherlv_5=(Token)match(input,41,FOLLOW_52); 

            			newLeafNode(otherlv_5, grammarAccess.getEvidenceAccess().getColonKeyword_5());
            		
            // InternalHypoMethod.g:1580:3: ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:1581:4: (lv_objOfStudy_6_0= RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:1581:4: (lv_objOfStudy_6_0= RULE_RANGEVALUE )
            // InternalHypoMethod.g:1582:5: lv_objOfStudy_6_0= RULE_RANGEVALUE
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
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
            				

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
    // InternalHypoMethod.g:1602:1: entryRuleTemporalPattern returns [EObject current=null] : iv_ruleTemporalPattern= ruleTemporalPattern EOF ;
    public final EObject entryRuleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPattern = null;


        try {
            // InternalHypoMethod.g:1602:56: (iv_ruleTemporalPattern= ruleTemporalPattern EOF )
            // InternalHypoMethod.g:1603:2: iv_ruleTemporalPattern= ruleTemporalPattern EOF
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
    // InternalHypoMethod.g:1609:1: ruleTemporalPattern returns [EObject current=null] : (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? ) ;
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
            // InternalHypoMethod.g:1615:2: ( (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? ) )
            // InternalHypoMethod.g:1616:2: (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? )
            {
            // InternalHypoMethod.g:1616:2: (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? )
            // InternalHypoMethod.g:1617:3: this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )?
            {

            			newCompositeNode(grammarAccess.getTemporalPatternAccess().getConditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_Condition_0=ruleCondition();

            state._fsp--;


            			current = this_Condition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHypoMethod.g:1625:3: ( (lv_l2_1_0= ruleLinks ) )*
            loop36:
            do {
                int alt36=2;
                switch ( input.LA(1) ) {
                case 61:
                    {
                    alt36=1;
                    }
                    break;
                case 97:
                    {
                    alt36=1;
                    }
                    break;
                case 65:
                    {
                    alt36=1;
                    }
                    break;
                case 98:
                    {
                    alt36=1;
                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // InternalHypoMethod.g:1626:4: (lv_l2_1_0= ruleLinks )
            	    {
            	    // InternalHypoMethod.g:1626:4: (lv_l2_1_0= ruleLinks )
            	    // InternalHypoMethod.g:1627:5: lv_l2_1_0= ruleLinks
            	    {

            	    					newCompositeNode(grammarAccess.getTemporalPatternAccess().getL2LinksEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_53);
            	    lv_l2_1_0=ruleLinks();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"l2",
            	    						lv_l2_1_0,
            	    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Links");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalHypoMethod.g:1644:3: ( (lv_exp_2_0= ruleExpression ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=95 && LA37_0<=96)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalHypoMethod.g:1645:4: (lv_exp_2_0= ruleExpression )
            	    {
            	    // InternalHypoMethod.g:1645:4: (lv_exp_2_0= ruleExpression )
            	    // InternalHypoMethod.g:1646:5: lv_exp_2_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getTemporalPatternAccess().getExpExpressionEnumRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_53);
            	    lv_exp_2_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"exp",
            	    						lv_exp_2_0,
            	    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalHypoMethod.g:1663:3: ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=99 && LA38_0<=109)) ) {
                    alt38=1;
                }
                else if ( (LA38_0==68||(LA38_0>=110 && LA38_0<=111)) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalHypoMethod.g:1664:4: ( (lv_op1_3_0= ruleTemporal ) )
            	    {
            	    // InternalHypoMethod.g:1664:4: ( (lv_op1_3_0= ruleTemporal ) )
            	    // InternalHypoMethod.g:1665:5: (lv_op1_3_0= ruleTemporal )
            	    {
            	    // InternalHypoMethod.g:1665:5: (lv_op1_3_0= ruleTemporal )
            	    // InternalHypoMethod.g:1666:6: lv_op1_3_0= ruleTemporal
            	    {

            	    						newCompositeNode(grammarAccess.getTemporalPatternAccess().getOp1TemporalEnumRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_54);
            	    lv_op1_3_0=ruleTemporal();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op1",
            	    							lv_op1_3_0,
            	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Temporal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalHypoMethod.g:1684:4: ( (lv_op2_4_0= ruleLogical ) )
            	    {
            	    // InternalHypoMethod.g:1684:4: ( (lv_op2_4_0= ruleLogical ) )
            	    // InternalHypoMethod.g:1685:5: (lv_op2_4_0= ruleLogical )
            	    {
            	    // InternalHypoMethod.g:1685:5: (lv_op2_4_0= ruleLogical )
            	    // InternalHypoMethod.g:1686:6: lv_op2_4_0= ruleLogical
            	    {

            	    						newCompositeNode(grammarAccess.getTemporalPatternAccess().getOp2LogicalEnumRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_54);
            	    lv_op2_4_0=ruleLogical();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op2",
            	    							lv_op2_4_0,
            	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Logical");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalHypoMethod.g:1704:3: ( (lv_l3_5_0= ruleLinks ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==61||LA39_0==65||(LA39_0>=97 && LA39_0<=98)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalHypoMethod.g:1705:4: (lv_l3_5_0= ruleLinks )
                    {
                    // InternalHypoMethod.g:1705:4: (lv_l3_5_0= ruleLinks )
                    // InternalHypoMethod.g:1706:5: lv_l3_5_0= ruleLinks
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
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Links");
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
    // InternalHypoMethod.g:1727:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalHypoMethod.g:1727:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalHypoMethod.g:1728:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalHypoMethod.g:1734:1: ruleCondition returns [EObject current=null] : ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_v_4_0=null;
        EObject lv_condition_0_0 = null;

        AntlrDatatypeRuleToken lv_lo_1_0 = null;

        EObject lv_e_2_0 = null;

        Enumerator lv_exp1_3_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:1740:2: ( ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? ) )
            // InternalHypoMethod.g:1741:2: ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? )
            {
            // InternalHypoMethod.g:1741:2: ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? )
            // InternalHypoMethod.g:1742:3: ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )?
            {
            // InternalHypoMethod.g:1742:3: ( (lv_condition_0_0= ruleEvent ) )
            // InternalHypoMethod.g:1743:4: (lv_condition_0_0= ruleEvent )
            {
            // InternalHypoMethod.g:1743:4: (lv_condition_0_0= ruleEvent )
            // InternalHypoMethod.g:1744:5: lv_condition_0_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getConditionEventParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_55);
            lv_condition_0_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHypoMethod.g:1761:3: ( (lv_lo_1_0= ruleLinkOperators ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==17||(LA40_0>=22 && LA40_0<=35)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalHypoMethod.g:1762:4: (lv_lo_1_0= ruleLinkOperators )
                    {
                    // InternalHypoMethod.g:1762:4: (lv_lo_1_0= ruleLinkOperators )
                    // InternalHypoMethod.g:1763:5: lv_lo_1_0= ruleLinkOperators
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getLoLinkOperatorsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_56);
                    lv_lo_1_0=ruleLinkOperators();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionRule());
                    					}
                    					set(
                    						current,
                    						"lo",
                    						lv_lo_1_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.LinkOperators");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:1780:3: ( (lv_e_2_0= ruleEvent ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalHypoMethod.g:1781:4: (lv_e_2_0= ruleEvent )
                    {
                    // InternalHypoMethod.g:1781:4: (lv_e_2_0= ruleEvent )
                    // InternalHypoMethod.g:1782:5: lv_e_2_0= ruleEvent
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getEEventParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_57);
                    lv_e_2_0=ruleEvent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionRule());
                    					}
                    					set(
                    						current,
                    						"e",
                    						lv_e_2_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Event");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:1799:3: ( (lv_exp1_3_0= ruleExpression ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==95) ) {
                alt42=1;
            }
            else if ( (LA42_0==96) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalHypoMethod.g:1800:4: (lv_exp1_3_0= ruleExpression )
                    {
                    // InternalHypoMethod.g:1800:4: (lv_exp1_3_0= ruleExpression )
                    // InternalHypoMethod.g:1801:5: lv_exp1_3_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getExp1ExpressionEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_58);
                    lv_exp1_3_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionRule());
                    					}
                    					set(
                    						current,
                    						"exp1",
                    						lv_exp1_3_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:1818:3: ( (lv_v_4_0= RULE_RANGEVALUE ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_RANGEVALUE) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalHypoMethod.g:1819:4: (lv_v_4_0= RULE_RANGEVALUE )
                    {
                    // InternalHypoMethod.g:1819:4: (lv_v_4_0= RULE_RANGEVALUE )
                    // InternalHypoMethod.g:1820:5: lv_v_4_0= RULE_RANGEVALUE
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
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
                    				

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


    // $ANTLR start "entryRuleEvent"
    // InternalHypoMethod.g:1840:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalHypoMethod.g:1840:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalHypoMethod.g:1841:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalHypoMethod.g:1847:1: ruleEvent returns [EObject current=null] : (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_Dispersed_0 = null;

        EObject this_Simultaneous_1 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:1853:2: ( (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous ) )
            // InternalHypoMethod.g:1854:2: (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous )
            {
            // InternalHypoMethod.g:1854:2: (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==20) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalHypoMethod.g:1855:3: this_Dispersed_0= ruleDispersed
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
                    // InternalHypoMethod.g:1864:3: this_Simultaneous_1= ruleSimultaneous
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
    // InternalHypoMethod.g:1876:1: entryRuleSimultaneous returns [EObject current=null] : iv_ruleSimultaneous= ruleSimultaneous EOF ;
    public final EObject entryRuleSimultaneous() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimultaneous = null;


        try {
            // InternalHypoMethod.g:1876:53: (iv_ruleSimultaneous= ruleSimultaneous EOF )
            // InternalHypoMethod.g:1877:2: iv_ruleSimultaneous= ruleSimultaneous EOF
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
    // InternalHypoMethod.g:1883:1: ruleSimultaneous returns [EObject current=null] : (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSimultaneous() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_sim1_1_0 = null;

        Enumerator lv_log_2_0 = null;

        AntlrDatatypeRuleToken lv_sim2_3_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:1889:2: ( (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' ) )
            // InternalHypoMethod.g:1890:2: (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' )
            {
            // InternalHypoMethod.g:1890:2: (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' )
            // InternalHypoMethod.g:1891:3: otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimultaneousAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalHypoMethod.g:1895:3: ( (lv_sim1_1_0= ruleRe ) )
            // InternalHypoMethod.g:1896:4: (lv_sim1_1_0= ruleRe )
            {
            // InternalHypoMethod.g:1896:4: (lv_sim1_1_0= ruleRe )
            // InternalHypoMethod.g:1897:5: lv_sim1_1_0= ruleRe
            {

            					newCompositeNode(grammarAccess.getSimultaneousAccess().getSim1ReParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_59);
            lv_sim1_1_0=ruleRe();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimultaneousRule());
            					}
            					set(
            						current,
            						"sim1",
            						lv_sim1_1_0,
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Re");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHypoMethod.g:1914:3: ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==68||(LA45_0>=110 && LA45_0<=111)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalHypoMethod.g:1915:4: ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) )
            	    {
            	    // InternalHypoMethod.g:1915:4: ( (lv_log_2_0= ruleLogical ) )
            	    // InternalHypoMethod.g:1916:5: (lv_log_2_0= ruleLogical )
            	    {
            	    // InternalHypoMethod.g:1916:5: (lv_log_2_0= ruleLogical )
            	    // InternalHypoMethod.g:1917:6: lv_log_2_0= ruleLogical
            	    {

            	    						newCompositeNode(grammarAccess.getSimultaneousAccess().getLogLogicalEnumRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_log_2_0=ruleLogical();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimultaneousRule());
            	    						}
            	    						add(
            	    							current,
            	    							"log",
            	    							lv_log_2_0,
            	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Logical");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalHypoMethod.g:1934:4: ( (lv_sim2_3_0= ruleRe ) )
            	    // InternalHypoMethod.g:1935:5: (lv_sim2_3_0= ruleRe )
            	    {
            	    // InternalHypoMethod.g:1935:5: (lv_sim2_3_0= ruleRe )
            	    // InternalHypoMethod.g:1936:6: lv_sim2_3_0= ruleRe
            	    {

            	    						newCompositeNode(grammarAccess.getSimultaneousAccess().getSim2ReParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_59);
            	    lv_sim2_3_0=ruleRe();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimultaneousRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sim2",
            	    							lv_sim2_3_0,
            	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Re");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalHypoMethod.g:1962:1: entryRuleDispersed returns [EObject current=null] : iv_ruleDispersed= ruleDispersed EOF ;
    public final EObject entryRuleDispersed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDispersed = null;


        try {
            // InternalHypoMethod.g:1962:50: (iv_ruleDispersed= ruleDispersed EOF )
            // InternalHypoMethod.g:1963:2: iv_ruleDispersed= ruleDispersed EOF
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
    // InternalHypoMethod.g:1969:1: ruleDispersed returns [EObject current=null] : ( (lv_disp_0_0= ruleRe ) )+ ;
    public final EObject ruleDispersed() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_disp_0_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:1975:2: ( ( (lv_disp_0_0= ruleRe ) )+ )
            // InternalHypoMethod.g:1976:2: ( (lv_disp_0_0= ruleRe ) )+
            {
            // InternalHypoMethod.g:1976:2: ( (lv_disp_0_0= ruleRe ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalHypoMethod.g:1977:3: (lv_disp_0_0= ruleRe )
            	    {
            	    // InternalHypoMethod.g:1977:3: (lv_disp_0_0= ruleRe )
            	    // InternalHypoMethod.g:1978:4: lv_disp_0_0= ruleRe
            	    {

            	    				newCompositeNode(grammarAccess.getDispersedAccess().getDispReParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_13);
            	    lv_disp_0_0=ruleRe();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDispersedRule());
            	    				}
            	    				add(
            	    					current,
            	    					"disp",
            	    					lv_disp_0_0,
            	    					"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Re");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
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
    // InternalHypoMethod.g:1998:1: entryRuleRe returns [String current=null] : iv_ruleRe= ruleRe EOF ;
    public final String entryRuleRe() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRe = null;


        try {
            // InternalHypoMethod.g:1998:42: (iv_ruleRe= ruleRe EOF )
            // InternalHypoMethod.g:1999:2: iv_ruleRe= ruleRe EOF
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
    // InternalHypoMethod.g:2005:1: ruleRe returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleRe() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:2011:2: ( (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? ) )
            // InternalHypoMethod.g:2012:2: (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? )
            {
            // InternalHypoMethod.g:2012:2: (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? )
            // InternalHypoMethod.g:2013:3: this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_60); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getReAccess().getIDTerminalRuleCall_0());
            		
            // InternalHypoMethod.g:2020:3: (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==56) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalHypoMethod.g:2021:4: kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')'
                    {
                    kw=(Token)match(input,56,FOLLOW_48); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalHypoMethod.g:2026:4: (this_ID_2= RULE_ID this_ID_3= RULE_ID )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalHypoMethod.g:2027:5: this_ID_2= RULE_ID this_ID_3= RULE_ID
                            {
                            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_4); 

                            					current.merge(this_ID_2);
                            				

                            					newLeafNode(this_ID_2, grammarAccess.getReAccess().getIDTerminalRuleCall_1_1_0());
                            				
                            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_61); 

                            					current.merge(this_ID_3);
                            				

                            					newLeafNode(this_ID_3, grammarAccess.getReAccess().getIDTerminalRuleCall_1_1_1());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,57,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRelationalQuery"
    // InternalHypoMethod.g:2052:1: entryRuleRelationalQuery returns [EObject current=null] : iv_ruleRelationalQuery= ruleRelationalQuery EOF ;
    public final EObject entryRuleRelationalQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalQuery = null;


        try {
            // InternalHypoMethod.g:2052:56: (iv_ruleRelationalQuery= ruleRelationalQuery EOF )
            // InternalHypoMethod.g:2053:2: iv_ruleRelationalQuery= ruleRelationalQuery EOF
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
    // InternalHypoMethod.g:2059:1: ruleRelationalQuery returns [EObject current=null] : (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 ) ;
    public final EObject ruleRelationalQuery() throws RecognitionException {
        EObject current = null;

        EObject this_Query1_0 = null;

        EObject this_Query2_1 = null;

        EObject this_Query3_2 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:2065:2: ( (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 ) )
            // InternalHypoMethod.g:2066:2: (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 )
            {
            // InternalHypoMethod.g:2066:2: (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 )
            int alt49=3;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalHypoMethod.g:2067:3: this_Query1_0= ruleQuery1
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
                    // InternalHypoMethod.g:2076:3: this_Query2_1= ruleQuery2
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
                    // InternalHypoMethod.g:2085:3: this_Query3_2= ruleQuery3
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
    // InternalHypoMethod.g:2097:1: entryRuleQuery1 returns [EObject current=null] : iv_ruleQuery1= ruleQuery1 EOF ;
    public final EObject entryRuleQuery1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery1 = null;


        try {
            // InternalHypoMethod.g:2097:47: (iv_ruleQuery1= ruleQuery1 EOF )
            // InternalHypoMethod.g:2098:2: iv_ruleQuery1= ruleQuery1 EOF
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
    // InternalHypoMethod.g:2104:1: ruleQuery1 returns [EObject current=null] : (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? ) ;
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
            // InternalHypoMethod.g:2110:2: ( (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? ) )
            // InternalHypoMethod.g:2111:2: (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? )
            {
            // InternalHypoMethod.g:2111:2: (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? )
            // InternalHypoMethod.g:2112:3: otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_62); 

            			newLeafNode(otherlv_0, grammarAccess.getQuery1Access().getIfKeyword_0());
            		
            // InternalHypoMethod.g:2116:3: ( (lv_factor_1_0= RULE_ID ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalHypoMethod.g:2117:4: (lv_factor_1_0= RULE_ID )
                    {
                    // InternalHypoMethod.g:2117:4: (lv_factor_1_0= RULE_ID )
                    // InternalHypoMethod.g:2118:5: lv_factor_1_0= RULE_ID
                    {
                    lv_factor_1_0=(Token)match(input,RULE_ID,FOLLOW_62); 

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

            // InternalHypoMethod.g:2134:3: ( (lv_control_2_0= RULE_ID ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalHypoMethod.g:2135:4: (lv_control_2_0= RULE_ID )
                    {
                    // InternalHypoMethod.g:2135:4: (lv_control_2_0= RULE_ID )
                    // InternalHypoMethod.g:2136:5: lv_control_2_0= RULE_ID
                    {
                    lv_control_2_0=(Token)match(input,RULE_ID,FOLLOW_63); 

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

            otherlv_3=(Token)match(input,61,FOLLOW_64); 

            			newLeafNode(otherlv_3, grammarAccess.getQuery1Access().getIsKeyword_3());
            		
            // InternalHypoMethod.g:2156:3: ( (lv_x_4_0= RULE_RANGEVALUE ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_RANGEVALUE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalHypoMethod.g:2157:4: (lv_x_4_0= RULE_RANGEVALUE )
                    {
                    // InternalHypoMethod.g:2157:4: (lv_x_4_0= RULE_RANGEVALUE )
                    // InternalHypoMethod.g:2158:5: lv_x_4_0= RULE_RANGEVALUE
                    {
                    lv_x_4_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_65); 

                    					newLeafNode(lv_x_4_0, grammarAccess.getQuery1Access().getXRangeValueTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuery1Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"x",
                    						lv_x_4_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:2174:3: (otherlv_5= 'added' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==62) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalHypoMethod.g:2175:4: otherlv_5= 'added'
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_66); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuery1Access().getAddedKeyword_5());
                    			

                    }
                    break;

            }

            // InternalHypoMethod.g:2180:3: (otherlv_6= 'removed' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==63) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalHypoMethod.g:2181:4: otherlv_6= 'removed'
                    {
                    otherlv_6=(Token)match(input,63,FOLLOW_67); 

                    				newLeafNode(otherlv_6, grammarAccess.getQuery1Access().getRemovedKeyword_6());
                    			

                    }
                    break;

            }

            // InternalHypoMethod.g:2186:3: (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==64) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalHypoMethod.g:2187:4: otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) )
                    {
                    otherlv_7=(Token)match(input,64,FOLLOW_52); 

                    				newLeafNode(otherlv_7, grammarAccess.getQuery1Access().getInTheRangeKeyword_7_0());
                    			
                    // InternalHypoMethod.g:2191:4: ( (lv_start1_8_0= RULE_RANGEVALUE ) )
                    // InternalHypoMethod.g:2192:5: (lv_start1_8_0= RULE_RANGEVALUE )
                    {
                    // InternalHypoMethod.g:2192:5: (lv_start1_8_0= RULE_RANGEVALUE )
                    // InternalHypoMethod.g:2193:6: lv_start1_8_0= RULE_RANGEVALUE
                    {
                    lv_start1_8_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_68); 

                    						newLeafNode(lv_start1_8_0, grammarAccess.getQuery1Access().getStart1RangeValueTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuery1Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"start1",
                    							lv_start1_8_0,
                    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,65,FOLLOW_52); 

                    				newLeafNode(otherlv_9, grammarAccess.getQuery1Access().getToKeyword_7_2());
                    			
                    // InternalHypoMethod.g:2213:4: ( (lv_end1_10_0= RULE_RANGEVALUE ) )
                    // InternalHypoMethod.g:2214:5: (lv_end1_10_0= RULE_RANGEVALUE )
                    {
                    // InternalHypoMethod.g:2214:5: (lv_end1_10_0= RULE_RANGEVALUE )
                    // InternalHypoMethod.g:2215:6: lv_end1_10_0= RULE_RANGEVALUE
                    {
                    lv_end1_10_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_69); 

                    						newLeafNode(lv_end1_10_0, grammarAccess.getQuery1Access().getEnd1RangeValueTerminalRuleCall_7_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuery1Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"end1",
                    							lv_end1_10_0,
                    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,66,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getQuery1Access().getThenKeyword_8());
            		
            // InternalHypoMethod.g:2236:3: ( (lv_response_12_0= RULE_ID ) )
            // InternalHypoMethod.g:2237:4: (lv_response_12_0= RULE_ID )
            {
            // InternalHypoMethod.g:2237:4: (lv_response_12_0= RULE_ID )
            // InternalHypoMethod.g:2238:5: lv_response_12_0= RULE_ID
            {
            lv_response_12_0=(Token)match(input,RULE_ID,FOLLOW_63); 

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

            otherlv_13=(Token)match(input,61,FOLLOW_70); 

            			newLeafNode(otherlv_13, grammarAccess.getQuery1Access().getIsKeyword_10());
            		
            // InternalHypoMethod.g:2258:3: ( (lv_y_14_0= RULE_RANGEVALUE ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_RANGEVALUE) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalHypoMethod.g:2259:4: (lv_y_14_0= RULE_RANGEVALUE )
                    {
                    // InternalHypoMethod.g:2259:4: (lv_y_14_0= RULE_RANGEVALUE )
                    // InternalHypoMethod.g:2260:5: lv_y_14_0= RULE_RANGEVALUE
                    {
                    lv_y_14_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_71); 

                    					newLeafNode(lv_y_14_0, grammarAccess.getQuery1Access().getYRangeValueTerminalRuleCall_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuery1Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"y",
                    						lv_y_14_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:2276:3: (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==64) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalHypoMethod.g:2277:4: otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) )
                    {
                    otherlv_15=(Token)match(input,64,FOLLOW_52); 

                    				newLeafNode(otherlv_15, grammarAccess.getQuery1Access().getInTheRangeKeyword_12_0());
                    			
                    // InternalHypoMethod.g:2281:4: ( (lv_start2_16_0= RULE_RANGEVALUE ) )
                    // InternalHypoMethod.g:2282:5: (lv_start2_16_0= RULE_RANGEVALUE )
                    {
                    // InternalHypoMethod.g:2282:5: (lv_start2_16_0= RULE_RANGEVALUE )
                    // InternalHypoMethod.g:2283:6: lv_start2_16_0= RULE_RANGEVALUE
                    {
                    lv_start2_16_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_68); 

                    						newLeafNode(lv_start2_16_0, grammarAccess.getQuery1Access().getStart2RangeValueTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuery1Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"start2",
                    							lv_start2_16_0,
                    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,65,FOLLOW_52); 

                    				newLeafNode(otherlv_17, grammarAccess.getQuery1Access().getToKeyword_12_2());
                    			
                    // InternalHypoMethod.g:2303:4: ( (lv_end2_18_0= RULE_RANGEVALUE ) )
                    // InternalHypoMethod.g:2304:5: (lv_end2_18_0= RULE_RANGEVALUE )
                    {
                    // InternalHypoMethod.g:2304:5: (lv_end2_18_0= RULE_RANGEVALUE )
                    // InternalHypoMethod.g:2305:6: lv_end2_18_0= RULE_RANGEVALUE
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
                    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
                    					

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
    // InternalHypoMethod.g:2326:1: entryRuleQuery2 returns [EObject current=null] : iv_ruleQuery2= ruleQuery2 EOF ;
    public final EObject entryRuleQuery2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery2 = null;


        try {
            // InternalHypoMethod.g:2326:47: (iv_ruleQuery2= ruleQuery2 EOF )
            // InternalHypoMethod.g:2327:2: iv_ruleQuery2= ruleQuery2 EOF
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
    // InternalHypoMethod.g:2333:1: ruleQuery2 returns [EObject current=null] : (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? ) ;
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
            // InternalHypoMethod.g:2339:2: ( (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? ) )
            // InternalHypoMethod.g:2340:2: (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? )
            {
            // InternalHypoMethod.g:2340:2: (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? )
            // InternalHypoMethod.g:2341:3: otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_72); 

            			newLeafNode(otherlv_0, grammarAccess.getQuery2Access().getCompareKeyword_0());
            		
            // InternalHypoMethod.g:2345:3: ( (lv_function1_1_0= ruleFunction ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=116 && LA58_0<=124)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalHypoMethod.g:2346:4: (lv_function1_1_0= ruleFunction )
                    {
                    // InternalHypoMethod.g:2346:4: (lv_function1_1_0= ruleFunction )
                    // InternalHypoMethod.g:2347:5: lv_function1_1_0= ruleFunction
                    {

                    					newCompositeNode(grammarAccess.getQuery2Access().getFunction1FunctionEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_73);
                    lv_function1_1_0=ruleFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuery2Rule());
                    					}
                    					set(
                    						current,
                    						"function1",
                    						lv_function1_1_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Function");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:2364:3: ( (lv_response1_2_0= RULE_ID ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalHypoMethod.g:2365:4: (lv_response1_2_0= RULE_ID )
                    {
                    // InternalHypoMethod.g:2365:4: (lv_response1_2_0= RULE_ID )
                    // InternalHypoMethod.g:2366:5: lv_response1_2_0= RULE_ID
                    {
                    lv_response1_2_0=(Token)match(input,RULE_ID,FOLLOW_73); 

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

            // InternalHypoMethod.g:2382:3: ( (lv_factor1_3_0= RULE_ID ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalHypoMethod.g:2383:4: (lv_factor1_3_0= RULE_ID )
                    {
                    // InternalHypoMethod.g:2383:4: (lv_factor1_3_0= RULE_ID )
                    // InternalHypoMethod.g:2384:5: lv_factor1_3_0= RULE_ID
                    {
                    lv_factor1_3_0=(Token)match(input,RULE_ID,FOLLOW_74); 

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

            otherlv_4=(Token)match(input,68,FOLLOW_75); 

            			newLeafNode(otherlv_4, grammarAccess.getQuery2Access().getAndKeyword_4());
            		
            // InternalHypoMethod.g:2404:3: ( (lv_function2_5_0= ruleFunction ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=116 && LA61_0<=124)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalHypoMethod.g:2405:4: (lv_function2_5_0= ruleFunction )
                    {
                    // InternalHypoMethod.g:2405:4: (lv_function2_5_0= ruleFunction )
                    // InternalHypoMethod.g:2406:5: lv_function2_5_0= ruleFunction
                    {

                    					newCompositeNode(grammarAccess.getQuery2Access().getFunction2FunctionEnumRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_function2_5_0=ruleFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuery2Rule());
                    					}
                    					set(
                    						current,
                    						"function2",
                    						lv_function2_5_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Function");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:2423:3: ( (lv_response2_6_0= RULE_ID ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalHypoMethod.g:2424:4: (lv_response2_6_0= RULE_ID )
                    {
                    // InternalHypoMethod.g:2424:4: (lv_response2_6_0= RULE_ID )
                    // InternalHypoMethod.g:2425:5: lv_response2_6_0= RULE_ID
                    {
                    lv_response2_6_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalHypoMethod.g:2441:3: ( (lv_factor2_7_0= RULE_ID ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalHypoMethod.g:2442:4: (lv_factor2_7_0= RULE_ID )
                    {
                    // InternalHypoMethod.g:2442:4: (lv_factor2_7_0= RULE_ID )
                    // InternalHypoMethod.g:2443:5: lv_factor2_7_0= RULE_ID
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
    // InternalHypoMethod.g:2463:1: entryRuleQuery3 returns [EObject current=null] : iv_ruleQuery3= ruleQuery3 EOF ;
    public final EObject entryRuleQuery3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery3 = null;


        try {
            // InternalHypoMethod.g:2463:47: (iv_ruleQuery3= ruleQuery3 EOF )
            // InternalHypoMethod.g:2464:2: iv_ruleQuery3= ruleQuery3 EOF
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
    // InternalHypoMethod.g:2470:1: ruleQuery3 returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* ) ;
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
            // InternalHypoMethod.g:2476:2: ( (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* ) )
            // InternalHypoMethod.g:2477:2: (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* )
            {
            // InternalHypoMethod.g:2477:2: (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* )
            // InternalHypoMethod.g:2478:3: otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )*
            {
            otherlv_0=(Token)match(input,60,FOLLOW_76); 

            			newLeafNode(otherlv_0, grammarAccess.getQuery3Access().getIfKeyword_0());
            		
            // InternalHypoMethod.g:2482:3: ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID||LA69_0==61) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalHypoMethod.g:2483:4: ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )?
            	    {
            	    // InternalHypoMethod.g:2483:4: ( (lv_factor1_1_0= RULE_ID ) )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==RULE_ID) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalHypoMethod.g:2484:5: (lv_factor1_1_0= RULE_ID )
            	            {
            	            // InternalHypoMethod.g:2484:5: (lv_factor1_1_0= RULE_ID )
            	            // InternalHypoMethod.g:2485:6: lv_factor1_1_0= RULE_ID
            	            {
            	            lv_factor1_1_0=(Token)match(input,RULE_ID,FOLLOW_62); 

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

            	    // InternalHypoMethod.g:2501:4: ( (lv_control1_2_0= RULE_ID ) )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==RULE_ID) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // InternalHypoMethod.g:2502:5: (lv_control1_2_0= RULE_ID )
            	            {
            	            // InternalHypoMethod.g:2502:5: (lv_control1_2_0= RULE_ID )
            	            // InternalHypoMethod.g:2503:6: lv_control1_2_0= RULE_ID
            	            {
            	            lv_control1_2_0=(Token)match(input,RULE_ID,FOLLOW_63); 

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

            	    otherlv_3=(Token)match(input,61,FOLLOW_77); 

            	    				newLeafNode(otherlv_3, grammarAccess.getQuery3Access().getIsKeyword_1_2());
            	    			
            	    // InternalHypoMethod.g:2523:4: (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==69) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // InternalHypoMethod.g:2524:5: otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) )
            	            {
            	            otherlv_4=(Token)match(input,69,FOLLOW_78); 

            	            					newLeafNode(otherlv_4, grammarAccess.getQuery3Access().getAtKeyword_1_3_0());
            	            				
            	            otherlv_5=(Token)match(input,70,FOLLOW_79); 

            	            					newLeafNode(otherlv_5, grammarAccess.getQuery3Access().getLevelKeyword_1_3_1());
            	            				
            	            // InternalHypoMethod.g:2532:5: ( (lv_Level2_6_0= ruleLevels ) )
            	            // InternalHypoMethod.g:2533:6: (lv_Level2_6_0= ruleLevels )
            	            {
            	            // InternalHypoMethod.g:2533:6: (lv_Level2_6_0= ruleLevels )
            	            // InternalHypoMethod.g:2534:7: lv_Level2_6_0= ruleLevels
            	            {

            	            							newCompositeNode(grammarAccess.getQuery3Access().getLevel2LevelsEnumRuleCall_1_3_2_0());
            	            						
            	            pushFollow(FOLLOW_80);
            	            lv_Level2_6_0=ruleLevels();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getQuery3Rule());
            	            							}
            	            							set(
            	            								current,
            	            								"Level2",
            	            								lv_Level2_6_0,
            	            								"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Levels");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalHypoMethod.g:2552:4: ( (lv_x2_7_0= RULE_RANGEVALUE ) )?
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==RULE_RANGEVALUE) ) {
            	        alt67=1;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // InternalHypoMethod.g:2553:5: (lv_x2_7_0= RULE_RANGEVALUE )
            	            {
            	            // InternalHypoMethod.g:2553:5: (lv_x2_7_0= RULE_RANGEVALUE )
            	            // InternalHypoMethod.g:2554:6: lv_x2_7_0= RULE_RANGEVALUE
            	            {
            	            lv_x2_7_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_81); 

            	            						newLeafNode(lv_x2_7_0, grammarAccess.getQuery3Access().getX2RangeValueTerminalRuleCall_1_4_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getQuery3Rule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"x2",
            	            							lv_x2_7_0,
            	            							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalHypoMethod.g:2570:4: (otherlv_8= 'and' )?
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==68) ) {
            	        alt68=1;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // InternalHypoMethod.g:2571:5: otherlv_8= 'and'
            	            {
            	            otherlv_8=(Token)match(input,68,FOLLOW_76); 

            	            					newLeafNode(otherlv_8, grammarAccess.getQuery3Access().getAndKeyword_1_5());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_9=(Token)match(input,66,FOLLOW_82); 

            			newLeafNode(otherlv_9, grammarAccess.getQuery3Access().getThenKeyword_2());
            		
            // InternalHypoMethod.g:2581:3: ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalHypoMethod.g:2582:4: ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )?
            	    {
            	    // InternalHypoMethod.g:2582:4: ( (lv_response1_10_0= RULE_ID ) )
            	    // InternalHypoMethod.g:2583:5: (lv_response1_10_0= RULE_ID )
            	    {
            	    // InternalHypoMethod.g:2583:5: (lv_response1_10_0= RULE_ID )
            	    // InternalHypoMethod.g:2584:6: lv_response1_10_0= RULE_ID
            	    {
            	    lv_response1_10_0=(Token)match(input,RULE_ID,FOLLOW_63); 

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

            	    otherlv_11=(Token)match(input,61,FOLLOW_83); 

            	    				newLeafNode(otherlv_11, grammarAccess.getQuery3Access().getIsKeyword_3_1());
            	    			
            	    // InternalHypoMethod.g:2604:4: (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==69) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalHypoMethod.g:2605:5: otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) )
            	            {
            	            otherlv_12=(Token)match(input,69,FOLLOW_78); 

            	            					newLeafNode(otherlv_12, grammarAccess.getQuery3Access().getAtKeyword_3_2_0());
            	            				
            	            otherlv_13=(Token)match(input,70,FOLLOW_79); 

            	            					newLeafNode(otherlv_13, grammarAccess.getQuery3Access().getLevelKeyword_3_2_1());
            	            				
            	            // InternalHypoMethod.g:2613:5: ( (lv_Level4_14_0= ruleLevels ) )
            	            // InternalHypoMethod.g:2614:6: (lv_Level4_14_0= ruleLevels )
            	            {
            	            // InternalHypoMethod.g:2614:6: (lv_Level4_14_0= ruleLevels )
            	            // InternalHypoMethod.g:2615:7: lv_Level4_14_0= ruleLevels
            	            {

            	            							newCompositeNode(grammarAccess.getQuery3Access().getLevel4LevelsEnumRuleCall_3_2_2_0());
            	            						
            	            pushFollow(FOLLOW_84);
            	            lv_Level4_14_0=ruleLevels();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getQuery3Rule());
            	            							}
            	            							set(
            	            								current,
            	            								"Level4",
            	            								lv_Level4_14_0,
            	            								"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Levels");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalHypoMethod.g:2633:4: ( (lv_x4_15_0= RULE_RANGEVALUE ) )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==RULE_RANGEVALUE) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // InternalHypoMethod.g:2634:5: (lv_x4_15_0= RULE_RANGEVALUE )
            	            {
            	            // InternalHypoMethod.g:2634:5: (lv_x4_15_0= RULE_RANGEVALUE )
            	            // InternalHypoMethod.g:2635:6: lv_x4_15_0= RULE_RANGEVALUE
            	            {
            	            lv_x4_15_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_85); 

            	            						newLeafNode(lv_x4_15_0, grammarAccess.getQuery3Access().getX4RangeValueTerminalRuleCall_3_3_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getQuery3Rule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"x4",
            	            							lv_x4_15_0,
            	            							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalHypoMethod.g:2651:4: (otherlv_16= 'and' )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==68) ) {
            	        alt72=1;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalHypoMethod.g:2652:5: otherlv_16= 'and'
            	            {
            	            otherlv_16=(Token)match(input,68,FOLLOW_82); 

            	            					newLeafNode(otherlv_16, grammarAccess.getQuery3Access().getAndKeyword_3_4());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_17=(Token)match(input,71,FOLLOW_86); 

            			newLeafNode(otherlv_17, grammarAccess.getQuery3Access().getWhereKeyword_4());
            		
            // InternalHypoMethod.g:2662:3: ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=125 && LA77_0<=127)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalHypoMethod.g:2663:4: ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) )
            	    {
            	    // InternalHypoMethod.g:2663:4: ( (lv_level_18_0= ruleLevels ) )
            	    // InternalHypoMethod.g:2664:5: (lv_level_18_0= ruleLevels )
            	    {
            	    // InternalHypoMethod.g:2664:5: (lv_level_18_0= ruleLevels )
            	    // InternalHypoMethod.g:2665:6: lv_level_18_0= ruleLevels
            	    {

            	    						newCompositeNode(grammarAccess.getQuery3Access().getLevelLevelsEnumRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_87);
            	    lv_level_18_0=ruleLevels();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQuery3Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"level",
            	    							lv_level_18_0,
            	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Levels");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_19=(Token)match(input,72,FOLLOW_62); 

            	    				newLeafNode(otherlv_19, grammarAccess.getQuery3Access().getForKeyword_5_1());
            	    			
            	    // InternalHypoMethod.g:2686:4: ( (lv_factor_20_0= RULE_ID ) )?
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==RULE_ID) ) {
            	        alt74=1;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // InternalHypoMethod.g:2687:5: (lv_factor_20_0= RULE_ID )
            	            {
            	            // InternalHypoMethod.g:2687:5: (lv_factor_20_0= RULE_ID )
            	            // InternalHypoMethod.g:2688:6: lv_factor_20_0= RULE_ID
            	            {
            	            lv_factor_20_0=(Token)match(input,RULE_ID,FOLLOW_62); 

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

            	    // InternalHypoMethod.g:2704:4: ( (lv_control_21_0= RULE_ID ) )?
            	    int alt75=2;
            	    int LA75_0 = input.LA(1);

            	    if ( (LA75_0==RULE_ID) ) {
            	        alt75=1;
            	    }
            	    switch (alt75) {
            	        case 1 :
            	            // InternalHypoMethod.g:2705:5: (lv_control_21_0= RULE_ID )
            	            {
            	            // InternalHypoMethod.g:2705:5: (lv_control_21_0= RULE_ID )
            	            // InternalHypoMethod.g:2706:6: lv_control_21_0= RULE_ID
            	            {
            	            lv_control_21_0=(Token)match(input,RULE_ID,FOLLOW_62); 

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

            	    // InternalHypoMethod.g:2722:4: ( (lv_response_22_0= RULE_ID ) )?
            	    int alt76=2;
            	    int LA76_0 = input.LA(1);

            	    if ( (LA76_0==RULE_ID) ) {
            	        alt76=1;
            	    }
            	    switch (alt76) {
            	        case 1 :
            	            // InternalHypoMethod.g:2723:5: (lv_response_22_0= RULE_ID )
            	            {
            	            // InternalHypoMethod.g:2723:5: (lv_response_22_0= RULE_ID )
            	            // InternalHypoMethod.g:2724:6: lv_response_22_0= RULE_ID
            	            {
            	            lv_response_22_0=(Token)match(input,RULE_ID,FOLLOW_63); 

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

            	    otherlv_23=(Token)match(input,61,FOLLOW_88); 

            	    				newLeafNode(otherlv_23, grammarAccess.getQuery3Access().getIsKeyword_5_5());
            	    			
            	    otherlv_24=(Token)match(input,64,FOLLOW_52); 

            	    				newLeafNode(otherlv_24, grammarAccess.getQuery3Access().getInTheRangeKeyword_5_6());
            	    			
            	    // InternalHypoMethod.g:2748:4: ( (lv_start1_25_0= RULE_RANGEVALUE ) )
            	    // InternalHypoMethod.g:2749:5: (lv_start1_25_0= RULE_RANGEVALUE )
            	    {
            	    // InternalHypoMethod.g:2749:5: (lv_start1_25_0= RULE_RANGEVALUE )
            	    // InternalHypoMethod.g:2750:6: lv_start1_25_0= RULE_RANGEVALUE
            	    {
            	    lv_start1_25_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_68); 

            	    						newLeafNode(lv_start1_25_0, grammarAccess.getQuery3Access().getStart1RangeValueTerminalRuleCall_5_7_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getQuery3Rule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"start1",
            	    							lv_start1_25_0,
            	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
            	    					

            	    }


            	    }

            	    otherlv_26=(Token)match(input,65,FOLLOW_52); 

            	    				newLeafNode(otherlv_26, grammarAccess.getQuery3Access().getToKeyword_5_8());
            	    			
            	    // InternalHypoMethod.g:2770:4: ( (lv_end1_27_0= RULE_RANGEVALUE ) )
            	    // InternalHypoMethod.g:2771:5: (lv_end1_27_0= RULE_RANGEVALUE )
            	    {
            	    // InternalHypoMethod.g:2771:5: (lv_end1_27_0= RULE_RANGEVALUE )
            	    // InternalHypoMethod.g:2772:6: lv_end1_27_0= RULE_RANGEVALUE
            	    {
            	    lv_end1_27_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_86); 

            	    						newLeafNode(lv_end1_27_0, grammarAccess.getQuery3Access().getEnd1RangeValueTerminalRuleCall_5_9_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getQuery3Rule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"end1",
            	    							lv_end1_27_0,
            	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
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


    // $ANTLR start "entryRuleExperiment"
    // InternalHypoMethod.g:2793:1: entryRuleExperiment returns [EObject current=null] : iv_ruleExperiment= ruleExperiment EOF ;
    public final EObject entryRuleExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperiment = null;


        try {
            // InternalHypoMethod.g:2793:51: (iv_ruleExperiment= ruleExperiment EOF )
            // InternalHypoMethod.g:2794:2: iv_ruleExperiment= ruleExperiment EOF
            {
             newCompositeNode(grammarAccess.getExperimentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperiment=ruleExperiment();

            state._fsp--;

             current =iv_ruleExperiment; 
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
    // $ANTLR end "entryRuleExperiment"


    // $ANTLR start "ruleExperiment"
    // InternalHypoMethod.g:2800:1: ruleExperiment returns [EObject current=null] : (otherlv_0= 'experiment' ( (lv_expName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'design' ( (lv_expDesign_4_0= ruleDesign ) ) otherlv_5= 'performance measure' otherlv_6= 'is' ( (lv_perfMeasure_7_0= rulePerformanceMeasure ) ) otherlv_8= '}' ) ;
    public final EObject ruleExperiment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_expName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_expDesign_4_0 = null;

        EObject lv_perfMeasure_7_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:2806:2: ( (otherlv_0= 'experiment' ( (lv_expName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'design' ( (lv_expDesign_4_0= ruleDesign ) ) otherlv_5= 'performance measure' otherlv_6= 'is' ( (lv_perfMeasure_7_0= rulePerformanceMeasure ) ) otherlv_8= '}' ) )
            // InternalHypoMethod.g:2807:2: (otherlv_0= 'experiment' ( (lv_expName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'design' ( (lv_expDesign_4_0= ruleDesign ) ) otherlv_5= 'performance measure' otherlv_6= 'is' ( (lv_perfMeasure_7_0= rulePerformanceMeasure ) ) otherlv_8= '}' )
            {
            // InternalHypoMethod.g:2807:2: (otherlv_0= 'experiment' ( (lv_expName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'design' ( (lv_expDesign_4_0= ruleDesign ) ) otherlv_5= 'performance measure' otherlv_6= 'is' ( (lv_perfMeasure_7_0= rulePerformanceMeasure ) ) otherlv_8= '}' )
            // InternalHypoMethod.g:2808:3: otherlv_0= 'experiment' ( (lv_expName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'design' ( (lv_expDesign_4_0= ruleDesign ) ) otherlv_5= 'performance measure' otherlv_6= 'is' ( (lv_perfMeasure_7_0= rulePerformanceMeasure ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExperimentAccess().getExperimentKeyword_0());
            		
            // InternalHypoMethod.g:2812:3: ( (lv_expName_1_0= RULE_ID ) )
            // InternalHypoMethod.g:2813:4: (lv_expName_1_0= RULE_ID )
            {
            // InternalHypoMethod.g:2813:4: (lv_expName_1_0= RULE_ID )
            // InternalHypoMethod.g:2814:5: lv_expName_1_0= RULE_ID
            {
            lv_expName_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_expName_1_0, grammarAccess.getExperimentAccess().getExpNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperimentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expName",
            						lv_expName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_89); 

            			newLeafNode(otherlv_2, grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,74,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getExperimentAccess().getDesignKeyword_3());
            		
            // InternalHypoMethod.g:2838:3: ( (lv_expDesign_4_0= ruleDesign ) )
            // InternalHypoMethod.g:2839:4: (lv_expDesign_4_0= ruleDesign )
            {
            // InternalHypoMethod.g:2839:4: (lv_expDesign_4_0= ruleDesign )
            // InternalHypoMethod.g:2840:5: lv_expDesign_4_0= ruleDesign
            {

            					newCompositeNode(grammarAccess.getExperimentAccess().getExpDesignDesignParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_90);
            lv_expDesign_4_0=ruleDesign();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExperimentRule());
            					}
            					set(
            						current,
            						"expDesign",
            						lv_expDesign_4_0,
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Design");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,75,FOLLOW_63); 

            			newLeafNode(otherlv_5, grammarAccess.getExperimentAccess().getPerformanceMeasureKeyword_5());
            		
            otherlv_6=(Token)match(input,61,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getExperimentAccess().getIsKeyword_6());
            		
            // InternalHypoMethod.g:2865:3: ( (lv_perfMeasure_7_0= rulePerformanceMeasure ) )
            // InternalHypoMethod.g:2866:4: (lv_perfMeasure_7_0= rulePerformanceMeasure )
            {
            // InternalHypoMethod.g:2866:4: (lv_perfMeasure_7_0= rulePerformanceMeasure )
            // InternalHypoMethod.g:2867:5: lv_perfMeasure_7_0= rulePerformanceMeasure
            {

            					newCompositeNode(grammarAccess.getExperimentAccess().getPerfMeasurePerformanceMeasureParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
            lv_perfMeasure_7_0=rulePerformanceMeasure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExperimentRule());
            					}
            					set(
            						current,
            						"perfMeasure",
            						lv_perfMeasure_7_0,
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.PerformanceMeasure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleExperiment"


    // $ANTLR start "entryRuleDesign"
    // InternalHypoMethod.g:2892:1: entryRuleDesign returns [EObject current=null] : iv_ruleDesign= ruleDesign EOF ;
    public final EObject entryRuleDesign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesign = null;


        try {
            // InternalHypoMethod.g:2892:47: (iv_ruleDesign= ruleDesign EOF )
            // InternalHypoMethod.g:2893:2: iv_ruleDesign= ruleDesign EOF
            {
             newCompositeNode(grammarAccess.getDesignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesign=ruleDesign();

            state._fsp--;

             current =iv_ruleDesign; 
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
    // $ANTLR end "entryRuleDesign"


    // $ANTLR start "ruleDesign"
    // InternalHypoMethod.g:2899:1: ruleDesign returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) ) )? (otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) ) )* ( (lv_iteration_5_0= ruleIteration ) )? (otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) ) ) otherlv_8= '}' ) ;
    public final EObject ruleDesign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_constraint_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_designType_2_0 = null;

        EObject lv_iteration_5_0 = null;

        EObject lv_variables_7_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:2905:2: ( (otherlv_0= '{' (otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) ) )? (otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) ) )* ( (lv_iteration_5_0= ruleIteration ) )? (otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) ) ) otherlv_8= '}' ) )
            // InternalHypoMethod.g:2906:2: (otherlv_0= '{' (otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) ) )? (otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) ) )* ( (lv_iteration_5_0= ruleIteration ) )? (otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) ) ) otherlv_8= '}' )
            {
            // InternalHypoMethod.g:2906:2: (otherlv_0= '{' (otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) ) )? (otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) ) )* ( (lv_iteration_5_0= ruleIteration ) )? (otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) ) ) otherlv_8= '}' )
            // InternalHypoMethod.g:2907:3: otherlv_0= '{' (otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) ) )? (otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) ) )* ( (lv_iteration_5_0= ruleIteration ) )? (otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_91); 

            			newLeafNode(otherlv_0, grammarAccess.getDesignAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalHypoMethod.g:2911:3: (otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==76) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalHypoMethod.g:2912:4: otherlv_1= 'designType' ( (lv_designType_2_0= ruleDesignType ) )
                    {
                    otherlv_1=(Token)match(input,76,FOLLOW_92); 

                    				newLeafNode(otherlv_1, grammarAccess.getDesignAccess().getDesignTypeKeyword_1_0());
                    			
                    // InternalHypoMethod.g:2916:4: ( (lv_designType_2_0= ruleDesignType ) )
                    // InternalHypoMethod.g:2917:5: (lv_designType_2_0= ruleDesignType )
                    {
                    // InternalHypoMethod.g:2917:5: (lv_designType_2_0= ruleDesignType )
                    // InternalHypoMethod.g:2918:6: lv_designType_2_0= ruleDesignType
                    {

                    						newCompositeNode(grammarAccess.getDesignAccess().getDesignTypeDesignTypeEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_93);
                    lv_designType_2_0=ruleDesignType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDesignRule());
                    						}
                    						set(
                    							current,
                    							"designType",
                    							lv_designType_2_0,
                    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.DesignType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:2936:3: (otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==77) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalHypoMethod.g:2937:4: otherlv_3= 'constraints' ( (lv_constraint_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,77,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDesignAccess().getConstraintsKeyword_2_0());
            	    			
            	    // InternalHypoMethod.g:2941:4: ( (lv_constraint_4_0= RULE_ID ) )
            	    // InternalHypoMethod.g:2942:5: (lv_constraint_4_0= RULE_ID )
            	    {
            	    // InternalHypoMethod.g:2942:5: (lv_constraint_4_0= RULE_ID )
            	    // InternalHypoMethod.g:2943:6: lv_constraint_4_0= RULE_ID
            	    {
            	    lv_constraint_4_0=(Token)match(input,RULE_ID,FOLLOW_93); 

            	    						newLeafNode(lv_constraint_4_0, grammarAccess.getDesignAccess().getConstraintIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDesignRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"constraint",
            	    							lv_constraint_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // InternalHypoMethod.g:2960:3: ( (lv_iteration_5_0= ruleIteration ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==85) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalHypoMethod.g:2961:4: (lv_iteration_5_0= ruleIteration )
                    {
                    // InternalHypoMethod.g:2961:4: (lv_iteration_5_0= ruleIteration )
                    // InternalHypoMethod.g:2962:5: lv_iteration_5_0= ruleIteration
                    {

                    					newCompositeNode(grammarAccess.getDesignAccess().getIterationIterationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_94);
                    lv_iteration_5_0=ruleIteration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDesignRule());
                    					}
                    					set(
                    						current,
                    						"iteration",
                    						lv_iteration_5_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Iteration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:2979:3: (otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) ) )
            // InternalHypoMethod.g:2980:4: otherlv_6= 'variables' ( (lv_variables_7_0= ruleVariables ) )
            {
            otherlv_6=(Token)match(input,78,FOLLOW_5); 

            				newLeafNode(otherlv_6, grammarAccess.getDesignAccess().getVariablesKeyword_4_0());
            			
            // InternalHypoMethod.g:2984:4: ( (lv_variables_7_0= ruleVariables ) )
            // InternalHypoMethod.g:2985:5: (lv_variables_7_0= ruleVariables )
            {
            // InternalHypoMethod.g:2985:5: (lv_variables_7_0= ruleVariables )
            // InternalHypoMethod.g:2986:6: lv_variables_7_0= ruleVariables
            {

            						newCompositeNode(grammarAccess.getDesignAccess().getVariablesVariablesParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_23);
            lv_variables_7_0=ruleVariables();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDesignRule());
            						}
            						set(
            							current,
            							"variables",
            							lv_variables_7_0,
            							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Variables");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDesignAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDesign"


    // $ANTLR start "entryRuleVariables"
    // InternalHypoMethod.g:3012:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalHypoMethod.g:3012:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalHypoMethod.g:3013:2: iv_ruleVariables= ruleVariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariables=ruleVariables();

            state._fsp--;

             current =iv_ruleVariables; 
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
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // InternalHypoMethod.g:3019:1: ruleVariables returns [EObject current=null] : (otherlv_0= '{' ( (lv_independentVariables_1_0= ruleIndependentVariables ) ) ( (lv_controlVariables_2_0= ruleControlVariables ) )? ( (lv_dependentVariables_3_0= ruleDependentVariables ) ) otherlv_4= '}' ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_independentVariables_1_0 = null;

        EObject lv_controlVariables_2_0 = null;

        EObject lv_dependentVariables_3_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:3025:2: ( (otherlv_0= '{' ( (lv_independentVariables_1_0= ruleIndependentVariables ) ) ( (lv_controlVariables_2_0= ruleControlVariables ) )? ( (lv_dependentVariables_3_0= ruleDependentVariables ) ) otherlv_4= '}' ) )
            // InternalHypoMethod.g:3026:2: (otherlv_0= '{' ( (lv_independentVariables_1_0= ruleIndependentVariables ) ) ( (lv_controlVariables_2_0= ruleControlVariables ) )? ( (lv_dependentVariables_3_0= ruleDependentVariables ) ) otherlv_4= '}' )
            {
            // InternalHypoMethod.g:3026:2: (otherlv_0= '{' ( (lv_independentVariables_1_0= ruleIndependentVariables ) ) ( (lv_controlVariables_2_0= ruleControlVariables ) )? ( (lv_dependentVariables_3_0= ruleDependentVariables ) ) otherlv_4= '}' )
            // InternalHypoMethod.g:3027:3: otherlv_0= '{' ( (lv_independentVariables_1_0= ruleIndependentVariables ) ) ( (lv_controlVariables_2_0= ruleControlVariables ) )? ( (lv_dependentVariables_3_0= ruleDependentVariables ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_95); 

            			newLeafNode(otherlv_0, grammarAccess.getVariablesAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalHypoMethod.g:3031:3: ( (lv_independentVariables_1_0= ruleIndependentVariables ) )
            // InternalHypoMethod.g:3032:4: (lv_independentVariables_1_0= ruleIndependentVariables )
            {
            // InternalHypoMethod.g:3032:4: (lv_independentVariables_1_0= ruleIndependentVariables )
            // InternalHypoMethod.g:3033:5: lv_independentVariables_1_0= ruleIndependentVariables
            {

            					newCompositeNode(grammarAccess.getVariablesAccess().getIndependentVariablesIndependentVariablesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_96);
            lv_independentVariables_1_0=ruleIndependentVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariablesRule());
            					}
            					set(
            						current,
            						"independentVariables",
            						lv_independentVariables_1_0,
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.IndependentVariables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHypoMethod.g:3050:3: ( (lv_controlVariables_2_0= ruleControlVariables ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==80) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalHypoMethod.g:3051:4: (lv_controlVariables_2_0= ruleControlVariables )
                    {
                    // InternalHypoMethod.g:3051:4: (lv_controlVariables_2_0= ruleControlVariables )
                    // InternalHypoMethod.g:3052:5: lv_controlVariables_2_0= ruleControlVariables
                    {

                    					newCompositeNode(grammarAccess.getVariablesAccess().getControlVariablesControlVariablesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_96);
                    lv_controlVariables_2_0=ruleControlVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariablesRule());
                    					}
                    					set(
                    						current,
                    						"controlVariables",
                    						lv_controlVariables_2_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.ControlVariables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:3069:3: ( (lv_dependentVariables_3_0= ruleDependentVariables ) )
            // InternalHypoMethod.g:3070:4: (lv_dependentVariables_3_0= ruleDependentVariables )
            {
            // InternalHypoMethod.g:3070:4: (lv_dependentVariables_3_0= ruleDependentVariables )
            // InternalHypoMethod.g:3071:5: lv_dependentVariables_3_0= ruleDependentVariables
            {

            					newCompositeNode(grammarAccess.getVariablesAccess().getDependentVariablesDependentVariablesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_dependentVariables_3_0=ruleDependentVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariablesRule());
            					}
            					set(
            						current,
            						"dependentVariables",
            						lv_dependentVariables_3_0,
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.DependentVariables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariablesAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleIndependentVariables"
    // InternalHypoMethod.g:3096:1: entryRuleIndependentVariables returns [EObject current=null] : iv_ruleIndependentVariables= ruleIndependentVariables EOF ;
    public final EObject entryRuleIndependentVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndependentVariables = null;


        try {
            // InternalHypoMethod.g:3096:61: (iv_ruleIndependentVariables= ruleIndependentVariables EOF )
            // InternalHypoMethod.g:3097:2: iv_ruleIndependentVariables= ruleIndependentVariables EOF
            {
             newCompositeNode(grammarAccess.getIndependentVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndependentVariables=ruleIndependentVariables();

            state._fsp--;

             current =iv_ruleIndependentVariables; 
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
    // $ANTLR end "entryRuleIndependentVariables"


    // $ANTLR start "ruleIndependentVariables"
    // InternalHypoMethod.g:3103:1: ruleIndependentVariables returns [EObject current=null] : (otherlv_0= 'independent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_variables_3_0= ruleFactorLevels ) )* otherlv_4= '}' ) ;
    public final EObject ruleIndependentVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:3109:2: ( (otherlv_0= 'independent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_variables_3_0= ruleFactorLevels ) )* otherlv_4= '}' ) )
            // InternalHypoMethod.g:3110:2: (otherlv_0= 'independent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_variables_3_0= ruleFactorLevels ) )* otherlv_4= '}' )
            {
            // InternalHypoMethod.g:3110:2: (otherlv_0= 'independent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_variables_3_0= ruleFactorLevels ) )* otherlv_4= '}' )
            // InternalHypoMethod.g:3111:3: otherlv_0= 'independent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_variables_3_0= ruleFactorLevels ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_94); 

            			newLeafNode(otherlv_0, grammarAccess.getIndependentVariablesAccess().getIndependentKeyword_0());
            		
            otherlv_1=(Token)match(input,78,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getIndependentVariablesAccess().getVariablesKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getIndependentVariablesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHypoMethod.g:3123:3: ( (lv_variables_3_0= ruleFactorLevels ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_ID) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalHypoMethod.g:3124:4: (lv_variables_3_0= ruleFactorLevels )
            	    {
            	    // InternalHypoMethod.g:3124:4: (lv_variables_3_0= ruleFactorLevels )
            	    // InternalHypoMethod.g:3125:5: lv_variables_3_0= ruleFactorLevels
            	    {

            	    					newCompositeNode(grammarAccess.getIndependentVariablesAccess().getVariablesFactorLevelsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_variables_3_0=ruleFactorLevels();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIndependentVariablesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_3_0,
            	    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.FactorLevels");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIndependentVariablesAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleIndependentVariables"


    // $ANTLR start "entryRuleControlVariables"
    // InternalHypoMethod.g:3150:1: entryRuleControlVariables returns [EObject current=null] : iv_ruleControlVariables= ruleControlVariables EOF ;
    public final EObject entryRuleControlVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlVariables = null;


        try {
            // InternalHypoMethod.g:3150:57: (iv_ruleControlVariables= ruleControlVariables EOF )
            // InternalHypoMethod.g:3151:2: iv_ruleControlVariables= ruleControlVariables EOF
            {
             newCompositeNode(grammarAccess.getControlVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlVariables=ruleControlVariables();

            state._fsp--;

             current =iv_ruleControlVariables; 
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
    // $ANTLR end "entryRuleControlVariables"


    // $ANTLR start "ruleControlVariables"
    // InternalHypoMethod.g:3157:1: ruleControlVariables returns [EObject current=null] : (otherlv_0= 'control' otherlv_1= 'variables' otherlv_2= '{' ( ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleControlVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_controlName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_controlType_6_0 = null;

        EObject lv_controlValue_10_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:3163:2: ( (otherlv_0= 'control' otherlv_1= 'variables' otherlv_2= '{' ( ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) ) )* otherlv_11= '}' ) )
            // InternalHypoMethod.g:3164:2: (otherlv_0= 'control' otherlv_1= 'variables' otherlv_2= '{' ( ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) ) )* otherlv_11= '}' )
            {
            // InternalHypoMethod.g:3164:2: (otherlv_0= 'control' otherlv_1= 'variables' otherlv_2= '{' ( ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) ) )* otherlv_11= '}' )
            // InternalHypoMethod.g:3165:3: otherlv_0= 'control' otherlv_1= 'variables' otherlv_2= '{' ( ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_94); 

            			newLeafNode(otherlv_0, grammarAccess.getControlVariablesAccess().getControlKeyword_0());
            		
            otherlv_1=(Token)match(input,78,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getControlVariablesAccess().getVariablesKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getControlVariablesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHypoMethod.g:3177:3: ( ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==RULE_ID) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalHypoMethod.g:3178:4: ( (lv_controlName_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'type' ( (lv_controlType_6_0= ruleVariableType ) ) otherlv_7= 'with' otherlv_8= 'values' otherlv_9= '{' ( (lv_controlValue_10_0= ruleValues ) )
            	    {
            	    // InternalHypoMethod.g:3178:4: ( (lv_controlName_3_0= RULE_ID ) )
            	    // InternalHypoMethod.g:3179:5: (lv_controlName_3_0= RULE_ID )
            	    {
            	    // InternalHypoMethod.g:3179:5: (lv_controlName_3_0= RULE_ID )
            	    // InternalHypoMethod.g:3180:6: lv_controlName_3_0= RULE_ID
            	    {
            	    lv_controlName_3_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    						newLeafNode(lv_controlName_3_0, grammarAccess.getControlVariablesAccess().getControlNameIDTerminalRuleCall_3_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getControlVariablesRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"controlName",
            	    							lv_controlName_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,41,FOLLOW_97); 

            	    				newLeafNode(otherlv_4, grammarAccess.getControlVariablesAccess().getColonKeyword_3_1());
            	    			
            	    otherlv_5=(Token)match(input,81,FOLLOW_98); 

            	    				newLeafNode(otherlv_5, grammarAccess.getControlVariablesAccess().getTypeKeyword_3_2());
            	    			
            	    // InternalHypoMethod.g:3204:4: ( (lv_controlType_6_0= ruleVariableType ) )
            	    // InternalHypoMethod.g:3205:5: (lv_controlType_6_0= ruleVariableType )
            	    {
            	    // InternalHypoMethod.g:3205:5: (lv_controlType_6_0= ruleVariableType )
            	    // InternalHypoMethod.g:3206:6: lv_controlType_6_0= ruleVariableType
            	    {

            	    						newCompositeNode(grammarAccess.getControlVariablesAccess().getControlTypeVariableTypeEnumRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_controlType_6_0=ruleVariableType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getControlVariablesRule());
            	    						}
            	    						set(
            	    							current,
            	    							"controlType",
            	    							lv_controlType_6_0,
            	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.VariableType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,38,FOLLOW_99); 

            	    				newLeafNode(otherlv_7, grammarAccess.getControlVariablesAccess().getWithKeyword_3_4());
            	    			
            	    otherlv_8=(Token)match(input,39,FOLLOW_5); 

            	    				newLeafNode(otherlv_8, grammarAccess.getControlVariablesAccess().getValuesKeyword_3_5());
            	    			
            	    otherlv_9=(Token)match(input,14,FOLLOW_22); 

            	    				newLeafNode(otherlv_9, grammarAccess.getControlVariablesAccess().getLeftCurlyBracketKeyword_3_6());
            	    			
            	    // InternalHypoMethod.g:3235:4: ( (lv_controlValue_10_0= ruleValues ) )
            	    // InternalHypoMethod.g:3236:5: (lv_controlValue_10_0= ruleValues )
            	    {
            	    // InternalHypoMethod.g:3236:5: (lv_controlValue_10_0= ruleValues )
            	    // InternalHypoMethod.g:3237:6: lv_controlValue_10_0= ruleValues
            	    {

            	    						newCompositeNode(grammarAccess.getControlVariablesAccess().getControlValueValuesParserRuleCall_3_7_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_controlValue_10_0=ruleValues();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getControlVariablesRule());
            	    						}
            	    						set(
            	    							current,
            	    							"controlValue",
            	    							lv_controlValue_10_0,
            	    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Values");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getControlVariablesAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleControlVariables"


    // $ANTLR start "entryRuleDependentVariables"
    // InternalHypoMethod.g:3263:1: entryRuleDependentVariables returns [EObject current=null] : iv_ruleDependentVariables= ruleDependentVariables EOF ;
    public final EObject entryRuleDependentVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependentVariables = null;


        try {
            // InternalHypoMethod.g:3263:59: (iv_ruleDependentVariables= ruleDependentVariables EOF )
            // InternalHypoMethod.g:3264:2: iv_ruleDependentVariables= ruleDependentVariables EOF
            {
             newCompositeNode(grammarAccess.getDependentVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependentVariables=ruleDependentVariables();

            state._fsp--;

             current =iv_ruleDependentVariables; 
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
    // $ANTLR end "entryRuleDependentVariables"


    // $ANTLR start "ruleDependentVariables"
    // InternalHypoMethod.g:3270:1: ruleDependentVariables returns [EObject current=null] : (otherlv_0= 'dependent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_responseName_3_0= ruleResponse ) )* ) ;
    public final EObject ruleDependentVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_responseName_3_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:3276:2: ( (otherlv_0= 'dependent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_responseName_3_0= ruleResponse ) )* ) )
            // InternalHypoMethod.g:3277:2: (otherlv_0= 'dependent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_responseName_3_0= ruleResponse ) )* )
            {
            // InternalHypoMethod.g:3277:2: (otherlv_0= 'dependent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_responseName_3_0= ruleResponse ) )* )
            // InternalHypoMethod.g:3278:3: otherlv_0= 'dependent' otherlv_1= 'variables' otherlv_2= '{' ( (lv_responseName_3_0= ruleResponse ) )*
            {
            otherlv_0=(Token)match(input,82,FOLLOW_94); 

            			newLeafNode(otherlv_0, grammarAccess.getDependentVariablesAccess().getDependentKeyword_0());
            		
            otherlv_1=(Token)match(input,78,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDependentVariablesAccess().getVariablesKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDependentVariablesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHypoMethod.g:3290:3: ( (lv_responseName_3_0= ruleResponse ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==RULE_ID) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalHypoMethod.g:3291:4: (lv_responseName_3_0= ruleResponse )
            	    {
            	    // InternalHypoMethod.g:3291:4: (lv_responseName_3_0= ruleResponse )
            	    // InternalHypoMethod.g:3292:5: lv_responseName_3_0= ruleResponse
            	    {

            	    					newCompositeNode(grammarAccess.getDependentVariablesAccess().getResponseNameResponseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_responseName_3_0=ruleResponse();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDependentVariablesRule());
            	    					}
            	    					set(
            	    						current,
            	    						"responseName",
            	    						lv_responseName_3_0,
            	    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Response");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
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
    // $ANTLR end "ruleDependentVariables"


    // $ANTLR start "entryRuleFactorLevels"
    // InternalHypoMethod.g:3313:1: entryRuleFactorLevels returns [EObject current=null] : iv_ruleFactorLevels= ruleFactorLevels EOF ;
    public final EObject entryRuleFactorLevels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactorLevels = null;


        try {
            // InternalHypoMethod.g:3313:53: (iv_ruleFactorLevels= ruleFactorLevels EOF )
            // InternalHypoMethod.g:3314:2: iv_ruleFactorLevels= ruleFactorLevels EOF
            {
             newCompositeNode(grammarAccess.getFactorLevelsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactorLevels=ruleFactorLevels();

            state._fsp--;

             current =iv_ruleFactorLevels; 
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
    // $ANTLR end "entryRuleFactorLevels"


    // $ANTLR start "ruleFactorLevels"
    // InternalHypoMethod.g:3320:1: ruleFactorLevels returns [EObject current=null] : ( ( (lv_facName_0_0= RULE_ID ) ) otherlv_1= 'are' otherlv_2= 'at' otherlv_3= 'levels' otherlv_4= ':' ( (lv_l_5_0= RULE_FACTORLEVELVALUE ) )? ( ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) ) )? ) ;
    public final EObject ruleFactorLevels() throws RecognitionException {
        EObject current = null;

        Token lv_facName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_l_5_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_start1_11_0=null;
        Token otherlv_12=null;
        Token lv_end1_13_0=null;
        Enumerator lv_l1_6_0 = null;

        Enumerator lv_l2_8_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:3326:2: ( ( ( (lv_facName_0_0= RULE_ID ) ) otherlv_1= 'are' otherlv_2= 'at' otherlv_3= 'levels' otherlv_4= ':' ( (lv_l_5_0= RULE_FACTORLEVELVALUE ) )? ( ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) ) )? ) )
            // InternalHypoMethod.g:3327:2: ( ( (lv_facName_0_0= RULE_ID ) ) otherlv_1= 'are' otherlv_2= 'at' otherlv_3= 'levels' otherlv_4= ':' ( (lv_l_5_0= RULE_FACTORLEVELVALUE ) )? ( ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) ) )? )
            {
            // InternalHypoMethod.g:3327:2: ( ( (lv_facName_0_0= RULE_ID ) ) otherlv_1= 'are' otherlv_2= 'at' otherlv_3= 'levels' otherlv_4= ':' ( (lv_l_5_0= RULE_FACTORLEVELVALUE ) )? ( ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) ) )? )
            // InternalHypoMethod.g:3328:3: ( (lv_facName_0_0= RULE_ID ) ) otherlv_1= 'are' otherlv_2= 'at' otherlv_3= 'levels' otherlv_4= ':' ( (lv_l_5_0= RULE_FACTORLEVELVALUE ) )? ( ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) ) )?
            {
            // InternalHypoMethod.g:3328:3: ( (lv_facName_0_0= RULE_ID ) )
            // InternalHypoMethod.g:3329:4: (lv_facName_0_0= RULE_ID )
            {
            // InternalHypoMethod.g:3329:4: (lv_facName_0_0= RULE_ID )
            // InternalHypoMethod.g:3330:5: lv_facName_0_0= RULE_ID
            {
            lv_facName_0_0=(Token)match(input,RULE_ID,FOLLOW_100); 

            					newLeafNode(lv_facName_0_0, grammarAccess.getFactorLevelsAccess().getFacNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFactorLevelsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"facName",
            						lv_facName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,83,FOLLOW_101); 

            			newLeafNode(otherlv_1, grammarAccess.getFactorLevelsAccess().getAreKeyword_1());
            		
            otherlv_2=(Token)match(input,69,FOLLOW_102); 

            			newLeafNode(otherlv_2, grammarAccess.getFactorLevelsAccess().getAtKeyword_2());
            		
            otherlv_3=(Token)match(input,84,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getFactorLevelsAccess().getLevelsKeyword_3());
            		
            otherlv_4=(Token)match(input,41,FOLLOW_103); 

            			newLeafNode(otherlv_4, grammarAccess.getFactorLevelsAccess().getColonKeyword_4());
            		
            // InternalHypoMethod.g:3362:3: ( (lv_l_5_0= RULE_FACTORLEVELVALUE ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_FACTORLEVELVALUE) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalHypoMethod.g:3363:4: (lv_l_5_0= RULE_FACTORLEVELVALUE )
                    {
                    // InternalHypoMethod.g:3363:4: (lv_l_5_0= RULE_FACTORLEVELVALUE )
                    // InternalHypoMethod.g:3364:5: lv_l_5_0= RULE_FACTORLEVELVALUE
                    {
                    lv_l_5_0=(Token)match(input,RULE_FACTORLEVELVALUE,FOLLOW_86); 

                    					newLeafNode(lv_l_5_0, grammarAccess.getFactorLevelsAccess().getLFactorLevelValueTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorLevelsRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"l",
                    						lv_l_5_0,
                    						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.factorLevelValue");
                    				

                    }


                    }
                    break;

            }

            // InternalHypoMethod.g:3380:3: ( ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=125 && LA86_0<=127)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalHypoMethod.g:3381:4: ( (lv_l1_6_0= ruleLevels ) ) otherlv_7= 'where' ( (lv_l2_8_0= ruleLevels ) ) otherlv_9= 'is' otherlv_10= 'in the range' ( (lv_start1_11_0= RULE_RANGEVALUE ) ) otherlv_12= 'to' ( (lv_end1_13_0= RULE_RANGEVALUE ) )
                    {
                    // InternalHypoMethod.g:3381:4: ( (lv_l1_6_0= ruleLevels ) )
                    // InternalHypoMethod.g:3382:5: (lv_l1_6_0= ruleLevels )
                    {
                    // InternalHypoMethod.g:3382:5: (lv_l1_6_0= ruleLevels )
                    // InternalHypoMethod.g:3383:6: lv_l1_6_0= ruleLevels
                    {

                    						newCompositeNode(grammarAccess.getFactorLevelsAccess().getL1LevelsEnumRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_104);
                    lv_l1_6_0=ruleLevels();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorLevelsRule());
                    						}
                    						set(
                    							current,
                    							"l1",
                    							lv_l1_6_0,
                    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Levels");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,71,FOLLOW_79); 

                    				newLeafNode(otherlv_7, grammarAccess.getFactorLevelsAccess().getWhereKeyword_6_1());
                    			
                    // InternalHypoMethod.g:3404:4: ( (lv_l2_8_0= ruleLevels ) )
                    // InternalHypoMethod.g:3405:5: (lv_l2_8_0= ruleLevels )
                    {
                    // InternalHypoMethod.g:3405:5: (lv_l2_8_0= ruleLevels )
                    // InternalHypoMethod.g:3406:6: lv_l2_8_0= ruleLevels
                    {

                    						newCompositeNode(grammarAccess.getFactorLevelsAccess().getL2LevelsEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_l2_8_0=ruleLevels();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorLevelsRule());
                    						}
                    						set(
                    							current,
                    							"l2",
                    							lv_l2_8_0,
                    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.Levels");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,61,FOLLOW_88); 

                    				newLeafNode(otherlv_9, grammarAccess.getFactorLevelsAccess().getIsKeyword_6_3());
                    			
                    otherlv_10=(Token)match(input,64,FOLLOW_52); 

                    				newLeafNode(otherlv_10, grammarAccess.getFactorLevelsAccess().getInTheRangeKeyword_6_4());
                    			
                    // InternalHypoMethod.g:3431:4: ( (lv_start1_11_0= RULE_RANGEVALUE ) )
                    // InternalHypoMethod.g:3432:5: (lv_start1_11_0= RULE_RANGEVALUE )
                    {
                    // InternalHypoMethod.g:3432:5: (lv_start1_11_0= RULE_RANGEVALUE )
                    // InternalHypoMethod.g:3433:6: lv_start1_11_0= RULE_RANGEVALUE
                    {
                    lv_start1_11_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_68); 

                    						newLeafNode(lv_start1_11_0, grammarAccess.getFactorLevelsAccess().getStart1RangeValueTerminalRuleCall_6_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFactorLevelsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"start1",
                    							lv_start1_11_0,
                    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,65,FOLLOW_52); 

                    				newLeafNode(otherlv_12, grammarAccess.getFactorLevelsAccess().getToKeyword_6_6());
                    			
                    // InternalHypoMethod.g:3453:4: ( (lv_end1_13_0= RULE_RANGEVALUE ) )
                    // InternalHypoMethod.g:3454:5: (lv_end1_13_0= RULE_RANGEVALUE )
                    {
                    // InternalHypoMethod.g:3454:5: (lv_end1_13_0= RULE_RANGEVALUE )
                    // InternalHypoMethod.g:3455:6: lv_end1_13_0= RULE_RANGEVALUE
                    {
                    lv_end1_13_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_2); 

                    						newLeafNode(lv_end1_13_0, grammarAccess.getFactorLevelsAccess().getEnd1RangeValueTerminalRuleCall_6_7_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFactorLevelsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"end1",
                    							lv_end1_13_0,
                    							"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
                    					

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
    // $ANTLR end "ruleFactorLevels"


    // $ANTLR start "entryRuleResponse"
    // InternalHypoMethod.g:3476:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalHypoMethod.g:3476:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalHypoMethod.g:3477:2: iv_ruleResponse= ruleResponse EOF
            {
             newCompositeNode(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponse=ruleResponse();

            state._fsp--;

             current =iv_ruleResponse; 
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
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalHypoMethod.g:3483:1: ruleResponse returns [EObject current=null] : ( ( (lv_responseName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' ( (lv_responseType_3_0= ruleResponseType ) ) otherlv_4= '}' ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token lv_responseName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_responseType_3_0 = null;



        	enterRule();

        try {
            // InternalHypoMethod.g:3489:2: ( ( ( (lv_responseName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' ( (lv_responseType_3_0= ruleResponseType ) ) otherlv_4= '}' ) )
            // InternalHypoMethod.g:3490:2: ( ( (lv_responseName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' ( (lv_responseType_3_0= ruleResponseType ) ) otherlv_4= '}' )
            {
            // InternalHypoMethod.g:3490:2: ( ( (lv_responseName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' ( (lv_responseType_3_0= ruleResponseType ) ) otherlv_4= '}' )
            // InternalHypoMethod.g:3491:3: ( (lv_responseName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' ( (lv_responseType_3_0= ruleResponseType ) ) otherlv_4= '}'
            {
            // InternalHypoMethod.g:3491:3: ( (lv_responseName_0_0= RULE_ID ) )
            // InternalHypoMethod.g:3492:4: (lv_responseName_0_0= RULE_ID )
            {
            // InternalHypoMethod.g:3492:4: (lv_responseName_0_0= RULE_ID )
            // InternalHypoMethod.g:3493:5: lv_responseName_0_0= RULE_ID
            {
            lv_responseName_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_responseName_0_0, grammarAccess.getResponseAccess().getResponseNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResponseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"responseName",
            						lv_responseName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_97); 

            			newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,81,FOLLOW_105); 

            			newLeafNode(otherlv_2, grammarAccess.getResponseAccess().getTypeKeyword_2());
            		
            // InternalHypoMethod.g:3517:3: ( (lv_responseType_3_0= ruleResponseType ) )
            // InternalHypoMethod.g:3518:4: (lv_responseType_3_0= ruleResponseType )
            {
            // InternalHypoMethod.g:3518:4: (lv_responseType_3_0= ruleResponseType )
            // InternalHypoMethod.g:3519:5: lv_responseType_3_0= ruleResponseType
            {

            					newCompositeNode(grammarAccess.getResponseAccess().getResponseTypeResponseTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_responseType_3_0=ruleResponseType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponseRule());
            					}
            					set(
            						current,
            						"responseType",
            						lv_responseType_3_0,
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.ResponseType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleIteration"
    // InternalHypoMethod.g:3544:1: entryRuleIteration returns [EObject current=null] : iv_ruleIteration= ruleIteration EOF ;
    public final EObject entryRuleIteration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteration = null;


        try {
            // InternalHypoMethod.g:3544:50: (iv_ruleIteration= ruleIteration EOF )
            // InternalHypoMethod.g:3545:2: iv_ruleIteration= ruleIteration EOF
            {
             newCompositeNode(grammarAccess.getIterationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIteration=ruleIteration();

            state._fsp--;

             current =iv_ruleIteration; 
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
    // $ANTLR end "entryRuleIteration"


    // $ANTLR start "ruleIteration"
    // InternalHypoMethod.g:3551:1: ruleIteration returns [EObject current=null] : (otherlv_0= 'number' otherlv_1= 'of' otherlv_2= 'iterations' otherlv_3= ':' ( (lv_iterations_4_0= RULE_INT ) ) ) ;
    public final EObject ruleIteration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_iterations_4_0=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:3557:2: ( (otherlv_0= 'number' otherlv_1= 'of' otherlv_2= 'iterations' otherlv_3= ':' ( (lv_iterations_4_0= RULE_INT ) ) ) )
            // InternalHypoMethod.g:3558:2: (otherlv_0= 'number' otherlv_1= 'of' otherlv_2= 'iterations' otherlv_3= ':' ( (lv_iterations_4_0= RULE_INT ) ) )
            {
            // InternalHypoMethod.g:3558:2: (otherlv_0= 'number' otherlv_1= 'of' otherlv_2= 'iterations' otherlv_3= ':' ( (lv_iterations_4_0= RULE_INT ) ) )
            // InternalHypoMethod.g:3559:3: otherlv_0= 'number' otherlv_1= 'of' otherlv_2= 'iterations' otherlv_3= ':' ( (lv_iterations_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,85,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getIterationAccess().getNumberKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_106); 

            			newLeafNode(otherlv_1, grammarAccess.getIterationAccess().getOfKeyword_1());
            		
            otherlv_2=(Token)match(input,86,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getIterationAccess().getIterationsKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_107); 

            			newLeafNode(otherlv_3, grammarAccess.getIterationAccess().getColonKeyword_3());
            		
            // InternalHypoMethod.g:3575:3: ( (lv_iterations_4_0= RULE_INT ) )
            // InternalHypoMethod.g:3576:4: (lv_iterations_4_0= RULE_INT )
            {
            // InternalHypoMethod.g:3576:4: (lv_iterations_4_0= RULE_INT )
            // InternalHypoMethod.g:3577:5: lv_iterations_4_0= RULE_INT
            {
            lv_iterations_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_iterations_4_0, grammarAccess.getIterationAccess().getIterationsINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIterationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"iterations",
            						lv_iterations_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleIteration"


    // $ANTLR start "entryRulePerformanceMeasure"
    // InternalHypoMethod.g:3597:1: entryRulePerformanceMeasure returns [EObject current=null] : iv_rulePerformanceMeasure= rulePerformanceMeasure EOF ;
    public final EObject entryRulePerformanceMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerformanceMeasure = null;


        try {
            // InternalHypoMethod.g:3597:59: (iv_rulePerformanceMeasure= rulePerformanceMeasure EOF )
            // InternalHypoMethod.g:3598:2: iv_rulePerformanceMeasure= rulePerformanceMeasure EOF
            {
             newCompositeNode(grammarAccess.getPerformanceMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerformanceMeasure=rulePerformanceMeasure();

            state._fsp--;

             current =iv_rulePerformanceMeasure; 
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
    // $ANTLR end "entryRulePerformanceMeasure"


    // $ANTLR start "rulePerformanceMeasure"
    // InternalHypoMethod.g:3604:1: rulePerformanceMeasure returns [EObject current=null] : (otherlv_0= '{' ( (lv_expectedResponse_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_er_3_0= RULE_RANGEVALUE ) ) otherlv_4= ' +-' ( (lv_std_5_0= RULE_RANGEVALUE ) ) otherlv_6= '}' ) ;
    public final EObject rulePerformanceMeasure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_expectedResponse_1_0=null;
        Token otherlv_2=null;
        Token lv_er_3_0=null;
        Token otherlv_4=null;
        Token lv_std_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:3610:2: ( (otherlv_0= '{' ( (lv_expectedResponse_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_er_3_0= RULE_RANGEVALUE ) ) otherlv_4= ' +-' ( (lv_std_5_0= RULE_RANGEVALUE ) ) otherlv_6= '}' ) )
            // InternalHypoMethod.g:3611:2: (otherlv_0= '{' ( (lv_expectedResponse_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_er_3_0= RULE_RANGEVALUE ) ) otherlv_4= ' +-' ( (lv_std_5_0= RULE_RANGEVALUE ) ) otherlv_6= '}' )
            {
            // InternalHypoMethod.g:3611:2: (otherlv_0= '{' ( (lv_expectedResponse_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_er_3_0= RULE_RANGEVALUE ) ) otherlv_4= ' +-' ( (lv_std_5_0= RULE_RANGEVALUE ) ) otherlv_6= '}' )
            // InternalHypoMethod.g:3612:3: otherlv_0= '{' ( (lv_expectedResponse_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_er_3_0= RULE_RANGEVALUE ) ) otherlv_4= ' +-' ( (lv_std_5_0= RULE_RANGEVALUE ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPerformanceMeasureAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalHypoMethod.g:3616:3: ( (lv_expectedResponse_1_0= RULE_ID ) )
            // InternalHypoMethod.g:3617:4: (lv_expectedResponse_1_0= RULE_ID )
            {
            // InternalHypoMethod.g:3617:4: (lv_expectedResponse_1_0= RULE_ID )
            // InternalHypoMethod.g:3618:5: lv_expectedResponse_1_0= RULE_ID
            {
            lv_expectedResponse_1_0=(Token)match(input,RULE_ID,FOLLOW_108); 

            					newLeafNode(lv_expectedResponse_1_0, grammarAccess.getPerformanceMeasureAccess().getExpectedResponseIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerformanceMeasureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expectedResponse",
            						lv_expectedResponse_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,87,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getPerformanceMeasureAccess().getEqualsSignKeyword_2());
            		
            // InternalHypoMethod.g:3638:3: ( (lv_er_3_0= RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:3639:4: (lv_er_3_0= RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:3639:4: (lv_er_3_0= RULE_RANGEVALUE )
            // InternalHypoMethod.g:3640:5: lv_er_3_0= RULE_RANGEVALUE
            {
            lv_er_3_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_109); 

            					newLeafNode(lv_er_3_0, grammarAccess.getPerformanceMeasureAccess().getErRangeValueTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerformanceMeasureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"er",
            						lv_er_3_0,
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
            				

            }


            }

            otherlv_4=(Token)match(input,88,FOLLOW_52); 

            			newLeafNode(otherlv_4, grammarAccess.getPerformanceMeasureAccess().getSpacePlusSignHyphenMinusKeyword_4());
            		
            // InternalHypoMethod.g:3660:3: ( (lv_std_5_0= RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:3661:4: (lv_std_5_0= RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:3661:4: (lv_std_5_0= RULE_RANGEVALUE )
            // InternalHypoMethod.g:3662:5: lv_std_5_0= RULE_RANGEVALUE
            {
            lv_std_5_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_23); 

            					newLeafNode(lv_std_5_0, grammarAccess.getPerformanceMeasureAccess().getStdRangeValueTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerformanceMeasureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"std",
            						lv_std_5_0,
            						"tr.edu.metu.ceng.megamodel.hypomethod.HypoMethod.rangeValue");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPerformanceMeasureAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePerformanceMeasure"


    // $ANTLR start "ruleVariableType"
    // InternalHypoMethod.g:3686:1: ruleVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) | (enumLiteral_2= 'CONTINOUS' ) | (enumLiteral_3= 'DISCRETE' ) | (enumLiteral_4= 'BINARY' ) | (enumLiteral_5= 'NONBINARY' ) ) ;
    public final Enumerator ruleVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:3692:2: ( ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) | (enumLiteral_2= 'CONTINOUS' ) | (enumLiteral_3= 'DISCRETE' ) | (enumLiteral_4= 'BINARY' ) | (enumLiteral_5= 'NONBINARY' ) ) )
            // InternalHypoMethod.g:3693:2: ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) | (enumLiteral_2= 'CONTINOUS' ) | (enumLiteral_3= 'DISCRETE' ) | (enumLiteral_4= 'BINARY' ) | (enumLiteral_5= 'NONBINARY' ) )
            {
            // InternalHypoMethod.g:3693:2: ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) | (enumLiteral_2= 'CONTINOUS' ) | (enumLiteral_3= 'DISCRETE' ) | (enumLiteral_4= 'BINARY' ) | (enumLiteral_5= 'NONBINARY' ) )
            int alt87=6;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt87=1;
                }
                break;
            case 90:
                {
                alt87=2;
                }
                break;
            case 91:
                {
                alt87=3;
                }
                break;
            case 92:
                {
                alt87=4;
                }
                break;
            case 93:
                {
                alt87=5;
                }
                break;
            case 94:
                {
                alt87=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalHypoMethod.g:3694:3: (enumLiteral_0= 'QUALITATIVE' )
                    {
                    // InternalHypoMethod.g:3694:3: (enumLiteral_0= 'QUALITATIVE' )
                    // InternalHypoMethod.g:3695:4: enumLiteral_0= 'QUALITATIVE'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getQUALITATIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVariableTypeAccess().getQUALITATIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:3702:3: (enumLiteral_1= 'QUANTITATIVE' )
                    {
                    // InternalHypoMethod.g:3702:3: (enumLiteral_1= 'QUANTITATIVE' )
                    // InternalHypoMethod.g:3703:4: enumLiteral_1= 'QUANTITATIVE'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getQUANTITATIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVariableTypeAccess().getQUANTITATIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:3710:3: (enumLiteral_2= 'CONTINOUS' )
                    {
                    // InternalHypoMethod.g:3710:3: (enumLiteral_2= 'CONTINOUS' )
                    // InternalHypoMethod.g:3711:4: enumLiteral_2= 'CONTINOUS'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getCONTINOUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVariableTypeAccess().getCONTINOUSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:3718:3: (enumLiteral_3= 'DISCRETE' )
                    {
                    // InternalHypoMethod.g:3718:3: (enumLiteral_3= 'DISCRETE' )
                    // InternalHypoMethod.g:3719:4: enumLiteral_3= 'DISCRETE'
                    {
                    enumLiteral_3=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getDISCRETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVariableTypeAccess().getDISCRETEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHypoMethod.g:3726:3: (enumLiteral_4= 'BINARY' )
                    {
                    // InternalHypoMethod.g:3726:3: (enumLiteral_4= 'BINARY' )
                    // InternalHypoMethod.g:3727:4: enumLiteral_4= 'BINARY'
                    {
                    enumLiteral_4=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getBINARYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVariableTypeAccess().getBINARYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHypoMethod.g:3734:3: (enumLiteral_5= 'NONBINARY' )
                    {
                    // InternalHypoMethod.g:3734:3: (enumLiteral_5= 'NONBINARY' )
                    // InternalHypoMethod.g:3735:4: enumLiteral_5= 'NONBINARY'
                    {
                    enumLiteral_5=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getNONBINARYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVariableTypeAccess().getNONBINARYEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "ruleExpression"
    // InternalHypoMethod.g:3745:1: ruleExpression returns [Enumerator current=null] : ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) ;
    public final Enumerator ruleExpression() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:3751:2: ( ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) )
            // InternalHypoMethod.g:3752:2: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            {
            // InternalHypoMethod.g:3752:2: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==95) ) {
                alt88=1;
            }
            else if ( (LA88_0==96) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalHypoMethod.g:3753:3: (enumLiteral_0= 'TRUE' )
                    {
                    // InternalHypoMethod.g:3753:3: (enumLiteral_0= 'TRUE' )
                    // InternalHypoMethod.g:3754:4: enumLiteral_0= 'TRUE'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getExpressionAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getExpressionAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:3761:3: (enumLiteral_1= 'FALSE' )
                    {
                    // InternalHypoMethod.g:3761:3: (enumLiteral_1= 'FALSE' )
                    // InternalHypoMethod.g:3762:4: enumLiteral_1= 'FALSE'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_2); 

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
    // InternalHypoMethod.g:3772:1: ruleLinks returns [Enumerator current=null] : ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) ) ;
    public final Enumerator ruleLinks() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:3778:2: ( ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) ) )
            // InternalHypoMethod.g:3779:2: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) )
            {
            // InternalHypoMethod.g:3779:2: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) )
            int alt89=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt89=1;
                }
                break;
            case 97:
                {
                alt89=2;
                }
                break;
            case 65:
                {
                alt89=3;
                }
                break;
            case 98:
                {
                alt89=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalHypoMethod.g:3780:3: (enumLiteral_0= 'is' )
                    {
                    // InternalHypoMethod.g:3780:3: (enumLiteral_0= 'is' )
                    // InternalHypoMethod.g:3781:4: enumLiteral_0= 'is'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getLinksAccess().getIsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLinksAccess().getIsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:3788:3: (enumLiteral_1= 'occurs' )
                    {
                    // InternalHypoMethod.g:3788:3: (enumLiteral_1= 'occurs' )
                    // InternalHypoMethod.g:3789:4: enumLiteral_1= 'occurs'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getLinksAccess().getOccursEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLinksAccess().getOccursEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:3796:3: (enumLiteral_2= 'to' )
                    {
                    // InternalHypoMethod.g:3796:3: (enumLiteral_2= 'to' )
                    // InternalHypoMethod.g:3797:4: enumLiteral_2= 'to'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getLinksAccess().getToEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLinksAccess().getToEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:3804:3: (enumLiteral_3= 'in' )
                    {
                    // InternalHypoMethod.g:3804:3: (enumLiteral_3= 'in' )
                    // InternalHypoMethod.g:3805:4: enumLiteral_3= 'in'
                    {
                    enumLiteral_3=(Token)match(input,98,FOLLOW_2); 

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
    // InternalHypoMethod.g:3815:1: ruleTemporal returns [Enumerator current=null] : ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) ) ;
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
            // InternalHypoMethod.g:3821:2: ( ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) ) )
            // InternalHypoMethod.g:3822:2: ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) )
            {
            // InternalHypoMethod.g:3822:2: ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) )
            int alt90=11;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt90=1;
                }
                break;
            case 100:
                {
                alt90=2;
                }
                break;
            case 101:
                {
                alt90=3;
                }
                break;
            case 102:
                {
                alt90=4;
                }
                break;
            case 103:
                {
                alt90=5;
                }
                break;
            case 104:
                {
                alt90=6;
                }
                break;
            case 105:
                {
                alt90=7;
                }
                break;
            case 106:
                {
                alt90=8;
                }
                break;
            case 107:
                {
                alt90=9;
                }
                break;
            case 108:
                {
                alt90=10;
                }
                break;
            case 109:
                {
                alt90=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalHypoMethod.g:3823:3: (enumLiteral_0= 'precedes' )
                    {
                    // InternalHypoMethod.g:3823:3: (enumLiteral_0= 'precedes' )
                    // InternalHypoMethod.g:3824:4: enumLiteral_0= 'precedes'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getPrecedesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTemporalAccess().getPrecedesEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:3831:3: (enumLiteral_1= 'between' )
                    {
                    // InternalHypoMethod.g:3831:3: (enumLiteral_1= 'between' )
                    // InternalHypoMethod.g:3832:4: enumLiteral_1= 'between'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getBetweenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTemporalAccess().getBetweenEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:3839:3: (enumLiteral_2= 'eventually' )
                    {
                    // InternalHypoMethod.g:3839:3: (enumLiteral_2= 'eventually' )
                    // InternalHypoMethod.g:3840:4: enumLiteral_2= 'eventually'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getEventuallyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTemporalAccess().getEventuallyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:3847:3: (enumLiteral_3= 'always' )
                    {
                    // InternalHypoMethod.g:3847:3: (enumLiteral_3= 'always' )
                    // InternalHypoMethod.g:3848:4: enumLiteral_3= 'always'
                    {
                    enumLiteral_3=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getAlwaysEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTemporalAccess().getAlwaysEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHypoMethod.g:3855:3: (enumLiteral_4= 'before' )
                    {
                    // InternalHypoMethod.g:3855:3: (enumLiteral_4= 'before' )
                    // InternalHypoMethod.g:3856:4: enumLiteral_4= 'before'
                    {
                    enumLiteral_4=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getBeforeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTemporalAccess().getBeforeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHypoMethod.g:3863:3: (enumLiteral_5= 'after' )
                    {
                    // InternalHypoMethod.g:3863:3: (enumLiteral_5= 'after' )
                    // InternalHypoMethod.g:3864:4: enumLiteral_5= 'after'
                    {
                    enumLiteral_5=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getAfterEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTemporalAccess().getAfterEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalHypoMethod.g:3871:3: (enumLiteral_6= 'until' )
                    {
                    // InternalHypoMethod.g:3871:3: (enumLiteral_6= 'until' )
                    // InternalHypoMethod.g:3872:4: enumLiteral_6= 'until'
                    {
                    enumLiteral_6=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getUntilEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTemporalAccess().getUntilEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalHypoMethod.g:3879:3: (enumLiteral_7= 'never' )
                    {
                    // InternalHypoMethod.g:3879:3: (enumLiteral_7= 'never' )
                    // InternalHypoMethod.g:3880:4: enumLiteral_7= 'never'
                    {
                    enumLiteral_7=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getNeverEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTemporalAccess().getNeverEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalHypoMethod.g:3887:3: (enumLiteral_8= 'leads' )
                    {
                    // InternalHypoMethod.g:3887:3: (enumLiteral_8= 'leads' )
                    // InternalHypoMethod.g:3888:4: enumLiteral_8= 'leads'
                    {
                    enumLiteral_8=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getLeadsEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTemporalAccess().getLeadsEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalHypoMethod.g:3895:3: (enumLiteral_9= 'absent' )
                    {
                    // InternalHypoMethod.g:3895:3: (enumLiteral_9= 'absent' )
                    // InternalHypoMethod.g:3896:4: enumLiteral_9= 'absent'
                    {
                    enumLiteral_9=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getAbsentEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getTemporalAccess().getAbsentEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalHypoMethod.g:3903:3: (enumLiteral_10= 'exists' )
                    {
                    // InternalHypoMethod.g:3903:3: (enumLiteral_10= 'exists' )
                    // InternalHypoMethod.g:3904:4: enumLiteral_10= 'exists'
                    {
                    enumLiteral_10=(Token)match(input,109,FOLLOW_2); 

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
    // InternalHypoMethod.g:3914:1: ruleLogical returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) ) ;
    public final Enumerator ruleLogical() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:3920:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) ) )
            // InternalHypoMethod.g:3921:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) )
            {
            // InternalHypoMethod.g:3921:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) )
            int alt91=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt91=1;
                }
                break;
            case 110:
                {
                alt91=2;
                }
                break;
            case 111:
                {
                alt91=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalHypoMethod.g:3922:3: (enumLiteral_0= 'and' )
                    {
                    // InternalHypoMethod.g:3922:3: (enumLiteral_0= 'and' )
                    // InternalHypoMethod.g:3923:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getLogicalAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:3930:3: (enumLiteral_1= 'or' )
                    {
                    // InternalHypoMethod.g:3930:3: (enumLiteral_1= 'or' )
                    // InternalHypoMethod.g:3931:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getLogicalAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicalAccess().getOrEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:3938:3: (enumLiteral_2= 'not' )
                    {
                    // InternalHypoMethod.g:3938:3: (enumLiteral_2= 'not' )
                    // InternalHypoMethod.g:3939:4: enumLiteral_2= 'not'
                    {
                    enumLiteral_2=(Token)match(input,111,FOLLOW_2); 

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
    // InternalHypoMethod.g:3949:1: ruleCoherence returns [Enumerator current=null] : ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) ) ;
    public final Enumerator ruleCoherence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:3955:2: ( ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) ) )
            // InternalHypoMethod.g:3956:2: ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) )
            {
            // InternalHypoMethod.g:3956:2: ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) )
            int alt92=4;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt92=1;
                }
                break;
            case 113:
                {
                alt92=2;
                }
                break;
            case 114:
                {
                alt92=3;
                }
                break;
            case 115:
                {
                alt92=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalHypoMethod.g:3957:3: (enumLiteral_0= 'EXPLAIN' )
                    {
                    // InternalHypoMethod.g:3957:3: (enumLiteral_0= 'EXPLAIN' )
                    // InternalHypoMethod.g:3958:4: enumLiteral_0= 'EXPLAIN'
                    {
                    enumLiteral_0=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getCoherenceAccess().getEXPLAINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCoherenceAccess().getEXPLAINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:3965:3: (enumLiteral_1= 'ANALOGOUS' )
                    {
                    // InternalHypoMethod.g:3965:3: (enumLiteral_1= 'ANALOGOUS' )
                    // InternalHypoMethod.g:3966:4: enumLiteral_1= 'ANALOGOUS'
                    {
                    enumLiteral_1=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getCoherenceAccess().getANALOGOUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCoherenceAccess().getANALOGOUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:3973:3: (enumLiteral_2= 'DATA' )
                    {
                    // InternalHypoMethod.g:3973:3: (enumLiteral_2= 'DATA' )
                    // InternalHypoMethod.g:3974:4: enumLiteral_2= 'DATA'
                    {
                    enumLiteral_2=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getCoherenceAccess().getDATAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCoherenceAccess().getDATAEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:3981:3: (enumLiteral_3= 'CONTRADICT' )
                    {
                    // InternalHypoMethod.g:3981:3: (enumLiteral_3= 'CONTRADICT' )
                    // InternalHypoMethod.g:3982:4: enumLiteral_3= 'CONTRADICT'
                    {
                    enumLiteral_3=(Token)match(input,115,FOLLOW_2); 

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


    // $ANTLR start "ruleFunction"
    // InternalHypoMethod.g:3992:1: ruleFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) ) ;
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
            // InternalHypoMethod.g:3998:2: ( ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) ) )
            // InternalHypoMethod.g:3999:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) )
            {
            // InternalHypoMethod.g:3999:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) )
            int alt93=9;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt93=1;
                }
                break;
            case 117:
                {
                alt93=2;
                }
                break;
            case 118:
                {
                alt93=3;
                }
                break;
            case 119:
                {
                alt93=4;
                }
                break;
            case 120:
                {
                alt93=5;
                }
                break;
            case 121:
                {
                alt93=6;
                }
                break;
            case 122:
                {
                alt93=7;
                }
                break;
            case 123:
                {
                alt93=8;
                }
                break;
            case 124:
                {
                alt93=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalHypoMethod.g:4000:3: (enumLiteral_0= 'MIN' )
                    {
                    // InternalHypoMethod.g:4000:3: (enumLiteral_0= 'MIN' )
                    // InternalHypoMethod.g:4001:4: enumLiteral_0= 'MIN'
                    {
                    enumLiteral_0=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getMINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFunctionAccess().getMINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:4008:3: (enumLiteral_1= 'MAX' )
                    {
                    // InternalHypoMethod.g:4008:3: (enumLiteral_1= 'MAX' )
                    // InternalHypoMethod.g:4009:4: enumLiteral_1= 'MAX'
                    {
                    enumLiteral_1=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getMAXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFunctionAccess().getMAXEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:4016:3: (enumLiteral_2= 'EXP' )
                    {
                    // InternalHypoMethod.g:4016:3: (enumLiteral_2= 'EXP' )
                    // InternalHypoMethod.g:4017:4: enumLiteral_2= 'EXP'
                    {
                    enumLiteral_2=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getEXPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFunctionAccess().getEXPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:4024:3: (enumLiteral_3= 'INVERSE' )
                    {
                    // InternalHypoMethod.g:4024:3: (enumLiteral_3= 'INVERSE' )
                    // InternalHypoMethod.g:4025:4: enumLiteral_3= 'INVERSE'
                    {
                    enumLiteral_3=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getINVERSEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFunctionAccess().getINVERSEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHypoMethod.g:4032:3: (enumLiteral_4= 'SIN' )
                    {
                    // InternalHypoMethod.g:4032:3: (enumLiteral_4= 'SIN' )
                    // InternalHypoMethod.g:4033:4: enumLiteral_4= 'SIN'
                    {
                    enumLiteral_4=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getSINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFunctionAccess().getSINEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHypoMethod.g:4040:3: (enumLiteral_5= 'COS' )
                    {
                    // InternalHypoMethod.g:4040:3: (enumLiteral_5= 'COS' )
                    // InternalHypoMethod.g:4041:4: enumLiteral_5= 'COS'
                    {
                    enumLiteral_5=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getCOSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFunctionAccess().getCOSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalHypoMethod.g:4048:3: (enumLiteral_6= 'TAN' )
                    {
                    // InternalHypoMethod.g:4048:3: (enumLiteral_6= 'TAN' )
                    // InternalHypoMethod.g:4049:4: enumLiteral_6= 'TAN'
                    {
                    enumLiteral_6=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getTANEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFunctionAccess().getTANEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalHypoMethod.g:4056:3: (enumLiteral_7= 'FACTORIAL' )
                    {
                    // InternalHypoMethod.g:4056:3: (enumLiteral_7= 'FACTORIAL' )
                    // InternalHypoMethod.g:4057:4: enumLiteral_7= 'FACTORIAL'
                    {
                    enumLiteral_7=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getFACTORIALEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFunctionAccess().getFACTORIALEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalHypoMethod.g:4064:3: (enumLiteral_8= 'LOG' )
                    {
                    // InternalHypoMethod.g:4064:3: (enumLiteral_8= 'LOG' )
                    // InternalHypoMethod.g:4065:4: enumLiteral_8= 'LOG'
                    {
                    enumLiteral_8=(Token)match(input,124,FOLLOW_2); 

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
    // InternalHypoMethod.g:4075:1: ruleLevels returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) ;
    public final Enumerator ruleLevels() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:4081:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) )
            // InternalHypoMethod.g:4082:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            {
            // InternalHypoMethod.g:4082:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            int alt94=3;
            switch ( input.LA(1) ) {
            case 125:
                {
                alt94=1;
                }
                break;
            case 126:
                {
                alt94=2;
                }
                break;
            case 127:
                {
                alt94=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalHypoMethod.g:4083:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalHypoMethod.g:4083:3: (enumLiteral_0= 'HIGH' )
                    // InternalHypoMethod.g:4084:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getLevelsAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLevelsAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:4091:3: (enumLiteral_1= 'MEDIUM' )
                    {
                    // InternalHypoMethod.g:4091:3: (enumLiteral_1= 'MEDIUM' )
                    // InternalHypoMethod.g:4092:4: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,126,FOLLOW_2); 

                    				current = grammarAccess.getLevelsAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLevelsAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:4099:3: (enumLiteral_2= 'LOW' )
                    {
                    // InternalHypoMethod.g:4099:3: (enumLiteral_2= 'LOW' )
                    // InternalHypoMethod.g:4100:4: enumLiteral_2= 'LOW'
                    {
                    enumLiteral_2=(Token)match(input,127,FOLLOW_2); 

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


    // $ANTLR start "ruleDesignType"
    // InternalHypoMethod.g:4110:1: ruleDesignType returns [Enumerator current=null] : ( (enumLiteral_0= 'FULLFACTORIAL' ) | (enumLiteral_1= 'FRACTIONALFACTORIAL' ) | (enumLiteral_2= 'OTHERS' ) ) ;
    public final Enumerator ruleDesignType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:4116:2: ( ( (enumLiteral_0= 'FULLFACTORIAL' ) | (enumLiteral_1= 'FRACTIONALFACTORIAL' ) | (enumLiteral_2= 'OTHERS' ) ) )
            // InternalHypoMethod.g:4117:2: ( (enumLiteral_0= 'FULLFACTORIAL' ) | (enumLiteral_1= 'FRACTIONALFACTORIAL' ) | (enumLiteral_2= 'OTHERS' ) )
            {
            // InternalHypoMethod.g:4117:2: ( (enumLiteral_0= 'FULLFACTORIAL' ) | (enumLiteral_1= 'FRACTIONALFACTORIAL' ) | (enumLiteral_2= 'OTHERS' ) )
            int alt95=3;
            switch ( input.LA(1) ) {
            case 128:
                {
                alt95=1;
                }
                break;
            case 129:
                {
                alt95=2;
                }
                break;
            case 130:
                {
                alt95=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalHypoMethod.g:4118:3: (enumLiteral_0= 'FULLFACTORIAL' )
                    {
                    // InternalHypoMethod.g:4118:3: (enumLiteral_0= 'FULLFACTORIAL' )
                    // InternalHypoMethod.g:4119:4: enumLiteral_0= 'FULLFACTORIAL'
                    {
                    enumLiteral_0=(Token)match(input,128,FOLLOW_2); 

                    				current = grammarAccess.getDesignTypeAccess().getFULLFACTORIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDesignTypeAccess().getFULLFACTORIALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:4126:3: (enumLiteral_1= 'FRACTIONALFACTORIAL' )
                    {
                    // InternalHypoMethod.g:4126:3: (enumLiteral_1= 'FRACTIONALFACTORIAL' )
                    // InternalHypoMethod.g:4127:4: enumLiteral_1= 'FRACTIONALFACTORIAL'
                    {
                    enumLiteral_1=(Token)match(input,129,FOLLOW_2); 

                    				current = grammarAccess.getDesignTypeAccess().getFRACTIONALFACTORIALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDesignTypeAccess().getFRACTIONALFACTORIALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:4134:3: (enumLiteral_2= 'OTHERS' )
                    {
                    // InternalHypoMethod.g:4134:3: (enumLiteral_2= 'OTHERS' )
                    // InternalHypoMethod.g:4135:4: enumLiteral_2= 'OTHERS'
                    {
                    enumLiteral_2=(Token)match(input,130,FOLLOW_2); 

                    				current = grammarAccess.getDesignTypeAccess().getOTHERSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDesignTypeAccess().getOTHERSEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDesignType"


    // $ANTLR start "ruleResponseType"
    // InternalHypoMethod.g:4145:1: ruleResponseType returns [Enumerator current=null] : ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'COMPOSITE' ) ) ;
    public final Enumerator ruleResponseType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalHypoMethod.g:4151:2: ( ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'COMPOSITE' ) ) )
            // InternalHypoMethod.g:4152:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'COMPOSITE' ) )
            {
            // InternalHypoMethod.g:4152:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'COMPOSITE' ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==131) ) {
                alt96=1;
            }
            else if ( (LA96_0==132) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalHypoMethod.g:4153:3: (enumLiteral_0= 'SIMPLE' )
                    {
                    // InternalHypoMethod.g:4153:3: (enumLiteral_0= 'SIMPLE' )
                    // InternalHypoMethod.g:4154:4: enumLiteral_0= 'SIMPLE'
                    {
                    enumLiteral_0=(Token)match(input,131,FOLLOW_2); 

                    				current = grammarAccess.getResponseTypeAccess().getSIMPLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResponseTypeAccess().getSIMPLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:4161:3: (enumLiteral_1= 'COMPOSITE' )
                    {
                    // InternalHypoMethod.g:4161:3: (enumLiteral_1= 'COMPOSITE' )
                    // InternalHypoMethod.g:4162:4: enumLiteral_1= 'COMPOSITE'
                    {
                    enumLiteral_1=(Token)match(input,132,FOLLOW_2); 

                    				current = grammarAccess.getResponseTypeAccess().getCOMPOSITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getResponseTypeAccess().getCOMPOSITEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleResponseType"

    // Delegated rules


    protected DFA41 dfa41 = new DFA41(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\3\21\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\4\1\uffff\1\25\4\4\1\uffff\1\4\2\25\1\71\2\4\1\25\1\71";
    static final String dfa_4s = "\1\157\1\uffff\1\4\1\uffff\1\157\1\71\3\4\1\uffff\1\4\2\157\2\71\1\4\1\157\1\71";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\2\5\uffff\1\1\10\uffff";
    static final String dfa_6s = "\22\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\3\10\uffff\1\3\4\uffff\1\2\45\uffff\1\3\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\32\uffff\21\3",
            "",
            "\1\4",
            "",
            "\1\11\42\uffff\1\5\13\uffff\1\6\51\uffff\1\7\1\10",
            "\1\12\64\uffff\1\13",
            "\1\14",
            "\1\14",
            "\1\14",
            "",
            "\1\15",
            "\1\11\56\uffff\1\6\51\uffff\1\7\1\10",
            "\1\11\42\uffff\1\16\13\uffff\1\6\51\uffff\1\7\1\10",
            "\1\13",
            "\1\17\64\uffff\1\20",
            "\1\21",
            "\1\11\56\uffff\1\6\51\uffff\1\7\1\10",
            "\1\20"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1780:3: ( (lv_e_2_0= ruleEvent ) )?";
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\13\uffff\2\11";
    static final String dfa_10s = "\1\74\1\4\1\uffff\2\4\1\uffff\1\75\2\4\1\uffff\1\75\2\4";
    static final String dfa_11s = "\1\103\1\102\1\uffff\1\75\1\105\1\uffff\1\75\1\104\1\107\1\uffff\1\75\2\107";
    static final String dfa_12s = "\2\uffff\1\2\2\uffff\1\3\3\uffff\1\1\3\uffff";
    static final String dfa_13s = "\15\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\6\uffff\1\2",
            "\1\3\70\uffff\1\4\4\uffff\1\5",
            "",
            "\1\6\70\uffff\1\4",
            "\1\5\1\uffff\1\7\66\uffff\1\5\3\11\1\uffff\1\10\1\uffff\2\5",
            "",
            "\1\4",
            "\1\5\70\uffff\1\5\3\11\1\uffff\1\10\1\uffff\1\5",
            "\1\12\102\uffff\1\5",
            "",
            "\1\13",
            "\1\5\1\uffff\1\14\10\uffff\1\11\54\uffff\1\11\3\uffff\1\11\2\uffff\1\11\2\5\1\uffff\1\5",
            "\1\5\12\uffff\1\11\54\uffff\1\11\3\uffff\1\11\2\uffff\1\11\1\5\2\uffff\1\5"
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
            return "2066:2: (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0008080000002002L,0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000003000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000003000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000FFFE20010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000010L,0x000000007E000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000080F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000400000000F0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00F0000000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00E0000000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00C0000000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000008000L,0x000F000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400000000100010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x2000000000000002L,0x0000FFFF80000012L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000000002L,0x0000FFFE00000012L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000FFFD20052L,0x0000000180000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000100052L,0x0000000180000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000042L,0x0000000180000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000200000L,0x0000FFF800000010L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xC000000000000040L,0x0000000000000005L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000001L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000010L,0x1FF0000000000010L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000012L,0x1FF0000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x2000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x2000000000000050L,0x0000000000000034L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0xE000000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x2000000000000050L,0x0000000000000014L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x2000000000000010L,0x0000000000000014L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000050L,0x00000000000000B0L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000050L,0x0000000000000090L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000090L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0xE000000000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000207000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000206000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x000000007E000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000082L,0xE000000000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});

}