// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class bnd
    implements brl
{

    public bnd()
    {
    }

    public int a(brl brl1)
    {
        boolean flag;
        if (brl1.a() != a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        return a() - brl1.a();
    }

    public int compareTo(Object obj)
    {
        return a((brl)obj);
    }
}
