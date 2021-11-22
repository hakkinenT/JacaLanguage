/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AArChamadaAtributoAExpr extends PAExpr
{
    private TId _id_;
    private PAAtributo _aAtributo_;

    public AArChamadaAtributoAExpr()
    {
        // Constructor
    }

    public AArChamadaAtributoAExpr(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PAAtributo _aAtributo_)
    {
        // Constructor
        setId(_id_);

        setAAtributo(_aAtributo_);

    }

    @Override
    public Object clone()
    {
        return new AArChamadaAtributoAExpr(
            cloneNode(this._id_),
            cloneNode(this._aAtributo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArChamadaAtributoAExpr(this);
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

    public PAAtributo getAAtributo()
    {
        return this._aAtributo_;
    }

    public void setAAtributo(PAAtributo node)
    {
        if(this._aAtributo_ != null)
        {
            this._aAtributo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aAtributo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._aAtributo_);
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

        if(this._aAtributo_ == child)
        {
            this._aAtributo_ = null;
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

        if(this._aAtributo_ == oldChild)
        {
            setAAtributo((PAAtributo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}