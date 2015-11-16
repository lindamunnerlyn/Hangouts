// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class gfw
    implements Runnable
{

    final gmw a;
    final gfu b;

    gfw(gfu gfu1, gmw gmw1)
    {
        b = gfu1;
        a = gmw1;
        super();
    }

    public void run()
    {
        int j = b.a.size();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    ggc ggc1 = (ggc)b.a.get(i);
                    if (!ggc1.a.equals(a))
                    {
                        break label0;
                    }
                    ggc1.a();
                    b.a.remove(i);
                }
                return;
            }
            i++;
        } while (true);
    }
}
