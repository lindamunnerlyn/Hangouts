// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jgo extends jgb
{

    final jgb q;
    final jgb r;

    jgo(jgb jgb1, jgb jgb2)
    {
        this(jgb1, jgb2, (new StringBuilder("CharMatcher.or(")).append(jgb1).append(", ").append(jgb2).append(")").toString());
    }

    private jgo(jgb jgb1, jgb jgb2, String s)
    {
        super(s);
        q = (jgb)n.b(jgb1);
        r = (jgb)n.b(jgb2);
    }

    jgb a(String s)
    {
        return new jgo(q, r, s);
    }

    public volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    public boolean b(char c)
    {
        return q.b(c) || r.b(c);
    }
}
