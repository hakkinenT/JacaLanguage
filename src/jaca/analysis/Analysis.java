/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.analysis;

import jaca.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAExprRelacionalExpr(AExprRelacionalExpr node);
    void caseAMenosExpr(AMenosExpr node);
    void caseAChamadaAtrbExpr(AChamadaAtrbExpr node);
    void caseAChamadaMetdExpr(AChamadaMetdExpr node);
    void caseAELogicoExpr(AELogicoExpr node);
    void caseAOuLogicoExpr(AOuLogicoExpr node);
    void caseAExprAritmExprRelacional(AExprAritmExprRelacional node);
    void caseAMenorQueExprRelacional(AMenorQueExprRelacional node);
    void caseAMenorIgualExprRelacional(AMenorIgualExprRelacional node);
    void caseAIgualExprRelacional(AIgualExprRelacional node);
    void caseAFatorExprAritm(AFatorExprAritm node);
    void caseASomaExprAritm(ASomaExprAritm node);
    void caseASubtExprAritm(ASubtExprAritm node);
    void caseATermoFator(ATermoFator node);
    void caseAMultFator(AMultFator node);
    void caseADivFator(ADivFator node);
    void caseAModFator(AModFator node);
    void caseAValorRealTermo(AValorRealTermo node);
    void caseAParTermo(AParTermo node);
    void caseANegacaoTermo(ANegacaoTermo node);
    void caseAVerdadeValorBool(AVerdadeValorBool node);
    void caseAFalsoValorBool(AFalsoValorBool node);
    void caseAChamadaMetodoChamada(AChamadaMetodoChamada node);
    void caseAIdAtributo(AIdAtributo node);
    void caseAExpressoesListaExpr(AExpressoesListaExpr node);
    void caseAListaExprs(AListaExprs node);

    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTClasse(TClasse node);
    void caseTVerdade(TVerdade node);
    void caseTFalso(TFalso node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTEnquanto(TEnquanto node);
    void caseTProcedimento(TProcedimento node);
    void caseTFuncao(TFuncao node);
    void caseTTipoBool(TTipoBool node);
    void caseTTipoReal(TTipoReal node);
    void caseTHeranca(THeranca node);
    void caseTObjeto(TObjeto node);
    void caseTVariavel(TVariavel node);
    void caseTConstante(TConstante node);
    void caseTELogico(TELogico node);
    void caseTOuLogico(TOuLogico node);
    void caseTMetodoImprime(TMetodoImprime node);
    void caseTMetodoLe(TMetodoLe node);
    void caseTComentario(TComentario node);
    void caseTComentarioBloco(TComentarioBloco node);
    void caseTRelacaoSymbol(TRelacaoSymbol node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTInicioProced(TInicioProced node);
    void caseTParEsq(TParEsq node);
    void caseTParDir(TParDir node);
    void caseTVirgula(TVirgula node);
    void caseTPonto(TPonto node);
    void caseTSoma(TSoma node);
    void caseTMenos(TMenos node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTIgual(TIgual node);
    void caseTMenor(TMenor node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTNegacao(TNegacao node);
    void caseTVazio(TVazio node);
    void caseTId(TId node);
    void caseTIdClass(TIdClass node);
    void caseTNumeroReal(TNumeroReal node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
