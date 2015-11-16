// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class czo extends cxr
{

    private static final long serialVersionUID = 1L;

    private czo(jdc jdc1)
    {
        super(jdc1.responseHeader, 0L);
        if (cxr.a)
        {
            jdc1 = String.valueOf(jdc1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jdc1).length() + 24)).append("RemoveUserResponse from:").append(jdc1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jdc)kws.mergeFrom(new jdc(), abyte0);
        if (a(((jdc) (abyte0)).responseHeader))
        {
            return new cyd(((jdc) (abyte0)).responseHeader);
        } else
        {
            return new czo(abyte0);
        }
    }
}
