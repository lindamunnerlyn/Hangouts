// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class gdi
    implements Runnable
{

    final gju a;
    final gdg b;

    gdi(gdg gdg1, gju gju1)
    {
        b = gdg1;
        a = gju1;
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
                    gdo gdo1 = (gdo)b.a.get(i);
                    if (!gdo1.a.equals(a))
                    {
                        break label0;
                    }
                    gdo1.a();
                    b.a.remove(i);
                }
                return;
            }
            i++;
        } while (true);
    }
}
