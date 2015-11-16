// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jna extends jnf
{

    static final jna o = new jna();

    private jna()
    {
        super("CharMatcher.javaIsoControl()");
    }

    public boolean b(char c)
    {
        return c <= '\037' || c >= '\177' && c <= '\237';
    }

}
