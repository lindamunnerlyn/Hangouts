// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jmt extends jnf
{

    static final jmt o = new jmt();

    jmt()
    {
        super("CharMatcher.ascii()");
    }

    public boolean b(char c)
    {
        return c <= '\177';
    }

}
