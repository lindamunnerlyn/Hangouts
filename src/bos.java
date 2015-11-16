// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bos extends boq
{

    final bor a;

    bos(bor bor1)
    {
        a = bor1;
        super();
    }

    public void b(int i)
    {
        a.c();
    }

    public void b(String s)
    {
        if (s != null)
        {
            a.a = s;
            a.b();
        }
    }

    public void f()
    {
        a.c();
    }
}
