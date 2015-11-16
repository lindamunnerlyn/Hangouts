// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gfs
    implements gfx
{

    final gfr a;

    gfs(gfr gfr1)
    {
        a = gfr1;
        super();
    }

    public void a(long l)
    {
        if (a.b != null)
        {
            a.b.a(l);
        }
    }

    public void a(long l, String s)
    {
        if (a.b != null)
        {
            a.b.a(l, s);
        }
    }

    public void a(long l, byte abyte0[])
    {
        if (a.b != null)
        {
            a.b.a(l, abyte0);
        }
    }
}
