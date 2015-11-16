// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;
import java.util.Locale;

final class ggm
    implements gfx, Runnable
{

    private final ggl a;
    private final String b;
    private final kop c;
    private final Class d;
    private final gbe e;
    private final int f;
    private long g;
    private final int h;
    private int i;

    ggm(ggl ggl1, String s, kop kop1, Class class1, gbe gbe1, int j, long l, int k)
    {
        a = ggl1;
        b = s;
        c = kop1;
        d = class1;
        e = gbe1;
        f = j;
        g = 1000L;
        h = k;
        i = 0;
    }

    private void a(kop kop1, ixg ixg1)
    {
        boolean flag;
        if (kop1 == null || ixg1 == null || ixg1.a.intValue() == 3 || ixg1.a.intValue() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || i == h)
        {
            gkc.e("vclib", "%s request failed after %d retries (%s)", new Object[] {
                b, Integer.valueOf(i), kop1
            });
            e.b(kop1);
            return;
        }
        i = i + 1;
        long l;
        if (ixg1 != null && ixg1.f != null)
        {
            l = ixg1.f.longValue();
        } else
        {
            l = 0L;
        }
        l = Math.max(l, g);
        g = g << 1;
        gkc.b("vclib", "Will retry %s request after %d milliseconds", new Object[] {
            b, Long.valueOf(l)
        });
        g.a(this, l);
    }

    public void a(long l)
    {
        a(((kop) (null)), ((ixg) (null)));
    }

    public void a(long l, String s)
    {
    }

    public void a(long l, byte abyte0[])
    {
        kop kop1;
        kop1 = (kop)d.newInstance();
        kop.mergeFrom(kop1, abyte0);
        abyte0 = (ixg)d.getField("responseHeader").get(kop1);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (((ixg) (abyte0)).a.intValue() == 1)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        a(kop1, ((ixg) (abyte0)));
        return;
        try
        {
            gkc.b("vclib", "%s request succeeded (%s)", new Object[] {
                b, kop1
            });
            e.a(kop1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            gkc.b("vclib", "Failed to process mesi response", abyte0);
        }
        e.b(null);
        return;
    }

    public void run()
    {
        try
        {
            Field field = c.getClass().getField("requestHeader");
            kop kop1 = c;
            ixf ixf1 = new ixf();
            ixf1.a = a.b;
            ixf1.b = a.c;
            ixf1.f = Integer.valueOf(i);
            String s = Locale.getDefault().getLanguage();
            if (!s.isEmpty())
            {
                ixf1.d = s;
            }
            field.set(kop1, ixf1);
            gkc.b("vclib", "Issuing %s request attempt %d (%s)", new Object[] {
                b, Integer.valueOf(i), c
            });
            a.a.a(String.valueOf(b).concat("?alt=proto"), kop.toByteArray(c), f, this);
            return;
        }
        catch (Exception exception)
        {
            gkc.b("vclib", "Failed to issue mesi request", exception);
        }
        e.b(null);
    }
}
