// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dhm
    implements ccg
{

    private static final boolean a = false;
    private final dho b;

    public dhm(dho dho1)
    {
        b = dho1;
    }

    public String a()
    {
        return "mms_recv_queue";
    }

    public void a(int i, dbo dbo1)
    {
        ani ani1 = dbf.e(i);
        if (ani1 == null)
        {
            if (ebw.a("Babel_RetrieveMmsNetworkRequest", 3))
            {
                ebw.c("Babel_RetrieveMmsNetworkRequest", (new StringBuilder(57)).append("Skipping request failure for invalid account: ").append(i).toString());
            }
            return;
        }
        ani ani2 = dbf.l();
        if (ani2 == null)
        {
            ebw.f("Babel_RetrieveMmsNetworkRequest", "Skipping request failure for null MMS account");
            return;
        }
        RealTimeChatService.a(ani2.h(), b.c(), b.d(), dbo1.c());
        if (dbo1 != null && dbo1.c() != 0)
        {
            g.a(ani1, 1524);
        }
        RealTimeChatService.a(ani1, b, dbo1);
    }

    public void a(Context context, cci cci1, cck cck)
    {
        long l = System.currentTimeMillis();
        context = drk.a(context, dri.a(context, b.b(), b.a()));
        if (context == null)
        {
            long l1;
            try
            {
                ebw.g("Babel_RetrieveMmsNetworkRequest", "RetrieveMmsRequest: failed to persist message into telephony");
                throw new dbo(134, "Failed to persist retrieved mms message");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cci1 = String.valueOf(context);
                ebw.e("Babel_RetrieveMmsNetworkRequest", (new StringBuilder(String.valueOf(cci1).length() + 47)).append("RetrieveMmsRequest: failed to retrieve message ").append(cci1).toString(), context);
                throw new dbo(118, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cci1 = String.valueOf(context);
                ebw.e("Babel_RetrieveMmsNetworkRequest", (new StringBuilder(String.valueOf(cci1).length() + 47)).append("RetrieveMmsRequest: failed to retrieve message ").append(cci1).toString(), context);
                throw new dbo(((dra) (context)).a, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cci1 = String.valueOf(context);
                ebw.e("Babel_RetrieveMmsNetworkRequest", (new StringBuilder(String.valueOf(cci1).length() + 47)).append("RetrieveMmsRequest: failed to retrieve message ").append(cci1).toString(), context);
                throw new dbo(137, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                cci1 = String.valueOf(context);
            }
            break MISSING_BLOCK_LABEL_290;
        }
        dry.a(1, drk.c(context));
        context = new cxr(context, b.c(), b.d());
        l1 = System.currentTimeMillis();
        context.a(l * 1000L);
        context.b(l1 * 1000L);
        context.a(b);
        RealTimeChatService.a(cci1.c, context);
        return;
        ebw.e("Babel_RetrieveMmsNetworkRequest", (new StringBuilder(String.valueOf(cci1).length() + 48)).append("RetrieveMmsRequest: invalid message to retrieve ").append(cci1).toString(), context);
        throw new dbo(137, context);
    }

    public boolean a(ccg ccg1)
    {
        return false;
    }

    public boolean a(cci cci1, dbo dbo1)
    {
        switch (dbo1.c())
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
            int i = dbo1.c();
            ebw.f("Babel_RetrieveMmsNetworkRequest", (new StringBuilder(49)).append("Default no retry on BabelClientError: ").append(i).toString());
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
        return ((alw)hgx.a(g.nS, alw)).a("babel_pending_message_failure_duration", 0x124f80L);
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
        hik hik = ebw.k;
    }
}
