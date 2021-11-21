/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AADecFuncaoAProcFunc extends PAProcFunc
{
    private PADecFuncao _aDecFuncao_;

    public AADecFuncaoAProcFunc()
    {
        // Constructor
    }

    public AADecFuncaoAProcFunc(
        @SuppressWarnings("hiding") PADecFuncao _aDecFuncao_)
    {
        // Constructor
        setADecFuncao(_aDecFuncao_);

    }

    @Override
    public Object clone()
    {
        return new AADecFuncaoAProcFunc(
            cloneNode(this._aDecFuncao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAADecFuncaoAProcFunc(this);
    }

    public PADecFuncao getADecFuncao()
    {
        return this._aDecFuncao_;
    }

    public void setADecFuncao(PADecFuncao node)
    {
        if(this._aDecFuncao_ != null)
        {
            this._aDecFuncao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aDecFuncao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aDecFuncao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aDecFuncao_ == child)
        {
            this._aDecFuncao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aDecFuncao_ == oldChild)
        {
            setADecFuncao((PADecFuncao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
