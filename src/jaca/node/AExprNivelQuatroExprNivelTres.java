/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AExprNivelQuatroExprNivelTres extends PExprNivelTres
{
    private PExprNivelQuatro _exprNivelQuatro_;

    public AExprNivelQuatroExprNivelTres()
    {
        // Constructor
    }

    public AExprNivelQuatroExprNivelTres(
        @SuppressWarnings("hiding") PExprNivelQuatro _exprNivelQuatro_)
    {
        // Constructor
        setExprNivelQuatro(_exprNivelQuatro_);

    }

    @Override
    public Object clone()
    {
        return new AExprNivelQuatroExprNivelTres(
            cloneNode(this._exprNivelQuatro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExprNivelQuatroExprNivelTres(this);
    }

    public PExprNivelQuatro getExprNivelQuatro()
    {
        return this._exprNivelQuatro_;
    }

    public void setExprNivelQuatro(PExprNivelQuatro node)
    {
        if(this._exprNivelQuatro_ != null)
        {
            this._exprNivelQuatro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprNivelQuatro_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exprNivelQuatro_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exprNivelQuatro_ == child)
        {
            this._exprNivelQuatro_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exprNivelQuatro_ == oldChild)
        {
            setExprNivelQuatro((PExprNivelQuatro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
