// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hfa extends Exception
{

    private static final long serialVersionUID = 0xdc41cfb411ac01f7L;
    private final String a;
    private final boolean b;

    public hfa(Exception exception, String s)
    {
        super(exception);
        a = s;
        b = false;
    }

    public hfa(String s)
    {
        this(s, ((String) (null)));
    }

    public hfa(String s, byte byte0)
    {
        super(s);
        b = true;
        a = null;
    }

    public hfa(String s, String s1)
    {
        super(s);
        a = s1;
        b = false;
    }
}
