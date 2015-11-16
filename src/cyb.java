// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cyb extends czc
{

    private static final long serialVersionUID = 1L;

    private cyb(lep lep1)
    {
        super(lep1);
    }

    public static cxr parseFrom(byte abyte0[])
    {
        if (abyte0 != null)
        {
            abyte0 = (lep)kws.mergeFrom(new lep(), abyte0);
            if (abyte0 != null)
            {
                return new cyb(abyte0);
            }
        }
        return null;
    }

    public void a(aow aow, dgk dgk)
    {
        super.a(aow, dgk);
    }
}
