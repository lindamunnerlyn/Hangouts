// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telephony.SmsMessage;

final class avs
    implements Runnable
{

    final avk a;
    private CharSequence b;
    private int c;
    private int d;

    avs(avk avk1)
    {
        a = avk1;
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
        avk avk1;
        CharSequence charsequence;
        int i;
        int j;
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = false;
        avk1 = a;
        charsequence = b;
        i = c;
        j = d;
        break MISSING_BLOCK_LABEL_28;
        while (true) 
        {
            do
            {
                a.a();
                avk.a(a);
                return;
            } while (avk1.d == null || avk1.e == null || avk1.b == null || !g.e(avk1.e.b));
            if (avk1.c.d())
            {
                int ai[];
                dvf dvf1;
                int l;
                int i1;
                if (i > j)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i == 0)
                {
                    continue;
                }
            }
            ai = SmsMessage.calculateLength(charsequence, false);
            i = ai[0];
            l = ai[2];
            if (!dtp.a().p() && !dtp.a().q())
            {
                dvf1 = avk1.c;
                if (i > 1)
                {
                    flag = true;
                }
                dvf1.b(flag);
            } else
            {
                int k = dtp.a().b();
                dvf dvf2 = avk1.c;
                boolean flag1 = flag2;
                if (k > 0)
                {
                    flag1 = flag2;
                    if (i > k)
                    {
                        flag1 = true;
                    }
                }
                dvf2.b(flag1);
            }
            j = dtp.a().c();
            if (j > 0)
            {
                i1 = ai[1];
                i = j;
                if (i1 + l < 140)
                {
                    i = j / 2;
                }
                if (i1 > i)
                {
                    avk1.c.b(true);
                }
            }
        }
    }
}
