// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ddv extends dgj
{

    private final String a;
    private final long e;
    private int f;

    public ddv(aoa aoa, String s, long l)
    {
        super(aoa);
        f = 0;
        a = s;
        e = l;
    }

    public void a()
    {
        Object obj = new aow(g.nU, super.b.a);
        boolean flag = aow.b(a);
        if (!flag && ((aow) (obj)).g(a) != 2 && ((aow) (obj)).q(a) != 1)
        {
            throw new IllegalArgumentException("Hangouts group conversations are not deletable");
        }
        Exception exception;
        long l;
        if (flag)
        {
            l = ((aow) (obj)).Z(a);
        } else
        {
            l = -1L;
        }
        ((aow) (obj)).a();
        if (!aow.a(a))
        {
            break MISSING_BLOCK_LABEL_279;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        if (e >= 0L) goto _L3; else goto _L2
_L2:
        ((aow) (obj)).d(a, 0x7fffffffffffffffL);
_L4:
        aoq.d(((aow) (obj)));
        ((aow) (obj)).b();
        ((aow) (obj)).c();
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
            g.nU.getContentResolver().delete(((Uri) (obj)), null, null);
        }
        if (aow.a(a))
        {
            obj = new iye();
            obj.responseHeader = new jdl();
            ((iye) (obj)).responseHeader.a = Integer.valueOf(1);
            obj = new cxy(((iye) (obj)));
            obj = new did(f, 1, ((cxr) (obj)));
            RealTimeChatService.a(f, super.b.b, ((did) (obj)));
        }
        return;
_L3:
        ((aow) (obj)).r(a);
        ((aow) (obj)).l(a, 2L);
          goto _L4
        exception;
        ((aow) (obj)).c();
        throw exception;
        (new ddw(a, e, null)).a(this);
        ((aow) (obj)).r(a);
          goto _L4
    }

    public void a(int i)
    {
        f = i;
    }
}
