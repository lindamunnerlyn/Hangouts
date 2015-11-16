// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxz extends cvn
{

    private static final long serialVersionUID = 1L;

    private cxz(htl htl1)
    {
        super(htl1.apiHeader);
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (htl)kop.mergeFrom(new htl(), abyte0);
        if (a(((htl) (abyte0)).apiHeader))
        {
            String s = String.valueOf(abyte0);
            ebw.f("Babel", (new StringBuilder(String.valueOf(s).length() + 62)).append("SetChatAclSettingResponse.processResponse: request failed for ").append(s).toString());
            return new cvz(((htl) (abyte0)).apiHeader);
        } else
        {
            return new cxz(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        if (cvn.a)
        {
            aoe1 = String.valueOf(aoe1.f().a());
            if (aoe1.length() != 0)
            {
                aoe1 = "SetChatAclSettingResponse.processResponse: success=,account=".concat(aoe1);
            } else
            {
                aoe1 = new String("SetChatAclSettingResponse.processResponse: success=,account=");
            }
            ebw.b("Babel", aoe1);
        }
    }
}
