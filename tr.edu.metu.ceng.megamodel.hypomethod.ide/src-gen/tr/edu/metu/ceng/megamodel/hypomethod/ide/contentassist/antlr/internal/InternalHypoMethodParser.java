package tr.edu.metu.ceng.megamodel.hypomethod.ide.contentassist.antlr.internal;

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
import tr.edu.metu.ceng.megamodel.hypomethod.services.HypoMethodGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHypoMethodParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_RANGEVALUE", "RULE_FACTORLEVELVALUE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'%'", "' = '", "' == '", "'&&'", "'||'", "'<'", "'<='", "'>'", "'>='", "'!'", "'!='", "'QUALITATIVE'", "'QUANTITATIVE'", "'CONTINOUS'", "'DISCRETE'", "'BINARY'", "'NONBINARY'", "'TRUE'", "'FALSE'", "'is'", "'occurs'", "'to'", "'in'", "'precedes'", "'between'", "'eventually'", "'always'", "'before'", "'after'", "'until'", "'never'", "'leads'", "'absent'", "'exists'", "'and'", "'or'", "'not'", "'EXPLAIN'", "'ANALOGOUS'", "'DATA'", "'CONTRADICT'", "'MIN'", "'MAX'", "'EXP'", "'INVERSE'", "'SIN'", "'COS'", "'TAN'", "'FACTORIAL'", "'LOG'", "'HIGH'", "'MEDIUM'", "'LOW'", "'FULLFACTORIAL'", "'FRACTIONALFACTORIAL'", "'OTHERS'", "'SIMPLE'", "'COMPOSITE'", "'model'", "'{'", "'}'", "'mechanism'", "' -> '", "' + '", "']'", "'event'", "'parameter'", "'with'", "'values'", "'properties'", "':'", "','", "'goal'", "'object'", "'of'", "'study'", "'purpose'", "'focus'", "'view point'", "'context'", "'hypotheses'", "'mechanistic'", "'evidence'", "'coherence'", "'relational'", "'('", "')'", "'activation'", "'weight'", "'['", "'if'", "'added'", "'removed'", "'then'", "'in the range'", "'compare'", "'where'", "'at'", "'level'", "'for'", "'experiment'", "'design'", "'performance measure'", "'designType'", "'constraints'", "'variables'", "'independent'", "'control'", "'type'", "'dependent'", "'are'", "'levels'", "'number'", "'iterations'", "'='", "' +-'"
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

    	public void setGrammarAccess(HypoMethodGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalHypoMethod.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalHypoMethod.g:54:1: ( ruleModel EOF )
            // InternalHypoMethod.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalHypoMethod.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalHypoMethod.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalHypoMethod.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalHypoMethod.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalHypoMethod.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==75||LA1_0==89||LA1_0==97||LA1_0==117) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHypoMethod.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExperimentOntology"
    // InternalHypoMethod.g:78:1: entryRuleExperimentOntology : ruleExperimentOntology EOF ;
    public final void entryRuleExperimentOntology() throws RecognitionException {
        try {
            // InternalHypoMethod.g:79:1: ( ruleExperimentOntology EOF )
            // InternalHypoMethod.g:80:1: ruleExperimentOntology EOF
            {
             before(grammarAccess.getExperimentOntologyRule()); 
            pushFollow(FOLLOW_1);
            ruleExperimentOntology();

            state._fsp--;

             after(grammarAccess.getExperimentOntologyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExperimentOntology"


    // $ANTLR start "ruleExperimentOntology"
    // InternalHypoMethod.g:87:1: ruleExperimentOntology : ( ( rule__ExperimentOntology__Alternatives ) ) ;
    public final void ruleExperimentOntology() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:91:2: ( ( ( rule__ExperimentOntology__Alternatives ) ) )
            // InternalHypoMethod.g:92:2: ( ( rule__ExperimentOntology__Alternatives ) )
            {
            // InternalHypoMethod.g:92:2: ( ( rule__ExperimentOntology__Alternatives ) )
            // InternalHypoMethod.g:93:3: ( rule__ExperimentOntology__Alternatives )
            {
             before(grammarAccess.getExperimentOntologyAccess().getAlternatives()); 
            // InternalHypoMethod.g:94:3: ( rule__ExperimentOntology__Alternatives )
            // InternalHypoMethod.g:94:4: rule__ExperimentOntology__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentOntology__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExperimentOntologyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExperimentOntology"


    // $ANTLR start "entryRuleModelSection"
    // InternalHypoMethod.g:103:1: entryRuleModelSection : ruleModelSection EOF ;
    public final void entryRuleModelSection() throws RecognitionException {
        try {
            // InternalHypoMethod.g:104:1: ( ruleModelSection EOF )
            // InternalHypoMethod.g:105:1: ruleModelSection EOF
            {
             before(grammarAccess.getModelSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleModelSection();

            state._fsp--;

             after(grammarAccess.getModelSectionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelSection"


    // $ANTLR start "ruleModelSection"
    // InternalHypoMethod.g:112:1: ruleModelSection : ( ( rule__ModelSection__Group__0 ) ) ;
    public final void ruleModelSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:116:2: ( ( ( rule__ModelSection__Group__0 ) ) )
            // InternalHypoMethod.g:117:2: ( ( rule__ModelSection__Group__0 ) )
            {
            // InternalHypoMethod.g:117:2: ( ( rule__ModelSection__Group__0 ) )
            // InternalHypoMethod.g:118:3: ( rule__ModelSection__Group__0 )
            {
             before(grammarAccess.getModelSectionAccess().getGroup()); 
            // InternalHypoMethod.g:119:3: ( rule__ModelSection__Group__0 )
            // InternalHypoMethod.g:119:4: rule__ModelSection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelSection"


    // $ANTLR start "entryRuleMechanism"
    // InternalHypoMethod.g:128:1: entryRuleMechanism : ruleMechanism EOF ;
    public final void entryRuleMechanism() throws RecognitionException {
        try {
            // InternalHypoMethod.g:129:1: ( ruleMechanism EOF )
            // InternalHypoMethod.g:130:1: ruleMechanism EOF
            {
             before(grammarAccess.getMechanismRule()); 
            pushFollow(FOLLOW_1);
            ruleMechanism();

            state._fsp--;

             after(grammarAccess.getMechanismRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMechanism"


    // $ANTLR start "ruleMechanism"
    // InternalHypoMethod.g:137:1: ruleMechanism : ( ( rule__Mechanism__Group__0 ) ) ;
    public final void ruleMechanism() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:141:2: ( ( ( rule__Mechanism__Group__0 ) ) )
            // InternalHypoMethod.g:142:2: ( ( rule__Mechanism__Group__0 ) )
            {
            // InternalHypoMethod.g:142:2: ( ( rule__Mechanism__Group__0 ) )
            // InternalHypoMethod.g:143:3: ( rule__Mechanism__Group__0 )
            {
             before(grammarAccess.getMechanismAccess().getGroup()); 
            // InternalHypoMethod.g:144:3: ( rule__Mechanism__Group__0 )
            // InternalHypoMethod.g:144:4: rule__Mechanism__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mechanism__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMechanismAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMechanism"


    // $ANTLR start "entryRuleReaction"
    // InternalHypoMethod.g:153:1: entryRuleReaction : ruleReaction EOF ;
    public final void entryRuleReaction() throws RecognitionException {
        try {
            // InternalHypoMethod.g:154:1: ( ruleReaction EOF )
            // InternalHypoMethod.g:155:1: ruleReaction EOF
            {
             before(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_1);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getReactionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // InternalHypoMethod.g:162:1: ruleReaction : ( ( rule__Reaction__Group__0 ) ) ;
    public final void ruleReaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:166:2: ( ( ( rule__Reaction__Group__0 ) ) )
            // InternalHypoMethod.g:167:2: ( ( rule__Reaction__Group__0 ) )
            {
            // InternalHypoMethod.g:167:2: ( ( rule__Reaction__Group__0 ) )
            // InternalHypoMethod.g:168:3: ( rule__Reaction__Group__0 )
            {
             before(grammarAccess.getReactionAccess().getGroup()); 
            // InternalHypoMethod.g:169:3: ( rule__Reaction__Group__0 )
            // InternalHypoMethod.g:169:4: rule__Reaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReaction"


    // $ANTLR start "entryRuleGuardCondition"
    // InternalHypoMethod.g:178:1: entryRuleGuardCondition : ruleGuardCondition EOF ;
    public final void entryRuleGuardCondition() throws RecognitionException {
        try {
            // InternalHypoMethod.g:179:1: ( ruleGuardCondition EOF )
            // InternalHypoMethod.g:180:1: ruleGuardCondition EOF
            {
             before(grammarAccess.getGuardConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleGuardCondition();

            state._fsp--;

             after(grammarAccess.getGuardConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGuardCondition"


    // $ANTLR start "ruleGuardCondition"
    // InternalHypoMethod.g:187:1: ruleGuardCondition : ( ( rule__GuardCondition__Group__0 ) ) ;
    public final void ruleGuardCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:191:2: ( ( ( rule__GuardCondition__Group__0 ) ) )
            // InternalHypoMethod.g:192:2: ( ( rule__GuardCondition__Group__0 ) )
            {
            // InternalHypoMethod.g:192:2: ( ( rule__GuardCondition__Group__0 ) )
            // InternalHypoMethod.g:193:3: ( rule__GuardCondition__Group__0 )
            {
             before(grammarAccess.getGuardConditionAccess().getGroup()); 
            // InternalHypoMethod.g:194:3: ( rule__GuardCondition__Group__0 )
            // InternalHypoMethod.g:194:4: rule__GuardCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GuardCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuardConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuardCondition"


    // $ANTLR start "entryRuleLinkOperators"
    // InternalHypoMethod.g:203:1: entryRuleLinkOperators : ruleLinkOperators EOF ;
    public final void entryRuleLinkOperators() throws RecognitionException {
        try {
            // InternalHypoMethod.g:204:1: ( ruleLinkOperators EOF )
            // InternalHypoMethod.g:205:1: ruleLinkOperators EOF
            {
             before(grammarAccess.getLinkOperatorsRule()); 
            pushFollow(FOLLOW_1);
            ruleLinkOperators();

            state._fsp--;

             after(grammarAccess.getLinkOperatorsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLinkOperators"


    // $ANTLR start "ruleLinkOperators"
    // InternalHypoMethod.g:212:1: ruleLinkOperators : ( ( rule__LinkOperators__Alternatives ) ) ;
    public final void ruleLinkOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:216:2: ( ( ( rule__LinkOperators__Alternatives ) ) )
            // InternalHypoMethod.g:217:2: ( ( rule__LinkOperators__Alternatives ) )
            {
            // InternalHypoMethod.g:217:2: ( ( rule__LinkOperators__Alternatives ) )
            // InternalHypoMethod.g:218:3: ( rule__LinkOperators__Alternatives )
            {
             before(grammarAccess.getLinkOperatorsAccess().getAlternatives()); 
            // InternalHypoMethod.g:219:3: ( rule__LinkOperators__Alternatives )
            // InternalHypoMethod.g:219:4: rule__LinkOperators__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LinkOperators__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLinkOperatorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkOperators"


    // $ANTLR start "entryRuleEventDescriptor"
    // InternalHypoMethod.g:228:1: entryRuleEventDescriptor : ruleEventDescriptor EOF ;
    public final void entryRuleEventDescriptor() throws RecognitionException {
        try {
            // InternalHypoMethod.g:229:1: ( ruleEventDescriptor EOF )
            // InternalHypoMethod.g:230:1: ruleEventDescriptor EOF
            {
             before(grammarAccess.getEventDescriptorRule()); 
            pushFollow(FOLLOW_1);
            ruleEventDescriptor();

            state._fsp--;

             after(grammarAccess.getEventDescriptorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEventDescriptor"


    // $ANTLR start "ruleEventDescriptor"
    // InternalHypoMethod.g:237:1: ruleEventDescriptor : ( ( rule__EventDescriptor__Group__0 ) ) ;
    public final void ruleEventDescriptor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:241:2: ( ( ( rule__EventDescriptor__Group__0 ) ) )
            // InternalHypoMethod.g:242:2: ( ( rule__EventDescriptor__Group__0 ) )
            {
            // InternalHypoMethod.g:242:2: ( ( rule__EventDescriptor__Group__0 ) )
            // InternalHypoMethod.g:243:3: ( rule__EventDescriptor__Group__0 )
            {
             before(grammarAccess.getEventDescriptorAccess().getGroup()); 
            // InternalHypoMethod.g:244:3: ( rule__EventDescriptor__Group__0 )
            // InternalHypoMethod.g:244:4: rule__EventDescriptor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventDescriptor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventDescriptorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventDescriptor"


    // $ANTLR start "entryRuleFactor"
    // InternalHypoMethod.g:253:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalHypoMethod.g:254:1: ( ruleFactor EOF )
            // InternalHypoMethod.g:255:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalHypoMethod.g:262:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:266:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalHypoMethod.g:267:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalHypoMethod.g:267:2: ( ( rule__Factor__Group__0 ) )
            // InternalHypoMethod.g:268:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalHypoMethod.g:269:3: ( rule__Factor__Group__0 )
            // InternalHypoMethod.g:269:4: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleproperties"
    // InternalHypoMethod.g:278:1: entryRuleproperties : ruleproperties EOF ;
    public final void entryRuleproperties() throws RecognitionException {
        try {
            // InternalHypoMethod.g:279:1: ( ruleproperties EOF )
            // InternalHypoMethod.g:280:1: ruleproperties EOF
            {
             before(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleproperties();

            state._fsp--;

             after(grammarAccess.getPropertiesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleproperties"


    // $ANTLR start "ruleproperties"
    // InternalHypoMethod.g:287:1: ruleproperties : ( ( rule__Properties__Group__0 ) ) ;
    public final void ruleproperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:291:2: ( ( ( rule__Properties__Group__0 ) ) )
            // InternalHypoMethod.g:292:2: ( ( rule__Properties__Group__0 ) )
            {
            // InternalHypoMethod.g:292:2: ( ( rule__Properties__Group__0 ) )
            // InternalHypoMethod.g:293:3: ( rule__Properties__Group__0 )
            {
             before(grammarAccess.getPropertiesAccess().getGroup()); 
            // InternalHypoMethod.g:294:3: ( rule__Properties__Group__0 )
            // InternalHypoMethod.g:294:4: rule__Properties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Properties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleproperties"


    // $ANTLR start "entryRuleValues"
    // InternalHypoMethod.g:303:1: entryRuleValues : ruleValues EOF ;
    public final void entryRuleValues() throws RecognitionException {
        try {
            // InternalHypoMethod.g:304:1: ( ruleValues EOF )
            // InternalHypoMethod.g:305:1: ruleValues EOF
            {
             before(grammarAccess.getValuesRule()); 
            pushFollow(FOLLOW_1);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getValuesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // InternalHypoMethod.g:312:1: ruleValues : ( ( rule__Values__Group__0 ) ) ;
    public final void ruleValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:316:2: ( ( ( rule__Values__Group__0 ) ) )
            // InternalHypoMethod.g:317:2: ( ( rule__Values__Group__0 ) )
            {
            // InternalHypoMethod.g:317:2: ( ( rule__Values__Group__0 ) )
            // InternalHypoMethod.g:318:3: ( rule__Values__Group__0 )
            {
             before(grammarAccess.getValuesAccess().getGroup()); 
            // InternalHypoMethod.g:319:3: ( rule__Values__Group__0 )
            // InternalHypoMethod.g:319:4: rule__Values__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleGoals"
    // InternalHypoMethod.g:328:1: entryRuleGoals : ruleGoals EOF ;
    public final void entryRuleGoals() throws RecognitionException {
        try {
            // InternalHypoMethod.g:329:1: ( ruleGoals EOF )
            // InternalHypoMethod.g:330:1: ruleGoals EOF
            {
             before(grammarAccess.getGoalsRule()); 
            pushFollow(FOLLOW_1);
            ruleGoals();

            state._fsp--;

             after(grammarAccess.getGoalsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGoals"


    // $ANTLR start "ruleGoals"
    // InternalHypoMethod.g:337:1: ruleGoals : ( ( rule__Goals__Group__0 ) ) ;
    public final void ruleGoals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:341:2: ( ( ( rule__Goals__Group__0 ) ) )
            // InternalHypoMethod.g:342:2: ( ( rule__Goals__Group__0 ) )
            {
            // InternalHypoMethod.g:342:2: ( ( rule__Goals__Group__0 ) )
            // InternalHypoMethod.g:343:3: ( rule__Goals__Group__0 )
            {
             before(grammarAccess.getGoalsAccess().getGroup()); 
            // InternalHypoMethod.g:344:3: ( rule__Goals__Group__0 )
            // InternalHypoMethod.g:344:4: rule__Goals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Goals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoalsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoals"


    // $ANTLR start "entryRuleHypothesis"
    // InternalHypoMethod.g:353:1: entryRuleHypothesis : ruleHypothesis EOF ;
    public final void entryRuleHypothesis() throws RecognitionException {
        try {
            // InternalHypoMethod.g:354:1: ( ruleHypothesis EOF )
            // InternalHypoMethod.g:355:1: ruleHypothesis EOF
            {
             before(grammarAccess.getHypothesisRule()); 
            pushFollow(FOLLOW_1);
            ruleHypothesis();

            state._fsp--;

             after(grammarAccess.getHypothesisRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHypothesis"


    // $ANTLR start "ruleHypothesis"
    // InternalHypoMethod.g:362:1: ruleHypothesis : ( ( rule__Hypothesis__Group__0 ) ) ;
    public final void ruleHypothesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:366:2: ( ( ( rule__Hypothesis__Group__0 ) ) )
            // InternalHypoMethod.g:367:2: ( ( rule__Hypothesis__Group__0 ) )
            {
            // InternalHypoMethod.g:367:2: ( ( rule__Hypothesis__Group__0 ) )
            // InternalHypoMethod.g:368:3: ( rule__Hypothesis__Group__0 )
            {
             before(grammarAccess.getHypothesisAccess().getGroup()); 
            // InternalHypoMethod.g:369:3: ( rule__Hypothesis__Group__0 )
            // InternalHypoMethod.g:369:4: rule__Hypothesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHypothesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHypothesis"


    // $ANTLR start "entryRuleCoherenceLink"
    // InternalHypoMethod.g:378:1: entryRuleCoherenceLink : ruleCoherenceLink EOF ;
    public final void entryRuleCoherenceLink() throws RecognitionException {
        try {
            // InternalHypoMethod.g:379:1: ( ruleCoherenceLink EOF )
            // InternalHypoMethod.g:380:1: ruleCoherenceLink EOF
            {
             before(grammarAccess.getCoherenceLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleCoherenceLink();

            state._fsp--;

             after(grammarAccess.getCoherenceLinkRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCoherenceLink"


    // $ANTLR start "ruleCoherenceLink"
    // InternalHypoMethod.g:387:1: ruleCoherenceLink : ( ( rule__CoherenceLink__Group__0 ) ) ;
    public final void ruleCoherenceLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:391:2: ( ( ( rule__CoherenceLink__Group__0 ) ) )
            // InternalHypoMethod.g:392:2: ( ( rule__CoherenceLink__Group__0 ) )
            {
            // InternalHypoMethod.g:392:2: ( ( rule__CoherenceLink__Group__0 ) )
            // InternalHypoMethod.g:393:3: ( rule__CoherenceLink__Group__0 )
            {
             before(grammarAccess.getCoherenceLinkAccess().getGroup()); 
            // InternalHypoMethod.g:394:3: ( rule__CoherenceLink__Group__0 )
            // InternalHypoMethod.g:394:4: rule__CoherenceLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoherenceLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoherenceLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoherenceLink"


    // $ANTLR start "entryRuleMechHypothesis"
    // InternalHypoMethod.g:403:1: entryRuleMechHypothesis : ruleMechHypothesis EOF ;
    public final void entryRuleMechHypothesis() throws RecognitionException {
        try {
            // InternalHypoMethod.g:404:1: ( ruleMechHypothesis EOF )
            // InternalHypoMethod.g:405:1: ruleMechHypothesis EOF
            {
             before(grammarAccess.getMechHypothesisRule()); 
            pushFollow(FOLLOW_1);
            ruleMechHypothesis();

            state._fsp--;

             after(grammarAccess.getMechHypothesisRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMechHypothesis"


    // $ANTLR start "ruleMechHypothesis"
    // InternalHypoMethod.g:412:1: ruleMechHypothesis : ( ( rule__MechHypothesis__Group__0 ) ) ;
    public final void ruleMechHypothesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:416:2: ( ( ( rule__MechHypothesis__Group__0 ) ) )
            // InternalHypoMethod.g:417:2: ( ( rule__MechHypothesis__Group__0 ) )
            {
            // InternalHypoMethod.g:417:2: ( ( rule__MechHypothesis__Group__0 ) )
            // InternalHypoMethod.g:418:3: ( rule__MechHypothesis__Group__0 )
            {
             before(grammarAccess.getMechHypothesisAccess().getGroup()); 
            // InternalHypoMethod.g:419:3: ( rule__MechHypothesis__Group__0 )
            // InternalHypoMethod.g:419:4: rule__MechHypothesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MechHypothesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMechHypothesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMechHypothesis"


    // $ANTLR start "entryRuleEvidence"
    // InternalHypoMethod.g:428:1: entryRuleEvidence : ruleEvidence EOF ;
    public final void entryRuleEvidence() throws RecognitionException {
        try {
            // InternalHypoMethod.g:429:1: ( ruleEvidence EOF )
            // InternalHypoMethod.g:430:1: ruleEvidence EOF
            {
             before(grammarAccess.getEvidenceRule()); 
            pushFollow(FOLLOW_1);
            ruleEvidence();

            state._fsp--;

             after(grammarAccess.getEvidenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvidence"


    // $ANTLR start "ruleEvidence"
    // InternalHypoMethod.g:437:1: ruleEvidence : ( ( rule__Evidence__Group__0 ) ) ;
    public final void ruleEvidence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:441:2: ( ( ( rule__Evidence__Group__0 ) ) )
            // InternalHypoMethod.g:442:2: ( ( rule__Evidence__Group__0 ) )
            {
            // InternalHypoMethod.g:442:2: ( ( rule__Evidence__Group__0 ) )
            // InternalHypoMethod.g:443:3: ( rule__Evidence__Group__0 )
            {
             before(grammarAccess.getEvidenceAccess().getGroup()); 
            // InternalHypoMethod.g:444:3: ( rule__Evidence__Group__0 )
            // InternalHypoMethod.g:444:4: rule__Evidence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Evidence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvidenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvidence"


    // $ANTLR start "entryRuleTemporalPattern"
    // InternalHypoMethod.g:453:1: entryRuleTemporalPattern : ruleTemporalPattern EOF ;
    public final void entryRuleTemporalPattern() throws RecognitionException {
        try {
            // InternalHypoMethod.g:454:1: ( ruleTemporalPattern EOF )
            // InternalHypoMethod.g:455:1: ruleTemporalPattern EOF
            {
             before(grammarAccess.getTemporalPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleTemporalPattern();

            state._fsp--;

             after(grammarAccess.getTemporalPatternRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTemporalPattern"


    // $ANTLR start "ruleTemporalPattern"
    // InternalHypoMethod.g:462:1: ruleTemporalPattern : ( ( rule__TemporalPattern__Group__0 ) ) ;
    public final void ruleTemporalPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:466:2: ( ( ( rule__TemporalPattern__Group__0 ) ) )
            // InternalHypoMethod.g:467:2: ( ( rule__TemporalPattern__Group__0 ) )
            {
            // InternalHypoMethod.g:467:2: ( ( rule__TemporalPattern__Group__0 ) )
            // InternalHypoMethod.g:468:3: ( rule__TemporalPattern__Group__0 )
            {
             before(grammarAccess.getTemporalPatternAccess().getGroup()); 
            // InternalHypoMethod.g:469:3: ( rule__TemporalPattern__Group__0 )
            // InternalHypoMethod.g:469:4: rule__TemporalPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemporalPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemporalPattern"


    // $ANTLR start "entryRuleCondition"
    // InternalHypoMethod.g:478:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalHypoMethod.g:479:1: ( ruleCondition EOF )
            // InternalHypoMethod.g:480:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalHypoMethod.g:487:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:491:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalHypoMethod.g:492:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalHypoMethod.g:492:2: ( ( rule__Condition__Group__0 ) )
            // InternalHypoMethod.g:493:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalHypoMethod.g:494:3: ( rule__Condition__Group__0 )
            // InternalHypoMethod.g:494:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEvent"
    // InternalHypoMethod.g:503:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalHypoMethod.g:504:1: ( ruleEvent EOF )
            // InternalHypoMethod.g:505:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalHypoMethod.g:512:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:516:2: ( ( ( rule__Event__Alternatives ) ) )
            // InternalHypoMethod.g:517:2: ( ( rule__Event__Alternatives ) )
            {
            // InternalHypoMethod.g:517:2: ( ( rule__Event__Alternatives ) )
            // InternalHypoMethod.g:518:3: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // InternalHypoMethod.g:519:3: ( rule__Event__Alternatives )
            // InternalHypoMethod.g:519:4: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Event__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleSimultaneous"
    // InternalHypoMethod.g:528:1: entryRuleSimultaneous : ruleSimultaneous EOF ;
    public final void entryRuleSimultaneous() throws RecognitionException {
        try {
            // InternalHypoMethod.g:529:1: ( ruleSimultaneous EOF )
            // InternalHypoMethod.g:530:1: ruleSimultaneous EOF
            {
             before(grammarAccess.getSimultaneousRule()); 
            pushFollow(FOLLOW_1);
            ruleSimultaneous();

            state._fsp--;

             after(grammarAccess.getSimultaneousRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimultaneous"


    // $ANTLR start "ruleSimultaneous"
    // InternalHypoMethod.g:537:1: ruleSimultaneous : ( ( rule__Simultaneous__Group__0 ) ) ;
    public final void ruleSimultaneous() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:541:2: ( ( ( rule__Simultaneous__Group__0 ) ) )
            // InternalHypoMethod.g:542:2: ( ( rule__Simultaneous__Group__0 ) )
            {
            // InternalHypoMethod.g:542:2: ( ( rule__Simultaneous__Group__0 ) )
            // InternalHypoMethod.g:543:3: ( rule__Simultaneous__Group__0 )
            {
             before(grammarAccess.getSimultaneousAccess().getGroup()); 
            // InternalHypoMethod.g:544:3: ( rule__Simultaneous__Group__0 )
            // InternalHypoMethod.g:544:4: rule__Simultaneous__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Simultaneous__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimultaneousAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimultaneous"


    // $ANTLR start "entryRuleDispersed"
    // InternalHypoMethod.g:553:1: entryRuleDispersed : ruleDispersed EOF ;
    public final void entryRuleDispersed() throws RecognitionException {
        try {
            // InternalHypoMethod.g:554:1: ( ruleDispersed EOF )
            // InternalHypoMethod.g:555:1: ruleDispersed EOF
            {
             before(grammarAccess.getDispersedRule()); 
            pushFollow(FOLLOW_1);
            ruleDispersed();

            state._fsp--;

             after(grammarAccess.getDispersedRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDispersed"


    // $ANTLR start "ruleDispersed"
    // InternalHypoMethod.g:562:1: ruleDispersed : ( ( ( rule__Dispersed__DispAssignment ) ) ( ( rule__Dispersed__DispAssignment )* ) ) ;
    public final void ruleDispersed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:566:2: ( ( ( ( rule__Dispersed__DispAssignment ) ) ( ( rule__Dispersed__DispAssignment )* ) ) )
            // InternalHypoMethod.g:567:2: ( ( ( rule__Dispersed__DispAssignment ) ) ( ( rule__Dispersed__DispAssignment )* ) )
            {
            // InternalHypoMethod.g:567:2: ( ( ( rule__Dispersed__DispAssignment ) ) ( ( rule__Dispersed__DispAssignment )* ) )
            // InternalHypoMethod.g:568:3: ( ( rule__Dispersed__DispAssignment ) ) ( ( rule__Dispersed__DispAssignment )* )
            {
            // InternalHypoMethod.g:568:3: ( ( rule__Dispersed__DispAssignment ) )
            // InternalHypoMethod.g:569:4: ( rule__Dispersed__DispAssignment )
            {
             before(grammarAccess.getDispersedAccess().getDispAssignment()); 
            // InternalHypoMethod.g:570:4: ( rule__Dispersed__DispAssignment )
            // InternalHypoMethod.g:570:5: rule__Dispersed__DispAssignment
            {
            pushFollow(FOLLOW_4);
            rule__Dispersed__DispAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDispersedAccess().getDispAssignment()); 

            }

            // InternalHypoMethod.g:573:3: ( ( rule__Dispersed__DispAssignment )* )
            // InternalHypoMethod.g:574:4: ( rule__Dispersed__DispAssignment )*
            {
             before(grammarAccess.getDispersedAccess().getDispAssignment()); 
            // InternalHypoMethod.g:575:4: ( rule__Dispersed__DispAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalHypoMethod.g:575:5: rule__Dispersed__DispAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Dispersed__DispAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDispersedAccess().getDispAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDispersed"


    // $ANTLR start "entryRuleRe"
    // InternalHypoMethod.g:585:1: entryRuleRe : ruleRe EOF ;
    public final void entryRuleRe() throws RecognitionException {
        try {
            // InternalHypoMethod.g:586:1: ( ruleRe EOF )
            // InternalHypoMethod.g:587:1: ruleRe EOF
            {
             before(grammarAccess.getReRule()); 
            pushFollow(FOLLOW_1);
            ruleRe();

            state._fsp--;

             after(grammarAccess.getReRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRe"


    // $ANTLR start "ruleRe"
    // InternalHypoMethod.g:594:1: ruleRe : ( ( rule__Re__Group__0 ) ) ;
    public final void ruleRe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:598:2: ( ( ( rule__Re__Group__0 ) ) )
            // InternalHypoMethod.g:599:2: ( ( rule__Re__Group__0 ) )
            {
            // InternalHypoMethod.g:599:2: ( ( rule__Re__Group__0 ) )
            // InternalHypoMethod.g:600:3: ( rule__Re__Group__0 )
            {
             before(grammarAccess.getReAccess().getGroup()); 
            // InternalHypoMethod.g:601:3: ( rule__Re__Group__0 )
            // InternalHypoMethod.g:601:4: rule__Re__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Re__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRe"


    // $ANTLR start "entryRuleRelationalQuery"
    // InternalHypoMethod.g:610:1: entryRuleRelationalQuery : ruleRelationalQuery EOF ;
    public final void entryRuleRelationalQuery() throws RecognitionException {
        try {
            // InternalHypoMethod.g:611:1: ( ruleRelationalQuery EOF )
            // InternalHypoMethod.g:612:1: ruleRelationalQuery EOF
            {
             before(grammarAccess.getRelationalQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationalQuery();

            state._fsp--;

             after(grammarAccess.getRelationalQueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelationalQuery"


    // $ANTLR start "ruleRelationalQuery"
    // InternalHypoMethod.g:619:1: ruleRelationalQuery : ( ( rule__RelationalQuery__Alternatives ) ) ;
    public final void ruleRelationalQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:623:2: ( ( ( rule__RelationalQuery__Alternatives ) ) )
            // InternalHypoMethod.g:624:2: ( ( rule__RelationalQuery__Alternatives ) )
            {
            // InternalHypoMethod.g:624:2: ( ( rule__RelationalQuery__Alternatives ) )
            // InternalHypoMethod.g:625:3: ( rule__RelationalQuery__Alternatives )
            {
             before(grammarAccess.getRelationalQueryAccess().getAlternatives()); 
            // InternalHypoMethod.g:626:3: ( rule__RelationalQuery__Alternatives )
            // InternalHypoMethod.g:626:4: rule__RelationalQuery__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationalQuery__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationalQueryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalQuery"


    // $ANTLR start "entryRuleQuery1"
    // InternalHypoMethod.g:635:1: entryRuleQuery1 : ruleQuery1 EOF ;
    public final void entryRuleQuery1() throws RecognitionException {
        try {
            // InternalHypoMethod.g:636:1: ( ruleQuery1 EOF )
            // InternalHypoMethod.g:637:1: ruleQuery1 EOF
            {
             before(grammarAccess.getQuery1Rule()); 
            pushFollow(FOLLOW_1);
            ruleQuery1();

            state._fsp--;

             after(grammarAccess.getQuery1Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuery1"


    // $ANTLR start "ruleQuery1"
    // InternalHypoMethod.g:644:1: ruleQuery1 : ( ( rule__Query1__Group__0 ) ) ;
    public final void ruleQuery1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:648:2: ( ( ( rule__Query1__Group__0 ) ) )
            // InternalHypoMethod.g:649:2: ( ( rule__Query1__Group__0 ) )
            {
            // InternalHypoMethod.g:649:2: ( ( rule__Query1__Group__0 ) )
            // InternalHypoMethod.g:650:3: ( rule__Query1__Group__0 )
            {
             before(grammarAccess.getQuery1Access().getGroup()); 
            // InternalHypoMethod.g:651:3: ( rule__Query1__Group__0 )
            // InternalHypoMethod.g:651:4: rule__Query1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuery1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery1"


    // $ANTLR start "entryRuleQuery2"
    // InternalHypoMethod.g:660:1: entryRuleQuery2 : ruleQuery2 EOF ;
    public final void entryRuleQuery2() throws RecognitionException {
        try {
            // InternalHypoMethod.g:661:1: ( ruleQuery2 EOF )
            // InternalHypoMethod.g:662:1: ruleQuery2 EOF
            {
             before(grammarAccess.getQuery2Rule()); 
            pushFollow(FOLLOW_1);
            ruleQuery2();

            state._fsp--;

             after(grammarAccess.getQuery2Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuery2"


    // $ANTLR start "ruleQuery2"
    // InternalHypoMethod.g:669:1: ruleQuery2 : ( ( rule__Query2__Group__0 ) ) ;
    public final void ruleQuery2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:673:2: ( ( ( rule__Query2__Group__0 ) ) )
            // InternalHypoMethod.g:674:2: ( ( rule__Query2__Group__0 ) )
            {
            // InternalHypoMethod.g:674:2: ( ( rule__Query2__Group__0 ) )
            // InternalHypoMethod.g:675:3: ( rule__Query2__Group__0 )
            {
             before(grammarAccess.getQuery2Access().getGroup()); 
            // InternalHypoMethod.g:676:3: ( rule__Query2__Group__0 )
            // InternalHypoMethod.g:676:4: rule__Query2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuery2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery2"


    // $ANTLR start "entryRuleQuery3"
    // InternalHypoMethod.g:685:1: entryRuleQuery3 : ruleQuery3 EOF ;
    public final void entryRuleQuery3() throws RecognitionException {
        try {
            // InternalHypoMethod.g:686:1: ( ruleQuery3 EOF )
            // InternalHypoMethod.g:687:1: ruleQuery3 EOF
            {
             before(grammarAccess.getQuery3Rule()); 
            pushFollow(FOLLOW_1);
            ruleQuery3();

            state._fsp--;

             after(grammarAccess.getQuery3Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuery3"


    // $ANTLR start "ruleQuery3"
    // InternalHypoMethod.g:694:1: ruleQuery3 : ( ( rule__Query3__Group__0 ) ) ;
    public final void ruleQuery3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:698:2: ( ( ( rule__Query3__Group__0 ) ) )
            // InternalHypoMethod.g:699:2: ( ( rule__Query3__Group__0 ) )
            {
            // InternalHypoMethod.g:699:2: ( ( rule__Query3__Group__0 ) )
            // InternalHypoMethod.g:700:3: ( rule__Query3__Group__0 )
            {
             before(grammarAccess.getQuery3Access().getGroup()); 
            // InternalHypoMethod.g:701:3: ( rule__Query3__Group__0 )
            // InternalHypoMethod.g:701:4: rule__Query3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuery3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery3"


    // $ANTLR start "entryRuleExperiment"
    // InternalHypoMethod.g:710:1: entryRuleExperiment : ruleExperiment EOF ;
    public final void entryRuleExperiment() throws RecognitionException {
        try {
            // InternalHypoMethod.g:711:1: ( ruleExperiment EOF )
            // InternalHypoMethod.g:712:1: ruleExperiment EOF
            {
             before(grammarAccess.getExperimentRule()); 
            pushFollow(FOLLOW_1);
            ruleExperiment();

            state._fsp--;

             after(grammarAccess.getExperimentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExperiment"


    // $ANTLR start "ruleExperiment"
    // InternalHypoMethod.g:719:1: ruleExperiment : ( ( rule__Experiment__Group__0 ) ) ;
    public final void ruleExperiment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:723:2: ( ( ( rule__Experiment__Group__0 ) ) )
            // InternalHypoMethod.g:724:2: ( ( rule__Experiment__Group__0 ) )
            {
            // InternalHypoMethod.g:724:2: ( ( rule__Experiment__Group__0 ) )
            // InternalHypoMethod.g:725:3: ( rule__Experiment__Group__0 )
            {
             before(grammarAccess.getExperimentAccess().getGroup()); 
            // InternalHypoMethod.g:726:3: ( rule__Experiment__Group__0 )
            // InternalHypoMethod.g:726:4: rule__Experiment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExperiment"


    // $ANTLR start "entryRuleDesign"
    // InternalHypoMethod.g:735:1: entryRuleDesign : ruleDesign EOF ;
    public final void entryRuleDesign() throws RecognitionException {
        try {
            // InternalHypoMethod.g:736:1: ( ruleDesign EOF )
            // InternalHypoMethod.g:737:1: ruleDesign EOF
            {
             before(grammarAccess.getDesignRule()); 
            pushFollow(FOLLOW_1);
            ruleDesign();

            state._fsp--;

             after(grammarAccess.getDesignRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDesign"


    // $ANTLR start "ruleDesign"
    // InternalHypoMethod.g:744:1: ruleDesign : ( ( rule__Design__Group__0 ) ) ;
    public final void ruleDesign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:748:2: ( ( ( rule__Design__Group__0 ) ) )
            // InternalHypoMethod.g:749:2: ( ( rule__Design__Group__0 ) )
            {
            // InternalHypoMethod.g:749:2: ( ( rule__Design__Group__0 ) )
            // InternalHypoMethod.g:750:3: ( rule__Design__Group__0 )
            {
             before(grammarAccess.getDesignAccess().getGroup()); 
            // InternalHypoMethod.g:751:3: ( rule__Design__Group__0 )
            // InternalHypoMethod.g:751:4: rule__Design__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Design__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDesignAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDesign"


    // $ANTLR start "entryRuleVariables"
    // InternalHypoMethod.g:760:1: entryRuleVariables : ruleVariables EOF ;
    public final void entryRuleVariables() throws RecognitionException {
        try {
            // InternalHypoMethod.g:761:1: ( ruleVariables EOF )
            // InternalHypoMethod.g:762:1: ruleVariables EOF
            {
             before(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_1);
            ruleVariables();

            state._fsp--;

             after(grammarAccess.getVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // InternalHypoMethod.g:769:1: ruleVariables : ( ( rule__Variables__Group__0 ) ) ;
    public final void ruleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:773:2: ( ( ( rule__Variables__Group__0 ) ) )
            // InternalHypoMethod.g:774:2: ( ( rule__Variables__Group__0 ) )
            {
            // InternalHypoMethod.g:774:2: ( ( rule__Variables__Group__0 ) )
            // InternalHypoMethod.g:775:3: ( rule__Variables__Group__0 )
            {
             before(grammarAccess.getVariablesAccess().getGroup()); 
            // InternalHypoMethod.g:776:3: ( rule__Variables__Group__0 )
            // InternalHypoMethod.g:776:4: rule__Variables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleIndependentVariables"
    // InternalHypoMethod.g:785:1: entryRuleIndependentVariables : ruleIndependentVariables EOF ;
    public final void entryRuleIndependentVariables() throws RecognitionException {
        try {
            // InternalHypoMethod.g:786:1: ( ruleIndependentVariables EOF )
            // InternalHypoMethod.g:787:1: ruleIndependentVariables EOF
            {
             before(grammarAccess.getIndependentVariablesRule()); 
            pushFollow(FOLLOW_1);
            ruleIndependentVariables();

            state._fsp--;

             after(grammarAccess.getIndependentVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIndependentVariables"


    // $ANTLR start "ruleIndependentVariables"
    // InternalHypoMethod.g:794:1: ruleIndependentVariables : ( ( rule__IndependentVariables__Group__0 ) ) ;
    public final void ruleIndependentVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:798:2: ( ( ( rule__IndependentVariables__Group__0 ) ) )
            // InternalHypoMethod.g:799:2: ( ( rule__IndependentVariables__Group__0 ) )
            {
            // InternalHypoMethod.g:799:2: ( ( rule__IndependentVariables__Group__0 ) )
            // InternalHypoMethod.g:800:3: ( rule__IndependentVariables__Group__0 )
            {
             before(grammarAccess.getIndependentVariablesAccess().getGroup()); 
            // InternalHypoMethod.g:801:3: ( rule__IndependentVariables__Group__0 )
            // InternalHypoMethod.g:801:4: rule__IndependentVariables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndependentVariables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndependentVariablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndependentVariables"


    // $ANTLR start "entryRuleControlVariables"
    // InternalHypoMethod.g:810:1: entryRuleControlVariables : ruleControlVariables EOF ;
    public final void entryRuleControlVariables() throws RecognitionException {
        try {
            // InternalHypoMethod.g:811:1: ( ruleControlVariables EOF )
            // InternalHypoMethod.g:812:1: ruleControlVariables EOF
            {
             before(grammarAccess.getControlVariablesRule()); 
            pushFollow(FOLLOW_1);
            ruleControlVariables();

            state._fsp--;

             after(grammarAccess.getControlVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleControlVariables"


    // $ANTLR start "ruleControlVariables"
    // InternalHypoMethod.g:819:1: ruleControlVariables : ( ( rule__ControlVariables__Group__0 ) ) ;
    public final void ruleControlVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:823:2: ( ( ( rule__ControlVariables__Group__0 ) ) )
            // InternalHypoMethod.g:824:2: ( ( rule__ControlVariables__Group__0 ) )
            {
            // InternalHypoMethod.g:824:2: ( ( rule__ControlVariables__Group__0 ) )
            // InternalHypoMethod.g:825:3: ( rule__ControlVariables__Group__0 )
            {
             before(grammarAccess.getControlVariablesAccess().getGroup()); 
            // InternalHypoMethod.g:826:3: ( rule__ControlVariables__Group__0 )
            // InternalHypoMethod.g:826:4: rule__ControlVariables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getControlVariablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleControlVariables"


    // $ANTLR start "entryRuleDependentVariables"
    // InternalHypoMethod.g:835:1: entryRuleDependentVariables : ruleDependentVariables EOF ;
    public final void entryRuleDependentVariables() throws RecognitionException {
        try {
            // InternalHypoMethod.g:836:1: ( ruleDependentVariables EOF )
            // InternalHypoMethod.g:837:1: ruleDependentVariables EOF
            {
             before(grammarAccess.getDependentVariablesRule()); 
            pushFollow(FOLLOW_1);
            ruleDependentVariables();

            state._fsp--;

             after(grammarAccess.getDependentVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDependentVariables"


    // $ANTLR start "ruleDependentVariables"
    // InternalHypoMethod.g:844:1: ruleDependentVariables : ( ( rule__DependentVariables__Group__0 ) ) ;
    public final void ruleDependentVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:848:2: ( ( ( rule__DependentVariables__Group__0 ) ) )
            // InternalHypoMethod.g:849:2: ( ( rule__DependentVariables__Group__0 ) )
            {
            // InternalHypoMethod.g:849:2: ( ( rule__DependentVariables__Group__0 ) )
            // InternalHypoMethod.g:850:3: ( rule__DependentVariables__Group__0 )
            {
             before(grammarAccess.getDependentVariablesAccess().getGroup()); 
            // InternalHypoMethod.g:851:3: ( rule__DependentVariables__Group__0 )
            // InternalHypoMethod.g:851:4: rule__DependentVariables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DependentVariables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependentVariablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependentVariables"


    // $ANTLR start "entryRuleFactorLevels"
    // InternalHypoMethod.g:860:1: entryRuleFactorLevels : ruleFactorLevels EOF ;
    public final void entryRuleFactorLevels() throws RecognitionException {
        try {
            // InternalHypoMethod.g:861:1: ( ruleFactorLevels EOF )
            // InternalHypoMethod.g:862:1: ruleFactorLevels EOF
            {
             before(grammarAccess.getFactorLevelsRule()); 
            pushFollow(FOLLOW_1);
            ruleFactorLevels();

            state._fsp--;

             after(grammarAccess.getFactorLevelsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFactorLevels"


    // $ANTLR start "ruleFactorLevels"
    // InternalHypoMethod.g:869:1: ruleFactorLevels : ( ( rule__FactorLevels__Group__0 ) ) ;
    public final void ruleFactorLevels() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:873:2: ( ( ( rule__FactorLevels__Group__0 ) ) )
            // InternalHypoMethod.g:874:2: ( ( rule__FactorLevels__Group__0 ) )
            {
            // InternalHypoMethod.g:874:2: ( ( rule__FactorLevels__Group__0 ) )
            // InternalHypoMethod.g:875:3: ( rule__FactorLevels__Group__0 )
            {
             before(grammarAccess.getFactorLevelsAccess().getGroup()); 
            // InternalHypoMethod.g:876:3: ( rule__FactorLevels__Group__0 )
            // InternalHypoMethod.g:876:4: rule__FactorLevels__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorLevelsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactorLevels"


    // $ANTLR start "entryRuleResponse"
    // InternalHypoMethod.g:885:1: entryRuleResponse : ruleResponse EOF ;
    public final void entryRuleResponse() throws RecognitionException {
        try {
            // InternalHypoMethod.g:886:1: ( ruleResponse EOF )
            // InternalHypoMethod.g:887:1: ruleResponse EOF
            {
             before(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getResponseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalHypoMethod.g:894:1: ruleResponse : ( ( rule__Response__Group__0 ) ) ;
    public final void ruleResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:898:2: ( ( ( rule__Response__Group__0 ) ) )
            // InternalHypoMethod.g:899:2: ( ( rule__Response__Group__0 ) )
            {
            // InternalHypoMethod.g:899:2: ( ( rule__Response__Group__0 ) )
            // InternalHypoMethod.g:900:3: ( rule__Response__Group__0 )
            {
             before(grammarAccess.getResponseAccess().getGroup()); 
            // InternalHypoMethod.g:901:3: ( rule__Response__Group__0 )
            // InternalHypoMethod.g:901:4: rule__Response__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleIteration"
    // InternalHypoMethod.g:910:1: entryRuleIteration : ruleIteration EOF ;
    public final void entryRuleIteration() throws RecognitionException {
        try {
            // InternalHypoMethod.g:911:1: ( ruleIteration EOF )
            // InternalHypoMethod.g:912:1: ruleIteration EOF
            {
             before(grammarAccess.getIterationRule()); 
            pushFollow(FOLLOW_1);
            ruleIteration();

            state._fsp--;

             after(grammarAccess.getIterationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIteration"


    // $ANTLR start "ruleIteration"
    // InternalHypoMethod.g:919:1: ruleIteration : ( ( rule__Iteration__Group__0 ) ) ;
    public final void ruleIteration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:923:2: ( ( ( rule__Iteration__Group__0 ) ) )
            // InternalHypoMethod.g:924:2: ( ( rule__Iteration__Group__0 ) )
            {
            // InternalHypoMethod.g:924:2: ( ( rule__Iteration__Group__0 ) )
            // InternalHypoMethod.g:925:3: ( rule__Iteration__Group__0 )
            {
             before(grammarAccess.getIterationAccess().getGroup()); 
            // InternalHypoMethod.g:926:3: ( rule__Iteration__Group__0 )
            // InternalHypoMethod.g:926:4: rule__Iteration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Iteration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIterationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIteration"


    // $ANTLR start "entryRulePerformanceMeasure"
    // InternalHypoMethod.g:935:1: entryRulePerformanceMeasure : rulePerformanceMeasure EOF ;
    public final void entryRulePerformanceMeasure() throws RecognitionException {
        try {
            // InternalHypoMethod.g:936:1: ( rulePerformanceMeasure EOF )
            // InternalHypoMethod.g:937:1: rulePerformanceMeasure EOF
            {
             before(grammarAccess.getPerformanceMeasureRule()); 
            pushFollow(FOLLOW_1);
            rulePerformanceMeasure();

            state._fsp--;

             after(grammarAccess.getPerformanceMeasureRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePerformanceMeasure"


    // $ANTLR start "rulePerformanceMeasure"
    // InternalHypoMethod.g:944:1: rulePerformanceMeasure : ( ( rule__PerformanceMeasure__Group__0 ) ) ;
    public final void rulePerformanceMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:948:2: ( ( ( rule__PerformanceMeasure__Group__0 ) ) )
            // InternalHypoMethod.g:949:2: ( ( rule__PerformanceMeasure__Group__0 ) )
            {
            // InternalHypoMethod.g:949:2: ( ( rule__PerformanceMeasure__Group__0 ) )
            // InternalHypoMethod.g:950:3: ( rule__PerformanceMeasure__Group__0 )
            {
             before(grammarAccess.getPerformanceMeasureAccess().getGroup()); 
            // InternalHypoMethod.g:951:3: ( rule__PerformanceMeasure__Group__0 )
            // InternalHypoMethod.g:951:4: rule__PerformanceMeasure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PerformanceMeasure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerformanceMeasureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerformanceMeasure"


    // $ANTLR start "ruleVariableType"
    // InternalHypoMethod.g:960:1: ruleVariableType : ( ( rule__VariableType__Alternatives ) ) ;
    public final void ruleVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:964:1: ( ( ( rule__VariableType__Alternatives ) ) )
            // InternalHypoMethod.g:965:2: ( ( rule__VariableType__Alternatives ) )
            {
            // InternalHypoMethod.g:965:2: ( ( rule__VariableType__Alternatives ) )
            // InternalHypoMethod.g:966:3: ( rule__VariableType__Alternatives )
            {
             before(grammarAccess.getVariableTypeAccess().getAlternatives()); 
            // InternalHypoMethod.g:967:3: ( rule__VariableType__Alternatives )
            // InternalHypoMethod.g:967:4: rule__VariableType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "ruleExpression"
    // InternalHypoMethod.g:976:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:980:1: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalHypoMethod.g:981:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalHypoMethod.g:981:2: ( ( rule__Expression__Alternatives ) )
            // InternalHypoMethod.g:982:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalHypoMethod.g:983:3: ( rule__Expression__Alternatives )
            // InternalHypoMethod.g:983:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "ruleLinks"
    // InternalHypoMethod.g:992:1: ruleLinks : ( ( rule__Links__Alternatives ) ) ;
    public final void ruleLinks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:996:1: ( ( ( rule__Links__Alternatives ) ) )
            // InternalHypoMethod.g:997:2: ( ( rule__Links__Alternatives ) )
            {
            // InternalHypoMethod.g:997:2: ( ( rule__Links__Alternatives ) )
            // InternalHypoMethod.g:998:3: ( rule__Links__Alternatives )
            {
             before(grammarAccess.getLinksAccess().getAlternatives()); 
            // InternalHypoMethod.g:999:3: ( rule__Links__Alternatives )
            // InternalHypoMethod.g:999:4: rule__Links__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Links__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLinksAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinks"


    // $ANTLR start "ruleTemporal"
    // InternalHypoMethod.g:1008:1: ruleTemporal : ( ( rule__Temporal__Alternatives ) ) ;
    public final void ruleTemporal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1012:1: ( ( ( rule__Temporal__Alternatives ) ) )
            // InternalHypoMethod.g:1013:2: ( ( rule__Temporal__Alternatives ) )
            {
            // InternalHypoMethod.g:1013:2: ( ( rule__Temporal__Alternatives ) )
            // InternalHypoMethod.g:1014:3: ( rule__Temporal__Alternatives )
            {
             before(grammarAccess.getTemporalAccess().getAlternatives()); 
            // InternalHypoMethod.g:1015:3: ( rule__Temporal__Alternatives )
            // InternalHypoMethod.g:1015:4: rule__Temporal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Temporal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTemporalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemporal"


    // $ANTLR start "ruleLogical"
    // InternalHypoMethod.g:1024:1: ruleLogical : ( ( rule__Logical__Alternatives ) ) ;
    public final void ruleLogical() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1028:1: ( ( ( rule__Logical__Alternatives ) ) )
            // InternalHypoMethod.g:1029:2: ( ( rule__Logical__Alternatives ) )
            {
            // InternalHypoMethod.g:1029:2: ( ( rule__Logical__Alternatives ) )
            // InternalHypoMethod.g:1030:3: ( rule__Logical__Alternatives )
            {
             before(grammarAccess.getLogicalAccess().getAlternatives()); 
            // InternalHypoMethod.g:1031:3: ( rule__Logical__Alternatives )
            // InternalHypoMethod.g:1031:4: rule__Logical__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Logical__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogical"


    // $ANTLR start "ruleCoherence"
    // InternalHypoMethod.g:1040:1: ruleCoherence : ( ( rule__Coherence__Alternatives ) ) ;
    public final void ruleCoherence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1044:1: ( ( ( rule__Coherence__Alternatives ) ) )
            // InternalHypoMethod.g:1045:2: ( ( rule__Coherence__Alternatives ) )
            {
            // InternalHypoMethod.g:1045:2: ( ( rule__Coherence__Alternatives ) )
            // InternalHypoMethod.g:1046:3: ( rule__Coherence__Alternatives )
            {
             before(grammarAccess.getCoherenceAccess().getAlternatives()); 
            // InternalHypoMethod.g:1047:3: ( rule__Coherence__Alternatives )
            // InternalHypoMethod.g:1047:4: rule__Coherence__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Coherence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCoherenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoherence"


    // $ANTLR start "ruleFunction"
    // InternalHypoMethod.g:1056:1: ruleFunction : ( ( rule__Function__Alternatives ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1060:1: ( ( ( rule__Function__Alternatives ) ) )
            // InternalHypoMethod.g:1061:2: ( ( rule__Function__Alternatives ) )
            {
            // InternalHypoMethod.g:1061:2: ( ( rule__Function__Alternatives ) )
            // InternalHypoMethod.g:1062:3: ( rule__Function__Alternatives )
            {
             before(grammarAccess.getFunctionAccess().getAlternatives()); 
            // InternalHypoMethod.g:1063:3: ( rule__Function__Alternatives )
            // InternalHypoMethod.g:1063:4: rule__Function__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Function__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "ruleLevels"
    // InternalHypoMethod.g:1072:1: ruleLevels : ( ( rule__Levels__Alternatives ) ) ;
    public final void ruleLevels() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1076:1: ( ( ( rule__Levels__Alternatives ) ) )
            // InternalHypoMethod.g:1077:2: ( ( rule__Levels__Alternatives ) )
            {
            // InternalHypoMethod.g:1077:2: ( ( rule__Levels__Alternatives ) )
            // InternalHypoMethod.g:1078:3: ( rule__Levels__Alternatives )
            {
             before(grammarAccess.getLevelsAccess().getAlternatives()); 
            // InternalHypoMethod.g:1079:3: ( rule__Levels__Alternatives )
            // InternalHypoMethod.g:1079:4: rule__Levels__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Levels__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLevelsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLevels"


    // $ANTLR start "ruleDesignType"
    // InternalHypoMethod.g:1088:1: ruleDesignType : ( ( rule__DesignType__Alternatives ) ) ;
    public final void ruleDesignType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1092:1: ( ( ( rule__DesignType__Alternatives ) ) )
            // InternalHypoMethod.g:1093:2: ( ( rule__DesignType__Alternatives ) )
            {
            // InternalHypoMethod.g:1093:2: ( ( rule__DesignType__Alternatives ) )
            // InternalHypoMethod.g:1094:3: ( rule__DesignType__Alternatives )
            {
             before(grammarAccess.getDesignTypeAccess().getAlternatives()); 
            // InternalHypoMethod.g:1095:3: ( rule__DesignType__Alternatives )
            // InternalHypoMethod.g:1095:4: rule__DesignType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DesignType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDesignTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDesignType"


    // $ANTLR start "ruleResponseType"
    // InternalHypoMethod.g:1104:1: ruleResponseType : ( ( rule__ResponseType__Alternatives ) ) ;
    public final void ruleResponseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1108:1: ( ( ( rule__ResponseType__Alternatives ) ) )
            // InternalHypoMethod.g:1109:2: ( ( rule__ResponseType__Alternatives ) )
            {
            // InternalHypoMethod.g:1109:2: ( ( rule__ResponseType__Alternatives ) )
            // InternalHypoMethod.g:1110:3: ( rule__ResponseType__Alternatives )
            {
             before(grammarAccess.getResponseTypeAccess().getAlternatives()); 
            // InternalHypoMethod.g:1111:3: ( rule__ResponseType__Alternatives )
            // InternalHypoMethod.g:1111:4: rule__ResponseType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ResponseType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResponseTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponseType"


    // $ANTLR start "rule__ExperimentOntology__Alternatives"
    // InternalHypoMethod.g:1119:1: rule__ExperimentOntology__Alternatives : ( ( ruleModelSection ) | ( ruleGoals ) | ( ruleHypothesis ) | ( ruleExperiment ) );
    public final void rule__ExperimentOntology__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1123:1: ( ( ruleModelSection ) | ( ruleGoals ) | ( ruleHypothesis ) | ( ruleExperiment ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt3=1;
                }
                break;
            case 89:
                {
                alt3=2;
                }
                break;
            case 97:
                {
                alt3=3;
                }
                break;
            case 117:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalHypoMethod.g:1124:2: ( ruleModelSection )
                    {
                    // InternalHypoMethod.g:1124:2: ( ruleModelSection )
                    // InternalHypoMethod.g:1125:3: ruleModelSection
                    {
                     before(grammarAccess.getExperimentOntologyAccess().getModelSectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleModelSection();

                    state._fsp--;

                     after(grammarAccess.getExperimentOntologyAccess().getModelSectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1130:2: ( ruleGoals )
                    {
                    // InternalHypoMethod.g:1130:2: ( ruleGoals )
                    // InternalHypoMethod.g:1131:3: ruleGoals
                    {
                     before(grammarAccess.getExperimentOntologyAccess().getGoalsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGoals();

                    state._fsp--;

                     after(grammarAccess.getExperimentOntologyAccess().getGoalsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:1136:2: ( ruleHypothesis )
                    {
                    // InternalHypoMethod.g:1136:2: ( ruleHypothesis )
                    // InternalHypoMethod.g:1137:3: ruleHypothesis
                    {
                     before(grammarAccess.getExperimentOntologyAccess().getHypothesisParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleHypothesis();

                    state._fsp--;

                     after(grammarAccess.getExperimentOntologyAccess().getHypothesisParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:1142:2: ( ruleExperiment )
                    {
                    // InternalHypoMethod.g:1142:2: ( ruleExperiment )
                    // InternalHypoMethod.g:1143:3: ruleExperiment
                    {
                     before(grammarAccess.getExperimentOntologyAccess().getExperimentParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExperiment();

                    state._fsp--;

                     after(grammarAccess.getExperimentOntologyAccess().getExperimentParserRuleCall_3()); 

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
    // $ANTLR end "rule__ExperimentOntology__Alternatives"


    // $ANTLR start "rule__LinkOperators__Alternatives"
    // InternalHypoMethod.g:1152:1: rule__LinkOperators__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( ' = ' ) | ( ' == ' ) | ( '&&' ) | ( '||' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '!' ) | ( '!=' ) );
    public final void rule__LinkOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1156:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( ' = ' ) | ( ' == ' ) | ( '&&' ) | ( '||' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '!' ) | ( '!=' ) )
            int alt4=15;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            case 20:
                {
                alt4=8;
                }
                break;
            case 21:
                {
                alt4=9;
                }
                break;
            case 22:
                {
                alt4=10;
                }
                break;
            case 23:
                {
                alt4=11;
                }
                break;
            case 24:
                {
                alt4=12;
                }
                break;
            case 25:
                {
                alt4=13;
                }
                break;
            case 26:
                {
                alt4=14;
                }
                break;
            case 27:
                {
                alt4=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalHypoMethod.g:1157:2: ( '+' )
                    {
                    // InternalHypoMethod.g:1157:2: ( '+' )
                    // InternalHypoMethod.g:1158:3: '+'
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getPlusSignKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1163:2: ( '-' )
                    {
                    // InternalHypoMethod.g:1163:2: ( '-' )
                    // InternalHypoMethod.g:1164:3: '-'
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getHyphenMinusKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:1169:2: ( '*' )
                    {
                    // InternalHypoMethod.g:1169:2: ( '*' )
                    // InternalHypoMethod.g:1170:3: '*'
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getAsteriskKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:1175:2: ( '/' )
                    {
                    // InternalHypoMethod.g:1175:2: ( '/' )
                    // InternalHypoMethod.g:1176:3: '/'
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getSolidusKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHypoMethod.g:1181:2: ( '%' )
                    {
                    // InternalHypoMethod.g:1181:2: ( '%' )
                    // InternalHypoMethod.g:1182:3: '%'
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getPercentSignKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getPercentSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHypoMethod.g:1187:2: ( ' = ' )
                    {
                    // InternalHypoMethod.g:1187:2: ( ' = ' )
                    // InternalHypoMethod.g:1188:3: ' = '
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getSpaceEqualsSignSpaceKeyword_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getSpaceEqualsSignSpaceKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHypoMethod.g:1193:2: ( ' == ' )
                    {
                    // InternalHypoMethod.g:1193:2: ( ' == ' )
                    // InternalHypoMethod.g:1194:3: ' == '
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getSpaceEqualsSignEqualsSignSpaceKeyword_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getSpaceEqualsSignEqualsSignSpaceKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalHypoMethod.g:1199:2: ( '&&' )
                    {
                    // InternalHypoMethod.g:1199:2: ( '&&' )
                    // InternalHypoMethod.g:1200:3: '&&'
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getAmpersandAmpersandKeyword_7()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getAmpersandAmpersandKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalHypoMethod.g:1205:2: ( '||' )
                    {
                    // InternalHypoMethod.g:1205:2: ( '||' )
                    // InternalHypoMethod.g:1206:3: '||'
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getVerticalLineVerticalLineKeyword_8()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getVerticalLineVerticalLineKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalHypoMethod.g:1211:2: ( '<' )
                    {
                    // InternalHypoMethod.g:1211:2: ( '<' )
                    // InternalHypoMethod.g:1212:3: '<'
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getLessThanSignKeyword_9()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getLessThanSignKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalHypoMethod.g:1217:2: ( '<=' )
                    {
                    // InternalHypoMethod.g:1217:2: ( '<=' )
                    // InternalHypoMethod.g:1218:3: '<='
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getLessThanSignEqualsSignKeyword_10()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getLessThanSignEqualsSignKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalHypoMethod.g:1223:2: ( '>' )
                    {
                    // InternalHypoMethod.g:1223:2: ( '>' )
                    // InternalHypoMethod.g:1224:3: '>'
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getGreaterThanSignKeyword_11()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getGreaterThanSignKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalHypoMethod.g:1229:2: ( '>=' )
                    {
                    // InternalHypoMethod.g:1229:2: ( '>=' )
                    // InternalHypoMethod.g:1230:3: '>='
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getGreaterThanSignEqualsSignKeyword_12()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getGreaterThanSignEqualsSignKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalHypoMethod.g:1235:2: ( '!' )
                    {
                    // InternalHypoMethod.g:1235:2: ( '!' )
                    // InternalHypoMethod.g:1236:3: '!'
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getExclamationMarkKeyword_13()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getExclamationMarkKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalHypoMethod.g:1241:2: ( '!=' )
                    {
                    // InternalHypoMethod.g:1241:2: ( '!=' )
                    // InternalHypoMethod.g:1242:3: '!='
                    {
                     before(grammarAccess.getLinkOperatorsAccess().getExclamationMarkEqualsSignKeyword_14()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getLinkOperatorsAccess().getExclamationMarkEqualsSignKeyword_14()); 

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
    // $ANTLR end "rule__LinkOperators__Alternatives"


    // $ANTLR start "rule__TemporalPattern__Alternatives_3"
    // InternalHypoMethod.g:1251:1: rule__TemporalPattern__Alternatives_3 : ( ( ( rule__TemporalPattern__Op1Assignment_3_0 ) ) | ( ( rule__TemporalPattern__Op2Assignment_3_1 ) ) );
    public final void rule__TemporalPattern__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1255:1: ( ( ( rule__TemporalPattern__Op1Assignment_3_0 ) ) | ( ( rule__TemporalPattern__Op2Assignment_3_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=40 && LA5_0<=50)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=51 && LA5_0<=53)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalHypoMethod.g:1256:2: ( ( rule__TemporalPattern__Op1Assignment_3_0 ) )
                    {
                    // InternalHypoMethod.g:1256:2: ( ( rule__TemporalPattern__Op1Assignment_3_0 ) )
                    // InternalHypoMethod.g:1257:3: ( rule__TemporalPattern__Op1Assignment_3_0 )
                    {
                     before(grammarAccess.getTemporalPatternAccess().getOp1Assignment_3_0()); 
                    // InternalHypoMethod.g:1258:3: ( rule__TemporalPattern__Op1Assignment_3_0 )
                    // InternalHypoMethod.g:1258:4: rule__TemporalPattern__Op1Assignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemporalPattern__Op1Assignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemporalPatternAccess().getOp1Assignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1262:2: ( ( rule__TemporalPattern__Op2Assignment_3_1 ) )
                    {
                    // InternalHypoMethod.g:1262:2: ( ( rule__TemporalPattern__Op2Assignment_3_1 ) )
                    // InternalHypoMethod.g:1263:3: ( rule__TemporalPattern__Op2Assignment_3_1 )
                    {
                     before(grammarAccess.getTemporalPatternAccess().getOp2Assignment_3_1()); 
                    // InternalHypoMethod.g:1264:3: ( rule__TemporalPattern__Op2Assignment_3_1 )
                    // InternalHypoMethod.g:1264:4: rule__TemporalPattern__Op2Assignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemporalPattern__Op2Assignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemporalPatternAccess().getOp2Assignment_3_1()); 

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
    // $ANTLR end "rule__TemporalPattern__Alternatives_3"


    // $ANTLR start "rule__Event__Alternatives"
    // InternalHypoMethod.g:1272:1: rule__Event__Alternatives : ( ( ruleDispersed ) | ( ruleSimultaneous ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1276:1: ( ( ruleDispersed ) | ( ruleSimultaneous ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==106) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalHypoMethod.g:1277:2: ( ruleDispersed )
                    {
                    // InternalHypoMethod.g:1277:2: ( ruleDispersed )
                    // InternalHypoMethod.g:1278:3: ruleDispersed
                    {
                     before(grammarAccess.getEventAccess().getDispersedParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDispersed();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getDispersedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1283:2: ( ruleSimultaneous )
                    {
                    // InternalHypoMethod.g:1283:2: ( ruleSimultaneous )
                    // InternalHypoMethod.g:1284:3: ruleSimultaneous
                    {
                     before(grammarAccess.getEventAccess().getSimultaneousParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimultaneous();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getSimultaneousParserRuleCall_1()); 

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
    // $ANTLR end "rule__Event__Alternatives"


    // $ANTLR start "rule__RelationalQuery__Alternatives"
    // InternalHypoMethod.g:1293:1: rule__RelationalQuery__Alternatives : ( ( ruleQuery1 ) | ( ruleQuery2 ) | ( ruleQuery3 ) );
    public final void rule__RelationalQuery__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1297:1: ( ( ruleQuery1 ) | ( ruleQuery2 ) | ( ruleQuery3 ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalHypoMethod.g:1298:2: ( ruleQuery1 )
                    {
                    // InternalHypoMethod.g:1298:2: ( ruleQuery1 )
                    // InternalHypoMethod.g:1299:3: ruleQuery1
                    {
                     before(grammarAccess.getRelationalQueryAccess().getQuery1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQuery1();

                    state._fsp--;

                     after(grammarAccess.getRelationalQueryAccess().getQuery1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1304:2: ( ruleQuery2 )
                    {
                    // InternalHypoMethod.g:1304:2: ( ruleQuery2 )
                    // InternalHypoMethod.g:1305:3: ruleQuery2
                    {
                     before(grammarAccess.getRelationalQueryAccess().getQuery2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuery2();

                    state._fsp--;

                     after(grammarAccess.getRelationalQueryAccess().getQuery2ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:1310:2: ( ruleQuery3 )
                    {
                    // InternalHypoMethod.g:1310:2: ( ruleQuery3 )
                    // InternalHypoMethod.g:1311:3: ruleQuery3
                    {
                     before(grammarAccess.getRelationalQueryAccess().getQuery3ParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleQuery3();

                    state._fsp--;

                     after(grammarAccess.getRelationalQueryAccess().getQuery3ParserRuleCall_2()); 

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
    // $ANTLR end "rule__RelationalQuery__Alternatives"


    // $ANTLR start "rule__VariableType__Alternatives"
    // InternalHypoMethod.g:1320:1: rule__VariableType__Alternatives : ( ( ( 'QUALITATIVE' ) ) | ( ( 'QUANTITATIVE' ) ) | ( ( 'CONTINOUS' ) ) | ( ( 'DISCRETE' ) ) | ( ( 'BINARY' ) ) | ( ( 'NONBINARY' ) ) );
    public final void rule__VariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1324:1: ( ( ( 'QUALITATIVE' ) ) | ( ( 'QUANTITATIVE' ) ) | ( ( 'CONTINOUS' ) ) | ( ( 'DISCRETE' ) ) | ( ( 'BINARY' ) ) | ( ( 'NONBINARY' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            case 31:
                {
                alt8=4;
                }
                break;
            case 32:
                {
                alt8=5;
                }
                break;
            case 33:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalHypoMethod.g:1325:2: ( ( 'QUALITATIVE' ) )
                    {
                    // InternalHypoMethod.g:1325:2: ( ( 'QUALITATIVE' ) )
                    // InternalHypoMethod.g:1326:3: ( 'QUALITATIVE' )
                    {
                     before(grammarAccess.getVariableTypeAccess().getQUALITATIVEEnumLiteralDeclaration_0()); 
                    // InternalHypoMethod.g:1327:3: ( 'QUALITATIVE' )
                    // InternalHypoMethod.g:1327:4: 'QUALITATIVE'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariableTypeAccess().getQUALITATIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1331:2: ( ( 'QUANTITATIVE' ) )
                    {
                    // InternalHypoMethod.g:1331:2: ( ( 'QUANTITATIVE' ) )
                    // InternalHypoMethod.g:1332:3: ( 'QUANTITATIVE' )
                    {
                     before(grammarAccess.getVariableTypeAccess().getQUANTITATIVEEnumLiteralDeclaration_1()); 
                    // InternalHypoMethod.g:1333:3: ( 'QUANTITATIVE' )
                    // InternalHypoMethod.g:1333:4: 'QUANTITATIVE'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariableTypeAccess().getQUANTITATIVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:1337:2: ( ( 'CONTINOUS' ) )
                    {
                    // InternalHypoMethod.g:1337:2: ( ( 'CONTINOUS' ) )
                    // InternalHypoMethod.g:1338:3: ( 'CONTINOUS' )
                    {
                     before(grammarAccess.getVariableTypeAccess().getCONTINOUSEnumLiteralDeclaration_2()); 
                    // InternalHypoMethod.g:1339:3: ( 'CONTINOUS' )
                    // InternalHypoMethod.g:1339:4: 'CONTINOUS'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariableTypeAccess().getCONTINOUSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:1343:2: ( ( 'DISCRETE' ) )
                    {
                    // InternalHypoMethod.g:1343:2: ( ( 'DISCRETE' ) )
                    // InternalHypoMethod.g:1344:3: ( 'DISCRETE' )
                    {
                     before(grammarAccess.getVariableTypeAccess().getDISCRETEEnumLiteralDeclaration_3()); 
                    // InternalHypoMethod.g:1345:3: ( 'DISCRETE' )
                    // InternalHypoMethod.g:1345:4: 'DISCRETE'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariableTypeAccess().getDISCRETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHypoMethod.g:1349:2: ( ( 'BINARY' ) )
                    {
                    // InternalHypoMethod.g:1349:2: ( ( 'BINARY' ) )
                    // InternalHypoMethod.g:1350:3: ( 'BINARY' )
                    {
                     before(grammarAccess.getVariableTypeAccess().getBINARYEnumLiteralDeclaration_4()); 
                    // InternalHypoMethod.g:1351:3: ( 'BINARY' )
                    // InternalHypoMethod.g:1351:4: 'BINARY'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariableTypeAccess().getBINARYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHypoMethod.g:1355:2: ( ( 'NONBINARY' ) )
                    {
                    // InternalHypoMethod.g:1355:2: ( ( 'NONBINARY' ) )
                    // InternalHypoMethod.g:1356:3: ( 'NONBINARY' )
                    {
                     before(grammarAccess.getVariableTypeAccess().getNONBINARYEnumLiteralDeclaration_5()); 
                    // InternalHypoMethod.g:1357:3: ( 'NONBINARY' )
                    // InternalHypoMethod.g:1357:4: 'NONBINARY'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariableTypeAccess().getNONBINARYEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__VariableType__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalHypoMethod.g:1365:1: rule__Expression__Alternatives : ( ( ( 'TRUE' ) ) | ( ( 'FALSE' ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1369:1: ( ( ( 'TRUE' ) ) | ( ( 'FALSE' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            else if ( (LA9_0==35) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalHypoMethod.g:1370:2: ( ( 'TRUE' ) )
                    {
                    // InternalHypoMethod.g:1370:2: ( ( 'TRUE' ) )
                    // InternalHypoMethod.g:1371:3: ( 'TRUE' )
                    {
                     before(grammarAccess.getExpressionAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalHypoMethod.g:1372:3: ( 'TRUE' )
                    // InternalHypoMethod.g:1372:4: 'TRUE'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getExpressionAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1376:2: ( ( 'FALSE' ) )
                    {
                    // InternalHypoMethod.g:1376:2: ( ( 'FALSE' ) )
                    // InternalHypoMethod.g:1377:3: ( 'FALSE' )
                    {
                     before(grammarAccess.getExpressionAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalHypoMethod.g:1378:3: ( 'FALSE' )
                    // InternalHypoMethod.g:1378:4: 'FALSE'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getExpressionAccess().getFALSEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Links__Alternatives"
    // InternalHypoMethod.g:1386:1: rule__Links__Alternatives : ( ( ( 'is' ) ) | ( ( 'occurs' ) ) | ( ( 'to' ) ) | ( ( 'in' ) ) );
    public final void rule__Links__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1390:1: ( ( ( 'is' ) ) | ( ( 'occurs' ) ) | ( ( 'to' ) ) | ( ( 'in' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case 38:
                {
                alt10=3;
                }
                break;
            case 39:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalHypoMethod.g:1391:2: ( ( 'is' ) )
                    {
                    // InternalHypoMethod.g:1391:2: ( ( 'is' ) )
                    // InternalHypoMethod.g:1392:3: ( 'is' )
                    {
                     before(grammarAccess.getLinksAccess().getIsEnumLiteralDeclaration_0()); 
                    // InternalHypoMethod.g:1393:3: ( 'is' )
                    // InternalHypoMethod.g:1393:4: 'is'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinksAccess().getIsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1397:2: ( ( 'occurs' ) )
                    {
                    // InternalHypoMethod.g:1397:2: ( ( 'occurs' ) )
                    // InternalHypoMethod.g:1398:3: ( 'occurs' )
                    {
                     before(grammarAccess.getLinksAccess().getOccursEnumLiteralDeclaration_1()); 
                    // InternalHypoMethod.g:1399:3: ( 'occurs' )
                    // InternalHypoMethod.g:1399:4: 'occurs'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinksAccess().getOccursEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:1403:2: ( ( 'to' ) )
                    {
                    // InternalHypoMethod.g:1403:2: ( ( 'to' ) )
                    // InternalHypoMethod.g:1404:3: ( 'to' )
                    {
                     before(grammarAccess.getLinksAccess().getToEnumLiteralDeclaration_2()); 
                    // InternalHypoMethod.g:1405:3: ( 'to' )
                    // InternalHypoMethod.g:1405:4: 'to'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinksAccess().getToEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:1409:2: ( ( 'in' ) )
                    {
                    // InternalHypoMethod.g:1409:2: ( ( 'in' ) )
                    // InternalHypoMethod.g:1410:3: ( 'in' )
                    {
                     before(grammarAccess.getLinksAccess().getInEnumLiteralDeclaration_3()); 
                    // InternalHypoMethod.g:1411:3: ( 'in' )
                    // InternalHypoMethod.g:1411:4: 'in'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinksAccess().getInEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Links__Alternatives"


    // $ANTLR start "rule__Temporal__Alternatives"
    // InternalHypoMethod.g:1419:1: rule__Temporal__Alternatives : ( ( ( 'precedes' ) ) | ( ( 'between' ) ) | ( ( 'eventually' ) ) | ( ( 'always' ) ) | ( ( 'before' ) ) | ( ( 'after' ) ) | ( ( 'until' ) ) | ( ( 'never' ) ) | ( ( 'leads' ) ) | ( ( 'absent' ) ) | ( ( 'exists' ) ) );
    public final void rule__Temporal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1423:1: ( ( ( 'precedes' ) ) | ( ( 'between' ) ) | ( ( 'eventually' ) ) | ( ( 'always' ) ) | ( ( 'before' ) ) | ( ( 'after' ) ) | ( ( 'until' ) ) | ( ( 'never' ) ) | ( ( 'leads' ) ) | ( ( 'absent' ) ) | ( ( 'exists' ) ) )
            int alt11=11;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            case 43:
                {
                alt11=4;
                }
                break;
            case 44:
                {
                alt11=5;
                }
                break;
            case 45:
                {
                alt11=6;
                }
                break;
            case 46:
                {
                alt11=7;
                }
                break;
            case 47:
                {
                alt11=8;
                }
                break;
            case 48:
                {
                alt11=9;
                }
                break;
            case 49:
                {
                alt11=10;
                }
                break;
            case 50:
                {
                alt11=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalHypoMethod.g:1424:2: ( ( 'precedes' ) )
                    {
                    // InternalHypoMethod.g:1424:2: ( ( 'precedes' ) )
                    // InternalHypoMethod.g:1425:3: ( 'precedes' )
                    {
                     before(grammarAccess.getTemporalAccess().getPrecedesEnumLiteralDeclaration_0()); 
                    // InternalHypoMethod.g:1426:3: ( 'precedes' )
                    // InternalHypoMethod.g:1426:4: 'precedes'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalAccess().getPrecedesEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1430:2: ( ( 'between' ) )
                    {
                    // InternalHypoMethod.g:1430:2: ( ( 'between' ) )
                    // InternalHypoMethod.g:1431:3: ( 'between' )
                    {
                     before(grammarAccess.getTemporalAccess().getBetweenEnumLiteralDeclaration_1()); 
                    // InternalHypoMethod.g:1432:3: ( 'between' )
                    // InternalHypoMethod.g:1432:4: 'between'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalAccess().getBetweenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:1436:2: ( ( 'eventually' ) )
                    {
                    // InternalHypoMethod.g:1436:2: ( ( 'eventually' ) )
                    // InternalHypoMethod.g:1437:3: ( 'eventually' )
                    {
                     before(grammarAccess.getTemporalAccess().getEventuallyEnumLiteralDeclaration_2()); 
                    // InternalHypoMethod.g:1438:3: ( 'eventually' )
                    // InternalHypoMethod.g:1438:4: 'eventually'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalAccess().getEventuallyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:1442:2: ( ( 'always' ) )
                    {
                    // InternalHypoMethod.g:1442:2: ( ( 'always' ) )
                    // InternalHypoMethod.g:1443:3: ( 'always' )
                    {
                     before(grammarAccess.getTemporalAccess().getAlwaysEnumLiteralDeclaration_3()); 
                    // InternalHypoMethod.g:1444:3: ( 'always' )
                    // InternalHypoMethod.g:1444:4: 'always'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalAccess().getAlwaysEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHypoMethod.g:1448:2: ( ( 'before' ) )
                    {
                    // InternalHypoMethod.g:1448:2: ( ( 'before' ) )
                    // InternalHypoMethod.g:1449:3: ( 'before' )
                    {
                     before(grammarAccess.getTemporalAccess().getBeforeEnumLiteralDeclaration_4()); 
                    // InternalHypoMethod.g:1450:3: ( 'before' )
                    // InternalHypoMethod.g:1450:4: 'before'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalAccess().getBeforeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHypoMethod.g:1454:2: ( ( 'after' ) )
                    {
                    // InternalHypoMethod.g:1454:2: ( ( 'after' ) )
                    // InternalHypoMethod.g:1455:3: ( 'after' )
                    {
                     before(grammarAccess.getTemporalAccess().getAfterEnumLiteralDeclaration_5()); 
                    // InternalHypoMethod.g:1456:3: ( 'after' )
                    // InternalHypoMethod.g:1456:4: 'after'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalAccess().getAfterEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHypoMethod.g:1460:2: ( ( 'until' ) )
                    {
                    // InternalHypoMethod.g:1460:2: ( ( 'until' ) )
                    // InternalHypoMethod.g:1461:3: ( 'until' )
                    {
                     before(grammarAccess.getTemporalAccess().getUntilEnumLiteralDeclaration_6()); 
                    // InternalHypoMethod.g:1462:3: ( 'until' )
                    // InternalHypoMethod.g:1462:4: 'until'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalAccess().getUntilEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalHypoMethod.g:1466:2: ( ( 'never' ) )
                    {
                    // InternalHypoMethod.g:1466:2: ( ( 'never' ) )
                    // InternalHypoMethod.g:1467:3: ( 'never' )
                    {
                     before(grammarAccess.getTemporalAccess().getNeverEnumLiteralDeclaration_7()); 
                    // InternalHypoMethod.g:1468:3: ( 'never' )
                    // InternalHypoMethod.g:1468:4: 'never'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalAccess().getNeverEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalHypoMethod.g:1472:2: ( ( 'leads' ) )
                    {
                    // InternalHypoMethod.g:1472:2: ( ( 'leads' ) )
                    // InternalHypoMethod.g:1473:3: ( 'leads' )
                    {
                     before(grammarAccess.getTemporalAccess().getLeadsEnumLiteralDeclaration_8()); 
                    // InternalHypoMethod.g:1474:3: ( 'leads' )
                    // InternalHypoMethod.g:1474:4: 'leads'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalAccess().getLeadsEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalHypoMethod.g:1478:2: ( ( 'absent' ) )
                    {
                    // InternalHypoMethod.g:1478:2: ( ( 'absent' ) )
                    // InternalHypoMethod.g:1479:3: ( 'absent' )
                    {
                     before(grammarAccess.getTemporalAccess().getAbsentEnumLiteralDeclaration_9()); 
                    // InternalHypoMethod.g:1480:3: ( 'absent' )
                    // InternalHypoMethod.g:1480:4: 'absent'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalAccess().getAbsentEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalHypoMethod.g:1484:2: ( ( 'exists' ) )
                    {
                    // InternalHypoMethod.g:1484:2: ( ( 'exists' ) )
                    // InternalHypoMethod.g:1485:3: ( 'exists' )
                    {
                     before(grammarAccess.getTemporalAccess().getExistsEnumLiteralDeclaration_10()); 
                    // InternalHypoMethod.g:1486:3: ( 'exists' )
                    // InternalHypoMethod.g:1486:4: 'exists'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalAccess().getExistsEnumLiteralDeclaration_10()); 

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
    // $ANTLR end "rule__Temporal__Alternatives"


    // $ANTLR start "rule__Logical__Alternatives"
    // InternalHypoMethod.g:1494:1: rule__Logical__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'not' ) ) );
    public final void rule__Logical__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1498:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'not' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt12=1;
                }
                break;
            case 52:
                {
                alt12=2;
                }
                break;
            case 53:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalHypoMethod.g:1499:2: ( ( 'and' ) )
                    {
                    // InternalHypoMethod.g:1499:2: ( ( 'and' ) )
                    // InternalHypoMethod.g:1500:3: ( 'and' )
                    {
                     before(grammarAccess.getLogicalAccess().getAndEnumLiteralDeclaration_0()); 
                    // InternalHypoMethod.g:1501:3: ( 'and' )
                    // InternalHypoMethod.g:1501:4: 'and'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicalAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1505:2: ( ( 'or' ) )
                    {
                    // InternalHypoMethod.g:1505:2: ( ( 'or' ) )
                    // InternalHypoMethod.g:1506:3: ( 'or' )
                    {
                     before(grammarAccess.getLogicalAccess().getOrEnumLiteralDeclaration_1()); 
                    // InternalHypoMethod.g:1507:3: ( 'or' )
                    // InternalHypoMethod.g:1507:4: 'or'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicalAccess().getOrEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:1511:2: ( ( 'not' ) )
                    {
                    // InternalHypoMethod.g:1511:2: ( ( 'not' ) )
                    // InternalHypoMethod.g:1512:3: ( 'not' )
                    {
                     before(grammarAccess.getLogicalAccess().getNotEnumLiteralDeclaration_2()); 
                    // InternalHypoMethod.g:1513:3: ( 'not' )
                    // InternalHypoMethod.g:1513:4: 'not'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicalAccess().getNotEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Logical__Alternatives"


    // $ANTLR start "rule__Coherence__Alternatives"
    // InternalHypoMethod.g:1521:1: rule__Coherence__Alternatives : ( ( ( 'EXPLAIN' ) ) | ( ( 'ANALOGOUS' ) ) | ( ( 'DATA' ) ) | ( ( 'CONTRADICT' ) ) );
    public final void rule__Coherence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1525:1: ( ( ( 'EXPLAIN' ) ) | ( ( 'ANALOGOUS' ) ) | ( ( 'DATA' ) ) | ( ( 'CONTRADICT' ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt13=1;
                }
                break;
            case 55:
                {
                alt13=2;
                }
                break;
            case 56:
                {
                alt13=3;
                }
                break;
            case 57:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalHypoMethod.g:1526:2: ( ( 'EXPLAIN' ) )
                    {
                    // InternalHypoMethod.g:1526:2: ( ( 'EXPLAIN' ) )
                    // InternalHypoMethod.g:1527:3: ( 'EXPLAIN' )
                    {
                     before(grammarAccess.getCoherenceAccess().getEXPLAINEnumLiteralDeclaration_0()); 
                    // InternalHypoMethod.g:1528:3: ( 'EXPLAIN' )
                    // InternalHypoMethod.g:1528:4: 'EXPLAIN'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getCoherenceAccess().getEXPLAINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1532:2: ( ( 'ANALOGOUS' ) )
                    {
                    // InternalHypoMethod.g:1532:2: ( ( 'ANALOGOUS' ) )
                    // InternalHypoMethod.g:1533:3: ( 'ANALOGOUS' )
                    {
                     before(grammarAccess.getCoherenceAccess().getANALOGOUSEnumLiteralDeclaration_1()); 
                    // InternalHypoMethod.g:1534:3: ( 'ANALOGOUS' )
                    // InternalHypoMethod.g:1534:4: 'ANALOGOUS'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getCoherenceAccess().getANALOGOUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:1538:2: ( ( 'DATA' ) )
                    {
                    // InternalHypoMethod.g:1538:2: ( ( 'DATA' ) )
                    // InternalHypoMethod.g:1539:3: ( 'DATA' )
                    {
                     before(grammarAccess.getCoherenceAccess().getDATAEnumLiteralDeclaration_2()); 
                    // InternalHypoMethod.g:1540:3: ( 'DATA' )
                    // InternalHypoMethod.g:1540:4: 'DATA'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getCoherenceAccess().getDATAEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:1544:2: ( ( 'CONTRADICT' ) )
                    {
                    // InternalHypoMethod.g:1544:2: ( ( 'CONTRADICT' ) )
                    // InternalHypoMethod.g:1545:3: ( 'CONTRADICT' )
                    {
                     before(grammarAccess.getCoherenceAccess().getCONTRADICTEnumLiteralDeclaration_3()); 
                    // InternalHypoMethod.g:1546:3: ( 'CONTRADICT' )
                    // InternalHypoMethod.g:1546:4: 'CONTRADICT'
                    {
                    match(input,57,FOLLOW_2); 

                    }

                     after(grammarAccess.getCoherenceAccess().getCONTRADICTEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Coherence__Alternatives"


    // $ANTLR start "rule__Function__Alternatives"
    // InternalHypoMethod.g:1554:1: rule__Function__Alternatives : ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'EXP' ) ) | ( ( 'INVERSE' ) ) | ( ( 'SIN' ) ) | ( ( 'COS' ) ) | ( ( 'TAN' ) ) | ( ( 'FACTORIAL' ) ) | ( ( 'LOG' ) ) );
    public final void rule__Function__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1558:1: ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'EXP' ) ) | ( ( 'INVERSE' ) ) | ( ( 'SIN' ) ) | ( ( 'COS' ) ) | ( ( 'TAN' ) ) | ( ( 'FACTORIAL' ) ) | ( ( 'LOG' ) ) )
            int alt14=9;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt14=1;
                }
                break;
            case 59:
                {
                alt14=2;
                }
                break;
            case 60:
                {
                alt14=3;
                }
                break;
            case 61:
                {
                alt14=4;
                }
                break;
            case 62:
                {
                alt14=5;
                }
                break;
            case 63:
                {
                alt14=6;
                }
                break;
            case 64:
                {
                alt14=7;
                }
                break;
            case 65:
                {
                alt14=8;
                }
                break;
            case 66:
                {
                alt14=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalHypoMethod.g:1559:2: ( ( 'MIN' ) )
                    {
                    // InternalHypoMethod.g:1559:2: ( ( 'MIN' ) )
                    // InternalHypoMethod.g:1560:3: ( 'MIN' )
                    {
                     before(grammarAccess.getFunctionAccess().getMINEnumLiteralDeclaration_0()); 
                    // InternalHypoMethod.g:1561:3: ( 'MIN' )
                    // InternalHypoMethod.g:1561:4: 'MIN'
                    {
                    match(input,58,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionAccess().getMINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1565:2: ( ( 'MAX' ) )
                    {
                    // InternalHypoMethod.g:1565:2: ( ( 'MAX' ) )
                    // InternalHypoMethod.g:1566:3: ( 'MAX' )
                    {
                     before(grammarAccess.getFunctionAccess().getMAXEnumLiteralDeclaration_1()); 
                    // InternalHypoMethod.g:1567:3: ( 'MAX' )
                    // InternalHypoMethod.g:1567:4: 'MAX'
                    {
                    match(input,59,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionAccess().getMAXEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:1571:2: ( ( 'EXP' ) )
                    {
                    // InternalHypoMethod.g:1571:2: ( ( 'EXP' ) )
                    // InternalHypoMethod.g:1572:3: ( 'EXP' )
                    {
                     before(grammarAccess.getFunctionAccess().getEXPEnumLiteralDeclaration_2()); 
                    // InternalHypoMethod.g:1573:3: ( 'EXP' )
                    // InternalHypoMethod.g:1573:4: 'EXP'
                    {
                    match(input,60,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionAccess().getEXPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHypoMethod.g:1577:2: ( ( 'INVERSE' ) )
                    {
                    // InternalHypoMethod.g:1577:2: ( ( 'INVERSE' ) )
                    // InternalHypoMethod.g:1578:3: ( 'INVERSE' )
                    {
                     before(grammarAccess.getFunctionAccess().getINVERSEEnumLiteralDeclaration_3()); 
                    // InternalHypoMethod.g:1579:3: ( 'INVERSE' )
                    // InternalHypoMethod.g:1579:4: 'INVERSE'
                    {
                    match(input,61,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionAccess().getINVERSEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHypoMethod.g:1583:2: ( ( 'SIN' ) )
                    {
                    // InternalHypoMethod.g:1583:2: ( ( 'SIN' ) )
                    // InternalHypoMethod.g:1584:3: ( 'SIN' )
                    {
                     before(grammarAccess.getFunctionAccess().getSINEnumLiteralDeclaration_4()); 
                    // InternalHypoMethod.g:1585:3: ( 'SIN' )
                    // InternalHypoMethod.g:1585:4: 'SIN'
                    {
                    match(input,62,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionAccess().getSINEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHypoMethod.g:1589:2: ( ( 'COS' ) )
                    {
                    // InternalHypoMethod.g:1589:2: ( ( 'COS' ) )
                    // InternalHypoMethod.g:1590:3: ( 'COS' )
                    {
                     before(grammarAccess.getFunctionAccess().getCOSEnumLiteralDeclaration_5()); 
                    // InternalHypoMethod.g:1591:3: ( 'COS' )
                    // InternalHypoMethod.g:1591:4: 'COS'
                    {
                    match(input,63,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionAccess().getCOSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHypoMethod.g:1595:2: ( ( 'TAN' ) )
                    {
                    // InternalHypoMethod.g:1595:2: ( ( 'TAN' ) )
                    // InternalHypoMethod.g:1596:3: ( 'TAN' )
                    {
                     before(grammarAccess.getFunctionAccess().getTANEnumLiteralDeclaration_6()); 
                    // InternalHypoMethod.g:1597:3: ( 'TAN' )
                    // InternalHypoMethod.g:1597:4: 'TAN'
                    {
                    match(input,64,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionAccess().getTANEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalHypoMethod.g:1601:2: ( ( 'FACTORIAL' ) )
                    {
                    // InternalHypoMethod.g:1601:2: ( ( 'FACTORIAL' ) )
                    // InternalHypoMethod.g:1602:3: ( 'FACTORIAL' )
                    {
                     before(grammarAccess.getFunctionAccess().getFACTORIALEnumLiteralDeclaration_7()); 
                    // InternalHypoMethod.g:1603:3: ( 'FACTORIAL' )
                    // InternalHypoMethod.g:1603:4: 'FACTORIAL'
                    {
                    match(input,65,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionAccess().getFACTORIALEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalHypoMethod.g:1607:2: ( ( 'LOG' ) )
                    {
                    // InternalHypoMethod.g:1607:2: ( ( 'LOG' ) )
                    // InternalHypoMethod.g:1608:3: ( 'LOG' )
                    {
                     before(grammarAccess.getFunctionAccess().getLOGEnumLiteralDeclaration_8()); 
                    // InternalHypoMethod.g:1609:3: ( 'LOG' )
                    // InternalHypoMethod.g:1609:4: 'LOG'
                    {
                    match(input,66,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionAccess().getLOGEnumLiteralDeclaration_8()); 

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
    // $ANTLR end "rule__Function__Alternatives"


    // $ANTLR start "rule__Levels__Alternatives"
    // InternalHypoMethod.g:1617:1: rule__Levels__Alternatives : ( ( ( 'HIGH' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LOW' ) ) );
    public final void rule__Levels__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1621:1: ( ( ( 'HIGH' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LOW' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt15=1;
                }
                break;
            case 68:
                {
                alt15=2;
                }
                break;
            case 69:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalHypoMethod.g:1622:2: ( ( 'HIGH' ) )
                    {
                    // InternalHypoMethod.g:1622:2: ( ( 'HIGH' ) )
                    // InternalHypoMethod.g:1623:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getLevelsAccess().getHIGHEnumLiteralDeclaration_0()); 
                    // InternalHypoMethod.g:1624:3: ( 'HIGH' )
                    // InternalHypoMethod.g:1624:4: 'HIGH'
                    {
                    match(input,67,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelsAccess().getHIGHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1628:2: ( ( 'MEDIUM' ) )
                    {
                    // InternalHypoMethod.g:1628:2: ( ( 'MEDIUM' ) )
                    // InternalHypoMethod.g:1629:3: ( 'MEDIUM' )
                    {
                     before(grammarAccess.getLevelsAccess().getMEDIUMEnumLiteralDeclaration_1()); 
                    // InternalHypoMethod.g:1630:3: ( 'MEDIUM' )
                    // InternalHypoMethod.g:1630:4: 'MEDIUM'
                    {
                    match(input,68,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelsAccess().getMEDIUMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:1634:2: ( ( 'LOW' ) )
                    {
                    // InternalHypoMethod.g:1634:2: ( ( 'LOW' ) )
                    // InternalHypoMethod.g:1635:3: ( 'LOW' )
                    {
                     before(grammarAccess.getLevelsAccess().getLOWEnumLiteralDeclaration_2()); 
                    // InternalHypoMethod.g:1636:3: ( 'LOW' )
                    // InternalHypoMethod.g:1636:4: 'LOW'
                    {
                    match(input,69,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelsAccess().getLOWEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Levels__Alternatives"


    // $ANTLR start "rule__DesignType__Alternatives"
    // InternalHypoMethod.g:1644:1: rule__DesignType__Alternatives : ( ( ( 'FULLFACTORIAL' ) ) | ( ( 'FRACTIONALFACTORIAL' ) ) | ( ( 'OTHERS' ) ) );
    public final void rule__DesignType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1648:1: ( ( ( 'FULLFACTORIAL' ) ) | ( ( 'FRACTIONALFACTORIAL' ) ) | ( ( 'OTHERS' ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt16=1;
                }
                break;
            case 71:
                {
                alt16=2;
                }
                break;
            case 72:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalHypoMethod.g:1649:2: ( ( 'FULLFACTORIAL' ) )
                    {
                    // InternalHypoMethod.g:1649:2: ( ( 'FULLFACTORIAL' ) )
                    // InternalHypoMethod.g:1650:3: ( 'FULLFACTORIAL' )
                    {
                     before(grammarAccess.getDesignTypeAccess().getFULLFACTORIALEnumLiteralDeclaration_0()); 
                    // InternalHypoMethod.g:1651:3: ( 'FULLFACTORIAL' )
                    // InternalHypoMethod.g:1651:4: 'FULLFACTORIAL'
                    {
                    match(input,70,FOLLOW_2); 

                    }

                     after(grammarAccess.getDesignTypeAccess().getFULLFACTORIALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1655:2: ( ( 'FRACTIONALFACTORIAL' ) )
                    {
                    // InternalHypoMethod.g:1655:2: ( ( 'FRACTIONALFACTORIAL' ) )
                    // InternalHypoMethod.g:1656:3: ( 'FRACTIONALFACTORIAL' )
                    {
                     before(grammarAccess.getDesignTypeAccess().getFRACTIONALFACTORIALEnumLiteralDeclaration_1()); 
                    // InternalHypoMethod.g:1657:3: ( 'FRACTIONALFACTORIAL' )
                    // InternalHypoMethod.g:1657:4: 'FRACTIONALFACTORIAL'
                    {
                    match(input,71,FOLLOW_2); 

                    }

                     after(grammarAccess.getDesignTypeAccess().getFRACTIONALFACTORIALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHypoMethod.g:1661:2: ( ( 'OTHERS' ) )
                    {
                    // InternalHypoMethod.g:1661:2: ( ( 'OTHERS' ) )
                    // InternalHypoMethod.g:1662:3: ( 'OTHERS' )
                    {
                     before(grammarAccess.getDesignTypeAccess().getOTHERSEnumLiteralDeclaration_2()); 
                    // InternalHypoMethod.g:1663:3: ( 'OTHERS' )
                    // InternalHypoMethod.g:1663:4: 'OTHERS'
                    {
                    match(input,72,FOLLOW_2); 

                    }

                     after(grammarAccess.getDesignTypeAccess().getOTHERSEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__DesignType__Alternatives"


    // $ANTLR start "rule__ResponseType__Alternatives"
    // InternalHypoMethod.g:1671:1: rule__ResponseType__Alternatives : ( ( ( 'SIMPLE' ) ) | ( ( 'COMPOSITE' ) ) );
    public final void rule__ResponseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1675:1: ( ( ( 'SIMPLE' ) ) | ( ( 'COMPOSITE' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==73) ) {
                alt17=1;
            }
            else if ( (LA17_0==74) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalHypoMethod.g:1676:2: ( ( 'SIMPLE' ) )
                    {
                    // InternalHypoMethod.g:1676:2: ( ( 'SIMPLE' ) )
                    // InternalHypoMethod.g:1677:3: ( 'SIMPLE' )
                    {
                     before(grammarAccess.getResponseTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 
                    // InternalHypoMethod.g:1678:3: ( 'SIMPLE' )
                    // InternalHypoMethod.g:1678:4: 'SIMPLE'
                    {
                    match(input,73,FOLLOW_2); 

                    }

                     after(grammarAccess.getResponseTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHypoMethod.g:1682:2: ( ( 'COMPOSITE' ) )
                    {
                    // InternalHypoMethod.g:1682:2: ( ( 'COMPOSITE' ) )
                    // InternalHypoMethod.g:1683:3: ( 'COMPOSITE' )
                    {
                     before(grammarAccess.getResponseTypeAccess().getCOMPOSITEEnumLiteralDeclaration_1()); 
                    // InternalHypoMethod.g:1684:3: ( 'COMPOSITE' )
                    // InternalHypoMethod.g:1684:4: 'COMPOSITE'
                    {
                    match(input,74,FOLLOW_2); 

                    }

                     after(grammarAccess.getResponseTypeAccess().getCOMPOSITEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ResponseType__Alternatives"


    // $ANTLR start "rule__ModelSection__Group__0"
    // InternalHypoMethod.g:1692:1: rule__ModelSection__Group__0 : rule__ModelSection__Group__0__Impl rule__ModelSection__Group__1 ;
    public final void rule__ModelSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1696:1: ( rule__ModelSection__Group__0__Impl rule__ModelSection__Group__1 )
            // InternalHypoMethod.g:1697:2: rule__ModelSection__Group__0__Impl rule__ModelSection__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ModelSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__0"


    // $ANTLR start "rule__ModelSection__Group__0__Impl"
    // InternalHypoMethod.g:1704:1: rule__ModelSection__Group__0__Impl : ( 'model' ) ;
    public final void rule__ModelSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1708:1: ( ( 'model' ) )
            // InternalHypoMethod.g:1709:1: ( 'model' )
            {
            // InternalHypoMethod.g:1709:1: ( 'model' )
            // InternalHypoMethod.g:1710:2: 'model'
            {
             before(grammarAccess.getModelSectionAccess().getModelKeyword_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getModelSectionAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__0__Impl"


    // $ANTLR start "rule__ModelSection__Group__1"
    // InternalHypoMethod.g:1719:1: rule__ModelSection__Group__1 : rule__ModelSection__Group__1__Impl rule__ModelSection__Group__2 ;
    public final void rule__ModelSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1723:1: ( rule__ModelSection__Group__1__Impl rule__ModelSection__Group__2 )
            // InternalHypoMethod.g:1724:2: rule__ModelSection__Group__1__Impl rule__ModelSection__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ModelSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__1"


    // $ANTLR start "rule__ModelSection__Group__1__Impl"
    // InternalHypoMethod.g:1731:1: rule__ModelSection__Group__1__Impl : ( ( rule__ModelSection__ModNameAssignment_1 ) ) ;
    public final void rule__ModelSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1735:1: ( ( ( rule__ModelSection__ModNameAssignment_1 ) ) )
            // InternalHypoMethod.g:1736:1: ( ( rule__ModelSection__ModNameAssignment_1 ) )
            {
            // InternalHypoMethod.g:1736:1: ( ( rule__ModelSection__ModNameAssignment_1 ) )
            // InternalHypoMethod.g:1737:2: ( rule__ModelSection__ModNameAssignment_1 )
            {
             before(grammarAccess.getModelSectionAccess().getModNameAssignment_1()); 
            // InternalHypoMethod.g:1738:2: ( rule__ModelSection__ModNameAssignment_1 )
            // InternalHypoMethod.g:1738:3: rule__ModelSection__ModNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelSection__ModNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelSectionAccess().getModNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__1__Impl"


    // $ANTLR start "rule__ModelSection__Group__2"
    // InternalHypoMethod.g:1746:1: rule__ModelSection__Group__2 : rule__ModelSection__Group__2__Impl rule__ModelSection__Group__3 ;
    public final void rule__ModelSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1750:1: ( rule__ModelSection__Group__2__Impl rule__ModelSection__Group__3 )
            // InternalHypoMethod.g:1751:2: rule__ModelSection__Group__2__Impl rule__ModelSection__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ModelSection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__2"


    // $ANTLR start "rule__ModelSection__Group__2__Impl"
    // InternalHypoMethod.g:1758:1: rule__ModelSection__Group__2__Impl : ( '{' ) ;
    public final void rule__ModelSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1762:1: ( ( '{' ) )
            // InternalHypoMethod.g:1763:1: ( '{' )
            {
            // InternalHypoMethod.g:1763:1: ( '{' )
            // InternalHypoMethod.g:1764:2: '{'
            {
             before(grammarAccess.getModelSectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getModelSectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__2__Impl"


    // $ANTLR start "rule__ModelSection__Group__3"
    // InternalHypoMethod.g:1773:1: rule__ModelSection__Group__3 : rule__ModelSection__Group__3__Impl rule__ModelSection__Group__4 ;
    public final void rule__ModelSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1777:1: ( rule__ModelSection__Group__3__Impl rule__ModelSection__Group__4 )
            // InternalHypoMethod.g:1778:2: rule__ModelSection__Group__3__Impl rule__ModelSection__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ModelSection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__3"


    // $ANTLR start "rule__ModelSection__Group__3__Impl"
    // InternalHypoMethod.g:1785:1: rule__ModelSection__Group__3__Impl : ( ( rule__ModelSection__MechanismsAssignment_3 )* ) ;
    public final void rule__ModelSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1789:1: ( ( ( rule__ModelSection__MechanismsAssignment_3 )* ) )
            // InternalHypoMethod.g:1790:1: ( ( rule__ModelSection__MechanismsAssignment_3 )* )
            {
            // InternalHypoMethod.g:1790:1: ( ( rule__ModelSection__MechanismsAssignment_3 )* )
            // InternalHypoMethod.g:1791:2: ( rule__ModelSection__MechanismsAssignment_3 )*
            {
             before(grammarAccess.getModelSectionAccess().getMechanismsAssignment_3()); 
            // InternalHypoMethod.g:1792:2: ( rule__ModelSection__MechanismsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==78) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalHypoMethod.g:1792:3: rule__ModelSection__MechanismsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ModelSection__MechanismsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getModelSectionAccess().getMechanismsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__3__Impl"


    // $ANTLR start "rule__ModelSection__Group__4"
    // InternalHypoMethod.g:1800:1: rule__ModelSection__Group__4 : rule__ModelSection__Group__4__Impl rule__ModelSection__Group__5 ;
    public final void rule__ModelSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1804:1: ( rule__ModelSection__Group__4__Impl rule__ModelSection__Group__5 )
            // InternalHypoMethod.g:1805:2: rule__ModelSection__Group__4__Impl rule__ModelSection__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ModelSection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__4"


    // $ANTLR start "rule__ModelSection__Group__4__Impl"
    // InternalHypoMethod.g:1812:1: rule__ModelSection__Group__4__Impl : ( ( rule__ModelSection__EventsAssignment_4 )* ) ;
    public final void rule__ModelSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1816:1: ( ( ( rule__ModelSection__EventsAssignment_4 )* ) )
            // InternalHypoMethod.g:1817:1: ( ( rule__ModelSection__EventsAssignment_4 )* )
            {
            // InternalHypoMethod.g:1817:1: ( ( rule__ModelSection__EventsAssignment_4 )* )
            // InternalHypoMethod.g:1818:2: ( rule__ModelSection__EventsAssignment_4 )*
            {
             before(grammarAccess.getModelSectionAccess().getEventsAssignment_4()); 
            // InternalHypoMethod.g:1819:2: ( rule__ModelSection__EventsAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==82) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalHypoMethod.g:1819:3: rule__ModelSection__EventsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ModelSection__EventsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getModelSectionAccess().getEventsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__4__Impl"


    // $ANTLR start "rule__ModelSection__Group__5"
    // InternalHypoMethod.g:1827:1: rule__ModelSection__Group__5 : rule__ModelSection__Group__5__Impl rule__ModelSection__Group__6 ;
    public final void rule__ModelSection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1831:1: ( rule__ModelSection__Group__5__Impl rule__ModelSection__Group__6 )
            // InternalHypoMethod.g:1832:2: rule__ModelSection__Group__5__Impl rule__ModelSection__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ModelSection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__5"


    // $ANTLR start "rule__ModelSection__Group__5__Impl"
    // InternalHypoMethod.g:1839:1: rule__ModelSection__Group__5__Impl : ( ( rule__ModelSection__ParametersAssignment_5 )* ) ;
    public final void rule__ModelSection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1843:1: ( ( ( rule__ModelSection__ParametersAssignment_5 )* ) )
            // InternalHypoMethod.g:1844:1: ( ( rule__ModelSection__ParametersAssignment_5 )* )
            {
            // InternalHypoMethod.g:1844:1: ( ( rule__ModelSection__ParametersAssignment_5 )* )
            // InternalHypoMethod.g:1845:2: ( rule__ModelSection__ParametersAssignment_5 )*
            {
             before(grammarAccess.getModelSectionAccess().getParametersAssignment_5()); 
            // InternalHypoMethod.g:1846:2: ( rule__ModelSection__ParametersAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==83) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalHypoMethod.g:1846:3: rule__ModelSection__ParametersAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ModelSection__ParametersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getModelSectionAccess().getParametersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__5__Impl"


    // $ANTLR start "rule__ModelSection__Group__6"
    // InternalHypoMethod.g:1854:1: rule__ModelSection__Group__6 : rule__ModelSection__Group__6__Impl ;
    public final void rule__ModelSection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1858:1: ( rule__ModelSection__Group__6__Impl )
            // InternalHypoMethod.g:1859:2: rule__ModelSection__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelSection__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__6"


    // $ANTLR start "rule__ModelSection__Group__6__Impl"
    // InternalHypoMethod.g:1865:1: rule__ModelSection__Group__6__Impl : ( '}' ) ;
    public final void rule__ModelSection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1869:1: ( ( '}' ) )
            // InternalHypoMethod.g:1870:1: ( '}' )
            {
            // InternalHypoMethod.g:1870:1: ( '}' )
            // InternalHypoMethod.g:1871:2: '}'
            {
             before(grammarAccess.getModelSectionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getModelSectionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__Group__6__Impl"


    // $ANTLR start "rule__Mechanism__Group__0"
    // InternalHypoMethod.g:1881:1: rule__Mechanism__Group__0 : rule__Mechanism__Group__0__Impl rule__Mechanism__Group__1 ;
    public final void rule__Mechanism__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1885:1: ( rule__Mechanism__Group__0__Impl rule__Mechanism__Group__1 )
            // InternalHypoMethod.g:1886:2: rule__Mechanism__Group__0__Impl rule__Mechanism__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Mechanism__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mechanism__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__0"


    // $ANTLR start "rule__Mechanism__Group__0__Impl"
    // InternalHypoMethod.g:1893:1: rule__Mechanism__Group__0__Impl : ( 'mechanism' ) ;
    public final void rule__Mechanism__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1897:1: ( ( 'mechanism' ) )
            // InternalHypoMethod.g:1898:1: ( 'mechanism' )
            {
            // InternalHypoMethod.g:1898:1: ( 'mechanism' )
            // InternalHypoMethod.g:1899:2: 'mechanism'
            {
             before(grammarAccess.getMechanismAccess().getMechanismKeyword_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getMechanismAccess().getMechanismKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__0__Impl"


    // $ANTLR start "rule__Mechanism__Group__1"
    // InternalHypoMethod.g:1908:1: rule__Mechanism__Group__1 : rule__Mechanism__Group__1__Impl rule__Mechanism__Group__2 ;
    public final void rule__Mechanism__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1912:1: ( rule__Mechanism__Group__1__Impl rule__Mechanism__Group__2 )
            // InternalHypoMethod.g:1913:2: rule__Mechanism__Group__1__Impl rule__Mechanism__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Mechanism__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mechanism__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__1"


    // $ANTLR start "rule__Mechanism__Group__1__Impl"
    // InternalHypoMethod.g:1920:1: rule__Mechanism__Group__1__Impl : ( ( rule__Mechanism__MechanismNameAssignment_1 ) ) ;
    public final void rule__Mechanism__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1924:1: ( ( ( rule__Mechanism__MechanismNameAssignment_1 ) ) )
            // InternalHypoMethod.g:1925:1: ( ( rule__Mechanism__MechanismNameAssignment_1 ) )
            {
            // InternalHypoMethod.g:1925:1: ( ( rule__Mechanism__MechanismNameAssignment_1 ) )
            // InternalHypoMethod.g:1926:2: ( rule__Mechanism__MechanismNameAssignment_1 )
            {
             before(grammarAccess.getMechanismAccess().getMechanismNameAssignment_1()); 
            // InternalHypoMethod.g:1927:2: ( rule__Mechanism__MechanismNameAssignment_1 )
            // InternalHypoMethod.g:1927:3: rule__Mechanism__MechanismNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mechanism__MechanismNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMechanismAccess().getMechanismNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__1__Impl"


    // $ANTLR start "rule__Mechanism__Group__2"
    // InternalHypoMethod.g:1935:1: rule__Mechanism__Group__2 : rule__Mechanism__Group__2__Impl rule__Mechanism__Group__3 ;
    public final void rule__Mechanism__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1939:1: ( rule__Mechanism__Group__2__Impl rule__Mechanism__Group__3 )
            // InternalHypoMethod.g:1940:2: rule__Mechanism__Group__2__Impl rule__Mechanism__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Mechanism__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mechanism__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__2"


    // $ANTLR start "rule__Mechanism__Group__2__Impl"
    // InternalHypoMethod.g:1947:1: rule__Mechanism__Group__2__Impl : ( ' = ' ) ;
    public final void rule__Mechanism__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1951:1: ( ( ' = ' ) )
            // InternalHypoMethod.g:1952:1: ( ' = ' )
            {
            // InternalHypoMethod.g:1952:1: ( ' = ' )
            // InternalHypoMethod.g:1953:2: ' = '
            {
             before(grammarAccess.getMechanismAccess().getSpaceEqualsSignSpaceKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMechanismAccess().getSpaceEqualsSignSpaceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__2__Impl"


    // $ANTLR start "rule__Mechanism__Group__3"
    // InternalHypoMethod.g:1962:1: rule__Mechanism__Group__3 : rule__Mechanism__Group__3__Impl rule__Mechanism__Group__4 ;
    public final void rule__Mechanism__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1966:1: ( rule__Mechanism__Group__3__Impl rule__Mechanism__Group__4 )
            // InternalHypoMethod.g:1967:2: rule__Mechanism__Group__3__Impl rule__Mechanism__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Mechanism__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mechanism__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__3"


    // $ANTLR start "rule__Mechanism__Group__3__Impl"
    // InternalHypoMethod.g:1974:1: rule__Mechanism__Group__3__Impl : ( ( rule__Mechanism__LHSAssignment_3 ) ) ;
    public final void rule__Mechanism__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1978:1: ( ( ( rule__Mechanism__LHSAssignment_3 ) ) )
            // InternalHypoMethod.g:1979:1: ( ( rule__Mechanism__LHSAssignment_3 ) )
            {
            // InternalHypoMethod.g:1979:1: ( ( rule__Mechanism__LHSAssignment_3 ) )
            // InternalHypoMethod.g:1980:2: ( rule__Mechanism__LHSAssignment_3 )
            {
             before(grammarAccess.getMechanismAccess().getLHSAssignment_3()); 
            // InternalHypoMethod.g:1981:2: ( rule__Mechanism__LHSAssignment_3 )
            // InternalHypoMethod.g:1981:3: rule__Mechanism__LHSAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mechanism__LHSAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMechanismAccess().getLHSAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__3__Impl"


    // $ANTLR start "rule__Mechanism__Group__4"
    // InternalHypoMethod.g:1989:1: rule__Mechanism__Group__4 : rule__Mechanism__Group__4__Impl rule__Mechanism__Group__5 ;
    public final void rule__Mechanism__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:1993:1: ( rule__Mechanism__Group__4__Impl rule__Mechanism__Group__5 )
            // InternalHypoMethod.g:1994:2: rule__Mechanism__Group__4__Impl rule__Mechanism__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Mechanism__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mechanism__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__4"


    // $ANTLR start "rule__Mechanism__Group__4__Impl"
    // InternalHypoMethod.g:2001:1: rule__Mechanism__Group__4__Impl : ( ( rule__Mechanism__ConditionAssignment_4 )? ) ;
    public final void rule__Mechanism__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2005:1: ( ( ( rule__Mechanism__ConditionAssignment_4 )? ) )
            // InternalHypoMethod.g:2006:1: ( ( rule__Mechanism__ConditionAssignment_4 )? )
            {
            // InternalHypoMethod.g:2006:1: ( ( rule__Mechanism__ConditionAssignment_4 )? )
            // InternalHypoMethod.g:2007:2: ( rule__Mechanism__ConditionAssignment_4 )?
            {
             before(grammarAccess.getMechanismAccess().getConditionAssignment_4()); 
            // InternalHypoMethod.g:2008:2: ( rule__Mechanism__ConditionAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==106) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalHypoMethod.g:2008:3: rule__Mechanism__ConditionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mechanism__ConditionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMechanismAccess().getConditionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__4__Impl"


    // $ANTLR start "rule__Mechanism__Group__5"
    // InternalHypoMethod.g:2016:1: rule__Mechanism__Group__5 : rule__Mechanism__Group__5__Impl rule__Mechanism__Group__6 ;
    public final void rule__Mechanism__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2020:1: ( rule__Mechanism__Group__5__Impl rule__Mechanism__Group__6 )
            // InternalHypoMethod.g:2021:2: rule__Mechanism__Group__5__Impl rule__Mechanism__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Mechanism__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mechanism__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__5"


    // $ANTLR start "rule__Mechanism__Group__5__Impl"
    // InternalHypoMethod.g:2028:1: rule__Mechanism__Group__5__Impl : ( ' -> ' ) ;
    public final void rule__Mechanism__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2032:1: ( ( ' -> ' ) )
            // InternalHypoMethod.g:2033:1: ( ' -> ' )
            {
            // InternalHypoMethod.g:2033:1: ( ' -> ' )
            // InternalHypoMethod.g:2034:2: ' -> '
            {
             before(grammarAccess.getMechanismAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_5()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getMechanismAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__5__Impl"


    // $ANTLR start "rule__Mechanism__Group__6"
    // InternalHypoMethod.g:2043:1: rule__Mechanism__Group__6 : rule__Mechanism__Group__6__Impl ;
    public final void rule__Mechanism__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2047:1: ( rule__Mechanism__Group__6__Impl )
            // InternalHypoMethod.g:2048:2: rule__Mechanism__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mechanism__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__6"


    // $ANTLR start "rule__Mechanism__Group__6__Impl"
    // InternalHypoMethod.g:2054:1: rule__Mechanism__Group__6__Impl : ( ( rule__Mechanism__RHSAssignment_6 ) ) ;
    public final void rule__Mechanism__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2058:1: ( ( ( rule__Mechanism__RHSAssignment_6 ) ) )
            // InternalHypoMethod.g:2059:1: ( ( rule__Mechanism__RHSAssignment_6 ) )
            {
            // InternalHypoMethod.g:2059:1: ( ( rule__Mechanism__RHSAssignment_6 ) )
            // InternalHypoMethod.g:2060:2: ( rule__Mechanism__RHSAssignment_6 )
            {
             before(grammarAccess.getMechanismAccess().getRHSAssignment_6()); 
            // InternalHypoMethod.g:2061:2: ( rule__Mechanism__RHSAssignment_6 )
            // InternalHypoMethod.g:2061:3: rule__Mechanism__RHSAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Mechanism__RHSAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMechanismAccess().getRHSAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__Group__6__Impl"


    // $ANTLR start "rule__Reaction__Group__0"
    // InternalHypoMethod.g:2070:1: rule__Reaction__Group__0 : rule__Reaction__Group__0__Impl rule__Reaction__Group__1 ;
    public final void rule__Reaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2074:1: ( rule__Reaction__Group__0__Impl rule__Reaction__Group__1 )
            // InternalHypoMethod.g:2075:2: rule__Reaction__Group__0__Impl rule__Reaction__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Reaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__0"


    // $ANTLR start "rule__Reaction__Group__0__Impl"
    // InternalHypoMethod.g:2082:1: rule__Reaction__Group__0__Impl : ( ( rule__Reaction__Agent1Assignment_0 ) ) ;
    public final void rule__Reaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2086:1: ( ( ( rule__Reaction__Agent1Assignment_0 ) ) )
            // InternalHypoMethod.g:2087:1: ( ( rule__Reaction__Agent1Assignment_0 ) )
            {
            // InternalHypoMethod.g:2087:1: ( ( rule__Reaction__Agent1Assignment_0 ) )
            // InternalHypoMethod.g:2088:2: ( rule__Reaction__Agent1Assignment_0 )
            {
             before(grammarAccess.getReactionAccess().getAgent1Assignment_0()); 
            // InternalHypoMethod.g:2089:2: ( rule__Reaction__Agent1Assignment_0 )
            // InternalHypoMethod.g:2089:3: rule__Reaction__Agent1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Reaction__Agent1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReactionAccess().getAgent1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__0__Impl"


    // $ANTLR start "rule__Reaction__Group__1"
    // InternalHypoMethod.g:2097:1: rule__Reaction__Group__1 : rule__Reaction__Group__1__Impl rule__Reaction__Group__2 ;
    public final void rule__Reaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2101:1: ( rule__Reaction__Group__1__Impl rule__Reaction__Group__2 )
            // InternalHypoMethod.g:2102:2: rule__Reaction__Group__1__Impl rule__Reaction__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Reaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__1"


    // $ANTLR start "rule__Reaction__Group__1__Impl"
    // InternalHypoMethod.g:2109:1: rule__Reaction__Group__1__Impl : ( ( ' + ' )? ) ;
    public final void rule__Reaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2113:1: ( ( ( ' + ' )? ) )
            // InternalHypoMethod.g:2114:1: ( ( ' + ' )? )
            {
            // InternalHypoMethod.g:2114:1: ( ( ' + ' )? )
            // InternalHypoMethod.g:2115:2: ( ' + ' )?
            {
             before(grammarAccess.getReactionAccess().getSpacePlusSignSpaceKeyword_1()); 
            // InternalHypoMethod.g:2116:2: ( ' + ' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==80) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalHypoMethod.g:2116:3: ' + '
                    {
                    match(input,80,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getReactionAccess().getSpacePlusSignSpaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__1__Impl"


    // $ANTLR start "rule__Reaction__Group__2"
    // InternalHypoMethod.g:2124:1: rule__Reaction__Group__2 : rule__Reaction__Group__2__Impl ;
    public final void rule__Reaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2128:1: ( rule__Reaction__Group__2__Impl )
            // InternalHypoMethod.g:2129:2: rule__Reaction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reaction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__2"


    // $ANTLR start "rule__Reaction__Group__2__Impl"
    // InternalHypoMethod.g:2135:1: rule__Reaction__Group__2__Impl : ( ( rule__Reaction__AgentAssignment_2 )? ) ;
    public final void rule__Reaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2139:1: ( ( ( rule__Reaction__AgentAssignment_2 )? ) )
            // InternalHypoMethod.g:2140:1: ( ( rule__Reaction__AgentAssignment_2 )? )
            {
            // InternalHypoMethod.g:2140:1: ( ( rule__Reaction__AgentAssignment_2 )? )
            // InternalHypoMethod.g:2141:2: ( rule__Reaction__AgentAssignment_2 )?
            {
             before(grammarAccess.getReactionAccess().getAgentAssignment_2()); 
            // InternalHypoMethod.g:2142:2: ( rule__Reaction__AgentAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalHypoMethod.g:2142:3: rule__Reaction__AgentAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reaction__AgentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReactionAccess().getAgentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__2__Impl"


    // $ANTLR start "rule__GuardCondition__Group__0"
    // InternalHypoMethod.g:2151:1: rule__GuardCondition__Group__0 : rule__GuardCondition__Group__0__Impl rule__GuardCondition__Group__1 ;
    public final void rule__GuardCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2155:1: ( rule__GuardCondition__Group__0__Impl rule__GuardCondition__Group__1 )
            // InternalHypoMethod.g:2156:2: rule__GuardCondition__Group__0__Impl rule__GuardCondition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__GuardCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GuardCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__Group__0"


    // $ANTLR start "rule__GuardCondition__Group__0__Impl"
    // InternalHypoMethod.g:2163:1: rule__GuardCondition__Group__0__Impl : ( ( rule__GuardCondition__GdAssignment_0 ) ) ;
    public final void rule__GuardCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2167:1: ( ( ( rule__GuardCondition__GdAssignment_0 ) ) )
            // InternalHypoMethod.g:2168:1: ( ( rule__GuardCondition__GdAssignment_0 ) )
            {
            // InternalHypoMethod.g:2168:1: ( ( rule__GuardCondition__GdAssignment_0 ) )
            // InternalHypoMethod.g:2169:2: ( rule__GuardCondition__GdAssignment_0 )
            {
             before(grammarAccess.getGuardConditionAccess().getGdAssignment_0()); 
            // InternalHypoMethod.g:2170:2: ( rule__GuardCondition__GdAssignment_0 )
            // InternalHypoMethod.g:2170:3: rule__GuardCondition__GdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GuardCondition__GdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGuardConditionAccess().getGdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__Group__0__Impl"


    // $ANTLR start "rule__GuardCondition__Group__1"
    // InternalHypoMethod.g:2178:1: rule__GuardCondition__Group__1 : rule__GuardCondition__Group__1__Impl rule__GuardCondition__Group__2 ;
    public final void rule__GuardCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2182:1: ( rule__GuardCondition__Group__1__Impl rule__GuardCondition__Group__2 )
            // InternalHypoMethod.g:2183:2: rule__GuardCondition__Group__1__Impl rule__GuardCondition__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__GuardCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GuardCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__Group__1"


    // $ANTLR start "rule__GuardCondition__Group__1__Impl"
    // InternalHypoMethod.g:2190:1: rule__GuardCondition__Group__1__Impl : ( ( rule__GuardCondition__Condition1Assignment_1 )? ) ;
    public final void rule__GuardCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2194:1: ( ( ( rule__GuardCondition__Condition1Assignment_1 )? ) )
            // InternalHypoMethod.g:2195:1: ( ( rule__GuardCondition__Condition1Assignment_1 )? )
            {
            // InternalHypoMethod.g:2195:1: ( ( rule__GuardCondition__Condition1Assignment_1 )? )
            // InternalHypoMethod.g:2196:2: ( rule__GuardCondition__Condition1Assignment_1 )?
            {
             before(grammarAccess.getGuardConditionAccess().getCondition1Assignment_1()); 
            // InternalHypoMethod.g:2197:2: ( rule__GuardCondition__Condition1Assignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalHypoMethod.g:2197:3: rule__GuardCondition__Condition1Assignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GuardCondition__Condition1Assignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuardConditionAccess().getCondition1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__Group__1__Impl"


    // $ANTLR start "rule__GuardCondition__Group__2"
    // InternalHypoMethod.g:2205:1: rule__GuardCondition__Group__2 : rule__GuardCondition__Group__2__Impl rule__GuardCondition__Group__3 ;
    public final void rule__GuardCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2209:1: ( rule__GuardCondition__Group__2__Impl rule__GuardCondition__Group__3 )
            // InternalHypoMethod.g:2210:2: rule__GuardCondition__Group__2__Impl rule__GuardCondition__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__GuardCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GuardCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__Group__2"


    // $ANTLR start "rule__GuardCondition__Group__2__Impl"
    // InternalHypoMethod.g:2217:1: rule__GuardCondition__Group__2__Impl : ( ( rule__GuardCondition__LinkAssignment_2 )? ) ;
    public final void rule__GuardCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2221:1: ( ( ( rule__GuardCondition__LinkAssignment_2 )? ) )
            // InternalHypoMethod.g:2222:1: ( ( rule__GuardCondition__LinkAssignment_2 )? )
            {
            // InternalHypoMethod.g:2222:1: ( ( rule__GuardCondition__LinkAssignment_2 )? )
            // InternalHypoMethod.g:2223:2: ( rule__GuardCondition__LinkAssignment_2 )?
            {
             before(grammarAccess.getGuardConditionAccess().getLinkAssignment_2()); 
            // InternalHypoMethod.g:2224:2: ( rule__GuardCondition__LinkAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=13 && LA25_0<=27)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalHypoMethod.g:2224:3: rule__GuardCondition__LinkAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GuardCondition__LinkAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuardConditionAccess().getLinkAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__Group__2__Impl"


    // $ANTLR start "rule__GuardCondition__Group__3"
    // InternalHypoMethod.g:2232:1: rule__GuardCondition__Group__3 : rule__GuardCondition__Group__3__Impl rule__GuardCondition__Group__4 ;
    public final void rule__GuardCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2236:1: ( rule__GuardCondition__Group__3__Impl rule__GuardCondition__Group__4 )
            // InternalHypoMethod.g:2237:2: rule__GuardCondition__Group__3__Impl rule__GuardCondition__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__GuardCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GuardCondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__Group__3"


    // $ANTLR start "rule__GuardCondition__Group__3__Impl"
    // InternalHypoMethod.g:2244:1: rule__GuardCondition__Group__3__Impl : ( ( rule__GuardCondition__Condition2Assignment_3 )? ) ;
    public final void rule__GuardCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2248:1: ( ( ( rule__GuardCondition__Condition2Assignment_3 )? ) )
            // InternalHypoMethod.g:2249:1: ( ( rule__GuardCondition__Condition2Assignment_3 )? )
            {
            // InternalHypoMethod.g:2249:1: ( ( rule__GuardCondition__Condition2Assignment_3 )? )
            // InternalHypoMethod.g:2250:2: ( rule__GuardCondition__Condition2Assignment_3 )?
            {
             before(grammarAccess.getGuardConditionAccess().getCondition2Assignment_3()); 
            // InternalHypoMethod.g:2251:2: ( rule__GuardCondition__Condition2Assignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalHypoMethod.g:2251:3: rule__GuardCondition__Condition2Assignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__GuardCondition__Condition2Assignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuardConditionAccess().getCondition2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__Group__3__Impl"


    // $ANTLR start "rule__GuardCondition__Group__4"
    // InternalHypoMethod.g:2259:1: rule__GuardCondition__Group__4 : rule__GuardCondition__Group__4__Impl ;
    public final void rule__GuardCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2263:1: ( rule__GuardCondition__Group__4__Impl )
            // InternalHypoMethod.g:2264:2: rule__GuardCondition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GuardCondition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__Group__4"


    // $ANTLR start "rule__GuardCondition__Group__4__Impl"
    // InternalHypoMethod.g:2270:1: rule__GuardCondition__Group__4__Impl : ( ']' ) ;
    public final void rule__GuardCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2274:1: ( ( ']' ) )
            // InternalHypoMethod.g:2275:1: ( ']' )
            {
            // InternalHypoMethod.g:2275:1: ( ']' )
            // InternalHypoMethod.g:2276:2: ']'
            {
             before(grammarAccess.getGuardConditionAccess().getRightSquareBracketKeyword_4()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getGuardConditionAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__Group__4__Impl"


    // $ANTLR start "rule__EventDescriptor__Group__0"
    // InternalHypoMethod.g:2286:1: rule__EventDescriptor__Group__0 : rule__EventDescriptor__Group__0__Impl rule__EventDescriptor__Group__1 ;
    public final void rule__EventDescriptor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2290:1: ( rule__EventDescriptor__Group__0__Impl rule__EventDescriptor__Group__1 )
            // InternalHypoMethod.g:2291:2: rule__EventDescriptor__Group__0__Impl rule__EventDescriptor__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EventDescriptor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDescriptor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDescriptor__Group__0"


    // $ANTLR start "rule__EventDescriptor__Group__0__Impl"
    // InternalHypoMethod.g:2298:1: rule__EventDescriptor__Group__0__Impl : ( 'event' ) ;
    public final void rule__EventDescriptor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2302:1: ( ( 'event' ) )
            // InternalHypoMethod.g:2303:1: ( 'event' )
            {
            // InternalHypoMethod.g:2303:1: ( 'event' )
            // InternalHypoMethod.g:2304:2: 'event'
            {
             before(grammarAccess.getEventDescriptorAccess().getEventKeyword_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getEventDescriptorAccess().getEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDescriptor__Group__0__Impl"


    // $ANTLR start "rule__EventDescriptor__Group__1"
    // InternalHypoMethod.g:2313:1: rule__EventDescriptor__Group__1 : rule__EventDescriptor__Group__1__Impl rule__EventDescriptor__Group__2 ;
    public final void rule__EventDescriptor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2317:1: ( rule__EventDescriptor__Group__1__Impl rule__EventDescriptor__Group__2 )
            // InternalHypoMethod.g:2318:2: rule__EventDescriptor__Group__1__Impl rule__EventDescriptor__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__EventDescriptor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDescriptor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDescriptor__Group__1"


    // $ANTLR start "rule__EventDescriptor__Group__1__Impl"
    // InternalHypoMethod.g:2325:1: rule__EventDescriptor__Group__1__Impl : ( ( rule__EventDescriptor__EventNameAssignment_1 ) ) ;
    public final void rule__EventDescriptor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2329:1: ( ( ( rule__EventDescriptor__EventNameAssignment_1 ) ) )
            // InternalHypoMethod.g:2330:1: ( ( rule__EventDescriptor__EventNameAssignment_1 ) )
            {
            // InternalHypoMethod.g:2330:1: ( ( rule__EventDescriptor__EventNameAssignment_1 ) )
            // InternalHypoMethod.g:2331:2: ( rule__EventDescriptor__EventNameAssignment_1 )
            {
             before(grammarAccess.getEventDescriptorAccess().getEventNameAssignment_1()); 
            // InternalHypoMethod.g:2332:2: ( rule__EventDescriptor__EventNameAssignment_1 )
            // InternalHypoMethod.g:2332:3: rule__EventDescriptor__EventNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EventDescriptor__EventNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventDescriptorAccess().getEventNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDescriptor__Group__1__Impl"


    // $ANTLR start "rule__EventDescriptor__Group__2"
    // InternalHypoMethod.g:2340:1: rule__EventDescriptor__Group__2 : rule__EventDescriptor__Group__2__Impl rule__EventDescriptor__Group__3 ;
    public final void rule__EventDescriptor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2344:1: ( rule__EventDescriptor__Group__2__Impl rule__EventDescriptor__Group__3 )
            // InternalHypoMethod.g:2345:2: rule__EventDescriptor__Group__2__Impl rule__EventDescriptor__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__EventDescriptor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDescriptor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDescriptor__Group__2"


    // $ANTLR start "rule__EventDescriptor__Group__2__Impl"
    // InternalHypoMethod.g:2352:1: rule__EventDescriptor__Group__2__Impl : ( ' = ' ) ;
    public final void rule__EventDescriptor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2356:1: ( ( ' = ' ) )
            // InternalHypoMethod.g:2357:1: ( ' = ' )
            {
            // InternalHypoMethod.g:2357:1: ( ' = ' )
            // InternalHypoMethod.g:2358:2: ' = '
            {
             before(grammarAccess.getEventDescriptorAccess().getSpaceEqualsSignSpaceKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEventDescriptorAccess().getSpaceEqualsSignSpaceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDescriptor__Group__2__Impl"


    // $ANTLR start "rule__EventDescriptor__Group__3"
    // InternalHypoMethod.g:2367:1: rule__EventDescriptor__Group__3 : rule__EventDescriptor__Group__3__Impl ;
    public final void rule__EventDescriptor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2371:1: ( rule__EventDescriptor__Group__3__Impl )
            // InternalHypoMethod.g:2372:2: rule__EventDescriptor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventDescriptor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDescriptor__Group__3"


    // $ANTLR start "rule__EventDescriptor__Group__3__Impl"
    // InternalHypoMethod.g:2378:1: rule__EventDescriptor__Group__3__Impl : ( ( rule__EventDescriptor__EventAssignment_3 ) ) ;
    public final void rule__EventDescriptor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2382:1: ( ( ( rule__EventDescriptor__EventAssignment_3 ) ) )
            // InternalHypoMethod.g:2383:1: ( ( rule__EventDescriptor__EventAssignment_3 ) )
            {
            // InternalHypoMethod.g:2383:1: ( ( rule__EventDescriptor__EventAssignment_3 ) )
            // InternalHypoMethod.g:2384:2: ( rule__EventDescriptor__EventAssignment_3 )
            {
             before(grammarAccess.getEventDescriptorAccess().getEventAssignment_3()); 
            // InternalHypoMethod.g:2385:2: ( rule__EventDescriptor__EventAssignment_3 )
            // InternalHypoMethod.g:2385:3: rule__EventDescriptor__EventAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EventDescriptor__EventAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEventDescriptorAccess().getEventAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDescriptor__Group__3__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // InternalHypoMethod.g:2394:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2398:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalHypoMethod.g:2399:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // InternalHypoMethod.g:2406:1: rule__Factor__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2410:1: ( ( 'parameter' ) )
            // InternalHypoMethod.g:2411:1: ( 'parameter' )
            {
            // InternalHypoMethod.g:2411:1: ( 'parameter' )
            // InternalHypoMethod.g:2412:2: 'parameter'
            {
             before(grammarAccess.getFactorAccess().getParameterKeyword_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // InternalHypoMethod.g:2421:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl rule__Factor__Group__2 ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2425:1: ( rule__Factor__Group__1__Impl rule__Factor__Group__2 )
            // InternalHypoMethod.g:2426:2: rule__Factor__Group__1__Impl rule__Factor__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Factor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // InternalHypoMethod.g:2433:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__FactorNameAssignment_1 ) ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2437:1: ( ( ( rule__Factor__FactorNameAssignment_1 ) ) )
            // InternalHypoMethod.g:2438:1: ( ( rule__Factor__FactorNameAssignment_1 ) )
            {
            // InternalHypoMethod.g:2438:1: ( ( rule__Factor__FactorNameAssignment_1 ) )
            // InternalHypoMethod.g:2439:2: ( rule__Factor__FactorNameAssignment_1 )
            {
             before(grammarAccess.getFactorAccess().getFactorNameAssignment_1()); 
            // InternalHypoMethod.g:2440:2: ( rule__Factor__FactorNameAssignment_1 )
            // InternalHypoMethod.g:2440:3: rule__Factor__FactorNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__FactorNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getFactorNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group__2"
    // InternalHypoMethod.g:2448:1: rule__Factor__Group__2 : rule__Factor__Group__2__Impl rule__Factor__Group__3 ;
    public final void rule__Factor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2452:1: ( rule__Factor__Group__2__Impl rule__Factor__Group__3 )
            // InternalHypoMethod.g:2453:2: rule__Factor__Group__2__Impl rule__Factor__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Factor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__2"


    // $ANTLR start "rule__Factor__Group__2__Impl"
    // InternalHypoMethod.g:2460:1: rule__Factor__Group__2__Impl : ( ' = ' ) ;
    public final void rule__Factor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2464:1: ( ( ' = ' ) )
            // InternalHypoMethod.g:2465:1: ( ' = ' )
            {
            // InternalHypoMethod.g:2465:1: ( ' = ' )
            // InternalHypoMethod.g:2466:2: ' = '
            {
             before(grammarAccess.getFactorAccess().getSpaceEqualsSignSpaceKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getSpaceEqualsSignSpaceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__2__Impl"


    // $ANTLR start "rule__Factor__Group__3"
    // InternalHypoMethod.g:2475:1: rule__Factor__Group__3 : rule__Factor__Group__3__Impl rule__Factor__Group__4 ;
    public final void rule__Factor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2479:1: ( rule__Factor__Group__3__Impl rule__Factor__Group__4 )
            // InternalHypoMethod.g:2480:2: rule__Factor__Group__3__Impl rule__Factor__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Factor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__3"


    // $ANTLR start "rule__Factor__Group__3__Impl"
    // InternalHypoMethod.g:2487:1: rule__Factor__Group__3__Impl : ( ( rule__Factor__FactorTypeAssignment_3 )? ) ;
    public final void rule__Factor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2491:1: ( ( ( rule__Factor__FactorTypeAssignment_3 )? ) )
            // InternalHypoMethod.g:2492:1: ( ( rule__Factor__FactorTypeAssignment_3 )? )
            {
            // InternalHypoMethod.g:2492:1: ( ( rule__Factor__FactorTypeAssignment_3 )? )
            // InternalHypoMethod.g:2493:2: ( rule__Factor__FactorTypeAssignment_3 )?
            {
             before(grammarAccess.getFactorAccess().getFactorTypeAssignment_3()); 
            // InternalHypoMethod.g:2494:2: ( rule__Factor__FactorTypeAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=28 && LA27_0<=33)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalHypoMethod.g:2494:3: rule__Factor__FactorTypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__FactorTypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactorAccess().getFactorTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__3__Impl"


    // $ANTLR start "rule__Factor__Group__4"
    // InternalHypoMethod.g:2502:1: rule__Factor__Group__4 : rule__Factor__Group__4__Impl rule__Factor__Group__5 ;
    public final void rule__Factor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2506:1: ( rule__Factor__Group__4__Impl rule__Factor__Group__5 )
            // InternalHypoMethod.g:2507:2: rule__Factor__Group__4__Impl rule__Factor__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Factor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__4"


    // $ANTLR start "rule__Factor__Group__4__Impl"
    // InternalHypoMethod.g:2514:1: rule__Factor__Group__4__Impl : ( ( rule__Factor__FactorType1Assignment_4 )? ) ;
    public final void rule__Factor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2518:1: ( ( ( rule__Factor__FactorType1Assignment_4 )? ) )
            // InternalHypoMethod.g:2519:1: ( ( rule__Factor__FactorType1Assignment_4 )? )
            {
            // InternalHypoMethod.g:2519:1: ( ( rule__Factor__FactorType1Assignment_4 )? )
            // InternalHypoMethod.g:2520:2: ( rule__Factor__FactorType1Assignment_4 )?
            {
             before(grammarAccess.getFactorAccess().getFactorType1Assignment_4()); 
            // InternalHypoMethod.g:2521:2: ( rule__Factor__FactorType1Assignment_4 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalHypoMethod.g:2521:3: rule__Factor__FactorType1Assignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__FactorType1Assignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactorAccess().getFactorType1Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__4__Impl"


    // $ANTLR start "rule__Factor__Group__5"
    // InternalHypoMethod.g:2529:1: rule__Factor__Group__5 : rule__Factor__Group__5__Impl rule__Factor__Group__6 ;
    public final void rule__Factor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2533:1: ( rule__Factor__Group__5__Impl rule__Factor__Group__6 )
            // InternalHypoMethod.g:2534:2: rule__Factor__Group__5__Impl rule__Factor__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Factor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__5"


    // $ANTLR start "rule__Factor__Group__5__Impl"
    // InternalHypoMethod.g:2541:1: rule__Factor__Group__5__Impl : ( 'with' ) ;
    public final void rule__Factor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2545:1: ( ( 'with' ) )
            // InternalHypoMethod.g:2546:1: ( 'with' )
            {
            // InternalHypoMethod.g:2546:1: ( 'with' )
            // InternalHypoMethod.g:2547:2: 'with'
            {
             before(grammarAccess.getFactorAccess().getWithKeyword_5()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getWithKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__5__Impl"


    // $ANTLR start "rule__Factor__Group__6"
    // InternalHypoMethod.g:2556:1: rule__Factor__Group__6 : rule__Factor__Group__6__Impl rule__Factor__Group__7 ;
    public final void rule__Factor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2560:1: ( rule__Factor__Group__6__Impl rule__Factor__Group__7 )
            // InternalHypoMethod.g:2561:2: rule__Factor__Group__6__Impl rule__Factor__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Factor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__6"


    // $ANTLR start "rule__Factor__Group__6__Impl"
    // InternalHypoMethod.g:2568:1: rule__Factor__Group__6__Impl : ( ( rule__Factor__Group_6__0 )? ) ;
    public final void rule__Factor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2572:1: ( ( ( rule__Factor__Group_6__0 )? ) )
            // InternalHypoMethod.g:2573:1: ( ( rule__Factor__Group_6__0 )? )
            {
            // InternalHypoMethod.g:2573:1: ( ( rule__Factor__Group_6__0 )? )
            // InternalHypoMethod.g:2574:2: ( rule__Factor__Group_6__0 )?
            {
             before(grammarAccess.getFactorAccess().getGroup_6()); 
            // InternalHypoMethod.g:2575:2: ( rule__Factor__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==85) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalHypoMethod.g:2575:3: rule__Factor__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__6__Impl"


    // $ANTLR start "rule__Factor__Group__7"
    // InternalHypoMethod.g:2583:1: rule__Factor__Group__7 : rule__Factor__Group__7__Impl ;
    public final void rule__Factor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2587:1: ( rule__Factor__Group__7__Impl )
            // InternalHypoMethod.g:2588:2: rule__Factor__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__7"


    // $ANTLR start "rule__Factor__Group__7__Impl"
    // InternalHypoMethod.g:2594:1: rule__Factor__Group__7__Impl : ( ( rule__Factor__Group_7__0 )? ) ;
    public final void rule__Factor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2598:1: ( ( ( rule__Factor__Group_7__0 )? ) )
            // InternalHypoMethod.g:2599:1: ( ( rule__Factor__Group_7__0 )? )
            {
            // InternalHypoMethod.g:2599:1: ( ( rule__Factor__Group_7__0 )? )
            // InternalHypoMethod.g:2600:2: ( rule__Factor__Group_7__0 )?
            {
             before(grammarAccess.getFactorAccess().getGroup_7()); 
            // InternalHypoMethod.g:2601:2: ( rule__Factor__Group_7__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==86) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalHypoMethod.g:2601:3: rule__Factor__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactorAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__7__Impl"


    // $ANTLR start "rule__Factor__Group_6__0"
    // InternalHypoMethod.g:2610:1: rule__Factor__Group_6__0 : rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1 ;
    public final void rule__Factor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2614:1: ( rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1 )
            // InternalHypoMethod.g:2615:2: rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Factor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__0"


    // $ANTLR start "rule__Factor__Group_6__0__Impl"
    // InternalHypoMethod.g:2622:1: rule__Factor__Group_6__0__Impl : ( 'values' ) ;
    public final void rule__Factor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2626:1: ( ( 'values' ) )
            // InternalHypoMethod.g:2627:1: ( 'values' )
            {
            // InternalHypoMethod.g:2627:1: ( 'values' )
            // InternalHypoMethod.g:2628:2: 'values'
            {
             before(grammarAccess.getFactorAccess().getValuesKeyword_6_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getValuesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__0__Impl"


    // $ANTLR start "rule__Factor__Group_6__1"
    // InternalHypoMethod.g:2637:1: rule__Factor__Group_6__1 : rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2 ;
    public final void rule__Factor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2641:1: ( rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2 )
            // InternalHypoMethod.g:2642:2: rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__Factor__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__1"


    // $ANTLR start "rule__Factor__Group_6__1__Impl"
    // InternalHypoMethod.g:2649:1: rule__Factor__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Factor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2653:1: ( ( '{' ) )
            // InternalHypoMethod.g:2654:1: ( '{' )
            {
            // InternalHypoMethod.g:2654:1: ( '{' )
            // InternalHypoMethod.g:2655:2: '{'
            {
             before(grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__1__Impl"


    // $ANTLR start "rule__Factor__Group_6__2"
    // InternalHypoMethod.g:2664:1: rule__Factor__Group_6__2 : rule__Factor__Group_6__2__Impl rule__Factor__Group_6__3 ;
    public final void rule__Factor__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2668:1: ( rule__Factor__Group_6__2__Impl rule__Factor__Group_6__3 )
            // InternalHypoMethod.g:2669:2: rule__Factor__Group_6__2__Impl rule__Factor__Group_6__3
            {
            pushFollow(FOLLOW_19);
            rule__Factor__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__2"


    // $ANTLR start "rule__Factor__Group_6__2__Impl"
    // InternalHypoMethod.g:2676:1: rule__Factor__Group_6__2__Impl : ( ( rule__Factor__FactorValueAssignment_6_2 ) ) ;
    public final void rule__Factor__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2680:1: ( ( ( rule__Factor__FactorValueAssignment_6_2 ) ) )
            // InternalHypoMethod.g:2681:1: ( ( rule__Factor__FactorValueAssignment_6_2 ) )
            {
            // InternalHypoMethod.g:2681:1: ( ( rule__Factor__FactorValueAssignment_6_2 ) )
            // InternalHypoMethod.g:2682:2: ( rule__Factor__FactorValueAssignment_6_2 )
            {
             before(grammarAccess.getFactorAccess().getFactorValueAssignment_6_2()); 
            // InternalHypoMethod.g:2683:2: ( rule__Factor__FactorValueAssignment_6_2 )
            // InternalHypoMethod.g:2683:3: rule__Factor__FactorValueAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Factor__FactorValueAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getFactorValueAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__2__Impl"


    // $ANTLR start "rule__Factor__Group_6__3"
    // InternalHypoMethod.g:2691:1: rule__Factor__Group_6__3 : rule__Factor__Group_6__3__Impl ;
    public final void rule__Factor__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2695:1: ( rule__Factor__Group_6__3__Impl )
            // InternalHypoMethod.g:2696:2: rule__Factor__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__3"


    // $ANTLR start "rule__Factor__Group_6__3__Impl"
    // InternalHypoMethod.g:2702:1: rule__Factor__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Factor__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2706:1: ( ( '}' ) )
            // InternalHypoMethod.g:2707:1: ( '}' )
            {
            // InternalHypoMethod.g:2707:1: ( '}' )
            // InternalHypoMethod.g:2708:2: '}'
            {
             before(grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__3__Impl"


    // $ANTLR start "rule__Factor__Group_7__0"
    // InternalHypoMethod.g:2718:1: rule__Factor__Group_7__0 : rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1 ;
    public final void rule__Factor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2722:1: ( rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1 )
            // InternalHypoMethod.g:2723:2: rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__Factor__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_7__0"


    // $ANTLR start "rule__Factor__Group_7__0__Impl"
    // InternalHypoMethod.g:2730:1: rule__Factor__Group_7__0__Impl : ( 'properties' ) ;
    public final void rule__Factor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2734:1: ( ( 'properties' ) )
            // InternalHypoMethod.g:2735:1: ( 'properties' )
            {
            // InternalHypoMethod.g:2735:1: ( 'properties' )
            // InternalHypoMethod.g:2736:2: 'properties'
            {
             before(grammarAccess.getFactorAccess().getPropertiesKeyword_7_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getPropertiesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_7__0__Impl"


    // $ANTLR start "rule__Factor__Group_7__1"
    // InternalHypoMethod.g:2745:1: rule__Factor__Group_7__1 : rule__Factor__Group_7__1__Impl rule__Factor__Group_7__2 ;
    public final void rule__Factor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2749:1: ( rule__Factor__Group_7__1__Impl rule__Factor__Group_7__2 )
            // InternalHypoMethod.g:2750:2: rule__Factor__Group_7__1__Impl rule__Factor__Group_7__2
            {
            pushFollow(FOLLOW_20);
            rule__Factor__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_7__1"


    // $ANTLR start "rule__Factor__Group_7__1__Impl"
    // InternalHypoMethod.g:2757:1: rule__Factor__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Factor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2761:1: ( ( '{' ) )
            // InternalHypoMethod.g:2762:1: ( '{' )
            {
            // InternalHypoMethod.g:2762:1: ( '{' )
            // InternalHypoMethod.g:2763:2: '{'
            {
             before(grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_7__1__Impl"


    // $ANTLR start "rule__Factor__Group_7__2"
    // InternalHypoMethod.g:2772:1: rule__Factor__Group_7__2 : rule__Factor__Group_7__2__Impl rule__Factor__Group_7__3 ;
    public final void rule__Factor__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2776:1: ( rule__Factor__Group_7__2__Impl rule__Factor__Group_7__3 )
            // InternalHypoMethod.g:2777:2: rule__Factor__Group_7__2__Impl rule__Factor__Group_7__3
            {
            pushFollow(FOLLOW_20);
            rule__Factor__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_7__2"


    // $ANTLR start "rule__Factor__Group_7__2__Impl"
    // InternalHypoMethod.g:2784:1: rule__Factor__Group_7__2__Impl : ( ( rule__Factor__FactorPropertiesAssignment_7_2 )* ) ;
    public final void rule__Factor__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2788:1: ( ( ( rule__Factor__FactorPropertiesAssignment_7_2 )* ) )
            // InternalHypoMethod.g:2789:1: ( ( rule__Factor__FactorPropertiesAssignment_7_2 )* )
            {
            // InternalHypoMethod.g:2789:1: ( ( rule__Factor__FactorPropertiesAssignment_7_2 )* )
            // InternalHypoMethod.g:2790:2: ( rule__Factor__FactorPropertiesAssignment_7_2 )*
            {
             before(grammarAccess.getFactorAccess().getFactorPropertiesAssignment_7_2()); 
            // InternalHypoMethod.g:2791:2: ( rule__Factor__FactorPropertiesAssignment_7_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalHypoMethod.g:2791:3: rule__Factor__FactorPropertiesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Factor__FactorPropertiesAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getFactorAccess().getFactorPropertiesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_7__2__Impl"


    // $ANTLR start "rule__Factor__Group_7__3"
    // InternalHypoMethod.g:2799:1: rule__Factor__Group_7__3 : rule__Factor__Group_7__3__Impl ;
    public final void rule__Factor__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2803:1: ( rule__Factor__Group_7__3__Impl )
            // InternalHypoMethod.g:2804:2: rule__Factor__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_7__3"


    // $ANTLR start "rule__Factor__Group_7__3__Impl"
    // InternalHypoMethod.g:2810:1: rule__Factor__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Factor__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2814:1: ( ( '}' ) )
            // InternalHypoMethod.g:2815:1: ( '}' )
            {
            // InternalHypoMethod.g:2815:1: ( '}' )
            // InternalHypoMethod.g:2816:2: '}'
            {
             before(grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_7__3__Impl"


    // $ANTLR start "rule__Properties__Group__0"
    // InternalHypoMethod.g:2826:1: rule__Properties__Group__0 : rule__Properties__Group__0__Impl rule__Properties__Group__1 ;
    public final void rule__Properties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2830:1: ( rule__Properties__Group__0__Impl rule__Properties__Group__1 )
            // InternalHypoMethod.g:2831:2: rule__Properties__Group__0__Impl rule__Properties__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Properties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__0"


    // $ANTLR start "rule__Properties__Group__0__Impl"
    // InternalHypoMethod.g:2838:1: rule__Properties__Group__0__Impl : ( ( rule__Properties__PNameAssignment_0 ) ) ;
    public final void rule__Properties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2842:1: ( ( ( rule__Properties__PNameAssignment_0 ) ) )
            // InternalHypoMethod.g:2843:1: ( ( rule__Properties__PNameAssignment_0 ) )
            {
            // InternalHypoMethod.g:2843:1: ( ( rule__Properties__PNameAssignment_0 ) )
            // InternalHypoMethod.g:2844:2: ( rule__Properties__PNameAssignment_0 )
            {
             before(grammarAccess.getPropertiesAccess().getPNameAssignment_0()); 
            // InternalHypoMethod.g:2845:2: ( rule__Properties__PNameAssignment_0 )
            // InternalHypoMethod.g:2845:3: rule__Properties__PNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Properties__PNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getPNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__0__Impl"


    // $ANTLR start "rule__Properties__Group__1"
    // InternalHypoMethod.g:2853:1: rule__Properties__Group__1 : rule__Properties__Group__1__Impl rule__Properties__Group__2 ;
    public final void rule__Properties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2857:1: ( rule__Properties__Group__1__Impl rule__Properties__Group__2 )
            // InternalHypoMethod.g:2858:2: rule__Properties__Group__1__Impl rule__Properties__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Properties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__1"


    // $ANTLR start "rule__Properties__Group__1__Impl"
    // InternalHypoMethod.g:2865:1: rule__Properties__Group__1__Impl : ( ':' ) ;
    public final void rule__Properties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2869:1: ( ( ':' ) )
            // InternalHypoMethod.g:2870:1: ( ':' )
            {
            // InternalHypoMethod.g:2870:1: ( ':' )
            // InternalHypoMethod.g:2871:2: ':'
            {
             before(grammarAccess.getPropertiesAccess().getColonKeyword_1()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getPropertiesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__1__Impl"


    // $ANTLR start "rule__Properties__Group__2"
    // InternalHypoMethod.g:2880:1: rule__Properties__Group__2 : rule__Properties__Group__2__Impl rule__Properties__Group__3 ;
    public final void rule__Properties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2884:1: ( rule__Properties__Group__2__Impl rule__Properties__Group__3 )
            // InternalHypoMethod.g:2885:2: rule__Properties__Group__2__Impl rule__Properties__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Properties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__2"


    // $ANTLR start "rule__Properties__Group__2__Impl"
    // InternalHypoMethod.g:2892:1: rule__Properties__Group__2__Impl : ( ( rule__Properties__PValAssignment_2 ) ) ;
    public final void rule__Properties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2896:1: ( ( ( rule__Properties__PValAssignment_2 ) ) )
            // InternalHypoMethod.g:2897:1: ( ( rule__Properties__PValAssignment_2 ) )
            {
            // InternalHypoMethod.g:2897:1: ( ( rule__Properties__PValAssignment_2 ) )
            // InternalHypoMethod.g:2898:2: ( rule__Properties__PValAssignment_2 )
            {
             before(grammarAccess.getPropertiesAccess().getPValAssignment_2()); 
            // InternalHypoMethod.g:2899:2: ( rule__Properties__PValAssignment_2 )
            // InternalHypoMethod.g:2899:3: rule__Properties__PValAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Properties__PValAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getPValAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__2__Impl"


    // $ANTLR start "rule__Properties__Group__3"
    // InternalHypoMethod.g:2907:1: rule__Properties__Group__3 : rule__Properties__Group__3__Impl ;
    public final void rule__Properties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2911:1: ( rule__Properties__Group__3__Impl )
            // InternalHypoMethod.g:2912:2: rule__Properties__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Properties__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__3"


    // $ANTLR start "rule__Properties__Group__3__Impl"
    // InternalHypoMethod.g:2918:1: rule__Properties__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__Properties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2922:1: ( ( ( ',' )? ) )
            // InternalHypoMethod.g:2923:1: ( ( ',' )? )
            {
            // InternalHypoMethod.g:2923:1: ( ( ',' )? )
            // InternalHypoMethod.g:2924:2: ( ',' )?
            {
             before(grammarAccess.getPropertiesAccess().getCommaKeyword_3()); 
            // InternalHypoMethod.g:2925:2: ( ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==88) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalHypoMethod.g:2925:3: ','
                    {
                    match(input,88,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPropertiesAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__3__Impl"


    // $ANTLR start "rule__Values__Group__0"
    // InternalHypoMethod.g:2934:1: rule__Values__Group__0 : rule__Values__Group__0__Impl rule__Values__Group__1 ;
    public final void rule__Values__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2938:1: ( rule__Values__Group__0__Impl rule__Values__Group__1 )
            // InternalHypoMethod.g:2939:2: rule__Values__Group__0__Impl rule__Values__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Values__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__0"


    // $ANTLR start "rule__Values__Group__0__Impl"
    // InternalHypoMethod.g:2946:1: rule__Values__Group__0__Impl : ( ( rule__Values__FValAssignment_0 )? ) ;
    public final void rule__Values__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2950:1: ( ( ( rule__Values__FValAssignment_0 )? ) )
            // InternalHypoMethod.g:2951:1: ( ( rule__Values__FValAssignment_0 )? )
            {
            // InternalHypoMethod.g:2951:1: ( ( rule__Values__FValAssignment_0 )? )
            // InternalHypoMethod.g:2952:2: ( rule__Values__FValAssignment_0 )?
            {
             before(grammarAccess.getValuesAccess().getFValAssignment_0()); 
            // InternalHypoMethod.g:2953:2: ( rule__Values__FValAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==EOF||(LA33_1>=RULE_ID && LA33_1<=RULE_FACTORLEVELVALUE)||LA33_1==77||LA33_1==88) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // InternalHypoMethod.g:2953:3: rule__Values__FValAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__FValAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValuesAccess().getFValAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__0__Impl"


    // $ANTLR start "rule__Values__Group__1"
    // InternalHypoMethod.g:2961:1: rule__Values__Group__1 : rule__Values__Group__1__Impl rule__Values__Group__2 ;
    public final void rule__Values__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2965:1: ( rule__Values__Group__1__Impl rule__Values__Group__2 )
            // InternalHypoMethod.g:2966:2: rule__Values__Group__1__Impl rule__Values__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Values__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__1"


    // $ANTLR start "rule__Values__Group__1__Impl"
    // InternalHypoMethod.g:2973:1: rule__Values__Group__1__Impl : ( ( rule__Values__FunctionAssignment_1 )? ) ;
    public final void rule__Values__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2977:1: ( ( ( rule__Values__FunctionAssignment_1 )? ) )
            // InternalHypoMethod.g:2978:1: ( ( rule__Values__FunctionAssignment_1 )? )
            {
            // InternalHypoMethod.g:2978:1: ( ( rule__Values__FunctionAssignment_1 )? )
            // InternalHypoMethod.g:2979:2: ( rule__Values__FunctionAssignment_1 )?
            {
             before(grammarAccess.getValuesAccess().getFunctionAssignment_1()); 
            // InternalHypoMethod.g:2980:2: ( rule__Values__FunctionAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalHypoMethod.g:2980:3: rule__Values__FunctionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__FunctionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValuesAccess().getFunctionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__1__Impl"


    // $ANTLR start "rule__Values__Group__2"
    // InternalHypoMethod.g:2988:1: rule__Values__Group__2 : rule__Values__Group__2__Impl rule__Values__Group__3 ;
    public final void rule__Values__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:2992:1: ( rule__Values__Group__2__Impl rule__Values__Group__3 )
            // InternalHypoMethod.g:2993:2: rule__Values__Group__2__Impl rule__Values__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Values__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Values__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__2"


    // $ANTLR start "rule__Values__Group__2__Impl"
    // InternalHypoMethod.g:3000:1: rule__Values__Group__2__Impl : ( ( rule__Values__ValueAssignment_2 )? ) ;
    public final void rule__Values__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3004:1: ( ( ( rule__Values__ValueAssignment_2 )? ) )
            // InternalHypoMethod.g:3005:1: ( ( rule__Values__ValueAssignment_2 )? )
            {
            // InternalHypoMethod.g:3005:1: ( ( rule__Values__ValueAssignment_2 )? )
            // InternalHypoMethod.g:3006:2: ( rule__Values__ValueAssignment_2 )?
            {
             before(grammarAccess.getValuesAccess().getValueAssignment_2()); 
            // InternalHypoMethod.g:3007:2: ( rule__Values__ValueAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_RANGEVALUE) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalHypoMethod.g:3007:3: rule__Values__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValuesAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__2__Impl"


    // $ANTLR start "rule__Values__Group__3"
    // InternalHypoMethod.g:3015:1: rule__Values__Group__3 : rule__Values__Group__3__Impl ;
    public final void rule__Values__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3019:1: ( rule__Values__Group__3__Impl )
            // InternalHypoMethod.g:3020:2: rule__Values__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__3"


    // $ANTLR start "rule__Values__Group__3__Impl"
    // InternalHypoMethod.g:3026:1: rule__Values__Group__3__Impl : ( ( rule__Values__FvalueAssignment_3 )? ) ;
    public final void rule__Values__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3030:1: ( ( ( rule__Values__FvalueAssignment_3 )? ) )
            // InternalHypoMethod.g:3031:1: ( ( rule__Values__FvalueAssignment_3 )? )
            {
            // InternalHypoMethod.g:3031:1: ( ( rule__Values__FvalueAssignment_3 )? )
            // InternalHypoMethod.g:3032:2: ( rule__Values__FvalueAssignment_3 )?
            {
             before(grammarAccess.getValuesAccess().getFvalueAssignment_3()); 
            // InternalHypoMethod.g:3033:2: ( rule__Values__FvalueAssignment_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_FACTORLEVELVALUE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalHypoMethod.g:3033:3: rule__Values__FvalueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__FvalueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValuesAccess().getFvalueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__3__Impl"


    // $ANTLR start "rule__Goals__Group__0"
    // InternalHypoMethod.g:3042:1: rule__Goals__Group__0 : rule__Goals__Group__0__Impl rule__Goals__Group__1 ;
    public final void rule__Goals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3046:1: ( rule__Goals__Group__0__Impl rule__Goals__Group__1 )
            // InternalHypoMethod.g:3047:2: rule__Goals__Group__0__Impl rule__Goals__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Goals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__0"


    // $ANTLR start "rule__Goals__Group__0__Impl"
    // InternalHypoMethod.g:3054:1: rule__Goals__Group__0__Impl : ( 'goal' ) ;
    public final void rule__Goals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3058:1: ( ( 'goal' ) )
            // InternalHypoMethod.g:3059:1: ( 'goal' )
            {
            // InternalHypoMethod.g:3059:1: ( 'goal' )
            // InternalHypoMethod.g:3060:2: 'goal'
            {
             before(grammarAccess.getGoalsAccess().getGoalKeyword_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getGoalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__0__Impl"


    // $ANTLR start "rule__Goals__Group__1"
    // InternalHypoMethod.g:3069:1: rule__Goals__Group__1 : rule__Goals__Group__1__Impl rule__Goals__Group__2 ;
    public final void rule__Goals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3073:1: ( rule__Goals__Group__1__Impl rule__Goals__Group__2 )
            // InternalHypoMethod.g:3074:2: rule__Goals__Group__1__Impl rule__Goals__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Goals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__1"


    // $ANTLR start "rule__Goals__Group__1__Impl"
    // InternalHypoMethod.g:3081:1: rule__Goals__Group__1__Impl : ( '{' ) ;
    public final void rule__Goals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3085:1: ( ( '{' ) )
            // InternalHypoMethod.g:3086:1: ( '{' )
            {
            // InternalHypoMethod.g:3086:1: ( '{' )
            // InternalHypoMethod.g:3087:2: '{'
            {
             before(grammarAccess.getGoalsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__1__Impl"


    // $ANTLR start "rule__Goals__Group__2"
    // InternalHypoMethod.g:3096:1: rule__Goals__Group__2 : rule__Goals__Group__2__Impl rule__Goals__Group__3 ;
    public final void rule__Goals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3100:1: ( rule__Goals__Group__2__Impl rule__Goals__Group__3 )
            // InternalHypoMethod.g:3101:2: rule__Goals__Group__2__Impl rule__Goals__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Goals__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__2"


    // $ANTLR start "rule__Goals__Group__2__Impl"
    // InternalHypoMethod.g:3108:1: rule__Goals__Group__2__Impl : ( 'object' ) ;
    public final void rule__Goals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3112:1: ( ( 'object' ) )
            // InternalHypoMethod.g:3113:1: ( 'object' )
            {
            // InternalHypoMethod.g:3113:1: ( 'object' )
            // InternalHypoMethod.g:3114:2: 'object'
            {
             before(grammarAccess.getGoalsAccess().getObjectKeyword_2()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getObjectKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__2__Impl"


    // $ANTLR start "rule__Goals__Group__3"
    // InternalHypoMethod.g:3123:1: rule__Goals__Group__3 : rule__Goals__Group__3__Impl rule__Goals__Group__4 ;
    public final void rule__Goals__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3127:1: ( rule__Goals__Group__3__Impl rule__Goals__Group__4 )
            // InternalHypoMethod.g:3128:2: rule__Goals__Group__3__Impl rule__Goals__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Goals__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__3"


    // $ANTLR start "rule__Goals__Group__3__Impl"
    // InternalHypoMethod.g:3135:1: rule__Goals__Group__3__Impl : ( 'of' ) ;
    public final void rule__Goals__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3139:1: ( ( 'of' ) )
            // InternalHypoMethod.g:3140:1: ( 'of' )
            {
            // InternalHypoMethod.g:3140:1: ( 'of' )
            // InternalHypoMethod.g:3141:2: 'of'
            {
             before(grammarAccess.getGoalsAccess().getOfKeyword_3()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getOfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__3__Impl"


    // $ANTLR start "rule__Goals__Group__4"
    // InternalHypoMethod.g:3150:1: rule__Goals__Group__4 : rule__Goals__Group__4__Impl rule__Goals__Group__5 ;
    public final void rule__Goals__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3154:1: ( rule__Goals__Group__4__Impl rule__Goals__Group__5 )
            // InternalHypoMethod.g:3155:2: rule__Goals__Group__4__Impl rule__Goals__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Goals__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__4"


    // $ANTLR start "rule__Goals__Group__4__Impl"
    // InternalHypoMethod.g:3162:1: rule__Goals__Group__4__Impl : ( 'study' ) ;
    public final void rule__Goals__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3166:1: ( ( 'study' ) )
            // InternalHypoMethod.g:3167:1: ( 'study' )
            {
            // InternalHypoMethod.g:3167:1: ( 'study' )
            // InternalHypoMethod.g:3168:2: 'study'
            {
             before(grammarAccess.getGoalsAccess().getStudyKeyword_4()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getStudyKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__4__Impl"


    // $ANTLR start "rule__Goals__Group__5"
    // InternalHypoMethod.g:3177:1: rule__Goals__Group__5 : rule__Goals__Group__5__Impl rule__Goals__Group__6 ;
    public final void rule__Goals__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3181:1: ( rule__Goals__Group__5__Impl rule__Goals__Group__6 )
            // InternalHypoMethod.g:3182:2: rule__Goals__Group__5__Impl rule__Goals__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Goals__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__5"


    // $ANTLR start "rule__Goals__Group__5__Impl"
    // InternalHypoMethod.g:3189:1: rule__Goals__Group__5__Impl : ( ':' ) ;
    public final void rule__Goals__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3193:1: ( ( ':' ) )
            // InternalHypoMethod.g:3194:1: ( ':' )
            {
            // InternalHypoMethod.g:3194:1: ( ':' )
            // InternalHypoMethod.g:3195:2: ':'
            {
             before(grammarAccess.getGoalsAccess().getColonKeyword_5()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__5__Impl"


    // $ANTLR start "rule__Goals__Group__6"
    // InternalHypoMethod.g:3204:1: rule__Goals__Group__6 : rule__Goals__Group__6__Impl rule__Goals__Group__7 ;
    public final void rule__Goals__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3208:1: ( rule__Goals__Group__6__Impl rule__Goals__Group__7 )
            // InternalHypoMethod.g:3209:2: rule__Goals__Group__6__Impl rule__Goals__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Goals__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__6"


    // $ANTLR start "rule__Goals__Group__6__Impl"
    // InternalHypoMethod.g:3216:1: rule__Goals__Group__6__Impl : ( ( rule__Goals__ObjOfStudyAssignment_6 ) ) ;
    public final void rule__Goals__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3220:1: ( ( ( rule__Goals__ObjOfStudyAssignment_6 ) ) )
            // InternalHypoMethod.g:3221:1: ( ( rule__Goals__ObjOfStudyAssignment_6 ) )
            {
            // InternalHypoMethod.g:3221:1: ( ( rule__Goals__ObjOfStudyAssignment_6 ) )
            // InternalHypoMethod.g:3222:2: ( rule__Goals__ObjOfStudyAssignment_6 )
            {
             before(grammarAccess.getGoalsAccess().getObjOfStudyAssignment_6()); 
            // InternalHypoMethod.g:3223:2: ( rule__Goals__ObjOfStudyAssignment_6 )
            // InternalHypoMethod.g:3223:3: rule__Goals__ObjOfStudyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Goals__ObjOfStudyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGoalsAccess().getObjOfStudyAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__6__Impl"


    // $ANTLR start "rule__Goals__Group__7"
    // InternalHypoMethod.g:3231:1: rule__Goals__Group__7 : rule__Goals__Group__7__Impl rule__Goals__Group__8 ;
    public final void rule__Goals__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3235:1: ( rule__Goals__Group__7__Impl rule__Goals__Group__8 )
            // InternalHypoMethod.g:3236:2: rule__Goals__Group__7__Impl rule__Goals__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Goals__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__7"


    // $ANTLR start "rule__Goals__Group__7__Impl"
    // InternalHypoMethod.g:3243:1: rule__Goals__Group__7__Impl : ( 'purpose' ) ;
    public final void rule__Goals__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3247:1: ( ( 'purpose' ) )
            // InternalHypoMethod.g:3248:1: ( 'purpose' )
            {
            // InternalHypoMethod.g:3248:1: ( 'purpose' )
            // InternalHypoMethod.g:3249:2: 'purpose'
            {
             before(grammarAccess.getGoalsAccess().getPurposeKeyword_7()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getPurposeKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__7__Impl"


    // $ANTLR start "rule__Goals__Group__8"
    // InternalHypoMethod.g:3258:1: rule__Goals__Group__8 : rule__Goals__Group__8__Impl rule__Goals__Group__9 ;
    public final void rule__Goals__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3262:1: ( rule__Goals__Group__8__Impl rule__Goals__Group__9 )
            // InternalHypoMethod.g:3263:2: rule__Goals__Group__8__Impl rule__Goals__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Goals__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__8"


    // $ANTLR start "rule__Goals__Group__8__Impl"
    // InternalHypoMethod.g:3270:1: rule__Goals__Group__8__Impl : ( ':' ) ;
    public final void rule__Goals__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3274:1: ( ( ':' ) )
            // InternalHypoMethod.g:3275:1: ( ':' )
            {
            // InternalHypoMethod.g:3275:1: ( ':' )
            // InternalHypoMethod.g:3276:2: ':'
            {
             before(grammarAccess.getGoalsAccess().getColonKeyword_8()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__8__Impl"


    // $ANTLR start "rule__Goals__Group__9"
    // InternalHypoMethod.g:3285:1: rule__Goals__Group__9 : rule__Goals__Group__9__Impl rule__Goals__Group__10 ;
    public final void rule__Goals__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3289:1: ( rule__Goals__Group__9__Impl rule__Goals__Group__10 )
            // InternalHypoMethod.g:3290:2: rule__Goals__Group__9__Impl rule__Goals__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__Goals__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__9"


    // $ANTLR start "rule__Goals__Group__9__Impl"
    // InternalHypoMethod.g:3297:1: rule__Goals__Group__9__Impl : ( ( rule__Goals__PurposeAssignment_9 ) ) ;
    public final void rule__Goals__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3301:1: ( ( ( rule__Goals__PurposeAssignment_9 ) ) )
            // InternalHypoMethod.g:3302:1: ( ( rule__Goals__PurposeAssignment_9 ) )
            {
            // InternalHypoMethod.g:3302:1: ( ( rule__Goals__PurposeAssignment_9 ) )
            // InternalHypoMethod.g:3303:2: ( rule__Goals__PurposeAssignment_9 )
            {
             before(grammarAccess.getGoalsAccess().getPurposeAssignment_9()); 
            // InternalHypoMethod.g:3304:2: ( rule__Goals__PurposeAssignment_9 )
            // InternalHypoMethod.g:3304:3: rule__Goals__PurposeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Goals__PurposeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getGoalsAccess().getPurposeAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__9__Impl"


    // $ANTLR start "rule__Goals__Group__10"
    // InternalHypoMethod.g:3312:1: rule__Goals__Group__10 : rule__Goals__Group__10__Impl rule__Goals__Group__11 ;
    public final void rule__Goals__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3316:1: ( rule__Goals__Group__10__Impl rule__Goals__Group__11 )
            // InternalHypoMethod.g:3317:2: rule__Goals__Group__10__Impl rule__Goals__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__Goals__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__10"


    // $ANTLR start "rule__Goals__Group__10__Impl"
    // InternalHypoMethod.g:3324:1: rule__Goals__Group__10__Impl : ( 'focus' ) ;
    public final void rule__Goals__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3328:1: ( ( 'focus' ) )
            // InternalHypoMethod.g:3329:1: ( 'focus' )
            {
            // InternalHypoMethod.g:3329:1: ( 'focus' )
            // InternalHypoMethod.g:3330:2: 'focus'
            {
             before(grammarAccess.getGoalsAccess().getFocusKeyword_10()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getFocusKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__10__Impl"


    // $ANTLR start "rule__Goals__Group__11"
    // InternalHypoMethod.g:3339:1: rule__Goals__Group__11 : rule__Goals__Group__11__Impl rule__Goals__Group__12 ;
    public final void rule__Goals__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3343:1: ( rule__Goals__Group__11__Impl rule__Goals__Group__12 )
            // InternalHypoMethod.g:3344:2: rule__Goals__Group__11__Impl rule__Goals__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__Goals__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__11"


    // $ANTLR start "rule__Goals__Group__11__Impl"
    // InternalHypoMethod.g:3351:1: rule__Goals__Group__11__Impl : ( ':' ) ;
    public final void rule__Goals__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3355:1: ( ( ':' ) )
            // InternalHypoMethod.g:3356:1: ( ':' )
            {
            // InternalHypoMethod.g:3356:1: ( ':' )
            // InternalHypoMethod.g:3357:2: ':'
            {
             before(grammarAccess.getGoalsAccess().getColonKeyword_11()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__11__Impl"


    // $ANTLR start "rule__Goals__Group__12"
    // InternalHypoMethod.g:3366:1: rule__Goals__Group__12 : rule__Goals__Group__12__Impl rule__Goals__Group__13 ;
    public final void rule__Goals__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3370:1: ( rule__Goals__Group__12__Impl rule__Goals__Group__13 )
            // InternalHypoMethod.g:3371:2: rule__Goals__Group__12__Impl rule__Goals__Group__13
            {
            pushFollow(FOLLOW_28);
            rule__Goals__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__12"


    // $ANTLR start "rule__Goals__Group__12__Impl"
    // InternalHypoMethod.g:3378:1: rule__Goals__Group__12__Impl : ( ( rule__Goals__FocusAssignment_12 ) ) ;
    public final void rule__Goals__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3382:1: ( ( ( rule__Goals__FocusAssignment_12 ) ) )
            // InternalHypoMethod.g:3383:1: ( ( rule__Goals__FocusAssignment_12 ) )
            {
            // InternalHypoMethod.g:3383:1: ( ( rule__Goals__FocusAssignment_12 ) )
            // InternalHypoMethod.g:3384:2: ( rule__Goals__FocusAssignment_12 )
            {
             before(grammarAccess.getGoalsAccess().getFocusAssignment_12()); 
            // InternalHypoMethod.g:3385:2: ( rule__Goals__FocusAssignment_12 )
            // InternalHypoMethod.g:3385:3: rule__Goals__FocusAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Goals__FocusAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getGoalsAccess().getFocusAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__12__Impl"


    // $ANTLR start "rule__Goals__Group__13"
    // InternalHypoMethod.g:3393:1: rule__Goals__Group__13 : rule__Goals__Group__13__Impl rule__Goals__Group__14 ;
    public final void rule__Goals__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3397:1: ( rule__Goals__Group__13__Impl rule__Goals__Group__14 )
            // InternalHypoMethod.g:3398:2: rule__Goals__Group__13__Impl rule__Goals__Group__14
            {
            pushFollow(FOLLOW_21);
            rule__Goals__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__13"


    // $ANTLR start "rule__Goals__Group__13__Impl"
    // InternalHypoMethod.g:3405:1: rule__Goals__Group__13__Impl : ( 'view point' ) ;
    public final void rule__Goals__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3409:1: ( ( 'view point' ) )
            // InternalHypoMethod.g:3410:1: ( 'view point' )
            {
            // InternalHypoMethod.g:3410:1: ( 'view point' )
            // InternalHypoMethod.g:3411:2: 'view point'
            {
             before(grammarAccess.getGoalsAccess().getViewPointKeyword_13()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getViewPointKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__13__Impl"


    // $ANTLR start "rule__Goals__Group__14"
    // InternalHypoMethod.g:3420:1: rule__Goals__Group__14 : rule__Goals__Group__14__Impl rule__Goals__Group__15 ;
    public final void rule__Goals__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3424:1: ( rule__Goals__Group__14__Impl rule__Goals__Group__15 )
            // InternalHypoMethod.g:3425:2: rule__Goals__Group__14__Impl rule__Goals__Group__15
            {
            pushFollow(FOLLOW_15);
            rule__Goals__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__14"


    // $ANTLR start "rule__Goals__Group__14__Impl"
    // InternalHypoMethod.g:3432:1: rule__Goals__Group__14__Impl : ( ':' ) ;
    public final void rule__Goals__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3436:1: ( ( ':' ) )
            // InternalHypoMethod.g:3437:1: ( ':' )
            {
            // InternalHypoMethod.g:3437:1: ( ':' )
            // InternalHypoMethod.g:3438:2: ':'
            {
             before(grammarAccess.getGoalsAccess().getColonKeyword_14()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getColonKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__14__Impl"


    // $ANTLR start "rule__Goals__Group__15"
    // InternalHypoMethod.g:3447:1: rule__Goals__Group__15 : rule__Goals__Group__15__Impl rule__Goals__Group__16 ;
    public final void rule__Goals__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3451:1: ( rule__Goals__Group__15__Impl rule__Goals__Group__16 )
            // InternalHypoMethod.g:3452:2: rule__Goals__Group__15__Impl rule__Goals__Group__16
            {
            pushFollow(FOLLOW_29);
            rule__Goals__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__15"


    // $ANTLR start "rule__Goals__Group__15__Impl"
    // InternalHypoMethod.g:3459:1: rule__Goals__Group__15__Impl : ( ( rule__Goals__ViewPointAssignment_15 ) ) ;
    public final void rule__Goals__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3463:1: ( ( ( rule__Goals__ViewPointAssignment_15 ) ) )
            // InternalHypoMethod.g:3464:1: ( ( rule__Goals__ViewPointAssignment_15 ) )
            {
            // InternalHypoMethod.g:3464:1: ( ( rule__Goals__ViewPointAssignment_15 ) )
            // InternalHypoMethod.g:3465:2: ( rule__Goals__ViewPointAssignment_15 )
            {
             before(grammarAccess.getGoalsAccess().getViewPointAssignment_15()); 
            // InternalHypoMethod.g:3466:2: ( rule__Goals__ViewPointAssignment_15 )
            // InternalHypoMethod.g:3466:3: rule__Goals__ViewPointAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Goals__ViewPointAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getGoalsAccess().getViewPointAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__15__Impl"


    // $ANTLR start "rule__Goals__Group__16"
    // InternalHypoMethod.g:3474:1: rule__Goals__Group__16 : rule__Goals__Group__16__Impl rule__Goals__Group__17 ;
    public final void rule__Goals__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3478:1: ( rule__Goals__Group__16__Impl rule__Goals__Group__17 )
            // InternalHypoMethod.g:3479:2: rule__Goals__Group__16__Impl rule__Goals__Group__17
            {
            pushFollow(FOLLOW_21);
            rule__Goals__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__16"


    // $ANTLR start "rule__Goals__Group__16__Impl"
    // InternalHypoMethod.g:3486:1: rule__Goals__Group__16__Impl : ( 'context' ) ;
    public final void rule__Goals__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3490:1: ( ( 'context' ) )
            // InternalHypoMethod.g:3491:1: ( 'context' )
            {
            // InternalHypoMethod.g:3491:1: ( 'context' )
            // InternalHypoMethod.g:3492:2: 'context'
            {
             before(grammarAccess.getGoalsAccess().getContextKeyword_16()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getContextKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__16__Impl"


    // $ANTLR start "rule__Goals__Group__17"
    // InternalHypoMethod.g:3501:1: rule__Goals__Group__17 : rule__Goals__Group__17__Impl rule__Goals__Group__18 ;
    public final void rule__Goals__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3505:1: ( rule__Goals__Group__17__Impl rule__Goals__Group__18 )
            // InternalHypoMethod.g:3506:2: rule__Goals__Group__17__Impl rule__Goals__Group__18
            {
            pushFollow(FOLLOW_15);
            rule__Goals__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__17"


    // $ANTLR start "rule__Goals__Group__17__Impl"
    // InternalHypoMethod.g:3513:1: rule__Goals__Group__17__Impl : ( ':' ) ;
    public final void rule__Goals__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3517:1: ( ( ':' ) )
            // InternalHypoMethod.g:3518:1: ( ':' )
            {
            // InternalHypoMethod.g:3518:1: ( ':' )
            // InternalHypoMethod.g:3519:2: ':'
            {
             before(grammarAccess.getGoalsAccess().getColonKeyword_17()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getColonKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__17__Impl"


    // $ANTLR start "rule__Goals__Group__18"
    // InternalHypoMethod.g:3528:1: rule__Goals__Group__18 : rule__Goals__Group__18__Impl rule__Goals__Group__19 ;
    public final void rule__Goals__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3532:1: ( rule__Goals__Group__18__Impl rule__Goals__Group__19 )
            // InternalHypoMethod.g:3533:2: rule__Goals__Group__18__Impl rule__Goals__Group__19
            {
            pushFollow(FOLLOW_19);
            rule__Goals__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goals__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__18"


    // $ANTLR start "rule__Goals__Group__18__Impl"
    // InternalHypoMethod.g:3540:1: rule__Goals__Group__18__Impl : ( ( rule__Goals__ContextAssignment_18 ) ) ;
    public final void rule__Goals__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3544:1: ( ( ( rule__Goals__ContextAssignment_18 ) ) )
            // InternalHypoMethod.g:3545:1: ( ( rule__Goals__ContextAssignment_18 ) )
            {
            // InternalHypoMethod.g:3545:1: ( ( rule__Goals__ContextAssignment_18 ) )
            // InternalHypoMethod.g:3546:2: ( rule__Goals__ContextAssignment_18 )
            {
             before(grammarAccess.getGoalsAccess().getContextAssignment_18()); 
            // InternalHypoMethod.g:3547:2: ( rule__Goals__ContextAssignment_18 )
            // InternalHypoMethod.g:3547:3: rule__Goals__ContextAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Goals__ContextAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getGoalsAccess().getContextAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__18__Impl"


    // $ANTLR start "rule__Goals__Group__19"
    // InternalHypoMethod.g:3555:1: rule__Goals__Group__19 : rule__Goals__Group__19__Impl ;
    public final void rule__Goals__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3559:1: ( rule__Goals__Group__19__Impl )
            // InternalHypoMethod.g:3560:2: rule__Goals__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goals__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__19"


    // $ANTLR start "rule__Goals__Group__19__Impl"
    // InternalHypoMethod.g:3566:1: rule__Goals__Group__19__Impl : ( '}' ) ;
    public final void rule__Goals__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3570:1: ( ( '}' ) )
            // InternalHypoMethod.g:3571:1: ( '}' )
            {
            // InternalHypoMethod.g:3571:1: ( '}' )
            // InternalHypoMethod.g:3572:2: '}'
            {
             before(grammarAccess.getGoalsAccess().getRightCurlyBracketKeyword_19()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__19__Impl"


    // $ANTLR start "rule__Hypothesis__Group__0"
    // InternalHypoMethod.g:3582:1: rule__Hypothesis__Group__0 : rule__Hypothesis__Group__0__Impl rule__Hypothesis__Group__1 ;
    public final void rule__Hypothesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3586:1: ( rule__Hypothesis__Group__0__Impl rule__Hypothesis__Group__1 )
            // InternalHypoMethod.g:3587:2: rule__Hypothesis__Group__0__Impl rule__Hypothesis__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Hypothesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__0"


    // $ANTLR start "rule__Hypothesis__Group__0__Impl"
    // InternalHypoMethod.g:3594:1: rule__Hypothesis__Group__0__Impl : ( 'hypotheses' ) ;
    public final void rule__Hypothesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3598:1: ( ( 'hypotheses' ) )
            // InternalHypoMethod.g:3599:1: ( 'hypotheses' )
            {
            // InternalHypoMethod.g:3599:1: ( 'hypotheses' )
            // InternalHypoMethod.g:3600:2: 'hypotheses'
            {
             before(grammarAccess.getHypothesisAccess().getHypothesesKeyword_0()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getHypothesesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__0__Impl"


    // $ANTLR start "rule__Hypothesis__Group__1"
    // InternalHypoMethod.g:3609:1: rule__Hypothesis__Group__1 : rule__Hypothesis__Group__1__Impl rule__Hypothesis__Group__2 ;
    public final void rule__Hypothesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3613:1: ( rule__Hypothesis__Group__1__Impl rule__Hypothesis__Group__2 )
            // InternalHypoMethod.g:3614:2: rule__Hypothesis__Group__1__Impl rule__Hypothesis__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Hypothesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__1"


    // $ANTLR start "rule__Hypothesis__Group__1__Impl"
    // InternalHypoMethod.g:3621:1: rule__Hypothesis__Group__1__Impl : ( '{' ) ;
    public final void rule__Hypothesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3625:1: ( ( '{' ) )
            // InternalHypoMethod.g:3626:1: ( '{' )
            {
            // InternalHypoMethod.g:3626:1: ( '{' )
            // InternalHypoMethod.g:3627:2: '{'
            {
             before(grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__1__Impl"


    // $ANTLR start "rule__Hypothesis__Group__2"
    // InternalHypoMethod.g:3636:1: rule__Hypothesis__Group__2 : rule__Hypothesis__Group__2__Impl rule__Hypothesis__Group__3 ;
    public final void rule__Hypothesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3640:1: ( rule__Hypothesis__Group__2__Impl rule__Hypothesis__Group__3 )
            // InternalHypoMethod.g:3641:2: rule__Hypothesis__Group__2__Impl rule__Hypothesis__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Hypothesis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__2"


    // $ANTLR start "rule__Hypothesis__Group__2__Impl"
    // InternalHypoMethod.g:3648:1: rule__Hypothesis__Group__2__Impl : ( ( rule__Hypothesis__Group_2__0 )? ) ;
    public final void rule__Hypothesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3652:1: ( ( ( rule__Hypothesis__Group_2__0 )? ) )
            // InternalHypoMethod.g:3653:1: ( ( rule__Hypothesis__Group_2__0 )? )
            {
            // InternalHypoMethod.g:3653:1: ( ( rule__Hypothesis__Group_2__0 )? )
            // InternalHypoMethod.g:3654:2: ( rule__Hypothesis__Group_2__0 )?
            {
             before(grammarAccess.getHypothesisAccess().getGroup_2()); 
            // InternalHypoMethod.g:3655:2: ( rule__Hypothesis__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==98) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalHypoMethod.g:3655:3: rule__Hypothesis__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Hypothesis__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHypothesisAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__2__Impl"


    // $ANTLR start "rule__Hypothesis__Group__3"
    // InternalHypoMethod.g:3663:1: rule__Hypothesis__Group__3 : rule__Hypothesis__Group__3__Impl rule__Hypothesis__Group__4 ;
    public final void rule__Hypothesis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3667:1: ( rule__Hypothesis__Group__3__Impl rule__Hypothesis__Group__4 )
            // InternalHypoMethod.g:3668:2: rule__Hypothesis__Group__3__Impl rule__Hypothesis__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Hypothesis__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__3"


    // $ANTLR start "rule__Hypothesis__Group__3__Impl"
    // InternalHypoMethod.g:3675:1: rule__Hypothesis__Group__3__Impl : ( ( rule__Hypothesis__Group_3__0 )? ) ;
    public final void rule__Hypothesis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3679:1: ( ( ( rule__Hypothesis__Group_3__0 )? ) )
            // InternalHypoMethod.g:3680:1: ( ( rule__Hypothesis__Group_3__0 )? )
            {
            // InternalHypoMethod.g:3680:1: ( ( rule__Hypothesis__Group_3__0 )? )
            // InternalHypoMethod.g:3681:2: ( rule__Hypothesis__Group_3__0 )?
            {
             before(grammarAccess.getHypothesisAccess().getGroup_3()); 
            // InternalHypoMethod.g:3682:2: ( rule__Hypothesis__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==99) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalHypoMethod.g:3682:3: rule__Hypothesis__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Hypothesis__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHypothesisAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__3__Impl"


    // $ANTLR start "rule__Hypothesis__Group__4"
    // InternalHypoMethod.g:3690:1: rule__Hypothesis__Group__4 : rule__Hypothesis__Group__4__Impl rule__Hypothesis__Group__5 ;
    public final void rule__Hypothesis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3694:1: ( rule__Hypothesis__Group__4__Impl rule__Hypothesis__Group__5 )
            // InternalHypoMethod.g:3695:2: rule__Hypothesis__Group__4__Impl rule__Hypothesis__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Hypothesis__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__4"


    // $ANTLR start "rule__Hypothesis__Group__4__Impl"
    // InternalHypoMethod.g:3702:1: rule__Hypothesis__Group__4__Impl : ( ( rule__Hypothesis__Group_4__0 )? ) ;
    public final void rule__Hypothesis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3706:1: ( ( ( rule__Hypothesis__Group_4__0 )? ) )
            // InternalHypoMethod.g:3707:1: ( ( rule__Hypothesis__Group_4__0 )? )
            {
            // InternalHypoMethod.g:3707:1: ( ( rule__Hypothesis__Group_4__0 )? )
            // InternalHypoMethod.g:3708:2: ( rule__Hypothesis__Group_4__0 )?
            {
             before(grammarAccess.getHypothesisAccess().getGroup_4()); 
            // InternalHypoMethod.g:3709:2: ( rule__Hypothesis__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==100) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalHypoMethod.g:3709:3: rule__Hypothesis__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Hypothesis__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHypothesisAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__4__Impl"


    // $ANTLR start "rule__Hypothesis__Group__5"
    // InternalHypoMethod.g:3717:1: rule__Hypothesis__Group__5 : rule__Hypothesis__Group__5__Impl rule__Hypothesis__Group__6 ;
    public final void rule__Hypothesis__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3721:1: ( rule__Hypothesis__Group__5__Impl rule__Hypothesis__Group__6 )
            // InternalHypoMethod.g:3722:2: rule__Hypothesis__Group__5__Impl rule__Hypothesis__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Hypothesis__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__5"


    // $ANTLR start "rule__Hypothesis__Group__5__Impl"
    // InternalHypoMethod.g:3729:1: rule__Hypothesis__Group__5__Impl : ( ( rule__Hypothesis__Group_5__0 )? ) ;
    public final void rule__Hypothesis__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3733:1: ( ( ( rule__Hypothesis__Group_5__0 )? ) )
            // InternalHypoMethod.g:3734:1: ( ( rule__Hypothesis__Group_5__0 )? )
            {
            // InternalHypoMethod.g:3734:1: ( ( rule__Hypothesis__Group_5__0 )? )
            // InternalHypoMethod.g:3735:2: ( rule__Hypothesis__Group_5__0 )?
            {
             before(grammarAccess.getHypothesisAccess().getGroup_5()); 
            // InternalHypoMethod.g:3736:2: ( rule__Hypothesis__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==101) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalHypoMethod.g:3736:3: rule__Hypothesis__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Hypothesis__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHypothesisAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__5__Impl"


    // $ANTLR start "rule__Hypothesis__Group__6"
    // InternalHypoMethod.g:3744:1: rule__Hypothesis__Group__6 : rule__Hypothesis__Group__6__Impl ;
    public final void rule__Hypothesis__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3748:1: ( rule__Hypothesis__Group__6__Impl )
            // InternalHypoMethod.g:3749:2: rule__Hypothesis__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__6"


    // $ANTLR start "rule__Hypothesis__Group__6__Impl"
    // InternalHypoMethod.g:3755:1: rule__Hypothesis__Group__6__Impl : ( '}' ) ;
    public final void rule__Hypothesis__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3759:1: ( ( '}' ) )
            // InternalHypoMethod.g:3760:1: ( '}' )
            {
            // InternalHypoMethod.g:3760:1: ( '}' )
            // InternalHypoMethod.g:3761:2: '}'
            {
             before(grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_6()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group__6__Impl"


    // $ANTLR start "rule__Hypothesis__Group_2__0"
    // InternalHypoMethod.g:3771:1: rule__Hypothesis__Group_2__0 : rule__Hypothesis__Group_2__0__Impl rule__Hypothesis__Group_2__1 ;
    public final void rule__Hypothesis__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3775:1: ( rule__Hypothesis__Group_2__0__Impl rule__Hypothesis__Group_2__1 )
            // InternalHypoMethod.g:3776:2: rule__Hypothesis__Group_2__0__Impl rule__Hypothesis__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__Hypothesis__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_2__0"


    // $ANTLR start "rule__Hypothesis__Group_2__0__Impl"
    // InternalHypoMethod.g:3783:1: rule__Hypothesis__Group_2__0__Impl : ( 'mechanistic' ) ;
    public final void rule__Hypothesis__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3787:1: ( ( 'mechanistic' ) )
            // InternalHypoMethod.g:3788:1: ( 'mechanistic' )
            {
            // InternalHypoMethod.g:3788:1: ( 'mechanistic' )
            // InternalHypoMethod.g:3789:2: 'mechanistic'
            {
             before(grammarAccess.getHypothesisAccess().getMechanisticKeyword_2_0()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getMechanisticKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_2__0__Impl"


    // $ANTLR start "rule__Hypothesis__Group_2__1"
    // InternalHypoMethod.g:3798:1: rule__Hypothesis__Group_2__1 : rule__Hypothesis__Group_2__1__Impl rule__Hypothesis__Group_2__2 ;
    public final void rule__Hypothesis__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3802:1: ( rule__Hypothesis__Group_2__1__Impl rule__Hypothesis__Group_2__2 )
            // InternalHypoMethod.g:3803:2: rule__Hypothesis__Group_2__1__Impl rule__Hypothesis__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Hypothesis__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_2__1"


    // $ANTLR start "rule__Hypothesis__Group_2__1__Impl"
    // InternalHypoMethod.g:3810:1: rule__Hypothesis__Group_2__1__Impl : ( 'hypotheses' ) ;
    public final void rule__Hypothesis__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3814:1: ( ( 'hypotheses' ) )
            // InternalHypoMethod.g:3815:1: ( 'hypotheses' )
            {
            // InternalHypoMethod.g:3815:1: ( 'hypotheses' )
            // InternalHypoMethod.g:3816:2: 'hypotheses'
            {
             before(grammarAccess.getHypothesisAccess().getHypothesesKeyword_2_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getHypothesesKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_2__1__Impl"


    // $ANTLR start "rule__Hypothesis__Group_2__2"
    // InternalHypoMethod.g:3825:1: rule__Hypothesis__Group_2__2 : rule__Hypothesis__Group_2__2__Impl rule__Hypothesis__Group_2__3 ;
    public final void rule__Hypothesis__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3829:1: ( rule__Hypothesis__Group_2__2__Impl rule__Hypothesis__Group_2__3 )
            // InternalHypoMethod.g:3830:2: rule__Hypothesis__Group_2__2__Impl rule__Hypothesis__Group_2__3
            {
            pushFollow(FOLLOW_20);
            rule__Hypothesis__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_2__2"


    // $ANTLR start "rule__Hypothesis__Group_2__2__Impl"
    // InternalHypoMethod.g:3837:1: rule__Hypothesis__Group_2__2__Impl : ( '{' ) ;
    public final void rule__Hypothesis__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3841:1: ( ( '{' ) )
            // InternalHypoMethod.g:3842:1: ( '{' )
            {
            // InternalHypoMethod.g:3842:1: ( '{' )
            // InternalHypoMethod.g:3843:2: '{'
            {
             before(grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_2_2()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_2__2__Impl"


    // $ANTLR start "rule__Hypothesis__Group_2__3"
    // InternalHypoMethod.g:3852:1: rule__Hypothesis__Group_2__3 : rule__Hypothesis__Group_2__3__Impl rule__Hypothesis__Group_2__4 ;
    public final void rule__Hypothesis__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3856:1: ( rule__Hypothesis__Group_2__3__Impl rule__Hypothesis__Group_2__4 )
            // InternalHypoMethod.g:3857:2: rule__Hypothesis__Group_2__3__Impl rule__Hypothesis__Group_2__4
            {
            pushFollow(FOLLOW_20);
            rule__Hypothesis__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_2__3"


    // $ANTLR start "rule__Hypothesis__Group_2__3__Impl"
    // InternalHypoMethod.g:3864:1: rule__Hypothesis__Group_2__3__Impl : ( ( rule__Hypothesis__MechHypothesisAssignment_2_3 )* ) ;
    public final void rule__Hypothesis__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3868:1: ( ( ( rule__Hypothesis__MechHypothesisAssignment_2_3 )* ) )
            // InternalHypoMethod.g:3869:1: ( ( rule__Hypothesis__MechHypothesisAssignment_2_3 )* )
            {
            // InternalHypoMethod.g:3869:1: ( ( rule__Hypothesis__MechHypothesisAssignment_2_3 )* )
            // InternalHypoMethod.g:3870:2: ( rule__Hypothesis__MechHypothesisAssignment_2_3 )*
            {
             before(grammarAccess.getHypothesisAccess().getMechHypothesisAssignment_2_3()); 
            // InternalHypoMethod.g:3871:2: ( rule__Hypothesis__MechHypothesisAssignment_2_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalHypoMethod.g:3871:3: rule__Hypothesis__MechHypothesisAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Hypothesis__MechHypothesisAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getHypothesisAccess().getMechHypothesisAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_2__3__Impl"


    // $ANTLR start "rule__Hypothesis__Group_2__4"
    // InternalHypoMethod.g:3879:1: rule__Hypothesis__Group_2__4 : rule__Hypothesis__Group_2__4__Impl ;
    public final void rule__Hypothesis__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3883:1: ( rule__Hypothesis__Group_2__4__Impl )
            // InternalHypoMethod.g:3884:2: rule__Hypothesis__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_2__4"


    // $ANTLR start "rule__Hypothesis__Group_2__4__Impl"
    // InternalHypoMethod.g:3890:1: rule__Hypothesis__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Hypothesis__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3894:1: ( ( '}' ) )
            // InternalHypoMethod.g:3895:1: ( '}' )
            {
            // InternalHypoMethod.g:3895:1: ( '}' )
            // InternalHypoMethod.g:3896:2: '}'
            {
             before(grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_2__4__Impl"


    // $ANTLR start "rule__Hypothesis__Group_3__0"
    // InternalHypoMethod.g:3906:1: rule__Hypothesis__Group_3__0 : rule__Hypothesis__Group_3__0__Impl rule__Hypothesis__Group_3__1 ;
    public final void rule__Hypothesis__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3910:1: ( rule__Hypothesis__Group_3__0__Impl rule__Hypothesis__Group_3__1 )
            // InternalHypoMethod.g:3911:2: rule__Hypothesis__Group_3__0__Impl rule__Hypothesis__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Hypothesis__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_3__0"


    // $ANTLR start "rule__Hypothesis__Group_3__0__Impl"
    // InternalHypoMethod.g:3918:1: rule__Hypothesis__Group_3__0__Impl : ( 'evidence' ) ;
    public final void rule__Hypothesis__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3922:1: ( ( 'evidence' ) )
            // InternalHypoMethod.g:3923:1: ( 'evidence' )
            {
            // InternalHypoMethod.g:3923:1: ( 'evidence' )
            // InternalHypoMethod.g:3924:2: 'evidence'
            {
             before(grammarAccess.getHypothesisAccess().getEvidenceKeyword_3_0()); 
            match(input,99,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getEvidenceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_3__0__Impl"


    // $ANTLR start "rule__Hypothesis__Group_3__1"
    // InternalHypoMethod.g:3933:1: rule__Hypothesis__Group_3__1 : rule__Hypothesis__Group_3__1__Impl rule__Hypothesis__Group_3__2 ;
    public final void rule__Hypothesis__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3937:1: ( rule__Hypothesis__Group_3__1__Impl rule__Hypothesis__Group_3__2 )
            // InternalHypoMethod.g:3938:2: rule__Hypothesis__Group_3__1__Impl rule__Hypothesis__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__Hypothesis__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_3__1"


    // $ANTLR start "rule__Hypothesis__Group_3__1__Impl"
    // InternalHypoMethod.g:3945:1: rule__Hypothesis__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Hypothesis__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3949:1: ( ( '{' ) )
            // InternalHypoMethod.g:3950:1: ( '{' )
            {
            // InternalHypoMethod.g:3950:1: ( '{' )
            // InternalHypoMethod.g:3951:2: '{'
            {
             before(grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_3__1__Impl"


    // $ANTLR start "rule__Hypothesis__Group_3__2"
    // InternalHypoMethod.g:3960:1: rule__Hypothesis__Group_3__2 : rule__Hypothesis__Group_3__2__Impl rule__Hypothesis__Group_3__3 ;
    public final void rule__Hypothesis__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3964:1: ( rule__Hypothesis__Group_3__2__Impl rule__Hypothesis__Group_3__3 )
            // InternalHypoMethod.g:3965:2: rule__Hypothesis__Group_3__2__Impl rule__Hypothesis__Group_3__3
            {
            pushFollow(FOLLOW_20);
            rule__Hypothesis__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_3__2"


    // $ANTLR start "rule__Hypothesis__Group_3__2__Impl"
    // InternalHypoMethod.g:3972:1: rule__Hypothesis__Group_3__2__Impl : ( ( rule__Hypothesis__EvidencesAssignment_3_2 )* ) ;
    public final void rule__Hypothesis__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3976:1: ( ( ( rule__Hypothesis__EvidencesAssignment_3_2 )* ) )
            // InternalHypoMethod.g:3977:1: ( ( rule__Hypothesis__EvidencesAssignment_3_2 )* )
            {
            // InternalHypoMethod.g:3977:1: ( ( rule__Hypothesis__EvidencesAssignment_3_2 )* )
            // InternalHypoMethod.g:3978:2: ( rule__Hypothesis__EvidencesAssignment_3_2 )*
            {
             before(grammarAccess.getHypothesisAccess().getEvidencesAssignment_3_2()); 
            // InternalHypoMethod.g:3979:2: ( rule__Hypothesis__EvidencesAssignment_3_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalHypoMethod.g:3979:3: rule__Hypothesis__EvidencesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Hypothesis__EvidencesAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getHypothesisAccess().getEvidencesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_3__2__Impl"


    // $ANTLR start "rule__Hypothesis__Group_3__3"
    // InternalHypoMethod.g:3987:1: rule__Hypothesis__Group_3__3 : rule__Hypothesis__Group_3__3__Impl ;
    public final void rule__Hypothesis__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:3991:1: ( rule__Hypothesis__Group_3__3__Impl )
            // InternalHypoMethod.g:3992:2: rule__Hypothesis__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_3__3"


    // $ANTLR start "rule__Hypothesis__Group_3__3__Impl"
    // InternalHypoMethod.g:3998:1: rule__Hypothesis__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Hypothesis__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4002:1: ( ( '}' ) )
            // InternalHypoMethod.g:4003:1: ( '}' )
            {
            // InternalHypoMethod.g:4003:1: ( '}' )
            // InternalHypoMethod.g:4004:2: '}'
            {
             before(grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_3__3__Impl"


    // $ANTLR start "rule__Hypothesis__Group_4__0"
    // InternalHypoMethod.g:4014:1: rule__Hypothesis__Group_4__0 : rule__Hypothesis__Group_4__0__Impl rule__Hypothesis__Group_4__1 ;
    public final void rule__Hypothesis__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4018:1: ( rule__Hypothesis__Group_4__0__Impl rule__Hypothesis__Group_4__1 )
            // InternalHypoMethod.g:4019:2: rule__Hypothesis__Group_4__0__Impl rule__Hypothesis__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__Hypothesis__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_4__0"


    // $ANTLR start "rule__Hypothesis__Group_4__0__Impl"
    // InternalHypoMethod.g:4026:1: rule__Hypothesis__Group_4__0__Impl : ( 'coherence' ) ;
    public final void rule__Hypothesis__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4030:1: ( ( 'coherence' ) )
            // InternalHypoMethod.g:4031:1: ( 'coherence' )
            {
            // InternalHypoMethod.g:4031:1: ( 'coherence' )
            // InternalHypoMethod.g:4032:2: 'coherence'
            {
             before(grammarAccess.getHypothesisAccess().getCoherenceKeyword_4_0()); 
            match(input,100,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getCoherenceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_4__0__Impl"


    // $ANTLR start "rule__Hypothesis__Group_4__1"
    // InternalHypoMethod.g:4041:1: rule__Hypothesis__Group_4__1 : rule__Hypothesis__Group_4__1__Impl rule__Hypothesis__Group_4__2 ;
    public final void rule__Hypothesis__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4045:1: ( rule__Hypothesis__Group_4__1__Impl rule__Hypothesis__Group_4__2 )
            // InternalHypoMethod.g:4046:2: rule__Hypothesis__Group_4__1__Impl rule__Hypothesis__Group_4__2
            {
            pushFollow(FOLLOW_6);
            rule__Hypothesis__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_4__1"


    // $ANTLR start "rule__Hypothesis__Group_4__1__Impl"
    // InternalHypoMethod.g:4053:1: rule__Hypothesis__Group_4__1__Impl : ( 'model' ) ;
    public final void rule__Hypothesis__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4057:1: ( ( 'model' ) )
            // InternalHypoMethod.g:4058:1: ( 'model' )
            {
            // InternalHypoMethod.g:4058:1: ( 'model' )
            // InternalHypoMethod.g:4059:2: 'model'
            {
             before(grammarAccess.getHypothesisAccess().getModelKeyword_4_1()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getModelKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_4__1__Impl"


    // $ANTLR start "rule__Hypothesis__Group_4__2"
    // InternalHypoMethod.g:4068:1: rule__Hypothesis__Group_4__2 : rule__Hypothesis__Group_4__2__Impl rule__Hypothesis__Group_4__3 ;
    public final void rule__Hypothesis__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4072:1: ( rule__Hypothesis__Group_4__2__Impl rule__Hypothesis__Group_4__3 )
            // InternalHypoMethod.g:4073:2: rule__Hypothesis__Group_4__2__Impl rule__Hypothesis__Group_4__3
            {
            pushFollow(FOLLOW_33);
            rule__Hypothesis__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_4__2"


    // $ANTLR start "rule__Hypothesis__Group_4__2__Impl"
    // InternalHypoMethod.g:4080:1: rule__Hypothesis__Group_4__2__Impl : ( '{' ) ;
    public final void rule__Hypothesis__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4084:1: ( ( '{' ) )
            // InternalHypoMethod.g:4085:1: ( '{' )
            {
            // InternalHypoMethod.g:4085:1: ( '{' )
            // InternalHypoMethod.g:4086:2: '{'
            {
             before(grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_4_2()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_4__2__Impl"


    // $ANTLR start "rule__Hypothesis__Group_4__3"
    // InternalHypoMethod.g:4095:1: rule__Hypothesis__Group_4__3 : rule__Hypothesis__Group_4__3__Impl rule__Hypothesis__Group_4__4 ;
    public final void rule__Hypothesis__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4099:1: ( rule__Hypothesis__Group_4__3__Impl rule__Hypothesis__Group_4__4 )
            // InternalHypoMethod.g:4100:2: rule__Hypothesis__Group_4__3__Impl rule__Hypothesis__Group_4__4
            {
            pushFollow(FOLLOW_33);
            rule__Hypothesis__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_4__3"


    // $ANTLR start "rule__Hypothesis__Group_4__3__Impl"
    // InternalHypoMethod.g:4107:1: rule__Hypothesis__Group_4__3__Impl : ( ( rule__Hypothesis__CoherenceLinksAssignment_4_3 )* ) ;
    public final void rule__Hypothesis__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4111:1: ( ( ( rule__Hypothesis__CoherenceLinksAssignment_4_3 )* ) )
            // InternalHypoMethod.g:4112:1: ( ( rule__Hypothesis__CoherenceLinksAssignment_4_3 )* )
            {
            // InternalHypoMethod.g:4112:1: ( ( rule__Hypothesis__CoherenceLinksAssignment_4_3 )* )
            // InternalHypoMethod.g:4113:2: ( rule__Hypothesis__CoherenceLinksAssignment_4_3 )*
            {
             before(grammarAccess.getHypothesisAccess().getCoherenceLinksAssignment_4_3()); 
            // InternalHypoMethod.g:4114:2: ( rule__Hypothesis__CoherenceLinksAssignment_4_3 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=54 && LA43_0<=57)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalHypoMethod.g:4114:3: rule__Hypothesis__CoherenceLinksAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Hypothesis__CoherenceLinksAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getHypothesisAccess().getCoherenceLinksAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_4__3__Impl"


    // $ANTLR start "rule__Hypothesis__Group_4__4"
    // InternalHypoMethod.g:4122:1: rule__Hypothesis__Group_4__4 : rule__Hypothesis__Group_4__4__Impl ;
    public final void rule__Hypothesis__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4126:1: ( rule__Hypothesis__Group_4__4__Impl )
            // InternalHypoMethod.g:4127:2: rule__Hypothesis__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_4__4"


    // $ANTLR start "rule__Hypothesis__Group_4__4__Impl"
    // InternalHypoMethod.g:4133:1: rule__Hypothesis__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Hypothesis__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4137:1: ( ( '}' ) )
            // InternalHypoMethod.g:4138:1: ( '}' )
            {
            // InternalHypoMethod.g:4138:1: ( '}' )
            // InternalHypoMethod.g:4139:2: '}'
            {
             before(grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_4__4__Impl"


    // $ANTLR start "rule__Hypothesis__Group_5__0"
    // InternalHypoMethod.g:4149:1: rule__Hypothesis__Group_5__0 : rule__Hypothesis__Group_5__0__Impl rule__Hypothesis__Group_5__1 ;
    public final void rule__Hypothesis__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4153:1: ( rule__Hypothesis__Group_5__0__Impl rule__Hypothesis__Group_5__1 )
            // InternalHypoMethod.g:4154:2: rule__Hypothesis__Group_5__0__Impl rule__Hypothesis__Group_5__1
            {
            pushFollow(FOLLOW_31);
            rule__Hypothesis__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_5__0"


    // $ANTLR start "rule__Hypothesis__Group_5__0__Impl"
    // InternalHypoMethod.g:4161:1: rule__Hypothesis__Group_5__0__Impl : ( 'relational' ) ;
    public final void rule__Hypothesis__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4165:1: ( ( 'relational' ) )
            // InternalHypoMethod.g:4166:1: ( 'relational' )
            {
            // InternalHypoMethod.g:4166:1: ( 'relational' )
            // InternalHypoMethod.g:4167:2: 'relational'
            {
             before(grammarAccess.getHypothesisAccess().getRelationalKeyword_5_0()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getRelationalKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_5__0__Impl"


    // $ANTLR start "rule__Hypothesis__Group_5__1"
    // InternalHypoMethod.g:4176:1: rule__Hypothesis__Group_5__1 : rule__Hypothesis__Group_5__1__Impl rule__Hypothesis__Group_5__2 ;
    public final void rule__Hypothesis__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4180:1: ( rule__Hypothesis__Group_5__1__Impl rule__Hypothesis__Group_5__2 )
            // InternalHypoMethod.g:4181:2: rule__Hypothesis__Group_5__1__Impl rule__Hypothesis__Group_5__2
            {
            pushFollow(FOLLOW_6);
            rule__Hypothesis__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_5__1"


    // $ANTLR start "rule__Hypothesis__Group_5__1__Impl"
    // InternalHypoMethod.g:4188:1: rule__Hypothesis__Group_5__1__Impl : ( 'hypotheses' ) ;
    public final void rule__Hypothesis__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4192:1: ( ( 'hypotheses' ) )
            // InternalHypoMethod.g:4193:1: ( 'hypotheses' )
            {
            // InternalHypoMethod.g:4193:1: ( 'hypotheses' )
            // InternalHypoMethod.g:4194:2: 'hypotheses'
            {
             before(grammarAccess.getHypothesisAccess().getHypothesesKeyword_5_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getHypothesesKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_5__1__Impl"


    // $ANTLR start "rule__Hypothesis__Group_5__2"
    // InternalHypoMethod.g:4203:1: rule__Hypothesis__Group_5__2 : rule__Hypothesis__Group_5__2__Impl rule__Hypothesis__Group_5__3 ;
    public final void rule__Hypothesis__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4207:1: ( rule__Hypothesis__Group_5__2__Impl rule__Hypothesis__Group_5__3 )
            // InternalHypoMethod.g:4208:2: rule__Hypothesis__Group_5__2__Impl rule__Hypothesis__Group_5__3
            {
            pushFollow(FOLLOW_35);
            rule__Hypothesis__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_5__2"


    // $ANTLR start "rule__Hypothesis__Group_5__2__Impl"
    // InternalHypoMethod.g:4215:1: rule__Hypothesis__Group_5__2__Impl : ( '{' ) ;
    public final void rule__Hypothesis__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4219:1: ( ( '{' ) )
            // InternalHypoMethod.g:4220:1: ( '{' )
            {
            // InternalHypoMethod.g:4220:1: ( '{' )
            // InternalHypoMethod.g:4221:2: '{'
            {
             before(grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_5_2()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getLeftCurlyBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_5__2__Impl"


    // $ANTLR start "rule__Hypothesis__Group_5__3"
    // InternalHypoMethod.g:4230:1: rule__Hypothesis__Group_5__3 : rule__Hypothesis__Group_5__3__Impl rule__Hypothesis__Group_5__4 ;
    public final void rule__Hypothesis__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4234:1: ( rule__Hypothesis__Group_5__3__Impl rule__Hypothesis__Group_5__4 )
            // InternalHypoMethod.g:4235:2: rule__Hypothesis__Group_5__3__Impl rule__Hypothesis__Group_5__4
            {
            pushFollow(FOLLOW_35);
            rule__Hypothesis__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_5__3"


    // $ANTLR start "rule__Hypothesis__Group_5__3__Impl"
    // InternalHypoMethod.g:4242:1: rule__Hypothesis__Group_5__3__Impl : ( ( rule__Hypothesis__RelHypothesisAssignment_5_3 )* ) ;
    public final void rule__Hypothesis__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4246:1: ( ( ( rule__Hypothesis__RelHypothesisAssignment_5_3 )* ) )
            // InternalHypoMethod.g:4247:1: ( ( rule__Hypothesis__RelHypothesisAssignment_5_3 )* )
            {
            // InternalHypoMethod.g:4247:1: ( ( rule__Hypothesis__RelHypothesisAssignment_5_3 )* )
            // InternalHypoMethod.g:4248:2: ( rule__Hypothesis__RelHypothesisAssignment_5_3 )*
            {
             before(grammarAccess.getHypothesisAccess().getRelHypothesisAssignment_5_3()); 
            // InternalHypoMethod.g:4249:2: ( rule__Hypothesis__RelHypothesisAssignment_5_3 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==107||LA44_0==112) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalHypoMethod.g:4249:3: rule__Hypothesis__RelHypothesisAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Hypothesis__RelHypothesisAssignment_5_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getHypothesisAccess().getRelHypothesisAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_5__3__Impl"


    // $ANTLR start "rule__Hypothesis__Group_5__4"
    // InternalHypoMethod.g:4257:1: rule__Hypothesis__Group_5__4 : rule__Hypothesis__Group_5__4__Impl ;
    public final void rule__Hypothesis__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4261:1: ( rule__Hypothesis__Group_5__4__Impl )
            // InternalHypoMethod.g:4262:2: rule__Hypothesis__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hypothesis__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_5__4"


    // $ANTLR start "rule__Hypothesis__Group_5__4__Impl"
    // InternalHypoMethod.g:4268:1: rule__Hypothesis__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Hypothesis__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4272:1: ( ( '}' ) )
            // InternalHypoMethod.g:4273:1: ( '}' )
            {
            // InternalHypoMethod.g:4273:1: ( '}' )
            // InternalHypoMethod.g:4274:2: '}'
            {
             before(grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getHypothesisAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__Group_5__4__Impl"


    // $ANTLR start "rule__CoherenceLink__Group__0"
    // InternalHypoMethod.g:4284:1: rule__CoherenceLink__Group__0 : rule__CoherenceLink__Group__0__Impl rule__CoherenceLink__Group__1 ;
    public final void rule__CoherenceLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4288:1: ( rule__CoherenceLink__Group__0__Impl rule__CoherenceLink__Group__1 )
            // InternalHypoMethod.g:4289:2: rule__CoherenceLink__Group__0__Impl rule__CoherenceLink__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__CoherenceLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoherenceLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__0"


    // $ANTLR start "rule__CoherenceLink__Group__0__Impl"
    // InternalHypoMethod.g:4296:1: rule__CoherenceLink__Group__0__Impl : ( ( rule__CoherenceLink__CoherenceAssignment_0 ) ) ;
    public final void rule__CoherenceLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4300:1: ( ( ( rule__CoherenceLink__CoherenceAssignment_0 ) ) )
            // InternalHypoMethod.g:4301:1: ( ( rule__CoherenceLink__CoherenceAssignment_0 ) )
            {
            // InternalHypoMethod.g:4301:1: ( ( rule__CoherenceLink__CoherenceAssignment_0 ) )
            // InternalHypoMethod.g:4302:2: ( rule__CoherenceLink__CoherenceAssignment_0 )
            {
             before(grammarAccess.getCoherenceLinkAccess().getCoherenceAssignment_0()); 
            // InternalHypoMethod.g:4303:2: ( rule__CoherenceLink__CoherenceAssignment_0 )
            // InternalHypoMethod.g:4303:3: rule__CoherenceLink__CoherenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CoherenceLink__CoherenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCoherenceLinkAccess().getCoherenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__0__Impl"


    // $ANTLR start "rule__CoherenceLink__Group__1"
    // InternalHypoMethod.g:4311:1: rule__CoherenceLink__Group__1 : rule__CoherenceLink__Group__1__Impl rule__CoherenceLink__Group__2 ;
    public final void rule__CoherenceLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4315:1: ( rule__CoherenceLink__Group__1__Impl rule__CoherenceLink__Group__2 )
            // InternalHypoMethod.g:4316:2: rule__CoherenceLink__Group__1__Impl rule__CoherenceLink__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__CoherenceLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoherenceLink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__1"


    // $ANTLR start "rule__CoherenceLink__Group__1__Impl"
    // InternalHypoMethod.g:4323:1: rule__CoherenceLink__Group__1__Impl : ( '(' ) ;
    public final void rule__CoherenceLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4327:1: ( ( '(' ) )
            // InternalHypoMethod.g:4328:1: ( '(' )
            {
            // InternalHypoMethod.g:4328:1: ( '(' )
            // InternalHypoMethod.g:4329:2: '('
            {
             before(grammarAccess.getCoherenceLinkAccess().getLeftParenthesisKeyword_1()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getCoherenceLinkAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__1__Impl"


    // $ANTLR start "rule__CoherenceLink__Group__2"
    // InternalHypoMethod.g:4338:1: rule__CoherenceLink__Group__2 : rule__CoherenceLink__Group__2__Impl rule__CoherenceLink__Group__3 ;
    public final void rule__CoherenceLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4342:1: ( rule__CoherenceLink__Group__2__Impl rule__CoherenceLink__Group__3 )
            // InternalHypoMethod.g:4343:2: rule__CoherenceLink__Group__2__Impl rule__CoherenceLink__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__CoherenceLink__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoherenceLink__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__2"


    // $ANTLR start "rule__CoherenceLink__Group__2__Impl"
    // InternalHypoMethod.g:4350:1: rule__CoherenceLink__Group__2__Impl : ( ( rule__CoherenceLink__HypAssignment_2 )* ) ;
    public final void rule__CoherenceLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4354:1: ( ( ( rule__CoherenceLink__HypAssignment_2 )* ) )
            // InternalHypoMethod.g:4355:1: ( ( rule__CoherenceLink__HypAssignment_2 )* )
            {
            // InternalHypoMethod.g:4355:1: ( ( rule__CoherenceLink__HypAssignment_2 )* )
            // InternalHypoMethod.g:4356:2: ( rule__CoherenceLink__HypAssignment_2 )*
            {
             before(grammarAccess.getCoherenceLinkAccess().getHypAssignment_2()); 
            // InternalHypoMethod.g:4357:2: ( rule__CoherenceLink__HypAssignment_2 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalHypoMethod.g:4357:3: rule__CoherenceLink__HypAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CoherenceLink__HypAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getCoherenceLinkAccess().getHypAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__2__Impl"


    // $ANTLR start "rule__CoherenceLink__Group__3"
    // InternalHypoMethod.g:4365:1: rule__CoherenceLink__Group__3 : rule__CoherenceLink__Group__3__Impl rule__CoherenceLink__Group__4 ;
    public final void rule__CoherenceLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4369:1: ( rule__CoherenceLink__Group__3__Impl rule__CoherenceLink__Group__4 )
            // InternalHypoMethod.g:4370:2: rule__CoherenceLink__Group__3__Impl rule__CoherenceLink__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__CoherenceLink__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoherenceLink__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__3"


    // $ANTLR start "rule__CoherenceLink__Group__3__Impl"
    // InternalHypoMethod.g:4377:1: rule__CoherenceLink__Group__3__Impl : ( ')' ) ;
    public final void rule__CoherenceLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4381:1: ( ( ')' ) )
            // InternalHypoMethod.g:4382:1: ( ')' )
            {
            // InternalHypoMethod.g:4382:1: ( ')' )
            // InternalHypoMethod.g:4383:2: ')'
            {
             before(grammarAccess.getCoherenceLinkAccess().getRightParenthesisKeyword_3()); 
            match(input,103,FOLLOW_2); 
             after(grammarAccess.getCoherenceLinkAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__3__Impl"


    // $ANTLR start "rule__CoherenceLink__Group__4"
    // InternalHypoMethod.g:4392:1: rule__CoherenceLink__Group__4 : rule__CoherenceLink__Group__4__Impl rule__CoherenceLink__Group__5 ;
    public final void rule__CoherenceLink__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4396:1: ( rule__CoherenceLink__Group__4__Impl rule__CoherenceLink__Group__5 )
            // InternalHypoMethod.g:4397:2: rule__CoherenceLink__Group__4__Impl rule__CoherenceLink__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__CoherenceLink__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoherenceLink__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__4"


    // $ANTLR start "rule__CoherenceLink__Group__4__Impl"
    // InternalHypoMethod.g:4404:1: rule__CoherenceLink__Group__4__Impl : ( '(' ) ;
    public final void rule__CoherenceLink__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4408:1: ( ( '(' ) )
            // InternalHypoMethod.g:4409:1: ( '(' )
            {
            // InternalHypoMethod.g:4409:1: ( '(' )
            // InternalHypoMethod.g:4410:2: '('
            {
             before(grammarAccess.getCoherenceLinkAccess().getLeftParenthesisKeyword_4()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getCoherenceLinkAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__4__Impl"


    // $ANTLR start "rule__CoherenceLink__Group__5"
    // InternalHypoMethod.g:4419:1: rule__CoherenceLink__Group__5 : rule__CoherenceLink__Group__5__Impl rule__CoherenceLink__Group__6 ;
    public final void rule__CoherenceLink__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4423:1: ( rule__CoherenceLink__Group__5__Impl rule__CoherenceLink__Group__6 )
            // InternalHypoMethod.g:4424:2: rule__CoherenceLink__Group__5__Impl rule__CoherenceLink__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__CoherenceLink__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoherenceLink__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__5"


    // $ANTLR start "rule__CoherenceLink__Group__5__Impl"
    // InternalHypoMethod.g:4431:1: rule__CoherenceLink__Group__5__Impl : ( ( rule__CoherenceLink__EviAssignment_5 )* ) ;
    public final void rule__CoherenceLink__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4435:1: ( ( ( rule__CoherenceLink__EviAssignment_5 )* ) )
            // InternalHypoMethod.g:4436:1: ( ( rule__CoherenceLink__EviAssignment_5 )* )
            {
            // InternalHypoMethod.g:4436:1: ( ( rule__CoherenceLink__EviAssignment_5 )* )
            // InternalHypoMethod.g:4437:2: ( rule__CoherenceLink__EviAssignment_5 )*
            {
             before(grammarAccess.getCoherenceLinkAccess().getEviAssignment_5()); 
            // InternalHypoMethod.g:4438:2: ( rule__CoherenceLink__EviAssignment_5 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalHypoMethod.g:4438:3: rule__CoherenceLink__EviAssignment_5
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CoherenceLink__EviAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getCoherenceLinkAccess().getEviAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__5__Impl"


    // $ANTLR start "rule__CoherenceLink__Group__6"
    // InternalHypoMethod.g:4446:1: rule__CoherenceLink__Group__6 : rule__CoherenceLink__Group__6__Impl ;
    public final void rule__CoherenceLink__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4450:1: ( rule__CoherenceLink__Group__6__Impl )
            // InternalHypoMethod.g:4451:2: rule__CoherenceLink__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoherenceLink__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__6"


    // $ANTLR start "rule__CoherenceLink__Group__6__Impl"
    // InternalHypoMethod.g:4457:1: rule__CoherenceLink__Group__6__Impl : ( ')' ) ;
    public final void rule__CoherenceLink__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4461:1: ( ( ')' ) )
            // InternalHypoMethod.g:4462:1: ( ')' )
            {
            // InternalHypoMethod.g:4462:1: ( ')' )
            // InternalHypoMethod.g:4463:2: ')'
            {
             before(grammarAccess.getCoherenceLinkAccess().getRightParenthesisKeyword_6()); 
            match(input,103,FOLLOW_2); 
             after(grammarAccess.getCoherenceLinkAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__Group__6__Impl"


    // $ANTLR start "rule__MechHypothesis__Group__0"
    // InternalHypoMethod.g:4473:1: rule__MechHypothesis__Group__0 : rule__MechHypothesis__Group__0__Impl rule__MechHypothesis__Group__1 ;
    public final void rule__MechHypothesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4477:1: ( rule__MechHypothesis__Group__0__Impl rule__MechHypothesis__Group__1 )
            // InternalHypoMethod.g:4478:2: rule__MechHypothesis__Group__0__Impl rule__MechHypothesis__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__MechHypothesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MechHypothesis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MechHypothesis__Group__0"


    // $ANTLR start "rule__MechHypothesis__Group__0__Impl"
    // InternalHypoMethod.g:4485:1: rule__MechHypothesis__Group__0__Impl : ( ( rule__MechHypothesis__MNameAssignment_0 ) ) ;
    public final void rule__MechHypothesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4489:1: ( ( ( rule__MechHypothesis__MNameAssignment_0 ) ) )
            // InternalHypoMethod.g:4490:1: ( ( rule__MechHypothesis__MNameAssignment_0 ) )
            {
            // InternalHypoMethod.g:4490:1: ( ( rule__MechHypothesis__MNameAssignment_0 ) )
            // InternalHypoMethod.g:4491:2: ( rule__MechHypothesis__MNameAssignment_0 )
            {
             before(grammarAccess.getMechHypothesisAccess().getMNameAssignment_0()); 
            // InternalHypoMethod.g:4492:2: ( rule__MechHypothesis__MNameAssignment_0 )
            // InternalHypoMethod.g:4492:3: rule__MechHypothesis__MNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MechHypothesis__MNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMechHypothesisAccess().getMNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MechHypothesis__Group__0__Impl"


    // $ANTLR start "rule__MechHypothesis__Group__1"
    // InternalHypoMethod.g:4500:1: rule__MechHypothesis__Group__1 : rule__MechHypothesis__Group__1__Impl rule__MechHypothesis__Group__2 ;
    public final void rule__MechHypothesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4504:1: ( rule__MechHypothesis__Group__1__Impl rule__MechHypothesis__Group__2 )
            // InternalHypoMethod.g:4505:2: rule__MechHypothesis__Group__1__Impl rule__MechHypothesis__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__MechHypothesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MechHypothesis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MechHypothesis__Group__1"


    // $ANTLR start "rule__MechHypothesis__Group__1__Impl"
    // InternalHypoMethod.g:4512:1: rule__MechHypothesis__Group__1__Impl : ( ':' ) ;
    public final void rule__MechHypothesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4516:1: ( ( ':' ) )
            // InternalHypoMethod.g:4517:1: ( ':' )
            {
            // InternalHypoMethod.g:4517:1: ( ':' )
            // InternalHypoMethod.g:4518:2: ':'
            {
             before(grammarAccess.getMechHypothesisAccess().getColonKeyword_1()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getMechHypothesisAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MechHypothesis__Group__1__Impl"


    // $ANTLR start "rule__MechHypothesis__Group__2"
    // InternalHypoMethod.g:4527:1: rule__MechHypothesis__Group__2 : rule__MechHypothesis__Group__2__Impl rule__MechHypothesis__Group__3 ;
    public final void rule__MechHypothesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4531:1: ( rule__MechHypothesis__Group__2__Impl rule__MechHypothesis__Group__3 )
            // InternalHypoMethod.g:4532:2: rule__MechHypothesis__Group__2__Impl rule__MechHypothesis__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__MechHypothesis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MechHypothesis__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MechHypothesis__Group__2"


    // $ANTLR start "rule__MechHypothesis__Group__2__Impl"
    // InternalHypoMethod.g:4539:1: rule__MechHypothesis__Group__2__Impl : ( ( rule__MechHypothesis__AssoMechAssignment_2 )* ) ;
    public final void rule__MechHypothesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4543:1: ( ( ( rule__MechHypothesis__AssoMechAssignment_2 )* ) )
            // InternalHypoMethod.g:4544:1: ( ( rule__MechHypothesis__AssoMechAssignment_2 )* )
            {
            // InternalHypoMethod.g:4544:1: ( ( rule__MechHypothesis__AssoMechAssignment_2 )* )
            // InternalHypoMethod.g:4545:2: ( rule__MechHypothesis__AssoMechAssignment_2 )*
            {
             before(grammarAccess.getMechHypothesisAccess().getAssoMechAssignment_2()); 
            // InternalHypoMethod.g:4546:2: ( rule__MechHypothesis__AssoMechAssignment_2 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID||LA47_0==106) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalHypoMethod.g:4546:3: rule__MechHypothesis__AssoMechAssignment_2
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__MechHypothesis__AssoMechAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getMechHypothesisAccess().getAssoMechAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MechHypothesis__Group__2__Impl"


    // $ANTLR start "rule__MechHypothesis__Group__3"
    // InternalHypoMethod.g:4554:1: rule__MechHypothesis__Group__3 : rule__MechHypothesis__Group__3__Impl ;
    public final void rule__MechHypothesis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4558:1: ( rule__MechHypothesis__Group__3__Impl )
            // InternalHypoMethod.g:4559:2: rule__MechHypothesis__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MechHypothesis__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MechHypothesis__Group__3"


    // $ANTLR start "rule__MechHypothesis__Group__3__Impl"
    // InternalHypoMethod.g:4565:1: rule__MechHypothesis__Group__3__Impl : ( ( rule__MechHypothesis__MechanisticHypothesisAssignment_3 )? ) ;
    public final void rule__MechHypothesis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4569:1: ( ( ( rule__MechHypothesis__MechanisticHypothesisAssignment_3 )? ) )
            // InternalHypoMethod.g:4570:1: ( ( rule__MechHypothesis__MechanisticHypothesisAssignment_3 )? )
            {
            // InternalHypoMethod.g:4570:1: ( ( rule__MechHypothesis__MechanisticHypothesisAssignment_3 )? )
            // InternalHypoMethod.g:4571:2: ( rule__MechHypothesis__MechanisticHypothesisAssignment_3 )?
            {
             before(grammarAccess.getMechHypothesisAccess().getMechanisticHypothesisAssignment_3()); 
            // InternalHypoMethod.g:4572:2: ( rule__MechHypothesis__MechanisticHypothesisAssignment_3 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==EOF||LA48_1==RULE_ID||LA48_1==77) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalHypoMethod.g:4572:3: rule__MechHypothesis__MechanisticHypothesisAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MechHypothesis__MechanisticHypothesisAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMechHypothesisAccess().getMechanisticHypothesisAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MechHypothesis__Group__3__Impl"


    // $ANTLR start "rule__Evidence__Group__0"
    // InternalHypoMethod.g:4581:1: rule__Evidence__Group__0 : rule__Evidence__Group__0__Impl rule__Evidence__Group__1 ;
    public final void rule__Evidence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4585:1: ( rule__Evidence__Group__0__Impl rule__Evidence__Group__1 )
            // InternalHypoMethod.g:4586:2: rule__Evidence__Group__0__Impl rule__Evidence__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Evidence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evidence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__0"


    // $ANTLR start "rule__Evidence__Group__0__Impl"
    // InternalHypoMethod.g:4593:1: rule__Evidence__Group__0__Impl : ( ( rule__Evidence__ENameAssignment_0 ) ) ;
    public final void rule__Evidence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4597:1: ( ( ( rule__Evidence__ENameAssignment_0 ) ) )
            // InternalHypoMethod.g:4598:1: ( ( rule__Evidence__ENameAssignment_0 ) )
            {
            // InternalHypoMethod.g:4598:1: ( ( rule__Evidence__ENameAssignment_0 ) )
            // InternalHypoMethod.g:4599:2: ( rule__Evidence__ENameAssignment_0 )
            {
             before(grammarAccess.getEvidenceAccess().getENameAssignment_0()); 
            // InternalHypoMethod.g:4600:2: ( rule__Evidence__ENameAssignment_0 )
            // InternalHypoMethod.g:4600:3: rule__Evidence__ENameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Evidence__ENameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEvidenceAccess().getENameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__0__Impl"


    // $ANTLR start "rule__Evidence__Group__1"
    // InternalHypoMethod.g:4608:1: rule__Evidence__Group__1 : rule__Evidence__Group__1__Impl rule__Evidence__Group__2 ;
    public final void rule__Evidence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4612:1: ( rule__Evidence__Group__1__Impl rule__Evidence__Group__2 )
            // InternalHypoMethod.g:4613:2: rule__Evidence__Group__1__Impl rule__Evidence__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__Evidence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evidence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__1"


    // $ANTLR start "rule__Evidence__Group__1__Impl"
    // InternalHypoMethod.g:4620:1: rule__Evidence__Group__1__Impl : ( ':' ) ;
    public final void rule__Evidence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4624:1: ( ( ':' ) )
            // InternalHypoMethod.g:4625:1: ( ':' )
            {
            // InternalHypoMethod.g:4625:1: ( ':' )
            // InternalHypoMethod.g:4626:2: ':'
            {
             before(grammarAccess.getEvidenceAccess().getColonKeyword_1()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getEvidenceAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__1__Impl"


    // $ANTLR start "rule__Evidence__Group__2"
    // InternalHypoMethod.g:4635:1: rule__Evidence__Group__2 : rule__Evidence__Group__2__Impl rule__Evidence__Group__3 ;
    public final void rule__Evidence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4639:1: ( rule__Evidence__Group__2__Impl rule__Evidence__Group__3 )
            // InternalHypoMethod.g:4640:2: rule__Evidence__Group__2__Impl rule__Evidence__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Evidence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evidence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__2"


    // $ANTLR start "rule__Evidence__Group__2__Impl"
    // InternalHypoMethod.g:4647:1: rule__Evidence__Group__2__Impl : ( ( rule__Evidence__QueryAssignment_2 )* ) ;
    public final void rule__Evidence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4651:1: ( ( ( rule__Evidence__QueryAssignment_2 )* ) )
            // InternalHypoMethod.g:4652:1: ( ( rule__Evidence__QueryAssignment_2 )* )
            {
            // InternalHypoMethod.g:4652:1: ( ( rule__Evidence__QueryAssignment_2 )* )
            // InternalHypoMethod.g:4653:2: ( rule__Evidence__QueryAssignment_2 )*
            {
             before(grammarAccess.getEvidenceAccess().getQueryAssignment_2()); 
            // InternalHypoMethod.g:4654:2: ( rule__Evidence__QueryAssignment_2 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==106) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalHypoMethod.g:4654:3: rule__Evidence__QueryAssignment_2
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Evidence__QueryAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getEvidenceAccess().getQueryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__2__Impl"


    // $ANTLR start "rule__Evidence__Group__3"
    // InternalHypoMethod.g:4662:1: rule__Evidence__Group__3 : rule__Evidence__Group__3__Impl rule__Evidence__Group__4 ;
    public final void rule__Evidence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4666:1: ( rule__Evidence__Group__3__Impl rule__Evidence__Group__4 )
            // InternalHypoMethod.g:4667:2: rule__Evidence__Group__3__Impl rule__Evidence__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Evidence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evidence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__3"


    // $ANTLR start "rule__Evidence__Group__3__Impl"
    // InternalHypoMethod.g:4674:1: rule__Evidence__Group__3__Impl : ( 'activation' ) ;
    public final void rule__Evidence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4678:1: ( ( 'activation' ) )
            // InternalHypoMethod.g:4679:1: ( 'activation' )
            {
            // InternalHypoMethod.g:4679:1: ( 'activation' )
            // InternalHypoMethod.g:4680:2: 'activation'
            {
             before(grammarAccess.getEvidenceAccess().getActivationKeyword_3()); 
            match(input,104,FOLLOW_2); 
             after(grammarAccess.getEvidenceAccess().getActivationKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__3__Impl"


    // $ANTLR start "rule__Evidence__Group__4"
    // InternalHypoMethod.g:4689:1: rule__Evidence__Group__4 : rule__Evidence__Group__4__Impl rule__Evidence__Group__5 ;
    public final void rule__Evidence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4693:1: ( rule__Evidence__Group__4__Impl rule__Evidence__Group__5 )
            // InternalHypoMethod.g:4694:2: rule__Evidence__Group__4__Impl rule__Evidence__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Evidence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evidence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__4"


    // $ANTLR start "rule__Evidence__Group__4__Impl"
    // InternalHypoMethod.g:4701:1: rule__Evidence__Group__4__Impl : ( 'weight' ) ;
    public final void rule__Evidence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4705:1: ( ( 'weight' ) )
            // InternalHypoMethod.g:4706:1: ( 'weight' )
            {
            // InternalHypoMethod.g:4706:1: ( 'weight' )
            // InternalHypoMethod.g:4707:2: 'weight'
            {
             before(grammarAccess.getEvidenceAccess().getWeightKeyword_4()); 
            match(input,105,FOLLOW_2); 
             after(grammarAccess.getEvidenceAccess().getWeightKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__4__Impl"


    // $ANTLR start "rule__Evidence__Group__5"
    // InternalHypoMethod.g:4716:1: rule__Evidence__Group__5 : rule__Evidence__Group__5__Impl rule__Evidence__Group__6 ;
    public final void rule__Evidence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4720:1: ( rule__Evidence__Group__5__Impl rule__Evidence__Group__6 )
            // InternalHypoMethod.g:4721:2: rule__Evidence__Group__5__Impl rule__Evidence__Group__6
            {
            pushFollow(FOLLOW_43);
            rule__Evidence__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evidence__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__5"


    // $ANTLR start "rule__Evidence__Group__5__Impl"
    // InternalHypoMethod.g:4728:1: rule__Evidence__Group__5__Impl : ( ':' ) ;
    public final void rule__Evidence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4732:1: ( ( ':' ) )
            // InternalHypoMethod.g:4733:1: ( ':' )
            {
            // InternalHypoMethod.g:4733:1: ( ':' )
            // InternalHypoMethod.g:4734:2: ':'
            {
             before(grammarAccess.getEvidenceAccess().getColonKeyword_5()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getEvidenceAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__5__Impl"


    // $ANTLR start "rule__Evidence__Group__6"
    // InternalHypoMethod.g:4743:1: rule__Evidence__Group__6 : rule__Evidence__Group__6__Impl ;
    public final void rule__Evidence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4747:1: ( rule__Evidence__Group__6__Impl )
            // InternalHypoMethod.g:4748:2: rule__Evidence__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evidence__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__6"


    // $ANTLR start "rule__Evidence__Group__6__Impl"
    // InternalHypoMethod.g:4754:1: rule__Evidence__Group__6__Impl : ( ( rule__Evidence__ObjOfStudyAssignment_6 ) ) ;
    public final void rule__Evidence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4758:1: ( ( ( rule__Evidence__ObjOfStudyAssignment_6 ) ) )
            // InternalHypoMethod.g:4759:1: ( ( rule__Evidence__ObjOfStudyAssignment_6 ) )
            {
            // InternalHypoMethod.g:4759:1: ( ( rule__Evidence__ObjOfStudyAssignment_6 ) )
            // InternalHypoMethod.g:4760:2: ( rule__Evidence__ObjOfStudyAssignment_6 )
            {
             before(grammarAccess.getEvidenceAccess().getObjOfStudyAssignment_6()); 
            // InternalHypoMethod.g:4761:2: ( rule__Evidence__ObjOfStudyAssignment_6 )
            // InternalHypoMethod.g:4761:3: rule__Evidence__ObjOfStudyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Evidence__ObjOfStudyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEvidenceAccess().getObjOfStudyAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__Group__6__Impl"


    // $ANTLR start "rule__TemporalPattern__Group__0"
    // InternalHypoMethod.g:4770:1: rule__TemporalPattern__Group__0 : rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1 ;
    public final void rule__TemporalPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4774:1: ( rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1 )
            // InternalHypoMethod.g:4775:2: rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__TemporalPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__0"


    // $ANTLR start "rule__TemporalPattern__Group__0__Impl"
    // InternalHypoMethod.g:4782:1: rule__TemporalPattern__Group__0__Impl : ( ruleCondition ) ;
    public final void rule__TemporalPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4786:1: ( ( ruleCondition ) )
            // InternalHypoMethod.g:4787:1: ( ruleCondition )
            {
            // InternalHypoMethod.g:4787:1: ( ruleCondition )
            // InternalHypoMethod.g:4788:2: ruleCondition
            {
             before(grammarAccess.getTemporalPatternAccess().getConditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTemporalPatternAccess().getConditionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__0__Impl"


    // $ANTLR start "rule__TemporalPattern__Group__1"
    // InternalHypoMethod.g:4797:1: rule__TemporalPattern__Group__1 : rule__TemporalPattern__Group__1__Impl rule__TemporalPattern__Group__2 ;
    public final void rule__TemporalPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4801:1: ( rule__TemporalPattern__Group__1__Impl rule__TemporalPattern__Group__2 )
            // InternalHypoMethod.g:4802:2: rule__TemporalPattern__Group__1__Impl rule__TemporalPattern__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__TemporalPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalPattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__1"


    // $ANTLR start "rule__TemporalPattern__Group__1__Impl"
    // InternalHypoMethod.g:4809:1: rule__TemporalPattern__Group__1__Impl : ( ( rule__TemporalPattern__L2Assignment_1 )* ) ;
    public final void rule__TemporalPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4813:1: ( ( ( rule__TemporalPattern__L2Assignment_1 )* ) )
            // InternalHypoMethod.g:4814:1: ( ( rule__TemporalPattern__L2Assignment_1 )* )
            {
            // InternalHypoMethod.g:4814:1: ( ( rule__TemporalPattern__L2Assignment_1 )* )
            // InternalHypoMethod.g:4815:2: ( rule__TemporalPattern__L2Assignment_1 )*
            {
             before(grammarAccess.getTemporalPatternAccess().getL2Assignment_1()); 
            // InternalHypoMethod.g:4816:2: ( rule__TemporalPattern__L2Assignment_1 )*
            loop50:
            do {
                int alt50=2;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    alt50=1;
                    }
                    break;
                case 37:
                    {
                    alt50=1;
                    }
                    break;
                case 38:
                    {
                    alt50=1;
                    }
                    break;
                case 39:
                    {
                    alt50=1;
                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // InternalHypoMethod.g:4816:3: rule__TemporalPattern__L2Assignment_1
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__TemporalPattern__L2Assignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getTemporalPatternAccess().getL2Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__1__Impl"


    // $ANTLR start "rule__TemporalPattern__Group__2"
    // InternalHypoMethod.g:4824:1: rule__TemporalPattern__Group__2 : rule__TemporalPattern__Group__2__Impl rule__TemporalPattern__Group__3 ;
    public final void rule__TemporalPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4828:1: ( rule__TemporalPattern__Group__2__Impl rule__TemporalPattern__Group__3 )
            // InternalHypoMethod.g:4829:2: rule__TemporalPattern__Group__2__Impl rule__TemporalPattern__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__TemporalPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalPattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__2"


    // $ANTLR start "rule__TemporalPattern__Group__2__Impl"
    // InternalHypoMethod.g:4836:1: rule__TemporalPattern__Group__2__Impl : ( ( rule__TemporalPattern__ExpAssignment_2 )* ) ;
    public final void rule__TemporalPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4840:1: ( ( ( rule__TemporalPattern__ExpAssignment_2 )* ) )
            // InternalHypoMethod.g:4841:1: ( ( rule__TemporalPattern__ExpAssignment_2 )* )
            {
            // InternalHypoMethod.g:4841:1: ( ( rule__TemporalPattern__ExpAssignment_2 )* )
            // InternalHypoMethod.g:4842:2: ( rule__TemporalPattern__ExpAssignment_2 )*
            {
             before(grammarAccess.getTemporalPatternAccess().getExpAssignment_2()); 
            // InternalHypoMethod.g:4843:2: ( rule__TemporalPattern__ExpAssignment_2 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=34 && LA51_0<=35)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalHypoMethod.g:4843:3: rule__TemporalPattern__ExpAssignment_2
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__TemporalPattern__ExpAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getTemporalPatternAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__2__Impl"


    // $ANTLR start "rule__TemporalPattern__Group__3"
    // InternalHypoMethod.g:4851:1: rule__TemporalPattern__Group__3 : rule__TemporalPattern__Group__3__Impl rule__TemporalPattern__Group__4 ;
    public final void rule__TemporalPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4855:1: ( rule__TemporalPattern__Group__3__Impl rule__TemporalPattern__Group__4 )
            // InternalHypoMethod.g:4856:2: rule__TemporalPattern__Group__3__Impl rule__TemporalPattern__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__TemporalPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalPattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__3"


    // $ANTLR start "rule__TemporalPattern__Group__3__Impl"
    // InternalHypoMethod.g:4863:1: rule__TemporalPattern__Group__3__Impl : ( ( rule__TemporalPattern__Alternatives_3 )* ) ;
    public final void rule__TemporalPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4867:1: ( ( ( rule__TemporalPattern__Alternatives_3 )* ) )
            // InternalHypoMethod.g:4868:1: ( ( rule__TemporalPattern__Alternatives_3 )* )
            {
            // InternalHypoMethod.g:4868:1: ( ( rule__TemporalPattern__Alternatives_3 )* )
            // InternalHypoMethod.g:4869:2: ( rule__TemporalPattern__Alternatives_3 )*
            {
             before(grammarAccess.getTemporalPatternAccess().getAlternatives_3()); 
            // InternalHypoMethod.g:4870:2: ( rule__TemporalPattern__Alternatives_3 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=40 && LA52_0<=53)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalHypoMethod.g:4870:3: rule__TemporalPattern__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__TemporalPattern__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getTemporalPatternAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__3__Impl"


    // $ANTLR start "rule__TemporalPattern__Group__4"
    // InternalHypoMethod.g:4878:1: rule__TemporalPattern__Group__4 : rule__TemporalPattern__Group__4__Impl ;
    public final void rule__TemporalPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4882:1: ( rule__TemporalPattern__Group__4__Impl )
            // InternalHypoMethod.g:4883:2: rule__TemporalPattern__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPattern__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__4"


    // $ANTLR start "rule__TemporalPattern__Group__4__Impl"
    // InternalHypoMethod.g:4889:1: rule__TemporalPattern__Group__4__Impl : ( ( rule__TemporalPattern__L3Assignment_4 )? ) ;
    public final void rule__TemporalPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4893:1: ( ( ( rule__TemporalPattern__L3Assignment_4 )? ) )
            // InternalHypoMethod.g:4894:1: ( ( rule__TemporalPattern__L3Assignment_4 )? )
            {
            // InternalHypoMethod.g:4894:1: ( ( rule__TemporalPattern__L3Assignment_4 )? )
            // InternalHypoMethod.g:4895:2: ( rule__TemporalPattern__L3Assignment_4 )?
            {
             before(grammarAccess.getTemporalPatternAccess().getL3Assignment_4()); 
            // InternalHypoMethod.g:4896:2: ( rule__TemporalPattern__L3Assignment_4 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=36 && LA53_0<=39)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalHypoMethod.g:4896:3: rule__TemporalPattern__L3Assignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemporalPattern__L3Assignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemporalPatternAccess().getL3Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalHypoMethod.g:4905:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4909:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalHypoMethod.g:4910:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalHypoMethod.g:4917:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__ConditionAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4921:1: ( ( ( rule__Condition__ConditionAssignment_0 ) ) )
            // InternalHypoMethod.g:4922:1: ( ( rule__Condition__ConditionAssignment_0 ) )
            {
            // InternalHypoMethod.g:4922:1: ( ( rule__Condition__ConditionAssignment_0 ) )
            // InternalHypoMethod.g:4923:2: ( rule__Condition__ConditionAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getConditionAssignment_0()); 
            // InternalHypoMethod.g:4924:2: ( rule__Condition__ConditionAssignment_0 )
            // InternalHypoMethod.g:4924:3: rule__Condition__ConditionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getConditionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalHypoMethod.g:4932:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4936:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalHypoMethod.g:4937:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalHypoMethod.g:4944:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__LoAssignment_1 )? ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4948:1: ( ( ( rule__Condition__LoAssignment_1 )? ) )
            // InternalHypoMethod.g:4949:1: ( ( rule__Condition__LoAssignment_1 )? )
            {
            // InternalHypoMethod.g:4949:1: ( ( rule__Condition__LoAssignment_1 )? )
            // InternalHypoMethod.g:4950:2: ( rule__Condition__LoAssignment_1 )?
            {
             before(grammarAccess.getConditionAccess().getLoAssignment_1()); 
            // InternalHypoMethod.g:4951:2: ( rule__Condition__LoAssignment_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=13 && LA54_0<=27)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalHypoMethod.g:4951:3: rule__Condition__LoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__LoAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getLoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalHypoMethod.g:4959:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4963:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalHypoMethod.g:4964:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalHypoMethod.g:4971:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__EAssignment_2 )? ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4975:1: ( ( ( rule__Condition__EAssignment_2 )? ) )
            // InternalHypoMethod.g:4976:1: ( ( rule__Condition__EAssignment_2 )? )
            {
            // InternalHypoMethod.g:4976:1: ( ( rule__Condition__EAssignment_2 )? )
            // InternalHypoMethod.g:4977:2: ( rule__Condition__EAssignment_2 )?
            {
             before(grammarAccess.getConditionAccess().getEAssignment_2()); 
            // InternalHypoMethod.g:4978:2: ( rule__Condition__EAssignment_2 )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalHypoMethod.g:4978:3: rule__Condition__EAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__EAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getEAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalHypoMethod.g:4986:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:4990:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalHypoMethod.g:4991:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalHypoMethod.g:4998:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__Exp1Assignment_3 )? ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5002:1: ( ( ( rule__Condition__Exp1Assignment_3 )? ) )
            // InternalHypoMethod.g:5003:1: ( ( rule__Condition__Exp1Assignment_3 )? )
            {
            // InternalHypoMethod.g:5003:1: ( ( rule__Condition__Exp1Assignment_3 )? )
            // InternalHypoMethod.g:5004:2: ( rule__Condition__Exp1Assignment_3 )?
            {
             before(grammarAccess.getConditionAccess().getExp1Assignment_3()); 
            // InternalHypoMethod.g:5005:2: ( rule__Condition__Exp1Assignment_3 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==34) ) {
                alt56=1;
            }
            else if ( (LA56_0==35) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalHypoMethod.g:5005:3: rule__Condition__Exp1Assignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Exp1Assignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getExp1Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // InternalHypoMethod.g:5013:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5017:1: ( rule__Condition__Group__4__Impl )
            // InternalHypoMethod.g:5018:2: rule__Condition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalHypoMethod.g:5024:1: rule__Condition__Group__4__Impl : ( ( rule__Condition__VAssignment_4 )? ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5028:1: ( ( ( rule__Condition__VAssignment_4 )? ) )
            // InternalHypoMethod.g:5029:1: ( ( rule__Condition__VAssignment_4 )? )
            {
            // InternalHypoMethod.g:5029:1: ( ( rule__Condition__VAssignment_4 )? )
            // InternalHypoMethod.g:5030:2: ( rule__Condition__VAssignment_4 )?
            {
             before(grammarAccess.getConditionAccess().getVAssignment_4()); 
            // InternalHypoMethod.g:5031:2: ( rule__Condition__VAssignment_4 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_RANGEVALUE) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalHypoMethod.g:5031:3: rule__Condition__VAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__VAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getVAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Simultaneous__Group__0"
    // InternalHypoMethod.g:5040:1: rule__Simultaneous__Group__0 : rule__Simultaneous__Group__0__Impl rule__Simultaneous__Group__1 ;
    public final void rule__Simultaneous__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5044:1: ( rule__Simultaneous__Group__0__Impl rule__Simultaneous__Group__1 )
            // InternalHypoMethod.g:5045:2: rule__Simultaneous__Group__0__Impl rule__Simultaneous__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Simultaneous__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simultaneous__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Group__0"


    // $ANTLR start "rule__Simultaneous__Group__0__Impl"
    // InternalHypoMethod.g:5052:1: rule__Simultaneous__Group__0__Impl : ( '[' ) ;
    public final void rule__Simultaneous__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5056:1: ( ( '[' ) )
            // InternalHypoMethod.g:5057:1: ( '[' )
            {
            // InternalHypoMethod.g:5057:1: ( '[' )
            // InternalHypoMethod.g:5058:2: '['
            {
             before(grammarAccess.getSimultaneousAccess().getLeftSquareBracketKeyword_0()); 
            match(input,106,FOLLOW_2); 
             after(grammarAccess.getSimultaneousAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Group__0__Impl"


    // $ANTLR start "rule__Simultaneous__Group__1"
    // InternalHypoMethod.g:5067:1: rule__Simultaneous__Group__1 : rule__Simultaneous__Group__1__Impl rule__Simultaneous__Group__2 ;
    public final void rule__Simultaneous__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5071:1: ( rule__Simultaneous__Group__1__Impl rule__Simultaneous__Group__2 )
            // InternalHypoMethod.g:5072:2: rule__Simultaneous__Group__1__Impl rule__Simultaneous__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__Simultaneous__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simultaneous__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Group__1"


    // $ANTLR start "rule__Simultaneous__Group__1__Impl"
    // InternalHypoMethod.g:5079:1: rule__Simultaneous__Group__1__Impl : ( ( rule__Simultaneous__Sim1Assignment_1 ) ) ;
    public final void rule__Simultaneous__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5083:1: ( ( ( rule__Simultaneous__Sim1Assignment_1 ) ) )
            // InternalHypoMethod.g:5084:1: ( ( rule__Simultaneous__Sim1Assignment_1 ) )
            {
            // InternalHypoMethod.g:5084:1: ( ( rule__Simultaneous__Sim1Assignment_1 ) )
            // InternalHypoMethod.g:5085:2: ( rule__Simultaneous__Sim1Assignment_1 )
            {
             before(grammarAccess.getSimultaneousAccess().getSim1Assignment_1()); 
            // InternalHypoMethod.g:5086:2: ( rule__Simultaneous__Sim1Assignment_1 )
            // InternalHypoMethod.g:5086:3: rule__Simultaneous__Sim1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Simultaneous__Sim1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimultaneousAccess().getSim1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Group__1__Impl"


    // $ANTLR start "rule__Simultaneous__Group__2"
    // InternalHypoMethod.g:5094:1: rule__Simultaneous__Group__2 : rule__Simultaneous__Group__2__Impl rule__Simultaneous__Group__3 ;
    public final void rule__Simultaneous__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5098:1: ( rule__Simultaneous__Group__2__Impl rule__Simultaneous__Group__3 )
            // InternalHypoMethod.g:5099:2: rule__Simultaneous__Group__2__Impl rule__Simultaneous__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__Simultaneous__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simultaneous__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Group__2"


    // $ANTLR start "rule__Simultaneous__Group__2__Impl"
    // InternalHypoMethod.g:5106:1: rule__Simultaneous__Group__2__Impl : ( ( rule__Simultaneous__Group_2__0 )* ) ;
    public final void rule__Simultaneous__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5110:1: ( ( ( rule__Simultaneous__Group_2__0 )* ) )
            // InternalHypoMethod.g:5111:1: ( ( rule__Simultaneous__Group_2__0 )* )
            {
            // InternalHypoMethod.g:5111:1: ( ( rule__Simultaneous__Group_2__0 )* )
            // InternalHypoMethod.g:5112:2: ( rule__Simultaneous__Group_2__0 )*
            {
             before(grammarAccess.getSimultaneousAccess().getGroup_2()); 
            // InternalHypoMethod.g:5113:2: ( rule__Simultaneous__Group_2__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=51 && LA58_0<=53)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalHypoMethod.g:5113:3: rule__Simultaneous__Group_2__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Simultaneous__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getSimultaneousAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Group__2__Impl"


    // $ANTLR start "rule__Simultaneous__Group__3"
    // InternalHypoMethod.g:5121:1: rule__Simultaneous__Group__3 : rule__Simultaneous__Group__3__Impl ;
    public final void rule__Simultaneous__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5125:1: ( rule__Simultaneous__Group__3__Impl )
            // InternalHypoMethod.g:5126:2: rule__Simultaneous__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simultaneous__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Group__3"


    // $ANTLR start "rule__Simultaneous__Group__3__Impl"
    // InternalHypoMethod.g:5132:1: rule__Simultaneous__Group__3__Impl : ( ']' ) ;
    public final void rule__Simultaneous__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5136:1: ( ( ']' ) )
            // InternalHypoMethod.g:5137:1: ( ']' )
            {
            // InternalHypoMethod.g:5137:1: ( ']' )
            // InternalHypoMethod.g:5138:2: ']'
            {
             before(grammarAccess.getSimultaneousAccess().getRightSquareBracketKeyword_3()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getSimultaneousAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Group__3__Impl"


    // $ANTLR start "rule__Simultaneous__Group_2__0"
    // InternalHypoMethod.g:5148:1: rule__Simultaneous__Group_2__0 : rule__Simultaneous__Group_2__0__Impl rule__Simultaneous__Group_2__1 ;
    public final void rule__Simultaneous__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5152:1: ( rule__Simultaneous__Group_2__0__Impl rule__Simultaneous__Group_2__1 )
            // InternalHypoMethod.g:5153:2: rule__Simultaneous__Group_2__0__Impl rule__Simultaneous__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Simultaneous__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simultaneous__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Group_2__0"


    // $ANTLR start "rule__Simultaneous__Group_2__0__Impl"
    // InternalHypoMethod.g:5160:1: rule__Simultaneous__Group_2__0__Impl : ( ( rule__Simultaneous__LogAssignment_2_0 ) ) ;
    public final void rule__Simultaneous__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5164:1: ( ( ( rule__Simultaneous__LogAssignment_2_0 ) ) )
            // InternalHypoMethod.g:5165:1: ( ( rule__Simultaneous__LogAssignment_2_0 ) )
            {
            // InternalHypoMethod.g:5165:1: ( ( rule__Simultaneous__LogAssignment_2_0 ) )
            // InternalHypoMethod.g:5166:2: ( rule__Simultaneous__LogAssignment_2_0 )
            {
             before(grammarAccess.getSimultaneousAccess().getLogAssignment_2_0()); 
            // InternalHypoMethod.g:5167:2: ( rule__Simultaneous__LogAssignment_2_0 )
            // InternalHypoMethod.g:5167:3: rule__Simultaneous__LogAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Simultaneous__LogAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSimultaneousAccess().getLogAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Group_2__0__Impl"


    // $ANTLR start "rule__Simultaneous__Group_2__1"
    // InternalHypoMethod.g:5175:1: rule__Simultaneous__Group_2__1 : rule__Simultaneous__Group_2__1__Impl ;
    public final void rule__Simultaneous__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5179:1: ( rule__Simultaneous__Group_2__1__Impl )
            // InternalHypoMethod.g:5180:2: rule__Simultaneous__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simultaneous__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Group_2__1"


    // $ANTLR start "rule__Simultaneous__Group_2__1__Impl"
    // InternalHypoMethod.g:5186:1: rule__Simultaneous__Group_2__1__Impl : ( ( rule__Simultaneous__Sim2Assignment_2_1 ) ) ;
    public final void rule__Simultaneous__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5190:1: ( ( ( rule__Simultaneous__Sim2Assignment_2_1 ) ) )
            // InternalHypoMethod.g:5191:1: ( ( rule__Simultaneous__Sim2Assignment_2_1 ) )
            {
            // InternalHypoMethod.g:5191:1: ( ( rule__Simultaneous__Sim2Assignment_2_1 ) )
            // InternalHypoMethod.g:5192:2: ( rule__Simultaneous__Sim2Assignment_2_1 )
            {
             before(grammarAccess.getSimultaneousAccess().getSim2Assignment_2_1()); 
            // InternalHypoMethod.g:5193:2: ( rule__Simultaneous__Sim2Assignment_2_1 )
            // InternalHypoMethod.g:5193:3: rule__Simultaneous__Sim2Assignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Simultaneous__Sim2Assignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSimultaneousAccess().getSim2Assignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Group_2__1__Impl"


    // $ANTLR start "rule__Re__Group__0"
    // InternalHypoMethod.g:5202:1: rule__Re__Group__0 : rule__Re__Group__0__Impl rule__Re__Group__1 ;
    public final void rule__Re__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5206:1: ( rule__Re__Group__0__Impl rule__Re__Group__1 )
            // InternalHypoMethod.g:5207:2: rule__Re__Group__0__Impl rule__Re__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Re__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Re__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group__0"


    // $ANTLR start "rule__Re__Group__0__Impl"
    // InternalHypoMethod.g:5214:1: rule__Re__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Re__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5218:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:5219:1: ( RULE_ID )
            {
            // InternalHypoMethod.g:5219:1: ( RULE_ID )
            // InternalHypoMethod.g:5220:2: RULE_ID
            {
             before(grammarAccess.getReAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group__0__Impl"


    // $ANTLR start "rule__Re__Group__1"
    // InternalHypoMethod.g:5229:1: rule__Re__Group__1 : rule__Re__Group__1__Impl ;
    public final void rule__Re__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5233:1: ( rule__Re__Group__1__Impl )
            // InternalHypoMethod.g:5234:2: rule__Re__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Re__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group__1"


    // $ANTLR start "rule__Re__Group__1__Impl"
    // InternalHypoMethod.g:5240:1: rule__Re__Group__1__Impl : ( ( rule__Re__Group_1__0 )? ) ;
    public final void rule__Re__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5244:1: ( ( ( rule__Re__Group_1__0 )? ) )
            // InternalHypoMethod.g:5245:1: ( ( rule__Re__Group_1__0 )? )
            {
            // InternalHypoMethod.g:5245:1: ( ( rule__Re__Group_1__0 )? )
            // InternalHypoMethod.g:5246:2: ( rule__Re__Group_1__0 )?
            {
             before(grammarAccess.getReAccess().getGroup_1()); 
            // InternalHypoMethod.g:5247:2: ( rule__Re__Group_1__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==102) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalHypoMethod.g:5247:3: rule__Re__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Re__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group__1__Impl"


    // $ANTLR start "rule__Re__Group_1__0"
    // InternalHypoMethod.g:5256:1: rule__Re__Group_1__0 : rule__Re__Group_1__0__Impl rule__Re__Group_1__1 ;
    public final void rule__Re__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5260:1: ( rule__Re__Group_1__0__Impl rule__Re__Group_1__1 )
            // InternalHypoMethod.g:5261:2: rule__Re__Group_1__0__Impl rule__Re__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Re__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Re__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group_1__0"


    // $ANTLR start "rule__Re__Group_1__0__Impl"
    // InternalHypoMethod.g:5268:1: rule__Re__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Re__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5272:1: ( ( '(' ) )
            // InternalHypoMethod.g:5273:1: ( '(' )
            {
            // InternalHypoMethod.g:5273:1: ( '(' )
            // InternalHypoMethod.g:5274:2: '('
            {
             before(grammarAccess.getReAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getReAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group_1__0__Impl"


    // $ANTLR start "rule__Re__Group_1__1"
    // InternalHypoMethod.g:5283:1: rule__Re__Group_1__1 : rule__Re__Group_1__1__Impl rule__Re__Group_1__2 ;
    public final void rule__Re__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5287:1: ( rule__Re__Group_1__1__Impl rule__Re__Group_1__2 )
            // InternalHypoMethod.g:5288:2: rule__Re__Group_1__1__Impl rule__Re__Group_1__2
            {
            pushFollow(FOLLOW_38);
            rule__Re__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Re__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group_1__1"


    // $ANTLR start "rule__Re__Group_1__1__Impl"
    // InternalHypoMethod.g:5295:1: rule__Re__Group_1__1__Impl : ( ( rule__Re__Group_1_1__0 )? ) ;
    public final void rule__Re__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5299:1: ( ( ( rule__Re__Group_1_1__0 )? ) )
            // InternalHypoMethod.g:5300:1: ( ( rule__Re__Group_1_1__0 )? )
            {
            // InternalHypoMethod.g:5300:1: ( ( rule__Re__Group_1_1__0 )? )
            // InternalHypoMethod.g:5301:2: ( rule__Re__Group_1_1__0 )?
            {
             before(grammarAccess.getReAccess().getGroup_1_1()); 
            // InternalHypoMethod.g:5302:2: ( rule__Re__Group_1_1__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalHypoMethod.g:5302:3: rule__Re__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Re__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group_1__1__Impl"


    // $ANTLR start "rule__Re__Group_1__2"
    // InternalHypoMethod.g:5310:1: rule__Re__Group_1__2 : rule__Re__Group_1__2__Impl ;
    public final void rule__Re__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5314:1: ( rule__Re__Group_1__2__Impl )
            // InternalHypoMethod.g:5315:2: rule__Re__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Re__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group_1__2"


    // $ANTLR start "rule__Re__Group_1__2__Impl"
    // InternalHypoMethod.g:5321:1: rule__Re__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Re__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5325:1: ( ( ')' ) )
            // InternalHypoMethod.g:5326:1: ( ')' )
            {
            // InternalHypoMethod.g:5326:1: ( ')' )
            // InternalHypoMethod.g:5327:2: ')'
            {
             before(grammarAccess.getReAccess().getRightParenthesisKeyword_1_2()); 
            match(input,103,FOLLOW_2); 
             after(grammarAccess.getReAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group_1__2__Impl"


    // $ANTLR start "rule__Re__Group_1_1__0"
    // InternalHypoMethod.g:5337:1: rule__Re__Group_1_1__0 : rule__Re__Group_1_1__0__Impl rule__Re__Group_1_1__1 ;
    public final void rule__Re__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5341:1: ( rule__Re__Group_1_1__0__Impl rule__Re__Group_1_1__1 )
            // InternalHypoMethod.g:5342:2: rule__Re__Group_1_1__0__Impl rule__Re__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Re__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Re__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group_1_1__0"


    // $ANTLR start "rule__Re__Group_1_1__0__Impl"
    // InternalHypoMethod.g:5349:1: rule__Re__Group_1_1__0__Impl : ( RULE_ID ) ;
    public final void rule__Re__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5353:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:5354:1: ( RULE_ID )
            {
            // InternalHypoMethod.g:5354:1: ( RULE_ID )
            // InternalHypoMethod.g:5355:2: RULE_ID
            {
             before(grammarAccess.getReAccess().getIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReAccess().getIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group_1_1__0__Impl"


    // $ANTLR start "rule__Re__Group_1_1__1"
    // InternalHypoMethod.g:5364:1: rule__Re__Group_1_1__1 : rule__Re__Group_1_1__1__Impl ;
    public final void rule__Re__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5368:1: ( rule__Re__Group_1_1__1__Impl )
            // InternalHypoMethod.g:5369:2: rule__Re__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Re__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group_1_1__1"


    // $ANTLR start "rule__Re__Group_1_1__1__Impl"
    // InternalHypoMethod.g:5375:1: rule__Re__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Re__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5379:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:5380:1: ( RULE_ID )
            {
            // InternalHypoMethod.g:5380:1: ( RULE_ID )
            // InternalHypoMethod.g:5381:2: RULE_ID
            {
             before(grammarAccess.getReAccess().getIDTerminalRuleCall_1_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReAccess().getIDTerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Re__Group_1_1__1__Impl"


    // $ANTLR start "rule__Query1__Group__0"
    // InternalHypoMethod.g:5391:1: rule__Query1__Group__0 : rule__Query1__Group__0__Impl rule__Query1__Group__1 ;
    public final void rule__Query1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5395:1: ( rule__Query1__Group__0__Impl rule__Query1__Group__1 )
            // InternalHypoMethod.g:5396:2: rule__Query1__Group__0__Impl rule__Query1__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__Query1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__0"


    // $ANTLR start "rule__Query1__Group__0__Impl"
    // InternalHypoMethod.g:5403:1: rule__Query1__Group__0__Impl : ( 'if' ) ;
    public final void rule__Query1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5407:1: ( ( 'if' ) )
            // InternalHypoMethod.g:5408:1: ( 'if' )
            {
            // InternalHypoMethod.g:5408:1: ( 'if' )
            // InternalHypoMethod.g:5409:2: 'if'
            {
             before(grammarAccess.getQuery1Access().getIfKeyword_0()); 
            match(input,107,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__0__Impl"


    // $ANTLR start "rule__Query1__Group__1"
    // InternalHypoMethod.g:5418:1: rule__Query1__Group__1 : rule__Query1__Group__1__Impl rule__Query1__Group__2 ;
    public final void rule__Query1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5422:1: ( rule__Query1__Group__1__Impl rule__Query1__Group__2 )
            // InternalHypoMethod.g:5423:2: rule__Query1__Group__1__Impl rule__Query1__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__Query1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__1"


    // $ANTLR start "rule__Query1__Group__1__Impl"
    // InternalHypoMethod.g:5430:1: rule__Query1__Group__1__Impl : ( ( rule__Query1__FactorAssignment_1 )? ) ;
    public final void rule__Query1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5434:1: ( ( ( rule__Query1__FactorAssignment_1 )? ) )
            // InternalHypoMethod.g:5435:1: ( ( rule__Query1__FactorAssignment_1 )? )
            {
            // InternalHypoMethod.g:5435:1: ( ( rule__Query1__FactorAssignment_1 )? )
            // InternalHypoMethod.g:5436:2: ( rule__Query1__FactorAssignment_1 )?
            {
             before(grammarAccess.getQuery1Access().getFactorAssignment_1()); 
            // InternalHypoMethod.g:5437:2: ( rule__Query1__FactorAssignment_1 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalHypoMethod.g:5437:3: rule__Query1__FactorAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query1__FactorAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery1Access().getFactorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__1__Impl"


    // $ANTLR start "rule__Query1__Group__2"
    // InternalHypoMethod.g:5445:1: rule__Query1__Group__2 : rule__Query1__Group__2__Impl rule__Query1__Group__3 ;
    public final void rule__Query1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5449:1: ( rule__Query1__Group__2__Impl rule__Query1__Group__3 )
            // InternalHypoMethod.g:5450:2: rule__Query1__Group__2__Impl rule__Query1__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__Query1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__2"


    // $ANTLR start "rule__Query1__Group__2__Impl"
    // InternalHypoMethod.g:5457:1: rule__Query1__Group__2__Impl : ( ( rule__Query1__ControlAssignment_2 )? ) ;
    public final void rule__Query1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5461:1: ( ( ( rule__Query1__ControlAssignment_2 )? ) )
            // InternalHypoMethod.g:5462:1: ( ( rule__Query1__ControlAssignment_2 )? )
            {
            // InternalHypoMethod.g:5462:1: ( ( rule__Query1__ControlAssignment_2 )? )
            // InternalHypoMethod.g:5463:2: ( rule__Query1__ControlAssignment_2 )?
            {
             before(grammarAccess.getQuery1Access().getControlAssignment_2()); 
            // InternalHypoMethod.g:5464:2: ( rule__Query1__ControlAssignment_2 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalHypoMethod.g:5464:3: rule__Query1__ControlAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query1__ControlAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery1Access().getControlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__2__Impl"


    // $ANTLR start "rule__Query1__Group__3"
    // InternalHypoMethod.g:5472:1: rule__Query1__Group__3 : rule__Query1__Group__3__Impl rule__Query1__Group__4 ;
    public final void rule__Query1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5476:1: ( rule__Query1__Group__3__Impl rule__Query1__Group__4 )
            // InternalHypoMethod.g:5477:2: rule__Query1__Group__3__Impl rule__Query1__Group__4
            {
            pushFollow(FOLLOW_51);
            rule__Query1__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__3"


    // $ANTLR start "rule__Query1__Group__3__Impl"
    // InternalHypoMethod.g:5484:1: rule__Query1__Group__3__Impl : ( 'is' ) ;
    public final void rule__Query1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5488:1: ( ( 'is' ) )
            // InternalHypoMethod.g:5489:1: ( 'is' )
            {
            // InternalHypoMethod.g:5489:1: ( 'is' )
            // InternalHypoMethod.g:5490:2: 'is'
            {
             before(grammarAccess.getQuery1Access().getIsKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getIsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__3__Impl"


    // $ANTLR start "rule__Query1__Group__4"
    // InternalHypoMethod.g:5499:1: rule__Query1__Group__4 : rule__Query1__Group__4__Impl rule__Query1__Group__5 ;
    public final void rule__Query1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5503:1: ( rule__Query1__Group__4__Impl rule__Query1__Group__5 )
            // InternalHypoMethod.g:5504:2: rule__Query1__Group__4__Impl rule__Query1__Group__5
            {
            pushFollow(FOLLOW_51);
            rule__Query1__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__4"


    // $ANTLR start "rule__Query1__Group__4__Impl"
    // InternalHypoMethod.g:5511:1: rule__Query1__Group__4__Impl : ( ( rule__Query1__XAssignment_4 )? ) ;
    public final void rule__Query1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5515:1: ( ( ( rule__Query1__XAssignment_4 )? ) )
            // InternalHypoMethod.g:5516:1: ( ( rule__Query1__XAssignment_4 )? )
            {
            // InternalHypoMethod.g:5516:1: ( ( rule__Query1__XAssignment_4 )? )
            // InternalHypoMethod.g:5517:2: ( rule__Query1__XAssignment_4 )?
            {
             before(grammarAccess.getQuery1Access().getXAssignment_4()); 
            // InternalHypoMethod.g:5518:2: ( rule__Query1__XAssignment_4 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_RANGEVALUE) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalHypoMethod.g:5518:3: rule__Query1__XAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query1__XAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery1Access().getXAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__4__Impl"


    // $ANTLR start "rule__Query1__Group__5"
    // InternalHypoMethod.g:5526:1: rule__Query1__Group__5 : rule__Query1__Group__5__Impl rule__Query1__Group__6 ;
    public final void rule__Query1__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5530:1: ( rule__Query1__Group__5__Impl rule__Query1__Group__6 )
            // InternalHypoMethod.g:5531:2: rule__Query1__Group__5__Impl rule__Query1__Group__6
            {
            pushFollow(FOLLOW_51);
            rule__Query1__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__5"


    // $ANTLR start "rule__Query1__Group__5__Impl"
    // InternalHypoMethod.g:5538:1: rule__Query1__Group__5__Impl : ( ( 'added' )? ) ;
    public final void rule__Query1__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5542:1: ( ( ( 'added' )? ) )
            // InternalHypoMethod.g:5543:1: ( ( 'added' )? )
            {
            // InternalHypoMethod.g:5543:1: ( ( 'added' )? )
            // InternalHypoMethod.g:5544:2: ( 'added' )?
            {
             before(grammarAccess.getQuery1Access().getAddedKeyword_5()); 
            // InternalHypoMethod.g:5545:2: ( 'added' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==108) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalHypoMethod.g:5545:3: 'added'
                    {
                    match(input,108,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQuery1Access().getAddedKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__5__Impl"


    // $ANTLR start "rule__Query1__Group__6"
    // InternalHypoMethod.g:5553:1: rule__Query1__Group__6 : rule__Query1__Group__6__Impl rule__Query1__Group__7 ;
    public final void rule__Query1__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5557:1: ( rule__Query1__Group__6__Impl rule__Query1__Group__7 )
            // InternalHypoMethod.g:5558:2: rule__Query1__Group__6__Impl rule__Query1__Group__7
            {
            pushFollow(FOLLOW_51);
            rule__Query1__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__6"


    // $ANTLR start "rule__Query1__Group__6__Impl"
    // InternalHypoMethod.g:5565:1: rule__Query1__Group__6__Impl : ( ( 'removed' )? ) ;
    public final void rule__Query1__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5569:1: ( ( ( 'removed' )? ) )
            // InternalHypoMethod.g:5570:1: ( ( 'removed' )? )
            {
            // InternalHypoMethod.g:5570:1: ( ( 'removed' )? )
            // InternalHypoMethod.g:5571:2: ( 'removed' )?
            {
             before(grammarAccess.getQuery1Access().getRemovedKeyword_6()); 
            // InternalHypoMethod.g:5572:2: ( 'removed' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==109) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalHypoMethod.g:5572:3: 'removed'
                    {
                    match(input,109,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQuery1Access().getRemovedKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__6__Impl"


    // $ANTLR start "rule__Query1__Group__7"
    // InternalHypoMethod.g:5580:1: rule__Query1__Group__7 : rule__Query1__Group__7__Impl rule__Query1__Group__8 ;
    public final void rule__Query1__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5584:1: ( rule__Query1__Group__7__Impl rule__Query1__Group__8 )
            // InternalHypoMethod.g:5585:2: rule__Query1__Group__7__Impl rule__Query1__Group__8
            {
            pushFollow(FOLLOW_51);
            rule__Query1__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__7"


    // $ANTLR start "rule__Query1__Group__7__Impl"
    // InternalHypoMethod.g:5592:1: rule__Query1__Group__7__Impl : ( ( rule__Query1__Group_7__0 )? ) ;
    public final void rule__Query1__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5596:1: ( ( ( rule__Query1__Group_7__0 )? ) )
            // InternalHypoMethod.g:5597:1: ( ( rule__Query1__Group_7__0 )? )
            {
            // InternalHypoMethod.g:5597:1: ( ( rule__Query1__Group_7__0 )? )
            // InternalHypoMethod.g:5598:2: ( rule__Query1__Group_7__0 )?
            {
             before(grammarAccess.getQuery1Access().getGroup_7()); 
            // InternalHypoMethod.g:5599:2: ( rule__Query1__Group_7__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==111) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalHypoMethod.g:5599:3: rule__Query1__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query1__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery1Access().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__7__Impl"


    // $ANTLR start "rule__Query1__Group__8"
    // InternalHypoMethod.g:5607:1: rule__Query1__Group__8 : rule__Query1__Group__8__Impl rule__Query1__Group__9 ;
    public final void rule__Query1__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5611:1: ( rule__Query1__Group__8__Impl rule__Query1__Group__9 )
            // InternalHypoMethod.g:5612:2: rule__Query1__Group__8__Impl rule__Query1__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Query1__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__8"


    // $ANTLR start "rule__Query1__Group__8__Impl"
    // InternalHypoMethod.g:5619:1: rule__Query1__Group__8__Impl : ( 'then' ) ;
    public final void rule__Query1__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5623:1: ( ( 'then' ) )
            // InternalHypoMethod.g:5624:1: ( 'then' )
            {
            // InternalHypoMethod.g:5624:1: ( 'then' )
            // InternalHypoMethod.g:5625:2: 'then'
            {
             before(grammarAccess.getQuery1Access().getThenKeyword_8()); 
            match(input,110,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getThenKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__8__Impl"


    // $ANTLR start "rule__Query1__Group__9"
    // InternalHypoMethod.g:5634:1: rule__Query1__Group__9 : rule__Query1__Group__9__Impl rule__Query1__Group__10 ;
    public final void rule__Query1__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5638:1: ( rule__Query1__Group__9__Impl rule__Query1__Group__10 )
            // InternalHypoMethod.g:5639:2: rule__Query1__Group__9__Impl rule__Query1__Group__10
            {
            pushFollow(FOLLOW_52);
            rule__Query1__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__9"


    // $ANTLR start "rule__Query1__Group__9__Impl"
    // InternalHypoMethod.g:5646:1: rule__Query1__Group__9__Impl : ( ( rule__Query1__ResponseAssignment_9 ) ) ;
    public final void rule__Query1__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5650:1: ( ( ( rule__Query1__ResponseAssignment_9 ) ) )
            // InternalHypoMethod.g:5651:1: ( ( rule__Query1__ResponseAssignment_9 ) )
            {
            // InternalHypoMethod.g:5651:1: ( ( rule__Query1__ResponseAssignment_9 ) )
            // InternalHypoMethod.g:5652:2: ( rule__Query1__ResponseAssignment_9 )
            {
             before(grammarAccess.getQuery1Access().getResponseAssignment_9()); 
            // InternalHypoMethod.g:5653:2: ( rule__Query1__ResponseAssignment_9 )
            // InternalHypoMethod.g:5653:3: rule__Query1__ResponseAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Query1__ResponseAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getQuery1Access().getResponseAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__9__Impl"


    // $ANTLR start "rule__Query1__Group__10"
    // InternalHypoMethod.g:5661:1: rule__Query1__Group__10 : rule__Query1__Group__10__Impl rule__Query1__Group__11 ;
    public final void rule__Query1__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5665:1: ( rule__Query1__Group__10__Impl rule__Query1__Group__11 )
            // InternalHypoMethod.g:5666:2: rule__Query1__Group__10__Impl rule__Query1__Group__11
            {
            pushFollow(FOLLOW_53);
            rule__Query1__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__10"


    // $ANTLR start "rule__Query1__Group__10__Impl"
    // InternalHypoMethod.g:5673:1: rule__Query1__Group__10__Impl : ( 'is' ) ;
    public final void rule__Query1__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5677:1: ( ( 'is' ) )
            // InternalHypoMethod.g:5678:1: ( 'is' )
            {
            // InternalHypoMethod.g:5678:1: ( 'is' )
            // InternalHypoMethod.g:5679:2: 'is'
            {
             before(grammarAccess.getQuery1Access().getIsKeyword_10()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getIsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__10__Impl"


    // $ANTLR start "rule__Query1__Group__11"
    // InternalHypoMethod.g:5688:1: rule__Query1__Group__11 : rule__Query1__Group__11__Impl rule__Query1__Group__12 ;
    public final void rule__Query1__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5692:1: ( rule__Query1__Group__11__Impl rule__Query1__Group__12 )
            // InternalHypoMethod.g:5693:2: rule__Query1__Group__11__Impl rule__Query1__Group__12
            {
            pushFollow(FOLLOW_53);
            rule__Query1__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__11"


    // $ANTLR start "rule__Query1__Group__11__Impl"
    // InternalHypoMethod.g:5700:1: rule__Query1__Group__11__Impl : ( ( rule__Query1__YAssignment_11 )? ) ;
    public final void rule__Query1__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5704:1: ( ( ( rule__Query1__YAssignment_11 )? ) )
            // InternalHypoMethod.g:5705:1: ( ( rule__Query1__YAssignment_11 )? )
            {
            // InternalHypoMethod.g:5705:1: ( ( rule__Query1__YAssignment_11 )? )
            // InternalHypoMethod.g:5706:2: ( rule__Query1__YAssignment_11 )?
            {
             before(grammarAccess.getQuery1Access().getYAssignment_11()); 
            // InternalHypoMethod.g:5707:2: ( rule__Query1__YAssignment_11 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_RANGEVALUE) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalHypoMethod.g:5707:3: rule__Query1__YAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query1__YAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery1Access().getYAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__11__Impl"


    // $ANTLR start "rule__Query1__Group__12"
    // InternalHypoMethod.g:5715:1: rule__Query1__Group__12 : rule__Query1__Group__12__Impl ;
    public final void rule__Query1__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5719:1: ( rule__Query1__Group__12__Impl )
            // InternalHypoMethod.g:5720:2: rule__Query1__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query1__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__12"


    // $ANTLR start "rule__Query1__Group__12__Impl"
    // InternalHypoMethod.g:5726:1: rule__Query1__Group__12__Impl : ( ( rule__Query1__Group_12__0 )? ) ;
    public final void rule__Query1__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5730:1: ( ( ( rule__Query1__Group_12__0 )? ) )
            // InternalHypoMethod.g:5731:1: ( ( rule__Query1__Group_12__0 )? )
            {
            // InternalHypoMethod.g:5731:1: ( ( rule__Query1__Group_12__0 )? )
            // InternalHypoMethod.g:5732:2: ( rule__Query1__Group_12__0 )?
            {
             before(grammarAccess.getQuery1Access().getGroup_12()); 
            // InternalHypoMethod.g:5733:2: ( rule__Query1__Group_12__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==111) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalHypoMethod.g:5733:3: rule__Query1__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query1__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery1Access().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group__12__Impl"


    // $ANTLR start "rule__Query1__Group_7__0"
    // InternalHypoMethod.g:5742:1: rule__Query1__Group_7__0 : rule__Query1__Group_7__0__Impl rule__Query1__Group_7__1 ;
    public final void rule__Query1__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5746:1: ( rule__Query1__Group_7__0__Impl rule__Query1__Group_7__1 )
            // InternalHypoMethod.g:5747:2: rule__Query1__Group_7__0__Impl rule__Query1__Group_7__1
            {
            pushFollow(FOLLOW_43);
            rule__Query1__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_7__0"


    // $ANTLR start "rule__Query1__Group_7__0__Impl"
    // InternalHypoMethod.g:5754:1: rule__Query1__Group_7__0__Impl : ( 'in the range' ) ;
    public final void rule__Query1__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5758:1: ( ( 'in the range' ) )
            // InternalHypoMethod.g:5759:1: ( 'in the range' )
            {
            // InternalHypoMethod.g:5759:1: ( 'in the range' )
            // InternalHypoMethod.g:5760:2: 'in the range'
            {
             before(grammarAccess.getQuery1Access().getInTheRangeKeyword_7_0()); 
            match(input,111,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getInTheRangeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_7__0__Impl"


    // $ANTLR start "rule__Query1__Group_7__1"
    // InternalHypoMethod.g:5769:1: rule__Query1__Group_7__1 : rule__Query1__Group_7__1__Impl rule__Query1__Group_7__2 ;
    public final void rule__Query1__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5773:1: ( rule__Query1__Group_7__1__Impl rule__Query1__Group_7__2 )
            // InternalHypoMethod.g:5774:2: rule__Query1__Group_7__1__Impl rule__Query1__Group_7__2
            {
            pushFollow(FOLLOW_54);
            rule__Query1__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_7__1"


    // $ANTLR start "rule__Query1__Group_7__1__Impl"
    // InternalHypoMethod.g:5781:1: rule__Query1__Group_7__1__Impl : ( ( rule__Query1__Start1Assignment_7_1 ) ) ;
    public final void rule__Query1__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5785:1: ( ( ( rule__Query1__Start1Assignment_7_1 ) ) )
            // InternalHypoMethod.g:5786:1: ( ( rule__Query1__Start1Assignment_7_1 ) )
            {
            // InternalHypoMethod.g:5786:1: ( ( rule__Query1__Start1Assignment_7_1 ) )
            // InternalHypoMethod.g:5787:2: ( rule__Query1__Start1Assignment_7_1 )
            {
             before(grammarAccess.getQuery1Access().getStart1Assignment_7_1()); 
            // InternalHypoMethod.g:5788:2: ( rule__Query1__Start1Assignment_7_1 )
            // InternalHypoMethod.g:5788:3: rule__Query1__Start1Assignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Query1__Start1Assignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getQuery1Access().getStart1Assignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_7__1__Impl"


    // $ANTLR start "rule__Query1__Group_7__2"
    // InternalHypoMethod.g:5796:1: rule__Query1__Group_7__2 : rule__Query1__Group_7__2__Impl rule__Query1__Group_7__3 ;
    public final void rule__Query1__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5800:1: ( rule__Query1__Group_7__2__Impl rule__Query1__Group_7__3 )
            // InternalHypoMethod.g:5801:2: rule__Query1__Group_7__2__Impl rule__Query1__Group_7__3
            {
            pushFollow(FOLLOW_43);
            rule__Query1__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_7__2"


    // $ANTLR start "rule__Query1__Group_7__2__Impl"
    // InternalHypoMethod.g:5808:1: rule__Query1__Group_7__2__Impl : ( 'to' ) ;
    public final void rule__Query1__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5812:1: ( ( 'to' ) )
            // InternalHypoMethod.g:5813:1: ( 'to' )
            {
            // InternalHypoMethod.g:5813:1: ( 'to' )
            // InternalHypoMethod.g:5814:2: 'to'
            {
             before(grammarAccess.getQuery1Access().getToKeyword_7_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getToKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_7__2__Impl"


    // $ANTLR start "rule__Query1__Group_7__3"
    // InternalHypoMethod.g:5823:1: rule__Query1__Group_7__3 : rule__Query1__Group_7__3__Impl ;
    public final void rule__Query1__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5827:1: ( rule__Query1__Group_7__3__Impl )
            // InternalHypoMethod.g:5828:2: rule__Query1__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query1__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_7__3"


    // $ANTLR start "rule__Query1__Group_7__3__Impl"
    // InternalHypoMethod.g:5834:1: rule__Query1__Group_7__3__Impl : ( ( rule__Query1__End1Assignment_7_3 ) ) ;
    public final void rule__Query1__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5838:1: ( ( ( rule__Query1__End1Assignment_7_3 ) ) )
            // InternalHypoMethod.g:5839:1: ( ( rule__Query1__End1Assignment_7_3 ) )
            {
            // InternalHypoMethod.g:5839:1: ( ( rule__Query1__End1Assignment_7_3 ) )
            // InternalHypoMethod.g:5840:2: ( rule__Query1__End1Assignment_7_3 )
            {
             before(grammarAccess.getQuery1Access().getEnd1Assignment_7_3()); 
            // InternalHypoMethod.g:5841:2: ( rule__Query1__End1Assignment_7_3 )
            // InternalHypoMethod.g:5841:3: rule__Query1__End1Assignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Query1__End1Assignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getQuery1Access().getEnd1Assignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_7__3__Impl"


    // $ANTLR start "rule__Query1__Group_12__0"
    // InternalHypoMethod.g:5850:1: rule__Query1__Group_12__0 : rule__Query1__Group_12__0__Impl rule__Query1__Group_12__1 ;
    public final void rule__Query1__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5854:1: ( rule__Query1__Group_12__0__Impl rule__Query1__Group_12__1 )
            // InternalHypoMethod.g:5855:2: rule__Query1__Group_12__0__Impl rule__Query1__Group_12__1
            {
            pushFollow(FOLLOW_43);
            rule__Query1__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_12__0"


    // $ANTLR start "rule__Query1__Group_12__0__Impl"
    // InternalHypoMethod.g:5862:1: rule__Query1__Group_12__0__Impl : ( 'in the range' ) ;
    public final void rule__Query1__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5866:1: ( ( 'in the range' ) )
            // InternalHypoMethod.g:5867:1: ( 'in the range' )
            {
            // InternalHypoMethod.g:5867:1: ( 'in the range' )
            // InternalHypoMethod.g:5868:2: 'in the range'
            {
             before(grammarAccess.getQuery1Access().getInTheRangeKeyword_12_0()); 
            match(input,111,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getInTheRangeKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_12__0__Impl"


    // $ANTLR start "rule__Query1__Group_12__1"
    // InternalHypoMethod.g:5877:1: rule__Query1__Group_12__1 : rule__Query1__Group_12__1__Impl rule__Query1__Group_12__2 ;
    public final void rule__Query1__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5881:1: ( rule__Query1__Group_12__1__Impl rule__Query1__Group_12__2 )
            // InternalHypoMethod.g:5882:2: rule__Query1__Group_12__1__Impl rule__Query1__Group_12__2
            {
            pushFollow(FOLLOW_54);
            rule__Query1__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_12__1"


    // $ANTLR start "rule__Query1__Group_12__1__Impl"
    // InternalHypoMethod.g:5889:1: rule__Query1__Group_12__1__Impl : ( ( rule__Query1__Start2Assignment_12_1 ) ) ;
    public final void rule__Query1__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5893:1: ( ( ( rule__Query1__Start2Assignment_12_1 ) ) )
            // InternalHypoMethod.g:5894:1: ( ( rule__Query1__Start2Assignment_12_1 ) )
            {
            // InternalHypoMethod.g:5894:1: ( ( rule__Query1__Start2Assignment_12_1 ) )
            // InternalHypoMethod.g:5895:2: ( rule__Query1__Start2Assignment_12_1 )
            {
             before(grammarAccess.getQuery1Access().getStart2Assignment_12_1()); 
            // InternalHypoMethod.g:5896:2: ( rule__Query1__Start2Assignment_12_1 )
            // InternalHypoMethod.g:5896:3: rule__Query1__Start2Assignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Query1__Start2Assignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getQuery1Access().getStart2Assignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_12__1__Impl"


    // $ANTLR start "rule__Query1__Group_12__2"
    // InternalHypoMethod.g:5904:1: rule__Query1__Group_12__2 : rule__Query1__Group_12__2__Impl rule__Query1__Group_12__3 ;
    public final void rule__Query1__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5908:1: ( rule__Query1__Group_12__2__Impl rule__Query1__Group_12__3 )
            // InternalHypoMethod.g:5909:2: rule__Query1__Group_12__2__Impl rule__Query1__Group_12__3
            {
            pushFollow(FOLLOW_43);
            rule__Query1__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query1__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_12__2"


    // $ANTLR start "rule__Query1__Group_12__2__Impl"
    // InternalHypoMethod.g:5916:1: rule__Query1__Group_12__2__Impl : ( 'to' ) ;
    public final void rule__Query1__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5920:1: ( ( 'to' ) )
            // InternalHypoMethod.g:5921:1: ( 'to' )
            {
            // InternalHypoMethod.g:5921:1: ( 'to' )
            // InternalHypoMethod.g:5922:2: 'to'
            {
             before(grammarAccess.getQuery1Access().getToKeyword_12_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getToKeyword_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_12__2__Impl"


    // $ANTLR start "rule__Query1__Group_12__3"
    // InternalHypoMethod.g:5931:1: rule__Query1__Group_12__3 : rule__Query1__Group_12__3__Impl ;
    public final void rule__Query1__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5935:1: ( rule__Query1__Group_12__3__Impl )
            // InternalHypoMethod.g:5936:2: rule__Query1__Group_12__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query1__Group_12__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_12__3"


    // $ANTLR start "rule__Query1__Group_12__3__Impl"
    // InternalHypoMethod.g:5942:1: rule__Query1__Group_12__3__Impl : ( ( rule__Query1__End2Assignment_12_3 ) ) ;
    public final void rule__Query1__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5946:1: ( ( ( rule__Query1__End2Assignment_12_3 ) ) )
            // InternalHypoMethod.g:5947:1: ( ( rule__Query1__End2Assignment_12_3 ) )
            {
            // InternalHypoMethod.g:5947:1: ( ( rule__Query1__End2Assignment_12_3 ) )
            // InternalHypoMethod.g:5948:2: ( rule__Query1__End2Assignment_12_3 )
            {
             before(grammarAccess.getQuery1Access().getEnd2Assignment_12_3()); 
            // InternalHypoMethod.g:5949:2: ( rule__Query1__End2Assignment_12_3 )
            // InternalHypoMethod.g:5949:3: rule__Query1__End2Assignment_12_3
            {
            pushFollow(FOLLOW_2);
            rule__Query1__End2Assignment_12_3();

            state._fsp--;


            }

             after(grammarAccess.getQuery1Access().getEnd2Assignment_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Group_12__3__Impl"


    // $ANTLR start "rule__Query2__Group__0"
    // InternalHypoMethod.g:5958:1: rule__Query2__Group__0 : rule__Query2__Group__0__Impl rule__Query2__Group__1 ;
    public final void rule__Query2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5962:1: ( rule__Query2__Group__0__Impl rule__Query2__Group__1 )
            // InternalHypoMethod.g:5963:2: rule__Query2__Group__0__Impl rule__Query2__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__Query2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__0"


    // $ANTLR start "rule__Query2__Group__0__Impl"
    // InternalHypoMethod.g:5970:1: rule__Query2__Group__0__Impl : ( 'compare' ) ;
    public final void rule__Query2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5974:1: ( ( 'compare' ) )
            // InternalHypoMethod.g:5975:1: ( 'compare' )
            {
            // InternalHypoMethod.g:5975:1: ( 'compare' )
            // InternalHypoMethod.g:5976:2: 'compare'
            {
             before(grammarAccess.getQuery2Access().getCompareKeyword_0()); 
            match(input,112,FOLLOW_2); 
             after(grammarAccess.getQuery2Access().getCompareKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__0__Impl"


    // $ANTLR start "rule__Query2__Group__1"
    // InternalHypoMethod.g:5985:1: rule__Query2__Group__1 : rule__Query2__Group__1__Impl rule__Query2__Group__2 ;
    public final void rule__Query2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:5989:1: ( rule__Query2__Group__1__Impl rule__Query2__Group__2 )
            // InternalHypoMethod.g:5990:2: rule__Query2__Group__1__Impl rule__Query2__Group__2
            {
            pushFollow(FOLLOW_55);
            rule__Query2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__1"


    // $ANTLR start "rule__Query2__Group__1__Impl"
    // InternalHypoMethod.g:5997:1: rule__Query2__Group__1__Impl : ( ( rule__Query2__Function1Assignment_1 )? ) ;
    public final void rule__Query2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6001:1: ( ( ( rule__Query2__Function1Assignment_1 )? ) )
            // InternalHypoMethod.g:6002:1: ( ( rule__Query2__Function1Assignment_1 )? )
            {
            // InternalHypoMethod.g:6002:1: ( ( rule__Query2__Function1Assignment_1 )? )
            // InternalHypoMethod.g:6003:2: ( rule__Query2__Function1Assignment_1 )?
            {
             before(grammarAccess.getQuery2Access().getFunction1Assignment_1()); 
            // InternalHypoMethod.g:6004:2: ( rule__Query2__Function1Assignment_1 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=58 && LA69_0<=66)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalHypoMethod.g:6004:3: rule__Query2__Function1Assignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query2__Function1Assignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery2Access().getFunction1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__1__Impl"


    // $ANTLR start "rule__Query2__Group__2"
    // InternalHypoMethod.g:6012:1: rule__Query2__Group__2 : rule__Query2__Group__2__Impl rule__Query2__Group__3 ;
    public final void rule__Query2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6016:1: ( rule__Query2__Group__2__Impl rule__Query2__Group__3 )
            // InternalHypoMethod.g:6017:2: rule__Query2__Group__2__Impl rule__Query2__Group__3
            {
            pushFollow(FOLLOW_55);
            rule__Query2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query2__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__2"


    // $ANTLR start "rule__Query2__Group__2__Impl"
    // InternalHypoMethod.g:6024:1: rule__Query2__Group__2__Impl : ( ( rule__Query2__Response1Assignment_2 )? ) ;
    public final void rule__Query2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6028:1: ( ( ( rule__Query2__Response1Assignment_2 )? ) )
            // InternalHypoMethod.g:6029:1: ( ( rule__Query2__Response1Assignment_2 )? )
            {
            // InternalHypoMethod.g:6029:1: ( ( rule__Query2__Response1Assignment_2 )? )
            // InternalHypoMethod.g:6030:2: ( rule__Query2__Response1Assignment_2 )?
            {
             before(grammarAccess.getQuery2Access().getResponse1Assignment_2()); 
            // InternalHypoMethod.g:6031:2: ( rule__Query2__Response1Assignment_2 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalHypoMethod.g:6031:3: rule__Query2__Response1Assignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query2__Response1Assignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery2Access().getResponse1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__2__Impl"


    // $ANTLR start "rule__Query2__Group__3"
    // InternalHypoMethod.g:6039:1: rule__Query2__Group__3 : rule__Query2__Group__3__Impl rule__Query2__Group__4 ;
    public final void rule__Query2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6043:1: ( rule__Query2__Group__3__Impl rule__Query2__Group__4 )
            // InternalHypoMethod.g:6044:2: rule__Query2__Group__3__Impl rule__Query2__Group__4
            {
            pushFollow(FOLLOW_55);
            rule__Query2__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query2__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__3"


    // $ANTLR start "rule__Query2__Group__3__Impl"
    // InternalHypoMethod.g:6051:1: rule__Query2__Group__3__Impl : ( ( rule__Query2__Factor1Assignment_3 )? ) ;
    public final void rule__Query2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6055:1: ( ( ( rule__Query2__Factor1Assignment_3 )? ) )
            // InternalHypoMethod.g:6056:1: ( ( rule__Query2__Factor1Assignment_3 )? )
            {
            // InternalHypoMethod.g:6056:1: ( ( rule__Query2__Factor1Assignment_3 )? )
            // InternalHypoMethod.g:6057:2: ( rule__Query2__Factor1Assignment_3 )?
            {
             before(grammarAccess.getQuery2Access().getFactor1Assignment_3()); 
            // InternalHypoMethod.g:6058:2: ( rule__Query2__Factor1Assignment_3 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalHypoMethod.g:6058:3: rule__Query2__Factor1Assignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query2__Factor1Assignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery2Access().getFactor1Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__3__Impl"


    // $ANTLR start "rule__Query2__Group__4"
    // InternalHypoMethod.g:6066:1: rule__Query2__Group__4 : rule__Query2__Group__4__Impl rule__Query2__Group__5 ;
    public final void rule__Query2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6070:1: ( rule__Query2__Group__4__Impl rule__Query2__Group__5 )
            // InternalHypoMethod.g:6071:2: rule__Query2__Group__4__Impl rule__Query2__Group__5
            {
            pushFollow(FOLLOW_56);
            rule__Query2__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query2__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__4"


    // $ANTLR start "rule__Query2__Group__4__Impl"
    // InternalHypoMethod.g:6078:1: rule__Query2__Group__4__Impl : ( 'and' ) ;
    public final void rule__Query2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6082:1: ( ( 'and' ) )
            // InternalHypoMethod.g:6083:1: ( 'and' )
            {
            // InternalHypoMethod.g:6083:1: ( 'and' )
            // InternalHypoMethod.g:6084:2: 'and'
            {
             before(grammarAccess.getQuery2Access().getAndKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getQuery2Access().getAndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__4__Impl"


    // $ANTLR start "rule__Query2__Group__5"
    // InternalHypoMethod.g:6093:1: rule__Query2__Group__5 : rule__Query2__Group__5__Impl rule__Query2__Group__6 ;
    public final void rule__Query2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6097:1: ( rule__Query2__Group__5__Impl rule__Query2__Group__6 )
            // InternalHypoMethod.g:6098:2: rule__Query2__Group__5__Impl rule__Query2__Group__6
            {
            pushFollow(FOLLOW_56);
            rule__Query2__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query2__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__5"


    // $ANTLR start "rule__Query2__Group__5__Impl"
    // InternalHypoMethod.g:6105:1: rule__Query2__Group__5__Impl : ( ( rule__Query2__Function2Assignment_5 )? ) ;
    public final void rule__Query2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6109:1: ( ( ( rule__Query2__Function2Assignment_5 )? ) )
            // InternalHypoMethod.g:6110:1: ( ( rule__Query2__Function2Assignment_5 )? )
            {
            // InternalHypoMethod.g:6110:1: ( ( rule__Query2__Function2Assignment_5 )? )
            // InternalHypoMethod.g:6111:2: ( rule__Query2__Function2Assignment_5 )?
            {
             before(grammarAccess.getQuery2Access().getFunction2Assignment_5()); 
            // InternalHypoMethod.g:6112:2: ( rule__Query2__Function2Assignment_5 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=58 && LA72_0<=66)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalHypoMethod.g:6112:3: rule__Query2__Function2Assignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query2__Function2Assignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery2Access().getFunction2Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__5__Impl"


    // $ANTLR start "rule__Query2__Group__6"
    // InternalHypoMethod.g:6120:1: rule__Query2__Group__6 : rule__Query2__Group__6__Impl rule__Query2__Group__7 ;
    public final void rule__Query2__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6124:1: ( rule__Query2__Group__6__Impl rule__Query2__Group__7 )
            // InternalHypoMethod.g:6125:2: rule__Query2__Group__6__Impl rule__Query2__Group__7
            {
            pushFollow(FOLLOW_56);
            rule__Query2__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query2__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__6"


    // $ANTLR start "rule__Query2__Group__6__Impl"
    // InternalHypoMethod.g:6132:1: rule__Query2__Group__6__Impl : ( ( rule__Query2__Response2Assignment_6 )? ) ;
    public final void rule__Query2__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6136:1: ( ( ( rule__Query2__Response2Assignment_6 )? ) )
            // InternalHypoMethod.g:6137:1: ( ( rule__Query2__Response2Assignment_6 )? )
            {
            // InternalHypoMethod.g:6137:1: ( ( rule__Query2__Response2Assignment_6 )? )
            // InternalHypoMethod.g:6138:2: ( rule__Query2__Response2Assignment_6 )?
            {
             before(grammarAccess.getQuery2Access().getResponse2Assignment_6()); 
            // InternalHypoMethod.g:6139:2: ( rule__Query2__Response2Assignment_6 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalHypoMethod.g:6139:3: rule__Query2__Response2Assignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query2__Response2Assignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery2Access().getResponse2Assignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__6__Impl"


    // $ANTLR start "rule__Query2__Group__7"
    // InternalHypoMethod.g:6147:1: rule__Query2__Group__7 : rule__Query2__Group__7__Impl ;
    public final void rule__Query2__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6151:1: ( rule__Query2__Group__7__Impl )
            // InternalHypoMethod.g:6152:2: rule__Query2__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query2__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__7"


    // $ANTLR start "rule__Query2__Group__7__Impl"
    // InternalHypoMethod.g:6158:1: rule__Query2__Group__7__Impl : ( ( rule__Query2__Factor2Assignment_7 )? ) ;
    public final void rule__Query2__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6162:1: ( ( ( rule__Query2__Factor2Assignment_7 )? ) )
            // InternalHypoMethod.g:6163:1: ( ( rule__Query2__Factor2Assignment_7 )? )
            {
            // InternalHypoMethod.g:6163:1: ( ( rule__Query2__Factor2Assignment_7 )? )
            // InternalHypoMethod.g:6164:2: ( rule__Query2__Factor2Assignment_7 )?
            {
             before(grammarAccess.getQuery2Access().getFactor2Assignment_7()); 
            // InternalHypoMethod.g:6165:2: ( rule__Query2__Factor2Assignment_7 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalHypoMethod.g:6165:3: rule__Query2__Factor2Assignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query2__Factor2Assignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery2Access().getFactor2Assignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Group__7__Impl"


    // $ANTLR start "rule__Query3__Group__0"
    // InternalHypoMethod.g:6174:1: rule__Query3__Group__0 : rule__Query3__Group__0__Impl rule__Query3__Group__1 ;
    public final void rule__Query3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6178:1: ( rule__Query3__Group__0__Impl rule__Query3__Group__1 )
            // InternalHypoMethod.g:6179:2: rule__Query3__Group__0__Impl rule__Query3__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__Query3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group__0"


    // $ANTLR start "rule__Query3__Group__0__Impl"
    // InternalHypoMethod.g:6186:1: rule__Query3__Group__0__Impl : ( 'if' ) ;
    public final void rule__Query3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6190:1: ( ( 'if' ) )
            // InternalHypoMethod.g:6191:1: ( 'if' )
            {
            // InternalHypoMethod.g:6191:1: ( 'if' )
            // InternalHypoMethod.g:6192:2: 'if'
            {
             before(grammarAccess.getQuery3Access().getIfKeyword_0()); 
            match(input,107,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group__0__Impl"


    // $ANTLR start "rule__Query3__Group__1"
    // InternalHypoMethod.g:6201:1: rule__Query3__Group__1 : rule__Query3__Group__1__Impl rule__Query3__Group__2 ;
    public final void rule__Query3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6205:1: ( rule__Query3__Group__1__Impl rule__Query3__Group__2 )
            // InternalHypoMethod.g:6206:2: rule__Query3__Group__1__Impl rule__Query3__Group__2
            {
            pushFollow(FOLLOW_57);
            rule__Query3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group__1"


    // $ANTLR start "rule__Query3__Group__1__Impl"
    // InternalHypoMethod.g:6213:1: rule__Query3__Group__1__Impl : ( ( rule__Query3__Group_1__0 )* ) ;
    public final void rule__Query3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6217:1: ( ( ( rule__Query3__Group_1__0 )* ) )
            // InternalHypoMethod.g:6218:1: ( ( rule__Query3__Group_1__0 )* )
            {
            // InternalHypoMethod.g:6218:1: ( ( rule__Query3__Group_1__0 )* )
            // InternalHypoMethod.g:6219:2: ( rule__Query3__Group_1__0 )*
            {
             before(grammarAccess.getQuery3Access().getGroup_1()); 
            // InternalHypoMethod.g:6220:2: ( rule__Query3__Group_1__0 )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==RULE_ID||LA75_0==36) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalHypoMethod.g:6220:3: rule__Query3__Group_1__0
            	    {
            	    pushFollow(FOLLOW_58);
            	    rule__Query3__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

             after(grammarAccess.getQuery3Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group__1__Impl"


    // $ANTLR start "rule__Query3__Group__2"
    // InternalHypoMethod.g:6228:1: rule__Query3__Group__2 : rule__Query3__Group__2__Impl rule__Query3__Group__3 ;
    public final void rule__Query3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6232:1: ( rule__Query3__Group__2__Impl rule__Query3__Group__3 )
            // InternalHypoMethod.g:6233:2: rule__Query3__Group__2__Impl rule__Query3__Group__3
            {
            pushFollow(FOLLOW_59);
            rule__Query3__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group__2"


    // $ANTLR start "rule__Query3__Group__2__Impl"
    // InternalHypoMethod.g:6240:1: rule__Query3__Group__2__Impl : ( 'then' ) ;
    public final void rule__Query3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6244:1: ( ( 'then' ) )
            // InternalHypoMethod.g:6245:1: ( 'then' )
            {
            // InternalHypoMethod.g:6245:1: ( 'then' )
            // InternalHypoMethod.g:6246:2: 'then'
            {
             before(grammarAccess.getQuery3Access().getThenKeyword_2()); 
            match(input,110,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group__2__Impl"


    // $ANTLR start "rule__Query3__Group__3"
    // InternalHypoMethod.g:6255:1: rule__Query3__Group__3 : rule__Query3__Group__3__Impl rule__Query3__Group__4 ;
    public final void rule__Query3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6259:1: ( rule__Query3__Group__3__Impl rule__Query3__Group__4 )
            // InternalHypoMethod.g:6260:2: rule__Query3__Group__3__Impl rule__Query3__Group__4
            {
            pushFollow(FOLLOW_59);
            rule__Query3__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group__3"


    // $ANTLR start "rule__Query3__Group__3__Impl"
    // InternalHypoMethod.g:6267:1: rule__Query3__Group__3__Impl : ( ( rule__Query3__Group_3__0 )* ) ;
    public final void rule__Query3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6271:1: ( ( ( rule__Query3__Group_3__0 )* ) )
            // InternalHypoMethod.g:6272:1: ( ( rule__Query3__Group_3__0 )* )
            {
            // InternalHypoMethod.g:6272:1: ( ( rule__Query3__Group_3__0 )* )
            // InternalHypoMethod.g:6273:2: ( rule__Query3__Group_3__0 )*
            {
             before(grammarAccess.getQuery3Access().getGroup_3()); 
            // InternalHypoMethod.g:6274:2: ( rule__Query3__Group_3__0 )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_ID) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalHypoMethod.g:6274:3: rule__Query3__Group_3__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Query3__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

             after(grammarAccess.getQuery3Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group__3__Impl"


    // $ANTLR start "rule__Query3__Group__4"
    // InternalHypoMethod.g:6282:1: rule__Query3__Group__4 : rule__Query3__Group__4__Impl rule__Query3__Group__5 ;
    public final void rule__Query3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6286:1: ( rule__Query3__Group__4__Impl rule__Query3__Group__5 )
            // InternalHypoMethod.g:6287:2: rule__Query3__Group__4__Impl rule__Query3__Group__5
            {
            pushFollow(FOLLOW_60);
            rule__Query3__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group__4"


    // $ANTLR start "rule__Query3__Group__4__Impl"
    // InternalHypoMethod.g:6294:1: rule__Query3__Group__4__Impl : ( 'where' ) ;
    public final void rule__Query3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6298:1: ( ( 'where' ) )
            // InternalHypoMethod.g:6299:1: ( 'where' )
            {
            // InternalHypoMethod.g:6299:1: ( 'where' )
            // InternalHypoMethod.g:6300:2: 'where'
            {
             before(grammarAccess.getQuery3Access().getWhereKeyword_4()); 
            match(input,113,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getWhereKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group__4__Impl"


    // $ANTLR start "rule__Query3__Group__5"
    // InternalHypoMethod.g:6309:1: rule__Query3__Group__5 : rule__Query3__Group__5__Impl ;
    public final void rule__Query3__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6313:1: ( rule__Query3__Group__5__Impl )
            // InternalHypoMethod.g:6314:2: rule__Query3__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query3__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group__5"


    // $ANTLR start "rule__Query3__Group__5__Impl"
    // InternalHypoMethod.g:6320:1: rule__Query3__Group__5__Impl : ( ( rule__Query3__Group_5__0 )* ) ;
    public final void rule__Query3__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6324:1: ( ( ( rule__Query3__Group_5__0 )* ) )
            // InternalHypoMethod.g:6325:1: ( ( rule__Query3__Group_5__0 )* )
            {
            // InternalHypoMethod.g:6325:1: ( ( rule__Query3__Group_5__0 )* )
            // InternalHypoMethod.g:6326:2: ( rule__Query3__Group_5__0 )*
            {
             before(grammarAccess.getQuery3Access().getGroup_5()); 
            // InternalHypoMethod.g:6327:2: ( rule__Query3__Group_5__0 )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=67 && LA77_0<=69)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalHypoMethod.g:6327:3: rule__Query3__Group_5__0
            	    {
            	    pushFollow(FOLLOW_61);
            	    rule__Query3__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

             after(grammarAccess.getQuery3Access().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group__5__Impl"


    // $ANTLR start "rule__Query3__Group_1__0"
    // InternalHypoMethod.g:6336:1: rule__Query3__Group_1__0 : rule__Query3__Group_1__0__Impl rule__Query3__Group_1__1 ;
    public final void rule__Query3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6340:1: ( rule__Query3__Group_1__0__Impl rule__Query3__Group_1__1 )
            // InternalHypoMethod.g:6341:2: rule__Query3__Group_1__0__Impl rule__Query3__Group_1__1
            {
            pushFollow(FOLLOW_50);
            rule__Query3__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1__0"


    // $ANTLR start "rule__Query3__Group_1__0__Impl"
    // InternalHypoMethod.g:6348:1: rule__Query3__Group_1__0__Impl : ( ( rule__Query3__Factor1Assignment_1_0 )? ) ;
    public final void rule__Query3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6352:1: ( ( ( rule__Query3__Factor1Assignment_1_0 )? ) )
            // InternalHypoMethod.g:6353:1: ( ( rule__Query3__Factor1Assignment_1_0 )? )
            {
            // InternalHypoMethod.g:6353:1: ( ( rule__Query3__Factor1Assignment_1_0 )? )
            // InternalHypoMethod.g:6354:2: ( rule__Query3__Factor1Assignment_1_0 )?
            {
             before(grammarAccess.getQuery3Access().getFactor1Assignment_1_0()); 
            // InternalHypoMethod.g:6355:2: ( rule__Query3__Factor1Assignment_1_0 )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalHypoMethod.g:6355:3: rule__Query3__Factor1Assignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query3__Factor1Assignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery3Access().getFactor1Assignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1__0__Impl"


    // $ANTLR start "rule__Query3__Group_1__1"
    // InternalHypoMethod.g:6363:1: rule__Query3__Group_1__1 : rule__Query3__Group_1__1__Impl rule__Query3__Group_1__2 ;
    public final void rule__Query3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6367:1: ( rule__Query3__Group_1__1__Impl rule__Query3__Group_1__2 )
            // InternalHypoMethod.g:6368:2: rule__Query3__Group_1__1__Impl rule__Query3__Group_1__2
            {
            pushFollow(FOLLOW_50);
            rule__Query3__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1__1"


    // $ANTLR start "rule__Query3__Group_1__1__Impl"
    // InternalHypoMethod.g:6375:1: rule__Query3__Group_1__1__Impl : ( ( rule__Query3__Control1Assignment_1_1 )? ) ;
    public final void rule__Query3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6379:1: ( ( ( rule__Query3__Control1Assignment_1_1 )? ) )
            // InternalHypoMethod.g:6380:1: ( ( rule__Query3__Control1Assignment_1_1 )? )
            {
            // InternalHypoMethod.g:6380:1: ( ( rule__Query3__Control1Assignment_1_1 )? )
            // InternalHypoMethod.g:6381:2: ( rule__Query3__Control1Assignment_1_1 )?
            {
             before(grammarAccess.getQuery3Access().getControl1Assignment_1_1()); 
            // InternalHypoMethod.g:6382:2: ( rule__Query3__Control1Assignment_1_1 )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalHypoMethod.g:6382:3: rule__Query3__Control1Assignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query3__Control1Assignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery3Access().getControl1Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1__1__Impl"


    // $ANTLR start "rule__Query3__Group_1__2"
    // InternalHypoMethod.g:6390:1: rule__Query3__Group_1__2 : rule__Query3__Group_1__2__Impl rule__Query3__Group_1__3 ;
    public final void rule__Query3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6394:1: ( rule__Query3__Group_1__2__Impl rule__Query3__Group_1__3 )
            // InternalHypoMethod.g:6395:2: rule__Query3__Group_1__2__Impl rule__Query3__Group_1__3
            {
            pushFollow(FOLLOW_62);
            rule__Query3__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1__2"


    // $ANTLR start "rule__Query3__Group_1__2__Impl"
    // InternalHypoMethod.g:6402:1: rule__Query3__Group_1__2__Impl : ( 'is' ) ;
    public final void rule__Query3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6406:1: ( ( 'is' ) )
            // InternalHypoMethod.g:6407:1: ( 'is' )
            {
            // InternalHypoMethod.g:6407:1: ( 'is' )
            // InternalHypoMethod.g:6408:2: 'is'
            {
             before(grammarAccess.getQuery3Access().getIsKeyword_1_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getIsKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1__2__Impl"


    // $ANTLR start "rule__Query3__Group_1__3"
    // InternalHypoMethod.g:6417:1: rule__Query3__Group_1__3 : rule__Query3__Group_1__3__Impl rule__Query3__Group_1__4 ;
    public final void rule__Query3__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6421:1: ( rule__Query3__Group_1__3__Impl rule__Query3__Group_1__4 )
            // InternalHypoMethod.g:6422:2: rule__Query3__Group_1__3__Impl rule__Query3__Group_1__4
            {
            pushFollow(FOLLOW_62);
            rule__Query3__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1__3"


    // $ANTLR start "rule__Query3__Group_1__3__Impl"
    // InternalHypoMethod.g:6429:1: rule__Query3__Group_1__3__Impl : ( ( rule__Query3__Group_1_3__0 )? ) ;
    public final void rule__Query3__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6433:1: ( ( ( rule__Query3__Group_1_3__0 )? ) )
            // InternalHypoMethod.g:6434:1: ( ( rule__Query3__Group_1_3__0 )? )
            {
            // InternalHypoMethod.g:6434:1: ( ( rule__Query3__Group_1_3__0 )? )
            // InternalHypoMethod.g:6435:2: ( rule__Query3__Group_1_3__0 )?
            {
             before(grammarAccess.getQuery3Access().getGroup_1_3()); 
            // InternalHypoMethod.g:6436:2: ( rule__Query3__Group_1_3__0 )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==114) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalHypoMethod.g:6436:3: rule__Query3__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query3__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery3Access().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1__3__Impl"


    // $ANTLR start "rule__Query3__Group_1__4"
    // InternalHypoMethod.g:6444:1: rule__Query3__Group_1__4 : rule__Query3__Group_1__4__Impl rule__Query3__Group_1__5 ;
    public final void rule__Query3__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6448:1: ( rule__Query3__Group_1__4__Impl rule__Query3__Group_1__5 )
            // InternalHypoMethod.g:6449:2: rule__Query3__Group_1__4__Impl rule__Query3__Group_1__5
            {
            pushFollow(FOLLOW_62);
            rule__Query3__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1__4"


    // $ANTLR start "rule__Query3__Group_1__4__Impl"
    // InternalHypoMethod.g:6456:1: rule__Query3__Group_1__4__Impl : ( ( rule__Query3__X2Assignment_1_4 )? ) ;
    public final void rule__Query3__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6460:1: ( ( ( rule__Query3__X2Assignment_1_4 )? ) )
            // InternalHypoMethod.g:6461:1: ( ( rule__Query3__X2Assignment_1_4 )? )
            {
            // InternalHypoMethod.g:6461:1: ( ( rule__Query3__X2Assignment_1_4 )? )
            // InternalHypoMethod.g:6462:2: ( rule__Query3__X2Assignment_1_4 )?
            {
             before(grammarAccess.getQuery3Access().getX2Assignment_1_4()); 
            // InternalHypoMethod.g:6463:2: ( rule__Query3__X2Assignment_1_4 )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_RANGEVALUE) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalHypoMethod.g:6463:3: rule__Query3__X2Assignment_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query3__X2Assignment_1_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery3Access().getX2Assignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1__4__Impl"


    // $ANTLR start "rule__Query3__Group_1__5"
    // InternalHypoMethod.g:6471:1: rule__Query3__Group_1__5 : rule__Query3__Group_1__5__Impl ;
    public final void rule__Query3__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6475:1: ( rule__Query3__Group_1__5__Impl )
            // InternalHypoMethod.g:6476:2: rule__Query3__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query3__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1__5"


    // $ANTLR start "rule__Query3__Group_1__5__Impl"
    // InternalHypoMethod.g:6482:1: rule__Query3__Group_1__5__Impl : ( ( 'and' )? ) ;
    public final void rule__Query3__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6486:1: ( ( ( 'and' )? ) )
            // InternalHypoMethod.g:6487:1: ( ( 'and' )? )
            {
            // InternalHypoMethod.g:6487:1: ( ( 'and' )? )
            // InternalHypoMethod.g:6488:2: ( 'and' )?
            {
             before(grammarAccess.getQuery3Access().getAndKeyword_1_5()); 
            // InternalHypoMethod.g:6489:2: ( 'and' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==51) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalHypoMethod.g:6489:3: 'and'
                    {
                    match(input,51,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQuery3Access().getAndKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1__5__Impl"


    // $ANTLR start "rule__Query3__Group_1_3__0"
    // InternalHypoMethod.g:6498:1: rule__Query3__Group_1_3__0 : rule__Query3__Group_1_3__0__Impl rule__Query3__Group_1_3__1 ;
    public final void rule__Query3__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6502:1: ( rule__Query3__Group_1_3__0__Impl rule__Query3__Group_1_3__1 )
            // InternalHypoMethod.g:6503:2: rule__Query3__Group_1_3__0__Impl rule__Query3__Group_1_3__1
            {
            pushFollow(FOLLOW_63);
            rule__Query3__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1_3__0"


    // $ANTLR start "rule__Query3__Group_1_3__0__Impl"
    // InternalHypoMethod.g:6510:1: rule__Query3__Group_1_3__0__Impl : ( 'at' ) ;
    public final void rule__Query3__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6514:1: ( ( 'at' ) )
            // InternalHypoMethod.g:6515:1: ( 'at' )
            {
            // InternalHypoMethod.g:6515:1: ( 'at' )
            // InternalHypoMethod.g:6516:2: 'at'
            {
             before(grammarAccess.getQuery3Access().getAtKeyword_1_3_0()); 
            match(input,114,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getAtKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1_3__0__Impl"


    // $ANTLR start "rule__Query3__Group_1_3__1"
    // InternalHypoMethod.g:6525:1: rule__Query3__Group_1_3__1 : rule__Query3__Group_1_3__1__Impl rule__Query3__Group_1_3__2 ;
    public final void rule__Query3__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6529:1: ( rule__Query3__Group_1_3__1__Impl rule__Query3__Group_1_3__2 )
            // InternalHypoMethod.g:6530:2: rule__Query3__Group_1_3__1__Impl rule__Query3__Group_1_3__2
            {
            pushFollow(FOLLOW_60);
            rule__Query3__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1_3__1"


    // $ANTLR start "rule__Query3__Group_1_3__1__Impl"
    // InternalHypoMethod.g:6537:1: rule__Query3__Group_1_3__1__Impl : ( 'level' ) ;
    public final void rule__Query3__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6541:1: ( ( 'level' ) )
            // InternalHypoMethod.g:6542:1: ( 'level' )
            {
            // InternalHypoMethod.g:6542:1: ( 'level' )
            // InternalHypoMethod.g:6543:2: 'level'
            {
             before(grammarAccess.getQuery3Access().getLevelKeyword_1_3_1()); 
            match(input,115,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getLevelKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1_3__1__Impl"


    // $ANTLR start "rule__Query3__Group_1_3__2"
    // InternalHypoMethod.g:6552:1: rule__Query3__Group_1_3__2 : rule__Query3__Group_1_3__2__Impl ;
    public final void rule__Query3__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6556:1: ( rule__Query3__Group_1_3__2__Impl )
            // InternalHypoMethod.g:6557:2: rule__Query3__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query3__Group_1_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1_3__2"


    // $ANTLR start "rule__Query3__Group_1_3__2__Impl"
    // InternalHypoMethod.g:6563:1: rule__Query3__Group_1_3__2__Impl : ( ( rule__Query3__Level2Assignment_1_3_2 ) ) ;
    public final void rule__Query3__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6567:1: ( ( ( rule__Query3__Level2Assignment_1_3_2 ) ) )
            // InternalHypoMethod.g:6568:1: ( ( rule__Query3__Level2Assignment_1_3_2 ) )
            {
            // InternalHypoMethod.g:6568:1: ( ( rule__Query3__Level2Assignment_1_3_2 ) )
            // InternalHypoMethod.g:6569:2: ( rule__Query3__Level2Assignment_1_3_2 )
            {
             before(grammarAccess.getQuery3Access().getLevel2Assignment_1_3_2()); 
            // InternalHypoMethod.g:6570:2: ( rule__Query3__Level2Assignment_1_3_2 )
            // InternalHypoMethod.g:6570:3: rule__Query3__Level2Assignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Query3__Level2Assignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getQuery3Access().getLevel2Assignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_1_3__2__Impl"


    // $ANTLR start "rule__Query3__Group_3__0"
    // InternalHypoMethod.g:6579:1: rule__Query3__Group_3__0 : rule__Query3__Group_3__0__Impl rule__Query3__Group_3__1 ;
    public final void rule__Query3__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6583:1: ( rule__Query3__Group_3__0__Impl rule__Query3__Group_3__1 )
            // InternalHypoMethod.g:6584:2: rule__Query3__Group_3__0__Impl rule__Query3__Group_3__1
            {
            pushFollow(FOLLOW_52);
            rule__Query3__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3__0"


    // $ANTLR start "rule__Query3__Group_3__0__Impl"
    // InternalHypoMethod.g:6591:1: rule__Query3__Group_3__0__Impl : ( ( rule__Query3__Response1Assignment_3_0 ) ) ;
    public final void rule__Query3__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6595:1: ( ( ( rule__Query3__Response1Assignment_3_0 ) ) )
            // InternalHypoMethod.g:6596:1: ( ( rule__Query3__Response1Assignment_3_0 ) )
            {
            // InternalHypoMethod.g:6596:1: ( ( rule__Query3__Response1Assignment_3_0 ) )
            // InternalHypoMethod.g:6597:2: ( rule__Query3__Response1Assignment_3_0 )
            {
             before(grammarAccess.getQuery3Access().getResponse1Assignment_3_0()); 
            // InternalHypoMethod.g:6598:2: ( rule__Query3__Response1Assignment_3_0 )
            // InternalHypoMethod.g:6598:3: rule__Query3__Response1Assignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Query3__Response1Assignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getQuery3Access().getResponse1Assignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3__0__Impl"


    // $ANTLR start "rule__Query3__Group_3__1"
    // InternalHypoMethod.g:6606:1: rule__Query3__Group_3__1 : rule__Query3__Group_3__1__Impl rule__Query3__Group_3__2 ;
    public final void rule__Query3__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6610:1: ( rule__Query3__Group_3__1__Impl rule__Query3__Group_3__2 )
            // InternalHypoMethod.g:6611:2: rule__Query3__Group_3__1__Impl rule__Query3__Group_3__2
            {
            pushFollow(FOLLOW_62);
            rule__Query3__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3__1"


    // $ANTLR start "rule__Query3__Group_3__1__Impl"
    // InternalHypoMethod.g:6618:1: rule__Query3__Group_3__1__Impl : ( 'is' ) ;
    public final void rule__Query3__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6622:1: ( ( 'is' ) )
            // InternalHypoMethod.g:6623:1: ( 'is' )
            {
            // InternalHypoMethod.g:6623:1: ( 'is' )
            // InternalHypoMethod.g:6624:2: 'is'
            {
             before(grammarAccess.getQuery3Access().getIsKeyword_3_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getIsKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3__1__Impl"


    // $ANTLR start "rule__Query3__Group_3__2"
    // InternalHypoMethod.g:6633:1: rule__Query3__Group_3__2 : rule__Query3__Group_3__2__Impl rule__Query3__Group_3__3 ;
    public final void rule__Query3__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6637:1: ( rule__Query3__Group_3__2__Impl rule__Query3__Group_3__3 )
            // InternalHypoMethod.g:6638:2: rule__Query3__Group_3__2__Impl rule__Query3__Group_3__3
            {
            pushFollow(FOLLOW_62);
            rule__Query3__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3__2"


    // $ANTLR start "rule__Query3__Group_3__2__Impl"
    // InternalHypoMethod.g:6645:1: rule__Query3__Group_3__2__Impl : ( ( rule__Query3__Group_3_2__0 )? ) ;
    public final void rule__Query3__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6649:1: ( ( ( rule__Query3__Group_3_2__0 )? ) )
            // InternalHypoMethod.g:6650:1: ( ( rule__Query3__Group_3_2__0 )? )
            {
            // InternalHypoMethod.g:6650:1: ( ( rule__Query3__Group_3_2__0 )? )
            // InternalHypoMethod.g:6651:2: ( rule__Query3__Group_3_2__0 )?
            {
             before(grammarAccess.getQuery3Access().getGroup_3_2()); 
            // InternalHypoMethod.g:6652:2: ( rule__Query3__Group_3_2__0 )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==114) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalHypoMethod.g:6652:3: rule__Query3__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query3__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery3Access().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3__2__Impl"


    // $ANTLR start "rule__Query3__Group_3__3"
    // InternalHypoMethod.g:6660:1: rule__Query3__Group_3__3 : rule__Query3__Group_3__3__Impl rule__Query3__Group_3__4 ;
    public final void rule__Query3__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6664:1: ( rule__Query3__Group_3__3__Impl rule__Query3__Group_3__4 )
            // InternalHypoMethod.g:6665:2: rule__Query3__Group_3__3__Impl rule__Query3__Group_3__4
            {
            pushFollow(FOLLOW_62);
            rule__Query3__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3__3"


    // $ANTLR start "rule__Query3__Group_3__3__Impl"
    // InternalHypoMethod.g:6672:1: rule__Query3__Group_3__3__Impl : ( ( rule__Query3__X4Assignment_3_3 )? ) ;
    public final void rule__Query3__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6676:1: ( ( ( rule__Query3__X4Assignment_3_3 )? ) )
            // InternalHypoMethod.g:6677:1: ( ( rule__Query3__X4Assignment_3_3 )? )
            {
            // InternalHypoMethod.g:6677:1: ( ( rule__Query3__X4Assignment_3_3 )? )
            // InternalHypoMethod.g:6678:2: ( rule__Query3__X4Assignment_3_3 )?
            {
             before(grammarAccess.getQuery3Access().getX4Assignment_3_3()); 
            // InternalHypoMethod.g:6679:2: ( rule__Query3__X4Assignment_3_3 )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_RANGEVALUE) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalHypoMethod.g:6679:3: rule__Query3__X4Assignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query3__X4Assignment_3_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery3Access().getX4Assignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3__3__Impl"


    // $ANTLR start "rule__Query3__Group_3__4"
    // InternalHypoMethod.g:6687:1: rule__Query3__Group_3__4 : rule__Query3__Group_3__4__Impl ;
    public final void rule__Query3__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6691:1: ( rule__Query3__Group_3__4__Impl )
            // InternalHypoMethod.g:6692:2: rule__Query3__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query3__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3__4"


    // $ANTLR start "rule__Query3__Group_3__4__Impl"
    // InternalHypoMethod.g:6698:1: rule__Query3__Group_3__4__Impl : ( ( 'and' )? ) ;
    public final void rule__Query3__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6702:1: ( ( ( 'and' )? ) )
            // InternalHypoMethod.g:6703:1: ( ( 'and' )? )
            {
            // InternalHypoMethod.g:6703:1: ( ( 'and' )? )
            // InternalHypoMethod.g:6704:2: ( 'and' )?
            {
             before(grammarAccess.getQuery3Access().getAndKeyword_3_4()); 
            // InternalHypoMethod.g:6705:2: ( 'and' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==51) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalHypoMethod.g:6705:3: 'and'
                    {
                    match(input,51,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQuery3Access().getAndKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3__4__Impl"


    // $ANTLR start "rule__Query3__Group_3_2__0"
    // InternalHypoMethod.g:6714:1: rule__Query3__Group_3_2__0 : rule__Query3__Group_3_2__0__Impl rule__Query3__Group_3_2__1 ;
    public final void rule__Query3__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6718:1: ( rule__Query3__Group_3_2__0__Impl rule__Query3__Group_3_2__1 )
            // InternalHypoMethod.g:6719:2: rule__Query3__Group_3_2__0__Impl rule__Query3__Group_3_2__1
            {
            pushFollow(FOLLOW_63);
            rule__Query3__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3_2__0"


    // $ANTLR start "rule__Query3__Group_3_2__0__Impl"
    // InternalHypoMethod.g:6726:1: rule__Query3__Group_3_2__0__Impl : ( 'at' ) ;
    public final void rule__Query3__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6730:1: ( ( 'at' ) )
            // InternalHypoMethod.g:6731:1: ( 'at' )
            {
            // InternalHypoMethod.g:6731:1: ( 'at' )
            // InternalHypoMethod.g:6732:2: 'at'
            {
             before(grammarAccess.getQuery3Access().getAtKeyword_3_2_0()); 
            match(input,114,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getAtKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3_2__0__Impl"


    // $ANTLR start "rule__Query3__Group_3_2__1"
    // InternalHypoMethod.g:6741:1: rule__Query3__Group_3_2__1 : rule__Query3__Group_3_2__1__Impl rule__Query3__Group_3_2__2 ;
    public final void rule__Query3__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6745:1: ( rule__Query3__Group_3_2__1__Impl rule__Query3__Group_3_2__2 )
            // InternalHypoMethod.g:6746:2: rule__Query3__Group_3_2__1__Impl rule__Query3__Group_3_2__2
            {
            pushFollow(FOLLOW_60);
            rule__Query3__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_3_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3_2__1"


    // $ANTLR start "rule__Query3__Group_3_2__1__Impl"
    // InternalHypoMethod.g:6753:1: rule__Query3__Group_3_2__1__Impl : ( 'level' ) ;
    public final void rule__Query3__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6757:1: ( ( 'level' ) )
            // InternalHypoMethod.g:6758:1: ( 'level' )
            {
            // InternalHypoMethod.g:6758:1: ( 'level' )
            // InternalHypoMethod.g:6759:2: 'level'
            {
             before(grammarAccess.getQuery3Access().getLevelKeyword_3_2_1()); 
            match(input,115,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getLevelKeyword_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3_2__1__Impl"


    // $ANTLR start "rule__Query3__Group_3_2__2"
    // InternalHypoMethod.g:6768:1: rule__Query3__Group_3_2__2 : rule__Query3__Group_3_2__2__Impl ;
    public final void rule__Query3__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6772:1: ( rule__Query3__Group_3_2__2__Impl )
            // InternalHypoMethod.g:6773:2: rule__Query3__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query3__Group_3_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3_2__2"


    // $ANTLR start "rule__Query3__Group_3_2__2__Impl"
    // InternalHypoMethod.g:6779:1: rule__Query3__Group_3_2__2__Impl : ( ( rule__Query3__Level4Assignment_3_2_2 ) ) ;
    public final void rule__Query3__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6783:1: ( ( ( rule__Query3__Level4Assignment_3_2_2 ) ) )
            // InternalHypoMethod.g:6784:1: ( ( rule__Query3__Level4Assignment_3_2_2 ) )
            {
            // InternalHypoMethod.g:6784:1: ( ( rule__Query3__Level4Assignment_3_2_2 ) )
            // InternalHypoMethod.g:6785:2: ( rule__Query3__Level4Assignment_3_2_2 )
            {
             before(grammarAccess.getQuery3Access().getLevel4Assignment_3_2_2()); 
            // InternalHypoMethod.g:6786:2: ( rule__Query3__Level4Assignment_3_2_2 )
            // InternalHypoMethod.g:6786:3: rule__Query3__Level4Assignment_3_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Query3__Level4Assignment_3_2_2();

            state._fsp--;


            }

             after(grammarAccess.getQuery3Access().getLevel4Assignment_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_3_2__2__Impl"


    // $ANTLR start "rule__Query3__Group_5__0"
    // InternalHypoMethod.g:6795:1: rule__Query3__Group_5__0 : rule__Query3__Group_5__0__Impl rule__Query3__Group_5__1 ;
    public final void rule__Query3__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6799:1: ( rule__Query3__Group_5__0__Impl rule__Query3__Group_5__1 )
            // InternalHypoMethod.g:6800:2: rule__Query3__Group_5__0__Impl rule__Query3__Group_5__1
            {
            pushFollow(FOLLOW_64);
            rule__Query3__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__0"


    // $ANTLR start "rule__Query3__Group_5__0__Impl"
    // InternalHypoMethod.g:6807:1: rule__Query3__Group_5__0__Impl : ( ( rule__Query3__LevelAssignment_5_0 ) ) ;
    public final void rule__Query3__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6811:1: ( ( ( rule__Query3__LevelAssignment_5_0 ) ) )
            // InternalHypoMethod.g:6812:1: ( ( rule__Query3__LevelAssignment_5_0 ) )
            {
            // InternalHypoMethod.g:6812:1: ( ( rule__Query3__LevelAssignment_5_0 ) )
            // InternalHypoMethod.g:6813:2: ( rule__Query3__LevelAssignment_5_0 )
            {
             before(grammarAccess.getQuery3Access().getLevelAssignment_5_0()); 
            // InternalHypoMethod.g:6814:2: ( rule__Query3__LevelAssignment_5_0 )
            // InternalHypoMethod.g:6814:3: rule__Query3__LevelAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Query3__LevelAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getQuery3Access().getLevelAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__0__Impl"


    // $ANTLR start "rule__Query3__Group_5__1"
    // InternalHypoMethod.g:6822:1: rule__Query3__Group_5__1 : rule__Query3__Group_5__1__Impl rule__Query3__Group_5__2 ;
    public final void rule__Query3__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6826:1: ( rule__Query3__Group_5__1__Impl rule__Query3__Group_5__2 )
            // InternalHypoMethod.g:6827:2: rule__Query3__Group_5__1__Impl rule__Query3__Group_5__2
            {
            pushFollow(FOLLOW_50);
            rule__Query3__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__1"


    // $ANTLR start "rule__Query3__Group_5__1__Impl"
    // InternalHypoMethod.g:6834:1: rule__Query3__Group_5__1__Impl : ( 'for' ) ;
    public final void rule__Query3__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6838:1: ( ( 'for' ) )
            // InternalHypoMethod.g:6839:1: ( 'for' )
            {
            // InternalHypoMethod.g:6839:1: ( 'for' )
            // InternalHypoMethod.g:6840:2: 'for'
            {
             before(grammarAccess.getQuery3Access().getForKeyword_5_1()); 
            match(input,116,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getForKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__1__Impl"


    // $ANTLR start "rule__Query3__Group_5__2"
    // InternalHypoMethod.g:6849:1: rule__Query3__Group_5__2 : rule__Query3__Group_5__2__Impl rule__Query3__Group_5__3 ;
    public final void rule__Query3__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6853:1: ( rule__Query3__Group_5__2__Impl rule__Query3__Group_5__3 )
            // InternalHypoMethod.g:6854:2: rule__Query3__Group_5__2__Impl rule__Query3__Group_5__3
            {
            pushFollow(FOLLOW_50);
            rule__Query3__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__2"


    // $ANTLR start "rule__Query3__Group_5__2__Impl"
    // InternalHypoMethod.g:6861:1: rule__Query3__Group_5__2__Impl : ( ( rule__Query3__FactorAssignment_5_2 )? ) ;
    public final void rule__Query3__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6865:1: ( ( ( rule__Query3__FactorAssignment_5_2 )? ) )
            // InternalHypoMethod.g:6866:1: ( ( rule__Query3__FactorAssignment_5_2 )? )
            {
            // InternalHypoMethod.g:6866:1: ( ( rule__Query3__FactorAssignment_5_2 )? )
            // InternalHypoMethod.g:6867:2: ( rule__Query3__FactorAssignment_5_2 )?
            {
             before(grammarAccess.getQuery3Access().getFactorAssignment_5_2()); 
            // InternalHypoMethod.g:6868:2: ( rule__Query3__FactorAssignment_5_2 )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalHypoMethod.g:6868:3: rule__Query3__FactorAssignment_5_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query3__FactorAssignment_5_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery3Access().getFactorAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__2__Impl"


    // $ANTLR start "rule__Query3__Group_5__3"
    // InternalHypoMethod.g:6876:1: rule__Query3__Group_5__3 : rule__Query3__Group_5__3__Impl rule__Query3__Group_5__4 ;
    public final void rule__Query3__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6880:1: ( rule__Query3__Group_5__3__Impl rule__Query3__Group_5__4 )
            // InternalHypoMethod.g:6881:2: rule__Query3__Group_5__3__Impl rule__Query3__Group_5__4
            {
            pushFollow(FOLLOW_50);
            rule__Query3__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__3"


    // $ANTLR start "rule__Query3__Group_5__3__Impl"
    // InternalHypoMethod.g:6888:1: rule__Query3__Group_5__3__Impl : ( ( rule__Query3__ControlAssignment_5_3 )? ) ;
    public final void rule__Query3__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6892:1: ( ( ( rule__Query3__ControlAssignment_5_3 )? ) )
            // InternalHypoMethod.g:6893:1: ( ( rule__Query3__ControlAssignment_5_3 )? )
            {
            // InternalHypoMethod.g:6893:1: ( ( rule__Query3__ControlAssignment_5_3 )? )
            // InternalHypoMethod.g:6894:2: ( rule__Query3__ControlAssignment_5_3 )?
            {
             before(grammarAccess.getQuery3Access().getControlAssignment_5_3()); 
            // InternalHypoMethod.g:6895:2: ( rule__Query3__ControlAssignment_5_3 )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalHypoMethod.g:6895:3: rule__Query3__ControlAssignment_5_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query3__ControlAssignment_5_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery3Access().getControlAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__3__Impl"


    // $ANTLR start "rule__Query3__Group_5__4"
    // InternalHypoMethod.g:6903:1: rule__Query3__Group_5__4 : rule__Query3__Group_5__4__Impl rule__Query3__Group_5__5 ;
    public final void rule__Query3__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6907:1: ( rule__Query3__Group_5__4__Impl rule__Query3__Group_5__5 )
            // InternalHypoMethod.g:6908:2: rule__Query3__Group_5__4__Impl rule__Query3__Group_5__5
            {
            pushFollow(FOLLOW_50);
            rule__Query3__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__4"


    // $ANTLR start "rule__Query3__Group_5__4__Impl"
    // InternalHypoMethod.g:6915:1: rule__Query3__Group_5__4__Impl : ( ( rule__Query3__ResponseAssignment_5_4 )? ) ;
    public final void rule__Query3__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6919:1: ( ( ( rule__Query3__ResponseAssignment_5_4 )? ) )
            // InternalHypoMethod.g:6920:1: ( ( rule__Query3__ResponseAssignment_5_4 )? )
            {
            // InternalHypoMethod.g:6920:1: ( ( rule__Query3__ResponseAssignment_5_4 )? )
            // InternalHypoMethod.g:6921:2: ( rule__Query3__ResponseAssignment_5_4 )?
            {
             before(grammarAccess.getQuery3Access().getResponseAssignment_5_4()); 
            // InternalHypoMethod.g:6922:2: ( rule__Query3__ResponseAssignment_5_4 )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalHypoMethod.g:6922:3: rule__Query3__ResponseAssignment_5_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query3__ResponseAssignment_5_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuery3Access().getResponseAssignment_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__4__Impl"


    // $ANTLR start "rule__Query3__Group_5__5"
    // InternalHypoMethod.g:6930:1: rule__Query3__Group_5__5 : rule__Query3__Group_5__5__Impl rule__Query3__Group_5__6 ;
    public final void rule__Query3__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6934:1: ( rule__Query3__Group_5__5__Impl rule__Query3__Group_5__6 )
            // InternalHypoMethod.g:6935:2: rule__Query3__Group_5__5__Impl rule__Query3__Group_5__6
            {
            pushFollow(FOLLOW_65);
            rule__Query3__Group_5__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_5__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__5"


    // $ANTLR start "rule__Query3__Group_5__5__Impl"
    // InternalHypoMethod.g:6942:1: rule__Query3__Group_5__5__Impl : ( 'is' ) ;
    public final void rule__Query3__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6946:1: ( ( 'is' ) )
            // InternalHypoMethod.g:6947:1: ( 'is' )
            {
            // InternalHypoMethod.g:6947:1: ( 'is' )
            // InternalHypoMethod.g:6948:2: 'is'
            {
             before(grammarAccess.getQuery3Access().getIsKeyword_5_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getIsKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__5__Impl"


    // $ANTLR start "rule__Query3__Group_5__6"
    // InternalHypoMethod.g:6957:1: rule__Query3__Group_5__6 : rule__Query3__Group_5__6__Impl rule__Query3__Group_5__7 ;
    public final void rule__Query3__Group_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6961:1: ( rule__Query3__Group_5__6__Impl rule__Query3__Group_5__7 )
            // InternalHypoMethod.g:6962:2: rule__Query3__Group_5__6__Impl rule__Query3__Group_5__7
            {
            pushFollow(FOLLOW_43);
            rule__Query3__Group_5__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_5__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__6"


    // $ANTLR start "rule__Query3__Group_5__6__Impl"
    // InternalHypoMethod.g:6969:1: rule__Query3__Group_5__6__Impl : ( 'in the range' ) ;
    public final void rule__Query3__Group_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6973:1: ( ( 'in the range' ) )
            // InternalHypoMethod.g:6974:1: ( 'in the range' )
            {
            // InternalHypoMethod.g:6974:1: ( 'in the range' )
            // InternalHypoMethod.g:6975:2: 'in the range'
            {
             before(grammarAccess.getQuery3Access().getInTheRangeKeyword_5_6()); 
            match(input,111,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getInTheRangeKeyword_5_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__6__Impl"


    // $ANTLR start "rule__Query3__Group_5__7"
    // InternalHypoMethod.g:6984:1: rule__Query3__Group_5__7 : rule__Query3__Group_5__7__Impl rule__Query3__Group_5__8 ;
    public final void rule__Query3__Group_5__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:6988:1: ( rule__Query3__Group_5__7__Impl rule__Query3__Group_5__8 )
            // InternalHypoMethod.g:6989:2: rule__Query3__Group_5__7__Impl rule__Query3__Group_5__8
            {
            pushFollow(FOLLOW_54);
            rule__Query3__Group_5__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_5__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__7"


    // $ANTLR start "rule__Query3__Group_5__7__Impl"
    // InternalHypoMethod.g:6996:1: rule__Query3__Group_5__7__Impl : ( ( rule__Query3__Start1Assignment_5_7 ) ) ;
    public final void rule__Query3__Group_5__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7000:1: ( ( ( rule__Query3__Start1Assignment_5_7 ) ) )
            // InternalHypoMethod.g:7001:1: ( ( rule__Query3__Start1Assignment_5_7 ) )
            {
            // InternalHypoMethod.g:7001:1: ( ( rule__Query3__Start1Assignment_5_7 ) )
            // InternalHypoMethod.g:7002:2: ( rule__Query3__Start1Assignment_5_7 )
            {
             before(grammarAccess.getQuery3Access().getStart1Assignment_5_7()); 
            // InternalHypoMethod.g:7003:2: ( rule__Query3__Start1Assignment_5_7 )
            // InternalHypoMethod.g:7003:3: rule__Query3__Start1Assignment_5_7
            {
            pushFollow(FOLLOW_2);
            rule__Query3__Start1Assignment_5_7();

            state._fsp--;


            }

             after(grammarAccess.getQuery3Access().getStart1Assignment_5_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__7__Impl"


    // $ANTLR start "rule__Query3__Group_5__8"
    // InternalHypoMethod.g:7011:1: rule__Query3__Group_5__8 : rule__Query3__Group_5__8__Impl rule__Query3__Group_5__9 ;
    public final void rule__Query3__Group_5__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7015:1: ( rule__Query3__Group_5__8__Impl rule__Query3__Group_5__9 )
            // InternalHypoMethod.g:7016:2: rule__Query3__Group_5__8__Impl rule__Query3__Group_5__9
            {
            pushFollow(FOLLOW_43);
            rule__Query3__Group_5__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query3__Group_5__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__8"


    // $ANTLR start "rule__Query3__Group_5__8__Impl"
    // InternalHypoMethod.g:7023:1: rule__Query3__Group_5__8__Impl : ( 'to' ) ;
    public final void rule__Query3__Group_5__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7027:1: ( ( 'to' ) )
            // InternalHypoMethod.g:7028:1: ( 'to' )
            {
            // InternalHypoMethod.g:7028:1: ( 'to' )
            // InternalHypoMethod.g:7029:2: 'to'
            {
             before(grammarAccess.getQuery3Access().getToKeyword_5_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getToKeyword_5_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__8__Impl"


    // $ANTLR start "rule__Query3__Group_5__9"
    // InternalHypoMethod.g:7038:1: rule__Query3__Group_5__9 : rule__Query3__Group_5__9__Impl ;
    public final void rule__Query3__Group_5__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7042:1: ( rule__Query3__Group_5__9__Impl )
            // InternalHypoMethod.g:7043:2: rule__Query3__Group_5__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query3__Group_5__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__9"


    // $ANTLR start "rule__Query3__Group_5__9__Impl"
    // InternalHypoMethod.g:7049:1: rule__Query3__Group_5__9__Impl : ( ( rule__Query3__End1Assignment_5_9 ) ) ;
    public final void rule__Query3__Group_5__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7053:1: ( ( ( rule__Query3__End1Assignment_5_9 ) ) )
            // InternalHypoMethod.g:7054:1: ( ( rule__Query3__End1Assignment_5_9 ) )
            {
            // InternalHypoMethod.g:7054:1: ( ( rule__Query3__End1Assignment_5_9 ) )
            // InternalHypoMethod.g:7055:2: ( rule__Query3__End1Assignment_5_9 )
            {
             before(grammarAccess.getQuery3Access().getEnd1Assignment_5_9()); 
            // InternalHypoMethod.g:7056:2: ( rule__Query3__End1Assignment_5_9 )
            // InternalHypoMethod.g:7056:3: rule__Query3__End1Assignment_5_9
            {
            pushFollow(FOLLOW_2);
            rule__Query3__End1Assignment_5_9();

            state._fsp--;


            }

             after(grammarAccess.getQuery3Access().getEnd1Assignment_5_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Group_5__9__Impl"


    // $ANTLR start "rule__Experiment__Group__0"
    // InternalHypoMethod.g:7065:1: rule__Experiment__Group__0 : rule__Experiment__Group__0__Impl rule__Experiment__Group__1 ;
    public final void rule__Experiment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7069:1: ( rule__Experiment__Group__0__Impl rule__Experiment__Group__1 )
            // InternalHypoMethod.g:7070:2: rule__Experiment__Group__0__Impl rule__Experiment__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Experiment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__0"


    // $ANTLR start "rule__Experiment__Group__0__Impl"
    // InternalHypoMethod.g:7077:1: rule__Experiment__Group__0__Impl : ( 'experiment' ) ;
    public final void rule__Experiment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7081:1: ( ( 'experiment' ) )
            // InternalHypoMethod.g:7082:1: ( 'experiment' )
            {
            // InternalHypoMethod.g:7082:1: ( 'experiment' )
            // InternalHypoMethod.g:7083:2: 'experiment'
            {
             before(grammarAccess.getExperimentAccess().getExperimentKeyword_0()); 
            match(input,117,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getExperimentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__0__Impl"


    // $ANTLR start "rule__Experiment__Group__1"
    // InternalHypoMethod.g:7092:1: rule__Experiment__Group__1 : rule__Experiment__Group__1__Impl rule__Experiment__Group__2 ;
    public final void rule__Experiment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7096:1: ( rule__Experiment__Group__1__Impl rule__Experiment__Group__2 )
            // InternalHypoMethod.g:7097:2: rule__Experiment__Group__1__Impl rule__Experiment__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Experiment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__1"


    // $ANTLR start "rule__Experiment__Group__1__Impl"
    // InternalHypoMethod.g:7104:1: rule__Experiment__Group__1__Impl : ( ( rule__Experiment__ExpNameAssignment_1 ) ) ;
    public final void rule__Experiment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7108:1: ( ( ( rule__Experiment__ExpNameAssignment_1 ) ) )
            // InternalHypoMethod.g:7109:1: ( ( rule__Experiment__ExpNameAssignment_1 ) )
            {
            // InternalHypoMethod.g:7109:1: ( ( rule__Experiment__ExpNameAssignment_1 ) )
            // InternalHypoMethod.g:7110:2: ( rule__Experiment__ExpNameAssignment_1 )
            {
             before(grammarAccess.getExperimentAccess().getExpNameAssignment_1()); 
            // InternalHypoMethod.g:7111:2: ( rule__Experiment__ExpNameAssignment_1 )
            // InternalHypoMethod.g:7111:3: rule__Experiment__ExpNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__ExpNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getExpNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__1__Impl"


    // $ANTLR start "rule__Experiment__Group__2"
    // InternalHypoMethod.g:7119:1: rule__Experiment__Group__2 : rule__Experiment__Group__2__Impl rule__Experiment__Group__3 ;
    public final void rule__Experiment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7123:1: ( rule__Experiment__Group__2__Impl rule__Experiment__Group__3 )
            // InternalHypoMethod.g:7124:2: rule__Experiment__Group__2__Impl rule__Experiment__Group__3
            {
            pushFollow(FOLLOW_66);
            rule__Experiment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__2"


    // $ANTLR start "rule__Experiment__Group__2__Impl"
    // InternalHypoMethod.g:7131:1: rule__Experiment__Group__2__Impl : ( '{' ) ;
    public final void rule__Experiment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7135:1: ( ( '{' ) )
            // InternalHypoMethod.g:7136:1: ( '{' )
            {
            // InternalHypoMethod.g:7136:1: ( '{' )
            // InternalHypoMethod.g:7137:2: '{'
            {
             before(grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__2__Impl"


    // $ANTLR start "rule__Experiment__Group__3"
    // InternalHypoMethod.g:7146:1: rule__Experiment__Group__3 : rule__Experiment__Group__3__Impl rule__Experiment__Group__4 ;
    public final void rule__Experiment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7150:1: ( rule__Experiment__Group__3__Impl rule__Experiment__Group__4 )
            // InternalHypoMethod.g:7151:2: rule__Experiment__Group__3__Impl rule__Experiment__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Experiment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__3"


    // $ANTLR start "rule__Experiment__Group__3__Impl"
    // InternalHypoMethod.g:7158:1: rule__Experiment__Group__3__Impl : ( 'design' ) ;
    public final void rule__Experiment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7162:1: ( ( 'design' ) )
            // InternalHypoMethod.g:7163:1: ( 'design' )
            {
            // InternalHypoMethod.g:7163:1: ( 'design' )
            // InternalHypoMethod.g:7164:2: 'design'
            {
             before(grammarAccess.getExperimentAccess().getDesignKeyword_3()); 
            match(input,118,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getDesignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__3__Impl"


    // $ANTLR start "rule__Experiment__Group__4"
    // InternalHypoMethod.g:7173:1: rule__Experiment__Group__4 : rule__Experiment__Group__4__Impl rule__Experiment__Group__5 ;
    public final void rule__Experiment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7177:1: ( rule__Experiment__Group__4__Impl rule__Experiment__Group__5 )
            // InternalHypoMethod.g:7178:2: rule__Experiment__Group__4__Impl rule__Experiment__Group__5
            {
            pushFollow(FOLLOW_67);
            rule__Experiment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__4"


    // $ANTLR start "rule__Experiment__Group__4__Impl"
    // InternalHypoMethod.g:7185:1: rule__Experiment__Group__4__Impl : ( ( rule__Experiment__ExpDesignAssignment_4 ) ) ;
    public final void rule__Experiment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7189:1: ( ( ( rule__Experiment__ExpDesignAssignment_4 ) ) )
            // InternalHypoMethod.g:7190:1: ( ( rule__Experiment__ExpDesignAssignment_4 ) )
            {
            // InternalHypoMethod.g:7190:1: ( ( rule__Experiment__ExpDesignAssignment_4 ) )
            // InternalHypoMethod.g:7191:2: ( rule__Experiment__ExpDesignAssignment_4 )
            {
             before(grammarAccess.getExperimentAccess().getExpDesignAssignment_4()); 
            // InternalHypoMethod.g:7192:2: ( rule__Experiment__ExpDesignAssignment_4 )
            // InternalHypoMethod.g:7192:3: rule__Experiment__ExpDesignAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__ExpDesignAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getExpDesignAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__4__Impl"


    // $ANTLR start "rule__Experiment__Group__5"
    // InternalHypoMethod.g:7200:1: rule__Experiment__Group__5 : rule__Experiment__Group__5__Impl rule__Experiment__Group__6 ;
    public final void rule__Experiment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7204:1: ( rule__Experiment__Group__5__Impl rule__Experiment__Group__6 )
            // InternalHypoMethod.g:7205:2: rule__Experiment__Group__5__Impl rule__Experiment__Group__6
            {
            pushFollow(FOLLOW_52);
            rule__Experiment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__5"


    // $ANTLR start "rule__Experiment__Group__5__Impl"
    // InternalHypoMethod.g:7212:1: rule__Experiment__Group__5__Impl : ( 'performance measure' ) ;
    public final void rule__Experiment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7216:1: ( ( 'performance measure' ) )
            // InternalHypoMethod.g:7217:1: ( 'performance measure' )
            {
            // InternalHypoMethod.g:7217:1: ( 'performance measure' )
            // InternalHypoMethod.g:7218:2: 'performance measure'
            {
             before(grammarAccess.getExperimentAccess().getPerformanceMeasureKeyword_5()); 
            match(input,119,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getPerformanceMeasureKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__5__Impl"


    // $ANTLR start "rule__Experiment__Group__6"
    // InternalHypoMethod.g:7227:1: rule__Experiment__Group__6 : rule__Experiment__Group__6__Impl rule__Experiment__Group__7 ;
    public final void rule__Experiment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7231:1: ( rule__Experiment__Group__6__Impl rule__Experiment__Group__7 )
            // InternalHypoMethod.g:7232:2: rule__Experiment__Group__6__Impl rule__Experiment__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Experiment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__6"


    // $ANTLR start "rule__Experiment__Group__6__Impl"
    // InternalHypoMethod.g:7239:1: rule__Experiment__Group__6__Impl : ( 'is' ) ;
    public final void rule__Experiment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7243:1: ( ( 'is' ) )
            // InternalHypoMethod.g:7244:1: ( 'is' )
            {
            // InternalHypoMethod.g:7244:1: ( 'is' )
            // InternalHypoMethod.g:7245:2: 'is'
            {
             before(grammarAccess.getExperimentAccess().getIsKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getIsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__6__Impl"


    // $ANTLR start "rule__Experiment__Group__7"
    // InternalHypoMethod.g:7254:1: rule__Experiment__Group__7 : rule__Experiment__Group__7__Impl rule__Experiment__Group__8 ;
    public final void rule__Experiment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7258:1: ( rule__Experiment__Group__7__Impl rule__Experiment__Group__8 )
            // InternalHypoMethod.g:7259:2: rule__Experiment__Group__7__Impl rule__Experiment__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Experiment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__7"


    // $ANTLR start "rule__Experiment__Group__7__Impl"
    // InternalHypoMethod.g:7266:1: rule__Experiment__Group__7__Impl : ( ( rule__Experiment__PerfMeasureAssignment_7 ) ) ;
    public final void rule__Experiment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7270:1: ( ( ( rule__Experiment__PerfMeasureAssignment_7 ) ) )
            // InternalHypoMethod.g:7271:1: ( ( rule__Experiment__PerfMeasureAssignment_7 ) )
            {
            // InternalHypoMethod.g:7271:1: ( ( rule__Experiment__PerfMeasureAssignment_7 ) )
            // InternalHypoMethod.g:7272:2: ( rule__Experiment__PerfMeasureAssignment_7 )
            {
             before(grammarAccess.getExperimentAccess().getPerfMeasureAssignment_7()); 
            // InternalHypoMethod.g:7273:2: ( rule__Experiment__PerfMeasureAssignment_7 )
            // InternalHypoMethod.g:7273:3: rule__Experiment__PerfMeasureAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__PerfMeasureAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getPerfMeasureAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__7__Impl"


    // $ANTLR start "rule__Experiment__Group__8"
    // InternalHypoMethod.g:7281:1: rule__Experiment__Group__8 : rule__Experiment__Group__8__Impl ;
    public final void rule__Experiment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7285:1: ( rule__Experiment__Group__8__Impl )
            // InternalHypoMethod.g:7286:2: rule__Experiment__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__8"


    // $ANTLR start "rule__Experiment__Group__8__Impl"
    // InternalHypoMethod.g:7292:1: rule__Experiment__Group__8__Impl : ( '}' ) ;
    public final void rule__Experiment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7296:1: ( ( '}' ) )
            // InternalHypoMethod.g:7297:1: ( '}' )
            {
            // InternalHypoMethod.g:7297:1: ( '}' )
            // InternalHypoMethod.g:7298:2: '}'
            {
             before(grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__8__Impl"


    // $ANTLR start "rule__Design__Group__0"
    // InternalHypoMethod.g:7308:1: rule__Design__Group__0 : rule__Design__Group__0__Impl rule__Design__Group__1 ;
    public final void rule__Design__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7312:1: ( rule__Design__Group__0__Impl rule__Design__Group__1 )
            // InternalHypoMethod.g:7313:2: rule__Design__Group__0__Impl rule__Design__Group__1
            {
            pushFollow(FOLLOW_68);
            rule__Design__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Design__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group__0"


    // $ANTLR start "rule__Design__Group__0__Impl"
    // InternalHypoMethod.g:7320:1: rule__Design__Group__0__Impl : ( '{' ) ;
    public final void rule__Design__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7324:1: ( ( '{' ) )
            // InternalHypoMethod.g:7325:1: ( '{' )
            {
            // InternalHypoMethod.g:7325:1: ( '{' )
            // InternalHypoMethod.g:7326:2: '{'
            {
             before(grammarAccess.getDesignAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getDesignAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group__0__Impl"


    // $ANTLR start "rule__Design__Group__1"
    // InternalHypoMethod.g:7335:1: rule__Design__Group__1 : rule__Design__Group__1__Impl rule__Design__Group__2 ;
    public final void rule__Design__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7339:1: ( rule__Design__Group__1__Impl rule__Design__Group__2 )
            // InternalHypoMethod.g:7340:2: rule__Design__Group__1__Impl rule__Design__Group__2
            {
            pushFollow(FOLLOW_68);
            rule__Design__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Design__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group__1"


    // $ANTLR start "rule__Design__Group__1__Impl"
    // InternalHypoMethod.g:7347:1: rule__Design__Group__1__Impl : ( ( rule__Design__Group_1__0 )? ) ;
    public final void rule__Design__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7351:1: ( ( ( rule__Design__Group_1__0 )? ) )
            // InternalHypoMethod.g:7352:1: ( ( rule__Design__Group_1__0 )? )
            {
            // InternalHypoMethod.g:7352:1: ( ( rule__Design__Group_1__0 )? )
            // InternalHypoMethod.g:7353:2: ( rule__Design__Group_1__0 )?
            {
             before(grammarAccess.getDesignAccess().getGroup_1()); 
            // InternalHypoMethod.g:7354:2: ( rule__Design__Group_1__0 )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==120) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalHypoMethod.g:7354:3: rule__Design__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Design__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDesignAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group__1__Impl"


    // $ANTLR start "rule__Design__Group__2"
    // InternalHypoMethod.g:7362:1: rule__Design__Group__2 : rule__Design__Group__2__Impl rule__Design__Group__3 ;
    public final void rule__Design__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7366:1: ( rule__Design__Group__2__Impl rule__Design__Group__3 )
            // InternalHypoMethod.g:7367:2: rule__Design__Group__2__Impl rule__Design__Group__3
            {
            pushFollow(FOLLOW_68);
            rule__Design__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Design__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group__2"


    // $ANTLR start "rule__Design__Group__2__Impl"
    // InternalHypoMethod.g:7374:1: rule__Design__Group__2__Impl : ( ( rule__Design__Group_2__0 )* ) ;
    public final void rule__Design__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7378:1: ( ( ( rule__Design__Group_2__0 )* ) )
            // InternalHypoMethod.g:7379:1: ( ( rule__Design__Group_2__0 )* )
            {
            // InternalHypoMethod.g:7379:1: ( ( rule__Design__Group_2__0 )* )
            // InternalHypoMethod.g:7380:2: ( rule__Design__Group_2__0 )*
            {
             before(grammarAccess.getDesignAccess().getGroup_2()); 
            // InternalHypoMethod.g:7381:2: ( rule__Design__Group_2__0 )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==121) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalHypoMethod.g:7381:3: rule__Design__Group_2__0
            	    {
            	    pushFollow(FOLLOW_69);
            	    rule__Design__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

             after(grammarAccess.getDesignAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group__2__Impl"


    // $ANTLR start "rule__Design__Group__3"
    // InternalHypoMethod.g:7389:1: rule__Design__Group__3 : rule__Design__Group__3__Impl rule__Design__Group__4 ;
    public final void rule__Design__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7393:1: ( rule__Design__Group__3__Impl rule__Design__Group__4 )
            // InternalHypoMethod.g:7394:2: rule__Design__Group__3__Impl rule__Design__Group__4
            {
            pushFollow(FOLLOW_68);
            rule__Design__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Design__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group__3"


    // $ANTLR start "rule__Design__Group__3__Impl"
    // InternalHypoMethod.g:7401:1: rule__Design__Group__3__Impl : ( ( rule__Design__IterationAssignment_3 )? ) ;
    public final void rule__Design__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7405:1: ( ( ( rule__Design__IterationAssignment_3 )? ) )
            // InternalHypoMethod.g:7406:1: ( ( rule__Design__IterationAssignment_3 )? )
            {
            // InternalHypoMethod.g:7406:1: ( ( rule__Design__IterationAssignment_3 )? )
            // InternalHypoMethod.g:7407:2: ( rule__Design__IterationAssignment_3 )?
            {
             before(grammarAccess.getDesignAccess().getIterationAssignment_3()); 
            // InternalHypoMethod.g:7408:2: ( rule__Design__IterationAssignment_3 )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==129) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalHypoMethod.g:7408:3: rule__Design__IterationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Design__IterationAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDesignAccess().getIterationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group__3__Impl"


    // $ANTLR start "rule__Design__Group__4"
    // InternalHypoMethod.g:7416:1: rule__Design__Group__4 : rule__Design__Group__4__Impl rule__Design__Group__5 ;
    public final void rule__Design__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7420:1: ( rule__Design__Group__4__Impl rule__Design__Group__5 )
            // InternalHypoMethod.g:7421:2: rule__Design__Group__4__Impl rule__Design__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Design__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Design__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group__4"


    // $ANTLR start "rule__Design__Group__4__Impl"
    // InternalHypoMethod.g:7428:1: rule__Design__Group__4__Impl : ( ( rule__Design__Group_4__0 ) ) ;
    public final void rule__Design__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7432:1: ( ( ( rule__Design__Group_4__0 ) ) )
            // InternalHypoMethod.g:7433:1: ( ( rule__Design__Group_4__0 ) )
            {
            // InternalHypoMethod.g:7433:1: ( ( rule__Design__Group_4__0 ) )
            // InternalHypoMethod.g:7434:2: ( rule__Design__Group_4__0 )
            {
             before(grammarAccess.getDesignAccess().getGroup_4()); 
            // InternalHypoMethod.g:7435:2: ( rule__Design__Group_4__0 )
            // InternalHypoMethod.g:7435:3: rule__Design__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Design__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getDesignAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group__4__Impl"


    // $ANTLR start "rule__Design__Group__5"
    // InternalHypoMethod.g:7443:1: rule__Design__Group__5 : rule__Design__Group__5__Impl ;
    public final void rule__Design__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7447:1: ( rule__Design__Group__5__Impl )
            // InternalHypoMethod.g:7448:2: rule__Design__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Design__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group__5"


    // $ANTLR start "rule__Design__Group__5__Impl"
    // InternalHypoMethod.g:7454:1: rule__Design__Group__5__Impl : ( '}' ) ;
    public final void rule__Design__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7458:1: ( ( '}' ) )
            // InternalHypoMethod.g:7459:1: ( '}' )
            {
            // InternalHypoMethod.g:7459:1: ( '}' )
            // InternalHypoMethod.g:7460:2: '}'
            {
             before(grammarAccess.getDesignAccess().getRightCurlyBracketKeyword_5()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getDesignAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group__5__Impl"


    // $ANTLR start "rule__Design__Group_1__0"
    // InternalHypoMethod.g:7470:1: rule__Design__Group_1__0 : rule__Design__Group_1__0__Impl rule__Design__Group_1__1 ;
    public final void rule__Design__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7474:1: ( rule__Design__Group_1__0__Impl rule__Design__Group_1__1 )
            // InternalHypoMethod.g:7475:2: rule__Design__Group_1__0__Impl rule__Design__Group_1__1
            {
            pushFollow(FOLLOW_70);
            rule__Design__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Design__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group_1__0"


    // $ANTLR start "rule__Design__Group_1__0__Impl"
    // InternalHypoMethod.g:7482:1: rule__Design__Group_1__0__Impl : ( 'designType' ) ;
    public final void rule__Design__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7486:1: ( ( 'designType' ) )
            // InternalHypoMethod.g:7487:1: ( 'designType' )
            {
            // InternalHypoMethod.g:7487:1: ( 'designType' )
            // InternalHypoMethod.g:7488:2: 'designType'
            {
             before(grammarAccess.getDesignAccess().getDesignTypeKeyword_1_0()); 
            match(input,120,FOLLOW_2); 
             after(grammarAccess.getDesignAccess().getDesignTypeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group_1__0__Impl"


    // $ANTLR start "rule__Design__Group_1__1"
    // InternalHypoMethod.g:7497:1: rule__Design__Group_1__1 : rule__Design__Group_1__1__Impl ;
    public final void rule__Design__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7501:1: ( rule__Design__Group_1__1__Impl )
            // InternalHypoMethod.g:7502:2: rule__Design__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Design__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group_1__1"


    // $ANTLR start "rule__Design__Group_1__1__Impl"
    // InternalHypoMethod.g:7508:1: rule__Design__Group_1__1__Impl : ( ( rule__Design__DesignTypeAssignment_1_1 ) ) ;
    public final void rule__Design__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7512:1: ( ( ( rule__Design__DesignTypeAssignment_1_1 ) ) )
            // InternalHypoMethod.g:7513:1: ( ( rule__Design__DesignTypeAssignment_1_1 ) )
            {
            // InternalHypoMethod.g:7513:1: ( ( rule__Design__DesignTypeAssignment_1_1 ) )
            // InternalHypoMethod.g:7514:2: ( rule__Design__DesignTypeAssignment_1_1 )
            {
             before(grammarAccess.getDesignAccess().getDesignTypeAssignment_1_1()); 
            // InternalHypoMethod.g:7515:2: ( rule__Design__DesignTypeAssignment_1_1 )
            // InternalHypoMethod.g:7515:3: rule__Design__DesignTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Design__DesignTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDesignAccess().getDesignTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group_1__1__Impl"


    // $ANTLR start "rule__Design__Group_2__0"
    // InternalHypoMethod.g:7524:1: rule__Design__Group_2__0 : rule__Design__Group_2__0__Impl rule__Design__Group_2__1 ;
    public final void rule__Design__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7528:1: ( rule__Design__Group_2__0__Impl rule__Design__Group_2__1 )
            // InternalHypoMethod.g:7529:2: rule__Design__Group_2__0__Impl rule__Design__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Design__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Design__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group_2__0"


    // $ANTLR start "rule__Design__Group_2__0__Impl"
    // InternalHypoMethod.g:7536:1: rule__Design__Group_2__0__Impl : ( 'constraints' ) ;
    public final void rule__Design__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7540:1: ( ( 'constraints' ) )
            // InternalHypoMethod.g:7541:1: ( 'constraints' )
            {
            // InternalHypoMethod.g:7541:1: ( 'constraints' )
            // InternalHypoMethod.g:7542:2: 'constraints'
            {
             before(grammarAccess.getDesignAccess().getConstraintsKeyword_2_0()); 
            match(input,121,FOLLOW_2); 
             after(grammarAccess.getDesignAccess().getConstraintsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group_2__0__Impl"


    // $ANTLR start "rule__Design__Group_2__1"
    // InternalHypoMethod.g:7551:1: rule__Design__Group_2__1 : rule__Design__Group_2__1__Impl ;
    public final void rule__Design__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7555:1: ( rule__Design__Group_2__1__Impl )
            // InternalHypoMethod.g:7556:2: rule__Design__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Design__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group_2__1"


    // $ANTLR start "rule__Design__Group_2__1__Impl"
    // InternalHypoMethod.g:7562:1: rule__Design__Group_2__1__Impl : ( ( rule__Design__ConstraintAssignment_2_1 ) ) ;
    public final void rule__Design__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7566:1: ( ( ( rule__Design__ConstraintAssignment_2_1 ) ) )
            // InternalHypoMethod.g:7567:1: ( ( rule__Design__ConstraintAssignment_2_1 ) )
            {
            // InternalHypoMethod.g:7567:1: ( ( rule__Design__ConstraintAssignment_2_1 ) )
            // InternalHypoMethod.g:7568:2: ( rule__Design__ConstraintAssignment_2_1 )
            {
             before(grammarAccess.getDesignAccess().getConstraintAssignment_2_1()); 
            // InternalHypoMethod.g:7569:2: ( rule__Design__ConstraintAssignment_2_1 )
            // InternalHypoMethod.g:7569:3: rule__Design__ConstraintAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Design__ConstraintAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDesignAccess().getConstraintAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group_2__1__Impl"


    // $ANTLR start "rule__Design__Group_4__0"
    // InternalHypoMethod.g:7578:1: rule__Design__Group_4__0 : rule__Design__Group_4__0__Impl rule__Design__Group_4__1 ;
    public final void rule__Design__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7582:1: ( rule__Design__Group_4__0__Impl rule__Design__Group_4__1 )
            // InternalHypoMethod.g:7583:2: rule__Design__Group_4__0__Impl rule__Design__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Design__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Design__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group_4__0"


    // $ANTLR start "rule__Design__Group_4__0__Impl"
    // InternalHypoMethod.g:7590:1: rule__Design__Group_4__0__Impl : ( 'variables' ) ;
    public final void rule__Design__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7594:1: ( ( 'variables' ) )
            // InternalHypoMethod.g:7595:1: ( 'variables' )
            {
            // InternalHypoMethod.g:7595:1: ( 'variables' )
            // InternalHypoMethod.g:7596:2: 'variables'
            {
             before(grammarAccess.getDesignAccess().getVariablesKeyword_4_0()); 
            match(input,122,FOLLOW_2); 
             after(grammarAccess.getDesignAccess().getVariablesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group_4__0__Impl"


    // $ANTLR start "rule__Design__Group_4__1"
    // InternalHypoMethod.g:7605:1: rule__Design__Group_4__1 : rule__Design__Group_4__1__Impl ;
    public final void rule__Design__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7609:1: ( rule__Design__Group_4__1__Impl )
            // InternalHypoMethod.g:7610:2: rule__Design__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Design__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group_4__1"


    // $ANTLR start "rule__Design__Group_4__1__Impl"
    // InternalHypoMethod.g:7616:1: rule__Design__Group_4__1__Impl : ( ( rule__Design__VariablesAssignment_4_1 ) ) ;
    public final void rule__Design__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7620:1: ( ( ( rule__Design__VariablesAssignment_4_1 ) ) )
            // InternalHypoMethod.g:7621:1: ( ( rule__Design__VariablesAssignment_4_1 ) )
            {
            // InternalHypoMethod.g:7621:1: ( ( rule__Design__VariablesAssignment_4_1 ) )
            // InternalHypoMethod.g:7622:2: ( rule__Design__VariablesAssignment_4_1 )
            {
             before(grammarAccess.getDesignAccess().getVariablesAssignment_4_1()); 
            // InternalHypoMethod.g:7623:2: ( rule__Design__VariablesAssignment_4_1 )
            // InternalHypoMethod.g:7623:3: rule__Design__VariablesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Design__VariablesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDesignAccess().getVariablesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__Group_4__1__Impl"


    // $ANTLR start "rule__Variables__Group__0"
    // InternalHypoMethod.g:7632:1: rule__Variables__Group__0 : rule__Variables__Group__0__Impl rule__Variables__Group__1 ;
    public final void rule__Variables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7636:1: ( rule__Variables__Group__0__Impl rule__Variables__Group__1 )
            // InternalHypoMethod.g:7637:2: rule__Variables__Group__0__Impl rule__Variables__Group__1
            {
            pushFollow(FOLLOW_71);
            rule__Variables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__0"


    // $ANTLR start "rule__Variables__Group__0__Impl"
    // InternalHypoMethod.g:7644:1: rule__Variables__Group__0__Impl : ( '{' ) ;
    public final void rule__Variables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7648:1: ( ( '{' ) )
            // InternalHypoMethod.g:7649:1: ( '{' )
            {
            // InternalHypoMethod.g:7649:1: ( '{' )
            // InternalHypoMethod.g:7650:2: '{'
            {
             before(grammarAccess.getVariablesAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__0__Impl"


    // $ANTLR start "rule__Variables__Group__1"
    // InternalHypoMethod.g:7659:1: rule__Variables__Group__1 : rule__Variables__Group__1__Impl rule__Variables__Group__2 ;
    public final void rule__Variables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7663:1: ( rule__Variables__Group__1__Impl rule__Variables__Group__2 )
            // InternalHypoMethod.g:7664:2: rule__Variables__Group__1__Impl rule__Variables__Group__2
            {
            pushFollow(FOLLOW_72);
            rule__Variables__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__1"


    // $ANTLR start "rule__Variables__Group__1__Impl"
    // InternalHypoMethod.g:7671:1: rule__Variables__Group__1__Impl : ( ( rule__Variables__IndependentVariablesAssignment_1 ) ) ;
    public final void rule__Variables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7675:1: ( ( ( rule__Variables__IndependentVariablesAssignment_1 ) ) )
            // InternalHypoMethod.g:7676:1: ( ( rule__Variables__IndependentVariablesAssignment_1 ) )
            {
            // InternalHypoMethod.g:7676:1: ( ( rule__Variables__IndependentVariablesAssignment_1 ) )
            // InternalHypoMethod.g:7677:2: ( rule__Variables__IndependentVariablesAssignment_1 )
            {
             before(grammarAccess.getVariablesAccess().getIndependentVariablesAssignment_1()); 
            // InternalHypoMethod.g:7678:2: ( rule__Variables__IndependentVariablesAssignment_1 )
            // InternalHypoMethod.g:7678:3: rule__Variables__IndependentVariablesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variables__IndependentVariablesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariablesAccess().getIndependentVariablesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__1__Impl"


    // $ANTLR start "rule__Variables__Group__2"
    // InternalHypoMethod.g:7686:1: rule__Variables__Group__2 : rule__Variables__Group__2__Impl rule__Variables__Group__3 ;
    public final void rule__Variables__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7690:1: ( rule__Variables__Group__2__Impl rule__Variables__Group__3 )
            // InternalHypoMethod.g:7691:2: rule__Variables__Group__2__Impl rule__Variables__Group__3
            {
            pushFollow(FOLLOW_72);
            rule__Variables__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__2"


    // $ANTLR start "rule__Variables__Group__2__Impl"
    // InternalHypoMethod.g:7698:1: rule__Variables__Group__2__Impl : ( ( rule__Variables__ControlVariablesAssignment_2 )? ) ;
    public final void rule__Variables__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7702:1: ( ( ( rule__Variables__ControlVariablesAssignment_2 )? ) )
            // InternalHypoMethod.g:7703:1: ( ( rule__Variables__ControlVariablesAssignment_2 )? )
            {
            // InternalHypoMethod.g:7703:1: ( ( rule__Variables__ControlVariablesAssignment_2 )? )
            // InternalHypoMethod.g:7704:2: ( rule__Variables__ControlVariablesAssignment_2 )?
            {
             before(grammarAccess.getVariablesAccess().getControlVariablesAssignment_2()); 
            // InternalHypoMethod.g:7705:2: ( rule__Variables__ControlVariablesAssignment_2 )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==124) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalHypoMethod.g:7705:3: rule__Variables__ControlVariablesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variables__ControlVariablesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariablesAccess().getControlVariablesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__2__Impl"


    // $ANTLR start "rule__Variables__Group__3"
    // InternalHypoMethod.g:7713:1: rule__Variables__Group__3 : rule__Variables__Group__3__Impl rule__Variables__Group__4 ;
    public final void rule__Variables__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7717:1: ( rule__Variables__Group__3__Impl rule__Variables__Group__4 )
            // InternalHypoMethod.g:7718:2: rule__Variables__Group__3__Impl rule__Variables__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Variables__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__3"


    // $ANTLR start "rule__Variables__Group__3__Impl"
    // InternalHypoMethod.g:7725:1: rule__Variables__Group__3__Impl : ( ( rule__Variables__DependentVariablesAssignment_3 ) ) ;
    public final void rule__Variables__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7729:1: ( ( ( rule__Variables__DependentVariablesAssignment_3 ) ) )
            // InternalHypoMethod.g:7730:1: ( ( rule__Variables__DependentVariablesAssignment_3 ) )
            {
            // InternalHypoMethod.g:7730:1: ( ( rule__Variables__DependentVariablesAssignment_3 ) )
            // InternalHypoMethod.g:7731:2: ( rule__Variables__DependentVariablesAssignment_3 )
            {
             before(grammarAccess.getVariablesAccess().getDependentVariablesAssignment_3()); 
            // InternalHypoMethod.g:7732:2: ( rule__Variables__DependentVariablesAssignment_3 )
            // InternalHypoMethod.g:7732:3: rule__Variables__DependentVariablesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variables__DependentVariablesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariablesAccess().getDependentVariablesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__3__Impl"


    // $ANTLR start "rule__Variables__Group__4"
    // InternalHypoMethod.g:7740:1: rule__Variables__Group__4 : rule__Variables__Group__4__Impl ;
    public final void rule__Variables__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7744:1: ( rule__Variables__Group__4__Impl )
            // InternalHypoMethod.g:7745:2: rule__Variables__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variables__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__4"


    // $ANTLR start "rule__Variables__Group__4__Impl"
    // InternalHypoMethod.g:7751:1: rule__Variables__Group__4__Impl : ( '}' ) ;
    public final void rule__Variables__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7755:1: ( ( '}' ) )
            // InternalHypoMethod.g:7756:1: ( '}' )
            {
            // InternalHypoMethod.g:7756:1: ( '}' )
            // InternalHypoMethod.g:7757:2: '}'
            {
             before(grammarAccess.getVariablesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__4__Impl"


    // $ANTLR start "rule__IndependentVariables__Group__0"
    // InternalHypoMethod.g:7767:1: rule__IndependentVariables__Group__0 : rule__IndependentVariables__Group__0__Impl rule__IndependentVariables__Group__1 ;
    public final void rule__IndependentVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7771:1: ( rule__IndependentVariables__Group__0__Impl rule__IndependentVariables__Group__1 )
            // InternalHypoMethod.g:7772:2: rule__IndependentVariables__Group__0__Impl rule__IndependentVariables__Group__1
            {
            pushFollow(FOLLOW_73);
            rule__IndependentVariables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndependentVariables__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndependentVariables__Group__0"


    // $ANTLR start "rule__IndependentVariables__Group__0__Impl"
    // InternalHypoMethod.g:7779:1: rule__IndependentVariables__Group__0__Impl : ( 'independent' ) ;
    public final void rule__IndependentVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7783:1: ( ( 'independent' ) )
            // InternalHypoMethod.g:7784:1: ( 'independent' )
            {
            // InternalHypoMethod.g:7784:1: ( 'independent' )
            // InternalHypoMethod.g:7785:2: 'independent'
            {
             before(grammarAccess.getIndependentVariablesAccess().getIndependentKeyword_0()); 
            match(input,123,FOLLOW_2); 
             after(grammarAccess.getIndependentVariablesAccess().getIndependentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndependentVariables__Group__0__Impl"


    // $ANTLR start "rule__IndependentVariables__Group__1"
    // InternalHypoMethod.g:7794:1: rule__IndependentVariables__Group__1 : rule__IndependentVariables__Group__1__Impl rule__IndependentVariables__Group__2 ;
    public final void rule__IndependentVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7798:1: ( rule__IndependentVariables__Group__1__Impl rule__IndependentVariables__Group__2 )
            // InternalHypoMethod.g:7799:2: rule__IndependentVariables__Group__1__Impl rule__IndependentVariables__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__IndependentVariables__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndependentVariables__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndependentVariables__Group__1"


    // $ANTLR start "rule__IndependentVariables__Group__1__Impl"
    // InternalHypoMethod.g:7806:1: rule__IndependentVariables__Group__1__Impl : ( 'variables' ) ;
    public final void rule__IndependentVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7810:1: ( ( 'variables' ) )
            // InternalHypoMethod.g:7811:1: ( 'variables' )
            {
            // InternalHypoMethod.g:7811:1: ( 'variables' )
            // InternalHypoMethod.g:7812:2: 'variables'
            {
             before(grammarAccess.getIndependentVariablesAccess().getVariablesKeyword_1()); 
            match(input,122,FOLLOW_2); 
             after(grammarAccess.getIndependentVariablesAccess().getVariablesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndependentVariables__Group__1__Impl"


    // $ANTLR start "rule__IndependentVariables__Group__2"
    // InternalHypoMethod.g:7821:1: rule__IndependentVariables__Group__2 : rule__IndependentVariables__Group__2__Impl rule__IndependentVariables__Group__3 ;
    public final void rule__IndependentVariables__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7825:1: ( rule__IndependentVariables__Group__2__Impl rule__IndependentVariables__Group__3 )
            // InternalHypoMethod.g:7826:2: rule__IndependentVariables__Group__2__Impl rule__IndependentVariables__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__IndependentVariables__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndependentVariables__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndependentVariables__Group__2"


    // $ANTLR start "rule__IndependentVariables__Group__2__Impl"
    // InternalHypoMethod.g:7833:1: rule__IndependentVariables__Group__2__Impl : ( '{' ) ;
    public final void rule__IndependentVariables__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7837:1: ( ( '{' ) )
            // InternalHypoMethod.g:7838:1: ( '{' )
            {
            // InternalHypoMethod.g:7838:1: ( '{' )
            // InternalHypoMethod.g:7839:2: '{'
            {
             before(grammarAccess.getIndependentVariablesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getIndependentVariablesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndependentVariables__Group__2__Impl"


    // $ANTLR start "rule__IndependentVariables__Group__3"
    // InternalHypoMethod.g:7848:1: rule__IndependentVariables__Group__3 : rule__IndependentVariables__Group__3__Impl rule__IndependentVariables__Group__4 ;
    public final void rule__IndependentVariables__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7852:1: ( rule__IndependentVariables__Group__3__Impl rule__IndependentVariables__Group__4 )
            // InternalHypoMethod.g:7853:2: rule__IndependentVariables__Group__3__Impl rule__IndependentVariables__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__IndependentVariables__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndependentVariables__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndependentVariables__Group__3"


    // $ANTLR start "rule__IndependentVariables__Group__3__Impl"
    // InternalHypoMethod.g:7860:1: rule__IndependentVariables__Group__3__Impl : ( ( rule__IndependentVariables__VariablesAssignment_3 )* ) ;
    public final void rule__IndependentVariables__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7864:1: ( ( ( rule__IndependentVariables__VariablesAssignment_3 )* ) )
            // InternalHypoMethod.g:7865:1: ( ( rule__IndependentVariables__VariablesAssignment_3 )* )
            {
            // InternalHypoMethod.g:7865:1: ( ( rule__IndependentVariables__VariablesAssignment_3 )* )
            // InternalHypoMethod.g:7866:2: ( rule__IndependentVariables__VariablesAssignment_3 )*
            {
             before(grammarAccess.getIndependentVariablesAccess().getVariablesAssignment_3()); 
            // InternalHypoMethod.g:7867:2: ( rule__IndependentVariables__VariablesAssignment_3 )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==RULE_ID) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalHypoMethod.g:7867:3: rule__IndependentVariables__VariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__IndependentVariables__VariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

             after(grammarAccess.getIndependentVariablesAccess().getVariablesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndependentVariables__Group__3__Impl"


    // $ANTLR start "rule__IndependentVariables__Group__4"
    // InternalHypoMethod.g:7875:1: rule__IndependentVariables__Group__4 : rule__IndependentVariables__Group__4__Impl ;
    public final void rule__IndependentVariables__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7879:1: ( rule__IndependentVariables__Group__4__Impl )
            // InternalHypoMethod.g:7880:2: rule__IndependentVariables__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndependentVariables__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndependentVariables__Group__4"


    // $ANTLR start "rule__IndependentVariables__Group__4__Impl"
    // InternalHypoMethod.g:7886:1: rule__IndependentVariables__Group__4__Impl : ( '}' ) ;
    public final void rule__IndependentVariables__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7890:1: ( ( '}' ) )
            // InternalHypoMethod.g:7891:1: ( '}' )
            {
            // InternalHypoMethod.g:7891:1: ( '}' )
            // InternalHypoMethod.g:7892:2: '}'
            {
             before(grammarAccess.getIndependentVariablesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getIndependentVariablesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndependentVariables__Group__4__Impl"


    // $ANTLR start "rule__ControlVariables__Group__0"
    // InternalHypoMethod.g:7902:1: rule__ControlVariables__Group__0 : rule__ControlVariables__Group__0__Impl rule__ControlVariables__Group__1 ;
    public final void rule__ControlVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7906:1: ( rule__ControlVariables__Group__0__Impl rule__ControlVariables__Group__1 )
            // InternalHypoMethod.g:7907:2: rule__ControlVariables__Group__0__Impl rule__ControlVariables__Group__1
            {
            pushFollow(FOLLOW_73);
            rule__ControlVariables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group__0"


    // $ANTLR start "rule__ControlVariables__Group__0__Impl"
    // InternalHypoMethod.g:7914:1: rule__ControlVariables__Group__0__Impl : ( 'control' ) ;
    public final void rule__ControlVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7918:1: ( ( 'control' ) )
            // InternalHypoMethod.g:7919:1: ( 'control' )
            {
            // InternalHypoMethod.g:7919:1: ( 'control' )
            // InternalHypoMethod.g:7920:2: 'control'
            {
             before(grammarAccess.getControlVariablesAccess().getControlKeyword_0()); 
            match(input,124,FOLLOW_2); 
             after(grammarAccess.getControlVariablesAccess().getControlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group__0__Impl"


    // $ANTLR start "rule__ControlVariables__Group__1"
    // InternalHypoMethod.g:7929:1: rule__ControlVariables__Group__1 : rule__ControlVariables__Group__1__Impl rule__ControlVariables__Group__2 ;
    public final void rule__ControlVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7933:1: ( rule__ControlVariables__Group__1__Impl rule__ControlVariables__Group__2 )
            // InternalHypoMethod.g:7934:2: rule__ControlVariables__Group__1__Impl rule__ControlVariables__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ControlVariables__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group__1"


    // $ANTLR start "rule__ControlVariables__Group__1__Impl"
    // InternalHypoMethod.g:7941:1: rule__ControlVariables__Group__1__Impl : ( 'variables' ) ;
    public final void rule__ControlVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7945:1: ( ( 'variables' ) )
            // InternalHypoMethod.g:7946:1: ( 'variables' )
            {
            // InternalHypoMethod.g:7946:1: ( 'variables' )
            // InternalHypoMethod.g:7947:2: 'variables'
            {
             before(grammarAccess.getControlVariablesAccess().getVariablesKeyword_1()); 
            match(input,122,FOLLOW_2); 
             after(grammarAccess.getControlVariablesAccess().getVariablesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group__1__Impl"


    // $ANTLR start "rule__ControlVariables__Group__2"
    // InternalHypoMethod.g:7956:1: rule__ControlVariables__Group__2 : rule__ControlVariables__Group__2__Impl rule__ControlVariables__Group__3 ;
    public final void rule__ControlVariables__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7960:1: ( rule__ControlVariables__Group__2__Impl rule__ControlVariables__Group__3 )
            // InternalHypoMethod.g:7961:2: rule__ControlVariables__Group__2__Impl rule__ControlVariables__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ControlVariables__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group__2"


    // $ANTLR start "rule__ControlVariables__Group__2__Impl"
    // InternalHypoMethod.g:7968:1: rule__ControlVariables__Group__2__Impl : ( '{' ) ;
    public final void rule__ControlVariables__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7972:1: ( ( '{' ) )
            // InternalHypoMethod.g:7973:1: ( '{' )
            {
            // InternalHypoMethod.g:7973:1: ( '{' )
            // InternalHypoMethod.g:7974:2: '{'
            {
             before(grammarAccess.getControlVariablesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getControlVariablesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group__2__Impl"


    // $ANTLR start "rule__ControlVariables__Group__3"
    // InternalHypoMethod.g:7983:1: rule__ControlVariables__Group__3 : rule__ControlVariables__Group__3__Impl rule__ControlVariables__Group__4 ;
    public final void rule__ControlVariables__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7987:1: ( rule__ControlVariables__Group__3__Impl rule__ControlVariables__Group__4 )
            // InternalHypoMethod.g:7988:2: rule__ControlVariables__Group__3__Impl rule__ControlVariables__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ControlVariables__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group__3"


    // $ANTLR start "rule__ControlVariables__Group__3__Impl"
    // InternalHypoMethod.g:7995:1: rule__ControlVariables__Group__3__Impl : ( ( rule__ControlVariables__Group_3__0 )* ) ;
    public final void rule__ControlVariables__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:7999:1: ( ( ( rule__ControlVariables__Group_3__0 )* ) )
            // InternalHypoMethod.g:8000:1: ( ( rule__ControlVariables__Group_3__0 )* )
            {
            // InternalHypoMethod.g:8000:1: ( ( rule__ControlVariables__Group_3__0 )* )
            // InternalHypoMethod.g:8001:2: ( rule__ControlVariables__Group_3__0 )*
            {
             before(grammarAccess.getControlVariablesAccess().getGroup_3()); 
            // InternalHypoMethod.g:8002:2: ( rule__ControlVariables__Group_3__0 )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==RULE_ID) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalHypoMethod.g:8002:3: rule__ControlVariables__Group_3__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ControlVariables__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

             after(grammarAccess.getControlVariablesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group__3__Impl"


    // $ANTLR start "rule__ControlVariables__Group__4"
    // InternalHypoMethod.g:8010:1: rule__ControlVariables__Group__4 : rule__ControlVariables__Group__4__Impl ;
    public final void rule__ControlVariables__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8014:1: ( rule__ControlVariables__Group__4__Impl )
            // InternalHypoMethod.g:8015:2: rule__ControlVariables__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group__4"


    // $ANTLR start "rule__ControlVariables__Group__4__Impl"
    // InternalHypoMethod.g:8021:1: rule__ControlVariables__Group__4__Impl : ( '}' ) ;
    public final void rule__ControlVariables__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8025:1: ( ( '}' ) )
            // InternalHypoMethod.g:8026:1: ( '}' )
            {
            // InternalHypoMethod.g:8026:1: ( '}' )
            // InternalHypoMethod.g:8027:2: '}'
            {
             before(grammarAccess.getControlVariablesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getControlVariablesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group__4__Impl"


    // $ANTLR start "rule__ControlVariables__Group_3__0"
    // InternalHypoMethod.g:8037:1: rule__ControlVariables__Group_3__0 : rule__ControlVariables__Group_3__0__Impl rule__ControlVariables__Group_3__1 ;
    public final void rule__ControlVariables__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8041:1: ( rule__ControlVariables__Group_3__0__Impl rule__ControlVariables__Group_3__1 )
            // InternalHypoMethod.g:8042:2: rule__ControlVariables__Group_3__0__Impl rule__ControlVariables__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__ControlVariables__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__0"


    // $ANTLR start "rule__ControlVariables__Group_3__0__Impl"
    // InternalHypoMethod.g:8049:1: rule__ControlVariables__Group_3__0__Impl : ( ( rule__ControlVariables__ControlNameAssignment_3_0 ) ) ;
    public final void rule__ControlVariables__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8053:1: ( ( ( rule__ControlVariables__ControlNameAssignment_3_0 ) ) )
            // InternalHypoMethod.g:8054:1: ( ( rule__ControlVariables__ControlNameAssignment_3_0 ) )
            {
            // InternalHypoMethod.g:8054:1: ( ( rule__ControlVariables__ControlNameAssignment_3_0 ) )
            // InternalHypoMethod.g:8055:2: ( rule__ControlVariables__ControlNameAssignment_3_0 )
            {
             before(grammarAccess.getControlVariablesAccess().getControlNameAssignment_3_0()); 
            // InternalHypoMethod.g:8056:2: ( rule__ControlVariables__ControlNameAssignment_3_0 )
            // InternalHypoMethod.g:8056:3: rule__ControlVariables__ControlNameAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ControlVariables__ControlNameAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getControlVariablesAccess().getControlNameAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__0__Impl"


    // $ANTLR start "rule__ControlVariables__Group_3__1"
    // InternalHypoMethod.g:8064:1: rule__ControlVariables__Group_3__1 : rule__ControlVariables__Group_3__1__Impl rule__ControlVariables__Group_3__2 ;
    public final void rule__ControlVariables__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8068:1: ( rule__ControlVariables__Group_3__1__Impl rule__ControlVariables__Group_3__2 )
            // InternalHypoMethod.g:8069:2: rule__ControlVariables__Group_3__1__Impl rule__ControlVariables__Group_3__2
            {
            pushFollow(FOLLOW_74);
            rule__ControlVariables__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__1"


    // $ANTLR start "rule__ControlVariables__Group_3__1__Impl"
    // InternalHypoMethod.g:8076:1: rule__ControlVariables__Group_3__1__Impl : ( ':' ) ;
    public final void rule__ControlVariables__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8080:1: ( ( ':' ) )
            // InternalHypoMethod.g:8081:1: ( ':' )
            {
            // InternalHypoMethod.g:8081:1: ( ':' )
            // InternalHypoMethod.g:8082:2: ':'
            {
             before(grammarAccess.getControlVariablesAccess().getColonKeyword_3_1()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getControlVariablesAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__1__Impl"


    // $ANTLR start "rule__ControlVariables__Group_3__2"
    // InternalHypoMethod.g:8091:1: rule__ControlVariables__Group_3__2 : rule__ControlVariables__Group_3__2__Impl rule__ControlVariables__Group_3__3 ;
    public final void rule__ControlVariables__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8095:1: ( rule__ControlVariables__Group_3__2__Impl rule__ControlVariables__Group_3__3 )
            // InternalHypoMethod.g:8096:2: rule__ControlVariables__Group_3__2__Impl rule__ControlVariables__Group_3__3
            {
            pushFollow(FOLLOW_75);
            rule__ControlVariables__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__2"


    // $ANTLR start "rule__ControlVariables__Group_3__2__Impl"
    // InternalHypoMethod.g:8103:1: rule__ControlVariables__Group_3__2__Impl : ( 'type' ) ;
    public final void rule__ControlVariables__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8107:1: ( ( 'type' ) )
            // InternalHypoMethod.g:8108:1: ( 'type' )
            {
            // InternalHypoMethod.g:8108:1: ( 'type' )
            // InternalHypoMethod.g:8109:2: 'type'
            {
             before(grammarAccess.getControlVariablesAccess().getTypeKeyword_3_2()); 
            match(input,125,FOLLOW_2); 
             after(grammarAccess.getControlVariablesAccess().getTypeKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__2__Impl"


    // $ANTLR start "rule__ControlVariables__Group_3__3"
    // InternalHypoMethod.g:8118:1: rule__ControlVariables__Group_3__3 : rule__ControlVariables__Group_3__3__Impl rule__ControlVariables__Group_3__4 ;
    public final void rule__ControlVariables__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8122:1: ( rule__ControlVariables__Group_3__3__Impl rule__ControlVariables__Group_3__4 )
            // InternalHypoMethod.g:8123:2: rule__ControlVariables__Group_3__3__Impl rule__ControlVariables__Group_3__4
            {
            pushFollow(FOLLOW_76);
            rule__ControlVariables__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__3"


    // $ANTLR start "rule__ControlVariables__Group_3__3__Impl"
    // InternalHypoMethod.g:8130:1: rule__ControlVariables__Group_3__3__Impl : ( ( rule__ControlVariables__ControlTypeAssignment_3_3 ) ) ;
    public final void rule__ControlVariables__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8134:1: ( ( ( rule__ControlVariables__ControlTypeAssignment_3_3 ) ) )
            // InternalHypoMethod.g:8135:1: ( ( rule__ControlVariables__ControlTypeAssignment_3_3 ) )
            {
            // InternalHypoMethod.g:8135:1: ( ( rule__ControlVariables__ControlTypeAssignment_3_3 ) )
            // InternalHypoMethod.g:8136:2: ( rule__ControlVariables__ControlTypeAssignment_3_3 )
            {
             before(grammarAccess.getControlVariablesAccess().getControlTypeAssignment_3_3()); 
            // InternalHypoMethod.g:8137:2: ( rule__ControlVariables__ControlTypeAssignment_3_3 )
            // InternalHypoMethod.g:8137:3: rule__ControlVariables__ControlTypeAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__ControlVariables__ControlTypeAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getControlVariablesAccess().getControlTypeAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__3__Impl"


    // $ANTLR start "rule__ControlVariables__Group_3__4"
    // InternalHypoMethod.g:8145:1: rule__ControlVariables__Group_3__4 : rule__ControlVariables__Group_3__4__Impl rule__ControlVariables__Group_3__5 ;
    public final void rule__ControlVariables__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8149:1: ( rule__ControlVariables__Group_3__4__Impl rule__ControlVariables__Group_3__5 )
            // InternalHypoMethod.g:8150:2: rule__ControlVariables__Group_3__4__Impl rule__ControlVariables__Group_3__5
            {
            pushFollow(FOLLOW_77);
            rule__ControlVariables__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__4"


    // $ANTLR start "rule__ControlVariables__Group_3__4__Impl"
    // InternalHypoMethod.g:8157:1: rule__ControlVariables__Group_3__4__Impl : ( 'with' ) ;
    public final void rule__ControlVariables__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8161:1: ( ( 'with' ) )
            // InternalHypoMethod.g:8162:1: ( 'with' )
            {
            // InternalHypoMethod.g:8162:1: ( 'with' )
            // InternalHypoMethod.g:8163:2: 'with'
            {
             before(grammarAccess.getControlVariablesAccess().getWithKeyword_3_4()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getControlVariablesAccess().getWithKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__4__Impl"


    // $ANTLR start "rule__ControlVariables__Group_3__5"
    // InternalHypoMethod.g:8172:1: rule__ControlVariables__Group_3__5 : rule__ControlVariables__Group_3__5__Impl rule__ControlVariables__Group_3__6 ;
    public final void rule__ControlVariables__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8176:1: ( rule__ControlVariables__Group_3__5__Impl rule__ControlVariables__Group_3__6 )
            // InternalHypoMethod.g:8177:2: rule__ControlVariables__Group_3__5__Impl rule__ControlVariables__Group_3__6
            {
            pushFollow(FOLLOW_6);
            rule__ControlVariables__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__5"


    // $ANTLR start "rule__ControlVariables__Group_3__5__Impl"
    // InternalHypoMethod.g:8184:1: rule__ControlVariables__Group_3__5__Impl : ( 'values' ) ;
    public final void rule__ControlVariables__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8188:1: ( ( 'values' ) )
            // InternalHypoMethod.g:8189:1: ( 'values' )
            {
            // InternalHypoMethod.g:8189:1: ( 'values' )
            // InternalHypoMethod.g:8190:2: 'values'
            {
             before(grammarAccess.getControlVariablesAccess().getValuesKeyword_3_5()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getControlVariablesAccess().getValuesKeyword_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__5__Impl"


    // $ANTLR start "rule__ControlVariables__Group_3__6"
    // InternalHypoMethod.g:8199:1: rule__ControlVariables__Group_3__6 : rule__ControlVariables__Group_3__6__Impl rule__ControlVariables__Group_3__7 ;
    public final void rule__ControlVariables__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8203:1: ( rule__ControlVariables__Group_3__6__Impl rule__ControlVariables__Group_3__7 )
            // InternalHypoMethod.g:8204:2: rule__ControlVariables__Group_3__6__Impl rule__ControlVariables__Group_3__7
            {
            pushFollow(FOLLOW_18);
            rule__ControlVariables__Group_3__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group_3__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__6"


    // $ANTLR start "rule__ControlVariables__Group_3__6__Impl"
    // InternalHypoMethod.g:8211:1: rule__ControlVariables__Group_3__6__Impl : ( '{' ) ;
    public final void rule__ControlVariables__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8215:1: ( ( '{' ) )
            // InternalHypoMethod.g:8216:1: ( '{' )
            {
            // InternalHypoMethod.g:8216:1: ( '{' )
            // InternalHypoMethod.g:8217:2: '{'
            {
             before(grammarAccess.getControlVariablesAccess().getLeftCurlyBracketKeyword_3_6()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getControlVariablesAccess().getLeftCurlyBracketKeyword_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__6__Impl"


    // $ANTLR start "rule__ControlVariables__Group_3__7"
    // InternalHypoMethod.g:8226:1: rule__ControlVariables__Group_3__7 : rule__ControlVariables__Group_3__7__Impl ;
    public final void rule__ControlVariables__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8230:1: ( rule__ControlVariables__Group_3__7__Impl )
            // InternalHypoMethod.g:8231:2: rule__ControlVariables__Group_3__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ControlVariables__Group_3__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__7"


    // $ANTLR start "rule__ControlVariables__Group_3__7__Impl"
    // InternalHypoMethod.g:8237:1: rule__ControlVariables__Group_3__7__Impl : ( ( rule__ControlVariables__ControlValueAssignment_3_7 ) ) ;
    public final void rule__ControlVariables__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8241:1: ( ( ( rule__ControlVariables__ControlValueAssignment_3_7 ) ) )
            // InternalHypoMethod.g:8242:1: ( ( rule__ControlVariables__ControlValueAssignment_3_7 ) )
            {
            // InternalHypoMethod.g:8242:1: ( ( rule__ControlVariables__ControlValueAssignment_3_7 ) )
            // InternalHypoMethod.g:8243:2: ( rule__ControlVariables__ControlValueAssignment_3_7 )
            {
             before(grammarAccess.getControlVariablesAccess().getControlValueAssignment_3_7()); 
            // InternalHypoMethod.g:8244:2: ( rule__ControlVariables__ControlValueAssignment_3_7 )
            // InternalHypoMethod.g:8244:3: rule__ControlVariables__ControlValueAssignment_3_7
            {
            pushFollow(FOLLOW_2);
            rule__ControlVariables__ControlValueAssignment_3_7();

            state._fsp--;


            }

             after(grammarAccess.getControlVariablesAccess().getControlValueAssignment_3_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__Group_3__7__Impl"


    // $ANTLR start "rule__DependentVariables__Group__0"
    // InternalHypoMethod.g:8253:1: rule__DependentVariables__Group__0 : rule__DependentVariables__Group__0__Impl rule__DependentVariables__Group__1 ;
    public final void rule__DependentVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8257:1: ( rule__DependentVariables__Group__0__Impl rule__DependentVariables__Group__1 )
            // InternalHypoMethod.g:8258:2: rule__DependentVariables__Group__0__Impl rule__DependentVariables__Group__1
            {
            pushFollow(FOLLOW_73);
            rule__DependentVariables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DependentVariables__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariables__Group__0"


    // $ANTLR start "rule__DependentVariables__Group__0__Impl"
    // InternalHypoMethod.g:8265:1: rule__DependentVariables__Group__0__Impl : ( 'dependent' ) ;
    public final void rule__DependentVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8269:1: ( ( 'dependent' ) )
            // InternalHypoMethod.g:8270:1: ( 'dependent' )
            {
            // InternalHypoMethod.g:8270:1: ( 'dependent' )
            // InternalHypoMethod.g:8271:2: 'dependent'
            {
             before(grammarAccess.getDependentVariablesAccess().getDependentKeyword_0()); 
            match(input,126,FOLLOW_2); 
             after(grammarAccess.getDependentVariablesAccess().getDependentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariables__Group__0__Impl"


    // $ANTLR start "rule__DependentVariables__Group__1"
    // InternalHypoMethod.g:8280:1: rule__DependentVariables__Group__1 : rule__DependentVariables__Group__1__Impl rule__DependentVariables__Group__2 ;
    public final void rule__DependentVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8284:1: ( rule__DependentVariables__Group__1__Impl rule__DependentVariables__Group__2 )
            // InternalHypoMethod.g:8285:2: rule__DependentVariables__Group__1__Impl rule__DependentVariables__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DependentVariables__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DependentVariables__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariables__Group__1"


    // $ANTLR start "rule__DependentVariables__Group__1__Impl"
    // InternalHypoMethod.g:8292:1: rule__DependentVariables__Group__1__Impl : ( 'variables' ) ;
    public final void rule__DependentVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8296:1: ( ( 'variables' ) )
            // InternalHypoMethod.g:8297:1: ( 'variables' )
            {
            // InternalHypoMethod.g:8297:1: ( 'variables' )
            // InternalHypoMethod.g:8298:2: 'variables'
            {
             before(grammarAccess.getDependentVariablesAccess().getVariablesKeyword_1()); 
            match(input,122,FOLLOW_2); 
             after(grammarAccess.getDependentVariablesAccess().getVariablesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariables__Group__1__Impl"


    // $ANTLR start "rule__DependentVariables__Group__2"
    // InternalHypoMethod.g:8307:1: rule__DependentVariables__Group__2 : rule__DependentVariables__Group__2__Impl rule__DependentVariables__Group__3 ;
    public final void rule__DependentVariables__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8311:1: ( rule__DependentVariables__Group__2__Impl rule__DependentVariables__Group__3 )
            // InternalHypoMethod.g:8312:2: rule__DependentVariables__Group__2__Impl rule__DependentVariables__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DependentVariables__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DependentVariables__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariables__Group__2"


    // $ANTLR start "rule__DependentVariables__Group__2__Impl"
    // InternalHypoMethod.g:8319:1: rule__DependentVariables__Group__2__Impl : ( '{' ) ;
    public final void rule__DependentVariables__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8323:1: ( ( '{' ) )
            // InternalHypoMethod.g:8324:1: ( '{' )
            {
            // InternalHypoMethod.g:8324:1: ( '{' )
            // InternalHypoMethod.g:8325:2: '{'
            {
             before(grammarAccess.getDependentVariablesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getDependentVariablesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariables__Group__2__Impl"


    // $ANTLR start "rule__DependentVariables__Group__3"
    // InternalHypoMethod.g:8334:1: rule__DependentVariables__Group__3 : rule__DependentVariables__Group__3__Impl ;
    public final void rule__DependentVariables__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8338:1: ( rule__DependentVariables__Group__3__Impl )
            // InternalHypoMethod.g:8339:2: rule__DependentVariables__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DependentVariables__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariables__Group__3"


    // $ANTLR start "rule__DependentVariables__Group__3__Impl"
    // InternalHypoMethod.g:8345:1: rule__DependentVariables__Group__3__Impl : ( ( rule__DependentVariables__ResponseNameAssignment_3 )* ) ;
    public final void rule__DependentVariables__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8349:1: ( ( ( rule__DependentVariables__ResponseNameAssignment_3 )* ) )
            // InternalHypoMethod.g:8350:1: ( ( rule__DependentVariables__ResponseNameAssignment_3 )* )
            {
            // InternalHypoMethod.g:8350:1: ( ( rule__DependentVariables__ResponseNameAssignment_3 )* )
            // InternalHypoMethod.g:8351:2: ( rule__DependentVariables__ResponseNameAssignment_3 )*
            {
             before(grammarAccess.getDependentVariablesAccess().getResponseNameAssignment_3()); 
            // InternalHypoMethod.g:8352:2: ( rule__DependentVariables__ResponseNameAssignment_3 )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==RULE_ID) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalHypoMethod.g:8352:3: rule__DependentVariables__ResponseNameAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DependentVariables__ResponseNameAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

             after(grammarAccess.getDependentVariablesAccess().getResponseNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariables__Group__3__Impl"


    // $ANTLR start "rule__FactorLevels__Group__0"
    // InternalHypoMethod.g:8361:1: rule__FactorLevels__Group__0 : rule__FactorLevels__Group__0__Impl rule__FactorLevels__Group__1 ;
    public final void rule__FactorLevels__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8365:1: ( rule__FactorLevels__Group__0__Impl rule__FactorLevels__Group__1 )
            // InternalHypoMethod.g:8366:2: rule__FactorLevels__Group__0__Impl rule__FactorLevels__Group__1
            {
            pushFollow(FOLLOW_78);
            rule__FactorLevels__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__0"


    // $ANTLR start "rule__FactorLevels__Group__0__Impl"
    // InternalHypoMethod.g:8373:1: rule__FactorLevels__Group__0__Impl : ( ( rule__FactorLevels__FacNameAssignment_0 ) ) ;
    public final void rule__FactorLevels__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8377:1: ( ( ( rule__FactorLevels__FacNameAssignment_0 ) ) )
            // InternalHypoMethod.g:8378:1: ( ( rule__FactorLevels__FacNameAssignment_0 ) )
            {
            // InternalHypoMethod.g:8378:1: ( ( rule__FactorLevels__FacNameAssignment_0 ) )
            // InternalHypoMethod.g:8379:2: ( rule__FactorLevels__FacNameAssignment_0 )
            {
             before(grammarAccess.getFactorLevelsAccess().getFacNameAssignment_0()); 
            // InternalHypoMethod.g:8380:2: ( rule__FactorLevels__FacNameAssignment_0 )
            // InternalHypoMethod.g:8380:3: rule__FactorLevels__FacNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FactorLevels__FacNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFactorLevelsAccess().getFacNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__0__Impl"


    // $ANTLR start "rule__FactorLevels__Group__1"
    // InternalHypoMethod.g:8388:1: rule__FactorLevels__Group__1 : rule__FactorLevels__Group__1__Impl rule__FactorLevels__Group__2 ;
    public final void rule__FactorLevels__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8392:1: ( rule__FactorLevels__Group__1__Impl rule__FactorLevels__Group__2 )
            // InternalHypoMethod.g:8393:2: rule__FactorLevels__Group__1__Impl rule__FactorLevels__Group__2
            {
            pushFollow(FOLLOW_79);
            rule__FactorLevels__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__1"


    // $ANTLR start "rule__FactorLevels__Group__1__Impl"
    // InternalHypoMethod.g:8400:1: rule__FactorLevels__Group__1__Impl : ( 'are' ) ;
    public final void rule__FactorLevels__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8404:1: ( ( 'are' ) )
            // InternalHypoMethod.g:8405:1: ( 'are' )
            {
            // InternalHypoMethod.g:8405:1: ( 'are' )
            // InternalHypoMethod.g:8406:2: 'are'
            {
             before(grammarAccess.getFactorLevelsAccess().getAreKeyword_1()); 
            match(input,127,FOLLOW_2); 
             after(grammarAccess.getFactorLevelsAccess().getAreKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__1__Impl"


    // $ANTLR start "rule__FactorLevels__Group__2"
    // InternalHypoMethod.g:8415:1: rule__FactorLevels__Group__2 : rule__FactorLevels__Group__2__Impl rule__FactorLevels__Group__3 ;
    public final void rule__FactorLevels__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8419:1: ( rule__FactorLevels__Group__2__Impl rule__FactorLevels__Group__3 )
            // InternalHypoMethod.g:8420:2: rule__FactorLevels__Group__2__Impl rule__FactorLevels__Group__3
            {
            pushFollow(FOLLOW_80);
            rule__FactorLevels__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__2"


    // $ANTLR start "rule__FactorLevels__Group__2__Impl"
    // InternalHypoMethod.g:8427:1: rule__FactorLevels__Group__2__Impl : ( 'at' ) ;
    public final void rule__FactorLevels__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8431:1: ( ( 'at' ) )
            // InternalHypoMethod.g:8432:1: ( 'at' )
            {
            // InternalHypoMethod.g:8432:1: ( 'at' )
            // InternalHypoMethod.g:8433:2: 'at'
            {
             before(grammarAccess.getFactorLevelsAccess().getAtKeyword_2()); 
            match(input,114,FOLLOW_2); 
             after(grammarAccess.getFactorLevelsAccess().getAtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__2__Impl"


    // $ANTLR start "rule__FactorLevels__Group__3"
    // InternalHypoMethod.g:8442:1: rule__FactorLevels__Group__3 : rule__FactorLevels__Group__3__Impl rule__FactorLevels__Group__4 ;
    public final void rule__FactorLevels__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8446:1: ( rule__FactorLevels__Group__3__Impl rule__FactorLevels__Group__4 )
            // InternalHypoMethod.g:8447:2: rule__FactorLevels__Group__3__Impl rule__FactorLevels__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__FactorLevels__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__3"


    // $ANTLR start "rule__FactorLevels__Group__3__Impl"
    // InternalHypoMethod.g:8454:1: rule__FactorLevels__Group__3__Impl : ( 'levels' ) ;
    public final void rule__FactorLevels__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8458:1: ( ( 'levels' ) )
            // InternalHypoMethod.g:8459:1: ( 'levels' )
            {
            // InternalHypoMethod.g:8459:1: ( 'levels' )
            // InternalHypoMethod.g:8460:2: 'levels'
            {
             before(grammarAccess.getFactorLevelsAccess().getLevelsKeyword_3()); 
            match(input,128,FOLLOW_2); 
             after(grammarAccess.getFactorLevelsAccess().getLevelsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__3__Impl"


    // $ANTLR start "rule__FactorLevels__Group__4"
    // InternalHypoMethod.g:8469:1: rule__FactorLevels__Group__4 : rule__FactorLevels__Group__4__Impl rule__FactorLevels__Group__5 ;
    public final void rule__FactorLevels__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8473:1: ( rule__FactorLevels__Group__4__Impl rule__FactorLevels__Group__5 )
            // InternalHypoMethod.g:8474:2: rule__FactorLevels__Group__4__Impl rule__FactorLevels__Group__5
            {
            pushFollow(FOLLOW_81);
            rule__FactorLevels__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__4"


    // $ANTLR start "rule__FactorLevels__Group__4__Impl"
    // InternalHypoMethod.g:8481:1: rule__FactorLevels__Group__4__Impl : ( ':' ) ;
    public final void rule__FactorLevels__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8485:1: ( ( ':' ) )
            // InternalHypoMethod.g:8486:1: ( ':' )
            {
            // InternalHypoMethod.g:8486:1: ( ':' )
            // InternalHypoMethod.g:8487:2: ':'
            {
             before(grammarAccess.getFactorLevelsAccess().getColonKeyword_4()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getFactorLevelsAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__4__Impl"


    // $ANTLR start "rule__FactorLevels__Group__5"
    // InternalHypoMethod.g:8496:1: rule__FactorLevels__Group__5 : rule__FactorLevels__Group__5__Impl rule__FactorLevels__Group__6 ;
    public final void rule__FactorLevels__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8500:1: ( rule__FactorLevels__Group__5__Impl rule__FactorLevels__Group__6 )
            // InternalHypoMethod.g:8501:2: rule__FactorLevels__Group__5__Impl rule__FactorLevels__Group__6
            {
            pushFollow(FOLLOW_81);
            rule__FactorLevels__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__5"


    // $ANTLR start "rule__FactorLevels__Group__5__Impl"
    // InternalHypoMethod.g:8508:1: rule__FactorLevels__Group__5__Impl : ( ( rule__FactorLevels__LAssignment_5 )? ) ;
    public final void rule__FactorLevels__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8512:1: ( ( ( rule__FactorLevels__LAssignment_5 )? ) )
            // InternalHypoMethod.g:8513:1: ( ( rule__FactorLevels__LAssignment_5 )? )
            {
            // InternalHypoMethod.g:8513:1: ( ( rule__FactorLevels__LAssignment_5 )? )
            // InternalHypoMethod.g:8514:2: ( rule__FactorLevels__LAssignment_5 )?
            {
             before(grammarAccess.getFactorLevelsAccess().getLAssignment_5()); 
            // InternalHypoMethod.g:8515:2: ( rule__FactorLevels__LAssignment_5 )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_FACTORLEVELVALUE) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalHypoMethod.g:8515:3: rule__FactorLevels__LAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__FactorLevels__LAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactorLevelsAccess().getLAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__5__Impl"


    // $ANTLR start "rule__FactorLevels__Group__6"
    // InternalHypoMethod.g:8523:1: rule__FactorLevels__Group__6 : rule__FactorLevels__Group__6__Impl ;
    public final void rule__FactorLevels__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8527:1: ( rule__FactorLevels__Group__6__Impl )
            // InternalHypoMethod.g:8528:2: rule__FactorLevels__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__6"


    // $ANTLR start "rule__FactorLevels__Group__6__Impl"
    // InternalHypoMethod.g:8534:1: rule__FactorLevels__Group__6__Impl : ( ( rule__FactorLevels__Group_6__0 )? ) ;
    public final void rule__FactorLevels__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8538:1: ( ( ( rule__FactorLevels__Group_6__0 )? ) )
            // InternalHypoMethod.g:8539:1: ( ( rule__FactorLevels__Group_6__0 )? )
            {
            // InternalHypoMethod.g:8539:1: ( ( rule__FactorLevels__Group_6__0 )? )
            // InternalHypoMethod.g:8540:2: ( rule__FactorLevels__Group_6__0 )?
            {
             before(grammarAccess.getFactorLevelsAccess().getGroup_6()); 
            // InternalHypoMethod.g:8541:2: ( rule__FactorLevels__Group_6__0 )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=67 && LA97_0<=69)) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalHypoMethod.g:8541:3: rule__FactorLevels__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FactorLevels__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactorLevelsAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group__6__Impl"


    // $ANTLR start "rule__FactorLevels__Group_6__0"
    // InternalHypoMethod.g:8550:1: rule__FactorLevels__Group_6__0 : rule__FactorLevels__Group_6__0__Impl rule__FactorLevels__Group_6__1 ;
    public final void rule__FactorLevels__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8554:1: ( rule__FactorLevels__Group_6__0__Impl rule__FactorLevels__Group_6__1 )
            // InternalHypoMethod.g:8555:2: rule__FactorLevels__Group_6__0__Impl rule__FactorLevels__Group_6__1
            {
            pushFollow(FOLLOW_82);
            rule__FactorLevels__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__0"


    // $ANTLR start "rule__FactorLevels__Group_6__0__Impl"
    // InternalHypoMethod.g:8562:1: rule__FactorLevels__Group_6__0__Impl : ( ( rule__FactorLevels__L1Assignment_6_0 ) ) ;
    public final void rule__FactorLevels__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8566:1: ( ( ( rule__FactorLevels__L1Assignment_6_0 ) ) )
            // InternalHypoMethod.g:8567:1: ( ( rule__FactorLevels__L1Assignment_6_0 ) )
            {
            // InternalHypoMethod.g:8567:1: ( ( rule__FactorLevels__L1Assignment_6_0 ) )
            // InternalHypoMethod.g:8568:2: ( rule__FactorLevels__L1Assignment_6_0 )
            {
             before(grammarAccess.getFactorLevelsAccess().getL1Assignment_6_0()); 
            // InternalHypoMethod.g:8569:2: ( rule__FactorLevels__L1Assignment_6_0 )
            // InternalHypoMethod.g:8569:3: rule__FactorLevels__L1Assignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__FactorLevels__L1Assignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getFactorLevelsAccess().getL1Assignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__0__Impl"


    // $ANTLR start "rule__FactorLevels__Group_6__1"
    // InternalHypoMethod.g:8577:1: rule__FactorLevels__Group_6__1 : rule__FactorLevels__Group_6__1__Impl rule__FactorLevels__Group_6__2 ;
    public final void rule__FactorLevels__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8581:1: ( rule__FactorLevels__Group_6__1__Impl rule__FactorLevels__Group_6__2 )
            // InternalHypoMethod.g:8582:2: rule__FactorLevels__Group_6__1__Impl rule__FactorLevels__Group_6__2
            {
            pushFollow(FOLLOW_60);
            rule__FactorLevels__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__1"


    // $ANTLR start "rule__FactorLevels__Group_6__1__Impl"
    // InternalHypoMethod.g:8589:1: rule__FactorLevels__Group_6__1__Impl : ( 'where' ) ;
    public final void rule__FactorLevels__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8593:1: ( ( 'where' ) )
            // InternalHypoMethod.g:8594:1: ( 'where' )
            {
            // InternalHypoMethod.g:8594:1: ( 'where' )
            // InternalHypoMethod.g:8595:2: 'where'
            {
             before(grammarAccess.getFactorLevelsAccess().getWhereKeyword_6_1()); 
            match(input,113,FOLLOW_2); 
             after(grammarAccess.getFactorLevelsAccess().getWhereKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__1__Impl"


    // $ANTLR start "rule__FactorLevels__Group_6__2"
    // InternalHypoMethod.g:8604:1: rule__FactorLevels__Group_6__2 : rule__FactorLevels__Group_6__2__Impl rule__FactorLevels__Group_6__3 ;
    public final void rule__FactorLevels__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8608:1: ( rule__FactorLevels__Group_6__2__Impl rule__FactorLevels__Group_6__3 )
            // InternalHypoMethod.g:8609:2: rule__FactorLevels__Group_6__2__Impl rule__FactorLevels__Group_6__3
            {
            pushFollow(FOLLOW_52);
            rule__FactorLevels__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__2"


    // $ANTLR start "rule__FactorLevels__Group_6__2__Impl"
    // InternalHypoMethod.g:8616:1: rule__FactorLevels__Group_6__2__Impl : ( ( rule__FactorLevels__L2Assignment_6_2 ) ) ;
    public final void rule__FactorLevels__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8620:1: ( ( ( rule__FactorLevels__L2Assignment_6_2 ) ) )
            // InternalHypoMethod.g:8621:1: ( ( rule__FactorLevels__L2Assignment_6_2 ) )
            {
            // InternalHypoMethod.g:8621:1: ( ( rule__FactorLevels__L2Assignment_6_2 ) )
            // InternalHypoMethod.g:8622:2: ( rule__FactorLevels__L2Assignment_6_2 )
            {
             before(grammarAccess.getFactorLevelsAccess().getL2Assignment_6_2()); 
            // InternalHypoMethod.g:8623:2: ( rule__FactorLevels__L2Assignment_6_2 )
            // InternalHypoMethod.g:8623:3: rule__FactorLevels__L2Assignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__FactorLevels__L2Assignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getFactorLevelsAccess().getL2Assignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__2__Impl"


    // $ANTLR start "rule__FactorLevels__Group_6__3"
    // InternalHypoMethod.g:8631:1: rule__FactorLevels__Group_6__3 : rule__FactorLevels__Group_6__3__Impl rule__FactorLevels__Group_6__4 ;
    public final void rule__FactorLevels__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8635:1: ( rule__FactorLevels__Group_6__3__Impl rule__FactorLevels__Group_6__4 )
            // InternalHypoMethod.g:8636:2: rule__FactorLevels__Group_6__3__Impl rule__FactorLevels__Group_6__4
            {
            pushFollow(FOLLOW_65);
            rule__FactorLevels__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__3"


    // $ANTLR start "rule__FactorLevels__Group_6__3__Impl"
    // InternalHypoMethod.g:8643:1: rule__FactorLevels__Group_6__3__Impl : ( 'is' ) ;
    public final void rule__FactorLevels__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8647:1: ( ( 'is' ) )
            // InternalHypoMethod.g:8648:1: ( 'is' )
            {
            // InternalHypoMethod.g:8648:1: ( 'is' )
            // InternalHypoMethod.g:8649:2: 'is'
            {
             before(grammarAccess.getFactorLevelsAccess().getIsKeyword_6_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFactorLevelsAccess().getIsKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__3__Impl"


    // $ANTLR start "rule__FactorLevels__Group_6__4"
    // InternalHypoMethod.g:8658:1: rule__FactorLevels__Group_6__4 : rule__FactorLevels__Group_6__4__Impl rule__FactorLevels__Group_6__5 ;
    public final void rule__FactorLevels__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8662:1: ( rule__FactorLevels__Group_6__4__Impl rule__FactorLevels__Group_6__5 )
            // InternalHypoMethod.g:8663:2: rule__FactorLevels__Group_6__4__Impl rule__FactorLevels__Group_6__5
            {
            pushFollow(FOLLOW_43);
            rule__FactorLevels__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__4"


    // $ANTLR start "rule__FactorLevels__Group_6__4__Impl"
    // InternalHypoMethod.g:8670:1: rule__FactorLevels__Group_6__4__Impl : ( 'in the range' ) ;
    public final void rule__FactorLevels__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8674:1: ( ( 'in the range' ) )
            // InternalHypoMethod.g:8675:1: ( 'in the range' )
            {
            // InternalHypoMethod.g:8675:1: ( 'in the range' )
            // InternalHypoMethod.g:8676:2: 'in the range'
            {
             before(grammarAccess.getFactorLevelsAccess().getInTheRangeKeyword_6_4()); 
            match(input,111,FOLLOW_2); 
             after(grammarAccess.getFactorLevelsAccess().getInTheRangeKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__4__Impl"


    // $ANTLR start "rule__FactorLevels__Group_6__5"
    // InternalHypoMethod.g:8685:1: rule__FactorLevels__Group_6__5 : rule__FactorLevels__Group_6__5__Impl rule__FactorLevels__Group_6__6 ;
    public final void rule__FactorLevels__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8689:1: ( rule__FactorLevels__Group_6__5__Impl rule__FactorLevels__Group_6__6 )
            // InternalHypoMethod.g:8690:2: rule__FactorLevels__Group_6__5__Impl rule__FactorLevels__Group_6__6
            {
            pushFollow(FOLLOW_54);
            rule__FactorLevels__Group_6__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group_6__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__5"


    // $ANTLR start "rule__FactorLevels__Group_6__5__Impl"
    // InternalHypoMethod.g:8697:1: rule__FactorLevels__Group_6__5__Impl : ( ( rule__FactorLevels__Start1Assignment_6_5 ) ) ;
    public final void rule__FactorLevels__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8701:1: ( ( ( rule__FactorLevels__Start1Assignment_6_5 ) ) )
            // InternalHypoMethod.g:8702:1: ( ( rule__FactorLevels__Start1Assignment_6_5 ) )
            {
            // InternalHypoMethod.g:8702:1: ( ( rule__FactorLevels__Start1Assignment_6_5 ) )
            // InternalHypoMethod.g:8703:2: ( rule__FactorLevels__Start1Assignment_6_5 )
            {
             before(grammarAccess.getFactorLevelsAccess().getStart1Assignment_6_5()); 
            // InternalHypoMethod.g:8704:2: ( rule__FactorLevels__Start1Assignment_6_5 )
            // InternalHypoMethod.g:8704:3: rule__FactorLevels__Start1Assignment_6_5
            {
            pushFollow(FOLLOW_2);
            rule__FactorLevels__Start1Assignment_6_5();

            state._fsp--;


            }

             after(grammarAccess.getFactorLevelsAccess().getStart1Assignment_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__5__Impl"


    // $ANTLR start "rule__FactorLevels__Group_6__6"
    // InternalHypoMethod.g:8712:1: rule__FactorLevels__Group_6__6 : rule__FactorLevels__Group_6__6__Impl rule__FactorLevels__Group_6__7 ;
    public final void rule__FactorLevels__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8716:1: ( rule__FactorLevels__Group_6__6__Impl rule__FactorLevels__Group_6__7 )
            // InternalHypoMethod.g:8717:2: rule__FactorLevels__Group_6__6__Impl rule__FactorLevels__Group_6__7
            {
            pushFollow(FOLLOW_43);
            rule__FactorLevels__Group_6__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group_6__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__6"


    // $ANTLR start "rule__FactorLevels__Group_6__6__Impl"
    // InternalHypoMethod.g:8724:1: rule__FactorLevels__Group_6__6__Impl : ( 'to' ) ;
    public final void rule__FactorLevels__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8728:1: ( ( 'to' ) )
            // InternalHypoMethod.g:8729:1: ( 'to' )
            {
            // InternalHypoMethod.g:8729:1: ( 'to' )
            // InternalHypoMethod.g:8730:2: 'to'
            {
             before(grammarAccess.getFactorLevelsAccess().getToKeyword_6_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFactorLevelsAccess().getToKeyword_6_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__6__Impl"


    // $ANTLR start "rule__FactorLevels__Group_6__7"
    // InternalHypoMethod.g:8739:1: rule__FactorLevels__Group_6__7 : rule__FactorLevels__Group_6__7__Impl ;
    public final void rule__FactorLevels__Group_6__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8743:1: ( rule__FactorLevels__Group_6__7__Impl )
            // InternalHypoMethod.g:8744:2: rule__FactorLevels__Group_6__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FactorLevels__Group_6__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__7"


    // $ANTLR start "rule__FactorLevels__Group_6__7__Impl"
    // InternalHypoMethod.g:8750:1: rule__FactorLevels__Group_6__7__Impl : ( ( rule__FactorLevels__End1Assignment_6_7 ) ) ;
    public final void rule__FactorLevels__Group_6__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8754:1: ( ( ( rule__FactorLevels__End1Assignment_6_7 ) ) )
            // InternalHypoMethod.g:8755:1: ( ( rule__FactorLevels__End1Assignment_6_7 ) )
            {
            // InternalHypoMethod.g:8755:1: ( ( rule__FactorLevels__End1Assignment_6_7 ) )
            // InternalHypoMethod.g:8756:2: ( rule__FactorLevels__End1Assignment_6_7 )
            {
             before(grammarAccess.getFactorLevelsAccess().getEnd1Assignment_6_7()); 
            // InternalHypoMethod.g:8757:2: ( rule__FactorLevels__End1Assignment_6_7 )
            // InternalHypoMethod.g:8757:3: rule__FactorLevels__End1Assignment_6_7
            {
            pushFollow(FOLLOW_2);
            rule__FactorLevels__End1Assignment_6_7();

            state._fsp--;


            }

             after(grammarAccess.getFactorLevelsAccess().getEnd1Assignment_6_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Group_6__7__Impl"


    // $ANTLR start "rule__Response__Group__0"
    // InternalHypoMethod.g:8766:1: rule__Response__Group__0 : rule__Response__Group__0__Impl rule__Response__Group__1 ;
    public final void rule__Response__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8770:1: ( rule__Response__Group__0__Impl rule__Response__Group__1 )
            // InternalHypoMethod.g:8771:2: rule__Response__Group__0__Impl rule__Response__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Response__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__0"


    // $ANTLR start "rule__Response__Group__0__Impl"
    // InternalHypoMethod.g:8778:1: rule__Response__Group__0__Impl : ( ( rule__Response__ResponseNameAssignment_0 ) ) ;
    public final void rule__Response__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8782:1: ( ( ( rule__Response__ResponseNameAssignment_0 ) ) )
            // InternalHypoMethod.g:8783:1: ( ( rule__Response__ResponseNameAssignment_0 ) )
            {
            // InternalHypoMethod.g:8783:1: ( ( rule__Response__ResponseNameAssignment_0 ) )
            // InternalHypoMethod.g:8784:2: ( rule__Response__ResponseNameAssignment_0 )
            {
             before(grammarAccess.getResponseAccess().getResponseNameAssignment_0()); 
            // InternalHypoMethod.g:8785:2: ( rule__Response__ResponseNameAssignment_0 )
            // InternalHypoMethod.g:8785:3: rule__Response__ResponseNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Response__ResponseNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getResponseNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__0__Impl"


    // $ANTLR start "rule__Response__Group__1"
    // InternalHypoMethod.g:8793:1: rule__Response__Group__1 : rule__Response__Group__1__Impl rule__Response__Group__2 ;
    public final void rule__Response__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8797:1: ( rule__Response__Group__1__Impl rule__Response__Group__2 )
            // InternalHypoMethod.g:8798:2: rule__Response__Group__1__Impl rule__Response__Group__2
            {
            pushFollow(FOLLOW_74);
            rule__Response__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__1"


    // $ANTLR start "rule__Response__Group__1__Impl"
    // InternalHypoMethod.g:8805:1: rule__Response__Group__1__Impl : ( ':' ) ;
    public final void rule__Response__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8809:1: ( ( ':' ) )
            // InternalHypoMethod.g:8810:1: ( ':' )
            {
            // InternalHypoMethod.g:8810:1: ( ':' )
            // InternalHypoMethod.g:8811:2: ':'
            {
             before(grammarAccess.getResponseAccess().getColonKeyword_1()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__1__Impl"


    // $ANTLR start "rule__Response__Group__2"
    // InternalHypoMethod.g:8820:1: rule__Response__Group__2 : rule__Response__Group__2__Impl rule__Response__Group__3 ;
    public final void rule__Response__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8824:1: ( rule__Response__Group__2__Impl rule__Response__Group__3 )
            // InternalHypoMethod.g:8825:2: rule__Response__Group__2__Impl rule__Response__Group__3
            {
            pushFollow(FOLLOW_83);
            rule__Response__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__2"


    // $ANTLR start "rule__Response__Group__2__Impl"
    // InternalHypoMethod.g:8832:1: rule__Response__Group__2__Impl : ( 'type' ) ;
    public final void rule__Response__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8836:1: ( ( 'type' ) )
            // InternalHypoMethod.g:8837:1: ( 'type' )
            {
            // InternalHypoMethod.g:8837:1: ( 'type' )
            // InternalHypoMethod.g:8838:2: 'type'
            {
             before(grammarAccess.getResponseAccess().getTypeKeyword_2()); 
            match(input,125,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__2__Impl"


    // $ANTLR start "rule__Response__Group__3"
    // InternalHypoMethod.g:8847:1: rule__Response__Group__3 : rule__Response__Group__3__Impl rule__Response__Group__4 ;
    public final void rule__Response__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8851:1: ( rule__Response__Group__3__Impl rule__Response__Group__4 )
            // InternalHypoMethod.g:8852:2: rule__Response__Group__3__Impl rule__Response__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Response__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__3"


    // $ANTLR start "rule__Response__Group__3__Impl"
    // InternalHypoMethod.g:8859:1: rule__Response__Group__3__Impl : ( ( rule__Response__ResponseTypeAssignment_3 ) ) ;
    public final void rule__Response__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8863:1: ( ( ( rule__Response__ResponseTypeAssignment_3 ) ) )
            // InternalHypoMethod.g:8864:1: ( ( rule__Response__ResponseTypeAssignment_3 ) )
            {
            // InternalHypoMethod.g:8864:1: ( ( rule__Response__ResponseTypeAssignment_3 ) )
            // InternalHypoMethod.g:8865:2: ( rule__Response__ResponseTypeAssignment_3 )
            {
             before(grammarAccess.getResponseAccess().getResponseTypeAssignment_3()); 
            // InternalHypoMethod.g:8866:2: ( rule__Response__ResponseTypeAssignment_3 )
            // InternalHypoMethod.g:8866:3: rule__Response__ResponseTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Response__ResponseTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getResponseTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__3__Impl"


    // $ANTLR start "rule__Response__Group__4"
    // InternalHypoMethod.g:8874:1: rule__Response__Group__4 : rule__Response__Group__4__Impl ;
    public final void rule__Response__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8878:1: ( rule__Response__Group__4__Impl )
            // InternalHypoMethod.g:8879:2: rule__Response__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__4"


    // $ANTLR start "rule__Response__Group__4__Impl"
    // InternalHypoMethod.g:8885:1: rule__Response__Group__4__Impl : ( '}' ) ;
    public final void rule__Response__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8889:1: ( ( '}' ) )
            // InternalHypoMethod.g:8890:1: ( '}' )
            {
            // InternalHypoMethod.g:8890:1: ( '}' )
            // InternalHypoMethod.g:8891:2: '}'
            {
             before(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__4__Impl"


    // $ANTLR start "rule__Iteration__Group__0"
    // InternalHypoMethod.g:8901:1: rule__Iteration__Group__0 : rule__Iteration__Group__0__Impl rule__Iteration__Group__1 ;
    public final void rule__Iteration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8905:1: ( rule__Iteration__Group__0__Impl rule__Iteration__Group__1 )
            // InternalHypoMethod.g:8906:2: rule__Iteration__Group__0__Impl rule__Iteration__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Iteration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iteration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteration__Group__0"


    // $ANTLR start "rule__Iteration__Group__0__Impl"
    // InternalHypoMethod.g:8913:1: rule__Iteration__Group__0__Impl : ( 'number' ) ;
    public final void rule__Iteration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8917:1: ( ( 'number' ) )
            // InternalHypoMethod.g:8918:1: ( 'number' )
            {
            // InternalHypoMethod.g:8918:1: ( 'number' )
            // InternalHypoMethod.g:8919:2: 'number'
            {
             before(grammarAccess.getIterationAccess().getNumberKeyword_0()); 
            match(input,129,FOLLOW_2); 
             after(grammarAccess.getIterationAccess().getNumberKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteration__Group__0__Impl"


    // $ANTLR start "rule__Iteration__Group__1"
    // InternalHypoMethod.g:8928:1: rule__Iteration__Group__1 : rule__Iteration__Group__1__Impl rule__Iteration__Group__2 ;
    public final void rule__Iteration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8932:1: ( rule__Iteration__Group__1__Impl rule__Iteration__Group__2 )
            // InternalHypoMethod.g:8933:2: rule__Iteration__Group__1__Impl rule__Iteration__Group__2
            {
            pushFollow(FOLLOW_84);
            rule__Iteration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iteration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteration__Group__1"


    // $ANTLR start "rule__Iteration__Group__1__Impl"
    // InternalHypoMethod.g:8940:1: rule__Iteration__Group__1__Impl : ( 'of' ) ;
    public final void rule__Iteration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8944:1: ( ( 'of' ) )
            // InternalHypoMethod.g:8945:1: ( 'of' )
            {
            // InternalHypoMethod.g:8945:1: ( 'of' )
            // InternalHypoMethod.g:8946:2: 'of'
            {
             before(grammarAccess.getIterationAccess().getOfKeyword_1()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getIterationAccess().getOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteration__Group__1__Impl"


    // $ANTLR start "rule__Iteration__Group__2"
    // InternalHypoMethod.g:8955:1: rule__Iteration__Group__2 : rule__Iteration__Group__2__Impl rule__Iteration__Group__3 ;
    public final void rule__Iteration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8959:1: ( rule__Iteration__Group__2__Impl rule__Iteration__Group__3 )
            // InternalHypoMethod.g:8960:2: rule__Iteration__Group__2__Impl rule__Iteration__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Iteration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iteration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteration__Group__2"


    // $ANTLR start "rule__Iteration__Group__2__Impl"
    // InternalHypoMethod.g:8967:1: rule__Iteration__Group__2__Impl : ( 'iterations' ) ;
    public final void rule__Iteration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8971:1: ( ( 'iterations' ) )
            // InternalHypoMethod.g:8972:1: ( 'iterations' )
            {
            // InternalHypoMethod.g:8972:1: ( 'iterations' )
            // InternalHypoMethod.g:8973:2: 'iterations'
            {
             before(grammarAccess.getIterationAccess().getIterationsKeyword_2()); 
            match(input,130,FOLLOW_2); 
             after(grammarAccess.getIterationAccess().getIterationsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteration__Group__2__Impl"


    // $ANTLR start "rule__Iteration__Group__3"
    // InternalHypoMethod.g:8982:1: rule__Iteration__Group__3 : rule__Iteration__Group__3__Impl rule__Iteration__Group__4 ;
    public final void rule__Iteration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8986:1: ( rule__Iteration__Group__3__Impl rule__Iteration__Group__4 )
            // InternalHypoMethod.g:8987:2: rule__Iteration__Group__3__Impl rule__Iteration__Group__4
            {
            pushFollow(FOLLOW_85);
            rule__Iteration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iteration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteration__Group__3"


    // $ANTLR start "rule__Iteration__Group__3__Impl"
    // InternalHypoMethod.g:8994:1: rule__Iteration__Group__3__Impl : ( ':' ) ;
    public final void rule__Iteration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:8998:1: ( ( ':' ) )
            // InternalHypoMethod.g:8999:1: ( ':' )
            {
            // InternalHypoMethod.g:8999:1: ( ':' )
            // InternalHypoMethod.g:9000:2: ':'
            {
             before(grammarAccess.getIterationAccess().getColonKeyword_3()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getIterationAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteration__Group__3__Impl"


    // $ANTLR start "rule__Iteration__Group__4"
    // InternalHypoMethod.g:9009:1: rule__Iteration__Group__4 : rule__Iteration__Group__4__Impl ;
    public final void rule__Iteration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9013:1: ( rule__Iteration__Group__4__Impl )
            // InternalHypoMethod.g:9014:2: rule__Iteration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Iteration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteration__Group__4"


    // $ANTLR start "rule__Iteration__Group__4__Impl"
    // InternalHypoMethod.g:9020:1: rule__Iteration__Group__4__Impl : ( ( rule__Iteration__IterationsAssignment_4 ) ) ;
    public final void rule__Iteration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9024:1: ( ( ( rule__Iteration__IterationsAssignment_4 ) ) )
            // InternalHypoMethod.g:9025:1: ( ( rule__Iteration__IterationsAssignment_4 ) )
            {
            // InternalHypoMethod.g:9025:1: ( ( rule__Iteration__IterationsAssignment_4 ) )
            // InternalHypoMethod.g:9026:2: ( rule__Iteration__IterationsAssignment_4 )
            {
             before(grammarAccess.getIterationAccess().getIterationsAssignment_4()); 
            // InternalHypoMethod.g:9027:2: ( rule__Iteration__IterationsAssignment_4 )
            // InternalHypoMethod.g:9027:3: rule__Iteration__IterationsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Iteration__IterationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIterationAccess().getIterationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteration__Group__4__Impl"


    // $ANTLR start "rule__PerformanceMeasure__Group__0"
    // InternalHypoMethod.g:9036:1: rule__PerformanceMeasure__Group__0 : rule__PerformanceMeasure__Group__0__Impl rule__PerformanceMeasure__Group__1 ;
    public final void rule__PerformanceMeasure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9040:1: ( rule__PerformanceMeasure__Group__0__Impl rule__PerformanceMeasure__Group__1 )
            // InternalHypoMethod.g:9041:2: rule__PerformanceMeasure__Group__0__Impl rule__PerformanceMeasure__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PerformanceMeasure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerformanceMeasure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__0"


    // $ANTLR start "rule__PerformanceMeasure__Group__0__Impl"
    // InternalHypoMethod.g:9048:1: rule__PerformanceMeasure__Group__0__Impl : ( '{' ) ;
    public final void rule__PerformanceMeasure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9052:1: ( ( '{' ) )
            // InternalHypoMethod.g:9053:1: ( '{' )
            {
            // InternalHypoMethod.g:9053:1: ( '{' )
            // InternalHypoMethod.g:9054:2: '{'
            {
             before(grammarAccess.getPerformanceMeasureAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getPerformanceMeasureAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__0__Impl"


    // $ANTLR start "rule__PerformanceMeasure__Group__1"
    // InternalHypoMethod.g:9063:1: rule__PerformanceMeasure__Group__1 : rule__PerformanceMeasure__Group__1__Impl rule__PerformanceMeasure__Group__2 ;
    public final void rule__PerformanceMeasure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9067:1: ( rule__PerformanceMeasure__Group__1__Impl rule__PerformanceMeasure__Group__2 )
            // InternalHypoMethod.g:9068:2: rule__PerformanceMeasure__Group__1__Impl rule__PerformanceMeasure__Group__2
            {
            pushFollow(FOLLOW_86);
            rule__PerformanceMeasure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerformanceMeasure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__1"


    // $ANTLR start "rule__PerformanceMeasure__Group__1__Impl"
    // InternalHypoMethod.g:9075:1: rule__PerformanceMeasure__Group__1__Impl : ( ( rule__PerformanceMeasure__ExpectedResponseAssignment_1 ) ) ;
    public final void rule__PerformanceMeasure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9079:1: ( ( ( rule__PerformanceMeasure__ExpectedResponseAssignment_1 ) ) )
            // InternalHypoMethod.g:9080:1: ( ( rule__PerformanceMeasure__ExpectedResponseAssignment_1 ) )
            {
            // InternalHypoMethod.g:9080:1: ( ( rule__PerformanceMeasure__ExpectedResponseAssignment_1 ) )
            // InternalHypoMethod.g:9081:2: ( rule__PerformanceMeasure__ExpectedResponseAssignment_1 )
            {
             before(grammarAccess.getPerformanceMeasureAccess().getExpectedResponseAssignment_1()); 
            // InternalHypoMethod.g:9082:2: ( rule__PerformanceMeasure__ExpectedResponseAssignment_1 )
            // InternalHypoMethod.g:9082:3: rule__PerformanceMeasure__ExpectedResponseAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PerformanceMeasure__ExpectedResponseAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPerformanceMeasureAccess().getExpectedResponseAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__1__Impl"


    // $ANTLR start "rule__PerformanceMeasure__Group__2"
    // InternalHypoMethod.g:9090:1: rule__PerformanceMeasure__Group__2 : rule__PerformanceMeasure__Group__2__Impl rule__PerformanceMeasure__Group__3 ;
    public final void rule__PerformanceMeasure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9094:1: ( rule__PerformanceMeasure__Group__2__Impl rule__PerformanceMeasure__Group__3 )
            // InternalHypoMethod.g:9095:2: rule__PerformanceMeasure__Group__2__Impl rule__PerformanceMeasure__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__PerformanceMeasure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerformanceMeasure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__2"


    // $ANTLR start "rule__PerformanceMeasure__Group__2__Impl"
    // InternalHypoMethod.g:9102:1: rule__PerformanceMeasure__Group__2__Impl : ( '=' ) ;
    public final void rule__PerformanceMeasure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9106:1: ( ( '=' ) )
            // InternalHypoMethod.g:9107:1: ( '=' )
            {
            // InternalHypoMethod.g:9107:1: ( '=' )
            // InternalHypoMethod.g:9108:2: '='
            {
             before(grammarAccess.getPerformanceMeasureAccess().getEqualsSignKeyword_2()); 
            match(input,131,FOLLOW_2); 
             after(grammarAccess.getPerformanceMeasureAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__2__Impl"


    // $ANTLR start "rule__PerformanceMeasure__Group__3"
    // InternalHypoMethod.g:9117:1: rule__PerformanceMeasure__Group__3 : rule__PerformanceMeasure__Group__3__Impl rule__PerformanceMeasure__Group__4 ;
    public final void rule__PerformanceMeasure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9121:1: ( rule__PerformanceMeasure__Group__3__Impl rule__PerformanceMeasure__Group__4 )
            // InternalHypoMethod.g:9122:2: rule__PerformanceMeasure__Group__3__Impl rule__PerformanceMeasure__Group__4
            {
            pushFollow(FOLLOW_87);
            rule__PerformanceMeasure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerformanceMeasure__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__3"


    // $ANTLR start "rule__PerformanceMeasure__Group__3__Impl"
    // InternalHypoMethod.g:9129:1: rule__PerformanceMeasure__Group__3__Impl : ( ( rule__PerformanceMeasure__ErAssignment_3 ) ) ;
    public final void rule__PerformanceMeasure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9133:1: ( ( ( rule__PerformanceMeasure__ErAssignment_3 ) ) )
            // InternalHypoMethod.g:9134:1: ( ( rule__PerformanceMeasure__ErAssignment_3 ) )
            {
            // InternalHypoMethod.g:9134:1: ( ( rule__PerformanceMeasure__ErAssignment_3 ) )
            // InternalHypoMethod.g:9135:2: ( rule__PerformanceMeasure__ErAssignment_3 )
            {
             before(grammarAccess.getPerformanceMeasureAccess().getErAssignment_3()); 
            // InternalHypoMethod.g:9136:2: ( rule__PerformanceMeasure__ErAssignment_3 )
            // InternalHypoMethod.g:9136:3: rule__PerformanceMeasure__ErAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PerformanceMeasure__ErAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPerformanceMeasureAccess().getErAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__3__Impl"


    // $ANTLR start "rule__PerformanceMeasure__Group__4"
    // InternalHypoMethod.g:9144:1: rule__PerformanceMeasure__Group__4 : rule__PerformanceMeasure__Group__4__Impl rule__PerformanceMeasure__Group__5 ;
    public final void rule__PerformanceMeasure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9148:1: ( rule__PerformanceMeasure__Group__4__Impl rule__PerformanceMeasure__Group__5 )
            // InternalHypoMethod.g:9149:2: rule__PerformanceMeasure__Group__4__Impl rule__PerformanceMeasure__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__PerformanceMeasure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerformanceMeasure__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__4"


    // $ANTLR start "rule__PerformanceMeasure__Group__4__Impl"
    // InternalHypoMethod.g:9156:1: rule__PerformanceMeasure__Group__4__Impl : ( ' +-' ) ;
    public final void rule__PerformanceMeasure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9160:1: ( ( ' +-' ) )
            // InternalHypoMethod.g:9161:1: ( ' +-' )
            {
            // InternalHypoMethod.g:9161:1: ( ' +-' )
            // InternalHypoMethod.g:9162:2: ' +-'
            {
             before(grammarAccess.getPerformanceMeasureAccess().getSpacePlusSignHyphenMinusKeyword_4()); 
            match(input,132,FOLLOW_2); 
             after(grammarAccess.getPerformanceMeasureAccess().getSpacePlusSignHyphenMinusKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__4__Impl"


    // $ANTLR start "rule__PerformanceMeasure__Group__5"
    // InternalHypoMethod.g:9171:1: rule__PerformanceMeasure__Group__5 : rule__PerformanceMeasure__Group__5__Impl rule__PerformanceMeasure__Group__6 ;
    public final void rule__PerformanceMeasure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9175:1: ( rule__PerformanceMeasure__Group__5__Impl rule__PerformanceMeasure__Group__6 )
            // InternalHypoMethod.g:9176:2: rule__PerformanceMeasure__Group__5__Impl rule__PerformanceMeasure__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__PerformanceMeasure__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerformanceMeasure__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__5"


    // $ANTLR start "rule__PerformanceMeasure__Group__5__Impl"
    // InternalHypoMethod.g:9183:1: rule__PerformanceMeasure__Group__5__Impl : ( ( rule__PerformanceMeasure__StdAssignment_5 ) ) ;
    public final void rule__PerformanceMeasure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9187:1: ( ( ( rule__PerformanceMeasure__StdAssignment_5 ) ) )
            // InternalHypoMethod.g:9188:1: ( ( rule__PerformanceMeasure__StdAssignment_5 ) )
            {
            // InternalHypoMethod.g:9188:1: ( ( rule__PerformanceMeasure__StdAssignment_5 ) )
            // InternalHypoMethod.g:9189:2: ( rule__PerformanceMeasure__StdAssignment_5 )
            {
             before(grammarAccess.getPerformanceMeasureAccess().getStdAssignment_5()); 
            // InternalHypoMethod.g:9190:2: ( rule__PerformanceMeasure__StdAssignment_5 )
            // InternalHypoMethod.g:9190:3: rule__PerformanceMeasure__StdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PerformanceMeasure__StdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPerformanceMeasureAccess().getStdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__5__Impl"


    // $ANTLR start "rule__PerformanceMeasure__Group__6"
    // InternalHypoMethod.g:9198:1: rule__PerformanceMeasure__Group__6 : rule__PerformanceMeasure__Group__6__Impl ;
    public final void rule__PerformanceMeasure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9202:1: ( rule__PerformanceMeasure__Group__6__Impl )
            // InternalHypoMethod.g:9203:2: rule__PerformanceMeasure__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PerformanceMeasure__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__6"


    // $ANTLR start "rule__PerformanceMeasure__Group__6__Impl"
    // InternalHypoMethod.g:9209:1: rule__PerformanceMeasure__Group__6__Impl : ( '}' ) ;
    public final void rule__PerformanceMeasure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9213:1: ( ( '}' ) )
            // InternalHypoMethod.g:9214:1: ( '}' )
            {
            // InternalHypoMethod.g:9214:1: ( '}' )
            // InternalHypoMethod.g:9215:2: '}'
            {
             before(grammarAccess.getPerformanceMeasureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getPerformanceMeasureAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__Group__6__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalHypoMethod.g:9225:1: rule__Model__ElementsAssignment : ( ruleExperimentOntology ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9229:1: ( ( ruleExperimentOntology ) )
            // InternalHypoMethod.g:9230:2: ( ruleExperimentOntology )
            {
            // InternalHypoMethod.g:9230:2: ( ruleExperimentOntology )
            // InternalHypoMethod.g:9231:3: ruleExperimentOntology
            {
             before(grammarAccess.getModelAccess().getElementsExperimentOntologyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExperimentOntology();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsExperimentOntologyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__ModelSection__ModNameAssignment_1"
    // InternalHypoMethod.g:9240:1: rule__ModelSection__ModNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ModelSection__ModNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9244:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9245:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9245:2: ( RULE_ID )
            // InternalHypoMethod.g:9246:3: RULE_ID
            {
             before(grammarAccess.getModelSectionAccess().getModNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelSectionAccess().getModNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__ModNameAssignment_1"


    // $ANTLR start "rule__ModelSection__MechanismsAssignment_3"
    // InternalHypoMethod.g:9255:1: rule__ModelSection__MechanismsAssignment_3 : ( ruleMechanism ) ;
    public final void rule__ModelSection__MechanismsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9259:1: ( ( ruleMechanism ) )
            // InternalHypoMethod.g:9260:2: ( ruleMechanism )
            {
            // InternalHypoMethod.g:9260:2: ( ruleMechanism )
            // InternalHypoMethod.g:9261:3: ruleMechanism
            {
             before(grammarAccess.getModelSectionAccess().getMechanismsMechanismParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMechanism();

            state._fsp--;

             after(grammarAccess.getModelSectionAccess().getMechanismsMechanismParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__MechanismsAssignment_3"


    // $ANTLR start "rule__ModelSection__EventsAssignment_4"
    // InternalHypoMethod.g:9270:1: rule__ModelSection__EventsAssignment_4 : ( ruleEventDescriptor ) ;
    public final void rule__ModelSection__EventsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9274:1: ( ( ruleEventDescriptor ) )
            // InternalHypoMethod.g:9275:2: ( ruleEventDescriptor )
            {
            // InternalHypoMethod.g:9275:2: ( ruleEventDescriptor )
            // InternalHypoMethod.g:9276:3: ruleEventDescriptor
            {
             before(grammarAccess.getModelSectionAccess().getEventsEventDescriptorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEventDescriptor();

            state._fsp--;

             after(grammarAccess.getModelSectionAccess().getEventsEventDescriptorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__EventsAssignment_4"


    // $ANTLR start "rule__ModelSection__ParametersAssignment_5"
    // InternalHypoMethod.g:9285:1: rule__ModelSection__ParametersAssignment_5 : ( ruleFactor ) ;
    public final void rule__ModelSection__ParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9289:1: ( ( ruleFactor ) )
            // InternalHypoMethod.g:9290:2: ( ruleFactor )
            {
            // InternalHypoMethod.g:9290:2: ( ruleFactor )
            // InternalHypoMethod.g:9291:3: ruleFactor
            {
             before(grammarAccess.getModelSectionAccess().getParametersFactorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getModelSectionAccess().getParametersFactorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSection__ParametersAssignment_5"


    // $ANTLR start "rule__Mechanism__MechanismNameAssignment_1"
    // InternalHypoMethod.g:9300:1: rule__Mechanism__MechanismNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mechanism__MechanismNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9304:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9305:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9305:2: ( RULE_ID )
            // InternalHypoMethod.g:9306:3: RULE_ID
            {
             before(grammarAccess.getMechanismAccess().getMechanismNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMechanismAccess().getMechanismNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__MechanismNameAssignment_1"


    // $ANTLR start "rule__Mechanism__LHSAssignment_3"
    // InternalHypoMethod.g:9315:1: rule__Mechanism__LHSAssignment_3 : ( ruleReaction ) ;
    public final void rule__Mechanism__LHSAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9319:1: ( ( ruleReaction ) )
            // InternalHypoMethod.g:9320:2: ( ruleReaction )
            {
            // InternalHypoMethod.g:9320:2: ( ruleReaction )
            // InternalHypoMethod.g:9321:3: ruleReaction
            {
             before(grammarAccess.getMechanismAccess().getLHSReactionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getMechanismAccess().getLHSReactionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__LHSAssignment_3"


    // $ANTLR start "rule__Mechanism__ConditionAssignment_4"
    // InternalHypoMethod.g:9330:1: rule__Mechanism__ConditionAssignment_4 : ( ruleGuardCondition ) ;
    public final void rule__Mechanism__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9334:1: ( ( ruleGuardCondition ) )
            // InternalHypoMethod.g:9335:2: ( ruleGuardCondition )
            {
            // InternalHypoMethod.g:9335:2: ( ruleGuardCondition )
            // InternalHypoMethod.g:9336:3: ruleGuardCondition
            {
             before(grammarAccess.getMechanismAccess().getConditionGuardConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGuardCondition();

            state._fsp--;

             after(grammarAccess.getMechanismAccess().getConditionGuardConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__ConditionAssignment_4"


    // $ANTLR start "rule__Mechanism__RHSAssignment_6"
    // InternalHypoMethod.g:9345:1: rule__Mechanism__RHSAssignment_6 : ( ruleReaction ) ;
    public final void rule__Mechanism__RHSAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9349:1: ( ( ruleReaction ) )
            // InternalHypoMethod.g:9350:2: ( ruleReaction )
            {
            // InternalHypoMethod.g:9350:2: ( ruleReaction )
            // InternalHypoMethod.g:9351:3: ruleReaction
            {
             before(grammarAccess.getMechanismAccess().getRHSReactionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getMechanismAccess().getRHSReactionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mechanism__RHSAssignment_6"


    // $ANTLR start "rule__Reaction__Agent1Assignment_0"
    // InternalHypoMethod.g:9360:1: rule__Reaction__Agent1Assignment_0 : ( RULE_ID ) ;
    public final void rule__Reaction__Agent1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9364:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9365:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9365:2: ( RULE_ID )
            // InternalHypoMethod.g:9366:3: RULE_ID
            {
             before(grammarAccess.getReactionAccess().getAgent1IDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactionAccess().getAgent1IDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Agent1Assignment_0"


    // $ANTLR start "rule__Reaction__AgentAssignment_2"
    // InternalHypoMethod.g:9375:1: rule__Reaction__AgentAssignment_2 : ( RULE_ID ) ;
    public final void rule__Reaction__AgentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9379:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9380:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9380:2: ( RULE_ID )
            // InternalHypoMethod.g:9381:3: RULE_ID
            {
             before(grammarAccess.getReactionAccess().getAgentIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactionAccess().getAgentIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__AgentAssignment_2"


    // $ANTLR start "rule__GuardCondition__GdAssignment_0"
    // InternalHypoMethod.g:9390:1: rule__GuardCondition__GdAssignment_0 : ( ( '[' ) ) ;
    public final void rule__GuardCondition__GdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9394:1: ( ( ( '[' ) ) )
            // InternalHypoMethod.g:9395:2: ( ( '[' ) )
            {
            // InternalHypoMethod.g:9395:2: ( ( '[' ) )
            // InternalHypoMethod.g:9396:3: ( '[' )
            {
             before(grammarAccess.getGuardConditionAccess().getGdLeftSquareBracketKeyword_0_0()); 
            // InternalHypoMethod.g:9397:3: ( '[' )
            // InternalHypoMethod.g:9398:4: '['
            {
             before(grammarAccess.getGuardConditionAccess().getGdLeftSquareBracketKeyword_0_0()); 
            match(input,106,FOLLOW_2); 
             after(grammarAccess.getGuardConditionAccess().getGdLeftSquareBracketKeyword_0_0()); 

            }

             after(grammarAccess.getGuardConditionAccess().getGdLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__GdAssignment_0"


    // $ANTLR start "rule__GuardCondition__Condition1Assignment_1"
    // InternalHypoMethod.g:9409:1: rule__GuardCondition__Condition1Assignment_1 : ( RULE_ID ) ;
    public final void rule__GuardCondition__Condition1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9413:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9414:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9414:2: ( RULE_ID )
            // InternalHypoMethod.g:9415:3: RULE_ID
            {
             before(grammarAccess.getGuardConditionAccess().getCondition1IDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGuardConditionAccess().getCondition1IDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__Condition1Assignment_1"


    // $ANTLR start "rule__GuardCondition__LinkAssignment_2"
    // InternalHypoMethod.g:9424:1: rule__GuardCondition__LinkAssignment_2 : ( ruleLinkOperators ) ;
    public final void rule__GuardCondition__LinkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9428:1: ( ( ruleLinkOperators ) )
            // InternalHypoMethod.g:9429:2: ( ruleLinkOperators )
            {
            // InternalHypoMethod.g:9429:2: ( ruleLinkOperators )
            // InternalHypoMethod.g:9430:3: ruleLinkOperators
            {
             before(grammarAccess.getGuardConditionAccess().getLinkLinkOperatorsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkOperators();

            state._fsp--;

             after(grammarAccess.getGuardConditionAccess().getLinkLinkOperatorsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__LinkAssignment_2"


    // $ANTLR start "rule__GuardCondition__Condition2Assignment_3"
    // InternalHypoMethod.g:9439:1: rule__GuardCondition__Condition2Assignment_3 : ( RULE_ID ) ;
    public final void rule__GuardCondition__Condition2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9443:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9444:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9444:2: ( RULE_ID )
            // InternalHypoMethod.g:9445:3: RULE_ID
            {
             before(grammarAccess.getGuardConditionAccess().getCondition2IDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGuardConditionAccess().getCondition2IDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardCondition__Condition2Assignment_3"


    // $ANTLR start "rule__EventDescriptor__EventNameAssignment_1"
    // InternalHypoMethod.g:9454:1: rule__EventDescriptor__EventNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EventDescriptor__EventNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9458:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9459:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9459:2: ( RULE_ID )
            // InternalHypoMethod.g:9460:3: RULE_ID
            {
             before(grammarAccess.getEventDescriptorAccess().getEventNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventDescriptorAccess().getEventNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDescriptor__EventNameAssignment_1"


    // $ANTLR start "rule__EventDescriptor__EventAssignment_3"
    // InternalHypoMethod.g:9469:1: rule__EventDescriptor__EventAssignment_3 : ( RULE_STRING ) ;
    public final void rule__EventDescriptor__EventAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9473:1: ( ( RULE_STRING ) )
            // InternalHypoMethod.g:9474:2: ( RULE_STRING )
            {
            // InternalHypoMethod.g:9474:2: ( RULE_STRING )
            // InternalHypoMethod.g:9475:3: RULE_STRING
            {
             before(grammarAccess.getEventDescriptorAccess().getEventSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEventDescriptorAccess().getEventSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDescriptor__EventAssignment_3"


    // $ANTLR start "rule__Factor__FactorNameAssignment_1"
    // InternalHypoMethod.g:9484:1: rule__Factor__FactorNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Factor__FactorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9488:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9489:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9489:2: ( RULE_ID )
            // InternalHypoMethod.g:9490:3: RULE_ID
            {
             before(grammarAccess.getFactorAccess().getFactorNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getFactorNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__FactorNameAssignment_1"


    // $ANTLR start "rule__Factor__FactorTypeAssignment_3"
    // InternalHypoMethod.g:9499:1: rule__Factor__FactorTypeAssignment_3 : ( ruleVariableType ) ;
    public final void rule__Factor__FactorTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9503:1: ( ( ruleVariableType ) )
            // InternalHypoMethod.g:9504:2: ( ruleVariableType )
            {
            // InternalHypoMethod.g:9504:2: ( ruleVariableType )
            // InternalHypoMethod.g:9505:3: ruleVariableType
            {
             before(grammarAccess.getFactorAccess().getFactorTypeVariableTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getFactorTypeVariableTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__FactorTypeAssignment_3"


    // $ANTLR start "rule__Factor__FactorType1Assignment_4"
    // InternalHypoMethod.g:9514:1: rule__Factor__FactorType1Assignment_4 : ( RULE_ID ) ;
    public final void rule__Factor__FactorType1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9518:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9519:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9519:2: ( RULE_ID )
            // InternalHypoMethod.g:9520:3: RULE_ID
            {
             before(grammarAccess.getFactorAccess().getFactorType1IDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getFactorType1IDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__FactorType1Assignment_4"


    // $ANTLR start "rule__Factor__FactorValueAssignment_6_2"
    // InternalHypoMethod.g:9529:1: rule__Factor__FactorValueAssignment_6_2 : ( ruleValues ) ;
    public final void rule__Factor__FactorValueAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9533:1: ( ( ruleValues ) )
            // InternalHypoMethod.g:9534:2: ( ruleValues )
            {
            // InternalHypoMethod.g:9534:2: ( ruleValues )
            // InternalHypoMethod.g:9535:3: ruleValues
            {
             before(grammarAccess.getFactorAccess().getFactorValueValuesParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getFactorValueValuesParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__FactorValueAssignment_6_2"


    // $ANTLR start "rule__Factor__FactorPropertiesAssignment_7_2"
    // InternalHypoMethod.g:9544:1: rule__Factor__FactorPropertiesAssignment_7_2 : ( ruleproperties ) ;
    public final void rule__Factor__FactorPropertiesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9548:1: ( ( ruleproperties ) )
            // InternalHypoMethod.g:9549:2: ( ruleproperties )
            {
            // InternalHypoMethod.g:9549:2: ( ruleproperties )
            // InternalHypoMethod.g:9550:3: ruleproperties
            {
             before(grammarAccess.getFactorAccess().getFactorPropertiesPropertiesParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleproperties();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getFactorPropertiesPropertiesParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__FactorPropertiesAssignment_7_2"


    // $ANTLR start "rule__Properties__PNameAssignment_0"
    // InternalHypoMethod.g:9559:1: rule__Properties__PNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Properties__PNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9563:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9564:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9564:2: ( RULE_ID )
            // InternalHypoMethod.g:9565:3: RULE_ID
            {
             before(grammarAccess.getPropertiesAccess().getPNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertiesAccess().getPNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__PNameAssignment_0"


    // $ANTLR start "rule__Properties__PValAssignment_2"
    // InternalHypoMethod.g:9574:1: rule__Properties__PValAssignment_2 : ( ruleValues ) ;
    public final void rule__Properties__PValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9578:1: ( ( ruleValues ) )
            // InternalHypoMethod.g:9579:2: ( ruleValues )
            {
            // InternalHypoMethod.g:9579:2: ( ruleValues )
            // InternalHypoMethod.g:9580:3: ruleValues
            {
             before(grammarAccess.getPropertiesAccess().getPValValuesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getPropertiesAccess().getPValValuesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__PValAssignment_2"


    // $ANTLR start "rule__Values__FValAssignment_0"
    // InternalHypoMethod.g:9589:1: rule__Values__FValAssignment_0 : ( RULE_ID ) ;
    public final void rule__Values__FValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9593:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9594:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9594:2: ( RULE_ID )
            // InternalHypoMethod.g:9595:3: RULE_ID
            {
             before(grammarAccess.getValuesAccess().getFValIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getFValIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__FValAssignment_0"


    // $ANTLR start "rule__Values__FunctionAssignment_1"
    // InternalHypoMethod.g:9604:1: rule__Values__FunctionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Values__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9608:1: ( ( RULE_STRING ) )
            // InternalHypoMethod.g:9609:2: ( RULE_STRING )
            {
            // InternalHypoMethod.g:9609:2: ( RULE_STRING )
            // InternalHypoMethod.g:9610:3: RULE_STRING
            {
             before(grammarAccess.getValuesAccess().getFunctionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getFunctionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__FunctionAssignment_1"


    // $ANTLR start "rule__Values__ValueAssignment_2"
    // InternalHypoMethod.g:9619:1: rule__Values__ValueAssignment_2 : ( RULE_RANGEVALUE ) ;
    public final void rule__Values__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9623:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:9624:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:9624:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:9625:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getValuesAccess().getValueRangeValueTerminalRuleCall_2_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getValueRangeValueTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__ValueAssignment_2"


    // $ANTLR start "rule__Values__FvalueAssignment_3"
    // InternalHypoMethod.g:9634:1: rule__Values__FvalueAssignment_3 : ( RULE_FACTORLEVELVALUE ) ;
    public final void rule__Values__FvalueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9638:1: ( ( RULE_FACTORLEVELVALUE ) )
            // InternalHypoMethod.g:9639:2: ( RULE_FACTORLEVELVALUE )
            {
            // InternalHypoMethod.g:9639:2: ( RULE_FACTORLEVELVALUE )
            // InternalHypoMethod.g:9640:3: RULE_FACTORLEVELVALUE
            {
             before(grammarAccess.getValuesAccess().getFvalueFactorLevelValueTerminalRuleCall_3_0()); 
            match(input,RULE_FACTORLEVELVALUE,FOLLOW_2); 
             after(grammarAccess.getValuesAccess().getFvalueFactorLevelValueTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__FvalueAssignment_3"


    // $ANTLR start "rule__Goals__ObjOfStudyAssignment_6"
    // InternalHypoMethod.g:9649:1: rule__Goals__ObjOfStudyAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Goals__ObjOfStudyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9653:1: ( ( RULE_STRING ) )
            // InternalHypoMethod.g:9654:2: ( RULE_STRING )
            {
            // InternalHypoMethod.g:9654:2: ( RULE_STRING )
            // InternalHypoMethod.g:9655:3: RULE_STRING
            {
             before(grammarAccess.getGoalsAccess().getObjOfStudySTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getObjOfStudySTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__ObjOfStudyAssignment_6"


    // $ANTLR start "rule__Goals__PurposeAssignment_9"
    // InternalHypoMethod.g:9664:1: rule__Goals__PurposeAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Goals__PurposeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9668:1: ( ( RULE_STRING ) )
            // InternalHypoMethod.g:9669:2: ( RULE_STRING )
            {
            // InternalHypoMethod.g:9669:2: ( RULE_STRING )
            // InternalHypoMethod.g:9670:3: RULE_STRING
            {
             before(grammarAccess.getGoalsAccess().getPurposeSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getPurposeSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__PurposeAssignment_9"


    // $ANTLR start "rule__Goals__FocusAssignment_12"
    // InternalHypoMethod.g:9679:1: rule__Goals__FocusAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Goals__FocusAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9683:1: ( ( RULE_STRING ) )
            // InternalHypoMethod.g:9684:2: ( RULE_STRING )
            {
            // InternalHypoMethod.g:9684:2: ( RULE_STRING )
            // InternalHypoMethod.g:9685:3: RULE_STRING
            {
             before(grammarAccess.getGoalsAccess().getFocusSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getFocusSTRINGTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__FocusAssignment_12"


    // $ANTLR start "rule__Goals__ViewPointAssignment_15"
    // InternalHypoMethod.g:9694:1: rule__Goals__ViewPointAssignment_15 : ( RULE_STRING ) ;
    public final void rule__Goals__ViewPointAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9698:1: ( ( RULE_STRING ) )
            // InternalHypoMethod.g:9699:2: ( RULE_STRING )
            {
            // InternalHypoMethod.g:9699:2: ( RULE_STRING )
            // InternalHypoMethod.g:9700:3: RULE_STRING
            {
             before(grammarAccess.getGoalsAccess().getViewPointSTRINGTerminalRuleCall_15_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getViewPointSTRINGTerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__ViewPointAssignment_15"


    // $ANTLR start "rule__Goals__ContextAssignment_18"
    // InternalHypoMethod.g:9709:1: rule__Goals__ContextAssignment_18 : ( RULE_STRING ) ;
    public final void rule__Goals__ContextAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9713:1: ( ( RULE_STRING ) )
            // InternalHypoMethod.g:9714:2: ( RULE_STRING )
            {
            // InternalHypoMethod.g:9714:2: ( RULE_STRING )
            // InternalHypoMethod.g:9715:3: RULE_STRING
            {
             before(grammarAccess.getGoalsAccess().getContextSTRINGTerminalRuleCall_18_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoalsAccess().getContextSTRINGTerminalRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__ContextAssignment_18"


    // $ANTLR start "rule__Hypothesis__MechHypothesisAssignment_2_3"
    // InternalHypoMethod.g:9724:1: rule__Hypothesis__MechHypothesisAssignment_2_3 : ( ruleMechHypothesis ) ;
    public final void rule__Hypothesis__MechHypothesisAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9728:1: ( ( ruleMechHypothesis ) )
            // InternalHypoMethod.g:9729:2: ( ruleMechHypothesis )
            {
            // InternalHypoMethod.g:9729:2: ( ruleMechHypothesis )
            // InternalHypoMethod.g:9730:3: ruleMechHypothesis
            {
             before(grammarAccess.getHypothesisAccess().getMechHypothesisMechHypothesisParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMechHypothesis();

            state._fsp--;

             after(grammarAccess.getHypothesisAccess().getMechHypothesisMechHypothesisParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__MechHypothesisAssignment_2_3"


    // $ANTLR start "rule__Hypothesis__EvidencesAssignment_3_2"
    // InternalHypoMethod.g:9739:1: rule__Hypothesis__EvidencesAssignment_3_2 : ( ruleEvidence ) ;
    public final void rule__Hypothesis__EvidencesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9743:1: ( ( ruleEvidence ) )
            // InternalHypoMethod.g:9744:2: ( ruleEvidence )
            {
            // InternalHypoMethod.g:9744:2: ( ruleEvidence )
            // InternalHypoMethod.g:9745:3: ruleEvidence
            {
             before(grammarAccess.getHypothesisAccess().getEvidencesEvidenceParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvidence();

            state._fsp--;

             after(grammarAccess.getHypothesisAccess().getEvidencesEvidenceParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__EvidencesAssignment_3_2"


    // $ANTLR start "rule__Hypothesis__CoherenceLinksAssignment_4_3"
    // InternalHypoMethod.g:9754:1: rule__Hypothesis__CoherenceLinksAssignment_4_3 : ( ruleCoherenceLink ) ;
    public final void rule__Hypothesis__CoherenceLinksAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9758:1: ( ( ruleCoherenceLink ) )
            // InternalHypoMethod.g:9759:2: ( ruleCoherenceLink )
            {
            // InternalHypoMethod.g:9759:2: ( ruleCoherenceLink )
            // InternalHypoMethod.g:9760:3: ruleCoherenceLink
            {
             before(grammarAccess.getHypothesisAccess().getCoherenceLinksCoherenceLinkParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCoherenceLink();

            state._fsp--;

             after(grammarAccess.getHypothesisAccess().getCoherenceLinksCoherenceLinkParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__CoherenceLinksAssignment_4_3"


    // $ANTLR start "rule__Hypothesis__RelHypothesisAssignment_5_3"
    // InternalHypoMethod.g:9769:1: rule__Hypothesis__RelHypothesisAssignment_5_3 : ( ruleRelationalQuery ) ;
    public final void rule__Hypothesis__RelHypothesisAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9773:1: ( ( ruleRelationalQuery ) )
            // InternalHypoMethod.g:9774:2: ( ruleRelationalQuery )
            {
            // InternalHypoMethod.g:9774:2: ( ruleRelationalQuery )
            // InternalHypoMethod.g:9775:3: ruleRelationalQuery
            {
             before(grammarAccess.getHypothesisAccess().getRelHypothesisRelationalQueryParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationalQuery();

            state._fsp--;

             after(grammarAccess.getHypothesisAccess().getRelHypothesisRelationalQueryParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hypothesis__RelHypothesisAssignment_5_3"


    // $ANTLR start "rule__CoherenceLink__CoherenceAssignment_0"
    // InternalHypoMethod.g:9784:1: rule__CoherenceLink__CoherenceAssignment_0 : ( ruleCoherence ) ;
    public final void rule__CoherenceLink__CoherenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9788:1: ( ( ruleCoherence ) )
            // InternalHypoMethod.g:9789:2: ( ruleCoherence )
            {
            // InternalHypoMethod.g:9789:2: ( ruleCoherence )
            // InternalHypoMethod.g:9790:3: ruleCoherence
            {
             before(grammarAccess.getCoherenceLinkAccess().getCoherenceCoherenceEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCoherence();

            state._fsp--;

             after(grammarAccess.getCoherenceLinkAccess().getCoherenceCoherenceEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__CoherenceAssignment_0"


    // $ANTLR start "rule__CoherenceLink__HypAssignment_2"
    // InternalHypoMethod.g:9799:1: rule__CoherenceLink__HypAssignment_2 : ( RULE_ID ) ;
    public final void rule__CoherenceLink__HypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9803:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9804:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9804:2: ( RULE_ID )
            // InternalHypoMethod.g:9805:3: RULE_ID
            {
             before(grammarAccess.getCoherenceLinkAccess().getHypIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoherenceLinkAccess().getHypIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__HypAssignment_2"


    // $ANTLR start "rule__CoherenceLink__EviAssignment_5"
    // InternalHypoMethod.g:9814:1: rule__CoherenceLink__EviAssignment_5 : ( RULE_ID ) ;
    public final void rule__CoherenceLink__EviAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9818:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9819:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9819:2: ( RULE_ID )
            // InternalHypoMethod.g:9820:3: RULE_ID
            {
             before(grammarAccess.getCoherenceLinkAccess().getEviIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoherenceLinkAccess().getEviIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoherenceLink__EviAssignment_5"


    // $ANTLR start "rule__MechHypothesis__MNameAssignment_0"
    // InternalHypoMethod.g:9829:1: rule__MechHypothesis__MNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MechHypothesis__MNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9833:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9834:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9834:2: ( RULE_ID )
            // InternalHypoMethod.g:9835:3: RULE_ID
            {
             before(grammarAccess.getMechHypothesisAccess().getMNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMechHypothesisAccess().getMNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MechHypothesis__MNameAssignment_0"


    // $ANTLR start "rule__MechHypothesis__AssoMechAssignment_2"
    // InternalHypoMethod.g:9844:1: rule__MechHypothesis__AssoMechAssignment_2 : ( ruleTemporalPattern ) ;
    public final void rule__MechHypothesis__AssoMechAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9848:1: ( ( ruleTemporalPattern ) )
            // InternalHypoMethod.g:9849:2: ( ruleTemporalPattern )
            {
            // InternalHypoMethod.g:9849:2: ( ruleTemporalPattern )
            // InternalHypoMethod.g:9850:3: ruleTemporalPattern
            {
             before(grammarAccess.getMechHypothesisAccess().getAssoMechTemporalPatternParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTemporalPattern();

            state._fsp--;

             after(grammarAccess.getMechHypothesisAccess().getAssoMechTemporalPatternParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MechHypothesis__AssoMechAssignment_2"


    // $ANTLR start "rule__MechHypothesis__MechanisticHypothesisAssignment_3"
    // InternalHypoMethod.g:9859:1: rule__MechHypothesis__MechanisticHypothesisAssignment_3 : ( RULE_ID ) ;
    public final void rule__MechHypothesis__MechanisticHypothesisAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9863:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9864:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9864:2: ( RULE_ID )
            // InternalHypoMethod.g:9865:3: RULE_ID
            {
             before(grammarAccess.getMechHypothesisAccess().getMechanisticHypothesisIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMechHypothesisAccess().getMechanisticHypothesisIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MechHypothesis__MechanisticHypothesisAssignment_3"


    // $ANTLR start "rule__Evidence__ENameAssignment_0"
    // InternalHypoMethod.g:9874:1: rule__Evidence__ENameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Evidence__ENameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9878:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:9879:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:9879:2: ( RULE_ID )
            // InternalHypoMethod.g:9880:3: RULE_ID
            {
             before(grammarAccess.getEvidenceAccess().getENameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvidenceAccess().getENameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__ENameAssignment_0"


    // $ANTLR start "rule__Evidence__QueryAssignment_2"
    // InternalHypoMethod.g:9889:1: rule__Evidence__QueryAssignment_2 : ( ruleTemporalPattern ) ;
    public final void rule__Evidence__QueryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9893:1: ( ( ruleTemporalPattern ) )
            // InternalHypoMethod.g:9894:2: ( ruleTemporalPattern )
            {
            // InternalHypoMethod.g:9894:2: ( ruleTemporalPattern )
            // InternalHypoMethod.g:9895:3: ruleTemporalPattern
            {
             before(grammarAccess.getEvidenceAccess().getQueryTemporalPatternParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTemporalPattern();

            state._fsp--;

             after(grammarAccess.getEvidenceAccess().getQueryTemporalPatternParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__QueryAssignment_2"


    // $ANTLR start "rule__Evidence__ObjOfStudyAssignment_6"
    // InternalHypoMethod.g:9904:1: rule__Evidence__ObjOfStudyAssignment_6 : ( RULE_RANGEVALUE ) ;
    public final void rule__Evidence__ObjOfStudyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9908:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:9909:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:9909:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:9910:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getEvidenceAccess().getObjOfStudyRangeValueTerminalRuleCall_6_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getEvidenceAccess().getObjOfStudyRangeValueTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evidence__ObjOfStudyAssignment_6"


    // $ANTLR start "rule__TemporalPattern__L2Assignment_1"
    // InternalHypoMethod.g:9919:1: rule__TemporalPattern__L2Assignment_1 : ( ruleLinks ) ;
    public final void rule__TemporalPattern__L2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9923:1: ( ( ruleLinks ) )
            // InternalHypoMethod.g:9924:2: ( ruleLinks )
            {
            // InternalHypoMethod.g:9924:2: ( ruleLinks )
            // InternalHypoMethod.g:9925:3: ruleLinks
            {
             before(grammarAccess.getTemporalPatternAccess().getL2LinksEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLinks();

            state._fsp--;

             after(grammarAccess.getTemporalPatternAccess().getL2LinksEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__L2Assignment_1"


    // $ANTLR start "rule__TemporalPattern__ExpAssignment_2"
    // InternalHypoMethod.g:9934:1: rule__TemporalPattern__ExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__TemporalPattern__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9938:1: ( ( ruleExpression ) )
            // InternalHypoMethod.g:9939:2: ( ruleExpression )
            {
            // InternalHypoMethod.g:9939:2: ( ruleExpression )
            // InternalHypoMethod.g:9940:3: ruleExpression
            {
             before(grammarAccess.getTemporalPatternAccess().getExpExpressionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTemporalPatternAccess().getExpExpressionEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__ExpAssignment_2"


    // $ANTLR start "rule__TemporalPattern__Op1Assignment_3_0"
    // InternalHypoMethod.g:9949:1: rule__TemporalPattern__Op1Assignment_3_0 : ( ruleTemporal ) ;
    public final void rule__TemporalPattern__Op1Assignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9953:1: ( ( ruleTemporal ) )
            // InternalHypoMethod.g:9954:2: ( ruleTemporal )
            {
            // InternalHypoMethod.g:9954:2: ( ruleTemporal )
            // InternalHypoMethod.g:9955:3: ruleTemporal
            {
             before(grammarAccess.getTemporalPatternAccess().getOp1TemporalEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTemporal();

            state._fsp--;

             after(grammarAccess.getTemporalPatternAccess().getOp1TemporalEnumRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Op1Assignment_3_0"


    // $ANTLR start "rule__TemporalPattern__Op2Assignment_3_1"
    // InternalHypoMethod.g:9964:1: rule__TemporalPattern__Op2Assignment_3_1 : ( ruleLogical ) ;
    public final void rule__TemporalPattern__Op2Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9968:1: ( ( ruleLogical ) )
            // InternalHypoMethod.g:9969:2: ( ruleLogical )
            {
            // InternalHypoMethod.g:9969:2: ( ruleLogical )
            // InternalHypoMethod.g:9970:3: ruleLogical
            {
             before(grammarAccess.getTemporalPatternAccess().getOp2LogicalEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLogical();

            state._fsp--;

             after(grammarAccess.getTemporalPatternAccess().getOp2LogicalEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Op2Assignment_3_1"


    // $ANTLR start "rule__TemporalPattern__L3Assignment_4"
    // InternalHypoMethod.g:9979:1: rule__TemporalPattern__L3Assignment_4 : ( ruleLinks ) ;
    public final void rule__TemporalPattern__L3Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9983:1: ( ( ruleLinks ) )
            // InternalHypoMethod.g:9984:2: ( ruleLinks )
            {
            // InternalHypoMethod.g:9984:2: ( ruleLinks )
            // InternalHypoMethod.g:9985:3: ruleLinks
            {
             before(grammarAccess.getTemporalPatternAccess().getL3LinksEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLinks();

            state._fsp--;

             after(grammarAccess.getTemporalPatternAccess().getL3LinksEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__L3Assignment_4"


    // $ANTLR start "rule__Condition__ConditionAssignment_0"
    // InternalHypoMethod.g:9994:1: rule__Condition__ConditionAssignment_0 : ( ruleEvent ) ;
    public final void rule__Condition__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:9998:1: ( ( ruleEvent ) )
            // InternalHypoMethod.g:9999:2: ( ruleEvent )
            {
            // InternalHypoMethod.g:9999:2: ( ruleEvent )
            // InternalHypoMethod.g:10000:3: ruleEvent
            {
             before(grammarAccess.getConditionAccess().getConditionEventParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getConditionEventParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ConditionAssignment_0"


    // $ANTLR start "rule__Condition__LoAssignment_1"
    // InternalHypoMethod.g:10009:1: rule__Condition__LoAssignment_1 : ( ruleLinkOperators ) ;
    public final void rule__Condition__LoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10013:1: ( ( ruleLinkOperators ) )
            // InternalHypoMethod.g:10014:2: ( ruleLinkOperators )
            {
            // InternalHypoMethod.g:10014:2: ( ruleLinkOperators )
            // InternalHypoMethod.g:10015:3: ruleLinkOperators
            {
             before(grammarAccess.getConditionAccess().getLoLinkOperatorsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkOperators();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getLoLinkOperatorsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__LoAssignment_1"


    // $ANTLR start "rule__Condition__EAssignment_2"
    // InternalHypoMethod.g:10024:1: rule__Condition__EAssignment_2 : ( ruleEvent ) ;
    public final void rule__Condition__EAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10028:1: ( ( ruleEvent ) )
            // InternalHypoMethod.g:10029:2: ( ruleEvent )
            {
            // InternalHypoMethod.g:10029:2: ( ruleEvent )
            // InternalHypoMethod.g:10030:3: ruleEvent
            {
             before(grammarAccess.getConditionAccess().getEEventParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getEEventParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__EAssignment_2"


    // $ANTLR start "rule__Condition__Exp1Assignment_3"
    // InternalHypoMethod.g:10039:1: rule__Condition__Exp1Assignment_3 : ( ruleExpression ) ;
    public final void rule__Condition__Exp1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10043:1: ( ( ruleExpression ) )
            // InternalHypoMethod.g:10044:2: ( ruleExpression )
            {
            // InternalHypoMethod.g:10044:2: ( ruleExpression )
            // InternalHypoMethod.g:10045:3: ruleExpression
            {
             before(grammarAccess.getConditionAccess().getExp1ExpressionEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getExp1ExpressionEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Exp1Assignment_3"


    // $ANTLR start "rule__Condition__VAssignment_4"
    // InternalHypoMethod.g:10054:1: rule__Condition__VAssignment_4 : ( RULE_RANGEVALUE ) ;
    public final void rule__Condition__VAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10058:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10059:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10059:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10060:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getConditionAccess().getVRangeValueTerminalRuleCall_4_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getVRangeValueTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__VAssignment_4"


    // $ANTLR start "rule__Simultaneous__Sim1Assignment_1"
    // InternalHypoMethod.g:10069:1: rule__Simultaneous__Sim1Assignment_1 : ( ruleRe ) ;
    public final void rule__Simultaneous__Sim1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10073:1: ( ( ruleRe ) )
            // InternalHypoMethod.g:10074:2: ( ruleRe )
            {
            // InternalHypoMethod.g:10074:2: ( ruleRe )
            // InternalHypoMethod.g:10075:3: ruleRe
            {
             before(grammarAccess.getSimultaneousAccess().getSim1ReParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRe();

            state._fsp--;

             after(grammarAccess.getSimultaneousAccess().getSim1ReParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Sim1Assignment_1"


    // $ANTLR start "rule__Simultaneous__LogAssignment_2_0"
    // InternalHypoMethod.g:10084:1: rule__Simultaneous__LogAssignment_2_0 : ( ruleLogical ) ;
    public final void rule__Simultaneous__LogAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10088:1: ( ( ruleLogical ) )
            // InternalHypoMethod.g:10089:2: ( ruleLogical )
            {
            // InternalHypoMethod.g:10089:2: ( ruleLogical )
            // InternalHypoMethod.g:10090:3: ruleLogical
            {
             before(grammarAccess.getSimultaneousAccess().getLogLogicalEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLogical();

            state._fsp--;

             after(grammarAccess.getSimultaneousAccess().getLogLogicalEnumRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__LogAssignment_2_0"


    // $ANTLR start "rule__Simultaneous__Sim2Assignment_2_1"
    // InternalHypoMethod.g:10099:1: rule__Simultaneous__Sim2Assignment_2_1 : ( ruleRe ) ;
    public final void rule__Simultaneous__Sim2Assignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10103:1: ( ( ruleRe ) )
            // InternalHypoMethod.g:10104:2: ( ruleRe )
            {
            // InternalHypoMethod.g:10104:2: ( ruleRe )
            // InternalHypoMethod.g:10105:3: ruleRe
            {
             before(grammarAccess.getSimultaneousAccess().getSim2ReParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRe();

            state._fsp--;

             after(grammarAccess.getSimultaneousAccess().getSim2ReParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simultaneous__Sim2Assignment_2_1"


    // $ANTLR start "rule__Dispersed__DispAssignment"
    // InternalHypoMethod.g:10114:1: rule__Dispersed__DispAssignment : ( ruleRe ) ;
    public final void rule__Dispersed__DispAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10118:1: ( ( ruleRe ) )
            // InternalHypoMethod.g:10119:2: ( ruleRe )
            {
            // InternalHypoMethod.g:10119:2: ( ruleRe )
            // InternalHypoMethod.g:10120:3: ruleRe
            {
             before(grammarAccess.getDispersedAccess().getDispReParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRe();

            state._fsp--;

             after(grammarAccess.getDispersedAccess().getDispReParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dispersed__DispAssignment"


    // $ANTLR start "rule__Query1__FactorAssignment_1"
    // InternalHypoMethod.g:10129:1: rule__Query1__FactorAssignment_1 : ( RULE_ID ) ;
    public final void rule__Query1__FactorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10133:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10134:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10134:2: ( RULE_ID )
            // InternalHypoMethod.g:10135:3: RULE_ID
            {
             before(grammarAccess.getQuery1Access().getFactorIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getFactorIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__FactorAssignment_1"


    // $ANTLR start "rule__Query1__ControlAssignment_2"
    // InternalHypoMethod.g:10144:1: rule__Query1__ControlAssignment_2 : ( RULE_ID ) ;
    public final void rule__Query1__ControlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10148:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10149:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10149:2: ( RULE_ID )
            // InternalHypoMethod.g:10150:3: RULE_ID
            {
             before(grammarAccess.getQuery1Access().getControlIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getControlIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__ControlAssignment_2"


    // $ANTLR start "rule__Query1__XAssignment_4"
    // InternalHypoMethod.g:10159:1: rule__Query1__XAssignment_4 : ( RULE_RANGEVALUE ) ;
    public final void rule__Query1__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10163:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10164:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10164:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10165:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getQuery1Access().getXRangeValueTerminalRuleCall_4_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getXRangeValueTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__XAssignment_4"


    // $ANTLR start "rule__Query1__Start1Assignment_7_1"
    // InternalHypoMethod.g:10174:1: rule__Query1__Start1Assignment_7_1 : ( RULE_RANGEVALUE ) ;
    public final void rule__Query1__Start1Assignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10178:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10179:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10179:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10180:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getQuery1Access().getStart1RangeValueTerminalRuleCall_7_1_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getStart1RangeValueTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Start1Assignment_7_1"


    // $ANTLR start "rule__Query1__End1Assignment_7_3"
    // InternalHypoMethod.g:10189:1: rule__Query1__End1Assignment_7_3 : ( RULE_RANGEVALUE ) ;
    public final void rule__Query1__End1Assignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10193:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10194:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10194:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10195:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getQuery1Access().getEnd1RangeValueTerminalRuleCall_7_3_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getEnd1RangeValueTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__End1Assignment_7_3"


    // $ANTLR start "rule__Query1__ResponseAssignment_9"
    // InternalHypoMethod.g:10204:1: rule__Query1__ResponseAssignment_9 : ( RULE_ID ) ;
    public final void rule__Query1__ResponseAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10208:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10209:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10209:2: ( RULE_ID )
            // InternalHypoMethod.g:10210:3: RULE_ID
            {
             before(grammarAccess.getQuery1Access().getResponseIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getResponseIDTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__ResponseAssignment_9"


    // $ANTLR start "rule__Query1__YAssignment_11"
    // InternalHypoMethod.g:10219:1: rule__Query1__YAssignment_11 : ( RULE_RANGEVALUE ) ;
    public final void rule__Query1__YAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10223:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10224:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10224:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10225:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getQuery1Access().getYRangeValueTerminalRuleCall_11_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getYRangeValueTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__YAssignment_11"


    // $ANTLR start "rule__Query1__Start2Assignment_12_1"
    // InternalHypoMethod.g:10234:1: rule__Query1__Start2Assignment_12_1 : ( RULE_RANGEVALUE ) ;
    public final void rule__Query1__Start2Assignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10238:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10239:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10239:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10240:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getQuery1Access().getStart2RangeValueTerminalRuleCall_12_1_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getStart2RangeValueTerminalRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__Start2Assignment_12_1"


    // $ANTLR start "rule__Query1__End2Assignment_12_3"
    // InternalHypoMethod.g:10249:1: rule__Query1__End2Assignment_12_3 : ( RULE_RANGEVALUE ) ;
    public final void rule__Query1__End2Assignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10253:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10254:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10254:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10255:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getQuery1Access().getEnd2RangeValueTerminalRuleCall_12_3_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getQuery1Access().getEnd2RangeValueTerminalRuleCall_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query1__End2Assignment_12_3"


    // $ANTLR start "rule__Query2__Function1Assignment_1"
    // InternalHypoMethod.g:10264:1: rule__Query2__Function1Assignment_1 : ( ruleFunction ) ;
    public final void rule__Query2__Function1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10268:1: ( ( ruleFunction ) )
            // InternalHypoMethod.g:10269:2: ( ruleFunction )
            {
            // InternalHypoMethod.g:10269:2: ( ruleFunction )
            // InternalHypoMethod.g:10270:3: ruleFunction
            {
             before(grammarAccess.getQuery2Access().getFunction1FunctionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getQuery2Access().getFunction1FunctionEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Function1Assignment_1"


    // $ANTLR start "rule__Query2__Response1Assignment_2"
    // InternalHypoMethod.g:10279:1: rule__Query2__Response1Assignment_2 : ( RULE_ID ) ;
    public final void rule__Query2__Response1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10283:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10284:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10284:2: ( RULE_ID )
            // InternalHypoMethod.g:10285:3: RULE_ID
            {
             before(grammarAccess.getQuery2Access().getResponse1IDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuery2Access().getResponse1IDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Response1Assignment_2"


    // $ANTLR start "rule__Query2__Factor1Assignment_3"
    // InternalHypoMethod.g:10294:1: rule__Query2__Factor1Assignment_3 : ( RULE_ID ) ;
    public final void rule__Query2__Factor1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10298:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10299:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10299:2: ( RULE_ID )
            // InternalHypoMethod.g:10300:3: RULE_ID
            {
             before(grammarAccess.getQuery2Access().getFactor1IDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuery2Access().getFactor1IDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Factor1Assignment_3"


    // $ANTLR start "rule__Query2__Function2Assignment_5"
    // InternalHypoMethod.g:10309:1: rule__Query2__Function2Assignment_5 : ( ruleFunction ) ;
    public final void rule__Query2__Function2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10313:1: ( ( ruleFunction ) )
            // InternalHypoMethod.g:10314:2: ( ruleFunction )
            {
            // InternalHypoMethod.g:10314:2: ( ruleFunction )
            // InternalHypoMethod.g:10315:3: ruleFunction
            {
             before(grammarAccess.getQuery2Access().getFunction2FunctionEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getQuery2Access().getFunction2FunctionEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Function2Assignment_5"


    // $ANTLR start "rule__Query2__Response2Assignment_6"
    // InternalHypoMethod.g:10324:1: rule__Query2__Response2Assignment_6 : ( RULE_ID ) ;
    public final void rule__Query2__Response2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10328:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10329:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10329:2: ( RULE_ID )
            // InternalHypoMethod.g:10330:3: RULE_ID
            {
             before(grammarAccess.getQuery2Access().getResponse2IDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuery2Access().getResponse2IDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Response2Assignment_6"


    // $ANTLR start "rule__Query2__Factor2Assignment_7"
    // InternalHypoMethod.g:10339:1: rule__Query2__Factor2Assignment_7 : ( RULE_ID ) ;
    public final void rule__Query2__Factor2Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10343:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10344:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10344:2: ( RULE_ID )
            // InternalHypoMethod.g:10345:3: RULE_ID
            {
             before(grammarAccess.getQuery2Access().getFactor2IDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuery2Access().getFactor2IDTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query2__Factor2Assignment_7"


    // $ANTLR start "rule__Query3__Factor1Assignment_1_0"
    // InternalHypoMethod.g:10354:1: rule__Query3__Factor1Assignment_1_0 : ( RULE_ID ) ;
    public final void rule__Query3__Factor1Assignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10358:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10359:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10359:2: ( RULE_ID )
            // InternalHypoMethod.g:10360:3: RULE_ID
            {
             before(grammarAccess.getQuery3Access().getFactor1IDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getFactor1IDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Factor1Assignment_1_0"


    // $ANTLR start "rule__Query3__Control1Assignment_1_1"
    // InternalHypoMethod.g:10369:1: rule__Query3__Control1Assignment_1_1 : ( RULE_ID ) ;
    public final void rule__Query3__Control1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10373:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10374:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10374:2: ( RULE_ID )
            // InternalHypoMethod.g:10375:3: RULE_ID
            {
             before(grammarAccess.getQuery3Access().getControl1IDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getControl1IDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Control1Assignment_1_1"


    // $ANTLR start "rule__Query3__Level2Assignment_1_3_2"
    // InternalHypoMethod.g:10384:1: rule__Query3__Level2Assignment_1_3_2 : ( ruleLevels ) ;
    public final void rule__Query3__Level2Assignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10388:1: ( ( ruleLevels ) )
            // InternalHypoMethod.g:10389:2: ( ruleLevels )
            {
            // InternalHypoMethod.g:10389:2: ( ruleLevels )
            // InternalHypoMethod.g:10390:3: ruleLevels
            {
             before(grammarAccess.getQuery3Access().getLevel2LevelsEnumRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLevels();

            state._fsp--;

             after(grammarAccess.getQuery3Access().getLevel2LevelsEnumRuleCall_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Level2Assignment_1_3_2"


    // $ANTLR start "rule__Query3__X2Assignment_1_4"
    // InternalHypoMethod.g:10399:1: rule__Query3__X2Assignment_1_4 : ( RULE_RANGEVALUE ) ;
    public final void rule__Query3__X2Assignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10403:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10404:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10404:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10405:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getQuery3Access().getX2RangeValueTerminalRuleCall_1_4_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getX2RangeValueTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__X2Assignment_1_4"


    // $ANTLR start "rule__Query3__Response1Assignment_3_0"
    // InternalHypoMethod.g:10414:1: rule__Query3__Response1Assignment_3_0 : ( RULE_ID ) ;
    public final void rule__Query3__Response1Assignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10418:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10419:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10419:2: ( RULE_ID )
            // InternalHypoMethod.g:10420:3: RULE_ID
            {
             before(grammarAccess.getQuery3Access().getResponse1IDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getResponse1IDTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Response1Assignment_3_0"


    // $ANTLR start "rule__Query3__Level4Assignment_3_2_2"
    // InternalHypoMethod.g:10429:1: rule__Query3__Level4Assignment_3_2_2 : ( ruleLevels ) ;
    public final void rule__Query3__Level4Assignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10433:1: ( ( ruleLevels ) )
            // InternalHypoMethod.g:10434:2: ( ruleLevels )
            {
            // InternalHypoMethod.g:10434:2: ( ruleLevels )
            // InternalHypoMethod.g:10435:3: ruleLevels
            {
             before(grammarAccess.getQuery3Access().getLevel4LevelsEnumRuleCall_3_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLevels();

            state._fsp--;

             after(grammarAccess.getQuery3Access().getLevel4LevelsEnumRuleCall_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Level4Assignment_3_2_2"


    // $ANTLR start "rule__Query3__X4Assignment_3_3"
    // InternalHypoMethod.g:10444:1: rule__Query3__X4Assignment_3_3 : ( RULE_RANGEVALUE ) ;
    public final void rule__Query3__X4Assignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10448:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10449:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10449:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10450:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getQuery3Access().getX4RangeValueTerminalRuleCall_3_3_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getX4RangeValueTerminalRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__X4Assignment_3_3"


    // $ANTLR start "rule__Query3__LevelAssignment_5_0"
    // InternalHypoMethod.g:10459:1: rule__Query3__LevelAssignment_5_0 : ( ruleLevels ) ;
    public final void rule__Query3__LevelAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10463:1: ( ( ruleLevels ) )
            // InternalHypoMethod.g:10464:2: ( ruleLevels )
            {
            // InternalHypoMethod.g:10464:2: ( ruleLevels )
            // InternalHypoMethod.g:10465:3: ruleLevels
            {
             before(grammarAccess.getQuery3Access().getLevelLevelsEnumRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLevels();

            state._fsp--;

             after(grammarAccess.getQuery3Access().getLevelLevelsEnumRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__LevelAssignment_5_0"


    // $ANTLR start "rule__Query3__FactorAssignment_5_2"
    // InternalHypoMethod.g:10474:1: rule__Query3__FactorAssignment_5_2 : ( RULE_ID ) ;
    public final void rule__Query3__FactorAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10478:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10479:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10479:2: ( RULE_ID )
            // InternalHypoMethod.g:10480:3: RULE_ID
            {
             before(grammarAccess.getQuery3Access().getFactorIDTerminalRuleCall_5_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getFactorIDTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__FactorAssignment_5_2"


    // $ANTLR start "rule__Query3__ControlAssignment_5_3"
    // InternalHypoMethod.g:10489:1: rule__Query3__ControlAssignment_5_3 : ( RULE_ID ) ;
    public final void rule__Query3__ControlAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10493:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10494:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10494:2: ( RULE_ID )
            // InternalHypoMethod.g:10495:3: RULE_ID
            {
             before(grammarAccess.getQuery3Access().getControlIDTerminalRuleCall_5_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getControlIDTerminalRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__ControlAssignment_5_3"


    // $ANTLR start "rule__Query3__ResponseAssignment_5_4"
    // InternalHypoMethod.g:10504:1: rule__Query3__ResponseAssignment_5_4 : ( RULE_ID ) ;
    public final void rule__Query3__ResponseAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10508:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10509:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10509:2: ( RULE_ID )
            // InternalHypoMethod.g:10510:3: RULE_ID
            {
             before(grammarAccess.getQuery3Access().getResponseIDTerminalRuleCall_5_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getResponseIDTerminalRuleCall_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__ResponseAssignment_5_4"


    // $ANTLR start "rule__Query3__Start1Assignment_5_7"
    // InternalHypoMethod.g:10519:1: rule__Query3__Start1Assignment_5_7 : ( RULE_RANGEVALUE ) ;
    public final void rule__Query3__Start1Assignment_5_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10523:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10524:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10524:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10525:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getQuery3Access().getStart1RangeValueTerminalRuleCall_5_7_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getStart1RangeValueTerminalRuleCall_5_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__Start1Assignment_5_7"


    // $ANTLR start "rule__Query3__End1Assignment_5_9"
    // InternalHypoMethod.g:10534:1: rule__Query3__End1Assignment_5_9 : ( RULE_RANGEVALUE ) ;
    public final void rule__Query3__End1Assignment_5_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10538:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10539:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10539:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10540:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getQuery3Access().getEnd1RangeValueTerminalRuleCall_5_9_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getQuery3Access().getEnd1RangeValueTerminalRuleCall_5_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query3__End1Assignment_5_9"


    // $ANTLR start "rule__Experiment__ExpNameAssignment_1"
    // InternalHypoMethod.g:10549:1: rule__Experiment__ExpNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Experiment__ExpNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10553:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10554:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10554:2: ( RULE_ID )
            // InternalHypoMethod.g:10555:3: RULE_ID
            {
             before(grammarAccess.getExperimentAccess().getExpNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getExpNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__ExpNameAssignment_1"


    // $ANTLR start "rule__Experiment__ExpDesignAssignment_4"
    // InternalHypoMethod.g:10564:1: rule__Experiment__ExpDesignAssignment_4 : ( ruleDesign ) ;
    public final void rule__Experiment__ExpDesignAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10568:1: ( ( ruleDesign ) )
            // InternalHypoMethod.g:10569:2: ( ruleDesign )
            {
            // InternalHypoMethod.g:10569:2: ( ruleDesign )
            // InternalHypoMethod.g:10570:3: ruleDesign
            {
             before(grammarAccess.getExperimentAccess().getExpDesignDesignParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDesign();

            state._fsp--;

             after(grammarAccess.getExperimentAccess().getExpDesignDesignParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__ExpDesignAssignment_4"


    // $ANTLR start "rule__Experiment__PerfMeasureAssignment_7"
    // InternalHypoMethod.g:10579:1: rule__Experiment__PerfMeasureAssignment_7 : ( rulePerformanceMeasure ) ;
    public final void rule__Experiment__PerfMeasureAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10583:1: ( ( rulePerformanceMeasure ) )
            // InternalHypoMethod.g:10584:2: ( rulePerformanceMeasure )
            {
            // InternalHypoMethod.g:10584:2: ( rulePerformanceMeasure )
            // InternalHypoMethod.g:10585:3: rulePerformanceMeasure
            {
             before(grammarAccess.getExperimentAccess().getPerfMeasurePerformanceMeasureParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePerformanceMeasure();

            state._fsp--;

             after(grammarAccess.getExperimentAccess().getPerfMeasurePerformanceMeasureParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__PerfMeasureAssignment_7"


    // $ANTLR start "rule__Design__DesignTypeAssignment_1_1"
    // InternalHypoMethod.g:10594:1: rule__Design__DesignTypeAssignment_1_1 : ( ruleDesignType ) ;
    public final void rule__Design__DesignTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10598:1: ( ( ruleDesignType ) )
            // InternalHypoMethod.g:10599:2: ( ruleDesignType )
            {
            // InternalHypoMethod.g:10599:2: ( ruleDesignType )
            // InternalHypoMethod.g:10600:3: ruleDesignType
            {
             before(grammarAccess.getDesignAccess().getDesignTypeDesignTypeEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDesignType();

            state._fsp--;

             after(grammarAccess.getDesignAccess().getDesignTypeDesignTypeEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__DesignTypeAssignment_1_1"


    // $ANTLR start "rule__Design__ConstraintAssignment_2_1"
    // InternalHypoMethod.g:10609:1: rule__Design__ConstraintAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Design__ConstraintAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10613:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10614:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10614:2: ( RULE_ID )
            // InternalHypoMethod.g:10615:3: RULE_ID
            {
             before(grammarAccess.getDesignAccess().getConstraintIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDesignAccess().getConstraintIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__ConstraintAssignment_2_1"


    // $ANTLR start "rule__Design__IterationAssignment_3"
    // InternalHypoMethod.g:10624:1: rule__Design__IterationAssignment_3 : ( ruleIteration ) ;
    public final void rule__Design__IterationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10628:1: ( ( ruleIteration ) )
            // InternalHypoMethod.g:10629:2: ( ruleIteration )
            {
            // InternalHypoMethod.g:10629:2: ( ruleIteration )
            // InternalHypoMethod.g:10630:3: ruleIteration
            {
             before(grammarAccess.getDesignAccess().getIterationIterationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIteration();

            state._fsp--;

             after(grammarAccess.getDesignAccess().getIterationIterationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__IterationAssignment_3"


    // $ANTLR start "rule__Design__VariablesAssignment_4_1"
    // InternalHypoMethod.g:10639:1: rule__Design__VariablesAssignment_4_1 : ( ruleVariables ) ;
    public final void rule__Design__VariablesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10643:1: ( ( ruleVariables ) )
            // InternalHypoMethod.g:10644:2: ( ruleVariables )
            {
            // InternalHypoMethod.g:10644:2: ( ruleVariables )
            // InternalHypoMethod.g:10645:3: ruleVariables
            {
             before(grammarAccess.getDesignAccess().getVariablesVariablesParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariables();

            state._fsp--;

             after(grammarAccess.getDesignAccess().getVariablesVariablesParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Design__VariablesAssignment_4_1"


    // $ANTLR start "rule__Variables__IndependentVariablesAssignment_1"
    // InternalHypoMethod.g:10654:1: rule__Variables__IndependentVariablesAssignment_1 : ( ruleIndependentVariables ) ;
    public final void rule__Variables__IndependentVariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10658:1: ( ( ruleIndependentVariables ) )
            // InternalHypoMethod.g:10659:2: ( ruleIndependentVariables )
            {
            // InternalHypoMethod.g:10659:2: ( ruleIndependentVariables )
            // InternalHypoMethod.g:10660:3: ruleIndependentVariables
            {
             before(grammarAccess.getVariablesAccess().getIndependentVariablesIndependentVariablesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIndependentVariables();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getIndependentVariablesIndependentVariablesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__IndependentVariablesAssignment_1"


    // $ANTLR start "rule__Variables__ControlVariablesAssignment_2"
    // InternalHypoMethod.g:10669:1: rule__Variables__ControlVariablesAssignment_2 : ( ruleControlVariables ) ;
    public final void rule__Variables__ControlVariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10673:1: ( ( ruleControlVariables ) )
            // InternalHypoMethod.g:10674:2: ( ruleControlVariables )
            {
            // InternalHypoMethod.g:10674:2: ( ruleControlVariables )
            // InternalHypoMethod.g:10675:3: ruleControlVariables
            {
             before(grammarAccess.getVariablesAccess().getControlVariablesControlVariablesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleControlVariables();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getControlVariablesControlVariablesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__ControlVariablesAssignment_2"


    // $ANTLR start "rule__Variables__DependentVariablesAssignment_3"
    // InternalHypoMethod.g:10684:1: rule__Variables__DependentVariablesAssignment_3 : ( ruleDependentVariables ) ;
    public final void rule__Variables__DependentVariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10688:1: ( ( ruleDependentVariables ) )
            // InternalHypoMethod.g:10689:2: ( ruleDependentVariables )
            {
            // InternalHypoMethod.g:10689:2: ( ruleDependentVariables )
            // InternalHypoMethod.g:10690:3: ruleDependentVariables
            {
             before(grammarAccess.getVariablesAccess().getDependentVariablesDependentVariablesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDependentVariables();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getDependentVariablesDependentVariablesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__DependentVariablesAssignment_3"


    // $ANTLR start "rule__IndependentVariables__VariablesAssignment_3"
    // InternalHypoMethod.g:10699:1: rule__IndependentVariables__VariablesAssignment_3 : ( ruleFactorLevels ) ;
    public final void rule__IndependentVariables__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10703:1: ( ( ruleFactorLevels ) )
            // InternalHypoMethod.g:10704:2: ( ruleFactorLevels )
            {
            // InternalHypoMethod.g:10704:2: ( ruleFactorLevels )
            // InternalHypoMethod.g:10705:3: ruleFactorLevels
            {
             before(grammarAccess.getIndependentVariablesAccess().getVariablesFactorLevelsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFactorLevels();

            state._fsp--;

             after(grammarAccess.getIndependentVariablesAccess().getVariablesFactorLevelsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndependentVariables__VariablesAssignment_3"


    // $ANTLR start "rule__ControlVariables__ControlNameAssignment_3_0"
    // InternalHypoMethod.g:10714:1: rule__ControlVariables__ControlNameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__ControlVariables__ControlNameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10718:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10719:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10719:2: ( RULE_ID )
            // InternalHypoMethod.g:10720:3: RULE_ID
            {
             before(grammarAccess.getControlVariablesAccess().getControlNameIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getControlVariablesAccess().getControlNameIDTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__ControlNameAssignment_3_0"


    // $ANTLR start "rule__ControlVariables__ControlTypeAssignment_3_3"
    // InternalHypoMethod.g:10729:1: rule__ControlVariables__ControlTypeAssignment_3_3 : ( ruleVariableType ) ;
    public final void rule__ControlVariables__ControlTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10733:1: ( ( ruleVariableType ) )
            // InternalHypoMethod.g:10734:2: ( ruleVariableType )
            {
            // InternalHypoMethod.g:10734:2: ( ruleVariableType )
            // InternalHypoMethod.g:10735:3: ruleVariableType
            {
             before(grammarAccess.getControlVariablesAccess().getControlTypeVariableTypeEnumRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getControlVariablesAccess().getControlTypeVariableTypeEnumRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__ControlTypeAssignment_3_3"


    // $ANTLR start "rule__ControlVariables__ControlValueAssignment_3_7"
    // InternalHypoMethod.g:10744:1: rule__ControlVariables__ControlValueAssignment_3_7 : ( ruleValues ) ;
    public final void rule__ControlVariables__ControlValueAssignment_3_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10748:1: ( ( ruleValues ) )
            // InternalHypoMethod.g:10749:2: ( ruleValues )
            {
            // InternalHypoMethod.g:10749:2: ( ruleValues )
            // InternalHypoMethod.g:10750:3: ruleValues
            {
             before(grammarAccess.getControlVariablesAccess().getControlValueValuesParserRuleCall_3_7_0()); 
            pushFollow(FOLLOW_2);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getControlVariablesAccess().getControlValueValuesParserRuleCall_3_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlVariables__ControlValueAssignment_3_7"


    // $ANTLR start "rule__DependentVariables__ResponseNameAssignment_3"
    // InternalHypoMethod.g:10759:1: rule__DependentVariables__ResponseNameAssignment_3 : ( ruleResponse ) ;
    public final void rule__DependentVariables__ResponseNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10763:1: ( ( ruleResponse ) )
            // InternalHypoMethod.g:10764:2: ( ruleResponse )
            {
            // InternalHypoMethod.g:10764:2: ( ruleResponse )
            // InternalHypoMethod.g:10765:3: ruleResponse
            {
             before(grammarAccess.getDependentVariablesAccess().getResponseNameResponseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getDependentVariablesAccess().getResponseNameResponseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependentVariables__ResponseNameAssignment_3"


    // $ANTLR start "rule__FactorLevels__FacNameAssignment_0"
    // InternalHypoMethod.g:10774:1: rule__FactorLevels__FacNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FactorLevels__FacNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10778:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10779:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10779:2: ( RULE_ID )
            // InternalHypoMethod.g:10780:3: RULE_ID
            {
             before(grammarAccess.getFactorLevelsAccess().getFacNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactorLevelsAccess().getFacNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__FacNameAssignment_0"


    // $ANTLR start "rule__FactorLevels__LAssignment_5"
    // InternalHypoMethod.g:10789:1: rule__FactorLevels__LAssignment_5 : ( RULE_FACTORLEVELVALUE ) ;
    public final void rule__FactorLevels__LAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10793:1: ( ( RULE_FACTORLEVELVALUE ) )
            // InternalHypoMethod.g:10794:2: ( RULE_FACTORLEVELVALUE )
            {
            // InternalHypoMethod.g:10794:2: ( RULE_FACTORLEVELVALUE )
            // InternalHypoMethod.g:10795:3: RULE_FACTORLEVELVALUE
            {
             before(grammarAccess.getFactorLevelsAccess().getLFactorLevelValueTerminalRuleCall_5_0()); 
            match(input,RULE_FACTORLEVELVALUE,FOLLOW_2); 
             after(grammarAccess.getFactorLevelsAccess().getLFactorLevelValueTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__LAssignment_5"


    // $ANTLR start "rule__FactorLevels__L1Assignment_6_0"
    // InternalHypoMethod.g:10804:1: rule__FactorLevels__L1Assignment_6_0 : ( ruleLevels ) ;
    public final void rule__FactorLevels__L1Assignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10808:1: ( ( ruleLevels ) )
            // InternalHypoMethod.g:10809:2: ( ruleLevels )
            {
            // InternalHypoMethod.g:10809:2: ( ruleLevels )
            // InternalHypoMethod.g:10810:3: ruleLevels
            {
             before(grammarAccess.getFactorLevelsAccess().getL1LevelsEnumRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLevels();

            state._fsp--;

             after(grammarAccess.getFactorLevelsAccess().getL1LevelsEnumRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__L1Assignment_6_0"


    // $ANTLR start "rule__FactorLevels__L2Assignment_6_2"
    // InternalHypoMethod.g:10819:1: rule__FactorLevels__L2Assignment_6_2 : ( ruleLevels ) ;
    public final void rule__FactorLevels__L2Assignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10823:1: ( ( ruleLevels ) )
            // InternalHypoMethod.g:10824:2: ( ruleLevels )
            {
            // InternalHypoMethod.g:10824:2: ( ruleLevels )
            // InternalHypoMethod.g:10825:3: ruleLevels
            {
             before(grammarAccess.getFactorLevelsAccess().getL2LevelsEnumRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLevels();

            state._fsp--;

             after(grammarAccess.getFactorLevelsAccess().getL2LevelsEnumRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__L2Assignment_6_2"


    // $ANTLR start "rule__FactorLevels__Start1Assignment_6_5"
    // InternalHypoMethod.g:10834:1: rule__FactorLevels__Start1Assignment_6_5 : ( RULE_RANGEVALUE ) ;
    public final void rule__FactorLevels__Start1Assignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10838:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10839:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10839:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10840:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getFactorLevelsAccess().getStart1RangeValueTerminalRuleCall_6_5_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getFactorLevelsAccess().getStart1RangeValueTerminalRuleCall_6_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__Start1Assignment_6_5"


    // $ANTLR start "rule__FactorLevels__End1Assignment_6_7"
    // InternalHypoMethod.g:10849:1: rule__FactorLevels__End1Assignment_6_7 : ( RULE_RANGEVALUE ) ;
    public final void rule__FactorLevels__End1Assignment_6_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10853:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10854:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10854:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10855:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getFactorLevelsAccess().getEnd1RangeValueTerminalRuleCall_6_7_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getFactorLevelsAccess().getEnd1RangeValueTerminalRuleCall_6_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorLevels__End1Assignment_6_7"


    // $ANTLR start "rule__Response__ResponseNameAssignment_0"
    // InternalHypoMethod.g:10864:1: rule__Response__ResponseNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Response__ResponseNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10868:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10869:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10869:2: ( RULE_ID )
            // InternalHypoMethod.g:10870:3: RULE_ID
            {
             before(grammarAccess.getResponseAccess().getResponseNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getResponseNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__ResponseNameAssignment_0"


    // $ANTLR start "rule__Response__ResponseTypeAssignment_3"
    // InternalHypoMethod.g:10879:1: rule__Response__ResponseTypeAssignment_3 : ( ruleResponseType ) ;
    public final void rule__Response__ResponseTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10883:1: ( ( ruleResponseType ) )
            // InternalHypoMethod.g:10884:2: ( ruleResponseType )
            {
            // InternalHypoMethod.g:10884:2: ( ruleResponseType )
            // InternalHypoMethod.g:10885:3: ruleResponseType
            {
             before(grammarAccess.getResponseAccess().getResponseTypeResponseTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleResponseType();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getResponseTypeResponseTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__ResponseTypeAssignment_3"


    // $ANTLR start "rule__Iteration__IterationsAssignment_4"
    // InternalHypoMethod.g:10894:1: rule__Iteration__IterationsAssignment_4 : ( RULE_INT ) ;
    public final void rule__Iteration__IterationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10898:1: ( ( RULE_INT ) )
            // InternalHypoMethod.g:10899:2: ( RULE_INT )
            {
            // InternalHypoMethod.g:10899:2: ( RULE_INT )
            // InternalHypoMethod.g:10900:3: RULE_INT
            {
             before(grammarAccess.getIterationAccess().getIterationsINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIterationAccess().getIterationsINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iteration__IterationsAssignment_4"


    // $ANTLR start "rule__PerformanceMeasure__ExpectedResponseAssignment_1"
    // InternalHypoMethod.g:10909:1: rule__PerformanceMeasure__ExpectedResponseAssignment_1 : ( RULE_ID ) ;
    public final void rule__PerformanceMeasure__ExpectedResponseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10913:1: ( ( RULE_ID ) )
            // InternalHypoMethod.g:10914:2: ( RULE_ID )
            {
            // InternalHypoMethod.g:10914:2: ( RULE_ID )
            // InternalHypoMethod.g:10915:3: RULE_ID
            {
             before(grammarAccess.getPerformanceMeasureAccess().getExpectedResponseIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPerformanceMeasureAccess().getExpectedResponseIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__ExpectedResponseAssignment_1"


    // $ANTLR start "rule__PerformanceMeasure__ErAssignment_3"
    // InternalHypoMethod.g:10924:1: rule__PerformanceMeasure__ErAssignment_3 : ( RULE_RANGEVALUE ) ;
    public final void rule__PerformanceMeasure__ErAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10928:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10929:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10929:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10930:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getPerformanceMeasureAccess().getErRangeValueTerminalRuleCall_3_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getPerformanceMeasureAccess().getErRangeValueTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__ErAssignment_3"


    // $ANTLR start "rule__PerformanceMeasure__StdAssignment_5"
    // InternalHypoMethod.g:10939:1: rule__PerformanceMeasure__StdAssignment_5 : ( RULE_RANGEVALUE ) ;
    public final void rule__PerformanceMeasure__StdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHypoMethod.g:10943:1: ( ( RULE_RANGEVALUE ) )
            // InternalHypoMethod.g:10944:2: ( RULE_RANGEVALUE )
            {
            // InternalHypoMethod.g:10944:2: ( RULE_RANGEVALUE )
            // InternalHypoMethod.g:10945:3: RULE_RANGEVALUE
            {
             before(grammarAccess.getPerformanceMeasureAccess().getStdRangeValueTerminalRuleCall_5_0()); 
            match(input,RULE_RANGEVALUE,FOLLOW_2); 
             after(grammarAccess.getPerformanceMeasureAccess().getStdRangeValueTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformanceMeasure__StdAssignment_5"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA55 dfa55 = new DFA55(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\13\uffff\2\10";
    static final String dfa_3s = "\1\153\1\4\1\uffff\2\4\1\uffff\1\44\1\4\1\uffff\1\4\1\44\2\4";
    static final String dfa_4s = "\1\160\1\156\1\uffff\1\44\1\162\1\uffff\1\44\1\157\1\uffff\1\161\1\44\1\162\1\161";
    static final String dfa_5s = "\2\uffff\1\2\2\uffff\1\3\2\uffff\1\1\4\uffff";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\1\2",
            "\1\3\37\uffff\1\4\111\uffff\1\5",
            "",
            "\1\6\37\uffff\1\4",
            "\1\5\1\uffff\1\7\35\uffff\1\5\16\uffff\1\5\70\uffff\2\10\1\11\1\10\2\uffff\1\5",
            "",
            "\1\4",
            "\1\5\37\uffff\1\5\16\uffff\1\5\70\uffff\2\10\1\11\1\10",
            "",
            "\1\12\154\uffff\1\5",
            "\1\13",
            "\1\5\1\uffff\1\14\54\uffff\1\5\31\uffff\1\10\35\uffff\1\10\3\uffff\2\10\2\5",
            "\1\5\56\uffff\1\5\31\uffff\1\10\35\uffff\1\10\3\uffff\2\10\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1293:1: rule__RelationalQuery__Alternatives : ( ( ruleQuery1 ) | ( ruleQuery2 ) | ( ruleQuery3 ) );";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\1\3\21\uffff";
    static final String dfa_10s = "\1\4\1\uffff\1\4\1\uffff\1\63\4\4\1\uffff\1\4\2\63\1\147\2\4\1\63\1\147";
    static final String dfa_11s = "\1\152\1\uffff\1\4\1\uffff\1\146\1\147\3\4\1\uffff\1\4\1\121\1\146\2\147\1\4\1\121\1\147";
    static final String dfa_12s = "\1\uffff\1\1\1\uffff\1\2\5\uffff\1\1\10\uffff";
    static final String dfa_13s = "\22\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\uffff\1\3\33\uffff\24\3\27\uffff\1\3\32\uffff\1\3\1\uffff\1\2",
            "",
            "\1\4",
            "",
            "\1\6\1\7\1\10\33\uffff\1\11\24\uffff\1\5",
            "\1\12\142\uffff\1\13",
            "\1\14",
            "\1\14",
            "\1\14",
            "",
            "\1\15",
            "\1\6\1\7\1\10\33\uffff\1\11",
            "\1\6\1\7\1\10\33\uffff\1\11\24\uffff\1\16",
            "\1\13",
            "\1\17\142\uffff\1\20",
            "\1\21",
            "\1\6\1\7\1\10\33\uffff\1\11",
            "\1\20"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4978:2: ( rule__Condition__EAssignment_2 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x0020000202000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C6000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000040000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000FFFE010L,0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000003F0000010L,0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000003C00002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x03C0000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x03C0000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0001080000002000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000002L,0x0001080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000010L,0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000010L,0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000012L,0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000010L,0x0000050000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x003FFFFC00000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x003FFF0000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000C0FFFE050L,0x0000040000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x003FFF0000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000040L,0x0000F00000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L,0x0000800000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xFC08000000000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0xFC00000000000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000001000000010L,0x0000400000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000001000000012L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000010L,0x0002000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0008000000000040L,0x0004000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0700000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x5000000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000038L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});

}