// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class dad extends cxr
{

    private static final long serialVersionUID = 1L;

    private dad(hyp hyp1)
    {
        super(hyp1.apiHeader);
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (hyp)kws.mergeFrom(new hyp(), abyte0);
        if (a(((hyp) (abyte0)).apiHeader))
        {
            String s = String.valueOf(abyte0);
            eev.f("Babel", (new StringBuilder(String.valueOf(s).length() + 62)).append("SetChatAclSettingResponse.processResponse: request failed for ").append(s).toString());
            return new cyd(((hyp) (abyte0)).apiHeader);
        } else
        {
            return new dad(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        if (cxr.a)
        {
            aow1 = String.valueOf(aow1.f().a());
            if (aow1.length() != 0)
            {
                aow1 = "SetChatAclSettingResponse.processResponse: success=,account=".concat(aow1);
            } else
            {
                aow1 = new String("SetChatAclSettingResponse.processResponse: success=,account=");
            }
            eev.b("Babel", aow1);
        }
    }
}
