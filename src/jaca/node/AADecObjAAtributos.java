/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AADecObjAAtributos extends PAAtributos
{
    private PADecObj _aDecObj_;

    public AADecObjAAtributos()
    {
        // Constructor
    }

    public AADecObjAAtributos(
        @SuppressWarnings("hiding") PADecObj _aDecObj_)
    {
        // Constructor
        setADecObj(_aDecObj_);

    }

    @Override
    public Object clone()
    {
        return new AADecObjAAtributos(
            cloneNode(this._aDecObj_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAADecObjAAtributos(this);
    }

    public PADecObj getADecObj()
    {
        return this._aDecObj_;
    }

    public void setADecObj(PADecObj node)
    {
        if(this._aDecObj_ != null)
        {
            this._aDecObj_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aDecObj_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aDecObj_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aDecObj_ == child)
        {
            this._aDecObj_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aDecObj_ == oldChild)
        {
            setADecObj((PADecObj) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
