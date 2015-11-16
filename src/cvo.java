// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvo extends cvn
{

    private static final long serialVersionUID = 1L;
    private final byte g[];
    private final byte h[];

    private cvo(jai jai1)
    {
        super(jai1.responseHeader, -1L);
        if (cvn.a)
        {
            String s = String.valueOf(jai1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(s).length() + 26)).append("AddBroadcastResponse from:").append(s).toString());
        }
        g = izx.toByteArray(jai1.a);
        h = jbw.toByteArray(jai1.b);
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (jai)kop.mergeFrom(new jai(), abyte0);
        if (a(((jai) (abyte0)).responseHeader))
        {
            return new cvz(((jai) (abyte0)).responseHeader);
        } else
        {
            return new cvo(abyte0);
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
            ebw.e("Babel", "Parse failed", koo1);
            return null;
        }
        return izx1;
    }
}
