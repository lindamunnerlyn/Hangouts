// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class czh extends cxr
{

    private static final long serialVersionUID = 1L;

    private czh(jee jee1)
    {
        super(jee1.responseHeader, g.a(jee1.a, 0L));
        if (cxr.a)
        {
            jee1 = String.valueOf(jee1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jee1).length() + 31)).append("NotificationLevelResponse from:").append(jee1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jee)kws.mergeFrom(new jee(), abyte0);
        if (a(((jee) (abyte0)).responseHeader))
        {
            return new cyd(((jee) (abyte0)).responseHeader);
        } else
        {
            return new czh(abyte0);
        }
    }

    public void a(aow aow, dgk dgk)
    {
        super.a(aow, dgk);
        if (aoq.a || cxr.a)
        {
            eev.b("Babel", "processNotificationLevelResponse");
        }
        if (c.b != 1)
        {
            int i = c.b;
            eev.f("Babel", (new StringBuilder(59)).append("Failed to set conversation preference with code ").append(i).toString());
        }
    }
}
