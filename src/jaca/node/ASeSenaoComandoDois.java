/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class ASeSenaoComandoDois extends PComandoDois
{
    private TSe _se_;
    private TParEsq _parEsq_;
    private PExpr _expr_;
    private TParDir _parDir_;
    private PComandoDois _a_;
    private TSenao _senao_;
    private PComandoDois _b_;

    public ASeSenaoComandoDois()
    {
        // Constructor
    }

    public ASeSenaoComandoDois(
        @SuppressWarnings("hiding") TSe _se_,
        @SuppressWarnings("hiding") TParEsq _parEsq_,
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TParDir _parDir_,
        @SuppressWarnings("hiding") PComandoDois _a_,
        @SuppressWarnings("hiding") TSenao _senao_,
        @SuppressWarnings("hiding") PComandoDois _b_)
    {
        // Constructor
        setSe(_se_);

        setParEsq(_parEsq_);

        setExpr(_expr_);

        setParDir(_parDir_);

        setA(_a_);

        setSenao(_senao_);

        setB(_b_);

    }

    @Override
    public Object clone()
    {
        return new ASeSenaoComandoDois(
            cloneNode(this._se_),
            cloneNode(this._parEsq_),
            cloneNode(this._expr_),
            cloneNode(this._parDir_),
            cloneNode(this._a_),
            cloneNode(this._senao_),
            cloneNode(this._b_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeSenaoComandoDois(this);
    }

    public TSe getSe()
    {
        return this._se_;
    }

    public void setSe(TSe node)
    {
        if(this._se_ != null)
        {
            this._se_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._se_ = node;
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

    public PComandoDois getA()
    {
        return this._a_;
    }

    public void setA(PComandoDois node)
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

    public TSenao getSenao()
    {
        return this._senao_;
    }

    public void setSenao(TSenao node)
    {
        if(this._senao_ != null)
        {
            this._senao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._senao_ = node;
    }

    public PComandoDois getB()
    {
        return this._b_;
    }

    public void setB(PComandoDois node)
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
            + toString(this._se_)
            + toString(this._parEsq_)
            + toString(this._expr_)
            + toString(this._parDir_)
            + toString(this._a_)
            + toString(this._senao_)
            + toString(this._b_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._se_ == child)
        {
            this._se_ = null;
            return;
        }

        if(this._parEsq_ == child)
        {
            this._parEsq_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._parDir_ == child)
        {
            this._parDir_ = null;
            return;
        }

        if(this._a_ == child)
        {
            this._a_ = null;
            return;
        }

        if(this._senao_ == child)
        {
            this._senao_ = null;
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
        if(this._se_ == oldChild)
        {
            setSe((TSe) newChild);
            return;
        }

        if(this._parEsq_ == oldChild)
        {
            setParEsq((TParEsq) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._parDir_ == oldChild)
        {
            setParDir((TParDir) newChild);
            return;
        }

        if(this._a_ == oldChild)
        {
            setA((PComandoDois) newChild);
            return;
        }

        if(this._senao_ == oldChild)
        {
            setSenao((TSenao) newChild);
            return;
        }

        if(this._b_ == oldChild)
        {
            setB((PComandoDois) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}