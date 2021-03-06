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
    void caseAAPrograma(AAPrograma node);
    void caseAArNotEmptyAFamilia(AArNotEmptyAFamilia node);
    void caseAArRelacoesAListaRelacoes(AArRelacoesAListaRelacoes node);
    void caseAArRelARelacao(AArRelARelacao node);
    void caseAArDefiniADefClasse(AArDefiniADefClasse node);
    void caseAArProcFuncAMetodos(AArProcFuncAMetodos node);
    void caseAArDecProcedimentoAProcFunc(AArDecProcedimentoAProcFunc node);
    void caseAArDecFuncaoAProcFunc(AArDecFuncaoAProcFunc node);
    void caseAArObjADecObj(AArObjADecObj node);
    void caseAArObjReservadoADecObj(AArObjReservadoADecObj node);
    void caseAArVarADecVar(AArVarADecVar node);
    void caseAArConstADecConst(AArConstADecConst node);
    void caseAArInitAInicializacao(AArInitAInicializacao node);
    void caseAArTipoClasseATipo(AArTipoClasseATipo node);
    void caseAArTipoPrimitivoATipo(AArTipoPrimitivoATipo node);
    void caseAArClasseATipoClasse(AArClasseATipoClasse node);
    void caseAArRealATipoPrimitivo(AArRealATipoPrimitivo node);
    void caseAArBoolATipoPrimitivo(AArBoolATipoPrimitivo node);
    void caseAArProcedCompletoADecProcedimento(AArProcedCompletoADecProcedimento node);
    void caseAArProcedimentoADecProcedimento(AArProcedimentoADecProcedimento node);
    void caseAArFuncaoCompletaADecFuncao(AArFuncaoCompletaADecFuncao node);
    void caseAArFuncaoADecFuncao(AArFuncaoADecFuncao node);
    void caseAArParamsAParametros(AArParamsAParametros node);
    void caseAArListaAParams(AArListaAParams node);
    void caseAArParamAParametro(AArParamAParametro node);
    void caseAArSeAComando(AArSeAComando node);
    void caseAArSeSenaoAComando(AArSeSenaoAComando node);
    void caseAArEnquantoAComando(AArEnquantoAComando node);
    void caseAArAtbrAComando(AArAtbrAComando node);
    void caseAArChamadaMetdAComando(AArChamadaMetdAComando node);
    void caseAArBlocoAComando(AArBlocoAComando node);
    void caseAArSeSenaoAComandoDois(AArSeSenaoAComandoDois node);
    void caseAArBlocoAComandoDois(AArBlocoAComandoDois node);
    void caseAArIniciarBlocoABloco(AArIniciarBlocoABloco node);
    void caseAArDecObjAAtributos(AArDecObjAAtributos node);
    void caseAArDecVarAAtributos(AArDecVarAAtributos node);
    void caseAArDecConstAAtributos(AArDecConstAAtributos node);
    void caseAArExprAExprIni(AArExprAExprIni node);
    void caseAArInversorAExprIni(AArInversorAExprIni node);
    void caseAArIdentifierAExpr(AArIdentifierAExpr node);
    void caseAArNRealAExpr(AArNRealAExpr node);
    void caseAArVerdadeAExpr(AArVerdadeAExpr node);
    void caseAArFalsoAExpr(AArFalsoAExpr node);
    void caseAArChamadaAtributoAExpr(AArChamadaAtributoAExpr node);
    void caseAArChamadaMetdAExpr(AArChamadaMetdAExpr node);
    void caseAArSomaAExpr(AArSomaAExpr node);
    void caseAArMenosAExpr(AArMenosAExpr node);
    void caseAArMultAExpr(AArMultAExpr node);
    void caseAArDivAExpr(AArDivAExpr node);
    void caseAArModAExpr(AArModAExpr node);
    void caseAArIgualAExpr(AArIgualAExpr node);
    void caseAArELogicoAExpr(AArELogicoAExpr node);
    void caseAArOuLogicoAExpr(AArOuLogicoAExpr node);
    void caseAArMenorAExpr(AArMenorAExpr node);
    void caseAArMenorIgualAExpr(AArMenorIgualAExpr node);
    void caseAArBlocoExpAExpr(AArBlocoExpAExpr node);
    void caseAArBlocoABlocoExp(AArBlocoABlocoExp node);
    void caseAArChamadaMetodoAChamada(AArChamadaMetodoAChamada node);
    void caseAArReservadoLeAChamada(AArReservadoLeAChamada node);
    void caseAArReservadoImprimeAChamada(AArReservadoImprimeAChamada node);
    void caseAArIdAAtributo(AArIdAAtributo node);
    void caseAArExpressoesAListaExpr(AArExpressoesAListaExpr node);
    void caseAArListaAExprs(AArListaAExprs node);

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
    void caseTClasseReservada(TClasseReservada node);
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
    void caseTBarra(TBarra node);
    void caseTVazio(TVazio node);
    void caseTId(TId node);
    void caseTIdClass(TIdClass node);
    void caseTNumeroReal(TNumeroReal node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
