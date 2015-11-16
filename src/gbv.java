// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.Libjingle;

final class gbv
    implements gbe
{

    final String a;
    final gjl b;
    final gbs c;

    gbv(gbs gbs1, String s, gjl gjl)
    {
        c = gbs1;
        a = s;
        b = gjl;
        super();
    }

    public void a(kop kop)
    {
        kop = (jbo)kop;
        String s = a;
        gbs.a((new StringBuilder(String.valueOf(s).length() + 31)).append("initiateCall for ").append(s).append(" after resolve").toString(), new Object[0]);
        gbs.a(c, ((jbo) (kop)).a);
        gbs.e(c).a(b, ((jbo) (kop)).a);
    }

    public void b(kop kop)
    {
        c.a(15);
    }
}
