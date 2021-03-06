/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AArSeAComando extends PAComando
{
    private PAExprIni _aExprIni_;
    private PAComando _aComando_;

    public AArSeAComando()
    {
        // Constructor
    }

    public AArSeAComando(
        @SuppressWarnings("hiding") PAExprIni _aExprIni_,
        @SuppressWarnings("hiding") PAComando _aComando_)
    {
        // Constructor
        setAExprIni(_aExprIni_);

        setAComando(_aComando_);

    }

    @Override
    public Object clone()
    {
        return new AArSeAComando(
            cloneNode(this._aExprIni_),
            cloneNode(this._aComando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArSeAComando(this);
    }

    public PAExprIni getAExprIni()
    {
        return this._aExprIni_;
    }

    public void setAExprIni(PAExprIni node)
    {
        if(this._aExprIni_ != null)
        {
            this._aExprIni_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aExprIni_ = node;
    }

    public PAComando getAComando()
    {
        return this._aComando_;
    }

    public void setAComando(PAComando node)
    {
        if(this._aComando_ != null)
        {
            this._aComando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aComando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aExprIni_)
            + toString(this._aComando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aExprIni_ == child)
        {
            this._aExprIni_ = null;
            return;
        }

        if(this._aComando_ == child)
        {
            this._aComando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aExprIni_ == oldChild)
        {
            setAExprIni((PAExprIni) newChild);
            return;
        }

        if(this._aComando_ == oldChild)
        {
            setAComando((PAComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
