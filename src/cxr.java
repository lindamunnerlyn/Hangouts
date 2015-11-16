// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cxr extends cvn
{

    private static final long serialVersionUID = 1L;
    private final String g;
    private final long h;
    private final boolean i;

    public cxr(Uri uri, long l, boolean flag)
    {
        if (uri != null)
        {
            uri = uri.toString();
        } else
        {
            uri = null;
        }
        g = uri;
        h = l;
        i = flag;
    }

    public void a(aoe aoe, dfb dfb)
    {
        super.a(aoe, dfb);
        if (g != null)
        {
            aoe = Uri.parse(g);
        } else
        {
            aoe = null;
        }
        RealTimeChatService.a(aoe, h, i);
    }
}
