// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class avb
    implements Runnable
{

    final aut a;
    private CharSequence b;
    private int c;
    private int d;

    avb(aut aut1)
    {
        a = aut1;
        super();
    }

    public void a(CharSequence charsequence, int i, int j)
    {
        b = charsequence;
        c = i;
        d = j;
    }

    public void run()
    {
        aut.a(a, b, c, d);
        a.a();
        aut.a(a);
    }
}
