// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwo extends cvn
{

    private static final long serialVersionUID = 1L;
    public final String g;

    private cwo(ity ity1)
    {
        super(ity1.responseHeader, -1L);
        g = ity1.a;
        if (cvn.a)
        {
            ity1 = String.valueOf(g);
            if (ity1.length() != 0)
            {
                ity1 = "GetOffnetworkInviteUrlResponse: Invite Url=".concat(ity1);
            } else
            {
                ity1 = new String("GetOffnetworkInviteUrlResponse: Invite Url=");
            }
            ebw.b("Babel", ity1);
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (ity)kop.mergeFrom(new ity(), abyte0);
        if (a(((ity) (abyte0)).responseHeader))
        {
            return new cvz(((ity) (abyte0)).responseHeader);
        } else
        {
            return new cwo(abyte0);
        }
    }

    public void a(aoe aoe, dfb dfb)
    {
        super.a(aoe, dfb);
        if (ebw.a("Babel", 3))
        {
            aoe = String.valueOf("processGetOffnetworkInviteUrlResponse response status: ");
            int i = c.b;
            dfb = c.a;
            ebw.d("Babel", (new StringBuilder(String.valueOf(aoe).length() + 30 + String.valueOf(dfb).length())).append(aoe).append(i).append(" error description ").append(dfb).toString());
        }
    }
}
