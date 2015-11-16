// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dga
    implements Runnable
{

    final int a;
    final ani b;
    final String c;
    final String d;
    final String e;
    final String f;
    final int g;
    final int h;
    final String i;
    final String j;
    final boolean k;
    final ffo l;
    final long m;

    public dga(int i1, ani ani, String s, String s1, String s2, String s3, int j1, 
            int k1, String s4, String s5, boolean flag, ffo ffo, long l1)
    {
        a = i1;
        b = ani;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = j1;
        h = k1;
        i = s4;
        j = s5;
        k = flag;
        l = ffo;
        m = l1;
        super();
    }

    public void run()
    {
        int i1 = 1;
        while (i1 <= a) 
        {
            dkt dkt1 = (dkt)hgx.a(g.nS, dkt);
            ani ani = b;
            String s = c;
            String s1 = d;
            dkt1.a(ani, s, (new StringBuilder(String.valueOf(s1).length() + 13)).append(s1).append("--").append(i1).toString(), e, 0, f, g, h, i, j, k, l, 0);
            try
            {
                Thread.sleep(m);
            }
            catch (InterruptedException interruptedexception) { }
            i1++;
        }
    }
}
