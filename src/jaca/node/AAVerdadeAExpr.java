/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AAVerdadeAExpr extends PAExpr
{
    private TVerdade _verdade_;

    public AAVerdadeAExpr()
    {
        // Constructor
    }

    public AAVerdadeAExpr(
        @SuppressWarnings("hiding") TVerdade _verdade_)
    {
        // Constructor
        setVerdade(_verdade_);

    }

    @Override
    public Object clone()
    {
        return new AAVerdadeAExpr(
            cloneNode(this._verdade_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAVerdadeAExpr(this);
    }

    public TVerdade getVerdade()
    {
        return this._verdade_;
    }

    public void setVerdade(TVerdade node)
    {
        if(this._verdade_ != null)
        {
            this._verdade_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._verdade_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._verdade_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._verdade_ == child)
        {
            this._verdade_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._verdade_ == oldChild)
        {
            setVerdade((TVerdade) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
