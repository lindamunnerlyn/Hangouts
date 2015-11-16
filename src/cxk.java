// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxk extends cvn
{

    private static final long serialVersionUID = 1L;

    private cxk(iwx iwx1)
    {
        super(iwx1.responseHeader, 0L);
        if (cvn.a)
        {
            iwx1 = String.valueOf(iwx1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(iwx1).length() + 24)).append("RemoveUserResponse from:").append(iwx1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (iwx)kop.mergeFrom(new iwx(), abyte0);
        if (a(((iwx) (abyte0)).responseHeader))
        {
            return new cvz(((iwx) (abyte0)).responseHeader);
        } else
        {
            return new cxk(abyte0);
        }
    }
}
