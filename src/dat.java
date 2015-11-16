// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class dat extends cxr
{

    private static final long serialVersionUID = 2L;

    private dat(jcy jcy1)
    {
        super(jcy1.responseHeader, -1L);
        if (eev.a("Babel", 3))
        {
            String s = String.valueOf("UploadAnalyticsResponse debugUrl: ");
            jcy1 = String.valueOf(jcy1.responseHeader.c);
            if (jcy1.length() != 0)
            {
                jcy1 = s.concat(jcy1);
            } else
            {
                jcy1 = new String(s);
            }
            eev.d("Babel", jcy1);
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jcy)kws.mergeFrom(new jcy(), abyte0);
        if (a(((jcy) (abyte0)).responseHeader))
        {
            return new cyd(((jcy) (abyte0)).responseHeader);
        } else
        {
            return new dat(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        if (eev.a("Babel", 3))
        {
            dgk = String.valueOf("processEventResponse response status: ");
            int i = c.b;
            String s = c.a;
            eev.d("Babel", (new StringBuilder(String.valueOf(dgk).length() + 29 + String.valueOf(s).length())).append(dgk).append(i).append(" error description").append(s).toString());
        }
        dku.b(aow1.f().h()).a(3);
    }
}
