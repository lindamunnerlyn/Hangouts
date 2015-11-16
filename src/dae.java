// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class dae extends cxr
{

    private static final long serialVersionUID = 1L;

    private dae(jeb jeb1)
    {
        super(jeb1.responseHeader, 0L);
        if (eev.a("Babel", 3))
        {
            String s = String.valueOf("SetConfigurationBitResponse debugUrl: ");
            String s1 = String.valueOf(jeb1.responseHeader.c);
            if (s1.length() != 0)
            {
                s = s.concat(s1);
            } else
            {
                s = new String(s);
            }
            eev.d("Babel", s);
            if (jeb1.a.length > 0)
            {
                s = String.valueOf(jeb1.a[0].b);
                if (s.length() != 0)
                {
                    s = "SetConfigurationBitResponse error: ".concat(s);
                } else
                {
                    s = new String("SetConfigurationBitResponse error: ");
                }
                eev.d("Babel", s);
            }
        }
        if (cxr.a)
        {
            jeb1 = String.valueOf(jeb1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jeb1).length() + 33)).append("SetConfigurationBitResponse from:").append(jeb1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jeb)kws.mergeFrom(new jeb(), abyte0);
        if (a(((jeb) (abyte0)).responseHeader))
        {
            return new cyd(((jeb) (abyte0)).responseHeader);
        } else
        {
            return new dae(abyte0);
        }
    }
}
