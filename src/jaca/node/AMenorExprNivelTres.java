/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AMenorExprNivelTres extends PExprNivelTres
{
    private PExprNivelQuatro _a_;
    private TMenor _menor_;
    private PExprNivelQuatro _b_;

    public AMenorExprNivelTres()
    {
        // Constructor
    }

    public AMenorExprNivelTres(
        @SuppressWarnings("hiding") PExprNivelQuatro _a_,
        @SuppressWarnings("hiding") TMenor _menor_,
        @SuppressWarnings("hiding") PExprNivelQuatro _b_)
    {
        // Constructor
        setA(_a_);

        setMenor(_menor_);

        setB(_b_);

    }

    @Override
    public Object clone()
    {
        return new AMenorExprNivelTres(
            cloneNode(this._a_),
            cloneNode(this._menor_),
            cloneNode(this._b_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenorExprNivelTres(this);
    }

    public PExprNivelQuatro getA()
    {
        return this._a_;
    }

    public void setA(PExprNivelQuatro node)
    {
        if(this._a_ != null)
        {
            this._a_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._a_ = node;
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

    public PExprNivelQuatro getB()
    {
        return this._b_;
    }

    public void setB(PExprNivelQuatro node)
    {
        if(this._b_ != null)
        {
            this._b_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._b_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._a_)
            + toString(this._menor_)
            + toString(this._b_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._a_ == child)
        {
            this._a_ = null;
            return;
        }

        if(this._menor_ == child)
        {
            this._menor_ = null;
            return;
        }

        if(this._b_ == child)
        {
            this._b_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._a_ == oldChild)
        {
            setA((PExprNivelQuatro) newChild);
            return;
        }

        if(this._menor_ == oldChild)
        {
            setMenor((TMenor) newChild);
            return;
        }

        if(this._b_ == oldChild)
        {
            setB((PExprNivelQuatro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}