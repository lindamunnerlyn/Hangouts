// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.Libjingle;

final class gca
    implements gfx
{

    final gbs a;

    gca(gbs gbs1)
    {
        a = gbs1;
        super();
    }

    public void a(long l)
    {
        if (gbs.l(a))
        {
            gbs.e(a).handleApiaryResponse(l, null);
            return;
        } else
        {
            gkc.d("vclib", "LibjingleRequestListener.onRequestError: not initialized");
            return;
        }
    }

    public void a(long l, String s)
    {
    }

    public void a(long l, byte abyte0[])
    {
        if (gbs.l(a))
        {
            gbs.e(a).handleApiaryResponse(l, abyte0);
            return;
        } else
        {
            gkc.d("vclib", "LibjingleRequestListener.onRequestCompleted: not initialized");
            return;
        }
    }
}
