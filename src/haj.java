// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class haj extends Exception
{

    private static final long serialVersionUID = 0xdc41cfb411ac01f7L;
    private final String a;
    private final boolean b;

    public haj(Exception exception, String s)
    {
        super(exception);
        a = s;
        b = false;
    }

    public haj(String s)
    {
        this(s, ((String) (null)));
    }

    public haj(String s, byte byte0)
    {
        super(s);
        b = true;
        a = null;
    }

    public haj(String s, String s1)
    {
        super(s);
        a = s1;
        b = false;
    }
}
