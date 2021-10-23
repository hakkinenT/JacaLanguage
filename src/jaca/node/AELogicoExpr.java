/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AELogicoExpr extends PExpr
{
    private PExpr _expr_;
    private TELogico _eLogico_;
    private PExprRelacional _exprRelacional_;

    public AELogicoExpr()
    {
        // Constructor
    }

    public AELogicoExpr(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TELogico _eLogico_,
        @SuppressWarnings("hiding") PExprRelacional _exprRelacional_)
    {
        // Constructor
        setExpr(_expr_);

        setELogico(_eLogico_);

        setExprRelacional(_exprRelacional_);

    }

    @Override
    public Object clone()
    {
        return new AELogicoExpr(
            cloneNode(this._expr_),
            cloneNode(this._eLogico_),
            cloneNode(this._exprRelacional_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAELogicoExpr(this);
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public TELogico getELogico()
    {
        return this._eLogico_;
    }

    public void setELogico(TELogico node)
    {
        if(this._eLogico_ != null)
        {
            this._eLogico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eLogico_ = node;
    }

    public PExprRelacional getExprRelacional()
    {
        return this._exprRelacional_;
    }

    public void setExprRelacional(PExprRelacional node)
    {
        if(this._exprRelacional_ != null)
        {
            this._exprRelacional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprRelacional_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._eLogico_)
            + toString(this._exprRelacional_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._eLogico_ == child)
        {
            this._eLogico_ = null;
            return;
        }

        if(this._exprRelacional_ == child)
        {
            this._exprRelacional_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._eLogico_ == oldChild)
        {
            setELogico((TELogico) newChild);
            return;
        }

        if(this._exprRelacional_ == oldChild)
        {
            setExprRelacional((PExprRelacional) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}