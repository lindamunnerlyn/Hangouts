// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cys extends cxr
{

    private static final long serialVersionUID = 1L;
    public final String g;

    private cys(jad jad1)
    {
        super(jad1.responseHeader, -1L);
        g = jad1.a;
        if (cxr.a)
        {
            jad1 = String.valueOf(g);
            if (jad1.length() != 0)
            {
                jad1 = "GetOffnetworkInviteUrlResponse: Invite Url=".concat(jad1);
            } else
            {
                jad1 = new String("GetOffnetworkInviteUrlResponse: Invite Url=");
            }
            eev.b("Babel", jad1);
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jad)kws.mergeFrom(new jad(), abyte0);
        if (a(((jad) (abyte0)).responseHeader))
        {
            return new cyd(((jad) (abyte0)).responseHeader);
        } else
        {
            return new cys(abyte0);
        }
    }

    public void a(aow aow, dgk dgk)
    {
        super.a(aow, dgk);
        if (eev.a("Babel", 3))
        {
            aow = String.valueOf("processGetOffnetworkInviteUrlResponse response status: ");
            int i = c.b;
            dgk = c.a;
            eev.d("Babel", (new StringBuilder(String.valueOf(aow).length() + 30 + String.valueOf(dgk).length())).append(aow).append(i).append(" error description ").append(dgk).toString());
        }
    }
}
