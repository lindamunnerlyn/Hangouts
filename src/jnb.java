// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jnb extends jmr
{

    static final jnb o = new jnb();

    private jnb()
    {
    }

    public volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    public boolean b(char c)
    {
        return Character.isLetter(c);
    }

    public String toString()
    {
        return "CharMatcher.javaLetter()";
    }

}
