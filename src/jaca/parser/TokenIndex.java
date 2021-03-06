/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.parser;

import jaca.node.*;
import jaca.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTInicio(@SuppressWarnings("unused") TInicio node)
    {
        this.index = 0;
    }

    @Override
    public void caseTFim(@SuppressWarnings("unused") TFim node)
    {
        this.index = 1;
    }

    @Override
    public void caseTClasse(@SuppressWarnings("unused") TClasse node)
    {
        this.index = 2;
    }

    @Override
    public void caseTVerdade(@SuppressWarnings("unused") TVerdade node)
    {
        this.index = 3;
    }

    @Override
    public void caseTFalso(@SuppressWarnings("unused") TFalso node)
    {
        this.index = 4;
    }

    @Override
    public void caseTSe(@SuppressWarnings("unused") TSe node)
    {
        this.index = 5;
    }

    @Override
    public void caseTSenao(@SuppressWarnings("unused") TSenao node)
    {
        this.index = 6;
    }

    @Override
    public void caseTEnquanto(@SuppressWarnings("unused") TEnquanto node)
    {
        this.index = 7;
    }

    @Override
    public void caseTProcedimento(@SuppressWarnings("unused") TProcedimento node)
    {
        this.index = 8;
    }

    @Override
    public void caseTFuncao(@SuppressWarnings("unused") TFuncao node)
    {
        this.index = 9;
    }

    @Override
    public void caseTTipoBool(@SuppressWarnings("unused") TTipoBool node)
    {
        this.index = 10;
    }

    @Override
    public void caseTTipoReal(@SuppressWarnings("unused") TTipoReal node)
    {
        this.index = 11;
    }

    @Override
    public void caseTHeranca(@SuppressWarnings("unused") THeranca node)
    {
        this.index = 12;
    }

    @Override
    public void caseTObjeto(@SuppressWarnings("unused") TObjeto node)
    {
        this.index = 13;
    }

    @Override
    public void caseTVariavel(@SuppressWarnings("unused") TVariavel node)
    {
        this.index = 14;
    }

    @Override
    public void caseTConstante(@SuppressWarnings("unused") TConstante node)
    {
        this.index = 15;
    }

    @Override
    public void caseTELogico(@SuppressWarnings("unused") TELogico node)
    {
        this.index = 16;
    }

    @Override
    public void caseTOuLogico(@SuppressWarnings("unused") TOuLogico node)
    {
        this.index = 17;
    }

    @Override
    public void caseTClasseReservada(@SuppressWarnings("unused") TClasseReservada node)
    {
        this.index = 18;
    }

    @Override
    public void caseTMetodoImprime(@SuppressWarnings("unused") TMetodoImprime node)
    {
        this.index = 19;
    }

    @Override
    public void caseTMetodoLe(@SuppressWarnings("unused") TMetodoLe node)
    {
        this.index = 20;
    }

    @Override
    public void caseTRelacaoSymbol(@SuppressWarnings("unused") TRelacaoSymbol node)
    {
        this.index = 21;
    }

    @Override
    public void caseTPontoVirgula(@SuppressWarnings("unused") TPontoVirgula node)
    {
        this.index = 22;
    }

    @Override
    public void caseTAtribuicao(@SuppressWarnings("unused") TAtribuicao node)
    {
        this.index = 23;
    }

    @Override
    public void caseTInicioProced(@SuppressWarnings("unused") TInicioProced node)
    {
        this.index = 24;
    }

    @Override
    public void caseTParEsq(@SuppressWarnings("unused") TParEsq node)
    {
        this.index = 25;
    }

    @Override
    public void caseTParDir(@SuppressWarnings("unused") TParDir node)
    {
        this.index = 26;
    }

    @Override
    public void caseTVirgula(@SuppressWarnings("unused") TVirgula node)
    {
        this.index = 27;
    }

    @Override
    public void caseTPonto(@SuppressWarnings("unused") TPonto node)
    {
        this.index = 28;
    }

    @Override
    public void caseTSoma(@SuppressWarnings("unused") TSoma node)
    {
        this.index = 29;
    }

    @Override
    public void caseTMenos(@SuppressWarnings("unused") TMenos node)
    {
        this.index = 30;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 31;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 32;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 33;
    }

    @Override
    public void caseTIgual(@SuppressWarnings("unused") TIgual node)
    {
        this.index = 34;
    }

    @Override
    public void caseTMenor(@SuppressWarnings("unused") TMenor node)
    {
        this.index = 35;
    }

    @Override
    public void caseTMenorIgual(@SuppressWarnings("unused") TMenorIgual node)
    {
        this.index = 36;
    }

    @Override
    public void caseTNegacao(@SuppressWarnings("unused") TNegacao node)
    {
        this.index = 37;
    }

    @Override
    public void caseTBarra(@SuppressWarnings("unused") TBarra node)
    {
        this.index = 38;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 39;
    }

    @Override
    public void caseTIdClass(@SuppressWarnings("unused") TIdClass node)
    {
        this.index = 40;
    }

    @Override
    public void caseTNumeroReal(@SuppressWarnings("unused") TNumeroReal node)
    {
        this.index = 41;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 42;
    }
}
