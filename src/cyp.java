// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cyp extends cvn
{

    private static final long serialVersionUID = 2L;

    private cyp(iwt iwt1)
    {
        super(iwt1.responseHeader, -1L);
        if (ebw.a("Babel", 3))
        {
            String s = String.valueOf("UploadAnalyticsResponse debugUrl: ");
            iwt1 = String.valueOf(iwt1.responseHeader.c);
            if (iwt1.length() != 0)
            {
                iwt1 = s.concat(iwt1);
            } else
            {
                iwt1 = new String(s);
            }
            ebw.d("Babel", iwt1);
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (iwt)kop.mergeFrom(new iwt(), abyte0);
        if (a(((iwt) (abyte0)).responseHeader))
        {
            return new cvz(((iwt) (abyte0)).responseHeader);
        } else
        {
            return new cyp(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        if (ebw.a("Babel", 3))
        {
            dfb = String.valueOf("processEventResponse response status: ");
            int i = c.b;
            String s = c.a;
            ebw.d("Babel", (new StringBuilder(String.valueOf(dfb).length() + 29 + String.valueOf(s).length())).append(dfb).append(i).append(" error description").append(s).toString());
        }
        djh.b(aoe1.f().h()).a(3);
    }
}
