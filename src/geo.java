// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.Libjingle;

final class geo
    implements gix
{

    final geg a;

    geo(geg geg1)
    {
        a = geg1;
        super();
    }

    public void a(long l)
    {
        if (geg.l(a))
        {
            geg.e(a).handleApiaryResponse(l, null);
            return;
        } else
        {
            gne.a(5, "vclib", "LibjingleRequestListener.onRequestError: not initialized");
            return;
        }
    }

    public void a(long l, String s)
    {
    }

    public void a(long l, byte abyte0[])
    {
        if (geg.l(a))
        {
            geg.e(a).handleApiaryResponse(l, abyte0);
            return;
        } else
        {
            gne.a(5, "vclib", "LibjingleRequestListener.onRequestCompleted: not initialized");
            return;
        }
    }
}
