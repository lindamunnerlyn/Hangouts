// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;

public final class gir
{

    gix a;
    private final Context b;
    private final String c;
    private final boolean d;
    private String e;
    private long f;
    private HttpTransport g;

    public gir(Context context, String s)
    {
        hra hra1 = new hra();
        boolean flag;
        if (hlp.b(context, gdu) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this(context, s, ((HttpTransport) (hra1)), flag);
    }

    private gir(Context context, String s, HttpTransport httptransport, boolean flag)
    {
        b = context;
        c = s;
        g = httptransport;
        d = flag;
    }

    static HttpRequestInitializer a(String s, String s1, int i)
    {
        hqh hqh1 = new hqh();
        hqh1.c(s);
        return new git(s1, s, hqh1, i);
    }

    private gix a()
    {
        return new gis(this);
    }

    private void a(long l, String s, byte abyte0[], int i, gix gix)
    {
        if (d)
        {
            s = new gjg(l, s, abyte0, i, (gdu)hlp.b(b, gdu), e, f, c, gix, b);
        } else
        {
            s = new gjh(l, s, abyte0, i, e, f, g, c, gix);
        }
        (new giy(this, s)).a(new Void[0]);
    }

    public void a(long l, String s, byte abyte0[], int i)
    {
        gdv.b("Expected non-null", a);
        a(l, s, abyte0, i, a());
    }

    public void a(gix gix)
    {
        a = gix;
    }

    public void a(giz giz)
    {
        gdv.b("Expected non-null", a);
        (new giy(this, new gjd(giz, e, g, c, a()))).a(new Void[0]);
    }

    public void a(String s, long l)
    {
        e = s;
        f = l;
    }

    public void a(String s, byte abyte0[], int i, gix gix)
    {
        gdv.b("Expected non-null", gix);
        a(0L, s, abyte0, i, gix);
    }
}
