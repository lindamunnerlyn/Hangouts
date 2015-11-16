// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cnl
{

    final boolean a;
    final cns b;

    private cnl(cns cns)
    {
        this(cns, false);
    }

    private cnl(cns cns, boolean flag)
    {
        b = cns;
        a = flag;
    }

    public static cnl a(String s)
    {
        if (s.length() == 0)
        {
            throw new IllegalArgumentException("separator may not be empty or null");
        } else
        {
            return new cnl(new cnm(s));
        }
    }

    public cnl a()
    {
        return new cnl(b, true);
    }

    public Iterable a(CharSequence charsequence)
    {
        return new cno(this, charsequence);
    }
}
