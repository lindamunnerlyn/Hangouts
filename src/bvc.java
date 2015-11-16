// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bvc
    implements Runnable
{

    final bvm a;
    final String b;
    final bva c;

    bvc(bva bva, bvm bvm1, String s)
    {
        c = bva;
        a = bvm1;
        b = s;
        super();
    }

    public void run()
    {
        a.a((new bvl()).a(b).a().b());
    }
}
