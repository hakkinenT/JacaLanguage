/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AListaListParam extends PListParam
{
    private TVirgula _virgula_;
    private PParametro _parametro_;

    public AListaListParam()
    {
        // Constructor
    }

    public AListaListParam(
        @SuppressWarnings("hiding") TVirgula _virgula_,
        @SuppressWarnings("hiding") PParametro _parametro_)
    {
        // Constructor
        setVirgula(_virgula_);

        setParametro(_parametro_);

    }

    @Override
    public Object clone()
    {
        return new AListaListParam(
            cloneNode(this._virgula_),
            cloneNode(this._parametro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaListParam(this);
    }

    public TVirgula getVirgula()
    {
        return this._virgula_;
    }

    public void setVirgula(TVirgula node)
    {
        if(this._virgula_ != null)
        {
            this._virgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._virgula_ = node;
    }

    public PParametro getParametro()
    {
        return this._parametro_;
    }

    public void setParametro(PParametro node)
    {
        if(this._parametro_ != null)
        {
            this._parametro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametro_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._virgula_)
            + toString(this._parametro_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._virgula_ == child)
        {
            this._virgula_ = null;
            return;
        }

        if(this._parametro_ == child)
        {
            this._parametro_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._virgula_ == oldChild)
        {
            setVirgula((TVirgula) newChild);
            return;
        }

        if(this._parametro_ == oldChild)
        {
            setParametro((PParametro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}