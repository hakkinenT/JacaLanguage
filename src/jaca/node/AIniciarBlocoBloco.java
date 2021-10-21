/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import java.util.*;
import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AIniciarBlocoBloco extends PBloco
{
    private TInicio _inicio_;
    private final LinkedList<PTipoDecl> _tipoDecl_ = new LinkedList<PTipoDecl>();
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();
    private TFim _fim_;

    public AIniciarBlocoBloco()
    {
        // Constructor
    }

    public AIniciarBlocoBloco(
        @SuppressWarnings("hiding") TInicio _inicio_,
        @SuppressWarnings("hiding") List<?> _tipoDecl_,
        @SuppressWarnings("hiding") List<?> _comando_,
        @SuppressWarnings("hiding") TFim _fim_)
    {
        // Constructor
        setInicio(_inicio_);

        setTipoDecl(_tipoDecl_);

        setComando(_comando_);

        setFim(_fim_);

    }

    @Override
    public Object clone()
    {
        return new AIniciarBlocoBloco(
            cloneNode(this._inicio_),
            cloneList(this._tipoDecl_),
            cloneList(this._comando_),
            cloneNode(this._fim_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIniciarBlocoBloco(this);
    }

    public TInicio getInicio()
    {
        return this._inicio_;
    }

    public void setInicio(TInicio node)
    {
        if(this._inicio_ != null)
        {
            this._inicio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inicio_ = node;
    }

    public LinkedList<PTipoDecl> getTipoDecl()
    {
        return this._tipoDecl_;
    }

    public void setTipoDecl(List<?> list)
    {
        for(PTipoDecl e : this._tipoDecl_)
        {
            e.parent(null);
        }
        this._tipoDecl_.clear();

        for(Object obj_e : list)
        {
            PTipoDecl e = (PTipoDecl) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._tipoDecl_.add(e);
        }
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    public TFim getFim()
    {
        return this._fim_;
    }

    public void setFim(TFim node)
    {
        if(this._fim_ != null)
        {
            this._fim_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fim_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inicio_)
            + toString(this._tipoDecl_)
            + toString(this._comando_)
            + toString(this._fim_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inicio_ == child)
        {
            this._inicio_ = null;
            return;
        }

        if(this._tipoDecl_.remove(child))
        {
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        if(this._fim_ == child)
        {
            this._fim_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inicio_ == oldChild)
        {
            setInicio((TInicio) newChild);
            return;
        }

        for(ListIterator<PTipoDecl> i = this._tipoDecl_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PTipoDecl) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._fim_ == oldChild)
        {
            setFim((TFim) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
