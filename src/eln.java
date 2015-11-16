// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;
import java.util.TimeZone;

public final class eln
{

    final ell a;
    private int b;
    private String c;
    private String d;
    private String e;
    private int f;
    private final a g;
    private a h;
    private ArrayList i;
    private final fgs j;
    private boolean k;

    eln(ell ell1, byte abyte0[])
    {
        this(ell1, abyte0, (byte)0);
    }

    private eln(ell ell1, byte abyte0[], byte byte0)
    {
        a = ell1;
        super();
        b = ell.a(a);
        c = ell.b(a);
        d = ell.c(a);
        e = ell.d(a);
        f = ell.e(a);
        i = null;
        j = new fgs();
        k = false;
        d = ell.c(ell1);
        e = ell.d(ell1);
        j.a = ell.f(ell1).a();
        j.b = ell.f(ell1).b();
        fgs fgs1 = j;
        ell.g(ell1);
        long l = j.a;
        fgs1.n = TimeZone.getDefault().getOffset(l) / 1000;
        if (abyte0 != null)
        {
            j.i = abyte0;
        }
        g = null;
    }

    private LogEventParcelable b()
    {
        return new LogEventParcelable(new PlayLoggerContext(ell.i(a), ell.j(a), b, c, d, e, ell.h(a), f), j, g, h, ell.a(i));
    }

    public eln a(int l)
    {
        j.d = l;
        return this;
    }

    public eln a(String s)
    {
        c = s;
        return this;
    }

    public ene a()
    {
        if (k)
        {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        } else
        {
            k = true;
            return ell.k(a).a(ell.l(a), b());
        }
    }

    public ene a(emy emy)
    {
        if (k)
        {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        } else
        {
            k = true;
            return ell.k(a).a(emy, b());
        }
    }

    public eln b(String s)
    {
        if (ell.h(a))
        {
            throw new IllegalArgumentException("setUploadAccountName forbidden on anonymous logger");
        } else
        {
            d = s;
            return this;
        }
    }

    public ene b(emy emy)
    {
        if (k)
        {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        } else
        {
            k = true;
            return ell.k(a).b(emy, b());
        }
    }
}
