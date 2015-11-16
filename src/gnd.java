// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gnd
{

    Object a[];
    private int b;
    private boolean c;
    private int d;

    public gnd(int i)
    {
        d = i;
        b = 0;
        c = false;
        a = new Object[d];
    }

    public int a()
    {
        if (c)
        {
            return d;
        } else
        {
            return b;
        }
    }

    public Object a(int i)
    {
        if (c)
        {
            int j = b + i;
            i = j;
            if (j >= d)
            {
                i = j - d;
            }
            return a[i];
        } else
        {
            return a[i];
        }
    }

    public void a(Object obj)
    {
        a[b] = obj;
        b = b + 1;
        if (b == d)
        {
            b = 0;
            c = true;
        }
    }

    public Object b()
    {
        if (!c)
        {
            return null;
        } else
        {
            return a[b];
        }
    }
}
