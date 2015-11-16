// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;
import java.util.TimeZone;

public final class eim
{

    final eik a;
    private int b;
    private String c;
    private String d;
    private String e;
    private int f;
    private final a g;
    private a h;
    private ArrayList i;
    private final fdu j;
    private boolean k;

    eim(eik eik1, byte abyte0[])
    {
        this(eik1, abyte0, (byte)0);
    }

    private eim(eik eik1, byte abyte0[], byte byte0)
    {
        a = eik1;
        super();
        b = eik.a(a);
        c = eik.b(a);
        d = eik.c(a);
        e = eik.d(a);
        f = eik.e(a);
        i = null;
        j = new fdu();
        k = false;
        d = eik.c(eik1);
        e = eik.d(eik1);
        j.a = eik.f(eik1).a();
        j.b = eik.f(eik1).b();
        fdu fdu1 = j;
        eik.g(eik1);
        long l = j.a;
        fdu1.n = TimeZone.getDefault().getOffset(l) / 1000;
        if (abyte0 != null)
        {
            j.i = abyte0;
        }
        g = null;
    }

    public ekd a(ejx ejx)
    {
        if (k)
        {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        } else
        {
            k = true;
            return eik.k(a).a(ejx, new LogEventParcelable(new PlayLoggerContext(eik.i(a), eik.j(a), b, c, d, e, eik.h(a), f), j, g, h, eik.a(i)));
        }
    }
}
