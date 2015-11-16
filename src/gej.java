// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.Libjingle;

final class gej
    implements gds
{

    final String a;
    final gmn b;
    final geg c;

    gej(geg geg1, String s, gmn gmn)
    {
        c = geg1;
        a = s;
        b = gmn;
        super();
    }

    public void a(kws kws)
    {
        kws = (jhx)kws;
        String s = a;
        geg.a((new StringBuilder(String.valueOf(s).length() + 31)).append("initiateCall for ").append(s).append(" after resolve").toString(), new Object[0]);
        geg.a(c, ((jhx) (kws)).a);
        geg.e(c).a(b, ((jhx) (kws)).a);
    }

    public void b(kws kws)
    {
        c.a(15);
    }
}
