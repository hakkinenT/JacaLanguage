/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AMenorQueExprRelacional extends PExprRelacional
{
    private PExprRelacional _exprRelacional_;
    private TMenor _menor_;
    private PExprAritm _exprAritm_;

    public AMenorQueExprRelacional()
    {
        // Constructor
    }

    public AMenorQueExprRelacional(
        @SuppressWarnings("hiding") PExprRelacional _exprRelacional_,
        @SuppressWarnings("hiding") TMenor _menor_,
        @SuppressWarnings("hiding") PExprAritm _exprAritm_)
    {
        // Constructor
        setExprRelacional(_exprRelacional_);

        setMenor(_menor_);

        setExprAritm(_exprAritm_);

    }

    @Override
    public Object clone()
    {
        return new AMenorQueExprRelacional(
            cloneNode(this._exprRelacional_),
            cloneNode(this._menor_),
            cloneNode(this._exprAritm_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenorQueExprRelacional(this);
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

    public TMenor getMenor()
    {
        return this._menor_;
    }

    public void setMenor(TMenor node)
    {
        if(this._menor_ != null)
        {
            this._menor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menor_ = node;
    }

    public PExprAritm getExprAritm()
    {
        return this._exprAritm_;
    }

    public void setExprAritm(PExprAritm node)
    {
        if(this._exprAritm_ != null)
        {
            this._exprAritm_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprAritm_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exprRelacional_)
            + toString(this._menor_)
            + toString(this._exprAritm_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exprRelacional_ == child)
        {
            this._exprRelacional_ = null;
            return;
        }

        if(this._menor_ == child)
        {
            this._menor_ = null;
            return;
        }

        if(this._exprAritm_ == child)
        {
            this._exprAritm_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exprRelacional_ == oldChild)
        {
            setExprRelacional((PExprRelacional) newChild);
            return;
        }

        if(this._menor_ == oldChild)
        {
            setMenor((TMenor) newChild);
            return;
        }

        if(this._exprAritm_ == oldChild)
        {
            setExprAritm((PExprAritm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}