// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public abstract class djp
    implements cdl
{

    public final dmf a;

    public djp(dmf dmf)
    {
        a = dmf;
    }

    public static boolean a(cdn cdn1, int i)
    {
        amo amo1 = (amo)hlp.a(g.nU, amo);
        int j = amo1.a("babel_max_unexpected_error_retries", 2);
        int k = amo1.a("babel_max_upload_error_retries", 10);
        switch (i)
        {
        case 115: // 's'
        case 116: // 't'
        case 117: // 'u'
        case 118: // 'v'
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
        default:
            eev.f("Babel_ServerOpNetReq", (new StringBuilder(49)).append("Default no retry on BabelClientError: ").append(i).toString());
            return false;

        case 100: // 'd'
        case 138: 
            return false;

        case 101: // 'e'
        case 102: // 'f'
        case 103: // 'g'
            return true;

        case 104: // 'h'
            return false;

        case 105: // 'i'
            return true;

        case 106: // 'j'
        case 107: // 'k'
        case 108: // 'l'
            return cdn1.e < j;

        case 109: // 'm'
        case 110: // 'n'
        case 111: // 'o'
        case 112: // 'p'
        case 113: // 'q'
            return false;

        case 114: // 'r'
            return false;

        case 120: // 'x'
        case 121: // 'y'
            return false;

        case 122: // 'z'
            return cdn1.d < k;

        case 139: 
            return false;
        }
    }

    protected abstract cvt a(aoa aoa, int i, String s);

    public final void a(int i, dcx dcx1)
    {
        aoa aoa = dcn.e(i);
        if (aoa == null)
        {
            if (eev.a("Babel_ServerOpNetReq", 3))
            {
                eev.c("Babel_ServerOpNetReq", (new StringBuilder(57)).append("Skipping request failure for invalid account: ").append(i).toString());
            }
            return;
        } else
        {
            b(i, dcx1);
            RealTimeChatService.a(aoa, a, dcx1);
            return;
        }
    }

    public final void a(Context context, cdn cdn1, cdp cdp)
    {
        context = dcn.e(cdn1.c);
        a(((aoa) (context)), cdn1.e, dcn.e(context)).f();
    }

    public boolean a(cdn cdn1, dcx dcx1)
    {
        return a(cdn1, dcx1.c());
    }

    protected abstract void b(int i, dcx dcx1);

    public String e()
    {
        return null;
    }

    public final String toString()
    {
        String s = String.valueOf(a.toString());
        if (s.length() != 0)
        {
            return "ServerOperationNetworkRequest ".concat(s);
        } else
        {
            return new String("ServerOperationNetworkRequest ");
        }
    }
}
