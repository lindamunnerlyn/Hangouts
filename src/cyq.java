// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cyq extends cxr
{

    private static final long serialVersionUID = 1L;
    private final String g;
    private final String h;

    private cyq(jht jht1)
    {
        if (jht1.a == null) goto _L2; else goto _L1
_L1:
        jhc jhc1 = jht1.a;
        if (TextUtils.isEmpty(jhc1.a)) goto _L4; else goto _L3
_L3:
        g = jhc1.a;
        if (jhc1.j != null)
        {
            h = jhc1.j.a;
        } else
        {
            gdv.a("Hangout has no associated conversation");
            h = null;
        }
_L6:
        if (cxr.a)
        {
            jht1 = String.valueOf(jht1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jht1).length() + 28)).append("GetHangoutInfoResponse from:").append(jht1).toString());
        }
        return;
_L4:
        gdv.a("ServerResponse has Hangout but no hangoutId");
_L2:
        g = null;
        h = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jht)kws.mergeFrom(new jht(), abyte0);
        if (a(((jht) (abyte0)).responseHeader))
        {
            return new cyd(((jht) (abyte0)).responseHeader);
        } else
        {
            return new cyq(abyte0);
        }
    }
}
