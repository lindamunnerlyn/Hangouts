// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dcn extends dfa
{

    private final String a;
    private final long d;
    private int e;

    public dcn(ani ani1, String s, long l)
    {
        super(ani1);
        e = 0;
        a = s;
        d = l;
    }

    public void a()
    {
        Object obj = new aoe(g.nS, b.h());
        boolean flag = aoe.b(a);
        if (!flag && ((aoe) (obj)).g(a) != 2 && ((aoe) (obj)).q(a) != 1)
        {
            throw new IllegalArgumentException("Hangouts group conversations are not deletable");
        }
        Exception exception;
        long l;
        if (flag)
        {
            l = ((aoe) (obj)).aa(a);
        } else
        {
            l = -1L;
        }
        ((aoe) (obj)).a();
        if (!aoe.a(a))
        {
            break MISSING_BLOCK_LABEL_276;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        if (d >= 0L) goto _L3; else goto _L2
_L2:
        ((aoe) (obj)).d(a, 0x7fffffffffffffffL);
_L4:
        any.d(((aoe) (obj)));
        ((aoe) (obj)).b();
        ((aoe) (obj)).c();
        if (l != -1L)
        {
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                obj = android.provider.Telephony.Threads.CONTENT_URI;
            } else
            {
                obj = Uri.withAppendedPath(Uri.parse("content://mms-sms/"), "conversations");
            }
            obj = ContentUris.withAppendedId(((Uri) (obj)), l);
            g.nS.getContentResolver().delete(((Uri) (obj)), null, null);
        }
        if (aoe.a(a))
        {
            obj = new irz();
            obj.responseHeader = new ixg();
            ((irz) (obj)).responseHeader.a = Integer.valueOf(1);
            obj = new cvu(((irz) (obj)));
            obj = new dgu(e, 1, ((cvn) (obj)));
            RealTimeChatService.a(e, b, ((dgu) (obj)));
        }
        return;
_L3:
        ((aoe) (obj)).r(a);
        ((aoe) (obj)).m(a, 2L);
          goto _L4
        exception;
        ((aoe) (obj)).c();
        throw exception;
        (new dco(a, d, null)).a(c);
        ((aoe) (obj)).r(a);
          goto _L4
    }

    public void a(int i)
    {
        e = i;
    }
}
