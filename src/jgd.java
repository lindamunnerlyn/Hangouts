// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jgd extends jgn
{

    final char q;
    final char r;

    jgd(String s, char c, char c1)
    {
        q = c;
        r = c1;
        super(s);
    }

    public boolean b(char c)
    {
        return q <= c && c <= r;
    }
}
