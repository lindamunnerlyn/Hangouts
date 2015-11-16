// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bqq
    implements Runnable
{

    final bqo a;

    bqq(bqo bqo1)
    {
        a = bqo1;
        super();
    }

    public void run()
    {
        if (a.j())
        {
            bqo.d(a);
            glj glj1 = bnk.k();
            if (glj1 != null)
            {
                eev.e("Babel_calls", "Disabling camera because the earpiece is on.");
                glj1.a(false);
            }
        }
    }
}
