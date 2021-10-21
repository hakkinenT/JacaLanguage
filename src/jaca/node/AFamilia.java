/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import java.util.*;
import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AFamilia extends PFamilia
{
    private PRelacao _relacao_;
    private final LinkedList<PListaRelacoes> _listaRelacoes_ = new LinkedList<PListaRelacoes>();
    private TPontoVirgula _pontoVirgula_;

    public AFamilia()
    {
        // Constructor
    }

    public AFamilia(
        @SuppressWarnings("hiding") PRelacao _relacao_,
        @SuppressWarnings("hiding") List<?> _listaRelacoes_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setRelacao(_relacao_);

        setListaRelacoes(_listaRelacoes_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AFamilia(
            cloneNode(this._relacao_),
            cloneList(this._listaRelacoes_),
            cloneNode(this._pontoVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFamilia(this);
    }

    public PRelacao getRelacao()
    {
        return this._relacao_;
    }

    public void setRelacao(PRelacao node)
    {
        if(this._relacao_ != null)
        {
            this._relacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._relacao_ = node;
    }

    public LinkedList<PListaRelacoes> getListaRelacoes()
    {
        return this._listaRelacoes_;
    }

    public void setListaRelacoes(List<?> list)
    {
        for(PListaRelacoes e : this._listaRelacoes_)
        {
            e.parent(null);
        }
        this._listaRelacoes_.clear();

        for(Object obj_e : list)
        {
            PListaRelacoes e = (PListaRelacoes) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._listaRelacoes_.add(e);
        }
    }

    public TPontoVirgula getPontoVirgula()
    {
        return this._pontoVirgula_;
    }

    public void setPontoVirgula(TPontoVirgula node)
    {
        if(this._pontoVirgula_ != null)
        {
            this._pontoVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoVirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._relacao_)
            + toString(this._listaRelacoes_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._relacao_ == child)
        {
            this._relacao_ = null;
            return;
        }

        if(this._listaRelacoes_.remove(child))
        {
            return;
        }

        if(this._pontoVirgula_ == child)
        {
            this._pontoVirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._relacao_ == oldChild)
        {
            setRelacao((PRelacao) newChild);
            return;
        }

        for(ListIterator<PListaRelacoes> i = this._listaRelacoes_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PListaRelacoes) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._pontoVirgula_ == oldChild)
        {
            setPontoVirgula((TPontoVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
