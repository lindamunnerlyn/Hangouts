// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ghw
    implements Runnable
{

    final jiz a;
    final ghu b;

    ghw(ghu ghu1, jiz jiz1)
    {
        b = ghu1;
        a = jiz1;
        super();
    }

    public void run()
    {
        float f = 0.0F;
        if (a.g == null || a.g.c == null || a.g.c.length == 0)
        {
            b.t.a = 0.0F;
            b.t.b = 0.0F;
            b.t.d = 0.0F;
            b.t.c = 0.0F;
            return;
        }
        jje ajje[] = a.g.c;
        int j = ajje.length;
        int i = 0;
        float f2 = 1.0F;
        float f3 = 1.0F;
        float f1 = 0.0F;
        for (; i < j; i++)
        {
            jje jje1 = ajje[i];
            f3 = Math.min(jje1.a.floatValue(), f3);
            f2 = Math.min(jje1.b.floatValue(), f2);
            f1 = Math.max(jje1.c.floatValue(), f1);
            f = Math.max(jje1.d.floatValue(), f);
        }

        b.t.a = f3;
        b.t.b = f2;
        b.t.d = f1;
        b.t.c = f;
    }
}
