/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AArDecConstAAtributos extends PAAtributos
{
    private PADecConst _aDecConst_;

    public AArDecConstAAtributos()
    {
        // Constructor
    }

    public AArDecConstAAtributos(
        @SuppressWarnings("hiding") PADecConst _aDecConst_)
    {
        // Constructor
        setADecConst(_aDecConst_);

    }

    @Override
    public Object clone()
    {
        return new AArDecConstAAtributos(
            cloneNode(this._aDecConst_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArDecConstAAtributos(this);
    }

    public PADecConst getADecConst()
    {
        return this._aDecConst_;
    }

    public void setADecConst(PADecConst node)
    {
        if(this._aDecConst_ != null)
        {
            this._aDecConst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aDecConst_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aDecConst_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aDecConst_ == child)
        {
            this._aDecConst_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aDecConst_ == oldChild)
        {
            setADecConst((PADecConst) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
