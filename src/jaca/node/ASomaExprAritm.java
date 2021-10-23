/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class ASomaExprAritm extends PExprAritm
{
    private PExprAritm _exprAritm_;
    private TSoma _soma_;
    private PFator _fator_;

    public ASomaExprAritm()
    {
        // Constructor
    }

    public ASomaExprAritm(
        @SuppressWarnings("hiding") PExprAritm _exprAritm_,
        @SuppressWarnings("hiding") TSoma _soma_,
        @SuppressWarnings("hiding") PFator _fator_)
    {
        // Constructor
        setExprAritm(_exprAritm_);

        setSoma(_soma_);

        setFator(_fator_);

    }

    @Override
    public Object clone()
    {
        return new ASomaExprAritm(
            cloneNode(this._exprAritm_),
            cloneNode(this._soma_),
            cloneNode(this._fator_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASomaExprAritm(this);
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

    public TSoma getSoma()
    {
        return this._soma_;
    }

    public void setSoma(TSoma node)
    {
        if(this._soma_ != null)
        {
            this._soma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._soma_ = node;
    }

    public PFator getFator()
    {
        return this._fator_;
    }

    public void setFator(PFator node)
    {
        if(this._fator_ != null)
        {
            this._fator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fator_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exprAritm_)
            + toString(this._soma_)
            + toString(this._fator_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exprAritm_ == child)
        {
            this._exprAritm_ = null;
            return;
        }

        if(this._soma_ == child)
        {
            this._soma_ = null;
            return;
        }

        if(this._fator_ == child)
        {
            this._fator_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exprAritm_ == oldChild)
        {
            setExprAritm((PExprAritm) newChild);
            return;
        }

        if(this._soma_ == oldChild)
        {
            setSoma((TSoma) newChild);
            return;
        }

        if(this._fator_ == oldChild)
        {
            setFator((PFator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}