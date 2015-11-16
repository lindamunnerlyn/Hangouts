// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aga
{

    public final Object a;
    public final afl b;
    public final agh c;
    public boolean d;

    private aga(agh agh)
    {
        d = false;
        a = null;
        b = null;
        c = agh;
    }

    public aga(Object obj, afl afl)
    {
        d = false;
        a = obj;
        b = afl;
        c = null;
    }

    public static aga a(agh agh)
    {
        return new aga(agh);
    }

    public boolean a()
    {
        return c == null;
    }
}
