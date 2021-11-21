/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AADecVarAAtributos extends PAAtributos
{
    private PADecVar _aDecVar_;

    public AADecVarAAtributos()
    {
        // Constructor
    }

    public AADecVarAAtributos(
        @SuppressWarnings("hiding") PADecVar _aDecVar_)
    {
        // Constructor
        setADecVar(_aDecVar_);

    }

    @Override
    public Object clone()
    {
        return new AADecVarAAtributos(
            cloneNode(this._aDecVar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAADecVarAAtributos(this);
    }

    public PADecVar getADecVar()
    {
        return this._aDecVar_;
    }

    public void setADecVar(PADecVar node)
    {
        if(this._aDecVar_ != null)
        {
            this._aDecVar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aDecVar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aDecVar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aDecVar_ == child)
        {
            this._aDecVar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aDecVar_ == oldChild)
        {
            setADecVar((PADecVar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
