// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

final class haf
{

    public haf a;
    public haf b;
    final gzy c;
    private List d;

    public haf(gzy gzy)
    {
        a = this;
        b = this;
        c = gzy;
    }

    public int a()
    {
        if (d != null)
        {
            return d.size();
        } else
        {
            return 0;
        }
    }

    public void a(Bitmap bitmap)
    {
        if (d == null)
        {
            d = new ArrayList();
        }
        d.add(bitmap);
    }

    public Bitmap b()
    {
        int i = a();
        if (i != 0)
        {
            return (Bitmap)d.remove(i - 1);
        } else
        {
            return null;
        }
    }
}
