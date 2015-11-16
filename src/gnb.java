// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gnb
{

    final String a;
    final int b;
    boolean c;

    public gnb(String s, int i)
    {
        a = (String)g.d(s);
        b = i;
    }

    public gnb a()
    {
        c = true;
        return this;
    }

    public gna b()
    {
        return new gna(this);
    }
}
