// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public abstract class die
    implements ccg
{

    public final dko a;

    public die(dko dko)
    {
        a = dko;
    }

    public static boolean a(cci cci1, int i)
    {
        alw alw1 = (alw)hgx.a(g.nS, alw);
        int j = alw1.a("babel_max_unexpected_error_retries", 2);
        int k = alw1.a("babel_max_upload_error_retries", 10);
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
            ebw.f("Babel_ServerOpNetReq", (new StringBuilder(49)).append("Default no retry on BabelClientError: ").append(i).toString());
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
            return cci1.e < j;

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
            return cci1.d < k;

        case 139: 
            return false;
        }
    }

    protected abstract ctp a(ani ani, int i, String s);

    public final void a(int i, dbo dbo1)
    {
        ani ani = dbf.e(i);
        if (ani == null)
        {
            if (ebw.a("Babel_ServerOpNetReq", 3))
            {
                ebw.c("Babel_ServerOpNetReq", (new StringBuilder(57)).append("Skipping request failure for invalid account: ").append(i).toString());
            }
            return;
        } else
        {
            b(i, dbo1);
            RealTimeChatService.a(ani, a, dbo1);
            return;
        }
    }

    public final void a(Context context, cci cci1, cck cck)
    {
        context = dbf.e(cci1.c);
        a(((ani) (context)), cci1.e, dbf.f(context)).f();
    }

    public boolean a(cci cci1, dbo dbo1)
    {
        return a(cci1, dbo1.c());
    }

    protected abstract void b(int i, dbo dbo1);

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
