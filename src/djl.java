// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class djl
    implements cdl
{

    private static final boolean a = false;
    private final djm b;

    public djl(djm djm1)
    {
        b = djm1;
    }

    public String a()
    {
        return "sms_queue";
    }

    public void a(int i, dcx dcx1)
    {
        aoa aoa = dcn.e(i);
        if (aoa == null)
        {
            if (eev.a("Babel_SendSmsNetworkRequest", 3))
            {
                eev.c("Babel_SendSmsNetworkRequest", (new StringBuilder(57)).append("Skipping request failure for invalid account: ").append(i).toString());
            }
            return;
        }
        aoa aoa1 = dcn.l();
        if (aoa1 == null)
        {
            eev.f("Babel_SendSmsNetworkRequest", "Skipping request failure for null SMS account");
            return;
        }
        String s = b.c();
        String s1 = b.b();
        if (dcx1 != null)
        {
            i = dcx1.c();
        } else
        {
            i = 0;
        }
        RealTimeChatService.a(aoa1, s, s1, i);
        RealTimeChatService.a(aoa, b, dcx1);
    }

    public void a(Context context, cdn cdn1, cdp cdp)
    {
        long l = System.currentTimeMillis();
        String s;
        String s1;
        cdp = b.d();
        s = b.e();
        s1 = b.g();
        int i;
        boolean flag;
        if (!dtp.a().r())
        {
            flag = false;
        } else
        {
            try
            {
                flag = ((dup)hlp.a(g.nU, dup)).l();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cdn1 = String.valueOf(context);
                eev.e("Babel_SendSmsNetworkRequest", (new StringBuilder(String.valueOf(cdn1).length() + 39)).append("SendSmsRequest: failed to send message ").append(cdn1).toString(), context);
                throw new dcx(117, context);
            }
        }
_L7:
        cdp = dun.a(context, cdp, s, s1, flag, b.h());
        if (cdp.a())
        {
            break MISSING_BLOCK_LABEL_382;
        }
        i = cdp.b();
        if (a)
        {
            eev.b("Babel_SendSmsNetworkRequest", (new StringBuilder(33)).append("Result failure level: ").append(i).toString());
        }
        i;
        JVM INSTR tableswitch 0 2: default 136
    //                   0 173
    //                   1 348
    //                   2 365;
           goto _L1 _L2 _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_348;
_L4:
        break MISSING_BLOCK_LABEL_365;
_L1:
        context = null;
_L5:
        if (context == null)
        {
            throw new dcx(106, "response null");
        } else
        {
            long l1 = System.currentTimeMillis();
            context.a(1000L * l);
            context.b(l1 * 1000L);
            context.a(b);
            RealTimeChatService.a(cdn1.c, context);
            return;
        }
_L2:
        context = due.a(context, b.d(), b.e(), b.a() / 1000L, b.f());
        if (a)
        {
            cdp = String.valueOf(context);
            eev.b("Babel_SendSmsNetworkRequest", (new StringBuilder(String.valueOf(cdp).length() + 12)).append("messageUri: ").append(cdp).toString());
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        dur.a(0, due.c(context));
_L6:
        context = new daa(context, b.a());
          goto _L5
        eev.g("Babel_SendSmsNetworkRequest", "SendSmsRequest: sms provider returning null");
          goto _L6
        eev.g("Babel_SendSmsNetworkRequest", "SendSmsRequest: temporary failure");
        throw new dcx(116);
          goto _L5
        eev.g("Babel_SendSmsNetworkRequest", "SendSmsRequest: permanent failure");
        throw new dcx(117);
        eev.g("Babel_SendSmsNetworkRequest", "SendSmsRequest: sending timed out");
        throw new dcx(117);
          goto _L7
    }

    public boolean a(cdl cdl1)
    {
        return false;
    }

    public boolean a(cdn cdn1, dcx dcx1)
    {
        if (cdn1.d < 3) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (dcx1.c())
        {
        default:
            int i = dcx1.c();
            eev.f("Babel_SendSmsNetworkRequest", (new StringBuilder(49)).append("Default no retry on BabelClientError: ").append(i).toString());
            return false;

        case 116: // 't'
            return true;

        case 106: // 'j'
        case 117: // 'u'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean a(String s)
    {
        return s.startsWith(b.b());
    }

    public long b()
    {
        return ((amo)hlp.a(g.nU, amo)).a("babel_pending_sms_message_failure_duration", 0x493e0L);
    }

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return false;
    }

    public String e()
    {
        return null;
    }

    public String toString()
    {
        String s = String.valueOf(b.toString());
        if (s.length() != 0)
        {
            return "SendSmsNetworkRequest ".concat(s);
        } else
        {
            return new String("SendSmsNetworkRequest ");
        }
    }

    static 
    {
        hnc hnc = eev.k;
    }
}
