// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gri
{

    final String a;
    final int b;
    boolean c;

    public gri(String s, int i)
    {
        a = (String)g.e(s);
        b = i;
    }

    public gri a()
    {
        c = true;
        return this;
    }

    public grh b()
    {
        return new grh(this);
    }
}
