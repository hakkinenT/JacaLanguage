/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AAAtbrAComando extends PAComando
{
    private TId _id_;
    private PAExprInversora _aExprInversora_;

    public AAAtbrAComando()
    {
        // Constructor
    }

    public AAAtbrAComando(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PAExprInversora _aExprInversora_)
    {
        // Constructor
        setId(_id_);

        setAExprInversora(_aExprInversora_);

    }

    @Override
    public Object clone()
    {
        return new AAAtbrAComando(
            cloneNode(this._id_),
            cloneNode(this._aExprInversora_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAAtbrAComando(this);
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

    public PAExprInversora getAExprInversora()
    {
        return this._aExprInversora_;
    }

    public void setAExprInversora(PAExprInversora node)
    {
        if(this._aExprInversora_ != null)
        {
            this._aExprInversora_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aExprInversora_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._aExprInversora_);
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

        if(this._aExprInversora_ == child)
        {
            this._aExprInversora_ = null;
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

        if(this._aExprInversora_ == oldChild)
        {
            setAExprInversora((PAExprInversora) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
