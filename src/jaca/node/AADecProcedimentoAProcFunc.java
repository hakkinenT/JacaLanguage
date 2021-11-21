/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AADecProcedimentoAProcFunc extends PAProcFunc
{
    private PADecProcedimento _aDecProcedimento_;

    public AADecProcedimentoAProcFunc()
    {
        // Constructor
    }

    public AADecProcedimentoAProcFunc(
        @SuppressWarnings("hiding") PADecProcedimento _aDecProcedimento_)
    {
        // Constructor
        setADecProcedimento(_aDecProcedimento_);

    }

    @Override
    public Object clone()
    {
        return new AADecProcedimentoAProcFunc(
            cloneNode(this._aDecProcedimento_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAADecProcedimentoAProcFunc(this);
    }

    public PADecProcedimento getADecProcedimento()
    {
        return this._aDecProcedimento_;
    }

    public void setADecProcedimento(PADecProcedimento node)
    {
        if(this._aDecProcedimento_ != null)
        {
            this._aDecProcedimento_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aDecProcedimento_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aDecProcedimento_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aDecProcedimento_ == child)
        {
            this._aDecProcedimento_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aDecProcedimento_ == oldChild)
        {
            setADecProcedimento((PADecProcedimento) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
