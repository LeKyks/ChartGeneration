package fr.univcotedazurl3ia.project.ide.contentassist.antlr.internal;

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
import fr.univcotedazurl3ia.project.services.ChartItGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChartItParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Blue'", "'Red'", "'Green'", "'Orange'", "'Yellow'", "'Purple'", "'Black'", "'Brown'", "'Pink'", "'Darkgrey'", "'LightGrey'", "'White'", "'Pie'", "'Bar'", "'Area'", "'Bubble'", "'Line'", "'P'", "':'", "'{'", "'loadData'", "'}'", "'col'", "'chart'", "','", "'('", "')'", "'data'", "'='", "'type'", "'backgroundColor'", "'label'", "'color'"
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

    	public void setGrammarAccess(ChartItGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalChartIt.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalChartIt.g:54:1: ( ruleProgram EOF )
            // InternalChartIt.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalChartIt.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalChartIt.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalChartIt.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalChartIt.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalChartIt.g:69:3: ( rule__Program__Group__0 )
            // InternalChartIt.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleData"
    // InternalChartIt.g:78:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalChartIt.g:79:1: ( ruleData EOF )
            // InternalChartIt.g:80:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalChartIt.g:87:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:91:2: ( ( ( rule__Data__Group__0 ) ) )
            // InternalChartIt.g:92:2: ( ( rule__Data__Group__0 ) )
            {
            // InternalChartIt.g:92:2: ( ( rule__Data__Group__0 ) )
            // InternalChartIt.g:93:3: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // InternalChartIt.g:94:3: ( rule__Data__Group__0 )
            // InternalChartIt.g:94:4: rule__Data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleChart"
    // InternalChartIt.g:103:1: entryRuleChart : ruleChart EOF ;
    public final void entryRuleChart() throws RecognitionException {
        try {
            // InternalChartIt.g:104:1: ( ruleChart EOF )
            // InternalChartIt.g:105:1: ruleChart EOF
            {
             before(grammarAccess.getChartRule()); 
            pushFollow(FOLLOW_1);
            ruleChart();

            state._fsp--;

             after(grammarAccess.getChartRule()); 
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
    // $ANTLR end "entryRuleChart"


    // $ANTLR start "ruleChart"
    // InternalChartIt.g:112:1: ruleChart : ( ( rule__Chart__Group__0 ) ) ;
    public final void ruleChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:116:2: ( ( ( rule__Chart__Group__0 ) ) )
            // InternalChartIt.g:117:2: ( ( rule__Chart__Group__0 ) )
            {
            // InternalChartIt.g:117:2: ( ( rule__Chart__Group__0 ) )
            // InternalChartIt.g:118:3: ( rule__Chart__Group__0 )
            {
             before(grammarAccess.getChartAccess().getGroup()); 
            // InternalChartIt.g:119:3: ( rule__Chart__Group__0 )
            // InternalChartIt.g:119:4: rule__Chart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChart"


    // $ANTLR start "entryRuleCol"
    // InternalChartIt.g:128:1: entryRuleCol : ruleCol EOF ;
    public final void entryRuleCol() throws RecognitionException {
        try {
            // InternalChartIt.g:129:1: ( ruleCol EOF )
            // InternalChartIt.g:130:1: ruleCol EOF
            {
             before(grammarAccess.getColRule()); 
            pushFollow(FOLLOW_1);
            ruleCol();

            state._fsp--;

             after(grammarAccess.getColRule()); 
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
    // $ANTLR end "entryRuleCol"


    // $ANTLR start "ruleCol"
    // InternalChartIt.g:137:1: ruleCol : ( ( rule__Col__Group__0 ) ) ;
    public final void ruleCol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:141:2: ( ( ( rule__Col__Group__0 ) ) )
            // InternalChartIt.g:142:2: ( ( rule__Col__Group__0 ) )
            {
            // InternalChartIt.g:142:2: ( ( rule__Col__Group__0 ) )
            // InternalChartIt.g:143:3: ( rule__Col__Group__0 )
            {
             before(grammarAccess.getColAccess().getGroup()); 
            // InternalChartIt.g:144:3: ( rule__Col__Group__0 )
            // InternalChartIt.g:144:4: rule__Col__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Col__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCol"


    // $ANTLR start "ruleColor"
    // InternalChartIt.g:153:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:157:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalChartIt.g:158:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalChartIt.g:158:2: ( ( rule__Color__Alternatives ) )
            // InternalChartIt.g:159:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalChartIt.g:160:3: ( rule__Color__Alternatives )
            // InternalChartIt.g:160:4: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleChartType"
    // InternalChartIt.g:169:1: ruleChartType : ( ( rule__ChartType__Alternatives ) ) ;
    public final void ruleChartType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:173:1: ( ( ( rule__ChartType__Alternatives ) ) )
            // InternalChartIt.g:174:2: ( ( rule__ChartType__Alternatives ) )
            {
            // InternalChartIt.g:174:2: ( ( rule__ChartType__Alternatives ) )
            // InternalChartIt.g:175:3: ( rule__ChartType__Alternatives )
            {
             before(grammarAccess.getChartTypeAccess().getAlternatives()); 
            // InternalChartIt.g:176:3: ( rule__ChartType__Alternatives )
            // InternalChartIt.g:176:4: rule__ChartType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ChartType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChartTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChartType"


    // $ANTLR start "rule__Color__Alternatives"
    // InternalChartIt.g:184:1: rule__Color__Alternatives : ( ( ( 'Blue' ) ) | ( ( 'Red' ) ) | ( ( 'Green' ) ) | ( ( 'Orange' ) ) | ( ( 'Yellow' ) ) | ( ( 'Purple' ) ) | ( ( 'Black' ) ) | ( ( 'Brown' ) ) | ( ( 'Pink' ) ) | ( ( 'Darkgrey' ) ) | ( ( 'LightGrey' ) ) | ( ( 'White' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:188:1: ( ( ( 'Blue' ) ) | ( ( 'Red' ) ) | ( ( 'Green' ) ) | ( ( 'Orange' ) ) | ( ( 'Yellow' ) ) | ( ( 'Purple' ) ) | ( ( 'Black' ) ) | ( ( 'Brown' ) ) | ( ( 'Pink' ) ) | ( ( 'Darkgrey' ) ) | ( ( 'LightGrey' ) ) | ( ( 'White' ) ) )
            int alt1=12;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            case 18:
                {
                alt1=8;
                }
                break;
            case 19:
                {
                alt1=9;
                }
                break;
            case 20:
                {
                alt1=10;
                }
                break;
            case 21:
                {
                alt1=11;
                }
                break;
            case 22:
                {
                alt1=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalChartIt.g:189:2: ( ( 'Blue' ) )
                    {
                    // InternalChartIt.g:189:2: ( ( 'Blue' ) )
                    // InternalChartIt.g:190:3: ( 'Blue' )
                    {
                     before(grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_0()); 
                    // InternalChartIt.g:191:3: ( 'Blue' )
                    // InternalChartIt.g:191:4: 'Blue'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChartIt.g:195:2: ( ( 'Red' ) )
                    {
                    // InternalChartIt.g:195:2: ( ( 'Red' ) )
                    // InternalChartIt.g:196:3: ( 'Red' )
                    {
                     before(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_1()); 
                    // InternalChartIt.g:197:3: ( 'Red' )
                    // InternalChartIt.g:197:4: 'Red'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChartIt.g:201:2: ( ( 'Green' ) )
                    {
                    // InternalChartIt.g:201:2: ( ( 'Green' ) )
                    // InternalChartIt.g:202:3: ( 'Green' )
                    {
                     before(grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_2()); 
                    // InternalChartIt.g:203:3: ( 'Green' )
                    // InternalChartIt.g:203:4: 'Green'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChartIt.g:207:2: ( ( 'Orange' ) )
                    {
                    // InternalChartIt.g:207:2: ( ( 'Orange' ) )
                    // InternalChartIt.g:208:3: ( 'Orange' )
                    {
                     before(grammarAccess.getColorAccess().getOrangeEnumLiteralDeclaration_3()); 
                    // InternalChartIt.g:209:3: ( 'Orange' )
                    // InternalChartIt.g:209:4: 'Orange'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getOrangeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChartIt.g:213:2: ( ( 'Yellow' ) )
                    {
                    // InternalChartIt.g:213:2: ( ( 'Yellow' ) )
                    // InternalChartIt.g:214:3: ( 'Yellow' )
                    {
                     before(grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_4()); 
                    // InternalChartIt.g:215:3: ( 'Yellow' )
                    // InternalChartIt.g:215:4: 'Yellow'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalChartIt.g:219:2: ( ( 'Purple' ) )
                    {
                    // InternalChartIt.g:219:2: ( ( 'Purple' ) )
                    // InternalChartIt.g:220:3: ( 'Purple' )
                    {
                     before(grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_5()); 
                    // InternalChartIt.g:221:3: ( 'Purple' )
                    // InternalChartIt.g:221:4: 'Purple'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalChartIt.g:225:2: ( ( 'Black' ) )
                    {
                    // InternalChartIt.g:225:2: ( ( 'Black' ) )
                    // InternalChartIt.g:226:3: ( 'Black' )
                    {
                     before(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_6()); 
                    // InternalChartIt.g:227:3: ( 'Black' )
                    // InternalChartIt.g:227:4: 'Black'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalChartIt.g:231:2: ( ( 'Brown' ) )
                    {
                    // InternalChartIt.g:231:2: ( ( 'Brown' ) )
                    // InternalChartIt.g:232:3: ( 'Brown' )
                    {
                     before(grammarAccess.getColorAccess().getBrownEnumLiteralDeclaration_7()); 
                    // InternalChartIt.g:233:3: ( 'Brown' )
                    // InternalChartIt.g:233:4: 'Brown'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBrownEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalChartIt.g:237:2: ( ( 'Pink' ) )
                    {
                    // InternalChartIt.g:237:2: ( ( 'Pink' ) )
                    // InternalChartIt.g:238:3: ( 'Pink' )
                    {
                     before(grammarAccess.getColorAccess().getPinkEnumLiteralDeclaration_8()); 
                    // InternalChartIt.g:239:3: ( 'Pink' )
                    // InternalChartIt.g:239:4: 'Pink'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getPinkEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalChartIt.g:243:2: ( ( 'Darkgrey' ) )
                    {
                    // InternalChartIt.g:243:2: ( ( 'Darkgrey' ) )
                    // InternalChartIt.g:244:3: ( 'Darkgrey' )
                    {
                     before(grammarAccess.getColorAccess().getDarkGreyEnumLiteralDeclaration_9()); 
                    // InternalChartIt.g:245:3: ( 'Darkgrey' )
                    // InternalChartIt.g:245:4: 'Darkgrey'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getDarkGreyEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalChartIt.g:249:2: ( ( 'LightGrey' ) )
                    {
                    // InternalChartIt.g:249:2: ( ( 'LightGrey' ) )
                    // InternalChartIt.g:250:3: ( 'LightGrey' )
                    {
                     before(grammarAccess.getColorAccess().getLightGreyEnumLiteralDeclaration_10()); 
                    // InternalChartIt.g:251:3: ( 'LightGrey' )
                    // InternalChartIt.g:251:4: 'LightGrey'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getLightGreyEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalChartIt.g:255:2: ( ( 'White' ) )
                    {
                    // InternalChartIt.g:255:2: ( ( 'White' ) )
                    // InternalChartIt.g:256:3: ( 'White' )
                    {
                     before(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_11()); 
                    // InternalChartIt.g:257:3: ( 'White' )
                    // InternalChartIt.g:257:4: 'White'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_11()); 

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
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__ChartType__Alternatives"
    // InternalChartIt.g:265:1: rule__ChartType__Alternatives : ( ( ( 'Pie' ) ) | ( ( 'Bar' ) ) | ( ( 'Area' ) ) | ( ( 'Bubble' ) ) | ( ( 'Line' ) ) );
    public final void rule__ChartType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:269:1: ( ( ( 'Pie' ) ) | ( ( 'Bar' ) ) | ( ( 'Area' ) ) | ( ( 'Bubble' ) ) | ( ( 'Line' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalChartIt.g:270:2: ( ( 'Pie' ) )
                    {
                    // InternalChartIt.g:270:2: ( ( 'Pie' ) )
                    // InternalChartIt.g:271:3: ( 'Pie' )
                    {
                     before(grammarAccess.getChartTypeAccess().getPieEnumLiteralDeclaration_0()); 
                    // InternalChartIt.g:272:3: ( 'Pie' )
                    // InternalChartIt.g:272:4: 'Pie'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getPieEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChartIt.g:276:2: ( ( 'Bar' ) )
                    {
                    // InternalChartIt.g:276:2: ( ( 'Bar' ) )
                    // InternalChartIt.g:277:3: ( 'Bar' )
                    {
                     before(grammarAccess.getChartTypeAccess().getBarEnumLiteralDeclaration_1()); 
                    // InternalChartIt.g:278:3: ( 'Bar' )
                    // InternalChartIt.g:278:4: 'Bar'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getBarEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChartIt.g:282:2: ( ( 'Area' ) )
                    {
                    // InternalChartIt.g:282:2: ( ( 'Area' ) )
                    // InternalChartIt.g:283:3: ( 'Area' )
                    {
                     before(grammarAccess.getChartTypeAccess().getAreaEnumLiteralDeclaration_2()); 
                    // InternalChartIt.g:284:3: ( 'Area' )
                    // InternalChartIt.g:284:4: 'Area'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getAreaEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChartIt.g:288:2: ( ( 'Bubble' ) )
                    {
                    // InternalChartIt.g:288:2: ( ( 'Bubble' ) )
                    // InternalChartIt.g:289:3: ( 'Bubble' )
                    {
                     before(grammarAccess.getChartTypeAccess().getBubbleEnumLiteralDeclaration_3()); 
                    // InternalChartIt.g:290:3: ( 'Bubble' )
                    // InternalChartIt.g:290:4: 'Bubble'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getBubbleEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChartIt.g:294:2: ( ( 'Line' ) )
                    {
                    // InternalChartIt.g:294:2: ( ( 'Line' ) )
                    // InternalChartIt.g:295:3: ( 'Line' )
                    {
                     before(grammarAccess.getChartTypeAccess().getLineEnumLiteralDeclaration_4()); 
                    // InternalChartIt.g:296:3: ( 'Line' )
                    // InternalChartIt.g:296:4: 'Line'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getChartTypeAccess().getLineEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__ChartType__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalChartIt.g:304:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:308:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalChartIt.g:309:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalChartIt.g:316:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:320:1: ( ( () ) )
            // InternalChartIt.g:321:1: ( () )
            {
            // InternalChartIt.g:321:1: ( () )
            // InternalChartIt.g:322:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalChartIt.g:323:2: ()
            // InternalChartIt.g:323:3: 
            {
            }

             after(grammarAccess.getProgramAccess().getProgramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalChartIt.g:331:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:335:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalChartIt.g:336:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalChartIt.g:343:1: rule__Program__Group__1__Impl : ( 'P' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:347:1: ( ( 'P' ) )
            // InternalChartIt.g:348:1: ( 'P' )
            {
            // InternalChartIt.g:348:1: ( 'P' )
            // InternalChartIt.g:349:2: 'P'
            {
             before(grammarAccess.getProgramAccess().getPKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getPKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalChartIt.g:358:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:362:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalChartIt.g:363:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalChartIt.g:370:1: rule__Program__Group__2__Impl : ( ':' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:374:1: ( ( ':' ) )
            // InternalChartIt.g:375:1: ( ':' )
            {
            // InternalChartIt.g:375:1: ( ':' )
            // InternalChartIt.g:376:2: ':'
            {
             before(grammarAccess.getProgramAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalChartIt.g:385:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:389:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalChartIt.g:390:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalChartIt.g:397:1: rule__Program__Group__3__Impl : ( ( rule__Program__NameAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:401:1: ( ( ( rule__Program__NameAssignment_3 ) ) )
            // InternalChartIt.g:402:1: ( ( rule__Program__NameAssignment_3 ) )
            {
            // InternalChartIt.g:402:1: ( ( rule__Program__NameAssignment_3 ) )
            // InternalChartIt.g:403:2: ( rule__Program__NameAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_3()); 
            // InternalChartIt.g:404:2: ( rule__Program__NameAssignment_3 )
            // InternalChartIt.g:404:3: rule__Program__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalChartIt.g:412:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:416:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalChartIt.g:417:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalChartIt.g:424:1: rule__Program__Group__4__Impl : ( '{' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:428:1: ( ( '{' ) )
            // InternalChartIt.g:429:1: ( '{' )
            {
            // InternalChartIt.g:429:1: ( '{' )
            // InternalChartIt.g:430:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // InternalChartIt.g:439:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:443:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // InternalChartIt.g:444:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // InternalChartIt.g:451:1: rule__Program__Group__5__Impl : ( 'loadData' ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:455:1: ( ( 'loadData' ) )
            // InternalChartIt.g:456:1: ( 'loadData' )
            {
            // InternalChartIt.g:456:1: ( 'loadData' )
            // InternalChartIt.g:457:2: 'loadData'
            {
             before(grammarAccess.getProgramAccess().getLoadDataKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLoadDataKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__Program__Group__6"
    // InternalChartIt.g:466:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:470:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // InternalChartIt.g:471:2: rule__Program__Group__6__Impl rule__Program__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6"


    // $ANTLR start "rule__Program__Group__6__Impl"
    // InternalChartIt.g:478:1: rule__Program__Group__6__Impl : ( '{' ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:482:1: ( ( '{' ) )
            // InternalChartIt.g:483:1: ( '{' )
            {
            // InternalChartIt.g:483:1: ( '{' )
            // InternalChartIt.g:484:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6__Impl"


    // $ANTLR start "rule__Program__Group__7"
    // InternalChartIt.g:493:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:497:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // InternalChartIt.g:498:2: rule__Program__Group__7__Impl rule__Program__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__7"


    // $ANTLR start "rule__Program__Group__7__Impl"
    // InternalChartIt.g:505:1: rule__Program__Group__7__Impl : ( ( ( rule__Program__LoadDataAssignment_7 ) ) ( ( rule__Program__LoadDataAssignment_7 )* ) ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:509:1: ( ( ( ( rule__Program__LoadDataAssignment_7 ) ) ( ( rule__Program__LoadDataAssignment_7 )* ) ) )
            // InternalChartIt.g:510:1: ( ( ( rule__Program__LoadDataAssignment_7 ) ) ( ( rule__Program__LoadDataAssignment_7 )* ) )
            {
            // InternalChartIt.g:510:1: ( ( ( rule__Program__LoadDataAssignment_7 ) ) ( ( rule__Program__LoadDataAssignment_7 )* ) )
            // InternalChartIt.g:511:2: ( ( rule__Program__LoadDataAssignment_7 ) ) ( ( rule__Program__LoadDataAssignment_7 )* )
            {
            // InternalChartIt.g:511:2: ( ( rule__Program__LoadDataAssignment_7 ) )
            // InternalChartIt.g:512:3: ( rule__Program__LoadDataAssignment_7 )
            {
             before(grammarAccess.getProgramAccess().getLoadDataAssignment_7()); 
            // InternalChartIt.g:513:3: ( rule__Program__LoadDataAssignment_7 )
            // InternalChartIt.g:513:4: rule__Program__LoadDataAssignment_7
            {
            pushFollow(FOLLOW_9);
            rule__Program__LoadDataAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getLoadDataAssignment_7()); 

            }

            // InternalChartIt.g:516:2: ( ( rule__Program__LoadDataAssignment_7 )* )
            // InternalChartIt.g:517:3: ( rule__Program__LoadDataAssignment_7 )*
            {
             before(grammarAccess.getProgramAccess().getLoadDataAssignment_7()); 
            // InternalChartIt.g:518:3: ( rule__Program__LoadDataAssignment_7 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalChartIt.g:518:4: rule__Program__LoadDataAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Program__LoadDataAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getLoadDataAssignment_7()); 

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
    // $ANTLR end "rule__Program__Group__7__Impl"


    // $ANTLR start "rule__Program__Group__8"
    // InternalChartIt.g:527:1: rule__Program__Group__8 : rule__Program__Group__8__Impl rule__Program__Group__9 ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:531:1: ( rule__Program__Group__8__Impl rule__Program__Group__9 )
            // InternalChartIt.g:532:2: rule__Program__Group__8__Impl rule__Program__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__8"


    // $ANTLR start "rule__Program__Group__8__Impl"
    // InternalChartIt.g:539:1: rule__Program__Group__8__Impl : ( ( rule__Program__Group_8__0 )* ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:543:1: ( ( ( rule__Program__Group_8__0 )* ) )
            // InternalChartIt.g:544:1: ( ( rule__Program__Group_8__0 )* )
            {
            // InternalChartIt.g:544:1: ( ( rule__Program__Group_8__0 )* )
            // InternalChartIt.g:545:2: ( rule__Program__Group_8__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_8()); 
            // InternalChartIt.g:546:2: ( rule__Program__Group_8__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==35) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalChartIt.g:546:3: rule__Program__Group_8__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Program__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__8__Impl"


    // $ANTLR start "rule__Program__Group__9"
    // InternalChartIt.g:554:1: rule__Program__Group__9 : rule__Program__Group__9__Impl rule__Program__Group__10 ;
    public final void rule__Program__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:558:1: ( rule__Program__Group__9__Impl rule__Program__Group__10 )
            // InternalChartIt.g:559:2: rule__Program__Group__9__Impl rule__Program__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Program__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__9"


    // $ANTLR start "rule__Program__Group__9__Impl"
    // InternalChartIt.g:566:1: rule__Program__Group__9__Impl : ( '}' ) ;
    public final void rule__Program__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:570:1: ( ( '}' ) )
            // InternalChartIt.g:571:1: ( '}' )
            {
            // InternalChartIt.g:571:1: ( '}' )
            // InternalChartIt.g:572:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__9__Impl"


    // $ANTLR start "rule__Program__Group__10"
    // InternalChartIt.g:581:1: rule__Program__Group__10 : rule__Program__Group__10__Impl rule__Program__Group__11 ;
    public final void rule__Program__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:585:1: ( rule__Program__Group__10__Impl rule__Program__Group__11 )
            // InternalChartIt.g:586:2: rule__Program__Group__10__Impl rule__Program__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__10"


    // $ANTLR start "rule__Program__Group__10__Impl"
    // InternalChartIt.g:593:1: rule__Program__Group__10__Impl : ( 'col' ) ;
    public final void rule__Program__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:597:1: ( ( 'col' ) )
            // InternalChartIt.g:598:1: ( 'col' )
            {
            // InternalChartIt.g:598:1: ( 'col' )
            // InternalChartIt.g:599:2: 'col'
            {
             before(grammarAccess.getProgramAccess().getColKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getColKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__10__Impl"


    // $ANTLR start "rule__Program__Group__11"
    // InternalChartIt.g:608:1: rule__Program__Group__11 : rule__Program__Group__11__Impl rule__Program__Group__12 ;
    public final void rule__Program__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:612:1: ( rule__Program__Group__11__Impl rule__Program__Group__12 )
            // InternalChartIt.g:613:2: rule__Program__Group__11__Impl rule__Program__Group__12
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__11"


    // $ANTLR start "rule__Program__Group__11__Impl"
    // InternalChartIt.g:620:1: rule__Program__Group__11__Impl : ( '{' ) ;
    public final void rule__Program__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:624:1: ( ( '{' ) )
            // InternalChartIt.g:625:1: ( '{' )
            {
            // InternalChartIt.g:625:1: ( '{' )
            // InternalChartIt.g:626:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__11__Impl"


    // $ANTLR start "rule__Program__Group__12"
    // InternalChartIt.g:635:1: rule__Program__Group__12 : rule__Program__Group__12__Impl rule__Program__Group__13 ;
    public final void rule__Program__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:639:1: ( rule__Program__Group__12__Impl rule__Program__Group__13 )
            // InternalChartIt.g:640:2: rule__Program__Group__12__Impl rule__Program__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__12"


    // $ANTLR start "rule__Program__Group__12__Impl"
    // InternalChartIt.g:647:1: rule__Program__Group__12__Impl : ( ( ( rule__Program__ColAssignment_12 ) ) ( ( rule__Program__ColAssignment_12 )* ) ) ;
    public final void rule__Program__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:651:1: ( ( ( ( rule__Program__ColAssignment_12 ) ) ( ( rule__Program__ColAssignment_12 )* ) ) )
            // InternalChartIt.g:652:1: ( ( ( rule__Program__ColAssignment_12 ) ) ( ( rule__Program__ColAssignment_12 )* ) )
            {
            // InternalChartIt.g:652:1: ( ( ( rule__Program__ColAssignment_12 ) ) ( ( rule__Program__ColAssignment_12 )* ) )
            // InternalChartIt.g:653:2: ( ( rule__Program__ColAssignment_12 ) ) ( ( rule__Program__ColAssignment_12 )* )
            {
            // InternalChartIt.g:653:2: ( ( rule__Program__ColAssignment_12 ) )
            // InternalChartIt.g:654:3: ( rule__Program__ColAssignment_12 )
            {
             before(grammarAccess.getProgramAccess().getColAssignment_12()); 
            // InternalChartIt.g:655:3: ( rule__Program__ColAssignment_12 )
            // InternalChartIt.g:655:4: rule__Program__ColAssignment_12
            {
            pushFollow(FOLLOW_9);
            rule__Program__ColAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getColAssignment_12()); 

            }

            // InternalChartIt.g:658:2: ( ( rule__Program__ColAssignment_12 )* )
            // InternalChartIt.g:659:3: ( rule__Program__ColAssignment_12 )*
            {
             before(grammarAccess.getProgramAccess().getColAssignment_12()); 
            // InternalChartIt.g:660:3: ( rule__Program__ColAssignment_12 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalChartIt.g:660:4: rule__Program__ColAssignment_12
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Program__ColAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getColAssignment_12()); 

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
    // $ANTLR end "rule__Program__Group__12__Impl"


    // $ANTLR start "rule__Program__Group__13"
    // InternalChartIt.g:669:1: rule__Program__Group__13 : rule__Program__Group__13__Impl rule__Program__Group__14 ;
    public final void rule__Program__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:673:1: ( rule__Program__Group__13__Impl rule__Program__Group__14 )
            // InternalChartIt.g:674:2: rule__Program__Group__13__Impl rule__Program__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__13"


    // $ANTLR start "rule__Program__Group__13__Impl"
    // InternalChartIt.g:681:1: rule__Program__Group__13__Impl : ( ( rule__Program__Group_13__0 )* ) ;
    public final void rule__Program__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:685:1: ( ( ( rule__Program__Group_13__0 )* ) )
            // InternalChartIt.g:686:1: ( ( rule__Program__Group_13__0 )* )
            {
            // InternalChartIt.g:686:1: ( ( rule__Program__Group_13__0 )* )
            // InternalChartIt.g:687:2: ( rule__Program__Group_13__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_13()); 
            // InternalChartIt.g:688:2: ( rule__Program__Group_13__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==35) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalChartIt.g:688:3: rule__Program__Group_13__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Program__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__13__Impl"


    // $ANTLR start "rule__Program__Group__14"
    // InternalChartIt.g:696:1: rule__Program__Group__14 : rule__Program__Group__14__Impl rule__Program__Group__15 ;
    public final void rule__Program__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:700:1: ( rule__Program__Group__14__Impl rule__Program__Group__15 )
            // InternalChartIt.g:701:2: rule__Program__Group__14__Impl rule__Program__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Program__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__14"


    // $ANTLR start "rule__Program__Group__14__Impl"
    // InternalChartIt.g:708:1: rule__Program__Group__14__Impl : ( '}' ) ;
    public final void rule__Program__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:712:1: ( ( '}' ) )
            // InternalChartIt.g:713:1: ( '}' )
            {
            // InternalChartIt.g:713:1: ( '}' )
            // InternalChartIt.g:714:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_14()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__14__Impl"


    // $ANTLR start "rule__Program__Group__15"
    // InternalChartIt.g:723:1: rule__Program__Group__15 : rule__Program__Group__15__Impl rule__Program__Group__16 ;
    public final void rule__Program__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:727:1: ( rule__Program__Group__15__Impl rule__Program__Group__16 )
            // InternalChartIt.g:728:2: rule__Program__Group__15__Impl rule__Program__Group__16
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__15"


    // $ANTLR start "rule__Program__Group__15__Impl"
    // InternalChartIt.g:735:1: rule__Program__Group__15__Impl : ( 'chart' ) ;
    public final void rule__Program__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:739:1: ( ( 'chart' ) )
            // InternalChartIt.g:740:1: ( 'chart' )
            {
            // InternalChartIt.g:740:1: ( 'chart' )
            // InternalChartIt.g:741:2: 'chart'
            {
             before(grammarAccess.getProgramAccess().getChartKeyword_15()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getChartKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__15__Impl"


    // $ANTLR start "rule__Program__Group__16"
    // InternalChartIt.g:750:1: rule__Program__Group__16 : rule__Program__Group__16__Impl rule__Program__Group__17 ;
    public final void rule__Program__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:754:1: ( rule__Program__Group__16__Impl rule__Program__Group__17 )
            // InternalChartIt.g:755:2: rule__Program__Group__16__Impl rule__Program__Group__17
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__16"


    // $ANTLR start "rule__Program__Group__16__Impl"
    // InternalChartIt.g:762:1: rule__Program__Group__16__Impl : ( '{' ) ;
    public final void rule__Program__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:766:1: ( ( '{' ) )
            // InternalChartIt.g:767:1: ( '{' )
            {
            // InternalChartIt.g:767:1: ( '{' )
            // InternalChartIt.g:768:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_16()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__16__Impl"


    // $ANTLR start "rule__Program__Group__17"
    // InternalChartIt.g:777:1: rule__Program__Group__17 : rule__Program__Group__17__Impl rule__Program__Group__18 ;
    public final void rule__Program__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:781:1: ( rule__Program__Group__17__Impl rule__Program__Group__18 )
            // InternalChartIt.g:782:2: rule__Program__Group__17__Impl rule__Program__Group__18
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__17"


    // $ANTLR start "rule__Program__Group__17__Impl"
    // InternalChartIt.g:789:1: rule__Program__Group__17__Impl : ( ( ( rule__Program__ChartAssignment_17 ) ) ( ( rule__Program__ChartAssignment_17 )* ) ) ;
    public final void rule__Program__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:793:1: ( ( ( ( rule__Program__ChartAssignment_17 ) ) ( ( rule__Program__ChartAssignment_17 )* ) ) )
            // InternalChartIt.g:794:1: ( ( ( rule__Program__ChartAssignment_17 ) ) ( ( rule__Program__ChartAssignment_17 )* ) )
            {
            // InternalChartIt.g:794:1: ( ( ( rule__Program__ChartAssignment_17 ) ) ( ( rule__Program__ChartAssignment_17 )* ) )
            // InternalChartIt.g:795:2: ( ( rule__Program__ChartAssignment_17 ) ) ( ( rule__Program__ChartAssignment_17 )* )
            {
            // InternalChartIt.g:795:2: ( ( rule__Program__ChartAssignment_17 ) )
            // InternalChartIt.g:796:3: ( rule__Program__ChartAssignment_17 )
            {
             before(grammarAccess.getProgramAccess().getChartAssignment_17()); 
            // InternalChartIt.g:797:3: ( rule__Program__ChartAssignment_17 )
            // InternalChartIt.g:797:4: rule__Program__ChartAssignment_17
            {
            pushFollow(FOLLOW_9);
            rule__Program__ChartAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getChartAssignment_17()); 

            }

            // InternalChartIt.g:800:2: ( ( rule__Program__ChartAssignment_17 )* )
            // InternalChartIt.g:801:3: ( rule__Program__ChartAssignment_17 )*
            {
             before(grammarAccess.getProgramAccess().getChartAssignment_17()); 
            // InternalChartIt.g:802:3: ( rule__Program__ChartAssignment_17 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalChartIt.g:802:4: rule__Program__ChartAssignment_17
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Program__ChartAssignment_17();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getChartAssignment_17()); 

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
    // $ANTLR end "rule__Program__Group__17__Impl"


    // $ANTLR start "rule__Program__Group__18"
    // InternalChartIt.g:811:1: rule__Program__Group__18 : rule__Program__Group__18__Impl rule__Program__Group__19 ;
    public final void rule__Program__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:815:1: ( rule__Program__Group__18__Impl rule__Program__Group__19 )
            // InternalChartIt.g:816:2: rule__Program__Group__18__Impl rule__Program__Group__19
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__18"


    // $ANTLR start "rule__Program__Group__18__Impl"
    // InternalChartIt.g:823:1: rule__Program__Group__18__Impl : ( ( rule__Program__Group_18__0 )* ) ;
    public final void rule__Program__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:827:1: ( ( ( rule__Program__Group_18__0 )* ) )
            // InternalChartIt.g:828:1: ( ( rule__Program__Group_18__0 )* )
            {
            // InternalChartIt.g:828:1: ( ( rule__Program__Group_18__0 )* )
            // InternalChartIt.g:829:2: ( rule__Program__Group_18__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_18()); 
            // InternalChartIt.g:830:2: ( rule__Program__Group_18__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalChartIt.g:830:3: rule__Program__Group_18__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Program__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__18__Impl"


    // $ANTLR start "rule__Program__Group__19"
    // InternalChartIt.g:838:1: rule__Program__Group__19 : rule__Program__Group__19__Impl rule__Program__Group__20 ;
    public final void rule__Program__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:842:1: ( rule__Program__Group__19__Impl rule__Program__Group__20 )
            // InternalChartIt.g:843:2: rule__Program__Group__19__Impl rule__Program__Group__20
            {
            pushFollow(FOLLOW_13);
            rule__Program__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__19"


    // $ANTLR start "rule__Program__Group__19__Impl"
    // InternalChartIt.g:850:1: rule__Program__Group__19__Impl : ( '}' ) ;
    public final void rule__Program__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:854:1: ( ( '}' ) )
            // InternalChartIt.g:855:1: ( '}' )
            {
            // InternalChartIt.g:855:1: ( '}' )
            // InternalChartIt.g:856:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_19()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__19__Impl"


    // $ANTLR start "rule__Program__Group__20"
    // InternalChartIt.g:865:1: rule__Program__Group__20 : rule__Program__Group__20__Impl ;
    public final void rule__Program__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:869:1: ( rule__Program__Group__20__Impl )
            // InternalChartIt.g:870:2: rule__Program__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__20"


    // $ANTLR start "rule__Program__Group__20__Impl"
    // InternalChartIt.g:876:1: rule__Program__Group__20__Impl : ( '}' ) ;
    public final void rule__Program__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:880:1: ( ( '}' ) )
            // InternalChartIt.g:881:1: ( '}' )
            {
            // InternalChartIt.g:881:1: ( '}' )
            // InternalChartIt.g:882:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_20()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__20__Impl"


    // $ANTLR start "rule__Program__Group_8__0"
    // InternalChartIt.g:892:1: rule__Program__Group_8__0 : rule__Program__Group_8__0__Impl rule__Program__Group_8__1 ;
    public final void rule__Program__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:896:1: ( rule__Program__Group_8__0__Impl rule__Program__Group_8__1 )
            // InternalChartIt.g:897:2: rule__Program__Group_8__0__Impl rule__Program__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__0"


    // $ANTLR start "rule__Program__Group_8__0__Impl"
    // InternalChartIt.g:904:1: rule__Program__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:908:1: ( ( ',' ) )
            // InternalChartIt.g:909:1: ( ',' )
            {
            // InternalChartIt.g:909:1: ( ',' )
            // InternalChartIt.g:910:2: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_8_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__0__Impl"


    // $ANTLR start "rule__Program__Group_8__1"
    // InternalChartIt.g:919:1: rule__Program__Group_8__1 : rule__Program__Group_8__1__Impl ;
    public final void rule__Program__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:923:1: ( rule__Program__Group_8__1__Impl )
            // InternalChartIt.g:924:2: rule__Program__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__1"


    // $ANTLR start "rule__Program__Group_8__1__Impl"
    // InternalChartIt.g:930:1: rule__Program__Group_8__1__Impl : ( ( rule__Program__LoadDataAssignment_8_1 ) ) ;
    public final void rule__Program__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:934:1: ( ( ( rule__Program__LoadDataAssignment_8_1 ) ) )
            // InternalChartIt.g:935:1: ( ( rule__Program__LoadDataAssignment_8_1 ) )
            {
            // InternalChartIt.g:935:1: ( ( rule__Program__LoadDataAssignment_8_1 ) )
            // InternalChartIt.g:936:2: ( rule__Program__LoadDataAssignment_8_1 )
            {
             before(grammarAccess.getProgramAccess().getLoadDataAssignment_8_1()); 
            // InternalChartIt.g:937:2: ( rule__Program__LoadDataAssignment_8_1 )
            // InternalChartIt.g:937:3: rule__Program__LoadDataAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__LoadDataAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getLoadDataAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_8__1__Impl"


    // $ANTLR start "rule__Program__Group_13__0"
    // InternalChartIt.g:946:1: rule__Program__Group_13__0 : rule__Program__Group_13__0__Impl rule__Program__Group_13__1 ;
    public final void rule__Program__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:950:1: ( rule__Program__Group_13__0__Impl rule__Program__Group_13__1 )
            // InternalChartIt.g:951:2: rule__Program__Group_13__0__Impl rule__Program__Group_13__1
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_13__0"


    // $ANTLR start "rule__Program__Group_13__0__Impl"
    // InternalChartIt.g:958:1: rule__Program__Group_13__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:962:1: ( ( ',' ) )
            // InternalChartIt.g:963:1: ( ',' )
            {
            // InternalChartIt.g:963:1: ( ',' )
            // InternalChartIt.g:964:2: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_13_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_13__0__Impl"


    // $ANTLR start "rule__Program__Group_13__1"
    // InternalChartIt.g:973:1: rule__Program__Group_13__1 : rule__Program__Group_13__1__Impl ;
    public final void rule__Program__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:977:1: ( rule__Program__Group_13__1__Impl )
            // InternalChartIt.g:978:2: rule__Program__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_13__1"


    // $ANTLR start "rule__Program__Group_13__1__Impl"
    // InternalChartIt.g:984:1: rule__Program__Group_13__1__Impl : ( ( rule__Program__ColAssignment_13_1 ) ) ;
    public final void rule__Program__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:988:1: ( ( ( rule__Program__ColAssignment_13_1 ) ) )
            // InternalChartIt.g:989:1: ( ( rule__Program__ColAssignment_13_1 ) )
            {
            // InternalChartIt.g:989:1: ( ( rule__Program__ColAssignment_13_1 ) )
            // InternalChartIt.g:990:2: ( rule__Program__ColAssignment_13_1 )
            {
             before(grammarAccess.getProgramAccess().getColAssignment_13_1()); 
            // InternalChartIt.g:991:2: ( rule__Program__ColAssignment_13_1 )
            // InternalChartIt.g:991:3: rule__Program__ColAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__ColAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getColAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_13__1__Impl"


    // $ANTLR start "rule__Program__Group_18__0"
    // InternalChartIt.g:1000:1: rule__Program__Group_18__0 : rule__Program__Group_18__0__Impl rule__Program__Group_18__1 ;
    public final void rule__Program__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1004:1: ( rule__Program__Group_18__0__Impl rule__Program__Group_18__1 )
            // InternalChartIt.g:1005:2: rule__Program__Group_18__0__Impl rule__Program__Group_18__1
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_18__0"


    // $ANTLR start "rule__Program__Group_18__0__Impl"
    // InternalChartIt.g:1012:1: rule__Program__Group_18__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1016:1: ( ( ',' ) )
            // InternalChartIt.g:1017:1: ( ',' )
            {
            // InternalChartIt.g:1017:1: ( ',' )
            // InternalChartIt.g:1018:2: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_18_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getCommaKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_18__0__Impl"


    // $ANTLR start "rule__Program__Group_18__1"
    // InternalChartIt.g:1027:1: rule__Program__Group_18__1 : rule__Program__Group_18__1__Impl ;
    public final void rule__Program__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1031:1: ( rule__Program__Group_18__1__Impl )
            // InternalChartIt.g:1032:2: rule__Program__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_18__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_18__1"


    // $ANTLR start "rule__Program__Group_18__1__Impl"
    // InternalChartIt.g:1038:1: rule__Program__Group_18__1__Impl : ( ( rule__Program__ChartAssignment_18_1 ) ) ;
    public final void rule__Program__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1042:1: ( ( ( rule__Program__ChartAssignment_18_1 ) ) )
            // InternalChartIt.g:1043:1: ( ( rule__Program__ChartAssignment_18_1 ) )
            {
            // InternalChartIt.g:1043:1: ( ( rule__Program__ChartAssignment_18_1 ) )
            // InternalChartIt.g:1044:2: ( rule__Program__ChartAssignment_18_1 )
            {
             before(grammarAccess.getProgramAccess().getChartAssignment_18_1()); 
            // InternalChartIt.g:1045:2: ( rule__Program__ChartAssignment_18_1 )
            // InternalChartIt.g:1045:3: rule__Program__ChartAssignment_18_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__ChartAssignment_18_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getChartAssignment_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_18__1__Impl"


    // $ANTLR start "rule__Data__Group__0"
    // InternalChartIt.g:1054:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1058:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalChartIt.g:1059:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__0"


    // $ANTLR start "rule__Data__Group__0__Impl"
    // InternalChartIt.g:1066:1: rule__Data__Group__0__Impl : ( () ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1070:1: ( ( () ) )
            // InternalChartIt.g:1071:1: ( () )
            {
            // InternalChartIt.g:1071:1: ( () )
            // InternalChartIt.g:1072:2: ()
            {
             before(grammarAccess.getDataAccess().getDataAction_0()); 
            // InternalChartIt.g:1073:2: ()
            // InternalChartIt.g:1073:3: 
            {
            }

             after(grammarAccess.getDataAccess().getDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__0__Impl"


    // $ANTLR start "rule__Data__Group__1"
    // InternalChartIt.g:1081:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1085:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalChartIt.g:1086:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Data__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__1"


    // $ANTLR start "rule__Data__Group__1__Impl"
    // InternalChartIt.g:1093:1: rule__Data__Group__1__Impl : ( ( rule__Data__NameAssignment_1 ) ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1097:1: ( ( ( rule__Data__NameAssignment_1 ) ) )
            // InternalChartIt.g:1098:1: ( ( rule__Data__NameAssignment_1 ) )
            {
            // InternalChartIt.g:1098:1: ( ( rule__Data__NameAssignment_1 ) )
            // InternalChartIt.g:1099:2: ( rule__Data__NameAssignment_1 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_1()); 
            // InternalChartIt.g:1100:2: ( rule__Data__NameAssignment_1 )
            // InternalChartIt.g:1100:3: rule__Data__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__1__Impl"


    // $ANTLR start "rule__Data__Group__2"
    // InternalChartIt.g:1108:1: rule__Data__Group__2 : rule__Data__Group__2__Impl rule__Data__Group__3 ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1112:1: ( rule__Data__Group__2__Impl rule__Data__Group__3 )
            // InternalChartIt.g:1113:2: rule__Data__Group__2__Impl rule__Data__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Data__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__2"


    // $ANTLR start "rule__Data__Group__2__Impl"
    // InternalChartIt.g:1120:1: rule__Data__Group__2__Impl : ( '(' ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1124:1: ( ( '(' ) )
            // InternalChartIt.g:1125:1: ( '(' )
            {
            // InternalChartIt.g:1125:1: ( '(' )
            // InternalChartIt.g:1126:2: '('
            {
             before(grammarAccess.getDataAccess().getLeftParenthesisKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__2__Impl"


    // $ANTLR start "rule__Data__Group__3"
    // InternalChartIt.g:1135:1: rule__Data__Group__3 : rule__Data__Group__3__Impl rule__Data__Group__4 ;
    public final void rule__Data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1139:1: ( rule__Data__Group__3__Impl rule__Data__Group__4 )
            // InternalChartIt.g:1140:2: rule__Data__Group__3__Impl rule__Data__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Data__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__3"


    // $ANTLR start "rule__Data__Group__3__Impl"
    // InternalChartIt.g:1147:1: rule__Data__Group__3__Impl : ( ( rule__Data__PathAssignment_3 ) ) ;
    public final void rule__Data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1151:1: ( ( ( rule__Data__PathAssignment_3 ) ) )
            // InternalChartIt.g:1152:1: ( ( rule__Data__PathAssignment_3 ) )
            {
            // InternalChartIt.g:1152:1: ( ( rule__Data__PathAssignment_3 ) )
            // InternalChartIt.g:1153:2: ( rule__Data__PathAssignment_3 )
            {
             before(grammarAccess.getDataAccess().getPathAssignment_3()); 
            // InternalChartIt.g:1154:2: ( rule__Data__PathAssignment_3 )
            // InternalChartIt.g:1154:3: rule__Data__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Data__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getPathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__3__Impl"


    // $ANTLR start "rule__Data__Group__4"
    // InternalChartIt.g:1162:1: rule__Data__Group__4 : rule__Data__Group__4__Impl ;
    public final void rule__Data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1166:1: ( rule__Data__Group__4__Impl )
            // InternalChartIt.g:1167:2: rule__Data__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__4"


    // $ANTLR start "rule__Data__Group__4__Impl"
    // InternalChartIt.g:1173:1: rule__Data__Group__4__Impl : ( ')' ) ;
    public final void rule__Data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1177:1: ( ( ')' ) )
            // InternalChartIt.g:1178:1: ( ')' )
            {
            // InternalChartIt.g:1178:1: ( ')' )
            // InternalChartIt.g:1179:2: ')'
            {
             before(grammarAccess.getDataAccess().getRightParenthesisKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__4__Impl"


    // $ANTLR start "rule__Chart__Group__0"
    // InternalChartIt.g:1189:1: rule__Chart__Group__0 : rule__Chart__Group__0__Impl rule__Chart__Group__1 ;
    public final void rule__Chart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1193:1: ( rule__Chart__Group__0__Impl rule__Chart__Group__1 )
            // InternalChartIt.g:1194:2: rule__Chart__Group__0__Impl rule__Chart__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Chart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__0"


    // $ANTLR start "rule__Chart__Group__0__Impl"
    // InternalChartIt.g:1201:1: rule__Chart__Group__0__Impl : ( () ) ;
    public final void rule__Chart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1205:1: ( ( () ) )
            // InternalChartIt.g:1206:1: ( () )
            {
            // InternalChartIt.g:1206:1: ( () )
            // InternalChartIt.g:1207:2: ()
            {
             before(grammarAccess.getChartAccess().getChartAction_0()); 
            // InternalChartIt.g:1208:2: ()
            // InternalChartIt.g:1208:3: 
            {
            }

             after(grammarAccess.getChartAccess().getChartAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__0__Impl"


    // $ANTLR start "rule__Chart__Group__1"
    // InternalChartIt.g:1216:1: rule__Chart__Group__1 : rule__Chart__Group__1__Impl rule__Chart__Group__2 ;
    public final void rule__Chart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1220:1: ( rule__Chart__Group__1__Impl rule__Chart__Group__2 )
            // InternalChartIt.g:1221:2: rule__Chart__Group__1__Impl rule__Chart__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Chart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__1"


    // $ANTLR start "rule__Chart__Group__1__Impl"
    // InternalChartIt.g:1228:1: rule__Chart__Group__1__Impl : ( ( rule__Chart__NameAssignment_1 ) ) ;
    public final void rule__Chart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1232:1: ( ( ( rule__Chart__NameAssignment_1 ) ) )
            // InternalChartIt.g:1233:1: ( ( rule__Chart__NameAssignment_1 ) )
            {
            // InternalChartIt.g:1233:1: ( ( rule__Chart__NameAssignment_1 ) )
            // InternalChartIt.g:1234:2: ( rule__Chart__NameAssignment_1 )
            {
             before(grammarAccess.getChartAccess().getNameAssignment_1()); 
            // InternalChartIt.g:1235:2: ( rule__Chart__NameAssignment_1 )
            // InternalChartIt.g:1235:3: rule__Chart__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Chart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__1__Impl"


    // $ANTLR start "rule__Chart__Group__2"
    // InternalChartIt.g:1243:1: rule__Chart__Group__2 : rule__Chart__Group__2__Impl rule__Chart__Group__3 ;
    public final void rule__Chart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1247:1: ( rule__Chart__Group__2__Impl rule__Chart__Group__3 )
            // InternalChartIt.g:1248:2: rule__Chart__Group__2__Impl rule__Chart__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Chart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__2"


    // $ANTLR start "rule__Chart__Group__2__Impl"
    // InternalChartIt.g:1255:1: rule__Chart__Group__2__Impl : ( '(' ) ;
    public final void rule__Chart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1259:1: ( ( '(' ) )
            // InternalChartIt.g:1260:1: ( '(' )
            {
            // InternalChartIt.g:1260:1: ( '(' )
            // InternalChartIt.g:1261:2: '('
            {
             before(grammarAccess.getChartAccess().getLeftParenthesisKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__2__Impl"


    // $ANTLR start "rule__Chart__Group__3"
    // InternalChartIt.g:1270:1: rule__Chart__Group__3 : rule__Chart__Group__3__Impl rule__Chart__Group__4 ;
    public final void rule__Chart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1274:1: ( rule__Chart__Group__3__Impl rule__Chart__Group__4 )
            // InternalChartIt.g:1275:2: rule__Chart__Group__3__Impl rule__Chart__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Chart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__3"


    // $ANTLR start "rule__Chart__Group__3__Impl"
    // InternalChartIt.g:1282:1: rule__Chart__Group__3__Impl : ( 'data' ) ;
    public final void rule__Chart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1286:1: ( ( 'data' ) )
            // InternalChartIt.g:1287:1: ( 'data' )
            {
            // InternalChartIt.g:1287:1: ( 'data' )
            // InternalChartIt.g:1288:2: 'data'
            {
             before(grammarAccess.getChartAccess().getDataKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getDataKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__3__Impl"


    // $ANTLR start "rule__Chart__Group__4"
    // InternalChartIt.g:1297:1: rule__Chart__Group__4 : rule__Chart__Group__4__Impl rule__Chart__Group__5 ;
    public final void rule__Chart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1301:1: ( rule__Chart__Group__4__Impl rule__Chart__Group__5 )
            // InternalChartIt.g:1302:2: rule__Chart__Group__4__Impl rule__Chart__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Chart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__4"


    // $ANTLR start "rule__Chart__Group__4__Impl"
    // InternalChartIt.g:1309:1: rule__Chart__Group__4__Impl : ( '=' ) ;
    public final void rule__Chart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1313:1: ( ( '=' ) )
            // InternalChartIt.g:1314:1: ( '=' )
            {
            // InternalChartIt.g:1314:1: ( '=' )
            // InternalChartIt.g:1315:2: '='
            {
             before(grammarAccess.getChartAccess().getEqualsSignKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__4__Impl"


    // $ANTLR start "rule__Chart__Group__5"
    // InternalChartIt.g:1324:1: rule__Chart__Group__5 : rule__Chart__Group__5__Impl rule__Chart__Group__6 ;
    public final void rule__Chart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1328:1: ( rule__Chart__Group__5__Impl rule__Chart__Group__6 )
            // InternalChartIt.g:1329:2: rule__Chart__Group__5__Impl rule__Chart__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Chart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__5"


    // $ANTLR start "rule__Chart__Group__5__Impl"
    // InternalChartIt.g:1336:1: rule__Chart__Group__5__Impl : ( ( rule__Chart__DataAssignment_5 ) ) ;
    public final void rule__Chart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1340:1: ( ( ( rule__Chart__DataAssignment_5 ) ) )
            // InternalChartIt.g:1341:1: ( ( rule__Chart__DataAssignment_5 ) )
            {
            // InternalChartIt.g:1341:1: ( ( rule__Chart__DataAssignment_5 ) )
            // InternalChartIt.g:1342:2: ( rule__Chart__DataAssignment_5 )
            {
             before(grammarAccess.getChartAccess().getDataAssignment_5()); 
            // InternalChartIt.g:1343:2: ( rule__Chart__DataAssignment_5 )
            // InternalChartIt.g:1343:3: rule__Chart__DataAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Chart__DataAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getDataAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__5__Impl"


    // $ANTLR start "rule__Chart__Group__6"
    // InternalChartIt.g:1351:1: rule__Chart__Group__6 : rule__Chart__Group__6__Impl rule__Chart__Group__7 ;
    public final void rule__Chart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1355:1: ( rule__Chart__Group__6__Impl rule__Chart__Group__7 )
            // InternalChartIt.g:1356:2: rule__Chart__Group__6__Impl rule__Chart__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Chart__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__6"


    // $ANTLR start "rule__Chart__Group__6__Impl"
    // InternalChartIt.g:1363:1: rule__Chart__Group__6__Impl : ( ',' ) ;
    public final void rule__Chart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1367:1: ( ( ',' ) )
            // InternalChartIt.g:1368:1: ( ',' )
            {
            // InternalChartIt.g:1368:1: ( ',' )
            // InternalChartIt.g:1369:2: ','
            {
             before(grammarAccess.getChartAccess().getCommaKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__6__Impl"


    // $ANTLR start "rule__Chart__Group__7"
    // InternalChartIt.g:1378:1: rule__Chart__Group__7 : rule__Chart__Group__7__Impl rule__Chart__Group__8 ;
    public final void rule__Chart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1382:1: ( rule__Chart__Group__7__Impl rule__Chart__Group__8 )
            // InternalChartIt.g:1383:2: rule__Chart__Group__7__Impl rule__Chart__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Chart__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__7"


    // $ANTLR start "rule__Chart__Group__7__Impl"
    // InternalChartIt.g:1390:1: rule__Chart__Group__7__Impl : ( 'type' ) ;
    public final void rule__Chart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1394:1: ( ( 'type' ) )
            // InternalChartIt.g:1395:1: ( 'type' )
            {
            // InternalChartIt.g:1395:1: ( 'type' )
            // InternalChartIt.g:1396:2: 'type'
            {
             before(grammarAccess.getChartAccess().getTypeKeyword_7()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getTypeKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__7__Impl"


    // $ANTLR start "rule__Chart__Group__8"
    // InternalChartIt.g:1405:1: rule__Chart__Group__8 : rule__Chart__Group__8__Impl rule__Chart__Group__9 ;
    public final void rule__Chart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1409:1: ( rule__Chart__Group__8__Impl rule__Chart__Group__9 )
            // InternalChartIt.g:1410:2: rule__Chart__Group__8__Impl rule__Chart__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Chart__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__8"


    // $ANTLR start "rule__Chart__Group__8__Impl"
    // InternalChartIt.g:1417:1: rule__Chart__Group__8__Impl : ( '=' ) ;
    public final void rule__Chart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1421:1: ( ( '=' ) )
            // InternalChartIt.g:1422:1: ( '=' )
            {
            // InternalChartIt.g:1422:1: ( '=' )
            // InternalChartIt.g:1423:2: '='
            {
             before(grammarAccess.getChartAccess().getEqualsSignKeyword_8()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getEqualsSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__8__Impl"


    // $ANTLR start "rule__Chart__Group__9"
    // InternalChartIt.g:1432:1: rule__Chart__Group__9 : rule__Chart__Group__9__Impl rule__Chart__Group__10 ;
    public final void rule__Chart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1436:1: ( rule__Chart__Group__9__Impl rule__Chart__Group__10 )
            // InternalChartIt.g:1437:2: rule__Chart__Group__9__Impl rule__Chart__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Chart__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__9"


    // $ANTLR start "rule__Chart__Group__9__Impl"
    // InternalChartIt.g:1444:1: rule__Chart__Group__9__Impl : ( ( rule__Chart__TypeAssignment_9 ) ) ;
    public final void rule__Chart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1448:1: ( ( ( rule__Chart__TypeAssignment_9 ) ) )
            // InternalChartIt.g:1449:1: ( ( rule__Chart__TypeAssignment_9 ) )
            {
            // InternalChartIt.g:1449:1: ( ( rule__Chart__TypeAssignment_9 ) )
            // InternalChartIt.g:1450:2: ( rule__Chart__TypeAssignment_9 )
            {
             before(grammarAccess.getChartAccess().getTypeAssignment_9()); 
            // InternalChartIt.g:1451:2: ( rule__Chart__TypeAssignment_9 )
            // InternalChartIt.g:1451:3: rule__Chart__TypeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Chart__TypeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getTypeAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__9__Impl"


    // $ANTLR start "rule__Chart__Group__10"
    // InternalChartIt.g:1459:1: rule__Chart__Group__10 : rule__Chart__Group__10__Impl rule__Chart__Group__11 ;
    public final void rule__Chart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1463:1: ( rule__Chart__Group__10__Impl rule__Chart__Group__11 )
            // InternalChartIt.g:1464:2: rule__Chart__Group__10__Impl rule__Chart__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Chart__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__10"


    // $ANTLR start "rule__Chart__Group__10__Impl"
    // InternalChartIt.g:1471:1: rule__Chart__Group__10__Impl : ( ',' ) ;
    public final void rule__Chart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1475:1: ( ( ',' ) )
            // InternalChartIt.g:1476:1: ( ',' )
            {
            // InternalChartIt.g:1476:1: ( ',' )
            // InternalChartIt.g:1477:2: ','
            {
             before(grammarAccess.getChartAccess().getCommaKeyword_10()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getCommaKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__10__Impl"


    // $ANTLR start "rule__Chart__Group__11"
    // InternalChartIt.g:1486:1: rule__Chart__Group__11 : rule__Chart__Group__11__Impl rule__Chart__Group__12 ;
    public final void rule__Chart__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1490:1: ( rule__Chart__Group__11__Impl rule__Chart__Group__12 )
            // InternalChartIt.g:1491:2: rule__Chart__Group__11__Impl rule__Chart__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__Chart__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__11"


    // $ANTLR start "rule__Chart__Group__11__Impl"
    // InternalChartIt.g:1498:1: rule__Chart__Group__11__Impl : ( 'col' ) ;
    public final void rule__Chart__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1502:1: ( ( 'col' ) )
            // InternalChartIt.g:1503:1: ( 'col' )
            {
            // InternalChartIt.g:1503:1: ( 'col' )
            // InternalChartIt.g:1504:2: 'col'
            {
             before(grammarAccess.getChartAccess().getColKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getColKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__11__Impl"


    // $ANTLR start "rule__Chart__Group__12"
    // InternalChartIt.g:1513:1: rule__Chart__Group__12 : rule__Chart__Group__12__Impl rule__Chart__Group__13 ;
    public final void rule__Chart__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1517:1: ( rule__Chart__Group__12__Impl rule__Chart__Group__13 )
            // InternalChartIt.g:1518:2: rule__Chart__Group__12__Impl rule__Chart__Group__13
            {
            pushFollow(FOLLOW_5);
            rule__Chart__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__12"


    // $ANTLR start "rule__Chart__Group__12__Impl"
    // InternalChartIt.g:1525:1: rule__Chart__Group__12__Impl : ( '=' ) ;
    public final void rule__Chart__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1529:1: ( ( '=' ) )
            // InternalChartIt.g:1530:1: ( '=' )
            {
            // InternalChartIt.g:1530:1: ( '=' )
            // InternalChartIt.g:1531:2: '='
            {
             before(grammarAccess.getChartAccess().getEqualsSignKeyword_12()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getEqualsSignKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__12__Impl"


    // $ANTLR start "rule__Chart__Group__13"
    // InternalChartIt.g:1540:1: rule__Chart__Group__13 : rule__Chart__Group__13__Impl rule__Chart__Group__14 ;
    public final void rule__Chart__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1544:1: ( rule__Chart__Group__13__Impl rule__Chart__Group__14 )
            // InternalChartIt.g:1545:2: rule__Chart__Group__13__Impl rule__Chart__Group__14
            {
            pushFollow(FOLLOW_18);
            rule__Chart__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__13"


    // $ANTLR start "rule__Chart__Group__13__Impl"
    // InternalChartIt.g:1552:1: rule__Chart__Group__13__Impl : ( ( rule__Chart__ColAssignment_13 ) ) ;
    public final void rule__Chart__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1556:1: ( ( ( rule__Chart__ColAssignment_13 ) ) )
            // InternalChartIt.g:1557:1: ( ( rule__Chart__ColAssignment_13 ) )
            {
            // InternalChartIt.g:1557:1: ( ( rule__Chart__ColAssignment_13 ) )
            // InternalChartIt.g:1558:2: ( rule__Chart__ColAssignment_13 )
            {
             before(grammarAccess.getChartAccess().getColAssignment_13()); 
            // InternalChartIt.g:1559:2: ( rule__Chart__ColAssignment_13 )
            // InternalChartIt.g:1559:3: rule__Chart__ColAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Chart__ColAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getColAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__13__Impl"


    // $ANTLR start "rule__Chart__Group__14"
    // InternalChartIt.g:1567:1: rule__Chart__Group__14 : rule__Chart__Group__14__Impl rule__Chart__Group__15 ;
    public final void rule__Chart__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1571:1: ( rule__Chart__Group__14__Impl rule__Chart__Group__15 )
            // InternalChartIt.g:1572:2: rule__Chart__Group__14__Impl rule__Chart__Group__15
            {
            pushFollow(FOLLOW_18);
            rule__Chart__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__14"


    // $ANTLR start "rule__Chart__Group__14__Impl"
    // InternalChartIt.g:1579:1: rule__Chart__Group__14__Impl : ( ( rule__Chart__Group_14__0 )* ) ;
    public final void rule__Chart__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1583:1: ( ( ( rule__Chart__Group_14__0 )* ) )
            // InternalChartIt.g:1584:1: ( ( rule__Chart__Group_14__0 )* )
            {
            // InternalChartIt.g:1584:1: ( ( rule__Chart__Group_14__0 )* )
            // InternalChartIt.g:1585:2: ( rule__Chart__Group_14__0 )*
            {
             before(grammarAccess.getChartAccess().getGroup_14()); 
            // InternalChartIt.g:1586:2: ( rule__Chart__Group_14__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==RULE_STRING) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalChartIt.g:1586:3: rule__Chart__Group_14__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Chart__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getChartAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__14__Impl"


    // $ANTLR start "rule__Chart__Group__15"
    // InternalChartIt.g:1594:1: rule__Chart__Group__15 : rule__Chart__Group__15__Impl rule__Chart__Group__16 ;
    public final void rule__Chart__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1598:1: ( rule__Chart__Group__15__Impl rule__Chart__Group__16 )
            // InternalChartIt.g:1599:2: rule__Chart__Group__15__Impl rule__Chart__Group__16
            {
            pushFollow(FOLLOW_21);
            rule__Chart__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__15"


    // $ANTLR start "rule__Chart__Group__15__Impl"
    // InternalChartIt.g:1606:1: rule__Chart__Group__15__Impl : ( ',' ) ;
    public final void rule__Chart__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1610:1: ( ( ',' ) )
            // InternalChartIt.g:1611:1: ( ',' )
            {
            // InternalChartIt.g:1611:1: ( ',' )
            // InternalChartIt.g:1612:2: ','
            {
             before(grammarAccess.getChartAccess().getCommaKeyword_15()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getCommaKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__15__Impl"


    // $ANTLR start "rule__Chart__Group__16"
    // InternalChartIt.g:1621:1: rule__Chart__Group__16 : rule__Chart__Group__16__Impl rule__Chart__Group__17 ;
    public final void rule__Chart__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1625:1: ( rule__Chart__Group__16__Impl rule__Chart__Group__17 )
            // InternalChartIt.g:1626:2: rule__Chart__Group__16__Impl rule__Chart__Group__17
            {
            pushFollow(FOLLOW_17);
            rule__Chart__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__16"


    // $ANTLR start "rule__Chart__Group__16__Impl"
    // InternalChartIt.g:1633:1: rule__Chart__Group__16__Impl : ( 'backgroundColor' ) ;
    public final void rule__Chart__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1637:1: ( ( 'backgroundColor' ) )
            // InternalChartIt.g:1638:1: ( 'backgroundColor' )
            {
            // InternalChartIt.g:1638:1: ( 'backgroundColor' )
            // InternalChartIt.g:1639:2: 'backgroundColor'
            {
             before(grammarAccess.getChartAccess().getBackgroundColorKeyword_16()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getBackgroundColorKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__16__Impl"


    // $ANTLR start "rule__Chart__Group__17"
    // InternalChartIt.g:1648:1: rule__Chart__Group__17 : rule__Chart__Group__17__Impl rule__Chart__Group__18 ;
    public final void rule__Chart__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1652:1: ( rule__Chart__Group__17__Impl rule__Chart__Group__18 )
            // InternalChartIt.g:1653:2: rule__Chart__Group__17__Impl rule__Chart__Group__18
            {
            pushFollow(FOLLOW_22);
            rule__Chart__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__17"


    // $ANTLR start "rule__Chart__Group__17__Impl"
    // InternalChartIt.g:1660:1: rule__Chart__Group__17__Impl : ( '=' ) ;
    public final void rule__Chart__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1664:1: ( ( '=' ) )
            // InternalChartIt.g:1665:1: ( '=' )
            {
            // InternalChartIt.g:1665:1: ( '=' )
            // InternalChartIt.g:1666:2: '='
            {
             before(grammarAccess.getChartAccess().getEqualsSignKeyword_17()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getEqualsSignKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__17__Impl"


    // $ANTLR start "rule__Chart__Group__18"
    // InternalChartIt.g:1675:1: rule__Chart__Group__18 : rule__Chart__Group__18__Impl rule__Chart__Group__19 ;
    public final void rule__Chart__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1679:1: ( rule__Chart__Group__18__Impl rule__Chart__Group__19 )
            // InternalChartIt.g:1680:2: rule__Chart__Group__18__Impl rule__Chart__Group__19
            {
            pushFollow(FOLLOW_15);
            rule__Chart__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__18"


    // $ANTLR start "rule__Chart__Group__18__Impl"
    // InternalChartIt.g:1687:1: rule__Chart__Group__18__Impl : ( ( rule__Chart__BackgroundColorAssignment_18 ) ) ;
    public final void rule__Chart__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1691:1: ( ( ( rule__Chart__BackgroundColorAssignment_18 ) ) )
            // InternalChartIt.g:1692:1: ( ( rule__Chart__BackgroundColorAssignment_18 ) )
            {
            // InternalChartIt.g:1692:1: ( ( rule__Chart__BackgroundColorAssignment_18 ) )
            // InternalChartIt.g:1693:2: ( rule__Chart__BackgroundColorAssignment_18 )
            {
             before(grammarAccess.getChartAccess().getBackgroundColorAssignment_18()); 
            // InternalChartIt.g:1694:2: ( rule__Chart__BackgroundColorAssignment_18 )
            // InternalChartIt.g:1694:3: rule__Chart__BackgroundColorAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Chart__BackgroundColorAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getBackgroundColorAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__18__Impl"


    // $ANTLR start "rule__Chart__Group__19"
    // InternalChartIt.g:1702:1: rule__Chart__Group__19 : rule__Chart__Group__19__Impl ;
    public final void rule__Chart__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1706:1: ( rule__Chart__Group__19__Impl )
            // InternalChartIt.g:1707:2: rule__Chart__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__19"


    // $ANTLR start "rule__Chart__Group__19__Impl"
    // InternalChartIt.g:1713:1: rule__Chart__Group__19__Impl : ( ')' ) ;
    public final void rule__Chart__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1717:1: ( ( ')' ) )
            // InternalChartIt.g:1718:1: ( ')' )
            {
            // InternalChartIt.g:1718:1: ( ')' )
            // InternalChartIt.g:1719:2: ')'
            {
             before(grammarAccess.getChartAccess().getRightParenthesisKeyword_19()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getRightParenthesisKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group__19__Impl"


    // $ANTLR start "rule__Chart__Group_14__0"
    // InternalChartIt.g:1729:1: rule__Chart__Group_14__0 : rule__Chart__Group_14__0__Impl rule__Chart__Group_14__1 ;
    public final void rule__Chart__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1733:1: ( rule__Chart__Group_14__0__Impl rule__Chart__Group_14__1 )
            // InternalChartIt.g:1734:2: rule__Chart__Group_14__0__Impl rule__Chart__Group_14__1
            {
            pushFollow(FOLLOW_5);
            rule__Chart__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chart__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_14__0"


    // $ANTLR start "rule__Chart__Group_14__0__Impl"
    // InternalChartIt.g:1741:1: rule__Chart__Group_14__0__Impl : ( ',' ) ;
    public final void rule__Chart__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1745:1: ( ( ',' ) )
            // InternalChartIt.g:1746:1: ( ',' )
            {
            // InternalChartIt.g:1746:1: ( ',' )
            // InternalChartIt.g:1747:2: ','
            {
             before(grammarAccess.getChartAccess().getCommaKeyword_14_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getCommaKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_14__0__Impl"


    // $ANTLR start "rule__Chart__Group_14__1"
    // InternalChartIt.g:1756:1: rule__Chart__Group_14__1 : rule__Chart__Group_14__1__Impl ;
    public final void rule__Chart__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1760:1: ( rule__Chart__Group_14__1__Impl )
            // InternalChartIt.g:1761:2: rule__Chart__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_14__1"


    // $ANTLR start "rule__Chart__Group_14__1__Impl"
    // InternalChartIt.g:1767:1: rule__Chart__Group_14__1__Impl : ( ( rule__Chart__ColAssignment_14_1 ) ) ;
    public final void rule__Chart__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1771:1: ( ( ( rule__Chart__ColAssignment_14_1 ) ) )
            // InternalChartIt.g:1772:1: ( ( rule__Chart__ColAssignment_14_1 ) )
            {
            // InternalChartIt.g:1772:1: ( ( rule__Chart__ColAssignment_14_1 ) )
            // InternalChartIt.g:1773:2: ( rule__Chart__ColAssignment_14_1 )
            {
             before(grammarAccess.getChartAccess().getColAssignment_14_1()); 
            // InternalChartIt.g:1774:2: ( rule__Chart__ColAssignment_14_1 )
            // InternalChartIt.g:1774:3: rule__Chart__ColAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Chart__ColAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getColAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Group_14__1__Impl"


    // $ANTLR start "rule__Col__Group__0"
    // InternalChartIt.g:1783:1: rule__Col__Group__0 : rule__Col__Group__0__Impl rule__Col__Group__1 ;
    public final void rule__Col__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1787:1: ( rule__Col__Group__0__Impl rule__Col__Group__1 )
            // InternalChartIt.g:1788:2: rule__Col__Group__0__Impl rule__Col__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Col__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Col__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__0"


    // $ANTLR start "rule__Col__Group__0__Impl"
    // InternalChartIt.g:1795:1: rule__Col__Group__0__Impl : ( () ) ;
    public final void rule__Col__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1799:1: ( ( () ) )
            // InternalChartIt.g:1800:1: ( () )
            {
            // InternalChartIt.g:1800:1: ( () )
            // InternalChartIt.g:1801:2: ()
            {
             before(grammarAccess.getColAccess().getColAction_0()); 
            // InternalChartIt.g:1802:2: ()
            // InternalChartIt.g:1802:3: 
            {
            }

             after(grammarAccess.getColAccess().getColAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__0__Impl"


    // $ANTLR start "rule__Col__Group__1"
    // InternalChartIt.g:1810:1: rule__Col__Group__1 : rule__Col__Group__1__Impl rule__Col__Group__2 ;
    public final void rule__Col__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1814:1: ( rule__Col__Group__1__Impl rule__Col__Group__2 )
            // InternalChartIt.g:1815:2: rule__Col__Group__1__Impl rule__Col__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Col__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Col__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__1"


    // $ANTLR start "rule__Col__Group__1__Impl"
    // InternalChartIt.g:1822:1: rule__Col__Group__1__Impl : ( ( rule__Col__NameAssignment_1 ) ) ;
    public final void rule__Col__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1826:1: ( ( ( rule__Col__NameAssignment_1 ) ) )
            // InternalChartIt.g:1827:1: ( ( rule__Col__NameAssignment_1 ) )
            {
            // InternalChartIt.g:1827:1: ( ( rule__Col__NameAssignment_1 ) )
            // InternalChartIt.g:1828:2: ( rule__Col__NameAssignment_1 )
            {
             before(grammarAccess.getColAccess().getNameAssignment_1()); 
            // InternalChartIt.g:1829:2: ( rule__Col__NameAssignment_1 )
            // InternalChartIt.g:1829:3: rule__Col__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Col__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__1__Impl"


    // $ANTLR start "rule__Col__Group__2"
    // InternalChartIt.g:1837:1: rule__Col__Group__2 : rule__Col__Group__2__Impl rule__Col__Group__3 ;
    public final void rule__Col__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1841:1: ( rule__Col__Group__2__Impl rule__Col__Group__3 )
            // InternalChartIt.g:1842:2: rule__Col__Group__2__Impl rule__Col__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Col__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Col__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__2"


    // $ANTLR start "rule__Col__Group__2__Impl"
    // InternalChartIt.g:1849:1: rule__Col__Group__2__Impl : ( '(' ) ;
    public final void rule__Col__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1853:1: ( ( '(' ) )
            // InternalChartIt.g:1854:1: ( '(' )
            {
            // InternalChartIt.g:1854:1: ( '(' )
            // InternalChartIt.g:1855:2: '('
            {
             before(grammarAccess.getColAccess().getLeftParenthesisKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getColAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__2__Impl"


    // $ANTLR start "rule__Col__Group__3"
    // InternalChartIt.g:1864:1: rule__Col__Group__3 : rule__Col__Group__3__Impl rule__Col__Group__4 ;
    public final void rule__Col__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1868:1: ( rule__Col__Group__3__Impl rule__Col__Group__4 )
            // InternalChartIt.g:1869:2: rule__Col__Group__3__Impl rule__Col__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Col__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Col__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__3"


    // $ANTLR start "rule__Col__Group__3__Impl"
    // InternalChartIt.g:1876:1: rule__Col__Group__3__Impl : ( 'label' ) ;
    public final void rule__Col__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1880:1: ( ( 'label' ) )
            // InternalChartIt.g:1881:1: ( 'label' )
            {
            // InternalChartIt.g:1881:1: ( 'label' )
            // InternalChartIt.g:1882:2: 'label'
            {
             before(grammarAccess.getColAccess().getLabelKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getColAccess().getLabelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__3__Impl"


    // $ANTLR start "rule__Col__Group__4"
    // InternalChartIt.g:1891:1: rule__Col__Group__4 : rule__Col__Group__4__Impl rule__Col__Group__5 ;
    public final void rule__Col__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1895:1: ( rule__Col__Group__4__Impl rule__Col__Group__5 )
            // InternalChartIt.g:1896:2: rule__Col__Group__4__Impl rule__Col__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Col__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Col__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__4"


    // $ANTLR start "rule__Col__Group__4__Impl"
    // InternalChartIt.g:1903:1: rule__Col__Group__4__Impl : ( '=' ) ;
    public final void rule__Col__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1907:1: ( ( '=' ) )
            // InternalChartIt.g:1908:1: ( '=' )
            {
            // InternalChartIt.g:1908:1: ( '=' )
            // InternalChartIt.g:1909:2: '='
            {
             before(grammarAccess.getColAccess().getEqualsSignKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getColAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__4__Impl"


    // $ANTLR start "rule__Col__Group__5"
    // InternalChartIt.g:1918:1: rule__Col__Group__5 : rule__Col__Group__5__Impl rule__Col__Group__6 ;
    public final void rule__Col__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1922:1: ( rule__Col__Group__5__Impl rule__Col__Group__6 )
            // InternalChartIt.g:1923:2: rule__Col__Group__5__Impl rule__Col__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Col__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Col__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__5"


    // $ANTLR start "rule__Col__Group__5__Impl"
    // InternalChartIt.g:1930:1: rule__Col__Group__5__Impl : ( ( rule__Col__LabelAssignment_5 ) ) ;
    public final void rule__Col__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1934:1: ( ( ( rule__Col__LabelAssignment_5 ) ) )
            // InternalChartIt.g:1935:1: ( ( rule__Col__LabelAssignment_5 ) )
            {
            // InternalChartIt.g:1935:1: ( ( rule__Col__LabelAssignment_5 ) )
            // InternalChartIt.g:1936:2: ( rule__Col__LabelAssignment_5 )
            {
             before(grammarAccess.getColAccess().getLabelAssignment_5()); 
            // InternalChartIt.g:1937:2: ( rule__Col__LabelAssignment_5 )
            // InternalChartIt.g:1937:3: rule__Col__LabelAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Col__LabelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getColAccess().getLabelAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__5__Impl"


    // $ANTLR start "rule__Col__Group__6"
    // InternalChartIt.g:1945:1: rule__Col__Group__6 : rule__Col__Group__6__Impl rule__Col__Group__7 ;
    public final void rule__Col__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1949:1: ( rule__Col__Group__6__Impl rule__Col__Group__7 )
            // InternalChartIt.g:1950:2: rule__Col__Group__6__Impl rule__Col__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Col__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Col__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__6"


    // $ANTLR start "rule__Col__Group__6__Impl"
    // InternalChartIt.g:1957:1: rule__Col__Group__6__Impl : ( ',' ) ;
    public final void rule__Col__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1961:1: ( ( ',' ) )
            // InternalChartIt.g:1962:1: ( ',' )
            {
            // InternalChartIt.g:1962:1: ( ',' )
            // InternalChartIt.g:1963:2: ','
            {
             before(grammarAccess.getColAccess().getCommaKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getColAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__6__Impl"


    // $ANTLR start "rule__Col__Group__7"
    // InternalChartIt.g:1972:1: rule__Col__Group__7 : rule__Col__Group__7__Impl rule__Col__Group__8 ;
    public final void rule__Col__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1976:1: ( rule__Col__Group__7__Impl rule__Col__Group__8 )
            // InternalChartIt.g:1977:2: rule__Col__Group__7__Impl rule__Col__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Col__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Col__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__7"


    // $ANTLR start "rule__Col__Group__7__Impl"
    // InternalChartIt.g:1984:1: rule__Col__Group__7__Impl : ( 'color' ) ;
    public final void rule__Col__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:1988:1: ( ( 'color' ) )
            // InternalChartIt.g:1989:1: ( 'color' )
            {
            // InternalChartIt.g:1989:1: ( 'color' )
            // InternalChartIt.g:1990:2: 'color'
            {
             before(grammarAccess.getColAccess().getColorKeyword_7()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getColAccess().getColorKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__7__Impl"


    // $ANTLR start "rule__Col__Group__8"
    // InternalChartIt.g:1999:1: rule__Col__Group__8 : rule__Col__Group__8__Impl rule__Col__Group__9 ;
    public final void rule__Col__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2003:1: ( rule__Col__Group__8__Impl rule__Col__Group__9 )
            // InternalChartIt.g:2004:2: rule__Col__Group__8__Impl rule__Col__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__Col__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Col__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__8"


    // $ANTLR start "rule__Col__Group__8__Impl"
    // InternalChartIt.g:2011:1: rule__Col__Group__8__Impl : ( '=' ) ;
    public final void rule__Col__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2015:1: ( ( '=' ) )
            // InternalChartIt.g:2016:1: ( '=' )
            {
            // InternalChartIt.g:2016:1: ( '=' )
            // InternalChartIt.g:2017:2: '='
            {
             before(grammarAccess.getColAccess().getEqualsSignKeyword_8()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getColAccess().getEqualsSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__8__Impl"


    // $ANTLR start "rule__Col__Group__9"
    // InternalChartIt.g:2026:1: rule__Col__Group__9 : rule__Col__Group__9__Impl rule__Col__Group__10 ;
    public final void rule__Col__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2030:1: ( rule__Col__Group__9__Impl rule__Col__Group__10 )
            // InternalChartIt.g:2031:2: rule__Col__Group__9__Impl rule__Col__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Col__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Col__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__9"


    // $ANTLR start "rule__Col__Group__9__Impl"
    // InternalChartIt.g:2038:1: rule__Col__Group__9__Impl : ( ( rule__Col__ColorAssignment_9 ) ) ;
    public final void rule__Col__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2042:1: ( ( ( rule__Col__ColorAssignment_9 ) ) )
            // InternalChartIt.g:2043:1: ( ( rule__Col__ColorAssignment_9 ) )
            {
            // InternalChartIt.g:2043:1: ( ( rule__Col__ColorAssignment_9 ) )
            // InternalChartIt.g:2044:2: ( rule__Col__ColorAssignment_9 )
            {
             before(grammarAccess.getColAccess().getColorAssignment_9()); 
            // InternalChartIt.g:2045:2: ( rule__Col__ColorAssignment_9 )
            // InternalChartIt.g:2045:3: rule__Col__ColorAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Col__ColorAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getColAccess().getColorAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__9__Impl"


    // $ANTLR start "rule__Col__Group__10"
    // InternalChartIt.g:2053:1: rule__Col__Group__10 : rule__Col__Group__10__Impl ;
    public final void rule__Col__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2057:1: ( rule__Col__Group__10__Impl )
            // InternalChartIt.g:2058:2: rule__Col__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Col__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__10"


    // $ANTLR start "rule__Col__Group__10__Impl"
    // InternalChartIt.g:2064:1: rule__Col__Group__10__Impl : ( ')' ) ;
    public final void rule__Col__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2068:1: ( ( ')' ) )
            // InternalChartIt.g:2069:1: ( ')' )
            {
            // InternalChartIt.g:2069:1: ( ')' )
            // InternalChartIt.g:2070:2: ')'
            {
             before(grammarAccess.getColAccess().getRightParenthesisKeyword_10()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getColAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__Group__10__Impl"


    // $ANTLR start "rule__Program__NameAssignment_3"
    // InternalChartIt.g:2080:1: rule__Program__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Program__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2084:1: ( ( RULE_STRING ) )
            // InternalChartIt.g:2085:2: ( RULE_STRING )
            {
            // InternalChartIt.g:2085:2: ( RULE_STRING )
            // InternalChartIt.g:2086:3: RULE_STRING
            {
             before(grammarAccess.getProgramAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_3"


    // $ANTLR start "rule__Program__LoadDataAssignment_7"
    // InternalChartIt.g:2095:1: rule__Program__LoadDataAssignment_7 : ( ruleData ) ;
    public final void rule__Program__LoadDataAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2099:1: ( ( ruleData ) )
            // InternalChartIt.g:2100:2: ( ruleData )
            {
            // InternalChartIt.g:2100:2: ( ruleData )
            // InternalChartIt.g:2101:3: ruleData
            {
             before(grammarAccess.getProgramAccess().getLoadDataDataParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getLoadDataDataParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__LoadDataAssignment_7"


    // $ANTLR start "rule__Program__LoadDataAssignment_8_1"
    // InternalChartIt.g:2110:1: rule__Program__LoadDataAssignment_8_1 : ( ruleData ) ;
    public final void rule__Program__LoadDataAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2114:1: ( ( ruleData ) )
            // InternalChartIt.g:2115:2: ( ruleData )
            {
            // InternalChartIt.g:2115:2: ( ruleData )
            // InternalChartIt.g:2116:3: ruleData
            {
             before(grammarAccess.getProgramAccess().getLoadDataDataParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getLoadDataDataParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__LoadDataAssignment_8_1"


    // $ANTLR start "rule__Program__ColAssignment_12"
    // InternalChartIt.g:2125:1: rule__Program__ColAssignment_12 : ( ruleCol ) ;
    public final void rule__Program__ColAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2129:1: ( ( ruleCol ) )
            // InternalChartIt.g:2130:2: ( ruleCol )
            {
            // InternalChartIt.g:2130:2: ( ruleCol )
            // InternalChartIt.g:2131:3: ruleCol
            {
             before(grammarAccess.getProgramAccess().getColColParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleCol();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getColColParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ColAssignment_12"


    // $ANTLR start "rule__Program__ColAssignment_13_1"
    // InternalChartIt.g:2140:1: rule__Program__ColAssignment_13_1 : ( ruleCol ) ;
    public final void rule__Program__ColAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2144:1: ( ( ruleCol ) )
            // InternalChartIt.g:2145:2: ( ruleCol )
            {
            // InternalChartIt.g:2145:2: ( ruleCol )
            // InternalChartIt.g:2146:3: ruleCol
            {
             before(grammarAccess.getProgramAccess().getColColParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCol();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getColColParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ColAssignment_13_1"


    // $ANTLR start "rule__Program__ChartAssignment_17"
    // InternalChartIt.g:2155:1: rule__Program__ChartAssignment_17 : ( ruleChart ) ;
    public final void rule__Program__ChartAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2159:1: ( ( ruleChart ) )
            // InternalChartIt.g:2160:2: ( ruleChart )
            {
            // InternalChartIt.g:2160:2: ( ruleChart )
            // InternalChartIt.g:2161:3: ruleChart
            {
             before(grammarAccess.getProgramAccess().getChartChartParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleChart();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getChartChartParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ChartAssignment_17"


    // $ANTLR start "rule__Program__ChartAssignment_18_1"
    // InternalChartIt.g:2170:1: rule__Program__ChartAssignment_18_1 : ( ruleChart ) ;
    public final void rule__Program__ChartAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2174:1: ( ( ruleChart ) )
            // InternalChartIt.g:2175:2: ( ruleChart )
            {
            // InternalChartIt.g:2175:2: ( ruleChart )
            // InternalChartIt.g:2176:3: ruleChart
            {
             before(grammarAccess.getProgramAccess().getChartChartParserRuleCall_18_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChart();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getChartChartParserRuleCall_18_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ChartAssignment_18_1"


    // $ANTLR start "rule__Data__NameAssignment_1"
    // InternalChartIt.g:2185:1: rule__Data__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Data__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2189:1: ( ( RULE_STRING ) )
            // InternalChartIt.g:2190:2: ( RULE_STRING )
            {
            // InternalChartIt.g:2190:2: ( RULE_STRING )
            // InternalChartIt.g:2191:3: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__NameAssignment_1"


    // $ANTLR start "rule__Data__PathAssignment_3"
    // InternalChartIt.g:2200:1: rule__Data__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Data__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2204:1: ( ( RULE_STRING ) )
            // InternalChartIt.g:2205:2: ( RULE_STRING )
            {
            // InternalChartIt.g:2205:2: ( RULE_STRING )
            // InternalChartIt.g:2206:3: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getPathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__PathAssignment_3"


    // $ANTLR start "rule__Chart__NameAssignment_1"
    // InternalChartIt.g:2215:1: rule__Chart__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Chart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2219:1: ( ( RULE_STRING ) )
            // InternalChartIt.g:2220:2: ( RULE_STRING )
            {
            // InternalChartIt.g:2220:2: ( RULE_STRING )
            // InternalChartIt.g:2221:3: RULE_STRING
            {
             before(grammarAccess.getChartAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__NameAssignment_1"


    // $ANTLR start "rule__Chart__DataAssignment_5"
    // InternalChartIt.g:2230:1: rule__Chart__DataAssignment_5 : ( ( RULE_STRING ) ) ;
    public final void rule__Chart__DataAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2234:1: ( ( ( RULE_STRING ) ) )
            // InternalChartIt.g:2235:2: ( ( RULE_STRING ) )
            {
            // InternalChartIt.g:2235:2: ( ( RULE_STRING ) )
            // InternalChartIt.g:2236:3: ( RULE_STRING )
            {
             before(grammarAccess.getChartAccess().getDataDataCrossReference_5_0()); 
            // InternalChartIt.g:2237:3: ( RULE_STRING )
            // InternalChartIt.g:2238:4: RULE_STRING
            {
             before(grammarAccess.getChartAccess().getDataDataSTRINGTerminalRuleCall_5_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getDataDataSTRINGTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getChartAccess().getDataDataCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__DataAssignment_5"


    // $ANTLR start "rule__Chart__TypeAssignment_9"
    // InternalChartIt.g:2249:1: rule__Chart__TypeAssignment_9 : ( ruleChartType ) ;
    public final void rule__Chart__TypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2253:1: ( ( ruleChartType ) )
            // InternalChartIt.g:2254:2: ( ruleChartType )
            {
            // InternalChartIt.g:2254:2: ( ruleChartType )
            // InternalChartIt.g:2255:3: ruleChartType
            {
             before(grammarAccess.getChartAccess().getTypeChartTypeEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleChartType();

            state._fsp--;

             after(grammarAccess.getChartAccess().getTypeChartTypeEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__TypeAssignment_9"


    // $ANTLR start "rule__Chart__ColAssignment_13"
    // InternalChartIt.g:2264:1: rule__Chart__ColAssignment_13 : ( ( RULE_STRING ) ) ;
    public final void rule__Chart__ColAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2268:1: ( ( ( RULE_STRING ) ) )
            // InternalChartIt.g:2269:2: ( ( RULE_STRING ) )
            {
            // InternalChartIt.g:2269:2: ( ( RULE_STRING ) )
            // InternalChartIt.g:2270:3: ( RULE_STRING )
            {
             before(grammarAccess.getChartAccess().getColColCrossReference_13_0()); 
            // InternalChartIt.g:2271:3: ( RULE_STRING )
            // InternalChartIt.g:2272:4: RULE_STRING
            {
             before(grammarAccess.getChartAccess().getColColSTRINGTerminalRuleCall_13_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getColColSTRINGTerminalRuleCall_13_0_1()); 

            }

             after(grammarAccess.getChartAccess().getColColCrossReference_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__ColAssignment_13"


    // $ANTLR start "rule__Chart__ColAssignment_14_1"
    // InternalChartIt.g:2283:1: rule__Chart__ColAssignment_14_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Chart__ColAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2287:1: ( ( ( RULE_STRING ) ) )
            // InternalChartIt.g:2288:2: ( ( RULE_STRING ) )
            {
            // InternalChartIt.g:2288:2: ( ( RULE_STRING ) )
            // InternalChartIt.g:2289:3: ( RULE_STRING )
            {
             before(grammarAccess.getChartAccess().getColColCrossReference_14_1_0()); 
            // InternalChartIt.g:2290:3: ( RULE_STRING )
            // InternalChartIt.g:2291:4: RULE_STRING
            {
             before(grammarAccess.getChartAccess().getColColSTRINGTerminalRuleCall_14_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChartAccess().getColColSTRINGTerminalRuleCall_14_1_0_1()); 

            }

             after(grammarAccess.getChartAccess().getColColCrossReference_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__ColAssignment_14_1"


    // $ANTLR start "rule__Chart__BackgroundColorAssignment_18"
    // InternalChartIt.g:2302:1: rule__Chart__BackgroundColorAssignment_18 : ( ruleColor ) ;
    public final void rule__Chart__BackgroundColorAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2306:1: ( ( ruleColor ) )
            // InternalChartIt.g:2307:2: ( ruleColor )
            {
            // InternalChartIt.g:2307:2: ( ruleColor )
            // InternalChartIt.g:2308:3: ruleColor
            {
             before(grammarAccess.getChartAccess().getBackgroundColorColorEnumRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getChartAccess().getBackgroundColorColorEnumRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__BackgroundColorAssignment_18"


    // $ANTLR start "rule__Col__NameAssignment_1"
    // InternalChartIt.g:2317:1: rule__Col__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Col__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2321:1: ( ( RULE_STRING ) )
            // InternalChartIt.g:2322:2: ( RULE_STRING )
            {
            // InternalChartIt.g:2322:2: ( RULE_STRING )
            // InternalChartIt.g:2323:3: RULE_STRING
            {
             before(grammarAccess.getColAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__NameAssignment_1"


    // $ANTLR start "rule__Col__LabelAssignment_5"
    // InternalChartIt.g:2332:1: rule__Col__LabelAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Col__LabelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2336:1: ( ( RULE_STRING ) )
            // InternalChartIt.g:2337:2: ( RULE_STRING )
            {
            // InternalChartIt.g:2337:2: ( RULE_STRING )
            // InternalChartIt.g:2338:3: RULE_STRING
            {
             before(grammarAccess.getColAccess().getLabelSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColAccess().getLabelSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__LabelAssignment_5"


    // $ANTLR start "rule__Col__ColorAssignment_9"
    // InternalChartIt.g:2347:1: rule__Col__ColorAssignment_9 : ( ruleColor ) ;
    public final void rule__Col__ColorAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartIt.g:2351:1: ( ( ruleColor ) )
            // InternalChartIt.g:2352:2: ( ruleColor )
            {
            // InternalChartIt.g:2352:2: ( ruleColor )
            // InternalChartIt.g:2353:3: ruleColor
            {
             before(grammarAccess.getColAccess().getColorColorEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColAccess().getColorColorEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Col__ColorAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000007FF800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});

}