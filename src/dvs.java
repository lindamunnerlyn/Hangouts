// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.telecom.DisconnectCause;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class dvs
    implements dts
{

    private static dvt n = new dvt();
    private final Context a;
    private final String b;
    private final String c = gkh.a();
    private final String d;
    private final boolean e;
    private final gck f;
    private final gcp g;
    private Uri h;
    private long i;
    private long j;
    private long k;
    private boolean l;
    private duh m;

    dvs(Context context, String s, Uri uri, String s1, String s2, boolean flag)
    {
        i = -1L;
        j = -1L;
        k = -1L;
        a = context;
        b = s;
        h = uri;
        d = s1;
        e = flag;
        new gkh();
        s = s2;
        if (s2 == null)
        {
            new gkh();
            s = gkh.a();
        }
        f = new gck(new dvu(s, c));
        g = new gcp(context);
    }

    private void b(int i1)
    {
        boolean flag = true;
        com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats connectioninfostats = new com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats(1, "", "", "", "", "", "", 0, 0, 0, 0, 0, 0);
        if (i1 == 2)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        connectioninfostats.setMediaNetworkType(g.b(i1));
        if (g.q(a))
        {
            connectioninfostats.setSignalStrength(g.a(i1));
        }
        f.a(connectioninfostats);
    }

    String a()
    {
        return c;
    }

    void a(int i1)
    {
        f.b(i1);
    }

    void a(Uri uri)
    {
        h = uri;
    }

    public void a(dtr dtr1, int i1)
    {
        switch (i1)
        {
        default:
            return;

        case 1: // '\001'
        case 3: // '\003'
            if (j == -1L)
            {
                i = System.currentTimeMillis();
                j = SystemClock.elapsedRealtime();
                f.a();
                if (dtr1.a() != null)
                {
                    f.a(dtr1.a().h().c());
                }
            }
            if (i1 == 3)
            {
                f.d();
            }
            b(dtr1.d());
            return;

        case 2: // '\002'
            f.d();
            b(dtr1.d());
            return;

        case 4: // '\004'
            l = true;
            f.c();
            b(dtr1.d());
            return;
        }
    }

    public void a(dtr dtr1, DisconnectCause disconnectcause)
    {
        if (k != -1L) goto _L2; else goto _L1
_L1:
        ani ani1;
        k = SystemClock.elapsedRealtime();
        b(dtr1.d());
        ani1 = dbf.e(dwz.a(a).b());
        if (ani1 == null) goto _L4; else goto _L3
_L3:
        int i1 = dwz.a(a).e();
        if (ani1.h() != i1) goto _L6; else goto _L5
_L5:
        i1 = 1;
_L16:
        if (i1 == 0) goto _L2; else goto _L7
_L7:
        String s1 = ebz.g();
        Object obj;
        String s;
        gcl gcl1;
        boolean flag;
        if (dtr1.a() != null)
        {
            dtr1 = ebz.k(dtr1.a().f().c());
        } else
        {
            dtr1 = "";
        }
        if (b != null)
        {
            f.a(1, b);
        }
        if (e)
        {
            i1 = 104;
        } else
        {
            i1 = 103;
        }
        gcl1 = f.a(a, ((ecs)hgx.a(a, ecs)).c(), i1, 1, i, c).a(g.y(dbf.e(ani1)));
        if (h == null)
        {
            obj = "unknown";
        } else
        {
            obj = h.getSchemeSpecificPart();
        }
        if (d == null)
        {
            s = g.p();
        } else
        {
            s = d;
        }
        obj = gcl1.b(String.format("%s/%s", new Object[] {
            obj, s
        }));
        flag = l;
        i1 = disconnectcause.getCode();
        i1;
        JVM INSTR tableswitch 0 9: default 304
    //                   0 483
    //                   1 483
    //                   2 443
    //                   3 467
    //                   4 443
    //                   5 459
    //                   6 451
    //                   7 475
    //                   8 483
    //                   9 483;
           goto _L8 _L9 _L9 _L10 _L11 _L10 _L12 _L13 _L14 _L9 _L9
_L9:
        break MISSING_BLOCK_LABEL_483;
_L8:
        gbh.a((new StringBuilder(39)).append("Unexpected DisconnectCause: ").append(i1).toString());
        i1 = 1;
_L17:
        dtr1 = ((gcl) (obj)).a(flag, i1, 0).a(s1, dtr1, disconnectcause.getReason()).a();
        if (m != null)
        {
            dtr1.n = (new String[] {
                m.a()
            });
        }
        RealTimeChatService.a(ani1, c, dtr1);
_L2:
        return;
_L6:
        if (b == null) goto _L4; else goto _L15
_L15:
        i1 = 1;
          goto _L16
_L4:
        i1 = 0;
          goto _L16
_L10:
        i1 = 1004;
          goto _L17
_L13:
        i1 = 1011;
          goto _L17
_L12:
        i1 = 1010;
          goto _L17
_L11:
        i1 = 1009;
          goto _L17
_L14:
        i1 = 1007;
          goto _L17
        i1 = 1017;
          goto _L17
    }

    void a(duh duh1)
    {
        m = duh1;
    }

    long b()
    {
        if (j == -1L)
        {
            return -1L;
        }
        long l2 = k;
        long l1 = l2;
        if (l2 == -1L)
        {
            l1 = SystemClock.elapsedRealtime();
        }
        return l1 - j;
    }

}
