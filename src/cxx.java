// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxx extends cvn
{

    private static final long serialVersionUID = 1L;
    public final boolean g;

    private cxx(ixs ixs1)
    {
        super(ixs1.responseHeader, -1L);
        if (ixs1.a != null && g.a(ixs1.a, 0) == 1)
        {
            g = true;
            return;
        } else
        {
            g = false;
            return;
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (ixs)kop.mergeFrom(new ixs(), abyte0);
        if (a(((ixs) (abyte0)).responseHeader))
        {
            return new cvz(((ixs) (abyte0)).responseHeader);
        } else
        {
            return new cxx(abyte0);
        }
    }
}
