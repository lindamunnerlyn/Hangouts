// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class djc
    implements cdl
{

    private static final boolean a = false;
    private final dje b;

    public djc(dje dje1)
    {
        b = dje1;
    }

    public String a()
    {
        return "mms_queue";
    }

    public void a(int i, dcx dcx1)
    {
        aoa aoa = dcn.e(i);
        if (aoa == null)
        {
            if (eev.a("Babel_SendMmsNetworkRequest", 3))
            {
                eev.c("Babel_SendMmsNetworkRequest", (new StringBuilder(57)).append("Skipping request failure for invalid account: ").append(i).toString());
            }
            return;
        }
        aoa aoa1 = dcn.l();
        if (aoa1 == null)
        {
            eev.f("Babel_SendMmsNetworkRequest", "Skipping request failure for null MMS account");
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
        djd djd1;
        long l;
        if (a)
        {
            cdp = String.valueOf(b.toString());
            if (cdp.length() != 0)
            {
                cdp = "Sending mms request ".concat(cdp);
            } else
            {
                cdp = new String("Sending mms request ");
            }
            eev.b("Babel_SendMmsNetworkRequest", cdp);
        }
        l = System.currentTimeMillis();
        if (b.n() == null)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        cdp = duc.a(context, b.d(), b.e(), b.n(), b.a());
_L1:
        djd1 = new djd(this);
        context = due.a(context, ((dud) (cdp)).a, ((dud) (cdp)).b, djd1);
        if (context == null)
        {
            long l1;
            try
            {
                eev.g("Babel_SendMmsNetworkRequest", "SendMmsRequest: failed to persist message into telephony");
                throw new dcx(134, "Failed to persist sent mms message");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cdn1 = String.valueOf(context);
                eev.e("Babel_SendMmsNetworkRequest", (new StringBuilder(String.valueOf(cdn1).length() + 39)).append("SendMmsRequest: failed to send message ").append(cdn1).toString(), context);
                throw new dcx(118, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cdn1 = String.valueOf(context);
                eev.e("Babel_SendMmsNetworkRequest", (new StringBuilder(String.valueOf(cdn1).length() + 39)).append("SendMmsRequest: failed to send message ").append(cdn1).toString(), context);
                throw new dcx(136, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cdn1 = String.valueOf(context);
                eev.e("Babel_SendMmsNetworkRequest", (new StringBuilder(String.valueOf(cdn1).length() + 40)).append("SendMmsRequest: invalid message to send ").append(cdn1).toString(), context);
                throw new dcx(136, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cdn1 = String.valueOf(context);
            }
            break MISSING_BLOCK_LABEL_462;
        }
        break MISSING_BLOCK_LABEL_270;
        cdp = duc.a(context, b.d(), b.e(), b.f(), b.g(), b.h(), b.i(), b.j(), b.l(), b.a());
          goto _L1
        dur.a(1, due.c(context));
        context = new czy(context, ((dud) (cdp)).a.f(), b.a(), djd1.a());
        l1 = System.currentTimeMillis();
        context.a(1000L * l);
        context.b(l1 * 1000L);
        context.a(b);
        RealTimeChatService.a(cdn1.c, context);
        return;
        eev.e("Babel_SendMmsNetworkRequest", (new StringBuilder(String.valueOf(cdn1).length() + 39)).append("SendMmsRequest: failed to send message ").append(cdn1).toString(), context);
        throw new dcx(((dtu) (context)).a, context);
    }

    public boolean a(cdl cdl1)
    {
        return false;
    }

    public boolean a(cdn cdn1, dcx dcx1)
    {
        int i = dcx1.c();
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
            eev.f("Babel_SendMmsNetworkRequest", (new StringBuilder(49)).append("Default no retry on BabelClientError: ").append(i).toString());
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
            return "SendMmsNetworkRequest ".concat(s);
        } else
        {
            return new String("SendMmsNetworkRequest ");
        }
    }

    static 
    {
        hnc hnc = eev.k;
    }
}
