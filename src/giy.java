// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class giy extends gdy
{

    final gir a;
    private final giv b;

    giy(gir gir, giv giv1)
    {
        a = gir;
        super(gdy.d);
        b = giv1;
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
