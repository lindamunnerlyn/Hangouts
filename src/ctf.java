// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class ctf
    implements ctk
{

    public ctf()
    {
    }

    public int a(ctf ctf1)
    {
        return b() - 1 - (ctf1.b() - 1);
    }

    public int compareTo(Object obj)
    {
        return a((ctf)obj);
    }
}
