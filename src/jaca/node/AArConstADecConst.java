/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AArConstADecConst extends PADecConst
{
    private PATipoPrimitivo _aTipoPrimitivo_;

    public AArConstADecConst()
    {
        // Constructor
    }

    public AArConstADecConst(
        @SuppressWarnings("hiding") PATipoPrimitivo _aTipoPrimitivo_)
    {
        // Constructor
        setATipoPrimitivo(_aTipoPrimitivo_);

    }

    @Override
    public Object clone()
    {
        return new AArConstADecConst(
            cloneNode(this._aTipoPrimitivo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArConstADecConst(this);
    }

    public PATipoPrimitivo getATipoPrimitivo()
    {
        return this._aTipoPrimitivo_;
    }

    public void setATipoPrimitivo(PATipoPrimitivo node)
    {
        if(this._aTipoPrimitivo_ != null)
        {
            this._aTipoPrimitivo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aTipoPrimitivo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aTipoPrimitivo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aTipoPrimitivo_ == child)
        {
            this._aTipoPrimitivo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aTipoPrimitivo_ == oldChild)
        {
            setATipoPrimitivo((PATipoPrimitivo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
