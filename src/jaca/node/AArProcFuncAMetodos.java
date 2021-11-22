/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import java.util.*;
import jaca.analysis.*;

@SuppressWarnings("nls")
public final class AArProcFuncAMetodos extends PAMetodos
{
    private final LinkedList<PAProcFunc> _aProcFunc_ = new LinkedList<PAProcFunc>();

    public AArProcFuncAMetodos()
    {
        // Constructor
    }

    public AArProcFuncAMetodos(
        @SuppressWarnings("hiding") List<?> _aProcFunc_)
    {
        // Constructor
        setAProcFunc(_aProcFunc_);

    }

    @Override
    public Object clone()
    {
        return new AArProcFuncAMetodos(
            cloneList(this._aProcFunc_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArProcFuncAMetodos(this);
    }

    public LinkedList<PAProcFunc> getAProcFunc()
    {
        return this._aProcFunc_;
    }

    public void setAProcFunc(List<?> list)
    {
        for(PAProcFunc e : this._aProcFunc_)
        {
            e.parent(null);
        }
        this._aProcFunc_.clear();

        for(Object obj_e : list)
        {
            PAProcFunc e = (PAProcFunc) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._aProcFunc_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aProcFunc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aProcFunc_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PAProcFunc> i = this._aProcFunc_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAProcFunc) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}