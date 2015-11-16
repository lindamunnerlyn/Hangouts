// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dhz
    implements ccg
{

    private static final boolean a = false;
    private final dia b;

    public dhz(dia dia1)
    {
        b = dia1;
    }

    public String a()
    {
        return "sms_queue";
    }

    public void a(int i, dbo dbo1)
    {
        ani ani = dbf.e(i);
        if (ani == null)
        {
            if (ebw.a("Babel_SendSmsNetworkRequest", 3))
            {
                ebw.c("Babel_SendSmsNetworkRequest", (new StringBuilder(57)).append("Skipping request failure for invalid account: ").append(i).toString());
            }
            return;
        }
        ani ani1 = dbf.l();
        if (ani1 == null)
        {
            ebw.f("Babel_SendSmsNetworkRequest", "Skipping request failure for null SMS account");
            return;
        }
        String s = b.c();
        String s1 = b.b();
        if (dbo1 != null)
        {
            i = dbo1.c();
        } else
        {
            i = 0;
        }
        RealTimeChatService.a(ani1, s, s1, i);
        RealTimeChatService.a(ani, b, dbo1);
    }

    public void a(Context context, cci cci1, cck cck)
    {
        long l = System.currentTimeMillis();
        String s;
        String s1;
        cck = b.d();
        s = b.e();
        s1 = b.g();
        int i;
        boolean flag;
        if (!dqv.a().r())
        {
            flag = false;
        } else
        {
            try
            {
                flag = ((drw)hgx.a(g.nS, drw)).k();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cci1 = String.valueOf(context);
                ebw.e("Babel_SendSmsNetworkRequest", (new StringBuilder(String.valueOf(cci1).length() + 39)).append("SendSmsRequest: failed to send message ").append(cci1).toString(), context);
                throw new dbo(117, context);
            }
        }
_L7:
        cck = dru.a(context, cck, s, s1, flag, b.h());
        if (cck.a())
        {
            break MISSING_BLOCK_LABEL_382;
        }
        i = cck.b();
        if (a)
        {
            ebw.b("Babel_SendSmsNetworkRequest", (new StringBuilder(33)).append("Result failure level: ").append(i).toString());
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
            throw new dbo(106, "response null");
        } else
        {
            long l1 = System.currentTimeMillis();
            context.a(1000L * l);
            context.b(l1 * 1000L);
            context.a(b);
            RealTimeChatService.a(cci1.c, context);
            return;
        }
_L2:
        context = drk.a(context, b.d(), b.e(), b.a() / 1000L, b.f());
        if (a)
        {
            cck = String.valueOf(context);
            ebw.b("Babel_SendSmsNetworkRequest", (new StringBuilder(String.valueOf(cck).length() + 12)).append("messageUri: ").append(cck).toString());
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        dry.a(0, drk.c(context));
_L6:
        context = new cxw(context, b.a());
          goto _L5
        ebw.g("Babel_SendSmsNetworkRequest", "SendSmsRequest: sms provider returning null");
          goto _L6
        ebw.g("Babel_SendSmsNetworkRequest", "SendSmsRequest: temporary failure");
        throw new dbo(116);
          goto _L5
        ebw.g("Babel_SendSmsNetworkRequest", "SendSmsRequest: permanent failure");
        throw new dbo(117);
        ebw.g("Babel_SendSmsNetworkRequest", "SendSmsRequest: sending timed out");
        throw new dbo(117);
          goto _L7
    }

    public boolean a(ccg ccg1)
    {
        return false;
    }

    public boolean a(cci cci1, dbo dbo1)
    {
        if (cci1.d < 3) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (dbo1.c())
        {
        default:
            int i = dbo1.c();
            ebw.f("Babel_SendSmsNetworkRequest", (new StringBuilder(49)).append("Default no retry on BabelClientError: ").append(i).toString());
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
        return ((alw)hgx.a(g.nS, alw)).a("babel_pending_sms_message_failure_duration", 0x493e0L);
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
        hik hik = ebw.k;
    }
}
