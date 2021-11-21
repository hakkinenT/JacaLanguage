/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AAProcedimentoADecProcedimento extends PADecProcedimento
{
    private TId _id_;
    private PAParametros _aParametros_;

    public AAProcedimentoADecProcedimento()
    {
        // Constructor
    }

    public AAProcedimentoADecProcedimento(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PAParametros _aParametros_)
    {
        // Constructor
        setId(_id_);

        setAParametros(_aParametros_);

    }

    @Override
    public Object clone()
    {
        return new AAProcedimentoADecProcedimento(
            cloneNode(this._id_),
            cloneNode(this._aParametros_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAProcedimentoADecProcedimento(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public PAParametros getAParametros()
    {
        return this._aParametros_;
    }

    public void setAParametros(PAParametros node)
    {
        if(this._aParametros_ != null)
        {
            this._aParametros_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aParametros_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._aParametros_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._aParametros_ == child)
        {
            this._aParametros_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._aParametros_ == oldChild)
        {
            setAParametros((PAParametros) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
