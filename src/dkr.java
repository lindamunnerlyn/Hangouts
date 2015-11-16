// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class dkr extends dko
{

    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final String f;
    public final cgd g;
    public final long h;
    public long i;
    public final jfe j[];
    public dsu k;

    public dkr(String s, cgd cgd1, long l, long l1, String s1, 
            String s2, int i1, int j1, long l2, dsu dsu1, byte abyte0[])
    {
        f = s;
        g = cgd1;
        h = l;
        i = l1;
        a = s1;
        b = s2;
        c = i1;
        d = j1;
        e = l2;
        k = dsu1;
        s = null;
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        try
        {
            cgd1 = ((jfg)kws.mergeFrom(new jfg(), abyte0)).a;
        }
        // Misplaced declaration of an exception variable
        catch (cgd cgd1)
        {
            eev.g("Babel", "Invalid protobuf set in Event and failed to process in EventProcessor.");
            continue; /* Loop/switch isn't completed */
        }
        s = cgd1;
_L4:
        j = s;
        return;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(jfe ajfe[], String s, String s1, long l, aow aow1)
    {
        if (ajfe != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        List list;
        int i1;
        int l1;
        list = hlp.c(g.nU, dkd);
        l1 = ajfe.length;
        i1 = 0;
_L7:
        if (i1 >= l1) goto _L1; else goto _L3
_L3:
        Object obj1;
        obj1 = ajfe[i1];
        for (Iterator iterator = list.iterator(); iterator.hasNext(); iterator.next()) { }
        g.a(((jfe) (obj1)).c, 0);
        JVM INSTR lookupswitch 3: default 108
    //                   3: 595
    //                   17: 117
    //                   19: 595;
           goto _L4 _L5 _L6 _L5
_L4:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_595;
_L8:
        i1++;
          goto _L7
_L6:
        apd apd1 = new apd();
        apd1.a = s;
        apd1.b = s1;
        apd1.c = ((jfe) (obj1)).a;
        apd1.d = l;
        apd1.e = g.a(((jfe) (obj1)).b, 0L);
        apd1.f = g.a(((jfe) (obj1)).c, 0);
        apd1.i = ((jfe) (obj1)).f;
        gdv.a(Integer.valueOf(apd1.f), Integer.valueOf(17));
        if (!g.a(g.nU, "babel_disable_nlp_stickers", false))
        {
            if (!g.v("armeabi-v7a") && !g.v("arm64-v8a"))
            {
                eev.e("Babel", "Skipping NLP sticker suggestion due to incompatible device.");
            } else
            {
                g.a(aow1.f(), 2018, ((jfe) (obj1)).f);
                if (((jfe) (obj1)).e != null)
                {
                    int j1;
                    if (((jfe) (obj1)).e.d != null)
                    {
                        j1 = g.a(((jfe) (obj1)).e.d, 0);
                    } else
                    {
                        j1 = 1;
                    }
                    apd1.h = j1;
                    if (((jfe) (obj1)).e.c != null && ((jfe) (obj1)).e.c.length > 0)
                    {
                        String s4 = ((jfe) (obj1)).e.c[0];
                        obj1 = TextUtils.split(s4, "\\.");
                        String s2;
                        if (obj1.length == 0)
                        {
                            s2 = String.valueOf("Malformed unsuffixed URL has been passed as a GEM suggestion asset. unsuffixedUrl: ");
                            s4 = String.valueOf(s4);
                            if (s4.length() != 0)
                            {
                                s2 = s2.concat(s4);
                            } else
                            {
                                s2 = new String(s2);
                            }
                            eev.f("Babel", s2);
                        }
                        j1 = g.nU.getResources().getDisplayMetrics().densityDpi;
                        if (j1 <= 160)
                        {
                            s2 = "_mdpi";
                        } else
                        if (j1 <= 240)
                        {
                            s2 = "_hdpi";
                        } else
                        if (j1 <= 320)
                        {
                            s2 = "_xhdpi";
                        } else
                        {
                            s2 = "_xxhdpi";
                        }
                        s4 = String.valueOf(obj1[obj1.length - 2]);
                        s2 = String.valueOf(s2);
                        if (s2.length() != 0)
                        {
                            s2 = s4.concat(s2);
                        } else
                        {
                            s2 = new String(s4);
                        }
                        obj1[obj1.length - 2] = s2;
                        s2 = String.valueOf(TextUtils.join(".", ((Object []) (obj1))));
                        if (s2.length() != 0)
                        {
                            s2 = "https:".concat(s2);
                        } else
                        {
                            s2 = new String("https:");
                        }
                        apd1.g = s2;
                    }
                }
                aow1.a(apd1);
            }
        }
          goto _L8
        gdv.a("Requires location sharing suggestion. WHERE_AM_I or WHERE_YOU_AT.", jth.a(2, new Object[] {
            Integer.valueOf(3), Integer.valueOf(19)
        }).contains(Integer.valueOf(g.a(((jfe) (obj1)).c, 0))));
        boolean flag = ((jfe) (obj1)).c.equals(Integer.valueOf(19));
        if (g.a(g.nU, "babel_location_request_suggestions_enabled", true))
        {
            if (!g.a(aow1.f(), aqc.a))
            {
                eev.e("Babel", "Location sharing disallowed. Ignoring location request suggestion");
            } else
            {
                Object obj = aow1.f();
                String s3;
                dsu dsu1;
                cgd cgd1;
                int k1;
                long l2;
                long l3;
                long l4;
                if (flag)
                {
                    k1 = 2518;
                } else
                {
                    k1 = 1939;
                }
                g.a(((aoa) (obj)), k1, ((jfe) (obj1)).f);
                aow1.a(s, dsv.a);
                aow1.a(s, dsv.r);
                l2 = l + TimeUnit.DAYS.toMicros(1L);
                k1 = g.a(g.nU, "babel_location_request_suggestion_duration", 45);
                l3 = l + TimeUnit.SECONDS.toMicros(k1);
                eev.c("Babel", (new StringBuilder(163)).append("Adding location request system message with timestamp ").append(l).append(" expiration timestamp ").append(l2).append(" deleteAfterRead timestamp ").append(l3).toString());
                l4 = g.a(g.nU, "babel_location_request_suggestion_timestamp_offset", 1L);
                s3 = aow.g();
                dsu1 = dsu.g;
                cgd1 = aow1.f().b();
                if (flag)
                {
                    obj = dsv.r;
                } else
                {
                    obj = dsv.a;
                }
                aow1.a(s, s3, dsu1, cgd1, ((dsv) (obj)), l + l4, l2, l3, 10, null, null, 0, ((jfe) (obj1)).f);
            }
        }
          goto _L8
    }

    protected final void a(aow aow1)
    {
        b(aow1);
    }

    protected final void b(aow aow1)
    {
        a(j, f, a, h, aow1);
        if (g != null)
        {
            String s = g.a;
            if (!TextUtils.isEmpty(s))
            {
                aow1 = aow1.f();
                if (!s.equals(aow1.b().a))
                {
                    long l = TimeUnit.MICROSECONDS.toMillis(h);
                    ((csy)hlp.a(g.nU, csy)).a(aow1.h(), s, cvc.f, Long.valueOf(l));
                }
            }
        }
    }
}
