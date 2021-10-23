/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.analysis;

import java.util.*;
import jaca.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprRelacionalExpr(AExprRelacionalExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExpr(AMenosExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaAtrbExpr(AChamadaAtrbExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaMetdExpr(AChamadaMetdExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAELogicoExpr(AELogicoExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuLogicoExpr(AOuLogicoExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprAritmExprRelacional(AExprAritmExprRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorQueExprRelacional(AMenorQueExprRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorIgualExprRelacional(AMenorIgualExprRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualExprRelacional(AIgualExprRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatorExprAritm(AFatorExprAritm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaExprAritm(ASomaExprAritm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubtExprAritm(ASubtExprAritm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoFator(ATermoFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultFator(AMultFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivFator(ADivFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModFator(AModFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorRealTermo(AValorRealTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParTermo(AParTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegacaoTermo(ANegacaoTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVerdadeValorBool(AVerdadeValorBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFalsoValorBool(AFalsoValorBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaMetodoChamada(AChamadaMetodoChamada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdAtributo(AIdAtributo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressoesListaExpr(AExpressoesListaExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExprs(AListaExprs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTClasse(TClasse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVerdade(TVerdade node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFalso(TFalso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProcedimento(TProcedimento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFuncao(TFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoBool(TTipoBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoReal(TTipoReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTHeranca(THeranca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTObjeto(TObjeto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVariavel(TVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstante(TConstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTELogico(TELogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOuLogico(TOuLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMetodoImprime(TMetodoImprime node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMetodoLe(TMetodoLe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentario(TComentario node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioBloco(TComentarioBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRelacaoSymbol(TRelacaoSymbol node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicioProced(TInicioProced node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParEsq(TParEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParDir(TParDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSoma(TSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNegacao(TNegacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVazio(TVazio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdClass(TIdClass node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroReal(TNumeroReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
