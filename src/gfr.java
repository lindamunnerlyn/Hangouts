// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;

public final class gfr
{

    static final String a = "1.0.0";
    gfx b;
    private final Context c;
    private final String d;
    private final boolean e;
    private String f;
    private long g;
    private HttpTransport h;

    public gfr(Context context, String s)
    {
        hmf hmf1 = new hmf();
        boolean flag;
        if (hgx.b(context, gbg) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this(context, s, ((HttpTransport) (hmf1)), flag);
    }

    private gfr(Context context, String s, HttpTransport httptransport, boolean flag)
    {
        c = context;
        d = s;
        h = httptransport;
        e = flag;
    }

    static HttpRequestInitializer a(String s, String s1, int i)
    {
        hlm hlm1 = new hlm();
        hlm1.c(s);
        return new gft(s1, s, hlm1, i);
    }

    private gfx a()
    {
        return new gfs(this);
    }

    private void a(long l, String s, byte abyte0[], int i, gfx gfx)
    {
        if (e)
        {
            s = new ggg(l, s, abyte0, i, (gbg)hgx.b(c, gbg), f, g, d, gfx, c);
        } else
        {
            s = new ggh(l, s, abyte0, i, f, g, h, d, gfx);
        }
        (new gfy(this, s)).a(new Void[0]);
    }

    public void a(long l, String s, byte abyte0[], int i)
    {
        gbh.b(b);
        a(l, s, abyte0, i, a());
    }

    public void a(gfx gfx)
    {
        b = gfx;
    }

    public void a(gfz gfz)
    {
        gbh.b(b);
        (new gfy(this, new ggd(gfz, f, h, d, a()))).a(new Void[0]);
    }

    public void a(String s, long l)
    {
        f = s;
        g = l;
    }

    public void a(String s, byte abyte0[], int i, gfx gfx)
    {
        gbh.b(gfx);
        a(0L, s, abyte0, i, gfx);
    }
}
