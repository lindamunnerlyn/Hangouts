// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cya extends cvn
{

    private static final long serialVersionUID = 1L;

    private cya(ixw ixw1)
    {
        super(ixw1.responseHeader, 0L);
        if (ebw.a("Babel", 3))
        {
            String s = String.valueOf("SetConfigurationBitResponse debugUrl: ");
            String s1 = String.valueOf(ixw1.responseHeader.c);
            if (s1.length() != 0)
            {
                s = s.concat(s1);
            } else
            {
                s = new String(s);
            }
            ebw.d("Babel", s);
            if (ixw1.a.length > 0)
            {
                s = String.valueOf(ixw1.a[0].b);
                if (s.length() != 0)
                {
                    s = "SetConfigurationBitResponse error: ".concat(s);
                } else
                {
                    s = new String("SetConfigurationBitResponse error: ");
                }
                ebw.d("Babel", s);
            }
        }
        if (cvn.a)
        {
            ixw1 = String.valueOf(ixw1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(ixw1).length() + 33)).append("SetConfigurationBitResponse from:").append(ixw1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (ixw)kop.mergeFrom(new ixw(), abyte0);
        if (a(((ixw) (abyte0)).responseHeader))
        {
            return new cvz(((ixw) (abyte0)).responseHeader);
        } else
        {
            return new cya(abyte0);
        }
    }
}
