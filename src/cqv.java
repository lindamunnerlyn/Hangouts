// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class cqv
    implements cra
{

    public cqv()
    {
    }

    public int a(cqv cqv1)
    {
        return b() - 1 - (cqv1.b() - 1);
    }

    public int compareTo(Object obj)
    {
        return a((cqv)obj);
    }
}
