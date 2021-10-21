/* This file was generated by SableCC (http://www.sablecc.org/). */

package jaca.node;

import jaca.analysis.*;

@SuppressWarnings("nls")
public final class TFuncao extends Token
{
    public TFuncao()
    {
        super.setText("função");
    }

    public TFuncao(int line, int pos)
    {
        super.setText("função");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFuncao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFuncao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFuncao text.");
    }
}
