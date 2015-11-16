// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class dab extends cxr
{

    private static final long serialVersionUID = 1L;
    public final boolean g;

    private dab(jdx jdx1)
    {
        super(jdx1.responseHeader, -1L);
        if (jdx1.a != null && g.a(jdx1.a, 0) == 1)
        {
            g = true;
            return;
        } else
        {
            g = false;
            return;
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jdx)kws.mergeFrom(new jdx(), abyte0);
        if (a(((jdx) (abyte0)).responseHeader))
        {
            return new cyd(((jdx) (abyte0)).responseHeader);
        } else
        {
            return new dab(abyte0);
        }
    }
}
