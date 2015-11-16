// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Vector;

public final class ach
{

    private Vector a;

    public ach()
    {
        a = null;
        a = new Vector();
    }

    public acp a(int i)
    {
        return (acp)a.get(i);
    }

    public void a()
    {
        a.clear();
    }

    public boolean a(acp acp1)
    {
        if (acp1 == null)
        {
            throw new NullPointerException();
        } else
        {
            return a.add(acp1);
        }
    }

    public int b()
    {
        return a.size();
    }

    public void b(acp acp1)
    {
        if (acp1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a.add(0, acp1);
            return;
        }
    }
}
