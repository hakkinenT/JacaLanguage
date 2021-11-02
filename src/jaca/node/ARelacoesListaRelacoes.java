/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class ARelacoesListaRelacoes extends PListaRelacoes
{
    private TRelacaoSymbol _relacaoSymbol_;
    private PRelacao _relacao_;

    public ARelacoesListaRelacoes()
    {
        // Constructor
    }

    public ARelacoesListaRelacoes(
        @SuppressWarnings("hiding") TRelacaoSymbol _relacaoSymbol_,
        @SuppressWarnings("hiding") PRelacao _relacao_)
    {
        // Constructor
        setRelacaoSymbol(_relacaoSymbol_);

        setRelacao(_relacao_);

    }

    @Override
    public Object clone()
    {
        return new ARelacoesListaRelacoes(
            cloneNode(this._relacaoSymbol_),
            cloneNode(this._relacao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARelacoesListaRelacoes(this);
    }

    public TRelacaoSymbol getRelacaoSymbol()
    {
        return this._relacaoSymbol_;
    }

    public void setRelacaoSymbol(TRelacaoSymbol node)
    {
        if(this._relacaoSymbol_ != null)
        {
            this._relacaoSymbol_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._relacaoSymbol_ = node;
    }

    public PRelacao getRelacao()
    {
        return this._relacao_;
    }

    public void setRelacao(PRelacao node)
    {
        if(this._relacao_ != null)
        {
            this._relacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._relacao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._relacaoSymbol_)
            + toString(this._relacao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._relacaoSymbol_ == child)
        {
            this._relacaoSymbol_ = null;
            return;
        }

        if(this._relacao_ == child)
        {
            this._relacao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._relacaoSymbol_ == oldChild)
        {
            setRelacaoSymbol((TRelacaoSymbol) newChild);
            return;
        }

        if(this._relacao_ == oldChild)
        {
            setRelacao((PRelacao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
