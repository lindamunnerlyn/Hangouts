// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Vector;

public final class acj
{

    private Vector a;

    public acj()
    {
        a = null;
        a = new Vector();
    }

    public acr a(int i)
    {
        return (acr)a.get(i);
    }

    public void a()
    {
        a.clear();
    }

    public boolean a(acr acr1)
    {
        if (acr1 == null)
        {
            throw new NullPointerException();
        } else
        {
            return a.add(acr1);
        }
    }

    public int b()
    {
        return a.size();
    }

    public void b(acr acr1)
    {
        if (acr1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a.add(0, acr1);
            return;
        }
    }
}
