// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cpd
{

    final boolean a;
    final cpk b;

    private cpd(cpk cpk)
    {
        this(cpk, false);
    }

    private cpd(cpk cpk, boolean flag)
    {
        b = cpk;
        a = flag;
    }

    public static cpd a(String s)
    {
        if (s.length() == 0)
        {
            throw new IllegalArgumentException("separator may not be empty or null");
        } else
        {
            return new cpd(new cpe(s));
        }
    }

    public cpd a()
    {
        return new cpd(b, true);
    }

    public Iterable a(CharSequence charsequence)
    {
        return new cpg(this, charsequence);
    }
}
