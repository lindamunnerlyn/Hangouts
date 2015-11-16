// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class czv extends cxr
{

    private static final long serialVersionUID = 1L;
    private final String g;
    private final long h;
    private final boolean i;

    public czv(Uri uri, long l, boolean flag)
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

    public void a(aow aow, dgk dgk)
    {
        super.a(aow, dgk);
        if (g != null)
        {
            aow = Uri.parse(g);
        } else
        {
            aow = null;
        }
        RealTimeChatService.a(aow, h, i);
    }
}
