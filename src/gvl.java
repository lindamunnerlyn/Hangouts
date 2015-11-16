// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

final class gvl
    implements android.os.MessageQueue.IdleHandler
{

    private final gvr a;
    private final List b = new ArrayList(3);
    private volatile boolean c;
    private int d;

    public gvl(gwe gwe1, gvr gvr1, int i, int j)
    {
        c = true;
        d = 0;
        a = gvr1;
        gvr1 = a(gwe1, i, (int)((float)i * 1.3F));
        if (gvr1 != null)
        {
            b.add(gvr1);
        }
        gwe1 = a(gwe1, (int)((float)i * 1.3F), i);
        if (gwe1 != null)
        {
            b.add(gwe1);
        }
        b.add(new gvm(j, j, 12));
    }

    private static gvm a(gwe gwe1, int i, int j)
    {
        int k = gwe1.c / ((i * j << 2) * 3);
        gwe1 = null;
        if (k > 0)
        {
            gwe1 = new gvm(i, j, k);
        }
        return gwe1;
    }

    void a()
    {
        if (c && a.a() > 0.85F)
        {
            c = false;
        }
    }

    public boolean queueIdle()
    {
        if (c && a.a() < 0.85F)
        {
            Object obj;
            if (d >= b.size())
            {
                obj = null;
            } else
            {
                obj = (gvm)b.get(d);
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    int i = ((gvm) (obj)).c - 1;
                    obj.c = i;
                    if (i == 0)
                    {
                        d = d + 1;
                    }
                    obj = Bitmap.createBitmap(((gvm) (obj)).a, ((gvm) (obj)).b, android.graphics.Bitmap.Config.ARGB_8888);
                }
            }
            if (obj != null)
            {
                a.a(((Bitmap) (obj)));
            }
        }
        return c;
    }
}
