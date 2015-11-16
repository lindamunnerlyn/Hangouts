// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ayq
    implements asd
{

    final String a;
    final String b;
    final ayp c;

    ayq(ayp ayp1, String s, String s1)
    {
        c = ayp1;
        a = s;
        b = s1;
        super();
    }

    public void a(asa asa)
    {
        if (c.a.getActivity() != null && c.a.O() != null)
        {
            avv.b(c.a).a(a, b);
            avv.a(c.a, avv.H(c.a));
            c.a.getLoaderManager().b(0, null, c.a);
            if (avv.I(c.a) == null)
            {
                c.a.getLoaderManager().b(2, null, c.a);
                return;
            }
        }
    }
}
