// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jgm extends jgn
{

    final char q;

    jgm(String s, char c)
    {
        q = c;
        super(s);
    }

    public jgb a(jgb jgb1)
    {
        if (jgb1.b(q))
        {
            return jgb1;
        } else
        {
            return super.a(jgb1);
        }
    }

    public boolean b(char c)
    {
        return c == q;
    }
}
