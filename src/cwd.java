// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwd extends cvn
{

    private static final long serialVersionUID = 1L;
    private final byte g[];
    private final byte h[];

    private cwd(jam jam1)
    {
        super(jam1.responseHeader, -1L);
        if (cvn.a)
        {
            String s = String.valueOf(jam1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(s).length() + 30)).append("GetBroadcastInfoResponse from:").append(s).toString());
        }
        g = izx.toByteArray(jam1.a);
        h = jbw.toByteArray(jam1.b);
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (jam)kop.mergeFrom(new jam(), abyte0);
        if (a(((jam) (abyte0)).responseHeader) || ((jam) (abyte0)).a == null)
        {
            return new cvz(((jam) (abyte0)).responseHeader);
        } else
        {
            return new cwd(abyte0);
        }
    }

    public String k()
    {
        izx izx1 = l();
        if (izx1 == null)
        {
            return null;
        } else
        {
            return izx1.b;
        }
    }

    public izx l()
    {
        izx izx1;
        try
        {
            izx1 = (izx)kop.mergeFrom(new izx(), g);
        }
        catch (koo koo1)
        {
            ebw.e("Babel", "Broadcast parse failed", koo1);
            return null;
        }
        return izx1;
    }

    public jbw m()
    {
        jbw jbw1;
        try
        {
            jbw1 = (jbw)kop.mergeFrom(new jbw(), h);
        }
        catch (koo koo1)
        {
            ebw.e("Babel", "SyncMetadata parse failed", koo1);
            return null;
        }
        return jbw1;
    }
}
