/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import java.util.*;
import jaca.analysis.*;

@SuppressWarnings("nls")
public final class ADefClasse extends PDefClasse
{
    private TClasse _classe_;
    private TIdClass _idClass_;
    private TInicio _inicio_;
    private final LinkedList<PAtributos> _atributos_ = new LinkedList<PAtributos>();
    private PMetodos _metodos_;
    private TFim _fim_;

    public ADefClasse()
    {
        // Constructor
    }

    public ADefClasse(
        @SuppressWarnings("hiding") TClasse _classe_,
        @SuppressWarnings("hiding") TIdClass _idClass_,
        @SuppressWarnings("hiding") TInicio _inicio_,
        @SuppressWarnings("hiding") List<?> _atributos_,
        @SuppressWarnings("hiding") PMetodos _metodos_,
        @SuppressWarnings("hiding") TFim _fim_)
    {
        // Constructor
        setClasse(_classe_);

        setIdClass(_idClass_);

        setInicio(_inicio_);

        setAtributos(_atributos_);

        setMetodos(_metodos_);

        setFim(_fim_);

    }

    @Override
    public Object clone()
    {
        return new ADefClasse(
            cloneNode(this._classe_),
            cloneNode(this._idClass_),
            cloneNode(this._inicio_),
            cloneList(this._atributos_),
            cloneNode(this._metodos_),
            cloneNode(this._fim_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADefClasse(this);
    }

    public TClasse getClasse()
    {
        return this._classe_;
    }

    public void setClasse(TClasse node)
    {
        if(this._classe_ != null)
        {
            this._classe_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classe_ = node;
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

    public LinkedList<PAtributos> getAtributos()
    {
        return this._atributos_;
    }

    public void setAtributos(List<?> list)
    {
        for(PAtributos e : this._atributos_)
        {
            e.parent(null);
        }
        this._atributos_.clear();

        for(Object obj_e : list)
        {
            PAtributos e = (PAtributos) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._atributos_.add(e);
        }
    }

    public PMetodos getMetodos()
    {
        return this._metodos_;
    }

    public void setMetodos(PMetodos node)
    {
        if(this._metodos_ != null)
        {
            this._metodos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._metodos_ = node;
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
            + toString(this._classe_)
            + toString(this._idClass_)
            + toString(this._inicio_)
            + toString(this._atributos_)
            + toString(this._metodos_)
            + toString(this._fim_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._classe_ == child)
        {
            this._classe_ = null;
            return;
        }

        if(this._idClass_ == child)
        {
            this._idClass_ = null;
            return;
        }

        if(this._inicio_ == child)
        {
            this._inicio_ = null;
            return;
        }

        if(this._atributos_.remove(child))
        {
            return;
        }

        if(this._metodos_ == child)
        {
            this._metodos_ = null;
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
        if(this._classe_ == oldChild)
        {
            setClasse((TClasse) newChild);
            return;
        }

        if(this._idClass_ == oldChild)
        {
            setIdClass((TIdClass) newChild);
            return;
        }

        if(this._inicio_ == oldChild)
        {
            setInicio((TInicio) newChild);
            return;
        }

        for(ListIterator<PAtributos> i = this._atributos_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAtributos) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._metodos_ == oldChild)
        {
            setMetodos((PMetodos) newChild);
            return;
        }

        if(this._fim_ == oldChild)
        {
            setFim((TFim) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}