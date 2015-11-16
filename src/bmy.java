// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class bmy
    implements brc
{

    public bmy()
    {
    }

    public int a(brc brc1)
    {
        boolean flag;
        if (brc1.a() != a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        return a() - brc1.a();
    }

    public int compareTo(Object obj)
    {
        return a((brc)obj);
    }
}
