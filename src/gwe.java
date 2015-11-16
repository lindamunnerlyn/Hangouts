// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwe extends hec
{

    final gwd a;
    private int k;
    private int l;

    public gwe(gwd gwd)
    {
        a = gwd;
        super();
    }

    public int a()
    {
        return super.g;
    }

    public void a(int i, hdy hdy, int j, int i1, int j1)
    {
        super.b(0, hdy, j, j, i1);
        l = j1;
        k = 0;
    }

    public int b()
    {
        return l;
    }

    protected String c()
    {
        String s = super.c();
        switch (l)
        {
        default:
            return s;

        case 0: // '\0'
            return String.valueOf(s).concat("-normal");

        case 1: // '\001'
            return String.valueOf(s).concat("-rounded");

        case 2: // '\002'
            return String.valueOf(s).concat("-roundedcorners");
        }
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof gwe))
        {
            return false;
        }
        gwe gwe1 = (gwe)obj;
        if (l != gwe1.l)
        {
            return false;
        } else
        {
            return super.equals(obj);
        }
    }

    public int hashCode()
    {
        if (k == 0)
        {
            k = l + super.hashCode() * 31;
        }
        return k;
    }
}
