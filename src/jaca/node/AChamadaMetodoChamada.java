/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AChamadaMetodoChamada extends PChamada
{
    private TId _id_;
    private TParEsq _parEsq_;
    private PListaExpr _listaExpr_;
    private TParDir _parDir_;

    public AChamadaMetodoChamada()
    {
        // Constructor
    }

    public AChamadaMetodoChamada(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TParEsq _parEsq_,
        @SuppressWarnings("hiding") PListaExpr _listaExpr_,
        @SuppressWarnings("hiding") TParDir _parDir_)
    {
        // Constructor
        setId(_id_);

        setParEsq(_parEsq_);

        setListaExpr(_listaExpr_);

        setParDir(_parDir_);

    }

    @Override
    public Object clone()
    {
        return new AChamadaMetodoChamada(
            cloneNode(this._id_),
            cloneNode(this._parEsq_),
            cloneNode(this._listaExpr_),
            cloneNode(this._parDir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChamadaMetodoChamada(this);
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

    public TParEsq getParEsq()
    {
        return this._parEsq_;
    }

    public void setParEsq(TParEsq node)
    {
        if(this._parEsq_ != null)
        {
            this._parEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parEsq_ = node;
    }

    public PListaExpr getListaExpr()
    {
        return this._listaExpr_;
    }

    public void setListaExpr(PListaExpr node)
    {
        if(this._listaExpr_ != null)
        {
            this._listaExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listaExpr_ = node;
    }

    public TParDir getParDir()
    {
        return this._parDir_;
    }

    public void setParDir(TParDir node)
    {
        if(this._parDir_ != null)
        {
            this._parDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parDir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._parEsq_)
            + toString(this._listaExpr_)
            + toString(this._parDir_);
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

        if(this._parEsq_ == child)
        {
            this._parEsq_ = null;
            return;
        }

        if(this._listaExpr_ == child)
        {
            this._listaExpr_ = null;
            return;
        }

        if(this._parDir_ == child)
        {
            this._parDir_ = null;
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

        if(this._parEsq_ == oldChild)
        {
            setParEsq((TParEsq) newChild);
            return;
        }

        if(this._listaExpr_ == oldChild)
        {
            setListaExpr((PListaExpr) newChild);
            return;
        }

        if(this._parDir_ == oldChild)
        {
            setParDir((TParDir) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}