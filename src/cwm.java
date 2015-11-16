// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cwm extends cvn
{

    private static final long serialVersionUID = 1L;
    private final String g;
    private final String h;

    private cwm(jbm jbm1)
    {
        if (jbm1.a == null) goto _L2; else goto _L1
_L1:
        jav jav1 = jbm1.a;
        if (TextUtils.isEmpty(jav1.a)) goto _L4; else goto _L3
_L3:
        g = jav1.a;
        if (jav1.j != null)
        {
            h = jav1.j.a;
        } else
        {
            gbh.a("Hangout has no associated conversation");
            h = null;
        }
_L6:
        if (cvn.a)
        {
            jbm1 = String.valueOf(jbm1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(jbm1).length() + 28)).append("GetHangoutInfoResponse from:").append(jbm1).toString());
        }
        return;
_L4:
        gbh.a("ServerResponse has Hangout but no hangoutId");
_L2:
        g = null;
        h = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (jbm)kop.mergeFrom(new jbm(), abyte0);
        if (a(((jbm) (abyte0)).responseHeader))
        {
            return new cvz(((jbm) (abyte0)).responseHeader);
        } else
        {
            return new cwm(abyte0);
        }
    }
}
