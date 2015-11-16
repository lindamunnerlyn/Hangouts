// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxx extends cxr
{

    private static final long serialVersionUID = 1L;

    private cxx(ixz ixz1)
    {
        super(ixz1.responseHeader, -1L);
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (ixz)kws.mergeFrom(new ixz(), abyte0);
        if (a(((ixz) (abyte0)).responseHeader))
        {
            return new cyd(((ixz) (abyte0)).responseHeader);
        } else
        {
            return new cxx(abyte0);
        }
    }

    public void a(aow aow, dgk dgk)
    {
        super.a(aow, dgk);
        aoq.d(aow);
    }
}
