// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class div
    implements cdl
{

    private static final boolean a = false;
    private final dix b;

    public div(dix dix1)
    {
        b = dix1;
    }

    public String a()
    {
        return "mms_recv_queue";
    }

    public void a(int i, dcx dcx1)
    {
        aoa aoa1 = dcn.e(i);
        if (aoa1 == null)
        {
            if (eev.a("Babel_RetrieveMmsNetworkRequest", 3))
            {
                eev.c("Babel_RetrieveMmsNetworkRequest", (new StringBuilder(57)).append("Skipping request failure for invalid account: ").append(i).toString());
            }
            return;
        }
        aoa aoa2 = dcn.l();
        if (aoa2 == null)
        {
            eev.f("Babel_RetrieveMmsNetworkRequest", "Skipping request failure for null MMS account");
            return;
        }
        RealTimeChatService.a(aoa2.h(), b.c(), b.d(), dcx1.c());
        if (dcx1 != null && dcx1.c() != 0)
        {
            g.a(aoa1, 1524);
        }
        RealTimeChatService.a(aoa1, b, dcx1);
    }

    public void a(Context context, cdn cdn1, cdp cdp)
    {
        long l = System.currentTimeMillis();
        context = due.a(context, duc.a(context, b.b(), b.a()));
        if (context == null)
        {
            long l1;
            try
            {
                eev.g("Babel_RetrieveMmsNetworkRequest", "RetrieveMmsRequest: failed to persist message into telephony");
                throw new dcx(134, "Failed to persist retrieved mms message");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cdn1 = String.valueOf(context);
                eev.e("Babel_RetrieveMmsNetworkRequest", (new StringBuilder(String.valueOf(cdn1).length() + 47)).append("RetrieveMmsRequest: failed to retrieve message ").append(cdn1).toString(), context);
                throw new dcx(118, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cdn1 = String.valueOf(context);
                eev.e("Babel_RetrieveMmsNetworkRequest", (new StringBuilder(String.valueOf(cdn1).length() + 47)).append("RetrieveMmsRequest: failed to retrieve message ").append(cdn1).toString(), context);
                throw new dcx(((dtu) (context)).a, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cdn1 = String.valueOf(context);
                eev.e("Babel_RetrieveMmsNetworkRequest", (new StringBuilder(String.valueOf(cdn1).length() + 47)).append("RetrieveMmsRequest: failed to retrieve message ").append(cdn1).toString(), context);
                throw new dcx(137, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cdn1 = String.valueOf(context);
            }
            break MISSING_BLOCK_LABEL_290;
        }
        dur.a(1, due.c(context));
        context = new czv(context, b.c(), b.d());
        l1 = System.currentTimeMillis();
        context.a(l * 1000L);
        context.b(l1 * 1000L);
        context.a(b);
        RealTimeChatService.a(cdn1.c, context);
        return;
        eev.e("Babel_RetrieveMmsNetworkRequest", (new StringBuilder(String.valueOf(cdn1).length() + 48)).append("RetrieveMmsRequest: invalid message to retrieve ").append(cdn1).toString(), context);
        throw new dcx(137, context);
    }

    public boolean a(cdl cdl1)
    {
        return false;
    }

    public boolean a(cdn cdn1, dcx dcx1)
    {
        switch (dcx1.c())
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
            int i = dcx1.c();
            eev.f("Babel_RetrieveMmsNetworkRequest", (new StringBuilder(49)).append("Default no retry on BabelClientError: ").append(i).toString());
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
        return false;
    }

    public long b()
    {
        return ((amo)hlp.a(g.nU, amo)).a("babel_pending_message_failure_duration", 0x124f80L);
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
            return "RetrieveMmsNetworkRequest ".concat(s);
        } else
        {
            return new String("RetrieveMmsNetworkRequest ");
        }
    }

    static 
    {
        hnc hnc = eev.k;
    }
}
