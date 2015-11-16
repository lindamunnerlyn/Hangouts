// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jmz extends jmr
{

    static final jmz o = new jmz();

    private jmz()
    {
    }

    public volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    public boolean b(char c)
    {
        return Character.isDigit(c);
    }

    public String toString()
    {
        return "CharMatcher.javaDigit()";
    }

}
