// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class czq extends cxr
{

    private static final long serialVersionUID = 1L;

    private czq(jdh jdh1)
    {
        super(jdh1.responseHeader, -1L);
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jdh)kws.mergeFrom(new jdh(), abyte0);
        if (a(((jdh) (abyte0)).responseHeader))
        {
            return new cyd(((jdh) (abyte0)).responseHeader);
        } else
        {
            return new czq(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        String s = ((cwu)b).c;
        if (((cwu)b).b == 1)
        {
            aow1.U(s);
            aoq.a(dgk, aow1, s);
        }
        aoq.d(aow1);
    }
}
