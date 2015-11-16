// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class has
    implements hbg
{

    final hap a;
    private final Uri b;
    private final long c;
    private final long d = 0L;
    private long e;
    private had f;

    public has(hap hap1, Uri uri, long l, long l1)
    {
        a = hap1;
        super();
        e = 0L;
        b = uri;
        c = l;
    }

    public void a(long l, long l1)
    {
        if (l - e > hap.d())
        {
            e = l;
            try
            {
                a.b();
            }
            catch (had had1)
            {
                f = had1;
                a.a();
            }
        }
        if (d + l < l1)
        {
            hap.a(a).a(d + l, c);
        }
    }

    public boolean a()
    {
        return f != null;
    }

    public had b()
    {
        return f;
    }
}
