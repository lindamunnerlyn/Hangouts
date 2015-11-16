// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class czn extends cxr
{

    private static final long serialVersionUID = 1L;

    private czn(jgt jgt1)
    {
        super(jgt1.responseHeader, -1L);
        if (cxr.a)
        {
            jgt1 = String.valueOf(jgt1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jgt1).length() + 29)).append("RemoveBroadcastResponse from:").append(jgt1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jgt)kws.mergeFrom(new jgt(), abyte0);
        if (a(((jgt) (abyte0)).responseHeader))
        {
            return new cyd(((jgt) (abyte0)).responseHeader);
        } else
        {
            return new czn(abyte0);
        }
    }
}
