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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_RANGEVALUE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'change'", "'{'", "'}'", "'removeXML'", "'changeAttribute'", "'newValue'", "':'", "'computeChange'", "'math'", "'addXML'", "'changeXML'", "'newXML'", "'anyXML'", "'listOfDataDescriptions'", "'dataDescription'", "'id'", "'name'", "'format'", "'source'", "'dimensionDescription'", "'xmlns'", "'listOfDataSources'", "'dataSource'", "'indexSet'", "'listOfDataSlices'", "'slice'", "'reference'", "'value'", "'listOfHypotheses'", "'hypotheses'", "'mechanistic'", "'evidence'", "'coherence'", "'model'", "'relational'", "'if'", "'is'", "'added'", "'removed'", "'in the range'", "'to'", "'then'", "'compare'", "'and'", "'at'", "'level'", "'where'", "'for'", "'('", "')'", "'activation'", "'weight'", "'+'", "'-'", "'*'", "'/'", "'%'", "' = '", "' == '", "'&&'", "'||'", "'<'", "'<='", "'>'", "'>='", "'!'", "'!='", "'['", "']'", "'listOfModels'", "'language'", "'listOfChanges'", "'dataGenerator'", "'listOfParameters'", "'parameter'", "'listOfDataVariables'", "'variable'", "'target'", "'taskReference'", "'modelReference'", "'symbol'", "'listOfTasks'", "'listOfRepeatedTasks'", "'listOfRanges'", "'uniformRange'", "'start'", "'end'", "'type'", "'vectorRange'", "'content'", "'functionalRange'", "'range'", "'subTask'", "'task'", "'order'", "'simulationReference'", "'listOfDataGenerators'", "'xlms'", "'listOfOutputs'", "'plot2D'", "'plot3D'", "'report'", "'listOfCurves'", "'dataSet'", "'label'", "'dataReference'", "'surface'", "'logX'", "'logY'", "'logZ'", "'xDataReference'", "'yDataReference'", "'zDataReference'", "'curve'", "'listOfSimulations'", "'uniformtimecourse'", "'initialTime'", "'outputStartTime'", "'outputEndTime'", "'numberOfPoints'", "'oneStep'", "'step'", "'steadyState'", "'.'", "'algorithm'", "'kisaoID'", "'listOfAlgorithmParameters'", "'algorithmParameter'", "'MIN'", "'MAX'", "'EXP'", "'INVERSE'", "'SIN'", "'COS'", "'TAN'", "'FACTORIAL'", "'LOG'", "'HIGH'", "'MEDIUM'", "'LOW'", "'TRUE'", "'FALSE'", "'occurs'", "'in'", "'precedes'", "'between'", "'eventually'", "'always'", "'before'", "'after'", "'until'", "'never'", "'leads'", "'absent'", "'exists'", "'or'", "'not'", "'EXPLAIN'", "'ANALOGOUS'", "'DATA'", "'CONTRADICT'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=6;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
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
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__168=168;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
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
    public static final int T__172=172;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__169=169;
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
    public static final int RULE_STRING=4;
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
    public static final int RULE_RANGEVALUE=7;
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
        	return "SEDBase";
       	}

       	@Override
       	protected SedmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSEDBase"
    // InternalSedml.g:65:1: entryRuleSEDBase returns [EObject current=null] : iv_ruleSEDBase= ruleSEDBase EOF ;
    public final EObject entryRuleSEDBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEDBase = null;


        try {
            // InternalSedml.g:65:48: (iv_ruleSEDBase= ruleSEDBase EOF )
            // InternalSedml.g:66:2: iv_ruleSEDBase= ruleSEDBase EOF
            {
             newCompositeNode(grammarAccess.getSEDBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSEDBase=ruleSEDBase();

            state._fsp--;

             current =iv_ruleSEDBase; 
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
    // $ANTLR end "entryRuleSEDBase"


    // $ANTLR start "ruleSEDBase"
    // InternalSedml.g:72:1: ruleSEDBase returns [EObject current=null] : (this_parameter_0= ruleparameter | this_variable_1= rulevariable | this_sedML_2= rulesedML | this_model_3= rulemodel | this_dataDescription_4= ruledataDescription | this_abstractTask_5= ruleabstractTask | this_dataGenerator_6= ruledataGenerator | this_simulation_7= rulesimulation | this_change_8= rulechange ) ;
    public final EObject ruleSEDBase() throws RecognitionException {
        EObject current = null;

        EObject this_parameter_0 = null;

        EObject this_variable_1 = null;

        EObject this_sedML_2 = null;

        EObject this_model_3 = null;

        EObject this_dataDescription_4 = null;

        EObject this_abstractTask_5 = null;

        EObject this_dataGenerator_6 = null;

        EObject this_simulation_7 = null;

        EObject this_change_8 = null;



        	enterRule();

        try {
            // InternalSedml.g:78:2: ( (this_parameter_0= ruleparameter | this_variable_1= rulevariable | this_sedML_2= rulesedML | this_model_3= rulemodel | this_dataDescription_4= ruledataDescription | this_abstractTask_5= ruleabstractTask | this_dataGenerator_6= ruledataGenerator | this_simulation_7= rulesimulation | this_change_8= rulechange ) )
            // InternalSedml.g:79:2: (this_parameter_0= ruleparameter | this_variable_1= rulevariable | this_sedML_2= rulesedML | this_model_3= rulemodel | this_dataDescription_4= ruledataDescription | this_abstractTask_5= ruleabstractTask | this_dataGenerator_6= ruledataGenerator | this_simulation_7= rulesimulation | this_change_8= rulechange )
            {
            // InternalSedml.g:79:2: (this_parameter_0= ruleparameter | this_variable_1= rulevariable | this_sedML_2= rulesedML | this_model_3= rulemodel | this_dataDescription_4= ruledataDescription | this_abstractTask_5= ruleabstractTask | this_dataGenerator_6= ruledataGenerator | this_simulation_7= rulesimulation | this_change_8= rulechange )
            int alt1=9;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt1=1;
                }
                break;
            case 88:
                {
                alt1=2;
                }
                break;
            case RULE_INT:
                {
                alt1=3;
                }
                break;
            case 45:
                {
                alt1=4;
                }
                break;
            case 26:
                {
                alt1=5;
                }
                break;
            case 94:
            case 105:
                {
                alt1=6;
                }
                break;
            case 84:
                {
                alt1=7;
                }
                break;
            case 127:
            case 132:
            case 134:
                {
                alt1=8;
                }
                break;
            case 12:
                {
                alt1=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSedml.g:80:3: this_parameter_0= ruleparameter
                    {

                    			newCompositeNode(grammarAccess.getSEDBaseAccess().getParameterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_parameter_0=ruleparameter();

                    state._fsp--;


                    			current = this_parameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSedml.g:89:3: this_variable_1= rulevariable
                    {

                    			newCompositeNode(grammarAccess.getSEDBaseAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_variable_1=rulevariable();

                    state._fsp--;


                    			current = this_variable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSedml.g:98:3: this_sedML_2= rulesedML
                    {

                    			newCompositeNode(grammarAccess.getSEDBaseAccess().getSedMLParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_sedML_2=rulesedML();

                    state._fsp--;


                    			current = this_sedML_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSedml.g:107:3: this_model_3= rulemodel
                    {

                    			newCompositeNode(grammarAccess.getSEDBaseAccess().getModelParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_model_3=rulemodel();

                    state._fsp--;


                    			current = this_model_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSedml.g:116:3: this_dataDescription_4= ruledataDescription
                    {

                    			newCompositeNode(grammarAccess.getSEDBaseAccess().getDataDescriptionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_dataDescription_4=ruledataDescription();

                    state._fsp--;


                    			current = this_dataDescription_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSedml.g:125:3: this_abstractTask_5= ruleabstractTask
                    {

                    			newCompositeNode(grammarAccess.getSEDBaseAccess().getAbstractTaskParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_abstractTask_5=ruleabstractTask();

                    state._fsp--;


                    			current = this_abstractTask_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSedml.g:134:3: this_dataGenerator_6= ruledataGenerator
                    {

                    			newCompositeNode(grammarAccess.getSEDBaseAccess().getDataGeneratorParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_dataGenerator_6=ruledataGenerator();

                    state._fsp--;


                    			current = this_dataGenerator_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSedml.g:143:3: this_simulation_7= rulesimulation
                    {

                    			newCompositeNode(grammarAccess.getSEDBaseAccess().getSimulationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_simulation_7=rulesimulation();

                    state._fsp--;


                    			current = this_simulation_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSedml.g:152:3: this_change_8= rulechange
                    {

                    			newCompositeNode(grammarAccess.getSEDBaseAccess().getChangeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_change_8=rulechange();

                    state._fsp--;


                    			current = this_change_8;
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
    // $ANTLR end "ruleSEDBase"


    // $ANTLR start "entryRulechange"
    // InternalSedml.g:164:1: entryRulechange returns [EObject current=null] : iv_rulechange= rulechange EOF ;
    public final EObject entryRulechange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulechange = null;


        try {
            // InternalSedml.g:164:47: (iv_rulechange= rulechange EOF )
            // InternalSedml.g:165:2: iv_rulechange= rulechange EOF
            {
             newCompositeNode(grammarAccess.getChangeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulechange=rulechange();

            state._fsp--;

             current =iv_rulechange; 
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
    // $ANTLR end "entryRulechange"


    // $ANTLR start "rulechange"
    // InternalSedml.g:171:1: rulechange returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= '{' ( (lv_target_2_0= ruletarget ) )* otherlv_3= '}' ) ;
    public final EObject rulechange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_target_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:177:2: ( (otherlv_0= 'change' otherlv_1= '{' ( (lv_target_2_0= ruletarget ) )* otherlv_3= '}' ) )
            // InternalSedml.g:178:2: (otherlv_0= 'change' otherlv_1= '{' ( (lv_target_2_0= ruletarget ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:178:2: (otherlv_0= 'change' otherlv_1= '{' ( (lv_target_2_0= ruletarget ) )* otherlv_3= '}' )
            // InternalSedml.g:179:3: otherlv_0= 'change' otherlv_1= '{' ( (lv_target_2_0= ruletarget ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:187:3: ( (lv_target_2_0= ruletarget ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=16)||LA2_0==19||(LA2_0>=21 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSedml.g:188:4: (lv_target_2_0= ruletarget )
            	    {
            	    // InternalSedml.g:188:4: (lv_target_2_0= ruletarget )
            	    // InternalSedml.g:189:5: lv_target_2_0= ruletarget
            	    {

            	    					newCompositeNode(grammarAccess.getChangeAccess().getTargetTargetParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_target_2_0=ruletarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChangeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"target",
            	    						lv_target_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.target");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulechange"


    // $ANTLR start "entryRuletarget"
    // InternalSedml.g:214:1: entryRuletarget returns [EObject current=null] : iv_ruletarget= ruletarget EOF ;
    public final EObject entryRuletarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletarget = null;


        try {
            // InternalSedml.g:214:47: (iv_ruletarget= ruletarget EOF )
            // InternalSedml.g:215:2: iv_ruletarget= ruletarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletarget=ruletarget();

            state._fsp--;

             current =iv_ruletarget; 
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
    // $ANTLR end "entryRuletarget"


    // $ANTLR start "ruletarget"
    // InternalSedml.g:221:1: ruletarget returns [EObject current=null] : (this_computeChange_0= rulecomputeChange | this_changeAttribute_1= rulechangeAttribute | this_addXML_2= ruleaddXML | this_changeXML_3= rulechangeXML | ruleremoveXML ) ;
    public final EObject ruletarget() throws RecognitionException {
        EObject current = null;

        EObject this_computeChange_0 = null;

        EObject this_changeAttribute_1 = null;

        EObject this_addXML_2 = null;

        EObject this_changeXML_3 = null;



        	enterRule();

        try {
            // InternalSedml.g:227:2: ( (this_computeChange_0= rulecomputeChange | this_changeAttribute_1= rulechangeAttribute | this_addXML_2= ruleaddXML | this_changeXML_3= rulechangeXML | ruleremoveXML ) )
            // InternalSedml.g:228:2: (this_computeChange_0= rulecomputeChange | this_changeAttribute_1= rulechangeAttribute | this_addXML_2= ruleaddXML | this_changeXML_3= rulechangeXML | ruleremoveXML )
            {
            // InternalSedml.g:228:2: (this_computeChange_0= rulecomputeChange | this_changeAttribute_1= rulechangeAttribute | this_addXML_2= ruleaddXML | this_changeXML_3= rulechangeXML | ruleremoveXML )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSedml.g:229:3: this_computeChange_0= rulecomputeChange
                    {

                    			newCompositeNode(grammarAccess.getTargetAccess().getComputeChangeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_computeChange_0=rulecomputeChange();

                    state._fsp--;


                    			current = this_computeChange_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSedml.g:238:3: this_changeAttribute_1= rulechangeAttribute
                    {

                    			newCompositeNode(grammarAccess.getTargetAccess().getChangeAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_changeAttribute_1=rulechangeAttribute();

                    state._fsp--;


                    			current = this_changeAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSedml.g:247:3: this_addXML_2= ruleaddXML
                    {

                    			newCompositeNode(grammarAccess.getTargetAccess().getAddXMLParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_addXML_2=ruleaddXML();

                    state._fsp--;


                    			current = this_addXML_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSedml.g:256:3: this_changeXML_3= rulechangeXML
                    {

                    			newCompositeNode(grammarAccess.getTargetAccess().getChangeXMLParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_changeXML_3=rulechangeXML();

                    state._fsp--;


                    			current = this_changeXML_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSedml.g:265:3: ruleremoveXML
                    {

                    			newCompositeNode(grammarAccess.getTargetAccess().getRemoveXMLParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    ruleremoveXML();

                    state._fsp--;


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
    // $ANTLR end "ruletarget"


    // $ANTLR start "entryRuleremoveXML"
    // InternalSedml.g:276:1: entryRuleremoveXML returns [String current=null] : iv_ruleremoveXML= ruleremoveXML EOF ;
    public final String entryRuleremoveXML() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleremoveXML = null;


        try {
            // InternalSedml.g:276:49: (iv_ruleremoveXML= ruleremoveXML EOF )
            // InternalSedml.g:277:2: iv_ruleremoveXML= ruleremoveXML EOF
            {
             newCompositeNode(grammarAccess.getRemoveXMLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleremoveXML=ruleremoveXML();

            state._fsp--;

             current =iv_ruleremoveXML.getText(); 
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
    // $ANTLR end "entryRuleremoveXML"


    // $ANTLR start "ruleremoveXML"
    // InternalSedml.g:283:1: ruleremoveXML returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'removeXML' ;
    public final AntlrDatatypeRuleToken ruleremoveXML() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSedml.g:289:2: (kw= 'removeXML' )
            // InternalSedml.g:290:2: kw= 'removeXML'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRemoveXMLAccess().getRemoveXMLKeyword());
            	

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
    // $ANTLR end "ruleremoveXML"


    // $ANTLR start "entryRulechangeAttribute"
    // InternalSedml.g:298:1: entryRulechangeAttribute returns [EObject current=null] : iv_rulechangeAttribute= rulechangeAttribute EOF ;
    public final EObject entryRulechangeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulechangeAttribute = null;


        try {
            // InternalSedml.g:298:56: (iv_rulechangeAttribute= rulechangeAttribute EOF )
            // InternalSedml.g:299:2: iv_rulechangeAttribute= rulechangeAttribute EOF
            {
             newCompositeNode(grammarAccess.getChangeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulechangeAttribute=rulechangeAttribute();

            state._fsp--;

             current =iv_rulechangeAttribute; 
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
    // $ANTLR end "entryRulechangeAttribute"


    // $ANTLR start "rulechangeAttribute"
    // InternalSedml.g:305:1: rulechangeAttribute returns [EObject current=null] : (otherlv_0= 'changeAttribute' otherlv_1= '{' otherlv_2= 'newValue' otherlv_3= ':' ( (lv_newValue_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject rulechangeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_newValue_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSedml.g:311:2: ( (otherlv_0= 'changeAttribute' otherlv_1= '{' otherlv_2= 'newValue' otherlv_3= ':' ( (lv_newValue_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalSedml.g:312:2: (otherlv_0= 'changeAttribute' otherlv_1= '{' otherlv_2= 'newValue' otherlv_3= ':' ( (lv_newValue_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalSedml.g:312:2: (otherlv_0= 'changeAttribute' otherlv_1= '{' otherlv_2= 'newValue' otherlv_3= ':' ( (lv_newValue_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalSedml.g:313:3: otherlv_0= 'changeAttribute' otherlv_1= '{' otherlv_2= 'newValue' otherlv_3= ':' ( (lv_newValue_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeAttributeAccess().getChangeAttributeKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeAttributeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getChangeAttributeAccess().getNewValueKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeAttributeAccess().getColonKeyword_3());
            		
            // InternalSedml.g:329:3: ( (lv_newValue_4_0= RULE_STRING ) )
            // InternalSedml.g:330:4: (lv_newValue_4_0= RULE_STRING )
            {
            // InternalSedml.g:330:4: (lv_newValue_4_0= RULE_STRING )
            // InternalSedml.g:331:5: lv_newValue_4_0= RULE_STRING
            {
            lv_newValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_newValue_4_0, grammarAccess.getChangeAttributeAccess().getNewValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"newValue",
            						lv_newValue_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getChangeAttributeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulechangeAttribute"


    // $ANTLR start "entryRulecomputeChange"
    // InternalSedml.g:355:1: entryRulecomputeChange returns [EObject current=null] : iv_rulecomputeChange= rulecomputeChange EOF ;
    public final EObject entryRulecomputeChange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecomputeChange = null;


        try {
            // InternalSedml.g:355:54: (iv_rulecomputeChange= rulecomputeChange EOF )
            // InternalSedml.g:356:2: iv_rulecomputeChange= rulecomputeChange EOF
            {
             newCompositeNode(grammarAccess.getComputeChangeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecomputeChange=rulecomputeChange();

            state._fsp--;

             current =iv_rulecomputeChange; 
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
    // $ANTLR end "entryRulecomputeChange"


    // $ANTLR start "rulecomputeChange"
    // InternalSedml.g:362:1: rulecomputeChange returns [EObject current=null] : (otherlv_0= 'computeChange' otherlv_1= '{' otherlv_2= 'math' otherlv_3= ':' ( (lv_math_4_0= rulemath ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) ) ( (lv_listOfParameters_6_0= rulelistOfParameters ) ) otherlv_7= '}' ) ;
    public final EObject rulecomputeChange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_math_4_0 = null;

        EObject lv_listOfVariables_5_0 = null;

        EObject lv_listOfParameters_6_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:368:2: ( (otherlv_0= 'computeChange' otherlv_1= '{' otherlv_2= 'math' otherlv_3= ':' ( (lv_math_4_0= rulemath ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) ) ( (lv_listOfParameters_6_0= rulelistOfParameters ) ) otherlv_7= '}' ) )
            // InternalSedml.g:369:2: (otherlv_0= 'computeChange' otherlv_1= '{' otherlv_2= 'math' otherlv_3= ':' ( (lv_math_4_0= rulemath ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) ) ( (lv_listOfParameters_6_0= rulelistOfParameters ) ) otherlv_7= '}' )
            {
            // InternalSedml.g:369:2: (otherlv_0= 'computeChange' otherlv_1= '{' otherlv_2= 'math' otherlv_3= ':' ( (lv_math_4_0= rulemath ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) ) ( (lv_listOfParameters_6_0= rulelistOfParameters ) ) otherlv_7= '}' )
            // InternalSedml.g:370:3: otherlv_0= 'computeChange' otherlv_1= '{' otherlv_2= 'math' otherlv_3= ':' ( (lv_math_4_0= rulemath ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) ) ( (lv_listOfParameters_6_0= rulelistOfParameters ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComputeChangeAccess().getComputeChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getComputeChangeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getComputeChangeAccess().getMathKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getComputeChangeAccess().getColonKeyword_3());
            		
            // InternalSedml.g:386:3: ( (lv_math_4_0= rulemath ) )
            // InternalSedml.g:387:4: (lv_math_4_0= rulemath )
            {
            // InternalSedml.g:387:4: (lv_math_4_0= rulemath )
            // InternalSedml.g:388:5: lv_math_4_0= rulemath
            {

            					newCompositeNode(grammarAccess.getComputeChangeAccess().getMathMathParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_math_4_0=rulemath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputeChangeRule());
            					}
            					set(
            						current,
            						"math",
            						lv_math_4_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.math");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:405:3: ( (lv_listOfVariables_5_0= rulelistOfVariables ) )
            // InternalSedml.g:406:4: (lv_listOfVariables_5_0= rulelistOfVariables )
            {
            // InternalSedml.g:406:4: (lv_listOfVariables_5_0= rulelistOfVariables )
            // InternalSedml.g:407:5: lv_listOfVariables_5_0= rulelistOfVariables
            {

            					newCompositeNode(grammarAccess.getComputeChangeAccess().getListOfVariablesListOfVariablesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_listOfVariables_5_0=rulelistOfVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputeChangeRule());
            					}
            					set(
            						current,
            						"listOfVariables",
            						lv_listOfVariables_5_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfVariables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:424:3: ( (lv_listOfParameters_6_0= rulelistOfParameters ) )
            // InternalSedml.g:425:4: (lv_listOfParameters_6_0= rulelistOfParameters )
            {
            // InternalSedml.g:425:4: (lv_listOfParameters_6_0= rulelistOfParameters )
            // InternalSedml.g:426:5: lv_listOfParameters_6_0= rulelistOfParameters
            {

            					newCompositeNode(grammarAccess.getComputeChangeAccess().getListOfParametersListOfParametersParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_listOfParameters_6_0=rulelistOfParameters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputeChangeRule());
            					}
            					set(
            						current,
            						"listOfParameters",
            						lv_listOfParameters_6_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfParameters");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComputeChangeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "rulecomputeChange"


    // $ANTLR start "entryRuleaddXML"
    // InternalSedml.g:451:1: entryRuleaddXML returns [EObject current=null] : iv_ruleaddXML= ruleaddXML EOF ;
    public final EObject entryRuleaddXML() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaddXML = null;


        try {
            // InternalSedml.g:451:47: (iv_ruleaddXML= ruleaddXML EOF )
            // InternalSedml.g:452:2: iv_ruleaddXML= ruleaddXML EOF
            {
             newCompositeNode(grammarAccess.getAddXMLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleaddXML=ruleaddXML();

            state._fsp--;

             current =iv_ruleaddXML; 
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
    // $ANTLR end "entryRuleaddXML"


    // $ANTLR start "ruleaddXML"
    // InternalSedml.g:458:1: ruleaddXML returns [EObject current=null] : (otherlv_0= 'addXML' otherlv_1= '{' ( (lv_newXML_2_0= rulenewXML ) )* otherlv_3= '}' ) ;
    public final EObject ruleaddXML() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_newXML_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:464:2: ( (otherlv_0= 'addXML' otherlv_1= '{' ( (lv_newXML_2_0= rulenewXML ) )* otherlv_3= '}' ) )
            // InternalSedml.g:465:2: (otherlv_0= 'addXML' otherlv_1= '{' ( (lv_newXML_2_0= rulenewXML ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:465:2: (otherlv_0= 'addXML' otherlv_1= '{' ( (lv_newXML_2_0= rulenewXML ) )* otherlv_3= '}' )
            // InternalSedml.g:466:3: otherlv_0= 'addXML' otherlv_1= '{' ( (lv_newXML_2_0= rulenewXML ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAddXMLAccess().getAddXMLKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAddXMLAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:474:3: ( (lv_newXML_2_0= rulenewXML ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSedml.g:475:4: (lv_newXML_2_0= rulenewXML )
            	    {
            	    // InternalSedml.g:475:4: (lv_newXML_2_0= rulenewXML )
            	    // InternalSedml.g:476:5: lv_newXML_2_0= rulenewXML
            	    {

            	    					newCompositeNode(grammarAccess.getAddXMLAccess().getNewXMLNewXMLParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_newXML_2_0=rulenewXML();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAddXMLRule());
            	    					}
            	    					add(
            	    						current,
            	    						"newXML",
            	    						lv_newXML_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.newXML");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAddXMLAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleaddXML"


    // $ANTLR start "entryRulechangeXML"
    // InternalSedml.g:501:1: entryRulechangeXML returns [EObject current=null] : iv_rulechangeXML= rulechangeXML EOF ;
    public final EObject entryRulechangeXML() throws RecognitionException {
        EObject current = null;

        EObject iv_rulechangeXML = null;


        try {
            // InternalSedml.g:501:50: (iv_rulechangeXML= rulechangeXML EOF )
            // InternalSedml.g:502:2: iv_rulechangeXML= rulechangeXML EOF
            {
             newCompositeNode(grammarAccess.getChangeXMLRule()); 
            pushFollow(FOLLOW_1);
            iv_rulechangeXML=rulechangeXML();

            state._fsp--;

             current =iv_rulechangeXML; 
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
    // $ANTLR end "entryRulechangeXML"


    // $ANTLR start "rulechangeXML"
    // InternalSedml.g:508:1: rulechangeXML returns [EObject current=null] : (otherlv_0= 'changeXML' otherlv_1= '{' ( (lv_newXML_2_0= rulenewXML ) )* otherlv_3= '}' ) ;
    public final EObject rulechangeXML() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_newXML_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:514:2: ( (otherlv_0= 'changeXML' otherlv_1= '{' ( (lv_newXML_2_0= rulenewXML ) )* otherlv_3= '}' ) )
            // InternalSedml.g:515:2: (otherlv_0= 'changeXML' otherlv_1= '{' ( (lv_newXML_2_0= rulenewXML ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:515:2: (otherlv_0= 'changeXML' otherlv_1= '{' ( (lv_newXML_2_0= rulenewXML ) )* otherlv_3= '}' )
            // InternalSedml.g:516:3: otherlv_0= 'changeXML' otherlv_1= '{' ( (lv_newXML_2_0= rulenewXML ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeXMLAccess().getChangeXMLKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeXMLAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:524:3: ( (lv_newXML_2_0= rulenewXML ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSedml.g:525:4: (lv_newXML_2_0= rulenewXML )
            	    {
            	    // InternalSedml.g:525:4: (lv_newXML_2_0= rulenewXML )
            	    // InternalSedml.g:526:5: lv_newXML_2_0= rulenewXML
            	    {

            	    					newCompositeNode(grammarAccess.getChangeXMLAccess().getNewXMLNewXMLParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_newXML_2_0=rulenewXML();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChangeXMLRule());
            	    					}
            	    					add(
            	    						current,
            	    						"newXML",
            	    						lv_newXML_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.newXML");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeXMLAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulechangeXML"


    // $ANTLR start "entryRulenewXML"
    // InternalSedml.g:551:1: entryRulenewXML returns [EObject current=null] : iv_rulenewXML= rulenewXML EOF ;
    public final EObject entryRulenewXML() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenewXML = null;


        try {
            // InternalSedml.g:551:47: (iv_rulenewXML= rulenewXML EOF )
            // InternalSedml.g:552:2: iv_rulenewXML= rulenewXML EOF
            {
             newCompositeNode(grammarAccess.getNewXMLRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenewXML=rulenewXML();

            state._fsp--;

             current =iv_rulenewXML; 
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
    // $ANTLR end "entryRulenewXML"


    // $ANTLR start "rulenewXML"
    // InternalSedml.g:558:1: rulenewXML returns [EObject current=null] : (otherlv_0= 'newXML' otherlv_1= '{' otherlv_2= 'anyXML' otherlv_3= ':' ( (lv_anyXML_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject rulenewXML() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_anyXML_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSedml.g:564:2: ( (otherlv_0= 'newXML' otherlv_1= '{' otherlv_2= 'anyXML' otherlv_3= ':' ( (lv_anyXML_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalSedml.g:565:2: (otherlv_0= 'newXML' otherlv_1= '{' otherlv_2= 'anyXML' otherlv_3= ':' ( (lv_anyXML_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalSedml.g:565:2: (otherlv_0= 'newXML' otherlv_1= '{' otherlv_2= 'anyXML' otherlv_3= ':' ( (lv_anyXML_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalSedml.g:566:3: otherlv_0= 'newXML' otherlv_1= '{' otherlv_2= 'anyXML' otherlv_3= ':' ( (lv_anyXML_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNewXMLAccess().getNewXMLKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getNewXMLAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getNewXMLAccess().getAnyXMLKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getNewXMLAccess().getColonKeyword_3());
            		
            // InternalSedml.g:582:3: ( (lv_anyXML_4_0= RULE_STRING ) )
            // InternalSedml.g:583:4: (lv_anyXML_4_0= RULE_STRING )
            {
            // InternalSedml.g:583:4: (lv_anyXML_4_0= RULE_STRING )
            // InternalSedml.g:584:5: lv_anyXML_4_0= RULE_STRING
            {
            lv_anyXML_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_anyXML_4_0, grammarAccess.getNewXMLAccess().getAnyXMLSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNewXMLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"anyXML",
            						lv_anyXML_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNewXMLAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulenewXML"


    // $ANTLR start "entryRulesedML"
    // InternalSedml.g:608:1: entryRulesedML returns [EObject current=null] : iv_rulesedML= rulesedML EOF ;
    public final EObject entryRulesedML() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesedML = null;


        try {
            // InternalSedml.g:608:46: (iv_rulesedML= rulesedML EOF )
            // InternalSedml.g:609:2: iv_rulesedML= rulesedML EOF
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
    // InternalSedml.g:615:1: rulesedML returns [EObject current=null] : ( ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfHypotheses_2_0= rulelistOfHypotheses ) ) ( (lv_listOfDataDescriptions_3_0= rulelistOfDataDescriptions ) ) ( (lv_listOfSimulations_4_0= rulelistOfSimulations ) ) ( (lv_listOfModels_5_0= rulelistOfModels ) ) ( (lv_listOfTasks_6_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_7_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_8_0= rulelistOfOutputs ) ) ) ;
    public final EObject rulesedML() throws RecognitionException {
        EObject current = null;

        Token lv_version_0_0=null;
        Token lv_level_1_0=null;
        EObject lv_listOfHypotheses_2_0 = null;

        EObject lv_listOfDataDescriptions_3_0 = null;

        EObject lv_listOfSimulations_4_0 = null;

        EObject lv_listOfModels_5_0 = null;

        EObject lv_listOfTasks_6_0 = null;

        EObject lv_listOfDataGenerators_7_0 = null;

        EObject lv_listOfOutputs_8_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:621:2: ( ( ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfHypotheses_2_0= rulelistOfHypotheses ) ) ( (lv_listOfDataDescriptions_3_0= rulelistOfDataDescriptions ) ) ( (lv_listOfSimulations_4_0= rulelistOfSimulations ) ) ( (lv_listOfModels_5_0= rulelistOfModels ) ) ( (lv_listOfTasks_6_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_7_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_8_0= rulelistOfOutputs ) ) ) )
            // InternalSedml.g:622:2: ( ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfHypotheses_2_0= rulelistOfHypotheses ) ) ( (lv_listOfDataDescriptions_3_0= rulelistOfDataDescriptions ) ) ( (lv_listOfSimulations_4_0= rulelistOfSimulations ) ) ( (lv_listOfModels_5_0= rulelistOfModels ) ) ( (lv_listOfTasks_6_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_7_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_8_0= rulelistOfOutputs ) ) )
            {
            // InternalSedml.g:622:2: ( ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfHypotheses_2_0= rulelistOfHypotheses ) ) ( (lv_listOfDataDescriptions_3_0= rulelistOfDataDescriptions ) ) ( (lv_listOfSimulations_4_0= rulelistOfSimulations ) ) ( (lv_listOfModels_5_0= rulelistOfModels ) ) ( (lv_listOfTasks_6_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_7_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_8_0= rulelistOfOutputs ) ) )
            // InternalSedml.g:623:3: ( (lv_version_0_0= RULE_INT ) ) ( (lv_level_1_0= RULE_INT ) ) ( (lv_listOfHypotheses_2_0= rulelistOfHypotheses ) ) ( (lv_listOfDataDescriptions_3_0= rulelistOfDataDescriptions ) ) ( (lv_listOfSimulations_4_0= rulelistOfSimulations ) ) ( (lv_listOfModels_5_0= rulelistOfModels ) ) ( (lv_listOfTasks_6_0= rulelistOfTasks ) ) ( (lv_listOfDataGenerators_7_0= rulelistOfDataGenerators ) ) ( (lv_listOfOutputs_8_0= rulelistOfOutputs ) )
            {
            // InternalSedml.g:623:3: ( (lv_version_0_0= RULE_INT ) )
            // InternalSedml.g:624:4: (lv_version_0_0= RULE_INT )
            {
            // InternalSedml.g:624:4: (lv_version_0_0= RULE_INT )
            // InternalSedml.g:625:5: lv_version_0_0= RULE_INT
            {
            lv_version_0_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            // InternalSedml.g:641:3: ( (lv_level_1_0= RULE_INT ) )
            // InternalSedml.g:642:4: (lv_level_1_0= RULE_INT )
            {
            // InternalSedml.g:642:4: (lv_level_1_0= RULE_INT )
            // InternalSedml.g:643:5: lv_level_1_0= RULE_INT
            {
            lv_level_1_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            // InternalSedml.g:659:3: ( (lv_listOfHypotheses_2_0= rulelistOfHypotheses ) )
            // InternalSedml.g:660:4: (lv_listOfHypotheses_2_0= rulelistOfHypotheses )
            {
            // InternalSedml.g:660:4: (lv_listOfHypotheses_2_0= rulelistOfHypotheses )
            // InternalSedml.g:661:5: lv_listOfHypotheses_2_0= rulelistOfHypotheses
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfHypothesesListOfHypothesesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalSedml.g:678:3: ( (lv_listOfDataDescriptions_3_0= rulelistOfDataDescriptions ) )
            // InternalSedml.g:679:4: (lv_listOfDataDescriptions_3_0= rulelistOfDataDescriptions )
            {
            // InternalSedml.g:679:4: (lv_listOfDataDescriptions_3_0= rulelistOfDataDescriptions )
            // InternalSedml.g:680:5: lv_listOfDataDescriptions_3_0= rulelistOfDataDescriptions
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfDataDescriptionsListOfDataDescriptionsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_listOfDataDescriptions_3_0=rulelistOfDataDescriptions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfDataDescriptions",
            						lv_listOfDataDescriptions_3_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfDataDescriptions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:697:3: ( (lv_listOfSimulations_4_0= rulelistOfSimulations ) )
            // InternalSedml.g:698:4: (lv_listOfSimulations_4_0= rulelistOfSimulations )
            {
            // InternalSedml.g:698:4: (lv_listOfSimulations_4_0= rulelistOfSimulations )
            // InternalSedml.g:699:5: lv_listOfSimulations_4_0= rulelistOfSimulations
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfSimulationsListOfSimulationsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_listOfSimulations_4_0=rulelistOfSimulations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfSimulations",
            						lv_listOfSimulations_4_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfSimulations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:716:3: ( (lv_listOfModels_5_0= rulelistOfModels ) )
            // InternalSedml.g:717:4: (lv_listOfModels_5_0= rulelistOfModels )
            {
            // InternalSedml.g:717:4: (lv_listOfModels_5_0= rulelistOfModels )
            // InternalSedml.g:718:5: lv_listOfModels_5_0= rulelistOfModels
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfModelsListOfModelsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_listOfModels_5_0=rulelistOfModels();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfModels",
            						lv_listOfModels_5_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfModels");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:735:3: ( (lv_listOfTasks_6_0= rulelistOfTasks ) )
            // InternalSedml.g:736:4: (lv_listOfTasks_6_0= rulelistOfTasks )
            {
            // InternalSedml.g:736:4: (lv_listOfTasks_6_0= rulelistOfTasks )
            // InternalSedml.g:737:5: lv_listOfTasks_6_0= rulelistOfTasks
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfTasksListOfTasksParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
            lv_listOfTasks_6_0=rulelistOfTasks();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfTasks",
            						lv_listOfTasks_6_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfTasks");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:754:3: ( (lv_listOfDataGenerators_7_0= rulelistOfDataGenerators ) )
            // InternalSedml.g:755:4: (lv_listOfDataGenerators_7_0= rulelistOfDataGenerators )
            {
            // InternalSedml.g:755:4: (lv_listOfDataGenerators_7_0= rulelistOfDataGenerators )
            // InternalSedml.g:756:5: lv_listOfDataGenerators_7_0= rulelistOfDataGenerators
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfDataGeneratorsListOfDataGeneratorsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
            lv_listOfDataGenerators_7_0=rulelistOfDataGenerators();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfDataGenerators",
            						lv_listOfDataGenerators_7_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfDataGenerators");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:773:3: ( (lv_listOfOutputs_8_0= rulelistOfOutputs ) )
            // InternalSedml.g:774:4: (lv_listOfOutputs_8_0= rulelistOfOutputs )
            {
            // InternalSedml.g:774:4: (lv_listOfOutputs_8_0= rulelistOfOutputs )
            // InternalSedml.g:775:5: lv_listOfOutputs_8_0= rulelistOfOutputs
            {

            					newCompositeNode(grammarAccess.getSedMLAccess().getListOfOutputsListOfOutputsParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_listOfOutputs_8_0=rulelistOfOutputs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSedMLRule());
            					}
            					set(
            						current,
            						"listOfOutputs",
            						lv_listOfOutputs_8_0,
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


    // $ANTLR start "entryRulelistOfDataDescriptions"
    // InternalSedml.g:796:1: entryRulelistOfDataDescriptions returns [EObject current=null] : iv_rulelistOfDataDescriptions= rulelistOfDataDescriptions EOF ;
    public final EObject entryRulelistOfDataDescriptions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfDataDescriptions = null;


        try {
            // InternalSedml.g:796:63: (iv_rulelistOfDataDescriptions= rulelistOfDataDescriptions EOF )
            // InternalSedml.g:797:2: iv_rulelistOfDataDescriptions= rulelistOfDataDescriptions EOF
            {
             newCompositeNode(grammarAccess.getListOfDataDescriptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfDataDescriptions=rulelistOfDataDescriptions();

            state._fsp--;

             current =iv_rulelistOfDataDescriptions; 
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
    // $ANTLR end "entryRulelistOfDataDescriptions"


    // $ANTLR start "rulelistOfDataDescriptions"
    // InternalSedml.g:803:1: rulelistOfDataDescriptions returns [EObject current=null] : (otherlv_0= 'listOfDataDescriptions' otherlv_1= '{' ( (lv_dataDescription_2_0= ruledataDescription ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfDataDescriptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dataDescription_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:809:2: ( (otherlv_0= 'listOfDataDescriptions' otherlv_1= '{' ( (lv_dataDescription_2_0= ruledataDescription ) )* otherlv_3= '}' ) )
            // InternalSedml.g:810:2: (otherlv_0= 'listOfDataDescriptions' otherlv_1= '{' ( (lv_dataDescription_2_0= ruledataDescription ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:810:2: (otherlv_0= 'listOfDataDescriptions' otherlv_1= '{' ( (lv_dataDescription_2_0= ruledataDescription ) )* otherlv_3= '}' )
            // InternalSedml.g:811:3: otherlv_0= 'listOfDataDescriptions' otherlv_1= '{' ( (lv_dataDescription_2_0= ruledataDescription ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfDataDescriptionsAccess().getListOfDataDescriptionsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfDataDescriptionsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:819:3: ( (lv_dataDescription_2_0= ruledataDescription ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSedml.g:820:4: (lv_dataDescription_2_0= ruledataDescription )
            	    {
            	    // InternalSedml.g:820:4: (lv_dataDescription_2_0= ruledataDescription )
            	    // InternalSedml.g:821:5: lv_dataDescription_2_0= ruledataDescription
            	    {

            	    					newCompositeNode(grammarAccess.getListOfDataDescriptionsAccess().getDataDescriptionDataDescriptionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_dataDescription_2_0=ruledataDescription();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfDataDescriptionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataDescription",
            	    						lv_dataDescription_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.dataDescription");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfDataDescriptionsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfDataDescriptions"


    // $ANTLR start "entryRuledataDescription"
    // InternalSedml.g:846:1: entryRuledataDescription returns [EObject current=null] : iv_ruledataDescription= ruledataDescription EOF ;
    public final EObject entryRuledataDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledataDescription = null;


        try {
            // InternalSedml.g:846:56: (iv_ruledataDescription= ruledataDescription EOF )
            // InternalSedml.g:847:2: iv_ruledataDescription= ruledataDescription EOF
            {
             newCompositeNode(grammarAccess.getDataDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledataDescription=ruledataDescription();

            state._fsp--;

             current =iv_ruledataDescription; 
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
    // $ANTLR end "entryRuledataDescription"


    // $ANTLR start "ruledataDescription"
    // InternalSedml.g:853:1: ruledataDescription returns [EObject current=null] : (otherlv_0= 'dataDescription' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'format' otherlv_9= ':' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= 'source' otherlv_12= ':' ( (lv_source_13_0= RULE_STRING ) ) ( (lv_listOfDataSources_14_0= rulelistOfDataSources ) ) ( (lv_dimensionDescription_15_0= ruledimensionDescription ) ) otherlv_16= '}' ) ;
    public final EObject ruledataDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_format_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_source_13_0=null;
        Token otherlv_16=null;
        EObject lv_listOfDataSources_14_0 = null;

        EObject lv_dimensionDescription_15_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:859:2: ( (otherlv_0= 'dataDescription' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'format' otherlv_9= ':' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= 'source' otherlv_12= ':' ( (lv_source_13_0= RULE_STRING ) ) ( (lv_listOfDataSources_14_0= rulelistOfDataSources ) ) ( (lv_dimensionDescription_15_0= ruledimensionDescription ) ) otherlv_16= '}' ) )
            // InternalSedml.g:860:2: (otherlv_0= 'dataDescription' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'format' otherlv_9= ':' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= 'source' otherlv_12= ':' ( (lv_source_13_0= RULE_STRING ) ) ( (lv_listOfDataSources_14_0= rulelistOfDataSources ) ) ( (lv_dimensionDescription_15_0= ruledimensionDescription ) ) otherlv_16= '}' )
            {
            // InternalSedml.g:860:2: (otherlv_0= 'dataDescription' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'format' otherlv_9= ':' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= 'source' otherlv_12= ':' ( (lv_source_13_0= RULE_STRING ) ) ( (lv_listOfDataSources_14_0= rulelistOfDataSources ) ) ( (lv_dimensionDescription_15_0= ruledimensionDescription ) ) otherlv_16= '}' )
            // InternalSedml.g:861:3: otherlv_0= 'dataDescription' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'format' otherlv_9= ':' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= 'source' otherlv_12= ':' ( (lv_source_13_0= RULE_STRING ) ) ( (lv_listOfDataSources_14_0= rulelistOfDataSources ) ) ( (lv_dimensionDescription_15_0= ruledimensionDescription ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataDescriptionAccess().getDataDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getDataDescriptionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDataDescriptionAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getDataDescriptionAccess().getColonKeyword_3());
            		
            // InternalSedml.g:877:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:878:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:878:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:879:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_id_4_0, grammarAccess.getDataDescriptionAccess().getIdIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDataDescriptionAccess().getNameKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDataDescriptionAccess().getColonKeyword_6());
            		
            // InternalSedml.g:903:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalSedml.g:904:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalSedml.g:904:4: (lv_name_7_0= RULE_STRING )
            // InternalSedml.g:905:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_name_7_0, grammarAccess.getDataDescriptionAccess().getNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getDataDescriptionAccess().getFormatKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getDataDescriptionAccess().getColonKeyword_9());
            		
            // InternalSedml.g:929:3: ( (lv_format_10_0= RULE_STRING ) )
            // InternalSedml.g:930:4: (lv_format_10_0= RULE_STRING )
            {
            // InternalSedml.g:930:4: (lv_format_10_0= RULE_STRING )
            // InternalSedml.g:931:5: lv_format_10_0= RULE_STRING
            {
            lv_format_10_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_format_10_0, grammarAccess.getDataDescriptionAccess().getFormatSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"format",
            						lv_format_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getDataDescriptionAccess().getSourceKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getDataDescriptionAccess().getColonKeyword_12());
            		
            // InternalSedml.g:955:3: ( (lv_source_13_0= RULE_STRING ) )
            // InternalSedml.g:956:4: (lv_source_13_0= RULE_STRING )
            {
            // InternalSedml.g:956:4: (lv_source_13_0= RULE_STRING )
            // InternalSedml.g:957:5: lv_source_13_0= RULE_STRING
            {
            lv_source_13_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_source_13_0, grammarAccess.getDataDescriptionAccess().getSourceSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSedml.g:973:3: ( (lv_listOfDataSources_14_0= rulelistOfDataSources ) )
            // InternalSedml.g:974:4: (lv_listOfDataSources_14_0= rulelistOfDataSources )
            {
            // InternalSedml.g:974:4: (lv_listOfDataSources_14_0= rulelistOfDataSources )
            // InternalSedml.g:975:5: lv_listOfDataSources_14_0= rulelistOfDataSources
            {

            					newCompositeNode(grammarAccess.getDataDescriptionAccess().getListOfDataSourcesListOfDataSourcesParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_29);
            lv_listOfDataSources_14_0=rulelistOfDataSources();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataDescriptionRule());
            					}
            					set(
            						current,
            						"listOfDataSources",
            						lv_listOfDataSources_14_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfDataSources");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:992:3: ( (lv_dimensionDescription_15_0= ruledimensionDescription ) )
            // InternalSedml.g:993:4: (lv_dimensionDescription_15_0= ruledimensionDescription )
            {
            // InternalSedml.g:993:4: (lv_dimensionDescription_15_0= ruledimensionDescription )
            // InternalSedml.g:994:5: lv_dimensionDescription_15_0= ruledimensionDescription
            {

            					newCompositeNode(grammarAccess.getDataDescriptionAccess().getDimensionDescriptionDimensionDescriptionParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_8);
            lv_dimensionDescription_15_0=ruledimensionDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataDescriptionRule());
            					}
            					set(
            						current,
            						"dimensionDescription",
            						lv_dimensionDescription_15_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.dimensionDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getDataDescriptionAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruledataDescription"


    // $ANTLR start "entryRuledimensionDescription"
    // InternalSedml.g:1019:1: entryRuledimensionDescription returns [EObject current=null] : iv_ruledimensionDescription= ruledimensionDescription EOF ;
    public final EObject entryRuledimensionDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledimensionDescription = null;


        try {
            // InternalSedml.g:1019:61: (iv_ruledimensionDescription= ruledimensionDescription EOF )
            // InternalSedml.g:1020:2: iv_ruledimensionDescription= ruledimensionDescription EOF
            {
             newCompositeNode(grammarAccess.getDimensionDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledimensionDescription=ruledimensionDescription();

            state._fsp--;

             current =iv_ruledimensionDescription; 
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
    // $ANTLR end "entryRuledimensionDescription"


    // $ANTLR start "ruledimensionDescription"
    // InternalSedml.g:1026:1: ruledimensionDescription returns [EObject current=null] : (otherlv_0= 'dimensionDescription' otherlv_1= '{' otherlv_2= 'xmlns' otherlv_3= ':' ( (lv_xmlns_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruledimensionDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_xmlns_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSedml.g:1032:2: ( (otherlv_0= 'dimensionDescription' otherlv_1= '{' otherlv_2= 'xmlns' otherlv_3= ':' ( (lv_xmlns_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalSedml.g:1033:2: (otherlv_0= 'dimensionDescription' otherlv_1= '{' otherlv_2= 'xmlns' otherlv_3= ':' ( (lv_xmlns_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalSedml.g:1033:2: (otherlv_0= 'dimensionDescription' otherlv_1= '{' otherlv_2= 'xmlns' otherlv_3= ':' ( (lv_xmlns_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalSedml.g:1034:3: otherlv_0= 'dimensionDescription' otherlv_1= '{' otherlv_2= 'xmlns' otherlv_3= ':' ( (lv_xmlns_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionDescriptionAccess().getDimensionDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDimensionDescriptionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDimensionDescriptionAccess().getXmlnsKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDimensionDescriptionAccess().getColonKeyword_3());
            		
            // InternalSedml.g:1050:3: ( (lv_xmlns_4_0= RULE_STRING ) )
            // InternalSedml.g:1051:4: (lv_xmlns_4_0= RULE_STRING )
            {
            // InternalSedml.g:1051:4: (lv_xmlns_4_0= RULE_STRING )
            // InternalSedml.g:1052:5: lv_xmlns_4_0= RULE_STRING
            {
            lv_xmlns_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_xmlns_4_0, grammarAccess.getDimensionDescriptionAccess().getXmlnsSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"xmlns",
            						lv_xmlns_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDimensionDescriptionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruledimensionDescription"


    // $ANTLR start "entryRulelistOfDataSources"
    // InternalSedml.g:1076:1: entryRulelistOfDataSources returns [EObject current=null] : iv_rulelistOfDataSources= rulelistOfDataSources EOF ;
    public final EObject entryRulelistOfDataSources() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfDataSources = null;


        try {
            // InternalSedml.g:1076:58: (iv_rulelistOfDataSources= rulelistOfDataSources EOF )
            // InternalSedml.g:1077:2: iv_rulelistOfDataSources= rulelistOfDataSources EOF
            {
             newCompositeNode(grammarAccess.getListOfDataSourcesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfDataSources=rulelistOfDataSources();

            state._fsp--;

             current =iv_rulelistOfDataSources; 
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
    // $ANTLR end "entryRulelistOfDataSources"


    // $ANTLR start "rulelistOfDataSources"
    // InternalSedml.g:1083:1: rulelistOfDataSources returns [EObject current=null] : (otherlv_0= 'listOfDataSources' otherlv_1= '{' ( (lv_dataSource_2_0= ruledataSource ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfDataSources() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dataSource_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1089:2: ( (otherlv_0= 'listOfDataSources' otherlv_1= '{' ( (lv_dataSource_2_0= ruledataSource ) )* otherlv_3= '}' ) )
            // InternalSedml.g:1090:2: (otherlv_0= 'listOfDataSources' otherlv_1= '{' ( (lv_dataSource_2_0= ruledataSource ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:1090:2: (otherlv_0= 'listOfDataSources' otherlv_1= '{' ( (lv_dataSource_2_0= ruledataSource ) )* otherlv_3= '}' )
            // InternalSedml.g:1091:3: otherlv_0= 'listOfDataSources' otherlv_1= '{' ( (lv_dataSource_2_0= ruledataSource ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfDataSourcesAccess().getListOfDataSourcesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfDataSourcesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:1099:3: ( (lv_dataSource_2_0= ruledataSource ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSedml.g:1100:4: (lv_dataSource_2_0= ruledataSource )
            	    {
            	    // InternalSedml.g:1100:4: (lv_dataSource_2_0= ruledataSource )
            	    // InternalSedml.g:1101:5: lv_dataSource_2_0= ruledataSource
            	    {

            	    					newCompositeNode(grammarAccess.getListOfDataSourcesAccess().getDataSourceDataSourceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_dataSource_2_0=ruledataSource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfDataSourcesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataSource",
            	    						lv_dataSource_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.dataSource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfDataSourcesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfDataSources"


    // $ANTLR start "entryRuledataSource"
    // InternalSedml.g:1126:1: entryRuledataSource returns [EObject current=null] : iv_ruledataSource= ruledataSource EOF ;
    public final EObject entryRuledataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledataSource = null;


        try {
            // InternalSedml.g:1126:51: (iv_ruledataSource= ruledataSource EOF )
            // InternalSedml.g:1127:2: iv_ruledataSource= ruledataSource EOF
            {
             newCompositeNode(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledataSource=ruledataSource();

            state._fsp--;

             current =iv_ruledataSource; 
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
    // $ANTLR end "entryRuledataSource"


    // $ANTLR start "ruledataSource"
    // InternalSedml.g:1133:1: ruledataSource returns [EObject current=null] : (otherlv_0= 'dataSource' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'indexSet' otherlv_9= ':' ( (lv_indexSet_10_0= RULE_STRING ) ) ( (lv_listOfSlices_11_0= rulelistOfDataSlices ) ) otherlv_12= '}' ) ;
    public final EObject ruledataSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_indexSet_10_0=null;
        Token otherlv_12=null;
        EObject lv_listOfSlices_11_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1139:2: ( (otherlv_0= 'dataSource' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'indexSet' otherlv_9= ':' ( (lv_indexSet_10_0= RULE_STRING ) ) ( (lv_listOfSlices_11_0= rulelistOfDataSlices ) ) otherlv_12= '}' ) )
            // InternalSedml.g:1140:2: (otherlv_0= 'dataSource' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'indexSet' otherlv_9= ':' ( (lv_indexSet_10_0= RULE_STRING ) ) ( (lv_listOfSlices_11_0= rulelistOfDataSlices ) ) otherlv_12= '}' )
            {
            // InternalSedml.g:1140:2: (otherlv_0= 'dataSource' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'indexSet' otherlv_9= ':' ( (lv_indexSet_10_0= RULE_STRING ) ) ( (lv_listOfSlices_11_0= rulelistOfDataSlices ) ) otherlv_12= '}' )
            // InternalSedml.g:1141:3: otherlv_0= 'dataSource' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'indexSet' otherlv_9= ':' ( (lv_indexSet_10_0= RULE_STRING ) ) ( (lv_listOfSlices_11_0= rulelistOfDataSlices ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getDataSourceKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDataSourceAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getDataSourceAccess().getColonKeyword_3());
            		
            // InternalSedml.g:1157:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:1158:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:1158:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:1159:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_id_4_0, grammarAccess.getDataSourceAccess().getIdIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDataSourceAccess().getNameKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDataSourceAccess().getColonKeyword_6());
            		
            // InternalSedml.g:1183:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalSedml.g:1184:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalSedml.g:1184:4: (lv_name_7_0= RULE_STRING )
            // InternalSedml.g:1185:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_name_7_0, grammarAccess.getDataSourceAccess().getNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getDataSourceAccess().getIndexSetKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getDataSourceAccess().getColonKeyword_9());
            		
            // InternalSedml.g:1209:3: ( (lv_indexSet_10_0= RULE_STRING ) )
            // InternalSedml.g:1210:4: (lv_indexSet_10_0= RULE_STRING )
            {
            // InternalSedml.g:1210:4: (lv_indexSet_10_0= RULE_STRING )
            // InternalSedml.g:1211:5: lv_indexSet_10_0= RULE_STRING
            {
            lv_indexSet_10_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_indexSet_10_0, grammarAccess.getDataSourceAccess().getIndexSetSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"indexSet",
            						lv_indexSet_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSedml.g:1227:3: ( (lv_listOfSlices_11_0= rulelistOfDataSlices ) )
            // InternalSedml.g:1228:4: (lv_listOfSlices_11_0= rulelistOfDataSlices )
            {
            // InternalSedml.g:1228:4: (lv_listOfSlices_11_0= rulelistOfDataSlices )
            // InternalSedml.g:1229:5: lv_listOfSlices_11_0= rulelistOfDataSlices
            {

            					newCompositeNode(grammarAccess.getDataSourceAccess().getListOfSlicesListOfDataSlicesParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_8);
            lv_listOfSlices_11_0=rulelistOfDataSlices();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataSourceRule());
            					}
            					set(
            						current,
            						"listOfSlices",
            						lv_listOfSlices_11_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfDataSlices");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruledataSource"


    // $ANTLR start "entryRulelistOfDataSlices"
    // InternalSedml.g:1254:1: entryRulelistOfDataSlices returns [EObject current=null] : iv_rulelistOfDataSlices= rulelistOfDataSlices EOF ;
    public final EObject entryRulelistOfDataSlices() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfDataSlices = null;


        try {
            // InternalSedml.g:1254:57: (iv_rulelistOfDataSlices= rulelistOfDataSlices EOF )
            // InternalSedml.g:1255:2: iv_rulelistOfDataSlices= rulelistOfDataSlices EOF
            {
             newCompositeNode(grammarAccess.getListOfDataSlicesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfDataSlices=rulelistOfDataSlices();

            state._fsp--;

             current =iv_rulelistOfDataSlices; 
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
    // $ANTLR end "entryRulelistOfDataSlices"


    // $ANTLR start "rulelistOfDataSlices"
    // InternalSedml.g:1261:1: rulelistOfDataSlices returns [EObject current=null] : (otherlv_0= 'listOfDataSlices' otherlv_1= '{' ( (lv_slice_2_0= ruleslice ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfDataSlices() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_slice_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1267:2: ( (otherlv_0= 'listOfDataSlices' otherlv_1= '{' ( (lv_slice_2_0= ruleslice ) )* otherlv_3= '}' ) )
            // InternalSedml.g:1268:2: (otherlv_0= 'listOfDataSlices' otherlv_1= '{' ( (lv_slice_2_0= ruleslice ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:1268:2: (otherlv_0= 'listOfDataSlices' otherlv_1= '{' ( (lv_slice_2_0= ruleslice ) )* otherlv_3= '}' )
            // InternalSedml.g:1269:3: otherlv_0= 'listOfDataSlices' otherlv_1= '{' ( (lv_slice_2_0= ruleslice ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfDataSlicesAccess().getListOfDataSlicesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfDataSlicesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:1277:3: ( (lv_slice_2_0= ruleslice ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSedml.g:1278:4: (lv_slice_2_0= ruleslice )
            	    {
            	    // InternalSedml.g:1278:4: (lv_slice_2_0= ruleslice )
            	    // InternalSedml.g:1279:5: lv_slice_2_0= ruleslice
            	    {

            	    					newCompositeNode(grammarAccess.getListOfDataSlicesAccess().getSliceSliceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_slice_2_0=ruleslice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfDataSlicesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"slice",
            	    						lv_slice_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.slice");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfDataSlicesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfDataSlices"


    // $ANTLR start "entryRuleslice"
    // InternalSedml.g:1304:1: entryRuleslice returns [EObject current=null] : iv_ruleslice= ruleslice EOF ;
    public final EObject entryRuleslice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleslice = null;


        try {
            // InternalSedml.g:1304:46: (iv_ruleslice= ruleslice EOF )
            // InternalSedml.g:1305:2: iv_ruleslice= ruleslice EOF
            {
             newCompositeNode(grammarAccess.getSliceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleslice=ruleslice();

            state._fsp--;

             current =iv_ruleslice; 
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
    // $ANTLR end "entryRuleslice"


    // $ANTLR start "ruleslice"
    // InternalSedml.g:1311:1: ruleslice returns [EObject current=null] : (otherlv_0= 'slice' otherlv_1= '{' otherlv_2= 'reference' otherlv_3= ':' ( (lv_referenceid_4_0= RULE_ID ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleslice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_referenceid_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalSedml.g:1317:2: ( (otherlv_0= 'slice' otherlv_1= '{' otherlv_2= 'reference' otherlv_3= ':' ( (lv_referenceid_4_0= RULE_ID ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalSedml.g:1318:2: (otherlv_0= 'slice' otherlv_1= '{' otherlv_2= 'reference' otherlv_3= ':' ( (lv_referenceid_4_0= RULE_ID ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalSedml.g:1318:2: (otherlv_0= 'slice' otherlv_1= '{' otherlv_2= 'reference' otherlv_3= ':' ( (lv_referenceid_4_0= RULE_ID ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalSedml.g:1319:3: otherlv_0= 'slice' otherlv_1= '{' otherlv_2= 'reference' otherlv_3= ':' ( (lv_referenceid_4_0= RULE_ID ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSliceAccess().getSliceKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getSliceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSliceAccess().getReferenceKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getSliceAccess().getColonKeyword_3());
            		
            // InternalSedml.g:1335:3: ( (lv_referenceid_4_0= RULE_ID ) )
            // InternalSedml.g:1336:4: (lv_referenceid_4_0= RULE_ID )
            {
            // InternalSedml.g:1336:4: (lv_referenceid_4_0= RULE_ID )
            // InternalSedml.g:1337:5: lv_referenceid_4_0= RULE_ID
            {
            lv_referenceid_4_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_referenceid_4_0, grammarAccess.getSliceAccess().getReferenceidIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSliceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"referenceid",
            						lv_referenceid_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getSliceAccess().getValueKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getSliceAccess().getColonKeyword_6());
            		
            // InternalSedml.g:1361:3: ( (lv_value_7_0= RULE_STRING ) )
            // InternalSedml.g:1362:4: (lv_value_7_0= RULE_STRING )
            {
            // InternalSedml.g:1362:4: (lv_value_7_0= RULE_STRING )
            // InternalSedml.g:1363:5: lv_value_7_0= RULE_STRING
            {
            lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_7_0, grammarAccess.getSliceAccess().getValueSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSliceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSliceAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleslice"


    // $ANTLR start "entryRulelistOfHypotheses"
    // InternalSedml.g:1387:1: entryRulelistOfHypotheses returns [EObject current=null] : iv_rulelistOfHypotheses= rulelistOfHypotheses EOF ;
    public final EObject entryRulelistOfHypotheses() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfHypotheses = null;


        try {
            // InternalSedml.g:1387:57: (iv_rulelistOfHypotheses= rulelistOfHypotheses EOF )
            // InternalSedml.g:1388:2: iv_rulelistOfHypotheses= rulelistOfHypotheses EOF
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
    // InternalSedml.g:1394:1: rulelistOfHypotheses returns [EObject current=null] : (otherlv_0= 'listOfHypotheses' otherlv_1= '{' ( (lv_hypothesis_2_0= rulehypothesis ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfHypotheses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_hypothesis_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:1400:2: ( (otherlv_0= 'listOfHypotheses' otherlv_1= '{' ( (lv_hypothesis_2_0= rulehypothesis ) )* otherlv_3= '}' ) )
            // InternalSedml.g:1401:2: (otherlv_0= 'listOfHypotheses' otherlv_1= '{' ( (lv_hypothesis_2_0= rulehypothesis ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:1401:2: (otherlv_0= 'listOfHypotheses' otherlv_1= '{' ( (lv_hypothesis_2_0= rulehypothesis ) )* otherlv_3= '}' )
            // InternalSedml.g:1402:3: otherlv_0= 'listOfHypotheses' otherlv_1= '{' ( (lv_hypothesis_2_0= rulehypothesis ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfHypothesesAccess().getListOfHypothesesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfHypothesesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:1410:3: ( (lv_hypothesis_2_0= rulehypothesis ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==41) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSedml.g:1411:4: (lv_hypothesis_2_0= rulehypothesis )
            	    {
            	    // InternalSedml.g:1411:4: (lv_hypothesis_2_0= rulehypothesis )
            	    // InternalSedml.g:1412:5: lv_hypothesis_2_0= rulehypothesis
            	    {

            	    					newCompositeNode(grammarAccess.getListOfHypothesesAccess().getHypothesisHypothesisParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_37);
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
            	    break loop9;
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
    // InternalSedml.g:1437:1: entryRulehypothesis returns [EObject current=null] : iv_rulehypothesis= rulehypothesis EOF ;
    public final EObject entryRulehypothesis() throws RecognitionException {
        EObject current = null;

        EObject iv_rulehypothesis = null;


        try {
            // InternalSedml.g:1437:51: (iv_rulehypothesis= rulehypothesis EOF )
            // InternalSedml.g:1438:2: iv_rulehypothesis= rulehypothesis EOF
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
    // InternalSedml.g:1444:1: rulehypothesis returns [EObject current=null] : (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
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
            // InternalSedml.g:1450:2: ( (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalSedml.g:1451:2: (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalSedml.g:1451:2: (otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalSedml.g:1452:3: otherlv_0= 'hypotheses' otherlv_1= '{' (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )? (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )? (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )? (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHypothesisAccess().getHypothesesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:1460:3: (otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSedml.g:1461:4: otherlv_2= 'mechanistic' otherlv_3= 'hypotheses' otherlv_4= '{' ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_39); 

                    				newLeafNode(otherlv_2, grammarAccess.getHypothesisAccess().getMechanisticKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getHypothesisAccess().getHypothesesKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_2_2());
                    			
                    // InternalSedml.g:1473:4: ( (lv_mechHypothesis_5_0= ruleMechHypothesis ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSedml.g:1474:5: (lv_mechHypothesis_5_0= ruleMechHypothesis )
                    	    {
                    	    // InternalSedml.g:1474:5: (lv_mechHypothesis_5_0= ruleMechHypothesis )
                    	    // InternalSedml.g:1475:6: lv_mechHypothesis_5_0= ruleMechHypothesis
                    	    {

                    	    						newCompositeNode(grammarAccess.getHypothesisAccess().getMechHypothesisMechHypothesisParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_41); 

                    				newLeafNode(otherlv_6, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalSedml.g:1497:3: (otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSedml.g:1498:4: otherlv_7= 'evidence' otherlv_8= '{' ( (lv_evidences_9_0= ruleEvidence ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getHypothesisAccess().getEvidenceKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,13,FOLLOW_40); 

                    				newLeafNode(otherlv_8, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSedml.g:1506:4: ( (lv_evidences_9_0= ruleEvidence ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSedml.g:1507:5: (lv_evidences_9_0= ruleEvidence )
                    	    {
                    	    // InternalSedml.g:1507:5: (lv_evidences_9_0= ruleEvidence )
                    	    // InternalSedml.g:1508:6: lv_evidences_9_0= ruleEvidence
                    	    {

                    	    						newCompositeNode(grammarAccess.getHypothesisAccess().getEvidencesEvidenceParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_42); 

                    				newLeafNode(otherlv_10, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalSedml.g:1530:3: (otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSedml.g:1531:4: otherlv_11= 'coherence' otherlv_12= 'model' otherlv_13= '{' ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )* otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,44,FOLLOW_43); 

                    				newLeafNode(otherlv_11, grammarAccess.getHypothesisAccess().getCoherenceKeyword_4_0());
                    			
                    otherlv_12=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getHypothesisAccess().getModelKeyword_4_1());
                    			
                    otherlv_13=(Token)match(input,13,FOLLOW_44); 

                    				newLeafNode(otherlv_13, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_4_2());
                    			
                    // InternalSedml.g:1543:4: ( (lv_coherenceLinks_14_0= ruleCoherenceLink ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=169 && LA14_0<=172)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSedml.g:1544:5: (lv_coherenceLinks_14_0= ruleCoherenceLink )
                    	    {
                    	    // InternalSedml.g:1544:5: (lv_coherenceLinks_14_0= ruleCoherenceLink )
                    	    // InternalSedml.g:1545:6: lv_coherenceLinks_14_0= ruleCoherenceLink
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
                    	    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.CoherenceLink");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_45); 

                    				newLeafNode(otherlv_15, grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSedml.g:1567:3: (otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==46) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSedml.g:1568:4: otherlv_16= 'relational' otherlv_17= 'hypotheses' otherlv_18= '{' ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )* otherlv_20= '}'
                    {
                    otherlv_16=(Token)match(input,46,FOLLOW_39); 

                    				newLeafNode(otherlv_16, grammarAccess.getHypothesisAccess().getRelationalKeyword_5_0());
                    			
                    otherlv_17=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getHypothesisAccess().getHypothesesKeyword_5_1());
                    			
                    otherlv_18=(Token)match(input,13,FOLLOW_46); 

                    				newLeafNode(otherlv_18, grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_5_2());
                    			
                    // InternalSedml.g:1580:4: ( (lv_relHypothesis_19_0= ruleRelationalQuery ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==47||LA16_0==54) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSedml.g:1581:5: (lv_relHypothesis_19_0= ruleRelationalQuery )
                    	    {
                    	    // InternalSedml.g:1581:5: (lv_relHypothesis_19_0= ruleRelationalQuery )
                    	    // InternalSedml.g:1582:6: lv_relHypothesis_19_0= ruleRelationalQuery
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
                    	    							"tr.edu.metu.ceng.megamodel.sedml.Sedml.RelationalQuery");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,14,FOLLOW_8); 

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
    // InternalSedml.g:1612:1: entryRuleRelationalQuery returns [EObject current=null] : iv_ruleRelationalQuery= ruleRelationalQuery EOF ;
    public final EObject entryRuleRelationalQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalQuery = null;


        try {
            // InternalSedml.g:1612:56: (iv_ruleRelationalQuery= ruleRelationalQuery EOF )
            // InternalSedml.g:1613:2: iv_ruleRelationalQuery= ruleRelationalQuery EOF
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
    // InternalSedml.g:1619:1: ruleRelationalQuery returns [EObject current=null] : (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 ) ;
    public final EObject ruleRelationalQuery() throws RecognitionException {
        EObject current = null;

        EObject this_Query1_0 = null;

        EObject this_Query2_1 = null;

        EObject this_Query3_2 = null;



        	enterRule();

        try {
            // InternalSedml.g:1625:2: ( (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 ) )
            // InternalSedml.g:1626:2: (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 )
            {
            // InternalSedml.g:1626:2: (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalSedml.g:1627:3: this_Query1_0= ruleQuery1
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
                    // InternalSedml.g:1636:3: this_Query2_1= ruleQuery2
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
                    // InternalSedml.g:1645:3: this_Query3_2= ruleQuery3
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
    // InternalSedml.g:1657:1: entryRuleQuery1 returns [EObject current=null] : iv_ruleQuery1= ruleQuery1 EOF ;
    public final EObject entryRuleQuery1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery1 = null;


        try {
            // InternalSedml.g:1657:47: (iv_ruleQuery1= ruleQuery1 EOF )
            // InternalSedml.g:1658:2: iv_ruleQuery1= ruleQuery1 EOF
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
    // InternalSedml.g:1664:1: ruleQuery1 returns [EObject current=null] : (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? ) ;
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
            // InternalSedml.g:1670:2: ( (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? ) )
            // InternalSedml.g:1671:2: (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? )
            {
            // InternalSedml.g:1671:2: (otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )? )
            // InternalSedml.g:1672:3: otherlv_0= 'if' ( (lv_factor_1_0= RULE_ID ) )? ( (lv_control_2_0= RULE_ID ) )? otherlv_3= 'is' ( (lv_x_4_0= RULE_RANGEVALUE ) )? (otherlv_5= 'added' )? (otherlv_6= 'removed' )? (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )? otherlv_11= 'then' ( (lv_response_12_0= RULE_ID ) ) otherlv_13= 'is' ( (lv_y_14_0= RULE_RANGEVALUE ) )? (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getQuery1Access().getIfKeyword_0());
            		
            // InternalSedml.g:1676:3: ( (lv_factor_1_0= RULE_ID ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSedml.g:1677:4: (lv_factor_1_0= RULE_ID )
                    {
                    // InternalSedml.g:1677:4: (lv_factor_1_0= RULE_ID )
                    // InternalSedml.g:1678:5: lv_factor_1_0= RULE_ID
                    {
                    lv_factor_1_0=(Token)match(input,RULE_ID,FOLLOW_47); 

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

            // InternalSedml.g:1694:3: ( (lv_control_2_0= RULE_ID ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSedml.g:1695:4: (lv_control_2_0= RULE_ID )
                    {
                    // InternalSedml.g:1695:4: (lv_control_2_0= RULE_ID )
                    // InternalSedml.g:1696:5: lv_control_2_0= RULE_ID
                    {
                    lv_control_2_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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

            otherlv_3=(Token)match(input,48,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getQuery1Access().getIsKeyword_3());
            		
            // InternalSedml.g:1716:3: ( (lv_x_4_0= RULE_RANGEVALUE ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_RANGEVALUE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSedml.g:1717:4: (lv_x_4_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:1717:4: (lv_x_4_0= RULE_RANGEVALUE )
                    // InternalSedml.g:1718:5: lv_x_4_0= RULE_RANGEVALUE
                    {
                    lv_x_4_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_50); 

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

            // InternalSedml.g:1734:3: (otherlv_5= 'added' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==49) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSedml.g:1735:4: otherlv_5= 'added'
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_51); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuery1Access().getAddedKeyword_5());
                    			

                    }
                    break;

            }

            // InternalSedml.g:1740:3: (otherlv_6= 'removed' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSedml.g:1741:4: otherlv_6= 'removed'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_52); 

                    				newLeafNode(otherlv_6, grammarAccess.getQuery1Access().getRemovedKeyword_6());
                    			

                    }
                    break;

            }

            // InternalSedml.g:1746:3: (otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSedml.g:1747:4: otherlv_7= 'in the range' ( (lv_start1_8_0= RULE_RANGEVALUE ) ) otherlv_9= 'to' ( (lv_end1_10_0= RULE_RANGEVALUE ) )
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_53); 

                    				newLeafNode(otherlv_7, grammarAccess.getQuery1Access().getInTheRangeKeyword_7_0());
                    			
                    // InternalSedml.g:1751:4: ( (lv_start1_8_0= RULE_RANGEVALUE ) )
                    // InternalSedml.g:1752:5: (lv_start1_8_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:1752:5: (lv_start1_8_0= RULE_RANGEVALUE )
                    // InternalSedml.g:1753:6: lv_start1_8_0= RULE_RANGEVALUE
                    {
                    lv_start1_8_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_54); 

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

                    otherlv_9=(Token)match(input,52,FOLLOW_53); 

                    				newLeafNode(otherlv_9, grammarAccess.getQuery1Access().getToKeyword_7_2());
                    			
                    // InternalSedml.g:1773:4: ( (lv_end1_10_0= RULE_RANGEVALUE ) )
                    // InternalSedml.g:1774:5: (lv_end1_10_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:1774:5: (lv_end1_10_0= RULE_RANGEVALUE )
                    // InternalSedml.g:1775:6: lv_end1_10_0= RULE_RANGEVALUE
                    {
                    lv_end1_10_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_55); 

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

            otherlv_11=(Token)match(input,53,FOLLOW_24); 

            			newLeafNode(otherlv_11, grammarAccess.getQuery1Access().getThenKeyword_8());
            		
            // InternalSedml.g:1796:3: ( (lv_response_12_0= RULE_ID ) )
            // InternalSedml.g:1797:4: (lv_response_12_0= RULE_ID )
            {
            // InternalSedml.g:1797:4: (lv_response_12_0= RULE_ID )
            // InternalSedml.g:1798:5: lv_response_12_0= RULE_ID
            {
            lv_response_12_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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

            otherlv_13=(Token)match(input,48,FOLLOW_56); 

            			newLeafNode(otherlv_13, grammarAccess.getQuery1Access().getIsKeyword_10());
            		
            // InternalSedml.g:1818:3: ( (lv_y_14_0= RULE_RANGEVALUE ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_RANGEVALUE) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSedml.g:1819:4: (lv_y_14_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:1819:4: (lv_y_14_0= RULE_RANGEVALUE )
                    // InternalSedml.g:1820:5: lv_y_14_0= RULE_RANGEVALUE
                    {
                    lv_y_14_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_57); 

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

            // InternalSedml.g:1836:3: (otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==51) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSedml.g:1837:4: otherlv_15= 'in the range' ( (lv_start2_16_0= RULE_RANGEVALUE ) ) otherlv_17= 'to' ( (lv_end2_18_0= RULE_RANGEVALUE ) )
                    {
                    otherlv_15=(Token)match(input,51,FOLLOW_53); 

                    				newLeafNode(otherlv_15, grammarAccess.getQuery1Access().getInTheRangeKeyword_12_0());
                    			
                    // InternalSedml.g:1841:4: ( (lv_start2_16_0= RULE_RANGEVALUE ) )
                    // InternalSedml.g:1842:5: (lv_start2_16_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:1842:5: (lv_start2_16_0= RULE_RANGEVALUE )
                    // InternalSedml.g:1843:6: lv_start2_16_0= RULE_RANGEVALUE
                    {
                    lv_start2_16_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_54); 

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

                    otherlv_17=(Token)match(input,52,FOLLOW_53); 

                    				newLeafNode(otherlv_17, grammarAccess.getQuery1Access().getToKeyword_12_2());
                    			
                    // InternalSedml.g:1863:4: ( (lv_end2_18_0= RULE_RANGEVALUE ) )
                    // InternalSedml.g:1864:5: (lv_end2_18_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:1864:5: (lv_end2_18_0= RULE_RANGEVALUE )
                    // InternalSedml.g:1865:6: lv_end2_18_0= RULE_RANGEVALUE
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
    // InternalSedml.g:1886:1: entryRuleQuery2 returns [EObject current=null] : iv_ruleQuery2= ruleQuery2 EOF ;
    public final EObject entryRuleQuery2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery2 = null;


        try {
            // InternalSedml.g:1886:47: (iv_ruleQuery2= ruleQuery2 EOF )
            // InternalSedml.g:1887:2: iv_ruleQuery2= ruleQuery2 EOF
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
    // InternalSedml.g:1893:1: ruleQuery2 returns [EObject current=null] : (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? ) ;
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
            // InternalSedml.g:1899:2: ( (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? ) )
            // InternalSedml.g:1900:2: (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? )
            {
            // InternalSedml.g:1900:2: (otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )? )
            // InternalSedml.g:1901:3: otherlv_0= 'compare' ( (lv_function1_1_0= ruleFunction ) )? ( (lv_response1_2_0= RULE_ID ) )? ( (lv_factor1_3_0= RULE_ID ) )? otherlv_4= 'and' ( (lv_function2_5_0= ruleFunction ) )? ( (lv_response2_6_0= RULE_ID ) )? ( (lv_factor2_7_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getQuery2Access().getCompareKeyword_0());
            		
            // InternalSedml.g:1905:3: ( (lv_function1_1_0= ruleFunction ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=140 && LA27_0<=148)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSedml.g:1906:4: (lv_function1_1_0= ruleFunction )
                    {
                    // InternalSedml.g:1906:4: (lv_function1_1_0= ruleFunction )
                    // InternalSedml.g:1907:5: lv_function1_1_0= ruleFunction
                    {

                    					newCompositeNode(grammarAccess.getQuery2Access().getFunction1FunctionEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_59);
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

            // InternalSedml.g:1924:3: ( (lv_response1_2_0= RULE_ID ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSedml.g:1925:4: (lv_response1_2_0= RULE_ID )
                    {
                    // InternalSedml.g:1925:4: (lv_response1_2_0= RULE_ID )
                    // InternalSedml.g:1926:5: lv_response1_2_0= RULE_ID
                    {
                    lv_response1_2_0=(Token)match(input,RULE_ID,FOLLOW_59); 

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

            // InternalSedml.g:1942:3: ( (lv_factor1_3_0= RULE_ID ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSedml.g:1943:4: (lv_factor1_3_0= RULE_ID )
                    {
                    // InternalSedml.g:1943:4: (lv_factor1_3_0= RULE_ID )
                    // InternalSedml.g:1944:5: lv_factor1_3_0= RULE_ID
                    {
                    lv_factor1_3_0=(Token)match(input,RULE_ID,FOLLOW_60); 

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

            otherlv_4=(Token)match(input,55,FOLLOW_61); 

            			newLeafNode(otherlv_4, grammarAccess.getQuery2Access().getAndKeyword_4());
            		
            // InternalSedml.g:1964:3: ( (lv_function2_5_0= ruleFunction ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=140 && LA30_0<=148)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSedml.g:1965:4: (lv_function2_5_0= ruleFunction )
                    {
                    // InternalSedml.g:1965:4: (lv_function2_5_0= ruleFunction )
                    // InternalSedml.g:1966:5: lv_function2_5_0= ruleFunction
                    {

                    					newCompositeNode(grammarAccess.getQuery2Access().getFunction2FunctionEnumRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_62);
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

            // InternalSedml.g:1983:3: ( (lv_response2_6_0= RULE_ID ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSedml.g:1984:4: (lv_response2_6_0= RULE_ID )
                    {
                    // InternalSedml.g:1984:4: (lv_response2_6_0= RULE_ID )
                    // InternalSedml.g:1985:5: lv_response2_6_0= RULE_ID
                    {
                    lv_response2_6_0=(Token)match(input,RULE_ID,FOLLOW_62); 

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

            // InternalSedml.g:2001:3: ( (lv_factor2_7_0= RULE_ID ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSedml.g:2002:4: (lv_factor2_7_0= RULE_ID )
                    {
                    // InternalSedml.g:2002:4: (lv_factor2_7_0= RULE_ID )
                    // InternalSedml.g:2003:5: lv_factor2_7_0= RULE_ID
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
    // InternalSedml.g:2023:1: entryRuleQuery3 returns [EObject current=null] : iv_ruleQuery3= ruleQuery3 EOF ;
    public final EObject entryRuleQuery3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery3 = null;


        try {
            // InternalSedml.g:2023:47: (iv_ruleQuery3= ruleQuery3 EOF )
            // InternalSedml.g:2024:2: iv_ruleQuery3= ruleQuery3 EOF
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
    // InternalSedml.g:2030:1: ruleQuery3 returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* ) ;
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
            // InternalSedml.g:2036:2: ( (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* ) )
            // InternalSedml.g:2037:2: (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* )
            {
            // InternalSedml.g:2037:2: (otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )* )
            // InternalSedml.g:2038:3: otherlv_0= 'if' ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )* otherlv_9= 'then' ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )* otherlv_17= 'where' ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )*
            {
            otherlv_0=(Token)match(input,47,FOLLOW_63); 

            			newLeafNode(otherlv_0, grammarAccess.getQuery3Access().getIfKeyword_0());
            		
            // InternalSedml.g:2042:3: ( ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==48) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSedml.g:2043:4: ( (lv_factor1_1_0= RULE_ID ) )? ( (lv_control1_2_0= RULE_ID ) )? otherlv_3= 'is' (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )? ( (lv_x2_7_0= RULE_RANGEVALUE ) )? (otherlv_8= 'and' )?
            	    {
            	    // InternalSedml.g:2043:4: ( (lv_factor1_1_0= RULE_ID ) )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==RULE_ID) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalSedml.g:2044:5: (lv_factor1_1_0= RULE_ID )
            	            {
            	            // InternalSedml.g:2044:5: (lv_factor1_1_0= RULE_ID )
            	            // InternalSedml.g:2045:6: lv_factor1_1_0= RULE_ID
            	            {
            	            lv_factor1_1_0=(Token)match(input,RULE_ID,FOLLOW_47); 

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

            	    // InternalSedml.g:2061:4: ( (lv_control1_2_0= RULE_ID ) )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==RULE_ID) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalSedml.g:2062:5: (lv_control1_2_0= RULE_ID )
            	            {
            	            // InternalSedml.g:2062:5: (lv_control1_2_0= RULE_ID )
            	            // InternalSedml.g:2063:6: lv_control1_2_0= RULE_ID
            	            {
            	            lv_control1_2_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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

            	    otherlv_3=(Token)match(input,48,FOLLOW_64); 

            	    				newLeafNode(otherlv_3, grammarAccess.getQuery3Access().getIsKeyword_1_2());
            	    			
            	    // InternalSedml.g:2083:4: (otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) ) )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==56) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalSedml.g:2084:5: otherlv_4= 'at' otherlv_5= 'level' ( (lv_Level2_6_0= ruleLevels ) )
            	            {
            	            otherlv_4=(Token)match(input,56,FOLLOW_65); 

            	            					newLeafNode(otherlv_4, grammarAccess.getQuery3Access().getAtKeyword_1_3_0());
            	            				
            	            otherlv_5=(Token)match(input,57,FOLLOW_66); 

            	            					newLeafNode(otherlv_5, grammarAccess.getQuery3Access().getLevelKeyword_1_3_1());
            	            				
            	            // InternalSedml.g:2092:5: ( (lv_Level2_6_0= ruleLevels ) )
            	            // InternalSedml.g:2093:6: (lv_Level2_6_0= ruleLevels )
            	            {
            	            // InternalSedml.g:2093:6: (lv_Level2_6_0= ruleLevels )
            	            // InternalSedml.g:2094:7: lv_Level2_6_0= ruleLevels
            	            {

            	            							newCompositeNode(grammarAccess.getQuery3Access().getLevel2LevelsEnumRuleCall_1_3_2_0());
            	            						
            	            pushFollow(FOLLOW_67);
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

            	    // InternalSedml.g:2112:4: ( (lv_x2_7_0= RULE_RANGEVALUE ) )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==RULE_RANGEVALUE) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalSedml.g:2113:5: (lv_x2_7_0= RULE_RANGEVALUE )
            	            {
            	            // InternalSedml.g:2113:5: (lv_x2_7_0= RULE_RANGEVALUE )
            	            // InternalSedml.g:2114:6: lv_x2_7_0= RULE_RANGEVALUE
            	            {
            	            lv_x2_7_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_68); 

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

            	    // InternalSedml.g:2130:4: (otherlv_8= 'and' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==55) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalSedml.g:2131:5: otherlv_8= 'and'
            	            {
            	            otherlv_8=(Token)match(input,55,FOLLOW_63); 

            	            					newLeafNode(otherlv_8, grammarAccess.getQuery3Access().getAndKeyword_1_5());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_9=(Token)match(input,53,FOLLOW_69); 

            			newLeafNode(otherlv_9, grammarAccess.getQuery3Access().getThenKeyword_2());
            		
            // InternalSedml.g:2141:3: ( ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSedml.g:2142:4: ( (lv_response1_10_0= RULE_ID ) ) otherlv_11= 'is' (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )? ( (lv_x4_15_0= RULE_RANGEVALUE ) )? (otherlv_16= 'and' )?
            	    {
            	    // InternalSedml.g:2142:4: ( (lv_response1_10_0= RULE_ID ) )
            	    // InternalSedml.g:2143:5: (lv_response1_10_0= RULE_ID )
            	    {
            	    // InternalSedml.g:2143:5: (lv_response1_10_0= RULE_ID )
            	    // InternalSedml.g:2144:6: lv_response1_10_0= RULE_ID
            	    {
            	    lv_response1_10_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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

            	    otherlv_11=(Token)match(input,48,FOLLOW_70); 

            	    				newLeafNode(otherlv_11, grammarAccess.getQuery3Access().getIsKeyword_3_1());
            	    			
            	    // InternalSedml.g:2164:4: (otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) ) )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==56) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalSedml.g:2165:5: otherlv_12= 'at' otherlv_13= 'level' ( (lv_Level4_14_0= ruleLevels ) )
            	            {
            	            otherlv_12=(Token)match(input,56,FOLLOW_65); 

            	            					newLeafNode(otherlv_12, grammarAccess.getQuery3Access().getAtKeyword_3_2_0());
            	            				
            	            otherlv_13=(Token)match(input,57,FOLLOW_66); 

            	            					newLeafNode(otherlv_13, grammarAccess.getQuery3Access().getLevelKeyword_3_2_1());
            	            				
            	            // InternalSedml.g:2173:5: ( (lv_Level4_14_0= ruleLevels ) )
            	            // InternalSedml.g:2174:6: (lv_Level4_14_0= ruleLevels )
            	            {
            	            // InternalSedml.g:2174:6: (lv_Level4_14_0= ruleLevels )
            	            // InternalSedml.g:2175:7: lv_Level4_14_0= ruleLevels
            	            {

            	            							newCompositeNode(grammarAccess.getQuery3Access().getLevel4LevelsEnumRuleCall_3_2_2_0());
            	            						
            	            pushFollow(FOLLOW_71);
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

            	    // InternalSedml.g:2193:4: ( (lv_x4_15_0= RULE_RANGEVALUE ) )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==RULE_RANGEVALUE) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalSedml.g:2194:5: (lv_x4_15_0= RULE_RANGEVALUE )
            	            {
            	            // InternalSedml.g:2194:5: (lv_x4_15_0= RULE_RANGEVALUE )
            	            // InternalSedml.g:2195:6: lv_x4_15_0= RULE_RANGEVALUE
            	            {
            	            lv_x4_15_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_72); 

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

            	    // InternalSedml.g:2211:4: (otherlv_16= 'and' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==55) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalSedml.g:2212:5: otherlv_16= 'and'
            	            {
            	            otherlv_16=(Token)match(input,55,FOLLOW_69); 

            	            					newLeafNode(otherlv_16, grammarAccess.getQuery3Access().getAndKeyword_3_4());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_17=(Token)match(input,58,FOLLOW_73); 

            			newLeafNode(otherlv_17, grammarAccess.getQuery3Access().getWhereKeyword_4());
            		
            // InternalSedml.g:2222:3: ( ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=149 && LA46_0<=151)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSedml.g:2223:4: ( (lv_level_18_0= ruleLevels ) ) otherlv_19= 'for' ( (lv_factor_20_0= RULE_ID ) )? ( (lv_control_21_0= RULE_ID ) )? ( (lv_response_22_0= RULE_ID ) )? otherlv_23= 'is' otherlv_24= 'in the range' ( (lv_start1_25_0= RULE_RANGEVALUE ) ) otherlv_26= 'to' ( (lv_end1_27_0= RULE_RANGEVALUE ) )
            	    {
            	    // InternalSedml.g:2223:4: ( (lv_level_18_0= ruleLevels ) )
            	    // InternalSedml.g:2224:5: (lv_level_18_0= ruleLevels )
            	    {
            	    // InternalSedml.g:2224:5: (lv_level_18_0= ruleLevels )
            	    // InternalSedml.g:2225:6: lv_level_18_0= ruleLevels
            	    {

            	    						newCompositeNode(grammarAccess.getQuery3Access().getLevelLevelsEnumRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_74);
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

            	    otherlv_19=(Token)match(input,59,FOLLOW_47); 

            	    				newLeafNode(otherlv_19, grammarAccess.getQuery3Access().getForKeyword_5_1());
            	    			
            	    // InternalSedml.g:2246:4: ( (lv_factor_20_0= RULE_ID ) )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==RULE_ID) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalSedml.g:2247:5: (lv_factor_20_0= RULE_ID )
            	            {
            	            // InternalSedml.g:2247:5: (lv_factor_20_0= RULE_ID )
            	            // InternalSedml.g:2248:6: lv_factor_20_0= RULE_ID
            	            {
            	            lv_factor_20_0=(Token)match(input,RULE_ID,FOLLOW_47); 

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

            	    // InternalSedml.g:2264:4: ( (lv_control_21_0= RULE_ID ) )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==RULE_ID) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalSedml.g:2265:5: (lv_control_21_0= RULE_ID )
            	            {
            	            // InternalSedml.g:2265:5: (lv_control_21_0= RULE_ID )
            	            // InternalSedml.g:2266:6: lv_control_21_0= RULE_ID
            	            {
            	            lv_control_21_0=(Token)match(input,RULE_ID,FOLLOW_47); 

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

            	    // InternalSedml.g:2282:4: ( (lv_response_22_0= RULE_ID ) )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==RULE_ID) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalSedml.g:2283:5: (lv_response_22_0= RULE_ID )
            	            {
            	            // InternalSedml.g:2283:5: (lv_response_22_0= RULE_ID )
            	            // InternalSedml.g:2284:6: lv_response_22_0= RULE_ID
            	            {
            	            lv_response_22_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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

            	    otherlv_23=(Token)match(input,48,FOLLOW_75); 

            	    				newLeafNode(otherlv_23, grammarAccess.getQuery3Access().getIsKeyword_5_5());
            	    			
            	    otherlv_24=(Token)match(input,51,FOLLOW_53); 

            	    				newLeafNode(otherlv_24, grammarAccess.getQuery3Access().getInTheRangeKeyword_5_6());
            	    			
            	    // InternalSedml.g:2308:4: ( (lv_start1_25_0= RULE_RANGEVALUE ) )
            	    // InternalSedml.g:2309:5: (lv_start1_25_0= RULE_RANGEVALUE )
            	    {
            	    // InternalSedml.g:2309:5: (lv_start1_25_0= RULE_RANGEVALUE )
            	    // InternalSedml.g:2310:6: lv_start1_25_0= RULE_RANGEVALUE
            	    {
            	    lv_start1_25_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_54); 

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

            	    otherlv_26=(Token)match(input,52,FOLLOW_53); 

            	    				newLeafNode(otherlv_26, grammarAccess.getQuery3Access().getToKeyword_5_8());
            	    			
            	    // InternalSedml.g:2330:4: ( (lv_end1_27_0= RULE_RANGEVALUE ) )
            	    // InternalSedml.g:2331:5: (lv_end1_27_0= RULE_RANGEVALUE )
            	    {
            	    // InternalSedml.g:2331:5: (lv_end1_27_0= RULE_RANGEVALUE )
            	    // InternalSedml.g:2332:6: lv_end1_27_0= RULE_RANGEVALUE
            	    {
            	    lv_end1_27_0=(Token)match(input,RULE_RANGEVALUE,FOLLOW_73); 

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
            	    break loop46;
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
    // InternalSedml.g:2353:1: entryRuleCoherenceLink returns [EObject current=null] : iv_ruleCoherenceLink= ruleCoherenceLink EOF ;
    public final EObject entryRuleCoherenceLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoherenceLink = null;


        try {
            // InternalSedml.g:2353:54: (iv_ruleCoherenceLink= ruleCoherenceLink EOF )
            // InternalSedml.g:2354:2: iv_ruleCoherenceLink= ruleCoherenceLink EOF
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
    // InternalSedml.g:2360:1: ruleCoherenceLink returns [EObject current=null] : ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' ) ;
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
            // InternalSedml.g:2366:2: ( ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' ) )
            // InternalSedml.g:2367:2: ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' )
            {
            // InternalSedml.g:2367:2: ( ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')' )
            // InternalSedml.g:2368:3: ( (lv_coherence_0_0= ruleCoherence ) ) otherlv_1= '(' ( (lv_hyp_2_0= RULE_ID ) )* otherlv_3= ')' otherlv_4= '(' ( (lv_evi_5_0= RULE_ID ) )* otherlv_6= ')'
            {
            // InternalSedml.g:2368:3: ( (lv_coherence_0_0= ruleCoherence ) )
            // InternalSedml.g:2369:4: (lv_coherence_0_0= ruleCoherence )
            {
            // InternalSedml.g:2369:4: (lv_coherence_0_0= ruleCoherence )
            // InternalSedml.g:2370:5: lv_coherence_0_0= ruleCoherence
            {

            					newCompositeNode(grammarAccess.getCoherenceLinkAccess().getCoherenceCoherenceEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_76);
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

            otherlv_1=(Token)match(input,60,FOLLOW_77); 

            			newLeafNode(otherlv_1, grammarAccess.getCoherenceLinkAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSedml.g:2391:3: ( (lv_hyp_2_0= RULE_ID ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSedml.g:2392:4: (lv_hyp_2_0= RULE_ID )
            	    {
            	    // InternalSedml.g:2392:4: (lv_hyp_2_0= RULE_ID )
            	    // InternalSedml.g:2393:5: lv_hyp_2_0= RULE_ID
            	    {
            	    lv_hyp_2_0=(Token)match(input,RULE_ID,FOLLOW_77); 

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
            	    break loop47;
                }
            } while (true);

            otherlv_3=(Token)match(input,61,FOLLOW_76); 

            			newLeafNode(otherlv_3, grammarAccess.getCoherenceLinkAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,60,FOLLOW_77); 

            			newLeafNode(otherlv_4, grammarAccess.getCoherenceLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalSedml.g:2417:3: ( (lv_evi_5_0= RULE_ID ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSedml.g:2418:4: (lv_evi_5_0= RULE_ID )
            	    {
            	    // InternalSedml.g:2418:4: (lv_evi_5_0= RULE_ID )
            	    // InternalSedml.g:2419:5: lv_evi_5_0= RULE_ID
            	    {
            	    lv_evi_5_0=(Token)match(input,RULE_ID,FOLLOW_77); 

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
            	    break loop48;
                }
            } while (true);

            otherlv_6=(Token)match(input,61,FOLLOW_2); 

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
    // InternalSedml.g:2443:1: entryRuleMechHypothesis returns [EObject current=null] : iv_ruleMechHypothesis= ruleMechHypothesis EOF ;
    public final EObject entryRuleMechHypothesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechHypothesis = null;


        try {
            // InternalSedml.g:2443:55: (iv_ruleMechHypothesis= ruleMechHypothesis EOF )
            // InternalSedml.g:2444:2: iv_ruleMechHypothesis= ruleMechHypothesis EOF
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
    // InternalSedml.g:2450:1: ruleMechHypothesis returns [EObject current=null] : ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? ) ;
    public final EObject ruleMechHypothesis() throws RecognitionException {
        EObject current = null;

        Token lv_mName_0_0=null;
        Token otherlv_1=null;
        Token lv_mechanisticHypothesis_3_0=null;
        EObject lv_assoMech_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:2456:2: ( ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? ) )
            // InternalSedml.g:2457:2: ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? )
            {
            // InternalSedml.g:2457:2: ( ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )? )
            // InternalSedml.g:2458:3: ( (lv_mName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_assoMech_2_0= ruleTemporalPattern ) )* ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )?
            {
            // InternalSedml.g:2458:3: ( (lv_mName_0_0= RULE_ID ) )
            // InternalSedml.g:2459:4: (lv_mName_0_0= RULE_ID )
            {
            // InternalSedml.g:2459:4: (lv_mName_0_0= RULE_ID )
            // InternalSedml.g:2460:5: lv_mName_0_0= RULE_ID
            {
            lv_mName_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getMechHypothesisAccess().getColonKeyword_1());
            		
            // InternalSedml.g:2480:3: ( (lv_assoMech_2_0= ruleTemporalPattern ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==79) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSedml.g:2481:4: (lv_assoMech_2_0= ruleTemporalPattern )
            	    {
            	    // InternalSedml.g:2481:4: (lv_assoMech_2_0= ruleTemporalPattern )
            	    // InternalSedml.g:2482:5: lv_assoMech_2_0= ruleTemporalPattern
            	    {

            	    					newCompositeNode(grammarAccess.getMechHypothesisAccess().getAssoMechTemporalPatternParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_78);
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
            	    break loop49;
                }
            } while (true);

            // InternalSedml.g:2499:3: ( (lv_mechanisticHypothesis_3_0= RULE_ID ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==EOF||LA50_1==RULE_ID||LA50_1==14) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalSedml.g:2500:4: (lv_mechanisticHypothesis_3_0= RULE_ID )
                    {
                    // InternalSedml.g:2500:4: (lv_mechanisticHypothesis_3_0= RULE_ID )
                    // InternalSedml.g:2501:5: lv_mechanisticHypothesis_3_0= RULE_ID
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
    // InternalSedml.g:2521:1: entryRuleEvidence returns [EObject current=null] : iv_ruleEvidence= ruleEvidence EOF ;
    public final EObject entryRuleEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidence = null;


        try {
            // InternalSedml.g:2521:49: (iv_ruleEvidence= ruleEvidence EOF )
            // InternalSedml.g:2522:2: iv_ruleEvidence= ruleEvidence EOF
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
    // InternalSedml.g:2528:1: ruleEvidence returns [EObject current=null] : ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) ) ;
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
            // InternalSedml.g:2534:2: ( ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) ) )
            // InternalSedml.g:2535:2: ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) )
            {
            // InternalSedml.g:2535:2: ( ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) ) )
            // InternalSedml.g:2536:3: ( (lv_eName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleTemporalPattern ) )* otherlv_3= 'activation' otherlv_4= 'weight' otherlv_5= ':' ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) )
            {
            // InternalSedml.g:2536:3: ( (lv_eName_0_0= RULE_ID ) )
            // InternalSedml.g:2537:4: (lv_eName_0_0= RULE_ID )
            {
            // InternalSedml.g:2537:4: (lv_eName_0_0= RULE_ID )
            // InternalSedml.g:2538:5: lv_eName_0_0= RULE_ID
            {
            lv_eName_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_79); 

            			newLeafNode(otherlv_1, grammarAccess.getEvidenceAccess().getColonKeyword_1());
            		
            // InternalSedml.g:2558:3: ( (lv_query_2_0= ruleTemporalPattern ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID||LA51_0==79) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSedml.g:2559:4: (lv_query_2_0= ruleTemporalPattern )
            	    {
            	    // InternalSedml.g:2559:4: (lv_query_2_0= ruleTemporalPattern )
            	    // InternalSedml.g:2560:5: lv_query_2_0= ruleTemporalPattern
            	    {

            	    					newCompositeNode(grammarAccess.getEvidenceAccess().getQueryTemporalPatternParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_79);
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
            	    break loop51;
                }
            } while (true);

            otherlv_3=(Token)match(input,62,FOLLOW_80); 

            			newLeafNode(otherlv_3, grammarAccess.getEvidenceAccess().getActivationKeyword_3());
            		
            otherlv_4=(Token)match(input,63,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getEvidenceAccess().getWeightKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_53); 

            			newLeafNode(otherlv_5, grammarAccess.getEvidenceAccess().getColonKeyword_5());
            		
            // InternalSedml.g:2589:3: ( (lv_objOfStudy_6_0= RULE_RANGEVALUE ) )
            // InternalSedml.g:2590:4: (lv_objOfStudy_6_0= RULE_RANGEVALUE )
            {
            // InternalSedml.g:2590:4: (lv_objOfStudy_6_0= RULE_RANGEVALUE )
            // InternalSedml.g:2591:5: lv_objOfStudy_6_0= RULE_RANGEVALUE
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
    // InternalSedml.g:2611:1: entryRuleTemporalPattern returns [EObject current=null] : iv_ruleTemporalPattern= ruleTemporalPattern EOF ;
    public final EObject entryRuleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPattern = null;


        try {
            // InternalSedml.g:2611:56: (iv_ruleTemporalPattern= ruleTemporalPattern EOF )
            // InternalSedml.g:2612:2: iv_ruleTemporalPattern= ruleTemporalPattern EOF
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
    // InternalSedml.g:2618:1: ruleTemporalPattern returns [EObject current=null] : (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? ) ;
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
            // InternalSedml.g:2624:2: ( (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? ) )
            // InternalSedml.g:2625:2: (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? )
            {
            // InternalSedml.g:2625:2: (this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )? )
            // InternalSedml.g:2626:3: this_Condition_0= ruleCondition ( (lv_l2_1_0= ruleLinks ) )* ( (lv_exp_2_0= ruleExpression ) )* ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )* ( (lv_l3_5_0= ruleLinks ) )?
            {

            			newCompositeNode(grammarAccess.getTemporalPatternAccess().getConditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_81);
            this_Condition_0=ruleCondition();

            state._fsp--;


            			current = this_Condition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSedml.g:2634:3: ( (lv_l2_1_0= ruleLinks ) )*
            loop52:
            do {
                int alt52=2;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    alt52=1;
                    }
                    break;
                case 154:
                    {
                    alt52=1;
                    }
                    break;
                case 52:
                    {
                    alt52=1;
                    }
                    break;
                case 155:
                    {
                    alt52=1;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // InternalSedml.g:2635:4: (lv_l2_1_0= ruleLinks )
            	    {
            	    // InternalSedml.g:2635:4: (lv_l2_1_0= ruleLinks )
            	    // InternalSedml.g:2636:5: lv_l2_1_0= ruleLinks
            	    {

            	    					newCompositeNode(grammarAccess.getTemporalPatternAccess().getL2LinksEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_81);
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
            	    break loop52;
                }
            } while (true);

            // InternalSedml.g:2653:3: ( (lv_exp_2_0= ruleExpression ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=152 && LA53_0<=153)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalSedml.g:2654:4: (lv_exp_2_0= ruleExpression )
            	    {
            	    // InternalSedml.g:2654:4: (lv_exp_2_0= ruleExpression )
            	    // InternalSedml.g:2655:5: lv_exp_2_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getTemporalPatternAccess().getExpExpressionEnumRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_81);
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
            	    break loop53;
                }
            } while (true);

            // InternalSedml.g:2672:3: ( ( (lv_op1_3_0= ruleTemporal ) ) | ( (lv_op2_4_0= ruleLogical ) ) )*
            loop54:
            do {
                int alt54=3;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=156 && LA54_0<=166)) ) {
                    alt54=1;
                }
                else if ( (LA54_0==55||(LA54_0>=167 && LA54_0<=168)) ) {
                    alt54=2;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalSedml.g:2673:4: ( (lv_op1_3_0= ruleTemporal ) )
            	    {
            	    // InternalSedml.g:2673:4: ( (lv_op1_3_0= ruleTemporal ) )
            	    // InternalSedml.g:2674:5: (lv_op1_3_0= ruleTemporal )
            	    {
            	    // InternalSedml.g:2674:5: (lv_op1_3_0= ruleTemporal )
            	    // InternalSedml.g:2675:6: lv_op1_3_0= ruleTemporal
            	    {

            	    						newCompositeNode(grammarAccess.getTemporalPatternAccess().getOp1TemporalEnumRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_82);
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
            	    // InternalSedml.g:2693:4: ( (lv_op2_4_0= ruleLogical ) )
            	    {
            	    // InternalSedml.g:2693:4: ( (lv_op2_4_0= ruleLogical ) )
            	    // InternalSedml.g:2694:5: (lv_op2_4_0= ruleLogical )
            	    {
            	    // InternalSedml.g:2694:5: (lv_op2_4_0= ruleLogical )
            	    // InternalSedml.g:2695:6: lv_op2_4_0= ruleLogical
            	    {

            	    						newCompositeNode(grammarAccess.getTemporalPatternAccess().getOp2LogicalEnumRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_82);
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
            	    break loop54;
                }
            } while (true);

            // InternalSedml.g:2713:3: ( (lv_l3_5_0= ruleLinks ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==48||LA55_0==52||(LA55_0>=154 && LA55_0<=155)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSedml.g:2714:4: (lv_l3_5_0= ruleLinks )
                    {
                    // InternalSedml.g:2714:4: (lv_l3_5_0= ruleLinks )
                    // InternalSedml.g:2715:5: lv_l3_5_0= ruleLinks
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
    // InternalSedml.g:2736:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSedml.g:2736:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSedml.g:2737:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalSedml.g:2743:1: ruleCondition returns [EObject current=null] : ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_v_4_0=null;
        EObject lv_condition_0_0 = null;

        AntlrDatatypeRuleToken lv_lo_1_0 = null;

        EObject lv_e_2_0 = null;

        Enumerator lv_exp1_3_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:2749:2: ( ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? ) )
            // InternalSedml.g:2750:2: ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? )
            {
            // InternalSedml.g:2750:2: ( ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )? )
            // InternalSedml.g:2751:3: ( (lv_condition_0_0= ruleEvent ) ) ( (lv_lo_1_0= ruleLinkOperators ) )? ( (lv_e_2_0= ruleEvent ) )? ( (lv_exp1_3_0= ruleExpression ) )? ( (lv_v_4_0= RULE_RANGEVALUE ) )?
            {
            // InternalSedml.g:2751:3: ( (lv_condition_0_0= ruleEvent ) )
            // InternalSedml.g:2752:4: (lv_condition_0_0= ruleEvent )
            {
            // InternalSedml.g:2752:4: (lv_condition_0_0= ruleEvent )
            // InternalSedml.g:2753:5: lv_condition_0_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getConditionEventParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_83);
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

            // InternalSedml.g:2770:3: ( (lv_lo_1_0= ruleLinkOperators ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=64 && LA56_0<=78)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSedml.g:2771:4: (lv_lo_1_0= ruleLinkOperators )
                    {
                    // InternalSedml.g:2771:4: (lv_lo_1_0= ruleLinkOperators )
                    // InternalSedml.g:2772:5: lv_lo_1_0= ruleLinkOperators
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getLoLinkOperatorsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_84);
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

            // InternalSedml.g:2789:3: ( (lv_e_2_0= ruleEvent ) )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // InternalSedml.g:2790:4: (lv_e_2_0= ruleEvent )
                    {
                    // InternalSedml.g:2790:4: (lv_e_2_0= ruleEvent )
                    // InternalSedml.g:2791:5: lv_e_2_0= ruleEvent
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getEEventParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_85);
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

            // InternalSedml.g:2808:3: ( (lv_exp1_3_0= ruleExpression ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==152) ) {
                alt58=1;
            }
            else if ( (LA58_0==153) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSedml.g:2809:4: (lv_exp1_3_0= ruleExpression )
                    {
                    // InternalSedml.g:2809:4: (lv_exp1_3_0= ruleExpression )
                    // InternalSedml.g:2810:5: lv_exp1_3_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getExp1ExpressionEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_86);
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

            // InternalSedml.g:2827:3: ( (lv_v_4_0= RULE_RANGEVALUE ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_RANGEVALUE) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSedml.g:2828:4: (lv_v_4_0= RULE_RANGEVALUE )
                    {
                    // InternalSedml.g:2828:4: (lv_v_4_0= RULE_RANGEVALUE )
                    // InternalSedml.g:2829:5: lv_v_4_0= RULE_RANGEVALUE
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
    // InternalSedml.g:2849:1: entryRuleLinkOperators returns [String current=null] : iv_ruleLinkOperators= ruleLinkOperators EOF ;
    public final String entryRuleLinkOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLinkOperators = null;


        try {
            // InternalSedml.g:2849:53: (iv_ruleLinkOperators= ruleLinkOperators EOF )
            // InternalSedml.g:2850:2: iv_ruleLinkOperators= ruleLinkOperators EOF
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
    // InternalSedml.g:2856:1: ruleLinkOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleLinkOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSedml.g:2862:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' ) )
            // InternalSedml.g:2863:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' )
            {
            // InternalSedml.g:2863:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= ' = ' | kw= ' == ' | kw= '&&' | kw= '||' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!' | kw= '!=' )
            int alt60=15;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt60=1;
                }
                break;
            case 65:
                {
                alt60=2;
                }
                break;
            case 66:
                {
                alt60=3;
                }
                break;
            case 67:
                {
                alt60=4;
                }
                break;
            case 68:
                {
                alt60=5;
                }
                break;
            case 69:
                {
                alt60=6;
                }
                break;
            case 70:
                {
                alt60=7;
                }
                break;
            case 71:
                {
                alt60=8;
                }
                break;
            case 72:
                {
                alt60=9;
                }
                break;
            case 73:
                {
                alt60=10;
                }
                break;
            case 74:
                {
                alt60=11;
                }
                break;
            case 75:
                {
                alt60=12;
                }
                break;
            case 76:
                {
                alt60=13;
                }
                break;
            case 77:
                {
                alt60=14;
                }
                break;
            case 78:
                {
                alt60=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalSedml.g:2864:3: kw= '+'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSedml.g:2870:3: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSedml.g:2876:3: kw= '*'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSedml.g:2882:3: kw= '/'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSedml.g:2888:3: kw= '%'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getPercentSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSedml.g:2894:3: kw= ' = '
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getSpaceEqualsSignSpaceKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSedml.g:2900:3: kw= ' == '
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getSpaceEqualsSignEqualsSignSpaceKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSedml.g:2906:3: kw= '&&'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getAmpersandAmpersandKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSedml.g:2912:3: kw= '||'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getVerticalLineVerticalLineKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalSedml.g:2918:3: kw= '<'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getLessThanSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalSedml.g:2924:3: kw= '<='
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getLessThanSignEqualsSignKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalSedml.g:2930:3: kw= '>'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getGreaterThanSignKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalSedml.g:2936:3: kw= '>='
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getGreaterThanSignEqualsSignKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalSedml.g:2942:3: kw= '!'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinkOperatorsAccess().getExclamationMarkKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalSedml.g:2948:3: kw= '!='
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

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
    // InternalSedml.g:2957:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalSedml.g:2957:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalSedml.g:2958:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalSedml.g:2964:1: ruleEvent returns [EObject current=null] : (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_Dispersed_0 = null;

        EObject this_Simultaneous_1 = null;



        	enterRule();

        try {
            // InternalSedml.g:2970:2: ( (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous ) )
            // InternalSedml.g:2971:2: (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous )
            {
            // InternalSedml.g:2971:2: (this_Dispersed_0= ruleDispersed | this_Simultaneous_1= ruleSimultaneous )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==79) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalSedml.g:2972:3: this_Dispersed_0= ruleDispersed
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
                    // InternalSedml.g:2981:3: this_Simultaneous_1= ruleSimultaneous
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
    // InternalSedml.g:2993:1: entryRuleSimultaneous returns [EObject current=null] : iv_ruleSimultaneous= ruleSimultaneous EOF ;
    public final EObject entryRuleSimultaneous() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimultaneous = null;


        try {
            // InternalSedml.g:2993:53: (iv_ruleSimultaneous= ruleSimultaneous EOF )
            // InternalSedml.g:2994:2: iv_ruleSimultaneous= ruleSimultaneous EOF
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
    // InternalSedml.g:3000:1: ruleSimultaneous returns [EObject current=null] : (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSimultaneous() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_sim1_1_0 = null;

        Enumerator lv_log_2_0 = null;

        AntlrDatatypeRuleToken lv_sim2_3_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:3006:2: ( (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' ) )
            // InternalSedml.g:3007:2: (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' )
            {
            // InternalSedml.g:3007:2: (otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']' )
            // InternalSedml.g:3008:3: otherlv_0= '[' ( (lv_sim1_1_0= ruleRe ) ) ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getSimultaneousAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSedml.g:3012:3: ( (lv_sim1_1_0= ruleRe ) )
            // InternalSedml.g:3013:4: (lv_sim1_1_0= ruleRe )
            {
            // InternalSedml.g:3013:4: (lv_sim1_1_0= ruleRe )
            // InternalSedml.g:3014:5: lv_sim1_1_0= ruleRe
            {

            					newCompositeNode(grammarAccess.getSimultaneousAccess().getSim1ReParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_87);
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

            // InternalSedml.g:3031:3: ( ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==55||(LA62_0>=167 && LA62_0<=168)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalSedml.g:3032:4: ( (lv_log_2_0= ruleLogical ) ) ( (lv_sim2_3_0= ruleRe ) )
            	    {
            	    // InternalSedml.g:3032:4: ( (lv_log_2_0= ruleLogical ) )
            	    // InternalSedml.g:3033:5: (lv_log_2_0= ruleLogical )
            	    {
            	    // InternalSedml.g:3033:5: (lv_log_2_0= ruleLogical )
            	    // InternalSedml.g:3034:6: lv_log_2_0= ruleLogical
            	    {

            	    						newCompositeNode(grammarAccess.getSimultaneousAccess().getLogLogicalEnumRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_24);
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

            	    // InternalSedml.g:3051:4: ( (lv_sim2_3_0= ruleRe ) )
            	    // InternalSedml.g:3052:5: (lv_sim2_3_0= ruleRe )
            	    {
            	    // InternalSedml.g:3052:5: (lv_sim2_3_0= ruleRe )
            	    // InternalSedml.g:3053:6: lv_sim2_3_0= ruleRe
            	    {

            	    						newCompositeNode(grammarAccess.getSimultaneousAccess().getSim2ReParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_87);
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
            	    break loop62;
                }
            } while (true);

            otherlv_4=(Token)match(input,80,FOLLOW_2); 

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
    // InternalSedml.g:3079:1: entryRuleDispersed returns [EObject current=null] : iv_ruleDispersed= ruleDispersed EOF ;
    public final EObject entryRuleDispersed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDispersed = null;


        try {
            // InternalSedml.g:3079:50: (iv_ruleDispersed= ruleDispersed EOF )
            // InternalSedml.g:3080:2: iv_ruleDispersed= ruleDispersed EOF
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
    // InternalSedml.g:3086:1: ruleDispersed returns [EObject current=null] : ( (lv_disp_0_0= ruleRe ) )+ ;
    public final EObject ruleDispersed() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_disp_0_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:3092:2: ( ( (lv_disp_0_0= ruleRe ) )+ )
            // InternalSedml.g:3093:2: ( (lv_disp_0_0= ruleRe ) )+
            {
            // InternalSedml.g:3093:2: ( (lv_disp_0_0= ruleRe ) )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalSedml.g:3094:3: (lv_disp_0_0= ruleRe )
            	    {
            	    // InternalSedml.g:3094:3: (lv_disp_0_0= ruleRe )
            	    // InternalSedml.g:3095:4: lv_disp_0_0= ruleRe
            	    {

            	    				newCompositeNode(grammarAccess.getDispersedAccess().getDispReParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_62);
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
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
    // InternalSedml.g:3115:1: entryRuleRe returns [String current=null] : iv_ruleRe= ruleRe EOF ;
    public final String entryRuleRe() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRe = null;


        try {
            // InternalSedml.g:3115:42: (iv_ruleRe= ruleRe EOF )
            // InternalSedml.g:3116:2: iv_ruleRe= ruleRe EOF
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
    // InternalSedml.g:3122:1: ruleRe returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleRe() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalSedml.g:3128:2: ( (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? ) )
            // InternalSedml.g:3129:2: (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? )
            {
            // InternalSedml.g:3129:2: (this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )? )
            // InternalSedml.g:3130:3: this_ID_0= RULE_ID (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_88); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getReAccess().getIDTerminalRuleCall_0());
            		
            // InternalSedml.g:3137:3: (kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==60) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSedml.g:3138:4: kw= '(' (this_ID_2= RULE_ID this_ID_3= RULE_ID )? kw= ')'
                    {
                    kw=(Token)match(input,60,FOLLOW_77); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalSedml.g:3143:4: (this_ID_2= RULE_ID this_ID_3= RULE_ID )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_ID) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalSedml.g:3144:5: this_ID_2= RULE_ID this_ID_3= RULE_ID
                            {
                            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_24); 

                            					current.merge(this_ID_2);
                            				

                            					newLeafNode(this_ID_2, grammarAccess.getReAccess().getIDTerminalRuleCall_1_1_0());
                            				
                            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_89); 

                            					current.merge(this_ID_3);
                            				

                            					newLeafNode(this_ID_3, grammarAccess.getReAccess().getIDTerminalRuleCall_1_1_1());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,61,FOLLOW_2); 

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
    // InternalSedml.g:3169:1: entryRulelistOfModels returns [EObject current=null] : iv_rulelistOfModels= rulelistOfModels EOF ;
    public final EObject entryRulelistOfModels() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfModels = null;


        try {
            // InternalSedml.g:3169:53: (iv_rulelistOfModels= rulelistOfModels EOF )
            // InternalSedml.g:3170:2: iv_rulelistOfModels= rulelistOfModels EOF
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
    // InternalSedml.g:3176:1: rulelistOfModels returns [EObject current=null] : (otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfModels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_model_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:3182:2: ( (otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}' ) )
            // InternalSedml.g:3183:2: (otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:3183:2: (otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}' )
            // InternalSedml.g:3184:3: otherlv_0= 'listOfModels' otherlv_1= '{' ( (lv_model_2_0= rulemodel ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfModelsAccess().getListOfModelsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_90); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfModelsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:3192:3: ( (lv_model_2_0= rulemodel ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==45) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalSedml.g:3193:4: (lv_model_2_0= rulemodel )
            	    {
            	    // InternalSedml.g:3193:4: (lv_model_2_0= rulemodel )
            	    // InternalSedml.g:3194:5: lv_model_2_0= rulemodel
            	    {

            	    					newCompositeNode(grammarAccess.getListOfModelsAccess().getModelModelParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_90);
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
            	    break loop66;
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
    // InternalSedml.g:3219:1: entryRulemodel returns [EObject current=null] : iv_rulemodel= rulemodel EOF ;
    public final EObject entryRulemodel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemodel = null;


        try {
            // InternalSedml.g:3219:46: (iv_rulemodel= rulemodel EOF )
            // InternalSedml.g:3220:2: iv_rulemodel= rulemodel EOF
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
    // InternalSedml.g:3226:1: rulemodel returns [EObject current=null] : (otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) ( (lv_listOfChanges_14_0= rulelistOfChanges ) )? otherlv_15= '}' ) ;
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
        Token otherlv_15=null;
        EObject lv_listOfChanges_14_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:3232:2: ( (otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) ( (lv_listOfChanges_14_0= rulelistOfChanges ) )? otherlv_15= '}' ) )
            // InternalSedml.g:3233:2: (otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) ( (lv_listOfChanges_14_0= rulelistOfChanges ) )? otherlv_15= '}' )
            {
            // InternalSedml.g:3233:2: (otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) ( (lv_listOfChanges_14_0= rulelistOfChanges ) )? otherlv_15= '}' )
            // InternalSedml.g:3234:3: otherlv_0= 'model' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'language' otherlv_6= ':' ( (lv_language_7_0= RULE_STRING ) ) otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) ( (lv_listOfChanges_14_0= rulelistOfChanges ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getColonKeyword_3());
            		
            // InternalSedml.g:3250:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:3251:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:3251:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:3252:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_91); 

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

            otherlv_5=(Token)match(input,82,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLanguageKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getColonKeyword_6());
            		
            // InternalSedml.g:3276:3: ( (lv_language_7_0= RULE_STRING ) )
            // InternalSedml.g:3277:4: (lv_language_7_0= RULE_STRING )
            {
            // InternalSedml.g:3277:4: (lv_language_7_0= RULE_STRING )
            // InternalSedml.g:3278:5: lv_language_7_0= RULE_STRING
            {
            lv_language_7_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            otherlv_8=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getSourceKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getColonKeyword_9());
            		
            // InternalSedml.g:3302:3: ( (lv_source_10_0= RULE_STRING ) )
            // InternalSedml.g:3303:4: (lv_source_10_0= RULE_STRING )
            {
            // InternalSedml.g:3303:4: (lv_source_10_0= RULE_STRING )
            // InternalSedml.g:3304:5: lv_source_10_0= RULE_STRING
            {
            lv_source_10_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            otherlv_11=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getModelAccess().getNameKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getModelAccess().getColonKeyword_12());
            		
            // InternalSedml.g:3328:3: ( (lv_name_13_0= RULE_STRING ) )
            // InternalSedml.g:3329:4: (lv_name_13_0= RULE_STRING )
            {
            // InternalSedml.g:3329:4: (lv_name_13_0= RULE_STRING )
            // InternalSedml.g:3330:5: lv_name_13_0= RULE_STRING
            {
            lv_name_13_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

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

            // InternalSedml.g:3346:3: ( (lv_listOfChanges_14_0= rulelistOfChanges ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==83) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSedml.g:3347:4: (lv_listOfChanges_14_0= rulelistOfChanges )
                    {
                    // InternalSedml.g:3347:4: (lv_listOfChanges_14_0= rulelistOfChanges )
                    // InternalSedml.g:3348:5: lv_listOfChanges_14_0= rulelistOfChanges
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getListOfChangesListOfChangesParserRuleCall_14_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_listOfChanges_14_0=rulelistOfChanges();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"listOfChanges",
                    						lv_listOfChanges_14_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfChanges");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_15());
            		

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


    // $ANTLR start "entryRulelistOfChanges"
    // InternalSedml.g:3373:1: entryRulelistOfChanges returns [EObject current=null] : iv_rulelistOfChanges= rulelistOfChanges EOF ;
    public final EObject entryRulelistOfChanges() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfChanges = null;


        try {
            // InternalSedml.g:3373:54: (iv_rulelistOfChanges= rulelistOfChanges EOF )
            // InternalSedml.g:3374:2: iv_rulelistOfChanges= rulelistOfChanges EOF
            {
             newCompositeNode(grammarAccess.getListOfChangesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfChanges=rulelistOfChanges();

            state._fsp--;

             current =iv_rulelistOfChanges; 
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
    // $ANTLR end "entryRulelistOfChanges"


    // $ANTLR start "rulelistOfChanges"
    // InternalSedml.g:3380:1: rulelistOfChanges returns [EObject current=null] : (otherlv_0= 'listOfChanges' otherlv_1= '{' ( (lv_change_2_0= rulechange ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfChanges() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_change_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:3386:2: ( (otherlv_0= 'listOfChanges' otherlv_1= '{' ( (lv_change_2_0= rulechange ) )* otherlv_3= '}' ) )
            // InternalSedml.g:3387:2: (otherlv_0= 'listOfChanges' otherlv_1= '{' ( (lv_change_2_0= rulechange ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:3387:2: (otherlv_0= 'listOfChanges' otherlv_1= '{' ( (lv_change_2_0= rulechange ) )* otherlv_3= '}' )
            // InternalSedml.g:3388:3: otherlv_0= 'listOfChanges' otherlv_1= '{' ( (lv_change_2_0= rulechange ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfChangesAccess().getListOfChangesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_93); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfChangesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:3396:3: ( (lv_change_2_0= rulechange ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==12) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalSedml.g:3397:4: (lv_change_2_0= rulechange )
            	    {
            	    // InternalSedml.g:3397:4: (lv_change_2_0= rulechange )
            	    // InternalSedml.g:3398:5: lv_change_2_0= rulechange
            	    {

            	    					newCompositeNode(grammarAccess.getListOfChangesAccess().getChangeChangeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_93);
            	    lv_change_2_0=rulechange();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfChangesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"change",
            	    						lv_change_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.change");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfChangesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfChanges"


    // $ANTLR start "entryRuledataGenerator"
    // InternalSedml.g:3423:1: entryRuledataGenerator returns [EObject current=null] : iv_ruledataGenerator= ruledataGenerator EOF ;
    public final EObject entryRuledataGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledataGenerator = null;


        try {
            // InternalSedml.g:3423:54: (iv_ruledataGenerator= ruledataGenerator EOF )
            // InternalSedml.g:3424:2: iv_ruledataGenerator= ruledataGenerator EOF
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
    // InternalSedml.g:3430:1: ruledataGenerator returns [EObject current=null] : (otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfVariables_8_0= rulelistOfVariables ) )? ( (lv_listOfParameters_9_0= rulelistOfParameters ) )? ( (lv_math_10_0= rulemath ) )? otherlv_11= '}' ) ;
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
        Token otherlv_11=null;
        EObject lv_listOfVariables_8_0 = null;

        EObject lv_listOfParameters_9_0 = null;

        EObject lv_math_10_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:3436:2: ( (otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfVariables_8_0= rulelistOfVariables ) )? ( (lv_listOfParameters_9_0= rulelistOfParameters ) )? ( (lv_math_10_0= rulemath ) )? otherlv_11= '}' ) )
            // InternalSedml.g:3437:2: (otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfVariables_8_0= rulelistOfVariables ) )? ( (lv_listOfParameters_9_0= rulelistOfParameters ) )? ( (lv_math_10_0= rulemath ) )? otherlv_11= '}' )
            {
            // InternalSedml.g:3437:2: (otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfVariables_8_0= rulelistOfVariables ) )? ( (lv_listOfParameters_9_0= rulelistOfParameters ) )? ( (lv_math_10_0= rulemath ) )? otherlv_11= '}' )
            // InternalSedml.g:3438:3: otherlv_0= 'dataGenerator' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfVariables_8_0= rulelistOfVariables ) )? ( (lv_listOfParameters_9_0= rulelistOfParameters ) )? ( (lv_math_10_0= rulemath ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataGeneratorAccess().getDataGeneratorKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getDataGeneratorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDataGeneratorAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getDataGeneratorAccess().getColonKeyword_3());
            		
            // InternalSedml.g:3454:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:3455:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:3455:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:3456:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            otherlv_5=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDataGeneratorAccess().getNameKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDataGeneratorAccess().getColonKeyword_6());
            		
            // InternalSedml.g:3480:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalSedml.g:3481:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalSedml.g:3481:4: (lv_name_7_0= RULE_STRING )
            // InternalSedml.g:3482:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_94); 

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

            // InternalSedml.g:3498:3: ( (lv_listOfVariables_8_0= rulelistOfVariables ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==87) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalSedml.g:3499:4: (lv_listOfVariables_8_0= rulelistOfVariables )
                    {
                    // InternalSedml.g:3499:4: (lv_listOfVariables_8_0= rulelistOfVariables )
                    // InternalSedml.g:3500:5: lv_listOfVariables_8_0= rulelistOfVariables
                    {

                    					newCompositeNode(grammarAccess.getDataGeneratorAccess().getListOfVariablesListOfVariablesParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_95);
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

            // InternalSedml.g:3517:3: ( (lv_listOfParameters_9_0= rulelistOfParameters ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==85) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSedml.g:3518:4: (lv_listOfParameters_9_0= rulelistOfParameters )
                    {
                    // InternalSedml.g:3518:4: (lv_listOfParameters_9_0= rulelistOfParameters )
                    // InternalSedml.g:3519:5: lv_listOfParameters_9_0= rulelistOfParameters
                    {

                    					newCompositeNode(grammarAccess.getDataGeneratorAccess().getListOfParametersListOfParametersParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_96);
                    lv_listOfParameters_9_0=rulelistOfParameters();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataGeneratorRule());
                    					}
                    					set(
                    						current,
                    						"listOfParameters",
                    						lv_listOfParameters_9_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfParameters");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:3536:3: ( (lv_math_10_0= rulemath ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==20) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSedml.g:3537:4: (lv_math_10_0= rulemath )
                    {
                    // InternalSedml.g:3537:4: (lv_math_10_0= rulemath )
                    // InternalSedml.g:3538:5: lv_math_10_0= rulemath
                    {

                    					newCompositeNode(grammarAccess.getDataGeneratorAccess().getMathMathParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_math_10_0=rulemath();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataGeneratorRule());
                    					}
                    					set(
                    						current,
                    						"math",
                    						lv_math_10_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.math");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDataGeneratorAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRulelistOfParameters"
    // InternalSedml.g:3563:1: entryRulelistOfParameters returns [EObject current=null] : iv_rulelistOfParameters= rulelistOfParameters EOF ;
    public final EObject entryRulelistOfParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfParameters = null;


        try {
            // InternalSedml.g:3563:57: (iv_rulelistOfParameters= rulelistOfParameters EOF )
            // InternalSedml.g:3564:2: iv_rulelistOfParameters= rulelistOfParameters EOF
            {
             newCompositeNode(grammarAccess.getListOfParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfParameters=rulelistOfParameters();

            state._fsp--;

             current =iv_rulelistOfParameters; 
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
    // $ANTLR end "entryRulelistOfParameters"


    // $ANTLR start "rulelistOfParameters"
    // InternalSedml.g:3570:1: rulelistOfParameters returns [EObject current=null] : (otherlv_0= 'listOfParameters' otherlv_1= '{' ( (lv_parameter_2_0= ruleparameter ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameter_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:3576:2: ( (otherlv_0= 'listOfParameters' otherlv_1= '{' ( (lv_parameter_2_0= ruleparameter ) )* otherlv_3= '}' ) )
            // InternalSedml.g:3577:2: (otherlv_0= 'listOfParameters' otherlv_1= '{' ( (lv_parameter_2_0= ruleparameter ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:3577:2: (otherlv_0= 'listOfParameters' otherlv_1= '{' ( (lv_parameter_2_0= ruleparameter ) )* otherlv_3= '}' )
            // InternalSedml.g:3578:3: otherlv_0= 'listOfParameters' otherlv_1= '{' ( (lv_parameter_2_0= ruleparameter ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfParametersAccess().getListOfParametersKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_97); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfParametersAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:3586:3: ( (lv_parameter_2_0= ruleparameter ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==86) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalSedml.g:3587:4: (lv_parameter_2_0= ruleparameter )
            	    {
            	    // InternalSedml.g:3587:4: (lv_parameter_2_0= ruleparameter )
            	    // InternalSedml.g:3588:5: lv_parameter_2_0= ruleparameter
            	    {

            	    					newCompositeNode(grammarAccess.getListOfParametersAccess().getParameterParameterParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_97);
            	    lv_parameter_2_0=ruleparameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfParametersRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameter",
            	    						lv_parameter_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfParametersAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfParameters"


    // $ANTLR start "entryRuleparameter"
    // InternalSedml.g:3613:1: entryRuleparameter returns [EObject current=null] : iv_ruleparameter= ruleparameter EOF ;
    public final EObject entryRuleparameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter = null;


        try {
            // InternalSedml.g:3613:50: (iv_ruleparameter= ruleparameter EOF )
            // InternalSedml.g:3614:2: iv_ruleparameter= ruleparameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameter=ruleparameter();

            state._fsp--;

             current =iv_ruleparameter; 
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
    // $ANTLR end "entryRuleparameter"


    // $ANTLR start "ruleparameter"
    // InternalSedml.g:3620:1: ruleparameter returns [EObject current=null] : (otherlv_0= 'parameter' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleDOUBLE ) ) otherlv_11= '}' ) ;
    public final EObject ruleparameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_value_10_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:3626:2: ( (otherlv_0= 'parameter' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleDOUBLE ) ) otherlv_11= '}' ) )
            // InternalSedml.g:3627:2: (otherlv_0= 'parameter' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleDOUBLE ) ) otherlv_11= '}' )
            {
            // InternalSedml.g:3627:2: (otherlv_0= 'parameter' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleDOUBLE ) ) otherlv_11= '}' )
            // InternalSedml.g:3628:3: otherlv_0= 'parameter' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleDOUBLE ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getColonKeyword_3());
            		
            // InternalSedml.g:3644:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:3645:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:3645:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:3646:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_id_4_0, grammarAccess.getParameterAccess().getIdIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getNameKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getColonKeyword_6());
            		
            // InternalSedml.g:3670:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalSedml.g:3671:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalSedml.g:3671:4: (lv_name_7_0= RULE_STRING )
            // InternalSedml.g:3672:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_name_7_0, grammarAccess.getParameterAccess().getNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getValueKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_98); 

            			newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getColonKeyword_9());
            		
            // InternalSedml.g:3696:3: ( (lv_value_10_0= ruleDOUBLE ) )
            // InternalSedml.g:3697:4: (lv_value_10_0= ruleDOUBLE )
            {
            // InternalSedml.g:3697:4: (lv_value_10_0= ruleDOUBLE )
            // InternalSedml.g:3698:5: lv_value_10_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getValueDOUBLEParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_10_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_10_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleparameter"


    // $ANTLR start "entryRulelistOfVariables"
    // InternalSedml.g:3723:1: entryRulelistOfVariables returns [EObject current=null] : iv_rulelistOfVariables= rulelistOfVariables EOF ;
    public final EObject entryRulelistOfVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfVariables = null;


        try {
            // InternalSedml.g:3723:56: (iv_rulelistOfVariables= rulelistOfVariables EOF )
            // InternalSedml.g:3724:2: iv_rulelistOfVariables= rulelistOfVariables EOF
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
    // InternalSedml.g:3730:1: rulelistOfVariables returns [EObject current=null] : (otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:3736:2: ( (otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}' ) )
            // InternalSedml.g:3737:2: (otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:3737:2: (otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}' )
            // InternalSedml.g:3738:3: otherlv_0= 'listOfDataVariables' otherlv_1= '{' ( (lv_variable_2_0= rulevariable ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfVariablesAccess().getListOfDataVariablesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_99); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfVariablesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:3746:3: ( (lv_variable_2_0= rulevariable ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==88) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalSedml.g:3747:4: (lv_variable_2_0= rulevariable )
            	    {
            	    // InternalSedml.g:3747:4: (lv_variable_2_0= rulevariable )
            	    // InternalSedml.g:3748:5: lv_variable_2_0= rulevariable
            	    {

            	    					newCompositeNode(grammarAccess.getListOfVariablesAccess().getVariableVariableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_99);
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
            	    break loop73;
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
    // InternalSedml.g:3773:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalSedml.g:3773:49: (iv_rulevariable= rulevariable EOF )
            // InternalSedml.g:3774:2: iv_rulevariable= rulevariable EOF
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
    // InternalSedml.g:3780:1: rulevariable returns [EObject current=null] : (otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= RULE_STRING ) ) otherlv_11= 'taskReference' otherlv_12= ':' ( (lv_taskReference_13_0= ruletask ) ) otherlv_14= 'modelReference' otherlv_15= ':' ( (lv_modelReference_16_0= rulemodel ) ) otherlv_17= 'symbol' otherlv_18= ':' ( (lv_symbol_19_0= RULE_STRING ) ) otherlv_20= '}' ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_target_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_symbol_19_0=null;
        Token otherlv_20=null;
        EObject lv_taskReference_13_0 = null;

        EObject lv_modelReference_16_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:3786:2: ( (otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= RULE_STRING ) ) otherlv_11= 'taskReference' otherlv_12= ':' ( (lv_taskReference_13_0= ruletask ) ) otherlv_14= 'modelReference' otherlv_15= ':' ( (lv_modelReference_16_0= rulemodel ) ) otherlv_17= 'symbol' otherlv_18= ':' ( (lv_symbol_19_0= RULE_STRING ) ) otherlv_20= '}' ) )
            // InternalSedml.g:3787:2: (otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= RULE_STRING ) ) otherlv_11= 'taskReference' otherlv_12= ':' ( (lv_taskReference_13_0= ruletask ) ) otherlv_14= 'modelReference' otherlv_15= ':' ( (lv_modelReference_16_0= rulemodel ) ) otherlv_17= 'symbol' otherlv_18= ':' ( (lv_symbol_19_0= RULE_STRING ) ) otherlv_20= '}' )
            {
            // InternalSedml.g:3787:2: (otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= RULE_STRING ) ) otherlv_11= 'taskReference' otherlv_12= ':' ( (lv_taskReference_13_0= ruletask ) ) otherlv_14= 'modelReference' otherlv_15= ':' ( (lv_modelReference_16_0= rulemodel ) ) otherlv_17= 'symbol' otherlv_18= ':' ( (lv_symbol_19_0= RULE_STRING ) ) otherlv_20= '}' )
            // InternalSedml.g:3788:3: otherlv_0= 'variable' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= RULE_STRING ) ) otherlv_11= 'taskReference' otherlv_12= ':' ( (lv_taskReference_13_0= ruletask ) ) otherlv_14= 'modelReference' otherlv_15= ':' ( (lv_modelReference_16_0= rulemodel ) ) otherlv_17= 'symbol' otherlv_18= ':' ( (lv_symbol_19_0= RULE_STRING ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getColonKeyword_3());
            		
            // InternalSedml.g:3804:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:3805:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:3805:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:3806:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            otherlv_5=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getNameKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getColonKeyword_6());
            		
            // InternalSedml.g:3830:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalSedml.g:3831:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalSedml.g:3831:4: (lv_name_7_0= RULE_STRING )
            // InternalSedml.g:3832:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_100); 

            					newLeafNode(lv_name_7_0, grammarAccess.getVariableAccess().getNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,89,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getTargetKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getColonKeyword_9());
            		
            // InternalSedml.g:3856:3: ( (lv_target_10_0= RULE_STRING ) )
            // InternalSedml.g:3857:4: (lv_target_10_0= RULE_STRING )
            {
            // InternalSedml.g:3857:4: (lv_target_10_0= RULE_STRING )
            // InternalSedml.g:3858:5: lv_target_10_0= RULE_STRING
            {
            lv_target_10_0=(Token)match(input,RULE_STRING,FOLLOW_101); 

            					newLeafNode(lv_target_10_0, grammarAccess.getVariableAccess().getTargetSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,90,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getVariableAccess().getTaskReferenceKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_102); 

            			newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getColonKeyword_12());
            		
            // InternalSedml.g:3882:3: ( (lv_taskReference_13_0= ruletask ) )
            // InternalSedml.g:3883:4: (lv_taskReference_13_0= ruletask )
            {
            // InternalSedml.g:3883:4: (lv_taskReference_13_0= ruletask )
            // InternalSedml.g:3884:5: lv_taskReference_13_0= ruletask
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTaskReferenceTaskParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_103);
            lv_taskReference_13_0=ruletask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"taskReference",
            						lv_taskReference_13_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.task");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,91,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getVariableAccess().getModelReferenceKeyword_14());
            		
            otherlv_15=(Token)match(input,18,FOLLOW_43); 

            			newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getColonKeyword_15());
            		
            // InternalSedml.g:3909:3: ( (lv_modelReference_16_0= rulemodel ) )
            // InternalSedml.g:3910:4: (lv_modelReference_16_0= rulemodel )
            {
            // InternalSedml.g:3910:4: (lv_modelReference_16_0= rulemodel )
            // InternalSedml.g:3911:5: lv_modelReference_16_0= rulemodel
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getModelReferenceModelParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_104);
            lv_modelReference_16_0=rulemodel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"modelReference",
            						lv_modelReference_16_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.model");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,92,FOLLOW_6); 

            			newLeafNode(otherlv_17, grammarAccess.getVariableAccess().getSymbolKeyword_17());
            		
            otherlv_18=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getVariableAccess().getColonKeyword_18());
            		
            // InternalSedml.g:3936:3: ( (lv_symbol_19_0= RULE_STRING ) )
            // InternalSedml.g:3937:4: (lv_symbol_19_0= RULE_STRING )
            {
            // InternalSedml.g:3937:4: (lv_symbol_19_0= RULE_STRING )
            // InternalSedml.g:3938:5: lv_symbol_19_0= RULE_STRING
            {
            lv_symbol_19_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_symbol_19_0, grammarAccess.getVariableAccess().getSymbolSTRINGTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"symbol",
            						lv_symbol_19_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_20=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_20());
            		

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
    // InternalSedml.g:3962:1: entryRulelistOfTasks returns [EObject current=null] : iv_rulelistOfTasks= rulelistOfTasks EOF ;
    public final EObject entryRulelistOfTasks() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfTasks = null;


        try {
            // InternalSedml.g:3962:52: (iv_rulelistOfTasks= rulelistOfTasks EOF )
            // InternalSedml.g:3963:2: iv_rulelistOfTasks= rulelistOfTasks EOF
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
    // InternalSedml.g:3969:1: rulelistOfTasks returns [EObject current=null] : (otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* ( (lv_RepeatedTask_3_0= rulerepeatedTask ) )* otherlv_4= '}' ) ;
    public final EObject rulelistOfTasks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_task_2_0 = null;

        EObject lv_RepeatedTask_3_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:3975:2: ( (otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* ( (lv_RepeatedTask_3_0= rulerepeatedTask ) )* otherlv_4= '}' ) )
            // InternalSedml.g:3976:2: (otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* ( (lv_RepeatedTask_3_0= rulerepeatedTask ) )* otherlv_4= '}' )
            {
            // InternalSedml.g:3976:2: (otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* ( (lv_RepeatedTask_3_0= rulerepeatedTask ) )* otherlv_4= '}' )
            // InternalSedml.g:3977:3: otherlv_0= 'listOfTasks' otherlv_1= '{' ( (lv_task_2_0= ruletask ) )* ( (lv_RepeatedTask_3_0= rulerepeatedTask ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfTasksAccess().getListOfTasksKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_105); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfTasksAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:3985:3: ( (lv_task_2_0= ruletask ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==105) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalSedml.g:3986:4: (lv_task_2_0= ruletask )
            	    {
            	    // InternalSedml.g:3986:4: (lv_task_2_0= ruletask )
            	    // InternalSedml.g:3987:5: lv_task_2_0= ruletask
            	    {

            	    					newCompositeNode(grammarAccess.getListOfTasksAccess().getTaskTaskParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_105);
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
            	    break loop74;
                }
            } while (true);

            // InternalSedml.g:4004:3: ( (lv_RepeatedTask_3_0= rulerepeatedTask ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==94) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalSedml.g:4005:4: (lv_RepeatedTask_3_0= rulerepeatedTask )
            	    {
            	    // InternalSedml.g:4005:4: (lv_RepeatedTask_3_0= rulerepeatedTask )
            	    // InternalSedml.g:4006:5: lv_RepeatedTask_3_0= rulerepeatedTask
            	    {

            	    					newCompositeNode(grammarAccess.getListOfTasksAccess().getRepeatedTaskRepeatedTaskParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_106);
            	    lv_RepeatedTask_3_0=rulerepeatedTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfTasksRule());
            	    					}
            	    					add(
            	    						current,
            	    						"RepeatedTask",
            	    						lv_RepeatedTask_3_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.repeatedTask");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getListOfTasksAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRulerepeatedTask"
    // InternalSedml.g:4031:1: entryRulerepeatedTask returns [EObject current=null] : iv_rulerepeatedTask= rulerepeatedTask EOF ;
    public final EObject entryRulerepeatedTask() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepeatedTask = null;


        try {
            // InternalSedml.g:4031:53: (iv_rulerepeatedTask= rulerepeatedTask EOF )
            // InternalSedml.g:4032:2: iv_rulerepeatedTask= rulerepeatedTask EOF
            {
             newCompositeNode(grammarAccess.getRepeatedTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerepeatedTask=rulerepeatedTask();

            state._fsp--;

             current =iv_rulerepeatedTask; 
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
    // $ANTLR end "entryRulerepeatedTask"


    // $ANTLR start "rulerepeatedTask"
    // InternalSedml.g:4038:1: rulerepeatedTask returns [EObject current=null] : (otherlv_0= 'listOfRepeatedTasks' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_subTask_8_0= rulesubTask ) )* ( (lv_listOfRanges_9_0= rulelistOfRanges ) ) ( (lv_listOfChanges_10_0= rulelistOfChanges ) )? otherlv_11= '}' ) ;
    public final EObject rulerepeatedTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_11=null;
        EObject lv_subTask_8_0 = null;

        EObject lv_listOfRanges_9_0 = null;

        EObject lv_listOfChanges_10_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:4044:2: ( (otherlv_0= 'listOfRepeatedTasks' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_subTask_8_0= rulesubTask ) )* ( (lv_listOfRanges_9_0= rulelistOfRanges ) ) ( (lv_listOfChanges_10_0= rulelistOfChanges ) )? otherlv_11= '}' ) )
            // InternalSedml.g:4045:2: (otherlv_0= 'listOfRepeatedTasks' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_subTask_8_0= rulesubTask ) )* ( (lv_listOfRanges_9_0= rulelistOfRanges ) ) ( (lv_listOfChanges_10_0= rulelistOfChanges ) )? otherlv_11= '}' )
            {
            // InternalSedml.g:4045:2: (otherlv_0= 'listOfRepeatedTasks' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_subTask_8_0= rulesubTask ) )* ( (lv_listOfRanges_9_0= rulelistOfRanges ) ) ( (lv_listOfChanges_10_0= rulelistOfChanges ) )? otherlv_11= '}' )
            // InternalSedml.g:4046:3: otherlv_0= 'listOfRepeatedTasks' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_subTask_8_0= rulesubTask ) )* ( (lv_listOfRanges_9_0= rulelistOfRanges ) ) ( (lv_listOfChanges_10_0= rulelistOfChanges ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatedTaskAccess().getListOfRepeatedTasksKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getRepeatedTaskAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatedTaskAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getRepeatedTaskAccess().getColonKeyword_3());
            		
            // InternalSedml.g:4062:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:4063:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:4063:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:4064:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_id_4_0, grammarAccess.getRepeatedTaskAccess().getIdIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepeatedTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getRepeatedTaskAccess().getNameKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getRepeatedTaskAccess().getColonKeyword_6());
            		
            // InternalSedml.g:4088:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalSedml.g:4089:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalSedml.g:4089:4: (lv_name_7_0= RULE_STRING )
            // InternalSedml.g:4090:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_107); 

            					newLeafNode(lv_name_7_0, grammarAccess.getRepeatedTaskAccess().getNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepeatedTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSedml.g:4106:3: ( (lv_subTask_8_0= rulesubTask ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==104) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalSedml.g:4107:4: (lv_subTask_8_0= rulesubTask )
            	    {
            	    // InternalSedml.g:4107:4: (lv_subTask_8_0= rulesubTask )
            	    // InternalSedml.g:4108:5: lv_subTask_8_0= rulesubTask
            	    {

            	    					newCompositeNode(grammarAccess.getRepeatedTaskAccess().getSubTaskSubTaskParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_107);
            	    lv_subTask_8_0=rulesubTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepeatedTaskRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subTask",
            	    						lv_subTask_8_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.subTask");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            // InternalSedml.g:4125:3: ( (lv_listOfRanges_9_0= rulelistOfRanges ) )
            // InternalSedml.g:4126:4: (lv_listOfRanges_9_0= rulelistOfRanges )
            {
            // InternalSedml.g:4126:4: (lv_listOfRanges_9_0= rulelistOfRanges )
            // InternalSedml.g:4127:5: lv_listOfRanges_9_0= rulelistOfRanges
            {

            					newCompositeNode(grammarAccess.getRepeatedTaskAccess().getListOfRangesListOfRangesParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_92);
            lv_listOfRanges_9_0=rulelistOfRanges();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatedTaskRule());
            					}
            					set(
            						current,
            						"listOfRanges",
            						lv_listOfRanges_9_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfRanges");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSedml.g:4144:3: ( (lv_listOfChanges_10_0= rulelistOfChanges ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==83) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalSedml.g:4145:4: (lv_listOfChanges_10_0= rulelistOfChanges )
                    {
                    // InternalSedml.g:4145:4: (lv_listOfChanges_10_0= rulelistOfChanges )
                    // InternalSedml.g:4146:5: lv_listOfChanges_10_0= rulelistOfChanges
                    {

                    					newCompositeNode(grammarAccess.getRepeatedTaskAccess().getListOfChangesListOfChangesParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_listOfChanges_10_0=rulelistOfChanges();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepeatedTaskRule());
                    					}
                    					set(
                    						current,
                    						"listOfChanges",
                    						lv_listOfChanges_10_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfChanges");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getRepeatedTaskAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "rulerepeatedTask"


    // $ANTLR start "entryRulelistOfRanges"
    // InternalSedml.g:4171:1: entryRulelistOfRanges returns [EObject current=null] : iv_rulelistOfRanges= rulelistOfRanges EOF ;
    public final EObject entryRulelistOfRanges() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfRanges = null;


        try {
            // InternalSedml.g:4171:53: (iv_rulelistOfRanges= rulelistOfRanges EOF )
            // InternalSedml.g:4172:2: iv_rulelistOfRanges= rulelistOfRanges EOF
            {
             newCompositeNode(grammarAccess.getListOfRangesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfRanges=rulelistOfRanges();

            state._fsp--;

             current =iv_rulelistOfRanges; 
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
    // $ANTLR end "entryRulelistOfRanges"


    // $ANTLR start "rulelistOfRanges"
    // InternalSedml.g:4178:1: rulelistOfRanges returns [EObject current=null] : (otherlv_0= 'listOfRanges' otherlv_1= '{' ( (lv_range_2_0= rulerange ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfRanges() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_range_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:4184:2: ( (otherlv_0= 'listOfRanges' otherlv_1= '{' ( (lv_range_2_0= rulerange ) )* otherlv_3= '}' ) )
            // InternalSedml.g:4185:2: (otherlv_0= 'listOfRanges' otherlv_1= '{' ( (lv_range_2_0= rulerange ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:4185:2: (otherlv_0= 'listOfRanges' otherlv_1= '{' ( (lv_range_2_0= rulerange ) )* otherlv_3= '}' )
            // InternalSedml.g:4186:3: otherlv_0= 'listOfRanges' otherlv_1= '{' ( (lv_range_2_0= rulerange ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,95,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfRangesAccess().getListOfRangesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_108); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfRangesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:4194:3: ( (lv_range_2_0= rulerange ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==96||LA78_0==100||LA78_0==102) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalSedml.g:4195:4: (lv_range_2_0= rulerange )
            	    {
            	    // InternalSedml.g:4195:4: (lv_range_2_0= rulerange )
            	    // InternalSedml.g:4196:5: lv_range_2_0= rulerange
            	    {

            	    					newCompositeNode(grammarAccess.getListOfRangesAccess().getRangeRangeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_108);
            	    lv_range_2_0=rulerange();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfRangesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"range",
            	    						lv_range_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.range");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfRangesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfRanges"


    // $ANTLR start "entryRulerange"
    // InternalSedml.g:4221:1: entryRulerange returns [EObject current=null] : iv_rulerange= rulerange EOF ;
    public final EObject entryRulerange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerange = null;


        try {
            // InternalSedml.g:4221:46: (iv_rulerange= rulerange EOF )
            // InternalSedml.g:4222:2: iv_rulerange= rulerange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerange=rulerange();

            state._fsp--;

             current =iv_rulerange; 
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
    // $ANTLR end "entryRulerange"


    // $ANTLR start "rulerange"
    // InternalSedml.g:4228:1: rulerange returns [EObject current=null] : (this_uniformRange_0= ruleuniformRange | this_vectorRange_1= rulevectorRange | (this_functionalRange_2= rulefunctionalRange otherlv_3= 'id' otherlv_4= ':' ( (lv_id_5_0= RULE_ID ) ) ) ) ;
    public final EObject rulerange() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        EObject this_uniformRange_0 = null;

        EObject this_vectorRange_1 = null;

        EObject this_functionalRange_2 = null;



        	enterRule();

        try {
            // InternalSedml.g:4234:2: ( (this_uniformRange_0= ruleuniformRange | this_vectorRange_1= rulevectorRange | (this_functionalRange_2= rulefunctionalRange otherlv_3= 'id' otherlv_4= ':' ( (lv_id_5_0= RULE_ID ) ) ) ) )
            // InternalSedml.g:4235:2: (this_uniformRange_0= ruleuniformRange | this_vectorRange_1= rulevectorRange | (this_functionalRange_2= rulefunctionalRange otherlv_3= 'id' otherlv_4= ':' ( (lv_id_5_0= RULE_ID ) ) ) )
            {
            // InternalSedml.g:4235:2: (this_uniformRange_0= ruleuniformRange | this_vectorRange_1= rulevectorRange | (this_functionalRange_2= rulefunctionalRange otherlv_3= 'id' otherlv_4= ':' ( (lv_id_5_0= RULE_ID ) ) ) )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt79=1;
                }
                break;
            case 100:
                {
                alt79=2;
                }
                break;
            case 102:
                {
                alt79=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalSedml.g:4236:3: this_uniformRange_0= ruleuniformRange
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getUniformRangeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_uniformRange_0=ruleuniformRange();

                    state._fsp--;


                    			current = this_uniformRange_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSedml.g:4245:3: this_vectorRange_1= rulevectorRange
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getVectorRangeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_vectorRange_1=rulevectorRange();

                    state._fsp--;


                    			current = this_vectorRange_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSedml.g:4254:3: (this_functionalRange_2= rulefunctionalRange otherlv_3= 'id' otherlv_4= ':' ( (lv_id_5_0= RULE_ID ) ) )
                    {
                    // InternalSedml.g:4254:3: (this_functionalRange_2= rulefunctionalRange otherlv_3= 'id' otherlv_4= ':' ( (lv_id_5_0= RULE_ID ) ) )
                    // InternalSedml.g:4255:4: this_functionalRange_2= rulefunctionalRange otherlv_3= 'id' otherlv_4= ':' ( (lv_id_5_0= RULE_ID ) )
                    {

                    				newCompositeNode(grammarAccess.getRangeAccess().getFunctionalRangeParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_23);
                    this_functionalRange_2=rulefunctionalRange();

                    state._fsp--;


                    				current = this_functionalRange_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getRangeAccess().getIdKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getColonKeyword_2_2());
                    			
                    // InternalSedml.g:4271:4: ( (lv_id_5_0= RULE_ID ) )
                    // InternalSedml.g:4272:5: (lv_id_5_0= RULE_ID )
                    {
                    // InternalSedml.g:4272:5: (lv_id_5_0= RULE_ID )
                    // InternalSedml.g:4273:6: lv_id_5_0= RULE_ID
                    {
                    lv_id_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_id_5_0, grammarAccess.getRangeAccess().getIdIDTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


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
    // $ANTLR end "rulerange"


    // $ANTLR start "entryRuleuniformRange"
    // InternalSedml.g:4294:1: entryRuleuniformRange returns [EObject current=null] : iv_ruleuniformRange= ruleuniformRange EOF ;
    public final EObject entryRuleuniformRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuniformRange = null;


        try {
            // InternalSedml.g:4294:53: (iv_ruleuniformRange= ruleuniformRange EOF )
            // InternalSedml.g:4295:2: iv_ruleuniformRange= ruleuniformRange EOF
            {
             newCompositeNode(grammarAccess.getUniformRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuniformRange=ruleuniformRange();

            state._fsp--;

             current =iv_ruleuniformRange; 
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
    // $ANTLR end "entryRuleuniformRange"


    // $ANTLR start "ruleuniformRange"
    // InternalSedml.g:4301:1: ruleuniformRange returns [EObject current=null] : (otherlv_0= 'uniformRange' otherlv_1= '{' otherlv_2= 'start' otherlv_3= ':' ( (lv_start_4_0= ruleDOUBLE ) ) otherlv_5= 'end' otherlv_6= ':' ( (lv_end_7_0= ruleDOUBLE ) ) otherlv_8= 'end' otherlv_9= ':' ( (lv_numberOfPoints_10_0= RULE_INT ) ) otherlv_11= 'type' otherlv_12= ':' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}' ) ;
    public final EObject ruleuniformRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_numberOfPoints_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_type_13_0=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_start_4_0 = null;

        AntlrDatatypeRuleToken lv_end_7_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:4307:2: ( (otherlv_0= 'uniformRange' otherlv_1= '{' otherlv_2= 'start' otherlv_3= ':' ( (lv_start_4_0= ruleDOUBLE ) ) otherlv_5= 'end' otherlv_6= ':' ( (lv_end_7_0= ruleDOUBLE ) ) otherlv_8= 'end' otherlv_9= ':' ( (lv_numberOfPoints_10_0= RULE_INT ) ) otherlv_11= 'type' otherlv_12= ':' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}' ) )
            // InternalSedml.g:4308:2: (otherlv_0= 'uniformRange' otherlv_1= '{' otherlv_2= 'start' otherlv_3= ':' ( (lv_start_4_0= ruleDOUBLE ) ) otherlv_5= 'end' otherlv_6= ':' ( (lv_end_7_0= ruleDOUBLE ) ) otherlv_8= 'end' otherlv_9= ':' ( (lv_numberOfPoints_10_0= RULE_INT ) ) otherlv_11= 'type' otherlv_12= ':' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}' )
            {
            // InternalSedml.g:4308:2: (otherlv_0= 'uniformRange' otherlv_1= '{' otherlv_2= 'start' otherlv_3= ':' ( (lv_start_4_0= ruleDOUBLE ) ) otherlv_5= 'end' otherlv_6= ':' ( (lv_end_7_0= ruleDOUBLE ) ) otherlv_8= 'end' otherlv_9= ':' ( (lv_numberOfPoints_10_0= RULE_INT ) ) otherlv_11= 'type' otherlv_12= ':' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}' )
            // InternalSedml.g:4309:3: otherlv_0= 'uniformRange' otherlv_1= '{' otherlv_2= 'start' otherlv_3= ':' ( (lv_start_4_0= ruleDOUBLE ) ) otherlv_5= 'end' otherlv_6= ':' ( (lv_end_7_0= ruleDOUBLE ) ) otherlv_8= 'end' otherlv_9= ':' ( (lv_numberOfPoints_10_0= RULE_INT ) ) otherlv_11= 'type' otherlv_12= ':' ( (lv_type_13_0= RULE_STRING ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUniformRangeAccess().getUniformRangeKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_109); 

            			newLeafNode(otherlv_1, grammarAccess.getUniformRangeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,97,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUniformRangeAccess().getStartKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_110); 

            			newLeafNode(otherlv_3, grammarAccess.getUniformRangeAccess().getColonKeyword_3());
            		
            // InternalSedml.g:4325:3: ( (lv_start_4_0= ruleDOUBLE ) )
            // InternalSedml.g:4326:4: (lv_start_4_0= ruleDOUBLE )
            {
            // InternalSedml.g:4326:4: (lv_start_4_0= ruleDOUBLE )
            // InternalSedml.g:4327:5: lv_start_4_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getUniformRangeAccess().getStartDOUBLEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_111);
            lv_start_4_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniformRangeRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_4_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,98,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getUniformRangeAccess().getEndKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_110); 

            			newLeafNode(otherlv_6, grammarAccess.getUniformRangeAccess().getColonKeyword_6());
            		
            // InternalSedml.g:4352:3: ( (lv_end_7_0= ruleDOUBLE ) )
            // InternalSedml.g:4353:4: (lv_end_7_0= ruleDOUBLE )
            {
            // InternalSedml.g:4353:4: (lv_end_7_0= ruleDOUBLE )
            // InternalSedml.g:4354:5: lv_end_7_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getUniformRangeAccess().getEndDOUBLEParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_111);
            lv_end_7_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniformRangeRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_7_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,98,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getUniformRangeAccess().getEndKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getUniformRangeAccess().getColonKeyword_9());
            		
            // InternalSedml.g:4379:3: ( (lv_numberOfPoints_10_0= RULE_INT ) )
            // InternalSedml.g:4380:4: (lv_numberOfPoints_10_0= RULE_INT )
            {
            // InternalSedml.g:4380:4: (lv_numberOfPoints_10_0= RULE_INT )
            // InternalSedml.g:4381:5: lv_numberOfPoints_10_0= RULE_INT
            {
            lv_numberOfPoints_10_0=(Token)match(input,RULE_INT,FOLLOW_112); 

            					newLeafNode(lv_numberOfPoints_10_0, grammarAccess.getUniformRangeAccess().getNumberOfPointsINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniformRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numberOfPoints",
            						lv_numberOfPoints_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,99,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getUniformRangeAccess().getTypeKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getUniformRangeAccess().getColonKeyword_12());
            		
            // InternalSedml.g:4405:3: ( (lv_type_13_0= RULE_STRING ) )
            // InternalSedml.g:4406:4: (lv_type_13_0= RULE_STRING )
            {
            // InternalSedml.g:4406:4: (lv_type_13_0= RULE_STRING )
            // InternalSedml.g:4407:5: lv_type_13_0= RULE_STRING
            {
            lv_type_13_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_type_13_0, grammarAccess.getUniformRangeAccess().getTypeSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniformRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getUniformRangeAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleuniformRange"


    // $ANTLR start "entryRulevectorRange"
    // InternalSedml.g:4431:1: entryRulevectorRange returns [EObject current=null] : iv_rulevectorRange= rulevectorRange EOF ;
    public final EObject entryRulevectorRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevectorRange = null;


        try {
            // InternalSedml.g:4431:52: (iv_rulevectorRange= rulevectorRange EOF )
            // InternalSedml.g:4432:2: iv_rulevectorRange= rulevectorRange EOF
            {
             newCompositeNode(grammarAccess.getVectorRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevectorRange=rulevectorRange();

            state._fsp--;

             current =iv_rulevectorRange; 
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
    // $ANTLR end "entryRulevectorRange"


    // $ANTLR start "rulevectorRange"
    // InternalSedml.g:4438:1: rulevectorRange returns [EObject current=null] : (otherlv_0= 'vectorRange' otherlv_1= '{' ( (lv_value_2_0= rulevalue ) )* otherlv_3= '}' ) ;
    public final EObject rulevectorRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:4444:2: ( (otherlv_0= 'vectorRange' otherlv_1= '{' ( (lv_value_2_0= rulevalue ) )* otherlv_3= '}' ) )
            // InternalSedml.g:4445:2: (otherlv_0= 'vectorRange' otherlv_1= '{' ( (lv_value_2_0= rulevalue ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:4445:2: (otherlv_0= 'vectorRange' otherlv_1= '{' ( (lv_value_2_0= rulevalue ) )* otherlv_3= '}' )
            // InternalSedml.g:4446:3: otherlv_0= 'vectorRange' otherlv_1= '{' ( (lv_value_2_0= rulevalue ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVectorRangeAccess().getVectorRangeKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_113); 

            			newLeafNode(otherlv_1, grammarAccess.getVectorRangeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:4454:3: ( (lv_value_2_0= rulevalue ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==39) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalSedml.g:4455:4: (lv_value_2_0= rulevalue )
            	    {
            	    // InternalSedml.g:4455:4: (lv_value_2_0= rulevalue )
            	    // InternalSedml.g:4456:5: lv_value_2_0= rulevalue
            	    {

            	    					newCompositeNode(grammarAccess.getVectorRangeAccess().getValueValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_113);
            	    lv_value_2_0=rulevalue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVectorRangeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"value",
            	    						lv_value_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getVectorRangeAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulevectorRange"


    // $ANTLR start "entryRulevalue"
    // InternalSedml.g:4481:1: entryRulevalue returns [EObject current=null] : iv_rulevalue= rulevalue EOF ;
    public final EObject entryRulevalue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue = null;


        try {
            // InternalSedml.g:4481:46: (iv_rulevalue= rulevalue EOF )
            // InternalSedml.g:4482:2: iv_rulevalue= rulevalue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevalue=rulevalue();

            state._fsp--;

             current =iv_rulevalue; 
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
    // $ANTLR end "entryRulevalue"


    // $ANTLR start "rulevalue"
    // InternalSedml.g:4488:1: rulevalue returns [EObject current=null] : (otherlv_0= 'value' otherlv_1= '{' otherlv_2= 'content' otherlv_3= ':' ( (lv_content_4_0= ruleDOUBLE ) ) otherlv_5= '}' ) ;
    public final EObject rulevalue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_content_4_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:4494:2: ( (otherlv_0= 'value' otherlv_1= '{' otherlv_2= 'content' otherlv_3= ':' ( (lv_content_4_0= ruleDOUBLE ) ) otherlv_5= '}' ) )
            // InternalSedml.g:4495:2: (otherlv_0= 'value' otherlv_1= '{' otherlv_2= 'content' otherlv_3= ':' ( (lv_content_4_0= ruleDOUBLE ) ) otherlv_5= '}' )
            {
            // InternalSedml.g:4495:2: (otherlv_0= 'value' otherlv_1= '{' otherlv_2= 'content' otherlv_3= ':' ( (lv_content_4_0= ruleDOUBLE ) ) otherlv_5= '}' )
            // InternalSedml.g:4496:3: otherlv_0= 'value' otherlv_1= '{' otherlv_2= 'content' otherlv_3= ':' ( (lv_content_4_0= ruleDOUBLE ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValueAccess().getValueKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_114); 

            			newLeafNode(otherlv_1, grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,101,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getValueAccess().getContentKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_98); 

            			newLeafNode(otherlv_3, grammarAccess.getValueAccess().getColonKeyword_3());
            		
            // InternalSedml.g:4512:3: ( (lv_content_4_0= ruleDOUBLE ) )
            // InternalSedml.g:4513:4: (lv_content_4_0= ruleDOUBLE )
            {
            // InternalSedml.g:4513:4: (lv_content_4_0= ruleDOUBLE )
            // InternalSedml.g:4514:5: lv_content_4_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getValueAccess().getContentDOUBLEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_content_4_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_4_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getValueAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulevalue"


    // $ANTLR start "entryRulefunctionalRange"
    // InternalSedml.g:4539:1: entryRulefunctionalRange returns [EObject current=null] : iv_rulefunctionalRange= rulefunctionalRange EOF ;
    public final EObject entryRulefunctionalRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionalRange = null;


        try {
            // InternalSedml.g:4539:56: (iv_rulefunctionalRange= rulefunctionalRange EOF )
            // InternalSedml.g:4540:2: iv_rulefunctionalRange= rulefunctionalRange EOF
            {
             newCompositeNode(grammarAccess.getFunctionalRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunctionalRange=rulefunctionalRange();

            state._fsp--;

             current =iv_rulefunctionalRange; 
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
    // $ANTLR end "entryRulefunctionalRange"


    // $ANTLR start "rulefunctionalRange"
    // InternalSedml.g:4546:1: rulefunctionalRange returns [EObject current=null] : (otherlv_0= 'functionalRange' otherlv_1= '{' otherlv_2= 'range' otherlv_3= ':' ( (lv_range_4_0= RULE_ID ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) )? ( (lv_listOfParameters_6_0= rulelistOfParameters ) )? ( (lv_math_7_0= rulemath ) )? otherlv_8= '}' ) ;
    public final EObject rulefunctionalRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_range_4_0=null;
        Token otherlv_8=null;
        EObject lv_listOfVariables_5_0 = null;

        EObject lv_listOfParameters_6_0 = null;

        EObject lv_math_7_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:4552:2: ( (otherlv_0= 'functionalRange' otherlv_1= '{' otherlv_2= 'range' otherlv_3= ':' ( (lv_range_4_0= RULE_ID ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) )? ( (lv_listOfParameters_6_0= rulelistOfParameters ) )? ( (lv_math_7_0= rulemath ) )? otherlv_8= '}' ) )
            // InternalSedml.g:4553:2: (otherlv_0= 'functionalRange' otherlv_1= '{' otherlv_2= 'range' otherlv_3= ':' ( (lv_range_4_0= RULE_ID ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) )? ( (lv_listOfParameters_6_0= rulelistOfParameters ) )? ( (lv_math_7_0= rulemath ) )? otherlv_8= '}' )
            {
            // InternalSedml.g:4553:2: (otherlv_0= 'functionalRange' otherlv_1= '{' otherlv_2= 'range' otherlv_3= ':' ( (lv_range_4_0= RULE_ID ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) )? ( (lv_listOfParameters_6_0= rulelistOfParameters ) )? ( (lv_math_7_0= rulemath ) )? otherlv_8= '}' )
            // InternalSedml.g:4554:3: otherlv_0= 'functionalRange' otherlv_1= '{' otherlv_2= 'range' otherlv_3= ':' ( (lv_range_4_0= RULE_ID ) ) ( (lv_listOfVariables_5_0= rulelistOfVariables ) )? ( (lv_listOfParameters_6_0= rulelistOfParameters ) )? ( (lv_math_7_0= rulemath ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalRangeAccess().getFunctionalRangeKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_115); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionalRangeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,103,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionalRangeAccess().getRangeKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionalRangeAccess().getColonKeyword_3());
            		
            // InternalSedml.g:4570:3: ( (lv_range_4_0= RULE_ID ) )
            // InternalSedml.g:4571:4: (lv_range_4_0= RULE_ID )
            {
            // InternalSedml.g:4571:4: (lv_range_4_0= RULE_ID )
            // InternalSedml.g:4572:5: lv_range_4_0= RULE_ID
            {
            lv_range_4_0=(Token)match(input,RULE_ID,FOLLOW_94); 

            					newLeafNode(lv_range_4_0, grammarAccess.getFunctionalRangeAccess().getRangeIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionalRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"range",
            						lv_range_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSedml.g:4588:3: ( (lv_listOfVariables_5_0= rulelistOfVariables ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==87) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSedml.g:4589:4: (lv_listOfVariables_5_0= rulelistOfVariables )
                    {
                    // InternalSedml.g:4589:4: (lv_listOfVariables_5_0= rulelistOfVariables )
                    // InternalSedml.g:4590:5: lv_listOfVariables_5_0= rulelistOfVariables
                    {

                    					newCompositeNode(grammarAccess.getFunctionalRangeAccess().getListOfVariablesListOfVariablesParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_95);
                    lv_listOfVariables_5_0=rulelistOfVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionalRangeRule());
                    					}
                    					set(
                    						current,
                    						"listOfVariables",
                    						lv_listOfVariables_5_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfVariables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:4607:3: ( (lv_listOfParameters_6_0= rulelistOfParameters ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==85) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalSedml.g:4608:4: (lv_listOfParameters_6_0= rulelistOfParameters )
                    {
                    // InternalSedml.g:4608:4: (lv_listOfParameters_6_0= rulelistOfParameters )
                    // InternalSedml.g:4609:5: lv_listOfParameters_6_0= rulelistOfParameters
                    {

                    					newCompositeNode(grammarAccess.getFunctionalRangeAccess().getListOfParametersListOfParametersParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_96);
                    lv_listOfParameters_6_0=rulelistOfParameters();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionalRangeRule());
                    					}
                    					set(
                    						current,
                    						"listOfParameters",
                    						lv_listOfParameters_6_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfParameters");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSedml.g:4626:3: ( (lv_math_7_0= rulemath ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==20) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalSedml.g:4627:4: (lv_math_7_0= rulemath )
                    {
                    // InternalSedml.g:4627:4: (lv_math_7_0= rulemath )
                    // InternalSedml.g:4628:5: lv_math_7_0= rulemath
                    {

                    					newCompositeNode(grammarAccess.getFunctionalRangeAccess().getMathMathParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_math_7_0=rulemath();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionalRangeRule());
                    					}
                    					set(
                    						current,
                    						"math",
                    						lv_math_7_0,
                    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.math");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionalRangeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "rulefunctionalRange"


    // $ANTLR start "entryRuleabstractTask"
    // InternalSedml.g:4653:1: entryRuleabstractTask returns [EObject current=null] : iv_ruleabstractTask= ruleabstractTask EOF ;
    public final EObject entryRuleabstractTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleabstractTask = null;


        try {
            // InternalSedml.g:4653:53: (iv_ruleabstractTask= ruleabstractTask EOF )
            // InternalSedml.g:4654:2: iv_ruleabstractTask= ruleabstractTask EOF
            {
             newCompositeNode(grammarAccess.getAbstractTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleabstractTask=ruleabstractTask();

            state._fsp--;

             current =iv_ruleabstractTask; 
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
    // $ANTLR end "entryRuleabstractTask"


    // $ANTLR start "ruleabstractTask"
    // InternalSedml.g:4660:1: ruleabstractTask returns [EObject current=null] : (this_task_0= ruletask | this_repeatedTask_1= rulerepeatedTask ) ;
    public final EObject ruleabstractTask() throws RecognitionException {
        EObject current = null;

        EObject this_task_0 = null;

        EObject this_repeatedTask_1 = null;



        	enterRule();

        try {
            // InternalSedml.g:4666:2: ( (this_task_0= ruletask | this_repeatedTask_1= rulerepeatedTask ) )
            // InternalSedml.g:4667:2: (this_task_0= ruletask | this_repeatedTask_1= rulerepeatedTask )
            {
            // InternalSedml.g:4667:2: (this_task_0= ruletask | this_repeatedTask_1= rulerepeatedTask )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==105) ) {
                alt84=1;
            }
            else if ( (LA84_0==94) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalSedml.g:4668:3: this_task_0= ruletask
                    {

                    			newCompositeNode(grammarAccess.getAbstractTaskAccess().getTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_task_0=ruletask();

                    state._fsp--;


                    			current = this_task_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSedml.g:4677:3: this_repeatedTask_1= rulerepeatedTask
                    {

                    			newCompositeNode(grammarAccess.getAbstractTaskAccess().getRepeatedTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_repeatedTask_1=rulerepeatedTask();

                    state._fsp--;


                    			current = this_repeatedTask_1;
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
    // $ANTLR end "ruleabstractTask"


    // $ANTLR start "entryRulesubTask"
    // InternalSedml.g:4689:1: entryRulesubTask returns [EObject current=null] : iv_rulesubTask= rulesubTask EOF ;
    public final EObject entryRulesubTask() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubTask = null;


        try {
            // InternalSedml.g:4689:48: (iv_rulesubTask= rulesubTask EOF )
            // InternalSedml.g:4690:2: iv_rulesubTask= rulesubTask EOF
            {
             newCompositeNode(grammarAccess.getSubTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesubTask=rulesubTask();

            state._fsp--;

             current =iv_rulesubTask; 
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
    // $ANTLR end "entryRulesubTask"


    // $ANTLR start "rulesubTask"
    // InternalSedml.g:4696:1: rulesubTask returns [EObject current=null] : (otherlv_0= 'subTask' otherlv_1= '{' otherlv_2= 'task' otherlv_3= ':' ( (lv_modelReference_4_0= rulemodel ) ) otherlv_5= 'order' otherlv_6= ':' ( (lv_order_7_0= RULE_INT ) ) otherlv_8= '}' ) ;
    public final EObject rulesubTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_order_7_0=null;
        Token otherlv_8=null;
        EObject lv_modelReference_4_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:4702:2: ( (otherlv_0= 'subTask' otherlv_1= '{' otherlv_2= 'task' otherlv_3= ':' ( (lv_modelReference_4_0= rulemodel ) ) otherlv_5= 'order' otherlv_6= ':' ( (lv_order_7_0= RULE_INT ) ) otherlv_8= '}' ) )
            // InternalSedml.g:4703:2: (otherlv_0= 'subTask' otherlv_1= '{' otherlv_2= 'task' otherlv_3= ':' ( (lv_modelReference_4_0= rulemodel ) ) otherlv_5= 'order' otherlv_6= ':' ( (lv_order_7_0= RULE_INT ) ) otherlv_8= '}' )
            {
            // InternalSedml.g:4703:2: (otherlv_0= 'subTask' otherlv_1= '{' otherlv_2= 'task' otherlv_3= ':' ( (lv_modelReference_4_0= rulemodel ) ) otherlv_5= 'order' otherlv_6= ':' ( (lv_order_7_0= RULE_INT ) ) otherlv_8= '}' )
            // InternalSedml.g:4704:3: otherlv_0= 'subTask' otherlv_1= '{' otherlv_2= 'task' otherlv_3= ':' ( (lv_modelReference_4_0= rulemodel ) ) otherlv_5= 'order' otherlv_6= ':' ( (lv_order_7_0= RULE_INT ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,104,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubTaskAccess().getSubTaskKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_102); 

            			newLeafNode(otherlv_1, grammarAccess.getSubTaskAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,105,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSubTaskAccess().getTaskKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getSubTaskAccess().getColonKeyword_3());
            		
            // InternalSedml.g:4720:3: ( (lv_modelReference_4_0= rulemodel ) )
            // InternalSedml.g:4721:4: (lv_modelReference_4_0= rulemodel )
            {
            // InternalSedml.g:4721:4: (lv_modelReference_4_0= rulemodel )
            // InternalSedml.g:4722:5: lv_modelReference_4_0= rulemodel
            {

            					newCompositeNode(grammarAccess.getSubTaskAccess().getModelReferenceModelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_116);
            lv_modelReference_4_0=rulemodel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubTaskRule());
            					}
            					set(
            						current,
            						"modelReference",
            						lv_modelReference_4_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.model");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,106,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getSubTaskAccess().getOrderKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getSubTaskAccess().getColonKeyword_6());
            		
            // InternalSedml.g:4747:3: ( (lv_order_7_0= RULE_INT ) )
            // InternalSedml.g:4748:4: (lv_order_7_0= RULE_INT )
            {
            // InternalSedml.g:4748:4: (lv_order_7_0= RULE_INT )
            // InternalSedml.g:4749:5: lv_order_7_0= RULE_INT
            {
            lv_order_7_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_order_7_0, grammarAccess.getSubTaskAccess().getOrderINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"order",
            						lv_order_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSubTaskAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "rulesubTask"


    // $ANTLR start "entryRuletask"
    // InternalSedml.g:4773:1: entryRuletask returns [EObject current=null] : iv_ruletask= ruletask EOF ;
    public final EObject entryRuletask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletask = null;


        try {
            // InternalSedml.g:4773:45: (iv_ruletask= ruletask EOF )
            // InternalSedml.g:4774:2: iv_ruletask= ruletask EOF
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
    // InternalSedml.g:4780:1: ruletask returns [EObject current=null] : (otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' ) ;
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
            // InternalSedml.g:4786:2: ( (otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' ) )
            // InternalSedml.g:4787:2: (otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' )
            {
            // InternalSedml.g:4787:2: (otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}' )
            // InternalSedml.g:4788:3: otherlv_0= 'task' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'modelReference' otherlv_6= ':' ( (lv_modelReference_7_0= rulemodel ) ) otherlv_8= 'simulationReference' otherlv_9= ':' ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) ) otherlv_11= 'name' otherlv_12= ':' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getColonKeyword_3());
            		
            // InternalSedml.g:4804:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:4805:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:4805:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:4806:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_103); 

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

            otherlv_5=(Token)match(input,91,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getModelReferenceKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_43); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getColonKeyword_6());
            		
            // InternalSedml.g:4830:3: ( (lv_modelReference_7_0= rulemodel ) )
            // InternalSedml.g:4831:4: (lv_modelReference_7_0= rulemodel )
            {
            // InternalSedml.g:4831:4: (lv_modelReference_7_0= rulemodel )
            // InternalSedml.g:4832:5: lv_modelReference_7_0= rulemodel
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getModelReferenceModelParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_117);
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

            otherlv_8=(Token)match(input,107,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getSimulationReferenceKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_118); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getColonKeyword_9());
            		
            // InternalSedml.g:4857:3: ( (lv_simulationReference_10_0= ruleuniformTimeCourse ) )
            // InternalSedml.g:4858:4: (lv_simulationReference_10_0= ruleuniformTimeCourse )
            {
            // InternalSedml.g:4858:4: (lv_simulationReference_10_0= ruleuniformTimeCourse )
            // InternalSedml.g:4859:5: lv_simulationReference_10_0= ruleuniformTimeCourse
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getSimulationReferenceUniformTimeCourseParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_11=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getNameKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getColonKeyword_12());
            		
            // InternalSedml.g:4884:3: ( (lv_name_13_0= RULE_STRING ) )
            // InternalSedml.g:4885:4: (lv_name_13_0= RULE_STRING )
            {
            // InternalSedml.g:4885:4: (lv_name_13_0= RULE_STRING )
            // InternalSedml.g:4886:5: lv_name_13_0= RULE_STRING
            {
            lv_name_13_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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
    // InternalSedml.g:4910:1: entryRulelistOfDataGenerators returns [EObject current=null] : iv_rulelistOfDataGenerators= rulelistOfDataGenerators EOF ;
    public final EObject entryRulelistOfDataGenerators() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfDataGenerators = null;


        try {
            // InternalSedml.g:4910:61: (iv_rulelistOfDataGenerators= rulelistOfDataGenerators EOF )
            // InternalSedml.g:4911:2: iv_rulelistOfDataGenerators= rulelistOfDataGenerators EOF
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
    // InternalSedml.g:4917:1: rulelistOfDataGenerators returns [EObject current=null] : (otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfDataGenerators() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_datagenerator_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:4923:2: ( (otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}' ) )
            // InternalSedml.g:4924:2: (otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:4924:2: (otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}' )
            // InternalSedml.g:4925:3: otherlv_0= 'listOfDataGenerators' otherlv_1= '{' ( (lv_datagenerator_2_0= ruledataGenerator ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,108,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfDataGeneratorsAccess().getListOfDataGeneratorsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_119); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfDataGeneratorsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:4933:3: ( (lv_datagenerator_2_0= ruledataGenerator ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==84) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalSedml.g:4934:4: (lv_datagenerator_2_0= ruledataGenerator )
            	    {
            	    // InternalSedml.g:4934:4: (lv_datagenerator_2_0= ruledataGenerator )
            	    // InternalSedml.g:4935:5: lv_datagenerator_2_0= ruledataGenerator
            	    {

            	    					newCompositeNode(grammarAccess.getListOfDataGeneratorsAccess().getDatageneratorDataGeneratorParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_119);
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
            	    break loop85;
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
    // InternalSedml.g:4960:1: entryRulemath returns [EObject current=null] : iv_rulemath= rulemath EOF ;
    public final EObject entryRulemath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemath = null;


        try {
            // InternalSedml.g:4960:45: (iv_rulemath= rulemath EOF )
            // InternalSedml.g:4961:2: iv_rulemath= rulemath EOF
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
    // InternalSedml.g:4967:1: rulemath returns [EObject current=null] : (otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
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
            // InternalSedml.g:4973:2: ( (otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalSedml.g:4974:2: (otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalSedml.g:4974:2: (otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalSedml.g:4975:3: otherlv_0= 'math' otherlv_1= '{' otherlv_2= 'xlms' otherlv_3= ':' ( (lv_xlms_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathAccess().getMathKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_120); 

            			newLeafNode(otherlv_1, grammarAccess.getMathAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,109,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMathAccess().getXlmsKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMathAccess().getColonKeyword_3());
            		
            // InternalSedml.g:4991:3: ( (lv_xlms_4_0= RULE_STRING ) )
            // InternalSedml.g:4992:4: (lv_xlms_4_0= RULE_STRING )
            {
            // InternalSedml.g:4992:4: (lv_xlms_4_0= RULE_STRING )
            // InternalSedml.g:4993:5: lv_xlms_4_0= RULE_STRING
            {
            lv_xlms_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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
    // InternalSedml.g:5017:1: entryRulelistOfOutputs returns [EObject current=null] : iv_rulelistOfOutputs= rulelistOfOutputs EOF ;
    public final EObject entryRulelistOfOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfOutputs = null;


        try {
            // InternalSedml.g:5017:54: (iv_rulelistOfOutputs= rulelistOfOutputs EOF )
            // InternalSedml.g:5018:2: iv_rulelistOfOutputs= rulelistOfOutputs EOF
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
    // InternalSedml.g:5024:1: rulelistOfOutputs returns [EObject current=null] : (otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_output_2_0= ruleoutput ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfOutputs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_output_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:5030:2: ( (otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_output_2_0= ruleoutput ) )* otherlv_3= '}' ) )
            // InternalSedml.g:5031:2: (otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_output_2_0= ruleoutput ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:5031:2: (otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_output_2_0= ruleoutput ) )* otherlv_3= '}' )
            // InternalSedml.g:5032:3: otherlv_0= 'listOfOutputs' otherlv_1= '{' ( (lv_output_2_0= ruleoutput ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,110,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfOutputsAccess().getListOfOutputsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_121); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfOutputsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:5040:3: ( (lv_output_2_0= ruleoutput ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( ((LA86_0>=111 && LA86_0<=113)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalSedml.g:5041:4: (lv_output_2_0= ruleoutput )
            	    {
            	    // InternalSedml.g:5041:4: (lv_output_2_0= ruleoutput )
            	    // InternalSedml.g:5042:5: lv_output_2_0= ruleoutput
            	    {

            	    					newCompositeNode(grammarAccess.getListOfOutputsAccess().getOutputOutputParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_121);
            	    lv_output_2_0=ruleoutput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfOutputsRule());
            	    					}
            	    					set(
            	    						current,
            	    						"output",
            	    						lv_output_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.output");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
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


    // $ANTLR start "entryRuleoutput"
    // InternalSedml.g:5067:1: entryRuleoutput returns [EObject current=null] : iv_ruleoutput= ruleoutput EOF ;
    public final EObject entryRuleoutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoutput = null;


        try {
            // InternalSedml.g:5067:47: (iv_ruleoutput= ruleoutput EOF )
            // InternalSedml.g:5068:2: iv_ruleoutput= ruleoutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoutput=ruleoutput();

            state._fsp--;

             current =iv_ruleoutput; 
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
    // $ANTLR end "entryRuleoutput"


    // $ANTLR start "ruleoutput"
    // InternalSedml.g:5074:1: ruleoutput returns [EObject current=null] : (this_plot2D_0= ruleplot2D | this_plot3D_1= ruleplot3D | this_report_2= rulereport ) ;
    public final EObject ruleoutput() throws RecognitionException {
        EObject current = null;

        EObject this_plot2D_0 = null;

        EObject this_plot3D_1 = null;

        EObject this_report_2 = null;



        	enterRule();

        try {
            // InternalSedml.g:5080:2: ( (this_plot2D_0= ruleplot2D | this_plot3D_1= ruleplot3D | this_report_2= rulereport ) )
            // InternalSedml.g:5081:2: (this_plot2D_0= ruleplot2D | this_plot3D_1= ruleplot3D | this_report_2= rulereport )
            {
            // InternalSedml.g:5081:2: (this_plot2D_0= ruleplot2D | this_plot3D_1= ruleplot3D | this_report_2= rulereport )
            int alt87=3;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt87=1;
                }
                break;
            case 112:
                {
                alt87=2;
                }
                break;
            case 113:
                {
                alt87=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalSedml.g:5082:3: this_plot2D_0= ruleplot2D
                    {

                    			newCompositeNode(grammarAccess.getOutputAccess().getPlot2DParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_plot2D_0=ruleplot2D();

                    state._fsp--;


                    			current = this_plot2D_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSedml.g:5091:3: this_plot3D_1= ruleplot3D
                    {

                    			newCompositeNode(grammarAccess.getOutputAccess().getPlot3DParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_plot3D_1=ruleplot3D();

                    state._fsp--;


                    			current = this_plot3D_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSedml.g:5100:3: this_report_2= rulereport
                    {

                    			newCompositeNode(grammarAccess.getOutputAccess().getReportParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_report_2=rulereport();

                    state._fsp--;


                    			current = this_report_2;
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
    // $ANTLR end "ruleoutput"


    // $ANTLR start "entryRuleplot2D"
    // InternalSedml.g:5112:1: entryRuleplot2D returns [EObject current=null] : iv_ruleplot2D= ruleplot2D EOF ;
    public final EObject entryRuleplot2D() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleplot2D = null;


        try {
            // InternalSedml.g:5112:47: (iv_ruleplot2D= ruleplot2D EOF )
            // InternalSedml.g:5113:2: iv_ruleplot2D= ruleplot2D EOF
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
    // InternalSedml.g:5119:1: ruleplot2D returns [EObject current=null] : (otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}' ) ;
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
            // InternalSedml.g:5125:2: ( (otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}' ) )
            // InternalSedml.g:5126:2: (otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}' )
            {
            // InternalSedml.g:5126:2: (otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}' )
            // InternalSedml.g:5127:3: otherlv_0= 'plot2D' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfCurves_8_0= rulelistOfCurves ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,111,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlot2DAccess().getPlot2DKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getPlot2DAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPlot2DAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getPlot2DAccess().getColonKeyword_3());
            		
            // InternalSedml.g:5143:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:5144:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:5144:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:5145:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            otherlv_5=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getPlot2DAccess().getNameKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getPlot2DAccess().getColonKeyword_6());
            		
            // InternalSedml.g:5169:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalSedml.g:5170:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalSedml.g:5170:4: (lv_name_7_0= RULE_STRING )
            // InternalSedml.g:5171:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_122); 

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

            // InternalSedml.g:5187:3: ( (lv_listOfCurves_8_0= rulelistOfCurves ) )
            // InternalSedml.g:5188:4: (lv_listOfCurves_8_0= rulelistOfCurves )
            {
            // InternalSedml.g:5188:4: (lv_listOfCurves_8_0= rulelistOfCurves )
            // InternalSedml.g:5189:5: lv_listOfCurves_8_0= rulelistOfCurves
            {

            					newCompositeNode(grammarAccess.getPlot2DAccess().getListOfCurvesListOfCurvesParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_8);
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


    // $ANTLR start "entryRuleplot3D"
    // InternalSedml.g:5214:1: entryRuleplot3D returns [EObject current=null] : iv_ruleplot3D= ruleplot3D EOF ;
    public final EObject entryRuleplot3D() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleplot3D = null;


        try {
            // InternalSedml.g:5214:47: (iv_ruleplot3D= ruleplot3D EOF )
            // InternalSedml.g:5215:2: iv_ruleplot3D= ruleplot3D EOF
            {
             newCompositeNode(grammarAccess.getPlot3DRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleplot3D=ruleplot3D();

            state._fsp--;

             current =iv_ruleplot3D; 
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
    // $ANTLR end "entryRuleplot3D"


    // $ANTLR start "ruleplot3D"
    // InternalSedml.g:5221:1: ruleplot3D returns [EObject current=null] : (otherlv_0= 'plot3D' otherlv_1= '{' ( (lv_listOfSurfaces_2_0= rulelistOfSurfaces ) ) otherlv_3= '}' ) ;
    public final EObject ruleplot3D() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listOfSurfaces_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:5227:2: ( (otherlv_0= 'plot3D' otherlv_1= '{' ( (lv_listOfSurfaces_2_0= rulelistOfSurfaces ) ) otherlv_3= '}' ) )
            // InternalSedml.g:5228:2: (otherlv_0= 'plot3D' otherlv_1= '{' ( (lv_listOfSurfaces_2_0= rulelistOfSurfaces ) ) otherlv_3= '}' )
            {
            // InternalSedml.g:5228:2: (otherlv_0= 'plot3D' otherlv_1= '{' ( (lv_listOfSurfaces_2_0= rulelistOfSurfaces ) ) otherlv_3= '}' )
            // InternalSedml.g:5229:3: otherlv_0= 'plot3D' otherlv_1= '{' ( (lv_listOfSurfaces_2_0= rulelistOfSurfaces ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,112,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlot3DAccess().getPlot3DKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_123); 

            			newLeafNode(otherlv_1, grammarAccess.getPlot3DAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:5237:3: ( (lv_listOfSurfaces_2_0= rulelistOfSurfaces ) )
            // InternalSedml.g:5238:4: (lv_listOfSurfaces_2_0= rulelistOfSurfaces )
            {
            // InternalSedml.g:5238:4: (lv_listOfSurfaces_2_0= rulelistOfSurfaces )
            // InternalSedml.g:5239:5: lv_listOfSurfaces_2_0= rulelistOfSurfaces
            {

            					newCompositeNode(grammarAccess.getPlot3DAccess().getListOfSurfacesListOfSurfacesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_listOfSurfaces_2_0=rulelistOfSurfaces();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlot3DRule());
            					}
            					set(
            						current,
            						"listOfSurfaces",
            						lv_listOfSurfaces_2_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfSurfaces");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPlot3DAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleplot3D"


    // $ANTLR start "entryRulereport"
    // InternalSedml.g:5264:1: entryRulereport returns [EObject current=null] : iv_rulereport= rulereport EOF ;
    public final EObject entryRulereport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereport = null;


        try {
            // InternalSedml.g:5264:47: (iv_rulereport= rulereport EOF )
            // InternalSedml.g:5265:2: iv_rulereport= rulereport EOF
            {
             newCompositeNode(grammarAccess.getReportRule()); 
            pushFollow(FOLLOW_1);
            iv_rulereport=rulereport();

            state._fsp--;

             current =iv_rulereport; 
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
    // $ANTLR end "entryRulereport"


    // $ANTLR start "rulereport"
    // InternalSedml.g:5271:1: rulereport returns [EObject current=null] : (otherlv_0= 'report' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfDataSets_8_0= rulelistOfDataSets ) ) otherlv_9= '}' ) ;
    public final EObject rulereport() throws RecognitionException {
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
        EObject lv_listOfDataSets_8_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:5277:2: ( (otherlv_0= 'report' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfDataSets_8_0= rulelistOfDataSets ) ) otherlv_9= '}' ) )
            // InternalSedml.g:5278:2: (otherlv_0= 'report' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfDataSets_8_0= rulelistOfDataSets ) ) otherlv_9= '}' )
            {
            // InternalSedml.g:5278:2: (otherlv_0= 'report' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfDataSets_8_0= rulelistOfDataSets ) ) otherlv_9= '}' )
            // InternalSedml.g:5279:3: otherlv_0= 'report' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_listOfDataSets_8_0= rulelistOfDataSets ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,113,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReportAccess().getReportKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getReportAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getReportAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getReportAccess().getColonKeyword_3());
            		
            // InternalSedml.g:5295:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:5296:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:5296:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:5297:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_id_4_0, grammarAccess.getReportAccess().getIdIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getReportAccess().getNameKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getReportAccess().getColonKeyword_6());
            		
            // InternalSedml.g:5321:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalSedml.g:5322:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalSedml.g:5322:4: (lv_name_7_0= RULE_STRING )
            // InternalSedml.g:5323:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_122); 

            					newLeafNode(lv_name_7_0, grammarAccess.getReportAccess().getNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSedml.g:5339:3: ( (lv_listOfDataSets_8_0= rulelistOfDataSets ) )
            // InternalSedml.g:5340:4: (lv_listOfDataSets_8_0= rulelistOfDataSets )
            {
            // InternalSedml.g:5340:4: (lv_listOfDataSets_8_0= rulelistOfDataSets )
            // InternalSedml.g:5341:5: lv_listOfDataSets_8_0= rulelistOfDataSets
            {

            					newCompositeNode(grammarAccess.getReportAccess().getListOfDataSetsListOfDataSetsParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_8);
            lv_listOfDataSets_8_0=rulelistOfDataSets();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReportRule());
            					}
            					set(
            						current,
            						"listOfDataSets",
            						lv_listOfDataSets_8_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfDataSets");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getReportAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "rulereport"


    // $ANTLR start "entryRulelistOfDataSets"
    // InternalSedml.g:5366:1: entryRulelistOfDataSets returns [EObject current=null] : iv_rulelistOfDataSets= rulelistOfDataSets EOF ;
    public final EObject entryRulelistOfDataSets() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfDataSets = null;


        try {
            // InternalSedml.g:5366:55: (iv_rulelistOfDataSets= rulelistOfDataSets EOF )
            // InternalSedml.g:5367:2: iv_rulelistOfDataSets= rulelistOfDataSets EOF
            {
             newCompositeNode(grammarAccess.getListOfDataSetsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfDataSets=rulelistOfDataSets();

            state._fsp--;

             current =iv_rulelistOfDataSets; 
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
    // $ANTLR end "entryRulelistOfDataSets"


    // $ANTLR start "rulelistOfDataSets"
    // InternalSedml.g:5373:1: rulelistOfDataSets returns [EObject current=null] : (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_dataSet_2_0= ruledataSet ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfDataSets() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dataSet_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:5379:2: ( (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_dataSet_2_0= ruledataSet ) )* otherlv_3= '}' ) )
            // InternalSedml.g:5380:2: (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_dataSet_2_0= ruledataSet ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:5380:2: (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_dataSet_2_0= ruledataSet ) )* otherlv_3= '}' )
            // InternalSedml.g:5381:3: otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_dataSet_2_0= ruledataSet ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,114,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfDataSetsAccess().getListOfCurvesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_124); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfDataSetsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:5389:3: ( (lv_dataSet_2_0= ruledataSet ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==115) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalSedml.g:5390:4: (lv_dataSet_2_0= ruledataSet )
            	    {
            	    // InternalSedml.g:5390:4: (lv_dataSet_2_0= ruledataSet )
            	    // InternalSedml.g:5391:5: lv_dataSet_2_0= ruledataSet
            	    {

            	    					newCompositeNode(grammarAccess.getListOfDataSetsAccess().getDataSetDataSetParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_124);
            	    lv_dataSet_2_0=ruledataSet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfDataSetsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataSet",
            	    						lv_dataSet_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.dataSet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfDataSetsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfDataSets"


    // $ANTLR start "entryRuledataSet"
    // InternalSedml.g:5416:1: entryRuledataSet returns [EObject current=null] : iv_ruledataSet= ruledataSet EOF ;
    public final EObject entryRuledataSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledataSet = null;


        try {
            // InternalSedml.g:5416:48: (iv_ruledataSet= ruledataSet EOF )
            // InternalSedml.g:5417:2: iv_ruledataSet= ruledataSet EOF
            {
             newCompositeNode(grammarAccess.getDataSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledataSet=ruledataSet();

            state._fsp--;

             current =iv_ruledataSet; 
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
    // $ANTLR end "entryRuledataSet"


    // $ANTLR start "ruledataSet"
    // InternalSedml.g:5423:1: ruledataSet returns [EObject current=null] : (otherlv_0= 'dataSet' otherlv_1= '{' otherlv_2= 'label' otherlv_3= ':' ( (lv_label_4_0= RULE_STRING ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'dataReference' otherlv_9= ':' ( (lv_dataReference_10_0= RULE_STRING ) ) otherlv_11= '}' ) ;
    public final EObject ruledataSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_dataReference_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalSedml.g:5429:2: ( (otherlv_0= 'dataSet' otherlv_1= '{' otherlv_2= 'label' otherlv_3= ':' ( (lv_label_4_0= RULE_STRING ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'dataReference' otherlv_9= ':' ( (lv_dataReference_10_0= RULE_STRING ) ) otherlv_11= '}' ) )
            // InternalSedml.g:5430:2: (otherlv_0= 'dataSet' otherlv_1= '{' otherlv_2= 'label' otherlv_3= ':' ( (lv_label_4_0= RULE_STRING ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'dataReference' otherlv_9= ':' ( (lv_dataReference_10_0= RULE_STRING ) ) otherlv_11= '}' )
            {
            // InternalSedml.g:5430:2: (otherlv_0= 'dataSet' otherlv_1= '{' otherlv_2= 'label' otherlv_3= ':' ( (lv_label_4_0= RULE_STRING ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'dataReference' otherlv_9= ':' ( (lv_dataReference_10_0= RULE_STRING ) ) otherlv_11= '}' )
            // InternalSedml.g:5431:3: otherlv_0= 'dataSet' otherlv_1= '{' otherlv_2= 'label' otherlv_3= ':' ( (lv_label_4_0= RULE_STRING ) ) otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'dataReference' otherlv_9= ':' ( (lv_dataReference_10_0= RULE_STRING ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,115,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSetAccess().getDataSetKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_125); 

            			newLeafNode(otherlv_1, grammarAccess.getDataSetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,116,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDataSetAccess().getLabelKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDataSetAccess().getColonKeyword_3());
            		
            // InternalSedml.g:5447:3: ( (lv_label_4_0= RULE_STRING ) )
            // InternalSedml.g:5448:4: (lv_label_4_0= RULE_STRING )
            {
            // InternalSedml.g:5448:4: (lv_label_4_0= RULE_STRING )
            // InternalSedml.g:5449:5: lv_label_4_0= RULE_STRING
            {
            lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_label_4_0, grammarAccess.getDataSetAccess().getLabelSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDataSetAccess().getNameKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDataSetAccess().getColonKeyword_6());
            		
            // InternalSedml.g:5473:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalSedml.g:5474:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalSedml.g:5474:4: (lv_name_7_0= RULE_STRING )
            // InternalSedml.g:5475:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_126); 

            					newLeafNode(lv_name_7_0, grammarAccess.getDataSetAccess().getNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,117,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getDataSetAccess().getDataReferenceKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getDataSetAccess().getColonKeyword_9());
            		
            // InternalSedml.g:5499:3: ( (lv_dataReference_10_0= RULE_STRING ) )
            // InternalSedml.g:5500:4: (lv_dataReference_10_0= RULE_STRING )
            {
            // InternalSedml.g:5500:4: (lv_dataReference_10_0= RULE_STRING )
            // InternalSedml.g:5501:5: lv_dataReference_10_0= RULE_STRING
            {
            lv_dataReference_10_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_dataReference_10_0, grammarAccess.getDataSetAccess().getDataReferenceSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataReference",
            						lv_dataReference_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDataSetAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruledataSet"


    // $ANTLR start "entryRulelistOfSurfaces"
    // InternalSedml.g:5525:1: entryRulelistOfSurfaces returns [EObject current=null] : iv_rulelistOfSurfaces= rulelistOfSurfaces EOF ;
    public final EObject entryRulelistOfSurfaces() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfSurfaces = null;


        try {
            // InternalSedml.g:5525:55: (iv_rulelistOfSurfaces= rulelistOfSurfaces EOF )
            // InternalSedml.g:5526:2: iv_rulelistOfSurfaces= rulelistOfSurfaces EOF
            {
             newCompositeNode(grammarAccess.getListOfSurfacesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfSurfaces=rulelistOfSurfaces();

            state._fsp--;

             current =iv_rulelistOfSurfaces; 
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
    // $ANTLR end "entryRulelistOfSurfaces"


    // $ANTLR start "rulelistOfSurfaces"
    // InternalSedml.g:5532:1: rulelistOfSurfaces returns [EObject current=null] : (otherlv_0= 'surface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'logZ' otherlv_12= ':' ( (lv_logZ_13_0= RULE_STRING ) ) otherlv_14= 'xDataReference' otherlv_15= ':' ( (lv_xDataReference_16_0= RULE_STRING ) ) otherlv_17= 'yDataReference' otherlv_18= ':' ( (lv_yDataReference_19_0= RULE_STRING ) ) otherlv_20= 'zDataReference' otherlv_21= ':' ( (lv_zDataReference_22_0= RULE_STRING ) ) otherlv_23= '}' ) ;
    public final EObject rulelistOfSurfaces() throws RecognitionException {
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
        Token lv_logZ_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_xDataReference_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_yDataReference_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_zDataReference_22_0=null;
        Token otherlv_23=null;


        	enterRule();

        try {
            // InternalSedml.g:5538:2: ( (otherlv_0= 'surface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'logZ' otherlv_12= ':' ( (lv_logZ_13_0= RULE_STRING ) ) otherlv_14= 'xDataReference' otherlv_15= ':' ( (lv_xDataReference_16_0= RULE_STRING ) ) otherlv_17= 'yDataReference' otherlv_18= ':' ( (lv_yDataReference_19_0= RULE_STRING ) ) otherlv_20= 'zDataReference' otherlv_21= ':' ( (lv_zDataReference_22_0= RULE_STRING ) ) otherlv_23= '}' ) )
            // InternalSedml.g:5539:2: (otherlv_0= 'surface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'logZ' otherlv_12= ':' ( (lv_logZ_13_0= RULE_STRING ) ) otherlv_14= 'xDataReference' otherlv_15= ':' ( (lv_xDataReference_16_0= RULE_STRING ) ) otherlv_17= 'yDataReference' otherlv_18= ':' ( (lv_yDataReference_19_0= RULE_STRING ) ) otherlv_20= 'zDataReference' otherlv_21= ':' ( (lv_zDataReference_22_0= RULE_STRING ) ) otherlv_23= '}' )
            {
            // InternalSedml.g:5539:2: (otherlv_0= 'surface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'logZ' otherlv_12= ':' ( (lv_logZ_13_0= RULE_STRING ) ) otherlv_14= 'xDataReference' otherlv_15= ':' ( (lv_xDataReference_16_0= RULE_STRING ) ) otherlv_17= 'yDataReference' otherlv_18= ':' ( (lv_yDataReference_19_0= RULE_STRING ) ) otherlv_20= 'zDataReference' otherlv_21= ':' ( (lv_zDataReference_22_0= RULE_STRING ) ) otherlv_23= '}' )
            // InternalSedml.g:5540:3: otherlv_0= 'surface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'logZ' otherlv_12= ':' ( (lv_logZ_13_0= RULE_STRING ) ) otherlv_14= 'xDataReference' otherlv_15= ':' ( (lv_xDataReference_16_0= RULE_STRING ) ) otherlv_17= 'yDataReference' otherlv_18= ':' ( (lv_yDataReference_19_0= RULE_STRING ) ) otherlv_20= 'zDataReference' otherlv_21= ':' ( (lv_zDataReference_22_0= RULE_STRING ) ) otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,118,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfSurfacesAccess().getSurfaceKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfSurfacesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getListOfSurfacesAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfSurfacesAccess().getColonKeyword_3());
            		
            // InternalSedml.g:5556:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:5557:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:5557:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:5558:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_127); 

            					newLeafNode(lv_id_4_0, grammarAccess.getListOfSurfacesAccess().getIdIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfSurfacesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,119,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getListOfSurfacesAccess().getLogXKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getListOfSurfacesAccess().getColonKeyword_6());
            		
            // InternalSedml.g:5582:3: ( (lv_logX_7_0= RULE_STRING ) )
            // InternalSedml.g:5583:4: (lv_logX_7_0= RULE_STRING )
            {
            // InternalSedml.g:5583:4: (lv_logX_7_0= RULE_STRING )
            // InternalSedml.g:5584:5: lv_logX_7_0= RULE_STRING
            {
            lv_logX_7_0=(Token)match(input,RULE_STRING,FOLLOW_128); 

            					newLeafNode(lv_logX_7_0, grammarAccess.getListOfSurfacesAccess().getLogXSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfSurfacesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"logX",
            						lv_logX_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,120,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getListOfSurfacesAccess().getLogYKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getListOfSurfacesAccess().getColonKeyword_9());
            		
            // InternalSedml.g:5608:3: ( (lv_logY_10_0= RULE_STRING ) )
            // InternalSedml.g:5609:4: (lv_logY_10_0= RULE_STRING )
            {
            // InternalSedml.g:5609:4: (lv_logY_10_0= RULE_STRING )
            // InternalSedml.g:5610:5: lv_logY_10_0= RULE_STRING
            {
            lv_logY_10_0=(Token)match(input,RULE_STRING,FOLLOW_129); 

            					newLeafNode(lv_logY_10_0, grammarAccess.getListOfSurfacesAccess().getLogYSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfSurfacesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"logY",
            						lv_logY_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,121,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getListOfSurfacesAccess().getLogZKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getListOfSurfacesAccess().getColonKeyword_12());
            		
            // InternalSedml.g:5634:3: ( (lv_logZ_13_0= RULE_STRING ) )
            // InternalSedml.g:5635:4: (lv_logZ_13_0= RULE_STRING )
            {
            // InternalSedml.g:5635:4: (lv_logZ_13_0= RULE_STRING )
            // InternalSedml.g:5636:5: lv_logZ_13_0= RULE_STRING
            {
            lv_logZ_13_0=(Token)match(input,RULE_STRING,FOLLOW_130); 

            					newLeafNode(lv_logZ_13_0, grammarAccess.getListOfSurfacesAccess().getLogZSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfSurfacesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"logZ",
            						lv_logZ_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,122,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getListOfSurfacesAccess().getXDataReferenceKeyword_14());
            		
            otherlv_15=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getListOfSurfacesAccess().getColonKeyword_15());
            		
            // InternalSedml.g:5660:3: ( (lv_xDataReference_16_0= RULE_STRING ) )
            // InternalSedml.g:5661:4: (lv_xDataReference_16_0= RULE_STRING )
            {
            // InternalSedml.g:5661:4: (lv_xDataReference_16_0= RULE_STRING )
            // InternalSedml.g:5662:5: lv_xDataReference_16_0= RULE_STRING
            {
            lv_xDataReference_16_0=(Token)match(input,RULE_STRING,FOLLOW_131); 

            					newLeafNode(lv_xDataReference_16_0, grammarAccess.getListOfSurfacesAccess().getXDataReferenceSTRINGTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfSurfacesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"xDataReference",
            						lv_xDataReference_16_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_17=(Token)match(input,123,FOLLOW_6); 

            			newLeafNode(otherlv_17, grammarAccess.getListOfSurfacesAccess().getYDataReferenceKeyword_17());
            		
            otherlv_18=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getListOfSurfacesAccess().getColonKeyword_18());
            		
            // InternalSedml.g:5686:3: ( (lv_yDataReference_19_0= RULE_STRING ) )
            // InternalSedml.g:5687:4: (lv_yDataReference_19_0= RULE_STRING )
            {
            // InternalSedml.g:5687:4: (lv_yDataReference_19_0= RULE_STRING )
            // InternalSedml.g:5688:5: lv_yDataReference_19_0= RULE_STRING
            {
            lv_yDataReference_19_0=(Token)match(input,RULE_STRING,FOLLOW_132); 

            					newLeafNode(lv_yDataReference_19_0, grammarAccess.getListOfSurfacesAccess().getYDataReferenceSTRINGTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfSurfacesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"yDataReference",
            						lv_yDataReference_19_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_20=(Token)match(input,124,FOLLOW_6); 

            			newLeafNode(otherlv_20, grammarAccess.getListOfSurfacesAccess().getZDataReferenceKeyword_20());
            		
            otherlv_21=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_21, grammarAccess.getListOfSurfacesAccess().getColonKeyword_21());
            		
            // InternalSedml.g:5712:3: ( (lv_zDataReference_22_0= RULE_STRING ) )
            // InternalSedml.g:5713:4: (lv_zDataReference_22_0= RULE_STRING )
            {
            // InternalSedml.g:5713:4: (lv_zDataReference_22_0= RULE_STRING )
            // InternalSedml.g:5714:5: lv_zDataReference_22_0= RULE_STRING
            {
            lv_zDataReference_22_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_zDataReference_22_0, grammarAccess.getListOfSurfacesAccess().getZDataReferenceSTRINGTerminalRuleCall_22_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfSurfacesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"zDataReference",
            						lv_zDataReference_22_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_23=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getListOfSurfacesAccess().getRightCurlyBracketKeyword_23());
            		

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
    // $ANTLR end "rulelistOfSurfaces"


    // $ANTLR start "entryRulelistOfCurves"
    // InternalSedml.g:5738:1: entryRulelistOfCurves returns [EObject current=null] : iv_rulelistOfCurves= rulelistOfCurves EOF ;
    public final EObject entryRulelistOfCurves() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfCurves = null;


        try {
            // InternalSedml.g:5738:53: (iv_rulelistOfCurves= rulelistOfCurves EOF )
            // InternalSedml.g:5739:2: iv_rulelistOfCurves= rulelistOfCurves EOF
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
    // InternalSedml.g:5745:1: rulelistOfCurves returns [EObject current=null] : (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfCurves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_curve_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:5751:2: ( (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}' ) )
            // InternalSedml.g:5752:2: (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:5752:2: (otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}' )
            // InternalSedml.g:5753:3: otherlv_0= 'listOfCurves' otherlv_1= '{' ( (lv_curve_2_0= rulecurve ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,114,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfCurvesAccess().getListOfCurvesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_133); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfCurvesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:5761:3: ( (lv_curve_2_0= rulecurve ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==125) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalSedml.g:5762:4: (lv_curve_2_0= rulecurve )
            	    {
            	    // InternalSedml.g:5762:4: (lv_curve_2_0= rulecurve )
            	    // InternalSedml.g:5763:5: lv_curve_2_0= rulecurve
            	    {

            	    					newCompositeNode(grammarAccess.getListOfCurvesAccess().getCurveCurveParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_133);
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
            	    break loop89;
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
    // InternalSedml.g:5788:1: entryRulecurve returns [EObject current=null] : iv_rulecurve= rulecurve EOF ;
    public final EObject entryRulecurve() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecurve = null;


        try {
            // InternalSedml.g:5788:46: (iv_rulecurve= rulecurve EOF )
            // InternalSedml.g:5789:2: iv_rulecurve= rulecurve EOF
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
    // InternalSedml.g:5795:1: rulecurve returns [EObject current=null] : (otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}' ) ;
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
            // InternalSedml.g:5801:2: ( (otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}' ) )
            // InternalSedml.g:5802:2: (otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}' )
            {
            // InternalSedml.g:5802:2: (otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}' )
            // InternalSedml.g:5803:3: otherlv_0= 'curve' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'logX' otherlv_6= ':' ( (lv_logX_7_0= RULE_STRING ) ) otherlv_8= 'logY' otherlv_9= ':' ( (lv_logY_10_0= RULE_STRING ) ) otherlv_11= 'xDataReference' otherlv_12= ':' ( (lv_xDataReference_13_0= RULE_STRING ) ) otherlv_14= 'yDataReference' otherlv_15= ':' ( (lv_yDataReference_16_0= RULE_STRING ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,125,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCurveAccess().getCurveKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getCurveAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCurveAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getCurveAccess().getColonKeyword_3());
            		
            // InternalSedml.g:5819:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:5820:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:5820:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:5821:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_127); 

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

            otherlv_5=(Token)match(input,119,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCurveAccess().getLogXKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getCurveAccess().getColonKeyword_6());
            		
            // InternalSedml.g:5845:3: ( (lv_logX_7_0= RULE_STRING ) )
            // InternalSedml.g:5846:4: (lv_logX_7_0= RULE_STRING )
            {
            // InternalSedml.g:5846:4: (lv_logX_7_0= RULE_STRING )
            // InternalSedml.g:5847:5: lv_logX_7_0= RULE_STRING
            {
            lv_logX_7_0=(Token)match(input,RULE_STRING,FOLLOW_128); 

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

            otherlv_8=(Token)match(input,120,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getCurveAccess().getLogYKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getCurveAccess().getColonKeyword_9());
            		
            // InternalSedml.g:5871:3: ( (lv_logY_10_0= RULE_STRING ) )
            // InternalSedml.g:5872:4: (lv_logY_10_0= RULE_STRING )
            {
            // InternalSedml.g:5872:4: (lv_logY_10_0= RULE_STRING )
            // InternalSedml.g:5873:5: lv_logY_10_0= RULE_STRING
            {
            lv_logY_10_0=(Token)match(input,RULE_STRING,FOLLOW_130); 

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

            otherlv_11=(Token)match(input,122,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getCurveAccess().getXDataReferenceKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getCurveAccess().getColonKeyword_12());
            		
            // InternalSedml.g:5897:3: ( (lv_xDataReference_13_0= RULE_STRING ) )
            // InternalSedml.g:5898:4: (lv_xDataReference_13_0= RULE_STRING )
            {
            // InternalSedml.g:5898:4: (lv_xDataReference_13_0= RULE_STRING )
            // InternalSedml.g:5899:5: lv_xDataReference_13_0= RULE_STRING
            {
            lv_xDataReference_13_0=(Token)match(input,RULE_STRING,FOLLOW_131); 

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

            otherlv_14=(Token)match(input,123,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getCurveAccess().getYDataReferenceKeyword_14());
            		
            otherlv_15=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getCurveAccess().getColonKeyword_15());
            		
            // InternalSedml.g:5923:3: ( (lv_yDataReference_16_0= RULE_STRING ) )
            // InternalSedml.g:5924:4: (lv_yDataReference_16_0= RULE_STRING )
            {
            // InternalSedml.g:5924:4: (lv_yDataReference_16_0= RULE_STRING )
            // InternalSedml.g:5925:5: lv_yDataReference_16_0= RULE_STRING
            {
            lv_yDataReference_16_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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
    // InternalSedml.g:5949:1: entryRulelistOfSimulations returns [EObject current=null] : iv_rulelistOfSimulations= rulelistOfSimulations EOF ;
    public final EObject entryRulelistOfSimulations() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfSimulations = null;


        try {
            // InternalSedml.g:5949:58: (iv_rulelistOfSimulations= rulelistOfSimulations EOF )
            // InternalSedml.g:5950:2: iv_rulelistOfSimulations= rulelistOfSimulations EOF
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
    // InternalSedml.g:5956:1: rulelistOfSimulations returns [EObject current=null] : (otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_simulation_2_0= rulesimulation ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfSimulations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_simulation_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:5962:2: ( (otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_simulation_2_0= rulesimulation ) )* otherlv_3= '}' ) )
            // InternalSedml.g:5963:2: (otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_simulation_2_0= rulesimulation ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:5963:2: (otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_simulation_2_0= rulesimulation ) )* otherlv_3= '}' )
            // InternalSedml.g:5964:3: otherlv_0= 'listOfSimulations' otherlv_1= '{' ( (lv_simulation_2_0= rulesimulation ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,126,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfSimulationsAccess().getListOfSimulationsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_134); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfSimulationsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:5972:3: ( (lv_simulation_2_0= rulesimulation ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==127||LA90_0==132||LA90_0==134) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalSedml.g:5973:4: (lv_simulation_2_0= rulesimulation )
            	    {
            	    // InternalSedml.g:5973:4: (lv_simulation_2_0= rulesimulation )
            	    // InternalSedml.g:5974:5: lv_simulation_2_0= rulesimulation
            	    {

            	    					newCompositeNode(grammarAccess.getListOfSimulationsAccess().getSimulationSimulationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_134);
            	    lv_simulation_2_0=rulesimulation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfSimulationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"simulation",
            	    						lv_simulation_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.simulation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
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


    // $ANTLR start "entryRulesimulation"
    // InternalSedml.g:5999:1: entryRulesimulation returns [EObject current=null] : iv_rulesimulation= rulesimulation EOF ;
    public final EObject entryRulesimulation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimulation = null;


        try {
            // InternalSedml.g:5999:51: (iv_rulesimulation= rulesimulation EOF )
            // InternalSedml.g:6000:2: iv_rulesimulation= rulesimulation EOF
            {
             newCompositeNode(grammarAccess.getSimulationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimulation=rulesimulation();

            state._fsp--;

             current =iv_rulesimulation; 
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
    // $ANTLR end "entryRulesimulation"


    // $ANTLR start "rulesimulation"
    // InternalSedml.g:6006:1: rulesimulation returns [EObject current=null] : (this_oneStep_0= ruleoneStep | ruleSteadyState | this_uniformTimeCourse_2= ruleuniformTimeCourse ) ;
    public final EObject rulesimulation() throws RecognitionException {
        EObject current = null;

        EObject this_oneStep_0 = null;

        EObject this_uniformTimeCourse_2 = null;



        	enterRule();

        try {
            // InternalSedml.g:6012:2: ( (this_oneStep_0= ruleoneStep | ruleSteadyState | this_uniformTimeCourse_2= ruleuniformTimeCourse ) )
            // InternalSedml.g:6013:2: (this_oneStep_0= ruleoneStep | ruleSteadyState | this_uniformTimeCourse_2= ruleuniformTimeCourse )
            {
            // InternalSedml.g:6013:2: (this_oneStep_0= ruleoneStep | ruleSteadyState | this_uniformTimeCourse_2= ruleuniformTimeCourse )
            int alt91=3;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt91=1;
                }
                break;
            case 134:
                {
                alt91=2;
                }
                break;
            case 127:
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
                    // InternalSedml.g:6014:3: this_oneStep_0= ruleoneStep
                    {

                    			newCompositeNode(grammarAccess.getSimulationAccess().getOneStepParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_oneStep_0=ruleoneStep();

                    state._fsp--;


                    			current = this_oneStep_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSedml.g:6023:3: ruleSteadyState
                    {

                    			newCompositeNode(grammarAccess.getSimulationAccess().getSteadyStateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    ruleSteadyState();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSedml.g:6031:3: this_uniformTimeCourse_2= ruleuniformTimeCourse
                    {

                    			newCompositeNode(grammarAccess.getSimulationAccess().getUniformTimeCourseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_uniformTimeCourse_2=ruleuniformTimeCourse();

                    state._fsp--;


                    			current = this_uniformTimeCourse_2;
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
    // $ANTLR end "rulesimulation"


    // $ANTLR start "entryRuleuniformTimeCourse"
    // InternalSedml.g:6043:1: entryRuleuniformTimeCourse returns [EObject current=null] : iv_ruleuniformTimeCourse= ruleuniformTimeCourse EOF ;
    public final EObject entryRuleuniformTimeCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuniformTimeCourse = null;


        try {
            // InternalSedml.g:6043:58: (iv_ruleuniformTimeCourse= ruleuniformTimeCourse EOF )
            // InternalSedml.g:6044:2: iv_ruleuniformTimeCourse= ruleuniformTimeCourse EOF
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
    // InternalSedml.g:6050:1: ruleuniformTimeCourse returns [EObject current=null] : (otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}' ) ;
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
            // InternalSedml.g:6056:2: ( (otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}' ) )
            // InternalSedml.g:6057:2: (otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}' )
            {
            // InternalSedml.g:6057:2: (otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}' )
            // InternalSedml.g:6058:3: otherlv_0= 'uniformtimecourse' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= 'initialTime' otherlv_6= ':' ( (lv_initialTime_7_0= RULE_INT ) ) otherlv_8= 'outputStartTime' otherlv_9= ':' ( (lv_outputStartTime_10_0= RULE_INT ) ) otherlv_11= 'outputEndTime' otherlv_12= ':' ( (lv_outputEndTime_13_0= RULE_INT ) ) otherlv_14= 'numberOfPoints' otherlv_15= ':' ( (lv_numberOfPoints_16_0= RULE_INT ) ) ( (lv_algorithm_17_0= rulealgorithm ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,127,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUniformTimeCourseAccess().getUniformtimecourseKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getUniformTimeCourseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUniformTimeCourseAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_3());
            		
            // InternalSedml.g:6074:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalSedml.g:6075:4: (lv_id_4_0= RULE_ID )
            {
            // InternalSedml.g:6075:4: (lv_id_4_0= RULE_ID )
            // InternalSedml.g:6076:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_135); 

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

            otherlv_5=(Token)match(input,128,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getUniformTimeCourseAccess().getInitialTimeKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_6());
            		
            // InternalSedml.g:6100:3: ( (lv_initialTime_7_0= RULE_INT ) )
            // InternalSedml.g:6101:4: (lv_initialTime_7_0= RULE_INT )
            {
            // InternalSedml.g:6101:4: (lv_initialTime_7_0= RULE_INT )
            // InternalSedml.g:6102:5: lv_initialTime_7_0= RULE_INT
            {
            lv_initialTime_7_0=(Token)match(input,RULE_INT,FOLLOW_136); 

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

            otherlv_8=(Token)match(input,129,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getUniformTimeCourseAccess().getOutputStartTimeKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_9());
            		
            // InternalSedml.g:6126:3: ( (lv_outputStartTime_10_0= RULE_INT ) )
            // InternalSedml.g:6127:4: (lv_outputStartTime_10_0= RULE_INT )
            {
            // InternalSedml.g:6127:4: (lv_outputStartTime_10_0= RULE_INT )
            // InternalSedml.g:6128:5: lv_outputStartTime_10_0= RULE_INT
            {
            lv_outputStartTime_10_0=(Token)match(input,RULE_INT,FOLLOW_137); 

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

            otherlv_11=(Token)match(input,130,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getUniformTimeCourseAccess().getOutputEndTimeKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_12());
            		
            // InternalSedml.g:6152:3: ( (lv_outputEndTime_13_0= RULE_INT ) )
            // InternalSedml.g:6153:4: (lv_outputEndTime_13_0= RULE_INT )
            {
            // InternalSedml.g:6153:4: (lv_outputEndTime_13_0= RULE_INT )
            // InternalSedml.g:6154:5: lv_outputEndTime_13_0= RULE_INT
            {
            lv_outputEndTime_13_0=(Token)match(input,RULE_INT,FOLLOW_138); 

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

            otherlv_14=(Token)match(input,131,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getUniformTimeCourseAccess().getNumberOfPointsKeyword_14());
            		
            otherlv_15=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_15, grammarAccess.getUniformTimeCourseAccess().getColonKeyword_15());
            		
            // InternalSedml.g:6178:3: ( (lv_numberOfPoints_16_0= RULE_INT ) )
            // InternalSedml.g:6179:4: (lv_numberOfPoints_16_0= RULE_INT )
            {
            // InternalSedml.g:6179:4: (lv_numberOfPoints_16_0= RULE_INT )
            // InternalSedml.g:6180:5: lv_numberOfPoints_16_0= RULE_INT
            {
            lv_numberOfPoints_16_0=(Token)match(input,RULE_INT,FOLLOW_139); 

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

            // InternalSedml.g:6196:3: ( (lv_algorithm_17_0= rulealgorithm ) )
            // InternalSedml.g:6197:4: (lv_algorithm_17_0= rulealgorithm )
            {
            // InternalSedml.g:6197:4: (lv_algorithm_17_0= rulealgorithm )
            // InternalSedml.g:6198:5: lv_algorithm_17_0= rulealgorithm
            {

            					newCompositeNode(grammarAccess.getUniformTimeCourseAccess().getAlgorithmAlgorithmParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_8);
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


    // $ANTLR start "entryRuleoneStep"
    // InternalSedml.g:6223:1: entryRuleoneStep returns [EObject current=null] : iv_ruleoneStep= ruleoneStep EOF ;
    public final EObject entryRuleoneStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoneStep = null;


        try {
            // InternalSedml.g:6223:48: (iv_ruleoneStep= ruleoneStep EOF )
            // InternalSedml.g:6224:2: iv_ruleoneStep= ruleoneStep EOF
            {
             newCompositeNode(grammarAccess.getOneStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoneStep=ruleoneStep();

            state._fsp--;

             current =iv_ruleoneStep; 
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
    // $ANTLR end "entryRuleoneStep"


    // $ANTLR start "ruleoneStep"
    // InternalSedml.g:6230:1: ruleoneStep returns [EObject current=null] : (otherlv_0= 'oneStep' otherlv_1= '{' otherlv_2= 'step' otherlv_3= ':' ( (lv_step_4_0= ruleDOUBLE ) ) otherlv_5= '}' ) ;
    public final EObject ruleoneStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_step_4_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:6236:2: ( (otherlv_0= 'oneStep' otherlv_1= '{' otherlv_2= 'step' otherlv_3= ':' ( (lv_step_4_0= ruleDOUBLE ) ) otherlv_5= '}' ) )
            // InternalSedml.g:6237:2: (otherlv_0= 'oneStep' otherlv_1= '{' otherlv_2= 'step' otherlv_3= ':' ( (lv_step_4_0= ruleDOUBLE ) ) otherlv_5= '}' )
            {
            // InternalSedml.g:6237:2: (otherlv_0= 'oneStep' otherlv_1= '{' otherlv_2= 'step' otherlv_3= ':' ( (lv_step_4_0= ruleDOUBLE ) ) otherlv_5= '}' )
            // InternalSedml.g:6238:3: otherlv_0= 'oneStep' otherlv_1= '{' otherlv_2= 'step' otherlv_3= ':' ( (lv_step_4_0= ruleDOUBLE ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,132,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOneStepAccess().getOneStepKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_140); 

            			newLeafNode(otherlv_1, grammarAccess.getOneStepAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,133,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getOneStepAccess().getStepKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_98); 

            			newLeafNode(otherlv_3, grammarAccess.getOneStepAccess().getColonKeyword_3());
            		
            // InternalSedml.g:6254:3: ( (lv_step_4_0= ruleDOUBLE ) )
            // InternalSedml.g:6255:4: (lv_step_4_0= ruleDOUBLE )
            {
            // InternalSedml.g:6255:4: (lv_step_4_0= ruleDOUBLE )
            // InternalSedml.g:6256:5: lv_step_4_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getOneStepAccess().getStepDOUBLEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_step_4_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOneStepRule());
            					}
            					set(
            						current,
            						"step",
            						lv_step_4_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOneStepAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleoneStep"


    // $ANTLR start "entryRuleSteadyState"
    // InternalSedml.g:6281:1: entryRuleSteadyState returns [String current=null] : iv_ruleSteadyState= ruleSteadyState EOF ;
    public final String entryRuleSteadyState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSteadyState = null;


        try {
            // InternalSedml.g:6281:51: (iv_ruleSteadyState= ruleSteadyState EOF )
            // InternalSedml.g:6282:2: iv_ruleSteadyState= ruleSteadyState EOF
            {
             newCompositeNode(grammarAccess.getSteadyStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSteadyState=ruleSteadyState();

            state._fsp--;

             current =iv_ruleSteadyState.getText(); 
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
    // $ANTLR end "entryRuleSteadyState"


    // $ANTLR start "ruleSteadyState"
    // InternalSedml.g:6288:1: ruleSteadyState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'steadyState' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleSteadyState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSedml.g:6294:2: ( (kw= 'steadyState' kw= '{' kw= '}' ) )
            // InternalSedml.g:6295:2: (kw= 'steadyState' kw= '{' kw= '}' )
            {
            // InternalSedml.g:6295:2: (kw= 'steadyState' kw= '{' kw= '}' )
            // InternalSedml.g:6296:3: kw= 'steadyState' kw= '{' kw= '}'
            {
            kw=(Token)match(input,134,FOLLOW_3); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSteadyStateAccess().getSteadyStateKeyword_0());
            		
            kw=(Token)match(input,13,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSteadyStateAccess().getLeftCurlyBracketKeyword_1());
            		
            kw=(Token)match(input,14,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSteadyStateAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleSteadyState"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalSedml.g:6315:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalSedml.g:6315:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalSedml.g:6316:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalSedml.g:6322:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? (this_INT_1= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSedml.g:6328:2: ( ( (kw= '.' )? (this_INT_1= RULE_INT )? ) )
            // InternalSedml.g:6329:2: ( (kw= '.' )? (this_INT_1= RULE_INT )? )
            {
            // InternalSedml.g:6329:2: ( (kw= '.' )? (this_INT_1= RULE_INT )? )
            // InternalSedml.g:6330:3: (kw= '.' )? (this_INT_1= RULE_INT )?
            {
            // InternalSedml.g:6330:3: (kw= '.' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==135) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalSedml.g:6331:4: kw= '.'
                    {
                    kw=(Token)match(input,135,FOLLOW_141); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSedml.g:6337:3: (this_INT_1= RULE_INT )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_INT) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalSedml.g:6338:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1());
                    			

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRulealgorithm"
    // InternalSedml.g:6350:1: entryRulealgorithm returns [EObject current=null] : iv_rulealgorithm= rulealgorithm EOF ;
    public final EObject entryRulealgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulealgorithm = null;


        try {
            // InternalSedml.g:6350:50: (iv_rulealgorithm= rulealgorithm EOF )
            // InternalSedml.g:6351:2: iv_rulealgorithm= rulealgorithm EOF
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
    // InternalSedml.g:6357:1: rulealgorithm returns [EObject current=null] : (otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) ( (lv_ListOfAlgorithmParameters_5_0= rulelistOfAlgorithmParameters ) ) otherlv_6= '}' ) ;
    public final EObject rulealgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_kisaoID_4_0=null;
        Token otherlv_6=null;
        EObject lv_ListOfAlgorithmParameters_5_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:6363:2: ( (otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) ( (lv_ListOfAlgorithmParameters_5_0= rulelistOfAlgorithmParameters ) ) otherlv_6= '}' ) )
            // InternalSedml.g:6364:2: (otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) ( (lv_ListOfAlgorithmParameters_5_0= rulelistOfAlgorithmParameters ) ) otherlv_6= '}' )
            {
            // InternalSedml.g:6364:2: (otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) ( (lv_ListOfAlgorithmParameters_5_0= rulelistOfAlgorithmParameters ) ) otherlv_6= '}' )
            // InternalSedml.g:6365:3: otherlv_0= 'algorithm' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) ( (lv_ListOfAlgorithmParameters_5_0= rulelistOfAlgorithmParameters ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,136,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmAccess().getAlgorithmKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_142); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgorithmAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,137,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAlgorithmAccess().getKisaoIDKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getAlgorithmAccess().getColonKeyword_3());
            		
            // InternalSedml.g:6381:3: ( (lv_kisaoID_4_0= RULE_STRING ) )
            // InternalSedml.g:6382:4: (lv_kisaoID_4_0= RULE_STRING )
            {
            // InternalSedml.g:6382:4: (lv_kisaoID_4_0= RULE_STRING )
            // InternalSedml.g:6383:5: lv_kisaoID_4_0= RULE_STRING
            {
            lv_kisaoID_4_0=(Token)match(input,RULE_STRING,FOLLOW_143); 

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

            // InternalSedml.g:6399:3: ( (lv_ListOfAlgorithmParameters_5_0= rulelistOfAlgorithmParameters ) )
            // InternalSedml.g:6400:4: (lv_ListOfAlgorithmParameters_5_0= rulelistOfAlgorithmParameters )
            {
            // InternalSedml.g:6400:4: (lv_ListOfAlgorithmParameters_5_0= rulelistOfAlgorithmParameters )
            // InternalSedml.g:6401:5: lv_ListOfAlgorithmParameters_5_0= rulelistOfAlgorithmParameters
            {

            					newCompositeNode(grammarAccess.getAlgorithmAccess().getListOfAlgorithmParametersListOfAlgorithmParametersParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_ListOfAlgorithmParameters_5_0=rulelistOfAlgorithmParameters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmRule());
            					}
            					set(
            						current,
            						"ListOfAlgorithmParameters",
            						lv_ListOfAlgorithmParameters_5_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.listOfAlgorithmParameters");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAlgorithmAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRulelistOfAlgorithmParameters"
    // InternalSedml.g:6426:1: entryRulelistOfAlgorithmParameters returns [EObject current=null] : iv_rulelistOfAlgorithmParameters= rulelistOfAlgorithmParameters EOF ;
    public final EObject entryRulelistOfAlgorithmParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistOfAlgorithmParameters = null;


        try {
            // InternalSedml.g:6426:66: (iv_rulelistOfAlgorithmParameters= rulelistOfAlgorithmParameters EOF )
            // InternalSedml.g:6427:2: iv_rulelistOfAlgorithmParameters= rulelistOfAlgorithmParameters EOF
            {
             newCompositeNode(grammarAccess.getListOfAlgorithmParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistOfAlgorithmParameters=rulelistOfAlgorithmParameters();

            state._fsp--;

             current =iv_rulelistOfAlgorithmParameters; 
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
    // $ANTLR end "entryRulelistOfAlgorithmParameters"


    // $ANTLR start "rulelistOfAlgorithmParameters"
    // InternalSedml.g:6433:1: rulelistOfAlgorithmParameters returns [EObject current=null] : (otherlv_0= 'listOfAlgorithmParameters' otherlv_1= '{' ( (lv_AlgorithmParameter_2_0= rulealgorithmParameter ) )* otherlv_3= '}' ) ;
    public final EObject rulelistOfAlgorithmParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_AlgorithmParameter_2_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:6439:2: ( (otherlv_0= 'listOfAlgorithmParameters' otherlv_1= '{' ( (lv_AlgorithmParameter_2_0= rulealgorithmParameter ) )* otherlv_3= '}' ) )
            // InternalSedml.g:6440:2: (otherlv_0= 'listOfAlgorithmParameters' otherlv_1= '{' ( (lv_AlgorithmParameter_2_0= rulealgorithmParameter ) )* otherlv_3= '}' )
            {
            // InternalSedml.g:6440:2: (otherlv_0= 'listOfAlgorithmParameters' otherlv_1= '{' ( (lv_AlgorithmParameter_2_0= rulealgorithmParameter ) )* otherlv_3= '}' )
            // InternalSedml.g:6441:3: otherlv_0= 'listOfAlgorithmParameters' otherlv_1= '{' ( (lv_AlgorithmParameter_2_0= rulealgorithmParameter ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,138,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfAlgorithmParametersAccess().getListOfAlgorithmParametersKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_144); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfAlgorithmParametersAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSedml.g:6449:3: ( (lv_AlgorithmParameter_2_0= rulealgorithmParameter ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==139) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalSedml.g:6450:4: (lv_AlgorithmParameter_2_0= rulealgorithmParameter )
            	    {
            	    // InternalSedml.g:6450:4: (lv_AlgorithmParameter_2_0= rulealgorithmParameter )
            	    // InternalSedml.g:6451:5: lv_AlgorithmParameter_2_0= rulealgorithmParameter
            	    {

            	    					newCompositeNode(grammarAccess.getListOfAlgorithmParametersAccess().getAlgorithmParameterAlgorithmParameterParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_144);
            	    lv_AlgorithmParameter_2_0=rulealgorithmParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListOfAlgorithmParametersRule());
            	    					}
            	    					add(
            	    						current,
            	    						"AlgorithmParameter",
            	    						lv_AlgorithmParameter_2_0,
            	    						"tr.edu.metu.ceng.megamodel.sedml.Sedml.algorithmParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfAlgorithmParametersAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulelistOfAlgorithmParameters"


    // $ANTLR start "entryRulealgorithmParameter"
    // InternalSedml.g:6476:1: entryRulealgorithmParameter returns [EObject current=null] : iv_rulealgorithmParameter= rulealgorithmParameter EOF ;
    public final EObject entryRulealgorithmParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulealgorithmParameter = null;


        try {
            // InternalSedml.g:6476:59: (iv_rulealgorithmParameter= rulealgorithmParameter EOF )
            // InternalSedml.g:6477:2: iv_rulealgorithmParameter= rulealgorithmParameter EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_rulealgorithmParameter=rulealgorithmParameter();

            state._fsp--;

             current =iv_rulealgorithmParameter; 
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
    // $ANTLR end "entryRulealgorithmParameter"


    // $ANTLR start "rulealgorithmParameter"
    // InternalSedml.g:6483:1: rulealgorithmParameter returns [EObject current=null] : (otherlv_0= 'algorithmParameter' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= ruleDOUBLE ) ) otherlv_8= '}' ) ;
    public final EObject rulealgorithmParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_kisaoID_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSedml.g:6489:2: ( (otherlv_0= 'algorithmParameter' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= ruleDOUBLE ) ) otherlv_8= '}' ) )
            // InternalSedml.g:6490:2: (otherlv_0= 'algorithmParameter' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= ruleDOUBLE ) ) otherlv_8= '}' )
            {
            // InternalSedml.g:6490:2: (otherlv_0= 'algorithmParameter' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= ruleDOUBLE ) ) otherlv_8= '}' )
            // InternalSedml.g:6491:3: otherlv_0= 'algorithmParameter' otherlv_1= '{' otherlv_2= 'kisaoID' otherlv_3= ':' ( (lv_kisaoID_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= ruleDOUBLE ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,139,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmParameterAccess().getAlgorithmParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_142); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgorithmParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,137,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAlgorithmParameterAccess().getKisaoIDKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getAlgorithmParameterAccess().getColonKeyword_3());
            		
            // InternalSedml.g:6507:3: ( (lv_kisaoID_4_0= RULE_STRING ) )
            // InternalSedml.g:6508:4: (lv_kisaoID_4_0= RULE_STRING )
            {
            // InternalSedml.g:6508:4: (lv_kisaoID_4_0= RULE_STRING )
            // InternalSedml.g:6509:5: lv_kisaoID_4_0= RULE_STRING
            {
            lv_kisaoID_4_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_kisaoID_4_0, grammarAccess.getAlgorithmParameterAccess().getKisaoIDSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgorithmParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"kisaoID",
            						lv_kisaoID_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getAlgorithmParameterAccess().getValueKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_98); 

            			newLeafNode(otherlv_6, grammarAccess.getAlgorithmParameterAccess().getColonKeyword_6());
            		
            // InternalSedml.g:6533:3: ( (lv_value_7_0= ruleDOUBLE ) )
            // InternalSedml.g:6534:4: (lv_value_7_0= ruleDOUBLE )
            {
            // InternalSedml.g:6534:4: (lv_value_7_0= ruleDOUBLE )
            // InternalSedml.g:6535:5: lv_value_7_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getAlgorithmParameterAccess().getValueDOUBLEParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_7_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmParameterRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_7_0,
            						"tr.edu.metu.ceng.megamodel.sedml.Sedml.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAlgorithmParameterAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "rulealgorithmParameter"


    // $ANTLR start "ruleFunction"
    // InternalSedml.g:6560:1: ruleFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) ) ;
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
            // InternalSedml.g:6566:2: ( ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) ) )
            // InternalSedml.g:6567:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) )
            {
            // InternalSedml.g:6567:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'EXP' ) | (enumLiteral_3= 'INVERSE' ) | (enumLiteral_4= 'SIN' ) | (enumLiteral_5= 'COS' ) | (enumLiteral_6= 'TAN' ) | (enumLiteral_7= 'FACTORIAL' ) | (enumLiteral_8= 'LOG' ) )
            int alt95=9;
            switch ( input.LA(1) ) {
            case 140:
                {
                alt95=1;
                }
                break;
            case 141:
                {
                alt95=2;
                }
                break;
            case 142:
                {
                alt95=3;
                }
                break;
            case 143:
                {
                alt95=4;
                }
                break;
            case 144:
                {
                alt95=5;
                }
                break;
            case 145:
                {
                alt95=6;
                }
                break;
            case 146:
                {
                alt95=7;
                }
                break;
            case 147:
                {
                alt95=8;
                }
                break;
            case 148:
                {
                alt95=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalSedml.g:6568:3: (enumLiteral_0= 'MIN' )
                    {
                    // InternalSedml.g:6568:3: (enumLiteral_0= 'MIN' )
                    // InternalSedml.g:6569:4: enumLiteral_0= 'MIN'
                    {
                    enumLiteral_0=(Token)match(input,140,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getMINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFunctionAccess().getMINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:6576:3: (enumLiteral_1= 'MAX' )
                    {
                    // InternalSedml.g:6576:3: (enumLiteral_1= 'MAX' )
                    // InternalSedml.g:6577:4: enumLiteral_1= 'MAX'
                    {
                    enumLiteral_1=(Token)match(input,141,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getMAXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFunctionAccess().getMAXEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSedml.g:6584:3: (enumLiteral_2= 'EXP' )
                    {
                    // InternalSedml.g:6584:3: (enumLiteral_2= 'EXP' )
                    // InternalSedml.g:6585:4: enumLiteral_2= 'EXP'
                    {
                    enumLiteral_2=(Token)match(input,142,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getEXPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFunctionAccess().getEXPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSedml.g:6592:3: (enumLiteral_3= 'INVERSE' )
                    {
                    // InternalSedml.g:6592:3: (enumLiteral_3= 'INVERSE' )
                    // InternalSedml.g:6593:4: enumLiteral_3= 'INVERSE'
                    {
                    enumLiteral_3=(Token)match(input,143,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getINVERSEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFunctionAccess().getINVERSEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSedml.g:6600:3: (enumLiteral_4= 'SIN' )
                    {
                    // InternalSedml.g:6600:3: (enumLiteral_4= 'SIN' )
                    // InternalSedml.g:6601:4: enumLiteral_4= 'SIN'
                    {
                    enumLiteral_4=(Token)match(input,144,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getSINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFunctionAccess().getSINEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSedml.g:6608:3: (enumLiteral_5= 'COS' )
                    {
                    // InternalSedml.g:6608:3: (enumLiteral_5= 'COS' )
                    // InternalSedml.g:6609:4: enumLiteral_5= 'COS'
                    {
                    enumLiteral_5=(Token)match(input,145,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getCOSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFunctionAccess().getCOSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSedml.g:6616:3: (enumLiteral_6= 'TAN' )
                    {
                    // InternalSedml.g:6616:3: (enumLiteral_6= 'TAN' )
                    // InternalSedml.g:6617:4: enumLiteral_6= 'TAN'
                    {
                    enumLiteral_6=(Token)match(input,146,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getTANEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFunctionAccess().getTANEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSedml.g:6624:3: (enumLiteral_7= 'FACTORIAL' )
                    {
                    // InternalSedml.g:6624:3: (enumLiteral_7= 'FACTORIAL' )
                    // InternalSedml.g:6625:4: enumLiteral_7= 'FACTORIAL'
                    {
                    enumLiteral_7=(Token)match(input,147,FOLLOW_2); 

                    				current = grammarAccess.getFunctionAccess().getFACTORIALEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFunctionAccess().getFACTORIALEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSedml.g:6632:3: (enumLiteral_8= 'LOG' )
                    {
                    // InternalSedml.g:6632:3: (enumLiteral_8= 'LOG' )
                    // InternalSedml.g:6633:4: enumLiteral_8= 'LOG'
                    {
                    enumLiteral_8=(Token)match(input,148,FOLLOW_2); 

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
    // InternalSedml.g:6643:1: ruleLevels returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) ;
    public final Enumerator ruleLevels() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSedml.g:6649:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) )
            // InternalSedml.g:6650:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            {
            // InternalSedml.g:6650:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            int alt96=3;
            switch ( input.LA(1) ) {
            case 149:
                {
                alt96=1;
                }
                break;
            case 150:
                {
                alt96=2;
                }
                break;
            case 151:
                {
                alt96=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalSedml.g:6651:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalSedml.g:6651:3: (enumLiteral_0= 'HIGH' )
                    // InternalSedml.g:6652:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,149,FOLLOW_2); 

                    				current = grammarAccess.getLevelsAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLevelsAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:6659:3: (enumLiteral_1= 'MEDIUM' )
                    {
                    // InternalSedml.g:6659:3: (enumLiteral_1= 'MEDIUM' )
                    // InternalSedml.g:6660:4: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,150,FOLLOW_2); 

                    				current = grammarAccess.getLevelsAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLevelsAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSedml.g:6667:3: (enumLiteral_2= 'LOW' )
                    {
                    // InternalSedml.g:6667:3: (enumLiteral_2= 'LOW' )
                    // InternalSedml.g:6668:4: enumLiteral_2= 'LOW'
                    {
                    enumLiteral_2=(Token)match(input,151,FOLLOW_2); 

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
    // InternalSedml.g:6678:1: ruleExpression returns [Enumerator current=null] : ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) ;
    public final Enumerator ruleExpression() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSedml.g:6684:2: ( ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) )
            // InternalSedml.g:6685:2: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            {
            // InternalSedml.g:6685:2: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==152) ) {
                alt97=1;
            }
            else if ( (LA97_0==153) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalSedml.g:6686:3: (enumLiteral_0= 'TRUE' )
                    {
                    // InternalSedml.g:6686:3: (enumLiteral_0= 'TRUE' )
                    // InternalSedml.g:6687:4: enumLiteral_0= 'TRUE'
                    {
                    enumLiteral_0=(Token)match(input,152,FOLLOW_2); 

                    				current = grammarAccess.getExpressionAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getExpressionAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:6694:3: (enumLiteral_1= 'FALSE' )
                    {
                    // InternalSedml.g:6694:3: (enumLiteral_1= 'FALSE' )
                    // InternalSedml.g:6695:4: enumLiteral_1= 'FALSE'
                    {
                    enumLiteral_1=(Token)match(input,153,FOLLOW_2); 

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
    // InternalSedml.g:6705:1: ruleLinks returns [Enumerator current=null] : ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) ) ;
    public final Enumerator ruleLinks() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSedml.g:6711:2: ( ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) ) )
            // InternalSedml.g:6712:2: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) )
            {
            // InternalSedml.g:6712:2: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'occurs' ) | (enumLiteral_2= 'to' ) | (enumLiteral_3= 'in' ) )
            int alt98=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt98=1;
                }
                break;
            case 154:
                {
                alt98=2;
                }
                break;
            case 52:
                {
                alt98=3;
                }
                break;
            case 155:
                {
                alt98=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalSedml.g:6713:3: (enumLiteral_0= 'is' )
                    {
                    // InternalSedml.g:6713:3: (enumLiteral_0= 'is' )
                    // InternalSedml.g:6714:4: enumLiteral_0= 'is'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getLinksAccess().getIsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLinksAccess().getIsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:6721:3: (enumLiteral_1= 'occurs' )
                    {
                    // InternalSedml.g:6721:3: (enumLiteral_1= 'occurs' )
                    // InternalSedml.g:6722:4: enumLiteral_1= 'occurs'
                    {
                    enumLiteral_1=(Token)match(input,154,FOLLOW_2); 

                    				current = grammarAccess.getLinksAccess().getOccursEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLinksAccess().getOccursEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSedml.g:6729:3: (enumLiteral_2= 'to' )
                    {
                    // InternalSedml.g:6729:3: (enumLiteral_2= 'to' )
                    // InternalSedml.g:6730:4: enumLiteral_2= 'to'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getLinksAccess().getToEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLinksAccess().getToEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSedml.g:6737:3: (enumLiteral_3= 'in' )
                    {
                    // InternalSedml.g:6737:3: (enumLiteral_3= 'in' )
                    // InternalSedml.g:6738:4: enumLiteral_3= 'in'
                    {
                    enumLiteral_3=(Token)match(input,155,FOLLOW_2); 

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
    // InternalSedml.g:6748:1: ruleTemporal returns [Enumerator current=null] : ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) ) ;
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
            // InternalSedml.g:6754:2: ( ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) ) )
            // InternalSedml.g:6755:2: ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) )
            {
            // InternalSedml.g:6755:2: ( (enumLiteral_0= 'precedes' ) | (enumLiteral_1= 'between' ) | (enumLiteral_2= 'eventually' ) | (enumLiteral_3= 'always' ) | (enumLiteral_4= 'before' ) | (enumLiteral_5= 'after' ) | (enumLiteral_6= 'until' ) | (enumLiteral_7= 'never' ) | (enumLiteral_8= 'leads' ) | (enumLiteral_9= 'absent' ) | (enumLiteral_10= 'exists' ) )
            int alt99=11;
            switch ( input.LA(1) ) {
            case 156:
                {
                alt99=1;
                }
                break;
            case 157:
                {
                alt99=2;
                }
                break;
            case 158:
                {
                alt99=3;
                }
                break;
            case 159:
                {
                alt99=4;
                }
                break;
            case 160:
                {
                alt99=5;
                }
                break;
            case 161:
                {
                alt99=6;
                }
                break;
            case 162:
                {
                alt99=7;
                }
                break;
            case 163:
                {
                alt99=8;
                }
                break;
            case 164:
                {
                alt99=9;
                }
                break;
            case 165:
                {
                alt99=10;
                }
                break;
            case 166:
                {
                alt99=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalSedml.g:6756:3: (enumLiteral_0= 'precedes' )
                    {
                    // InternalSedml.g:6756:3: (enumLiteral_0= 'precedes' )
                    // InternalSedml.g:6757:4: enumLiteral_0= 'precedes'
                    {
                    enumLiteral_0=(Token)match(input,156,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getPrecedesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTemporalAccess().getPrecedesEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:6764:3: (enumLiteral_1= 'between' )
                    {
                    // InternalSedml.g:6764:3: (enumLiteral_1= 'between' )
                    // InternalSedml.g:6765:4: enumLiteral_1= 'between'
                    {
                    enumLiteral_1=(Token)match(input,157,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getBetweenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTemporalAccess().getBetweenEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSedml.g:6772:3: (enumLiteral_2= 'eventually' )
                    {
                    // InternalSedml.g:6772:3: (enumLiteral_2= 'eventually' )
                    // InternalSedml.g:6773:4: enumLiteral_2= 'eventually'
                    {
                    enumLiteral_2=(Token)match(input,158,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getEventuallyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTemporalAccess().getEventuallyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSedml.g:6780:3: (enumLiteral_3= 'always' )
                    {
                    // InternalSedml.g:6780:3: (enumLiteral_3= 'always' )
                    // InternalSedml.g:6781:4: enumLiteral_3= 'always'
                    {
                    enumLiteral_3=(Token)match(input,159,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getAlwaysEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTemporalAccess().getAlwaysEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSedml.g:6788:3: (enumLiteral_4= 'before' )
                    {
                    // InternalSedml.g:6788:3: (enumLiteral_4= 'before' )
                    // InternalSedml.g:6789:4: enumLiteral_4= 'before'
                    {
                    enumLiteral_4=(Token)match(input,160,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getBeforeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTemporalAccess().getBeforeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSedml.g:6796:3: (enumLiteral_5= 'after' )
                    {
                    // InternalSedml.g:6796:3: (enumLiteral_5= 'after' )
                    // InternalSedml.g:6797:4: enumLiteral_5= 'after'
                    {
                    enumLiteral_5=(Token)match(input,161,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getAfterEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTemporalAccess().getAfterEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSedml.g:6804:3: (enumLiteral_6= 'until' )
                    {
                    // InternalSedml.g:6804:3: (enumLiteral_6= 'until' )
                    // InternalSedml.g:6805:4: enumLiteral_6= 'until'
                    {
                    enumLiteral_6=(Token)match(input,162,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getUntilEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTemporalAccess().getUntilEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSedml.g:6812:3: (enumLiteral_7= 'never' )
                    {
                    // InternalSedml.g:6812:3: (enumLiteral_7= 'never' )
                    // InternalSedml.g:6813:4: enumLiteral_7= 'never'
                    {
                    enumLiteral_7=(Token)match(input,163,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getNeverEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTemporalAccess().getNeverEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSedml.g:6820:3: (enumLiteral_8= 'leads' )
                    {
                    // InternalSedml.g:6820:3: (enumLiteral_8= 'leads' )
                    // InternalSedml.g:6821:4: enumLiteral_8= 'leads'
                    {
                    enumLiteral_8=(Token)match(input,164,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getLeadsEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTemporalAccess().getLeadsEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSedml.g:6828:3: (enumLiteral_9= 'absent' )
                    {
                    // InternalSedml.g:6828:3: (enumLiteral_9= 'absent' )
                    // InternalSedml.g:6829:4: enumLiteral_9= 'absent'
                    {
                    enumLiteral_9=(Token)match(input,165,FOLLOW_2); 

                    				current = grammarAccess.getTemporalAccess().getAbsentEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getTemporalAccess().getAbsentEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalSedml.g:6836:3: (enumLiteral_10= 'exists' )
                    {
                    // InternalSedml.g:6836:3: (enumLiteral_10= 'exists' )
                    // InternalSedml.g:6837:4: enumLiteral_10= 'exists'
                    {
                    enumLiteral_10=(Token)match(input,166,FOLLOW_2); 

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
    // InternalSedml.g:6847:1: ruleLogical returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) ) ;
    public final Enumerator ruleLogical() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSedml.g:6853:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) ) )
            // InternalSedml.g:6854:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) )
            {
            // InternalSedml.g:6854:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) )
            int alt100=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt100=1;
                }
                break;
            case 167:
                {
                alt100=2;
                }
                break;
            case 168:
                {
                alt100=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalSedml.g:6855:3: (enumLiteral_0= 'and' )
                    {
                    // InternalSedml.g:6855:3: (enumLiteral_0= 'and' )
                    // InternalSedml.g:6856:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getLogicalAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:6863:3: (enumLiteral_1= 'or' )
                    {
                    // InternalSedml.g:6863:3: (enumLiteral_1= 'or' )
                    // InternalSedml.g:6864:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,167,FOLLOW_2); 

                    				current = grammarAccess.getLogicalAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicalAccess().getOrEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSedml.g:6871:3: (enumLiteral_2= 'not' )
                    {
                    // InternalSedml.g:6871:3: (enumLiteral_2= 'not' )
                    // InternalSedml.g:6872:4: enumLiteral_2= 'not'
                    {
                    enumLiteral_2=(Token)match(input,168,FOLLOW_2); 

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
    // InternalSedml.g:6882:1: ruleCoherence returns [Enumerator current=null] : ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) ) ;
    public final Enumerator ruleCoherence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSedml.g:6888:2: ( ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) ) )
            // InternalSedml.g:6889:2: ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) )
            {
            // InternalSedml.g:6889:2: ( (enumLiteral_0= 'EXPLAIN' ) | (enumLiteral_1= 'ANALOGOUS' ) | (enumLiteral_2= 'DATA' ) | (enumLiteral_3= 'CONTRADICT' ) )
            int alt101=4;
            switch ( input.LA(1) ) {
            case 169:
                {
                alt101=1;
                }
                break;
            case 170:
                {
                alt101=2;
                }
                break;
            case 171:
                {
                alt101=3;
                }
                break;
            case 172:
                {
                alt101=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalSedml.g:6890:3: (enumLiteral_0= 'EXPLAIN' )
                    {
                    // InternalSedml.g:6890:3: (enumLiteral_0= 'EXPLAIN' )
                    // InternalSedml.g:6891:4: enumLiteral_0= 'EXPLAIN'
                    {
                    enumLiteral_0=(Token)match(input,169,FOLLOW_2); 

                    				current = grammarAccess.getCoherenceAccess().getEXPLAINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCoherenceAccess().getEXPLAINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSedml.g:6898:3: (enumLiteral_1= 'ANALOGOUS' )
                    {
                    // InternalSedml.g:6898:3: (enumLiteral_1= 'ANALOGOUS' )
                    // InternalSedml.g:6899:4: enumLiteral_1= 'ANALOGOUS'
                    {
                    enumLiteral_1=(Token)match(input,170,FOLLOW_2); 

                    				current = grammarAccess.getCoherenceAccess().getANALOGOUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCoherenceAccess().getANALOGOUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSedml.g:6906:3: (enumLiteral_2= 'DATA' )
                    {
                    // InternalSedml.g:6906:3: (enumLiteral_2= 'DATA' )
                    // InternalSedml.g:6907:4: enumLiteral_2= 'DATA'
                    {
                    enumLiteral_2=(Token)match(input,171,FOLLOW_2); 

                    				current = grammarAccess.getCoherenceAccess().getDATAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCoherenceAccess().getDATAEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSedml.g:6914:3: (enumLiteral_3= 'CONTRADICT' )
                    {
                    // InternalSedml.g:6914:3: (enumLiteral_3= 'CONTRADICT' )
                    // InternalSedml.g:6915:4: enumLiteral_3= 'CONTRADICT'
                    {
                    enumLiteral_3=(Token)match(input,172,FOLLOW_2); 

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


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA57 dfa57 = new DFA57(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\13\uffff\2\11";
    static final String dfa_3s = "\1\57\1\6\1\uffff\2\6\1\uffff\1\60\2\6\1\uffff\1\60\2\6";
    static final String dfa_4s = "\1\66\1\65\1\uffff\1\60\1\70\1\uffff\1\60\1\67\1\72\1\uffff\1\60\2\72";
    static final String dfa_5s = "\2\uffff\1\2\2\uffff\1\3\3\uffff\1\1\3\uffff";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\6\uffff\1\2",
            "\1\3\51\uffff\1\4\4\uffff\1\5",
            "",
            "\1\6\51\uffff\1\4",
            "\1\5\1\7\50\uffff\1\5\3\11\1\uffff\1\10\1\uffff\2\5",
            "",
            "\1\4",
            "\1\5\51\uffff\1\5\3\11\1\uffff\1\10\1\uffff\1\5",
            "\1\12\63\uffff\1\5",
            "",
            "\1\13",
            "\1\5\1\14\6\uffff\1\11\40\uffff\1\11\3\uffff\1\11\2\uffff\1\11\2\5\1\uffff\1\5",
            "\1\5\7\uffff\1\11\40\uffff\1\11\3\uffff\1\11\2\uffff\1\11\1\5\2\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1626:2: (this_Query1_0= ruleQuery1 | this_Query2_1= ruleQuery2 | this_Query3_2= ruleQuery3 )";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\1\3\21\uffff";
    static final String dfa_10s = "\1\6\1\uffff\1\6\1\uffff\1\67\4\6\1\uffff\1\6\2\67\1\75\2\6\1\67\1\75";
    static final String dfa_11s = "\1\u00a8\1\uffff\1\6\1\uffff\1\u00a8\1\75\3\6\1\uffff\1\6\2\u00a8\2\75\1\6\1\u00a8\1\75";
    static final String dfa_12s = "\1\uffff\1\1\1\uffff\1\2\5\uffff\1\1\10\uffff";
    static final String dfa_13s = "\22\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\3\6\uffff\1\3\41\uffff\1\3\3\uffff\1\3\2\uffff\1\3\6\uffff\1\3\20\uffff\1\2\110\uffff\21\3",
            "",
            "\1\4",
            "",
            "\1\6\4\uffff\1\5\23\uffff\1\11\126\uffff\1\7\1\10",
            "\1\12\66\uffff\1\13",
            "\1\14",
            "\1\14",
            "\1\14",
            "",
            "\1\15",
            "\1\6\30\uffff\1\11\126\uffff\1\7\1\10",
            "\1\6\4\uffff\1\16\23\uffff\1\11\126\uffff\1\7\1\10",
            "\1\13",
            "\1\17\66\uffff\1\20",
            "\1\21",
            "\1\6\30\uffff\1\11\126\uffff\1\7\1\10",
            "\1\20"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2789:3: ( (lv_e_2_0= ruleEvent ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000069C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00005C0000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000580000004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000500000004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x00001E0000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040800000004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x002E000000000080L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x002E000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x002C000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0008000000000082L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0080000000000040L,0x0000000000000000L,0x00000000001FF000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000000L,0x00000000001FF000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0021000000000040L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x01A10000000000C0L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x00A10000000000C0L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x00A1000000000040L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x05800000000000C0L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x04800000000000C0L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0480000000000040L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x2000000000000040L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000042L,0x0000000000008000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x4000000000000040L,0x0000000000008000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0091000000000002L,0x0000000000000000L,0x000001FFFF000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0091000000000002L,0x0000000000000000L,0x000001FFFC000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x00000000000000C2L,0x000000000000FFFFL,0x0000000003000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x00000000000000C2L,0x0000000000008000L,0x0000000003000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0080000000000000L,0x0000000000010000L,0x000001FFF0000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000200000004000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000004000L,0x0000000000080000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000104000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000104000L,0x0000000000200000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000004000L,0x0000000000400000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000004020L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000004000L,0x0000000001000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000004000L,0x0000020040000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000004000L,0x0000000040000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000004000L,0x0000005100000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000020L,0x0000000400000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000004000L,0x0000000000100000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000004000L,0x0003800000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000004000L,0x0008000000000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000004000L,0x2000000000000000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000004000L,0x8000000000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0000000000000800L});

}