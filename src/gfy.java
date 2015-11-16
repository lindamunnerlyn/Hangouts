// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gfy extends gbk
{

    final gfr a;
    private final gfv b;

    gfy(gfr gfr, gfv gfv1)
    {
        a = gfr;
        super(gbk.d);
        b = gfv1;
    }

    protected Object a()
    {
        return b.b();
    }

    protected void onPostExecute(Object obj)
    {
        b.a(obj);
    }

    protected void onPreExecute()
    {
        b.a();
    }
}
