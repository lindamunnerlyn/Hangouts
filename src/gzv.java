// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

final class gzv
    implements android.os.MessageQueue.IdleHandler
{

    private final hab a;
    private final List b = new ArrayList(3);
    private volatile boolean c;
    private int d;

    public gzv(hao hao1, hab hab1, int i, int j)
    {
        c = true;
        d = 0;
        a = hab1;
        hab1 = a(hao1, i, (int)((float)i * 1.3F));
        if (hab1 != null)
        {
            b.add(hab1);
        }
        hao1 = a(hao1, (int)((float)i * 1.3F), i);
        if (hao1 != null)
        {
            b.add(hao1);
        }
        b.add(new gzw(j, j, 12));
    }

    private static gzw a(hao hao1, int i, int j)
    {
        int k = hao1.c / ((i * j << 2) * 3);
        hao1 = null;
        if (k > 0)
        {
            hao1 = new gzw(i, j, k);
        }
        return hao1;
    }

    void a()
    {
        if (c && a.b() > 0.85F)
        {
            c = false;
        }
    }

    public boolean queueIdle()
    {
        if (c && a.b() < 0.85F)
        {
            Object obj;
            if (d >= b.size())
            {
                obj = null;
            } else
            {
                obj = (gzw)b.get(d);
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    int i = ((gzw) (obj)).c - 1;
                    obj.c = i;
                    if (i == 0)
                    {
                        d = d + 1;
                    }
                    obj = Bitmap.createBitmap(((gzw) (obj)).a, ((gzw) (obj)).b, android.graphics.Bitmap.Config.ARGB_8888);
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
