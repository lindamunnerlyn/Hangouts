// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxd extends cvn
{

    private static final long serialVersionUID = 1L;

    private cxd(ixz ixz1)
    {
        super(ixz1.responseHeader, g.a(ixz1.a, 0L));
        if (cvn.a)
        {
            ixz1 = String.valueOf(ixz1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(ixz1).length() + 31)).append("NotificationLevelResponse from:").append(ixz1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (ixz)kop.mergeFrom(new ixz(), abyte0);
        if (a(((ixz) (abyte0)).responseHeader))
        {
            return new cvz(((ixz) (abyte0)).responseHeader);
        } else
        {
            return new cxd(abyte0);
        }
    }

    public void a(aoe aoe, dfb dfb)
    {
        super.a(aoe, dfb);
        if (any.a || cvn.a)
        {
            ebw.b("Babel", "processNotificationLevelResponse");
        }
        if (c.b != 1)
        {
            int i = c.b;
            ebw.f("Babel", (new StringBuilder(59)).append("Failed to set conversation preference with code ").append(i).toString());
        }
    }
}
