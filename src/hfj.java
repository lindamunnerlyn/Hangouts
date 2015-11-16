// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class hfj
    implements hfx
{

    final hfg a;
    private final Uri b;
    private final long c;
    private final long d = 0L;
    private long e;
    private heu f;

    public hfj(hfg hfg1, Uri uri, long l, long l1)
    {
        a = hfg1;
        super();
        e = 0L;
        b = uri;
        c = l;
    }

    public void a(long l, long l1)
    {
        if (l - e > hfg.d())
        {
            e = l;
            try
            {
                a.b();
            }
            catch (heu heu1)
            {
                f = heu1;
                a.a();
            }
        }
        if (d + l < l1)
        {
            hfg.a(a).a(d + l, c);
        }
    }

    public boolean a()
    {
        return f != null;
    }

    public heu b()
    {
        return f;
    }
}
