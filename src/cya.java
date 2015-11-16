// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cya extends cxr
{

    private static final long serialVersionUID = 1L;

    private cya(iyv iyv1)
    {
        super(iyv1.responseHeader, g.a(iyv1.a, 0L));
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (iyv)kws.mergeFrom(new iyv(), abyte0);
        if (a(((iyv) (abyte0)).responseHeader))
        {
            return new cyd(((iyv) (abyte0)).responseHeader);
        } else
        {
            return new cya(abyte0);
        }
    }
}
