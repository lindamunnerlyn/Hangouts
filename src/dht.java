// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dht
    implements ccg
{

    private static final boolean a = false;
    private final dhv b;

    public dht(dhv dhv1)
    {
        b = dhv1;
    }

    public String a()
    {
        return "mms_queue";
    }

    public void a(int i, dbo dbo1)
    {
        ani ani = dbf.e(i);
        if (ani == null)
        {
            if (ebw.a("Babel_SendMmsNetworkRequest", 3))
            {
                ebw.c("Babel_SendMmsNetworkRequest", (new StringBuilder(57)).append("Skipping request failure for invalid account: ").append(i).toString());
            }
            return;
        }
        ani ani1 = dbf.l();
        if (ani1 == null)
        {
            ebw.f("Babel_SendMmsNetworkRequest", "Skipping request failure for null MMS account");
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
        dhu dhu1;
        long l;
        if (a)
        {
            cck = String.valueOf(b.toString());
            if (cck.length() != 0)
            {
                cck = "Sending mms request ".concat(cck);
            } else
            {
                cck = new String("Sending mms request ");
            }
            ebw.b("Babel_SendMmsNetworkRequest", cck);
        }
        l = System.currentTimeMillis();
        if (b.m() == null)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        cck = dri.a(context, b.d(), b.e(), b.m(), b.a());
_L1:
        dhu1 = new dhu(this);
        context = drk.a(context, ((drj) (cck)).a, ((drj) (cck)).b, dhu1);
        if (context == null)
        {
            long l1;
            try
            {
                ebw.g("Babel_SendMmsNetworkRequest", "SendMmsRequest: failed to persist message into telephony");
                throw new dbo(134, "Failed to persist sent mms message");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cci1 = String.valueOf(context);
                ebw.e("Babel_SendMmsNetworkRequest", (new StringBuilder(String.valueOf(cci1).length() + 39)).append("SendMmsRequest: failed to send message ").append(cci1).toString(), context);
                throw new dbo(118, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cci1 = String.valueOf(context);
                ebw.e("Babel_SendMmsNetworkRequest", (new StringBuilder(String.valueOf(cci1).length() + 39)).append("SendMmsRequest: failed to send message ").append(cci1).toString(), context);
                throw new dbo(136, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cci1 = String.valueOf(context);
                ebw.e("Babel_SendMmsNetworkRequest", (new StringBuilder(String.valueOf(cci1).length() + 40)).append("SendMmsRequest: invalid message to send ").append(cci1).toString(), context);
                throw new dbo(136, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cci1 = String.valueOf(context);
            }
            break MISSING_BLOCK_LABEL_462;
        }
        break MISSING_BLOCK_LABEL_270;
        cck = dri.a(context, b.d(), b.e(), b.f(), b.g(), b.h(), b.i(), b.j(), b.k(), b.a());
          goto _L1
        dry.a(1, drk.c(context));
        context = new cxu(context, ((drj) (cck)).a.f(), b.a(), dhu1.a());
        l1 = System.currentTimeMillis();
        context.a(1000L * l);
        context.b(l1 * 1000L);
        context.a(b);
        RealTimeChatService.a(cci1.c, context);
        return;
        ebw.e("Babel_SendMmsNetworkRequest", (new StringBuilder(String.valueOf(cci1).length() + 39)).append("SendMmsRequest: failed to send message ").append(cci1).toString(), context);
        throw new dbo(((dra) (context)).a, context);
    }

    public boolean a(ccg ccg1)
    {
        return false;
    }

    public boolean a(cci cci1, dbo dbo1)
    {
        int i = dbo1.c();
        switch (i)
        {
        case 107: // 'k'
        case 108: // 'l'
        case 109: // 'm'
        case 110: // 'n'
        case 111: // 'o'
        case 112: // 'p'
        case 113: // 'q'
        case 114: // 'r'
        case 115: // 's'
        case 116: // 't'
        case 117: // 'u'
        case 120: // 'x'
        case 121: // 'y'
        case 122: // 'z'
        default:
            ebw.f("Babel_SendMmsNetworkRequest", (new StringBuilder(49)).append("Default no retry on BabelClientError: ").append(i).toString());
            // fall through

        case 106: // 'j'
        case 119: // 'w'
        case 123: // '{'
        case 124: // '|'
        case 125: // '}'
        case 126: // '~'
        case 127: // '\177'
        case 128: 
        case 129: 
        case 130: 
        case 131: 
        case 132: 
        case 133: 
        case 134: 
        case 135: 
        case 136: 
        case 137: 
            return false;

        case 118: // 'v'
            return true;
        }
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
            return "SendMmsNetworkRequest ".concat(s);
        } else
        {
            return new String("SendMmsNetworkRequest ");
        }
    }

    static 
    {
        hik hik = ebw.k;
    }
}
