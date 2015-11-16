// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxm extends cvn
{

    private static final long serialVersionUID = 1L;

    private cxm(ixc ixc1)
    {
        super(ixc1.responseHeader, -1L);
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (ixc)kop.mergeFrom(new ixc(), abyte0);
        if (a(((ixc) (abyte0)).responseHeader))
        {
            return new cvz(((ixc) (abyte0)).responseHeader);
        } else
        {
            return new cxm(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        String s = ((cuq)b).c;
        if (((cuq)b).b == 1)
        {
            aoe1.V(s);
            any.a(dfb, aoe1, s);
        }
        any.d(aoe1);
    }
}
