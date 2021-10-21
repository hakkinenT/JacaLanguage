/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AClasseTipoClasse extends PTipoClasse
{
    private TIdClass _idClass_;

    public AClasseTipoClasse()
    {
        // Constructor
    }

    public AClasseTipoClasse(
        @SuppressWarnings("hiding") TIdClass _idClass_)
    {
        // Constructor
        setIdClass(_idClass_);

    }

    @Override
    public Object clone()
    {
        return new AClasseTipoClasse(
            cloneNode(this._idClass_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClasseTipoClasse(this);
    }

    public TIdClass getIdClass()
    {
        return this._idClass_;
    }

    public void setIdClass(TIdClass node)
    {
        if(this._idClass_ != null)
        {
            this._idClass_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._idClass_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._idClass_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._idClass_ == child)
        {
            this._idClass_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._idClass_ == oldChild)
        {
            setIdClass((TIdClass) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}