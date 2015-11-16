// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.telecom.DisconnectCause;
import android.telephony.PhoneNumberUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

final class dzb
    implements dxa
{

    private static dzc n = new dzc();
    private final Context a;
    private final String b;
    private final String c = gnj.a();
    private final String d;
    private final boolean e;
    private final gey f;
    private final gfh g;
    private Uri h;
    private long i;
    private long j;
    private long k;
    private boolean l;
    private dxp m;

    dzb(Context context, String s, Uri uri, String s1, String s2, boolean flag)
    {
        i = -1L;
        j = -1L;
        k = -1L;
        a = context;
        b = s;
        h = uri;
        d = s1;
        e = flag;
        new gnj();
        s = s2;
        if (s2 == null)
        {
            new gnj();
            s = gnj.a();
        }
        f = new gey(new dzd(s, c));
        g = new gfh(context);
    }

    private void b(int i1)
    {
        boolean flag = true;
        com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats connectioninfostats = new com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats(1, "", "", "", "", "", "", 0, 0, 0, 0, 0, 0);
        gfh gfh1 = g;
        if (i1 == 2)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        i1 = gfh1.b(i1);
        connectioninfostats.setMediaNetworkType(i1);
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

    public void a(dwz dwz1, int i1)
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
                if (dwz1.a() != null)
                {
                    f.a(dwz1.a().h().c());
                }
            }
            if (i1 == 3)
            {
                f.d();
            }
            b(dwz1.d());
            return;

        case 2: // '\002'
            f.d();
            b(dwz1.d());
            return;

        case 4: // '\004'
            l = true;
            f.c();
            b(dwz1.d());
            return;
        }
    }

    public void a(dwz dwz1, DisconnectCause disconnectcause)
    {
        if (k != -1L) goto _L2; else goto _L1
_L1:
        aoa aoa1;
        k = SystemClock.elapsedRealtime();
        b(dwz1.d());
        aoa1 = dcn.e(eaj.a(a).b());
        if (aoa1 == null) goto _L4; else goto _L3
_L3:
        int i1 = eaj.a(a).e();
        if (aoa1.h() != i1) goto _L6; else goto _L5
_L5:
        i1 = 1;
_L16:
        if (i1 == 0) goto _L2; else goto _L7
_L7:
        String s1 = eey.g();
        dwz1 = dwz1.a();
        Object obj;
        String s;
        gez gez1;
        boolean flag;
        if (dwz1 != null)
        {
            dwz1 = PhoneNumberUtils.extractNetworkPortion(eey.l(dwz1.f().c()));
        } else
        {
            dwz1 = "";
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
        gez1 = f.a(a, i1, 1, i, c).a(g.B(dcn.d(aoa1)));
        if (h == null)
        {
            obj = "unknown";
        } else
        {
            obj = h.getSchemeSpecificPart();
        }
        if (d == null)
        {
            s = g.o();
        } else
        {
            s = d;
        }
        obj = gez1.b(String.format("%s/%s", new Object[] {
            obj, s
        }));
        flag = l;
        i1 = disconnectcause.getCode();
        i1;
        JVM INSTR tableswitch 0 9: default 288
    //                   0 494
    //                   1 494
    //                   2 454
    //                   3 478
    //                   4 454
    //                   5 470
    //                   6 462
    //                   7 486
    //                   8 494
    //                   9 494;
           goto _L8 _L9 _L9 _L10 _L11 _L10 _L12 _L13 _L14 _L9 _L9
_L9:
        break MISSING_BLOCK_LABEL_494;
_L8:
        gdv.a((new StringBuilder(39)).append("Unexpected DisconnectCause: ").append(i1).toString());
        i1 = 1;
_L17:
        dwz1 = ((gez) (obj)).a(flag, i1, 0).a(s1, dwz1, disconnectcause.getReason()).a();
        gdv.a(Integer.valueOf(dwz1.size()), Integer.valueOf(1));
        dwz1 = (jjt)dwz1.get(0);
        if (m != null)
        {
            dwz1.n = (new String[] {
                m.a()
            });
        }
        RealTimeChatService.a(aoa1, c, dwz1);
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

    void a(dxp dxp1)
    {
        m = dxp1;
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
